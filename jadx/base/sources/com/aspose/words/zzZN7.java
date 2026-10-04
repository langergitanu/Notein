package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZN7 {
    private static void zzR(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("vertical-align");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        if (zzl4ZzZVx.zzP(zzL4.zzZly) || zzl4ZzZVx.zzP(zzL4.zzZm1)) {
            font.setHidden(true);
        }
    }

    private static void zzS(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("text-transform");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        font.setAllCaps(zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZnc));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzT(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("font-weight");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        int valueType = zzl4ZzZVx.getValueType();
        boolean z = false;
        if (valueType != 0) {
            if (valueType != 3) {
                return;
            }
            if (zzl4ZzZVx.getDoubleValue() >= 600.0d) {
                z = true;
            }
        } else if (zzl4ZzZVx.zzP(zzL4.zzZn3) || zzl4ZzZVx.zzP(zzL4.zzZn2)) {
        }
        font.setBold(z);
        font.setBoldBi(z);
    }

    private static void zzU(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("font-style");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        font.setItalic(zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZn5));
        font.setItalicBi(font.getItalic());
    }

    private static void zzV(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("font-variant");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        font.setSmallCaps(zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZn6));
    }

    private static void zzW(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("display");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        if (zzptZzSx.zzZWj().zzZVx().zzP(zzL4.zzZno)) {
            font.setHidden(true);
        }
    }

    private static void zzX(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("color");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        if (zzl4ZzZVx.getValueType() == 2) {
            font.zzm(((zzQC) zzl4ZzZVx).zzZWw());
        }
    }

    private static void zzY(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("letter-spacing");
        if (zzptZzSx == null) {
            return;
        }
        zzptZzSx.zzZWj().getCount();
        zzL4 zzl4ZzZVx = zzptZzSx.zzZWj().zzZVx();
        double dZzL = zzl4ZzZVx.zzP(zzL4.zzZnb) ? 0.0d : zzL5.zzL(zzl4ZzZVx);
        if (com.aspose.words.internal.zzAN.zzZC(dZzL)) {
            return;
        }
        font.setSpacing(dZzL);
    }

    public abstract void zzY(Font font, int i, zzPS zzps) throws Exception;

    public abstract void zzY(Font font, zzLS zzls) throws Exception;

    public final void zzZ(Font font, zzLS zzls) throws Exception {
        zzZ(font, zzls.zzZUC());
        zzZ(font, zzls.zzZUr());
        zzZ(font, zzls.zzZUp());
        zzZ(font, new zzRV(zzls.zzZUq().zzZjK()));
        font.setLocaleId(zzls.getLocaleId());
        font.setLocaleIdBi(zzls.getLocaleIdBi());
        font.setLocaleIdFarEast(zzls.getLocaleIdFarEast());
        zzY(font, zzls);
    }

    public final void zzZ(Font font, int i, zzPS zzps) throws Exception {
        zzZ(font, zzps);
        zzZ(font, zzRL.zzY(zzps));
        zzZ(font, new zzL1(zzps));
        zzZ(font, new zzRV(zzps));
        zzY(font, i, zzps);
    }

    private static void zzZ(Font font, zzPS zzps) {
        zzX(font, zzps);
        zzW(font, zzps);
        zzU(font, zzps);
        zzV(font, zzps);
        zzT(font, zzps);
        zzY(font, zzps);
        zzS(font, zzps);
        zzR(font, zzps);
    }

    private static void zzZ(Font font, zzRL zzrl) {
        if (zzrl.zzZXh()) {
            return;
        }
        zzrl.zzI(font.getBorder());
    }

    private static void zzZ(Font font, zzL1 zzl1) {
        if (zzl1.zzZTN() == null) {
            return;
        }
        zzl1.zzZTN().getCount();
        zzL4 zzl4ZzZVx = zzl1.zzZTN().zzZVx();
        if (zzl4ZzZVx.getValueType() != 0) {
            double dZzL = zzL5.zzL(zzl4ZzZVx);
            if (com.aspose.words.internal.zzAN.zzZC(dZzL)) {
                return;
            }
            font.setPosition(dZzL);
            return;
        }
        if (zzl4ZzZVx.zzP(zzL4.zzZmS)) {
            font.setVerticalAlignment(2);
        } else if (zzl4ZzZVx.zzP(zzL4.zzZmR)) {
            font.setVerticalAlignment(1);
        } else if (zzl4ZzZVx.zzP(zzL4.zzZmT)) {
            font.setVerticalAlignment(0);
        }
    }

    private static void zzZ(Font font, zzRV zzrv) {
        zzrv.zzY(font.getShading());
    }
}
