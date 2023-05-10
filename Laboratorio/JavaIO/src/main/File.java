package main;

import java.io.*;
import java.util.ArrayList;

public class File {

    public void writeFile(Employee employee) {
        // Import class for write
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Receive the file name
            os = new FileOutputStream("Employee.txt", true);

            // show what file we're writing
            osw = new OutputStreamWriter(os);

            // for write in file
            bw = new BufferedWriter(osw);

            // writing in file
            bw.write("++ EMPLOYEE ++" + "\n");
            bw.write(employee.getName() + "\n");
            bw.write( employee.getSalary() + "\n");
            bw.write(employee.getAge() + "\n");
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Employee> readFile() {
        // Creating arrayList that save the Employee in file
        ArrayList<Employee> foundInFile = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String readLine; // var aux to read information

        try {
            is = new FileInputStream("Employee.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Positioning the cursor at the beginning of the file
            readLine = br.readLine();

            // Checking and running the code while having information in the .txt
            while (readLine != null) {
                if (readLine.contains("++ FUNCIONARIO ++")) {

                    // filling in employee information
                    String name = br.readLine();
                    double salary = Double.parseDouble(br.readLine());
                    int age = Integer.parseInt(br.readLine());

                    // Creating an employee helper object
                    Employee auxEmployee = new Employee(name, salary, age);

                    // Adding employee to arrayList
                    foundInFile.add(auxEmployee);
                }
            }
        } catch (Exception e) {

        }
        return foundInFile;
    }
}
