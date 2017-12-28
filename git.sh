#!/bin/bash
#git remote add origin git@github.com:xiaogangfan/framework.git
#check parameters
if [ "$#" -eq "1" ];then
    echo "param:$1"
else
    echo "Usage: `basename $0` first parameter"
    echo "You provided $# parameters,but 1 are required."
    exit 2
fi

#execute git command
git status
git add .

git commit -am "$1"
git pull origin master
git push -u origin master
git push
