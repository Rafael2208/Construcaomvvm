package com.example.testemvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> mHello = new MutableLiveData<>();
    public LiveData<String> hello = mHello;

    public MainViewModel(){
        this.mHello.setValue("Construindo estrutura MVVM");
    }
}
