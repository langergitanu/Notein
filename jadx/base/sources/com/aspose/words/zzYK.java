package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYK implements zzZ8R {
    static boolean zzZD5 = false;
    int flags;
    int zzZD6;
    int zzZD7;

    public zzYK() {
    }

    private void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZD7 = zzzox.zzXa();
        this.zzZD6 = zzzox.zzXa();
        this.flags = zzzox.zzXa();
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Bkd: itxbxs:{0}, dcpDepend:{1}, flags:{2}", Integer.valueOf(this.zzZD7), Integer.valueOf(this.zzZD6), Integer.valueOf(this.flags));
        }
    }

    public zzYK(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzZ(zzzox);
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzK((short) this.zzZD7);
        zzzow.zzK((short) this.zzZD6);
        zzzow.zzK((short) this.flags);
    }
}
