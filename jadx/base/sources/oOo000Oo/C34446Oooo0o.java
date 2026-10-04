package oOo000Oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: oOo000Oo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34446Oooo0o<T> extends AbstractC34424OooO0oO<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f123470OooOo0o;

    /* JADX INFO: renamed from: oOo000Oo.Oooo0o$OooO00o */
    public static final class OooO00o implements ListIterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C34446Oooo0o<T> f123471OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final ListIterator<T> f123472OooOo0o;

        public OooO00o(C34446Oooo0o<T> c34446Oooo0o, int i) {
            this.f123471OooOo = c34446Oooo0o;
            this.f123472OooOo0o = c34446Oooo0o.f123470OooOo0o.listIterator(C34431OooOo0.OooOo0O(c34446Oooo0o, i));
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            ListIterator<T> listIterator = this.f123472OooOo0o;
            listIterator.add(t);
            listIterator.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f123472OooOo0o.hasPrevious();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f123472OooOo0o.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            return this.f123472OooOo0o.previous();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return C34429OooOOo0.OooOO0O(this.f123471OooOo) - this.f123472OooOo0o.previousIndex();
        }

        @Override // java.util.ListIterator
        public final T previous() {
            return this.f123472OooOo0o.next();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return C34429OooOOo0.OooOO0O(this.f123471OooOo) - this.f123472OooOo0o.nextIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.f123472OooOo0o.remove();
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            this.f123472OooOo0o.set(t);
        }
    }

    public C34446Oooo0o(ArrayList arrayList) {
        this.f123470OooOo0o = arrayList;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final int OooO0O0() {
        return this.f123470OooOo0o.size();
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final T OooO0Oo(int i) {
        return (T) this.f123470OooOo0o.remove(C34431OooOo0.OooOo0(this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, T t) {
        this.f123470OooOo0o.add(C34431OooOo0.OooOo0O(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f123470OooOo0o.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.f123470OooOo0o.get(C34431OooOo0.OooOo0(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new OooO00o(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator() {
        return new OooO00o(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        return (T) this.f123470OooOo0o.set(C34431OooOo0.OooOo0(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new OooO00o(this, i);
    }
}
