package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1J extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("effectRef", "fillRef", "fontRef", "lnRef");
    private zzYO3 zzZ88;
    private zzYU4 zzZ89;

    private zz1J(zzYU4 zzyu4, zzYO3 zzyo3) {
        this.zzZ89 = zzyu4;
        this.zzZ88 = zzyo3;
    }

    public static zz1K zzQ(zzYU4 zzyu4, zzYO3 zzyo3) {
        if (!"style".equals(zzyu4.getLocalName())) {
            return null;
        }
        zz1J zz1j = new zz1J(zzyu4, zzyo3);
        zz1K zz1k = new zz1K();
        while (zzyu4.zzQ("style")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                zz1k.zzZ(zz1j.zzZu0());
            } else if (iZzTP == 1) {
                zz1k.zzZ(zz1j.zzZu1());
            } else if (iZzTP == 2) {
                zz1k.zzZ(zz1j.zzZu2());
            } else if (iZzTP != 3) {
                zz39.zzK(zzyu4);
            } else {
                zz1k.zzZ(zz1j.zzZu3());
            }
        }
        return zz1k;
    }

    private void zzZ(zz17 zz17Var) {
        String localName = this.zzZ89.getLocalName();
        while (this.zzZ89.zzQ(localName)) {
            zzBW zzbwZzW = zzBR.zzW(this.zzZ89, this.zzZ88);
            if (zzbwZzW != null) {
                zz17Var.zzZ(zzbwZzW);
            }
        }
    }

    private zz8A zzZu0() {
        zz8A zz8a = new zz8A();
        zz8a.zzIU(this.zzZ89.zzX("idx", 0));
        zzZ(zz8a);
        return zz8a;
    }

    private zz7U zzZu1() {
        zz7U zz7u = new zz7U();
        zz7u.zzIU(this.zzZ89.zzX("idx", 0));
        zzZ(zz7u);
        return zz7u;
    }

    private zz7O zzZu2() {
        zz7O zz7o = new zz7O();
        zz7o.zzI8(zz84.zzOT(this.zzZ89.zzV("idx", "")));
        zzZ(zz7o);
        return zz7o;
    }

    private zz5U zzZu3() {
        zz5U zz5u = new zz5U();
        zz5u.zzIU(this.zzZ89.zzX("idx", 0));
        zzZ(zz5u);
        return zz5u;
    }
}
