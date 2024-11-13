class carro{
   int capacidadeTanque;
   String modelo;
   String cor;
   
   carro() {

   }

    carro(String cor, String modelo, int capacidadeTanque){
    this.cor=cor;
    this.modelo=modelo;
    this.capacidadeTanque=capacidadeTanque;
   }

   void setCor(String cor){
       this.cor=cor;
   }
   
   String getCor(){
    return cor;
   }
void setModelo(String modelo){
    this.modelo=modelo;
}

 String getModelo(){
    return modelo;
 }

  void setcapacidadeTanque(int capacidadeTanque){
    this.capacidadeTanque= capacidadeTanque;
  }
  int getcapcidadeTanque(){
    return capacidadeTanque;
  }
    
   double totalValorTanque (double ValorCombustivel){
      return capacidadeTanque * ValorCombustivel;
   }

    }
