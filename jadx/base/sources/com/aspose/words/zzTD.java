package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzTD {
    private static boolean zzX(zzUZ zzuz, zzUZ zzuz2) {
        if (!zzuz2.zz0n() || !zzuz2.zz0f() || !zzuz2.zz0l()) {
            return false;
        }
        boolean z = false;
        for (zzUZ zzuz3 = (zzUZ) zzuz.zzYo1(); zzuz3 != null; zzuz3 = (zzUZ) zzuz3.zzYo1()) {
            if (!zzuz3.isEmpty()) {
                return false;
            }
            if (zzuz3 == zzuz2) {
                z = true;
            }
        }
        return z;
    }

    private static boolean zzY(zzUZ zzuz, zzUZ zzuz2) {
        return zzuz2.isEmpty() && !zzuz2.zz0n() && ((zzUZ) zzuz.zzYo1()) == zzuz2 && !zzuz.zz0o() && zzuz.zz0l();
    }

    public static void zzZ(zzTF zztf, zzTF zztf2) {
        zztf2.zz0v();
        zztf.zz0v();
        zzTE zzteZz0v = zztf.zz0v();
        zztf.zzZ(zztf2.zz0v());
        zztf.zz0v().zzY(zztf);
        zztf2.zzZ(zzteZz0v);
        zztf2.zz0v().zzY(zztf2);
    }

    public static boolean zzZ(zzUZ zzuz, zzUZ zzuz2) {
        return zzY(zzuz, zzuz2) || zzX(zzuz, zzuz2);
    }
}
