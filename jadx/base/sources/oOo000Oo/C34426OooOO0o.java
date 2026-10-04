package oOo000Oo;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import oOo000Oo.AbstractC34421OooO0Oo;

/* JADX INFO: renamed from: oOo000Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34426OooOO0o<E> extends AbstractC34424OooO0oO<E> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Object[] f123444OooOoO = new Object[0];

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object[] f123445OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f123446OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f123447OooOoO0;

    public C34426OooOO0o() {
        this.f123445OooOo = f123444OooOoO;
    }

    public final int OooO(int i) {
        return i < 0 ? i + this.f123445OooOo.length : i;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final int OooO0O0() {
        return this.f123447OooOoO0;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final E OooO0Oo(int i) {
        int i2 = this.f123447OooOoO0;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        if (i == C34429OooOOo0.OooOO0O(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        OooOO0o();
        int iOooOO0O = OooOO0O(this.f123446OooOo0o + i);
        Object[] objArr = this.f123445OooOo;
        E e = (E) objArr[iOooOO0O];
        if (i < (this.f123447OooOoO0 >> 1)) {
            int i3 = this.f123446OooOo0o;
            if (iOooOO0O >= i3) {
                Oooo.OooO0OO.OooO0oo(objArr, i3 + 1, objArr, i3, iOooOO0O);
            } else {
                Oooo.OooO0OO.OooO0oo(objArr, 1, objArr, 0, iOooOO0O);
                Object[] objArr2 = this.f123445OooOo;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f123446OooOo0o;
                Oooo.OooO0OO.OooO0oo(objArr2, i4 + 1, objArr2, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f123445OooOo;
            int i5 = this.f123446OooOo0o;
            objArr3[i5] = null;
            this.f123446OooOo0o = OooO0oO(i5);
        } else {
            int iOooOO0O2 = OooOO0O(C34429OooOOo0.OooOO0O(this) + this.f123446OooOo0o);
            if (iOooOO0O <= iOooOO0O2) {
                Object[] objArr4 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr4, iOooOO0O, objArr4, iOooOO0O + 1, iOooOO0O2 + 1);
            } else {
                Object[] objArr5 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr5, iOooOO0O, objArr5, iOooOO0O + 1, objArr5.length);
                Object[] objArr6 = this.f123445OooOo;
                objArr6[objArr6.length - 1] = objArr6[0];
                Oooo.OooO0OO.OooO0oo(objArr6, 0, objArr6, 1, iOooOO0O2 + 1);
            }
            this.f123445OooOo[iOooOO0O2] = null;
        }
        this.f123447OooOoO0--;
        return e;
    }

    public final void OooO0o(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f123445OooOo;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f123444OooOoO) {
            if (i < 10) {
                i = 10;
            }
            this.f123445OooOo = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        Oooo.OooO0OO.OooO0oo(objArr, 0, objArr2, this.f123446OooOo0o, objArr.length);
        Object[] objArr3 = this.f123445OooOo;
        int length2 = objArr3.length;
        int i3 = this.f123446OooOo0o;
        Oooo.OooO0OO.OooO0oo(objArr3, length2 - i3, objArr2, 0, i3);
        this.f123446OooOo0o = 0;
        this.f123445OooOo = objArr2;
    }

    public final void OooO0o0(int i, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f123445OooOo.length;
        while (i < length && it.hasNext()) {
            this.f123445OooOo[i] = it.next();
            i++;
        }
        int i2 = this.f123446OooOo0o;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f123445OooOo[i3] = it.next();
        }
        this.f123447OooOoO0 = collection.size() + this.f123447OooOoO0;
    }

    public final int OooO0oO(int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(this.f123445OooOo, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final E OooO0oo() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f123445OooOo[OooOO0O(C34429OooOOo0.OooOO0O(this) + this.f123446OooOo0o)];
    }

    public final void OooOO0(int i, int i2) {
        if (i < i2) {
            Oooo.OooO0OO.OooOOOO(this.f123445OooOo, null, i, i2);
            return;
        }
        Object[] objArr = this.f123445OooOo;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Oooo.OooO0OO.OooOOOO(this.f123445OooOo, null, 0, i2);
    }

    public final int OooOO0O(int i) {
        Object[] objArr = this.f123445OooOo;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void OooOO0o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int length;
        int i2 = this.f123447OooOoO0;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        OooOO0o();
        OooO0o(this.f123447OooOoO0 + 1);
        int iOooOO0O = OooOO0O(this.f123446OooOo0o + i);
        int i3 = this.f123447OooOoO0;
        if (i < ((i3 + 1) >> 1)) {
            if (iOooOO0O == 0) {
                Object[] objArr = this.f123445OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
                iOooOO0O = objArr.length;
            }
            int i4 = iOooOO0O - 1;
            int i5 = this.f123446OooOo0o;
            if (i5 == 0) {
                Object[] objArr2 = this.f123445OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0oO(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.f123446OooOo0o;
            if (i4 >= i6) {
                Object[] objArr3 = this.f123445OooOo;
                objArr3[length] = objArr3[i6];
                Oooo.OooO0OO.OooO0oo(objArr3, i6, objArr3, i6 + 1, i4 + 1);
            } else {
                Object[] objArr4 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr4, i6 - 1, objArr4, i6, objArr4.length);
                Object[] objArr5 = this.f123445OooOo;
                objArr5[objArr5.length - 1] = objArr5[0];
                Oooo.OooO0OO.OooO0oo(objArr5, 0, objArr5, 1, i4 + 1);
            }
            this.f123445OooOo[i4] = e;
            this.f123446OooOo0o = length;
        } else {
            int iOooOO0O2 = OooOO0O(i3 + this.f123446OooOo0o);
            if (iOooOO0O < iOooOO0O2) {
                Object[] objArr6 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr6, iOooOO0O + 1, objArr6, iOooOO0O, iOooOO0O2);
            } else {
                Object[] objArr7 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr7, 1, objArr7, 0, iOooOO0O2);
                Object[] objArr8 = this.f123445OooOo;
                objArr8[0] = objArr8[objArr8.length - 1];
                Oooo.OooO0OO.OooO0oo(objArr8, iOooOO0O + 1, objArr8, iOooOO0O, objArr8.length - 1);
            }
            this.f123445OooOo[iOooOO0O] = e;
        }
        this.f123447OooOoO0++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        int i2 = this.f123447OooOoO0;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i == this.f123447OooOoO0) {
            return addAll(elements);
        }
        OooOO0o();
        OooO0o(elements.size() + this.f123447OooOoO0);
        int iOooOO0O = OooOO0O(this.f123447OooOoO0 + this.f123446OooOo0o);
        int iOooOO0O2 = OooOO0O(this.f123446OooOo0o + i);
        int size = elements.size();
        if (i >= ((this.f123447OooOoO0 + 1) >> 1)) {
            int i3 = iOooOO0O2 + size;
            if (iOooOO0O2 < iOooOO0O) {
                int i4 = size + iOooOO0O;
                Object[] objArr = this.f123445OooOo;
                if (i4 <= objArr.length) {
                    Oooo.OooO0OO.OooO0oo(objArr, i3, objArr, iOooOO0O2, iOooOO0O);
                } else if (i3 >= objArr.length) {
                    Oooo.OooO0OO.OooO0oo(objArr, i3 - objArr.length, objArr, iOooOO0O2, iOooOO0O);
                } else {
                    int length = iOooOO0O - (i4 - objArr.length);
                    Oooo.OooO0OO.OooO0oo(objArr, 0, objArr, length, iOooOO0O);
                    Object[] objArr2 = this.f123445OooOo;
                    Oooo.OooO0OO.OooO0oo(objArr2, i3, objArr2, iOooOO0O2, length);
                }
            } else {
                Object[] objArr3 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr3, size, objArr3, 0, iOooOO0O);
                Object[] objArr4 = this.f123445OooOo;
                if (i3 >= objArr4.length) {
                    Oooo.OooO0OO.OooO0oo(objArr4, i3 - objArr4.length, objArr4, iOooOO0O2, objArr4.length);
                } else {
                    Oooo.OooO0OO.OooO0oo(objArr4, 0, objArr4, objArr4.length - size, objArr4.length);
                    Object[] objArr5 = this.f123445OooOo;
                    Oooo.OooO0OO.OooO0oo(objArr5, i3, objArr5, iOooOO0O2, objArr5.length - size);
                }
            }
            OooO0o0(iOooOO0O2, elements);
            return true;
        }
        int i5 = this.f123446OooOo0o;
        int length2 = i5 - size;
        if (iOooOO0O2 < i5) {
            Object[] objArr6 = this.f123445OooOo;
            Oooo.OooO0OO.OooO0oo(objArr6, length2, objArr6, i5, objArr6.length);
            if (size >= iOooOO0O2) {
                Object[] objArr7 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr7, objArr7.length - size, objArr7, 0, iOooOO0O2);
            } else {
                Object[] objArr8 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr8, objArr8.length - size, objArr8, 0, size);
                Object[] objArr9 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr9, 0, objArr9, size, iOooOO0O2);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f123445OooOo;
            Oooo.OooO0OO.OooO0oo(objArr10, length2, objArr10, i5, iOooOO0O2);
        } else {
            Object[] objArr11 = this.f123445OooOo;
            length2 += objArr11.length;
            int i6 = iOooOO0O2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                Oooo.OooO0OO.OooO0oo(objArr11, length2, objArr11, i5, iOooOO0O2);
            } else {
                Oooo.OooO0OO.OooO0oo(objArr11, length2, objArr11, i5, i5 + length3);
                Object[] objArr12 = this.f123445OooOo;
                Oooo.OooO0OO.OooO0oo(objArr12, 0, objArr12, this.f123446OooOo0o + length3, iOooOO0O2);
            }
        }
        this.f123446OooOo0o = length2;
        OooO0o0(OooO(iOooOO0O2 - size), elements);
        return true;
    }

    public final void addFirst(E e) {
        OooOO0o();
        OooO0o(this.f123447OooOoO0 + 1);
        int length = this.f123446OooOo0o;
        if (length == 0) {
            Object[] objArr = this.f123445OooOo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f123446OooOo0o = i;
        this.f123445OooOo[i] = e;
        this.f123447OooOoO0++;
    }

    public final void addLast(E e) {
        OooOO0o();
        OooO0o(OooO0O0() + 1);
        this.f123445OooOo[OooOO0O(OooO0O0() + this.f123446OooOo0o)] = e;
        this.f123447OooOoO0 = OooO0O0() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            OooOO0o();
            OooOO0(this.f123446OooOo0o, OooOO0O(OooO0O0() + this.f123446OooOo0o));
        }
        this.f123446OooOo0o = 0;
        this.f123447OooOoO0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f123445OooOo[this.f123446OooOo0o];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int iOooO0O0 = OooO0O0();
        if (i < 0 || i >= iOooO0O0) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, iOooO0O0, "index: ", ", size: "));
        }
        return (E) this.f123445OooOo[OooOO0O(this.f123446OooOo0o + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iOooOO0O = OooOO0O(OooO0O0() + this.f123446OooOo0o);
        int length = this.f123446OooOo0o;
        if (length < iOooOO0O) {
            while (length < iOooOO0O) {
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f123445OooOo[length])) {
                    i = this.f123446OooOo0o;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iOooOO0O) {
            return -1;
        }
        int length2 = this.f123445OooOo.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iOooOO0O; i2++) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f123445OooOo[i2])) {
                        length = i2 + this.f123445OooOo.length;
                        i = this.f123446OooOo0o;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f123445OooOo[length])) {
                i = this.f123446OooOo0o;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return OooO0O0() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f123445OooOo[OooOO0O(C34429OooOOo0.OooOO0O(this) + this.f123446OooOo0o)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iOooOO0O = OooOO0O(this.f123447OooOoO0 + this.f123446OooOo0o);
        int i2 = this.f123446OooOo0o;
        if (i2 < iOooOO0O) {
            length = iOooOO0O - 1;
            if (i2 <= length) {
                while (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f123445OooOo[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f123446OooOo0o;
                return length - i;
            }
            return -1;
        }
        if (i2 > iOooOO0O) {
            int i3 = iOooOO0O - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.f123445OooOo;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.f123446OooOo0o;
                    if (i4 <= length) {
                        while (!kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f123445OooOo[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.f123446OooOo0o;
                    }
                } else {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, this.f123445OooOo[i3])) {
                        length = i3 + this.f123445OooOo.length;
                        i = this.f123446OooOo0o;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        OooO0Oo(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> elements) {
        int iOooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f123445OooOo.length != 0) {
            int iOooOO0O2 = OooOO0O(this.f123447OooOoO0 + this.f123446OooOo0o);
            int i = this.f123446OooOo0o;
            if (i < iOooOO0O2) {
                iOooOO0O = i;
                while (i < iOooOO0O2) {
                    Object obj = this.f123445OooOo[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f123445OooOo[iOooOO0O] = obj;
                        iOooOO0O++;
                    }
                    i++;
                }
                Oooo.OooO0OO.OooOOOO(this.f123445OooOo, null, iOooOO0O, iOooOO0O2);
            } else {
                int length = this.f123445OooOo.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f123445OooOo;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f123445OooOo[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iOooOO0O = OooOO0O(i2);
                for (int i3 = 0; i3 < iOooOO0O2; i3++) {
                    Object[] objArr2 = this.f123445OooOo;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f123445OooOo[iOooOO0O] = obj3;
                        iOooOO0O = OooO0oO(iOooOO0O);
                    }
                }
                z = z2;
            }
            if (z) {
                OooOO0o();
                this.f123447OooOoO0 = OooO(iOooOO0O - this.f123446OooOo0o);
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        OooOO0o();
        Object[] objArr = this.f123445OooOo;
        int i = this.f123446OooOo0o;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.f123446OooOo0o = OooO0oO(i);
        this.f123447OooOoO0 = OooO0O0() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        OooOO0o();
        int iOooOO0O = OooOO0O(C34429OooOOo0.OooOO0O(this) + this.f123446OooOo0o);
        Object[] objArr = this.f123445OooOo;
        E e = (E) objArr[iOooOO0O];
        objArr[iOooOO0O] = null;
        this.f123447OooOoO0 = OooO0O0() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC34421OooO0Oo.OooO00o.OooO0O0(i, i2, this.f123447OooOoO0);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f123447OooOoO0) {
            clear();
            return;
        }
        if (i3 == 1) {
            OooO0Oo(i);
            return;
        }
        OooOO0o();
        if (i < this.f123447OooOoO0 - i2) {
            int iOooOO0O = OooOO0O((i - 1) + this.f123446OooOo0o);
            int iOooOO0O2 = OooOO0O((i2 - 1) + this.f123446OooOo0o);
            while (i > 0) {
                int i4 = iOooOO0O + 1;
                int iMin = Math.min(i, Math.min(i4, iOooOO0O2 + 1));
                Object[] objArr = this.f123445OooOo;
                int i5 = iOooOO0O2 - iMin;
                int i6 = iOooOO0O - iMin;
                Oooo.OooO0OO.OooO0oo(objArr, i5 + 1, objArr, i6 + 1, i4);
                iOooOO0O = OooO(i6);
                iOooOO0O2 = OooO(i5);
                i -= iMin;
            }
            int iOooOO0O3 = OooOO0O(this.f123446OooOo0o + i3);
            OooOO0(this.f123446OooOo0o, iOooOO0O3);
            this.f123446OooOo0o = iOooOO0O3;
        } else {
            int iOooOO0O4 = OooOO0O(this.f123446OooOo0o + i2);
            int iOooOO0O5 = OooOO0O(this.f123446OooOo0o + i);
            int i7 = this.f123447OooOoO0;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f123445OooOo;
                i2 = Math.min(i7, Math.min(objArr2.length - iOooOO0O4, objArr2.length - iOooOO0O5));
                Object[] objArr3 = this.f123445OooOo;
                int i8 = iOooOO0O4 + i2;
                Oooo.OooO0OO.OooO0oo(objArr3, iOooOO0O5, objArr3, iOooOO0O4, i8);
                iOooOO0O4 = OooOO0O(i8);
                iOooOO0O5 = OooOO0O(iOooOO0O5 + i2);
            }
            int iOooOO0O6 = OooOO0O(this.f123447OooOoO0 + this.f123446OooOo0o);
            OooOO0(OooO(iOooOO0O6 - i3), iOooOO0O6);
        }
        this.f123447OooOoO0 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> elements) {
        int iOooOO0O;
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f123445OooOo.length != 0) {
            int iOooOO0O2 = OooOO0O(this.f123447OooOoO0 + this.f123446OooOo0o);
            int i = this.f123446OooOo0o;
            if (i < iOooOO0O2) {
                iOooOO0O = i;
                while (i < iOooOO0O2) {
                    Object obj = this.f123445OooOo[i];
                    if (elements.contains(obj)) {
                        this.f123445OooOo[iOooOO0O] = obj;
                        iOooOO0O++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Oooo.OooO0OO.OooOOOO(this.f123445OooOo, null, iOooOO0O, iOooOO0O2);
            } else {
                int length = this.f123445OooOo.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.f123445OooOo;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.f123445OooOo[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iOooOO0O = OooOO0O(i2);
                for (int i3 = 0; i3 < iOooOO0O2; i3++) {
                    Object[] objArr2 = this.f123445OooOo;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.f123445OooOo[iOooOO0O] = obj3;
                        iOooOO0O = OooO0oO(iOooOO0O);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                OooOO0o();
                this.f123447OooOoO0 = OooO(iOooOO0O - this.f123446OooOo0o);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        int iOooO0O0 = OooO0O0();
        if (i < 0 || i >= iOooO0O0) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, iOooO0O0, "index: ", ", size: "));
        }
        int iOooOO0O = OooOO0O(this.f123446OooOo0o + i);
        Object[] objArr = this.f123445OooOo;
        E e2 = (E) objArr[iOooOO0O];
        objArr[iOooOO0O] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[OooO0O0()]);
    }

    public C34426OooOO0o(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f123444OooOoO;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Illegal Capacity: "));
        }
        this.f123445OooOo = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        int length = array.length;
        int i = this.f123447OooOoO0;
        if (length < i) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) objNewInstance);
        }
        int iOooOO0O = OooOO0O(this.f123447OooOoO0 + this.f123446OooOo0o);
        int i2 = this.f123446OooOo0o;
        if (i2 < iOooOO0O) {
            Oooo.OooO0OO.OooOO0(this.f123445OooOo, i2, array, iOooOO0O, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f123445OooOo;
            Oooo.OooO0OO.OooO0oo(objArr, 0, array, this.f123446OooOo0o, objArr.length);
            Object[] objArr2 = this.f123445OooOo;
            Oooo.OooO0OO.OooO0oo(objArr2, objArr2.length - this.f123446OooOo0o, array, 0, iOooOO0O);
        }
        int i3 = this.f123447OooOoO0;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    public C34426OooOO0o(Collection<? extends E> collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.f123445OooOo = array;
        this.f123447OooOoO0 = array.length;
        if (array.length == 0) {
            this.f123445OooOo = f123444OooOoO;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        OooOO0o();
        OooO0o(elements.size() + OooO0O0());
        OooO0o0(OooOO0O(OooO0O0() + this.f123446OooOo0o), elements);
        return true;
    }
}
