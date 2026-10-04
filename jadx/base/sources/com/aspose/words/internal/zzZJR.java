package com.aspose.words.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class zzZJR {
    public static int zzR(int i, Object obj) {
        switch (i) {
            case 1:
            case 7:
                return ((byte[]) obj)[0] & 255;
            case 2:
                return (int) Double.parseDouble(((String[]) obj)[0]);
            case 3:
                return ((char[]) obj)[0] & 65535;
            case 4:
            case 13:
                return (int) ((long[]) obj)[0];
            case 5:
                long[] jArr = ((long[][]) obj)[0];
                return (int) (jArr[0] / jArr[1]);
            case 6:
                return ((byte[]) obj)[0];
            case 8:
                return ((short[]) obj)[0];
            case 9:
                return ((int[]) obj)[0];
            case 10:
                int[] iArr = ((int[][]) obj)[0];
                return (int) (((double) iArr[0]) / ((double) iArr[1]));
            case 11:
                return (int) ((float[]) obj)[0];
            case 12:
                return (int) ((double[]) obj)[0];
            default:
                throw new ClassCastException();
        }
    }

    public static Object zzZ(zzZKF zzzkf, int i, int i2) throws Exception {
        int i3 = 0;
        switch (i) {
            case 1:
            case 6:
            case 7:
                byte[] bArr = new byte[i2];
                zzzkf.readFully(bArr, 0, i2);
                return bArr;
            case 2:
                byte[] bArr2 = new byte[i2];
                zzzkf.readFully(bArr2, 0, i2);
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                int i4 = 0;
                for (int i5 = 0; i5 <= i2; i5++) {
                    if (i5 >= i2 || bArr2[i5] == 0) {
                        if (z) {
                            arrayList.add(new String(bArr2, i4, i5 - i4));
                            z = false;
                        }
                    } else if (!z) {
                        i4 = i5;
                        z = true;
                    }
                }
                int size = arrayList.size();
                if (size == 0) {
                    return new String[]{""};
                }
                String[] strArr = new String[size];
                while (i3 < size) {
                    strArr[i3] = (String) arrayList.get(i3);
                    i3++;
                }
                return strArr;
            case 3:
                char[] cArr = new char[i2];
                while (i3 < i2) {
                    cArr[i3] = (char) zzzkf.readUnsignedShort();
                    i3++;
                }
                return cArr;
            case 4:
            case 13:
                long[] jArr = new long[i2];
                while (i3 < i2) {
                    jArr[i3] = zzzkf.zzf1();
                    i3++;
                }
                return jArr;
            case 5:
                long[][] jArr2 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i2, 2);
                for (int i6 = 0; i6 < i2; i6++) {
                    jArr2[i6][0] = zzzkf.zzf1();
                    jArr2[i6][1] = zzzkf.zzf1();
                }
                return jArr2;
            case 8:
                short[] sArr = new short[i2];
                while (i3 < i2) {
                    sArr[i3] = zzzkf.readShort();
                    i3++;
                }
                return sArr;
            case 9:
                int[] iArr = new int[i2];
                while (i3 < i2) {
                    iArr[i3] = zzzkf.readInt();
                    i3++;
                }
                return iArr;
            case 10:
                int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, 2);
                for (int i7 = 0; i7 < i2; i7++) {
                    iArr2[i7][0] = zzzkf.readInt();
                    iArr2[i7][1] = zzzkf.readInt();
                }
                return iArr2;
            case 11:
                float[] fArr = new float[i2];
                while (i3 < i2) {
                    fArr[i3] = zzzkf.readFloat();
                    i3++;
                }
                return fArr;
            case 12:
                double[] dArr = new double[i2];
                while (i3 < i2) {
                    dArr[i3] = zzzkf.readDouble();
                    i3++;
                }
                return dArr;
            default:
                System.out.println("BAD TAG VALUE: " + i);
                return null;
        }
    }

    public static int[] zzZS(Object obj) {
        if (obj instanceof int[]) {
            return (int[]) obj;
        }
        int i = 0;
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int[] iArr = new int[cArr.length];
            while (i < cArr.length) {
                iArr[i] = cArr[i] & 65535;
                i++;
            }
            return iArr;
        }
        if (!(obj instanceof short[])) {
            throw new ClassCastException("Data not char[], short[], or int[]!");
        }
        short[] sArr = (short[]) obj;
        int[] iArr2 = new int[sArr.length];
        while (i < sArr.length) {
            iArr2[i] = sArr[i];
            i++;
        }
        return iArr2;
    }
}
