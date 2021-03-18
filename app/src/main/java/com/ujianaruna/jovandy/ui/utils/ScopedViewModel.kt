package com.ujianaruna.jovandy.ui.utils

import androidx.annotation.CallSuper
import androidx.lifecycle.ViewModel
import com.ujianaruna.jovandy.ui.utils.Scope
import kotlinx.coroutines.CoroutineDispatcher

abstract class ScopedViewModel(uiDispatcher: CoroutineDispatcher) : ViewModel(),
    Scope by Scope.Impl(uiDispatcher) {

    init {
        initScope()
    }

    @CallSuper
    override fun onCleared() {
        destroyScope()
        super.onCleared()
    }
}