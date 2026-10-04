package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWJ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("element", "uri", "smartTagPr", "attr", "name", "val");
    private zzZXA zzYPn;

    private static void zzZ(com.aspose.words.internal.zzO zzo, SmartTag smartTag) {
        while (zzo.zzQ("smartTagPr")) {
            if (zzUR.zzTP(zzo.getLocalName()) != 3) {
                zzo.zzk();
            } else {
                zzY(zzo, smartTag);
            }
        }
    }

    public final void zzY(zzYVB zzyvb) throws Exception {
        SmartTag smartTag = new SmartTag(zzyvb.getDocument());
        zzyvb.zzT(smartTag);
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                smartTag.setElement(zzyu4ZzZsD.getValue());
            } else if (iZzTP == 1) {
                smartTag.setUri(zzyu4ZzZsD.getValue());
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("smartTag")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 2) {
                this.zzYPn.zzF(zzyvb);
            } else {
                zzZ(zzyu4ZzZsD, smartTag);
            }
        }
        zzyvb.zztj(27);
    }

    public final void zzZ(zzZXA zzzxa) {
        this.zzYPn = zzzxa;
    }

    private static void zzY(com.aspose.words.internal.zzO zzo, SmartTag smartTag) {
        String value = "";
        String value2 = "";
        String value3 = value2;
        while (zzo.zzi()) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 1) {
                value2 = zzo.getValue();
            } else if (iZzTP == 4) {
                value = zzo.getValue();
            } else if (iZzTP == 5) {
                value3 = zzo.getValue();
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(value)) {
            smartTag.getProperties().zzZ(new CustomXmlProperty(value, value2, value3));
        }
    }
}
