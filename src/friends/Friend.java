//package friends;
//
//import user.User;
//import pair.Pair;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class Friend {
//    public ArrayList<Pair<String, Integer>> parAmigos = new ArrayList<Pair<String, Integer>>();
//    public Pair<String, Integer> rank = new Pair<String, Integer>();
//    public ArrayList<Integer> ordenar = new ArrayList<Integer>();
//    public ArrayList<Pair<String, Integer>> ranking = new ArrayList<Pair<String, Integer>>();
//    public ArrayList<Pair<String, Integer>> status = new ArrayList<Pair<String, Integer>>();
//
//    public ArrayList<Pair<String, Integer>> friendsSorted(User[] abigos) {
//        for (int i = 0; i < abigos.length; i++) {
//            parAmigos.add(rank.setValue(abigos[i].getName(), abigos[i].getNumExperience()));
//
//            ordenar.add(abigos[i].getLevel());
//        }
//
//        Collections.sort(ordenar);
//
//        for (int i = 0; i < ordenar.size(); i++) {
//            for (int j = 0; j < parAmigos.size(); j++) {
//                if (ordenar.get(i) == parAmigos.get(j)) {
//                    ranking.add(parAmigos[j]);
//                }
//            }
//        }
//
//        return ranking;
//    }
//
//    public ArrayList<Pair<String, Integer>> friendsStatus(User[] abigos) {
//        for (int i = 0; i < qtd; i++) {
//            status.add(rank.setValue(abigos[i].getName(), abigos[i].getLevel()));
//        }
//
//        return status;
//    }
//}