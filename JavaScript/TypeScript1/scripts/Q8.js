"use strict";
const URL_Join = (...args) => args
    .join('/')
    .replace(/[\/]+/g, '/')
    .replace(/^(.+):\//, '$1://')
    .replace(/^file:/, 'file:/')
    .replace(/\/(\?|&|#[^!])/g, '$1')
    .replace(/\?/g, '&')
    .replace('&', '?');
console.log(URL_Join('http://www.google.com', 'abc', '/bcd/cde', '?foo=123', '?bar=foo'));
