package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooO0OO<Double> implements RandomAccess, InterfaceC21832Ooooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public double[] f64450OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64451OooOoO0;

    static {
        new OooOOO(new double[0], 0, false);
    }

    public OooOOO() {
        this(new double[10], 0, true);
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f64451OooOoO0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64451OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO0O0();
        if (i < 0 || i > (i2 = this.f64451OooOoO0)) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64451OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        double[] dArr = this.f64450OooOo;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f64450OooOo, i, dArr2, i + 1, this.f64451OooOoO0 - i);
            this.f64450OooOo = dArr2;
        }
        this.f64450OooOo[i] = dDoubleValue;
        this.f64451OooOoO0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        OooO0O0();
        Charset charset = C21805OooOoO.f64482OooO00o;
        collection.getClass();
        if (!(collection instanceof OooOOO)) {
            return super.addAll(collection);
        }
        OooOOO oooOOO = (OooOOO) collection;
        int i = oooOOO.f64451OooOoO0;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64451OooOoO0;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f64450OooOo;
        if (i3 > dArr.length) {
            this.f64450OooOo = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(oooOOO.f64450OooOo, 0, this.f64450OooOo, this.f64451OooOoO0, oooOOO.f64451OooOoO0);
        this.f64451OooOoO0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d) {
        OooO0O0();
        int i = this.f64451OooOoO0;
        double[] dArr = this.f64450OooOo;
        if (i == dArr.length) {
            double[] dArr2 = new double[C21791OooO0o0.OooO00o(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f64450OooOo = dArr2;
        }
        double[] dArr3 = this.f64450OooOo;
        int i2 = this.f64451OooOoO0;
        this.f64451OooOoO0 = i2 + 1;
        dArr3[i2] = d;
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
        if (!(obj instanceof OooOOO)) {
            return super.equals(obj);
        }
        OooOOO oooOOO = (OooOOO) obj;
        if (this.f64451OooOoO0 != oooOOO.f64451OooOoO0) {
            return false;
        }
        double[] dArr = oooOOO.f64450OooOo;
        for (int i = 0; i < this.f64451OooOoO0; i++) {
            if (Double.doubleToLongBits(this.f64450OooOo[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0OO(i);
        return Double.valueOf(this.f64450OooOo[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iOooO0O0 = 1;
        for (int i = 0; i < this.f64451OooOoO0; i++) {
            iOooO0O0 = (iOooO0O0 * 31) + C21805OooOoO.OooO0O0(Double.doubleToLongBits(this.f64450OooOo[i]));
        }
        return iOooO0O0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f64451OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64450OooOo[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final C21805OooOoO.OooO0OO mutableCopyWithCapacity(int i) {
        if (i >= this.f64451OooOoO0) {
            return new OooOOO(Arrays.copyOf(this.f64450OooOo, i), this.f64451OooOoO0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0O0();
        OooO0OO(i);
        double[] dArr = this.f64450OooOo;
        double d = dArr[i];
        if (i < this.f64451OooOoO0 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f64451OooOoO0--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0O0();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f64450OooOo;
        System.arraycopy(dArr, i2, dArr, i, this.f64451OooOoO0 - i2);
        this.f64451OooOoO0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO0O0();
        OooO0OO(i);
        double[] dArr = this.f64450OooOo;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64451OooOoO0;
    }

    public OooOOO(double[] dArr, int i, boolean z) {
        super(z);
        this.f64450OooOo = dArr;
        this.f64451OooOoO0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
