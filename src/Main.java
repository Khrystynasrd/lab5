public class Main {
    public static void main(String[] args) {
       Service countryService = new Service();

        try {

            System.out.println(countryService.findCountry("Англія"));

            System.out.println(countryService.findCountry("Іспанія"));
        } catch (FoundException e) {


            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Пошук завершено.");
        }
    }
}