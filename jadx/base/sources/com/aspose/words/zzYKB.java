package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKB extends com.aspose.words.internal.zz6 implements com.aspose.words.internal.zzH2 {
    private int zzXD0;
    private zzYKC zzXD1;
    private int zzXD2 = 0;
    private IWarningCallback zzZG0;

    public zzYKB(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    private static zzYKC zzpD(int i) {
        if (i == 16) {
            return new zzKT();
        }
        if (i == 22) {
            return new zzX4();
        }
        if (i == 65) {
            return new zzZN9();
        }
        if (i == 84) {
            return new zzYP();
        }
        if (i == 53 || i == 54) {
            return new zzYIX();
        }
        if (i == 97 || i == 98) {
            return new zzYDS();
        }
        if (i == 107 || i == 108) {
            return new zzZUX();
        }
        switch (i) {
            case 102:
            case 103:
            case 104:
            case 105:
                return new zzKS();
            default:
                return null;
        }
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        zzzg.zzZ0().zzY(this);
        this.zzXD2++;
    }

    public final com.aspose.words.internal.zzG zzY(com.aspose.words.internal.zzG zzg, int i) throws Exception {
        zzYKC zzykcZzpD = zzpD(i);
        this.zzXD1 = zzykcZzpD;
        if (zzykcZzpD != null) {
            try {
                zzg.zzZ(this);
                zzg.zzZ(this.zzXD1.zzYmr());
                return zzg;
            } catch (Exception unused) {
                if (this.zzZG0 != null) {
                    OooO00o.OooO0O0(this.zzZG0, 16777216, 4, "Unsupported shape structure encountered.");
                }
            }
        }
        return zzg;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        this.zzXD0 = zzp5.getCount();
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) {
        this.zzXD1.zzZ(this.zzXD2, zzos);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) {
        this.zzXD1.zzZ(this.zzXD2, zzpz, this.zzXD0);
        return true;
    }
}
