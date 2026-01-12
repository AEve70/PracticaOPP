package PracticaOPP.OPP120126.beforefactoring;

class EmailService{
    // private String subject;

    // public EmailService(String subject){
    //     this.subject = subject;
    // }

    public void sendEmail(String message){
        
        System.out.println("Sending email: " + message);
    }
}


public class Person {
    private String name;
    private String email;
    private EmailService emailService;

    public Person(String name){
        this.name = name;
        this.emailService = new EmailService();
    }

    public void notifyPerson(){
        emailService.sendEmail("Hello my name is: " + name);
    }

}
