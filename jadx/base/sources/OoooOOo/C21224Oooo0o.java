package OoooOOo;

import Oooo0oO.o000000O;
import OoooO00.InterfaceC21151OooO0OO;
import OoooOOo.C21207OooOo0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C24017OooO0oO;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OoooOOo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21224Oooo0o<T> implements List<T>, oO0O00.OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f61568OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21207OooOo0<T> f61569OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f61570OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61571OooOoO0;

    /* JADX INFO: renamed from: OoooOOo.Oooo0o$OooO00o */
    public static final class OooO00o implements ListIterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C21224Oooo0o<T> f61572OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C24033OooOooo f61573OooOo0o;

        public OooO00o(C24033OooOooo c24033OooOooo, C21224Oooo0o<T> c21224Oooo0o) {
            this.f61573OooOo0o = c24033OooOooo;
            this.f61572OooOo = c21224Oooo0o;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f61573OooOo0o.f80940OooOo0o < this.f61572OooOo.f61570OooOoO - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f61573OooOo0o.f80940OooOo0o >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            C24033OooOooo c24033OooOooo = this.f61573OooOo0o;
            int i = c24033OooOooo.f80940OooOo0o + 1;
            C21224Oooo0o<T> c21224Oooo0o = this.f61572OooOo;
            C21209OooOo0O.OooO00o(i, c21224Oooo0o.f61570OooOoO);
            c24033OooOooo.f80940OooOo0o = i;
            return c21224Oooo0o.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f61573OooOo0o.f80940OooOo0o + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            C24033OooOooo c24033OooOooo = this.f61573OooOo0o;
            int i = c24033OooOooo.f80940OooOo0o;
            C21224Oooo0o<T> c21224Oooo0o = this.f61572OooOo;
            C21209OooOo0O.OooO00o(i, c21224Oooo0o.f61570OooOoO);
            c24033OooOooo.f80940OooOo0o = i - 1;
            return c21224Oooo0o.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f61573OooOo0o.f80940OooOo0o;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C21224Oooo0o(C21207OooOo0<T> c21207OooOo0, int i, int i2) {
        this.f61569OooOo0o = c21207OooOo0;
        this.f61568OooOo = i;
        this.f61571OooOoO0 = c21207OooOo0.OooO0oO();
        this.f61570OooOoO = i2 - i;
    }

    public final void OooO0O0() {
        if (this.f61569OooOo0o.OooO0oO() != this.f61571OooOoO0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        OooO0O0();
        int i = this.f61568OooOo + this.f61570OooOoO;
        C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
        c21207OooOo0.add(i, t);
        this.f61570OooOoO++;
        this.f61571OooOoO0 = c21207OooOo0.OooO0oO();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.f61570OooOoO, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        if (this.f61570OooOoO > 0) {
            OooO0O0();
            C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
            int i2 = this.f61568OooOo;
            int i3 = this.f61570OooOoO + i2;
            do {
                Object obj = C21209OooOo0O.f61519OooO00o;
                synchronized (obj) {
                    C21207OooOo0.OooO00o oooO00o = c21207OooOo0.f61512OooOo0o;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C21207OooOo0.OooO00o oooO00o2 = (C21207OooOo0.OooO00o) C21200OooOOO0.OooO(oooO00o);
                    i = oooO00o2.f61514OooO0Oo;
                    interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
                OoooO0.OooO0o oooO0oBuilder = interfaceC21151OooO0OO.builder();
                oooO0oBuilder.subList(i2, i3).clear();
                InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OOOooO0o0 = oooO0oBuilder.OooO0o0();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21151OooO0OOOooO0o0, interfaceC21151OooO0OO)) {
                    break;
                }
                C21207OooOo0.OooO00o oooO00o3 = c21207OooOo0.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (C21200OooOOO0.f61496OooO0OO) {
                    abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                    C21207OooOo0.OooO00o oooO00o4 = (C21207OooOo0.OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, c21207OooOo0, abstractC21194OooO0oOOooOO0O);
                    synchronized (obj) {
                        int i4 = oooO00o4.f61514OooO0Oo;
                        if (i4 == i) {
                            oooO00o4.f61513OooO0OO = interfaceC21151OooO0OOOooO0o0;
                            oooO00o4.f61514OooO0Oo = i4 + 1;
                            oooO00o4.f61515OooO0o0++;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
                C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21207OooOo0);
            } while (!z);
            this.f61570OooOoO = 0;
            this.f61571OooOoO0 = this.f61569OooOo0o.OooO0oO();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        OooO0O0();
        C21209OooOo0O.OooO00o(i, this.f61570OooOoO);
        return this.f61569OooOo0o.get(this.f61568OooOo + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        OooO0O0();
        int i = this.f61570OooOoO;
        int i2 = this.f61568OooOo;
        Iterator<Integer> it = oO0O00oo.OooOO0.OooO(i2, i + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((oOo000Oo.Oooo000) it).nextInt();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f61569OooOo0o.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f61570OooOoO == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        OooO0O0();
        int i = this.f61570OooOoO;
        int i2 = this.f61568OooOo;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f61569OooOo0o.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        OooO0O0();
        C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
        int i2 = this.f61568OooOo;
        int i3 = this.f61570OooOoO + i2;
        int size = c21207OooOo0.size();
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                C21207OooOo0.OooO00o oooO00o = c21207OooOo0.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C21207OooOo0.OooO00o oooO00o2 = (C21207OooOo0.OooO00o) C21200OooOOO0.OooO(oooO00o);
                i = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            OoooO0.OooO0o oooO0oBuilder = interfaceC21151OooO0OO.builder();
            oooO0oBuilder.subList(i2, i3).retainAll(collection);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OOOooO0o0 = oooO0oBuilder.OooO0o0();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21151OooO0OOOooO0o0, interfaceC21151OooO0OO)) {
                break;
            }
            C21207OooOo0.OooO00o oooO00o3 = c21207OooOo0.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                C21207OooOo0.OooO00o oooO00o4 = (C21207OooOo0.OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, c21207OooOo0, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i4 = oooO00o4.f61514OooO0Oo;
                    if (i4 == i) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OOOooO0o0;
                        oooO00o4.f61514OooO0Oo = i4 + 1;
                        oooO00o4.f61515OooO0o0++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21207OooOo0);
        } while (!z);
        int size2 = size - c21207OooOo0.size();
        if (size2 > 0) {
            this.f61571OooOoO0 = this.f61569OooOo0o.OooO0oO();
            this.f61570OooOoO -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        C21209OooOo0O.OooO00o(i, this.f61570OooOoO);
        OooO0O0();
        int i2 = i + this.f61568OooOo;
        C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
        T t2 = c21207OooOo0.set(i2, t);
        this.f61571OooOoO0 = c21207OooOo0.OooO0oO();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f61570OooOoO;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.f61570OooOoO)) {
            o000000O.OooO0O0("fromIndex or toIndex are out of bounds");
            throw null;
        }
        OooO0O0();
        int i3 = this.f61568OooOo;
        return new C21224Oooo0o(this.f61569OooOo0o, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        OooO0O0();
        C24033OooOooo c24033OooOooo = new C24033OooOooo();
        c24033OooOooo.f80940OooOo0o = i - 1;
        return new OooO00o(c24033OooOooo, this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C24017OooO0oO.OooO0O0(this, tArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        OooO0O0();
        int i2 = i + this.f61568OooOo;
        C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
        boolean zAddAll = c21207OooOo0.addAll(i2, collection);
        if (zAddAll) {
            this.f61570OooOoO = collection.size() + this.f61570OooOoO;
            this.f61571OooOoO0 = c21207OooOo0.OooO0oO();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i) {
        OooO0O0();
        int i2 = this.f61568OooOo + i;
        C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
        T tRemove = c21207OooOo0.remove(i2);
        this.f61570OooOoO--;
        this.f61571OooOoO0 = c21207OooOo0.OooO0oO();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        OooO0O0();
        int i2 = this.f61568OooOo + i;
        C21207OooOo0<T> c21207OooOo0 = this.f61569OooOo0o;
        c21207OooOo0.add(i2, t);
        this.f61570OooOoO++;
        this.f61571OooOoO0 = c21207OooOo0.OooO0oO();
    }
}
