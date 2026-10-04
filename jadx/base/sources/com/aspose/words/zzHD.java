package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHD extends zz0A {
    public zzHD(zzZCO zzzco, zzDI zzdi, com.aspose.words.internal.zzZQ4 zzzq4) {
        super(zzzco, zzdi, zzzq4);
    }

    private float zzZR(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        return zzzq4.zzkw() - getWidth();
    }

    private float zzZS(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        float fZzZo;
        float height;
        if (!zzZse()) {
            fZzZo = zzZLA().zzZo();
            if (!zzb1()) {
                height = 0.0f;
            }
            return fZzZo - height;
        }
        fZzZo = zzzq4.zzZo();
        height = getHeight();
        return fZzZo - height;
    }

    private float zzZT(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        if (zzZse()) {
            return zzzq4.zzZn();
        }
        return zzZLA().zzZn() - (zzb1() ? 0.0f : getHeight());
    }

    private float zzZU(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        float x;
        float width;
        if (!zzZse()) {
            x = zzZLA().getX();
            if (!zzb1()) {
                width = 0.0f;
            }
            return x - width;
        }
        x = zzzq4.zzZm();
        width = getWidth();
        return x - width;
    }

    private float zzZV(com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        if (zzZse()) {
            return zzzq4.zzkw();
        }
        return zzZLA().zzkw() - (zzb1() ? 0.0f : getWidth());
    }

    private boolean zzb1() {
        return ((AxisDisplayUnit) this.zzYXc).zzb1();
    }

    @Override // com.aspose.words.zz0A
    public final boolean getOverlay() {
        return false;
    }

    @Override // com.aspose.words.zz0A
    public final void zzO(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) throws Exception {
        float fZzZR;
        float fZzZT;
        float fZzZU;
        float fZzZo;
        int titlePosition = getTitlePosition();
        if (titlePosition != 5) {
            if (titlePosition == 6) {
                fZzZU = zzZU(zzzq4);
                fZzZo = zzzq42.zzZo();
            } else if (titlePosition != 7) {
                fZzZR = zzZR(zzzq42);
                fZzZT = zzZS(zzzq4);
            } else {
                fZzZU = zzZV(zzzq4);
                fZzZo = zzzq42.zzZo();
            }
            float f = fZzZo;
            fZzZR = fZzZU;
            fZzZT = f;
        } else {
            fZzZR = zzZR(zzzq42);
            fZzZT = zzZT(zzzq4);
        }
        translate(fZzZR, fZzZT);
    }
}
