package Objects;

public class MovableObject {
    int xPos,yPos;      // the origin point of the object
    int extend;         // the ammout the sprite extends past the original cord
    int xSpeed, ySpeed; // the directino that the object is going in
    int speed = 10;     // default speed
    int health;         // the health of the object


    // the default constructor for the class
    public MovableObject(int xP, int yP, int e, int h ){
        xPos = xP;
        yPos = yP;
        extend = e;
        health = h;

    }
    //this function moves the object
    public void move() {
        xPos += xSpeed;
        yPos += ySpeed;
    }
    //this funciton changes the speed based on a string input to be called by main
    public void changeDirection(String dir){
        if (dir == "left"){
            xSpeed = -(speed);
            ySpeed = 0;
        }
        if(dir == "right"){
            xSpeed = speed;
            ySpeed = 0;
        }
        if (dir == "up"){
            xSpeed = 0;
            ySpeed = speed;
        }
        if(dir == "down"){
            xSpeed = 0;
            ySpeed = -(speed);
        }

    }
    //checks collision with the bullet
    public void colCheck(Bullet bullet){
        // checks if the bullet xPos is within the moving object yPos + extend
        if (bullet.xPos >= this.xPos && bullet.xPos <= this.xPos+this.extend){
            //checks if the bullet yPos is within the moving object yPos + extend
            if(bullet.yPos >= this.yPos && bullet.yPos <= this.yPos+this.extend)
                this.takeDamage();
            //checks if the bullet yPo+extends is within the moving object yPos
            else if(bullet.yPos+bullet.extend >= this.yPos && bullet.yPos+bullet.extend <= this.yPos+this.extend)
                this.takeDamage();

        }// checks if the bullet xPos + extend is within the moving object yPos
        else if (bullet.xPos+bullet.extend >= this.xPos && bullet.xPos+bullet.extend <= this.xPos){
            if(bullet.yPos >= this.yPos && bullet.yPos <= this.yPos+this.extend)
                this.takeDamage();
            if(bullet.yPos+bullet.extend >= this.yPos && bullet.yPos+bullet.extend <= this.yPos+this.extend)
                this.takeDamage();
        }

    }
    //decreaces the health and deletes the object if needed
    public void takeDamage(){
        health -= 1;
        if (this.health <= 0){
            //deletes the object
            this = null;
        }
    }



}