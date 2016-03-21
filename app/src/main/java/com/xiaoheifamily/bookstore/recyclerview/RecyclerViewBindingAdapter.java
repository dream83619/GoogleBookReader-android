package com.xiaoheifamily.bookstore.recyclerview;

import android.databinding.BindingAdapter;
import android.databinding.ObservableList;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;

import com.xiaoheifamily.bookstore.adapter.ObservableRecyclerViewAdapter;

@SuppressWarnings("unused")
public class RecyclerViewBindingAdapter {

    @SuppressWarnings("unchecked")
    @BindingAdapter(value = {"items", "itemLayout", "itemBindVariable", "layoutManager"}, requireAll = false)
    public static <T> void setAdapter(RecyclerView recyclerView,
                                      ObservableList<T> items,
                                      @LayoutRes int itemLayout,
                                      int itemBindVariable,
                                      LayoutManagers.LayoutManagerFactory layoutManagerFactory) {

        recyclerView.setAdapter(new ObservableRecyclerViewAdapter<>(items, itemLayout, itemBindVariable));
        recyclerView.setLayoutManager(layoutManagerFactory.create(recyclerView));
    }
}