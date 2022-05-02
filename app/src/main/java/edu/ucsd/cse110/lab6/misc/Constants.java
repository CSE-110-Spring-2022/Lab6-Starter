package edu.ucsd.cse110.lab6.misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Constants {
    public final static String graph = String.join("\n",
        "graph {",
        "anchorage [label=\"Anchorage\"];",
        "chicago [label=\"Chicago\"];",
        "portland [label=\"Portland\"];",
        "pittsburgh [label=\"Pittsburgh\"];",
        "san_diego [label=\"San Diego\"];",
        "anchorage -- portland [distance=2533];",
        "anchorage -- san_diego [distance=3616];",
        "chicago -- portland [distance=2119];",
        "chicago -- pittsburgh [distance=460];",
        "portland -- san_diego [distance=1083];",
        "pittsburgh -- san_diego [distance=2411];",
        "}"
    );

    public final static String poem = String.join("\n",
        "April is the cruellest month, breeding",
        "Lilacs out of the dead land, mixing",
        "Memory and desire, stirring",
        "Dull roots with spring rain.",
        "Winter kept us warm, covering",
        "Earth in forgetful snow, feeding",
        "A little life with dried tubers.",
        "Summer surprised us, coming over the Starnbergersee",
        "With a shower of rain; we stopped in the colonnade,",
        "And went on in sunlight, into the Hofgarten,",
        "And drank coffee, and talked for an hour.",
        "Bin gar keine Russin, stamm' aus Litauen, echt deutsch.",
        "And when we were children, staying at the arch-duke's,",
        "My cousin's, he took me out on a sled,",
        "And I was frightened. He said, Marie,",
        "Marie, hold on tight. And down we went.",
        "In the mountains, there you feel free.",
        "I read, much of the night, and go south in the winter."
    );

    public static final Set<String> excludedWords = new HashSet<>(Arrays.asList(
        "is", "the", "of", "and", "pr", "a", "an",
        "with", "he", "she", "in", "for", "on",
        "we", "you", "i", "go", "tubers", "winter"
    ));
}
