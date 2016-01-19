echo $(date) - Piloto: \"$1\" e Copiloto: \"$2\" >> dojo.log

sleep $3

git add .
git commit -am "Piloto: $1 e Copiloto: $2"

play ../../sound.wav
