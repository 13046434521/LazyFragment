package com.t.lazyfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.socks.library.KLog;

/**
 * 作者：龙昊
 * 日期：2018/5/6 10:50
 * 描述：
 */
public class Page3Fragment extends BaseFragment {
    private static final String params = "params1";
    private String title;
    private TextView textView;

    public static Page3Fragment newInstance(String title) {
        Page3Fragment pageFragment = new Page3Fragment();

        Bundle bundle = new Bundle();
        bundle.putString(params, title);
        pageFragment.setArguments(bundle);
        return pageFragment;
    }

    @Override
    public void setInitialSavedState(@Nullable SavedState state) {
        super.setInitialSavedState(state);
        KLog.i("lazyFragment","Page3"+"---方法---setInitialSavedState");
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        KLog.i("lazyFragment","Page3"+"---方法---setUserVisibleHint---状态："+isVisibleToUser);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        KLog.i("lazyFragment","Page3"+"---方法---onHiddenChanged---状态："+hidden);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        KLog.i("lazyFragment","Page3"+"---方法---onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            title = getArguments().getString(params);
        }
        KLog.i("lazyFragment","Page3"+"---方法---onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        textView = view.findViewById(R.id.tv_page_test);

        KLog.i("lazyFragment","Page3"+"---方法---onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        KLog.i("lazyFragment","Page3"+"---方法---onActivityCreated");
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        KLog.i("lazyFragment","Page3"+"---方法---onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        KLog.i("lazyFragment","Page3"+"---方法---onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        KLog.i("lazyFragment","Page3"+"---方法---onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        KLog.i("lazyFragment","Page3"+"---方法---onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        KLog.i("lazyFragment","Page3"+"---方法---onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        KLog.i("lazyFragment","Page3"+"---方法---onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        KLog.i("lazyFragment","Page3"+"---方法---onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        KLog.i("lazyFragment","Page3"+"---方法---onDetach");
    }

    @Override
    public void Initialize() {
        Log.d("lazyFragmentTest","Page3");
        textView.setText(title);
    }

    ///////////////////////////////////////////////////////////////////////////
    // 私有方法
    ///////////////////////////////////////////////////////////////////////////

}
