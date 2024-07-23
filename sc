public class Linearsearch {
    public static void main(Integer key){
        System.debug('Linear Search');
        integer s=-1;
        list<Integer> lon = new List<Integer>();
        lon.add(3);
        lon.add(4);
        lon.add(5);
        lon.add(6);
        System.debug('List: '+lon);
        for(Integer i=0;i<lon.size();i++){
            if(key==lon[i]){
                s=1;
            }
            if(s==1){
                System.debug('element found');
            }
            else{
                System.debug('element not found');
            }
        }
    }
}
