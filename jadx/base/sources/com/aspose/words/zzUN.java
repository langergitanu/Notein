package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUN extends zzYBL {
    private zzYMD zzZuW;
    static int zzZv3 = com.aspose.words.internal.zzSA.zzn(4.0d);
    private static int zzZv2 = com.aspose.words.internal.zzSA.zzn(1.5d);
    static int zzZv1 = com.aspose.words.internal.zzSA.zzn(1.2000000476837158d);
    static int zzZv0 = com.aspose.words.internal.zzSA.zzn(229.8800048828125d);
    static int zzZuZ = com.aspose.words.internal.zzSA.zzn(7.599999904632568d);
    static int zzZuY = com.aspose.words.internal.zzSA.zzn(23.520000457763672d);
    static int zzZuX = com.aspose.words.internal.zzSA.zzn(3.440000057220459d);
    static int MARGIN = com.aspose.words.internal.zzSA.zzn(256.1700134277344d);

    private zzYAP zzZZF() {
        return ((zzUI) zza9()).zzZZC().zzY61();
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getWidth() {
        return zzZv0;
    }

    @Override // com.aspose.words.zzYMD
    public final void remove() {
    }

    @Override // com.aspose.words.zzTF
    public final int zz5U() {
        return zzZv2;
    }

    @Override // com.aspose.words.zzTF
    public final int zz5V() {
        return zzZv3;
    }

    @Override // com.aspose.words.zzTF
    public final int zz5W() {
        return zzZv2;
    }

    @Override // com.aspose.words.zzTF
    public final int zz5X() {
        return zzZv3;
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 4096;
    }

    public final void zzV(zzYMD zzymd) {
        this.zzZuW = zzymd;
    }

    public final int zzZZG() {
        return zzZZF().zzY63().zzZZG();
    }

    public final int zzZZH() throws Exception {
        return (int) ((zzZZF().zzY64() == null ? zzZZF().zzY63() : (zzZ55) zzZZF().zzY64().zzZZJ()).zzYqr() >> 32);
    }

    public final zzYMD zzZZI() {
        return this.zzZuW;
    }

    @Override // com.aspose.words.zzYMD
    public final zzTF zzZZJ() {
        zzYAQ zzyaqZzZZC = ((zzUI) zza9()).zzZZC();
        zzYAQ zzyaqZzY64 = zzyaqZzZZC.zzY64();
        if (zzyaqZzY64 != null) {
            zzyaqZzZZC = zzyaqZzY64;
        }
        return zzyaqZzZZC.zzZ8m();
    }

    @Override // com.aspose.words.zzYBL
    public final boolean zzZZK() {
        return false;
    }
}
