# 깃헙 브랜치 전략
1. 로컬에서 새 브랜치 생성 및 전환:<br>
git checkout -b 'feature/#1'

2. 변경사항 작업 후 커밋:<br>
git add .<br>
git commit -m "Feature #1 구현"

3. 원격에 새 브랜치 푸시:<br>
git push -u origin 'feature/#1'
-------------------------------------
4. 작업 완료 후 main 브랜치로 전환:<br>
git checkout main

5. main 브랜치 최신화:<br>
git pull origin main

6. feature/#1 브랜치를 main에 머지:<br>
git merge 'feature/#1'

7. 머지된 변경사항을 원격 main에 푸시:<br>
git push origin main

8. 로컬 feature/#1 브랜치 삭제:<br>
git branch -d 'feature/#1'

9. 원격 feature/#1 브랜치 삭제:<br>
git push origin --delete 'feature/#1'

