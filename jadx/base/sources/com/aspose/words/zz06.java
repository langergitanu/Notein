package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zz06 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("ext", "off", "chExt", "chOff");
    private zzYO3 zzZ88;
    private zzYU4 zzZ89;

    private zz06(zzYU4 zzyu4, zzYO3 zzyo3) {
        this.zzZ89 = zzyu4;
        this.zzZ88 = zzyo3;
    }

    public static zz07 zzK(zzYU4 zzyu4, zzYO3 zzyo3) {
        if (!"xfrm".equals(zzyu4.getLocalName()) && !"txXfrm".equals(zzyu4.getLocalName())) {
            return null;
        }
        zz06 zz06Var = new zz06(zzyu4, zzyo3);
        zz07 zz07Var = new zz07();
        zz06Var.zzS(zz07Var);
        return zz07Var;
    }

    public static zz6X zzL(zzYU4 zzyu4, zzYO3 zzyo3) {
        if (!"xfrm".equals(zzyu4.getLocalName())) {
            return null;
        }
        zz06 zz06Var = new zz06(zzyu4, zzyo3);
        zz6X zz6x = new zz6X();
        zz06Var.zzY(zz6x);
        return zz6x;
    }

    private void zzP(zz07 zz07Var) {
        zz07Var.setWidth(this.zzZ89.zzS("cx", this.zzZ88));
        zz07Var.setHeight(this.zzZ89.zzS(TranslateLanguage.WELSH, this.zzZ88));
    }

    private void zzQ(zz07 zz07Var) {
        zz07Var.zzW(this.zzZ89.zzS("x", this.zzZ88));
        zz07Var.zzV(this.zzZ89.zzS("y", this.zzZ88));
    }

    private void zzR(zz07 zz07Var) {
        boolean zZzX = this.zzZ89.zzX("flipH", false);
        boolean zZzX2 = this.zzZ89.zzX("flipV", false);
        if (zZzX) {
            zz07Var.setFlipOrientation(1);
        }
        if (zZzX2) {
            zz07Var.setFlipOrientation(2);
        }
        if (zZzX && zZzX2) {
            zz07Var.setFlipOrientation(3);
        }
        zz07Var.zzX(zzHK.zzYS(this.zzZ89.zzZ("rot", 0.0d)));
    }

    private void zzS(zz07 zz07Var) {
        String localName = this.zzZ89.getLocalName();
        zzR(zz07Var);
        while (this.zzZ89.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
            if (iZzTP == 0) {
                zzP(zz07Var);
            } else if (iZzTP != 1) {
                zz39.zzK(this.zzZ89);
            } else {
                zzQ(zz07Var);
            }
        }
    }

    private void zzY(zz6X zz6x) {
        zzR(zz6x);
        while (this.zzZ89.zzQ("xfrm")) {
            int iZzTP = zzUR.zzTP(this.zzZ89.getLocalName());
            if (iZzTP == 0) {
                zzP(zz6x);
            } else if (iZzTP == 1) {
                zzQ(zz6x);
            } else if (iZzTP == 2) {
                zz6x.zzXT(this.zzZ89.zzZ("cx", 0.0d));
                zz6x.zzXS(this.zzZ89.zzZ(TranslateLanguage.WELSH, 0.0d));
            } else if (iZzTP != 3) {
                zz39.zzK(this.zzZ89);
            } else {
                zz6x.zzXR(this.zzZ89.zzS("x", this.zzZ88));
                zz6x.zzXQ(this.zzZ89.zzS("y", this.zzZ88));
            }
        }
    }
}
