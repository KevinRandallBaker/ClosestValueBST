
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int closestValueBST(BST tree, int target) {
		
		int closest = tree.value;
		BST current = tree;
		int curVal = 0;
		
		System.out.println("Target: " + target);
		
		while(current != null) {
			curVal = current.value;
			System.out.println("curVal: " + curVal);
			System.out.println("closest: " + closest);
			
			if(Math.abs(curVal - target) < Math.abs(closest - target)) {
				closest = curVal;
			}
			
			System.out.println((Math.abs(curVal - target)));
			System.out.println(Math.abs(closest - target));
			
			if(curVal < target) {
				current = current.right;
			}else {
				current = current.left;
			}
		}
		return closest;
	}

}
