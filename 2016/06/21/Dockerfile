FROM perl
RUN apt-get update && apt-get install -y vim
VOLUME /code
WORKDIR /code
COPY dojo_resposta.pl /code
COPY dojo.pl /code
COPY dojoTest.pl /code
CMD bash
