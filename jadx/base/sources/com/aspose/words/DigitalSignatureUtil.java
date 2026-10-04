package com.aspose.words;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class DigitalSignatureUtil {
    private DigitalSignatureUtil() {
    }

    public static DigitalSignatureCollection loadSignatures(String str) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzX = com.aspose.words.internal.zzZOU.zzX(str, 3, 1);
        try {
            return zzZy(zzzosZzX);
        } finally {
            zzzosZzX.close();
        }
    }

    public static void removeAllSignatures(String str, String str2) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzX = com.aspose.words.internal.zzZOU.zzX(str, 3, 1);
        try {
            zzzosZzX = com.aspose.words.internal.zzZOU.zzX(str2, 4, 2);
            zzU(zzzosZzX, zzzosZzX);
            zzzosZzX.close();
        } catch (Throwable th) {
            throw th;
        } finally {
            zzzosZzX.close();
        }
    }

    public static void sign(InputStream inputStream, OutputStream outputStream, CertificateHolder certificateHolder, SignOptions signOptions) throws Exception {
        zzZ(com.aspose.words.internal.zzZOP.zzY(inputStream), com.aspose.words.internal.zzZOP.zzY(outputStream), certificateHolder, signOptions);
    }

    public static String zzLJ(int i) {
        if (i == 1) {
            return "http://www.w3.org/2000/09/xmldsig#sha1";
        }
        if (i == 3) {
            return "http://www.w3.org/2001/04/xmlenc#sha256";
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected digest algorithm: {0}.", Integer.valueOf(i)));
    }

    private static void zzU(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        int loadFormat = new zzZOD().zzY(zzzop, null).getLoadFormat();
        if (loadFormat == 10 || loadFormat == 11) {
            com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzzop);
            zzkd.zzIf().remove("_xmlsignatures");
            zzkd.zzIf().remove("_signatures");
            zzzop2.zzH(0L);
            zzkd.zzL(zzzop2);
            zzzop2.setLength(zzzop2.getPosition());
            return;
        }
        if (loadFormat == 60 || loadFormat == 61) {
            zzYQP zzyqp = new zzYQP(zzzop);
            zzYQO zzyqoZzEn = zzyqp.zzEn("/META-INF/documentsignatures.xml");
            if (zzyqoZzEn != null) {
                zzyqp.zzYvp().remove(zzyqoZzEn.getName());
            }
            zzzop2.zzH(0L);
            zzyqp.zzZ(zzzop2, "application/vnd.oasis.opendocument.text", null);
            zzzop2.setLength(zzzop2.getPosition());
            return;
        }
        switch (loadFormat) {
            case 20:
            case 21:
            case 22:
                com.aspose.words.internal.zz79 zz79Var = new com.aspose.words.internal.zz79(zzzop);
                com.aspose.words.internal.zz77 zz77VarZzZ = zz79Var.zzZ((com.aspose.words.internal.zz77) null, "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
                if (zz77VarZzZ != null) {
                    Iterator<com.aspose.words.internal.zz75> it = zz77VarZzZ.zzxn().iterator();
                    while (it.hasNext()) {
                        zz79Var.zzxo().remove(zz77VarZzZ.zzZ(it.next()));
                    }
                    zz79Var.zzxo().remove(zz77VarZzZ.getName());
                    zz79Var.zzxn().remove(zz79Var.zzxn().zzY6("http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin").getId());
                    zz79Var.zzxr();
                }
                zzzop2.zzH(0L);
                zz79Var.zzL(zzzop2);
                zzzop2.setLength(zzzop2.getPosition());
                return;
            default:
                throw new IllegalStateException("Signing feature is not supported by this file format.");
        }
    }

    private static void zzY(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, CertificateHolder certificateHolder, SignOptions signOptions) throws Exception {
        DigitalSignature digitalSignature = new DigitalSignature(certificateHolder);
        if (signOptions != null) {
            signOptions.zzX(digitalSignature);
        }
        if (zzZOD.zzZf(zzzop)) {
            zzZ(zzzop, zzzop2, digitalSignature, true);
            return;
        }
        FileFormatInfo fileFormatInfoZzY = new zzZOD().zzY(zzzop, null);
        int loadFormat = fileFormatInfoZzY.getLoadFormat();
        if (loadFormat == 10 || loadFormat == 11) {
            com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzzop);
            zzYBE.zzZ(zzkd, digitalSignature, fileFormatInfoZzY.zzZ9X() != 1 ? 2 : 1);
            zzzop2.setLength(0L);
            zzkd.zzL(zzzop2);
            return;
        }
        if (loadFormat == 60 || loadFormat == 61) {
            zzZ(zzzop, zzzop2, digitalSignature);
            return;
        }
        switch (loadFormat) {
            case 20:
            case 21:
            case 22:
                if (fileFormatInfoZzY.isEncrypted()) {
                    zzZ(fileFormatInfoZzY.zzZ9V(), zzzop2, digitalSignature, signOptions != null ? signOptions.getDecryptionPassword() : null);
                    return;
                } else {
                    zzZ(zzzop, zzzop2, digitalSignature, false);
                    return;
                }
            default:
                throw new IllegalStateException("Signing feature is not supported by this file format.");
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, CertificateHolder certificateHolder, SignOptions signOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop, "srcStream");
        com.aspose.words.internal.zzZ4.zzY((Object) zzzop2, "dstStream");
        com.aspose.words.internal.zzZ4.zzY((Object) certificateHolder, "certHolder");
        zzY(zzzop, zzzop2, certificateHolder, signOptions);
        zzzop2.flush();
    }

    private static DigitalSignatureCollection zzZx(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzzop.zzH(0L);
        com.aspose.words.internal.zz79 zz79Var = new com.aspose.words.internal.zz79(zzzop);
        DigitalSignatureCollection digitalSignatureCollection = new DigitalSignatureCollection();
        com.aspose.words.internal.zz77 zz77VarZzZ = zz79Var.zzZ((com.aspose.words.internal.zz77) null, "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
        if (zz77VarZzZ != null) {
            Iterator<com.aspose.words.internal.zz75> it = zz77VarZzZ.zzxn().iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zz77 zz77VarZzYd = zz79Var.zzYd(zz77VarZzZ.zzZ(it.next()));
                zzXZ3.zzZ(zz77VarZzYd.zzR1(), com.aspose.words.internal.zzS1.zzE(zz79Var.zzZ(zz77VarZzYd, "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/certificate").zzxk().zzWy()), new zzYNZ(zz79Var), digitalSignatureCollection);
            }
        }
        return digitalSignatureCollection;
    }

    private static DigitalSignatureCollection zzZy(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzZOD.zzZf(zzzop)) {
            return zzZx(zzzop);
        }
        int loadFormat = new zzZOD().zzY(zzzop, null).getLoadFormat();
        if (loadFormat != 10 && loadFormat != 11 && loadFormat != 60) {
            switch (loadFormat) {
                case 20:
                case 21:
                case 22:
                    break;
                default:
                    throw new IllegalStateException("Signing feature is not supported by this file format.");
            }
        }
        return new Document(zzzop, null, false).getDigitalSignatures();
    }

    public static String zzs(byte b) {
        return zzLJ(b == 2 ? 3 : 1);
    }

    public static void sign(String str, String str2, CertificateHolder certificateHolder, SignOptions signOptions) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "srcFileName");
        com.aspose.words.internal.zzZ4.zzU(str2, "dstFileName");
        com.aspose.words.internal.zzZOS zzzosZzX = com.aspose.words.internal.zzZOU.zzX(str, 3, 1);
        try {
            zzzosZzX = com.aspose.words.internal.zzZOU.zzX(str2, 4, 2);
            zzZ(zzzosZzX, zzzosZzX, certificateHolder, signOptions);
            zzzosZzX.close();
        } catch (Throwable th) {
            throw th;
        } finally {
            zzzosZzX.close();
        }
    }

    public static DigitalSignatureCollection loadSignatures(InputStream inputStream) throws Exception {
        return zzZy(com.aspose.words.internal.zzZOP.zzY(inputStream));
    }

    public static com.aspose.words.internal.zzZOR zzZ(com.aspose.words.internal.zzKD zzkd, String str) throws Exception {
        zzKH zzkh = new zzKH(zzkd);
        if (zzkh.zzZTz()) {
            return zzkh.zzRV(str);
        }
        throw new UnsupportedFileFormatException("Unknown file format.");
    }

    public static void removeAllSignatures(InputStream inputStream, OutputStream outputStream) throws Exception {
        zzU(com.aspose.words.internal.zzZOP.zzY(inputStream), com.aspose.words.internal.zzZOP.zzY(outputStream));
    }

    private static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, DigitalSignature digitalSignature, boolean z) throws Exception {
        com.aspose.words.internal.zz79 zz79Var = new com.aspose.words.internal.zz79(zzzop);
        (z ? new zzYNW(zz79Var) : new zzYNX(zz79Var)).zzY(digitalSignature);
        zzzop2.setLength(0L);
        zz79Var.zzL(zzzop2);
    }

    public static void sign(InputStream inputStream, OutputStream outputStream, CertificateHolder certificateHolder) throws Exception {
        zzZ(com.aspose.words.internal.zzZOP.zzY(inputStream), com.aspose.words.internal.zzZOP.zzY(outputStream), certificateHolder, (SignOptions) null);
    }

    public static void sign(String str, String str2, CertificateHolder certificateHolder) throws Exception {
        sign(str, str2, certificateHolder, (SignOptions) null);
    }

    private static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, DigitalSignature digitalSignature) throws Exception {
        zzYQP zzyqp = new zzYQP(zzzop);
        new zzYQM(zzyqp).zzY(digitalSignature);
        zzzop2.setLength(0L);
        zzyqp.zzZ(zzzop2, "application/vnd.oasis.opendocument.text", null);
    }

    private static void zzZ(com.aspose.words.internal.zzKD zzkd, com.aspose.words.internal.zzZOP zzzop, DigitalSignature digitalSignature, String str) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzZ = zzZ(zzkd, str);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzZ((com.aspose.words.internal.zzZOP) zzzorZzZ, (com.aspose.words.internal.zzZOP) zzzor, digitalSignature, false);
        zzKH.zzV(zzzor, str).zzL(zzzop);
    }
}
