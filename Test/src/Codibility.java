import java.util.Objects;

public class Codibility {

        public static int solution(String[] visits) {
            // Implement your solution here
            int weeksCount = 0;
            int nextItem = 1;

            for (int i = 0; i < visits.length; i++) {
                if(i == 0 && visits[0] != null){
                    weeksCount++;
                }
                if (i < visits.length - 1) {
                    if (Objects.equals(visits[i], "Sun")) {
                        weeksCount++;
                    } else if (Objects.equals(visits[i], "Mon")) {
                        if (!Objects.equals(visits[nextItem], "Tue") && !Objects.equals(visits[nextItem], "Wed") && !Objects.equals(visits[nextItem], "Thu") && !Objects.equals(visits[nextItem], "Fri") && !Objects.equals(visits[nextItem], "Sat") && !Objects.equals(visits[nextItem], "Sun")) {
                            weeksCount++;
                        }
                    } else if (Objects.equals(visits[i], "Tue")) {
                        if (!Objects.equals(visits[nextItem], "Wed") && !Objects.equals(visits[nextItem], "Thu") && !Objects.equals(visits[nextItem], "Fri") && !Objects.equals(visits[nextItem], "Sat") && !Objects.equals(visits[nextItem], "Sun")) {
                            weeksCount++;
                        }
                    } else if (Objects.equals(visits[i], "Wed")) {
                        if (!Objects.equals(visits[nextItem], "Thu") && !Objects.equals(visits[nextItem], "Fri") && !Objects.equals(visits[nextItem], "Sat") && !Objects.equals(visits[nextItem], "Sun")) {
                            weeksCount++;
                        }
                    } else if (Objects.equals(visits[i], "Thu")) {
                        if (!Objects.equals(visits[nextItem], "Fri") && !Objects.equals(visits[nextItem], "Sat") && !Objects.equals(visits[nextItem], "Sun")) {
                            weeksCount++;
                        }
                    } else if (Objects.equals(visits[i], "Fri")) {
                        if (!Objects.equals(visits[nextItem], "Sat") && !Objects.equals(visits[nextItem], "Sun")) {
                            weeksCount++;
                        }
                    } else if (Objects.equals(visits[i], "Sat")) {
                        if (!Objects.equals(visits[nextItem], "Sun")) {
                            weeksCount++;
                        }
                    }
                }
                nextItem++;
            }
            return weeksCount;
        }

    public static void main(String[] args) {

        String[] days = {"Tue", "Sat", "Mon", "Fri"};
        String[] days2 = {"Mon", "Mon", "Mon", "Mon"};
        String[] days3 = {"Sun", "Sat", "Fri", "Thu", "Wed", "Tue", "Mon"};
        String[] days4 = {};

        System.out.println(solution(days4));
    }



}
