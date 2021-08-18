1. Использование паттерна фабрика, вместо переопределения конструктора
	1.
	```Java
		BatchEntityIterator = BatchEntityIterator.createFiltered(filterOption)
	```
	2. 
	```Java
		AppSettings appSettings = AppSettingsImpl.createForMobile();
	```

	3. 
	```Java
		 DBWorker dbWorker = DBWorkerImpl.createSQLiteWorker();
	```

2. Именование интерфейсов и их реализаций.  
Так как с интерфейсом, который реализуется классом, по ходу отладки программы приходится встречаться чаще, не необходимости в его названии указывать префикс "I"(Interface), а могу делать это уже для реализации суфиксом "Impl"(Implementation).  
    1.  
        Interface - DBWorker  
		Implementation - DBWorkerImpl  
    2.  
		Interface - AppSettings  
		Implementation -  AppSettingsImpl  