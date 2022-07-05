package com.ironhack.homework2.menu;


import com.ironhack.homework2.classes.Account;
import com.ironhack.homework2.classes.Contact;
import com.ironhack.homework2.classes.Lead;
import com.ironhack.homework2.classes.Opportunity;
import com.ironhack.homework2.enums.Industry;
import com.ironhack.homework2.enums.Product;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OutputTest {
    static Output printer = new Output();
    static Lead lead = new Lead("Travis", "666778899", "travis@onecompany.com", "Company One");
    static Contact contact = new Contact(lead);
    static Opportunity opp1 = new Opportunity(Product.BOX, 200, contact);
    static Account account = new Account(contact, opp1, Industry.PRODUCE,10,"Vienna", "Austria");
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void printTest() {
        printer.print("some text to print");
        assertEquals("some text to print", outputStreamCaptor.toString().trim());
    }

    @Test
    void printAllAccountsTest() {
        printer.printAllAccounts();
        String outputString = outputStreamCaptor.toString().trim();
        assertEquals("=== Account 1 ===\n" +
                "· industry : PRODUCE\n" +
                "· employeeCount : 10\n" +
                "· city : Vienna\n" +
                "· country : Austria", outputString);

    }

    @Test
    void printAllContactsTest() {
        printer.printAllContacts();
        String outputString = outputStreamCaptor.toString().trim();
        assertEquals("=== Contact 1 ===\n" +
                "· name : Travis\n" +
                "· phone number : 666778899\n" +
                "· email : travis@onecompany.com\n" +
                "· company name : Company One", outputString);
    }

    @Test
    void printAllLeadsTest() {
        printer.printAllLeads();
        String outputString = outputStreamCaptor.toString().trim();
        assertEquals("=== Lead 1 ===\n" +
                "· name : Travis\n" +
                "· phone number : 666778899\n" +
                "· email : travis@onecompany.com\n" +
                "· company name : Company One", outputString);
    }

    @Test
    void printAllOpportunitiesTest() {
        printer.printAllOpportunities();
        String outputString = outputStreamCaptor.toString().trim();
        assertEquals("=== Opportunity 1 ===\n" +
                "· product : BOX\n" +
                "· quantity : 200\n" +
                "· decision maker -> \u001B[1;30mCONTACT 1\n" +
                "\u001B[0m   - name : Travis\n" +
                "   - phone number : 666778899\n" +
                "   - email : travis@onecompany.com\n" +
                "   - company name : Company One\n" +
                "· status : OPEN", outputString);
    }

}