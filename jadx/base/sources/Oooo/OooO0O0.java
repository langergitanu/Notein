package Oooo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C24017OooO0oO;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<T> implements RandomAccess {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooO00o f59744OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public T[] f59745OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f59746OooOoO0 = 0;

    public static final class OooO00o<T> implements List<T>, oO0O00.OooO0OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0O0<T> f59747OooOo0o;

        public OooO00o(OooO0O0<T> oooO0O0) {
            this.f59747OooOo0o = oooO0O0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            this.f59747OooOo0o.OooO0O0(t);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            OooO0O0<T> oooO0O0 = this.f59747OooOo0o;
            return oooO0O0.OooO0Oo(oooO0O0.f59746OooOoO0, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f59747OooOo0o.OooO0o();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f59747OooOo0o.OooO0oO(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            OooO0O0<T> oooO0O0 = this.f59747OooOo0o;
            oooO0O0.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!oooO0O0.OooO0oO(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            Oooo.OooO0OO.OooO0O0(i, this);
            return this.f59747OooOo0o.f59745OooOo0o[i];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            OooO0O0<T> oooO0O0 = this.f59747OooOo0o;
            int i = oooO0O0.f59746OooOoO0;
            if (i <= 0) {
                return -1;
            }
            T[] tArr = oooO0O0.f59745OooOo0o;
            int i2 = 0;
            while (!OooOOO0.OooO0O0(obj, tArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f59747OooOo0o.OooO();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new OooO0OO(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            OooO0O0<T> oooO0O0 = this.f59747OooOo0o;
            int i = oooO0O0.f59746OooOoO0;
            if (i <= 0) {
                return -1;
            }
            int i2 = i - 1;
            T[] tArr = oooO0O0.f59745OooOo0o;
            while (!OooOOO0.OooO0O0(obj, tArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new OooO0OO(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f59747OooOo0o.OooOO0O(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            OooO0O0<T> oooO0O0 = this.f59747OooOo0o;
            oooO0O0.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i = oooO0O0.f59746OooOoO0;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                oooO0O0.OooOO0O(it.next());
            }
            return i != oooO0O0.f59746OooOoO0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            OooO0O0<T> oooO0O0 = this.f59747OooOo0o;
            int i = oooO0O0.f59746OooOoO0;
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (!collection.contains(oooO0O0.f59745OooOo0o[i2])) {
                    oooO0O0.OooOO0o(i2);
                }
            }
            return i != oooO0O0.f59746OooOoO0;
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            Oooo.OooO0OO.OooO0O0(i, this);
            T[] tArr = this.f59747OooOo0o.f59745OooOo0o;
            T t2 = tArr[i];
            tArr[i] = t;
            return t2;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f59747OooOo0o.f59746OooOoO0;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            Oooo.OooO0OO.OooO0OO(this, i, i2);
            return new C18974OooO0O0(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C24017OooO0oO.OooO00o(this);
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            this.f59747OooOo0o.OooO00o(i, t);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new OooO0OO(this, i);
        }

        @Override // java.util.List
        public final T remove(int i) {
            Oooo.OooO0OO.OooO0O0(i, this);
            return this.f59747OooOo0o.OooOO0o(i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C24017OooO0oO.OooO0O0(this, tArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            return this.f59747OooOo0o.OooO0Oo(i, collection);
        }
    }

    /* JADX INFO: renamed from: Oooo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C18974OooO0O0<T> implements List<T>, oO0O00.OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f59748OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Object f59749OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f59750OooOoO0;

        public C18974OooO0O0(List<T> list, int i, int i2) {
            this.f59749OooOo0o = list;
            this.f59748OooOo = i;
            this.f59750OooOoO0 = i2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            int i = this.f59750OooOoO0;
            this.f59750OooOoO0 = i + 1;
            this.f59749OooOo0o.add(i, t);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            this.f59749OooOo0o.addAll(i + this.f59748OooOo, collection);
            this.f59750OooOoO0 = collection.size() + this.f59750OooOoO0;
            return collection.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.f59750OooOoO0 - 1;
            int i2 = this.f59748OooOo;
            if (i2 <= i) {
                while (true) {
                    this.f59749OooOo0o.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.f59750OooOoO0 = i2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i = this.f59750OooOoO0;
            for (int i2 = this.f59748OooOo; i2 < i; i2++) {
                if (OooOOO0.OooO0O0(this.f59749OooOo0o.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T get(int i) {
            Oooo.OooO0OO.OooO0O0(i, this);
            return (T) this.f59749OooOo0o.get(i + this.f59748OooOo);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f59750OooOoO0;
            int i2 = this.f59748OooOo;
            for (int i3 = i2; i3 < i; i3++) {
                if (OooOOO0.OooO0O0(this.f59749OooOo0o.get(i3), obj)) {
                    return i3 - i2;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f59750OooOoO0 == this.f59748OooOo;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new OooO0OO(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f59750OooOoO0 - 1;
            int i2 = this.f59748OooOo;
            if (i2 > i) {
                return -1;
            }
            while (!OooOOO0.OooO0O0(this.f59749OooOo0o.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new OooO0OO(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i = this.f59750OooOoO0;
            for (int i2 = this.f59748OooOo; i2 < i; i2++) {
                ?? r2 = this.f59749OooOo0o;
                if (OooOOO0.OooO0O0(r2.get(i2), obj)) {
                    r2.remove(i2);
                    this.f59750OooOoO0--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            int i = this.f59750OooOoO0;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.f59750OooOoO0;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            int i = this.f59750OooOoO0;
            int i2 = i - 1;
            int i3 = this.f59748OooOo;
            if (i3 <= i2) {
                while (true) {
                    ?? r3 = this.f59749OooOo0o;
                    if (!collection.contains(r3.get(i2))) {
                        r3.remove(i2);
                        this.f59750OooOoO0--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.f59750OooOoO0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i, T t) {
            Oooo.OooO0OO.OooO0O0(i, this);
            return (T) this.f59749OooOo0o.set(i + this.f59748OooOo, t);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f59750OooOoO0 - this.f59748OooOo;
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            Oooo.OooO0OO.OooO0OO(this, i, i2);
            return new C18974OooO0O0(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C24017OooO0oO.OooO00o(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i, T t) {
            this.f59749OooOo0o.add(i + this.f59748OooOo, t);
            this.f59750OooOoO0++;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            return new OooO0OO(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C24017OooO0oO.OooO0O0(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            this.f59749OooOo0o.addAll(this.f59750OooOoO0, collection);
            this.f59750OooOoO0 = collection.size() + this.f59750OooOoO0;
            return collection.size() > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i) {
            Oooo.OooO0OO.OooO0O0(i, this);
            this.f59750OooOoO0--;
            return (T) this.f59749OooOo0o.remove(i + this.f59748OooOo);
        }
    }

    public static final class OooO0OO<T> implements ListIterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f59751OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Object f59752OooOo0o;

        public OooO0OO(List<T> list, int i) {
            this.f59752OooOo0o = list;
            this.f59751OooOo = i;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t) {
            this.f59752OooOo0o.add(this.f59751OooOo, t);
            this.f59751OooOo++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f59751OooOo < this.f59752OooOo0o.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f59751OooOo > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i = this.f59751OooOo;
            this.f59751OooOo = i + 1;
            return (T) this.f59752OooOo0o.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f59751OooOo;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i = this.f59751OooOo - 1;
            this.f59751OooOo = i;
            return (T) this.f59752OooOo0o.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f59751OooOo - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i = this.f59751OooOo - 1;
            this.f59751OooOo = i;
            this.f59752OooOo0o.remove(i);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t) {
            this.f59752OooOo0o.set(this.f59751OooOo, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OooO0O0(Object[] objArr) {
        this.f59745OooOo0o = objArr;
    }

    public final boolean OooO() {
        return this.f59746OooOoO0 == 0;
    }

    public final void OooO00o(int i, T t) {
        OooO0oo(this.f59746OooOoO0 + 1);
        T[] tArr = this.f59745OooOo0o;
        int i2 = this.f59746OooOoO0;
        if (i != i2) {
            Oooo.OooO0OO.OooO0oo(tArr, i + 1, tArr, i, i2);
        }
        tArr[i] = t;
        this.f59746OooOoO0++;
    }

    public final void OooO0O0(Object obj) {
        OooO0oo(this.f59746OooOoO0 + 1);
        Object[] objArr = (T[]) this.f59745OooOo0o;
        int i = this.f59746OooOoO0;
        objArr[i] = obj;
        this.f59746OooOoO0 = i + 1;
    }

    public final void OooO0OO(int i, OooO0O0 oooO0O0) {
        if (oooO0O0.OooO()) {
            return;
        }
        OooO0oo(this.f59746OooOoO0 + oooO0O0.f59746OooOoO0);
        T[] tArr = this.f59745OooOo0o;
        int i2 = this.f59746OooOoO0;
        if (i != i2) {
            Oooo.OooO0OO.OooO0oo(tArr, oooO0O0.f59746OooOoO0 + i, tArr, i, i2);
        }
        Oooo.OooO0OO.OooO0oo(oooO0O0.f59745OooOo0o, i, tArr, 0, oooO0O0.f59746OooOoO0);
        this.f59746OooOoO0 += oooO0O0.f59746OooOoO0;
    }

    public final boolean OooO0Oo(int i, Collection<? extends T> collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        OooO0oo(collection.size() + this.f59746OooOoO0);
        T[] tArr = this.f59745OooOo0o;
        if (i != this.f59746OooOoO0) {
            Oooo.OooO0OO.OooO0oo(tArr, collection.size() + i, tArr, i, this.f59746OooOoO0);
        }
        for (T t : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            tArr[i2 + i] = t;
            i2 = i3;
        }
        this.f59746OooOoO0 = collection.size() + this.f59746OooOoO0;
        return true;
    }

    public final void OooO0o() {
        T[] tArr = this.f59745OooOo0o;
        int i = this.f59746OooOoO0;
        while (true) {
            i--;
            if (-1 >= i) {
                this.f59746OooOoO0 = 0;
                return;
            }
            tArr[i] = null;
        }
    }

    public final List<T> OooO0o0() {
        OooO00o oooO00o = this.f59744OooOo;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO00o oooO00o2 = new OooO00o(this);
        this.f59744OooOo = oooO00o2;
        return oooO00o2;
    }

    public final boolean OooO0oO(T t) {
        int i = this.f59746OooOoO0 - 1;
        if (i >= 0) {
            for (int i2 = 0; !OooOOO0.OooO0O0(this.f59745OooOo0o[i2], t); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void OooO0oo(int i) {
        T[] tArr = this.f59745OooOo0o;
        if (tArr.length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            OooOOO0.OooO0o(tArr2, "copyOf(this, newSize)");
            this.f59745OooOo0o = tArr2;
        }
    }

    public final boolean OooOO0() {
        return this.f59746OooOoO0 != 0;
    }

    public final boolean OooOO0O(T t) {
        int i;
        int i2 = this.f59746OooOoO0;
        if (i2 <= 0) {
            i = -1;
            break;
        }
        T[] tArr = this.f59745OooOo0o;
        i = 0;
        while (!OooOOO0.OooO0O0(t, tArr[i])) {
            i++;
            if (i >= i2) {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        OooOO0o(i);
        return true;
    }

    public final T OooOO0o(int i) {
        T[] tArr = this.f59745OooOo0o;
        T t = tArr[i];
        int i2 = this.f59746OooOoO0;
        if (i != i2 - 1) {
            Oooo.OooO0OO.OooO0oo(tArr, i, tArr, i + 1, i2);
        }
        int i3 = this.f59746OooOoO0 - 1;
        this.f59746OooOoO0 = i3;
        tArr[i3] = null;
        return t;
    }

    public final void OooOOO0(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f59746OooOoO0;
            if (i2 < i3) {
                T[] tArr = this.f59745OooOo0o;
                Oooo.OooO0OO.OooO0oo(tArr, i, tArr, i2, i3);
            }
            int i4 = this.f59746OooOoO0;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f59745OooOo0o[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f59746OooOoO0 = i5;
        }
    }
}
