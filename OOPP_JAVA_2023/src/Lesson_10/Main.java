package Lesson_10;
import global.*;

public class Main {

    public static void main(String[] args) {

        ProsPolisi[] polisi = new ProsPolisi[10];
        ProsMetafora[] metafora = new ProsMetafora[10];

        int counter = 0, counterMet = 0, a = 0;
        System.out.println("-------MENU------");
        System.out.println("1. Enter work of art");
        System.out.println("2. Prepare work of art for delivery");
        System.out.println("3. Deliver work of art");
        System.out.println("4. Display all available photograpghs");
        System.out.println("5. Display all available paintings");
        System.out.println("6. Display all available work of arts");
        System.out.println("7. Display all work of arts to be delivered");
        System.out.println("8. End  program");
        System.out.println("Enter selection (1-8)");

        a = UserInput.getInteger();


        while (a > 0 && a < 9) {
            switch (a) {
                case 1:
                    if (counter != polisi.length) {
                        System.out.println("Do you want 1- Photograph or 2 Painting? | Art Name | Price | Color/Texnotropoia?");
                        int w = UserInput.getInteger();
                        if (w == 1) {
                            polisi[counter++] = new Photograph(UserInput.getString(), UserInput.getDouble(), UserInput.getString());
                            break;
                        } else if (w == 2) {
                            polisi[counter++] = new Painting(UserInput.getString(), UserInput.getDouble(), UserInput.getString());
                            break;
                        } else break;
                    } else {
                        System.out.println("Array is full");
                        break;
                    }

                case 2:
                    System.out.println("Select work of art for send");
                    for (int i = 0; i < polisi.length; i++) {
                        if (polisi[i] != null)
                            System.out.println(i);
                    }
                    int work = UserInput.getInteger();

                    if (counterMet != metafora.length) {
                        System.out.println("Is fragile?, What is present of secure?, what is weight?");
                        metafora[counterMet++] = new AgoraParadosi(polisi[work], UserInput.getString(), UserInput.getDouble(), UserInput.getDouble());
                        break;
                    } else {
                        System.out.println("Array is full");
                        break;
                    }


                case 3:
                    System.out.println("Select work of art as delivered");
                    for (int i = 0; i < polisi.length; i++) {
                        if (polisi[i] != null)
                            System.out.println(i);
                    }
                    int works = UserInput.getInteger();

                    if (metafora[works] != null) {
                        System.out.println(metafora[works].toString());
                        metafora[works] = null;
                        System.out.println("Delivered");
                        break;
                    }

                case 4:
                    for (int i = 0; i < polisi.length; i++) {
                        if (polisi[i] instanceof Photograph) {
                            System.out.println(polisi[i].toString());
                            break;
                        } else
                            System.out.println("Not found");
                        break;
                    }

                case 5:
                    for (int i = 0; i < polisi.length; i++) {
                        if (polisi[i] instanceof Painting) {
                            System.out.println(polisi[i].toString());
                            break;
                        } else
                            System.out.println("Not found");
                        break;
                    }

                case 6:
                    for (int i = 0; i < polisi.length; i++) {
                        if (polisi[i] != null ) {
                            System.out.println(polisi[i].toString());
                            break;
                        } else
                            System.out.println("Not found");
                        break;
                    }

                case 7:
                    for (int i = 0; i < metafora.length; i++) {
                        if (metafora[i] != null) {
                            System.out.println(metafora[i].toString());
                            break;
                        } else
                            System.out.println("Not found");
                        break;
                    }

                case 8:
                    System.exit(0);
            }

            System.out.println("-------MENU------");
            System.out.println("1. Enter work of art");
            System.out.println("2. Prepare work of art for delivery");
            System.out.println("3. Deliver work of art");
            System.out.println("4. Display all available photograpghs");
            System.out.println("5. Display all available paintings");
            System.out.println("6. Display all available work of arts");
            System.out.println("7. Display all work of arts to be delivered");
            System.out.println("8. End  program");
            System.out.println("Enter selection (1-8)");

            a= UserInput.getInteger();
        }
    }
}
