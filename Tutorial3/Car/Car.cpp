#include "Car.h"

Car::Car(Fuel t_fuel) {
    this->fuel = t_fuel;
    this->gear = 0;
    this->ac_power = 0;
    this->on = false;
}

Fuel Car::getFuel() {
    return this->fuel;
}

int Car::getGear() {
    return this->gear;
}

int Car::getAcPower() {
    return this->ac_power;
}

bool Car::getOn() {
    return this->on;
}

void Car::fillingFuel(Fuel t_fuel, int amount_in_liter) {
    if (this->fuel != t_fuel) {
        throw t_fuel;
    } else {
        cout << "Berhasil isi bensin sebanyak " << amount_in_liter << " liter" << endl;
    }
}

void Car::changeGear(int t_gear) {
    if (t_gear < MIN_GEAR || t_gear > MAX_GEAR) {
        throw t_gear;
    } else {
        this->gear = t_gear;
        cout << "Berhasil mengubah gigi menjadi gigi " << t_gear << endl;
    }
}

void Car::changeAcPower(int t_ac_power) {
    if (t_ac_power < MIN_AC || t_ac_power > MAX_AC) {
        throw t_ac_power;
    } else {
        this->ac_power = t_ac_power;
        cout << "Berhasil mengubah power ac menjadi " << t_ac_power << endl;
    }
}

void Car::start() {
    if (this->on) {
        throw this->on;
    } else {
        this->on = true;
        cout << "Berhasil melakukan starter mobil" << endl;
    }
}

void Car::service(Fuel t_fuel, int amount_in_liter, int t_gear, int t_ac_power) {
    try {
        this->start();
        this->fillingFuel(t_fuel, amount_in_liter);
        this->changeGear(t_gear);
        this->changeAcPower(t_ac_power);
    } catch (Fuel&) {
        cout << "Bensin tidak sesuai" << endl;
    } catch (int &) {
        cout << "Input angka diluar range" << endl;
    } catch (bool&) {
        cout << "Mobil sudah menyala" << endl;
    }
}