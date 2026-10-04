package com.aspose.words;

import com.aspose.words.internal.C22246OooO0oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBG {
    public static byte[] zzX(SignatureLine signatureLine) throws Exception {
        DigitalSignature digitalSignatureZzY7Y = signatureLine.zzY7Y();
        return digitalSignatureZzY7Y.getImageBytes() == null ? digitalSignatureZzY7Y.zzZSx() : zzZ(signatureLine.getSigner(), signatureLine.getSignerTitle(), DigitalSignature.zzRO(digitalSignatureZzY7Y.getSubjectName()), digitalSignatureZzY7Y.getImageBytes(), signatureLine.getParent().getDocument().zzZqx());
    }

    public static byte[] zzY(SignatureLine signatureLine) throws Exception {
        DigitalSignature digitalSignatureZzY7Y = signatureLine.zzY7Y();
        return zzZ(signatureLine.getSigner(), signatureLine.getSignerTitle(), DigitalSignature.zzRO(digitalSignatureZzY7Y.getSubjectName()), digitalSignatureZzY7Y.getImageBytes(), digitalSignatureZzY7Y.zzZSA(), signatureLine.getShowDate(), signatureLine.getParent().getDocument().zzZqx());
    }

    public static byte[] zzZ(SignatureLine signatureLine) throws Exception {
        zzZYQ zzzyqZzZqx = signatureLine.getParent().getDocument().zzZqx();
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ(zzg, zzzyqZzZqx.zzFG(), signatureLine.getSigner(), signatureLine.getSignerTitle());
        return zzZ(zzg, zzzyqZzZqx);
    }

    private static long zzf(float f, float f2) {
        if (f2 < 1.0f) {
            return 0L;
        }
        return com.aspose.words.internal.zzZPW.zzG((33.75f / f2) * f, 33.75f);
    }

    private static byte[] zzZ(String str, String str2, String str3, byte[] bArr, com.aspose.words.internal.zzZQ9 zzzq9, boolean z, com.aspose.words.internal.zzH6 zzh6) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ(zzg, zzh6.zzFG(), str, str2, str3, bArr);
        if (z) {
            zzZ(zzzq9, zzh6.zzFG(), zzg);
        }
        return zzZ(zzg, zzh6);
    }

    private static byte[] zzZ(String str, String str2, String str3, byte[] bArr, com.aspose.words.internal.zzH6 zzh6) throws Exception {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzZ(zzg, zzh6.zzFG(), str, str2, str3, bArr);
        zzZ(zzg, zzh6.zzFG());
        return zzZ(zzg, zzh6);
    }

    private static String zzX(String str, com.aspose.words.internal.zzPM zzpm) {
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(str, new char[]{ControlChar.PARAGRAPH_BREAK_CHAR, '\n'});
        if (iZzZ >= 0) {
            str = com.aspose.words.internal.zzZKN.zzTY(str.substring(0, iZzZ));
        }
        if (zzpm.zz7(str) <= 182.25f) {
            return str;
        }
        float fZz7 = 182.25f - zzpm.zz7("...");
        int iZzZG = com.aspose.words.internal.zzAN.zzZG((str.length() * fZz7) / r0);
        float fZz72 = zzpm.zz7(str.substring(0, iZzZG));
        int iZzZN = com.aspose.words.internal.zzZKQ.zzZN(fZz72 - fZz7);
        if (iZzZN != 0) {
            while (iZzZN == com.aspose.words.internal.zzZKQ.zzZN(fZz72 - fZz7)) {
                iZzZG -= iZzZN;
                fZz72 = zzpm.zz7(str.substring(0, iZzZG));
            }
            if (fZz72 > fZz7) {
                iZzZG--;
            }
        }
        return C22246OooO0oo.OooO00o(new StringBuilder(), str, "...", 0, iZzZG);
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzH3 zzh3, String str, String str2, String str3, byte[] bArr) throws Exception {
        zzZ(zzg, zzh3, str, str2);
        com.aspose.words.internal.zzPM zzpmZzZ = zzZ(zzh3, 8.25f);
        zzg.zzX(new com.aspose.words.internal.zzZU(zzpmZzZ, com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(7.5f, 92.25f), zzX(com.aspose.words.internal.zzZKN.format("Signed by: {0}", str3), zzpmZzZ), 0.0f));
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArr);
        zzg.zzX(new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(30.75f, 18.75f), zzf(zzegZzZT.getWidth(), zzegZzZT.getHeight()), bArr));
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzH3 zzh3, String str, String str2) throws Exception {
        zzg.zzX(new com.aspose.words.internal.zzZU(zzZ(zzh3, 25.0f), com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(6.75f, 51.0f), "X", 0.0f));
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(new com.aspose.words.internal.zzZQ4(0.0f, 56.0f, 192.0f, 1.5f));
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
        zzg.zzX(zzzgZzW);
        com.aspose.words.internal.zzPM zzpmZzZ = zzZ(zzh3, 8.25f);
        zzg.zzX(new com.aspose.words.internal.zzZU(zzpmZzZ, com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(7.5f, 68.25f), zzX(str, zzpmZzZ), 0.0f));
        zzg.zzX(new com.aspose.words.internal.zzZU(zzpmZzZ, com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(7.5f, 80.25f), zzX(str2, zzpmZzZ), 0.0f));
    }

    private static void zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzH3 zzh3) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.InvalidSignature.png", Document.class);
        try {
            byte[] bArrZzZX = com.aspose.words.internal.zzZYQ.zzZX(zzzopZzW);
            if (zzzopZzW != null) {
                zzzopZzW.close();
            }
            zzg.zzX(new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(7.5f, 1.5f), com.aspose.words.internal.zzZPW.zzG(10.5f, 10.5f), bArrZzZX));
            com.aspose.words.internal.zzPM zzpmZzZ = zzZ(zzh3, 8.25f);
            zzg.zzX(new com.aspose.words.internal.zzZU(zzpmZzZ, com.aspose.words.internal.zzPV.zzIs, com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(27.0f, 11.25f), zzX("Invalid signature", zzpmZzZ), 0.0f));
        } finally {
        }
    }

    private static void zzZ(com.aspose.words.internal.zzZQ9 zzzq9, com.aspose.words.internal.zzH3 zzh3, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzPM zzpmZzZ = zzZ(zzh3, 8.25f);
        zzg.zzX(new com.aspose.words.internal.zzZU(zzpmZzZ, com.aspose.words.internal.zzPV.zzKa, com.aspose.words.internal.zzPV.zzHZ, com.aspose.words.internal.zzZPY.zzG(144.0f, 11.25f), zzX(zzzq9.zzkG(), zzpmZzZ), 0.0f));
    }

    private static byte[] zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzH6 zzh6) throws Exception {
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(103);
        imageSaveOptions.setUseGdiEmfRenderer(false);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzYDY.zzZ(zzg, com.aspose.words.internal.zzZPW.zzG(192.75f, 96.75f), zzzor, imageSaveOptions, zzh6.zzFE());
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private static com.aspose.words.internal.zzPM zzZ(com.aspose.words.internal.zzH3 zzh3, float f) throws Exception {
        com.aspose.words.internal.zzPM zzpmZzY = zzh3.zzY("Segoe UI", f, 0);
        return !com.aspose.words.internal.zzZYD.zzi(zzpmZzY.zzPh(), "Segoe UI") ? zzh3.zzY("Arial", f, 0) : zzpmZzY;
    }
}
