# 깃헙 브랜치 전략
1. main 브랜치로 전환: <br>
git checkout main

2. main 브랜치를 최신 상태로 업데이트:<br>
git pull origin main

3. feature/#1-userEntity 브랜치를 main에 머지:<br>
git merge 'feature/#1-userEntity'

4. 머지된 변경사항을 원격 main 브랜치에 푸시:<br>
git push origin main

5. 로컬 feature/#1-userEntity 브랜치 삭제:<br>
git branch -d 'feature/#1-userEntity'

6. 원격 feature/#1-userEntity 브랜치 삭제:<br>
git push origin --delete 'feature/#1-userEntity'
