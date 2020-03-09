
public class score {
	class Background extends Layer {        
		 
        @Override
        public void draw(GraphicsContext graphicsContext, double x, double y, double width, double height) {
        	//  to set the background color black
        	graphicsContext.setFill(Color.BLACK);
            // to change the size
            graphicsContext.fillRect(0, 0, width, height);
            // to set the text color 
            graphicsContext.setFill(Color.WHITE);
            // to set the font for the text
            graphicsContext.setFont(Font.font('OCR A Std', 20));
            // to set the score as 10 points every single time the alien is hit
            graphicsContext.fillText('SCORE<1>    HI-SCORE    SCORE<2>', 10, 10);
            // to set the high score and update the score
            graphicsContext.fillText('' + score + '            10000   ', 10, 20);// for the last layer it's 20 points
            // shows the score after finishing the first layer and the second layer
            graphicsContext.fillText(message, 100, 250);
            // for the count of the aliens destroyed in each layer
            graphicsContext.fillText('' + 3 + '                   CREDIT ' + 1, 10, 680);
            
            // to set the color for the aliens 
            graphicsContext.setFill(Color.GREEN);
            
            //final score for all the aliens killed
            graphicsContext.fillRect(10,300, 300, 3);
        }
}
