public class CalculadoraInterface implements interfaceOperacaoMat {
    
    @Overside // OVERSIDE--> FORMA DE GARANTIR QUE VOCÊ ESTA SOBREESCREVENDO UM MÉTODO E NÃO CRIANDO UM NOVO.
    public void soma(double operando1, double operando2perando2){
        System.out.println("A soma é:" operando1 + operando2);
    }
    @Overside 
        public void subtracao(double operando1, double operando2perando2){
            System.out.println("A Subtração é:" operando1 - operando2);

    }
    @Overside 
    public void multiplicacao(double operando1, double operando2perando2){
        System.out.println("A multiplicação é:" operando1 * operando2);
    
}   @Overside 
    public void divisão(double operando1, double operando2perando2){
    System.out.println("A soma é:" operando1/operando2);
}
}
