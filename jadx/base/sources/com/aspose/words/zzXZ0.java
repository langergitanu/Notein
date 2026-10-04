package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ0 extends zzXZ2 {
    private com.aspose.words.internal.zzZOZ zzWSi = com.aspose.words.internal.zzZZS.zzY(new Object[0]);
    private com.aspose.words.internal.zzZOZ zzWSj = com.aspose.words.internal.zzZZS.zzY(new Object[0]);

    private static String zzXQK() {
        return com.aspose.words.internal.zzR1.zzQO().zzY("yyyy-MM-ddTHH:mm:ss,ff", com.aspose.words.internal.zzZP1.zzpZ());
    }

    private String zzXQL() {
        return com.aspose.words.internal.zzZKN.format("ID_{0}", this.zzWSj);
    }

    @Override // com.aspose.words.zzXZ2
    public final com.aspose.words.internal.zzZOR[] zzX(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), new com.aspose.words.internal.zzZNI(false), false);
        zzp.zzY("SignatureProperty");
        zzp.zzX("Id", zzXQL());
        zzp.zzX("Target", com.aspose.words.internal.zzZKN.format("#{0}", zzXQM()));
        zzp.zzY("dc:date");
        zzp.zzX("xmlns:dc", "http://purl.org/dc/elements/1.1/");
        zzp.writeString(zzXQK());
        zzp.zzo();
        zzp.zzo();
        zzp.flush();
        return new com.aspose.words.internal.zzZOR[]{(com.aspose.words.internal.zzZOR) zzp.zzq()};
    }

    @Override // com.aspose.words.zzXZ2
    public final String zzXQM() {
        return com.aspose.words.internal.zzZKN.format("ID_{0}", this.zzWSi);
    }

    @Override // com.aspose.words.zzXZ2
    public final com.aspose.words.internal.zzZOR zzY(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        return zzZ(zzyju, digitalSignature, true);
    }

    @Override // com.aspose.words.zzXZ2
    public final void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR[] zzzorArr, zzYJU zzyju, byte b) throws Exception {
        zzXG zzxg = new zzXG();
        Iterator<zzYJW> it = zzyju.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                com.aspose.words.internal.zzZOR zzzor = zzzorArr[0];
                zzxg.zzT8("http://www.w3.org/2000/09/xmldsig#");
                zzZ(zzp, zzXZ2.zzZ(zzxg.zzZB(zzzor), b), com.aspose.words.internal.zzZKN.format("#{0}", zzXQL()), false, b);
                return;
            }
            zzYJW next = it.next();
            com.aspose.words.internal.zzZOR zzzorZzZ = next.zzYm6().zzZ(next);
            boolean zZzX = com.aspose.words.internal.zzZKN.zzX(".xml", com.aspose.words.internal.zzZOQ.zzVe(next.getName()), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
            if (zZzX) {
                zzzorZzZ = zzxg.zzZB(zzzorZzZ);
            }
            String strZzZ = zzXZ2.zzZ(zzzorZzZ, b);
            if (zZzX && zzzorZzZ.getLength() != 0) {
                z = true;
            }
            zzZ(zzp, strZzZ, next.getName(), z, b);
        }
    }

    @Override // com.aspose.words.zzXZ2
    public final void zzZ(com.aspose.words.internal.zzP zzp, DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzWZ zzwzZzZSz = digitalSignature.zzZSz();
        zzp.zzY("KeyInfo");
        zzp.zzY("X509Data");
        zzp.zzY("X509IssuerSerial");
        zzp.zzZ("X509IssuerName", digitalSignature.zzZSz().zzVi().zzip());
        zzp.zzZ("X509SerialNumber", com.aspose.words.internal.zzS1.zzX(zzwzZzZSz));
        zzp.zzp();
        zzp.zzZ("X509Certificate", com.aspose.words.internal.zzZQB.zzYT(com.aspose.words.internal.zzS1.zzW(zzwzZzZSz)));
        zzp.zzo();
        zzp.zzo();
    }

    @Override // com.aspose.words.zzXZ2
    public final void zzZ(com.aspose.words.internal.zzP zzp, com.aspose.words.internal.zzZOR[] zzzorArr) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = zzzorArr[0];
        zzp.zzY("Object");
        zzp.zzY("SignatureProperties");
        zzzor.zzH(0L);
        zzp.zzZ((com.aspose.words.internal.zzZOP) zzzor, false);
        zzp.zzo();
        zzp.zzo();
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, String str, String str2, boolean z, byte b) {
        zzp.zzY("Reference");
        zzp.zzX("URI", str2);
        if (z) {
            zzXZ2.zzW(zzp);
        }
        zzp.zzY("DigestMethod");
        zzp.zzX("Algorithm", DigitalSignatureUtil.zzs(b));
        zzp.zzp();
        zzp.zzZ("DigestValue", str);
        zzp.zzo();
    }
}
