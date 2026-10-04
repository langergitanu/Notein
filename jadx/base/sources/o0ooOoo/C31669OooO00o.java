package o0ooOoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31432OooO;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31437OooO0o;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31442OooOO0O;
import o0ooO0Oo.C31450OooOOoo;

/* JADX INFO: renamed from: o0ooOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31669OooO00o<E> implements List<E> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f113203OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31433OooO00o f113204OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C31436OooO0Oo f113205OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f113206OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C31441OooOO0 f113207OooOoOO;

    public C31669OooO00o() {
        this.f113206OooOoO0 = false;
        this.f113204OooOo0o = new C31433OooO00o();
        this.f113203OooOo = new ArrayList();
    }

    public static C31669OooO00o OooO0O0(C31433OooO00o c31433OooO00o) {
        if (c31433OooO00o == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c31433OooO00o.f112214OooOo.size(); i++) {
            arrayList.add(((C31450OooOOoo) c31433OooO00o.Oooo0OO(i)).OooOooo());
        }
        return new C31669OooO00o(arrayList, c31433OooO00o);
    }

    public static C31433OooO00o OooO0OO(ArrayList arrayList) {
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        for (E e : arrayList) {
            if (e instanceof String) {
                c31433OooO00o.OooOooo(new C31450OooOOoo((String) e));
            } else if ((e instanceof Integer) || (e instanceof Long)) {
                c31433OooO00o.OooOooo(C31432OooO.o0Oo0oo(((Number) e).longValue()));
            } else if ((e instanceof Float) || (e instanceof Double)) {
                c31433OooO00o.OooOooo(new C31437OooO0o(((Number) e).floatValue()));
            } else if (e instanceof InterfaceC31671OooO0OO) {
                c31433OooO00o.OooOooo(((InterfaceC31671OooO0OO) e).OooOOo0());
            } else {
                if (e != null) {
                    throw new IllegalArgumentException("Error: Don't know how to convert type to COSBase '" + e.getClass().getName() + "'");
                }
                c31433OooO00o.OooOooo(C31442OooOO0O.f112464OooOoO0);
            }
        }
        return c31433OooO00o;
    }

    public static ArrayList OooO0Oo(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (E e : collection) {
            if (e instanceof String) {
                arrayList.add(new C31450OooOOoo((String) e));
            } else {
                arrayList.add(((InterfaceC31671OooO0OO) e).OooOOo0());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        C31436OooO0Oo c31436OooO0Oo = this.f113205OooOoO;
        C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
        if (c31436OooO0Oo != null) {
            c31436OooO0Oo.o000OoOO(this.f113207OooOoOO, c31433OooO00o);
            this.f113205OooOoO = null;
        }
        if (e instanceof String) {
            c31433OooO00o.OooOooo(new C31450OooOOoo((String) e));
        } else if (c31433OooO00o != null) {
            c31433OooO00o.OooOooo(((InterfaceC31671OooO0OO) e).OooOOo0());
        }
        return this.f113203OooOo.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        if (this.f113206OooOoO0) {
            throw new UnsupportedOperationException("Adding to a filtered List is not permitted");
        }
        C31436OooO0Oo c31436OooO0Oo = this.f113205OooOoO;
        C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
        if (c31436OooO0Oo != null && collection.size() > 0) {
            this.f113205OooOoO.o000OoOO(this.f113207OooOoOO, c31433OooO00o);
            this.f113205OooOoO = null;
        }
        c31433OooO00o.f112214OooOo.addAll(OooO0Oo(collection));
        return this.f113203OooOo.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        C31436OooO0Oo c31436OooO0Oo = this.f113205OooOoO;
        if (c31436OooO0Oo != null) {
            c31436OooO0Oo.o000OoOO(this.f113207OooOoOO, null);
        }
        this.f113203OooOo.clear();
        this.f113204OooOo0o.f112214OooOo.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f113203OooOo.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f113203OooOo.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f113203OooOo.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i) {
        return (E) this.f113203OooOo.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f113203OooOo.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f113203OooOo.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f113203OooOo.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f113203OooOo.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f113203OooOo.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.f113203OooOo.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        if (this.f113206OooOoO0) {
            throw new UnsupportedOperationException("removing entries from a filtered List is not permitted");
        }
        ArrayList arrayList = this.f113203OooOo;
        int iIndexOf = arrayList.indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        arrayList.remove(iIndexOf);
        this.f113204OooOo0o.o0Oo0oo(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooOOo0 = ((InterfaceC31671OooO0OO) it.next()).OooOOo0();
            C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
            for (int size = c31433OooO00o.f112214OooOo.size() - 1; size >= 0; size--) {
                if (abstractC31434OooO0O0OooOOo0.equals(c31433OooO00o.Oooo0OO(size))) {
                    c31433OooO00o.o0Oo0oo(size);
                }
            }
        }
        return this.f113203OooOo.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            AbstractC31434OooO0O0 abstractC31434OooO0O0OooOOo0 = ((InterfaceC31671OooO0OO) it.next()).OooOOo0();
            C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
            for (int size = c31433OooO00o.f112214OooOo.size() - 1; size >= 0; size--) {
                if (!abstractC31434OooO0O0OooOOo0.equals(c31433OooO00o.Oooo0OO(size))) {
                    c31433OooO00o.o0Oo0oo(size);
                }
            }
        }
        return this.f113203OooOo.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final E set(int i, E e) {
        if (this.f113206OooOoO0) {
            throw new UnsupportedOperationException("Replacing an element in a filtered List is not permitted");
        }
        boolean z = e instanceof String;
        C31441OooOO0 c31441OooOO0 = this.f113207OooOoOO;
        C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
        if (z) {
            C31450OooOOoo c31450OooOOoo = new C31450OooOOoo((String) e);
            C31436OooO0Oo c31436OooO0Oo = this.f113205OooOoO;
            if (c31436OooO0Oo != null && i == 0) {
                c31436OooO0Oo.o000OoOO(c31441OooOO0, c31450OooOOoo);
            }
            c31433OooO00o.o0000O0O(i, c31450OooOOoo);
        } else {
            C31436OooO0Oo c31436OooO0Oo2 = this.f113205OooOoO;
            if (c31436OooO0Oo2 != null && i == 0) {
                c31436OooO0Oo2.o000OoOO(c31441OooOO0, ((InterfaceC31671OooO0OO) e).OooOOo0());
            }
            c31433OooO00o.o0000O0O(i, ((InterfaceC31671OooO0OO) e).OooOOo0());
        }
        return (E) this.f113203OooOo.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f113203OooOo.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        return this.f113203OooOo.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f113203OooOo.toArray();
    }

    public final String toString() {
        return "COSArrayList{" + this.f113204OooOo0o.toString() + "}";
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        return this.f113203OooOo.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final <X> X[] toArray(X[] xArr) {
        return (X[]) this.f113203OooOo.toArray(xArr);
    }

    public C31669OooO00o(ArrayList arrayList, C31433OooO00o c31433OooO00o) {
        this.f113206OooOoO0 = false;
        this.f113203OooOo = arrayList;
        this.f113204OooOo0o = c31433OooO00o;
        if (arrayList.size() != c31433OooO00o.f112214OooOo.size()) {
            this.f113206OooOoO0 = true;
        }
    }

    @Override // java.util.List
    public final E remove(int i) {
        if (!this.f113206OooOoO0) {
            this.f113204OooOo0o.o0Oo0oo(i);
            return (E) this.f113203OooOo.remove(i);
        }
        throw new UnsupportedOperationException("removing entries from a filtered List is not permitted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final void add(int i, E e) {
        if (!this.f113206OooOoO0) {
            C31436OooO0Oo c31436OooO0Oo = this.f113205OooOoO;
            C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
            if (c31436OooO0Oo != null) {
                c31436OooO0Oo.o000OoOO(this.f113207OooOoOO, c31433OooO00o);
                this.f113205OooOoO = null;
            }
            this.f113203OooOo.add(i, e);
            if (e instanceof String) {
                c31433OooO00o.f112214OooOo.add(i, new C31450OooOOoo((String) e));
                return;
            } else {
                c31433OooO00o.f112214OooOo.add(i, ((InterfaceC31671OooO0OO) e).OooOOo0());
                return;
            }
        }
        throw new UnsupportedOperationException("Adding an element in a filtered List is not permitted");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        if (!this.f113206OooOoO0) {
            C31436OooO0Oo c31436OooO0Oo = this.f113205OooOoO;
            C31433OooO00o c31433OooO00o = this.f113204OooOo0o;
            if (c31436OooO0Oo != null && collection.size() > 0) {
                this.f113205OooOoO.o000OoOO(this.f113207OooOoOO, c31433OooO00o);
                this.f113205OooOoO = null;
            }
            c31433OooO00o.f112214OooOo.addAll(i, OooO0Oo(collection));
            return this.f113203OooOo.addAll(i, collection);
        }
        throw new UnsupportedOperationException("Inserting to a filtered List is not permitted");
    }

    public C31669OooO00o(C31436OooO0Oo c31436OooO0Oo, C31441OooOO0 c31441OooOO0) {
        this.f113206OooOoO0 = false;
        this.f113204OooOo0o = new C31433OooO00o();
        this.f113203OooOo = new ArrayList();
        this.f113205OooOoO = c31436OooO0Oo;
        this.f113207OooOoOO = c31441OooOO0;
    }
}
