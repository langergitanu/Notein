package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zz8H {
    private static void zzQ(zzYC2 zzyc2, zzZXR zzzxr) {
        if (zzyc2.zzXmp == null && zzyc2.zzXmi == null && zzyc2.zzXmo == null && zzyc2.zzXmn == null && zzyc2.zzXfk == null && zzyc2.zzXfl == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:graphicFrameLocks");
        zzzydZzZlV.zz0("xmlns:a", zzzxr.zzZlR().zzZlz());
        zzzydZzZlV.zzP("noChangeAspect", zzyc2.zzXmp);
        zzzydZzZlV.zzP("noGrp", zzyc2.zzXmi);
        zzzydZzZlV.zzP("noMove", zzyc2.zzXmo);
        zzzydZzZlV.zzP("noSelect", zzyc2.zzXmn);
        zzzydZzZlV.zzP("noDrilldown", zzyc2.zzXfk);
        zzzydZzZlV.zzP("noResize", zzyc2.zzXfl);
        zzzydZzZlV.zzp();
    }

    private static void zzR(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("w:drawing");
        zzYC2 zzyc2 = new zzYC2();
        zzyc2.zzQ(shapeBase.zzYvW());
        if (shapeBase.zzY9i().zzZym() != null) {
            zzyc2.zzXfa = shapeBase.zzY9i().zzZym();
        }
        zzzydZzZlV.zzY(shapeBase.zzYvW().isInline() ? "wp:inline" : "wp:anchor");
        zzzydZzZlV.zzP("distT", zzyc2.zzXhd);
        zzzydZzZlV.zzP("distB", zzyc2.zzXhb);
        zzzydZzZlV.zzP("distL", zzyc2.zzXhe);
        zzzydZzZlV.zzP("distR", zzyc2.zzXhc);
        if (!shapeBase.zzYvW().isInline()) {
            zzzydZzZlV.zzx("simplePos", false);
            zzzydZzZlV.zzZj("relativeHeight", zzzxr.zzZqS().zzYL(shapeBase));
            Object obj = zzyc2.zzXgF;
            Boolean bool = Boolean.FALSE;
            zzzydZzZlV.zzY("behindDoc", obj, bool);
            zzzydZzZlV.zzY("locked", zzyc2.zzXfQ, bool);
            Object obj2 = zzyc2.zzXgP;
            Boolean bool2 = Boolean.TRUE;
            zzzydZzZlV.zzY("layoutInCell", obj2, bool2);
            zzzydZzZlV.zzY("allowOverlap", zzyc2.zzXgJ, bool2);
            zzH5.zzZ("wp:simplePos", 0, 0, zzzydZzZlV);
            zzZ(zzyc2, zzzxr);
            zzY(zzyc2, zzzxr);
        }
        zzT(zzyc2, zzzxr);
        zzS(zzyc2, zzzxr);
        zzX(zzyc2, zzzxr);
        zzU(zzyc2, zzzxr);
        zzR(zzyc2, zzzxr);
    }

    public static void zzS(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zz78.zzS(shapeBase, zzzxr);
        if (shapeBase.isTopLevel()) {
            zzZ(zzzxr, shapeBase);
        }
    }

    private static void zzT(zzYC2 zzyc2, zzZXR zzzxr) {
        zzH5.zzY("wp:extent", com.aspose.words.internal.zzSA.zzp(((Double) zzyc2.zzXfo).doubleValue()), com.aspose.words.internal.zzSA.zzp(((Double) zzyc2.zzXfn).doubleValue()), zzzxr.zzZlV());
    }

    private static void zzU(zzYC2 zzyc2, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY("wp:docPr");
        zzzydZzZlV.zzY("id", zzyc2.zzXfv, (Object) 0);
        Object obj = zzyc2.zzXhj;
        zzzydZzZlV.zzX("name", obj != null ? (String) obj : "");
        zzzydZzZlV.zzP("descr", zzyc2.zzXhi);
        zzzydZzZlV.zzP(NoteMeta.PROPERTY_TITLE, zzyc2.zzXhh);
        Object obj2 = zzyc2.zzXgB;
        if (obj2 != null) {
            zzzydZzZlV.zzw("hidden", ((Boolean) obj2).booleanValue());
        }
        zz6N.zzZ("a:hlinkClick", (String) zzyc2.zzXhg, (String) zzyc2.zzXfy, (String) zzyc2.zzXh9, null, zzzxr);
        if (zzyc2.zzXfa != null) {
            zz7Z.zzZ("a", zzZX5.zz9(6, z), zzyc2.zzXfa, zzzxr);
        }
        zzzydZzZlV.zzp();
    }

    private static void zzV(zzYC2 zzyc2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("wp:wrapPolygon");
        zzzydZzZlV.zzP("edited", zzyc2.zzXgG);
        Object obj = zzyc2.zzXhf;
        if (obj != null) {
            zzYM5[] zzym5Arr = (zzYM5[]) obj;
            zzZ(zzym5Arr[0], zzzydZzZlV);
            for (int i = 1; i < zzym5Arr.length; i++) {
                zzY(zzym5Arr[i], zzzydZzZlV);
            }
            zzY(zzym5Arr[0], zzzydZzZlV);
        } else {
            zzH5.zzZ("wp:start", -389, 0, zzzydZzZlV);
            zzH5.zzZ("wp:lineTo", -389, 21340, zzzydZzZlV);
            zzH5.zzZ("wp:lineTo", 21795, 21340, zzzydZzZlV);
            zzH5.zzZ("wp:lineTo", 21795, 0, zzzydZzZlV);
            zzH5.zzZ("wp:lineTo", -389, 0, zzzydZzZlV);
        }
        zzzydZzZlV.zzp();
    }

    private static void zzW(zzYC2 zzyc2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        Object obj = zzyc2.zzXfR;
        zzzydZzZlV.zz0("wrapText", zz84.zzIS(obj != null ? ((Integer) obj).intValue() : 0));
    }

    private static void zzX(zzYC2 zzyc2, zzYU6 zzyu6, boolean z, boolean z2) {
        zzyu6.zzY("wp:positionH");
        zzyu6.zz0("relativeFrom", zz84.zzZI(zzyc2.zzXh6));
        Object obj = zzyc2.zzXh7;
        if (obj != null && ((Integer) obj).intValue() != 0) {
            zzyu6.zzZ("wp:align", zz84.zzZE(zzyc2.zzXh7));
        } else if (z) {
            Object obj2 = zzyc2.zzXfq;
            zzyu6.zzZ("wp:posOffset", com.aspose.words.internal.zzJB.zzWF(obj2 != null ? com.aspose.words.internal.zzSA.zzp(((Double) obj2).doubleValue()) : 0));
        } else {
            zzZ("wp14:pctPosHOffset", ((Integer) zzyc2.zzXg1).intValue(), zzyu6, z2);
        }
        zzyu6.zzo();
    }

    private static void zzY(zzYC3 zzyc3, zzZXR zzzxr) {
        if (zzyc3.contains(1989) && zzyc3.contains(1985)) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY("wp14:sizeRelV");
            zzzydZzZlV.zz0("relativeFrom", zz84.zzZF(zzyc3.get(1989)));
            zzZ("wp14:pctHeight", ((Integer) zzyc3.get(1985)).intValue(), zzzydZzZlV, zzzxr.getCompliance() == 2);
            zzzydZzZlV.zzp();
        }
    }

    public static void zzZ(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        if (shapeBase.isTopLevel()) {
            zzR(shapeBase, zzzxr);
        }
        zz78.zzZ(shapeBase, zzzxr);
    }

    private static void zzS(zzYC2 zzyc2, zzZXR zzzxr) {
        if (zzyc2.zzXfj == null && zzyc2.zzXfi == null && zzyc2.zzXfh == null && zzyc2.zzXfg == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("wp:effectExtent");
        zzzydZzZlV.zzY("l", zzyc2.zzXfj, (Object) 0);
        zzzydZzZlV.zzY("t", zzyc2.zzXfi, (Object) 0);
        zzzydZzZlV.zzY("r", zzyc2.zzXfh, (Object) 0);
        zzzydZzZlV.zzY("b", zzyc2.zzXfg, (Object) 0);
        zzzydZzZlV.zzp();
    }

    private static void zzZ(zzZXR zzzxr, ShapeBase shapeBase) {
        zzZ(shapeBase.zzYvW(), zzzxr);
        zzY(shapeBase.zzYvW(), zzzxr);
        zzzxr.zzZlV().zzp();
        zzzxr.zzZlV().zzo();
    }

    private static void zzZ(zzYC3 zzyc3, zzZXR zzzxr) {
        if (zzyc3.contains(1988) && zzyc3.contains(1984)) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY("wp14:sizeRelH");
            zzzydZzZlV.zz0("relativeFrom", zz84.zzZG(zzyc3.get(1988)));
            zzZ("wp14:pctWidth", ((Integer) zzyc3.get(1984)).intValue(), zzzydZzZlV, zzzxr.getCompliance() == 2);
            zzzydZzZlV.zzp();
        }
    }

    private static void zzX(zzYC2 zzyc2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        Object obj = zzyc2.zzXfS;
        if (obj == null) {
            obj = 3;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue == 1) {
            zzzydZzZlV.zzY("wp:wrapTopAndBottom");
            zzzydZzZlV.zzp();
            return;
        }
        if (iIntValue == 2) {
            zzzydZzZlV.zzY("wp:wrapSquare");
            zzW(zzyc2, zzzxr);
            zzzydZzZlV.zzp();
            return;
        }
        if (iIntValue == 3) {
            zzzydZzZlV.zzZ("wp:wrapNone", (String) null);
            return;
        }
        if (iIntValue == 4) {
            zzzydZzZlV.zzY("wp:wrapTight");
            zzW(zzyc2, zzzxr);
            zzV(zzyc2, zzzxr);
            zzzydZzZlV.zzp();
            return;
        }
        if (iIntValue != 5) {
            return;
        }
        zzzydZzZlV.zzY("wp:wrapThrough");
        zzW(zzyc2, zzzxr);
        zzV(zzyc2, zzzxr);
        zzzydZzZlV.zzp();
    }

    private static void zzY(zzYC2 zzyc2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        if (zzyc2.zzXg0 != null) {
            zzZ(zzyc2, (zzYU6) zzzydZzZlV, false, z);
        } else {
            zzY(zzyc2, zzzydZzZlV, true, z);
        }
    }

    private static void zzY(zzYC2 zzyc2, zzYU6 zzyu6, boolean z, boolean z2) {
        zzyu6.zzY("wp:positionV");
        zzyu6.zz0("relativeFrom", zz84.zzZH(zzyc2.zzXh4));
        Object obj = zzyc2.zzXh5;
        if (obj != null && ((Integer) obj).intValue() != 0 && ((Integer) zzyc2.zzXh5).intValue() != -1) {
            zzyu6.zzZ("wp:align", zz84.zzZD(zzyc2.zzXh5));
        } else if (z) {
            Object obj2 = zzyc2.zzXfp;
            zzyu6.zzZ("wp:posOffset", com.aspose.words.internal.zzJB.zzWF(obj2 != null ? com.aspose.words.internal.zzSA.zzp(((Double) obj2).doubleValue()) : 0));
        } else {
            zzZ("wp14:pctPosVOffset", ((Integer) zzyc2.zzXg0).intValue(), zzyu6, z2);
        }
        zzyu6.zzo();
    }

    private static void zzZ(String str, int i, zzYU6 zzyu6, boolean z) {
        zzyu6.zzZ(str, zz3W.zzS(zz3W.zzXz(zz3W.zzXw(i)), z));
    }

    private static void zzZ(zzYC2 zzyc2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        if (zzyc2.zzXg1 != null) {
            zzZ(zzyc2, (zzYU6) zzzydZzZlV, true, z);
        } else {
            zzX(zzyc2, zzzydZzZlV, true, z);
        }
    }

    private static void zzZ(zzYC2 zzyc2, zzYU6 zzyu6, boolean z, boolean z2) {
        zzyu6.zzY("mc:AlternateContent");
        zzyu6.zz0("xmlns:mc", zzZX5.zz9(14, z2));
        zzyu6.zzY("mc:Choice");
        zzyu6.zz0("Requires", "c14");
        zzyu6.zz0("xmlns:c14", zzZX5.zz9(25, z2));
        if (z) {
            zzX(zzyc2, zzyu6, false, z2);
        } else {
            zzY(zzyc2, zzyu6, false, z2);
        }
        zzyu6.zzo();
        zzyu6.zzY("mc:Fallback");
        if (z) {
            zzX(zzyc2, zzyu6, true, z2);
        } else {
            zzY(zzyc2, zzyu6, true, z2);
        }
        zzyu6.zzo();
        zzyu6.zzo();
    }

    private static void zzY(zzYM5 zzym5, zzYU6 zzyu6) {
        zzH5.zzZ("wp:lineTo", zzym5.zzYnG().getValue(), zzym5.zzYnF().getValue(), zzyu6);
    }

    private static void zzR(zzYC2 zzyc2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("wp:cNvGraphicFramePr");
        zzQ(zzyc2, zzzxr);
        zzzydZzZlV.zzp();
    }

    private static void zzZ(zzYM5 zzym5, zzYU6 zzyu6) {
        zzH5.zzZ("wp:start", zzym5.zzYnG().getValue(), zzym5.zzYnF().getValue(), zzyu6);
    }
}
