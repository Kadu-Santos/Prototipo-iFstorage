package com.mycompany.ifstorage;
import java.awt.Color;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;



/**
 *
 * @author khadu
 */
public class InformacoesSobre extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public InformacoesSobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBar = new javax.swing.JPanel();
        pnlActions = new javax.swing.JPanel();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        pnlFundo = new javax.swing.JPanel();
        pnlBarraLetarl = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlRelatorio = new javax.swing.JPanel();
        lblRelatorio = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        lblDados = new javax.swing.JLabel();
        pnlCardapio = new javax.swing.JPanel();
        lblCardapio = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlInfoAbout = new javax.swing.JPanel();
        lblInfoAbout = new javax.swing.JLabel();
        lblInfoAboutProd = new javax.swing.JButton();
        lblInfoAboutFornecedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Home"); // NOI18N
        setUndecorated(true);

        pnlTopBar.setBackground(new java.awt.Color(23, 136, 44));
        pnlTopBar.setLayout(new java.awt.BorderLayout());

        pnlActions.setMaximumSize(new java.awt.Dimension(150, 30));
        pnlActions.setOpaque(false);

        lblMin.setBackground(new java.awt.Color(23, 136, 44));
        lblMin.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\mim.png")); // NOI18N
        lblMin.setLabelFor(lblMin);
        lblMin.setOpaque(true);
        lblMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinMousePressed(evt);
            }
        });
        pnlActions.add(lblMin);
        // Adicionar o MouseListener ao JPanel pnlMenu

        lblMin.addMouseListener(new MouseAdapter() {
            private Color hoverColor = new Color(18, 65, 31); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                lblMin.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblMin.setBackground(new Color(23, 136, 44));
            }
        });

        lblMax.setBackground(new java.awt.Color(23, 136, 44));
        lblMax.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\max.png")); // NOI18N
        lblMax.setLabelFor(lblMax);
        lblMax.setOpaque(true);
        lblMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMaxMousePressed(evt);
            }
        });
        pnlActions.add(lblMax);
        // Adicionar o MouseListener ao JPanel pnlMenu
        lblMax.addMouseListener(new MouseAdapter() {
            private Color hoverColor = new Color(18, 65, 31); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                lblMax.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblMax.setBackground(new Color(23, 136, 44));
            }
        });

        lblExit.setBackground(new java.awt.Color(23, 136, 44));
        lblExit.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\exit.png")); // NOI18N
        lblExit.setLabelFor(lblExit);
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExitMousePressed(evt);
            }
        });
        pnlActions.add(lblExit);
        // Adicionar o MouseListener ao JPanel pnlMenu
        lblExit.addMouseListener(new MouseAdapter() {
            private Color hoverColor = new Color(255, 10, 10); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                lblExit.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                lblExit.setBackground(new Color(23, 136, 44));
            }
        });

        pnlTopBar.add(pnlActions, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pnlTopBar, java.awt.BorderLayout.PAGE_START);
        pnlTopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTopBarMouseDragged(evt);
            }
        });
        pnlTopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTopBarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTopBarMousePressed(evt);
            }
        });

        pnlFundo.setBackground(new java.awt.Color(255, 255, 255));

        pnlBarraLetarl.setBackground(new java.awt.Color(23, 136, 44));

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\Franck\\Faculdade\\Prototipo-iFstorage\\src\\main\\java\\com\\mycompany\\ifstorage\\images\\logo.png")); // NOI18N
        lblLogo.setLabelFor(lblLogo);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("iFstorage");

        pnlRelatorio.setBackground(new java.awt.Color(23, 136, 44));
        pnlRelatorio.setForeground(new java.awt.Color(255, 255, 255));

        lblRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        lblRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatorio.setText("Relatório");

        javax.swing.GroupLayout pnlRelatorioLayout = new javax.swing.GroupLayout(pnlRelatorio);
        pnlRelatorio.setLayout(pnlRelatorioLayout);
        pnlRelatorioLayout.setHorizontalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRelatorioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlRelatorioLayout.setVerticalGroup(
            pnlRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlMenu.setBackground(new java.awt.Color(23, 136, 44));
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));

        lblMenu.setBackground(new java.awt.Color(0, 0, 0));
        lblMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("Menu");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlDados.setBackground(new java.awt.Color(23, 136, 44));
        pnlDados.setForeground(new java.awt.Color(255, 255, 255));
        pnlDados.setPreferredSize(new java.awt.Dimension(190, 50));

        lblDados.setBackground(new java.awt.Color(0, 0, 0));
        lblDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDados.setForeground(new java.awt.Color(255, 255, 255));
        lblDados.setText("Dados");

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblDados, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        pnlCardapio.setBackground(new java.awt.Color(23, 136, 44));
        pnlCardapio.setForeground(new java.awt.Color(255, 255, 255));

        lblCardapio.setBackground(new java.awt.Color(0, 0, 0));
        lblCardapio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCardapio.setForeground(new java.awt.Color(255, 255, 255));
        lblCardapio.setText("Cardapio");

        javax.swing.GroupLayout pnlCardapioLayout = new javax.swing.GroupLayout(pnlCardapio);
        pnlCardapio.setLayout(pnlCardapioLayout);
        pnlCardapioLayout.setHorizontalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardapioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlCardapioLayout.setVerticalGroup(
            pnlCardapioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBarraLetarlLayout = new javax.swing.GroupLayout(pnlBarraLetarl);
        pnlBarraLetarl.setLayout(pnlBarraLetarlLayout);
        pnlBarraLetarlLayout.setHorizontalGroup(
            pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLetarlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addGroup(pnlBarraLetarlLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBarraLetarlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlBarraLetarlLayout.setVerticalGroup(
            pnlBarraLetarlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBarraLetarlLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        //Definindo coloração
        pnlRelatorio.setBackground(new java.awt.Color(23, 136, 44));
        pnlRelatorio.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlRelatorio.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlRelatorio.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlRelatorio.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlRelatorio.setBackground(originalColor);
            }
        });
        //Definindo coloração
        pnlMenu.setBackground(new java.awt.Color(23, 136, 44));
        pnlMenu.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlMenu.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlMenu.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlMenu.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlMenu.setBackground(originalColor);
            }
        });
        //Definindo coloração
        pnlDados.setBackground(new java.awt.Color(23, 136, 44));
        pnlDados.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlDados.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlDados.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlDados.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlDados.setBackground(originalColor);
            }
        });
        //Definindo coloração
        pnlCardapio.setBackground(new java.awt.Color(23, 136, 44));
        pnlCardapio.setForeground(new java.awt.Color(255, 255, 255));

        // Adicionar o MouseListener ao JPanel pnlMenu
        pnlCardapio.addMouseListener(new MouseAdapter() {
            private Color originalColor = pnlCardapio.getBackground();
            private Color hoverColor = new Color(20, 122, 40); // Definir a nova cor de fundo ao passar o mouse

            @Override
            public void mouseEntered(MouseEvent e) {
                pnlCardapio.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pnlCardapio.setBackground(originalColor);
            }
        });

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        pnlInfoAbout.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfoAbout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));

        lblInfoAbout.setFont(new java.awt.Font("Segoe UI", 0, 60)); // NOI18N
        lblInfoAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfoAbout.setText("Deseja ver informações sobre:");

        lblInfoAboutProd.setBackground(new java.awt.Color(23, 136, 44));
        lblInfoAboutProd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInfoAboutProd.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoAboutProd.setText("Produtos");

        lblInfoAboutFornecedores.setBackground(new java.awt.Color(23, 136, 44));
        lblInfoAboutFornecedores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblInfoAboutFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoAboutFornecedores.setText("Fornecedores");

        javax.swing.GroupLayout pnlInfoAboutLayout = new javax.swing.GroupLayout(pnlInfoAbout);
        pnlInfoAbout.setLayout(pnlInfoAboutLayout);
        pnlInfoAboutLayout.setHorizontalGroup(
            pnlInfoAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAboutLayout.createSequentialGroup()
                .addGroup(pnlInfoAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoAboutLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInfoAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlInfoAboutLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(lblInfoAboutFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(lblInfoAboutProd, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 336, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInfoAboutLayout.setVerticalGroup(
            pnlInfoAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAboutLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(lblInfoAbout)
                .addGap(18, 18, 18)
                .addGroup(pnlInfoAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfoAboutFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInfoAboutProd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addComponent(pnlInfoAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(pnlInfoAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addComponent(pnlBarraLetarl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBarraLetarl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaxMousePressed
        if (InformacoesSobre.this.getExtendedState() == MAXIMIZED_BOTH) {
            InformacoesSobre.this.setExtendedState(JFrame.NORMAL);
        } else {
            InformacoesSobre.this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_lblMaxMousePressed

    private void lblExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_lblExitMousePressed

    private void lblMinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinMousePressed
        InformacoesSobre.this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblMinMousePressed

    
    //Funções para Movimenta janela
    
    int xy, xx;
    
    private void pnlTopBarMousePressed(java.awt.event.MouseEvent evt) {                                    
        xx = evt.getX();
        xy = evt.getY();
    }                                   

    private void pnlTopBarMouseClicked(java.awt.event.MouseEvent evt) {                                    
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            if (InformacoesSobre.this.getExtendedState() == MAXIMIZED_BOTH) {
                InformacoesSobre.this.setExtendedState(JFrame.NORMAL);
            } else {
                InformacoesSobre.this.setExtendedState(MAXIMIZED_BOTH);
            }
        }
    }                                   

    private void pnlTopBarMouseDragged(java.awt.event.MouseEvent evt) {                                    
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    } 
    
    //Fim das funções para movimenta janela
    
    
    /*Funções para que os botões maximizar, minimizar e close funcionem
    
    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {                                      
        System.exit(0);
    }                                     

    private void lblMaximizeMousePressed(java.awt.event.MouseEvent evt) {                                         
        if (Inicio.this.getExtendedState() == MAXIMIZED_BOTH) {
            Inicio.this.setExtendedState(JFrame.NORMAL);
        } else {
            Inicio.this.setExtendedState(MAXIMIZED_BOTH);
        }
    }                                        

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {                                         
        Inicio.this.setState(Frame.ICONIFIED);
    }  
    
    */
    
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
            java.util.logging.Logger.getLogger(InformacoesSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesSobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesSobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblInfoAbout;
    private javax.swing.JButton lblInfoAboutFornecedores;
    private javax.swing.JButton lblInfoAboutProd;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JPanel pnlActions;
    private javax.swing.JPanel pnlBarraLetarl;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlInfoAbout;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlRelatorio;
    private javax.swing.JPanel pnlTopBar;
    // End of variables declaration//GEN-END:variables
}