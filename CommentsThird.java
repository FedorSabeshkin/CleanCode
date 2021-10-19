1. 
// before

//======================================================================
//some code

//======================================================================


// after

//empty

// Позиционные маркеры.
// Необходимо удалять отделение участков исходного кода, которые применяются для визуального отделения. 
// Кроме того, что они мешают восприятию кода, они еще и плохо выполняют заложенный в них смысл, 
// т.к. "Заголовок привлекает внимание - только когда он встречается не часто"


2.
// before
				// convert date to calendar
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(parsedDateStart);

				// manipulate date
				calendar.add(Calendar.DATE, Integer.parseInt(timeStep));

				// convert calendar to date
				parsedDateStart = calendar.getTime();

// after
                parsedDateStart = addTimeStep(parsedDateStart, timeStep);

/**
Избыточные комментарии, шум.
Не использовать комментарии там, где можно использовать функцию или переменную.
Объяснения в том же объеме, что и сам код. Лучше вынести всю логику в отдельный метод с понятным названием
 */

 3.
// before

// Отправляем на доп обработку в клиенту, если есть условие (если запрашиваем
// обработанное, то эта часть кода не нужна)

// after

//empty

/**
Нелокальная информация.
Комментарий должен содержать только информацию относящуюся к контексту
 */ 

4.
// before

    /*
	 *
	 * Предварительно надо выполнить умный split. На выходе получится ...
	 */
	public List parseLogicalOperand(ArrayList<String> splittedUri) {
        //...
    }
    
// after

	public List parseLogicalOperand(ArrayList<String> splittedUri) {
        //...
    }

// Неочевидный комментарий
// Удалил избыточные пояснения, затрагивающие сценарий использования метода

5.
// before

if(isSpecificType){
    // <Type> режим
}else{
    // Обычный режим
}

//after

if(isSpecificType){
    // some code
}else{
    // some code
}

//Избыточные комментарии.
//Оставил только код

б.
// before

        if(type.contains("<TypeOne>")){
			TypeOne parsedType = TypeOne.valueOf(value);
			return parsedType;
			// DONE
		}
		if(type.contains("<TypeTwo>")){
			TypeTwo parsedType = TypeTwo.valueOf(value);
			return parsedType;
			// DONE
		}
        if(type.contains("<TypeThree>")){
			// ...
			return parsedType;
		}

// after

        if(type.contains("<TypeOne>")){
			TypeOne parsedType = TypeOne.valueOf(value);
			return parsedType;
		}
		if(type.contains("<TypeTwo>")){
			TypeTwo parsedType = TypeTwo.valueOf(value);
			return parsedType;
		}
        /**
        TODO: make parser for TypeThree
         */
        if(type.contains("<TypeThree>")){
			// ...
			return parsedType;
		}

// Избыточные комментарии.
// Лучше оставить TODO только в местах, где требуются добавления, чем помечать все места, которые уже работают

7.
// before

	// NEW
    methodName(){
        //some code
    }

// after

    methodName(){
        //some code
    }


// Позиционные маркеры.
// Необходимо удалять отделение участков исходного кода, которые применяются для визуального отделения. 
// Кроме того, что они мешают восприятию кода, они еще и плохо выполняют заложенный в них смысл, 
// т.к. "Заголовок привлекает внимание - только когда он встречается не часто"

8.
// before

/* .main_menu__select_shop__main__list {
        border: 1px solid rgb(100, 100, 100);
        color: #616567;
    } */

// after

    //empty

// Закомментированный код.
// Можно удалять после того, как запушен коммит зафиксировавший временные изменения, которые могут пригодиться в будущем. 
// через VCS сможем в получить этот код, если он нам потребуется

9.
// before

        //Clear T_COUNTS
        private void button3_Click(object sender, EventArgs e)
        {
            //some code
        }

// after

        private void ClearCountInDB(object sender, EventArgs e)
        {
            //some code
        }

//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий
    

10.
// before

        //Return on the main screen"
        private void button2_Click(object sender, EventArgs e)
        {
         //some code
        }

// after      
        
        private void BackToMainPage(object sender, EventArgs e)
        {
         //some code
        }
//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий

11.
// before

        //Refresh table click
        private void button1_Click(object sender, EventArgs e)
        {
         //some code
        }

// after  

        private void RefreshTable(object sender, EventArgs e)
        {
         //some code          
        }
//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий

12.
// before

        //Enter new item in table counts
        private void button2_Click(object sender, EventArgs e)
        {
         //some code     
        }
        
// after 

        private void saveItemCount(object sender, EventArgs e)
        {
         //some code     
        }

//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий

13.
// before

        //Activate searching for items method after entering id on keyboard 
        private void textBox1_KeyUp(object sender, KeyEventArgs e)
        {
         //some code 
        }

// after 

        private void SearchItemById(object sender, KeyEventArgs e)
        {
         //some code 
        }

//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий

14.
// before

            //check if place has code
            if (checkPlaceCode())
            {
                //some code   
            }
            else {
                //some code   
            }

// after 

            if (hasPlaceCode())
            {
                //some code   
            }
            else {
                //some code   
            }
//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий

15.
// before

        //Choose code of responsible person
        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
                //some code  
        }

// after 

        private void ChooseResponsiblePersonCode(object sender, EventArgs e)
        {
                //some code  
        }
//Не использовать комментарии там, где можно использовать функцию или переменную.
//Переназвал метод и удалил комментарий