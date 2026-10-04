package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE5 {
    zzZU zzXpF;
    String zzXpG;
    char zzXpH;
    boolean zzXpI;
    boolean zzXpJ;
    boolean zzXpK;
    boolean zzXpL;
    int zzdZ;

    public zzYE5() {
        reset();
    }

    private void reset() {
        this.zzXpL = false;
        this.zzXpK = false;
        this.zzXpJ = false;
        this.zzXpI = false;
        this.zzdZ = -1;
        this.zzXpH = (char) 0;
        this.zzXpG = null;
    }

    public static zzYE5 zzY(char c, String str) {
        zzYE5 zzye5 = new zzYE5();
        zzye5.zzXpL = false;
        zzye5.zzdZ = -1;
        zzye5.zzXpH = c;
        zzye5.zzXpG = str;
        return zzye5;
    }

    public static zzYE5 zzYdn() {
        zzYE5 zzye5 = new zzYE5();
        zzye5.zzXpL = true;
        zzye5.zzdZ = 0;
        return zzye5;
    }
}
