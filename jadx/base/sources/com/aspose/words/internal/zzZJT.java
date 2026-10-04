package com.aspose.words.internal;

import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJT extends zzZKE {
    public zzZJT(ByteOrder byteOrder, zzZOP zzzop) throws Exception {
        super(byteOrder, zzzop);
    }

    public final void zzZ(zzZJX zzzjx) throws Exception {
        int count = zzzjx.getCount();
        Object data = zzzjx.getData();
        if (data == null) {
            return;
        }
        switch (zzzjx.getType()) {
            case 1:
            case 6:
            case 7:
                writeBytes((byte[]) data);
                return;
            case 2:
                for (int i = 0; i < count; i++) {
                    String str = ((String[]) data)[i];
                    int length = str.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        writeByte((byte) (str.charAt(i2) & 255));
                    }
                    writeByte(0);
                }
                return;
            case 3:
                char[] cArr = (char[]) data;
                zzX(cArr, cArr.length);
                return;
            case 4:
                break;
            case 5:
                for (int i3 = 0; i3 < count; i3++) {
                    long[] jArr = ((long[][]) data)[i3];
                    long j = jArr[0];
                    long j2 = jArr[1];
                    writeInt((int) j);
                    writeInt((int) j2);
                }
                return;
            case 8:
                short[] sArr = (short[]) data;
                zzY(sArr, sArr.length);
                return;
            case 9:
                int[] iArr = (int[]) data;
                zzX(iArr, iArr.length);
                return;
            case 10:
                for (int i4 = 0; i4 < count; i4++) {
                    int[][] iArr2 = (int[][]) data;
                    writeInt(iArr2[i4][0]);
                    writeInt(iArr2[i4][1]);
                }
                return;
            case 11:
                float[] fArr = (float[]) data;
                zzX(fArr, fArr.length);
                return;
            case 12:
                double[] dArr = (double[]) data;
                zzY(dArr, dArr.length);
                return;
            case 13:
                writeInt(0);
                return;
            default:
                return;
        }
        for (int i5 = 0; i5 < count; i5++) {
            writeInt((int) ((long[]) data)[i5]);
        }
    }
}
