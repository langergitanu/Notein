package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYV {
    private HashMap<String, org.w3c.dom.Document> zzWSa = new HashMap<>();
    private HashMap<String, String> zzWS9 = new HashMap<>();
    private HashMap<String, ArrayList<org.w3c.dom.Node>> zzWS8 = new HashMap<>();
    private ArrayList<StructuredDocumentTag> zzWS7 = new ArrayList<>();

    public final void remove(String str) {
        if (this.zzWSa.containsKey(str)) {
            com.aspose.words.internal.zzZQF.zzY(this.zzWSa, str);
        }
        if (this.zzWS9.containsKey(str)) {
            com.aspose.words.internal.zzZQF.zzY(this.zzWS9, str);
        }
        if (this.zzWS8.keySet().size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.zzWS8.keySet()) {
                if (com.aspose.words.internal.zzZKN.zzS(str2, str, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, str2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQF.zzY(this.zzWS8, (String) it.next());
            }
        }
    }

    public final ArrayList<StructuredDocumentTag> zzXQC() {
        return this.zzWS7;
    }

    public final String zzZ(XmlMapping xmlMapping) {
        if (xmlMapping.getCustomXmlPart() == null) {
            return null;
        }
        String storeItemId = xmlMapping.getStoreItemId();
        if (!this.zzWS9.containsKey(storeItemId)) {
            this.zzWS9.put(storeItemId, com.aspose.words.internal.zzS4.zzH(xmlMapping.getCustomXmlPart().getData()));
        }
        return this.zzWS9.get(storeItemId);
    }

    public final boolean zzye(String str) {
        return this.zzWSa.containsKey(str);
    }

    public final org.w3c.dom.Document zzyf(String str) {
        if (this.zzWSa.containsKey(str)) {
            return this.zzWSa.get(str);
        }
        return null;
    }

    public final org.w3c.dom.Document zzZ(String str, org.w3c.dom.Document document) {
        com.aspose.words.internal.zzZQF.zzY(this.zzWSa, str, document);
        return document;
    }
}
