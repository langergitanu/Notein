package oO0OOOO0;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: oO0OOOO0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32966OooOo0o extends AbstractList<String> implements RandomAccess, OooOOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooOOO0 f119143OooOo0o;

    /* JADX INFO: renamed from: oO0OOOO0.OooOo0o$OooO00o */
    public class OooO00o implements ListIterator<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public ListIterator<String> f119144OooOo0o;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f119144OooOo0o.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f119144OooOo0o.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f119144OooOo0o.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f119144OooOo0o.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f119144OooOo0o.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f119144OooOo0o.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOo0o$OooO0O0 */
    public class OooO0O0 implements Iterator<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Iterator<String> f119145OooOo0o;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f119145OooOo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f119145OooOo0o.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C32966OooOo0o(OooOOO0 oooOOO0) {
        this.f119143OooOo0o = oooOOO0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f119143OooOo0o.get(i);
    }

    @Override // oO0OOOO0.OooOOO
    public final OooO0OO getByteString(int i) {
        return this.f119143OooOo0o.getByteString(i);
    }

    @Override // oO0OOOO0.OooOOO
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f119143OooOo0o.f119100OooOo0o);
    }

    @Override // oO0OOOO0.OooOOO
    public final C32966OooOo0o getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f119145OooOo0o = this.f119143OooOo0o.iterator();
        return oooO0O0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f119144OooOo0o = this.f119143OooOo0o.listIterator(i);
        return oooO00o;
    }

    @Override // oO0OOOO0.OooOOO
    public final void o00000OO(OooOOOO oooOOOO) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f119143OooOo0o.size();
    }
}
