/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.*;

/**
 *
 * @author afernandez
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*PhysicalStockItem objPhysicalItem = 
                new PhysicalStockItem("Snuff: a Diskworld book by Terry Pratchet", 0);
        ServiceStockItem objVirtualItem = 
                new ServiceStockItem("Wintersmith: a Diskworld ebook by terry Pratchet");
        
        //test behaviour of physical stock item
        String strMessage = objPhysicalItem.getName()
                + ", is in stock = " + objPhysicalItem.isInStock()
                + ", quantity in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        //test behaviour of service stock item
        
        strMessage = objVirtualItem.getName()
                + ", is in stock = " + objVirtualItem.isInStock()
                + ", Quantity in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
*/
        
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");

        if (objTestItem1.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 1 is a PHYSICAL stock item");
        } else{
            System.out.println("Item 1 is a SERVICE stock item");
        }
        if (objTestItem2.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 1 is a PHYSICAL stock item");
        } else{
            System.out.println("Item 1 is a SERVICE stock item");
        }
        if (objTestItem3.getItemType() == StockType.PHYSICALITEM) {
            System.out.println("Item 1 is a PHYSICAL stock item");
        } else{
            System.out.println("Item 1 is a SERVICE stock item");
        }
    }
    
}
