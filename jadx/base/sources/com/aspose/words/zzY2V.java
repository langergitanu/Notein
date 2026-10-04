package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2V {
    private static zz1C zzW(zzZ8T zzz8t, boolean z) {
        zz1C zz1c = new zz1C();
        int i = z ? 448 : 385;
        int i2 = z ? 449 : 386;
        com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) zzz8t.zzYW8().fetchShapeAttr(i);
        zz1c.zzZ(zzBW.zzZ(((double) ((Integer) zzz8t.zzYW8().fetchShapeAttr(i2)).intValue()) / 65536.0d, zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA()));
        return zz1c;
    }

    private static zzH0 zzX(zzZ8T zzz8t, boolean z) {
        zzH0 zzh0 = new zzH0();
        zzH1 zzh1ZzZQ1 = zzh0.zzZQ1();
        ShapeBase shapeBaseZzYW8 = zzz8t.zzYW8();
        zzh1ZzZQ1.zzYt(z ? (byte[]) shapeBaseZzYW8.fetchShapeAttr(4102) : (byte[]) shapeBaseZzYW8.fetchShapeAttr(4110));
        zzh1ZzZQ1.zzRE((String) shapeBaseZzYW8.fetchShapeAttr(4104));
        zzh0.zzY6(z || ((Boolean) shapeBaseZzYW8.fetchShapeAttr(442)).booleanValue());
        zz3Z zz3z = new zz3Z();
        zz3z.zzXF(((double) ((Integer) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.COLORFUL_LIST_ACCENT_6)).intValue()) / 65536.0d);
        zz3z.zzXG(((double) ((Integer) shapeBaseZzYW8.fetchShapeAttr(256)).intValue()) / 65536.0d);
        zz3z.zzXE(((double) ((Integer) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.COLORFUL_GRID_ACCENT_6)).intValue()) / 65536.0d);
        zz3z.zzXH(((double) ((Integer) shapeBaseZzYW8.fetchShapeAttr(257)).intValue()) / 65536.0d);
        zzh0.zzZ(zz3z);
        if (((Boolean) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.GRID_TABLE_3_ACCENT_6)).booleanValue()) {
            zzh1ZzZQ1.zzZQ7().add(new zz75());
        }
        if (((Boolean) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.GRID_TABLE_4_ACCENT_6)).booleanValue()) {
            zzH3 zzh3 = new zzH3();
            zzh3.zzYV(0.5d);
            zzh1ZzZQ1.zzZQ7().add(zzh3);
        }
        int iIntValue = ((Integer) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.BIBLIOGRAPHY)).intValue();
        int iIntValue2 = ((Integer) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.BOOK_TITLE)).intValue();
        if (iIntValue != 0 || iIntValue2 != com.aspose.words.internal.zzSA.zzl(1.0d)) {
            zz5E zz5e = new zz5E();
            double dZzWR = ImageData.zzWR(((double) iIntValue) / 65536.0d);
            double dZzWP = ImageData.zzWP(((double) iIntValue2) / 65536.0d);
            zz5e.setBrightness(dZzWR);
            zz5e.setContrast(dZzWP);
            zzh1ZzZQ1.zzZQ7().add(zz5e);
        }
        com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) shapeBaseZzYW8.fetchShapeAttr(StyleIdentifier.INTENSE_REFERENCE);
        if (!com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzHZ)) {
            zzBV zzbv = new zzBV();
            zzBW zzbwZzj = zzBW.zzj(zzpv);
            zzbv.zzT(zzbwZzj);
            zzBW zzbwZzZHt = zzbwZzj.zzZHt();
            zzHV zzhv = new zzHV();
            zzhv.setValue(0.0d);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzHV>) zzbwZzZHt.zzZNX(), zzhv);
            zzbv.zzS(zzbwZzZHt);
            zzbv.zzXs(true);
            zzh1ZzZQ1.zzZQ7().add(zzbv);
        }
        return zzh0;
    }

    private static zz41 zzY(zzZ8T zzz8t, boolean z) throws Exception {
        zz41 zz41Var = new zz41();
        ShapeBase shapeBaseZzYW8 = zzz8t.zzYW8();
        zz41Var.zzHf(zzY30.zzYf((byte[]) shapeBaseZzYW8.zzYvW().get(z ? 4111 : 4110)));
        zz41Var.zzM(zzBW.zzj((com.aspose.words.internal.zzPV) shapeBaseZzYW8.fetchShapeAttr(z ? 448 : 385)));
        zz41Var.zzN(zzBW.zzj((com.aspose.words.internal.zzPV) shapeBaseZzYW8.fetchShapeAttr(z ? 450 : 387)));
        return zz41Var;
    }

    public static boolean zzY9(ShapeBase shapeBase) {
        int shapeType = shapeBase.getShapeType();
        return (shapeBase.zzY9v() || shapeType == 20) & ((shapeType == 120 || shapeType == 177) ? false : true);
    }

    public static zz7X zzZ(zzZ8T zzz8t, ShapeBase shapeBase) throws Exception {
        zz7S zz7s = (zz7S) shapeBase.zzY9i();
        zz7X zz54Var = new zz54();
        if (zzY9(zzz8t.zzYW8())) {
            if (zzz8t.zzYW8().zzY9t() || zzz8t.zzYW8().zzY9u()) {
                zz54Var = new zz1C(zzBW.zzj(new com.aspose.words.internal.zzPV(255, 255, 255)));
            }
            zzZ(zz7s, zz54Var);
        } else {
            boolean zBooleanValue = ((Boolean) zzz8t.zzYW8().fetchShapeAttr(443)).booleanValue();
            zz7X zz7xZzX = (zzz8t.zzYW8().getShapeType() == 100 && ((Shape) zzz8t.zzYW8()).hasImage()) ? zzX(zzz8t, true) : zzZ(zzz8t, ((Integer) zzZ(zzz8t, false)).intValue(), false);
            if (zBooleanValue) {
                zz54Var = zz7xZzX;
            } else {
                if (zzz8t.zzYW7() || !zzz8t.zzYW8().isImage()) {
                    zzZ(zz7s, zz7xZzX);
                }
                zz54Var = new zz54();
            }
        }
        zz54Var.zzZ(shapeBase);
        return zz54Var;
    }

    public static zz7X zzZ(zzZ8T zzz8t, int i, boolean z) throws Exception {
        if (!zzz8t.isWordArt() || (i != 3 && i != 2 && i != 1)) {
            switch (i) {
            }
            return new zz54();
        }
        return new zz54();
    }

    public static zz7X zzZ(zzZ8T zzz8t, int i) throws Exception {
        if (i == 0) {
            return zzW(zzz8t, true);
        }
        if (i == 1) {
            return zzY(zzz8t, true);
        }
        if (i == 2) {
            return zzZ(zzz8t);
        }
        if (i != 3) {
            return new zz1C();
        }
        return zzX(zzz8t, true);
    }

    private static void zzZ(ShapeBase shapeBase, ArrayList<zz8E> arrayList) {
        int iIntValue = ((Integer) shapeBase.fetchShapeAttr(386)).intValue();
        if (iIntValue < 65536) {
            zzHP zzhp = new zzHP();
            zzhp.zzYU(((double) iIntValue) / 65536.0d);
            arrayList.add(zzhp);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void zzZ(zz7S zz7s, zz7X zz7x) {
        if (zz7x.zzZQ4() == 3) {
            return;
        }
        zz82 zz82Var = new zz82("{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}", null);
        zz82Var.zzX(zz7x);
        zzZ((zzZC0) zz7s, zz82Var);
    }

    public static void zzZ(zzZC0 zzzc0, zz82 zz82Var) {
        if (zzzc0.zzZTb() == null) {
            zzzc0.zzR(new com.aspose.words.internal.zzZYG<>());
        }
        if (zzzc0.zzZTb().containsKey(zz82Var.getUri())) {
            return;
        }
        zzzc0.zzZTb().zzW(zz82Var.getUri(), zz82Var);
    }

    public static void zzZ(zzH0 zzh0, ShapeBase shapeBase) {
        if (zzh0.zzZPY() instanceof zzGZ) {
            zzZ(shapeBase, zzh0.zzZQ1().zzZQ7());
        }
    }

    public static Object zzZ(zzZ8T zzz8t, boolean z) {
        return zzz8t.zzYW8().fetchShapeAttr(z ? 452 : 384);
    }

    private static zzH0 zzZ(zzZ8T zzz8t) {
        zzH0 zzh0 = new zzH0();
        zzh0.zzZ(new zzGY());
        zzh0.zzY6(((Boolean) zzz8t.zzYW8().fetchShapeAttr(442)).booleanValue());
        zzh0.setImageBytes((byte[]) zzz8t.zzYW8().fetchShapeAttr(4110));
        zzZ(zzz8t.zzYW8(), zzh0.zzZQ1().zzZQ7());
        return zzh0;
    }
}
