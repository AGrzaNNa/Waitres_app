package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TworzenieDan {
    public List <Dania> zupyLista = new List<Dania>() {

        Dania zupa1 = new Dania("Pomidorowa", 15.90);
        Dania zupa2 = new Dania("Ogórkowa", 13.90);
        Dania zupa3 = new Dania("Rosół", 15);
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Dania> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Dania dania) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Dania> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends Dania> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Dania get(int i) {
            return null;
        }

        @Override
        public Dania set(int i, Dania dania) {
            return null;
        }

        @Override
        public void add(int i, Dania dania) {

        }

        @Override
        public Dania remove(int i) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Dania> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Dania> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<Dania> subList(int i, int i1) {
            return null;
        }
    };
    public List<Dania>daniaGlowne = new List<Dania>() {

        Dania obiad1 = new Dania("Kotlet Schabowy", 24.90);
        Dania obiad2 = new Dania("Pierś z Kurczaka", 22.90);
        Dania obiad3 = new Dania("Hamburger Wołowy", 23.90);
        Dania obiad4 = new Dania("Sphagetti Bolognese", 23.90);
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Dania> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Dania dania) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Dania> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends Dania> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Dania get(int i) {
            return null;
        }

        @Override
        public Dania set(int i, Dania dania) {
            return null;
        }

        @Override
        public void add(int i, Dania dania) {

        }

        @Override
        public Dania remove(int i) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Dania> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Dania> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<Dania> subList(int i, int i1) {
            return null;
        }
    };
    public List<Dania> napoje = new List<Dania>() {
        Dania cola = new Dania("Coca Cola 0,33", 4.90);
        Dania sprite = new Dania("Sprite 0,33", 4.90);
        Dania fanta = new Dania("Fanta 0,33", 4.90);
        Dania herbata = new Dania("Herbata Czarna", 5.90);
        Dania herbataOwoc = new Dania("Herbata owocowa", 6.90);
        Dania sokOwocowy = new Dania("Sok świeżo wyciskany", 9.90);


        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Dania> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] ts) {
            return null;
        }

        @Override
        public boolean add(Dania dania) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Dania> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, @NonNull Collection<? extends Dania> collection) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Dania get(int i) {
            return null;
        }

        @Override
        public Dania set(int i, Dania dania) {
            return null;
        }

        @Override
        public void add(int i, Dania dania) {

        }

        @Override
        public Dania remove(int i) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Dania> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Dania> listIterator(int i) {
            return null;
        }

        @NonNull
        @Override
        public List<Dania> subList(int i, int i1) {
            return null;
        }
    };
//g
}
