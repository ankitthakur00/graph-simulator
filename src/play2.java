
public class play2 {

	String buoc;
	int r, f;
	int[] Stack;
	int l;
	

	
	int nodeDangXet;
	int nodeKeDangXet;
	
	String ketQuaDuyet;

	int nEdge;

	int i, j;

	play2 next;
	play2 pre;

	public play2(String buoc, int []Stack,int l,int nodeDangXet,int nodeKeDangXet,String ketQuaDuyet, int nEdge) {
		this.buoc = buoc;
		
		this.ketQuaDuyet=ketQuaDuyet;
		this.nodeDangXet=nodeDangXet;
		this.nodeKeDangXet=nodeKeDangXet;
		this.nEdge=nEdge;
		int []s = new int[31];
		for(int i=0;i<31;i++) 
			s[i]=Stack[i];	
		System.out.println();
		this.Stack=s;
		this.l=l;
		next = null;
	}
}
