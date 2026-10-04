package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYH5 {

    /* JADX INFO: renamed from: dX */
    private static final Map f50856dX;

    /* JADX INFO: renamed from: dY */
    private static final Map f50857dY;

    /* JADX INFO: renamed from: dZ */
    private static final Map f50858dZ;

    /* JADX INFO: renamed from: dy */
    static final zzZDA f50859dy;

    /* JADX INFO: renamed from: dz */
    static final zzZDA f50860dz;

    /* JADX INFO: renamed from: ea */
    private static final Map f50861ea;

    /* JADX INFO: renamed from: eb */
    private static zzYHH f50862eb;
    private static final Map zzVUx;

    /* JADX INFO: renamed from: ec */
    private zzYM6 f50863ec;

    static {
        zzZDA zzzda = zzZ9O.zzWAM;
        f50859dy = zzzda.zzwP("17");
        f50860dz = zzzda.zzwP("18");
        HashMap map = new HashMap();
        zzVUx = map;
        HashMap map2 = new HashMap();
        f50856dX = map2;
        HashMap map3 = new HashMap();
        f50857dY = map3;
        HashMap map4 = new HashMap();
        f50858dZ = map4;
        HashMap map5 = new HashMap();
        f50861ea = map5;
        f50862eb = new zzYHH();
        map.put(zzZ9K.zzWyW, "SHA1");
        map.put(zzZ9O.zzWAI, "SHA224");
        map.put(zzZ9O.zzWAL, "SHA256");
        map.put(zzZ9O.zzWAK, "SHA384");
        map.put(zzZ9O.zzWAJ, "SHA512");
        map.put(zzZ8R.zzWBE, "RIPEMD128");
        map.put(zzZ8R.zzWBF, "RIPEMD160");
        map.put(zzZ8R.zzWu4, "RIPEMD256");
        map2.put(zzZ96.zzWyA, "RSA/ECB/PKCS1Padding");
        map2.put(zzZAE.zzWEQ, "ECGOST3410");
        zzZDA zzzda2 = zzZ96.zzWwu;
        map3.put(zzzda2, "DESEDEWrap");
        map3.put(zzZ96.zzWwt, "RC2Wrap");
        zzZDA zzzda3 = zzZ9O.zzWAq;
        map3.put(zzzda3, "AESWrap");
        zzZDA zzzda4 = zzZ9O.zzWAi;
        map3.put(zzzda4, "AESWrap");
        zzZDA zzzda5 = zzZ9O.zzWAa;
        map3.put(zzzda5, "AESWrap");
        zzZDA zzzda6 = zzZ9M.zzWz8;
        map3.put(zzzda6, "CamelliaWrap");
        zzZDA zzzda7 = zzZ9M.zzWz7;
        map3.put(zzzda7, "CamelliaWrap");
        zzZDA zzzda8 = zzZ9M.zzWz6;
        map3.put(zzzda8, "CamelliaWrap");
        zzZDA zzzda9 = zzZ9X.zzWBw;
        map3.put(zzzda9, "SEEDWrap");
        zzZDA zzzda10 = zzZ96.zzWya;
        map3.put(zzzda10, "DESede");
        map5.put(zzzda2, 192);
        map5.put(zzzda3, 128);
        map5.put(zzzda4, 192);
        map5.put(zzzda5, 256);
        map5.put(zzzda6, 128);
        map5.put(zzzda7, 192);
        map5.put(zzzda8, 256);
        map5.put(zzzda9, 128);
        map5.put(zzzda10, 192);
        map4.put(zzZ9O.zzWAv, AES256KeyLoader.AES_ALGORITHM);
        map4.put(zzZ9O.zzWAt, AES256KeyLoader.AES_ALGORITHM);
        map4.put(zzZ9O.zzWAl, AES256KeyLoader.AES_ALGORITHM);
        map4.put(zzZ9O.zzWAd, AES256KeyLoader.AES_ALGORITHM);
        map4.put(zzzda10, "DESede");
        map4.put(zzZ96.zzWy9, "RC2");
    }

    public zzYH5(zzYM6 zzym6) {
        this.f50863ec = zzym6;
    }

    private boolean zzW(zzZD4 zzzd4) throws GeneralSecurityException {
        if (zzzd4 != null && zzzd4.size() != 0) {
            zzZ8Z zzz8zZzXB = zzZ8Z.zzXB(zzzd4);
            if (!zzz8zZzXB.zzXJ2().zzXJk().equals(zzZ96.zzWyu) || !zzz8zZzXB.zzXJ3().equals(zzZ86.zzXm(zzz8zZzXB.zzXJ2().zzXJj()))) {
                return true;
            }
            if (zzz8zZzXB.zzXIV().intValue() != zzL(zzz8zZzXB.zzXJ3()).getDigestLength()) {
                return true;
            }
        }
        return false;
    }

    public final Signature zzK(zzZ86 zzz86) throws GeneralSecurityException {
        Signature signatureZzwg;
        String strZzO = f50862eb.zzO(zzz86);
        try {
            signatureZzwg = this.f50863ec.zzwg(strZzO);
        } catch (NoSuchAlgorithmException e) {
            if (!strZzO.endsWith("WITHRSAANDMGF1")) {
                throw e;
            }
            signatureZzwg = this.f50863ec.zzwg(strZzO.substring(0, strZzO.indexOf(87)) + "WITHRSASSA-PSS");
        }
        if (zzz86.zzXJk().equals(zzZ96.zzWys)) {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzz86.zzXJj());
            if (zzW(zzzd4ZzYy)) {
                try {
                    AlgorithmParameters algorithmParametersZzwi = this.f50863ec.zzwi("PSS");
                    algorithmParametersZzwi.init(zzzd4ZzYy.getEncoded());
                    signatureZzwg.setParameter(algorithmParametersZzwi.getParameterSpec(PSSParameterSpec.class));
                } catch (IOException e2) {
                    throw new GeneralSecurityException(C21111o0ooOoO.OooO00o(e2, new StringBuilder("unable to process PSS parameters: ")));
                }
            }
        }
        return signatureZzwg;
    }

    public final MessageDigest zzL(zzZ86 zzz86) throws GeneralSecurityException {
        try {
            if (zzz86.zzXJk().equals(f50860dz)) {
                return this.f50863ec.zzwh("SHAKE256-" + zzZDD.zzYB(zzz86.zzXJj()).zzXKZ());
            }
            if (!zzz86.zzXJk().equals(f50859dy)) {
                return this.f50863ec.zzwh(zzYM5.zzC(zzz86.zzXJk()));
            }
            return this.f50863ec.zzwh("SHAKE128-" + zzZDD.zzYB(zzz86.zzXJj()).zzXKZ());
        } catch (NoSuchAlgorithmException e) {
            Map map = zzVUx;
            if (map.get(zzz86.zzXJk()) == null) {
                throw e;
            }
            return this.f50863ec.zzwh((String) map.get(zzz86.zzXJk()));
        }
    }
}
