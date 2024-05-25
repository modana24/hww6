public class homework {
            public static void main(String[] args) {
                // задание 1
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
                System.out.println();

                // задание 2
                for (int i = 10; i >= 0; i--) {
                    System.out.println(i);
                }
                System.out.println();

                // задание 3
                for (int i = 2; i <= 17; i += 2) {
                    System.out.println(i);
                }
                System.out.println();

                //задача 4
                for (int i = -10; i <= 10; i++) {
                    System.out.println(i);
                }
                System.out.println();

                // задача 5
                for (int i = 1904; i <= 2096; i += 4) {
                    System.out.println(i + " год является високосным.");
                }
                System.out.println();

                // задача 6
                for (int i = 7; i <= 98; i += 7) {
                    System.out.println(i);
                }
                System.out.println();

                //задача 7
                for (int i = 1; i <= 512; i *= 2) {
                    System.out.println(i);
                }
                System.out.println();

                //задача 8
                int salary = 29000;
                int total = 0;
                for (int i = 1; i <= 12; i++) {
                    total += salary;
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
                }
                System.out.println();

                //задача 9
                int money = 29000;
                int procent = 0;
                for (int i = 1; i <= 12; i++) {
                    procent += procent/100;
                    procent += money;
                    System.out.println("Месяц " + i + ", сумма накоплений равна " + procent + " рублей");
                }
                System.out.println();

                //задача 10
                for (int i = 1; i <= 10; i++){
                    System.out.println("2*" + i + "=" + i*2);
                }
            }
        }
