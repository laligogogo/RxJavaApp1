package com.jiang.android.rxjavaapp.activity;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

import com.jiang.android.rxjavaapp.R;
import com.jiang.android.rxjavaapp.base.BaseActivity;
import com.jiang.android.rxjavaapp.database.alloperators;
import com.jiang.android.rxjavaapp.database.operators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ren on 2017/5/3.
 */

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private static final int REQUEST_STORAGE = 1010;
    private Toolbar toolbar;
    private LinearLayout mHeadView;

    RecyclerView mNavRecyclerView;
    BaseAdapter mAdapter;
    BaseAdapter mContentAdapter;
    private int checkedPosition = 0;

    private List<operators> mList = new ArrayList<>();
    private List<alloperators> mContentLists = new ArrayList<>();
    private RecyclerView mContentRecyclerView;
    private ArrayList<String> photos;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void initViewsAndEvents() {

        initToolBar();
        initNavigationView();
        //initNavRecycerView();
    }


    private void initNavigationView() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        mHeadView = (LinearLayout) navigationView.getHeaderView(0);
        mNavRecyclerView = (RecyclerView) navigationView.getHeaderView(0).findViewById(R.id.index_nav_recycler);
        mHeadView.setClickable(true);
        mHeadView.setOnClickListener(this);

    }

    private void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.common_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected int getContentViewLayoutID() {
        return 0;
    }


    @Override
    public void onClick(View v) {

    }

}
