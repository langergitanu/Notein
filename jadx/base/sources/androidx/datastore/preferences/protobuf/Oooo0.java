package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends OooO0OO<Long> implements RandomAccess, InterfaceC21832Ooooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long[] f64503OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64504OooOoO0;

    static {
        new Oooo0(new long[0], 0, false);
    }

    public Oooo0() {
        this(new long[10], 0, true);
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f64504OooOoO0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64504OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        OooO0O0();
        if (i < 0 || i > (i2 = this.f64504OooOoO0)) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64504OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        long[] jArr = this.f64503OooOo;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f64503OooOo, i, jArr2, i + 1, this.f64504OooOoO0 - i);
            this.f64503OooOo = jArr2;
        }
        this.f64503OooOo[i] = jLongValue;
        this.f64504OooOoO0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        OooO0O0();
        Charset charset = C21805OooOoO.f64482OooO00o;
        collection.getClass();
        if (!(collection instanceof Oooo0)) {
            return super.addAll(collection);
        }
        Oooo0 oooo0 = (Oooo0) collection;
        int i = oooo0.f64504OooOoO0;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64504OooOoO0;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f64503OooOo;
        if (i3 > jArr.length) {
            this.f64503OooOo = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(oooo0.f64503OooOo, 0, this.f64503OooOo, this.f64504OooOoO0, oooo0.f64504OooOoO0);
        this.f64504OooOoO0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j) {
        OooO0O0();
        int i = this.f64504OooOoO0;
        long[] jArr = this.f64503OooOo;
        if (i == jArr.length) {
            long[] jArr2 = new long[C21791OooO0o0.OooO00o(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f64503OooOo = jArr2;
        }
        long[] jArr3 = this.f64503OooOo;
        int i2 = this.f64504OooOoO0;
        this.f64504OooOoO0 = i2 + 1;
        jArr3[i2] = j;
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
        if (!(obj instanceof Oooo0)) {
            return super.equals(obj);
        }
        Oooo0 oooo0 = (Oooo0) obj;
        if (this.f64504OooOoO0 != oooo0.f64504OooOoO0) {
            return false;
        }
        long[] jArr = oooo0.f64503OooOo;
        for (int i = 0; i < this.f64504OooOoO0; i++) {
            if (this.f64503OooOo[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    public final long getLong(int i) {
        OooO0OO(i);
        return this.f64503OooOo[i];
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iOooO0O0 = 1;
        for (int i = 0; i < this.f64504OooOoO0; i++) {
            iOooO0O0 = (iOooO0O0 * 31) + C21805OooOoO.OooO0O0(this.f64503OooOo[i]);
        }
        return iOooO0O0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f64504OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64503OooOo[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final C21805OooOoO.OooO0OO mutableCopyWithCapacity(int i) {
        if (i >= this.f64504OooOoO0) {
            return new Oooo0(Arrays.copyOf(this.f64503OooOo, i), this.f64504OooOoO0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0O0();
        OooO0OO(i);
        long[] jArr = this.f64503OooOo;
        long j = jArr[i];
        if (i < this.f64504OooOoO0 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f64504OooOoO0--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0O0();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f64503OooOo;
        System.arraycopy(jArr, i2, jArr, i, this.f64504OooOoO0 - i2);
        this.f64504OooOoO0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        OooO0O0();
        OooO0OO(i);
        long[] jArr = this.f64503OooOo;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64504OooOoO0;
    }

    public Oooo0(long[] jArr, int i, boolean z) {
        super(z);
        this.f64503OooOo = jArr;
        this.f64504OooOoO0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
