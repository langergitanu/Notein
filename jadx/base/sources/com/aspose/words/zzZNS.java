package com.aspose.words;

import androidx.core.view.PointerIconCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNS {
    private boolean zzYFQ;
    private boolean zzYyk;
    private zzZ9Q zzYyl;

    private zzZNS(zzZ9Q zzz9q) {
        this.zzYyl = zzz9q;
    }

    public static void zzS(zzY6G zzy6g) {
        if (zzy6g.get(4010) != null) {
            return;
        }
        Object objValueOf = zzy6g.get(5101);
        Object obj = zzy6g.get(5111);
        if (obj != null) {
            zzy6g.zzQ(4380, (Boolean) obj);
            if (objValueOf == null && zzy6g.getBidi()) {
                objValueOf = zzY6G.zzOt(4010);
            }
        }
        if (objValueOf == null) {
            return;
        }
        if (zzy6g.getBidi()) {
            objValueOf = Integer.valueOf(zzY6G.zzqE(((Integer) objValueOf).intValue()));
        }
        zzy6g.zzQ(4010, objValueOf);
    }

    public static void zzW(StyleCollection styleCollection) {
        for (Style style : styleCollection) {
            if (style.getType() == 1) {
                zzZ(style);
            }
        }
    }

    public static void zzZ(zzZ9Q zzz9q) {
        zzZNS zzzns = new zzZNS(zzz9q);
        zzzns.zzi(1620, 1160, EditingLanguage.BRETON);
        zzzns.zzi(1630, EditingLanguage.BRETON, 1160);
        zzzns.zzi(1640, EditingLanguage.CENTRAL_KURDISH_IRAQ, EditingLanguage.CENTRAL_KURDISH_IRAQ);
        zzzns.zzZ9j();
    }

    private boolean zzZ9i() {
        if (!this.zzYyk) {
            this.zzYFQ = ((Boolean) this.zzYyl.fetchParaAttr(1560)).booleanValue();
            this.zzYyk = true;
        }
        return this.zzYFQ;
    }

    private void zzZ9j() {
        Object directParaAttr = this.zzYyl.getDirectParaAttr(1610);
        if (directParaAttr == null) {
            return;
        }
        if (zzZ9i()) {
            directParaAttr = Integer.valueOf(zzYMX.zzqE(((Integer) directParaAttr).intValue()));
        }
        this.zzYyl.setParaAttr(PointerIconCompat.TYPE_GRAB, directParaAttr);
    }

    private void zzi(int i, int i2, int i3) {
        Object directParaAttr = this.zzYyl.getDirectParaAttr(i);
        if (directParaAttr == null) {
            return;
        }
        if (zzZ9i()) {
            i2 = i3;
        }
        this.zzYyl.setParaAttr(i2, directParaAttr);
    }
}
