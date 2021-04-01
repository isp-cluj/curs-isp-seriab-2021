/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.curs.curs6.elevator;

@FunctionalInterface //interfata care contine o singura methoda
interface Observer{
    void update(String event);
}
