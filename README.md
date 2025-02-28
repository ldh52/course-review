# 깃헙 브랜치 전략
-------------------------------------
- 원격에서 새로운 이슈 발행
- 원격에서 새로운 feature/#2 브랜치 생성
-------------------------------------
1. main 브랜치로 전환 및 최신화
git checkout main
git pull origin main

2. 완료한 feature/#1 로컬 브랜치 삭제 (병합 확인 후)
git branch -d feature/#1

3. 원격의 feature/#2 브랜치를 추적하는 로컬 브랜치 생성 및 전환
git checkout -b feature/#2 origin/feature/#2

4. 변경사항 작업 후 커밋
git add .
git commit -m "Feature #2 구현"

5. 원격 feature/#2 브랜치로 푸시
git push origin feature/#2

-------------------------------------
- 원격에서 Pull Request
- feature/#2 브랜치 병합 및 삭제
-------------------------------------
