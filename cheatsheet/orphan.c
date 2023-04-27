#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main(){
	pid_t cpid=fork();
	if(cpid == 0){
		sleep(3);
		printf("I am child process with id %d",getpid());
		printf("My parent process with id %d",getppid());
	}
	else{
		
		printf("I am parent process with id %d",getpid());
		printf("My child process with id %d",cpid);
	}
	return 0;
}
