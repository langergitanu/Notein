package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYHH implements zzYHN {
    private static final Map zzVUx;
    private static final Map zzWmB;

    static {
        HashMap map = new HashMap();
        zzVUx = map;
        HashMap map2 = new HashMap();
        zzWmB = map2;
        map.put(zzZ96.zzWys, "RSASSA-PSS");
        map.put(zzYHD.zzWDT, "ED25519");
        map.put(zzYHD.zzWDS, "ED448");
        map.put(new zzZDA("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        map.put(zzZ96.zzWyo, "SHA224WITHRSA");
        map.put(zzZ96.zzWyr, "SHA256WITHRSA");
        map.put(zzZ96.zzWyq, "SHA384WITHRSA");
        map.put(zzZ96.zzWyp, "SHA512WITHRSA");
        map.put(zzYHM.zzWmx, "SHAKE128WITHRSAPSS");
        map.put(zzYHM.zzWmw, "SHAKE256WITHRSAPSS");
        map.put(zzZAE.zzWEP, "GOST3411WITHGOST3410");
        map.put(zzZAE.zzWEO, "GOST3411WITHECGOST3410");
        map.put(zzZAY.zzWGn, "SHA1WITHPLAIN-ECDSA");
        map.put(zzZAY.zzWGm, "SHA224WITHPLAIN-ECDSA");
        map.put(zzZAY.zzWGl, "SHA256WITHPLAIN-ECDSA");
        map.put(zzZAY.zzWGk, "SHA384WITHPLAIN-ECDSA");
        map.put(zzZAY.zzWGj, "SHA512WITHPLAIN-ECDSA");
        map.put(zzZAY.zzWGi, "RIPEMD160WITHPLAIN-ECDSA");
        map.put(zzZA8.zzWE2, "SHA1WITHCVC-ECDSA");
        map.put(zzZA8.zzWE1, "SHA224WITHCVC-ECDSA");
        map.put(zzZA8.zzWE0, "SHA256WITHCVC-ECDSA");
        map.put(zzZA8.zzWDZ, "SHA384WITHCVC-ECDSA");
        map.put(zzZA8.zzWDY, "SHA512WITHCVC-ECDSA");
        map.put(zzZ8R.zzWu1, "RIPEMD128WITHRSA");
        map.put(zzZ8R.zzWu2, "RIPEMD160WITHRSA");
        map.put(zzZ8R.zzWu0, "RIPEMD256WITHRSA");
        map.put(new zzZDA("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        map.put(new zzZDA("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        map.put(new zzZDA("1.2.840.10040.4.3"), "SHA1WITHDSA");
        map.put(zzZ6W.zzWoe, "SHA1WITHECDSA");
        map.put(zzZ6W.zzWoa, "SHA224WITHECDSA");
        map.put(zzZ6W.zzWo9, "SHA256WITHECDSA");
        map.put(zzZ6W.zzWo8, "SHA384WITHECDSA");
        map.put(zzZ6W.zzWo7, "SHA512WITHECDSA");
        map.put(zzYHM.zzWmv, "SHAKE128WITHECDSA");
        map.put(zzYHM.zzWmu, "SHAKE256WITHECDSA");
        map.put(zzZ9K.zzWyU, "SHA1WITHRSA");
        map.put(zzZ9K.zzWyV, "SHA1WITHDSA");
        map.put(zzYHC.zzWA4, "SHA224WITHDSA");
        map.put(zzYHC.zzWA3, "SHA256WITHDSA");
        map2.put(zzZ9K.zzWyW, "SHA1");
        map2.put(zzYHC.zzWAI, "SHA224");
        map2.put(zzYHC.zzWAL, "SHA256");
        map2.put(zzYHC.zzWAK, "SHA384");
        map2.put(zzYHC.zzWAJ, "SHA512");
        map2.put(zzYHC.zzWAF, "SHA3-224");
        map2.put(zzYHC.zzWAE, "SHA3-256");
        map2.put(zzYHC.zzWAD, "SHA3-384");
        map2.put(zzYHC.zzWAC, "SHA3-512");
        map2.put(zzZ8R.zzWBE, "RIPEMD128");
        map2.put(zzZ8R.zzWBF, "RIPEMD160");
        map2.put(zzZ8R.zzWu4, "RIPEMD256");
    }

    private static String zzC(zzZDA zzzda) {
        String str = (String) zzWmB.get(zzzda);
        return str != null ? str : zzzda.getId();
    }

    @Override // com.aspose.words.internal.zzYHN
    public final String zzO(zzZ86 zzz86) {
        zzZDK zzzdkZzXJj = zzz86.zzXJj();
        if (zzzdkZzXJj == null || zzZC8.zzWHS.equals(zzzdkZzXJj) || !zzz86.zzXJk().equals(zzZ96.zzWys)) {
            Map map = zzVUx;
            return map.containsKey(zzz86.zzXJk()) ? (String) map.get(zzz86.zzXJk()) : zzz86.zzXJk().getId();
        }
        zzZ8Z zzz8zZzXB = zzZ8Z.zzXB(zzzdkZzXJj);
        zzZ86 zzz86ZzXJ2 = zzz8zZzXB.zzXJ2();
        if (!zzz86ZzXJ2.zzXJk().equals(zzZ96.zzWyu)) {
            return zzC(zzz8zZzXB.zzXJ3().zzXJk()) + "WITHRSAAND" + zzz86ZzXJ2.zzXJk().getId();
        }
        zzZ86 zzz86ZzXJ3 = zzz8zZzXB.zzXJ3();
        zzZDA zzzdaZzXJk = zzZ86.zzXm(zzz86ZzXJ2.zzXJj()).zzXJk();
        if (zzzdaZzXJk.equals(zzz86ZzXJ3.zzXJk())) {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzC(zzz86ZzXJ3.zzXJk()), "WITHRSAANDMGF1");
        }
        return zzC(zzz86ZzXJ3.zzXJk()) + "WITHRSAANDMGF1USING" + zzC(zzzdaZzXJk);
    }
}
