public class NotificationService {
    public static void main(String[] args){

        // Utilisons maintenant la classe Notificationfactory pour créer et obtenir un objet de classe concrète en passant quelques informations. 

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.creerNotification("SMS");
        notification.notifUtilisateur();
    }
}
