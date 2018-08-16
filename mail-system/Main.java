public class Main{
	public static void main(String[] args){
		MailServer object_mail_server = new MailServer();
		MailClient object_mail_cliente1 = new MailClient(object_mail_server, "user1");
		MailClient object_mail_cliente2 = new MailClient(object_mail_server, "user2");
		object_mail_cliente1.sendMailItem("user2", "Olá, tudo bem?");
		//System.out.println(object_mail_cliente2.getNextMailItem());
		object_mail_cliente2.printNextMailItem();
	}
}
