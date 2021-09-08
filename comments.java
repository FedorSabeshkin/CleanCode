/** Usefull comments */
1.
//after
/**
 * 
 * @param {*} countOfPages - count of app pages
 * @returns array length countOfPages, each element contain "none"
 * ["none", "none", "none", ...];
 */
function createDisplayNoneArr(countOfPages) {
    let pageDisplayProps = createSameValuesArr(countOfPages, CSS.DISPLAY.NONE);
    return pageDisplayProps;
}

2.
// ["none", "none", "none", ...];
let pageDisplayProps = createDisplayNoneArr(countOfPages);
//["none", "display", "none", "none"];
pageDisplayProps = setPageDisplayProp(pageDisplayProps, pageNumber)

3.
// appNamePrefix = 'priceCheckApp_page_'
changeAppPageDisplay(pageDisplayProps, appNamePrefix);

4.
/**
 * Change prop for pages of app
 * @param {*} elementProps - array length countOfPages, each element contain "none", 
 *                               but one element is "block" or another value for show
 * @param {*} idPrefix  - prefix of app pages Id
 */
function changeElementsProp(elementProps, idPrefix, propName) {
    for (i = 0; i < elementProps.length; i++) {
        document.getElementById(idPrefix + i).style[propName] = elementProps[i];
    }
}

5.
/**
 * add $top and $skip params to path
 * @param {*} path - path to data set
 * @param {*} topValue - $top value
 * @param {*} skipValue - $skip value
 * @returns 
 */
function addTopSkipParameters(path, topValue, skipValue) {
    path = addTopParameter(path, topValue);
    path = addSkipParameter(path, skipValue);
    return path;
}

6.
// Берем доп данные о договоре для экрана проверки
$scope.summaryData = StorageService.get(storageStepAdditionalInfoContractKey);

7.
// Список контактов для вывода и проверки
$scope.contacts = StorageService.get(storageStepContactKey);




/**Unnecessary comments */
1.
// before 

// Deleting quote at the end 
selectQuery = selectQuery.Remove(selectQuery.Length - 1, 1);

// after
selectQuery = removeLastQuate(selectQuery);

 public string removeLastQuate(string str)
 {
    return removeLastChar(str);
 }

 public string removeLastChar(string str)
 {
    return str.Remove(str.Length - 1, 1);
 }

2.
// before

//Activate searching for items method after entering on keyboard or scanning a barcode
 private void textBox1_KeyUp(object sender, KeyEventArgs e)
 {
     //some code
 }


// after
 private void LiveSearch(object sender, KeyEventArgs e)
 {
     //some code
 }

3.
// before 

// to hide addressbar
window.scroll(0,30);

// after
hideAddressBar()


function hideAddressBar(){
    window.scroll(0,30);
}

4. 
// before

// remove all duplicate street result
results.hits = _.uniqBy(results.hits, hit => hit.address.street);

// after
let hits = results.hits;
hits = removeStreetDuplicate(hits);

function removeStreetDuplicate(hits){
    return _.uniqBy(hits, hit => hit.address.street);
}

5.
                    // before

                    // transforms hobbies in a tab with 4 columns
                    // 1, 2, 3, 4, 5, 6, 7, 8, 9 becomes  [[1, 2, 3, 4], [5, 6, 7, 8], [9...]]
                    const hobbies = [];
                    let col = 0;
                    $scope.model.fields.naturalPersonHobbies.hobbies.forEach((hobby, index) => {
                        if (index / 4 >= col + 1) {
                            col++;
                        }
                        if (!hobbies[col]) {
                            hobbies[col] = [];
                        }
                        hobbies[col].push(hobby);
                    });

                    // after
                    let hobbies = $scope.model.fields.naturalPersonHobbies.hobbies;
                    let amountOfColumns = 4;
                    hobbies = apartDataOnCollumns(amountOfColumns, hobbies)

                    function apartDataOnCollumns(amountOfColumns, hobbies){
                                        let collumnIndex = 0;
                                        hobbies.forEach((hobby, index) => {
                                            if (index / amountOfColumns >= collumnIndex + 1) {
                                                collumnIndex++;
                                            }
                                            if (!hobbies[collumnIndex]) {
                                                hobbies[collumnIndex] = [];
                                            }
                                            hobbies[collumnIndex].push(hobby);
                                        });
                                        return hobbies;
                    }