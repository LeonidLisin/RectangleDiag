public class Rectangle {
    double x1, x2, y1, y2, area;
    Rectangle(double x1, double y1, double x2, double y2){
        // соортируем координаты по оси x по возрастанию
        if (x1<=x2){
            this.x1 = x1;
            this.x2 = x2;
        }
        else {
            this.x1 = x2;
            this.x2 = x1;
        }
        // соортируем координаты по оси y по возрастанию
        if (y1<=y2){
            this.y1 = y1;
            this.y2 = y2;
        }
        else {
            this.y1 = y2;
            this.y2 = y1;
        }

    }

    double getArea(){
        area = (x2-x1)*(y2-y1);
        return area;
    }
}
