package pojo;


import java.util.List;

public class Items {

    private List<Movie> items;
    private String errorMessage;

    public Items(List<Movie> items, String errorMessage) {
        this.items = items;
        this.errorMessage = errorMessage;
    }

    public Items() {
    }

    public List<Movie> getItems() {
        return items;
    }

    public void setItems(List<Movie> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Items{" +
                "items=" + items +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}

