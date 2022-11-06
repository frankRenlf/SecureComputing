# Computing HMACs in Java

This is a Gradle project to support the Java part of the *Computing HMACs*
exercise.  A **Gradle wrapper** is provided, which means you do not need
to download Gradle yourself; instead, it will be downloaded for you
if needed, along with a copy of Google's [Tink][1] cryptography library,
which is the basis for the exercise.

The Gradle wrapper can be invoked on the command line in Linux and macOS
with the command `./gradlew`, and on Windows with `gradlew`.

To list all the tasks available, do

    ./gradlew tasks

You should see four tasks under the 'Application' heading.  Three of these,
`createkey`, `computetag` and `verifytag`, compile and run the programs in
`CreateKey.java`, `ComputeTag.java` and `VerifyTag.java`, respectively.
The fourth task, `run`, simply runs the other three tasks in the correct
sequence.

So to (compile and) run the `CreateKey` program, do

    ./gradlew createkey

To run all three programs in sequence, do

    ./gradlew run

Or, simpler still,

    ./gradlew

Since `run` is the default task.

If you prefer to work within an IDE, the build file is set up to support
the use of [IntelliJ][2].  Just use the 'Open or Import' option to open the
folder containing the `build.gradle` file.  The Gradle tasks will be
detected automatically and can be executed from within the Gradle tool
window. Once you've run a task, IntelliJ should create a run configuration
for it, allowing it to be rerun in the normal way via the *Run* button on
the toolbar.

[1]: https://github.com/google/tink
[2]: https://www.jetbrains.com/idea/
