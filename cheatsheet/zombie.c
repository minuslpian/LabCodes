#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(){
	pid_t cpid=fork();
	if(cpid == 0){
		printf("I am child process with id %d",getpid());
		printf("My parent process with id %d",getppid());
	}
	else{
		//sleep(10);
		wait(NULL);
		sleep(5);
		printf("I am parent process with id %d",getpid());
		printf("My child process with id %d",cpid);
	}
	return 0;
}
