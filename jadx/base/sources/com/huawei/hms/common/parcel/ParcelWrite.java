package com.huawei.hms.common.parcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ParcelWrite {

    /* JADX INFO: renamed from: b */
    public static final int f52511b = 65262;

    /* JADX INFO: renamed from: a */
    public Parcel f52512a;

    public ParcelWrite(Parcel parcel) {
        this.f52512a = parcel;
    }

    /* JADX INFO: renamed from: a */
    private int m75850a(int i) {
        this.f52512a.writeInt(i | SupportMenu.CATEGORY_MASK);
        this.f52512a.writeInt(0);
        return this.f52512a.dataPosition();
    }

    /* JADX INFO: renamed from: b */
    private void m75853b(int i) {
        int iDataPosition = this.f52512a.dataPosition();
        this.f52512a.setDataPosition(i - 4);
        this.f52512a.writeInt(iDataPosition - i);
        this.f52512a.setDataPosition(iDataPosition);
    }

    public int beginObjectHeader() {
        return m75850a(65262);
    }

    public void finishObjectHeader(int i) {
        m75853b(i);
    }

    public void writeBigDecimal(int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            this.f52512a.writeInt(bigDecimal.scale());
            m75853b(iM75850a);
        }
    }

    public void writeBigDecimalArray(int i, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int length = bigDecimalArr.length;
        this.f52512a.writeInt(length);
        for (int i2 = 0; i2 < length; i2++) {
            this.f52512a.writeByteArray(bigDecimalArr[i2].unscaledValue().toByteArray());
            this.f52512a.writeInt(bigDecimalArr[i2].scale());
        }
        m75853b(iM75850a);
    }

    public void writeBigInteger(int i, BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeByteArray(bigInteger.toByteArray());
            m75853b(iM75850a);
        }
    }

    public void writeBigIntegerArray(int i, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        this.f52512a.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            this.f52512a.writeByteArray(bigInteger.toByteArray());
        }
        m75853b(iM75850a);
    }

    public void writeBoolean(int i, boolean z) {
        m75851a(i, 4);
        this.f52512a.writeInt(z ? 1 : 0);
    }

    public void writeBooleanArray(int i, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeBooleanArray(zArr);
            m75853b(iM75850a);
        }
    }

    public void writeBooleanList(int i, List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(list.get(i2).booleanValue() ? 1 : 0);
        }
        m75853b(iM75850a);
    }

    public void writeBooleanObject(int i, Boolean bool) {
        writeBooleanObject(i, bool, false);
    }

    public void writeBundle(int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeBundle(bundle);
            m75853b(iM75850a);
        }
    }

    public void writeByte(int i, byte b) {
        m75851a(i, 4);
        this.f52512a.writeInt(b);
    }

    public void writeByteArray(int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeByteArray(bArr);
            m75853b(iM75850a);
        }
    }

    public void writeByteArrayArray(int i, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        this.f52512a.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            this.f52512a.writeByteArray(bArr2);
        }
        m75853b(iM75850a);
    }

    public void writeByteArraySparseArray(int i, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            this.f52512a.writeByteArray(sparseArray.valueAt(i2));
        }
        m75853b(iM75850a);
    }

    public void writeChar(int i, char c) {
        m75851a(i, 4);
        this.f52512a.writeInt(c);
    }

    public void writeCharArray(int i, char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeCharArray(cArr);
            m75853b(iM75850a);
        }
    }

    public void writeDouble(int i, double d) {
        m75851a(i, 8);
        this.f52512a.writeDouble(d);
    }

    public void writeDoubleArray(int i, double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeDoubleArray(dArr);
            m75853b(iM75850a);
        }
    }

    public void writeDoubleList(int i, List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeDouble(list.get(i2).doubleValue());
        }
        m75853b(iM75850a);
    }

    public void writeDoubleObject(int i, Double d, boolean z) {
        if (d != null) {
            m75851a(i, 8);
            this.f52512a.writeDouble(d.doubleValue());
        } else if (z) {
            m75851a(i, 0);
        }
    }

    public void writeDoubleSparseArray(int i, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            this.f52512a.writeDouble(sparseArray.valueAt(i2).doubleValue());
        }
        m75853b(iM75850a);
    }

    public void writeFloat(int i, float f) {
        m75851a(i, 4);
        this.f52512a.writeFloat(f);
    }

    public void writeFloatArray(int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeFloatArray(fArr);
            m75853b(iM75850a);
        }
    }

    public void writeFloatList(int i, List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeFloat(list.get(i2).floatValue());
        }
        m75853b(iM75850a);
    }

    public void writeFloatObject(int i, Float f, boolean z) {
        if (f != null) {
            m75851a(i, 4);
            this.f52512a.writeFloat(f.floatValue());
        } else if (z) {
            m75851a(i, 0);
        }
    }

    public void writeFloatSparseArray(int i, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            this.f52512a.writeFloat(sparseArray.valueAt(i2).floatValue());
        }
        m75853b(iM75850a);
    }

    public void writeIBinder(int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeStrongBinder(iBinder);
            m75853b(iM75850a);
        }
    }

    public void writeIBinderArray(int i, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeBinderArray(iBinderArr);
            m75853b(iM75850a);
        }
    }

    public void writeIBinderList(int i, List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeBinderList(list);
            m75853b(iM75850a);
        }
    }

    public void writeIBinderSparseArray(int i, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            this.f52512a.writeStrongBinder(sparseArray.valueAt(i2));
        }
        m75853b(iM75850a);
    }

    public void writeInt(int i, int i2) {
        m75851a(i, 4);
        this.f52512a.writeInt(i2);
    }

    public void writeIntArray(int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeIntArray(iArr);
            m75853b(iM75850a);
        }
    }

    public void writeIntegerList(int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(list.get(i2).intValue());
        }
        m75853b(iM75850a);
    }

    public void writeIntegerObject(int i, Integer num, boolean z) {
        if (num != null) {
            m75851a(i, 4);
            this.f52512a.writeInt(num.intValue());
        } else if (z) {
            m75851a(i, 0);
        }
    }

    public void writeList(int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeList(list);
            m75853b(iM75850a);
        }
    }

    public void writeLong(int i, long j) {
        m75851a(i, 8);
        this.f52512a.writeLong(j);
    }

    public void writeLongArray(int i, long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeLongArray(jArr);
            m75853b(iM75850a);
        }
    }

    public void writeLongList(int i, List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeLong(list.get(i2).longValue());
        }
        m75853b(iM75850a);
    }

    public void writeLongObject(int i, Long l, boolean z) {
        if (l != null) {
            m75851a(i, 8);
            this.f52512a.writeLong(l.longValue());
        } else if (z) {
            m75851a(i, 0);
        }
    }

    public void writeParcel(int i, Parcel parcel, boolean z) {
        if (parcel == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.appendFrom(parcel, 0, parcel.dataSize());
            m75853b(iM75850a);
        }
    }

    public void writeParcelArray(int i, Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        this.f52512a.writeInt(parcelArr.length);
        for (Parcel parcel : parcelArr) {
            if (parcel != null) {
                this.f52512a.writeInt(parcel.dataSize());
                this.f52512a.appendFrom(parcel, 0, parcel.dataSize());
            } else {
                this.f52512a.writeInt(0);
            }
        }
        m75853b(iM75850a);
    }

    public void writeParcelList(int i, List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcel parcel = list.get(i2);
            if (parcel != null) {
                this.f52512a.writeInt(parcel.dataSize());
                this.f52512a.appendFrom(parcel, 0, parcel.dataSize());
            } else {
                this.f52512a.writeInt(0);
            }
        }
        m75853b(iM75850a);
    }

    public void writeParcelSparseArray(int i, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            Parcel parcelValueAt = sparseArray.valueAt(i2);
            if (parcelValueAt != null) {
                this.f52512a.writeInt(parcelValueAt.dataSize());
                this.f52512a.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                this.f52512a.writeInt(0);
            }
        }
        m75853b(iM75850a);
    }

    public void writeParcelable(int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            parcelable.writeToParcel(this.f52512a, i2);
            m75853b(iM75850a);
        }
    }

    public void writeShort(int i, short s) {
        m75851a(i, 4);
        this.f52512a.writeInt(s);
    }

    public void writeSparseBooleanArray(int i, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeSparseBooleanArray(sparseBooleanArray);
            m75853b(iM75850a);
        }
    }

    public void writeSparseIntArray(int i, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseIntArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseIntArray.keyAt(i2));
            this.f52512a.writeInt(sparseIntArray.valueAt(i2));
        }
        m75853b(iM75850a);
    }

    public void writeSparseLongArray(int i, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseLongArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseLongArray.keyAt(i2));
            this.f52512a.writeLong(sparseLongArray.valueAt(i2));
        }
        m75853b(iM75850a);
    }

    public void writeString(int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeString(str);
            m75853b(iM75850a);
        }
    }

    public void writeStringArray(int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeStringArray(strArr);
            m75853b(iM75850a);
        }
    }

    public void writeStringList(int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
            }
        } else {
            int iM75850a = m75850a(i);
            this.f52512a.writeStringList(list);
            m75853b(iM75850a);
        }
    }

    public void writeStringSparseArray(int i, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            this.f52512a.writeString(sparseArray.valueAt(i2));
        }
        m75853b(iM75850a);
    }

    public <T extends Parcelable> void writeTypedArray(int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        this.f52512a.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                this.f52512a.writeInt(0);
            } else {
                m75852a(t, i2);
            }
        }
        m75853b(iM75850a);
    }

    public <T extends Parcelable> void writeTypedList(int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = list.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                this.f52512a.writeInt(0);
            } else {
                m75852a(t, 0);
            }
        }
        m75853b(iM75850a);
    }

    public <T extends Parcelable> void writeTypedSparseArray(int i, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                m75851a(i, 0);
                return;
            }
            return;
        }
        int iM75850a = m75850a(i);
        int size = sparseArray.size();
        this.f52512a.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f52512a.writeInt(sparseArray.keyAt(i2));
            T tValueAt = sparseArray.valueAt(i2);
            if (tValueAt == null) {
                this.f52512a.writeInt(0);
            } else {
                m75852a(tValueAt, 0);
            }
        }
        m75853b(iM75850a);
    }

    /* JADX INFO: renamed from: a */
    private void m75851a(int i, int i2) {
        if (i2 < 65535) {
            this.f52512a.writeInt(i | (i2 << 16));
        } else {
            this.f52512a.writeInt(i | SupportMenu.CATEGORY_MASK);
            this.f52512a.writeInt(i2);
        }
    }

    public void writeBooleanObject(int i, Boolean bool, boolean z) {
        if (bool != null) {
            m75851a(i, 4);
            this.f52512a.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m75851a(i, 0);
        }
    }

    /* JADX INFO: renamed from: a */
    private <T extends Parcelable> void m75852a(T t, int i) {
        int iDataPosition = this.f52512a.dataPosition();
        this.f52512a.writeInt(1);
        int iDataPosition2 = this.f52512a.dataPosition();
        t.writeToParcel(this.f52512a, i);
        int iDataPosition3 = this.f52512a.dataPosition();
        this.f52512a.setDataPosition(iDataPosition);
        this.f52512a.writeInt(iDataPosition3 - iDataPosition2);
        this.f52512a.setDataPosition(iDataPosition3);
    }
}
