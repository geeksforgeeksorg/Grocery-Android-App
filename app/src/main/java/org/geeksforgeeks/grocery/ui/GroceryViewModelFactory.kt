package org.geeksforgeeks.grocery.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.geeksforgeeks.grocery.data.repo.GroceryRepository

class GroceryViewModelFactory(private val repository: GroceryRepository):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GroceryViewModel(repository) as T
    }
}