# TestLog4j
1) if you are using Gmail
https://www.google.com/settings/security/lesssecureapps
select trunon.

2) pass the cmd line argument
-Dmail.smtp.starttls.enable=true

else override the SMTPAppender

3)Update the your details
    <param name="SMTPUsername" value="" />
		<param name="SMTPPassword" value="" />
		<param name="From" value="" />
		<param name="To" value="" />
