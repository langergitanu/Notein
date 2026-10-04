package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzXZ2 {
    public static void zzW(com.aspose.words.internal.zzP zzp) {
        zzp.zzY("Transforms");
        new zzXG().zzX(zzp);
        zzp.zzo();
    }

    private static String zzi(byte b) {
        if (b == 0) {
            return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
        }
        if (b == 1) {
            return "http://www.w3.org/2000/09/xmldsig#dsa-sha1";
        }
        if (b == 2) {
            return "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256";
        }
        throw new IllegalStateException("Unexpected CryptoAlgorithm value.");
    }

    public abstract com.aspose.words.internal.zzZOR[] zzX(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception;

    public abstract String zzXQM();

    public abstract com.aspose.words.internal.zzZOR zzY(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception;

    public final com.aspose.words.internal.zzZOR zzZ(zzYJU zzyju, DigitalSignature digitalSignature, boolean z) throws Exception {
        com.aspose.words.internal.zzZOR[] zzzorArrZzX = zzX(zzyju, digitalSignature);
        com.aspose.words.internal.zzZOR zzzorZzZ = zzZ(zzzorArrZzX, zzyju, com.aspose.words.internal.zzS1.zzU(digitalSignature.zzZSz()));
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), new com.aspose.words.internal.zzZNI(false), false);
        zzp.zzZ(RequestParameters.SIGNATURE);
        zzp.zzX("xmlns", "http://www.w3.org/2000/09/xmldsig#");
        zzp.zzX("Id", zzXQM());
        zzZ(zzp, zzzorZzZ);
        zzZ(zzp, zzzorZzZ, digitalSignature);
        if (z) {
            zzZ(zzp, digitalSignature);
        }
        zzZ(zzp, zzzorArrZzX);
        zzp.zzm();
        zzp.flush();
        return (com.aspose.words.internal.zzZOR) zzp.zzq();
    }

    public abstract void zzZ(com.aspose.words.internal.zzP zzp, DigitalSignature digitalSignature) throws Exception;

    public abstract void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR[] zzzorArr) throws Exception;

    public abstract void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR[] zzzorArr, zzYJU zzyju, byte b) throws Exception;

    public static String zzZ(com.aspose.words.internal.zzZOR zzzor, byte b) throws Exception {
        return com.aspose.words.internal.zzZQB.zzYT(com.aspose.words.internal.zzIL.zzZ(com.aspose.words.internal.zzS1.zzYu(b == 2 ? 3 : 1), zzzor.zzWy()));
    }

    private com.aspose.words.internal.zzZOR zzZ(com.aspose.words.internal.zzZOR[] zzzorArr, zzYJU zzyju, byte b) throws Exception {
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), new com.aspose.words.internal.zzZNI(false), false);
        zzp.zzY("SignedInfo");
        zzp.zzY("CanonicalizationMethod");
        zzp.zzX("Algorithm", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        zzp.zzp();
        zzp.zzY("SignatureMethod");
        zzp.zzX("Algorithm", zzi(b));
        zzp.zzp();
        zzZ(zzp, zzzorArr, zzyju, b);
        zzp.zzo();
        zzp.flush();
        return (com.aspose.words.internal.zzZOR) zzp.zzq();
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        zzzor.zzH(0L);
        zzp.zzZ((com.aspose.words.internal.zzZOP) zzzor, false);
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR zzzor, DigitalSignature digitalSignature) throws Exception {
        zzp.zzY("SignatureValue");
        zzp.zzX(zzZ(zzzor, digitalSignature));
        zzp.zzp();
    }

    private static String zzZ(com.aspose.words.internal.zzZOR zzzor, DigitalSignature digitalSignature) throws Exception {
        int iZzT = com.aspose.words.internal.zzS1.zzT(digitalSignature.zzZSz());
        zzXG zzxg = new zzXG();
        zzxg.zzT8("http://www.w3.org/2000/09/xmldsig#");
        return com.aspose.words.internal.zzZQB.zzYT(com.aspose.words.internal.zzS1.zzZ(digitalSignature.zzZSz(), zzxg.zzZB(zzzor).zzWy(), iZzT));
    }
}
