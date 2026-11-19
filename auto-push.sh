#!/bin/bash

cd "$(dirname "$0")"

while true
do
    git add -A

    if ! git diff --cached --quiet; then
        git commit -m "Daily coding update: $(date '+%Y-%m-%d %H:%M:%S')"
        git push
    fi

    sleep 300
done