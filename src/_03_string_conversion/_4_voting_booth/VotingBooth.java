package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	
public static void main(String[] args) {
	String vote=JOptionPane.showInputDialog(null, "How old are you?");
	int voteAsInt=Integer.parseInt(vote);
	if(voteAsInt>=18) {
		JOptionPane.showInputDialog(null, "Who do you want to be the next president?");
	}
	else if(voteAsInt<18) {
		JOptionPane.showMessageDialog(null, "Sorry you are too young to vote :( ");
	}
}
}
