package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGT extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("1", "a", C18385v2.f56336h, ContextChain.TAG_INFRA, "I", "disc", "circle", "square");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZms, (byte) 0));
        zzpr.zzV(new zzM3("text-align", zzL4.zzZmz, (byte) 0));
        String attributeValue = zzzas.getAttributeValue(C18437z2.f56754h, "");
        com.aspose.words.internal.zzZHW zzzhw = zzUR;
        int iZzTP = zzzhw.zzTP(attributeValue);
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmf, (byte) 0));
        } else if (iZzTP == 1) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmd, (byte) 0));
        } else if (iZzTP == 2) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmc, (byte) 0));
        } else if (iZzTP == 3) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmb, (byte) 0));
        } else if (iZzTP == 4) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZma, (byte) 0));
        }
        int iZzTP2 = zzzhw.zzTP(com.aspose.words.internal.zzZKN.zzU2(attributeValue));
        if (iZzTP2 == 5) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZm4, (byte) 0));
        } else if (iZzTP2 == 6) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZm3, (byte) 0));
        } else {
            if (iZzTP2 != 7) {
                return;
            }
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZm2, (byte) 0));
        }
    }
}
