package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYV {
    private int zzXYT;
    private int zzXYU;
    private zzYYR zzXYV;
    private zzYYV zzXYW;
    private String zzXYX;
    private ArrayList<zzYYV> zzpe = new ArrayList<>();
    private String zzXYS = "";

    public zzYYV(String str, zzYYV zzyyv, zzYYR zzyyr, int i, int i2) {
        this.zzXYX = str;
        this.zzXYW = zzyyv;
        this.zzXYV = zzyyr;
        this.zzXYU = i + zzyyr.getLength();
        this.zzXYT = i2 - zzyyr.getLength();
    }

    private static String zzU(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 3; i++) {
            com.aspose.words.internal.zzZNH.zzZ(sb, strArr[i], "");
        }
        return sb.toString();
    }

    private void zzZq(ArrayList<zzYYV> arrayList) {
        for (zzYYV zzyyv : this.zzpe) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zzyyv);
            zzyyv.zzZq(arrayList);
        }
    }

    public final void zzI8(String str) {
        this.zzXYS = str;
    }

    public final zzYYV zzYDm() {
        return this.zzXYW;
    }

    public final int zzYDn() {
        return this.zzXYU;
    }

    public final String zzYDo() {
        zzYYV zzyyv;
        zzYYV zzyyv2 = this;
        while (com.aspose.words.internal.zzZKN.zzU3(zzyyv2.zzXYS) && (zzyyv = zzyyv2.zzXYW) != null) {
            zzyyv2 = zzyyv;
        }
        return zzyyv2.zzXYS;
    }

    public final zzYYR zzYDp() {
        return this.zzXYV;
    }

    public final zzYYV[] zzYDq() {
        ArrayList<zzYYV> arrayList = new ArrayList<>();
        zzZq(arrayList);
        return (zzYYV[]) arrayList.toArray(new zzYYV[0]);
    }

    public final com.aspose.words.internal.zzZO0 zzYDr() {
        String strZzYDf = this.zzXYV.zzYDf();
        com.aspose.words.internal.zzZNT zzzntZzU = new com.aspose.words.internal.zzZNR("<meta\\s[^\\<\\>]*charset\\s*=(3D)*\"?([\\w\\s=-]+)", 74).zzU(this.zzXYX, this.zzXYU, this.zzXYT);
        if (zzzntZzU.zzhL()) {
            String strZzU = zzU(OooO0O0.OooO00o(zzzntZzU, 2), new String[]{"=", "\r", IOUtils.LINE_SEPARATOR_UNIX});
            if (!com.aspose.words.internal.zzZYD.zzi(strZzU, "unicode")) {
                strZzYDf = strZzU;
            }
        }
        return zzYYS.zzI4(strZzYDf);
    }

    public final com.aspose.words.internal.zzZOR zzYDs() throws Exception {
        try {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            zzYYS.zzZ(zzzor, this.zzXYX, this.zzXYU, this.zzXYT, this.zzXYV.zzYDe());
            zzzor.zzH(0L);
            return zzzor;
        } catch (Exception unused) {
            return null;
        }
    }

    public final ArrayList<zzYYV> zzyD() {
        return this.zzpe;
    }
}
