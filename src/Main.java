import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame(); //creamos objeto que representa la ventana
        ventana.setBounds(0, 0, 1600, 900); //Tamaño de la ventana
        ventana.setTitle("Probando la librería Swing en Java"); //Título de la ventana
        ventana.setResizable(false); // Evitamos la redimensión de la ventana
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//el programa se acaba al cerrar la ventana
        ventana.setLayout(null);//eliminamos el layout por defecto

        JMenuBar barraDeMenu = new JMenuBar(); //Creamos la barra de menú

        //Creamos el primer botón de menú (Archivo) y lo agregamos a la barra de menú
        JMenu menuArchivo = new JMenu("Archivo");
        barraDeMenu.add(menuArchivo);

        //Creamos el segundo botón de menú (Acciones) y lo agregamos a la barra de menú
        JMenu menuAcciones = new JMenu("Acciones");
        barraDeMenu.add(menuAcciones);

        //Creamos el tercer botón de menú (Ayuda) y lo agregamos a la barra de menú
        JMenu menuAyuda = new JMenu("Ayuda");
        barraDeMenu.add(menuAyuda);

        //Agregamos la barra de menú a la ventana
        ventana.setJMenuBar(barraDeMenu);

        //Creamos el botón Nueva Liga
        JButton boton = new JButton("Nueva Liga");
        boton.setBounds(50, 50, 200, 80); // establecemos la posición y tamaño

        //Creamos el botón Jugar Liga
        JButton botonJugarLiga = new JButton("Jugar Liga");
        botonJugarLiga.setBounds(50, 150, 200, 80);

        //Creamos el botón Siguiente Jornada
        JButton botonSiguienteJornada = new JButton("Siguiente Jornada");
        botonSiguienteJornada.setBounds(50, 250, 200, 80); // establecemos la posición y tamaño
        botonSiguienteJornada.setEnabled(false); // deshabilitamos el botón por defecto

        //Creamos el botón Simulación Completa
        JButton botonSimulacionCompleta = new JButton("Simulación Completa");
        botonSimulacionCompleta.setBounds(50, 350, 200, 80); // establecemos la posición y tamaño
        botonSimulacionCompleta.setEnabled(false); // deshabilitamos el botón por defecto

        //Creamos el botón Salir
        JButton botonSalir = new JButton("Salir");
        botonSalir.setBounds(50, 650, 200, 80); // establecemos la posición y tamaño

        //Creamos un JPanel para agrupar los botones y la tabla
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(750, 50, 1000, 800);

        //Creamos la tabla
        DefaultTableModel mitabla = new DefaultTableModel();

        //Creamos columnas
        mitabla.addColumn("Nombre del equipo");
        mitabla.addColumn("Partidos jugados");
        mitabla.addColumn("Victorias");
        mitabla.addColumn("Derrotas");
        mitabla.addColumn("Empates");
        JTable tabla = new JTable(mitabla);
        tabla.setBounds(750, 50, 600, 700);//establecemos proporción

        //añadimos la tabla al panel
        panel.add(tabla);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(0, 0, 600, 700);
        panel.add(scroll);

        //Creamos filas
        mitabla.addRow(new Object[]{"Real Madrid", 34, 22, 6, 6});
        mitabla.addRow(new Object[]{"Barcelona", 34, 22, 5, 7});
        mitabla.addRow(new Object[]{"Atletico de Madrid", 34, 20, 8, 6});
        mitabla.addRow(new Object[]{"Sevilla", 34, 20, 4, 10});
        mitabla.addRow(new Object[]{"Real Sociedad", 34, 14, 11, 9});
        mitabla.addRow(new Object[]{"Villarreal", 34, 13, 13, 8});
        mitabla.addRow(new Object[]{"Real Betis", 34, 14, 9, 11});
        mitabla.addRow(new Object[]{"Athletic Club", 34, 11, 12, 11});
        mitabla.addRow(new Object[]{"Celta de Vigo", 34, 10, 12, 12});
        mitabla.addRow(new Object[]{"Granada", 34, 10, 9, 15});
        mitabla.addRow(new Object[]{"Levante", 34, 9, 12, 13});
        mitabla.addRow(new Object[]{"Valencia", 34, 8, 12, 14});
        mitabla.addRow(new Object[]{"Osasuna", 34, 8, 11, 15});
        mitabla.addRow(new Object[]{"Cadiz", 34, 7, 11, 16});
        mitabla.addRow(new Object[]{"Alaves", 34, 6, 10, 18});
        mitabla.addRow(new Object[]{"Elche", 34, 5, 12, 17});
        mitabla.addRow(new Object[]{"Getafe", 34, 6, 9, 19});
        mitabla.addRow(new Object[]{"Huesca", 34, 5, 12, 17});
        mitabla.addRow(new Object[]{"Real Valladolid", 34, 5, 12, 17});
        mitabla.addRow(new Object[]{"Eibar", 34, 4, 13, 17});

        //Establecemos la altura de las filas
        tabla.setRowHeight(35);

        //Creamos el botón en la ventana
        ventana.add(boton);
        ventana.add(botonJugarLiga);
        ventana.add(botonSiguienteJornada);
        ventana.add(botonSimulacionCompleta);
        ventana.add(botonSalir);
        ventana.add(panel);
        ventana.setVisible(true);// así la ventana es visible
    }
}