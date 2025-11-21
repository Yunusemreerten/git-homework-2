GIT Homework 2 – Report

Student: Yunus Emre Erten
Course: GIT
Date: 04.12.2025
Repository URL:
https://github.com/Yunusemreerten/git-homework-2

1. Environment

OS: Windows 10

IDE: NetBeans 12

Languages: Java

Git Version: 2.45.1.windows.1

Tools used: Git CLI, GitHub, NetBeans Git integration

2. Tasks Completed (a → z3)
a) Created a remote repository

New empty public repo created on GitHub named git-homework-2.

b) Cloned the empty repository
git clone https://github.com/Yunusemreerten/git-homework-2.git

c) Created a local project in the cloned repo

NetBeans → New Project → Java Application

Project placed directly inside the cloned repository folder.

d) Committed the empty Java project
git add .
git commit -m "Initial empty Java project"
<img width="878" height="823" alt="2  commit" src="https://github.com/user-attachments/assets/2c828f4c-2640-4b43-8131-3e4ac924e1c8" />


e) Added simple code (table creation & printing)

<img width="1876" height="958" alt="2  commit netbeans kodu" src="https://github.com/user-attachments/assets/d6b89731-a003-4f74-b354-4c03e66f4331" />


f) Committed the change
git add .
git commit -m "Add basic table creation and print elements"

<img width="799" height="144" alt="image" src="https://github.com/user-attachments/assets/a0f3f32a-a203-473f-8149-ecd015840f5e" />


g) Added random initialization

Used Random class to fill the array.
<img width="1920" height="982" alt="3  commit netbeans kodu" src="https://github.com/user-attachments/assets/d43e090f-ed4e-4aef-a9dd-57385ecccf4c" />


h) Commit
git commit -m "Initialize table with random values"
<img width="749" height="354" alt="3  commit" src="https://github.com/user-attachments/assets/ca97aa4d-94c9-499d-9a18-32c322ca7782" />

i) Added sorting code
<img width="1913" height="1009" alt="4 commit netbeans kodu" src="https://github.com/user-attachments/assets/ba477dab-ba46-410a-8bbb-f26ea42e11d1" />

Used Arrays.sort(numbers);

j) Commit
git commit -m "Sort table elements using Arrays.sort"
<img width="771" height="339" alt="4  commit" src="https://github.com/user-attachments/assets/4c846eaa-9829-43d3-b053-1c66db9c69e7" />


k) Viewed commit history
git log --oneline --graph

<img width="579" height="138" alt="k adımı için geçmişe bakıyoruz" src="https://github.com/user-attachments/assets/6f4af6d4-3a58-4796-9c5f-b01a8e8d5b1c" />


Output included commits:

Initial empty project

Add basic table

Initialize with random values

Sort elements

l) Viewed annotations (git blame)
git blame GitHomeworkProject.java

<img width="571" height="359" alt="l adımı " src="https://github.com/user-attachments/assets/8c5f208e-704f-4bec-a8de-1fcd2af9154a" />

<img width="614" height="376" alt="l adımının hepsi" src="https://github.com/user-attachments/assets/c35bd9f8-07e2-42c2-8940-39e40df46afb" />



Showed which commit changed which lines.
<img width="1115" height="911" alt="k adımı 2" src="https://github.com/user-attachments/assets/9d2c22f5-1570-46e3-8de3-44683a3ff8fb" />



m) Checked out old commits
git checkout 950cc62
<img width="559" height="376" alt="M maddesi  different revision’a geçme (git checkout)" src="https://github.com/user-attachments/assets/7e4451bb-85b5-4354-b4fa-8270df1a4c2d" />

<img width="523" height="156" alt="m den sonra geri anadala dönmek için git checkout main" src="https://github.com/user-attachments/assets/e0de5b1c-b789-4884-bf02-044fadd87533" />


Then returned:

git checkout main

n) Added changes without committing
<img width="1807" height="908" alt="N adımı için küçük bir değişiklik yaptık print(temporary change for revert test)" src="https://github.com/user-attachments/assets/6a2201a8-09ea-4d55-ad98-8f95d79c1e25" />


Added a temporary print line.

Verified using git status.

o) Reverted commit
<img width="861" height="45" alt="o maddesindeki cmd kodu" src="https://github.com/user-attachments/assets/ba83144d-80ee-47dc-8851-1d1598a0f6e3" />

<img width="1877" height="913" alt="o maddesinin a şıkkını yaptık değşikliği geri aldık" src="https://github.com/user-attachments/assets/e08aae8b-5873-4f63-8a6e-1d277b13ec51" />

<img width="1912" height="914" alt="o maddesinin b şıkkını ilk adım" src="https://github.com/user-attachments/assets/d7ad876f-9be3-4d96-81ee-e9204121161c" />

<img width="576" height="92" alt="o maddesinin b şıkkını ikinci adım" src="https://github.com/user-attachments/assets/65b541c1-626a-4b88-8eae-5ca4c1661d6e" />

<img width="1850" height="903" alt="o maddesinin b şıkkını üçüncu adım" src="https://github.com/user-attachments/assets/047d770b-f384-4c19-9579-042c31047d54" />


Editor opened → commit message confirmed.
<img width="434" height="244" alt="o maddesinin b şıkkını üçüncu adımın devamı onay verdiğimiz için kaydetti dosyayı" src="https://github.com/user-attachments/assets/bfbfe80d-d15e-4897-8809-b894d698205f" />

p) Pushed all changes to remote
git push origin main

<img width="443" height="177" alt="p maddesi" src="https://github.com/user-attachments/assets/3f634115-75eb-466d-ad76-4eef12e4cb03" />

r) Deleted local repo

<img width="764" height="143" alt="r adımı repoyu sildim" src="https://github.com/user-attachments/assets/fba43d4a-6ffe-469d-b52a-cdaaa72a32c6" />

Folder removed manually from Windows Explorer.

s) Cloned the repo again
git clone https://github.com/Yunusemreerten/git-homework-2.git

<img width="656" height="242" alt="s adımıTekrardan git clone ile geri getirdim" src="https://github.com/user-attachments/assets/a030d496-f55c-4188-92ae-7477c9ddb3c9" />


t) Created tag/release

<img width="1905" height="741" alt="t maddesi için tag ekledim" src="https://github.com/user-attachments/assets/d276ad0e-a73f-42a0-82f6-19a5dae9b5ad" />

git tag v1.0
git push origin v1.0
git checkout v1.0
git checkout main

<img width="573" height="404" alt="t maddesi Tag’e geçiş yap (checkout) yaptık ve sonra da tekrar maine döndük " src="https://github.com/user-attachments/assets/d7be7bc1-c70a-4143-ba38-35009f515180" />

u) Created a new branch
git checkout -b better-sorting

<img width="557" height="233" alt="u ve w adımları" src="https://github.com/user-attachments/assets/2b81b6a0-caa1-49c0-a147-e3d42cc500a0" />

w) Switched between branches
git checkout main
git merge better-sorting

x) Improved code in branch

Added new sorting algorithm (bubble sort).

Replaced Arrays.sort with bubbleSort().

<img width="1870" height="975" alt="x adımı Branch üzerinde kodu geliştir bubble sort yaptık " src="https://github.com/user-attachments/assets/1cf1bba9-4b4e-4c21-aec9-6e3ee83f4047" />

<img width="716" height="160" alt="x adımı commit etme kodu" src="https://github.com/user-attachments/assets/c2b93faa-4244-45a0-b483-dfe3737c517f" />


y) Merged new branch into master
git checkout main
git merge better-sorting
git push origin main

<img width="588" height="361" alt="y adımı  Branch’i main’e merge et" src="https://github.com/user-attachments/assets/88a3c851-735f-43dd-b9c5-066a7dba3d76" />

z) Shared repo with friend

Added friend zelihainan as collaborator on GitHub.

<img width="1831" height="889" alt="z adımı için arkadaş ekleme" src="https://github.com/user-attachments/assets/a445c3a7-15e8-4708-8504-148fe8e614f4" />

z1) Produced a merge conflict

Both changed the same lines:

<img width="1906" height="884" alt="z adımı z2 conflig oluştu" src="https://github.com/user-attachments/assets/11621748-0c10-4365-911d-fe0fb1c7f0a2" />

z2) Solved conflict

Resolved manually into:

<img width="1907" height="984" alt="z adımı z2 push ettik artık" src="https://github.com/user-attachments/assets/54cd56fa-7465-47f3-b40c-ec06d92a5d5a" />


Then:

git add .
git commit -m "Resolve merge conflict"
git push

z3) Sent final repo URL & this report to teacher

3. Screenshots
  Commit History

    <img width="1355" height="908" alt="image" src="https://github.com/user-attachments/assets/5159d96e-dac2-438c-ac00-d44f8535a191" />


   <img width="702" height="232" alt="image" src="https://github.com/user-attachments/assets/0e4ee0b2-792a-42e4-a400-e336b3d576c7" />
   
  Git Blame Output
  
  <img width="1099" height="732" alt="image" src="https://github.com/user-attachments/assets/26e98263-95af-4736-8931-bf13c7537c90" />

   

   
   
