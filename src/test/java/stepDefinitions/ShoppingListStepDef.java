package stepDefinitions;

import java.util.List;

import core.TestBase;
import cucumber.api.java8.En;
import io.cucumber.datatable.DataTable;

public class ShoppingListStepDef implements En {

	public static List<List<String>> list;
	
	TestBase Page = new TestBase();

	public ShoppingListStepDef() {
		Before(() -> {
			Page.launchApp();
		});
		// Validating Add List and Add Items Feature

		Given("Launch the application and Navigates to Home screen", () -> {
			Page.ChooseLayout();
		});

		When("User select New list and Create the new lists", (DataTable listname) -> {
			List<List<String>> list=listname.asLists();
			Page.addingList(list.get(0).get(0));
			Page.addingList(list.get(0).get(1));
			

		});

		And("Select a list and Add new list items", (DataTable itemsname) -> {

			list = itemsname.asLists(String.class);
			for (int i = 1; i < list.size(); i++) {
				List<String> listItems = list.get(i);
				Page.selectList(listItems.get(0));
				System.out.println("List HeaderName : " + listItems.get(0));

				for (int j = 1; j < listItems.size(); j++) {
					Page.addItems(listItems.get(j));
					System.out.println("Added Item:" + listItems.get(j));
				}
			}

		});

		Then("Delete an item from the list", (DataTable listname) -> {
			List<List<String>> list=listname.asLists();
			Page.selectList(list.get(0).get(1));
			Page.deleteItems();
		});

		// Validating Sorting List items Functionality

		And("Select the list and Sort the list", (DataTable listname) -> {
			List<List<String>> list=listname.asLists();
			Page.sortItems(list.get(0).get(1));
		
		});

		Then("Validate the sorted list", (DataTable listname) -> {
			List<List<String>> list=listname.asLists();
			Page.selectList(list.get(0).get(1));
			Page.validateList(list.get(0).get(1));
			
		});

	}
}
