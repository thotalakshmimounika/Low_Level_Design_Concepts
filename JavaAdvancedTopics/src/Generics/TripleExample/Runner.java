package Generics.TripleExample;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triplet<String> idnamecollege = new Triplet<>("1", "Mounika", "SRKR");
        Triplet<Integer> idrollage = new Triplet<>(2, 21, 24);
        Triplet<Long> idrollagelong = new Triplet<>(2L, 21L, 24L);

        List<Triplet<String>> triplets = List.of(idnamecollege, idnamecollege);
        List<Triplet<Integer>> triplets1 = List.of(idrollage,idrollage);
        List<Triplet<Long>> triplets2 = List.of(idrollagelong,idrollagelong);
//        print(triplets);
//        print(triplets1);
        System.out.println(calculateAverage(idrollage));
        System.out.println(calculateAverage(idrollagelong));
    }

//        private static void print(List<Triplet<String>> triplets){
//            for(Triplet<String> triplet:triplets){
//                System.out.println(triplet.getLeft() +"--"+ triplet.getMiddle() + "--" + triplet.getRight());
//            }
//        }This is not generic, because it accepts only string attrinbutes, to accept all , make it typ
        private static <TYPE> void print(List<Triplet<TYPE>> triplets){
            for(Triplet<TYPE> triplet:triplets){
                System.out.println(triplet.getLeft() +"--"+ triplet.getMiddle() + "--" + triplet.getRight());
            }
        }
//        Write another method to find average and return
//        private static double calculateAverage(Triplet<Integer> triplets){
//                int left = triplets.getLeft();
//                int right = triplets.getRight();
//                int middle = triplets.getMiddle();
//
//                return (double) (left+right+middle)/3;
//        }
        private static double calculateAverage(Triplet<? extends Number> triplets){
            return (double) (triplets.getLeft().doubleValue()+
                    triplets.getRight().doubleValue()+
                    triplets.getMiddle().doubleValue())/3;
        }
}
