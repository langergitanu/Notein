package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZZ {
    public static int zz8(int i, boolean z) {
        if (z) {
            return 4;
        }
        switch (i) {
            case 1:
            case 5:
                return 5;
            case 2:
                return 2;
            case 3:
            case 4:
            case 6:
                return 1;
            default:
                return 0;
        }
    }

    public static long zzGw(int i) {
        switch (i) {
            case 0:
                return com.aspose.words.internal.zzZPY.zzG(-0.5f, -0.5f);
            case 1:
                return com.aspose.words.internal.zzZPY.zzG(0.0f, -0.5f);
            case 2:
                return com.aspose.words.internal.zzZPY.zzG(0.5f, -0.5f);
            case 3:
                return com.aspose.words.internal.zzZPY.zzG(-0.5f, 0.0f);
            case 4:
            case 9:
                return com.aspose.words.internal.zzZPY.zzG(0.0f, 0.0f);
            case 5:
                return com.aspose.words.internal.zzZPY.zzG(0.5f, 0.0f);
            case 6:
                return com.aspose.words.internal.zzZPY.zzG(-0.5f, 0.5f);
            case 7:
                return com.aspose.words.internal.zzZPY.zzG(0.0f, 0.5f);
            case 8:
                return com.aspose.words.internal.zzZPY.zzG(0.5f, 0.5f);
            default:
                return 0L;
        }
    }

    public static int zzGx(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int zzGy(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int zzGz(int i) {
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return (i == 3 || i == 5) ? 1 : 0;
        }
        return 2;
    }

    public static int zzX(double d, double d2, int i) {
        if (com.aspose.words.internal.zzAN.zzL(d, d2)) {
            return 0;
        }
        return (int) (d > d2 ? com.aspose.words.internal.zzZKQ.zzZa((1.0d - (d2 / d)) * ((double) i)) : com.aspose.words.internal.zzZKQ.zzZa((1.0d - (d / d2)) * ((double) (-i))));
    }

    public static zzZLE[] zzY(ArrayList<zz7B> arrayList, zzZ90 zzz90) {
        zzZLE[] zzzleArr = new zzZLE[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            zz7B zz7b = arrayList.get(i);
            zzZLE zzzle = new zzZLE();
            zzzle.zzYuy = zz7b.zzZQX().zzZ(zzz90, (zzZCM) null);
            zzzle.zzZfb = com.aspose.words.internal.zzAN.zzZG((zz3W.zzXy(zz7b.getPosition()) / 100000.0d) * 65536.0d);
            zzzleArr[i] = zzzle;
        }
        return zzzleArr;
    }

    public static Object zzZC(Object obj) {
        if (obj instanceof zz4W) {
            return null;
        }
        return obj;
    }
}
