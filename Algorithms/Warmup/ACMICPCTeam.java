// https://www.hackerrank.com/challenges/acm-icpc-team
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int getTeamTotal(String p1, String p2) {
        int total = 0;
        for(int i = 0; i < p1.length(); i++) {
            if(p1.charAt(i) == '1' || p2.charAt(i) == '1') total++;
        }
        return total;
    }
    
    public static int findMaxTopics(String[] people, int numTopics) {
        int max = 0;
        // double for loop O(n^2)
        for(int i = 0; i < people.length; i++) {
            for(int j = i + 1; j < people.length; j++) {
                int m = getTeamTotal(people[i], people[j]);
                if(m > max) max = m;
                if(max == numTopics) return max;
            }
        }
        return max;
    }
    
    public static int findMaxTeams(String[] people, int maxTopics) {
        int teamCount = 0;
        // Double for loop O(n^2)
        for(int i = 0; i < people.length; i++) {
            for(int j = i+1; j < people.length; j++) {
                int teamTotal = getTeamTotal(people[i], people[j]);
                if(teamTotal == maxTopics) {
                    teamCount++;
                }
            }
        }
        return teamCount;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nums = scan.nextLine().split(" ");
        int numPeople = Integer.parseInt(nums[0]);
        int numTopics = Integer.parseInt(nums[1]);
        String[] people = new String[numPeople];
        for(int i = 0; i < numPeople; i++) {
            people[i] = scan.nextLine();
        }
        int maxTopics = findMaxTopics(people, numTopics);
        System.out.println(maxTopics);
        int maxTeams = findMaxTeams(people, maxTopics);
        System.out.println(maxTeams);
    }
}
