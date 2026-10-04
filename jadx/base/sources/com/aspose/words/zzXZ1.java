package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzXZ1 extends zzXZ2 {
    private static String zzB(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzor);
        zzo.getLocalName();
        while (zzo.zzQ("Object")) {
            if ("SignedProperties".equals(zzo.getLocalName())) {
                return zzo.zzf();
            }
        }
        return null;
    }

    private static String zzC(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzor);
        zzo.getLocalName();
        String strZzV = zzo.zzV("Id", null);
        if (strZzV != null) {
            return strZzV;
        }
        while (zzo.zzQ("Object")) {
            String strZzV2 = zzo.zzV("Id", null);
            if (strZzV2 != null) {
                return strZzV2;
            }
        }
        return null;
    }

    private static void zzX(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzWZ zzwz) {
        com.aspose.words.internal.zzZZ8 zzzz8ZzZ = com.aspose.words.internal.zzS1.zzZ(zzwz);
        zzp.zzY("RSAKeyValue");
        zzp.zzZ("Modulus", com.aspose.words.internal.zzZQB.zzYT(zzzz8ZzZ.getModulus().toByteArray()));
        zzp.zzZ("Exponent", com.aspose.words.internal.zzZQB.zzYT(zzzz8ZzZ.getExponent().toByteArray()));
        zzp.zzp();
    }

    private static void zzY(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzWZ zzwz) {
        com.aspose.words.internal.zzOE zzoeZzY = com.aspose.words.internal.zzS1.zzY(zzwz);
        zzp.zzY("DSAKeyValue");
        zzp.zzZ("P", com.aspose.words.internal.zzZQB.zzYT(zzoeZzY.zzN9()));
        zzp.zzZ("Q", com.aspose.words.internal.zzZQB.zzYT(zzoeZzY.zzN8()));
        zzp.zzZ("G", com.aspose.words.internal.zzZQB.zzYT(zzoeZzY.zzN7()));
        zzp.zzZ("Y", com.aspose.words.internal.zzZQB.zzYT(zzoeZzY.zzN6()));
        zzp.zzp();
    }

    @Override // com.aspose.words.zzXZ2
    public final String zzXQM() {
        return "idPackageSignature";
    }

    @Override // com.aspose.words.zzXZ2
    public final void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR[] zzzorArr) throws Exception {
        for (com.aspose.words.internal.zzZOR zzzor : zzzorArr) {
            zzzor.zzH(0L);
            zzp.zzZ((com.aspose.words.internal.zzZOP) zzzor, false);
        }
    }

    @Override // com.aspose.words.zzXZ2
    public final void zzZ(com.aspose.words.internal.zzP zzp, DigitalSignature digitalSignature) throws Exception {
        zzp.zzY("KeyInfo");
        zzZ(zzp, digitalSignature.zzZSz());
        zzp.zzY("X509Data");
        zzp.zzZ("X509Certificate", com.aspose.words.internal.zzZQB.zzYT(com.aspose.words.internal.zzS1.zzW(digitalSignature.zzZSz())));
        zzp.zzp();
        zzp.zzo();
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzWZ zzwz) {
        byte bZzV = com.aspose.words.internal.zzS1.zzV(zzwz);
        if (bZzV == 2) {
            return;
        }
        zzp.zzY("KeyValue");
        if (bZzV == 1) {
            zzY(zzp, zzwz);
        } else {
            zzX(zzp, zzwz);
        }
        zzp.zzo();
    }

    @Override // com.aspose.words.zzXZ2
    public final void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR[] zzzorArr, zzYJU zzyju, byte b) throws Exception {
        for (com.aspose.words.internal.zzZOR zzzor : zzzorArr) {
            zzZ(zzp, zzzor, b);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR zzzor, byte b) throws Exception {
        String str = com.aspose.words.internal.zzZKN.format("#{0}", zzC(zzzor));
        String strZzB = zzB(zzzor);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzB)) {
            zzzor = new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZO0.zzhV().getBytes(strZzB));
        }
        zzXG zzxg = new zzXG();
        zzxg.zzT8("http://www.w3.org/2000/09/xmldsig#");
        zzZ(zzp, zzXZ2.zzZ(zzxg.zzZB(zzzor), b), str, DigitalSignatureUtil.zzs(b));
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, String str, String str2, String str3) {
        zzp.zzY("Reference");
        boolean zEquals = "#idSignedProperties".equals(str2);
        zzp.zzX("Type", zEquals ? "http://uri.etsi.org/01903#SignedProperties" : "http://www.w3.org/2000/09/xmldsig#Object");
        zzp.zzX("URI", str2);
        if (zEquals) {
            zzXZ2.zzW(zzp);
        }
        zzp.zzY("DigestMethod");
        zzp.zzX("Algorithm", str3);
        zzp.zzp();
        zzp.zzZ("DigestValue", str);
        zzp.zzo();
    }
}
