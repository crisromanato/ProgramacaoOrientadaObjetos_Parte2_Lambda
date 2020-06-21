package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ExpressaoLambda.Case1.entities;

public class ProductExpLambda {
    private String name;
    private Double price;

    public ProductExpLambda () {
    }

    public ProductExpLambda (String name, Double price) {
        this.name  = name;
        this.price = price;
    }

    public String getName () {

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public Double getPrice () {

        return price;
    }

    public void setPrice (Double price) {

        this.price = price;
    }

    @Override
    public String toString () {

        return "Product [name= " + name + ", price=" + price + "]";
    }


}
