package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz4Y {
    private static String zzHs(int i) {
        switch (i) {
            case 0:
                return "noGrp";
            case 1:
                return "noSelect";
            case 2:
                return "noRot";
            case 3:
                return "noChangeAspect";
            case 4:
                return "noMove";
            case 5:
                return "noResize";
            case 6:
                return "noEditPoints";
            case 7:
                return "noAdjustHandles";
            case 8:
                return "noChangeArrowheads";
            case 9:
                return "noChangeShapeType";
            case 10:
                return "noDrilldown";
            case 11:
                return "noUngrp";
            case 12:
                return "noCrop";
            case 13:
                return "noTextEdit";
            default:
                throw new IllegalArgumentException("Unexpected lock type.");
        }
    }

    private static String zzHt(int i) {
        if (i == 0) {
            return "cxnSpLocks";
        }
        if (i == 1) {
            return "graphicFrameLocks";
        }
        if (i == 2) {
            return "grpSpLocks";
        }
        if (i == 3) {
            return "picLocks";
        }
        if (i == 4) {
            return "spLocks";
        }
        if (i == 5) {
            return "cpLocks";
        }
        throw new IllegalArgumentException("Unexpected non-visual properties holder.");
    }

    private static String zzHu(int i) {
        if (i == 0) {
            return "nvCxnSpPr";
        }
        if (i == 1) {
            return "nvGraphicFramePr";
        }
        if (i == 2) {
            return "nvGrpSpPr";
        }
        if (i == 3) {
            return "nvPicPr";
        }
        if (i == 4) {
            return "nvSpPr";
        }
        if (i == 5) {
            return "nvContentPartPr";
        }
        throw new IllegalArgumentException("Unexpected non-visual properties holder.");
    }

    public static void zzZ(String str, zz53 zz53Var, zzZXR zzzxr) throws Exception {
        if (zz53Var.zzZyc() == null) {
            return;
        }
        if ("wpg".equals(str) || "wpc".equals(str) || "wps".equals(str) || "wp".equals(str)) {
            if (zz53Var.zzZye() != null && zz53Var.zzZye().getNodeType() == 17) {
                zzZ(str, zz53Var.zzZyc().zzZxV(), zzzxr);
            }
            zzZ(str, zzzxr, zz53Var);
            return;
        }
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:{1}", str, zzHu(zz53Var.zzZyc().zzZFM()));
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        if (zz53Var.zzZyc().zzZFM() != 5) {
            zzZ(str, zz53Var.zzZyc().zzZxV(), zzzxr);
        }
        zzZ(str, zzzxr, zz53Var);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zz4T zz4t, zzZXR zzzxr) throws Exception {
        zzZXR zzzxr2;
        if (zz4t == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:cNvPr", str));
        zzzydZzZlV.zzX("id", Integer.toString(zz4t.getId()));
        zzzydZzZlV.zzX("name", zz4t.getName());
        zzzydZzZlV.zz0("descr", zz4t.getDescription());
        zzzydZzZlV.zzw("hidden", zz4t.getHidden());
        zz6P zz6pZzZxZ = zz4t.zzZxZ();
        if (zz6pZzZxZ != null) {
            zzzxr2 = zzzxr;
            zz6N.zzZ("a:hlinkClick", zz6pZzZxZ.getId(), zz6pZzZxZ.zzZe(), zz6pZzZxZ.zzZzU(), zz6pZzZxZ.getExtensions(), zzzxr2);
        } else {
            zzzxr2 = zzzxr;
        }
        zz7Z.zzZ(zz4t.getExtensions(), zzzxr2);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzZXR zzzxr, zz53 zz53Var) throws Exception {
        zzC3 zzc3ZzZxW = zz53Var.zzZyc().zzZxW();
        int iZzZFM = zzc3ZzZxW.zzZFM();
        if (iZzZFM == 0) {
            zzZ(str, (zzC2) zzc3ZzZxW, zzzxr);
            return;
        }
        if (iZzZFM == 1) {
            String str2 = "cNvGraphicFramePr";
            if (zz53Var.zzZHY() == 12) {
                zz6Z zz6z = (zz6Z) zz53Var;
                if (!zz6z.zzZ(zz6z)) {
                    str2 = "cNvFrPr";
                }
            }
            zzZ(str, str2, (zzC0) zzc3ZzZxW, zzzxr);
            return;
        }
        if (iZzZFM == 2) {
            zzZ(str, (zzBZ) zzc3ZzZxW, zzzxr);
            return;
        }
        if (iZzZFM == 3) {
            zzZ(str, (zzBY) zzc3ZzZxW, zzzxr);
        } else if (iZzZFM == 4) {
            zzZ(str, (zzBX) zzc3ZzZxW, zzzxr);
        } else {
            if (iZzZFM == 5) {
                zzZ(str, (zzC1) zzc3ZzZxW, zzzxr);
                return;
            }
            throw new IllegalArgumentException("Unexpected non-visual properties holder.");
        }
    }

    private static void zzZ(String str, zzC1 zzc1, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:cNvContentPartPr", str));
        zzZ(zzc1, zzzxr);
        if (!zzc1.zzZFI()) {
            zzzydZzZlV.zzx("isComment", zzc1.zzZFI());
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzC2 zzc2, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("wps".equals(str) ? "wps:cNvCnPr" : com.aspose.words.internal.zzZKN.format("{0}:{1}", str, zzzxr.getCompliance() == 2 ? "cNvCnPr" : "cNvCxnSpPr"));
        zzZ(zzc2, zzzxr);
        zz7Z.zzZ(zzc2.getExtensions(), zzzxr);
        if (zzc2.zzZFJ() != null) {
            zzZ(zzzydZzZlV, "a:stCxn", zzc2.zzZFJ());
        }
        if (zzc2.zzZFK() != null) {
            zzZ(zzzydZzZlV, "a:endCxn", zzc2.zzZFK());
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZYD zzzyd, String str, zzBH zzbh) {
        zzzyd.zzY(str);
        zzzyd.zzZi("id", zzbh.getId());
        zzzyd.zzZi("idx", zzbh.getIndex());
        zzzyd.zzo();
    }

    private static void zzZ(String str, String str2, zzC0 zzc0, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2));
        zzZ(zzc0, zzzxr);
        zz7Z.zzZ(zzc0.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzBZ zzbz, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:cNvGrpSpPr", str));
        zzZ(zzbz, zzzxr);
        zz7Z.zzZ(zzbz.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzBY zzby, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:cNvPicPr", str));
        zzZ(zzby, zzzxr);
        zz7Z.zzZ(zzby.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzBX zzbx, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:cNvSpPr", str));
        zzzydZzZlV.zzw("txBox", zzbx.zzZFH());
        zzZ(zzbx, zzzxr);
        zz7Z.zzZ(zzbx.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzC3 zzc3, zzZXR zzzxr) throws Exception {
        if (zzc3.zzZFL().getCount() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:{1}", "a", zzHt(zzc3.zzZFM())));
        zzZ(0, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(1, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(2, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(3, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(4, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(5, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(6, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(7, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(8, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(9, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(10, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(11, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(12, zzc3.zzZFL(), zzzydZzZlV);
        zzZ(13, zzc3.zzZFL(), zzzydZzZlV);
        zz7Z.zzZ("a", zzc3.zzZFL().getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(int i, zz5G zz5g, zzZYD zzzyd) {
        Object objZzHE = zz5g.zzHE(i);
        if (objZzHE == null) {
            return;
        }
        zzzyd.zzP(zzHs(i), objZzHE);
    }
}
