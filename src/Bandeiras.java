import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vitor
 */
public class Bandeiras {

    public static void main(String[] args) throws IOException {
        int opc = 1;
        int w = 1500;
        int h = 1000;
        double partes = 0;
        int raio = 0;
        int posx = 0;
        int posy = 0;
        int largura, posini, altura = 0;

        int[] corBranco = new int[]{255, 255, 255};
        int[] corVermelho = new int[]{255, 0, 0};
        int[] corPreto = new int[]{0, 0, 0};
        int[] corAzul = new int[]{0, 0, 255};
        int[] corVerdeEscuro = new int[]{8, 107, 27};
        int[] corAmarelo = new int[]{255, 255, 0};
        int[] corAmareloEscuro = new int[]{227, 224, 8};

        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();
        Scanner sc = new Scanner(System.in);

        while (opc != 0) {
            System.out.println("======== ESCOLHA UMA IMAGEM PARA CRIAR =======");
            System.out.println("");
            System.out.println("1 - Bandeira da Itália");
            System.out.println("2 - Bandeira da Polônia");
            System.out.println("3 - Bandeira da Bélgica");
            System.out.println("4 - Bandeira da Filândia");
            System.out.println("5 - Bandeira da Alemanha");
            System.out.println("6 - Bandeira da Emirados Árabes Unidos");
            System.out.println("7 - Bandeira da Suíça");
            System.out.println("8 - Bandeira do Japão");
            System.out.println("9 - Estrela de Davi");
            System.out.println("              0 - Finalizar Sistema (Sair)");
            System.out.println("==============================================");
            System.out.print("Escolha uma opção de 0 á 9: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 0:
                    System.out.println(" ");
                    System.out.println("SISTEMA FINALIZADO...");
                    break;
                case 1:
                    partes = w / 3;

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (x < partes) {
                                raster.setPixel(x, y, corVerdeEscuro);
                            } else if (x >= partes && x < partes * 2) {
                                raster.setPixel(x, y, corBranco);
                            } else {
                                raster.setPixel(x, y, corVermelho);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Itália.png"));
                    System.out.println("BANDEIRA DA ITÁLIA CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 2:
                    partes = h / 2;

                    for (int y = 0; y < h; y++) {
                        for (int x = 0; x < w; x++) {
                            if (y < partes) {
                                raster.setPixel(x, y, corBranco);
                            } else {
                                raster.setPixel(x, y, corVermelho);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Polônia.png"));
                    System.out.println("BANDEIRA DA POLÔNIA CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 3:
                    partes = w / 3;

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (x < partes) {
                                raster.setPixel(x, y, corPreto);
                            } else if (x >= partes && x < partes * 2) {
                                raster.setPixel(x, y, corAmarelo);
                            } else {
                                raster.setPixel(x, y, corVermelho);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Bélgica.png"));
                    System.out.println("BANDEIRA DA BÉLGICA CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 4:

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y > 350 && y <= 600) {
                                raster.setPixel(x, y, corAzul);
                            } else if (x > 350 && x < 600) {
                                raster.setPixel(x, y, corAzul);
                            } else {
                                raster.setPixel(x, y, corBranco);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Filândia.png"));
                    System.out.println("BANDEIRA DA FILÂNDIA CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 5:
                    partes = h / 3;

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y < partes) {
                                raster.setPixel(x, y, corPreto);
                            } else if (y >= partes && y < partes * 2) {
                                raster.setPixel(x, y, corVermelho);
                            } else {
                                raster.setPixel(x, y, corAmareloEscuro);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Alemanha.png"));
                    System.out.println("BANDEIRA DA ALEMANHA CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 6:
                    partes = h / 3;

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (x < 500) {
                                raster.setPixel(x, y, corVermelho);
                            } else if (x >= 500 && y < partes) {
                                raster.setPixel(x, y, corVerdeEscuro);
                            } else if (x >= 500 && y >= partes && y < partes * 2) {
                                raster.setPixel(x, y, corBranco);
                            } else {
                                raster.setPixel(x, y, corPreto);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Emirados_Arabes_Unidos.png"));
                    System.out.println("BANDEIRA DA EMIRADOS ÁRABES UNIDOS CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 7:

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y > 100 && x > 600 && x < 910 && y < 900) {
                                raster.setPixel(x, y, corBranco);
                            } else if (x > 300 && y > 350 && x < 1200 && y < 670) {
                                raster.setPixel(x, y, corBranco);
                            } else {
                                raster.setPixel(x, y, corVermelho);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Suica.png"));
                    System.out.println("BANDEIRA DA SUÍÇA CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 8:
                    raio = 300;
                    posx = 750;
                    posy = 500;

                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y < 1500) {
                                raster.setPixel(x, y, corBranco);
                            }
                        }
                    }

                    for (int y = -raio; y <= raio; y++) {
                        for (int x = -raio; x <= raio; x++) {
                            if (Math.round(Math.sqrt(y * y + x * x)) < raio) {
                                raster.setPixel(x + posx, y + posy, corVermelho);
                            }
                        }
                    }
                    ImageIO.write(image, "PNG", new File("Bandeira_Japão.png"));
                    System.out.println("BANDEIRA DA JAPÃO CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;
                case 9:
                    raio = 10;
                    posx = 750;
                    posy = 300;

                    // Montagem do Lado Esquerdo
                    while (posx > 380) {
                        for (int y = -raio; y <= raio; y++) {
                            for (int x = -raio; x <= raio; x++) {
                                raster.setPixel(x + posx, y + posy, corBranco);
                            }
                        }
                        posy = posy + 20;
                        posx = posx - 20;
                    }

                    // Montagem do Lado Direito
                    posy = 320;
                    posx = 770;
                    while (posx < 1120) {
                        for (int y = -raio; y <= raio; y++) {
                            for (int x = -raio; x <= raio; x++) {
                                raster.setPixel(x + posx, y + posy, corBranco);
                            }
                        }
                        posy = posy + 20;
                        posx = posx + 20;
                    }

                    // Montagem da Base
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y > 650 && y < 671 && x > 400 && x < 1100) {
                                raster.setPixel(x, y, corBranco);
                            }
                        }
                    }
                    // Termino do Triangulo Equilatero
                    // Começo do Triangulo Invertido

                    // Montagem do Lado Esquerto Invertido
                    posx = 750;
                    posy = 800;
                    while (posx > 380) {
                        for (int y = -raio; y <= raio; y++) {
                            for (int x = -raio; x <= raio; x++) {
                                raster.setPixel(x + posx, y + posy, corBranco);
                            }
                        }
                        posy = posy - 20;
                        posx = posx - 20;
                    }

                    // Montagem do Lado Direito Invertido
                    posy = 780;
                    posx = 770;
                    while (posx < 1120) {
                        for (int y = -raio; y <= raio; y++) {
                            for (int x = -raio; x <= raio; x++) {
                                raster.setPixel(x + posx, y + posy, corBranco);
                            }
                        }
                        posy = posy - 20;
                        posx = posx + 20;
                    }

                    // Montagem da Base Invertida
                    for (int x = 0; x < w; x++) {
                        for (int y = 0; y < h; y++) {
                            if (y > 429 && y < 450 && x > 400 && x < 1100) {
                                raster.setPixel(x, y, corBranco);
                            }
                        }
                    }

                    ImageIO.write(image, "PNG", new File("Estrela_de_Davi.png"));
                    System.out.println("IMAGEM ESTRELA DE DAVI CRIADA COM SUCESSO...");
                    System.out.println("... pressione (ENTER) para continuar...");
                    sc.nextLine();
                    break;

                default:
                    System.out.println(" ");
                    System.out.println("OPÇÃO INVÁLIDA.. TENTE NOVAMENTE");
                    System.out.println("....pressione (ENTER) para continuar...");
                    sc.nextLine();
                    for (int i = 0; i < 50; i++) {
                        System.out.println(" ");
                    }
                    break;
            }
        }
    }
}
