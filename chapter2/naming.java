int d; // elapsed time in days
/** The name d reveals nothing. It does not evoke a sense of elapsed time, nor of
days. We should choose a name that specifies what is being measured and the
unit of that measure-ment:
**/
int elapsedTimeInDays;
int daysSinceCreation;
int daysSinceModification;
int fileAgeInDays;
/**Choosing names that reveal intent can make it much easier to understand and
change code.
**/
public List<int[]> getThem() {
List<int[]> list1 = new ArrayList<int[]>();
for (int[] x : theList)
if (x[0] == 4)
list1.add(x);
return list1;
}

// improved:
public List<int[]> getFlaggedCells() {
List<int[]> flaggedCells = new ArrayList<int[]>();
for (int[] cell : gameBoard)
if (cell[STATUS_VALUE] == FLAGGED)
flaggedCells.add(cell);
return flaggedCells;
}

// even better:
public List<Cell> getFlaggedCells() {
List<Cell> flaggedCells = new ArrayList<Cell>();
for (Cell cell : gameBoard)
if (cell.isFlagged())
flaggedCells.add(cell);
return flaggedCells;
}

/**
In the absence of specific conventions, the variable moneyAmount is
indistinguishable from money, customerInfo is indistinguishable from customer,
accountData is indistinguishable from account, and theMessage is
indistinguishable from message. Distinguish names in such a way that the reader
knows what the differences offer.
**/

//pronounceable names

Compare class DtaRcrd102 {
private Date genymdhms;
private Date modymdhms;
private final String pszqint = "102";
/* ... */
};
// instead use:
class Customer {
private Date generationTimestamp;
private Date modificationTimestamp;;
private final String recordId = "102";
/* ... */
};

//The length of a name should correspond to the size of its scope

for (int j=0; j<34; j++) {
s += (t[j]*4)/5;
}

//instead use :
int realDaysPerIdealDay = 4;
const int WORK_DAYS_PER_WEEK = 5;
int sum = 0;
for (int j=0; j < NUMBER_OF_TASKS; j++) {
int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
sum += realTaskWeeks;
}

/** The improvement of context also allows the algorithm to be made much cleaner by
breaking it into many smaller functions. **/

public class GuessStatisticsMessage {
private String number;
private String verb;
private String pluralModifier;
public String make(char candidate, int count) {
createPluralDependentMessageParts(count);
return String.format(
"There %s %s %s%s",
verb, number, candidate, pluralModifier );
}
private void createPluralDependentMessageParts(int count) {
if (count == 0) {
thereAreNoLetters();
} else if (count == 1) {
thereIsOneLetter();
} else {
thereAreManyLetters(count);
}
}
private void thereAreManyLetters(int count) {
number = Integer.toString(count);
verb = "are";
pluralModifier = "s";
}
private void thereIsOneLetter() {
number = "1";
verb = "is";
pluralModifier = "";
}
private void thereAreNoLetters() {
number = "no";
verb = "are";
pluralModifier = "s";
}
}
