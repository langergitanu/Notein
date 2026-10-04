package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zz0O implements zzZBY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("+mn-lt", "+mn-ea", "+mn-cs", "+mj-lt", "+mj-ea", "+mj-cs");
    private HashMap<zz30, com.aspose.words.internal.zzPM> zzYXx = new HashMap<>();
    private DocumentBase zzZCL;

    public zz0O(DocumentBase documentBase) {
        this.zzZCL = documentBase;
    }

    public static String zzZ(String str, Theme theme) {
        if (theme != null) {
            int iZzTP = zzUR.zzTP(str);
            if (iZzTP == 0) {
                return theme.getFontName(131073);
            }
            if (iZzTP == 1) {
                return theme.getFontName(131075);
            }
            if (iZzTP == 2) {
                return theme.getFontName(131074);
            }
            if (iZzTP == 3) {
                return theme.getFontName(65537);
            }
            if (iZzTP == 4) {
                return theme.getFontName(65539);
            }
            if (iZzTP == 5) {
                return theme.getFontName(65538);
            }
        } else if ("+mn-lt".equals(str)) {
            return "Calibri";
        }
        return str;
    }

    @Override // com.aspose.words.zzZBY
    public final com.aspose.words.internal.zzPM zzS(zz30 zz30Var) {
        com.aspose.words.internal.zzPM zzpm = (com.aspose.words.internal.zzPM) com.aspose.words.internal.zzQW.zzZ(this.zzYXx, zz30Var);
        if (zzpm != null) {
            return zzpm;
        }
        String strZzZ = zzZ(zz30Var.zzZw1().zzZAY(), this.zzZCL.zzZqI());
        double dZzZsz = zz30Var.zzZvS().zzZsz();
        com.aspose.words.internal.zzPM zzpmZzY = this.zzZCL.zzZqy().zzY(strZzZ, (float) dZzZsz, zz30Var.zzza());
        this.zzYXx.put(zz30Var, zzpmZzY);
        return zzpmZzY;
    }
}
