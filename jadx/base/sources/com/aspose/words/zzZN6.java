package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN6 extends zzZN7 {
    private zzZYZ zzYSF;
    private boolean zzYxs;

    public zzZN6(boolean z, zzZYZ zzzyz) {
        this.zzYxs = z;
        this.zzYSF = zzzyz;
    }

    private void zzP(Font font, zzPS zzps) {
        String string = zzps.getString("-aw-font-family");
        if (com.aspose.words.internal.zzZYD.zzXk(string)) {
            font.setName(string);
            return;
        }
        String strZzZ = zzps.zzZ(this.zzYSF);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            font.setName(strZzZ);
        }
    }

    private void zzQ(Font font, zzPS zzps) {
        zzPT zzptZzSx;
        zzPT zzptZzSx2 = zzps.zzSx("font-size");
        boolean z = true;
        boolean z2 = zzptZzSx2 != null;
        double dZzW = zzptZzSx2 != null ? zzL5.zzW(zzptZzSx2.zzZWj()) : 12.0d;
        if (com.aspose.words.internal.zzAN.zzZC(dZzW)) {
            return;
        }
        if (this.zzYxs && (zzptZzSx = zzps.zzSx("vertical-align")) != null && (zzptZzSx.zzZWj().zzP(zzL4.zzZmS) || zzptZzSx.zzZWj().zzP(zzL4.zzZmR))) {
            dZzW *= 1.5d;
        } else {
            z = z2;
        }
        if (z) {
            font.setSize(dZzW);
            font.setSizeBi(dZzW);
        }
    }

    private static void zzS(Font font) {
        font.zzZ7g().removeRunAttr(140);
        font.zzZ7g().removeRunAttr(450);
        font.zzZ7g().removeRunAttr(80);
    }

    private static void zzZ(Font font, zzLN zzln) {
        if (zzln.zzZUb() == 1) {
            font.setStrikeThrough(true);
        }
        if (zzln.zzZUd() == 1) {
            font.setUnderline(1);
            if (zzln.zzZUc() != null) {
                font.zz9(zzln.zzZUc());
            }
        }
    }

    @Override // com.aspose.words.zzZN7
    public final void zzY(Font font, zzLS zzls) {
        if (this.zzYxs) {
            font.setSize(12.0d);
            font.setSizeBi(12.0d);
        }
        zzQ(font, zzls.zzZUC());
        zzP(font, zzls.zzZUC());
        zzZ(font, zzls.zzZUs());
    }

    @Override // com.aspose.words.zzZN7
    public final void zzY(Font font, int i, zzPS zzps) {
        zzQ(font, zzps);
        zzP(font, zzps);
        zzS(font);
    }
}
