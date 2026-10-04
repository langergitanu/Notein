package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzHB extends zz0A {
    public zzHB(zzZCO zzzco, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4) {
        super(zzzco, zzdi, zzzq4);
    }

    private float zzZP(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        float y = zzzq4.getY();
        return Math.max(y, ((zzzq4.getHeight() - getHeight()) / 2.0f) + y);
    }

    private float zzZQ(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX()) - (getWidth() / 2.0f);
    }

    private float zzZS(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return Math.max(zzZse() ? zzzq4.zzZo() - getHeight() : zzZLA().zzZo(), 0.0f);
    }

    private float zzZT(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return Math.min(zzZse() ? zzzq4.zzZn() : zzZLA().zzZn() - getHeight(), com.aspose.words.internal.zzZPW.zzYz(zz43().zzZIz()) - getHeight());
    }

    private float zzZU(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return Math.max(zzZse() ? zzzq4.zzZm() - getWidth() : zzZLA().getX(), 0.0f);
    }

    private float zzZV(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return Math.min(zzZse() ? zzzq4.zzkw() : zzZLA().zzkw() - getWidth(), Float.intBitsToFloat((int) zz43().zzZIz()) - getWidth());
    }

    @Override // com.aspose.words.zz0A
    public final void zzO(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) throws Exception {
        float fZzZQ;
        float fZzZT;
        float fZzZU;
        float fZzZP;
        int titlePosition = getTitlePosition();
        if (titlePosition != 1) {
            if (titlePosition == 2) {
                fZzZU = zzZU(zzzq4);
                fZzZP = zzZP(zzzq42);
            } else if (titlePosition != 3) {
                fZzZQ = zzZQ(zzzq42);
                fZzZT = zzZS(zzzq4);
            } else {
                fZzZU = zzZV(zzzq4);
                fZzZP = zzZP(zzzq42);
            }
            float f = fZzZP;
            fZzZQ = fZzZU;
            fZzZT = f;
        } else {
            fZzZQ = zzZQ(zzzq42);
            fZzZT = zzZT(zzzq4);
        }
        translate(fZzZQ, fZzZT);
    }
}
