1.
// before
if (...) {
    document.getElementById(page + '__accept_barcode').value = '';
    document.getElementById(page + '__accept_count').value = '';
    isEnterLastKey = false;
}

// after
if (...) {
    isEnterLastKey = false;
    document.getElementById(page + '__accept_barcode').value = '';
    document.getElementById(page + '__accept_count').value = '';
}
// поднял изменение значения переменной над вызовами методов

2.
// before
if (...) {
    isEnterLastKey = false;
    document.getElementById(page + '__accept_barcode').value = '';
    document.getElementById(page + '__accept_count').value = '';
}

// after
if (...) {
    setIsEnterLastKey(false);
    document.getElementById(page + '__accept_barcode').value = '';
    document.getElementById(page + '__accept_count').value = '';
}

function setIsEnterLastKey(isEnterLastKey) {
    _isEnterLastKey = isEnterLastKey;
}
// сделал переменную (псевдо) приватной (js) и добавил для нее сеттер


3.
// before
if (...) {
    setIsEnterLastKey(false);
    document.getElementById(page + '__accept_barcode').value = '';
    document.getElementById(page + '__accept_count').value = '';
}

// after
if (...) {
    setIsEnterLastKey(false);
    inputSetter(appName + '_page_2__accept_barcode', itemToChange.ean);
    inputSetter(appName + '_page_2__accept_count', itemToChange.count);
}
// сократил вызов методов

4.
// before
if (...) {
    setIsEnterLastKey(false);
    inputSetter(appName + '_page_2__accept_barcode', itemToChange.ean);
    inputSetter(appName + '_page_2__accept_count', itemToChange.count);
}

// after
if (...) {
    setIsEnterLastKey(false);
    cleanInput(page + '__accept_barcode');
    cleanInput(page + '__accept_count');
}
// сократил вызов методов


5.
// before
if (...) {
    setIsEnterLastKey(false);
    cleanInput(page + '__accept_barcode');
    cleanInput(page + '__accept_count');
}

// after
if (...) {
    setIsEnterLastKey(false);
    cleanScanInputs();
}

function cleanScanInputs() {
    cleanInput(page + '__accept_barcode');
    cleanInput(page + '__accept_count');
}
// объеденил группу комманд в метод


6.
// before
{
    togglePage(appName + '_page_2', appName + '_page_3')
    itemToChange = searchScanOperation(currentTarget, products)
    document.getElementById(appName + '_page_2__accept_barcode').value = itemToChange.ean;
    document.getElementById(appName + '_page_2__accept_count').value = itemToChange.count;
    isEdit = true;
}

// after
{
    isEdit = true;
    itemToChange = searchScanOperation(currentTarget, products)
    togglePage(appName + '_page_2', appName + '_page_3')
    inputSetter(appName + '_page_2__accept_barcode', itemToChange.ean);
    inputSetter(appName + '_page_2__accept_count', itemToChange.count);
}
// поднял изменение значения переменной над вызовами методов


7.
// before
{
    togglePage(appName + '_page_2', appName + '_page_3')
    itemToChange = searchScanOperation(currentTarget, products)
    document.getElementById(appName + '_page_2__accept_barcode').value = itemToChange.ean;
    document.getElementById(appName + '_page_2__accept_count').value = itemToChange.count;
    isEdit = true;
}

// after
{
    isEdit = true;
    openEditPage();
}

function openEditPage() {
    itemToChange = searchScanOperation(currentTarget, products);
    togglePage(appName + '_page_2', appName + '_page_3');
    inputSetter(appName + '_page_2__accept_barcode', itemToChange.ean);
    inputSetter(appName + '_page_2__accept_count', itemToChange.count);
}
// объеденил группу комманд в метод


8.
// before
{
    isEdit = true;
    openEditPage();
}

// after
{
    setIsEdit(true);
    openEditPage();
}
function setIsEdit(isEdit) {
    _isEdit = isEdit;
}
// сделал переменную (псевдо) приватной и добавил для нее сеттер


9.
// before
function setCookie(name, value, options) {
    if (!options) {
        options = {
            path: '/'
        };
    }


    if (options.expires instanceof Date) {
        options.expires = options.expires.toUTCString();
    }

    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);


    for (let optionKey in options) {
        cookie += "; " + optionKey;
        let optionValue = options[optionKey];
        if (optionValue !== true) {
            cookie += "=" + optionValue;
        }
    }

    document.cookie = cookie;
}

// after
function setCookie(name, value, options) {
    if (!options) {
        options = initOptions();
    }


    if (options.expires instanceof Date) {
        options.expires = options.expires.toUTCString();
    }

    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);


    for (let optionKey in options) {
        cookie += "; " + optionKey;
        let optionValue = options[optionKey];
        if (optionValue !== true) {
            cookie += "=" + optionValue;
        }
    }

    document.cookie = cookie;
}

function initOptions() {
    let options = {
        path: '/'
    };
    return options;
}
// объеденил группу комманд в метод


10.
// before
function setCookie(name, value, options) {
    if (!options) {
        options = initOptions();
    }


    if (options.expires instanceof Date) {
        options.expires = options.expires.toUTCString();
    }

    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);


    for (let optionKey in options) {
        cookie += "; " + optionKey;
        let optionValue = options[optionKey];
        if (optionValue !== true) {
            cookie += "=" + optionValue;
        }
    }

    document.cookie = cookie;
}

// after
function setCookie(name, value, options) {
    options = prepareOptions(options);
    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);


    for (let optionKey in options) {
        cookie += "; " + optionKey;
        let optionValue = options[optionKey];
        if (optionValue !== true) {
            cookie += "=" + optionValue;
        }
    }

    document.cookie = cookie;
}

function prepareOptions(options) {
    if (!options) {
        options = initOptions();
    }
    if (options.expires instanceof Date) {
        options.expires = options.expires.toUTCString();
    }
    return options;
}
// объеденил группу комманд в метод

11.
// before
function setCookie(name, value, options) {
    options = prepareOptions(options);
    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);


    for (let optionKey in options) {
        cookie += "; " + optionKey;
        let optionValue = options[optionKey];
        if (optionValue !== true) {
            cookie += "=" + optionValue;
        }
    }

    document.cookie = cookie;
}

// after
function setCookie(name, value, options) {
    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);
    options = prepareOptions(options);
    cookie = appendCookieOptions(cookie, options);
    document.cookie = cookie;
}



function appendCookieOptions(cookie, options) {
    for (let optionKey in options) {
        cookie += "; " + optionKey;
        let optionValue = options[optionKey];
        if (optionValue !== true) {
            cookie += "=" + optionValue;
        }
    }
}
// объеденил группу комманд в метод

12.
// before
function setCookie(name, value, options) {
    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);
    options = prepareOptions(options);
    cookie = appendCookieOptions(cookie, options);
    document.cookie = cookie;
}

// after
function setCookie(name, value, options) {
    let cookie = prepareCookieString(name, value, options);
    document.cookie = cookie;
}

function prepareCookieString(name, value, options) {
    let cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value);
    options = prepareOptions(options);
    cookie = appendCookieOptions(cookie, options);
    return cookie;
}
// объеденил группу комманд в метод


13.
// before
else {
    setLogin(false);
    errorTextElement.innerHTML = errorText;
    errorTextElement.style.visibility = "visible";
}

// after
else {
    setLogin(false);
    showLoginError(errorTextElement);
}

showLoginError(errorTextElement){
    errorTextElement.innerHTML = errorText;
    errorTextElement.style.visibility = "visible";
}
// объеденил группу комманд в метод

14.
// before
document.getElementById("priceCheckApp_page_" + 1).style.display = "none";
document.getElementById("priceCheckApp_page_" + 2).style.display = "none";
document.getElementById("priceCheckApp_page_" + 3).style.display = "none";


// after
hideAppByNamePrefix("priceCheckApp_page_", 4);

/**
 * hide app by name (id) prefix
 * @param {*} countOfPages - count of app pages
 * @param {*} appNamePrefix - prefix of app pages Id
 */
function hideAppByNamePrefix(appNamePrefix, countOfPages) {
    var pageDisplayProps = createDisplayNoneArr(countOfPages);
    changeAppPageDisplay(pageDisplayProps, appNamePrefix);
}
// объеденил группу комманд в метод

15.
// before
document.getElementById("navbarShopAddress_0").style.visibility = "hidden";
document.getElementById("navbarShopAddress_1").style.visibility = "hidden";
document.getElementById("navbarShopAddress_2").style.visibility = "hidden";

// after
const NAVBAR_COUNT = 3;
const CSS_HIDDEN_PROP = "hidden";
const CSS_VISIBILITY_PROP = "visibility";
var elementsProps = createSameValuesArr(NAVBAR_COUNT, CSS_HIDDEN_PROP);
// idPrefix = 'navbarShopAddress_'
changeElementsProp(elementsProps, idPrefix, CSS_VISIBILITY_PROP);


/**
 * Change display prop for pages of app
 * @param {*} elementProps - array length countOfPages, each element contain "none", 
 *                               but one element is "block" or another value for show
 * @param {*} idPrefix  - prefix of app pages Id
 */
function changeElementsProp(elementProps, idPrefix, propName) {
    for (i = 0; i < elementProps.length; i++) {
        document.getElementById(idPrefix + i).style[propName] = elementProps[i];
    }
}

/**
 * 
 * @param {*} lengthOfArr - count of app pages
 * @returns array length countOfPages, each element contain, for example, "none"
 * ["none", "none", "none", ...];
 */
function createSameValuesArr(lengthOfArr, value) {
    var arrayWithSameValues = [];
    for (i = 0; i < lengthOfArr; i++) {
        arrayWithSameValues[i] = value
    }
    return arrayWithSameValues;
}
// объеденил группу комманд в метод

