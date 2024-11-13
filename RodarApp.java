ublic class RodarApp {

    public static void main(String[] args) {
          //CONSTRUTOR
        carro carro2= new carro();

        carro2.setCor("Preto");
        carro2.setModelo("MERCEDES GM3");
        carro2.setcapacidadeTanque(59);

        System.out.println(carro2.getCor());

        System.out.println(carro2.getModelo());

        System.out.println(carro2.getcapcidadeTanque());

        System.out.println(carro2.totalValorTanque(6.39));

       // EXPLORANDO A SOBRECARGA DO CONSTRUTOR
        carro carro3= new carro("Cinza", "BMW X6",  65);

        System.out.println(carro3.getCor());

        System.out.println(carro3.getModelo());

        System.out.println(carro3.getcapcidadeTanque());

        System.out.println(carro3.totalValorTanque(6.59));
    
     }
