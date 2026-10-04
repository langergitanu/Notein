package com.aspose.words;

import com.hihonor.honorid.core.data.TmemberRight;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWZ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("person", "author", "presenceInfo", "providerId", TmemberRight.TAG_USERID);

    public static void zzE(zzZXT zzzxt) throws Exception {
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkx());
        if (zzzw1ZzNJ == null) {
            return;
        }
        zzzxt.zzZqn().zzYr6();
        while (zzzw1ZzNJ.zzQ("people")) {
            if (zzUR.zzTP(zzzw1ZzNJ.getLocalName()) != 0) {
                zzI(zzzw1ZzNJ);
                zzzw1ZzNJ.zzk();
            } else {
                zzZL(zzzxt);
            }
        }
        zzzxt.zzZmi();
    }

    private static void zzI(zzYU4 zzyu4) {
        zzyu4.zzZ(16777216, 9, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
    }

    private static void zzZ(zzYLT zzylt, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 3) {
                zzylt.zzq4(zzZXP.zzN0(zzyu4.getValue()));
            } else if (iZzTP != 4) {
                zzI(zzyu4);
            } else {
                zzylt.zzCW(zzyu4.getValue());
            }
        }
    }

    private static void zzZL(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYLT zzylt = new zzYLT();
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 1) {
                zzI(zzyu4ZzZsD);
            } else {
                zzylt.setAuthor(zzyu4ZzZsD.getValue());
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("person")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 2) {
                zzI(zzyu4ZzZsD);
                zzyu4ZzZsD.zzk();
            } else {
                zzZ(zzylt, zzyu4ZzZsD);
            }
        }
        zzzxt.getDocument().zzZq1().zzZ(zzylt);
    }
}
