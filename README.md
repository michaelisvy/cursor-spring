# How to reproduce the demo

## Prepare your development environments
* Install IntelliJ with Copilot plugin if you wish to compare with Cursor IDE
* Install Cursor IDE and create a free account
* You can also install VSCode with Copilot extension and/or Windsurf IDE if you wish to compare

## Checkout the code locally
* You can do it multiple times, once per IDE:

* /Home
    * /intelliJ-project
    * /cursor-project
    * /vscode-project
    * /windsurf-project

## Step 1: start experimenting with `GreetingService`
* In Cursor Composer (on the right side, select Tab `Composer`): 
    * Tag files `GreetingServiceTest` and `GreetingService`
    * Make sure that `Claude Sonnet` is the selected model
    * ask in the prompt "Make GreetingServiceTest a @SpringBootTest and make GreetingService a Spring bean"
    * Run your tests and make sure they are green

## Step 2: refactor `VisitRepository` and `Visit` so they are based on JPA and Spring Data JPA
* Open `VisitReposotory` and `Visit`. As you can see, `VisitRepository` is a mocked repository.
* Inside Cursor's composer, tag `Visit` and `VisitRepository`
* Ask to refactor `Visit` so it uses JPA annotations
    * Make sure that it only uses the right annotations. Personnaly I would do the following:
        * Remove `@Table` (if it is there) as it is not needed
        * Remove all the `@Column` annotations that are not compulsary
        * `@GeneratedValue` does not need to specify any strategy
* Run `VisitServiceTest` with one test
    * Most likely, it should fail because you did not create some sample data in the test
    * Paste the error message in the composer and ask to fix it
    * It should add a `@BeforeEach` setup method to create some sample data
    * Run the test again and make sure it is green

## Step 3: Transaction management inside a test
* First make sure you understand how the `@Transactional` annotation behaves inside a test
* Make sure you are *not* yet using `@Transactional` inside `VisitServiceTest`
* Inside `Visit`, make sure that `referenceNumber` is annotated with `@Column(unique = true)`
* Inside `VisitServiceTest`, copy paste your test method so you have two tests (the second one might be called `shoudFindVisit2` or any other name that you would prefer)
* Run your test again. It should fail because the setup method has been run twice and has persisted 2 visits with the same reference number (which should be unique)
* As you know already, the solution is to use `@Transactional` on top of each of the test methods (or at the class level if you prefer). Paste your error message to composer and ask to fix it. Most likely, it will suggest something much more complicated.
* Explicitly suggest to add `@Transactional` on top of each of the test methods

## Step 4: understand how in-editor completion works
* Open `LoggerTest` and look at the way logging is done. It purposely concatenates Strings, while it should have used the parameters `{}` syntax.
* Ask Cursor to fix it. If you do it once, it should propose to fix it for all the subsequent rows.
