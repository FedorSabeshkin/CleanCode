1. 
                // before
                Sting [] arrayWithSameValues = [];
                for (i = 0; i < lengthOfArr; i++) {
                    arrayWithSameValues[i] = value
                }
                return arrayWithSameValues;

                // after
                LinkedList<String> listWithSameValues = new LinkedList<>();
                for (i = 0; i < sizeOfList; i++) {
                    listWithSameValues.add(value);
                }
                return listWithSameValues;


2.
                // before
                List<HashMap<String, String>> parsedFilters = new ArrayList<>();
                // some code
                for (int i = 0; i < parsedFilters.size(); i++){
                    for (Map.Entry<String, String> entry : parsedFilters.get(i).entrySet()){
                        // some code
                    }
                }

                // after
                List<HashMap<String, String>> parsedFilters = new LinkedList<>();
                Iterator parsedFiltersIterator = parsedFilters.iterator();
                // some code
                while (parsedFiltersIterator.hasNext()) {
                    for (Map.Entry<String, String> entry : parsedFiltersIterator.next().entrySet()){
                        // some code
                    }
                }


3. 
                // before
                String[] nameAndValue = stringOfParsedFilters.split("xxx");
                if(nameAndValue.length == 2){
                    if(nameAndValue[0].trim().contains("...")){
                        nameAndValue[1] = nameAndValue[1].replaceAll("...", "///");
                    }

                }
                // after
                const LENGTH_PAIR_OF_NAME_VALUE = 2;
                String[] nameAndValue = stringOfParsedFilters.split("xxx");
                List<String> nameAndValueList = Arrays.asList(nameAndValue);
                ArrayDeque<Integer> nameAndValueArrayDeque = new ArrayDeque<>(nameAndValueList);
                if(nameAndValueList.size() == LENGTH_PAIR_OF_NAME_VALUE){
                    if(nameAndValueList.getFirst().contains("...")){
                        nameAndValueList.addLast(nameAndValue.pollLast().replaceAll("...", "///"));
                    }
                }


4.
                // before
                for (int i = 0; i < listOfProperties.size(); i++){
                    Property property = listOfProperties.get(i);
                }
            
                // after
                Iterator listOfPropertiesIterator = listOfProperties.iterator();
                // some code
                while (listOfPropertiesIterator.hasNext()) {
                    Property property = listOfPropertiesIterator.next()
                }


5.
                // before
				for (int i = 0; i < properties.size(); i++){
					if(!properties.get(i).isSomething()){
						entity.addProperty(properties.get(i));
					}
				}

                // after
                Iterator propertiesIterator = properties.iterator();
                // some code
                while (propertiesIterator.hasNext()) {
                    var property = propertiesIterator.next();
					if(!property.isSomething()){
						entity.addProperty(property);
					}
                }