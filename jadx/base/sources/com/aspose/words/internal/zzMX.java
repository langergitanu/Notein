package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMX extends zzMG {
    private int zzDJ;
    private long zzDK;
    private long zzDL;
    private boolean zzDM;
    private zzZQ4 zzG8;

    public zzMX(boolean z) {
        this.zzDM = z;
    }

    @Override // com.aspose.words.internal.zzMG
    public final boolean isEmpty() {
        return this.zzG8.isEmpty();
    }

    @Override // com.aspose.words.internal.zzMG
    public final boolean zzJR() {
        return this.zzDM;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        this.zzG8 = zzJJ().zzMY();
        this.zzDL = zzJJ().zzN1();
        this.zzDK = zzJJ().zzN1();
    }

    public final void zzX7(int i) {
        this.zzDJ = i;
    }

    @Override // com.aspose.words.internal.zzMG
    public final zzP5 zzc(long j) {
        zzQ5 zzq5ZzZ = zzQ4.zzZ(this.zzG8, this.zzDL, this.zzDK, this.zzDJ);
        zzP5 zzp5 = new zzP5(9);
        if (this.zzDM) {
            zzp5.zzR(j, zzq5ZzZ.zzPX());
        }
        zzp5.zzZ(zzq5ZzZ);
        return zzp5;
    }
}
