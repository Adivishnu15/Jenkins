## 🛠️ Jenkins-Based Experiments

These experiments demonstrate automating Java program builds using Jenkins Freestyle Jobs. You'll need a Jenkins server running and Java installed on the system.

📁 Code location:
```bash
git clone https://github.com/Adivishnu15/Jenkins.git
⚙️ Experiment 2: Calculate Sum and Average of First 10 Numbers Using Java in Jenkins
🔧 Jenkins Setup Steps
Open Jenkins ➝ Click New Item

Enter job name ➝ Select Freestyle Project ➝ Click OK

Add description (optional)

Under Source Code Management, select Git ➝ Paste repo URL:
https://github.com/Adivishnu15/Jenkins.git

Set branch to: main

Under Build Steps, choose Execute Shell and enter:

bash
Copy
Edit
javac SumAvg.java
java SumAvg
Click Save

Click Build Now

View Console Output to check results

➗ Experiment 3: Perform Arithmetic Operations on Two Integers Using Java in Jenkins
🔧 Jenkins Setup Steps
Create a new Jenkins freestyle project

Add description

Check This project is parameterized ➝ Add String Parameters:

a (default: 10)

b (default: 11)

Under Source Code Management, select Git ➝ Paste repo URL
https://github.com/Adivishnu15/Jenkins.git
Branch: main

Under Build Steps ➝ Execute Shell, enter:

bash
Copy
Edit
javac Arithmetic.java
java Arithmetic $a $b
Click Save

Click Build with Parameters

Modify input values if desired ➝ Click Build

View Console Output for the result

🧑‍🎓 Experiment 4: Display Student Details (Name, Roll No, Dept) Using Java in Jenkins
🔧 Jenkins Setup Steps
Create a new Jenkins freestyle project

Add description

Check This project is parameterized ➝ Add String Parameters:

name (default: adi)

roll (default: 303)

dept (default: cse)

Under Source Code Management, select Git ➝ Paste repo URL
https://github.com/Adivishnu15/Jenkins.git
Branch: main

Under Build Steps ➝ Execute Shell, enter:

bash
Copy
Edit
javac StudentDetails.java
java StudentDetails "$name" "$roll" "$dept"
Click Save

Click Build with Parameters

Modify values if desired ➝ Click Build

View Console Output for the result

💡 Tips
Ensure Java (javac and java) is installed on the Jenkins host.

Make sure Jenkins has permission to access the internet to clone repositories.

Check the Jenkins console output for troubleshooting build failures.
