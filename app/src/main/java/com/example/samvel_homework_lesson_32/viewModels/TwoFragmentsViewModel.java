package com.example.samvel_homework_lesson_32.viewModels;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TwoFragmentsViewModel extends ViewModel {
    private final MutableLiveData<String> messageContainerA = new MutableLiveData<>();
    private final MutableLiveData<String> messageContainerB = new MutableLiveData<>();

    public void sendMessageToA(String msg){
        messageContainerA.setValue(msg);
    }

    public void sendMessageToB(String msg){
        messageContainerB.setValue(msg);
    }

    public LiveData<String> getMessageContainerA() {
        return messageContainerA;
    }

    public LiveData<String> getMessageContainerB(){
        return messageContainerB;
    }
}
