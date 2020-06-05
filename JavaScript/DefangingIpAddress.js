/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    // using JavaScript libraries are faster than manually generating the result
    return address.split(".").join("[.]");
    
    // var result = '';
    // for(var i = 0; i < address.length; ++i){
    //     if(address[i] === '.') result += '[.]'
    //     else result += address[i];
    // }
    // return result;
};