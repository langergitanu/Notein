package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("docEvents", "mcds", "eventDocNew", "eventDocOpen", "eventDocClose", "eventDocSync", "eventDocXmlAfterInsert", "eventDocXmlBeforeDelete", "eventDocContentControlAfterInsert", "eventDocContentControlBeforeDelete", "eventDocContentControlOnExit", "eventDocContentControlOnEnter", "eventDocStoreUpdate", "eventDocContentControlContentUpdate", "eventDocBuildingBlockAfterInsert", "mcd", "macroName", "name", "menuHelp", "bEncrypt", "cmg");

    private static com.aspose.words.internal.zz77 zzW(zzZXU zzzxu) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxu.zzZ(zzzxu.zzZme(), zzzxu.zzZmp().zzZkz());
        if (zz77VarZzZ == null) {
            return null;
        }
        zzzxu.getDocument().zzZ(new com.aspose.words.internal.zzKD(zz77VarZzZ.zzR1()).zzIf(), (byte[]) null);
        return zz77VarZzZ;
    }

    private static void zzX(com.aspose.words.internal.zzO zzo, Document document) {
        while (zzo.zzi()) {
            if (zzUR.zzTP(zzo.getLocalName()) == 17 && document.getVbaProject() != null) {
                document.getVbaProject().zzA0(zzo.getValue());
            }
        }
    }

    private static void zzY(zzZXU zzzxu, com.aspose.words.internal.zz77 zz77Var) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxu.zzZ(zz77Var, zzzxu.zzZmp().zzZkv());
        if (zz77VarZzZ == null) {
            return;
        }
        zzYU4 zzyu4 = new zzYU4(zz77VarZzZ.zzR1());
        while (zzyu4.zzQ("vbaSuppData")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                zzZ(zzyu4, zzzxu.getDocument());
            } else if (iZzTP != 1) {
                zzyu4.zzk();
            } else {
                zzY(zzyu4, zzzxu.getDocument());
            }
        }
    }

    public static void zzZ(zzZXU zzzxu) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzW = zzW(zzzxu);
        if (zz77VarZzW == null) {
            return;
        }
        if (zzzxu.getDocument().getVbaProject() != null) {
            zzzxu.getDocument().getVbaProject().zzXI(zzZ(zzzxu, zz77VarZzW));
        }
        zzY(zzzxu, zz77VarZzW);
    }

    private static byte[] zzZ(zzZXU zzzxu, com.aspose.words.internal.zz77 zz77Var) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzzxu.zzZ(zz77Var, zzzxu.zzZmp().zzZku());
        if (zz77VarZzZ == null) {
            return null;
        }
        int length = (int) zz77VarZzZ.zzR1().getLength();
        byte[] bArr = new byte[length + 8];
        com.aspose.words.internal.zzZ1.zzZ(length, bArr, 0);
        com.aspose.words.internal.zzZ1.zzZ(8, bArr, 4);
        zz77VarZzZ.zzR1().read(bArr, 8, length);
        return bArr;
    }

    private static void zzY(com.aspose.words.internal.zzO zzo, Document document) {
        while (zzo.zzQ("mcds")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 15) {
                zzo.zzk();
            } else {
                zzX(zzo, document);
            }
        }
    }

    private static void zzZ(com.aspose.words.internal.zzO zzo, Document document) {
        int i = 0;
        while (zzo.zzQ("docEvents")) {
            switch (zzUR.zzTP(zzo.getLocalName())) {
                case 2:
                    i |= 1;
                    break;
                case 3:
                    i |= 2;
                    break;
                case 4:
                    i |= 4;
                    break;
                case 5:
                    i |= 8;
                    break;
                case 6:
                    i |= 16;
                    break;
                case 7:
                    i |= 32;
                    break;
                case 8:
                    i |= 256;
                    break;
                case 9:
                    i |= 512;
                    break;
                case 10:
                    i |= 1024;
                    break;
                case 11:
                    i |= 2048;
                    break;
                case 12:
                    i |= 4096;
                    break;
                case 13:
                    i |= 8192;
                    break;
                case 14:
                    i |= 16384;
                    break;
                default:
                    zzo.zzk();
                    break;
            }
        }
        document.zzG2(i);
    }
}
