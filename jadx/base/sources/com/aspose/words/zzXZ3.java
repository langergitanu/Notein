package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ3 {
    private IWarningCallback zzZG0;
    private static String[] zzWSk = {"yyyy-MM-ddTHH:mm:ss,FF", "yyyy-MM-ddTHH:mm:ssZ", "yyyy-MM-ddTHH:mm:sszzz", "yyyy-MM-ddTHH:mm:ss.fzzz", "yyyy-MM-ddTHH:mm:ss.fffzzz"};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(RequestParameters.SIGNATURE, "SignatureMethod", "Reference", "X509Certificate", "SignatureValue", "Object", "SignatureProperty", "SigningTime", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", "http://www.w3.org/2001/04/xmlenc#sha512", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", "http://www.w3.org/2001/04/xmlenc#sha256", "http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256", "http://www.w3.org/2000/09/xmldsig#dsa-sha1", "http://www.w3.org/2000/09/xmldsig#rsa-sha1", "http://www.w3.org/2000/09/xmldsig#sha1", "SignatureTime", "SignatureInfoV1", "date", "Value", "SignatureComments", "SetupID", "SignatureText", "SignatureType", "SignatureImage", "SignatureProviderId");

    private zzXZ3(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    private static String zzK(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        String strSubstring = str.substring(1);
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        String localName = zzo.getLocalName();
        while (zzo.zzQ(localName)) {
            String strZzV = zzo.zzV("Id", "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzV) && com.aspose.words.internal.zzZKN.equals(strZzV, strSubstring)) {
                return zzo.zzf();
            }
        }
        return null;
    }

    private void zzL(com.aspose.words.internal.zzO zzo) {
        zzLz(com.aspose.words.internal.zzZKN.format("Import of element '{0}' is not supported by Aspose.Words.", zzo.getLocalName()));
        zzo.zzk();
    }

    private void zzLz(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 16777216, 0, str);
        }
    }

    private static void zzX(com.aspose.words.internal.zzO zzo, DigitalSignature digitalSignature) {
        while (zzo.zzQ("SignatureInfoV1")) {
            switch (zzUR.zzTP(zzo.getLocalName())) {
                case 20:
                    digitalSignature.setComments(zzo.readString());
                    break;
                case 21:
                    String string = zzo.readString();
                    digitalSignature.zzQ(com.aspose.words.internal.zzZYD.zzXk(string) ? new com.aspose.words.internal.zzZOZ(string) : com.aspose.words.internal.zzZOZ.zzZXP);
                    break;
                case 22:
                    digitalSignature.setText(zzo.readString());
                    break;
                case 23:
                    digitalSignature.setVisible("2".equals(zzo.readString()));
                    break;
                case 24:
                    String string2 = zzo.readString();
                    digitalSignature.setImageBytes(com.aspose.words.internal.zzZYD.zzXk(string2) ? com.aspose.words.internal.zzZQB.zzVT(string2) : null);
                    break;
                case 25:
                    String string3 = zzo.readString();
                    digitalSignature.zzP(com.aspose.words.internal.zzZYD.zzXk(string3) ? new com.aspose.words.internal.zzZOZ(string3) : com.aspose.words.internal.zzZOZ.zzZXP);
                    break;
                default:
                    zzo.zzk();
                    break;
            }
        }
    }

    private void zzY(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzWZ zzwz, zzZ9K zzz9k, DigitalSignatureCollection digitalSignatureCollection) throws Exception {
        if (zzzop == null) {
            return;
        }
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        if (RequestParameters.SIGNATURE.equals(zzo.getLocalName())) {
            digitalSignatureCollection.zzZ(zzZ(zzzop, zzwz, zzz9k));
            return;
        }
        boolean zZzQ = zzo.zzQ("document-signatures");
        while (zZzQ && !zzo.zzP("document-signatures")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 0) {
                zzo.zzk();
            } else {
                digitalSignatureCollection.zzZ(zzZ(new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzhV().getBytes(zzo.zzf())), zzwz, zzz9k));
            }
        }
    }

    private static String zzYG(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        zzo.zzQ(RequestParameters.SIGNATURE);
        if ("SignedInfo".equals(zzo.getLocalName())) {
            return zzo.zzf();
        }
        return null;
    }

    public static void zzZ(com.aspose.words.internal.zzZOP zzzop, zzZ9K zzz9k, DigitalSignatureCollection digitalSignatureCollection, IWarningCallback iWarningCallback) throws Exception {
        new zzXZ3(iWarningCallback).zzY(zzzop, null, zzz9k, digitalSignatureCollection);
    }

    private static com.aspose.words.internal.zzZQ9 zzyk(String str) {
        return com.aspose.words.internal.zzZQ9.zzZ(str, zzWSk, com.aspose.words.internal.zzZP1.zzj8());
    }

    private int zzyl(String str) {
        switch (zzUR.zzTP(str)) {
            case 8:
            case 9:
                return 5;
            case 10:
            case 11:
            case 12:
                return 3;
            case 13:
            case 14:
            case 15:
                return 1;
            default:
                zzLz(com.aspose.words.internal.zzZKN.format("Unsupported AlgorithmId value '{0}'.", str));
                return 0;
        }
    }

    private static byte[] zzym(String str) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzhV().getBytes(str));
        zzXG zzxg = new zzXG();
        zzxg.zzT8("http://www.w3.org/2000/09/xmldsig#");
        return zzxg.zzZB(zzzor).zzWy();
    }

    public static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzWZ zzwz, zzZ9K zzz9k, DigitalSignatureCollection digitalSignatureCollection) throws Exception {
        new zzXZ3(null).zzY(zzzop, zzwz, zzz9k, digitalSignatureCollection);
    }

    private DigitalSignature zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzWZ zzwz, zzZ9K zzz9k) throws Exception {
        boolean zZzZ;
        DigitalSignature digitalSignature = new DigitalSignature(2);
        zzYJU zzyju = new zzYJU(zzz9k);
        String strZzYG = zzYG(zzzop);
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        byte[] bArrZzVT = null;
        String strZzV = "";
        while (zzo.zzQ(RequestParameters.SIGNATURE)) {
            switch (zzUR.zzTP(zzo.getLocalName())) {
                case 1:
                    strZzV = zzo.zzV("Algorithm", "");
                    break;
                case 2:
                    zzyju.zzY(new zzYJW(zzo));
                    break;
                case 3:
                    bArrZzVT = com.aspose.words.internal.zzZQB.zzVT(zzo.readString());
                    break;
                case 4:
                    digitalSignature.zzYw(com.aspose.words.internal.zzZQB.zzVT(zzo.readString()));
                    break;
                case 5:
                    String strZzV2 = zzo.zzV("Id", "");
                    if ("idValidSigLnImg".equals(strZzV2)) {
                        digitalSignature.zzYv(com.aspose.words.internal.zzZQB.zzVT(zzo.readString()));
                    } else if ("idInvalidSigLnImg".equals(strZzV2)) {
                        digitalSignature.zzYu(com.aspose.words.internal.zzZQB.zzVT(zzo.readString()));
                    }
                    break;
                case 6:
                    zzZ(zzo, digitalSignature);
                    break;
                case 7:
                    digitalSignature.zzq(zzyk(zzo.readString()));
                    break;
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzYG)) {
            if (zzwz == null) {
                zzwz = com.aspose.words.internal.zzS1.zzE(bArrZzVT);
            }
            digitalSignature.zzS(zzwz);
            boolean zZzZ2 = zzZ(strZzYG, strZzV, zzwz, digitalSignature.getSignatureValue());
            for (zzYJW zzyjw : zzyju) {
                if (zzyjw.isExternal()) {
                    zZzZ = zzZ(zzyjw, zzz9k);
                } else {
                    zZzZ = zzZ(zzyjw, zzzop);
                }
                zZzZ2 &= zZzZ;
            }
            digitalSignature.zzY9(zZzZ2);
            if (!digitalSignature.isValid()) {
                zzLz("Digital signature is invalid, document content was tampered.");
            }
        }
        return digitalSignature;
    }

    private void zzY(com.aspose.words.internal.zzO zzo, DigitalSignature digitalSignature) {
        while (zzo.zzQ("SignatureTime")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 19) {
                zzL(zzo);
            } else {
                digitalSignature.zzq(zzyk(zzo.readString()));
            }
        }
    }

    private boolean zzZ(String str, String str2, com.aspose.words.internal.zzWZ zzwz, byte[] bArr) throws Exception {
        byte[] bArrZzym = zzym(str);
        int iZzyl = zzyl(str2);
        if (iZzyl == 0) {
            return false;
        }
        return com.aspose.words.internal.zzS1.zzZ(zzwz, iZzyl, bArrZzym, bArr);
    }

    private boolean zzZ(byte[] bArr, String str, byte[] bArr2) {
        int iZzyl = zzyl(str);
        if (iZzyl == 0) {
            return false;
        }
        return com.aspose.words.internal.zzZ1.zzZ(bArr2, com.aspose.words.internal.zzIL.zzZ(com.aspose.words.internal.zzS1.zzYu(iZzyl), bArr), bArr2.length);
    }

    private boolean zzZ(zzYJW zzyjw, zzZ9K zzz9k) throws Exception {
        zzyjw.zzRw(zzZ(zzyjw.zzYm7().zzU(zzz9k.zzZ(zzyjw)).zzWy(), zzyjw.zzYm8(), com.aspose.words.internal.zzZQB.zzVT(zzyjw.zzYm9())));
        return zzyjw.isValid();
    }

    private boolean zzZ(zzYJW zzyjw, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        String strZzK = zzK(zzzop, zzyjw.getUri());
        zzyjw.zzRw(com.aspose.words.internal.zzZYD.zzXk(strZzK) && zzZ(zzym(strZzK), zzyjw.zzYm8(), com.aspose.words.internal.zzZQB.zzVT(zzyjw.zzYm9())));
        return zzyjw.isValid();
    }

    private void zzZ(com.aspose.words.internal.zzO zzo, DigitalSignature digitalSignature) {
        while (zzo.zzQ("SignatureProperty")) {
            switch (zzUR.zzTP(zzo.getLocalName())) {
                case 16:
                    zzY(zzo, digitalSignature);
                    break;
                case 17:
                    zzX(zzo, digitalSignature);
                    break;
                case 18:
                    digitalSignature.zzq(zzyk(zzo.readString()));
                    break;
                default:
                    zzL(zzo);
                    break;
            }
        }
    }
}
