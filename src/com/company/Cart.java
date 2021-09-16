package com.company;
import java.util.ArrayList;
public class Cart {
    private  ArrayList<Item> cart ;
    Cart()
    {
        cart = new ArrayList<>();
    }
    public void addItem(String name , float price)
    {
        this.cart.add(new Item(name,price));
    }
    public void removeItem(String name, float price)
    {
        for(int i = 0; i < cart.size(); i++)
        {
            if (cart.get(i).getName()==name)
            {
                cart.remove(i);
            }
        }
        System.out.println(name);
    }
    public void sumPrice ()
    {
        float sum = 0;
        for(int i = 0; i < cart.size();i++)
        {
            sum += cart.get(i).getPrice();
        }
        System.out.println("Сумма: " + sum);
    }
    public void upPrice(float percent)
    {
        float sum =0;
        for(int i = 0; i < cart.size();i++)
        {
            cart.get(i).upPrice(percent);
            sum += cart.get(i).getPrice();
        }
        System.out.println("Сумма увеличенная: " + sum);
    }
    public void downPrice(float percent)
    {
        float sum =0;
        for(int i = 0; i < cart.size();i++)
        {
            cart.get(i).downPrice(percent);
            sum += cart.get(i).getPrice();
        }
        System.out.println("Конечная сумма: " + sum);
    }

}
