package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends OooO0OO<Boolean> implements RandomAccess, InterfaceC21832Ooooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean[] f64412OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64413OooOoO0;

    static {
        new OooO0o(new boolean[0], 0, false);
    }

    public OooO0o() {
        this(new boolean[10], 0, true);
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f64413OooOoO0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64413OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO0O0();
        if (i < 0 || i > (i2 = this.f64413OooOoO0)) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64413OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        boolean[] zArr = this.f64412OooOo;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f64412OooOo, i, zArr2, i + 1, this.f64413OooOoO0 - i);
            this.f64412OooOo = zArr2;
        }
        this.f64412OooOo[i] = zBooleanValue;
        this.f64413OooOoO0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        OooO0O0();
        Charset charset = C21805OooOoO.f64482OooO00o;
        collection.getClass();
        if (!(collection instanceof OooO0o)) {
            return super.addAll(collection);
        }
        OooO0o oooO0o = (OooO0o) collection;
        int i = oooO0o.f64413OooOoO0;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64413OooOoO0;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f64412OooOo;
        if (i3 > zArr.length) {
            this.f64412OooOo = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(oooO0o.f64412OooOo, 0, this.f64412OooOo, this.f64413OooOoO0, oooO0o.f64413OooOoO0);
        this.f64413OooOoO0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z) {
        OooO0O0();
        int i = this.f64413OooOoO0;
        boolean[] zArr = this.f64412OooOo;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[C21791OooO0o0.OooO00o(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f64412OooOo = zArr2;
        }
        boolean[] zArr3 = this.f64412OooOo;
        int i2 = this.f64413OooOoO0;
        this.f64413OooOoO0 = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return super.equals(obj);
        }
        OooO0o oooO0o = (OooO0o) obj;
        if (this.f64413OooOoO0 != oooO0o.f64413OooOoO0) {
            return false;
        }
        boolean[] zArr = oooO0o.f64412OooOo;
        for (int i = 0; i < this.f64413OooOoO0; i++) {
            if (this.f64412OooOo[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0OO(i);
        return Boolean.valueOf(this.f64412OooOo[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f64413OooOoO0; i2++) {
            int i3 = i * 31;
            boolean z = this.f64412OooOo[i2];
            Charset charset = C21805OooOoO.f64482OooO00o;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f64413OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64412OooOo[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final C21805OooOoO.OooO0OO mutableCopyWithCapacity(int i) {
        if (i >= this.f64413OooOoO0) {
            return new OooO0o(Arrays.copyOf(this.f64412OooOo, i), this.f64413OooOoO0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0O0();
        OooO0OO(i);
        boolean[] zArr = this.f64412OooOo;
        boolean z = zArr[i];
        if (i < this.f64413OooOoO0 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f64413OooOoO0--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0O0();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f64412OooOo;
        System.arraycopy(zArr, i2, zArr, i, this.f64413OooOoO0 - i2);
        this.f64413OooOoO0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO0O0();
        OooO0OO(i);
        boolean[] zArr = this.f64412OooOo;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64413OooOoO0;
    }

    public OooO0o(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f64412OooOo = zArr;
        this.f64413OooOoO0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
