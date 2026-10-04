package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAP extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("cat", "orgChart", "chMax", "chPref", "bulletEnabled", "dir", "hierBranch", "animOne", "animLvl", "resizeHandles");
    private zzYU4 zzZ89;

    private zzAP(zzYU4 zzyu4) {
        this.zzZ89 = zzyu4;
    }

    public static zz60 zzO(zzYU4 zzyu4) {
        zz60 zz60Var = new zz60();
        String localName = zzyu4.getLocalName();
        while (zzyu4.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 1:
                    zz60Var.zzX2(zzyu4.zzX("val", false));
                    break;
                case 2:
                    zz60Var.zzL(1, new zz95(zzyu4.zzX("val", -1)));
                    break;
                case 3:
                    zz60Var.zzL(2, new zz95(zzyu4.zzX("val", -1)));
                    break;
                case 4:
                    zz60Var.zzX1(zzyu4.zzX("val", false));
                    break;
                case 5:
                    zz60Var.setDirection(zz9Z.zzQg(zzyu4.zzV("val", "norm")));
                    break;
                case 6:
                    zz60Var.zzHV(zz9Z.zzQe(zzyu4.zzV("val", "norm")));
                    break;
                case 7:
                    zz60Var.zzHU(zz9Z.zzQc(zzyu4.zzV("val", "one")));
                    break;
                case 8:
                    zz60Var.zzHT(zz9Z.zzQa(zzyu4.zzV("val", "none")));
                    break;
                case 9:
                    zz60Var.zzHS(zz9Z.zzQ8(zzyu4.zzV("val", "rel")));
                    break;
                default:
                    zz39.zzK(zzyu4);
                    break;
            }
        }
        return zz60Var;
    }

    public static zzBP[] zzP(zzYU4 zzyu4) {
        zzAP zzap = new zzAP(zzyu4);
        ArrayList arrayList = new ArrayList();
        while (zzyu4.zzQ("catLst")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 0) {
                zz39.zzK(zzyu4);
            } else {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBP>) arrayList, zzap.zzZED());
            }
        }
        return (zzBP[]) arrayList.toArray(new zzBP[0]);
    }

    public static zz8T zzQ(zzYU4 zzyu4) {
        zz8T zz8t = new zz8T();
        zz8t.zzPr(zzyu4.zzV(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, ""));
        zz8t.setValue(zzyu4.zzV("val", ""));
        return zz8t;
    }

    private zzBP zzZED() {
        zzBP zzbp = new zzBP();
        zzbp.zzQB(this.zzZ89.zzV(C18437z2.f56754h, ""));
        zzbp.setPriority(com.aspose.words.internal.zzJB.parseInt(this.zzZ89.zzV("pri", "0")));
        return zzbp;
    }
}
