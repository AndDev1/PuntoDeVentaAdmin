package com.puntodeventa.mvc.Views;

import com.puntodeventa.global.Entity.Product;
import com.puntodeventa.global.Entity.Venta;
import com.puntodeventa.global.Entity.VentaDetalle;
import com.puntodeventa.global.Util.Constants.Command;
import com.puntodeventa.global.Util.Constants.ShortCuts;
import com.puntodeventa.global.Util.Constants.VentaColumns;
import com.puntodeventa.global.Util.Extended.TableModel;
import com.puntodeventa.global.Util.LogHelper;
import com.puntodeventa.global.Util.ParamHelper;
import com.puntodeventa.global.Util.TagHelper;
import com.puntodeventa.global.Util.Util;
import com.puntodeventa.global.Util.ValidacionForms;
import com.puntodeventa.mvc.Controller.VentaLogic;
import com.puntodeventa.mvc.Controller.VentadDetalleLogic;
import com.puntodeventa.services.DAO.ProductDAO;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author USER
 */
public class jfrmVenta extends javax.swing.JFrame {

    private LogHelper objLog = new LogHelper("jfrmVenta");
    private ProductDAO prodDao = new ProductDAO();
    private TableModel tblModel = new TableModel();
    private ValidacionForms valid = new ValidacionForms();
    private int r = Integer.parseInt(ParamHelper.getParam("system.background.colorR").toString());
    private int g = Integer.parseInt(ParamHelper.getParam("system.background.colorG").toString());
    private int b = Integer.parseInt(ParamHelper.getParam("system.background.colorB").toString());

    public jfrmVenta() {
        initComponents();
        setTableModel();
        configureControls();
        setClock();
        setTags();
    }

    private void setClock() {
        javax.swing.Timer t = new javax.swing.Timer(1000,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Calendar now = Calendar.getInstance();
                        int h = now.get(Calendar.HOUR_OF_DAY);
                        int m = now.get(Calendar.MINUTE);
                        int s = now.get(Calendar.SECOND);

                        String hr = h < 10 ? "0" + h : "" + h;
                        String mn = m < 10 ? "0" + m : "" + m;
                        String se = s < 10 ? "0" + s : "" + s;

                        jlblTimeField.setText("" + hr + ":" + mn + ":" + se);

                        int d = now.get(Calendar.DAY_OF_MONTH);
                        int mo = now.get(Calendar.MONTH) + 1;
                        int y = now.get(Calendar.YEAR);

                        String day = d < 10 ? "0" + d : "" + d;
                        String month = mo < 10 ? "0" + mo : "" + mo;

                        jlblDateField.setText("" + day + "/" + month + "/" + y);
                    }
                });
        t.start();
    }

    private void configureControls() {
        //Set background color
        this.getContentPane().setBackground(new Color(r, g, b));
        jpnlTotales.setBackground(new java.awt.Color(r, g, b));
        jpnlProducts.setBackground(new java.awt.Color(r, g, b));
        jpnlAttendedBy.setBackground(new java.awt.Color(r, g, b));

        //Maximize window
        this.setExtendedState(MAXIMIZED_BOTH);

        this.txt.requestFocus();

        KeyStroke keyMenu = KeyStroke.getKeyStroke(ShortCuts.SC_CTRL_M, Event.CTRL_MASK);
        Action showMenu = new AbstractAction("Menu") {
            @Override
            public void actionPerformed(ActionEvent e) {
                showVentaMenu();
            }
        };

        txt.getActionMap().put("showMenu", showMenu);
        txt.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(keyMenu, "showMenu");

    }

    private void setTags() {
        this.jlblAttendedBy.setText(TagHelper.getTag("jfrmVenta.jlblAttendedBy"));
        this.jlblUserName.setText(TagHelper.getTag("jfrmVenta.jlblUserName"));

        this.jlblCambioTitle.setText(TagHelper.getTag("jfrmVenta.jlblCambioTitle"));
        this.jlblCambio.setText(TagHelper.getTag("jfrmVenta.jlblCambio"));

        this.jlblDateField.setText(TagHelper.getTag("jfrmVenta.jlblDateField"));
        this.jlblTimeField.setText(TagHelper.getTag("jfrmVenta.jlblTimeField"));

        this.jlblEfectivoTitle.setText(TagHelper.getTag("jfrmVenta.jlblEfectivoTitle"));
        this.jlblEfectivo.setText(TagHelper.getTag("jfrmVenta.jlblEfectivo"));

        this.jlblTotalTitle.setText(TagHelper.getTag("jfrmVenta.jlblTotalTitle"));
        this.jlblTotal.setText(TagHelper.getTag("jfrmVenta.jlblTotal"));
    }

    private void setTableModel() {
        tblModel.addColumn(VentaColumns.PRODUCT_CODE);
        tblModel.addColumn(VentaColumns.PRODUCT_DESCR);
        tblModel.addColumn(VentaColumns.QUANTITY);
        tblModel.addColumn(VentaColumns.UNIT_PRICE);
        tblModel.addColumn(VentaColumns.SUBTOTAL);
        this.jtblVenta.setModel(tblModel);
        valid.anchoColumTable(jtblVenta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlTotales = new javax.swing.JPanel();
        jlblTotalTitle = new javax.swing.JLabel();
        jlblSymbolTotal = new javax.swing.JLabel();
        jlblEfectivoTitle = new javax.swing.JLabel();
        jlblEfectivo = new javax.swing.JLabel();
        jlblCambioTitle = new javax.swing.JLabel();
        jlblCambio = new javax.swing.JLabel();
        jlblDateField = new javax.swing.JLabel();
        jlblTimeField = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jlblSymbolEfectivo = new javax.swing.JLabel();
        jlblSymbolCambio = new javax.swing.JLabel();
        jpnlProducts = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblVenta = new javax.swing.JTable();
        txt = new javax.swing.JTextField();
        jpnlAttendedBy = new javax.swing.JPanel();
        jlblUserName = new javax.swing.JLabel();
        jlblAttendedBy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(235, 122, 122));
        setUndecorated(true);
        setResizable(false);

        jpnlTotales.setBackground(new java.awt.Color(255, 102, 102));
        jpnlTotales.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblTotalTitle.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jlblTotalTitle.setText("Total:");

        jlblSymbolTotal.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jlblSymbolTotal.setText("$");

        jlblEfectivoTitle.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jlblEfectivoTitle.setText("Efectivo:");

        jlblEfectivo.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jlblEfectivo.setText("1,000,000");

        jlblCambioTitle.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jlblCambioTitle.setText("Cambio:");

        jlblCambio.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jlblCambio.setText("1,000,000");

        jlblDateField.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jlblDateField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblDateField.setText("21/01/2012");

        jlblTimeField.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jlblTimeField.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblTimeField.setText("59:59:59");
        jlblTimeField.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlblTotal.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jlblTotal.setText("1,000,000");

        jlblSymbolEfectivo.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jlblSymbolEfectivo.setText("$");

        jlblSymbolCambio.setFont(new java.awt.Font("Tahoma", 0, 90)); // NOI18N
        jlblSymbolCambio.setText("$");

        javax.swing.GroupLayout jpnlTotalesLayout = new javax.swing.GroupLayout(jpnlTotales);
        jpnlTotales.setLayout(jpnlTotalesLayout);
        jpnlTotalesLayout.setHorizontalGroup(
            jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTotalTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblCambioTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblEfectivoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnlTotalesLayout.createSequentialGroup()
                        .addComponent(jlblSymbolTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlTotalesLayout.createSequentialGroup()
                        .addComponent(jlblDateField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpnlTotalesLayout.createSequentialGroup()
                        .addComponent(jlblSymbolEfectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnlTotalesLayout.createSequentialGroup()
                        .addComponent(jlblSymbolCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpnlTotalesLayout.setVerticalGroup(
            jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTotalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTimeField)
                    .addComponent(jlblDateField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jlblTotalTitle)
                .addGap(18, 18, 18)
                .addGroup(jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSymbolTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jlblEfectivoTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblEfectivo)
                    .addComponent(jlblSymbolEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblCambioTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlTotalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCambio)
                    .addComponent(jlblSymbolCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jpnlProducts.setBackground(new java.awt.Color(255, 102, 102));

        jtblVenta.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtblVenta.setModel(this.tblModel);
        jtblVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtblVenta.setGridColor(new java.awt.Color(0, 0, 0));
        jtblVenta.setRowHeight(20);
        jtblVenta.setRowMargin(5);
        jtblVenta.setSelectionBackground(new Color(r, g, b));
        jtblVenta.setShowVerticalLines(false);
        jtblVenta.getTableHeader().setResizingAllowed(false);
        jtblVenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtblVenta);

        txt.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFocusGained(evt);
            }
        });
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpnlProductsLayout = new javax.swing.GroupLayout(jpnlProducts);
        jpnlProducts.setLayout(jpnlProductsLayout);
        jpnlProductsLayout.setHorizontalGroup(
            jpnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txt))
                .addContainerGap())
        );
        jpnlProductsLayout.setVerticalGroup(
            jpnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnlAttendedBy.setBackground(new java.awt.Color(255, 102, 102));
        jpnlAttendedBy.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblUserName.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jlblUserName.setText("Usuario Usuario Usuario ");

        jlblAttendedBy.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jlblAttendedBy.setText("Le atendió:");

        javax.swing.GroupLayout jpnlAttendedByLayout = new javax.swing.GroupLayout(jpnlAttendedBy);
        jpnlAttendedBy.setLayout(jpnlAttendedByLayout);
        jpnlAttendedByLayout.setHorizontalGroup(
            jpnlAttendedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlAttendedByLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblAttendedBy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlAttendedByLayout.setVerticalGroup(
            jpnlAttendedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlAttendedByLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnlAttendedByLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUserName)
                    .addComponent(jlblAttendedBy))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnlProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlAttendedBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnlTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnlProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnlAttendedBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnlTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFocusGained
        this.txt.selectAll();
    }//GEN-LAST:event_txtFocusGained

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped
        try {

            if (evt.isControlDown()) {
                return;
            }

            if (evt.isAltDown()) {

                switch (evt.getKeyChar()) {

                    case ShortCuts.SC_END_SALE:
                        if (this.jtblVenta.getRowCount() > 0) {
                            if (Util.isNumeric(txt.getText())) {
                                if (isCorrectAmount()) {
                                    this.finishOrder();
                                } else {
                                    valid.msjInfo(TagHelper.getTag("jfrmVenta.insufficientAmount"));
                                }
                            } else {
                                valid.msjInfo(TagHelper.getTag("jfrmVenta.emptyOrInvalidCash"));
                            }
                        }
                        break;
                    case ShortCuts.SC_QUERY_PRODUCT:
                        txt.setText(Command.QUERY_PRODUCT);
                        break;
                }
            } else {
                switch (evt.getKeyChar()) {
                    case ShortCuts.SC_ENTER:
                        String txtValue = this.txt.getText().trim();
                        if (!txtValue.isEmpty()) {
                            String productCode = "";
                            String command = "";
                            int quantity = 1;

                            //Identify command and codes
                            if (txtValue.contains(Command.MULTIPLICATION) && Util.isValidQty(txtValue.substring(0, txtValue.indexOf(Command.MULTIPLICATION)))) {
                                command = Command.MULTIPLICATION;
                                productCode = txtValue.substring(txtValue.indexOf(Command.MULTIPLICATION) + 1, txtValue.length());
                                quantity = Integer.parseInt(txtValue.substring(0, txtValue.indexOf(Command.MULTIPLICATION)));
                            } else if (txtValue.substring(0, 2).equals(Command.QUERY_PRODUCT)) {
                                command = Command.QUERY_PRODUCT;
                                productCode = txtValue.substring(2, txtValue.length());
                            }

                            //Process command
                            switch (command) {
                                case Command.MULTIPLICATION:
                                    this.addProduct(quantity, productCode);
                                    break;
                                case Command.QUERY_PRODUCT:
                                    queryProduct(productCode);
                                    break;
                                default:
                                    this.addProduct(quantity, txtValue);
                                    break;
                            }
                        }
                        break;
                }
            }

        } catch (Exception ex) {
            objLog.Log(ex.getMessage());
        }
    }//GEN-LAST:event_txtKeyTyped

    private void addProduct(int quantity, String productCode) {
        Product product = prodDao.selectProduct(productCode);

        if (product != null) {
            TableModel model = (TableModel) this.jtblVenta.getModel();
            String[] rowData = new String[5];

            rowData[0] = String.valueOf(product.getId_product());
            rowData[1] = product.getDescripcion();
            rowData[2] = String.valueOf(quantity);
            rowData[3] = String.valueOf(product.getP_venta());
            rowData[4] = String.valueOf(quantity * product.getP_venta());

            model.addRow(rowData);

            this.jlblTotal.setText("" + this.getTotalFromTable());

            cleanTextField();
        } else {
            /*
             * IMPLEMENTAR MENSAJE 
             * 
             */
        }
    }

    private void queryProduct(String productCode) {

        Product product = prodDao.selectProduct(productCode);
        if (product != null) {
            jfrmVentaConsultProductPrice queryProd = new jfrmVentaConsultProductPrice(this, true, product.getProduct(), String.valueOf(product.getP_venta()));
            queryProd.setVisible(true);
        }
    }

    private boolean isCorrectAmount() {
        boolean returnValue = false;
        try {
            double total = Double.valueOf(this.jlblTotal.getText());
            double cash = Double.valueOf(this.txt.getText());

            if (cash >= total) {
                returnValue = true;
            }
        } catch (NumberFormatException nfe) {
            objLog.Log(nfe.getMessage());
        }
        return returnValue;
    }

    private void showVentaMenu() {
        jfrmVentaMenu menu = new jfrmVentaMenu(this, true);
        menu.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblAttendedBy;
    private javax.swing.JLabel jlblCambio;
    private javax.swing.JLabel jlblCambioTitle;
    private javax.swing.JLabel jlblDateField;
    private javax.swing.JLabel jlblEfectivo;
    private javax.swing.JLabel jlblEfectivoTitle;
    private javax.swing.JLabel jlblSymbolCambio;
    private javax.swing.JLabel jlblSymbolEfectivo;
    private javax.swing.JLabel jlblSymbolTotal;
    private javax.swing.JLabel jlblTimeField;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblTotalTitle;
    private javax.swing.JLabel jlblUserName;
    private javax.swing.JPanel jpnlAttendedBy;
    private javax.swing.JPanel jpnlProducts;
    private javax.swing.JPanel jpnlTotales;
    private javax.swing.JTable jtblVenta;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables

    private void cleanTextField() {
        this.txt.setText("");
    }

    private double getTotalFromTable() {

        int rows = this.jtblVenta.getRowCount();
        Double orderTotal = 0.0;
        Double[] subtotalValues = new Double[rows];

        try {
            for (int i = 0; i < rows; i++) {
                String columnValue = this.jtblVenta.getValueAt(i, this.jtblVenta.getColumnCount() - 1).toString();
                subtotalValues[i] = Double.valueOf(columnValue);
            }
        } catch (NumberFormatException nfe) {
            objLog.Log("Error while getting values from jTable. " + nfe.getMessage());
        }

        try {
            for (int i = 0; i < subtotalValues.length; i++) {
                orderTotal += subtotalValues[i];
            }
        } catch (Exception e) {
            objLog.Log("Error while make the sum of the order");
        }

        return orderTotal;

    }

    private void finishOrder() {

        Double total = null;
        int cantidad = 0;
        Venta venta;

        try {
            total = Double.valueOf(this.jlblTotal.getText());
            cantidad = this.jtblVenta.getRowCount();
        } catch (NumberFormatException nfe) {
            objLog.Log(nfe.getMessage());
        } catch (Exception nfe) {
            objLog.Log(nfe.getMessage());
        }

        venta = new Venta();
        venta.setCveCliente(1);
        venta.setFecha(Util.getDate_());
        venta.setIdUsuario("111");
        venta.setTotal(total);
        venta.setCantidad(cantidad);

        VentaLogic vtaLogic = new VentaLogic();

        try {
            int parentId = vtaLogic.saveVenta(venta);
            saveOrderDetail(parentId);
        } catch (Exception e) {
            objLog.Log(e.getMessage());
        }
    }

    private void saveOrderDetail(int parentId) {
        VentaDetalle vd;
        ArrayList<VentaDetalle> listVd = new ArrayList<>();
        int items = this.jtblVenta.getRowCount();
        try {
            for (int i = 0; i < items; i++) {
                String codProducto = String.valueOf(this.jtblVenta.getValueAt(i, 0));
                int cantidad = Integer.parseInt(this.jtblVenta.getValueAt(i, 2).toString());
                double subTotal = Double.valueOf(this.jtblVenta.getValueAt(i, 4).toString());
                
                vd = new VentaDetalle();
                vd.setID_FOLIO(parentId);
                vd.setID_PRODUCT(codProducto);
                vd.setCANTIDAD(cantidad);
                vd.setSUBTOTAL(subTotal);
                
                listVd.add(vd);
            }
        } catch (NumberFormatException nfe) {
            objLog.Log(nfe.getMessage());
        }catch ( UnsupportedOperationException | ClassCastException | NullPointerException nfe) {
            objLog.Log(nfe.getMessage());
        }catch (IllegalArgumentException nfe) {
            objLog.Log(nfe.getMessage());
        }
        
        


 
        
        try {
            VentadDetalleLogic vdLogic = new VentadDetalleLogic();
            vdLogic.saveVentaDetalle(listVd);            
        } catch (Exception e) {
            objLog.Log("Error while saving OrderDetail. " + e.getMessage());
        }
    }
}