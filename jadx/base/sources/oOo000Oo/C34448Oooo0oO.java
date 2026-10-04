package oOo000Oo;

import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: oOo000Oo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34448Oooo0oO<T> extends AbstractC34421OooO0Oo<T> implements RandomAccess {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f123473OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object[] f123474OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f123475OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f123476OooOoO0;

    /* JADX INFO: renamed from: oOo000Oo.Oooo0oO$OooO00o */
    public static final class OooO00o extends AbstractC34420OooO0OO<T> {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f123477OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f123478OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ C34448Oooo0oO<T> f123479OooOoOO;

        public OooO00o(C34448Oooo0oO<T> c34448Oooo0oO) {
            this.f123479OooOoOO = c34448Oooo0oO;
            this.f123478OooOoO0 = c34448Oooo0oO.f123475OooOoO;
            this.f123477OooOoO = c34448Oooo0oO.f123476OooOoO0;
        }

        @Override // oOo000Oo.AbstractC34420OooO0OO
        public final void OooO00o() {
            int i = this.f123478OooOoO0;
            if (i == 0) {
                this.f123435OooOo0o = 2;
                return;
            }
            C34448Oooo0oO<T> c34448Oooo0oO = this.f123479OooOoOO;
            Object[] objArr = c34448Oooo0oO.f123474OooOo0o;
            int i2 = this.f123477OooOoO;
            this.f123434OooOo = (T) objArr[i2];
            this.f123435OooOo0o = 1;
            this.f123477OooOoO = (i2 + 1) % c34448Oooo0oO.f123473OooOo;
            this.f123478OooOoO0 = i - 1;
        }
    }

    public C34448Oooo0oO(Object[] objArr, int i) {
        this.f123474OooOo0o = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.f123473OooOo = objArr.length;
            this.f123475OooOoO = i;
        } else {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbOooO0OO.append(objArr.length);
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        return this.f123475OooOoO;
    }

    public final void OooO0Oo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.f123475OooOoO) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbOooO0OO.append(this.f123475OooOoO);
            throw new IllegalArgumentException(sbOooO0OO.toString().toString());
        }
        if (i > 0) {
            int i2 = this.f123476OooOoO0;
            int i3 = this.f123473OooOo;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.f123474OooOo0o;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.f123476OooOoO0 = i4;
            this.f123475OooOoO -= i;
        }
    }

    @Override // java.util.List
    public final T get(int i) {
        int iOooO0O0 = OooO0O0();
        if (i < 0 || i >= iOooO0O0) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, iOooO0O0, "index: ", ", size: "));
        }
        return (T) this.f123474OooOo0o[(this.f123476OooOoO0 + i) % this.f123473OooOo];
    }

    @Override // oOo000Oo.AbstractC34421OooO0Oo, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[OooO0O0()]);
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Object[] objArr;
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        int length = array.length;
        int i = this.f123475OooOoO;
        if (length < i) {
            array = (T[]) Arrays.copyOf(array, i);
            kotlin.jvm.internal.OooOOO0.OooO0o(array, "copyOf(...)");
        }
        int i2 = this.f123475OooOoO;
        int i3 = this.f123476OooOoO0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.f123474OooOo0o;
            if (i5 >= i2 || i3 >= this.f123473OooOo) {
                break;
            }
            array[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            array[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }
}
