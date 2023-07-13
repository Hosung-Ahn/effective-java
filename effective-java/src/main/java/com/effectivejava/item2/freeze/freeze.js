'use strict'

const person = {
    "name": "hosung",
    "age": 10
};

Object.freeze(person);

person.name = "asdasd";
person.email = "123@123"
console.log(person);