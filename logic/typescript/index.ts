const [a, b, c, d] = [10, 1, 10, 30];

// Displaying a, b, c
console.log(`a = ${a}`);
console.log(`b = ${b}`);
console.log(`c = ${c}`);
console.log(`d = ${d}`);

// using logical OR to verify
// two constraints
if (a > b || c == d) console.log('One or both the conditions are true');
else console.log('Both the' + ' conditions are false');

// Using logical NOT operator
console.log(`!(a < b) = ${!(a < b)}`);
console.log(`!(a > b) = ${!(a > b)}`);
