void main (){
    List<Product> products = DatosPrueba.PRODUCTS;
    products.stream().forEach(System.out::println);
    products.stream().forEach(p->System.out.println(p.nombre()));
    products.stream().filter(p->p.precio()>300).forEach((System.out::println));
    products.stream().filter(p->p.stock()>0).filter(p->p.precio()>300).forEach(System.out::println);
    products.stream().map(x-> x.nombre() + "-Q " + x.precio() ).forEach(System.out::println);


    System.out.println("generar Una Lista de Nombres de Productos que Tengan los Nombres en Mayuscula");
    products.stream()
            .filter(p->p.stock()>0)
            .map(p->p.nombre().toUpperCase()).sorted().forEach(System.out::println);

    System.out.println("generar Una Lista de Nombres de Productos que Tengan los Nombres en Mayuscula");


}