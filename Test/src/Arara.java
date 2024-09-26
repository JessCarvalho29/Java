import java.util.*;

class HelloWorld {
    public static int getMembershipCardsCount(List<String> visits) {
        List<String> weekDaysList = Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

        int cardCount = 0;
        int currentWeekStart = weekDaysList.indexOf(visits.getFirst());
        int previousVisit = weekDaysList.indexOf(visits.getFirst());

        for (String visit : visits) {
            int visitDay = weekDaysList.indexOf(visit);

            if (visitDay < currentWeekStart || previousVisit >= visitDay) {
                cardCount++;
                currentWeekStart = visitDay;
            }
            previousVisit = visitDay;
        }

        return cardCount;
    }

    public static void main(String[] args) {
        List<String> visits = Arrays.asList("Sun", "Sat", "Fri", "Thu", "Wed", "Tue", "Mon");
        System.out.println(getMembershipCardsCount(visits));
    }
}