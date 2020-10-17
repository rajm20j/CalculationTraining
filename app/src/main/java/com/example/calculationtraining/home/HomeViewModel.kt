package com.example.calculationtraining.home

import androidx.lifecycle.ViewModel
import com.example.calculationtraining.data.Repository
import io.reactivex.disposables.CompositeDisposable

class HomeViewModel(private val repository: Repository): ViewModel() {
    private val disposable = CompositeDisposable()

    override fun onCleared() {
        disposable.clear()
    }
}