class Orang:
    def __init__(self, nama: str, umur: int):
        self.nama = nama
        self.umur = umur

    def keluarin_nama(self):
        print(f'Nama saya {self.nama}')

    def keluarin_umur(self):
        print(f'Umur saya {self.umur}')

    def ganti_nama(self, nama_baru):
        self.nama = nama_baru
        print(f'Nama baru saya: {self.nama}')

    def ganti_umur(self, umur_baru):
        self.umur = umur_baru
        print(f'Umur baru saya: {self.umur}')

    def makan(self):
        print('Class ini bisa makan')

    def tidur(self):
        print('Class ini bisa tidur')


class Programmer(Orang):
    def __init__(self, nama: str, umur: int):
        super().__init__(nama, umur)
        self.bahasa = ['Python', 'JavaScript', 'TypeScript']

    def coding(self):
        print('Class ini bisa coding')

    def tambah_bahasa(self, bahasa_baru: str):
        self.bahasa.append(bahasa_baru)
        print(f'Bahasa baru saya: {self.bahasa}')

    def keluarin_skill(self):
        print(f'Skill saya: {" ,".join(self.bahasa)}')


class Koki(Orang):
    def __init__(self, nama: str, umur: int):
        super().__init__(nama, umur)
        self.dishes = ['Nasi Goreng', 'Soto', 'Sate']

    def masak(self):
        print('Class ini bisa masak')

    def keluar_menu(self):
        print(f'Menu saya: {" ,".join(self.dishes)}')
