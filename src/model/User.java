package model;


public abstract class User {
    // Las clases abstractas no las podemos instanciar.
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

   public User(String name, String email) {
        this.name = name;
        this.email = email;
   }

   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public String getName() {
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
   public String getEmail() {
       return email;
   }
   public void setEmail() {
       this.email = email;
   }
   public String getAddress () {
       return address;
   }
   public void setAddress (String address){
       this.address = address;
   }
   public String getPhoneNumber () {
       return phoneNumber;
   }
   public void setPhoneNumber (String phoneNumber){
       if (phoneNumber.length() != 10){
           System.out.println("El número telefónico debe ser de 8 dígitos.");
       } else if (phoneNumber.length() == 10) {
           this.phoneNumber = phoneNumber;
       }
   }

   // Aquí es como aplicamos polimorfismo al metodo de la clase padre.
    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email +
                ", \n Address: " + address + ", Phone Number: " + phoneNumber;
    }

   public abstract void showDataUser();

}
