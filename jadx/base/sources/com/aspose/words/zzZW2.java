package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZW2 implements zzZBR {
    private zzZWV zzYOW;
    private zzZX5 zzYPi;
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzZWT zzmY;
    private com.aspose.words.internal.zzXA<String> zzYN7 = new com.aspose.words.internal.zzXA<>();
    private com.aspose.words.internal.zzZYI zzYN6 = new com.aspose.words.internal.zzZYI();
    private com.aspose.words.internal.zz78 zzYOV = new com.aspose.words.internal.zz79();

    private int getCompliance() {
        return zzYO3.zzZ(this.zzZFZ.zzYfy.zzZqn(), zzZlS());
    }

    private static int zzEA(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalArgumentException();
    }

    private static int zzEB(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 9;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    private static boolean zzEz(int i) {
        return i == 20 || i == 21 || i == 22 || i == 23;
    }

    private static void zzZ(com.aspose.words.internal.zz77 zz77Var, CustomPart customPart) {
        if (zz77Var == null || customPart.isExternal()) {
            return;
        }
        zz77Var.zzxn().zzZ(customPart.zzZTI(), customPart.getRelationshipType(), com.aspose.words.internal.zz78.zzt(zz77Var.getName(), customPart.getName()), customPart.isExternal());
    }

    private void zzZk7() throws Exception {
        zzZYD zzzydZzH = zzH("/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml", zzZmp().zzme());
        BuiltInDocumentProperties builtInDocumentProperties = this.zzZFZ.zzYfy.getBuiltInDocumentProperties();
        com.aspose.words.internal.zz7B.zzZ(zzzydZzH, builtInDocumentProperties.getTitle(), builtInDocumentProperties.getSubject(), builtInDocumentProperties.getAuthor(), builtInDocumentProperties.getKeywords(), builtInDocumentProperties.getComments(), builtInDocumentProperties.getLastSavedBy(), Integer.toString(builtInDocumentProperties.getRevisionNumber()), builtInDocumentProperties.zz7g(), builtInDocumentProperties.zz7h(), builtInDocumentProperties.zz7f(), builtInDocumentProperties.getCategory(), builtInDocumentProperties.getContentStatus(), builtInDocumentProperties.get("Language").getValue().toString(), builtInDocumentProperties.get("DocumentVersion").getValue().toString());
    }

    private zzZXS zzZk8() throws Exception {
        this.zzZFZ.zzYde();
        zzZXS zzzxs = new zzZXS(this, this.zzmY);
        zzzxs.zzIg();
        return zzzxs;
    }

    private String zzZk9() {
        switch (this.zzZFZ.zzXpa.getSaveFormat()) {
            case 20:
            case 24:
                return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
            case 21:
            case 25:
                return "application/vnd.ms-word.document.macroEnabled.12";
            case 22:
            case 26:
                return "application/vnd.openxmlformats-officedocument.wordprocessingml.template";
            case 23:
            case 27:
                return "application/vnd.ms-word.template.macroEnabled.12";
            default:
                throw new IllegalStateException("Unexpected save format.");
        }
    }

    private OoxmlSaveOptions zzZlS() {
        return (OoxmlSaveOptions) this.zzZFZ.zzXpa;
    }

    private void zzZnc() {
        if (this.zzZFZ.zzYfy.hasMacros()) {
            switch (this.zzZFZ.zzXpa.getSaveFormat()) {
                case 20:
                case 22:
                case 24:
                    throw new IllegalStateException("This document contains macros (VBA project) and you are attempting to save it in a Macro-Free format. Such document will be invalid if created. You need to either save it in a Macro-Enabled format (.DOCM or .DOTM) or remove macros before saving using the Document.RemoveMacros method.");
                case 21:
                case 23:
                case 25:
                case 27:
                    return;
                case 26:
                default:
                    throw new IllegalStateException("Unexpected save format.");
            }
        }
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    public final zzZYD zzH(String str, String str2, String str3) throws Exception {
        return new zzZYD(this.zzYOV.zzZ(null, str, str2, str3), zzZlS().getPrettyFormat(), getCompliance(), 0, getWarningCallback());
    }

    public final int zzNG(String str) {
        int i = this.zzYN6.get(str);
        if (com.aspose.words.internal.zzZYI.zzWm(i)) {
            i = 0;
        }
        int i2 = i + 1;
        this.zzYN6.set(str, i2);
        return i2;
    }

    public final void zzS(byte[] bArr, String str) {
        this.zzYN7.zzZ(com.aspose.words.internal.zzIL.zz3(bArr), str);
    }

    public final void zzW(zzYDZ zzydz) {
        this.zzZFZ = zzydz;
    }

    public final String zzYl(byte[] bArr) {
        return this.zzYN7.zzX(com.aspose.words.internal.zzIL.zz3(bArr));
    }

    public final zzZX5 zzZlR() {
        zzZX5 zzzx5 = this.zzYPi;
        if (zzzx5 != null) {
            return zzzx5;
        }
        zzZX5 zzzx52 = new zzZX5(getCompliance() == 2);
        this.zzYPi = zzzx52;
        return zzzx52;
    }

    public final com.aspose.words.internal.zz78 zzZmf() {
        return this.zzYOV;
    }

    public final zzZWV zzZmp() {
        zzZWV zzzwv = this.zzYOW;
        if (zzzwv != null) {
            return zzzwv;
        }
        zzZWV zzzwv2 = new zzZWV(getCompliance() == 2);
        this.zzYOW = zzzwv2;
        return zzzwv2;
    }

    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzZFZ = zzydz;
        zzZnc();
        switch (zzydz.zzXpa.getSaveFormat()) {
            case 20:
            case 21:
            case 22:
            case 23:
                OoxmlSaveOptions ooxmlSaveOptions = (OoxmlSaveOptions) zzydz.zzXpa;
                this.zzYOV = new com.aspose.words.internal.zz79(new zzYO0(), zzEB(ooxmlSaveOptions.getCompressionLevel()), zzEA(ooxmlSaveOptions.getZip64Mode()));
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                this.zzYOV = new com.aspose.words.internal.zz7A();
                break;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected SaveFormat value {0}.", Integer.valueOf(zzydz.zzXpa.getSaveFormat())));
        }
        this.zzmY = new com.aspose.words.internal.zzZWT(zzydz.zzXpa.getTempFolder());
        zzZWA.zzZ(zzZk8());
        zzZXN.zzZ(this);
        zzZk7();
        zzZY2.zzZ(this);
        ArrayList arrayList = new ArrayList();
        Iterator<com.aspose.words.internal.zz77> it = this.zzYOV.zzxo().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, it.next().getName());
        }
        zzZ("/", arrayList);
        com.aspose.words.internal.zz73.zzZ(this.zzYOV, zzZlS().getPrettyFormat());
        if (zzEz(zzydz.zzXpa.getSaveFormat())) {
            com.aspose.words.internal.zz7C.zzZ((com.aspose.words.internal.zz79) this.zzYOV, zzZlS().getPrettyFormat());
        }
        OoxmlSaveOptions ooxmlSaveOptions2 = (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(zzydz.zzXpa, OoxmlSaveOptions.class);
        if (ooxmlSaveOptions2 != null && com.aspose.words.internal.zzZYD.zzXk(ooxmlSaveOptions2.getPassword())) {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            this.zzYOV.zzL(zzzor);
            zzKH.zzV(zzzor, ooxmlSaveOptions2.getPassword()).zzL(zzydz.zzXpb);
        } else {
            this.zzYOV.zzL(zzydz.zzXpb);
        }
        this.zzmY.cleanup();
        return new SaveOutputParameters(zzZk9());
    }

    private void zzZ(String str, Collection<String> collection) throws Exception {
        for (CustomPart customPart : this.zzZFZ.zzYfy.getPackageCustomParts()) {
            if (com.aspose.words.internal.zzZKN.equals(customPart.zzZTJ(), str)) {
                if (collection.contains(customPart.getName())) {
                    customPart.setName(com.aspose.words.internal.zzZKN.zzV(customPart.getName(), com.aspose.words.internal.zzZKN.zzV(customPart.getName(), ".", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8), "1"));
                }
                if (customPart.isExternal()) {
                    this.zzYOV.zzxn().zzZ(customPart.getRelationshipType(), customPart.getName(), true);
                } else {
                    String strZzZTJ = customPart.zzZTJ();
                    com.aspose.words.internal.zz77 zz77VarZzYd = "/".equals(strZzZTJ) ? null : this.zzYOV.zzYd(strZzZTJ);
                    zzZ(zz77VarZzYd, customPart);
                    if (!this.zzYOV.zzxo().contains(customPart.getName())) {
                        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYOV.zzZ(zz77VarZzYd, customPart.getName(), customPart.getContentType(), customPart.getRelationshipType());
                        zz77VarZzZ.zz5(new com.aspose.words.internal.zzZOR(customPart.getData(), 0, customPart.getData().length, true, true));
                        zzZ(zz77VarZzZ.getName(), collection);
                    }
                }
            }
        }
    }
}
