FROM frolvlad/alpine-oraclejdk8:slim

RUN wget -O /usr/local/bin/dumb-init https://binrepo.target.com/artifactory/cpe-yum-source/up-agent-tools/dumb-init_1.2.2_amd64 && \
	chmod u+x /usr/local/bin/dumb-init

ADD build/distributions/mfglocationprofile.tar /

ENTRYPOINT ["/usr/local/bin/dumb-init", "--", "/mfglocationprofile/bin/mfglocationprofile"]