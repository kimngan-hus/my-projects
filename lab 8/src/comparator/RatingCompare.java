package comparator;

import java.util.Comparator;

 class RatingCompare implements Comparator<Movie> {
     public int compare(Movie left, Movie right){
         if (left.getRating()==right.getRating())
             return 0;
         if (left.getRating() > right.getRating())
             return 1;
         else
             return -1;
     }
}
