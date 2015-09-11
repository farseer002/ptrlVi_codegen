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
public void initPullToRefreshListView(PullToRefreshListView ptrlVi, #Template_Class#Adapter adapter) {
    ptrlVi.setMode(Mode.DISABLED);
    // rtflv.setOnRefreshListener(new MyOnRefreshListener2(ptrlVi));
    ptrlVi.setAdapter(adapter);
}