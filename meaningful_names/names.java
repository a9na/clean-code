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
