package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZPC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\#", "\\@");
    private String mName;
    private zzZR8 zzYBN;
    private zzYWB zzZtB;

    public zzZPC(zzYWB zzywb, String str, zzZR8 zzzr8) {
        this.zzZtB = zzywb;
        this.mName = str;
        this.zzYBN = zzzr8;
    }

    public static boolean zzLI(String str) {
        return zzLK(str) || "\\*".equals(str);
    }

    public static boolean zzLJ(String str) {
        return "\\*".equals(str);
    }

    public static boolean zzLK(String str) {
        int iZzTP = zzUR.zzTP(str);
        return iZzTP == 0 || iZzTP == 1;
    }

    public final String getName() {
        return this.mName;
    }

    public final boolean zzLL(String str) {
        return com.aspose.words.internal.zzZYD.zzi(this.mName, str);
    }

    public final zzZPC zzN(zzYWB zzywb) {
        return new zzZPC(zzywb, this.mName, this.zzYBN);
    }

    public final zzZPC zzQ(zzZR8 zzzr8) {
        return new zzZPC(this.zzZtB, this.mName, zzzr8);
    }

    public final String zzZca() {
        if (zzZcb()) {
            return this.zzYBN.zzW2(true);
        }
        return null;
    }

    public final boolean zzZcb() {
        return this.zzYBN != null;
    }

    public final zzZR8 zzZcc() {
        return this.zzYBN;
    }

    public final zzYWB zzZga() {
        return this.zzZtB;
    }
}
