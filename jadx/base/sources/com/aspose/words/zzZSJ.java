package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSJ {
    public static zzTL zzZ(zzZSM zzzsm) throws Exception {
        zzTJ zztj = new zzTJ();
        if (zzzsm.getCount() == 0) {
            return new zzZU3("!Unexpected End of Formula");
        }
        while (zzzsm.getCount() > 0) {
            zzTL zztlZzZ = zzzsm.zzZi1().zzZ(zztj);
            if (zztlZzZ.isError()) {
                return zztlZzZ;
            }
            zztj.zzX(zztlZzZ);
        }
        return zztj.getCount() > 0 ? new zzZU3("!Missing Operator") : zztj.zzZY5();
    }
}
