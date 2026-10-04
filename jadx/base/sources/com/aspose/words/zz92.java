package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zz92 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(TranslateLanguage.CZECH, "dm", "lo", "qs");
    private zzZXT zzZfi;

    private zz92(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    public static Shape zzG(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        if (!"relIds".equals(zzyu4ZzZsD.getLocalName())) {
            return null;
        }
        zz92 zz92Var = new zz92(zzzxt);
        Shape shape = new Shape(zzzxt.getDocument(), (byte) 0);
        zzzxt.zzT(shape);
        zzAV zzav = new zzAV();
        shape.zzU(zzav);
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzav.zzZ(zz92Var.zzPA(zzyu4ZzZsD.getValue()));
            } else if (iZzTP == 1) {
                zzav.zzZ(zz92Var.zzPD(zzyu4ZzZsD.getValue()));
            } else if (iZzTP == 2) {
                zzav.zzZ(zz92Var.zzPE(zzyu4ZzZsD.getValue()));
            } else if (iZzTP != 3) {
                zz39.zzI(zzyu4ZzZsD);
            } else {
                zzav.zzZ(zz92Var.zzPz(zzyu4ZzZsD.getValue()));
            }
        }
        if (zzav.zzZER().zzZEs() != null) {
            zzav.zzZER().zzZEs().zzYG(shape);
        }
        zzzxt.zztj(18);
        return shape;
    }

    private zzAT zzPA(String str) throws Exception {
        this.zzZfi.zzNK(str);
        zzZXT zzzxt = this.zzZfi;
        zzAT zzatZzZ = zzAS.zzZ(zzzxt, zzzxt.zzZqn());
        this.zzZfi.zzZmi();
        return zzatZzZ;
    }

    private ShapeBase zzPB(String str) throws Exception {
        GroupShape groupShapeZzu;
        try {
            this.zzZfi.zzNK(str);
            groupShapeZzu = zzA2.zzu(this.zzZfi);
        } catch (IllegalStateException e) {
            this.zzZfi.zzZ(65536, 2, com.aspose.words.internal.zzZKN.format("Can not parse content some of diagram drawing object from specified path. {0}: {1}", "Detail message", e.getMessage()));
            groupShapeZzu = null;
        }
        this.zzZfi.zzZmi();
        return groupShapeZzu;
    }

    private ShapeBase zzPC(String str) throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(str) || !com.aspose.words.internal.zzZYD.zzXk(this.zzZfi.zzY9(str)) || this.zzZfi.zzNL(str)) {
            return null;
        }
        ShapeBase shapeBaseZzPB = zzPB(str);
        if (shapeBaseZzPB != null) {
            shapeBaseZzPB.remove();
        }
        return shapeBaseZzPB;
    }

    private zzAM zzPD(String str) throws Exception {
        this.zzZfi.zzNK(str);
        zzAM zzamZzv = zzA5.zzv(this.zzZfi);
        this.zzZfi.zzZmi();
        zzamZzv.zzR(zzPC(zzV(zzamZzv)));
        return zzamZzv;
    }

    private zz9L zzPE(String str) throws Exception {
        this.zzZfi.zzNK(str);
        zz9L zz9lZzX = zz97.zzX(this.zzZfi, str);
        this.zzZfi.zzZmi();
        return zz9lZzX;
    }

    private zz8S zzPz(String str) throws Exception {
        this.zzZfi.zzNK(str);
        zzZXT zzzxt = this.zzZfi;
        zz8S zz8sZzY = zz8Q.zzY(zzzxt, zzzxt.zzZqn());
        this.zzZfi.zzZmi();
        return zz8sZzY;
    }

    private static String zzV(zzAM zzam) {
        zz82 zz82Var;
        return (!zzam.hasExtensions() || (zz82Var = zzam.getExtensions().get("http://schemas.microsoft.com/office/drawing/2008/diagram")) == null) ? zzam.zzZEm() : zz82Var.zzZBP();
    }
}
