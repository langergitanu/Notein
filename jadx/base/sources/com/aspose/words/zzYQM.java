package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQM {
    private com.aspose.words.internal.zzIM<String> zzXO7 = new com.aspose.words.internal.zzIM<>();
    private zzYQP zzYKO;

    public zzYQM(zzYQP zzyqp) {
        this.zzYKO = zzyqp;
        zzYvm();
    }

    private void zzYU(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzYQO zzyqoZzEn = this.zzYKO.zzEn("/META-INF/documentsignatures.xml");
        if (zzyqoZzEn == null) {
            zzyqoZzEn = this.zzYKO.zzEm("/META-INF/documentsignatures.xml");
            com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzyqoZzEn.zzYvo(), false);
            zzp.zzZ("document-signatures");
            zzp.zzX("xmlns", "urn:oasis:names:tc:opendocument:xmlns:digitalsignature:1.0");
            zzp.endDocument();
            zzyqoZzEn.zzYvo().zzH(0L);
        }
        org.w3c.dom.Document documentZzX = com.aspose.words.internal.zzZSN.zzX(zzyqoZzEn.zzYvo(), false);
        org.w3c.dom.Document documentZzX2 = com.aspose.words.internal.zzZSN.zzX(zzzop, false);
        documentZzX.getDocumentElement();
        documentZzX2.getDocumentElement();
        documentZzX.getDocumentElement().appendChild(documentZzX.importNode(documentZzX2.getDocumentElement(), true));
        zzyqoZzEn.zzYvo().zzH(0L);
        com.aspose.words.internal.zzZSN.zzZ(documentZzX.getDocumentElement(), (com.aspose.words.internal.zzZOP) zzyqoZzEn.zzYvo());
        zzyqoZzEn.zzYvo().zzH(0L);
    }

    private void zzYvm() {
        this.zzXO7.add("/META-INF/documentsignatures.xml");
    }

    private ArrayList<String> zzYvn() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (zzYQO zzyqo : this.zzYKO.zzYvp()) {
            if (!zzY(zzyqo)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, com.aspose.words.internal.zzZKN.zzU(zzyqo.getName(), IOUtils.DIR_SEPARATOR_UNIX));
            }
        }
        return arrayList;
    }

    private static com.aspose.words.internal.zzZOR zzZ(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception {
        return new zzXZ0().zzY(zzyju, digitalSignature);
    }

    public final void zzY(DigitalSignature digitalSignature) throws Exception {
        zzYJU zzyju = new zzYJU(new zzYQ5(this.zzYKO));
        Iterator<String> it = zzYvn().iterator();
        while (it.hasNext()) {
            zzyju.zzY(new zzYJW(it.next()));
        }
        com.aspose.words.internal.zzZOR zzzorZzZ = zzZ(zzyju, digitalSignature);
        zzzorZzZ.zzH(0L);
        zzYU(zzzorZzZ);
    }

    private boolean zzY(zzYQO zzyqo) {
        return this.zzXO7.contains(zzyqo.getName()) || com.aspose.words.internal.zzZKN.zzW(zzyqo.getName(), "/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }
}
