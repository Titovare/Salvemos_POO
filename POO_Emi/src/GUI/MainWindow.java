package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
import org.apache.commons.validator.UrlValidator;
import org.apache.oro.text.perl.Perl5Util;
import Clases.Radioemisora;
import javax.swing.JOptionPane;
import Clases.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class MainWindow extends javax.swing.JFrame {
private static Radioemisora emisora = null;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public static void activarProg()
    {
        
    }
    public static void setEmisora(Radioemisora radio)
    {
        emisora=radio;
    }
    public static Radioemisora getEmisora()
    {
        return emisora;
    }
    public static void addLocu(Locutor locu)
    {
        emisora.agregarLocutor(locu);
    }
    public static Locutor getLocu(String nombre)
    {
        ArrayList <Locutor> listalocu= emisora.getLocus();
        Locutor loco=new Locutor();
        for(int i = 0; i < listalocu.size(); i++)
        {
            if(listalocu.get(i).getNombre()==nombre)
            {
                loco=listalocu.get(i);
            }
        } 
        return loco;
    }
    public static Disco getDisk(String disco)
    {
        ArrayList <Disco> listadisco= emisora.getDisc();
        Disco loco=new Disco();
        for(int i = 0; i < listadisco.size(); i++)
        {
            if(listadisco.get(i).getNombre()==disco)
            {
                loco=listadisco.get(i);
            }
        } 
        return loco;
    }
    public static Programa getProg(String nombre)
    {
        ArrayList <Programa>listp=emisora.getProg();
        Programa pogo=new Programa();
        for(int i = 0; i < listp.size(); i++)
        {
            if(listp.get(i).getNombre()==nombre)
            {
                pogo=listp.get(i);
            }
        }
        return pogo;
        
    }
        public static Digital getCanc(String nombre)
    {
        ArrayList <Digital>listp=emisora.getDigitales();
        Digital pogo=new Digital();
        for(int i = 0; i < listp.size(); i++)
        {
            if(listp.get(i).getNombre()==nombre)
            {
                pogo=listp.get(i);
            }
        }
        return pogo;
        
    }
    public static void addDisk(Disco disco)
    {
        emisora.agregatDisco(disco);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        lista = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        infol = new javax.swing.JTable();
        progras = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        infop = new javax.swing.JTable();
        SelecProg = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Nombre de Radioemisora:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Dirección física:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Dirección URL");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Frecuencia:");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem13.setText("jMenuItem13");

        jMenuItem15.setText("jMenuItem15");

        infol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Identificador", "Dirección", "Teléfono", "Correo", "Nacimiento", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(infol);

        javax.swing.GroupLayout listaLayout = new javax.swing.GroupLayout(lista.getContentPane());
        lista.getContentPane().setLayout(listaLayout);
        listaLayout.setHorizontalGroup(
            listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        listaLayout.setVerticalGroup(
            listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        infop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Horario", "Duracion", "Genero", "Locutor"
            }
        ));
        jScrollPane3.setViewportView(infop);

        javax.swing.GroupLayout prograsLayout = new javax.swing.GroupLayout(progras.getContentPane());
        progras.getContentPane().setLayout(prograsLayout);
        prograsLayout.setHorizontalGroup(
            prograsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
        prograsLayout.setVerticalGroup(
            prograsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, prograsLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RadioEmisora");
        setName("Ventana"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        SelecProg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SelecProgFocusGained(evt);
            }
        });
        SelecProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecProgActionPerformed(evt);
            }
        });

        jLabel1.setText("Programas disponibles");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cancion", "Autor", "Duracion", "Genero"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Registro");

        jMenuItem1.setText("Crear Radioemisora");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Registrar Locutor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Crear programa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Agregar Album");
        jMenuItem4.setToolTipText("");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Agregar cancion digital");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Modificar");

        jMenuItem6.setText("Modificar Locutor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Modificar Programa");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Modificar Disco");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Modificar Cancion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Album");

        jMenuItem10.setText("Agregar Canciones al album");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Consultas");

        jMenuItem12.setText("Lista de locutores");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem14.setText("Lista de programas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem16.setText("jMenuItem16");
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText("jMenuItem17");
        jMenu2.add(jMenuItem17);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Playlist");

        jMenuItem18.setText("Generar playlist");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelecProg, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SelecProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        SelecProg.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if (emisora==null)
       {
           Registroemisora ventR=new Registroemisora();
           ventR.setVisible(true);
       }
        else
        {
             JOptionPane.showMessageDialog(null, "Ya existe una radioemisora");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(emisora!=null)
        {
            RegistrarLocutor ventL=new RegistrarLocutor();
            ventL.setVisible(true);
        }
        else
        {
          JOptionPane.showMessageDialog(null, "No existe una radioemisora");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(emisora!=null)
        {
            if(emisora.getLocus().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Primero debe crear al menos un locutor");
            }
            else
            {
            AgregarPrograma prog= new AgregarPrograma();
            prog.setVisible(true);
            }
        }
        else
        {
               JOptionPane.showMessageDialog(null, "No existe radioemisora"); 
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void SelecProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecProgActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SelecProgActionPerformed

    private void SelecProgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SelecProgFocusGained
        // TODO add your handling code here:
        if(emisora!=null)
        {
            if(!emisora.getProg().isEmpty())
            {
                SelecProg.removeAllItems();
                ArrayList <Programa> listprog= emisora.getProg();
                for(int i = 0; i < listprog.size(); i++)
            {

                Programa prog=listprog.get(i);
                SelecProg.addItem(prog.getNombre()); 
            }
            }
        }
    }//GEN-LAST:event_SelecProgFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       if(!(emisora==null))
       {
       ArrayList <Programa> progL=emisora.getProg();
       Programa progra=new Programa();
       for(int i = 0; i < progL.size(); i++)
                {
                 Programa algo=progL.get(i);
                 if(algo.getNombre()==SelecProg.getSelectedItem())
                 {
                     progra=algo;
                 }
                }
       if(progra.getPlaylist()==null)
       {
           JOptionPane.showMessageDialog(null, "Aún no existe una playlist asociada al programa, por favor genere una");
       }
       else
       {
          DefaultTableModel model = (DefaultTableModel) tabla.getModel();
           model.setRowCount(0);
           ArrayList <Cancion> canciones=progra.getPlaylist().getCanciones();
           Cancion cancionp;
           for(int i = 0; i < canciones.size(); i++)
            {
              cancionp=canciones.get(i);
              model.addRow(new Object[]{cancionp.getNombre(),cancionp.getCantante(),cancionp.getDuracion(),cancionp.getGeneroMus()});
            }
       }
       
       }
       else
       {
          JOptionPane.showMessageDialog(null, "No existe una radioemisora"); 
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        if(emisora==null)
        {
          JOptionPane.showMessageDialog(null, "No existen Radioemisora");  
        }
        else
        {
          AgregarDisco AG=new AgregarDisco();
          AG.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if(emisora==null)
        {
          JOptionPane.showMessageDialog(null, "No existen Radioemisora");  
        }
        else
        {
            if(emisora.getLocus().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No existen locutores");
            }
            else
            {
                   ModificarLocu VenM=new ModificarLocu();
                   VenM.setVisible(true);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if(emisora==null)
        {
            JOptionPane.showMessageDialog(null, "No existe radioemisora");
        }
        else
        {
            if(emisora.getProg().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No existen programas");
            }
            else
            {
                ModificarPrograma ventanaP=new ModificarPrograma();
                ventanaP.setVisible(true);
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if(emisora!=null)
        {
            if(emisora.getDigitales().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No existen canciones digitales que modificar");
            }
            else
            {
                ModificarCancion MC=new ModificarCancion();
                MC.setVisible(true);
            }
            }
        else
        {
           JOptionPane.showMessageDialog(null, "No existe radioemisora"); 
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if(emisora!=null)
        {
            if(emisora.getDisc().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No existen discos que modificar");
            }
            else
            {
                ModificarDisco AG=new ModificarDisco();
                AG.setVisible(true);
            }
            }
        else
        {
           JOptionPane.showMessageDialog(null, "No existe radioemisora"); 
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        if(emisora!=null)
        {
            if(emisora.getDisc().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No existen discos a los que agregar canciones");
            }
            else
            {
                agregarCancion AG=new agregarCancion();
                AG.setVisible(true);
            }
            }
        else
        {
           JOptionPane.showMessageDialog(null, "No existe radioemisora a la que agregar canciones"); 
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if(emisora==null)
        {
            JOptionPane.showMessageDialog(null, "No existe radioemisora");
        }
        else
        {
            AgregarDigital AC=new AgregarDigital();
            AC.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        
        if (!(emisora==null))
        {
            if(!emisora.getLocus().isEmpty())
            {
            
            DefaultTableModel model = (DefaultTableModel) infol.getModel();
            model.setRowCount(0);
            ArrayList <Locutor> locus=emisora.getLocus();
            Locutor locutorp;
            for(int i = 0; i < locus.size(); i++)
              {
                locutorp=locus.get(i);
                model.addRow(new Object[]{locutorp.getNombre(),locutorp.getIdentificacion(),locutorp.getDireccion(),locutorp.getTelefono(),locutorp.getCorreo(),locutorp.getFechaNacimiento(),locutorp.isSexo()});
              }
            lista.setVisible(true);
            lista.setSize(800,500);
            }  
            else
            {
               JOptionPane.showMessageDialog(null, "No existen locutores"); 
            }
       }
       else
        {
          JOptionPane.showMessageDialog(null, "No existe radioemisora");  
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        if(!(emisora==null))
        {
            if(emisora.getProg().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "No existen programas");
            }
            else
            {
            if(emisora.getDigitales().isEmpty()&&emisora.getDisc().isEmpty())
            {
            JOptionPane.showMessageDialog(null, "No existe canciones con las cuales crear una playlist");
            }
            else
            {
            Programa progra=MainWindow.getProg(SelecProg.getSelectedItem().toString());
            PlayList play=emisora.genplay(progra.getGenero(),progra);
            progra.setPlaylist(play);
            JOptionPane.showMessageDialog(null, "Se ha generado la playlist");
            }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No existe radioemisora");
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        if (!(emisora==null))
        {
            if(!emisora.getProg().isEmpty())
            {
            
            DefaultTableModel model = (DefaultTableModel) infop.getModel();
            model.setRowCount(0);
            ArrayList <Programa> progras=emisora.getProg();
            Programa prograp;
            for(int i = 0; i < progras.size(); i++)
              {
                prograp=progras.get(i);
                model.addRow(new Object[]{prograp.getNombre(),prograp.getHorario(),prograp.getDuracion(),prograp.getGenero(),prograp.getLocutor().getNombre()});
              }
            lista.setVisible(true);
            lista.setSize(800,500);
            }  
            else
            {
               JOptionPane.showMessageDialog(null, "No existen programas"); 
            }
       }
       else
        {
          JOptionPane.showMessageDialog(null, "No existe radioemisora");  
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SelecProg;
    private javax.swing.JTable infol;
    private javax.swing.JTable infop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog lista;
    private javax.swing.JDialog progras;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
