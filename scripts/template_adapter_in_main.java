private PullToRefreshListView ptrlVi_#Template_Class_Lower#;

ptrlVi_#Template_Class_Lower# = (PullToRefreshListView) findViewById(R.id.ptrlVi_#Template_Class_Lower#);
#Template_Class_Lower#Adapter = new #Template_Class#Adapter(#Template_Class_Lower#_s,this);
initPullToRefreshListView(ptrlVi_#Template_Class_Lower#, #Template_Class_Lower#Adapter);
fetchData();
ptrlVi_#Template_Class_Lower#.setAdapter(#Template_Class_Lower#Adapter);
        


public void fetchData(){
    for(int i=0;i<10;++i){
        #Template_Class_Lower#_s.add(new #Template_Class#Data());
    }
}
public void initPullToRefreshListView(PullToRefreshListView ptrlVi) {
    ptrlVi.setMode(Mode.DISABLED);
    // rtflv.setOnRefreshListener(new MyOnRefreshListener2(ptrlVi));
}


<com.handmark.pulltorefresh.library.PullToRefreshListView
            xmlns:ptr="http://schemas.android.com/apk/res-auto"
            android:id="@+id/ptrlVi_#Template_Class_Lower#"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:background="#ffffff"
            android:divider="@null"
            android:fadingEdge="none"
            android:fastScrollEnabled="false"
            android:footerDividersEnabled="false"
            android:headerDividersEnabled="false"
            android:scrollbars="@null"
            android:smoothScrollbar="true"
            ptr:ptrAnimationStyle="flip" />