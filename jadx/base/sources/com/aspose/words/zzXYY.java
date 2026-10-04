package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYY extends zzXZ1 {
    @Override // com.aspose.words.zzXZ2
    public final com.aspose.words.internal.zzZOR[] zzX(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), false);
        zzp.zzY("Object");
        zzp.zzX("Id", "idPackageObject");
        zzp.zzY("Manifest");
        zzp.zzX("xmlns:opc", "http://schemas.openxmlformats.org/package/2006/digital-signature");
        int iZzT = com.aspose.words.internal.zzS1.zzT(digitalSignature.zzZSz());
        Iterator<zzYJW> it = zzyju.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzp, iZzT);
        }
        zzp.zzo();
        zzp.zzY("SignatureProperties");
        zzp.zzY("SignatureProperty");
        zzp.zzX("Id", "idSignatureTime");
        zzp.zzX("Target", "#idPackageSignature");
        zzp.zzY("SignatureTime");
        zzp.zzX("xmlns", "http://schemas.openxmlformats.org/package/2006/digital-signature");
        zzp.zzZ("Format", "YYYY-MM-DDThh:mm:ssTZD");
        zzp.zzZ("Value", com.aspose.words.internal.zzJB.zzR(digitalSignature.zzZSA()));
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.flush();
        return new com.aspose.words.internal.zzZOR[]{(com.aspose.words.internal.zzZOR) zzp.zzq()};
    }

    @Override // com.aspose.words.zzXZ2
    public final com.aspose.words.internal.zzZOR zzY(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        return zzZ(zzyju, digitalSignature, false);
    }
}
