package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYJ {
    private zzD3<String> zzc3;
    private zzZYI zzc4;

    public zzZYJ() {
        this(true);
    }

    public static boolean zzWm(int i) {
        return i == Integer.MIN_VALUE;
    }

    public final String getValue(int i) {
        return zzO(i, null);
    }

    public final int zzG(String str, int i) {
        return zzY1.zzS(zzXo(str), i);
    }

    public final void zzH(String str, int i) {
        this.zzc4.add(str, i);
        this.zzc3.add(i, str);
    }

    public final String zzO(int i, String str) {
        return zzY1.zzS(zzSY(i), str);
    }

    public final void zzP(int i, String str) {
        zzH(str, i);
    }

    public final String zzSY(int i) {
        if (!zzWm(i) && this.zzc3.zzVE(i)) {
            return this.zzc3.get(i);
        }
        return null;
    }

    public final boolean zzVA(int i) {
        return this.zzc4.zzVA(i);
    }

    public final int zzXo(String str) {
        if (str == null) {
            return Integer.MIN_VALUE;
        }
        int i = this.zzc4.get(str);
        if (zzZYI.zzWm(i)) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    public final int zzXp(String str) {
        return zzG(str, Integer.MIN_VALUE);
    }

    public zzZYJ(boolean z) {
        this.zzc4 = new zzZYI(z);
        this.zzc3 = new zzD3<>();
    }
}
