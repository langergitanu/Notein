package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzB3 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("nvContentPartPr", "xfrm", "extLst", "nvPr");

    public static Shape zzG(zzZXT zzzxt) throws Exception {
        if (!"contentPart".equals(zzzxt.zzZsD().getLocalName())) {
            return null;
        }
        Shape shape = new Shape(zzzxt.getDocument(), (byte) 0);
        zzzxt.zzT(shape);
        shape.zzU(zzw(zzzxt));
        zzzxt.zztj(18);
        return shape;
    }

    private static zzB4 zzw(zzZXT zzzxt) throws Exception {
        zzB4 zzb4 = new zzB4();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        zzb4.zzLV(zz84.zzPo(zzyu4ZzZsD.zzV("bwMode", "auto")));
        zzb4.zzV(zzzxt.zzYd(zzzxt.zzY9(zzyu4ZzZsD.zzV("id", ""))));
        for (com.aspose.words.internal.zz75 zz75Var : zzb4.zzZF0().zzxn()) {
            if (!zz75Var.isExternal()) {
                zzb4.zzZEZ().put(zz75Var.getId(), zzzxt.zzYd(zzb4.zzZF0().zzZ(zz75Var)));
            }
        }
        zzyu4ZzZsD.zzj();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                if (zzb4.zzZyc() == null) {
                    zzb4.zzZ(new zz4Q());
                }
                zz51.zzZ(zzb4.zzZyc(), zzzxt);
            } else if (iZzTP == 1) {
                zzb4.zzZ(zz06.zzK(zzyu4ZzZsD, zzyo3ZzZqn));
            } else if (iZzTP == 2) {
                zzb4.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP != 3) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zz39.zzL(zzyu4ZzZsD);
            }
        }
        return zzb4;
    }
}
