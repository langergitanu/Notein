package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzAO {
    public static void zzZ(String str, zz60 zz60Var, zzZXR zzzxr) {
        if (zz60Var == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str2 = com.aspose.words.internal.zzZKN.zzR(str, ':')[0];
        zzzydZzZlV.zzY(str);
        zzZ(0, zz60Var, zzzydZzZlV, str2);
        zzZ(1, zz60Var, zzzydZzZlV, str2);
        zzZ(2, zz60Var, zzzydZzZlV, str2);
        zzZ(3, zz60Var, zzzydZzZlV, str2);
        zzZ(4, zz60Var, zzzydZzZlV, str2);
        zzZ(5, zz60Var, zzzydZzZlV, str2);
        zzZ(6, zz60Var, zzzydZzZlV, str2);
        zzZ(7, zz60Var, zzzydZzZlV, str2);
        zzZ(8, zz60Var, zzzydZzZlV, str2);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(int i, zz60 zz60Var, zzZYD zzzyd, String str) {
        Object objZzLu = zz60Var.zzLu(i);
        if (objZzLu == null) {
            return;
        }
        switch (i) {
            case 0:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:orgChart", str), "val", objZzLu);
                break;
            case 1:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:chMax", str), "val", Integer.valueOf(((zz95) objZzLu).getValue()));
                break;
            case 2:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:chPref", str), "val", Integer.valueOf(((zz95) objZzLu).getValue()));
                break;
            case 3:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:bulletEnabled", str), "val", objZzLu);
                break;
            case 4:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:dir", str), "val", zz9Z.zzJe(((Integer) objZzLu).intValue()));
                break;
            case 5:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:hierBranch", str), "val", zz9Z.zzJd(((Integer) objZzLu).intValue()));
                break;
            case 6:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:animOne", str), "val", zz9Z.zzJc(((Integer) objZzLu).intValue()));
                break;
            case 7:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:animLvl", str), "val", zz9Z.zzJb(((Integer) objZzLu).intValue()));
                break;
            case 8:
                zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:resizeHandles", str), "val", zz9Z.zzJa(((Integer) objZzLu).intValue()));
                break;
        }
    }

    public static void zzZ(String str, zz8T[] zz8tArr, zzZXR zzzxr) {
        if (zz8tArr == null || zz8tArr.length == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (zz8T zz8t : zz8tArr) {
            zzzydZzZlV.zzY(str);
            zzzydZzZlV.zz0(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, zz8t.getLanguage());
            zzzydZzZlV.zzX("val", zz8t.getValue());
            zzzydZzZlV.zzo();
        }
    }

    public static void zzZ(zzBP[] zzbpArr, zzZXR zzzxr) {
        if (zzbpArr == null || zzbpArr.length == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("dgm:catLst");
        for (zzBP zzbp : zzbpArr) {
            zzzydZzZlV.zzX("dgm:cat", C18437z2.f56754h, zzbp.zzZFt(), "pri", Integer.valueOf(zzbp.getPriority()));
        }
        zzzydZzZlV.zzo();
    }
}
