package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVI extends zzY9C {
    private zzYMD zzZA6;
    private zzYMD zzZA7;

    public zzYVI(zzZYW zzzyw) {
        super(zzzyw);
    }

    private zzYVR zzA(zzUZ zzuz) throws Exception {
        zzYVR zzyvrZzY = null;
        for (zzUZ zzuzZz06 = zzuz.zz06(); zzyvrZzY == null && zzuzZz06 != null; zzuzZz06 = zzuzZz06.zz06()) {
            zzyvrZzY = zzY(zzuzZz06, false);
        }
        return zzyvrZzY;
    }

    private zzYVR zzB(zzUZ zzuz) throws Exception {
        zzYVR zzyvrZzY = null;
        for (zzUZ zzuzZz07 = zzuz.zz07(); zzyvrZzY == null && zzuzZz07 != null; zzuzZz07 = zzuzZz07.zz07()) {
            zzyvrZzY = zzY(zzuzZz07, false);
        }
        return zzyvrZzY;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzZA6;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzZA7;
    }

    public final zzYVR[] zzC(zzUZ zzuz) throws Exception {
        zzYVR[] zzyvrArr = new zzYVR[2];
        zzYVR zzyvrZzB = zzB(zzuz);
        zzyvrArr[0] = zzyvrZzB;
        if (zzyvrZzB == null) {
            zzyvrArr[1] = zzA(zzuz);
        }
        return zzyvrArr;
    }

    public abstract void zzK(zzUZ zzuz);

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) {
        throw new IllegalStateException();
    }

    public abstract zzYVR zzY(zzUZ zzuz, boolean z) throws Exception;

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzZA6 = zzymd;
    }

    @Override // com.aspose.words.zzY9C
    public final zzYMM zzZ(zzYAS zzyas) throws Exception {
        return zzU(zzyas);
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzZA7 = zzymd;
    }
}
