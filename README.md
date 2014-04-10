Seems like activity 5.15 and 5.15.1 supports groovy up to 1.8.9

If you change to groovy 2.0.0, 2.2.2 the RuntimeServiceTest test will fail

org.activiti.engine.ActivitiException: Can't find scripting engine for 'groovy'

Source code from Activiti in Action https://code.google.com/p/activitiinaction/downloads/list


Joram Barrez

You need to include the groovy-all jar, the groovy scripting lib has been removed a long time ago from the groovy jar distribution.