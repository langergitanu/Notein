package com.aspose.words;

import com.aspose.slides.PatternStyle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzKH {
    private ArrayList<zzKI> zzZjQ;
    private com.aspose.words.internal.zzAA zzZjR;
    private com.aspose.words.internal.zzKD zzZjS;
    private static byte[] zzZjP = {60, 0, 0, 0, 77, 0, 105, 0, 99, 0, 114, 0, 111, 0, 115, 0, 111, 0, 102, 0, 116, 0, PatternStyle.Divot, 0, 67, 0, 111, 0, 110, 0, 116, 0, 97, 0, 105, 0, 110, 0, 101, 0, 114, 0, PatternStyle.Divot, 0, 68, 0, 97, 0, 116, 0, 97, 0, 83, 0, 112, 0, 97, 0, 99, 0, 101, 0, 115, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
    private static byte[] zzZjO = {8, 0, 0, 0, 1, 0, 0, 0, 104, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0, 69, 0, 110, 0, 99, 0, 114, 0, 121, 0, 112, 0, 116, 0, 101, 0, 100, 0, 80, 0, 97, 0, 99, 0, 107, 0, 97, 0, 103, 0, 101, 0, PatternStyle.Vertical, 0, 0, 0, 83, 0, 116, 0, 114, 0, 111, 0, 110, 0, 103, 0, 69, 0, 110, 0, 99, 0, 114, 0, 121, 0, 112, 0, 116, 0, 105, 0, 111, 0, 110, 0, 68, 0, 97, 0, 116, 0, 97, 0, 83, 0, 112, 0, 97, 0, 99, 0, 101, 0, 0, 0};
    private static byte[] zzZjN = {8, 0, 0, 0, 1, 0, 0, 0, PatternStyle.Vertical, 0, 0, 0, 83, 0, 116, 0, 114, 0, 111, 0, 110, 0, 103, 0, 69, 0, 110, 0, 99, 0, 114, 0, 121, 0, 112, 0, 116, 0, 105, 0, 111, 0, 110, 0, 84, 0, 114, 0, 97, 0, 110, 0, 115, 0, 102, 0, 111, 0, 114, 0, 109, 0, 0, 0};
    private static byte[] zzZjM = {88, 0, 0, 0, 1, 0, 0, 0, 76, 0, 0, 0, 123, 0, 70, 0, 70, 0, 57, 0, 65, 0, PatternStyle.Cross, 0, 70, 0, PatternStyle.Wave, 0, PatternStyle.Cross, 0, PatternStyle.DottedGrid, 0, PatternStyle.UpwardDiagonal, 0, PatternStyle.DiagonalCross, 0, 69, 0, 70, 0, PatternStyle.DottedGrid, 0, PatternStyle.DownwardDiagonal, 0, PatternStyle.DiagonalCross, 0, PatternStyle.Horizontal, 0, PatternStyle.Cross, 0, PatternStyle.DottedGrid, 0, 66, 0, 68, 0, 68, 0, PatternStyle.UpwardDiagonal, 0, PatternStyle.DottedGrid, 0, PatternStyle.UpwardDiagonal, 0, 65, 0, PatternStyle.DownwardDiagonal, 0, PatternStyle.Horizontal, 0, 67, 0, PatternStyle.Horizontal, 0, 68, 0, PatternStyle.Wave, 0, 55, 0, PatternStyle.Vertical, 0, PatternStyle.DownwardDiagonal, 0, PatternStyle.DiagonalCross, 0, 125, 0, 78, 0, 0, 0, 77, 0, 105, 0, 99, 0, 114, 0, 111, 0, 115, 0, 111, 0, 102, 0, 116, 0, PatternStyle.Divot, 0, 67, 0, 111, 0, 110, 0, 116, 0, 97, 0, 105, 0, 110, 0, 101, 0, 114, 0, PatternStyle.Divot, 0, 69, 0, 110, 0, 99, 0, 114, 0, 121, 0, 112, 0, 116, 0, 105, 0, 111, 0, 110, 0, 84, 0, 114, 0, 97, 0, 110, 0, 115, 0, 102, 0, 111, 0, 114, 0, 109, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0};

    public zzKH(com.aspose.words.internal.zzKD zzkd) throws Exception {
        this.zzZjS = zzkd;
        com.aspose.words.internal.zzAA zzaaZzYr = zzkd.zzIf().zzYr("\u0006DataSpaces");
        this.zzZjR = zzaaZzYr;
        if (zzaaZzYr != null) {
            zzZTx();
            zzZTw();
        }
    }

    private static zzKI zzI(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzKI zzki = new zzKI();
        zzzox.zzXc();
        int iZzXc = zzzox.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            zzzox.zzXc();
            zzki.zzZjT.add(zzJ(zzzox));
        }
        zzki.zzZjU = zzJ(zzzox);
        return zzki;
    }

    private static String zzJ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        byte[] bArrZzn = zzzox.zzn(zzzox.zzXc());
        com.aspose.words.internal.zzZYQ.zzV(zzzox.zzq(), 4);
        return com.aspose.words.internal.zzZO0.zzhU().zzZn(bArrZzn);
    }

    private static void zzK(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzzox.zzXc() != 1) {
            throw new IllegalStateException("Unexpected reader version.");
        }
        if (zzzox.zzXc() != 1) {
            throw new IllegalStateException("Unexpected updated version.");
        }
        if (zzzox.zzXc() != 1) {
            throw new IllegalStateException("Unexpected writer version.");
        }
    }

    private String[] zzRU(String str) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(this.zzZjR.zzYq("DataSpaceInfo").zzYs(str));
        if (zzzox.zzXc() != 8) {
            throw new IllegalStateException("Unexpected header length.");
        }
        int iZzXc = zzzox.zzXc();
        String[] strArr = new String[iZzXc];
        for (int i = 0; i < iZzXc; i++) {
            strArr[i] = zzJ(zzzox);
        }
        return strArr;
    }

    public static com.aspose.words.internal.zzKD zzV(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOZ("00000000-0000-0000-0000-000000000000"));
        zzZ(zzkd);
        zzZVA zzzva = new zzZVA();
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        zzzva.zzY(zzzor, zzzop, zzzor2, str);
        zzkd.zzIf().zzZ("EncryptionInfo", zzzor);
        zzkd.zzIf().zzZ("EncryptedPackage", zzzor2);
        return zzkd;
    }

    private static void zzZ(com.aspose.words.internal.zzKD zzkd) throws Exception {
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA();
        zzaa.zzZ("StrongEncryptionDataSpace", new com.aspose.words.internal.zzZOR(zzZjN));
        com.aspose.words.internal.zzAA zzaa2 = new com.aspose.words.internal.zzAA();
        zzaa2.zzZ("\u0006Primary", new com.aspose.words.internal.zzZOR(zzZjM));
        com.aspose.words.internal.zzAA zzaa3 = new com.aspose.words.internal.zzAA();
        zzaa3.zzZ("StrongEncryptionTransform", zzaa2);
        com.aspose.words.internal.zzAA zzaa4 = new com.aspose.words.internal.zzAA();
        zzaa4.zzZ("DataSpaceInfo", zzaa);
        zzaa4.zzZ("DataSpaceMap", new com.aspose.words.internal.zzZOR(zzZjO));
        zzaa4.zzZ("Version", new com.aspose.words.internal.zzZOR(zzZjP));
        zzaa4.zzZ("TransformInfo", zzaa3);
        zzkd.zzIf().zzZ("\u0006DataSpaces", zzaa4);
    }

    private void zzZTw() throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(this.zzZjR.zzYs("DataSpaceMap"));
        if (zzzox.zzXc() != 8) {
            throw new IllegalStateException("Unexpected header length.");
        }
        this.zzZjQ = new ArrayList<>();
        int iZzXc = zzzox.zzXc();
        for (int i = 0; i < iZzXc; i++) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZjQ, zzI(zzzox));
        }
    }

    private void zzZTx() throws Exception {
        if (this.zzZjR.containsKey("Version")) {
            com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(this.zzZjR.zzYs("Version"));
            if (!"Microsoft.Container.DataSpaces".equals(zzJ(zzzox))) {
                throw new IllegalStateException("Unexpected FeatureIdentifier.");
            }
            zzK(zzzox);
        }
    }

    private void zzZTy() throws Exception {
        String[] strArrZzRU = zzRU("StrongEncryptionDataSpace");
        if (strArrZzRU.length != 1 || !"StrongEncryptionTransform".equals(strArrZzRU[0])) {
            throw new IllegalStateException("Unexpected transform references.");
        }
        com.aspose.words.internal.zzAA zzaaZzYq = this.zzZjR.zzYq("TransformInfo").zzYq(strArrZzRU[0]);
        com.aspose.words.internal.zzZOR zzzorZzYu = zzaaZzYq.zzYu("\u0006Primary");
        if (zzzorZzYu == null) {
            zzzorZzYu = zzaaZzYq.zzYs("Primary");
        }
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzorZzYu);
        zzzox.zzXc();
        if (zzzox.zzXc() != 1) {
            throw new IllegalStateException("Unexpected transform type.");
        }
        zzJ(zzzox);
        zzJ(zzzox);
        if (com.aspose.words.internal.zzZYQ.zzT(zzzox, 12)) {
            zzK(zzzox);
        }
    }

    private static zzZBN zzZz(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzZBN zzzva;
        switch (new com.aspose.words.internal.zzZOX(zzzop).zzXc()) {
            case 131075:
            case 131076:
                zzzva = new zzZVA();
                break;
            case 196611:
            case 196612:
                throw new UnsupportedFileFormatException("The document is encrypted using the Extensible Encryption and this is not currently supported.");
            case 262148:
                zzzva = new zzZVB();
                break;
            default:
                throw new IllegalStateException("Unexpected encryption version.");
        }
        zzzop.zzH(0L);
        return zzzva;
    }

    public final com.aspose.words.internal.zzZOR zzRV(String str) throws Exception {
        if (this.zzZjR != null) {
            zzZTy();
        }
        com.aspose.words.internal.zzZOR zzzorZzYs = this.zzZjS.zzIf().zzYs("EncryptionInfo");
        com.aspose.words.internal.zzZOR zzzorZzYs2 = this.zzZjS.zzIf().zzYs("EncryptedPackage");
        zzZBN zzzbnZzZz = zzZz(zzzorZzYs);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzbnZzZz.zzZ(zzzorZzYs, zzzorZzYs2, zzzor, str);
        return zzzor;
    }

    public final boolean zzZTz() {
        if (this.zzZjR == null) {
            return this.zzZjS.zzZR("EncryptedPackage") && this.zzZjS.zzZR("EncryptionInfo");
        }
        if (this.zzZjQ.size() != 1) {
            return false;
        }
        zzKI zzki = this.zzZjQ.get(0);
        return "StrongEncryptionDataSpace".equals(zzki.zzZjU) && zzki.zzZjT.size() == 1 && "EncryptedPackage".equals(zzki.zzZjT.get(0));
    }
}
