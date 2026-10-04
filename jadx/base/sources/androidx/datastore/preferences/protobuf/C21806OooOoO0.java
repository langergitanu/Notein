package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21806OooOoO0 extends OooO0OO<Integer> implements RandomAccess, InterfaceC21832Ooooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int[] f64484OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64485OooOoO0;

    static {
        new C21806OooOoO0(new int[0], 0, false);
    }

    public C21806OooOoO0() {
        this(new int[10], 0, true);
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f64485OooOoO0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64485OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO0O0();
        if (i < 0 || i > (i2 = this.f64485OooOoO0)) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64485OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        int[] iArr = this.f64484OooOo;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f64484OooOo, i, iArr2, i + 1, this.f64485OooOoO0 - i);
            this.f64484OooOo = iArr2;
        }
        this.f64484OooOo[i] = iIntValue;
        this.f64485OooOoO0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        OooO0O0();
        Charset charset = C21805OooOoO.f64482OooO00o;
        collection.getClass();
        if (!(collection instanceof C21806OooOoO0)) {
            return super.addAll(collection);
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) collection;
        int i = c21806OooOoO0.f64485OooOoO0;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64485OooOoO0;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f64484OooOo;
        if (i3 > iArr.length) {
            this.f64484OooOo = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c21806OooOoO0.f64484OooOo, 0, this.f64484OooOo, this.f64485OooOoO0, c21806OooOoO0.f64485OooOoO0);
        this.f64485OooOoO0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i) {
        OooO0O0();
        int i2 = this.f64485OooOoO0;
        int[] iArr = this.f64484OooOo;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f64484OooOo = iArr2;
        }
        int[] iArr3 = this.f64484OooOo;
        int i3 = this.f64485OooOoO0;
        this.f64485OooOoO0 = i3 + 1;
        iArr3[i3] = i;
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
        if (!(obj instanceof C21806OooOoO0)) {
            return super.equals(obj);
        }
        C21806OooOoO0 c21806OooOoO0 = (C21806OooOoO0) obj;
        if (this.f64485OooOoO0 != c21806OooOoO0.f64485OooOoO0) {
            return false;
        }
        int[] iArr = c21806OooOoO0.f64484OooOo;
        for (int i = 0; i < this.f64485OooOoO0; i++) {
            if (this.f64484OooOo[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        OooO0OO(i);
        return this.f64484OooOo[i];
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f64485OooOoO0; i2++) {
            i = (i * 31) + this.f64484OooOo[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f64485OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64484OooOo[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final C21805OooOoO.OooO0OO mutableCopyWithCapacity(int i) {
        if (i >= this.f64485OooOoO0) {
            return new C21806OooOoO0(Arrays.copyOf(this.f64484OooOo, i), this.f64485OooOoO0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0O0();
        OooO0OO(i);
        int[] iArr = this.f64484OooOo;
        int i2 = iArr[i];
        if (i < this.f64485OooOoO0 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f64485OooOoO0--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0O0();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f64484OooOo;
        System.arraycopy(iArr, i2, iArr, i, this.f64485OooOoO0 - i2);
        this.f64485OooOoO0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO0O0();
        OooO0OO(i);
        int[] iArr = this.f64484OooOo;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64485OooOoO0;
    }

    public C21806OooOoO0(int[] iArr, int i, boolean z) {
        super(z);
        this.f64484OooOo = iArr;
        this.f64485OooOoO0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
