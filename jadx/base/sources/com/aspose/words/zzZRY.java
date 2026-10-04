package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRY {
    String zzYHZ;
    String zzYI0;
    String zzck;
    int zze0;

    public zzZRY(int i, String str, String str2) {
        this.zzYHZ = "";
        this.zze0 = i;
        this.zzYI0 = str;
        this.zzck = str2;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("Id:{0}, Uri:{1}, Tag:{2}, DownloadUri:{3}", Integer.valueOf(this.zze0), this.zzYI0, this.zzck, this.zzYHZ);
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(zzYNF.zzIx(this.zzYI0) + 4 + zzYNF.zzIx(this.zzck) + zzYNF.zzIx(this.zzYHZ));
        zzzow.zzl(this.zze0);
        zzYNF.zzU(zzzow, this.zzYI0);
        zzYNF.zzU(zzzow, this.zzck);
        zzYNF.zzU(zzzow, this.zzYHZ);
    }

    public zzZRY(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYHZ = "";
        zzzox.zzXc();
        this.zze0 = zzzox.zzXc() & 65535;
        this.zzYI0 = zzYNF.zzd(zzzox);
        this.zzck = zzYNF.zzd(zzzox);
        this.zzYHZ = zzYNF.zzd(zzzox);
    }
}
