package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOB extends zzND {
    private zzYBI[] zzZrT;

    public zzOB() {
        super("list-style", true);
    }

    @Override // com.aspose.words.zzM6
    public final zzMP zzZ(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("list-style-type");
        zzPT zzptZzSx2 = zzps.zzSx("list-style-image");
        zzPT zzptZzSx3 = zzps.zzSx("list-style-position");
        return new zzOA(zzptZzSx != null ? zzptZzSx.zzZWj().zzZVx() : null, zzptZzSx2 != null ? zzptZzSx2.zzZWj().zzZVx() : null, zzptZzSx3 != null ? zzptZzSx3.zzZWj().zzZVx() : null);
    }

    @Override // com.aspose.words.zzM6
    public final zzYBI[] zzZXv() {
        if (this.zzZrT == null) {
            this.zzZrT = new zzYBI[]{new zzYBI("list-style-type", false), new zzYBI("list-style-image", false), new zzYBI("list-style-position", false)};
        }
        return this.zzZrT;
    }
}
