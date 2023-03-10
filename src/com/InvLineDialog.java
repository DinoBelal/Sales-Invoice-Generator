/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author M E T R O
 */
public class InvLineDialog extends JDialog {
    
    private JTextField itemNameField;
    private JTextField itemCountField;
     private JTextField itemPriceField;
    
    private JLabel itemNameLbl;
    private JLabel itemCountLbl;
    private JLabel itemPriceLbl;
    
    private JButton okBtn;
    private JButton cancelBtn;
    
 public InvLineDialog(ProjectFrame f){
      
        itemNameField = new JTextField(20);
        itemNameLbl = new JLabel("Item Name");
        
        itemCountField = new JTextField(20);
        itemCountLbl = new JLabel("Item Count");
        
        itemPriceField = new JTextField(20);
        itemPriceLbl = new JLabel("Item Price");
        
     
        okBtn = new JButton("Ok");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createLineOk");
        cancelBtn.setActionCommand("createLineCancel");
        
        okBtn.addActionListener(f);
        cancelBtn.addActionListener(f);
        
        setLayout(new GridLayout(3, 2));
        
        add(itemNameLbl);
        add(itemNameField);
        
        add(itemCountLbl);
        add(itemCountField);
        
          
        add(itemPriceLbl);
        add(itemPriceField);
        
        add(okBtn);
        add(cancelBtn);
        
        pack();
     }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }


     
}

