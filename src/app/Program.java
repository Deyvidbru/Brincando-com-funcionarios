package app;

import java.util.Locale;
import java.util.Scanner;
import model.Empresa;
import model.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empresa empresa = new Empresa();
		
		System.out.println("Welcome to the company " + empresa.getNome() + ". Our cnpj is " + empresa.getCnpj() + ". Your job is to add new employees, and then perform raise for one of them. Your choices will be shown at the end!");
		System.out.println();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			System.out.println();
			Funcionario func = new Funcionario(id, nome, salario);
			empresa.addFuncionario(func);
		}
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		if(empresa.funcionarioExistente(id)) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empresa.idVerificado(percentage, id);
		}else {
			System.out.println("This id does not exist!");
		}
		System.out.println();
	
		System.out.println("List of employees: ");
		for(Funcionario func : empresa.getFuncionario()) {
			System.out.println(func);
		}
		sc.close();
	}

}
