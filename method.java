class method {

    static void checkNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Negative number not allowed");
        }

        System.out.println("Number: " + num);
    }

    public static void main(String[] args) {

        try {
            checkNumber(-5);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("I'm inevitable");
        }
    }
}