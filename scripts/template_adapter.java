public class #Template_Class#Adapter extends BaseAdapter {

    private List<#Template_Class#Data> lists;
    private Context context;


    public #Template_Class#Adapter(List<#Template_Class#Data> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.[Template_layout], null);
            holder = new ViewHolder();
            //holder.[XXX] = (TextView) convertView.findViewById(R.id.[XXX]);
                
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        
        //holder.[XXX].setText(lists.get(position).get[XXX]());
       
        return convertView;
    }
    
    public static class ViewHolder{
        //TextView [XXX];
        
    }

}