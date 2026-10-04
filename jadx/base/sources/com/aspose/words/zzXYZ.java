package com.aspose.words;

import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYZ extends zzXZ1 {
    private static com.aspose.words.internal.zzZOR zzV(DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), new com.aspose.words.internal.zzZNI(false), false);
        zzp.zzY("Object");
        zzp.zzY("xd:QualifyingProperties");
        zzp.zzX("xmlns:xd", "http://uri.etsi.org/01903/v1.3.2#");
        zzp.zzX("Target", "#idPackageSignature");
        zzp.zzY("xd:SignedProperties");
        zzp.zzX("Id", "idSignedProperties");
        zzp.zzY("xd:SignedSignatureProperties");
        zzp.zzZ("xd:SigningTime", com.aspose.words.internal.zzJB.zzR(digitalSignature.zzZSA()));
        zzp.zzY("xd:SigningCertificate");
        zzp.zzY("xd:Cert");
        zzp.zzY("xd:CertDigest");
        zzp.zzY("DigestMethod");
        zzp.zzX("Algorithm", "http://www.w3.org/2001/04/xmlenc#sha256");
        zzp.zzo();
        zzp.zzZ("DigestValue", com.aspose.words.internal.zzZQB.zzYT(com.aspose.words.internal.zzIL.zzZ(com.aspose.words.internal.zzS1.zzYu(com.aspose.words.internal.zzS1.zzT(digitalSignature.zzZSz())), com.aspose.words.internal.zzS1.zzW(digitalSignature.zzZSz()))));
        zzp.zzo();
        zzp.zzY("xd:IssuerSerial");
        zzp.zzZ("X509IssuerName", digitalSignature.zzZSz().zzVi().zzip());
        zzp.zzZ("X509SerialNumber", com.aspose.words.internal.zzS1.zzX(digitalSignature.zzZSz()));
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.zzY("xd:SignaturePolicyIdentifier");
        zzp.zzZ("xd:SignaturePolicyImplied ", (String) null);
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.flush();
        return (com.aspose.words.internal.zzZOR) zzp.zzq();
    }

    private static com.aspose.words.internal.zzZOR zzW(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), new com.aspose.words.internal.zzZNI(false), false);
        zzp.zzY("Object");
        zzp.zzX("Id", "idPackageObject");
        zzp.zzX("xmlns:mdssi", zzZX5.zz9(12, false));
        zzp.zzY("Manifest");
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
        zzp.zzY("mdssi:SignatureTime");
        zzp.zzZ("mdssi:Format", "YYYY-MM-DDThh:mm:ssTZD");
        zzp.zzZ("mdssi:Value", com.aspose.words.internal.zzJB.zzR(digitalSignature.zzZSA()));
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.flush();
        return (com.aspose.words.internal.zzZOR) zzp.zzq();
    }

    @Override // com.aspose.words.zzXZ2
    public final com.aspose.words.internal.zzZOR[] zzX(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        byte bZzU = com.aspose.words.internal.zzS1.zzU(digitalSignature.zzZSz());
        com.aspose.words.internal.zzZOR[] zzzorArr = new com.aspose.words.internal.zzZOR[bZzU == 2 ? 3 : 2];
        zzzorArr[0] = zzW(zzyju, digitalSignature);
        zzzorArr[1] = zzW(digitalSignature);
        if (bZzU == 2) {
            zzzorArr[2] = zzV(digitalSignature);
        }
        return zzzorArr;
    }

    @Override // com.aspose.words.zzXZ2
    public final com.aspose.words.internal.zzZOR zzY(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        return zzZ(zzyju, digitalSignature, true);
    }

    private static com.aspose.words.internal.zzZOR zzW(DigitalSignature digitalSignature) throws Exception {
        String upperCase;
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(new com.aspose.words.internal.zzZOR(), new com.aspose.words.internal.zzZNI(false), false);
        zzp.zzY("Object");
        zzp.zzX("Id", "idOfficeObject");
        zzp.zzY("SignatureProperties");
        zzp.zzY("SignatureProperty");
        zzp.zzX("Id", "idOfficeV1Details");
        zzp.zzX("Target", "#idPackageSignature");
        zzp.zzY("SignatureInfoV1");
        zzp.zzX("xmlns", zzZX5.zz9(13, false));
        com.aspose.words.internal.zzZOZ zzzozZzZSw = digitalSignature.zzZSw();
        com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        boolean zEquals = zzzozZzZSw.equals(zzzoz);
        if (!zEquals) {
            zzp.zzZ("SetupID", digitalSignature.zzZSw().toString("B").toUpperCase());
        } else {
            zzp.zzZ("SetupID", (String) null);
        }
        zzp.zzZ("SignatureText", (String) null);
        if (!zEquals && com.aspose.words.internal.zzZ1.zzX(digitalSignature.getImageBytes())) {
            zzp.zzZ("SignatureImage", com.aspose.words.internal.zzZQB.zzYT(digitalSignature.getImageBytes()));
        } else {
            zzp.zzZ("SignatureImage", (String) null);
        }
        zzp.zzZ("SignatureComments", digitalSignature.getComments());
        zzp.zzZ("WindowsVersion", "6.1");
        zzp.zzZ("OfficeVersion", "12.0");
        zzp.zzZ("ApplicationVersion", "12.0");
        zzp.zzZ("Monitors", "1");
        zzp.zzZ("HorizontalResolution", "1920");
        zzp.zzZ("VerticalResolution", PublicApiId.PCA_GET_DEVICE_MODE);
        zzp.zzZ("ColorDepth", "32");
        if (!digitalSignature.zzZSv().equals(zzzoz)) {
            upperCase = digitalSignature.zzZSv().toString("B").toUpperCase();
        } else {
            upperCase = "{00000000-0000-0000-0000-000000000000}";
        }
        zzp.zzZ("SignatureProviderId", upperCase);
        zzp.zzZ("SignatureProviderUrl", (String) null);
        zzp.zzZ("SignatureProviderDetails", "9");
        zzp.zzZ("ManifestHashAlgorithm", "http://www.w3.org/2000/09/xmldsig#sha1");
        zzp.zzZ("SignatureType", zEquals ? "1" : "2");
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.zzo();
        zzp.flush();
        return (com.aspose.words.internal.zzZOR) zzp.zzq();
    }
}
