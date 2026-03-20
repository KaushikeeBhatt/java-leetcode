/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    var hasBeencalled=false;
    let res;
    return function(...args){
        if(!hasBeencalled){
            res=fn(...args)
            hasBeencalled=true;
            return res
        }
        return undefined
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */
