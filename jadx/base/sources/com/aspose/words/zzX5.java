package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzX5 {
    private Class zzZAs;
    private boolean zzZAt;
    private com.aspose.words.internal.zzZPU zzZAu;

    public zzX5(com.aspose.words.internal.zzZPU zzzpu) {
        this.zzZAu = zzzpu;
        this.zzZAs = zzzpu.getClass();
    }

    private static boolean zzP(com.aspose.words.internal.zzZP1 zzzp1) {
        int iIntValue = zzzp1.zzj9().intValue();
        return iIntValue == 1029 || iIntValue == 1032 || iIntValue == 1045 || iIntValue == 1049 || iIntValue == 1051 || iIntValue == 1063 || iIntValue == 2073 || iIntValue == 1058 || iIntValue == 1059;
    }

    private com.aspose.words.internal.zzZP1 zzQ(char c, int i) {
        com.aspose.words.internal.zzZP1 zzzp1ZzpZ = com.aspose.words.internal.zzZNG.zzpZ();
        if (zzQ(zzzp1ZzpZ)) {
            return zzzp1ZzpZ;
        }
        if (zzP(c, i)) {
            return zzj8();
        }
        return null;
    }

    private com.aspose.words.internal.zzZP0 zzR(com.aspose.words.internal.zzZP1 zzzp1) {
        if (zzzp1 == null) {
            return null;
        }
        com.aspose.words.internal.zzZP0 zzzp0Zzjc = zzzp1.zzjc();
        if (zzzp0Zzjc.zzjs().getClass() == this.zzZAs) {
            return zzzp0Zzjc;
        }
        com.aspose.words.internal.zzZP0 zzzp0ZziF = zzzp0Zzjc.zziF();
        zzzp0ZziF.zzZ(this.zzZAu);
        return zzzp0ZziF;
    }

    public abstract boolean zzP(char c, int i);

    public abstract String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, char c, int i);

    public void zzZ(com.aspose.words.internal.zzZQ9 zzzq9, StringBuilder sb, char c, int i, com.aspose.words.internal.zzZP1 zzzp1, String str, int i2) {
    }

    public abstract com.aspose.words.internal.zzZP1 zzj8();

    public final com.aspose.words.internal.zzZPU zzjs() {
        return this.zzZAu;
    }

    public final String zzZ(com.aspose.words.internal.zzZQ9 zzzq9, char c, int i, String str, int i2) {
        if (c == 'Y' || c == 'D' || c == 'S') {
            c = Character.toLowerCase(c);
        }
        char c2 = c;
        com.aspose.words.internal.zzZP1 zzzp1ZzQ = zzQ(c2, i);
        com.aspose.words.internal.zzZP0 zzzp0ZzR = zzR(zzzp1ZzQ);
        if (zzzp0ZzR == null) {
            return zzZ(zzzq9, c2, i);
        }
        this.zzZAt = this.zzZAt || c2 == 'd';
        StringBuilder sb = new StringBuilder(i + 1);
        if (i == 1) {
            sb.append('%');
        }
        com.aspose.words.internal.zzZNH.zzZ(sb, c2, i);
        zzZ(zzzq9, sb, c2, i, zzzp1ZzQ, str, i2);
        boolean z = zzP(zzzp1ZzQ) && this.zzZAt && c2 == 'M';
        if (z) {
            com.aspose.words.internal.zzZNH.zzU(sb, "dd");
        }
        String strZzY = zzzq9.zzY(sb.toString(), zzzp0ZzR);
        return z ? androidx.core.content.OooO0OO.OooO00o(2, 0, strZzY) : strZzY;
    }

    private boolean zzQ(com.aspose.words.internal.zzZP1 zzzp1) {
        for (com.aspose.words.internal.zzZPU zzzpu : zzzp1.zzja()) {
            if (zzzpu.getClass() == this.zzZAs) {
                return true;
            }
        }
        return false;
    }
}
