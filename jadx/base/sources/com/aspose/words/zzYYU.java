package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYU {
    private zzZFH zzXYO;
    private zzZFF zzXYP;
    private boolean zzXYQ;
    private HtmlLoadOptions zzXYR;
    private DocumentBuilder zzYRM;
    private com.aspose.words.internal.zzIM<zzYYV> zzXYN = new com.aspose.words.internal.zzIM<>();
    private ArrayList<zzYYV> zzXYM = new ArrayList<>();

    public zzYYU(HtmlLoadOptions htmlLoadOptions) {
        this.zzXYR = htmlLoadOptions;
    }

    private IWarningCallback getWarningCallback() {
        return this.zzYRM.getDocument().getWarningCallback();
    }

    private zzYYV zzI7(String str) {
        this.zzXYM.size();
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            for (zzYYV zzyyv : this.zzXYM) {
                if (com.aspose.words.internal.zzZKN.equals(zzyyv.zzYDp().zzYDd(), str)) {
                    return zzyyv;
                }
            }
        }
        for (zzYYV zzyyv2 : this.zzXYM) {
            if (zzyyv2.zzYDp().zzYD3()) {
                return zzyyv2;
            }
        }
        return this.zzXYM.get(0);
    }

    private void zzR(zzYYV zzyyv) throws Exception {
        Shape shapeInsertImage;
        com.aspose.words.internal.zzZOR zzzorZzYDs = zzyyv.zzYDs();
        if (zzzorZzYDs != null) {
            if (zzZGZ.zzP(zzzorZzYDs)) {
                zzYDl();
                try {
                    shapeInsertImage = this.zzYRM.zzZt(zzzorZzYDs);
                } catch (com.aspose.words.internal.zzX8 unused) {
                    shapeInsertImage = this.zzYRM.insertImage(com.aspose.words.internal.zzEF.zzDL());
                }
            } else {
                zzY1Z.zzZ(getWarningCallback(), 16777216, 16, "Unsupported image format.");
                zzYDl();
                shapeInsertImage = this.zzYRM.insertImage(com.aspose.words.internal.zzEF.zzDL());
            }
            shapeInsertImage.getParentParagraph();
            shapeInsertImage.getParentParagraph().zzZYj().setAlignment(1);
            this.zzXYQ = true;
        }
    }

    private void zzS(zzYYV zzyyv) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYDs = zzyyv.zzYDs();
        if (zzzorZzYDs != null) {
            zzYDl();
            com.aspose.words.internal.zzZO0 zzzo0ZzI4 = zzYYS.zzI4(zzyyv.zzYDp().zzYDf());
            this.zzYRM.write((zzzo0ZzI4 != null ? new com.aspose.words.internal.zzZOO(zzzorZzYDs, zzzo0ZzI4) : new com.aspose.words.internal.zzZOO(zzzorZzYDs)).zziv());
            this.zzXYQ = true;
        }
    }

    private void zzT(zzYYV zzyyv) throws Exception {
        String strZzYDo = zzyyv.zzYDo();
        if (strZzYDo.length() != 0) {
            Document document = this.zzYRM.getDocument();
            if (com.aspose.words.internal.zzZVR.zzWx(strZzYDo)) {
                strZzYDo = com.aspose.words.internal.zzZVR.zzWy(strZzYDo);
            }
            document.setBaseUri(strZzYDo);
        }
        com.aspose.words.internal.zzZO0 zzzo0ZzYDr = zzyyv.zzYDr();
        com.aspose.words.internal.zzZOR zzzorZzYDs = zzyyv.zzYDs();
        if (zzzorZzYDs != null) {
            zzYDl();
            if (this.zzXYR.zzZ0A()) {
                new zzYWY(this.zzXYP).zzZ(zzzorZzYDs, zzzo0ZzYDr, this.zzYRM.getDocument(), zzzo0ZzYDr);
            } else {
                new zzZFI(this.zzXYO, 51, this.zzXYP).zzZ((com.aspose.words.internal.zzZOP) zzzorZzYDs, zzzo0ZzYDr, this.zzYRM, false);
            }
            this.zzXYQ = true;
        }
    }

    private void zzU(zzYYV zzyyv) throws Exception {
        boolean z = zzyyv.zzYDp().isImage() || (zzyyv.zzYDp().zzYD1() && this.zzXYN.contains(zzyyv));
        if (!"attachment".equals(zzyyv.zzYDp().zzYD9()) || (z && zzZGZ.zzO(zzyyv.zzYDs()))) {
            if (z || zzyyv.zzYDp().getContentType().length() == 0 || zzyyv.zzYDp().zzYD4()) {
                if (z) {
                    zzR(zzyyv);
                } else {
                    zzS(zzyyv);
                }
            }
        }
    }

    private void zzV(zzYYV zzyyv) throws Exception {
        HashMap map = new HashMap();
        for (zzYYV zzyyv2 : zzyyv.zzYDq()) {
            if (zzyyv2.zzYDp().zzYDi()) {
                zzYYR zzyyrZzYDp = zzyyv2.zzYDp();
                String strZzYDg = zzyyv2.zzYDm().zzYDp().zzYDg();
                if (!"text/html".equals(zzyyrZzYDp.getContentType()) || com.aspose.words.internal.zzZKN.zzU3(zzyyrZzYDp.zzYDc())) {
                    if (zzyyrZzYDp.isImage()) {
                        if (map.containsKey(strZzYDg)) {
                            zzyyv2.zzI8((String) map.get(strZzYDg));
                        }
                        zzZ(zzyyv2, (com.aspose.words.internal.zzZOR) null);
                        this.zzXYN.add(zzyyv2);
                    }
                    if (zzyyrZzYDp.zzYD1() && zzyyrZzYDp.zzYDj()) {
                        com.aspose.words.internal.zzZOR zzzorZzYDs = zzyyv2.zzYDs();
                        if (zzZGZ.zzP(zzzorZzYDs)) {
                            zzZ(zzyyv2, zzzorZzYDs);
                            this.zzXYN.add(zzyyv2);
                        }
                    }
                } else if (!map.containsKey(strZzYDg)) {
                    com.aspose.words.internal.zzZQF.zzY(map, strZzYDg, zzyyrZzYDp.zzYDc());
                }
            }
        }
    }

    private void zzW(zzYYV zzyyv) {
        if ("attachment".equals(zzyyv.zzYDp().zzYD9())) {
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXYM, zzyyv);
    }

    private void zzX(zzYYV zzyyv) throws Exception {
        if ("attachment".equals(zzyyv.zzYDp().zzYD9())) {
            return;
        }
        zzZ(zzyyv, (com.aspose.words.internal.zzZOR) null);
        zzYYV zzyyvZzYDm = zzyyv.zzYDm();
        if ((zzyyvZzYDm.zzYDp().isMixed() || this.zzXYM.size() == 0) && zzyyv.zzYDp().zzYDc().length() != 0) {
            zzyyv.zzYDm().zzI8(zzyyv.zzYDp().zzYDc());
        }
        if (zzyyvZzYDm.zzYDp().zzYD6() || zzyyvZzYDm.zzYDp().zzYD7()) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXYM, zzyyv);
        }
        if (zzyyvZzYDm.zzYDp().isMixed() || zzyyvZzYDm.zzYDp().isSigned()) {
            zzT(zzyyv);
        }
    }

    private void zzY(zzYYV zzyyv) throws Exception {
        for (zzYYV zzyyv2 : zzyyv.zzyD()) {
            if (zzyyv2.zzYDp().zzhL()) {
                zzZ(zzyyv2);
            }
        }
        if (zzyyv.zzYDm().zzYDp().isMixed() || zzyyv.zzYDm().zzYDp().isSigned()) {
            if (zzyyv.zzYDp().zzYD6() || zzyyv.zzYDp().zzYD7()) {
                if (this.zzXYM.size() == 0) {
                    throw new IllegalStateException("Root resource is not found in a multipart structure.");
                }
                zzYYV zzyyvZzI7 = zzI7(zzyyv.zzYDp().zzYD8());
                this.zzXYM.clear();
                if (zzyyv.zzYDp().zzYDc().length() != 0) {
                    zzyyv.zzYDm().zzI8(zzyyvZzI7.zzYDp().zzYDc());
                }
                if (zzyyvZzI7.zzYDp().zzYD3()) {
                    zzT(zzyyvZzI7);
                } else if (zzyyvZzI7.zzYDp().zzYD2()) {
                    zzS(zzyyvZzI7);
                }
            }
        }
    }

    private void zzYDl() throws Exception {
        if (this.zzXYQ) {
            if (this.zzYRM.getCurrentParagraph().hasChildNodes()) {
                this.zzYRM.zz7(0, false);
            }
            this.zzYRM.insertHorizontalRule();
            this.zzYRM.getParagraphFormat().clearFormatting();
        }
    }

    private static String zzYG(String str, String str2) {
        if (!com.aspose.words.internal.zzZVR.zzWF(str) || !com.aspose.words.internal.zzZVR.zzWF(str2)) {
            return null;
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, IOUtils.DIR_SEPARATOR_UNIX);
        String[] strArrZzR2 = com.aspose.words.internal.zzZKN.zzR(str2, IOUtils.DIR_SEPARATOR_UNIX);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArrZzR.length && i < strArrZzR2.length && com.aspose.words.internal.zzZKN.equals(strArrZzR[i], strArrZzR2[i]); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, strArrZzR[i]);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        }
        String string = sb.toString();
        if (com.aspose.words.internal.zzZYD.zzXk(string)) {
            return string.length() < str2.length() ? str2.substring(string.length()) : str2;
        }
        return null;
    }

    private static String zzYW(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[4096];
        int i = zzzop.read(bArr, 0, 4096);
        while (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append((char) (bArr[i2] & 255));
            }
            i = zzzop.read(bArr, 0, 4096);
        }
        return sb.toString();
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, Document document) throws Exception {
        String strZzYW = zzYW(zzzop);
        zzZFF zzzff = new zzZFF(this.zzXYR.getResourceLoadingCallback(), document.getWarningCallback());
        this.zzXYP = zzzff;
        zzzff.setWebRequestTimeout(this.zzXYR.getWebRequestTimeout());
        this.zzXYO = this.zzXYR.zz1r();
        zzYYV zzyyvZzIa = zzYYW.zzIa(strZzYW);
        this.zzYRM = new DocumentBuilder(document);
        zzV(zzyyvZzIa);
        zzZ(zzyyvZzIa);
    }

    private void zzZ(zzYYV zzyyv) throws Exception {
        if (zzyyv.zzYDp().zzYDh() != 0) {
            zzY(zzyyv);
            return;
        }
        if (zzyyv.zzYDp().zzYD3()) {
            zzX(zzyyv);
            return;
        }
        if (zzyyv.zzYDp().zzYD2() && zzyyv.zzYDm().zzYDp().zzYD6()) {
            zzW(zzyyv);
            return;
        }
        if (!zzyyv.zzYDm().zzYDp().zzYD6() && !zzyyv.zzYDm().zzYDp().zzYD7()) {
            if (zzyyv.zzYDm().zzYDp().isMixed()) {
                zzU(zzyyv);
                return;
            }
            return;
        }
        zzZ(zzyyv, (com.aspose.words.internal.zzZOR) null);
    }

    private void zzZ(zzYYV zzyyv, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        if (zzyyv.zzYDp().zzYDj()) {
            if (zzzor == null) {
                zzzor = zzyyv.zzYDs();
            }
            if (zzzor == null) {
                return;
            }
            zzzor.zzH(0L);
            byte[] bArrZziA = zzzor.zziA();
            if (bArrZziA.length != zzzor.getLength()) {
                bArrZziA = zzzor.zzWy();
            }
            if (zzyyv.zzYDp().zzYDd().length() != 0) {
                this.zzXYP.zzW("cid:" + zzyyv.zzYDp().zzYDd(), bArrZziA);
            }
            if (zzyyv.zzYDp().zzYDc().length() != 0) {
                this.zzXYP.zzW(zzyyv.zzYDp().zzYDc(), bArrZziA);
                if (!com.aspose.words.internal.zzZKN.equals(zzyyv.zzYDp().zzYDc(), zzyyv.zzYDp().zzYDb())) {
                    this.zzXYP.zzW(zzyyv.zzYDp().zzYDb(), bArrZziA);
                }
                if (zzyyv.zzYDo().length() != 0 && com.aspose.words.internal.zzZKN.zzS(zzyyv.zzYDp().zzYDc(), zzyyv.zzYDo(), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    int length = zzyyv.zzYDo().length();
                    int length2 = zzyyv.zzYDp().zzYDc().length();
                    while (length < length2 && zzyyv.zzYDp().zzYDc().charAt(length) == '/') {
                        length++;
                    }
                    if (length < length2) {
                        this.zzXYP.zzW(zzyyv.zzYDp().zzYDc().substring(length), bArrZziA);
                    }
                }
                String strZzYG = zzYG(zzyyv.zzYDo(), zzyyv.zzYDp().zzYDc());
                if (com.aspose.words.internal.zzZYD.zzXk(strZzYG)) {
                    this.zzXYP.zzW(strZzYG, bArrZziA);
                }
            }
            if (zzyyv.zzYDp().zzYDa().length() == 0 || com.aspose.words.internal.zzZKN.equals(zzyyv.zzYDp().zzYDa(), zzyyv.zzYDp().zzYDc())) {
                return;
            }
            this.zzXYP.zzW(zzyyv.zzYDp().zzYDa(), bArrZziA);
        }
    }
}
