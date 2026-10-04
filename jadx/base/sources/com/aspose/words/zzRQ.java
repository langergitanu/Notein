package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRQ extends zzND {
    private zzYBI[] zzZrT;

    public zzRQ() {
        super("background", false);
    }

    @Override // com.aspose.words.zzM6
    public final zzMP zzZ(zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("background-color");
        zzPT zzptZzSx2 = zzps.zzSx("background-image");
        zzPT zzptZzSx3 = zzps.zzSx("background-repeat");
        zzPT zzptZzSx4 = zzps.zzSx("background-attachment");
        zzPT zzptZzSx5 = zzps.zzSx("background-position");
        return new zzRP(zzptZzSx != null ? zzptZzSx.zzZWj().zzZVx() : null, zzptZzSx2 != null ? zzptZzSx2.zzZWj().zzZVx() : null, zzptZzSx3 != null ? zzptZzSx3.zzZWj().zzZVx() : null, zzptZzSx4 != null ? zzptZzSx4.zzZWj().zzZVx() : null, zzptZzSx5 != null ? (zzRR) zzptZzSx5.zzZWj() : null);
    }

    @Override // com.aspose.words.zzM6
    public final zzYBI[] zzZXv() {
        zzYBI[] zzybiArr = this.zzZrT;
        if (zzybiArr != null) {
            return zzybiArr;
        }
        zzYBI[] zzybiArr2 = {new zzYBI("background-color", false), new zzYBI("background-image", false), new zzYBI("background-repeat", false), new zzYBI("background-attachment", false), new zzYBI("background-position", false)};
        this.zzZrT = zzybiArr2;
        return zzybiArr2;
    }
}
