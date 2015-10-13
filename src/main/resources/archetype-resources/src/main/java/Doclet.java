#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.RootDoc;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * Hello world!
 */
public class Doclet {
    public static boolean start(RootDoc root) {
        for (ClassDoc classDoc : root.classes()) {
            System.out.println("Hello " + classDoc.name() + "!");
        }

        System.out.println("Just random garbage: " +
                RandomStringUtils.randomAscii(10));

        return true;
    }
}
