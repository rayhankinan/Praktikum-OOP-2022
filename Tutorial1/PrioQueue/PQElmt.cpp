// PQElmt.cpp
#include "PQElmt.hpp"

PQElmt::PQElmt() {
  this->value = 0;
  this->prio = 0;
}

PQElmt::PQElmt(int value, int prio) {
  this->value = value;
  this->prio = prio;
}

PQElmt::PQElmt(const PQElmt& other) {
  this->value = other.value;
  this->prio = other.prio;
}

PQElmt::~PQElmt() {
  //
}

int PQElmt::getValue() const {
  return this->value;
}

int PQElmt::getPrio() const {
  return this->prio;
}

bool PQElmt::operator==(const PQElmt& other) {
  return this->getValue() == other.getValue() && this->getPrio() == other.getPrio();
}

bool PQElmt::operator<(const PQElmt& other) {
  if (this->getPrio() == other.getPrio()) {
    return this->getValue() > other.getValue();
  } else {
    return this->getPrio() < other.getPrio();
  }
}

bool PQElmt::operator>(const PQElmt& other) {
  if (this->getPrio() == other.getPrio()) {
    return this->getValue() < other.getValue();
  } else {
    return this->getPrio() > other.getPrio();
  }
}