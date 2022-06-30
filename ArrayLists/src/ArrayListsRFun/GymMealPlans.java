package ArrayListsRFun;

import java.util.ArrayList;

public class GymMealPlans {

	public static void main(String[] args) {
		ArrayList MealPlans = new ArrayList();
		MealPlans.add("Chicken and Rice");
		MealPlans.add("Steak and Potatoes");
		MealPlans.add("Salmon and Couscous");
		MealPlans.add("Tuna pasta");
		MealPlans.add("Chicken wrap");
		System.out.println(MealPlans);
		
		MealPlans.remove("Chicken wrap");
//		MealPlans.clear();
		System.out.println(MealPlans);
		
		System.out.println(MealPlans.contains("Burger and Chips"));
		System.out.println(MealPlans.contains("Chicken and Rice"));
	}

}
