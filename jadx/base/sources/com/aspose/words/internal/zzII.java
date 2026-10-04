package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzII extends zzZWZ {
    zzIJ[] zzyb;
    int zzyc;
    short zzyd;
    int zzye;

    public static zzII zzV(zzY0 zzy0, int i) throws Exception {
        zzII zzii = new zzII();
        zzii.zzye = i;
        zzii.zzyd = zzy0.zzX9();
        int iZzXa = zzy0.zzXa();
        int iZzXc = zzy0.zzXc();
        zzii.zzyc = iZzXc;
        if (iZzXa < 0 || iZzXc < i + 2) {
            throw new IllegalStateException("Unsupported hdmx table format.");
        }
        zzii.zzyb = new zzIJ[iZzXa];
        for (int i2 = 0; i2 < iZzXa; i2++) {
            zzii.zzyb[i2] = zzIJ.zzZ(zzy0, i, zzii.zzyc);
        }
        return zzii;
    }

    public final void zzGr() {
        this.zzyc = zzAN.zzN(this.zzye + 2, 4);
    }

    @Override // com.aspose.words.internal.zzZWZ
    public final void zzX(zzXZ zzxz) throws Exception {
        zzV(zzxz);
        int i = 0;
        while (true) {
            zzIJ[] zzijArr = this.zzyb;
            if (i >= zzijArr.length) {
                return;
            }
            zzijArr[i].zzS(zzxz, this.zzyc);
            i++;
        }
    }

    public final void zzV(zzXZ zzxz) throws Exception {
        zzxz.zzi(this.zzyd & 65535);
        zzxz.zzj(this.zzyb.length);
        zzxz.zzl(this.zzyc);
    }
}
