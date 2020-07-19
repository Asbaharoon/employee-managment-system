/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.view;

import BL.DConnection;
import BL.EmployeeException;
import BL.PerdoruesiRepository;
import BL.PunetoriRepository;
import BL.PushimiPunetoriRepository;
import BL.PushimiRepository;
import DAL.Perdoruesi;
import DAL.Punetori;
import DAL.Pushimi;
import DAL.PushimiPunetori;
import gui.model.PunetorComboBoxModel;
import gui.model.PushimiComboBoxModel;
import gui.model.PushimiPunetoriTableModel;
import gui.model.PushimiTableModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rilin
 */
public class KerkoPushimin extends javax.swing.JInternalFrame {

    PushimiPunetori pushimipunetori = new PushimiPunetori();
    PushimiPunetoriRepository pr = new PushimiPunetoriRepository();
    PushimiPunetoriTableModel pptm = new PushimiPunetoriTableModel();
    PushimiComboBoxModel pcb = new PushimiComboBoxModel();
    PushimiTableModel ptm = new PushimiTableModel();
    PushimiRepository prr = new PushimiRepository();
    PunetoriRepository punetorirepo = new PunetoriRepository();
    PunetorComboBoxModel punetoricmb = new PunetorComboBoxModel();
    PerdoruesiRepository perdoruesirepo = new PerdoruesiRepository();
    int empId = Emp.empId;
    DConnection source = new DConnection();

    /**
     * Creates new form KerkoPushimin
     */
    public KerkoPushimin() {
        initComponents();
        loadComboBox();
        tabelaSelectedIndexChange();
        loadTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        kerkesaTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pushimiCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        dataPrej = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dataDeri = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        totaliTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kerkuarTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lejuarTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(240, 240, 240));
        kGradientPanel1.setkStartColor(new java.awt.Color(240, 240, 240));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        kGradientPanel3.setkEndColor(new java.awt.Color(240, 240, 240));
        kGradientPanel3.setkStartColor(new java.awt.Color(240, 240, 240));

        kerkesaTxt.setEditable(false);

        jLabel1.setText("Kerkesa nr:");

        jLabel3.setText("Lloji pushimit");

        jLabel4.setText("Data fillimit ");

        jLabel5.setText("Data mbarimit ");

        saveBtn.setText("Ruaj");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Fshij");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Anulo");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jButton1.setText("Gjenero Raportin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pushimiCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kerkesaTxt)
                            .addComponent(dataPrej, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(dataDeri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(saveBtn))
                        .addGap(32, 32, 32)
                        .addComponent(deleteBtn)
                        .addGap(67, 67, 67)
                        .addComponent(cancelBtn)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1))
                    .addGroup(kGradientPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kerkesaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pushimiCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataPrej, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataDeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn)
                    .addComponent(cancelBtn)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Kerkesa", jPanel2);

        totaliTxt.setEditable(false);

        jLabel6.setText("Ditet e lejuara");

        kerkuarTxt.setEditable(false);

        jLabel11.setText("Ditet e kerkuara");

        lejuarTxt.setEditable(false);

        jLabel12.setText("Ditet e mbetura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(kerkuarTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(totaliTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lejuarTxt))
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totaliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kerkuarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lejuarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(432, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kalkulimet", jPanel1);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = null;
        Date d2 = null;
        Perdoruesi per = null;
        Pushimi ipushushem = null;
        int mbetja_kalkuluar = 0;
        int dayss = 0;
        int tot = 0;
        int shuma = 0;
        int shumaa = 0;
        int total = 0;
        Date date = new Date();
        System.out.println("Data aktuale " + format.format(date));
        try {

            int row = table.getSelectedRow();
            per = perdoruesirepo.findPerdoruesiInfo(empId);
            if (row == -1) {
                PushimiPunetori p = new PushimiPunetori();
                d1 = format.parse(format.format(dataPrej.getDate()));
                d2 = format.parse(format.format(dataDeri.getDate()));

                long dif = d2.getTime() - d1.getTime();
                long hours = dif / (60 * 60 * 1000);
                long days = hours / 24;
                System.out.println(empId);
                System.out.println("Prova: " + per.getUsername());
                System.out.println("Prova: " + per.getPunetoriID());
                p.setPerdoruesiID(per);
                p.setPushimiID((Pushimi) pushimiCB.getSelectedItem());
                p.setDataFillimit(dataPrej.getDate());
                p.setDataMbarimit(dataDeri.getDate());

                String pushimi = pushimiCB.getSelectedItem().toString();
                dayss = (int) days;
                if (dayss < 0 || dataDeri.getDate().before(dataPrej.getDate()) || dataPrej.getDate().before(date)) {
                    JOptionPane.showMessageDialog(this, "Gabim , zgjedh mire daten!");
                    throw new EmployeeException("Gabim");
                }
                if (p.getPushimiID() == pushimiCB.getSelectedItem()) {
                    ipushushem = prr.getByNumriPushimit(p.getPushimiID().getPushimiID());
                    int push = (int) ipushushem.getPushimiID();
                    p.setTotali(ipushushem.getDitet());
                    List<Pushimi> list = pr.gjejPushimet(per); // gjeje per wa 
                    if (list.contains(ipushushem)) {
                        total = pr.findTotali(empId, push);
                        p.setKerkuara(dayss);
                        shuma = total - (int) dayss;
                        if (shuma >= 0) {
                            p.setMbetura(shuma);
                        } else {
                            JOptionPane.showMessageDialog(this, "Gabim ,ditet e kerkuara kalojn limitin!");
                            throw new EmployeeException("");
                        }

                    } else if (!list.contains(ipushushem)) {
                        p.setKerkuara(dayss);
                        shumaa = (int) ipushushem.getDitet() - dayss;
                        if (shumaa >= 0) {
                            p.setMbetura(shumaa);
                        } else {
                            JOptionPane.showMessageDialog(this, "Gabim ,ditet e kerkuara kalojn limitin!");
                            throw new EmployeeException("");
                        }

                    }
                }
                pr.create(p);
                clear();
            } else {
                PushimiPunetori p = pptm.getPushimiPunetori(row);
                d1 = format.parse(format.format(dataPrej.getDate()));
                d2 = format.parse(format.format(dataDeri.getDate()));
                long dif = d2.getTime() - d1.getTime();
                long hours = dif / (60 * 60 * 1000);
                long days = hours / 24;
                System.out.println(empId);
                System.out.println("Prova: " + per.getUsername());
                System.out.println("Prova: " + per.getPunetoriID());
                p.setPerdoruesiID(per);
                p.setPushimiID((Pushimi) pushimiCB.getSelectedItem());
                p.setDataFillimit(dataPrej.getDate());
                p.setDataMbarimit(dataDeri.getDate());

                dayss = (int) days;
                if (dayss < 0 || dataDeri.getDate().before(dataPrej.getDate()) || dataPrej.getDate().before(date)) {
                    JOptionPane.showMessageDialog(this, "Gabim , zgjedh mire daten!");
                    throw new EmployeeException("Gabim");
                }
                if (p.getPushimiID() == pushimiCB.getSelectedItem()) {
                    ipushushem = prr.getByNumriPushimit(p.getPushimiID().getPushimiID());
                    int push = (int) ipushushem.getPushimiID();
                    p.setTotali(ipushushem.getDitet());
                    List<Pushimi> list = pr.gjejPushimet(per);
                    if (list.contains(pushimiCB.getSelectedItem())) {
                        total = pr.findTotali(empId, push);
                        p.setKerkuara(dayss);
                        shuma = total - (int) dayss;
                        if (shuma >= 0) {
                            p.setMbetura(shuma);
                        } else {
                            JOptionPane.showMessageDialog(this, "Gabim ,ditet e kerkuara kalojn limitin!");
                            throw new EmployeeException("");
                        }

                    } else if (!list.contains(pushimiCB.getSelectedItem())) {
                        p.setKerkuara(dayss);
                        shumaa = (int) ipushushem.getDitet() - dayss;
                        if (shumaa >= 0) {
                            p.setMbetura(shumaa);
                        } else {
                            JOptionPane.showMessageDialog(this, "Gabim ,ditet e kerkuara kalojn limitin!");
                            throw new EmployeeException("");
                        }

                    }

                }
                pr.edit(p);
                clear();
            }
            clear();
            loadTable();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, "Kerkesa juaj nuk u rregjistrua!");
        } catch (ParseException ex) {
            Logger.getLogger(KerkoPushimin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    public void ReportTemplateAll(String SqlStatement, String path) {
        try {
            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            JRDesignQuery query = new JRDesignQuery();
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int row = table.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"Po", "Jo"};
            int i = JOptionPane.showOptionDialog(this, "A dëshironi te fshihni rekordin ?", "Fshirja",
                    JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {
                PushimiPunetori p = pptm.getPushimiPunetori(row);
                try {
                    pr.delete(p);
                } catch (EmployeeException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                clear();
                loadTable();
            } else {
                clear();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        clear();
    }//GEN-LAST:event_cancelBtnActionPerformed
    public void ReportTemplateDepartmenti(String SqlStatement, String path) {
        try {
            JasperDesign jd = JRXmlLoader.load(path);
            HashMap param = new HashMap();
            JRDesignQuery query = new JRDesignQuery();
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path = "C:\\Users\\MR-ROBOT\\Desktop\\currproj\\EmployeeManagmentSystem\\src\\reports\\PushimiPunetoriReports.jrxml";
        String sql = "Select * from Pushimi_Punetori p Inner join Perdoruesi pr on pr.PerdoruesiID=p.perdoruesiID Inner join Punetori pune on pune.punetoriID=pr.punetoriID Inner join Pushimi pu on p.pushimiID=pu.pushimiID";
        ReportTemplateAll(sql, path);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void ReportTemplate(String SqlStatement, String path) {
        try {

            JasperDesign jd = JRXmlLoader.load(path);
            JRDesignQuery query = new JRDesignQuery();
            query.setText(SqlStatement);
            jd.setQuery(query);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, source.getConnection());
            JasperViewer.viewReport(jp, false);
        } catch (JRException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//         public void ReportTemplateAll(String SqlStatement, String path) {
//        try {
//
//            JasperDesign jd = JRXmlLoader.load(path);
//            HashMap param = new HashMap();
//            param.put("numberTotal", numberTotal);
//            int nr = new Random().nextInt(1000);
//            String text = "emp2019-" + nr + "";
//            param.put("randomNumber", text);
//            JRDesignQuery query = new JRDesignQuery();
//            query.setText(SqlStatement);
//            jd.setQuery(query);
//            JasperReport jr = JasperCompileManager.compileReport(jd);
//            JasperPrint jp = JasperFillManager.fillReport(jr, param, source.getConnection());
//            JasperViewer.viewReport(jp, false);
//        } catch (JRException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
    public void loadComboBox() {
        try {
            List<Pushimi> lista = prr.findAll();
            List<Punetori> list = punetorirepo.findAll();
            pcb.add(lista);
            punetoricmb.add(list);
            pushimiCB.setModel(pcb);
            // punetoriCB.setModel(punetoricmb);
            pushimiCB.repaint();
            //  punetoriCB.repaint();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    public void clear() {
        kerkesaTxt.setText("");
        // punetoriCB.setSelectedItem(null);
        pushimiCB.setSelectedItem(null);
        dataPrej.setDate(null);
        dataDeri.setDate(null);
        totaliTxt.setText("");
        kerkuarTxt.setText("");
        lejuarTxt.setText("");
    }

    private void tabelaSelectedIndexChange() {
        final ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent Ise) {
                if (Ise.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) Ise.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                    PushimiPunetori p = pptm.getPushimiPunetori(selectedIndex);
                    kerkesaTxt.setText(p.getPushimipunetoriID().toString());
                    //     punetoricmb.setSelectedItem(p.getPunetoriID());
                    pcb.setSelectedItem(p.getPushimiID());
                    pushimiCB.repaint();
                    // punetoriCB.repaint();

                    dataPrej.setDate(p.getDataFillimit());
                    dataDeri.setDate(p.getDataMbarimit());
                    totaliTxt.setText(p.getTotali().toString());
                    kerkuarTxt.setText(p.getKerkuara().toString());
                    lejuarTxt.setText(p.getMbetura().toString());

                }
            }

        });
    }

    public void loadTable() {
        try {
            List<PushimiPunetori> lista = pr.findByID(empId);

            pptm.addList(lista);
            table.setModel(pptm);
            pptm.fireTableDataChanged();
        } catch (EmployeeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private com.toedter.calendar.JDateChooser dataDeri;
    private com.toedter.calendar.JDateChooser dataPrej;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JTextField kerkesaTxt;
    private javax.swing.JTextField kerkuarTxt;
    private javax.swing.JTextField lejuarTxt;
    private javax.swing.JComboBox pushimiCB;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField totaliTxt;
    // End of variables declaration//GEN-END:variables
}
