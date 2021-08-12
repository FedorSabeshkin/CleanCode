3.2
    1. ReadEntity - EntitySetReader
    // Чтение набора данных из источника

    //Как основу для названия методов/классов чтения использую "read"

    2. JsonConvert - JsonConvertor
    //Класс из библиотеки для преобразования json в объект и наоборот

    3. DataServlet - ODataServlet
    //Точка входа для стриминга odata контента

    4. SendCounts - ProcessResult
    // класс содержит методы для отправки результатов проведеных операций

    5. CheckZone - ZoneChecker
    // Класс для проверки некоторой зоны

3.3. 
    1. QueriesOption - FilterReader
    // чтение с некоторыми атрибутами/ограничениями набора данных

    2. GetPlants - PlantsReader
    // получение заводов

    3. GetMaterial - MaterialReader
    // получение материалов

    4. AppManager - Updater
    // класс реализующий проверку обновления приложения

    5. UrlConvertor - UrlFilter
    // Класс реализующий преобразование url

    6. QueryHelper - QueryFilter
    // Класс реализующий преобразование query

    7. ReadWriteFile - FileReaderWriter
    // Класс реализующий специфическую запись и чтение из/в файл 
