# 깃헙 브랜치 전략
-------------------------------------
- 원격에서 새로운 이슈 발행
- 원격에서 새로운 feature 브랜치 생성
-------------------------------------
1. main 브랜치 최신화:<br>
git pull origin main

2. 로컬에서 feature 브랜치로 전환:<br>
git checkout feature/#1

3. 변경사항 작업 후 커밋:<br>
git add .<br>
git commit -m "Feature #1 구현"

4. 원격 feature 브랜치로 푸시:<br>
git push origin 'feature/#1'
-------------------------------------
- 원격에서 Pull Request
- feature 브랜치 삭제
-------------------------------------
