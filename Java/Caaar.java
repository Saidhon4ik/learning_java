public class Caaar {
    private String model;
    private String color;
    private int price;


    Caaar(String model, String color, int price)
    {
        this.model = model;
        this.color = color;
        this.price = price;
    }




    //GETTER makes field readable
    //here we are trying to get pass through the 'private' restriction, as without getter you are not 
    //allowed to use any of those variables from that class
    //but this way we are creating sorta way out
    String getModel()
    {
        return this.model;
    }
        String getColor()
    {
        return this.color;
    }
        int getPrice()
    {
        return this.price;
    }




    //SETTER makes field writable
    //basically we are restricting people from changing that car's model or price, for now.
    // but we are leaving an option to paint the car... we are 'ordering' in that line
    //that model we gave in the beginning shall not be touched
    void setColor(String model)
    {
        this.model = model;
    }
        void setPrice(int price)
    {
        this.price = price;
    }
}

//we could have added 'if-statement' but why should we now, XD. 
// by if statement i meant if price < 0 --> error