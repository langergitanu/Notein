package com.aspose.words.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQH implements Comparator<zzQG> {
    private zz7E<zzQG> zzL6 = new zz7E<>();
    private zzQ9 zzL7;

    public zzQH(zzQ9 zzq9) {
        this.zzL7 = zzq9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: zzY, reason: merged with bridge method [inline-methods] */
    public int compare(zzQG zzqg, zzQG zzqg2) {
        int order = ((zzQE.zzYh(zzqg.getType()) && zzQE.zzYh(zzqg2.getType())) || (zzQE.zzYg(zzqg.getType()) && zzQE.zzYg(zzqg2.getType()))) ? zzqg.getOrder() - zzqg2.getOrder() : 0;
        if (order == 0) {
            order = zzqg.getType() - zzqg2.getType();
        }
        return order != 0 ? order : zzZKQ.zzZN(zzZ(zzqg) - zzZ(zzqg2));
    }

    private float zzZ(zzQG zzqg) {
        if (this.zzL6.containsKey(zzqg)) {
            return (float) this.zzL6.zzm(zzqg);
        }
        float f = Float.MAX_VALUE;
        for (int i = 0; i < zzqg.getCount(); i++) {
            zzQD zzqdZzYi = zzqg.zzYi(i);
            for (int i2 = 0; i2 < zzqdZzYi.getCount(); i2++) {
                float fZzZ = zzJ6.zzZ(zzqdZzYi.zzYi(i2), this.zzL7);
                if (fZzZ < f) {
                    f = fZzZ;
                }
            }
        }
        this.zzL6.zzZ(zzqg, f);
        return f;
    }
}
