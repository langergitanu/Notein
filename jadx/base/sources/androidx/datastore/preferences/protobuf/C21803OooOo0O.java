package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21805OooOoO;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21803OooOo0O extends OooO0OO<Float> implements RandomAccess, InterfaceC21832Ooooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float[] f64479OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f64480OooOoO0;

    static {
        new C21803OooOo0O(new float[0], 0, false);
    }

    public C21803OooOo0O() {
        this(new float[10], 0, true);
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f64480OooOoO0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64480OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        OooO0O0();
        if (i < 0 || i > (i2 = this.f64480OooOoO0)) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "Index:", ", Size:");
            sbOooO0OO.append(this.f64480OooOoO0);
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        float[] fArr = this.f64479OooOo;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C21791OooO0o0.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f64479OooOo, i, fArr2, i + 1, this.f64480OooOoO0 - i);
            this.f64479OooOo = fArr2;
        }
        this.f64479OooOo[i] = fFloatValue;
        this.f64480OooOoO0++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        OooO0O0();
        Charset charset = C21805OooOoO.f64482OooO00o;
        collection.getClass();
        if (!(collection instanceof C21803OooOo0O)) {
            return super.addAll(collection);
        }
        C21803OooOo0O c21803OooOo0O = (C21803OooOo0O) collection;
        int i = c21803OooOo0O.f64480OooOoO0;
        if (i == 0) {
            return false;
        }
        int i2 = this.f64480OooOoO0;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f64479OooOo;
        if (i3 > fArr.length) {
            this.f64479OooOo = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c21803OooOo0O.f64479OooOo, 0, this.f64479OooOo, this.f64480OooOoO0, c21803OooOo0O.f64480OooOoO0);
        this.f64480OooOoO0 = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f) {
        OooO0O0();
        int i = this.f64480OooOoO0;
        float[] fArr = this.f64479OooOo;
        if (i == fArr.length) {
            float[] fArr2 = new float[C21791OooO0o0.OooO00o(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f64479OooOo = fArr2;
        }
        float[] fArr3 = this.f64479OooOo;
        int i2 = this.f64480OooOoO0;
        this.f64480OooOoO0 = i2 + 1;
        fArr3[i2] = f;
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
        if (!(obj instanceof C21803OooOo0O)) {
            return super.equals(obj);
        }
        C21803OooOo0O c21803OooOo0O = (C21803OooOo0O) obj;
        if (this.f64480OooOoO0 != c21803OooOo0O.f64480OooOoO0) {
            return false;
        }
        float[] fArr = c21803OooOo0O.f64479OooOo;
        for (int i = 0; i < this.f64480OooOoO0; i++) {
            if (Float.floatToIntBits(this.f64479OooOo[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0OO(i);
        return Float.valueOf(this.f64479OooOo[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f64480OooOoO0; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f64479OooOo[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f64480OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f64479OooOo[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.C21805OooOoO.OooO0OO
    public final C21805OooOoO.OooO0OO mutableCopyWithCapacity(int i) {
        if (i >= this.f64480OooOoO0) {
            return new C21803OooOo0O(Arrays.copyOf(this.f64479OooOo, i), this.f64480OooOoO0, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.OooO0OO, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO0O0();
        OooO0OO(i);
        float[] fArr = this.f64479OooOo;
        float f = fArr[i];
        if (i < this.f64480OooOoO0 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f64480OooOoO0--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO0O0();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f64479OooOo;
        System.arraycopy(fArr, i2, fArr, i, this.f64480OooOoO0 - i2);
        this.f64480OooOoO0 -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        OooO0O0();
        OooO0OO(i);
        float[] fArr = this.f64479OooOo;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f64480OooOoO0;
    }

    public C21803OooOo0O(float[] fArr, int i, boolean z) {
        super(z);
        this.f64479OooOo = fArr;
        this.f64480OooOoO0 = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
