package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN8 {
    private static com.aspose.words.internal.zzPV zzYxv = com.aspose.words.internal.zzPV.zzI5;
    private com.aspose.words.internal.zzZQC<Shading> zzYxw;

    public zzZN8() {
        com.aspose.words.internal.zzZQC<Shading> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzYxw = zzzqc;
        zzzqc.push(null);
    }

    public static com.aspose.words.internal.zzPV zz5(com.aspose.words.internal.zzPV zzpv) {
        return zzpv.isEmpty() ? com.aspose.words.internal.zzPV.zzKa : zzpv;
    }

    public static com.aspose.words.internal.zzPV zz6(com.aspose.words.internal.zzPV zzpv) {
        return zzpv.isEmpty() ? zzYxv : zzpv;
    }

    private static boolean zzS(Shading shading) {
        return shading != null && shading.isVisible();
    }

    public static com.aspose.words.internal.zzPV zzT(Shading shading) {
        int texture = shading.getTexture();
        if (texture == 0 || texture == 65535) {
            return shading.zzYbK().isEmpty() ? com.aspose.words.internal.zzPV.zzKa : zzYv(shading.zzYbK().zzPE());
        }
        if (zzY0C.zzhx(texture)) {
            return com.aspose.words.internal.zzPV.zzKa;
        }
        float fZzhz = (float) zzY0C.zzhz(texture);
        return zzYv((zz6(shading.zzYbK()).zzPE() * (1.0f - fZzhz)) + (zz5(shading.zzYbJ()).zzPE() * fZzhz));
    }

    private static com.aspose.words.internal.zzPV zzYv(float f) {
        return f > 0.2345f ? com.aspose.words.internal.zzPV.zzKa : com.aspose.words.internal.zzPV.zzI5;
    }

    public final com.aspose.words.internal.zzPV zz7(com.aspose.words.internal.zzPV zzpv) {
        return zzQ(zzpv, com.aspose.words.internal.zzPV.zzKa);
    }

    public final com.aspose.words.internal.zzPV zzQ(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        if (!zzpv.isEmpty()) {
            return zzpv;
        }
        Shading shadingPeek = this.zzYxw.peek();
        return shadingPeek == null ? zzpv2 : zzT(shadingPeek);
    }

    public final void zzU(Shading shading) {
        com.aspose.words.internal.zzZQC<Shading> zzzqc = this.zzYxw;
        if (!zzS(shading)) {
            shading = this.zzYxw.peek();
        }
        zzzqc.push(shading);
    }

    public final boolean zzZ(Shading shading, boolean z) {
        boolean z2 = true;
        if (!z) {
            return true;
        }
        if (!zzS(shading)) {
            return false;
        }
        if (shading.getTexture() != 0 && shading.getTexture() != 65535) {
            return true;
        }
        Shading shadingPeek = this.zzYxw.size() > 0 ? this.zzYxw.peek() : null;
        zzZ7c();
        Shading shadingPeek2 = this.zzYxw.size() > 0 ? this.zzYxw.peek() : null;
        if (shadingPeek2 == null || shadingPeek2.getTexture() == 0 || shadingPeek2.getTexture() == 65535) {
            if (com.aspose.words.internal.zzPV.zzZ(shadingPeek2 != null ? shadingPeek2.zzYbK() : zzYxv, shading.zzYbK())) {
                z2 = false;
            }
        }
        this.zzYxw.push(shadingPeek);
        return z2;
    }

    public final void zzZ7c() {
        this.zzYxw.pop();
    }
}
