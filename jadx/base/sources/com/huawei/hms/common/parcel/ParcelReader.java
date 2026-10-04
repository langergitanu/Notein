package com.huawei.hms.common.parcel;

import OooO0Oo.C20398OooO0O0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.internal.view.SupportMenu;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ParcelReader {

    /* JADX INFO: renamed from: c */
    public static final int f52505c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f52506d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f52507e = 65262;

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, Integer[]> f52508a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public Parcel f52509b;

    public class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str);
        }
    }

    public ParcelReader(Parcel parcel) {
        this.f52509b = parcel;
        m75846a();
    }

    /* JADX INFO: renamed from: a */
    private int m75845a(int i) {
        if (i < 0) {
            return 0;
        }
        if (i > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    private int m75848b(int i) {
        Integer[] numArr = this.f52508a.get(Integer.valueOf(i));
        if (numArr != null) {
            this.f52509b.setDataPosition(numArr[0].intValue());
            return numArr[1].intValue();
        }
        throw new ParseException("Field is null:" + numArr, this.f52509b);
    }

    public BigDecimal createBigDecimal(int i, BigDecimal bigDecimal) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bigDecimal;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        byte[] bArrCreateByteArray = this.f52509b.createByteArray();
        int i2 = this.f52509b.readInt();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public BigDecimal[] createBigDecimalArray(int i, BigDecimal[] bigDecimalArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bigDecimalArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        BigDecimal[] bigDecimalArr2 = new BigDecimal[iM75845a];
        for (int i2 = 0; i2 < iM75845a; i2++) {
            byte[] bArrCreateByteArray = this.f52509b.createByteArray();
            bigDecimalArr2[i2] = new BigDecimal(new BigInteger(bArrCreateByteArray), this.f52509b.readInt());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return bigDecimalArr2;
    }

    public BigInteger createBigInteger(int i, BigInteger bigInteger) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bigInteger;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        byte[] bArrCreateByteArray = this.f52509b.createByteArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return new BigInteger(bArrCreateByteArray);
    }

    public BigInteger[] createBigIntegerArray(int i, BigInteger[] bigIntegerArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bigIntegerArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        BigInteger[] bigIntegerArr2 = new BigInteger[iM75845a];
        for (int i2 = 0; i2 < iM75845a; i2++) {
            bigIntegerArr2[i2] = new BigInteger(this.f52509b.createByteArray());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return bigIntegerArr2;
    }

    public boolean[] createBooleanArray(int i, boolean[] zArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return zArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        boolean[] zArrCreateBooleanArray = this.f52509b.createBooleanArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return zArrCreateBooleanArray;
    }

    public ArrayList<Boolean> createBooleanList(int i, ArrayList<Boolean> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            arrayList2.add(Boolean.valueOf(this.f52509b.readInt() != 0));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayList2;
    }

    public byte[] createByteArray(int i, byte[] bArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        byte[] bArrCreateByteArray = this.f52509b.createByteArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return bArrCreateByteArray;
    }

    public byte[][] createByteArrayArray(int i, byte[][] bArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        byte[][] bArr2 = new byte[iM75845a][];
        for (int i2 = 0; i2 < iM75845a; i2++) {
            bArr2[i2] = this.f52509b.createByteArray();
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return bArr2;
    }

    public SparseArray<byte[]> createByteArraySparseArray(int i, SparseArray<byte[]> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        SparseArray<byte[]> sparseArray2 = new SparseArray<>(iM75845a);
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseArray2.append(this.f52509b.readInt(), this.f52509b.createByteArray());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public char[] createCharArray(int i, char[] cArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return cArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        char[] cArrCreateCharArray = this.f52509b.createCharArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return cArrCreateCharArray;
    }

    public double[] createDoubleArray(int i, double[] dArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return dArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        double[] dArrCreateDoubleArray = this.f52509b.createDoubleArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return dArrCreateDoubleArray;
    }

    public ArrayList<Double> createDoubleList(int i, ArrayList<Double> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            arrayList2.add(Double.valueOf(this.f52509b.readDouble()));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayList2;
    }

    public SparseArray<Double> createDoubleSparseArray(int i, SparseArray<Double> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        SparseArray<Double> sparseArray2 = new SparseArray<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseArray2.append(this.f52509b.readInt(), Double.valueOf(this.f52509b.readDouble()));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public float[] createFloatArray(int i, float[] fArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return fArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        float[] fArrCreateFloatArray = this.f52509b.createFloatArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return fArrCreateFloatArray;
    }

    public ArrayList<Float> createFloatList(int i, ArrayList<Float> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            arrayList2.add(Float.valueOf(this.f52509b.readFloat()));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayList2;
    }

    public SparseArray<Float> createFloatSparseArray(int i, SparseArray<Float> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        SparseArray<Float> sparseArray2 = new SparseArray<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseArray2.append(this.f52509b.readInt(), Float.valueOf(this.f52509b.readFloat()));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public IBinder[] createIBinderArray(int i, IBinder[] iBinderArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return iBinderArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        IBinder[] iBinderArrCreateBinderArray = this.f52509b.createBinderArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return iBinderArrCreateBinderArray;
    }

    public ArrayList<IBinder> createIBinderList(int i, ArrayList<IBinder> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<IBinder> arrayListCreateBinderArrayList = this.f52509b.createBinderArrayList();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayListCreateBinderArrayList;
    }

    public SparseArray<IBinder> createIBinderSparseArray(int i, SparseArray<IBinder> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        SparseArray<IBinder> sparseArray2 = new SparseArray<>(iM75845a);
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseArray2.append(this.f52509b.readInt(), this.f52509b.readStrongBinder());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public int[] createIntArray(int i, int[] iArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return iArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int[] iArrCreateIntArray = this.f52509b.createIntArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return iArrCreateIntArray;
    }

    public ArrayList<Integer> createIntegerList(int i, ArrayList<Integer> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            arrayList2.add(Integer.valueOf(this.f52509b.readInt()));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayList2;
    }

    public long[] createLongArray(int i, long[] jArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return jArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        long[] jArrCreateLongArray = this.f52509b.createLongArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return jArrCreateLongArray;
    }

    public ArrayList<Long> createLongList(int i, ArrayList<Long> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            arrayList2.add(Long.valueOf(this.f52509b.readLong()));
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayList2;
    }

    public Parcel createParcel(int i, Parcel parcel) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return parcel;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(this.f52509b, iDataPosition, iM75848b);
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return parcelObtain;
    }

    public Parcel[] createParcelArray(int i, Parcel[] parcelArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return parcelArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        Parcel[] parcelArr2 = new Parcel[iM75845a];
        for (int i2 = 0; i2 < iM75845a; i2++) {
            int i3 = this.f52509b.readInt();
            if (i3 != 0) {
                int iDataPosition2 = this.f52509b.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.f52509b, iDataPosition2, i3);
                parcelArr2[i2] = parcelObtain;
                this.f52509b.setDataPosition(iDataPosition2 + i3);
            } else {
                parcelArr2[i2] = null;
            }
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return parcelArr2;
    }

    public ArrayList<Parcel> createParcelList(int i, ArrayList<Parcel> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        ArrayList<Parcel> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < iM75845a; i2++) {
            int i3 = this.f52509b.readInt();
            if (i3 != 0) {
                int iDataPosition2 = this.f52509b.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.f52509b, iDataPosition2, i3);
                arrayList2.add(parcelObtain);
                this.f52509b.setDataPosition(iDataPosition2 + i3);
            } else {
                arrayList2.add(null);
            }
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayList2;
    }

    public SparseArray<Parcel> createParcelSparseArray(int i, SparseArray<Parcel> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        SparseArray<Parcel> sparseArray2 = new SparseArray<>();
        for (int i2 = 0; i2 < iM75845a; i2++) {
            int i3 = this.f52509b.readInt();
            int i4 = this.f52509b.readInt();
            if (i4 != 0) {
                int iDataPosition2 = this.f52509b.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.f52509b, iDataPosition2, i4);
                sparseArray2.append(i3, parcelObtain);
                this.f52509b.setDataPosition(iDataPosition2 + i4);
            } else {
                sparseArray2.append(i3, null);
            }
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public SparseBooleanArray createSparseBooleanArray(int i, SparseBooleanArray sparseBooleanArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseBooleanArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        SparseBooleanArray sparseBooleanArray2 = this.f52509b.readSparseBooleanArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseBooleanArray2;
    }

    public SparseIntArray createSparseIntArray(int i, SparseIntArray sparseIntArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseIntArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseIntArray2.append(this.f52509b.readInt(), this.f52509b.readInt());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseIntArray2;
    }

    public SparseLongArray createSparseLongArray(int i, SparseLongArray sparseLongArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseLongArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        SparseLongArray sparseLongArray2 = new SparseLongArray();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseLongArray2.append(this.f52509b.readInt(), this.f52509b.readLong());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseLongArray2;
    }

    public String createString(int i, String str) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return str;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        String string = this.f52509b.readString();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return string;
    }

    public String[] createStringArray(int i, String[] strArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return strArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        String[] strArrCreateStringArray = this.f52509b.createStringArray();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return strArrCreateStringArray;
    }

    public ArrayList<String> createStringList(int i, ArrayList<String> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<String> arrayListCreateStringArrayList = this.f52509b.createStringArrayList();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayListCreateStringArrayList;
    }

    public SparseArray<String> createStringSparseArray(int i, SparseArray<String> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        int iM75845a = m75845a(this.f52509b.readInt());
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseArray2.append(this.f52509b.readInt(), this.f52509b.readString());
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public <T> T[] createTypedArray(int i, Parcelable.Creator<T> creator, T[] tArr) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return tArr;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        T[] tArr2 = (T[]) this.f52509b.createTypedArray(creator);
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return tArr2;
    }

    public <T> ArrayList<T> createTypedList(int i, Parcelable.Creator<T> creator, ArrayList<T> arrayList) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        ArrayList<T> arrayListCreateTypedArrayList = this.f52509b.createTypedArrayList(creator);
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return arrayListCreateTypedArrayList;
    }

    public <T> SparseArray<T> createTypedSparseArray(int i, Parcelable.Creator<T> creator, SparseArray<T> sparseArray) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        int iM75845a = m75845a(this.f52509b.readInt());
        SparseArray<T> sparseArray2 = new SparseArray<>();
        for (int i2 = 0; i2 < iM75845a; i2++) {
            sparseArray2.append(this.f52509b.readInt(), this.f52509b.readInt() != 0 ? creator.createFromParcel(this.f52509b) : null);
        }
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return sparseArray2;
    }

    public boolean readBoolean(int i, boolean z) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return z;
        }
        m75849b(i, 4);
        return this.f52509b.readInt() != 0;
    }

    public Boolean readBooleanObject(int i, Boolean bool) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bool;
        }
        if (m75848b(i) == 0) {
            return null;
        }
        m75847a(i, 4);
        int i2 = this.f52509b.readInt();
        if (i2 == 0) {
            return Boolean.FALSE;
        }
        if (i2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public Bundle readBundle(int i, Bundle bundle) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return bundle;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        Bundle bundle2 = this.f52509b.readBundle();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return bundle2;
    }

    public byte readByte(int i, byte b) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return b;
        }
        m75849b(i, 4);
        return (byte) this.f52509b.readInt();
    }

    public char readChar(int i, char c) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return c;
        }
        m75849b(i, 4);
        return (char) this.f52509b.readInt();
    }

    public double readDouble(int i, double d) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return d;
        }
        m75849b(i, 8);
        return this.f52509b.readDouble();
    }

    public Double readDoubleObject(int i, Double d) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return d;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        m75847a(iM75848b, 8);
        return Double.valueOf(this.f52509b.readDouble());
    }

    public float readFloat(int i, float f) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return f;
        }
        m75849b(i, 4);
        return this.f52509b.readFloat();
    }

    public Float readFloatObject(int i, Float f) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return f;
        }
        if (m75848b(i) == 0) {
            return null;
        }
        m75847a(i, 4);
        return Float.valueOf(this.f52509b.readFloat());
    }

    public IBinder readIBinder(int i, IBinder iBinder) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return iBinder;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        IBinder strongBinder = this.f52509b.readStrongBinder();
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return strongBinder;
    }

    public int readInt(int i, int i2) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return i2;
        }
        m75849b(i, 4);
        return this.f52509b.readInt();
    }

    public Integer readIntegerObject(int i, Integer num) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return num;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        m75847a(iM75848b, 4);
        return Integer.valueOf(this.f52509b.readInt());
    }

    public void readList(int i, List list, ClassLoader classLoader) {
        if (this.f52508a.containsKey(Integer.valueOf(i))) {
            int iM75848b = m75848b(i);
            int iDataPosition = this.f52509b.dataPosition();
            if (iM75848b != 0) {
                this.f52509b.readList(list, classLoader);
                this.f52509b.setDataPosition(iDataPosition + iM75848b);
            }
        }
    }

    public long readLong(int i, long j) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return j;
        }
        m75849b(i, 8);
        return this.f52509b.readLong();
    }

    public Long readLongObject(int i, Long l) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return l;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        m75847a(iM75848b, 8);
        return Long.valueOf(this.f52509b.readLong());
    }

    public <T extends Parcelable> T readParcelable(int i, Parcelable.Creator<T> creator, T t) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return t;
        }
        int iM75848b = m75848b(i);
        if (iM75848b == 0) {
            return null;
        }
        int iDataPosition = this.f52509b.dataPosition();
        T tCreateFromParcel = creator.createFromParcel(this.f52509b);
        this.f52509b.setDataPosition(iDataPosition + iM75848b);
        return tCreateFromParcel;
    }

    public short readShort(int i, short s) {
        if (!this.f52508a.containsKey(Integer.valueOf(i))) {
            return s;
        }
        m75849b(i, 4);
        return (short) this.f52509b.readInt();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [byte[], int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String, void] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int, java.lang.String] */
    /* JADX INFO: renamed from: a */
    private void m75846a() {
        int i = this.f52509b.readInt();
        int i2 = i & 65535;
        int i3 = (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : this.f52509b.readInt();
        if (i2 != 65262) {
            throw new ParseException(OooO00o.OooO00o("Parse header error, not 65262. Got 0x", Integer.toHexString(i2)), this.f52509b);
        }
        ?? DataPosition = this.f52509b.dataPosition();
        ?? r0 = i3 + DataPosition;
        if (r0 < DataPosition || r0 > this.f52509b.dataSize()) {
            throw new ParseException(Bundle.putByteArray(DataPosition, r0), this.f52509b);
        }
        while (this.f52509b.dataPosition() < r0) {
            int i4 = this.f52509b.readInt();
            int i5 = i4 & 65535;
            int i6 = (i4 & SupportMenu.CATEGORY_MASK) != -65536 ? (i4 >> 16) & 65535 : this.f52509b.readInt();
            int iDataPosition = this.f52509b.dataPosition();
            this.f52508a.put(Integer.valueOf(i5), new Integer[]{Integer.valueOf(iDataPosition), Integer.valueOf(i6)});
            this.f52509b.setDataPosition(iDataPosition + i6);
        }
        if (this.f52509b.dataPosition() != r0) {
            throw new ParseException(C21532OooOOo.OooO0OO(r0, "the dataPosition is not"), this.f52509b);
        }
    }

    /* JADX INFO: renamed from: b */
    private int m75849b(int i, int i2) {
        Integer[] numArr = this.f52508a.get(Integer.valueOf(i));
        if (numArr != null) {
            this.f52509b.setDataPosition(numArr[0].intValue());
            m75847a(i, i2);
            return i2;
        }
        throw new ParseException("Field is null:" + numArr, this.f52509b);
    }

    /* JADX INFO: renamed from: a */
    private void m75847a(int i, int i2) {
        Integer[] numArr = this.f52508a.get(Integer.valueOf(i));
        if (numArr == null) {
            throw new ParseException("Field is null:" + numArr, this.f52509b);
        }
        int iIntValue = numArr[1].intValue();
        if (iIntValue == i2) {
            return;
        }
        throw new ParseException(androidx.concurrent.futures.OooO00o.OooO0OO(C20398OooO0O0.OooO0O0("the field size is not ", i2, " got ", " (0x", iIntValue), Integer.toHexString(iIntValue), ")"), this.f52509b);
    }
}
