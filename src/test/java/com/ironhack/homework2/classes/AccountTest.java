package com.ironhack.homework2.classes;


import com.ironhack.homework2.enums.Industry;
import com.ironhack.homework2.enums.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    static Lead lead;
    static Contact contact;
    static Opportunity opp1;
    static Account account;

    @BeforeEach
    void setUp() {
        lead = new Lead("Travis", "666778899", "travis@onecompany.com", "Company One");
        contact = new Contact(lead);
        opp1 = new Opportunity(Product.BOX, 200, contact);
        account = new Account(contact, opp1, Industry.PRODUCE,10,"Vienna", "Austria");
    }

    @AfterEach
    void tearDown() {
        Lead.removeAllFromItemList();
        Contact.removeAllFromItemList();
        Opportunity.removeAllFromItemList();
        Account.removeAllFromItemList();
    }

    @Test
    void addContactToList() {
        int sizeContactListBeforeAddNewContact = account.getContactList().size();
        Lead lead2 = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");
        Contact contact2 = new Contact(lead2);
        account.addContactToList(contact2);
        int sizeContactListAfterAddNewContact = account.getContactList().size();
        assertEquals(sizeContactListBeforeAddNewContact+1,sizeContactListAfterAddNewContact);

    }

    @Test
    void addOpportunityToList() {
        int sizeOpportunityListBeforeAddNewOpportunity = account.getOpportunityList().size();
        Lead lead2 = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");
        Contact contact2 = new Contact(lead2);
        Opportunity opp2 = new Opportunity(Product.FLATBED, 200, contact2);
        account.addOpportunityToList(opp2);
        int sizeOpportunityListAfterAddNewOpportunity = account.getOpportunityList().size();
        assertEquals(sizeOpportunityListBeforeAddNewOpportunity+1,sizeOpportunityListAfterAddNewOpportunity);
    }
}