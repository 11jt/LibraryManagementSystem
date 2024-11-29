import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner interaction = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            System.out.println("Do you want to perform actions? (1/2)");
            int keepPlaying = interaction.nextInt();
            interaction.nextLine(); // To eat up leftover newLine

            if (keepPlaying != 1) return;

            System.out.println("What do you want to do?");
            System.out.println("Choices: Add, Return, Lend, List");
            String nextAction = interaction.nextLine();

            switch (nextAction.toLowerCase()) {
                case ("add"):
                    System.out.println("What is the title of the book?");
                    String addTitle = interaction.nextLine();

                    System.out.println("Who is the author of the book?");
                    String addAuthor = interaction.nextLine();

                    library.addBook(new Book(addTitle, addAuthor));
                    System.out.println("Successfully added book: " + addTitle + " with author: " + addAuthor);
                    break;

                case("lend"):
                    System.out.println("What is the title of the book?");
                    String lendTitle = interaction.nextLine();

                    library.lendBook(lendTitle);
                    System.out.println("Successfully lent book: " + lendTitle);
                    break;

                case("return"):
                    System.out.println("What is the title of the book?");
                    String returnTitle = interaction.nextLine();

                    library.returnBook(returnTitle);
                    System.out.println("Successfully returned book: " + returnTitle);
                    break;

                case("list"):
                    System.out.println(library.booksList());
                    break;
            }
        }
    }
}