import java.util.Scanner;
import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;



class Bank {

    static String name, address;
    static long contact;
    static long adhaar;
    static String pancard;
    static double balance;
    static int pin;

    static ArrayList<String> transcation = new ArrayList<String>();
	
	
    static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd-MMM-yyyy EEE HH:mm:ss");


	

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        welcomeLoop:
        for (;;) {

            System.out.println("\n**** WELCOME ****");
            System.out.println("\n**** LAXMI CHIT FUND ****\n");
            System.out.println("1. CREATE ACCOUNT");
            System.out.println("2. LOGIN");
            System.out.print("Enter Your Response: ");

            int resp = sc.nextInt();

            switch (resp) {

                case 1:
				{
                    if (name != null) {
                        System.out.println("ACCOUNT ALREADY EXISTS");
                        continue;
                    } else {

                        System.out.println("\nACCOUNT CREATION PAGE\n");

                        System.out.print("Name: ");
                        name = new Scanner(System.in).nextLine();

                        System.out.print("Address: ");
                        address = new Scanner(System.in).nextLine();

                        System.out.print("Contact: ");
                        contact = new Scanner(System.in).nextLong();

                        System.out.print("Adhaar: ");
                        adhaar = new Scanner(System.in).nextLong();

                        System.out.print("Pancard: ");
                        pancard = new Scanner(System.in).next();

                        System.out.print("Balance: ");
                        balance = new Scanner(System.in).nextDouble();
                        transcation.add("DEPOSIT (ACCOUNT CREATE) : " + balance +"rs " + LocalDateTime.now().format(formatter));

                        System.out.print("Pin: ");
                        pin = new Scanner(System.in).nextInt();

                        System.out.println("\n*** ACCOUNT CREATED SUCCESSFULLY ***\n");
                    }
                    break;
				}
                case 2:
                    if (name == null) {
                        System.out.println("\nCREATE YOUR ACCOUNT FIRST\n");
                        continue;
                    }

                    System.out.println("\nLOGIN MODULE\n");

                    System.out.print("Contact: ");
                    long userContact = new Scanner(System.in).nextLong();

                    System.out.print("Pin: ");
                    int userPin = new Scanner(System.in).nextInt();

                    if (contact == userContact && pin == userPin) {

                        System.out.println("\nLOGIN SUCCESSFUL");

                        features:
                        for (;;) {

                            System.out.println("\n**** FEATURES ****\n");
                            System.out.println("1. DEPOSIT");
                            System.out.println("2. WITHDRAW");
                            System.out.println("3. CHECK BALANCE");
                            System.out.println("4. TRANSACTION");
                            System.out.println("5. LOGOUT");

                            System.out.print("Enter your option: ");
                            int opt = sc.nextInt();

                            switch (opt) {

                                case 1:
                                    System.out.println("\nDEPOSIT AMOUNT MODULE\n");
                                    System.out.print("Enter deposit amount: ");

                                    double deptAmount = new Scanner(System.in).nextDouble();
                                    balance += deptAmount;
                                    transcation.add("DEPOSIT BALANCE: " + deptAmount +"rs " + LocalDateTime.now().format(formatter));

                                    System.out.println("AMOUNT DEPOSITED SUCCESSFULLY\n");
                                    break;

                                case 2:
                                    System.out.println("\nWITHDRAW AMOUNT MODULE\n");
                                    System.out.print("Enter withdraw amount: ");

                                    double wdrwAmt = new Scanner(System.in).nextDouble();

                                    System.out.print("Enter Pin: ");
                                    int pin2 = new Scanner(System.in).nextInt();

                                    if (pin2 == pin) {
                                        if (wdrwAmt <= balance) {
                                            balance -= wdrwAmt;
                                            transcation.add("WITHDRAW BALANCE: " + wdrwAmt +"rs "+ LocalDateTime.now().format(formatter));
											
                                            System.out.println("\nAMOUNT DEBITED SUCCESSFULLY\n");
                                        } else {
                                            System.out.println("\nINSUFFICIENT FUNDS\n");
                                        }
                                    } else {
                                        System.out.println("\nINVALID PIN\n");
                                    }
                                    break;

                                case 3:
                                    System.out.println("\nCHECK BALANCE MODULE\n");
                                    System.out.print("Enter Pin: ");

                                    int pinCheck = new Scanner(System.in).nextInt();
                                    if (pin == pinCheck) {
                                        System.out.println("Account Balance: " + balance + " rs");
                                    } else {
                                        System.out.println("INVALID PIN");
                                    }
                                    break;

                                case 4:
                                    System.out.println("\n----- TRANSACTIONS -----");
                                    for (String ele : transcation) {
                                        System.out.println(ele);
                                    }
                                    break;

                                case 5:
                                    System.out.println("\nTHANK YOU & VISIT AGAIN\n");
                                    continue welcomeLoop;

                                default:
                                    System.out.println("\nINVALID OPTION\n");
                            }
                        }

                    } else {
                        System.out.println("\nINVALID CREDENTIALS\n");
                    }
                    break;

                default:
                    System.out.println("\nINVALID RESPONSE\n");
            }
        }
    }
}
