package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4Y extends zzTI {
    private zzZ4X zzYcZ;
    private String zzYd1;
    private int zzYwC;
    private String zzZ3H;
    private int zzYd0 = -1;
    private int zzYwD = -1;

    private static String zzJe(String str) {
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(str);
        while (strZzTX.contains("  ")) {
            strZzTX = strZzTX.replace("  ", " ");
        }
        return strZzTX;
    }

    private static String zzJf(String str) {
        while (true) {
            if (!str.contains("\r") && !str.contains(IOUtils.LINE_SEPARATOR_UNIX)) {
                return zzJe(str);
            }
            str = str.replace("\r", " ").replace(IOUtils.LINE_SEPARATOR_UNIX, " ");
        }
    }

    public final boolean isValid() {
        int i;
        int i2 = this.zzYd0;
        if (i2 != -1 && (i = this.zzYwC) > i2 && this.zzYwD > i && this.zzZ3H.length() > 0 && this.zzYd1.length() > 0) {
            String str = this.zzYd1;
            if (zzZ4X.zzS(str, 0, str.length() - 1)) {
                return true;
            }
        }
        return false;
    }

    public final void reset() {
        zz9L();
        this.zzYd0 = -1;
        this.zzYwD = -1;
        this.zzYwC = -1;
        this.zzZ3H = "";
        this.zzYd1 = "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zz9v() {
        return true;
    }

    @Override // com.aspose.words.zzYI
    public final int zz9w() {
        return 1;
    }

    @Override // com.aspose.words.zzYI
    public final String zzM(String str, int i, int i2) {
        if (this.zzYd0 < 0) {
            return "";
        }
        int iZzW = com.aspose.words.internal.zzZKN.zzW(str, "]:", this.zzYwC, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8);
        this.zzYwD = iZzW;
        if (iZzW <= this.zzYwC) {
            this.zzYwD = -1;
        }
        return this.zzYwD == -1 ? "" : "]:";
    }

    public final zzZ4X zzYPq() {
        if (this.zzYcZ == null) {
            zzZ4X zzz4x = new zzZ4X();
            this.zzYcZ = zzz4x;
            zzz4x.zzY(new zzZ7V(this.zzYd1));
        }
        return this.zzYcZ;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final void zzZ(zzZ1T zzz1t) {
    }

    public final String zzZAT() {
        return this.zzZ3H;
    }

    @Override // com.aspose.words.zzYI
    public final String zzb(String str, int i) {
        int iZzZ;
        int i2 = i + 1;
        if (i2 > str.length() || (iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, "[", i, 1, com.aspose.words.internal.zzZOF.INVARIANT_CULTURE$4894b8c8)) != 0) {
            return "";
        }
        this.zzYd0 = iZzZ;
        this.zzYwC = i2;
        return "[";
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 3;
    }

    @Override // com.aspose.words.zzYI
    public final String zzc(String str, int i) {
        return "";
    }

    @Override // com.aspose.words.zzYI
    public final boolean zzf(String str, int i) {
        String strZzJe = zzJe(str);
        if (!zze(strZzJe, i)) {
            return false;
        }
        if (!"".equals(zz9C()) && "".equals(zz9B())) {
            return true;
        }
        if (!"".equals(zz9B())) {
            String strZzZ = com.aspose.words.internal.zzZKN.zzZ(zzJf(strZzJe.substring(1, this.zzYwD)), com.aspose.words.internal.zzZP1.zzj8());
            this.zzZ3H = strZzZ;
            if (zzZ1N.zzZ(strZzZ, 0, strZzZ.length() - 1, '[', ']')) {
                return false;
            }
            int i2 = this.zzYwD + 2;
            String strZzTZ = com.aspose.words.internal.zzZKN.zzTZ(strZzJe.substring(i2, (strZzJe.length() - i2) + i2));
            this.zzYd1 = strZzTZ;
            if (!zzZ4X.zzS(com.aspose.words.internal.zzZKN.zzTZ(strZzTZ), 0, this.zzYd1.length() - 1)) {
                if (zzZ4X.zzS(com.aspose.words.internal.zzZKN.zzTZ(this.zzYd1) + "'", 0, this.zzYd1.length())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final byte zzkz() {
        return (byte) 23;
    }

    @Override // com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        return false;
    }
}
