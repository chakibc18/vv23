package com.istic.VV1;

import java.util.ArrayList;

public class MetaNode {
	static int counter=0;
	static int nb_changed= 0;
	  ArrayList<NODE> LQNodes ;
	  ArrayList<NODE> WQNodes  ;
	  ArrayList<MetaNode> NQMetaNodes  ;
	boolean changed=false;
	private int counter_mn;
	MetaNode parent=null;
	
	public MetaNode(MetaNode parent) {
		this.LQNodes= new ArrayList<>();
		this.WQNodes= new ArrayList<>();
//		this.WQNodes.add( new X_NONE());
//		this.WQNodes.add( new X_NONE());
		this.parent = parent;
		this.NQMetaNodes= new ArrayList<>();
		counter++;
		this.counter_mn=counter;
	}
//	public void WQ_push ( NODE n) {
//		int pos = this.WQNodes.size()-1;
//		this.WQNodes.add(pos,n);
//		n.meta_parent= this;
//
//	}
//	public int WQ_get_size () {
//		int res= 0;
//		for (int i=0; i < this.WQNodes.size();i++) {
//			if ( ! (this.WQNodes.get(i) instanceof X_NONE) ) {
//				res++;
//			}
//		}
//		return this.WQNodes.size()-2;
//	}
//	public NODE WQ_read() {
//		if( this.WQ_get_size()>0) {
//			NODE n = this.WQNodes.get(1);
//			return n;
//		}
//		return null;
//	}
//	public NODE WQ_pop () {
//		if( this.WQ_get_size()>0) {
//			NODE n = this.WQNodes.get(1);
//			this.WQNodes.remove(1);
//			return n;
//		}
//		return null;
//	}
//	public void move_to_LQ ( NODE n) {
//		this.WQNodes.remove(n);
//		this.LQNodes.add(n);
//		n.node_class.add_comment("lin instr detected as "+n.node_name, n.node_line_number);
//	}
//	public void add_to_NQ (MetaNode mn) {
//		this.NQMetaNodes.add(mn);
//	}
	/////////////////////////////////////////////::
	public static void reset_changed_x(MetaNode main_Node) {
		main_Node.changed= false;
		for (MetaNode n : main_Node.NQMetaNodes) {
			n.changed=false;
			reset_changed_x(n);
		}
	}
	private static void has_changed_x(MetaNode entry) {
for (MetaNode n : entry.NQMetaNodes) {
			if(n.changed)MetaNode.nb_changed++;
			has_changed_x(n);
		}	
		}
	public static int compute_changed(MetaNode root) {
		MetaNode.nb_changed=0;
if (root.changed) MetaNode.nb_changed++;	
MetaNode.has_changed_x(root);
return MetaNode.nb_changed;
	}

	public String getShortDescr() {
		return "MetaNode("+counter_mn+")";
	}
	public String toString() {
		String res = "MetaNode("+counter_mn+") followed by ";
		for (MetaNode n : this.NQMetaNodes) {
			res+=n.getShortDescr();
		}
		res +="\n+linear instructions are :";
		for (NODE n : this.LQNodes) {
			res+=n.node_name+" ";
		}
		res +="\n+waiting queue instructions are :";
		for (NODE n : this.WQNodes) {
			res+=n.node_name+" ";
		}
		
		return res+"\n";
	}
	public String print_x() {
String res= this.toString();
for (MetaNode n : this.NQMetaNodes) {
	res+="\n"+n.toString();
}
for (MetaNode n : this.NQMetaNodes) {
	res+="\n"+n.toString();
}
return "[[[\n"+res+"]]]\n";
	}

	
}
