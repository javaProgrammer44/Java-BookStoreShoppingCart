package com.pluralsight;

import java.util.Objects;

public class CartItem
{
    private Book book;
    private int quantity;

    public  CartItem(int bookId){
        this.book = new Book(bookId);
    }
    public CartItem(Book book, int quantity)
    {
        this.book = book;
        this.quantity = quantity;
    }

    public int getId(){
        return book.getId();
    }

    public String getTitle()
    {
        return book.getTitle();
    }

    public String getAuthor()
    {
        return book.getAuthor();
    }

    public float getPrice()
    {
        return book.getPrice();
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public float getTotalCost()
    {
        return book.getPrice() * this.quantity;
    }

    @Override
    public String toString()
    {
        return "CartItem{" +
                "book=" + book +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(book, cartItem.book);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(book);
    }
}
