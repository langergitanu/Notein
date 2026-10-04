package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSL extends zzZSK {
    private zzZS7 zz5Y;
    private zz77 zz5Z;
    private zz79 zz60;

    public zzZSL(zz79 zz79Var, int i, zzF4 zzf4, boolean z) {
        super("/Resources", i, zzf4, z);
        this.zz60 = zz79Var;
    }

    private static String zzRK(int i) {
        if (i == 5) {
            return "image/jpeg";
        }
        if (i == 6) {
            return "image/png";
        }
        if (i == 8) {
            return "image/tiff";
        }
        throw new IllegalStateException("Unexpected image type.");
    }

    private static zz77 zzZ(zzZS9 zzzs9) throws Exception {
        zz77 zz77Var = new zz77(zzzs9.getUri(), zzRK(zzEF.zzZU(zzzs9.getImageBytes())));
        zz77Var.zzR1().write(zzzs9.getImageBytes(), 0, zzzs9.getImageBytes().length);
        return zz77Var;
    }

    @Override // com.aspose.words.internal.zzZSK
    public final String zzK(zzZXH zzzxh) throws Exception {
        String strZzK = super.zzK(zzzxh);
        this.zz5Z.zzxn().zzZ(zzml().zzmb(), strZzK, false);
        return strZzK;
    }

    @Override // com.aspose.words.internal.zzZSK
    public final zzZS9 zzR(byte[] bArr, zzEP zzep) throws Exception {
        zzZS9 zzzs9ZzR = super.zzR(bArr, zzep);
        this.zz5Z.zzxn().zzZ(zzml().zzmb(), zzzs9ZzR.getUri(), false);
        return zzzs9ZzR;
    }

    public final void zzRL(int i) throws Exception {
        zz77 zz77Var = new zz77(zzZKN.format("/Documents/1/Pages/{0}.fpage", Integer.valueOf(i)), "application/vnd.ms-package.xps-fixedpage+xml");
        this.zz60.zzxo().zzY(zz77Var);
        this.zz5Z = zz77Var;
    }

    @Override // com.aspose.words.internal.zzZSK
    public final boolean zzmC() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZSK
    public final void zzmD() throws Exception {
        Iterator<Map.Entry<K, V>> it = zzmo().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.zz60.zzxo().zzY(zzZSA.zzZ((zzJO) entry.getValue(), (String) entry.getKey()));
        }
        for (int i = 0; i < zzmk().getCount(); i++) {
            this.zz60.zzxo().zzY(zzZ(zzmk().zzVY(i)));
        }
    }

    public final zz77 zzmq() {
        return this.zz5Z;
    }

    public final void zzZ(zzZS7 zzzs7) {
        this.zz5Y = zzzs7;
    }
}
