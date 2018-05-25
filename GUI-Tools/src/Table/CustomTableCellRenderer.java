/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Table;

import java.awt.Component;
import java.awt.Font;
import javax.swing.table.TableCellRenderer;
import javax.swing.JLabel;
import javax.swing.JTable;
/**
 *
 * @author schmidtu
 */
public class CustomTableCellRenderer implements TableCellRenderer {
    private Font font = new Font("SansSerif", Font.BOLD, 12);

    @Override
    public Component getTableCellRendererComponent(  
      JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

      JLabel label;  
      if(!(value instanceof JLabel)) {  
         label = new JLabel((String)value);  
      } else {  
         label = (JLabel) value;  
      }  
      label.setOpaque(true);  
      label.setFont(table.getFont());  
      label.setForeground(table.getForeground());  
      label.setBackground(table.getBackground());

      if(isSelected) {  
         label.setBackground(table.getSelectionBackground());  
         label.setForeground(table.getSelectionForeground());  
      }

      if(column == 0 || column == 1) {  
         label.setHorizontalAlignment(JLabel.LEFT);  
      }
      else { 
         label.setHorizontalAlignment(JLabel.RIGHT);          
      }

      return label;  
    }  

}
