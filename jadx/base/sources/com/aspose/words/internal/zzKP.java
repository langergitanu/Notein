package com.aspose.words.internal;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzKP {
    private boolean zzV(boolean z, boolean z2) {
        return z2 && z && !zzIP();
    }

    public String getSeparator() {
        return " ";
    }

    public boolean zzIO() {
        return false;
    }

    public boolean zzIP() {
        return false;
    }

    public boolean zzIQ() {
        return false;
    }

    public abstract String zzL(boolean z);

    public final String zzP(int i, boolean z) {
        int i2 = i - 2;
        return z ? zzXH()[i2] : zzXI()[i2];
    }

    public final String zzQ(int i, boolean z) {
        int i2 = i - 1;
        return z ? zzXK()[i2] : zzXJ()[i2];
    }

    public void zzW(StringBuilder sb) {
        zzZNH.zzU(sb, zzXP());
    }

    public void zzX(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzP(i, z), true);
    }

    public abstract String zzXG();

    public abstract String[] zzXH();

    public abstract String[] zzXI();

    public abstract String[] zzXJ();

    public abstract String[] zzXK();

    public boolean zzXL() {
        return false;
    }

    public abstract boolean zzXM();

    public String zzXN() {
        return " ";
    }

    public String zzXO() {
        return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
    }

    public abstract String zzXP();

    public void zzY(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, (i == 1 && zzIP() && z && !z3) ? "eins" : zzQ(i, z), true, zzV(z, z2) ? zzXO() : getSeparator());
    }

    public abstract String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList);

    public void zzZ(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        if (i < 20) {
            if (i > 0) {
                zzY(sb, i, i2, z, z2, z3, z4, arrayList, i3);
            }
        } else {
            int i4 = i / 10;
            int i5 = i - (i4 * 10);
            if (i5 == 0) {
                zzX(sb, i4, i2, z, z2, z3, z4, arrayList, i3);
            } else {
                zzZ(sb, i4, i5, i2, z, z2, z3, z4, arrayList, i3);
            }
        }
    }

    public abstract void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2);

    public static boolean zzW(ArrayList<Integer> arrayList, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public String zzX(long j, boolean z) {
        return "";
    }

    public String zzY(long j, boolean z) {
        return "";
    }

    public void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        String str;
        boolean zZzV = zzV(z, z2);
        String strZzXO = (z || zzIP()) ? zzXO() : getSeparator();
        if (!zzIP()) {
            str = zzP(i, z) + strZzXO + zzQ(i2, z);
        } else {
            str = zzQ(i2, true) + strZzXO + zzP(i, z);
        }
        zzZ(sb, str, true, zZzV ? zzXN() : getSeparator());
    }

    public final void zzZ(StringBuilder sb, String str, boolean z) {
        zzZ(sb, str, z, getSeparator());
    }

    public static void zzZ(StringBuilder sb, String str, boolean z, String str2) {
        if (z && sb.length() != 0) {
            zzZNH.zzU(sb, str2);
        }
        zzZNH.zzU(sb, str);
    }

    public boolean zzZ(boolean z, int i, ArrayList<Integer> arrayList, int i2) {
        return z || !zzIQ();
    }
}
