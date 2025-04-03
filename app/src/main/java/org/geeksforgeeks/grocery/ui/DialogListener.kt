package org.geeksforgeeks.grocery.ui
import org.geeksforgeeks.grocery.data.local.GroceryItems

interface DialogListener {

    // Create a function to add items
    // in GroceryItems on clicking
    fun onAddButtonClicked(item: GroceryItems)
}