1. sum - sumOfCharCodes
// сумма кодов символов, для вычисления хэша от строки.


2. index - indexOfElement
// индекс элемента в массив


3. minIndex - leastUsedIndex
// индекс с наименьшим кол-ом обращений


4. 	inString - sequenceOfParenthesis 
// Последовательность скобок для валидации


5. 	inString - postfixArithmeticExpression
// алгебраическое выражение в постфиксной записи


6.  numbers - numbersForExpression
// числа из этого выражения


7.  beginIndex - positionOfSymbolStart
	endIndex - positionOfSymbolEnd
// пара индексов, с помощью которых беру по одному символу из строки 


8.  first - firstNumber
	second - secondNumber
// числа для алгебраического выражений


9. powerSet - unionedSet
// Множество получившиеся в результате объединения других множеств


10. powerSet - setOfIntersection
// Множество получившиеся в результате пересечения других множеств


11. powerSet - setOfDifference
// Множество получившиеся как разница других множеств


12. compareResult - resultOfCompare
// результат сравнения двух элементов



/****/

6.1
	1. dateStart - startMonthInterval
	dateEnd - endMonthInterval

	2. offset - utcOffsetInMinutes

	3. int indexOfQuote = matcher.start();
		int end = matcher.end();
	int end = matcher.end();

	4. list - headerList 
	// в методе getHeaderNames()

	5. found - parentElement
	// в методе addElement(element, parentElementId) 



6.2	
	1. FilterExpressionVisitor expressionVisitor = new FilterExpressionVisitor(currentEntity);

	2. Iterator<Entity> entityIterator = entityList.iterator();

	3. Set<String> expandsSet

	4. UpdateQueryRequestWrapper updateQueryRequestWrapper

6.3
	1. convertedUrl 
	// в методе форматирования запроса из одной системы в другую
	
	2. BatchEntityIterator batchEntityIterator
	// в методе readEntityCollection()

	3. updatedQuery
	// в классе UpdateQueryRequestWrapper 


6.4
	1. query - requestQuery
	
	2. SelectItem item - SelectItem selectItem
	
	3. List<String> path - List<String> selectPaths 

	4. result  - onlyNumberString
	// в методе removeLastLetterFromNumber()
	
	5. list - headerList 
	// в методе getHeaderNames()


// examples of right bool variable names
7.1

	1. connection - isSetConnection 
	// Метод получения имени коннектина из URL

	2. ifThereType - hasType
	// проверка на то, указан ли тип в запросе

	3. endBracket - hasEndBracket
	// парсинг выражения

	4. firstApostrophe - hasFirstApostrophe
	// парсинг выражения

	5. subfilter - isSubfilter

// standart bool variables
7.2

	1. success
	// флаг индентификатора успеха в методе обращения к удаленному хосту

	2. foundEntity
	// есть ли в сете entity с параметрами, как у переданной в метод

// variables in cycle
7.3
	// Before
	for (Element i : structure.elements()){
		// <...> работа с элементом
	}

	// After
	for (Element element : structure.elements()){}

// Названия - пара антонимов
7.4 

	1. success/error
	/* как аргументы в обработчиках результата асинхронного запроса.
	В зависимости от того попали в положительную ветку 
	или поймали ошибку - будем работать в разных обработчика с разными по названию переменными 
	*/

	2. startIndex/endIndex
	/**
	В методе парсинга значения из строки
	*/

// Временные переменные
7.5
	1.
	// Before
	Boolean b = false;
	
	// After
	Boolean isError = false;
	// переменная перед участком кода, который проставит ее true при если не найдет элемент, который должен 

	2. newLanguage - targetLanguage
	// в методе switchLanguage()