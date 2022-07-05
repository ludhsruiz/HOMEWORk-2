package com.ironhack.homework2.classes;

import com.ironhack.homework2.enums.Product;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OpportunityTest {

    static Lead lead;
    static Contact contact;
    static Opportunity opp1;

    @BeforeEach
    void setUp() {
        lead = new Lead("Travis", "666778899", "travis@onecompany.com", "Company One");
        contact = new Contact(lead);
        opp1 = new Opportunity(Product.BOX, 200, contact);
    }

    @AfterEach
    void tearDown() {
        Opportunity.removeAllFromItemList();
    }

    @Test
    @DisplayName("Add a new Opportunity Object")
    void addOpportunityToList_correctAddition() {
        int sizeOpportunityListBeforeAddNewOpportunity = Opportunity.allOpportunities.size();
        Opportunity opp2 = new Opportunity(Product.FLATBED, 100, contact);
        int sizeOpportunityListAfterAddNewOpportunity = Opportunity.allOpportunities.size();
        assertEquals(sizeOpportunityListBeforeAddNewOpportunity + 1, sizeOpportunityListAfterAddNewOpportunity);
    }

    @Test
    @DisplayName("Set a different id for each Opportunity Object")
    public void setId_generateNewOpportunityObject_idNotEqual() {
        Opportunity opp2 = new Opportunity(Product.FLATBED, 100, contact);
        assertNotEquals(opp1.getId(), opp2.getId());
    }

    @Test
    @DisplayName("getById() returns the opportunity linked to the id")
    public void getById_passId_returnCorrectObject() {
        List<Item> listOpp = Opportunity.getAllOpportunities();
        Item oppTarget = Item.getById(1, listOpp);
        assertTrue(opp1.equals(oppTarget));
    }

    @Test
    @DisplayName("getById() returns an exception if the id given is not corresponding to any Opportunity object")
    public void getById_passWrongId_NullPointerException() {
        Opportunity opp2 = new Opportunity(Product.FLATBED, 100, contact);
        List<Item> listOpp = Opportunity.getAllOpportunities();
        assertThrows(NullPointerException.class, () -> Opportunity.getById(3, listOpp));
    }

    @Test
    @DisplayName("Opportunity created when quantity is above zero")
    public void setQuantity_numberAboveZero_OpportunityObjectCreated() {
        Opportunity opp2 = new Opportunity(Product.FLATBED, 100, contact);
        assertEquals(100, opp2.getQuantity());
    }

    @Test
    @DisplayName("Quantity cannot be zero")
    public void setQuantity_zero_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> opp1.setQuantity(0));
    }

    @Test
    @DisplayName("Quantity cannot be a number below zero")
    public void setQuantity_numberBelowZero_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> opp1.setQuantity(-20));
    }
}