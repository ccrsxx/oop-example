class Orang {
  public nama: string;
  public umur: number;

  constructor(nama: string, umur: number) {
    this.nama = nama;
    this.umur = umur;
  }

  keluarinNama() {
    console.log(`Nama saya ${this.nama}`);
  }

  keluarinUmur() {
    console.log(`Umur saya ${this.umur}`);
  }

  gantiNama(namaBaru: string) {
    this.nama = namaBaru;
    console.log(`Nama baru saya: ${this.nama}`);
  }

  gantiUmur(umurBaru: number) {
    this.umur = umurBaru;
    console.log(`Umur baru saya: ${this.umur}`);
  }

  makan() {
    console.log('Class ini bisa makan');
  }

  tidur() {
    console.log('Class ini bisa tidur');
  }
}

class Programmer extends Orang {
  public bahasa = ['Python', 'JavaScript', 'TypeScript'];

  constructor(nama: string, umur: number) {
    super(nama, umur);
  }

  coding() {
    console.log('Class ini bisa coding');
  }

  tambahBahasa(bahasaBaru: string) {
    this.bahasa.push(bahasaBaru);
    console.log(`Bahasa baru saya: ${this.bahasa}`);
  }

  keluarinSkill() {
    console.log(`Bahasa yang dikuasai: ${this.bahasa.join(', ')}`);
  }
}

class Koki extends Orang {
  public dishes = ['Nasi Goreng', 'Sate', 'Soto'];

  constructor(nama: string, umur: number) {
    super(nama, umur);
  }

  masak() {
    console.log('Class ini bisa masak');
  }

  keluarinMenu() {
    console.log(`Menu yang disajikan: ${this.dishes.join(', ')}`);
  }
}
