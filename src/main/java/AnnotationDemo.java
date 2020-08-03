import org.graalvm.compiler.api.replacements.Snippet;

@ClassPreamble (
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)

public class AnnotationDemo {

    // Author: John Doe
    // Date: 3/17/2002
    // Current revision: 6
    // Last modified: 4/12/2004
    // By: Jane Doe
    // Reviewers: Alice, Bill, Cindy

    public static void main(String[] args) {
        boolean isT = true;
        boolean isExistingOrderID = false;
        boolean isExistingCustomer = false;
        String s1 = "hello";
        String str = "h";
        String s = String.valueOf(isExistingOrderID) + String.valueOf(isExistingCustomer);
        System.out.println("s "+s);
    }

}
