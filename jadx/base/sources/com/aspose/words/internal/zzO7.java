package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzO7 implements zzG8 {
    private zzM2 zzFI;
    private ArrayList<String> zzFJ = new ArrayList<>();

    private zzO7(byte[] bArr) throws Exception {
        this.zzFI = new zzM2(new zz8T(bArr), this);
    }

    public static ArrayList<String> zzi(byte[] bArr) throws Exception {
        zzO7 zzo7 = new zzO7(bArr);
        zzo7.zzFI.play();
        return zzo7.zzFJ;
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        if (this.zzFI.zzJA().getType() == 70) {
            String strZzZn = zzZO0.zzhU().zzZn(this.zzFI.zzJz().zzn(this.zzFI.zzJz().zzXc()));
            zzZQG.zzZ(this.zzFJ, strZzZn.substring(0, strZzZn.length() - 1));
        }
        return true;
    }
}
