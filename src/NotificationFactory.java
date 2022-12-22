public class NotificationFactory {

	// Créez une classe NotificationFactory.java pour instancier la classe concrète

	public Notification creerNotification(String canal)
	{
		if (canal == null || canal.isEmpty())
			return null;
		switch (canal) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "WHATSAPP":
			return new WhatsappNotification();
		default:
			throw new IllegalArgumentException("Canal de Notification Inconnu "+canal);
		}
	}
}
