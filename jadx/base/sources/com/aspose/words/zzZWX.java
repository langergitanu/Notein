package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWX {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("Default", "Override", "application/vnd.openxmlformats-officedocument.wordprocessingml.document.main+xml", "application/vnd.ms-word.document.macroEnabled.main+xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.template.main+xml", "application/vnd.ms-word.template.macroEnabledTemplate.main+xml", "Relationship");
    private com.aspose.words.internal.zz78 zzYOV;
    private zzZWV zzYOW;
    private Document zzYTQ;
    private LoadOptions zzYWO;
    private com.aspose.words.internal.zzZWT zzmY;

    public zzZWX(com.aspose.words.internal.zzZOP zzzop, Document document, LoadOptions loadOptions) throws Exception {
        this.zzmY = new com.aspose.words.internal.zzZWT(loadOptions.getTempFolder());
        switch (document.getOriginalLoadFormat()) {
            case 20:
            case 21:
            case 22:
            case 23:
                this.zzYOV = new com.aspose.words.internal.zz79(zzzop, loadOptions.zzZrB(), document.getWarningCallback() != null ? new zzY21(document.getWarningCallback()) : null, this.zzmY);
                break;
            case 24:
            case 25:
            case 26:
            case 27:
                this.zzYOV = new com.aspose.words.internal.zz7A(zzzop);
                break;
            default:
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected LoadFormat value {0}.", Integer.valueOf(document.getOriginalLoadFormat())));
        }
        this.zzYTQ = document;
        this.zzYWO = loadOptions;
        document.getBuiltInDocumentProperties().get("Bytes").zzZB(Integer.valueOf((int) zzzop.getLength()));
        zzZlb();
    }

    private zzZXU zzZl9() throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzYc = this.zzYOV.zzYc(zzZmp().zzZkX());
        com.aspose.words.internal.zz78 zz78Var = this.zzYOV;
        Document document = this.zzYTQ;
        zzZXU zzzxuZzZ = zzZWW.zzZ(zz78Var, zz77VarZzYc, document, this.zzYWO, document.zzZqn());
        zzzxuZzZ.zzIh();
        return zzzxuZzZ;
    }

    private void zzZla() throws Exception {
        if (this.zzYOV.zzYb(zzZmp().zzZkX())) {
            this.zzYOV.zzYc(zzZmp().zzZkX());
            return;
        }
        this.zzYOW = null;
        this.zzYTQ.zzZqn().zzYrb();
        com.aspose.words.internal.zz77 zz77VarZzYc = this.zzYOV.zzYc(zzZmp().zzZkX());
        if (zz77VarZzYc != null) {
            com.aspose.words.internal.zz78 zz78Var = this.zzYOV;
            Document document = this.zzYTQ;
            if ("strict".equals(zzZWW.zzZ(zz78Var, zz77VarZzYc, document, this.zzYWO, document.zzZqn()).zzZsD().zzV("conformance", ""))) {
                return;
            }
            this.zzYTQ.zzZqn().zzYra();
        }
    }

    private void zzZlb() throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYOV.zzZ((com.aspose.words.internal.zz77) null, "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin");
        if (zz77VarZzZ == null) {
            return;
        }
        Iterator<com.aspose.words.internal.zz75> it = zz77VarZzZ.zzxn().iterator();
        while (it.hasNext()) {
            zzXZ3.zzZ(this.zzYOV.zzYd(zz77VarZzZ.zzZ(it.next())).zzR1(), new zzYNZ(this.zzYOV), this.zzYTQ.getDigitalSignatures(), this.zzYWO.getWarningCallback());
        }
    }

    public static boolean zzZq(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        while (zzo.zzQ("Relationships")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 6) {
                zzo.zzk();
            } else if ("http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin".equals(zzo.zzV("Type", ""))) {
                return true;
            }
        }
        return false;
    }

    public static int zzZr(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzop);
        while (zzo.zzQ("Types")) {
            com.aspose.words.internal.zzZHW zzzhw = zzUR;
            int iZzTP = zzzhw.zzTP(zzo.getLocalName());
            if (iZzTP == 0 || iZzTP == 1) {
                int iZzTP2 = zzzhw.zzTP(zzo.zzV("ContentType", ""));
                if (iZzTP2 == 2) {
                    return 20;
                }
                if (iZzTP2 == 3) {
                    return 21;
                }
                if (iZzTP2 == 4) {
                    return 22;
                }
                if (iZzTP2 == 5) {
                    return 23;
                }
            } else {
                zzo.zzk();
            }
        }
        return 255;
    }

    public final Document getDocument() {
        return this.zzYTQ;
    }

    public final void zzIh() throws Exception {
        try {
            zzZla();
            zzZY5.zzZ(this);
            zzZXO.zzZ(this);
            zzZY3.zzZ(this);
            zzZWB.zzZ(zzZl9());
            zzZY4.zzZ(this.zzYOV.zzxn(), this.zzYOV, this.zzYTQ.getPackageCustomParts());
        } finally {
            com.aspose.words.internal.zzZWT zzzwt = this.zzmY;
            if (zzzwt != null) {
                zzzwt.cleanup();
            }
        }
    }

    public final zzZW1 zzML(String str) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zzYOV.zzZ((com.aspose.words.internal.zz77) null, str);
        if (zz77VarZzZ != null) {
            return new zzZW1(zz77VarZzZ, this.zzYTQ.zzZqn());
        }
        return null;
    }

    public final zzZWV zzZmp() {
        if (this.zzYOW == null) {
            this.zzYOW = new zzZWV(this.zzYTQ.zzZqn().zzYr9());
        }
        return this.zzYOW;
    }
}
