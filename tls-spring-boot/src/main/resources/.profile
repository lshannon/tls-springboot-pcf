#!/bin/bash  
$HOME/.java-buildpack/open_jdk_jre/bin/keytool -keystore $HOME/.java-buildpack/open_jdk_jre/lib/security/cacerts -storepass password -importcert -noprompt -alias MyCert -file $HOME/src/main/resources/keystore.p12