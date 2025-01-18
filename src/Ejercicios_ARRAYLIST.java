import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios_ARRAYLIST {

//EJERCICIOS CLASE
    //ARRAYS MULTIDIMENSIONALES/UNIDIMENSIONALES
        //Ejercicio 1
            /*
1. (MultiplicarArray) Crear un array de 5 posiciones:
    - se le pedirá al usuario que introduzca cada unos de los elementos del array
    - Multiplica cada elemento del array * 2 y vuelve a guardar su valor
    - Saca por consola la suma de todos los números
    - Saca la media de todos los elementos


    public static void main(String[] args) {

    int [] lista = new int[5];
    Scanner scanner=new Scanner(System.in);
    int suma=0;
    int numDatos=5;
    for (int i=0;i<lista.length;i++){
        System.out.println("Indica el numero para la posicion del array:");
        lista[i]= scanner.nextInt();
    }

        System.out.println("El array es: "+Arrays.toString(lista));

    for (int i=0;i<lista.length;i++){
        lista[i]*=2;
        suma += lista[i];
        }

        System.out.println("El array multiplicado por dos es: "+Arrays.toString(lista));
        System.out.println("La suma del array es: "+suma);
        System.out.println("La media del array es: "+(suma/numDatos));

    }

     */
        //Ejercicio 2
            /*
    2. (MayorArray) Crea una aplicación que realice lo siguiente:
    - pida por pantalla la longitud del array de enteros
    - crea el array de enteros con la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - saque por pantalla el elemento mayor y el elemento menor

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Indica el numero de posiciones del array:");
    int[] lista = new int[scanner.nextInt()];

    for (int i = 0; i < lista.length; i++) {
        System.out.println("Indica el numero para la posicion del array:");
        lista[i] = scanner.nextInt();
    }

    Arrays.sort(lista);

    System.out.println("Elemento menor: "+lista[0]);
    System.out.println("Elemento mayor: "+lista[lista.length-1]);


}


     */
        //Ejercicio 3
            /*
            3. (SumaArrays) Crear una aplicación que:
            - pida la longitud de dos arrays de enteros
            - crea los array de enteros con las longitudes introducidas
            - rellena ambos arrays con números aleatorios
            - crea un tercer array de la misma longitud que los dos anteriores
            - rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)


            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Indica el numero de posiciones de los 2 arrays:");
                int[] lista1 = new int[scanner.nextInt()];
                int[] lista2 = lista1.clone();

                for (int i = 0; i < lista1.length; i++) {
                    lista1[i] = (int) (Math.random()*101);
                    lista2[i] = (int) (Math.random()*101);
                }
                Arrays.sort(lista1);
                Arrays.sort(lista2);

                System.out.println(Arrays.toString(lista1));
                System.out.println(Arrays.toString(lista2));

                int [] lista3=lista1.clone();

                for (int i=0;i<lista3.length;i++){
                    lista3 [i]=lista1[i]+lista2[i];
                }

                System.out.println(Arrays.toString(lista3));


             */
        //Ejercicio 4
            /*
    4. (PosicionesArray) Crea una aplicación que:
    - pida por teclado la longitud de un array
    - cree el array de enteros de la longitud introducida
    - pida al usuario que introduzca todos los datos del array
    - mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente.
    El elemento que está en la última posición pasa a la primera
    - realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y
    así sucesivamente

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la longitud del array
        System.out.print("Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        // Crear el array
        int[] array = new int[longitud];

        // Pedir al usuario que introduzca los datos del array
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // Mostrar el array inicial
        System.out.println("Array original: " +Arrays.toString(array));

        // Mover los elementos una posición hacia la derecha
        moverDerecha(array);
        System.out.println("Array después de mover a la derecha: " +Arrays.toString(array));

        // Mover los elementos una posición hacia la izquierda
        moverIzquierda(array);
        System.out.println("Array después de mover a la izquierda: " +Arrays.toString(array));
    }

    private static void moverDerecha(int[] array) {
        int last = array[array.length - 1]; // Guardar el último elemento

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1]; // Mover cada elemento una posición a la derecha
        }

        array[0] = last; // Colocar el último elemento en la primera posición
    }

    // Método para mover los elementos una posición hacia la izquierda
    public static void moverIzquierda(int[] array) {
        int first = array[0]; // Guardar el primer elemento

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1]; // Mover cada elemento una posición a la izquierda
        }

        array[array.length - 1] = first; // Colocar el primer elemento en la última posición
    }

     */
         //Ejercicio 5   **
             /*
    (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive
    (de forma automática). Se mostrarán los datos separados por una coma y un espacio. Una vez hecho esto se modificará
    el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
- Incrementar en 1 los valores pares y en -1 los impares.
- Duplicar los valores positivos menores que 5
- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
- Invertir el array
- Mostrar la posición del primer par y del último impar.

hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones


    public static void main(String[] args) {
        int [] array =new int[]{0,1,2,3,4,5,6,7,8,9};

        System.out.println("El array inicial es: "+Arrays.toString(array));


        paresImpares(array);
        System.out.println("El array al incrementar en 1 los valores pares y en -1 los impares es: "+Arrays.toString(array));
        duplicarPositivos(array);
        System.out.println("El array al duplicar los valores positivos menores que 5 es: "+Arrays.toString(array));
        sumarAleatorio(array);
        System.out.println("El array al sumar a cada valor un valor entero aleatorio entre -5 y 5 es: "+Arrays.toString(array));
        moverDerecha(array);
        System.out.println("El array movido a la derecha es: "+Arrays.toString(array));
        invertirArray(array);
        System.out.println("El array invertido es: "+Arrays.toString(array));
        primerParUltimoImpar(array);

    }
private static void paresImpares (int [] array){
        for (int i=0;i<array.length;i++){
            if (i%2==0){
                array[i]++;
            } else {
                array[i]--;
            }
        }
}
private static void duplicarPositivos (int [] array){
    for (int i=0;i<array.length;i++){
        if (array[i]<5){
            array[i]*=2;
        }
    }
}
    private static void sumarAleatorio (int [] array){
        for (int i=0;i<array.length;i++){
            int numRandom= (int) (Math.random()*10-5);
            array[i]+=numRandom;
        }
    }
    private static void moverDerecha (int [] array){
        int numFinal= array[array.length-1];
        for (int i=array.length-1; i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=numFinal;
    }

    private static void invertirArray (int [] array){

        for (int i=0; i<array.length/2;i++){
         int temp=array[i];
         array[i]= array[array.length-1-i];
         array[array.length-1-i]=temp;
        }

    }

    private static void primerParUltimoImpar (int [] array){
        int primerPar=-1;
        int ultimoImpar=-1;

        for (int i=0; i<array.length;i++){
           if (array[i]%2==0){
               primerPar=i;
               break;
            }
        }
        for (int i= array.length-1; i>=0;i--){
            if (array[i]%2!=0){
                ultimoImpar=i;
                break;
            }
        }

        if (primerPar!=-1){
               System.out.println("El primer numero par es:"+array[primerPar]);
        } else {
               System.out.println("No hay números pares");

        }
            if (ultimoImpar!=-1){
                System.out.println("El ultimo numero impar es:"+array[ultimoImpar]);
            }else {
                System.out.println("No hay números impares");

            }





    }

     */

//EJERCICIOS BASE
    //ARRAYS
        //Ejercicio1
            /*
            Realiza un programa que pida 10 números por teclado y que los almacene en un array.
            A continuación se mostrará el contenido de ese array junto al índice (0 – 9)


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introdice el numerp");
            int numeroIntroducido = scanner.nextInt();
            numeros[i] = numeroIntroducido;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("El numero en la posicion" +
                    " %d es %d\n",i,numeros[i]);
        }


             */
        //Ejercicio2
            /*
            2. Crear un programa que genere 30 números aleatorios entre 0 - 10 y los guarde en un array.
            Una vez metidos, se deberá mostrar:
            - Numero de puntos obtenidos
            - Media de puntos obtenidos


    public static void main(String[] args) {
        int [] array=new int[30];
        int suma=0;
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*11);
            suma+=array[i];
        }

        double media=(double) suma/30;

        System.out.println("Numeros obtenidos: "+Arrays.toString(array));
        System.out.println("Suma: "+suma);
        System.out.println("Media: "+media);


    }

             */


    //ARRAYLIST
        //Ejercicio1
            /*
            1. Crea un ArrayList de String y realiza las siguientes acciones
                - Guarda manualmente 10 palabras
                - Imprime por pantalla todas las palabras del arraylist


    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");
        arrayList.add("hi");

        System.out.println("ArrayList: "+arrayList);



    }

             */
        //Ejercicio 2
            /*
    Crea un ArrayList de numeros enteros que guarde valores aleatorios (entre 0 y 100).
    Una vez introducidos todos calcula la suma, la media, el máximo y el mínimo de esos números.


    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();

        for (int i=0;i<10;i++){
            int numAleatorio=(int)(Math.random()*101);
            arrayList.add(numAleatorio);
        }

        int suma=0;
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for (int num : arrayList) {
            suma += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Calcular la media
        double media = (double) suma / arrayList.size();

        // Imprimir los resultados
        System.out.println("Números generados: " + arrayList);
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

             */
}


