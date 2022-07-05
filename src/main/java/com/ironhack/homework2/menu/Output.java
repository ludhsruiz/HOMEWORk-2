package com.ironhack.homework2.menu;

import com.ironhack.homework2.classes.*;
import com.ironhack.homework2.style.Style;


public class Output {

        public void print(String text) {
            System.out.println(text);
        }

        public void printAllAccounts() {
            for (Item account : Account.allAccounts) {
                print(account.toString());
            }
        }

        public void printAllContacts() {
            for (Item contact : Contact.allContacts) {
                print(contact.toString());
            }
        }

        public void printAllLeads() {
            for(Item lead : Lead.allLeads) {
                print(lead.toString());
            }
        }

        public void printAllOpportunities() {
            for (Item opportunity : Opportunity.allOpportunities) {
                print(opportunity.toString());
            }
        }

        public void printTypoInfo(String wrongWord) {
            System.out.println("Incorrect command. Possible typo in the word \"" + wrongWord + "\". Please try again.");
        }

        public void printExportErrorInfo(String filename) {
            System.out.println("There was an error while exporting data to file " + filename);
        }

        public void printImportErrorInfo(String filename) {
            System.out.println("There was an error while importing data from file " + filename);
        }


        public void welcomeMessage() {
            print("\n\n============================================================");
            print("\n\n========== Welcome to the best CRM!=========================");
            print("\n\nTo start using our CRM, or if you don't know what you are doing here. Type \"HELP\" for instructions");
        }

        public void helpPage(){
            System.out.println("=================================================");
            System.out.println("            CRM Help page");
            System.out.println("=================================================");
            System.out.println("\n              Possible Commands:\n " );
            System.out.println(Style.LIGHT_PURPLE + " NEW LEAD                    " + Style.LIGHT_GRAY + "Creates a new Object");
            System.out.println(Style.LIGHT_PURPLE + " NEW CONTACT                 " + Style.LIGHT_GRAY + "Creates a new Object");
            System.out.println(Style.LIGHT_PURPLE + " NEW OPPORTUNITY             " + Style.LIGHT_GRAY + "Creates a new Object");
            System.out.println(Style.LIGHT_PURPLE + " NEW ACCOUNT                 " + Style.LIGHT_GRAY + "Creates a new Object");

            System.out.println(Style.LIGHT_PURPLE + " SHOW LEADS                  " + Style.LIGHT_GRAY + "Lists all Leads");
            System.out.println(Style.LIGHT_PURPLE + " SHOW CONTACTS               " + Style.LIGHT_GRAY + "Lists all Contact");
            System.out.println(Style.LIGHT_PURPLE + " SHOW OPPORTUNITIES          " + Style.LIGHT_GRAY + "Lists all Opportunities");
            System.out.println(Style.LIGHT_PURPLE + " SHOW ACCOUNTS               " + Style.LIGHT_GRAY + "Lists all Accounts");

            System.out.println(Style.LIGHT_PURPLE + " LOOKUP LEAD <Id Number>   " + Style.LIGHT_GRAY + "Display the selected Object type with the indicated Id Number");
            System.out.println(Style.LIGHT_PURPLE + " LOOKUP CONTACT <Id Number>   " + Style.LIGHT_GRAY + "Display the selected Object type with the indicated Id Number");
            System.out.println(Style.LIGHT_PURPLE + " LOOKUP OPPORTUNITY <Id Number>   " + Style.LIGHT_GRAY + "Display the selected Object type with the indicated Id Number");
            System.out.println(Style.LIGHT_PURPLE + " LOOKUP ACCOUNT <Id Number>   " + Style.LIGHT_GRAY + "Display the selected Object type with the indicated Id Number");

            System.out.println(Style.LIGHT_PURPLE + " CONVERT <LEAD Id number>           " + Style.LIGHT_GRAY + "Converts the selected LEAD in CONTACT, OPPORTUNITY and ACCOUNT");
            System.out.println(Style.LIGHT_PURPLE + " CLOSE-WON <ACCOUNT Id Number>      " + Style.LIGHT_GRAY + "Changes the selected ACCOUNT status to CLOSE-WON");
            System.out.println(Style.LIGHT_PURPLE + " CLOSE-LOST <ACCOUNT Id Number>     " + Style.LIGHT_GRAY + "Changes the selected ACCOUNT status to CLOSE-LOST");
            System.out.println(Style.LIGHT_PURPLE + " OPEN <ACCOUNT Id Number>           " + Style.LIGHT_GRAY + "Changes the selected ACCOUNT status to OPEN");
            System.out.println(Style.LIGHT_PURPLE + " SAVE                               " + Style.LIGHT_GRAY + "Saves data to files");
            System.out.println(Style.LIGHT_PURPLE + " HELP                               " + Style.LIGHT_GRAY + "Displays this help info");
            System.out.println(Style.LIGHT_PURPLE + " EXIT                               " + Style.LIGHT_GRAY + "Terminates the CRM program" + Style.DEFAULT);

            System.out.println("*All commands are case-insensitive\n" + Style.DEFAULT);
        }



}
