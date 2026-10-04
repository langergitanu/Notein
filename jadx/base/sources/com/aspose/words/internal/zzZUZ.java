package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUZ implements zzG8 {
    private ArrayList<String> zzFJ = new ArrayList<>();
    private zzZTY zzr0;

    private zzZUZ(byte[] bArr) throws Exception {
        this.zzr0 = new zzZTY(new zz8T(bArr), this);
    }

    public static ArrayList<String> zzi(byte[] bArr) throws Exception {
        zzZUZ zzzuz = new zzZUZ(bArr);
        zzzuz.zzr0.play();
        return zzzuz.zzFJ;
    }

    @Override // com.aspose.words.internal.zzG8
    public final boolean zzMO() throws Exception {
        if (this.zzr0.zzmO().getType() == 1574) {
            short sZzXa = this.zzr0.zzmP().zzXa();
            int iZzXa = this.zzr0.zzmP().zzXa() & 65535;
            if (sZzXa == 15) {
                String strZzZn = zzZO0.zzhX().zzZn(this.zzr0.zzmP().zzn(iZzXa));
                zzZQG.zzZ(this.zzFJ, strZzZn.substring(0, strZzZn.length() - 1));
            }
        } else if (this.zzr0.zzmO().getType() == 2610) {
            this.zzr0.zzmP().zzN1();
            int iZzXa2 = this.zzr0.zzmP().zzXa() & 65535;
            if (this.zzr0.zzmP().zzXa() != 0) {
                this.zzr0.zzmP().zzMY();
            }
            if (iZzXa2 != 0) {
                zzZQG.zzZ(this.zzFJ, zzZO0.zzhX().zzZn(this.zzr0.zzmP().zzn(iZzXa2)));
            }
        }
        return true;
    }
}
