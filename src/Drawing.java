public class Drawing {
    private static Drawing instance;
    private Drawing(){
        
    }


    public static Drawing getInstance(){
        if (instance == null){
            instance = new Drawing();
        }
        return instance;
    }
    
    public void drawShape(Shape s){
        System.out.println("Drawing a " + s.getClass().getSimpleName() +  " with color: " + s.color + " and area " + s.calculateArea());
    }

}
