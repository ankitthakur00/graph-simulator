

public class playBFS {
	play start,end;
	
	Edge_List edgeL;
	
	public playBFS(){
		start=end=null;
		
	}
	public void insertEdgeL(Edge_List edgeL){
		this.edgeL=edgeL;
	}
	public void insertKichBan(String buoc, int f, int r, int [] queue,int nodeDangXet,int nodeKeDangXet, int nEdge,int i,int j,String kqDuyet, int soDinhDaDuyet){
		play a = new play(buoc,f,r,queue,nodeDangXet, nodeKeDangXet, nEdge,i,j, kqDuyet, soDinhDaDuyet);
		if(start==null){
			start=end=a;
		}else{
			end.next=a;
			a.pre=end;
			end=a;
		}
	}
}
