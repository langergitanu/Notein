package OooOo;

import OooOoO0.C20511OooO00o;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import oO0O00.InterfaceC32498OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0<E> implements Collection<E>, Set<E>, oO0O00.OooO0O0, InterfaceC32498OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object[] f58461OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int[] f58462OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f58463OooOoO0;

    public final class OooO00o extends AbstractC20474OooO0o0<E> {
        public OooO00o() {
            super(OooO0O0.this.f58463OooOoO0);
        }

        @Override // OooOo.AbstractC20474OooO0o0
        public final E OooO00o(int i) {
            return (E) OooO0O0.this.f58461OooOo[i];
        }

        @Override // OooOo.AbstractC20474OooO0o0
        public final void OooO0O0(int i) {
            OooO0O0.this.OooO0O0(i);
        }
    }

    public OooO0O0(int i) {
        this.f58462OooOo0o = C20511OooO00o.f58580OooO00o;
        this.f58461OooOo = C20511OooO00o.f58582OooO0OO;
        if (i > 0) {
            OooO0OO.OooO00o(this, i);
        }
    }

    public final E OooO0O0(int i) {
        int i2 = this.f58463OooOoO0;
        Object[] objArr = this.f58461OooOo;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
            return e;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f58462OooOo0o;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                Oooo.OooO0OO.OooO0oO(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.f58461OooOo;
                Oooo.OooO0OO.OooO0oo(objArr2, i, objArr2, i4, i2);
            }
            this.f58461OooOo[i3] = null;
        } else {
            OooO0OO.OooO00o(this, i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                Oooo.OooO0OO.OooO(iArr, this.f58462OooOo0o, i, 6);
                Oooo.OooO0OO.OooOO0(objArr, 0, this.f58461OooOo, i, 6);
            }
            if (i < i3) {
                int i5 = i + 1;
                Oooo.OooO0OO.OooO0oO(iArr, this.f58462OooOo0o, i, i5, i2);
                Oooo.OooO0OO.OooO0oo(objArr, i, this.f58461OooOo, i5, i2);
            }
        }
        if (i2 != this.f58463OooOoO0) {
            throw new ConcurrentModificationException();
        }
        this.f58463OooOoO0 = i3;
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iOooO0O0;
        int i2 = this.f58463OooOoO0;
        if (e == null) {
            iOooO0O0 = OooO0OO.OooO0O0(this, null, 0);
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iOooO0O0 = OooO0OO.OooO0O0(this, e, iHashCode);
        }
        if (iOooO0O0 >= 0) {
            return false;
        }
        int i3 = ~iOooO0O0;
        int[] iArr = this.f58462OooOo0o;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f58461OooOo;
            OooO0OO.OooO00o(this, i4);
            if (i2 != this.f58463OooOoO0) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f58462OooOo0o;
            if (iArr2.length != 0) {
                Oooo.OooO0OO.OooO(iArr, iArr2, iArr.length, 6);
                Oooo.OooO0OO.OooOO0(objArr, 0, this.f58461OooOo, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f58462OooOo0o;
            int i5 = i3 + 1;
            Oooo.OooO0OO.OooO0oO(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f58461OooOo;
            Oooo.OooO0OO.OooO0oo(objArr2, i5, objArr2, i3, i2);
        }
        int i6 = this.f58463OooOoO0;
        if (i2 == i6) {
            int[] iArr4 = this.f58462OooOo0o;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f58461OooOo[i3] = e;
                this.f58463OooOoO0 = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        int size = elements.size() + this.f58463OooOoO0;
        int i = this.f58463OooOoO0;
        int[] iArr = this.f58462OooOo0o;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f58461OooOo;
            OooO0OO.OooO00o(this, size);
            int i2 = this.f58463OooOoO0;
            if (i2 > 0) {
                Oooo.OooO0OO.OooO(iArr, this.f58462OooOo0o, i2, 6);
                Oooo.OooO0OO.OooOO0(objArr, 0, this.f58461OooOo, this.f58463OooOoO0, 6);
            }
        }
        if (this.f58463OooOoO0 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f58463OooOoO0 != 0) {
            this.f58462OooOo0o = C20511OooO00o.f58580OooO00o;
            this.f58461OooOo = C20511OooO00o.f58582OooO0OO;
            this.f58463OooOoO0 = 0;
        }
        if (this.f58463OooOoO0 != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? OooO0OO.OooO0O0(this, null, 0) : OooO0OO.OooO0O0(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f58463OooOoO0 != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f58463OooOoO0;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f58461OooOo[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f58462OooOo0o;
        int i = this.f58463OooOoO0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f58463OooOoO0 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new OooO00o();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iOooO0O0 = obj == null ? OooO0OO.OooO0O0(this, null, 0) : OooO0OO.OooO0O0(this, obj, obj.hashCode());
        if (iOooO0O0 < 0) {
            return false;
        }
        OooO0O0(iOooO0O0);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        boolean z = false;
        for (int i = this.f58463OooOoO0 - 1; -1 < i; i--) {
            if (!oOo000Oo.OooOo.Oooo00o(elements, this.f58461OooOo[i])) {
                OooO0O0(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f58463OooOoO0;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return Oooo.OooO0OO.OooOOO0(this.f58461OooOo, 0, this.f58463OooOoO0);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f58463OooOoO0 * 14);
        sb.append('{');
        int i = this.f58463OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f58461OooOo[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        int i = this.f58463OooOoO0;
        if (array.length < i) {
            array = (T[]) ((Object[]) Array.newInstance(array.getClass().getComponentType(), i));
        } else if (array.length > i) {
            array[i] = null;
        }
        Oooo.OooO0OO.OooO0oo(this.f58461OooOo, 0, array, 0, this.f58463OooOoO0);
        return array;
    }

    public OooO0O0() {
        this(0);
    }
}
