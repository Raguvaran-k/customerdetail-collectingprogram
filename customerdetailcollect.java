package Data;

//customercode, name, email, phone, customertype, dob, countryofoperation, basecurrency, bankacctno, bankbranch, bankname
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//customercode,name,email,phone,customertype,dob,countryofoperation,basecurrency,bankacctno,bankbranch,bankname
import java.util.Scanner;

public class customerdetailcollect {
	public static void main(String[] args) {
		customerdetailcollect v = new customerdetailcollect();
		v.Detail();
	}

	public void Detail() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter your customer detail");
		String name = sc.nextLine();
		System.out.println(name);
		String[] arr = name.split(",");
		System.out.println(Arrays.toString(arr));
		if (arr.length != 11) {
			System.out.println("IndexoutofBountException");
			Detail();

		} else {

			System.out.println("continue");

		}

		System.out.println("enter your address");
		String adrs1 = sc.nextLine();
		String[] addr = adrs1.split(",");
		System.out.println(Arrays.toString(addr));
		if (addr.length != 6) {
			System.out.println("IndexoutofBountException");
			Detail();

		} else {

			System.out.println("continue");
		}
		System.out.println("enter your address");
		String adrs2 = sc.nextLine();
		String[] add = adrs2.split(",");
		System.out.println(Arrays.toString(add));
		if (adrs2.equals("no")) {

			System.out.println(name);
			HashMap<String, String> customer = new HashMap<String, String>();
			customer.put(adrs1, adrs2);
			HashMap<String, HashMap<String, String>> cus = new HashMap<String, HashMap<String, String>>();
			cus.put(name, customer);
			System.out.println("hashmap" + cus);
	
		}else {
  

		if (add.length != 6) {
			System.out.println("IndexoutofBountException");
			Detail();

		} else {

			System.out.println("continue");
		}

		HashMap<String, String> customer = new HashMap<String, String>();
		customer.put(adrs1, adrs2);
		HashMap<String, HashMap<String, String>> cus = new HashMap<String, HashMap<String, String>>();
		cus.put(name, customer);
		System.out.println("hashmap" + cus);

	}
}
}