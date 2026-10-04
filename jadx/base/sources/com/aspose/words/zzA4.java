package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzA4 {
    private static void zzY(zz93 zz93Var, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:pt");
        zzzydZzZlV.zz0("modelId", zz9Z.zzQ(zz93Var.zzZEC()));
        zzzydZzZlV.zzA(C18437z2.f56754h, zz9Z.zzJl(zz93Var.getType()), "node");
        zzzydZzZlV.zzA("cxnId", zz9Z.zzQ(zz93Var.zzZD0()), "0");
        zzZ(zz93Var.zzZCX(), zzzxr);
        zz1T.zzZ("dgm", zz93Var.zzZCY(), zzzxr);
        zz0F.zzZ("dgm:t", zz93Var.zzZCZ(), zzzxr);
        zz7Z.zzZ("dgm", zz93Var.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzAM zzam, String str, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzZ("dgm:dataModel");
        zzzydZzZlV.zz0("xmlns:dgm", zzZX5.zz9(8, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        zzZ(zzam.zzZEu(), zzzxr);
        zzZ(zzam.zzZEt(), zzzxr);
        zzZ(zzam.zzZEo(), zzzxr);
        zzZ(zzam.zzZEp(), zzzxr);
        zzZ(zzam, str);
        zz7Z.zzZ("dgm", zzam.getExtensions(), zzzxr);
        zzzydZzZlV.endDocument();
    }

    private static String zzb(int i, boolean z) {
        return zz3W.zzS(zz3W.zzXz(i), z);
    }

    public static void zzZ(String str, zzAM zzam, zzZXR zzzxr) throws Exception {
        if (zzam != null) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY(str);
            zzzydZzZlV.zzw("useDef", zzam.zzZEn());
            zzzydZzZlV.zzY("dgm:dataModel");
            zzZ(zzam.zzZEu(), zzzxr);
            zzZ(zzam.zzZEt(), zzzxr);
            zzZ(zzam.zzZEo(), zzzxr);
            zzZ(zzam.zzZEp(), zzzxr);
            zzzydZzZlV.zzo();
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(zz93[] zz93VarArr, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:ptLst");
        for (zz93 zz93Var : zz93VarArr) {
            zzZ(zz93Var, zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz93 zz93Var, zzZXR zzzxr) throws Exception {
        if (zz93Var.zzZCW() == null) {
            zzY(zz93Var, zzzxr);
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("mc:AlternateContent");
        for (String str : zz93Var.zzZCU().keySet()) {
            zzzydZzZlV.zz0(str, zz93Var.zzZCU().get(str));
        }
        zzzydZzZlV.zzY("mc:Choice");
        for (String str2 : zz93Var.zzZCV().keySet()) {
            zzzydZzZlV.zz0(str2, zz93Var.zzZCV().get(str2));
        }
        zzY(zz93Var, zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("mc:Fallback");
        zzY(zz93Var.zzZCW(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz3E zz3e, zzZXR zzzxr) {
        if (zz3e == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:prSet");
        zz3D zz3dZzZwi = zz3e.zzZwi();
        zzZ(0, zz3dZzZwi, zzzydZzZlV);
        zzZ(1, zz3dZzZwi, zzzydZzZlV);
        zzZ(2, zz3dZzZwi, zzzydZzZlV);
        zzZ(3, zz3dZzZwi, zzzydZzZlV);
        zzZ(4, zz3dZzZwi, zzzydZzZlV);
        zzZ(5, zz3dZzZwi, zzzydZzZlV);
        zzZ(6, zz3dZzZwi, zzzydZzZlV);
        zzZ(7, zz3dZzZwi, zzzydZzZlV);
        zzZ(8, zz3dZzZwi, zzzydZzZlV);
        zzZ(9, zz3dZzZwi, zzzydZzZlV);
        zzZ(10, zz3dZzZwi, zzzydZzZlV);
        zzZ(11, zz3dZzZwi, zzzydZzZlV);
        zzZ(12, zz3dZzZwi, zzzydZzZlV);
        zzZ(13, zz3dZzZwi, zzzydZzZlV);
        zzZ(14, zz3dZzZwi, zzzydZzZlV);
        zzZ(15, zz3dZzZwi, zzzydZzZlV);
        zzZ(16, zz3dZzZwi, zzzydZzZlV);
        zzZ(17, zz3dZzZwi, zzzydZzZlV);
        zzZ(18, zz3dZzZwi, zzzydZzZlV);
        zzZ(19, zz3dZzZwi, zzzydZzZlV);
        zzZ(20, zz3dZzZwi, zzzydZzZlV);
        zzZ(21, zz3dZzZwi, zzzydZzZlV);
        zzZ(22, zz3dZzZwi, zzzydZzZlV);
        zzZ(23, zz3dZzZwi, zzzydZzZlV);
        zzZ(24, zz3dZzZwi, zzzydZzZlV);
        zzZ(25, zz3dZzZwi, zzzydZzZlV);
        zzZ(26, zz3dZzZwi, zzzydZzZlV);
        zzZ(27, zz3dZzZwi, zzzydZzZlV);
        zzAO.zzZ("dgm:presLayoutVars", zz3e.zzZwj(), zzzxr);
        zz1I.zzZ("dgm", zz3e.zzZTj(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(int i, zz3D zz3d, zzZYD zzzyd) {
        Object objZzLv = zz3d.zzLv(i);
        if (objZzLv == null) {
            return;
        }
        boolean z = zzzyd.zzZtY() == 2;
        switch (i) {
            case 0:
                zzzyd.zz0("presAssocID", zz9Z.zzQ((zz5A) objZzLv));
                break;
            case 1:
                zzzyd.zzP("presName", objZzLv);
                break;
            case 2:
                zzzyd.zzP("presStyleLbl", objZzLv);
                break;
            case 3:
                zzzyd.zzP("presStyleIdx", objZzLv);
                break;
            case 4:
                zzzyd.zzP("presStyleCnt", objZzLv);
                break;
            case 5:
                zzzyd.zzP("loTypeId", objZzLv);
                break;
            case 6:
                zzzyd.zzP("loCatId", objZzLv);
                break;
            case 7:
                zzzyd.zzP("qsTypeId", objZzLv);
                break;
            case 8:
                zzzyd.zzP("qsCatId", objZzLv);
                break;
            case 9:
                zzzyd.zzP("csTypeId", objZzLv);
                break;
            case 10:
                zzzyd.zzP("csCatId", objZzLv);
                break;
            case 11:
                zzzyd.zzP("coherent3DOff", objZzLv);
                break;
            case 12:
                zzzyd.zzP("phldrT", objZzLv);
                break;
            case 13:
                zzzyd.zzP("phldr", objZzLv);
                break;
            case 14:
                zzzyd.zzP("custAng", objZzLv);
                break;
            case 15:
                zzzyd.zzP("custFlipVert", objZzLv);
                break;
            case 16:
                zzzyd.zzP("custFlipHor", objZzLv);
                break;
            case 17:
                zzzyd.zzP("custSzX", objZzLv);
                break;
            case 18:
                zzzyd.zzP("custSzY", objZzLv);
                break;
            case 19:
                zzzyd.zz0("custScaleX", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 20:
                zzzyd.zz0("custScaleY", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 21:
                zzzyd.zzP("custT", objZzLv);
                break;
            case 22:
                zzzyd.zz0("custLinFactX", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 23:
                zzzyd.zz0("custLinFactY", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 24:
                zzzyd.zz0("custLinFactNeighborX", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 25:
                zzzyd.zz0("custLinFactNeighborY", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 26:
                zzzyd.zz0("custRadScaleRad", zzb(((Integer) objZzLv).intValue(), z));
                break;
            case 27:
                zzzyd.zz0("custRadScaleInc", zzb(((Integer) objZzLv).intValue(), z));
                break;
        }
    }

    private static void zzZ(zzAN[] zzanArr, zzZXR zzzxr) {
        if (zzanArr == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:cxnLst");
        for (zzAN zzan : zzanArr) {
            zzZ(zzan, zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzAN zzan, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:cxn");
        zzzydZzZlV.zz0("modelId", zz9Z.zzQ(zzan.zzZEC()));
        zzzydZzZlV.zzA(C18437z2.f56754h, zz9Z.zzJm(zzan.getType()), "parOf");
        zzzydZzZlV.zz0("srcId", zz9Z.zzQ(zzan.zzZEz()));
        zzzydZzZlV.zz0("destId", zz9Z.zzQ(zzan.zzZEB()));
        zzzydZzZlV.zzZj("srcOrd", zzan.zzZEy());
        zzzydZzZlV.zzZj("destOrd", zzan.zzZEA());
        zzzydZzZlV.zzA("parTransId", zz9Z.zzQ(zzan.zzZEx()), "0");
        zzzydZzZlV.zzA("sibTransId", zz9Z.zzQ(zzan.zzZEw()), "0");
        zzzydZzZlV.zzA("presId", zzan.zzZEv(), "");
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzAU zzau, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:bg");
        if (zzau.getFill().zzZQ4() != 6) {
            zz7T.zzZ(zzau.getFill(), zzzxr, false);
        }
        zz2A.zzZ(zzau.zzZTe(), zzzxr, false);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz8L zz8l, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:whole");
        zz4B.zzZ("a:ln", zz8l.getOutline(), zzzxr);
        zz2A.zzZ(zz8l.zzZTe(), zzzxr, false);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzAM zzam, String str) {
        zz82 zz82Var;
        if (zzam.hasExtensions() && com.aspose.words.internal.zzZYD.zzXk(str) && (zz82Var = zzam.getExtensions().get("http://schemas.microsoft.com/office/drawing/2008/diagram")) != null) {
            zz82Var.zzOI(str);
        }
    }
}
