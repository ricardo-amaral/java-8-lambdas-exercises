package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;

import java.util.List;
import java.util.stream.Stream;

public class Question2 {
    // Q3
    public static int countBandMembersExternal(List<Artist> artists) {
        int totalMembers = 0;

        for (Artist artist : artists) {
            Stream<Artist> members =  artist.getMembers();
            totalMembers += members.count();
        }

        return totalMembers;
    }

    public static long countBandMembersInternal(List<Artist> artists) {
        return artists.stream()
                .flatMap(Artist::getMembers)
                .count();
    }

    public static void main(String[] args) {
        System.out.println("Total members in external iteration: " + countBandMembersExternal(SampleData.getThreeArtists()));
        System.out.println("Total members in external iteration: " + countBandMembersInternal(SampleData.getThreeArtists()));
    }
}
