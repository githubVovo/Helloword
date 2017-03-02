package com.zyh.vovo.base;


import rx.subscriptions.CompositeSubscription;

/**
 * Created by DELL-002 on 2017/3/1.
 */

public abstract class BasePresenter<V> {
    protected V mView;
    protected CompositeSubscription mCompositeSubscription = new CompositeSubscription();

    public void setView(V v) {
        this.mView = v;
        this.onAttached();
    }

    public abstract void onAttached();

    public void onDetached() {
        mCompositeSubscription.unsubscribe();
    }
}