# rateme
This is a rating application. Various cat pictures with their names are displayed along with two rating options, one is ‘cute’ and other is ‘not cute’. The user is supposed to give ratings with respective to cats. One vote for each cat. Total number of cats are Ten. The purpose of this application is to implement an application architectural pattern by using View Model, Live Data, Data Binding. 
## Aim: 
To implement a reliable rating application with an efficient architecture.
## Design: 
Model View ViewModel (MVVM) architecture is used to develop this application. This architecture can be done by using Google Databinding library. Binding is done in XML layout which results in minimization of view binding code. Typically, in MVVM the Model contains data model, business logic, and View contains layouts & views, activities & fragments, and ViewModel contains viewmodel interface, observables.
## UML Diagrams:
<a href="https://ibb.co/7kZPKM7"><img src="https://i.ibb.co/hY4bVQp/UML.png" alt="UML" border="0"></a> <br>
<center>Figure 1 Class diagram</center>  <br>  

The above diagram describes the structure of the classes of our application system. It includes attributes, relationships among objects and operations within class. The Cat data class is where all the data is stored. The CatListView class implements AndroidViewModel. StartFragment, ListFragment, FinalFragment are the View implementations. Model and View are separated using ViewModel.
<a href="https://ibb.co/j8fGjtp"><img src="https://i.ibb.co/L0R6sKG/Interaction.png" alt="Interaction" border="0"></a> <br> 
<center>Figure 2 Interaction Diagram</center> <br>  

The above Interaction Diagram tells us how different components in an architecture communicate between each other. When we enter into fragments (StartFragment), we get subscribed to ViewModel (CatListView) which observes ratings by updating Model (Cat). This Model projects LiveData to ViewModel and then Ratings are binded using BindingAdapter by ViewModel.
### Planning: 
Phase 1: Designing of UI and QA 
Phase 2: Prototyping of UI and Code and QA 
Phase 3: Implementation and QA 
Phase 4: User review 
### Testing: 
Manual testing is performed, and test cased are mentioned below 
* Case 1: Should start count of ratings from zero – Passed 
* Case 2: Should take input of max 10 ratings – Passed 
* Case 3: Should accept only one rating at a time – Passed 
* Case 4: Should go back when user uses back button while giving ratings– Passed 
* Case 5: Should reset rating values to zero when enters starting page – Passed 
* Case 6: Should retain ratings if a user pauses and resumes the application – Passed 
* Case 7: Should display 10 distinct cat pictures with their associated names – Passed 
* Case 8: Should navigate from first fragment to second fragment when start button is pressed – Passed 
* Case 9: Should display LiveData of cats while giving ratings – Passed 
* Case 10: Should recognize ten ratings and enter into final fragment if tenth ratting is given – Passed 
* Case 11: Should increment rating count whenever ratings are given – Passed 
## References 
* [1] “10 Heuristics for User Interface Design: Article by Jakob Nielsen,” Nielsen Norman Group, 2019. [Online]. Available: https://www.nngroup.com/articles/ten-usability-heuristics/. [Accessed: 12-Mar-2020]. 
* [2] “Preventing User Errors: Avoiding Unconscious Slips,” Nielsen Norman Group, 2015. [Online]. Available: https://www.nngroup.com/articles/slips/. [Accessed: 12-Mar-2020]. 
* [3] “Android Architecture Components | Android Developers,” Android Developers, 2019. [Online]. Available: https://developer.android.com/topic/libraries/architecture. [Accessed: 23-Mar-2020].
* [4] “ConstraintLayout,” Constraintlayout.com, 2020. [Online]. Available: https://constraintlayout.com/layouts/relativelayout.html. [Accessed: 12-Mar-2020]. 
* [5] android.arch.lifecycle.LiveData, “LiveData  |  Android Developers,” Android Developers, 2019. [Online]. Available: https://developer.android.com/reference/android/arch/lifecycle/LiveData. [Accessed: 23-Mar-2020].
* [6] “Build a Responsive UI with ConstraintLayout | Android Developers,” Android Developers, 2020. [Online]. Available: https://developer.android.com/training/constraint-layout. [Accessed: 12-Mar-2020].
* [7] “Migrating to AndroidX | Android Developers,” Android Developers, 2019. [Online]. Available: https://developer.android.com/jetpack/androidx/migrate. [Accessed: 23-Mar-2020].
* [8] “Test your app | Android Developers,” Android Developers, 2020. [Online]. Available: https://developer.android.com/studio/test. [Accessed: 12-Mar-2020].
* [9] “LiveData | Android Developers,” Android Developers, 2020. [Online]. Available: https://developer.android.com/reference/androidx/lifecycle/LiveData. [Accessed: 23-Mar-2020].
* [10] “Lifecycle | Android Developers,” Android Developers, 2020. [Online]. Available: https://developer.android.com/jetpack/androidx/releases/lifecycle. [Accessed: 23-Mar-2020].
* [11] “9 Anti-Patterns Every Programmer Should Be Aware Of,” Sahandsaba.com, 07-May-2015. [Online]. Available: https://sahandsaba.com/nine-anti-patterns-every-programmer-should-be-aware-of-with-examples.html. [Accessed: 23-Mar-2020].
* [12] Sazzad Hissain Khan, “Parsing with Google Gson library in Android Kotlin,” Medium, 27-Jun-2019. [Online]. Available: https://medium.com/@hissain.khan/parsing-with-google-gson-library-in-android-kotlin-7920e26f5520. [Accessed: 23-Mar-2020].
