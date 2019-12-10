package com.company;

import com.company.companies.Company;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company("ACA", "Armenia/Yerevan/Hakob Hakobyan/3", 30, "https://www.google.ru/maps/@40.1801216,44.5202432,13z", "https://www.aca.am");
        Company company2 = new Company("Amazon", "USA/Washingthon/Seattle", 15, "https://www.google.ru/maps/@40.1801216,44.5202432,13z", "https://www.amazon.com");
        Company company3 = new Company("ZCMC", "Armenia/Syunik/Kajaran/Lernagorcneri/18", 5000, "https://www.google.ru/maps/@40.1801216,44.5202432,13z", "https://www.zcmc.am");
        Company company4 = new Company("Ameria Bank", "Armenia/Yerevan/Vazgen Sargsyan/2", 695, "https://www.google.ru/maps/@40.1801216,44.5202432,13z", "https://ameriabank.am");
        Company company5 = new Company("Team Viewer", "Germany/Stuttgart", 800, "https://www.google.ru/maps/@40.1801216,44.5202432,13z", "https://www.teamviewer.com");

        HashMap<String, Company> company = new HashMap<>();
        company.put(company1.getName(), company1);
        company.put(company2.getName(), company2);
        company.put(company3.getName(), company3);
        company.put(company4.getName(), company4);
        company.put(company5.getName(), company5);

        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.nextLine();
        if (company.containsKey(companyName)) {
            company.get(companyName).printCompanyData();
        } else {
            System.out.println("We have not this company in our archive");
        }
    }
}