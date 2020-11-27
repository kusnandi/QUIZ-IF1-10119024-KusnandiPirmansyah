/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public interface ServiceItem {
    void displaySercive();
    float getPrice(int serviceItem);
    boolean checkMemberStatus(String statusMember);
    float getSale(boolean isMember, float parServicePrice);
    
    
}
