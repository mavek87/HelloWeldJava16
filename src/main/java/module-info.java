/**
 * Simpler alternative. The open keyword before the module means you are allowing
 * to all the external modules to use reflection on your module.
 */

//open module com.matteoveroni.helloweld {
//    requires weld.se.shaded;
//}

/**
 * More elaborate alternative. Open keyword only for packages containing classes
 * annotated with weld annotations. Needed to allow weld reflection on those classes.
 */

module com.matteoveroni.helloweld {
    requires weld.se.shaded;
    opens com.matteoveroni.helloweld to weld.se.shaded;
    opens com.matteoveroni.helloweld.producers to weld.se.shaded;
    opens com.matteoveroni.helloweld.services to weld.se.shaded;
}

