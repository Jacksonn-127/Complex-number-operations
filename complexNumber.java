public class complexNumber {
    // complex numbers are comprised of some values such as 5 + 10i or can be stored as [5, 10] where 5 is real and 10 is imaginary structure of class follows this
    private double real; // real, instantiate variables
    private double imaginary; // imaginary

    public complexNumber(int Num1, int Num2){ // assign variables new values
        this.real = Num1;
        this.imaginary = Num2;
    }

    // all 4 methods follow the methodology similar to
    // 1. create new complex number with arbitrary values
    // 2. perform computation to find real value, set sum value
    // 3. perform computation to find imaginary value, set sum value
    // 4. return resulting value
    public complexNumber add(complexNumber cNum1, complexNumber cNum2){
        complexNumber sum = new complexNumber(-1, -1); // creates a place to store the real and imaginary number

        sum.real = cNum1.real + cNum2.real; // add real numbers of the complex numbers, set result.real = this
        sum.imaginary = cNum1.imaginary + cNum2.imaginary; // add imaginary numbers

        return sum; // return real and imaginary result
    }

    public complexNumber subtract(complexNumber cNum1, complexNumber cNum2){
        complexNumber remainder = new complexNumber(-1, -1); // pass in 0 for arguments, same methodology as addition
        remainder.real = cNum1.real - cNum2.real; // form is as easy as subtract real from real and imaginary from imaginary
        remainder.imaginary = cNum1.imaginary - cNum2.imaginary; // formula is subtract imaginary from imaginary

        return remainder;
    }

    public complexNumber multiplication(complexNumber cNum1, complexNumber cNum2){
        complexNumber product = new complexNumber(-1, -1);
        // looked up formula on Google for multiplying and dividing complex numbers
        // source: https://www.cuemath.com/numbers/multiplying-complex-numbers/
        product.real = cNum1.real * cNum2.real - cNum1.imaginary * cNum2.imaginary;
        product.imaginary = cNum1.real * cNum2.imaginary + cNum1.imaginary * cNum2.real;

        return product;
    }

    public complexNumber division(complexNumber cNum1, complexNumber cNum2){
        complexNumber quotient = new complexNumber(-1, -1);
        if(cNum2.real * cNum2.real + cNum2.imaginary * cNum2.imaginary == 0){ // check if denominator is 0 if so return 0 0 and a message letting user know that you cannot divide by 0
            System.out.println("Denominator is 0, Cannot divide by 0.");
            return new complexNumber(0 ,0);
        }

        // formula according to https://www.cuemath.com/numbers/division-of-complex-numbers/ is
        // real = (ac + bd) / (c^2 + d^2)
        // imaginary = (bc - ad) /(c^2 + d^2)i
        // Where a & b are components of complex number 1 and cd are components of complex number 2
        // could create local denominator variable, however I chose not to here, better space complexity :)

        quotient.real = (cNum1.real * cNum2.real + cNum1.imaginary * cNum2.imaginary) / (cNum2.real * cNum2.real + cNum2.imaginary * cNum2.imaginary);
        quotient.imaginary  = (cNum1.imaginary * cNum2.real - cNum1.real *cNum2.imaginary) / (cNum2.real * cNum2.real + cNum2.imaginary * cNum2.imaginary);

        return quotient;
    }

    public void printComplexNum(){
        // temp, print if needed
        String additionSign = "";

        // if imaginary is positive, function does not print correctly, check if imaginary number is positive if so print a +, if not imaginary number will automatically print a negative sign
        if(this.imaginary >= 0) {
            additionSign = "+ ";
        }

        // display output result of function called
        System.out.println(this.real + " " + additionSign + this.imaginary + "i");

    }
}
