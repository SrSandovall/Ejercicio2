package umg.progra2;

import umg.progra2.clasesgrupo1.Areacirculo;
import umg.progra2.clasesgrupo1.Circunferenciacirculo;
import umg.progra2.clasesgrupo1.Volumencubo;
import umg.progra2.clasesgrupo2.Areatriangulo;
import umg.progra2.clasesgrupo2.areapiramidecuadrada;
import umg.progra2.clasesgrupo2.volumendeunapiramidecuadrada;
import umg.progra2.grupo3.Volprimasrectangular;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Areacirculo area = new Areacirculo();
        Circunferenciacirculo circunferencia = new Circunferenciacirculo();
        Volumencubo volumen = new Volumencubo();


            Scanner sc = new Scanner(System.in);
           System.out.println("Ingrese un numero: ");

          area.radio = sc.nextDouble();
           circunferencia.radio = area.radio;
           volumen.ladodelcubo = area.radio;

           System.out.println("El volumen del cubo es:" + volumen.calcularvolumenparacubo() +"unidades cubicas");
            System.out.println("La circunferencia del circulo es: " + circunferencia.calcularcircunferenciacirculo() + "cm");
           System.out.println("El Area del circulo es: " + area.Calcularareacirculo() + "cm^2");



            areapiramidecuadrada areapiramide = new areapiramidecuadrada();
            System.out.println("Ingrese la base y altura de la piramide:");
            areapiramide.base = sc.nextDouble();
            areapiramide.altura = sc.nextDouble();

           System.out.println("El area de la piramide cuadrada es: " + areapiramide.calcularpiramidecuadrada());




            volumendeunapiramidecuadrada volumenpiramide = new volumendeunapiramidecuadrada();
            System.out.println("Ingrese la base y altura de la piramide:");
            volumenpiramide.base = sc.nextDouble();
            volumenpiramide.altura = sc.nextDouble();


            System.out.println("El area de la piramide cuadrada es: " + volumenpiramide.calcularvolumenpiramidecuadrada());


           Areatriangulo areaparatriangulo = new Areatriangulo();
            System.out.println("Ingrese la base y altura de la piramide:");
            areaparatriangulo.base = sc.nextDouble();
            areaparatriangulo.altura = sc.nextDouble();


            System.out.println("El area de la piramide cuadrada es: " + areaparatriangulo.calcularareatriangulo());


        Volprimasrectangular prismarectangular = new Volprimasrectangular();
        System.out.println("Ingrese la base y la altura para obtener el volumen:");
        prismarectangular.base = sc.nextDouble();
        prismarectangular.altura = sc.nextDouble();

        System.out.println("El volumen del prisma rectangular es: " + prismarectangular.calcularvoltriangulo());










    }
    }
