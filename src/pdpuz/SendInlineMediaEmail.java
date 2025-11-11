package pdpuz;

public class SendInlineMediaEmail {

    // helper: read file and base64-encode
    private static String fileToBase64(String path) throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static void main(String[] args) throws Exception {
        // ---------- CONFIG ----------
        final String smtpHost = "smtp.gmail.com";     // example: Gmail SMTP
        final int smtpPort = 587;                     // TLS port
        final String username = "your.email@gmail.com"; // your SMTP username
        final String password = "your_app_password";    // app password or smtp password

        final String from = "your.email@gmail.com";
        final String to = "recipient@example.com";
        final String subject = "Test: Inline Base64 media (image/audio/video)";

        // Local media files (replace with your local paths)
        String imagePath = "media/photo.jpg";
        String audioPath = "media/sound.wav";
        String videoPath = "media/video.mp4";

        // ---------- READ & ENCODE FILES ----------
        String base64Image = fileToBase64(imagePath);
        String base64Audio = fileToBase64(audioPath);
        String base64Video = fileToBase64(videoPath);

        // ---------- BUILD HTML WITH DATA URIS ----------
        String html = "<!doctype html>\n<html>\n  <body>\n" +
                "<h3>Test: Inline media (Base64 / data URI)</h3>\n" +
                "<p>Image (embedded):</p>\n" +
                "<img src=\"data:image/jpeg;base64," + base64Image + "\" alt=\"inline-image\" style=\"max-width:320px;\">\n" +
                "<p>Audio (embedded):</p>\n" +
                "<audio controls>\n" +
                "<source src=\"data:audio/wav;base64," + base64Audio + "\" type=\"audio/wav\">\n" +
                "Your browser does not support the audio element.\n" +
                "</audio>\n" +
                "<p>Video (embedded):</p>\n" +
                "<video width=\"320\" height=\"240\" controls>\n" +
                "<source src=\"data:video/mp4;base64," + base64Video + "\" type=\"video/mp4\">\n" +
                "Your browser does not support the video tag.\n" +
                "</video>\n" +
                "</body>\n</html>";

        // ---------- SETUP MAIL SESSION ----------
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", String.valueOf(smtpPort));

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // ---------- CREATE MESSAGE ----------
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);

        // If HTML body only:
        message.setContent(html, "text/html; charset=utf-8");

        // ---------- SEND ----------
        Transport.send(message);
        System.out.println("Email sent successfully!");
    }
}
