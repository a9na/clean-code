public static String renderPageWithSetupsAndTeardowns(
PageData pageData, boolean isSuite
) throws Exception {
boolean isTestPage = pageData.hasAttribute("Test");
if (isTestPage) {
WikiPage testPage = pageData.getWikiPage();
StringBuffer newPageContent = new StringBuffer();
includeSetupPages(testPage, newPageContent, isSuite);
newPageContent.append(pageData.getContent());
includeTeardownPages(testPage, newPageContent, isSuite);
pageData.setContent(newPageContent.toString());
}
return pageData.getHtml();
}

// shorten your functions!
public static String renderPageWithSetupsAndTeardowns(
PageData pageData, boolean isSuite) throws Exception {
if (isTestPage(pageData))
includeSetupAndTeardownPages(pageData, isSuite);
return pageData.getHtml();
}

/** Is the function doing one thing or three things? Notice that the
three steps of the function are one level of abstraction below the stated name of
the function. We can describe the function by describing it as a brief TO 4
paragraph: TO RenderPageWithSetupsAndTeardowns, we check to see whether
the page is a test page and if so, we include the setups and teardowns. In either
case we render the page in HTML.
**/

public Money calculatePay(Employee e)
throws InvalidEmployeeType {
switch (e.type) {
case COMMISSIONED:
return calculateCommissionedPay(e);
case HOURLY:
return calculateHourlyPay(e);
case SALARIED:
return calculateSalariedPay(e);
default:
throw new InvalidEmployeeType(e.type);
}
}

/**My general rule for switch statements is that they can be tolerated if they appear
only once, are used to create polymorphic objects, and are hidden behind an
inheritance**/

/**The smaller and more focused a function is, the easier it is to choose a
descriptive name**/
