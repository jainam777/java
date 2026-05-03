package oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie>{
private String moviename;
private Integer year;
private String rating;
	
	public Movie(String moviename, Integer year, String rating) {
		this.moviename=moviename;
		this.year=year;
		this.rating=rating;
	}
	
	@Override
	public int compareTo(Movie m) {
		return this.year-m.year;
	}
	
	
	@Override
    public String toString() {
        return moviename + " (" + year + ")";
    }
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add(new Movie("Inception", 2010, "8.8"));
		list.add(new Movie("The Matrix", 1999, "7.3"));
		Collections.sort(list);
		System.out.println("By Year::"+list);
		
		Comparator<Movie> comp = new Comparator<>() {
			public int compare(Movie m1, Movie m2) {
				return m1.moviename.compareTo(m2.moviename);
			}
		}; 
		Collections.sort(list, comp);
		System.out.println("By Name::"+list);
		Comparator<Movie> comp2= new Comparator<>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return m1.rating.compareTo(m2.rating);
			}
		};
		Collections.sort(list, comp2);
		System.out.println("By Rating::"+list);
	}
	
	
	
}
