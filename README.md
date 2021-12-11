# A sample code of Log4j Security Vulnerabilities 

by https://github.com/xinyuz



## Description from Apache

### Fixed in Log4j 2.15.0

[CVE-2021-44228](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2021-44228): Apache Log4j2 JNDI features do not protect against attacker controlled LDAP and other JNDI related endpoints.

Severity: Critical

Base CVSS Score: 10.0 CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:C/C:H/I:H/A:H

Versions Affected: all versions from 2.0-beta9 to 2.14.1

Descripton: Apache Log4j2 <=2.14.1 JNDI features used in configuration, log messages, and parameters do not protect against attacker controlled LDAP and other JNDI related endpoints. An attacker who can control log messages or log message parameters can execute arbitrary code loaded from LDAP servers when message lookup substitution is enabled. From log4j 2.15.0, this behavior has been disabled by default.



## Test Run

1. Step 1, Start RMIServer by running RMIServer.java.
2. Step 2, Run Log4jTest.java to simulate a logging action, which will call the code from RMIServer.java, and run it on local.





## Exploring

1. Change the code in RMIEvilCode.java to run what you want on the server running log4j. In above case, My log4j application is running on Mac, and I want it to open www.github.com by Chome.
2. In Log4jTest, the address can be more dangerous, if it's public IP.



## Migrate Log4j version to 2.15.0

1. In pom.xml, change log4j version to 2.15.0
2. Run above test, it's fixed in 2.15.0





## Reference

- https://logging.apache.org/log4j/2.x/security.html
- https://www.wired.com/story/log4j-flaw-hacking-internet/