class Hewan {
  bersuara() {
    console.log('Hewan bersuara: ...');
  }
}

class Kucing extends Hewan {
  bersuara() {
    console.log('Kucing bersuara: meong meong');
  }
}

class Anjing extends Hewan {
  bersuara() {
    console.log('Anjing bersuara: guk guk');
  }
}
