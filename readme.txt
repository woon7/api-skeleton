Host PC
	Docker Windows 설치
	Resource를 넉넉하게 잡아줄 것
		CPUs, Memory, Swap
		Disk Usage 100% 문제 방지
	C:\admc\admc-api 디렉터리 생성 및 Docker 공유 디렉터리로 설정
	C:\admc\admc-api 디렉터리에 start-docker.bat 복사
Client PC
	C:\admc\admc-api\deploy.bat 실행
		API가 배포되면서 실행됨
		버전이 달라지면 Client의 deploy.bat과 Host의 start-docker.bat 정보 수정 필요