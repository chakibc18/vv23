package com.istic.VV1;

import java.util.ArrayList;

import spoon.support.reflect.declaration.CtMethodImpl;

public class M_Linearizer {
	static ArrayList<X_CtMethodImpl> meth_main_list = new ArrayList<>();
	X_CtMethodImpl main_meth;
	MetaNode main_Node;
	
public M_Linearizer(X_CtMethodImpl main_meth) {
	System.out.println("--========================================-");
	System.out.println("buiding control flow for main entry in "+ main_meth.node_class.resource_path+".java");
	main_meth.node_class.reset_comment();
	this.main_meth= main_meth;
	this.main_Node = new MetaNode(null);
	this.main_Node.WQNodes.add(this.main_meth);
	build_control_flow(this.main_Node );
}

 
  public void build_control_flow(MetaNode root ) {
	  int counter =0;
	  MetaNode.reset_changed_x(root);
		counter ++;
		System.out.println(counter +"eme pass ----------------------\n");
		System.out.println(main_Node.print_x());
	  expand_x (root,root);
	  while (MetaNode.compute_changed( root) >0) {
			counter ++;
			System.out.println(counter +"eme pass ----------------------\n");
			System.out.println(main_Node.print_x());

		  MetaNode.reset_changed_x(root);
		  expand_x (root,root);
	  }//end while has_changed
		System.out.println(counter +"HCC finish ----------------------\n");
		System.out.println(main_Node.print_x());
	}
	
	private void expand_WQ ( MetaNode  entry ) {
		if (entry.WQNodes.size()>0) {
			entry.WQNodes.get(0).expand(entry);
		}
		return  ;
	}
		
	public void expand_x (MetaNode root, MetaNode  entry ) {
expand_WQ(entry);

if (MetaNode.compute_changed(root)>0) return  ;
//System.out.println("empty WQ detected"+entry+"\n" );
	  for (MetaNode n : entry.NQMetaNodes) {
			expand_x (root,n);
			
		}
//	  System.out.println("all children expanded"+entry);
}
	
static void scan_for_main (NODE entry, ArrayList<X_CtMethodImpl> meth_main_list) {
	 if (entry instanceof X_CtMethodImpl && ((CtMethodImpl )entry.i_element).getSimpleName().compareTo("main")==0) {
		 meth_main_list.add((X_CtMethodImpl) entry);
	 }
	   for (NODE x : entry.children)
		   scan_for_main(x, meth_main_list);
	 
	}
 
}
