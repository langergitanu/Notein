package com.aspose.words.internal;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYHJ implements zzYHG {

    /* JADX INFO: renamed from: dm */
    private static Map f50900dm = new HashMap();

    /* JADX INFO: renamed from: dn */
    private static Map f50901dn = new HashMap();

    /* JADX INFO: renamed from: do */
    private static Map f50902do = new HashMap();

    static {
        Map map = f50900dm;
        zzZDA zzzda = zzZ9K.zzWyV;
        zzZDA zzzda2 = zzZ9K.zzWyW;
        map.put(zzzda, zzzda2);
        Map map2 = f50900dm;
        zzZDA zzzda3 = zzZ9K.zzWz2;
        zzZDA zzzda4 = zzYH9.zzWy6;
        map2.put(zzzda3, zzzda4);
        f50900dm.put(zzZ9K.zzWz4, zzzda4);
        f50900dm.put(zzZ9K.zzWyU, zzzda2);
        Map map3 = f50900dm;
        zzZDA zzzda5 = zzYH9.zzWyo;
        zzZDA zzzda6 = zzYHC.zzWAI;
        map3.put(zzzda5, zzzda6);
        Map map4 = f50900dm;
        zzZDA zzzda7 = zzYH9.zzWyr;
        zzZDA zzzda8 = zzYHC.zzWAL;
        map4.put(zzzda7, zzzda8);
        Map map5 = f50900dm;
        zzZDA zzzda9 = zzYH9.zzWyq;
        zzZDA zzzda10 = zzYHC.zzWAK;
        map5.put(zzzda9, zzzda10);
        Map map6 = f50900dm;
        zzZDA zzzda11 = zzYH9.zzWyp;
        zzZDA zzzda12 = zzYHC.zzWAJ;
        map6.put(zzzda11, zzzda12);
        Map map7 = f50900dm;
        zzZDA zzzda13 = zzYH9.zzWyn;
        zzZDA zzzda14 = zzYHC.zzWAH;
        map7.put(zzzda13, zzzda14);
        Map map8 = f50900dm;
        zzZDA zzzda15 = zzYH9.zzWym;
        zzZDA zzzda16 = zzYHC.zzWAG;
        map8.put(zzzda15, zzzda16);
        Map map9 = f50900dm;
        zzZDA zzzda17 = zzYH9.zzWyz;
        zzZDA zzzda18 = zzYH9.zzWy7;
        map9.put(zzzda17, zzzda18);
        f50900dm.put(zzYH9.zzWz2, zzzda4);
        Map map10 = f50900dm;
        zzZDA zzzda19 = zzYH9.zzWyy;
        zzZDA zzzda20 = zzYH9.zzWy5;
        map10.put(zzzda19, zzzda20);
        f50900dm.put(zzYH9.zzWyx, zzzda2);
        f50900dm.put(zzZ6W.zzWoe, zzzda2);
        f50900dm.put(zzZ6W.zzWoa, zzzda6);
        f50900dm.put(zzZ6W.zzWo9, zzzda8);
        f50900dm.put(zzZ6W.zzWo8, zzzda10);
        f50900dm.put(zzZ6W.zzWo7, zzzda12);
        f50900dm.put(zzZ6W.zzWnC, zzzda2);
        f50900dm.put(zzZAY.zzWGn, zzzda2);
        f50900dm.put(zzZAY.zzWGm, zzzda6);
        f50900dm.put(zzZAY.zzWGl, zzzda8);
        f50900dm.put(zzZAY.zzWGk, zzzda10);
        f50900dm.put(zzZAY.zzWGj, zzzda12);
        Map map11 = f50900dm;
        zzZDA zzzda21 = zzZAY.zzWGi;
        zzZDA zzzda22 = zzZ8R.zzWBF;
        map11.put(zzzda21, zzzda22);
        f50900dm.put(zzZA8.zzWE2, zzzda2);
        f50900dm.put(zzZA8.zzWE1, zzzda6);
        f50900dm.put(zzZA8.zzWE0, zzzda8);
        f50900dm.put(zzZA8.zzWDZ, zzzda10);
        f50900dm.put(zzZA8.zzWDY, zzzda12);
        f50900dm.put(zzYHC.zzWA4, zzzda6);
        f50900dm.put(zzYHC.zzWA3, zzzda8);
        f50900dm.put(zzYHC.zzWA2, zzzda10);
        f50900dm.put(zzYHC.zzWA1, zzzda12);
        Map map12 = f50900dm;
        zzZDA zzzda23 = zzYHC.zzWzS;
        zzZDA zzzda24 = zzYHC.zzWAF;
        map12.put(zzzda23, zzzda24);
        Map map13 = f50900dm;
        zzZDA zzzda25 = zzYHC.zzWzR;
        zzZDA zzzda26 = zzYHC.zzWAE;
        map13.put(zzzda25, zzzda26);
        Map map14 = f50900dm;
        zzZDA zzzda27 = zzYHC.zzWzQ;
        zzZDA zzzda28 = zzYHC.zzWAD;
        map14.put(zzzda27, zzzda28);
        Map map15 = f50900dm;
        zzZDA zzzda29 = zzYHC.zzWzP;
        zzZDA zzzda30 = zzYHC.zzWAC;
        map15.put(zzzda29, zzzda30);
        f50900dm.put(zzYHC.zzWA0, zzzda24);
        f50900dm.put(zzYHC.zzWzZ, zzzda26);
        f50900dm.put(zzYHC.zzWzY, zzzda28);
        f50900dm.put(zzYHC.zzWzX, zzzda30);
        f50900dm.put(zzYHC.zzWzW, zzzda24);
        f50900dm.put(zzYHC.zzWzV, zzzda26);
        f50900dm.put(zzYHC.zzWzU, zzzda28);
        f50900dm.put(zzYHC.zzWzT, zzzda30);
        Map map16 = f50900dm;
        zzZDA zzzda31 = zzZ8R.zzWu1;
        zzZDA zzzda32 = zzZ8R.zzWBE;
        map16.put(zzzda31, zzzda32);
        f50900dm.put(zzZ8R.zzWu2, zzzda22);
        Map map17 = f50900dm;
        zzZDA zzzda33 = zzZ8R.zzWu0;
        zzZDA zzzda34 = zzZ8R.zzWu4;
        map17.put(zzzda33, zzzda34);
        Map map18 = f50900dm;
        zzZDA zzzda35 = zzZAE.zzWEP;
        zzZDA zzzda36 = zzZAE.zzWF1;
        map18.put(zzzda35, zzzda36);
        f50900dm.put(zzZAE.zzWEO, zzzda36);
        f50900dm.put(zzZB9.zzWH8, zzzda30);
        f50900dm.put(zzZB9.zzWH9, zzzda12);
        Map map19 = f50900dm;
        zzZDA zzzda37 = zzYHM.zzWmx;
        zzZDA zzzda38 = zzYHC.zzWAB;
        map19.put(zzzda37, zzzda38);
        Map map20 = f50900dm;
        zzZDA zzzda39 = zzYHM.zzWmw;
        zzZDA zzzda40 = zzYHC.zzWAA;
        map20.put(zzzda39, zzzda40);
        f50900dm.put(zzYHM.zzWmv, zzzda38);
        f50900dm.put(zzYHM.zzWmu, zzzda40);
        f50901dn.put(IDevicePopManager.SHA_1, zzzda2);
        f50901dn.put("SHA-224", zzzda6);
        f50901dn.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, zzzda8);
        f50901dn.put("SHA-384", zzzda10);
        f50901dn.put("SHA-512", zzzda12);
        f50901dn.put("SHA-512-224", zzzda14);
        f50901dn.put("SHA-512-256", zzzda16);
        f50901dn.put("SHA1", zzzda2);
        f50901dn.put("SHA224", zzzda6);
        f50901dn.put("SHA256", zzzda8);
        f50901dn.put("SHA384", zzzda10);
        f50901dn.put("SHA512", zzzda12);
        f50901dn.put("SHA512-224", zzzda14);
        f50901dn.put("SHA512-256", zzzda16);
        f50901dn.put("SHA3-224", zzzda24);
        f50901dn.put("SHA3-256", zzzda26);
        f50901dn.put("SHA3-384", zzzda28);
        f50901dn.put("SHA3-512", zzzda30);
        f50901dn.put("SHAKE128", zzzda38);
        f50901dn.put("SHAKE256", zzzda40);
        f50901dn.put("SHAKE-128", zzzda38);
        f50901dn.put("SHAKE-256", zzzda40);
        f50901dn.put("GOST3411", zzzda36);
        f50901dn.put("MD2", zzzda18);
        f50901dn.put("MD4", zzzda4);
        f50901dn.put("MD5", zzzda20);
        f50901dn.put("RIPEMD128", zzzda32);
        f50901dn.put("RIPEMD160", zzzda22);
        f50901dn.put("RIPEMD256", zzzda34);
        zzZ(zzzda2, true);
        zzZ(zzzda6, false);
        zzZ(zzzda8, false);
        zzZ(zzzda10, false);
        zzZ(zzzda12, false);
        zzZ(zzzda14, false);
        zzZ(zzzda16, false);
        zzZ(zzzda24, false);
        zzZ(zzzda26, false);
        zzZ(zzzda28, false);
        zzZ(zzzda30, false);
        zzZ(zzzda38, false);
        zzZ(zzzda40, false);
        zzZ(zzzda36, true);
        zzZ(zzzda18, true);
        zzZ(zzzda4, true);
        zzZ(zzzda20, true);
        zzZ(zzzda32, true);
        zzZ(zzzda22, true);
        zzZ(zzzda34, true);
    }

    private static void zzZ(zzZDA zzzda, boolean z) {
        f50902do.put(zzzda, z ? new zzZ86(zzzda, zzZC8.zzWHS) : new zzZ86(zzzda));
    }

    @Override // com.aspose.words.internal.zzYHG
    public final zzZ86 zzA(zzZDA zzzda) {
        if (zzzda == null) {
            throw new NullPointerException("digest OID is null");
        }
        zzZ86 zzz86 = (zzZ86) f50902do.get(zzzda);
        return zzz86 == null ? new zzZ86(zzzda) : zzz86;
    }

    @Override // com.aspose.words.internal.zzYHG
    public final zzZ86 zzN(zzZ86 zzz86) {
        zzZDA zzzdaZzXJk = zzz86.zzXJk();
        if (zzzdaZzXJk.equals(zzYHD.zzWDS)) {
            return new zzZ86(zzYHC.f50889dz, new zzZDD(512L));
        }
        return zzA(zzzdaZzXJk.equals(zzYH9.zzWys) ? zzZ8Z.zzXB(zzz86.zzXJj()).zzXJ3().zzXJk() : zzzdaZzXJk.equals(zzYHD.zzWDT) ? zzYHC.zzWAJ : zzzdaZzXJk.equals(zzYH9.zzWmt) ? zzYHC.zzWAL : (zzZDA) f50900dm.get(zzz86.zzXJk()));
    }
}
