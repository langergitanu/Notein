package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIP implements zzZBS {
    private DocumentBuilder zzYRM;
    private int zzYrv;
    private String zzZE2;

    public static class zzZ {
        HeaderFooter[] zzYrt;
        zzYCZ zzYru;

        private zzZ() {
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzZIP(String str, int i, DocumentBuilder documentBuilder) {
        this.zzYrv = i;
        this.zzZE2 = str;
        this.zzYRM = documentBuilder;
    }

    private void zzZ(zzZ zzz) {
        Section currentSection;
        if (zzz == null || (currentSection = this.zzYRM.getCurrentSection()) == null) {
            return;
        }
        currentSection.zzY(zzz.zzYru);
        currentSection.getHeadersFooters().clear();
        for (HeaderFooter headerFooter : zzz.zzYrt) {
            currentSection.getHeadersFooters().add(headerFooter);
        }
    }

    private boolean zzZ2Z() {
        Section parentSection;
        Body body = (Body) com.aspose.words.internal.zzZKW.zzZ(this.zzYRM.getCurrentStory(), Body.class);
        if (body == null || (parentSection = body.getParentSection()) == null) {
            return true;
        }
        if (!parentSection.zzYVg()) {
            return false;
        }
        Iterator<T> it = parentSection.getHeadersFooters().iterator();
        while (it.hasNext()) {
            if (!((HeaderFooter) it.next()).isLinkedToPrevious()) {
                return false;
            }
        }
        return body.zz6T();
    }

    private zzZ zzZ30() {
        if (zzZ2Z()) {
            return null;
        }
        Section currentSection = this.zzYRM.getCurrentSection();
        zzZ zzz = new zzZ((byte) 0);
        zzz.zzYru = (zzYCZ) currentSection.zzYvR().zzbn();
        ArrayList arrayList = new ArrayList();
        for (HeaderFooter headerFooter : currentSection.getHeadersFooters()) {
            if (!headerFooter.isLinkedToPrevious()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<HeaderFooter>) arrayList, headerFooter);
            }
        }
        zzz.zzYrt = (HeaderFooter[]) arrayList.toArray(new HeaderFooter[0]);
        currentSection.getHeadersFooters().clear();
        return zzz;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        Document document = this.zzYRM.getDocument();
        zzZFF zzzff = new zzZFF(document.getResourceLoadingCallback(), document.getWarningCallback());
        zzZFH zzzfh = new zzZFH();
        zzzfh.zzYmD = (this.zzYrv & 4) != 0;
        zzZFI zzzfi = new zzZFI(zzzfh, 50, zzzff);
        zzZ zzzZzZ30 = zzZ30();
        zzzfi.zzZ(this.zzZE2, this.zzYRM, this.zzYrv, true);
        zzZ(zzzZzZ30);
    }
}
