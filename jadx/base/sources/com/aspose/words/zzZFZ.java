package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18385v2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFZ extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("1", "a", C18385v2.f56336h, ContextChain.TAG_INFRA, "I");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmf, (byte) 0));
        zzpr.zzV(new zzM3("-aw-padding-start", new zzOI(36.0d, 4), (byte) 0));
        int iZzTP = zzUR.zzTP(zzzas.zzKM(C18437z2.f56754h));
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmf, (byte) 0));
            return;
        }
        if (iZzTP == 1) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmd, (byte) 0));
            return;
        }
        if (iZzTP == 2) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmc, (byte) 0));
        } else if (iZzTP == 3) {
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZmb, (byte) 0));
        } else {
            if (iZzTP != 4) {
                return;
            }
            zzpr.zzV(new zzM3("list-style-type", zzL4.zzZma, (byte) 0));
        }
    }
}
