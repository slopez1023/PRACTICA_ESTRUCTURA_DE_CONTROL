import javax.swing.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Ingrese su nombre:");
        int codMenuPpal = 0, codSubMenu = 0;
        int countTotalPlatos = 0, countPlatosTipicos = 0, countPlatosCarta = 0, countPlatosInternacionales = 0;
        double totalValue = 0.0;

        do {
            String menu = "RESTAURANT MENU\n\n";
            menu += "1. Plato Típico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato Internacional\n";
            menu += "4. Salir\n\n";
            menu += "Seleccione una opción\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENU TÍPICO\n\n";
                        menuTipico += "1. Bandeja Paisa - $15000\n";
                        menuTipico += "2. Mondongo - $12000\n";
                        menuTipico += "3. Sancocho - $12000\n";
                        menuTipico += "4. Regresar\n\n";
                        menuTipico += "Seleccione una opción\n";
                        codSubMenu = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codSubMenu) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Bandeja Paisa, el costo es de $15000");
                                countPlatosTipicos++;
                                countTotalPlatos++;
                                totalValue += 15000;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Mondongo, el costo es de $12000");
                                countPlatosTipicos++;
                                countTotalPlatos++;
                                totalValue += 12000;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sancocho, el costo es de $12000");
                                countPlatosTipicos++;
                                countTotalPlatos++;
                                totalValue += 12000;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codSubMenu != 4);
                    break;

                case 2:
                    do {
                        String menuCarta = "MENU A LA CARTA\n\n";
                        menuCarta += "1. Filete Mignon - $20000\n";
                        menuCarta += "2. Pollo a la Parrilla - $18000\n";
                        menuCarta += "3. Pasta Carbonara - $16000\n";
                        menuCarta += "4. Regresar\n\n";
                        menuCarta += "Seleccione una opción\n";
                        codSubMenu = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                        switch (codSubMenu) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Filete Mignon, el costo es de $20000");
                                countPlatosCarta++;
                                countTotalPlatos++;
                                totalValue += 20000;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Pollo a la Parrilla, el costo es de $18000");
                                countPlatosCarta++;
                                countTotalPlatos++;
                                totalValue += 18000;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Pasta Carbonara, el costo es de $16000");
                                countPlatosCarta++;
                                countTotalPlatos++;
                                totalValue += 16000;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codSubMenu != 4);
                    break;

                case 3:
                    do {
                        String menuInternacional = "MENU INTERNACIONAL\n\n";
                        menuInternacional += "1. Sushi - $22000\n";
                        menuInternacional += "2. Tacos - $14000\n";
                        menuInternacional += "3. Pizza - $18000\n";
                        menuInternacional += "4. Regresar\n\n";
                        menuInternacional += "Seleccione una opción\n";
                        codSubMenu = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                        switch (codSubMenu) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Sushi, el costo es de $22000");
                                countPlatosInternacionales++;
                                countTotalPlatos++;
                                totalValue += 22000;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Tacos, el costo es de $14000");
                                countPlatosInternacionales++;
                                countTotalPlatos++;
                                totalValue += 14000;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Pizza, el costo es de $18000");
                                countPlatosInternacionales++;
                                countTotalPlatos++;
                                totalValue += 18000;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                    } while (codSubMenu != 4);
                    break;

                case 4:
                    String factura = "Factura\n\n";
                    factura += "Nombre: " + userName + "\n";
                    factura += "Total de platos solicitados: " + countTotalPlatos + "\n";
                    factura += "Platos Típicos: " + countPlatosTipicos + "\n";
                    factura += "Platos a la Carta: " + countPlatosCarta + "\n";
                    factura += "Platos Internacionales: " + countPlatosInternacionales + "\n";
                    factura += "Valor Total a Pagar: $" + totalValue + "\n";
                    JOptionPane.showMessageDialog(null, factura);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }
}
