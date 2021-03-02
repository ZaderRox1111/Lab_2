package package_2;

public class FahrenheitToCelsius
   {
      
      // Create the constants for the table
      private static final char THIN_LINE = '-';
      private static final char THICK_LINE = '=';
      private static final char PIPE = '|';
      private static final String PIPE_SPACE = "| ";
      private static final String SPACE_PIPE = " |";
      private static final String SPACE_PIPE_SPACE = " | ";
      
      // Table values
      private static final int TWO_ENDLINES = 2;
      private static final int TWO_PIPES = 2;
      private static final int TWO_SPACES = 2;
      private static final int TABLE_WIDTH = 60;
      private static final int TITLE_WIDTH = 32;
      private static final int LEFT_COLUMN_WIDTH = 40;
      private static final int RIGHT_COLUMN_WIDTH = 17;
      
      // Conversion constants
      private static final double F_TO_C_OFFSET = 32;
      private static final double F_TO_C_FACTOR = 5.0/9.0;
      private static final int PRECISION = 3;

      public static void main(String[] args)
         {
            // TODO Auto-generated method stub

            // Initialize console_IO class so that we may use it
            Console_IO_Class conIO = new Console_IO_Class();
            
            // Create the variables that we need
            double fahrenheit, celsius;
            
            // Create the title
            conIO.printString("FAHRENHEIT TO CELSIUS CONVERSION");
            conIO.printEndline();
            conIO.printChars(TITLE_WIDTH ,THICK_LINE);
            
            conIO.printEndlines(TWO_ENDLINES);
            
            // Get the input
            fahrenheit = conIO.promptForDouble("Enter Fahrenheit Value: ");
            
            conIO.printEndline();
            
            // Do the Calculations
            celsius = ( fahrenheit - F_TO_C_OFFSET ) * F_TO_C_FACTOR; 
            
            // Table
            // Top border
            conIO.printChar(PIPE);
            conIO.printChars(TABLE_WIDTH - TWO_PIPES, THICK_LINE);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
            // First row
            conIO.printString(PIPE_SPACE);
            conIO.printString("FAHRENHEIT", LEFT_COLUMN_WIDTH - TWO_SPACES, "LEFT");
            conIO.printString(SPACE_PIPE_SPACE);
            conIO.printDouble(fahrenheit, PRECISION, RIGHT_COLUMN_WIDTH - TWO_SPACES, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
            
            conIO.printChar(PIPE);
            conIO.printChars(LEFT_COLUMN_WIDTH, THIN_LINE);
            conIO.printChar(PIPE);
            conIO.printChars(RIGHT_COLUMN_WIDTH, THIN_LINE);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
            // Second row
            conIO.printString(PIPE_SPACE);
            conIO.printString("CELSIUS", LEFT_COLUMN_WIDTH - TWO_SPACES, "LEFT");
            conIO.printString(SPACE_PIPE_SPACE);
            conIO.printDouble(celsius, PRECISION, RIGHT_COLUMN_WIDTH - TWO_SPACES, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
            
            conIO.printChar(PIPE);
            conIO.printChars(LEFT_COLUMN_WIDTH, THICK_LINE);
            conIO.printChar(PIPE);
            conIO.printChars(RIGHT_COLUMN_WIDTH, THICK_LINE);
            conIO.printChar(PIPE);
            conIO.printEndline();
            
            // End Program
            conIO.printEndline();
            conIO.printString("End Program");
            
            
         }

   }
