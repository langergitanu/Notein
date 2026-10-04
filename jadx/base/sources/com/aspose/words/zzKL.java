package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzKL {
    private static com.aspose.words.internal.zzZNR zzZjY = new com.aspose.words.internal.zzZNR("^[{|(]?[0-9A-F]{8}[-]?([0-9A-F]{4}[-]?){3}[0-9A-F]{12}[)|}]?$", 66);
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzZYG<String> zzZjZ = new com.aspose.words.internal.zzZYG<>();

    public zzKL(zzYDZ zzydz) {
        this.zzZFZ = zzydz;
    }

    private int getCompliance() {
        return zzYO3.zzZ(this.zzZFZ.zzYfy.zzZqn(), (OoxmlSaveOptions) com.aspose.words.internal.zzZKW.zzZ(this.zzZFZ.zzXpa, OoxmlSaveOptions.class));
    }

    private void zzG(int i, String str) {
        if (this.zzZFZ.zzYfy.getWarningCallback() != null) {
            OooO00o.OooO0O0(this.zzZFZ.zzYfy.getWarningCallback(), i, 17, str);
        }
    }

    private static ArrayList<CustomXmlPart> zzS(Document document) {
        ArrayList<CustomXmlPart> arrayList = new ArrayList<>();
        for (CustomXmlPart customXmlPart : document.getCustomXmlParts()) {
            if (com.aspose.words.internal.zzZYD.zzXk(customXmlPart.getId())) {
                if (!zzZjY.zzUV(customXmlPart.getId())) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, customXmlPart);
                }
            }
        }
        return arrayList;
    }

    private void zzT(Document document) throws Exception {
        for (int count = document.getCustomXmlParts().getCount() - 1; count >= 0; count--) {
            CustomXmlPart customXmlPart = document.getCustomXmlParts().get(count);
            if (!customXmlPart.zzZTH()) {
                document.getCustomXmlParts().removeAt(count);
                zzG(255, com.aspose.words.internal.zzZKN.format("Custom XML part with id={0} has invalid content and was removed.", customXmlPart.getId()));
            }
        }
    }

    public final void zzU(Document document) throws Exception {
        if (this.zzZFZ.zzXpa instanceof OoxmlSaveOptions) {
            zzT(document);
        }
        if (this.zzZFZ.zzYd9()) {
            this.zzZjZ.clear();
            for (CustomXmlPart customXmlPart : zzS(document)) {
                if (getCompliance() != 0) {
                    String id = customXmlPart.getId();
                    customXmlPart.setId(com.aspose.words.internal.zzZOZ.zziD().toString("B").toUpperCase());
                    this.zzZjZ.zzW(id, customXmlPart.getId());
                    zzG(65536, com.aspose.words.internal.zzZKN.format("The Id property of a custom XML part has been changed from '{0}' to '{1}' to comply with OOXML specification requirements.", id, customXmlPart.getId()));
                } else {
                    zzG(WarningType.HINT, com.aspose.words.internal.zzZKN.format("The Id property of a custom XML part has a non-GUID value: '{0}'. The latest versions of Microsoft Word may fail on opening this document.", customXmlPart.getId()));
                }
            }
        }
    }

    public final void zzZ(StructuredDocumentTag structuredDocumentTag, zzXYV zzxyv) throws Exception {
        if (this.zzZFZ.zzYd9()) {
            XmlMapping xmlMapping = structuredDocumentTag.getXmlMapping();
            if (xmlMapping.isEmpty()) {
                return;
            }
            if (xmlMapping.getCustomXmlPart() == null) {
                if (this.zzZjZ.containsKey(xmlMapping.getStoreItemId())) {
                    xmlMapping.zzyh(this.zzZjZ.get(xmlMapping.getStoreItemId()));
                }
            } else if (structuredDocumentTag.zzYcP()) {
                xmlMapping.setValue(structuredDocumentTag.zzY3R().toString(structuredDocumentTag.getDateDisplayFormat()));
                zzxyv.remove(xmlMapping.getStoreItemId());
            }
        }
    }
}
