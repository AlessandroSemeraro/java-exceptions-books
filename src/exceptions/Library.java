package exceptions;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        //apro scanner
        Scanner scanner = new Scanner(System.in);

        //inizializzo numero libri da aggiungere
        int arrayBooks;

        System.out.print("Quanti libri vuoi aggiungere?");

        //converto in intero
        arrayBooks = Integer.parseInt(scanner.nextLine());

        //creo array di libri pari a numero di libri richiesti da utente
        Book[] book1 = new Book[arrayBooks];

        //inizializzo contatore e ciclo
        for (int i = 0; i < arrayBooks; i++) {

            while(true) {
                System.out.println("Inserisci i dettagli relativi al libro...");

                String title, author, publisher;
                int pages;

                System.out.print("Il titolo del libro è: ");
                title = scanner.nextLine();

                while(true) {
                    try {
                        System.out.print("Le pagine del libro sono: ");
                        pages = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("inserisci numero valido:");
                    }
                }

                System.out.print("Autore: ");
                author = scanner.nextLine();

                System.out.print("Casa editrice: ");
                publisher = scanner.nextLine();

                try {
                    //aggiungo libro all'array creando un nuovo oggetto Book utilizzando il costruttore e lo assegno a i
                    book1[i] = new Book(title, pages, author, publisher);
                    break;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                i++;
            }
        }
        // stampo libri
        System.out.println("I libri che hai inserito sono i seguenti:");
        for (int j = 0; j < arrayBooks; j++) {
            System.out.println(book1[j]);
        }

        //chiudo scanner
        scanner.close();
    }
}
