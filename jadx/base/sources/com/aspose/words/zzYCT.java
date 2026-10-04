package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYCT extends zzTG {
    private zzYAU zzXnM;
    private zzTF zzXnN;
    private zzTF zzXnO;

    public static zzYCT zzmu(int i) {
        switch (i) {
            case 1:
                return new zzZ2D();
            case 2:
                return new zzZMT();
            case 3:
                return new zzZUC();
            case 4:
                return new zzUI();
            case 5:
                return new zzYC0();
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return new zzZKX();
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return new zzYVL();
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: storyType");
        }
    }

    public final int getStoryType() {
        return ((zzY9C) zza9()).getStoryType();
    }

    @Override // com.aspose.words.zzZ6T
    public zzYMD zz6w() {
        return this.zzXnN;
    }

    @Override // com.aspose.words.zzZ6T
    public zzYMD zz6x() {
        return this.zzXnO;
    }

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 2;
    }

    @Override // com.aspose.words.zzZ6T
    public zzTF zzX(zzYMD zzymd) throws Exception {
        return zza9().zzX(zzymd);
    }

    @Override // com.aspose.words.zzZ6T
    public void zzY(zzYMD zzymd) {
        this.zzXnN = (zzTF) zzymd;
    }

    public final void zzYc5() {
        zzYAU zzyau = this.zzXnM;
        if (zzyau != null) {
            zzyau.zzX(null);
        }
        this.zzXnM = null;
    }

    public final zzYAU zzYc6() {
        try {
            if (((zzY9C) zza9()).getStoryType() != 4 && ((zzY9C) zza9()).getStoryType() != 2) {
                zza9();
            }
            if (this.zzXnM == null) {
                zzYAS zzyas = (zzYAS) ((zzYMM) zzZXY()).zzZ9r();
                zzyas.zzZo6();
                this.zzXnM = zzyas.zzY6L();
                zzyas.zzX(this);
            }
            return this.zzXnM;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.zzZ6T
    public void zzZ(zzYMD zzymd) {
        this.zzXnO = (zzTF) zzymd;
    }
}
