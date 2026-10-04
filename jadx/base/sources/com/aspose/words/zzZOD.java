package com.aspose.words;

import com.aspose.slides.PatternStyle;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOD {
    private FileFormatInfo zzYWN;
    private com.aspose.words.internal.zzRK zzYzJ;
    private static byte[] zzYzL = {37, 80, 68, 70, PatternStyle.DottedGrid};
    private static byte[][] zzYzK = {new byte[]{10, 37, 37, 69, 79, 70}, new byte[]{10, 37, 37, 69, 79, 70, 10}, new byte[]{10, 37, 37, 69, 79, 70, 13, 10}, new byte[]{13, 37, 37, 69, 79, 70, 13}};
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Application", "Default", "Override", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", "application/vnd.ms-word.document.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml", "application/vnd.ms-word.template.macroEnabledTemplate.main+xml");

    private static int zzLx(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzS(str, "Microsoft Office", i)) {
            return 1;
        }
        if (com.aspose.words.internal.zzZKN.zzS(str, "OpenOffice", i)) {
            return 3;
        }
        return com.aspose.words.internal.zzZKN.zzS(str, "WPS", i) ? 2 : 0;
    }

    private static com.aspose.words.internal.zzZRW zzX(com.aspose.words.internal.zzRK zzrk) throws Exception {
        zzrk.resetState();
        if (zzrk.zzq(com.aspose.words.internal.zzZRW.zzlS())) {
            return new com.aspose.words.internal.zzZRW(zzrk.zzR1());
        }
        return null;
    }

    private static boolean zzZ(com.aspose.words.internal.zzRK zzrk, FileFormatInfo fileFormatInfo) throws Exception {
        if (!zzrk.zzp(zzYzL) || !zzZe(zzrk.zzR1())) {
            return false;
        }
        if (fileFormatInfo == null) {
            return true;
        }
        fileFormatInfo.setLoadFormat(64);
        return true;
    }

    private boolean zzZ9Z() throws Exception {
        boolean zContains = this.zzYzJ.contains("<pkg:package");
        if (zContains) {
            this.zzYzJ.resetState();
            com.aspose.words.internal.zz7A zz7a = new com.aspose.words.internal.zz7A(this.zzYzJ.zzR1());
            com.aspose.words.internal.zz77 zz77VarZzZ = zz7a.zzZ((com.aspose.words.internal.zz77) null, zzZWV.zz0(0, false));
            if (zz77VarZzZ == null) {
                zz77VarZzZ = zz7a.zzZ((com.aspose.words.internal.zz77) null, zzZWV.zz0(0, true));
            }
            int iZzTP = zzUR.zzTP(zz77VarZzZ.getContentType());
            if (iZzTP != 3) {
                if (iZzTP == 4) {
                    this.zzYWN.setLoadFormat(25);
                    return zContains;
                }
                if (iZzTP == 5) {
                    this.zzYWN.setLoadFormat(26);
                    return zContains;
                }
                if (iZzTP != 6) {
                    return false;
                }
                this.zzYWN.setLoadFormat(27);
                return zContains;
            }
            this.zzYWN.setLoadFormat(24);
        }
        return zContains;
    }

    private boolean zzZa0() {
        boolean zContains = this.zzYzJ.contains("<w:wordDocument");
        if (zContains) {
            this.zzYWN.setLoadFormat(31);
        }
        return zContains;
    }

    private FileFormatInfo zzZa1() throws Exception {
        this.zzYzJ.zzR3();
        return zzZ21.zzZ(this.zzYzJ);
    }

    private FileFormatInfo zzZa2() throws Exception {
        this.zzYzJ.zzR3();
        return zzY4Q.zzZ(this.zzYzJ);
    }

    private boolean zzZa3() throws Exception {
        this.zzYzJ.zzR7();
        FileFormatInfo fileFormatInfoZzZ = zzZHK.zzZ(this.zzYzJ);
        if (fileFormatInfoZzZ.getLoadFormat() != 50) {
            return false;
        }
        this.zzYWN = fileFormatInfoZzZ;
        return true;
    }

    private boolean zzZa4() throws Exception {
        return zzZa0() || zzZ9Z() || zzZa3();
    }

    private boolean zzZa5() throws Exception {
        FileFormatInfo fileFormatInfoZzZa2;
        if (zzZa9() || zzZa8() || zzZa7() || zzZ(this.zzYzJ, this.zzYWN)) {
            return true;
        }
        this.zzYzJ.zzR7();
        if (zzZa4() || zzZa6()) {
            return true;
        }
        FileFormatInfo fileFormatInfoZzZa1 = zzZa1();
        if (fileFormatInfoZzZa1 != null) {
            this.zzYWN = fileFormatInfoZzZa1;
            return true;
        }
        if (com.aspose.words.internal.zzEF.zzB(this.zzYzJ.zzR1()) != 0 || (fileFormatInfoZzZa2 = zzZa2()) == null) {
            return false;
        }
        this.zzYWN = fileFormatInfoZzZa2;
        return true;
    }

    private boolean zzZa6() throws Exception {
        FileFormatInfo fileFormatInfoZzZ = zzXYW.zzZ(this.zzYzJ);
        if (fileFormatInfoZzZ != null) {
            this.zzYWN = fileFormatInfoZzZ;
            return true;
        }
        this.zzYzJ.zzR9();
        return false;
    }

    private boolean zzZa7() throws Exception {
        FileFormatInfo fileFormatInfoZzZ = zzZU7.zzZ(this.zzYzJ);
        if (fileFormatInfoZzZ == null) {
            return false;
        }
        this.zzYWN = fileFormatInfoZzZ;
        return true;
    }

    private boolean zzZa8() throws Exception {
        FileFormatInfo fileFormatInfoZzZ = zzVT.zzZ(this.zzYzJ);
        if (fileFormatInfoZzZ == null) {
            return false;
        }
        this.zzYWN = fileFormatInfoZzZ;
        return true;
    }

    private boolean zzZa9() throws Exception {
        FileFormatInfo fileFormatInfoZzZ = zzYYX.zzZ(this.zzYzJ);
        if (fileFormatInfoZzZ == null) {
            return false;
        }
        this.zzYWN = fileFormatInfoZzZ;
        return true;
    }

    private boolean zzZaa() throws Exception {
        int iZzYV = zzYYB.zzYV(this.zzYzJ.zzR1());
        this.zzYzJ.zzR1().zzH(0L);
        if (iZzYV == 1) {
            this.zzYWN.setLoadFormat(52);
            return true;
        }
        if (iZzYV != 2) {
            return false;
        }
        this.zzYWN.setLoadFormat(54);
        return true;
    }

    private boolean zzZab() {
        boolean zZzj = this.zzYzJ.zzj("{\\rtf");
        if (zZzj) {
            this.zzYWN.setLoadFormat(30);
        }
        return zZzj;
    }

    private boolean zzZac() throws Exception {
        com.aspose.words.internal.zzZRW zzzrwZzX;
        try {
            zzzrwZzX = zzX(this.zzYzJ);
        } catch (ZipException e) {
            throw new FileCorruptedException(e);
        } catch (Exception unused) {
            zzzrwZzX = null;
        }
        if (zzzrwZzX == null) {
            return false;
        }
        while (zzzrwZzX.zzm0()) {
            try {
                if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "[Content_Types].xml")) {
                    this.zzYWN.setLoadFormat(zzZWX.zzZr(zzzrwZzX.zzlV()));
                } else if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "_rels/.rels")) {
                    this.zzYWN.zzVM(zzZWX.zzZq(zzzrwZzX.zzlV()));
                } else if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "mimetype")) {
                    this.zzYWN.setLoadFormat(zzYQ7.zzZr(zzzrwZzX.zzlV()));
                } else if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "META-INF/manifest.xml")) {
                    com.aspose.words.internal.zzZOR zzzorZzlV = zzzrwZzX.zzlV();
                    boolean zZzYT = zzYQ7.zzYT(zzzorZzlV);
                    this.zzYWN.zzVN(zZzYT);
                    if (!zZzYT) {
                        this.zzYWN.setLoadFormat(zzYQ7.zzYS(zzzorZzlV));
                    }
                } else if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "META-INF/documentsignatures.xml")) {
                    this.zzYWN.zzVM(zzYQ7.zzZq(zzzrwZzX.zzlV()));
                } else if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "word/settings.xml")) {
                    if (zzZd(zzzrwZzX.zzlV())) {
                        this.zzYWN.zzCa(2);
                    }
                } else if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "docProps/app.xml") && this.zzYWN.zzZ9T() == 0) {
                    this.zzYWN.zzCa(zzLx(zzZc(zzzrwZzX.zzlV())));
                }
            } catch (Throwable th) {
                zzzrwZzX.dispose();
                throw th;
            }
        }
        zzzrwZzX.dispose();
        return this.zzYWN.getLoadFormat() != 255;
    }

    private com.aspose.words.internal.zzKD zzZad() throws Exception {
        this.zzYzJ.resetState();
        if (this.zzYzJ.zzq(com.aspose.words.internal.zzKD.zzIe())) {
            return new com.aspose.words.internal.zzKD(this.zzYzJ.zzR1());
        }
        return null;
    }

    private boolean zzZae() throws Exception {
        FileFormatInfo fileFormatInfo;
        int i;
        com.aspose.words.internal.zzKD zzkdZzZad = zzZad();
        if (zzkdZzZad == null) {
            return false;
        }
        if (zzkdZzZad.zzZR("\u0006DataSpaces") || (zzkdZzZad.zzZR("EncryptedPackage") && zzkdZzZad.zzZR("EncryptionInfo"))) {
            this.zzYWN.setLoadFormat(20);
            this.zzYWN.zzVN(true);
        } else if (zzkdZzZad.zzZR("WordDocument")) {
            zzZRA zzzra = new zzZRA(new com.aspose.words.internal.zzZOX(zzkdZzZad.zzZS("WordDocument")), null, 0);
            if (!zzzra.isValid()) {
                FileFormatInfo fileFormatInfoZzY = new zzZOD().zzY((com.aspose.words.internal.zzZOR) zzkdZzZad.zzIf().get("WordDocument"), null);
                if (fileFormatInfoZzY.getLoadFormat() != 255) {
                    FileFormatInfo fileFormatInfo2 = this.zzYWN;
                    fileFormatInfo2.zzYzI = true;
                    fileFormatInfo2.setLoadFormat(fileFormatInfoZzY.getLoadFormat());
                    this.zzYWN.zzZ(fileFormatInfoZzY.zzZ9Y());
                    return true;
                }
            }
            if (zzzra.zzZgY()) {
                fileFormatInfo = this.zzYWN;
                i = 12;
            } else {
                fileFormatInfo = this.zzYWN;
                i = zzzra.zzYHx ? 11 : 10;
            }
            fileFormatInfo.setLoadFormat(i);
            this.zzYWN.zzVN(zzzra.zzYHs);
            boolean zZzZR = zzkdZzZad.zzZR("_xmlsignatures");
            boolean zZzZR2 = zzkdZzZad.zzZR("_signatures");
            this.zzYWN.zzVM(zZzZR || zZzZR2);
            if (zZzZR) {
                this.zzYWN.zzCb(2);
            } else if (zZzZR2) {
                this.zzYWN.zzCb(1);
            } else {
                this.zzYWN.zzCb(0);
            }
            this.zzYWN.zzCa(1);
        }
        if (zzkdZzZad.zzZR("WpsCustomData")) {
            this.zzYWN.zzCa(2);
        }
        boolean z = this.zzYWN.getLoadFormat() != 255;
        FileFormatInfo fileFormatInfo3 = this.zzYWN;
        if (!z) {
            zzkdZzZad = null;
        }
        fileFormatInfo3.zzY(zzkdZzZad);
        return this.zzYWN.getLoadFormat() != 255;
    }

    private static String zzZc(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop.getLength() <= 0) {
            return "";
        }
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        while (zzo.zzQ("Properties")) {
            if (zzUR.zzTP(zzo.getLocalName()) == 0) {
                return zzo.readString();
            }
            zzo.zzk();
        }
        return "";
    }

    private static boolean zzZd(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        if ("settings".equals(zzo.getLocalName())) {
            return "http://www.wps.cn/officeDocument/2013/wpsCustomData".equals(zzo.zzV("wpsCustomData", ""));
        }
        return false;
    }

    private static boolean zzZe(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        for (byte[] bArr : zzYzK) {
            if (com.aspose.words.internal.zzZYQ.zzY(zzzop, bArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean zzZf(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzRK zzrk = new com.aspose.words.internal.zzRK(zzzop);
        try {
            return zzY(zzrk);
        } finally {
            zzrk.zzR9();
        }
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzYzJ.zzQZ();
    }

    public final FileFormatInfo zzY(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        this.zzYzJ = new com.aspose.words.internal.zzRK(zzzop, zzzo0);
        this.zzYWN = new FileFormatInfo();
        try {
            if (!zzZae() && !zzZac() && !zzZab() && !zzZaa()) {
                zzZa5();
            }
            this.zzYzJ.zzR9();
            return this.zzYWN;
        } catch (Throwable th) {
            this.zzYzJ.zzR9();
            throw th;
        }
    }

    private static boolean zzY(com.aspose.words.internal.zzRK zzrk) throws Exception {
        com.aspose.words.internal.zzZRW zzzrwZzX = zzX(zzrk);
        if (zzzrwZzX == null) {
            return false;
        }
        while (zzzrwZzX.zzm0()) {
            try {
                if (com.aspose.words.internal.zzZYD.zzi(zzzrwZzX.zzlZ(), "[Content_Types].xml")) {
                    com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzrwZzX.zzlV());
                    while (zzo.zzQ("Types")) {
                        int iZzTP = zzUR.zzTP(zzo.getLocalName());
                        if (iZzTP != 1 && iZzTP != 2) {
                            zzo.zzk();
                        } else if ("application/vnd.ms-package.xps-fixeddocument+xml".equals(zzo.zzV("ContentType", ""))) {
                            zzzrwZzX.dispose();
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                zzzrwZzX.dispose();
                throw th;
            }
        }
        zzzrwZzX.dispose();
        return false;
    }
}
