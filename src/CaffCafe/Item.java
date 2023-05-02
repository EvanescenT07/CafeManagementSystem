package CaffCafe;

import java.awt.Color;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Zulfikar Ahmad Aliansyah
 */
public class Item extends javax.swing.JFrame {

    private double total = 0.0;
    private int x = 0;
    private double tax = 0.0;

    public Item() {
        initComponents();
        init();
    }

    public void init() {
        setImage();
        setTime();
    }

    public void setImage() {
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/Espresso.jpg"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Images/Cappucino.jpg"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/Images/Latte.jpg"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/Images/Americano.jpg"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/Images/Pancake.jpg"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/Images/Waffle.jpg"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/Images/Sandwich.jpg"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/Images/CheeseCake.jpg"));

        Image img1 = icon1.getImage().getScaledInstance(jLabelimg1.getWidth(), jLabelimg1.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg1.setIcon(new ImageIcon(img1));
        Image img2 = icon2.getImage().getScaledInstance(jLabelimg2.getWidth(), jLabelimg2.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg2.setIcon(new ImageIcon(img2));
        Image img3 = icon3.getImage().getScaledInstance(jLabelimg3.getWidth(), jLabelimg3.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg3.setIcon(new ImageIcon(img3));
        Image img4 = icon4.getImage().getScaledInstance(jLabelimg4.getWidth(), jLabelimg4.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg4.setIcon(new ImageIcon(img4));
        Image img5 = icon5.getImage().getScaledInstance(jLabelimg5.getWidth(), jLabelimg5.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg5.setIcon(new ImageIcon(img5));
        Image img6 = icon6.getImage().getScaledInstance(jLabelimg6.getWidth(), jLabelimg6.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg6.setIcon(new ImageIcon(img6));
        Image img7 = icon7.getImage().getScaledInstance(jLabelimg7.getWidth(), jLabelimg7.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg7.setIcon(new ImageIcon(img7));
        Image img8 = icon8.getImage().getScaledInstance(jLabelimg8.getWidth(), jLabelimg8.getHeight(), Image.SCALE_SMOOTH);
        jLabelimg8.setIcon(new ImageIcon(img8));
    }

    public boolean quantityIsZero(int quantity) {
        if (quantity == 0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity!");
            return false;
        }
        return true;
    }

    public void reset() {
        total = 0.0;
        x = 0;
        tax = 0.0;
        jButtonTotal.setEnabled(true);
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jTextArea1.setText(" ");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jTextFieldTax.setText("0.0");
        jTextFieldSubTotal.setText("0.0");
        jTextFieldTotal.setText("0.0");
    }

    public void bill() {
        jTextFieldTax.setText("Rp " + String.valueOf(tax));
        jTextFieldSubTotal.setText("Rp " + String.valueOf(total));
        jTextFieldTotal.setText("Rp " + String.valueOf(tax + total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jLabelCaffCafe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelMenu = new javax.swing.JLabel();
        jMenuEspresso = new javax.swing.JPanel();
        jLabelimg1 = new javax.swing.JLabel();
        jLabelprice1 = new javax.swing.JLabel();
        jLabelquantity1 = new javax.swing.JLabel();
        jLabelpurchase1 = new javax.swing.JLabel();
        jLabelEspresso = new javax.swing.JLabel();
        jLabelpricevalue1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuCappucino = new javax.swing.JPanel();
        jLabelimg2 = new javax.swing.JLabel();
        jLabelprice2 = new javax.swing.JLabel();
        jLabelquantity2 = new javax.swing.JLabel();
        jLabelpurchase2 = new javax.swing.JLabel();
        jLabelCappucino = new javax.swing.JLabel();
        jLabelpricevalue2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jMenuLatte = new javax.swing.JPanel();
        jLabelimg3 = new javax.swing.JLabel();
        jLabelprice3 = new javax.swing.JLabel();
        jLabelquantity3 = new javax.swing.JLabel();
        jLabelpurchase3 = new javax.swing.JLabel();
        jLabelLatte = new javax.swing.JLabel();
        jLabelpricevalue3 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jCheckBox3 = new javax.swing.JCheckBox();
        jMenuAmericano = new javax.swing.JPanel();
        jLabelimg4 = new javax.swing.JLabel();
        jLabelprice4 = new javax.swing.JLabel();
        jLabelquantity4 = new javax.swing.JLabel();
        jLabelpurchase4 = new javax.swing.JLabel();
        jLabelAmericano = new javax.swing.JLabel();
        jLabelpricevalue4 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jCheckBox4 = new javax.swing.JCheckBox();
        jMenuPancake = new javax.swing.JPanel();
        jLabelimg5 = new javax.swing.JLabel();
        jLabelprice5 = new javax.swing.JLabel();
        jLabelquantity5 = new javax.swing.JLabel();
        jLabelpurchase5 = new javax.swing.JLabel();
        jLabelPancake = new javax.swing.JLabel();
        jLabelpricevalue5 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jCheckBox5 = new javax.swing.JCheckBox();
        jMenuWaffle = new javax.swing.JPanel();
        jLabelimg6 = new javax.swing.JLabel();
        jLabelprice6 = new javax.swing.JLabel();
        jLabelquantity6 = new javax.swing.JLabel();
        jLabelpurchase6 = new javax.swing.JLabel();
        jLabelWaffle = new javax.swing.JLabel();
        jLabelpricevalue6 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jCheckBox6 = new javax.swing.JCheckBox();
        jMenuSandwich = new javax.swing.JPanel();
        jLabelimg7 = new javax.swing.JLabel();
        jLabelprice7 = new javax.swing.JLabel();
        jLabelquantity7 = new javax.swing.JLabel();
        jLabelpurchase7 = new javax.swing.JLabel();
        jLabelSandwich = new javax.swing.JLabel();
        jLabelpricevalue7 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jCheckBox7 = new javax.swing.JCheckBox();
        jMenuCheeseCake = new javax.swing.JPanel();
        jLabelimg8 = new javax.swing.JLabel();
        jLabelprice8 = new javax.swing.JLabel();
        jLabelquantity8 = new javax.swing.JLabel();
        jLabelpurchase8 = new javax.swing.JLabel();
        jLabelCheeseCake = new javax.swing.JLabel();
        jLabelpricevalue8 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButtonTotal = new javax.swing.JButton();
        jButtonReceipt = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFieldTax = new javax.swing.JTextField();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabelTax = new javax.swing.JLabel();
        jLabelSubTotal = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jTxtTime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelHeader.setBackground(new java.awt.Color(153, 255, 255));
        jPanelHeader.setForeground(new java.awt.Color(255, 255, 255));
        jPanelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelHeaderMouseDragged(evt);
            }
        });
        jPanelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHeaderMousePressed(evt);
            }
        });

        jLabelCaffCafe.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabelCaffCafe.setText("CAFF CAFE");
        jLabelCaffCafe.setToolTipText("");

        jLabel1.setText("STILL UNDER DEVELOPING");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelCaffCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCaffCafe))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelMenu.setBackground(new java.awt.Color(153, 255, 255));
        jPanelMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabelMenu.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMenu.setText("MENU ITEMS");

        jLabelprice1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice1.setText("Price :");

        jLabelquantity1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity1.setText("Quantity :");

        jLabelpurchase1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase1.setText("Purchase :");

        jLabelEspresso.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelEspresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEspresso.setText("Espresso");

        jLabelpricevalue1.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue1.setText("Rp45000.0");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox1.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuEspressoLayout = new javax.swing.GroupLayout(jMenuEspresso);
        jMenuEspresso.setLayout(jMenuEspressoLayout);
        jMenuEspressoLayout.setHorizontalGroup(
            jMenuEspressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuEspressoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuEspressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuEspressoLayout.createSequentialGroup()
                        .addComponent(jLabelprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue1))
                    .addGroup(jMenuEspressoLayout.createSequentialGroup()
                        .addComponent(jLabelquantity1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuEspressoLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1))
                    .addComponent(jLabelEspresso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jMenuEspressoLayout.setVerticalGroup(
            jMenuEspressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuEspressoLayout.createSequentialGroup()
                .addComponent(jLabelimg1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEspresso)
                .addGap(12, 12, 12)
                .addGroup(jMenuEspressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice1)
                    .addComponent(jLabelpricevalue1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuEspressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuEspressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase1)
                    .addComponent(jCheckBox1))
                .addContainerGap())
        );

        jLabelprice2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice2.setText("Price :");

        jLabelquantity2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity2.setText("Quantity :");

        jLabelpurchase2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase2.setText("Purchase :");

        jLabelCappucino.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelCappucino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCappucino.setText("Cappucino");

        jLabelpricevalue2.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue2.setText("Rp45000.0");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox2.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuCappucinoLayout = new javax.swing.GroupLayout(jMenuCappucino);
        jMenuCappucino.setLayout(jMenuCappucinoLayout);
        jMenuCappucinoLayout.setHorizontalGroup(
            jMenuCappucinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuCappucinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuCappucinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuCappucinoLayout.createSequentialGroup()
                        .addComponent(jLabelprice2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue2))
                    .addGroup(jMenuCappucinoLayout.createSequentialGroup()
                        .addComponent(jLabelquantity2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuCappucinoLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox2)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jLabelCappucino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuCappucinoLayout.setVerticalGroup(
            jMenuCappucinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuCappucinoLayout.createSequentialGroup()
                .addComponent(jLabelimg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCappucino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMenuCappucinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice2)
                    .addComponent(jLabelpricevalue2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuCappucinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuCappucinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase2)
                    .addComponent(jCheckBox2))
                .addContainerGap())
        );

        jLabelprice3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice3.setText("Price :");

        jLabelquantity3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity3.setText("Quantity :");

        jLabelpurchase3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase3.setText("Purchase :");

        jLabelLatte.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelLatte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLatte.setText("Latte");

        jLabelpricevalue3.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue3.setText("Rp45000.0");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox3.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuLatteLayout = new javax.swing.GroupLayout(jMenuLatte);
        jMenuLatte.setLayout(jMenuLatteLayout);
        jMenuLatteLayout.setHorizontalGroup(
            jMenuLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuLatteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuLatteLayout.createSequentialGroup()
                        .addComponent(jLabelprice3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue3))
                    .addGroup(jMenuLatteLayout.createSequentialGroup()
                        .addComponent(jLabelquantity3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuLatteLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelLatte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuLatteLayout.setVerticalGroup(
            jMenuLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuLatteLayout.createSequentialGroup()
                .addComponent(jLabelimg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLatte)
                .addGap(12, 12, 12)
                .addGroup(jMenuLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice3)
                    .addComponent(jLabelpricevalue3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity3)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuLatteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase3)
                    .addComponent(jCheckBox3))
                .addContainerGap())
        );

        jLabelprice4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice4.setText("Price :");

        jLabelquantity4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity4.setText("Quantity :");

        jLabelpurchase4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase4.setText("Purchase :");

        jLabelAmericano.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelAmericano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAmericano.setText("Americano");

        jLabelpricevalue4.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue4.setText("Rp45000.0");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox4.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuAmericanoLayout = new javax.swing.GroupLayout(jMenuAmericano);
        jMenuAmericano.setLayout(jMenuAmericanoLayout);
        jMenuAmericanoLayout.setHorizontalGroup(
            jMenuAmericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuAmericanoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuAmericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuAmericanoLayout.createSequentialGroup()
                        .addComponent(jLabelprice4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue4))
                    .addGroup(jMenuAmericanoLayout.createSequentialGroup()
                        .addComponent(jLabelquantity4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuAmericanoLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jLabelAmericano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuAmericanoLayout.setVerticalGroup(
            jMenuAmericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuAmericanoLayout.createSequentialGroup()
                .addComponent(jLabelimg4, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAmericano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMenuAmericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice4)
                    .addComponent(jLabelpricevalue4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuAmericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity4)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuAmericanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase4)
                    .addComponent(jCheckBox4))
                .addContainerGap())
        );

        jLabelprice5.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice5.setText("Price :");

        jLabelquantity5.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity5.setText("Quantity :");

        jLabelpurchase5.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase5.setText("Purchase :");

        jLabelPancake.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelPancake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPancake.setText("Pancake");
        jLabelPancake.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelpricevalue5.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue5.setText("Rp55000,0");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox5.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuPancakeLayout = new javax.swing.GroupLayout(jMenuPancake);
        jMenuPancake.setLayout(jMenuPancakeLayout);
        jMenuPancakeLayout.setHorizontalGroup(
            jMenuPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuPancakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuPancakeLayout.createSequentialGroup()
                        .addComponent(jLabelprice5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue5))
                    .addGroup(jMenuPancakeLayout.createSequentialGroup()
                        .addComponent(jLabelquantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuPancakeLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox5)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jLabelPancake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuPancakeLayout.setVerticalGroup(
            jMenuPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuPancakeLayout.createSequentialGroup()
                .addComponent(jLabelimg5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPancake)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMenuPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice5)
                    .addComponent(jLabelpricevalue5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity5)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuPancakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase5)
                    .addComponent(jCheckBox5))
                .addContainerGap())
        );

        jLabelprice6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice6.setText("Price :");

        jLabelquantity6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity6.setText("Quantity :");

        jLabelpurchase6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase6.setText("Purchase :");

        jLabelWaffle.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelWaffle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWaffle.setText("Waffle");

        jLabelpricevalue6.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue6.setText("Rp55000.0");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox6.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuWaffleLayout = new javax.swing.GroupLayout(jMenuWaffle);
        jMenuWaffle.setLayout(jMenuWaffleLayout);
        jMenuWaffleLayout.setHorizontalGroup(
            jMenuWaffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuWaffleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuWaffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuWaffleLayout.createSequentialGroup()
                        .addComponent(jLabelprice6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue6))
                    .addGroup(jMenuWaffleLayout.createSequentialGroup()
                        .addComponent(jLabelquantity6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuWaffleLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox6)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jLabelWaffle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuWaffleLayout.setVerticalGroup(
            jMenuWaffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuWaffleLayout.createSequentialGroup()
                .addComponent(jLabelimg6, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelWaffle)
                .addGap(12, 12, 12)
                .addGroup(jMenuWaffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice6)
                    .addComponent(jLabelpricevalue6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuWaffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity6)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuWaffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase6)
                    .addComponent(jCheckBox6))
                .addContainerGap())
        );

        jLabelprice7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice7.setText("Price :");

        jLabelquantity7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity7.setText("Quantity :");

        jLabelpurchase7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase7.setText("Purchase :");

        jLabelSandwich.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelSandwich.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSandwich.setText("Sandwich");

        jLabelpricevalue7.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue7.setText("Rp75000.0");

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox7.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuSandwichLayout = new javax.swing.GroupLayout(jMenuSandwich);
        jMenuSandwich.setLayout(jMenuSandwichLayout);
        jMenuSandwichLayout.setHorizontalGroup(
            jMenuSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuSandwichLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuSandwichLayout.createSequentialGroup()
                        .addComponent(jLabelprice7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue7))
                    .addGroup(jMenuSandwichLayout.createSequentialGroup()
                        .addComponent(jLabelquantity7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuSandwichLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox7)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jLabelSandwich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuSandwichLayout.setVerticalGroup(
            jMenuSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuSandwichLayout.createSequentialGroup()
                .addComponent(jLabelimg7, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSandwich)
                .addGap(12, 12, 12)
                .addGroup(jMenuSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice7)
                    .addComponent(jLabelpricevalue7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity7)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuSandwichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase7)
                    .addComponent(jCheckBox7))
                .addContainerGap())
        );

        jLabelprice8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelprice8.setText("Price :");

        jLabelquantity8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelquantity8.setText("Quantity :");

        jLabelpurchase8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpurchase8.setText("Purchase :");

        jLabelCheeseCake.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabelCheeseCake.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCheeseCake.setText("Cheesecake");

        jLabelpricevalue8.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        jLabelpricevalue8.setText("Rp85000.0");

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        jCheckBox8.setBackground(new java.awt.Color(153, 153, 153));
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMenuCheeseCakeLayout = new javax.swing.GroupLayout(jMenuCheeseCake);
        jMenuCheeseCake.setLayout(jMenuCheeseCakeLayout);
        jMenuCheeseCakeLayout.setHorizontalGroup(
            jMenuCheeseCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelimg8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jMenuCheeseCakeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuCheeseCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuCheeseCakeLayout.createSequentialGroup()
                        .addComponent(jLabelprice8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabelpricevalue8))
                    .addGroup(jMenuCheeseCakeLayout.createSequentialGroup()
                        .addComponent(jLabelquantity8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jMenuCheeseCakeLayout.createSequentialGroup()
                        .addComponent(jLabelpurchase8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelCheeseCake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jMenuCheeseCakeLayout.setVerticalGroup(
            jMenuCheeseCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuCheeseCakeLayout.createSequentialGroup()
                .addComponent(jLabelimg8, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCheeseCake)
                .addGap(12, 12, 12)
                .addGroup(jMenuCheeseCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelprice8)
                    .addComponent(jLabelpricevalue8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuCheeseCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelquantity8)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jMenuCheeseCakeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelpurchase8)
                    .addComponent(jCheckBox8))
                .addContainerGap())
        );

        jTree1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CaffCafe");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Menu");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Cafe");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resto");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Merchandise");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Item");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jButtonTotal.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButtonTotal.setText("Total");
        jButtonTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        jButtonReceipt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButtonReceipt.setText("Receipt");
        jButtonReceipt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButtonReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReceiptActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jButtonExit.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jMenuSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMenuAmericano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMenuEspresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMenuCheeseCake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMenuPancake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMenuCappucino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMenuWaffle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jMenuLatte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jLabelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jMenuEspresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMenuCappucino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jMenuLatte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMenuPancake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMenuWaffle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMenuAmericano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMenuCheeseCake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMenuSandwich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jTextFieldTax.setEditable(false);
        jTextFieldTax.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 20)); // NOI18N
        jTextFieldTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTax.setText("0.0");
        jTextFieldTax.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTaxActionPerformed(evt);
            }
        });

        jTextFieldSubTotal.setEditable(false);
        jTextFieldSubTotal.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 20)); // NOI18N
        jTextFieldSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSubTotal.setText("0.0");
        jTextFieldSubTotal.setBorder(new javax.swing.border.MatteBorder(null));

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 20)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0.0");
        jTextFieldTotal.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelTax.setFont(new java.awt.Font("SPOOKY BLUEST", 0, 24)); // NOI18N
        jLabelTax.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTax.setText("Tax");
        jLabelTax.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelSubTotal.setFont(new java.awt.Font("SPOOKY BLUEST", 0, 24)); // NOI18N
        jLabelSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSubTotal.setText("Sub Total");
        jLabelSubTotal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelTotal.setFont(new java.awt.Font("SPOOKY BLUEST", 0, 24)); // NOI18N
        jLabelTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTotal.setText("Total");
        jLabelTotal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTxtTime.setBackground(new java.awt.Color(153, 255, 255));
        jTxtTime.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTxtTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTxtTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTxtDate.setBackground(new java.awt.Color(153, 255, 255));
        jTxtDate.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTxtDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTxtDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelSubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jTextFieldSubTotal)
                            .addComponent(jTextFieldTax)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxtTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void caffCafe() {
        int PurchaseID = 15020 + (int) (Math.random() * 80800);
        jTextArea1.setText("*****************************Caff Cafe*******************************\n"
                + "    Time : " + jTxtTime.getText() + "\t     Date : " + jTxtDate.getText() + "\n"
                + "    Purchase ID : " + PurchaseID + "\n"
                + "**********************************************************************\n"
                + "    Item Name : \t\t\t" + "Price (Rp)\n ");
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int quantity = Integer.parseInt(jSpinner1.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 45000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "   " + x + "." + jLabelEspresso.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd MM yyyy");
                    String time = tf.format(date);
                    jTxtTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));

                }
            }
        }).start();
    }

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        int quantity = Integer.parseInt(jSpinner3.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox3.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 45000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelLatte.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int quantity = Integer.parseInt(jSpinner4.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 45000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelAmericano.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        int quantity = Integer.parseInt(jSpinner5.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 55000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelPancake.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int quantity = Integer.parseInt(jSpinner6.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 55000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelWaffle.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        int quantity = Integer.parseInt(jSpinner7.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox7.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 75000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelSandwich.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        int quantity = Integer.parseInt(jSpinner8.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox8.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 85000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelCheeseCake.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButtonReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReceiptActionPerformed
        if (total != 0) {
            if (!jButtonTotal.isEnabled()) {
                try {
                    jTextArea1.print();
                } catch (PrinterException ex) {
                    java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Calculate The Total Price !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Haven't Purchase Any Product !");
        }
    }//GEN-LAST:event_jButtonReceiptActionPerformed

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any item menu");
        } else {
            jTextArea1.setText(jTextArea1.getText()
                    + "\n**********************************************************************\n"
                    + "    Tax : \t" + tax + "\n"
                    + "    Sub Total : \t" + total + "\n"
                    + "    Total :  \t" + (total + tax) + "\n\n"
                    + "*****************************Thank You*****************************\n"
            );
            jButtonTotal.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonTotalActionPerformed

    private void getTax(double t) {
        if (t >= 45000.0 && t <= 90000.0) {
            tax = 5000.0;
        } else if (t > 90000.0 && t <= 135000.0) {
            tax = 10000.0;
        } else if (t > 135000.0 && t <= 210000.0) {
            tax = 15000.0;
        } else if (t > 210000.0) {
            tax = 20000.0;
        }
    }

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        reset();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int quantity = Integer.parseInt(jSpinner2.getValue().toString());
        if (quantityIsZero(quantity) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                caffCafe();
            }
            double price = quantity * 45000.0;
            total += price;
            getTax((int) total);
            jTextArea1.setText(jTextArea1.getText() + "    " + x + "." + jLabelCappucino.getText() + "\t\t\t" + price + "\n");
            bill();
        } else {
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTaxActionPerformed

    int xx, xy;
    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            String s = i + " ";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTree1ValueChanged

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree1.getLastSelectedPathComponent();
        if (selectedNode == null) {
            return;
        }

        String jTreevar = selectedNode.toString();
        if (jTreevar.contains("Cafe")) {
            JFrame dashboardFrame = new JFrame();
            Dashboard dashboard = new Dashboard();
            dashboardFrame.add(dashboard.getContentPane());
            dashboardFrame.pack();
            dashboardFrame.setVisible(true);
        } else if (jTreevar.contains("Item")) {
            JFrame merchandiseFrame = new JFrame();
            Item merchand = new Item();
            merchandiseFrame.add(merchand.getContentPane());
            merchandiseFrame.pack();
            merchandiseFrame.setVisible(true);
        }
    }//GEN-LAST:event_jTree1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReceipt;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAmericano;
    private javax.swing.JLabel jLabelCaffCafe;
    private javax.swing.JLabel jLabelCappucino;
    private javax.swing.JLabel jLabelCheeseCake;
    private javax.swing.JLabel jLabelEspresso;
    private javax.swing.JLabel jLabelLatte;
    private javax.swing.JLabel jLabelMenu;
    private javax.swing.JLabel jLabelPancake;
    private javax.swing.JLabel jLabelSandwich;
    private javax.swing.JLabel jLabelSubTotal;
    private javax.swing.JLabel jLabelTax;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelWaffle;
    private javax.swing.JLabel jLabelimg1;
    private javax.swing.JLabel jLabelimg2;
    private javax.swing.JLabel jLabelimg3;
    private javax.swing.JLabel jLabelimg4;
    private javax.swing.JLabel jLabelimg5;
    private javax.swing.JLabel jLabelimg6;
    private javax.swing.JLabel jLabelimg7;
    private javax.swing.JLabel jLabelimg8;
    private javax.swing.JLabel jLabelprice1;
    private javax.swing.JLabel jLabelprice2;
    private javax.swing.JLabel jLabelprice3;
    private javax.swing.JLabel jLabelprice4;
    private javax.swing.JLabel jLabelprice5;
    private javax.swing.JLabel jLabelprice6;
    private javax.swing.JLabel jLabelprice7;
    private javax.swing.JLabel jLabelprice8;
    private javax.swing.JLabel jLabelpricevalue1;
    private javax.swing.JLabel jLabelpricevalue2;
    private javax.swing.JLabel jLabelpricevalue3;
    private javax.swing.JLabel jLabelpricevalue4;
    private javax.swing.JLabel jLabelpricevalue5;
    private javax.swing.JLabel jLabelpricevalue6;
    private javax.swing.JLabel jLabelpricevalue7;
    private javax.swing.JLabel jLabelpricevalue8;
    private javax.swing.JLabel jLabelpurchase1;
    private javax.swing.JLabel jLabelpurchase2;
    private javax.swing.JLabel jLabelpurchase3;
    private javax.swing.JLabel jLabelpurchase4;
    private javax.swing.JLabel jLabelpurchase5;
    private javax.swing.JLabel jLabelpurchase6;
    private javax.swing.JLabel jLabelpurchase7;
    private javax.swing.JLabel jLabelpurchase8;
    private javax.swing.JLabel jLabelquantity1;
    private javax.swing.JLabel jLabelquantity2;
    private javax.swing.JLabel jLabelquantity3;
    private javax.swing.JLabel jLabelquantity4;
    private javax.swing.JLabel jLabelquantity5;
    private javax.swing.JLabel jLabelquantity6;
    private javax.swing.JLabel jLabelquantity7;
    private javax.swing.JLabel jLabelquantity8;
    private javax.swing.JPanel jMenuAmericano;
    private javax.swing.JPanel jMenuCappucino;
    private javax.swing.JPanel jMenuCheeseCake;
    private javax.swing.JPanel jMenuEspresso;
    private javax.swing.JPanel jMenuLatte;
    private javax.swing.JPanel jMenuPancake;
    private javax.swing.JPanel jMenuSandwich;
    private javax.swing.JPanel jMenuWaffle;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTax;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JLabel jTxtTime;
    // End of variables declaration//GEN-END:variables
}
