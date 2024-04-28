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
