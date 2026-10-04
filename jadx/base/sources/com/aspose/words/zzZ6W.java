package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6W {
    private com.aspose.words.internal.zzP zzYgk;
    private zzZYW zzYgl;

    public zzZ6W(zzZYW zzzyw) {
        this.zzYgl = zzzyw;
    }

    private static String zzC(zzYMD zzymd) {
        int iZz60 = zzymd.zz60();
        if (iZz60 == 1) {
            return "page";
        }
        if (iZz60 == 8) {
            return "row";
        }
        if (iZz60 != 64) {
            if (iZz60 != 1024) {
                return null;
            }
            return ((zzZKY) zzymd).isHeader() ? "header" : "footer";
        }
        if (zzymd instanceof zzY9X) {
            return "shape";
        }
        return null;
    }

    private void zzD(zzYMD zzymd) throws Exception {
        if (zzymd == null) {
            return;
        }
        String strZzC = zzC(zzymd);
        if (strZzC != null) {
            this.zzYgk.zzY(strZzC);
            zzE(zzymd);
            this.zzYgk.zzp();
        }
        zzTF zztf = (zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzTF.class);
        if (zztf != null) {
            for (zzYMD zzymdZz6x = zztf.zz6x(); zzymdZz6x != null; zzymdZz6x = zzymdZz6x.zz5Z()) {
                zzD(zzymdZz6x);
            }
        }
    }

    private void zzE(zzYMD zzymd) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzSA.zzY(zzZ(zzymd, new com.aspose.words.internal.zzZQ5(zzymd.zzYqr(), zzymd.getSize())));
        this.zzYgk.zzX(DrawToolFactory.LASSO_TYPE_RECT, com.aspose.words.internal.zzZKN.format("{0},{1},{2},{3}", Float.valueOf(zzzq4ZzY.getX()), Float.valueOf(zzzq4ZzY.getY()), Float.valueOf(zzzq4ZzY.getWidth()), Float.valueOf(zzzq4ZzY.getHeight())));
    }

    private static com.aspose.words.internal.zzZQ5 zzZ(zzYMD zzymd, com.aspose.words.internal.zzZQ5 zzzq5) throws Exception {
        zzZKY zzzky = (zzZKY) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzZKY.class);
        if (zzzky == null) {
            return zzzq5;
        }
        zzYN8 zzyn8 = (zzYN8) zzzky.zzZZJ();
        if (zzzky.isHeader()) {
            return new com.aspose.words.internal.zzZQ5(zzzq5.getX(), zzzq5.getY(), zzzq5.getWidth(), ((zzUZ) ((zzYN8) zzzky.zzZZJ()).zz6x()).getY() - zzzq5.getY());
        }
        return new com.aspose.words.internal.zzZQ5(zzzq5.getX(), zzyn8.zzYql().getBottom(), zzzq5.getWidth(), Math.max(0, zzzky.getY() - zzyn8.zzYql().getBottom()) + zzzky.getHeight());
    }

    public final void zzYY(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            return;
        }
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzop, false);
        this.zzYgk = zzp;
        zzp.zzZ("layout");
        zzYN8 zzyn8 = (zzYN8) this.zzYgl.zzZp0().zz6x();
        int i = 1;
        while (zzyn8 != null) {
            zzZ(zzyn8, i);
            zzyn8 = (zzYN8) zzyn8.zzYo1();
            i++;
        }
        this.zzYgk.endDocument();
    }

    private void zzZ(zzYN8 zzyn8, int i) throws Exception {
        this.zzYgk.zzY(zzC(zzyn8));
        this.zzYgk.zzX(FirebaseAnalytics.Param.INDEX, Integer.toString(i));
        zzD(zzyn8.zzYqq());
        for (zzUZ zzuz = (zzUZ) zzyn8.zz6x(); zzuz != null; zzuz = (zzUZ) zzuz.zz5Z()) {
            zzD(zzuz);
            zzD(zzuz.zz09());
            zzD(zzuz.zz08());
        }
        zzD(zzyn8.zzYqp());
        this.zzYgk.zzp();
    }
}
