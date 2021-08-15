1. applocationRouter(pageId) - openPage(pageId)
// метод переключения страниц в UI приложения

2. sendCountsToFile - saveCountsToFile
// сохранение результата процесса в файл

3. prepareString - objectToJson
// объект в строчку в формате json 

4. prepareList - fillEmptyTypeField
// заполнение дефолтным значением конкретного пустого поля в ассоциативных массивах, из которых состоит list

5. splitUri - splitQueryPairs
// достаю из строки все переданные в запросе ограничения

6. parseLogicalOperand - getLogicalOperand
// достаю из List все условия сравнения >,<,= и сами аргументы для сравнения

7. prepareResultQuery - applyDateRules
// применение всех методов преобразования выражения

8. fieldValidation - validateFormField
// валидация полей формы

9. togglePage - togglePageDisplay
// скрывает одну страницу и открывает другую

10. afterSearch - showSearchResult
// метод для показа результата асинхронного поиска

11. checker - removeLocOffsetFields
// метод удаления лишних полей у простых объектов, 
// а в случае масиива - вызова функции для выполнения этого над каждым элементом масива

12. equalWarnTextSize  - checkWarnTextSize 
// проверка провил, что все тексты в блоке warning - одного размера
