# 깃헙 브랜치 전략
-------------------------------------
- 원격에서 새로운 이슈 발행
- 원격에서 새로운 feature/#2 브랜치 생성
-------------------------------------
1. main 브랜치로 전환:<br>
git checkout main

2. main 브랜치 최신화:<br>
git fetch --all

3. 완료한 feature/#1 브랜치 삭제:<br>
git branch -d origin/feature/#1

4. 로컬 feature/#2 브랜치 생성/전환:<br>
git checkout -b feature/#2<br>


4. 변경사항 작업 후 커밋<br>
git add .<br>
git commit -m "Feature #2 구현"

5. 원격 feature/#2 브랜치로 푸시<br>
git push --set-upstream origin origin/feature/#2

6. 원격 feature/#2 브랜치로 푸시:<br>
git push origin feature/#2

-------------------------------------
- 원격에서 Pull Request
- feature/#2 브랜치 병합 및 삭제
-------------------------------------
