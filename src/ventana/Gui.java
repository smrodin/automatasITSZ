
package ventana;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import objetos.*;
import operaciones.Disjktra;

/**
 *

 */
public class Gui extends javax.swing.JFrame {
    Grafo grafo = new Grafo();
    Nodo nodoInicio = null;
    Nodo nodoFin = null;
    boolean lenguajeValidado = false;
    String lenguaje[];
    
    
    /**
     * Creates new form Gui
     */
    public Gui() {
        initComponents();
         //jPanel1.setComponentPopupMenu(jPopupMenu1);
        //jPanel1.setComponentPopupMenu(jPopupMenu1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jMenuItem1.setText("Normal");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Inicial");
        jMenuItem2.setToolTipText("");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("Final");
        jMenuItem3.setToolTipText("");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Grafo"));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("PalabraAnalizar");

        jButton1.setText("Analizar AFD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n");
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Abre_1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Lenguaje");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton3.setText("Analizar AFND");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(236, 236, 236)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dibujarGrafo(){
        jPanel1.paint(jPanel1.getGraphics());
        dibujarArista();
        dibujarNodos();
    }
    public void dibujarNodos(){
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
        }
    }
    public void dibujarArista(){
        int count = 1;
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){            
            ArrayList<Enlace> listaEnlace = nodo.getListaNodoAdyacente();
            if(listaEnlace != null){
                for(Enlace enlace:listaEnlace){
                    enlace.getArista().getLineaQuebrada().dibujarLineaQuebrada(jPanel1.getGraphics(),count);
                    count++;
                }
            }            
        }
    }
    
    private int ingresarPeso(){
        String peso = JOptionPane.showInputDialog("Entrada");
        int intPeso = 0;
        try{
            intPeso = Integer.parseInt(peso);            
        }catch(Exception ex){
            intPeso = ingresarPeso();
        }
        return intPeso;
    }
    
    private String ingresarInput(){
        String input = JOptionPane.showInputDialog("Entrada");
               
        return input;
    }
    
    /*private void eliminarNodo(int x,int y){
        if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
            Nodo temp = grafo.buscarNodo(x, y);
            grafo.eliminarAristasEntrante(temp);
            if(grafo.eliminarNodo(temp)){
                JOptionPane.showMessageDialog(null,"Eliminado");
                dibujarGrafo();
            }
            
        }
    }*/
    
    private boolean validaEntrada(String entrada){
        if (lenguajeValidado == false )
          if (  validaLenguaje() == false) return false;
        
        int valida = 0;
       
        String entradas[] = entrada.split(",");
        
        for (int ent =0; ent <entradas.length;ent++  ){
        
        for (int count=0; count < lenguaje.length; count++)
        {
            if( lenguaje[count].equals(entradas[ent] ) ){
                    valida += 1;
                    break;
            }

            
        }
                    
        }
        
        if ( valida !=  entradas.length ){
                    JOptionPane.showMessageDialog(null, "Entrada: " + entrada +  " No valida",
"Validar Lenguaje", JOptionPane.INFORMATION_MESSAGE);
                    return false;
        }
        else
            return true;
    }
    
    private boolean validaLenguaje( ){
        //Valida exista el lenguaje, y que se haya introducido correctamente una entrada
        boolean respuesta = false;
if  (lenguajeValidado == false )
{
    if  ((jTextArea1.getText().equals("")) )
    {
        JOptionPane.showMessageDialog(null, "Introduce un lenguaje, separado por comas",
"Validar Lenguaje", JOptionPane.INFORMATION_MESSAGE);
        return false;
    }
        
    
    lenguaje = jTextField1.getText().split(",");
    //jTextField1.setEnabled(false);
    respuesta = true;
}
                                
            return respuesta;
    }
    
    public void processMouseEvent(java.awt.event.MouseEvent evt) {

	    if (evt.isPopupTrigger() && nodoInicio != null ) { 
	        jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
	    }
	    super.processMouseEvent(evt);
        }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // normal
        if (nodoInicio != null){
           nodoInicio.setInicialFinal("normal");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // inicial
         if (nodoInicio != null){
                      nodoInicio.setInicialFinal("inicial");
        }
         
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // final
        if (nodoInicio != null){
           nodoInicio.setInicialFinal("final");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (nodoInicio != null){
            valoresNodo vn = new valoresNodo();
            vn.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            vn.setInicialFinal(nodoInicio.getInicialFinal()  );
            vn.setNombre(nodoInicio.getDato().toString());
            vn.setNodoRef(nodoInicio);
            vn.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        ArrayList<String> alFormal = new ArrayList<String>();
        String cadena= "";
        String formal=jTextField1.getText() +"\n";
        alFormal.add(jTextField1.getText());
        String subCadenaFormal = "", inicialFinal = "";
        int count = 1;
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){
            cadena += "nodo: " + nodo.getDato().toString()+" ," + nodo.getInicialFinal()  + "\n";
            ArrayList<Enlace> listaEnlace = nodo.getListaNodoAdyacente();
            if(listaEnlace != null){
                if ( nodo.getInicialFinal().equals("final") )
                inicialFinal = "*";
                else
                inicialFinal= "";

                subCadenaFormal =  inicialFinal +  nodo.getDato().toString() + "-";
                for(Enlace enlace:listaEnlace){
                    cadena += "Con " + enlace.getArista().getEntrada() + " va a: "  + enlace.getNodo().getDato().toString() + "\n";
                    //enlace.getArista().getLineaQuebrada().dibujarLineaQuebrada(jPanel1.getGraphics(),count);
                    count++;
                    subCadenaFormal +=  enlace.getNodo().getDato().toString() +"&";

                }
                alFormal.add(subCadenaFormal.substring(0, subCadenaFormal.length() -1 ));
                formal = formal + subCadenaFormal.substring(0, subCadenaFormal.length() -1 ) + "\n";
                //alFormal.add(formal);
            }
        }

        jTextArea1.setText(cadena + "\n" + formal );

        Automatas1 auto = new Automatas1(alFormal);
        jTextArea1.setText(jTextArea1.getText() + auto.process_string(jTextField2.getText()) + "\n"  );
        //auto.inicializa(alFormal);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        int x = evt.getX();
        int y = evt.getY();

        if (evt.getClickCount() ==2  )
        {
            crearNodo(x, y);//creo un nodo apartir de unas coordenadas
        }

        if (evt.getButton() == 3 && nodoInicio != null )
        {
            String inicialFinal = nodoInicio.getInicialFinal();
            int numeroIndice = -1;
            //Muestro el menu!
            jPopupMenu1.getComponent(0).setForeground(Color.black);
            jPopupMenu1.getComponent(1).setForeground(Color.black);
            jPopupMenu1.getComponent(2).setForeground(Color.black);

            if (inicialFinal.equals("normal") )
            numeroIndice = 0;
            if (inicialFinal.equals("inicial") )
            numeroIndice = 1;
            if (inicialFinal.equals("final") )
            numeroIndice = 2;

            JMenuItem menu =  (JMenuItem) jPopupMenu1.getComponent(numeroIndice);
            menu.setForeground(Color.red);

            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }

        if (evt.getClickCount() ==1  && evt.getButton() == 1 )
        {
            if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
                if(nodoInicio == null){
                    nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
                    nodoInicio.getCirculo().setColor(Color.red);//Lo hago cambiar de color
                    //                JOptionPane.showMessageDialog(null,"Seleccione otro nodo para crear una arista");
                }
                else
                {//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista
                    nodoFin = grafo.buscarNodo(x, y);
                    crearArista();

                    nodoInicio.getCirculo().setColor(Color.yellow);//lo regreso a su color original

                    nodoInicio = null;//null para poder crear mas arista
                    nodoFin = null;//null para poder crear mas arista
                }
            }
            else
            {//Si no he hecho clic sobre un nodo
                if(nodoInicio != null)
                nodoInicio.getCirculo().setColor(Color.yellow);//lo regreso a su color original

                nodoInicio = null;//null para poder crear mas arista
                nodoFin = null;//null para poder crear mas arista
                //crearNodo(x, y);//creo un nodo apartir de unas coordenadas
            }

        }
        dibujarGrafo();
        return;

        //        if (evt.getButton() == 3 ){
            //
            //            Nodo nodoSeleccionado = grafo.buscarNodo(x, y);
            //
            //            if(nodoSeleccionado !=null){//si se hace clic sobre un nodo
                //
                //                //jPanel1.setComponentPopupMenu(jPopupMenu1);
                //                String inicialFinal = nodoSeleccionado.getInicialFinal();
                //                int numeroIndice = -1;
                //              //Muestro el menu!
                //                jPopupMenu1.getComponent(0).setForeground(Color.black);
                //                jPopupMenu1.getComponent(1).setForeground(Color.black);
                //                jPopupMenu1.getComponent(2).setForeground(Color.black);
                //
                //                if (inicialFinal.equals("normal") )
                //                    numeroIndice = 0;
                //                if (inicialFinal.equals("inicial") )
                //                    numeroIndice = 1;
                //                if (inicialFinal.equals("final") )
                //                    numeroIndice = 2;
                //
                //
                //               JMenuItem menu =  (JMenuItem) jPopupMenu1.getComponent(numeroIndice);
                //                menu.setForeground(Color.red);
                //                //jPopupMenu1.show(this,evt.getX(), evt.getY());
                //                jPopupMenu1.show(this,x, y);
                //
                //
                //            }
            //            else
            //            {
                //                nodoSeleccionado.getCirculo().setColor(Color.yellow);//lo regreso a su color original
                //                nodoSeleccionado = null;
                //
                //                //jPanel1.remove(jPopupMenu1); //removes popup
                //
                //            }
            //        }
        //
        //        if(evt.isMetaDown()){
            ////            eliminarNodo(x, y);
            ////            JOptionPane.showMessageDialog(this,"Clic derecho");
            //            if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
                //            if(nodoInicio == null){
                    //                grafo.reiniciarGrafoParaDisjktra();
                    //                grafo.reiniciarColores();
                    //                nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
                    //                nodoInicio.getCirculo().setColor(Color.red);//Lo hago cambiar de color
                    //
                    ////                JOptionPane.showMvnessageDialog(null,"Seleccione otro nodo para crear una arista");
                    //            }else{//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista
                    //                jPanel1.remove(jPopupMenu1); //removes popup
                    //                nodoFin = grafo.buscarNodo(x, y);
                    //                Disjktra disjktra = new Disjktra(grafo);
                    //                disjktra.ejecutar(nodoInicio);
                    //                disjktra.marcarRutaCorta(nodoFin, Color.red);
                    ////                crearArista();
                    ////
                    ////                nodoInicio.getCirculo().setColor(Color.yellow);//lo regreso a su color original
                    ////
                    //                nodoInicio = null;//null para poder crear mas arista
                    //                nodoFin = null;//null para poder crear mas arista
                    //            }
                //        }
            //
            //
            //        }else{
            //        if(grafo.buscarNodo(x, y)!=null){//si se hace clic sobre un nodo
                //            if(nodoInicio == null){
                    //                nodoInicio = grafo.buscarNodo(x, y);//nodoInicio lo pongo a apuntar al nodo donde hice clic
                    //                nodoInicio.getCirculo().setColor(Color.red);//Lo hago cambiar de color
                    ////                JOptionPane.showMessageDialog(null,"Seleccione otro nodo para crear una arista");
                    //            }else{//si nodoInicio ya estaba apunto a un nodo, lo preparo para crear arista
                    //                nodoFin = grafo.buscarNodo(x, y);
                    //                crearArista();
                    //
                    //                nodoInicio.getCirculo().setColor(Color.yellow);//lo regreso a su color original
                    //
                    //                nodoInicio = null;//null para poder crear mas arista
                    //                nodoFin = null;//null para poder crear mas arista
                    //            }
                //        }else{//Si no he hecho clic sobre un nodo
                //            crearNodo(x, y);//creo un nodo apartir de unas coordenadas
                //        }
            //        }
        //        dibujarGrafo();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Analiza el AFND
        
                // TODO add your handling code here:
        ArrayList<String> alFormal = new ArrayList<String>();
        String cadena= "";
        String formal=jTextField1.getText() +"\n";
        alFormal.add(jTextField1.getText());
        String subCadenaFormal = "", inicialFinal = "";
        int count = 1;
        ArrayList<Nodo> listaNodo = grafo.getListaNodos();
        for(Nodo nodo:listaNodo){
            cadena += "nodo: " + nodo.getDato().toString()+" ," + nodo.getInicialFinal()  + "\n";
            ArrayList<Enlace> listaEnlace = nodo.getListaNodoAdyacente();
            if(listaEnlace != null){
                if ( nodo.getInicialFinal().equals("final") )
                inicialFinal = "*";
                else
                inicialFinal= "";

                subCadenaFormal =  inicialFinal +  nodo.getDato().toString() + "-";
                for(Enlace enlace:listaEnlace){
                    cadena += "Con " + enlace.getArista().getEntrada() + " va a: "  + enlace.getNodo().getDato().toString() + "\n";
                    //enlace.getArista().getLineaQuebrada().dibujarLineaQuebrada(jPanel1.getGraphics(),count);
                    count++;
                    subCadenaFormal +=  enlace.getNodo().getDato().toString() +"&";

                }
                alFormal.add(subCadenaFormal.substring(0, subCadenaFormal.length() -1 ));
                formal = formal + subCadenaFormal.substring(0, subCadenaFormal.length() -1 ) + "\n";
                //alFormal.add(formal);
            }
        }

        jTextArea1.setText(cadena + "\n" + formal );

        Automata auto = new Automata(alFormal);
        jTextArea1.setText(jTextArea1.getText() + auto.process_string(jTextField2.getText()) + "\n"  );
        //auto.inicializa(alFormal);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
   
  
    private void crearArista(){
        //int intPeso = ingresarPeso();
        String input = ingresarInput();
        if (validaEntrada(input) == false)
            return;
        Arista arista = new Arista();
        arista.setEntrada(input);
        Coordenadas c = new Coordenadas(100000,100000);
        c.addCoordenada(nodoInicio.getCirculo().getX() + (nodoInicio.getCirculo().getDiametro()/2),nodoInicio.getCirculo().getY() + (nodoInicio.getCirculo().getDiametro()/2));
        c.addCoordenada(nodoFin.getCirculo().getX() + (nodoInicio.getCirculo().getDiametro()/2),nodoFin.getCirculo().getY() + (nodoInicio.getCirculo().getDiametro()/2));
        LineaQuebrada lq = new LineaQuebrada(c);
        arista.setLineaQuebrada(lq);               
        grafo.crearEnlacesDirigido(nodoInicio, nodoFin,arista);       
        //grafo.crearEnlacesNoDirigido(nodoInicio, nodoFin,arista);       
       
    }
    
    private void crearNodo(int x, int y){
        Coordenadas c = new Coordenadas(100000,100000, x, y);
            String dato = JOptionPane.showInputDialog("Digite nombre del nodo");
            if(dato != null){
                dato = dato.toUpperCase();//por que lo quiero todo en mayusculas
                Nodo nodo = new Nodo(dato,c);
                nodo.getCirculo().setDiametro(12);
                nodo.getCirculo().setEtiqueta(nodo.getDato()+"");
                if(grafo.adjuntarNodo(nodo)){
                    nodo.getCirculo().dibujarCirculo(jPanel1.getGraphics());
                }else{
                }
                nodoInicio = null;
                nodoFin = null; 
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                new Gui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
