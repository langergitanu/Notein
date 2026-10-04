package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.dg */
/* JADX INFO: loaded from: classes3.dex */
class C0900dg extends dnf {

    /* JADX INFO: renamed from: k4 */
    static final C3068ks f4593k4 = new C3068ks("b", BackupFile.PREFIX_NOTE_DIR, "e", "s", "str", "inlineStr");

    /* JADX INFO: renamed from: com.aspose.slides.dg$k4 */
    public static class k4 implements kfh {
        @Override // com.aspose.slides.kfh
        /* JADX INFO: renamed from: k4 */
        public final C13981tl mo4589k4(String str, String str2, String str3, XmlDocument xmlDocument) {
            return new C0900dg(str, str2, str3, xmlDocument);
        }
    }

    public C0900dg(String str, String str2, String str3, XmlDocument xmlDocument) {
        super(str, str2, str3, xmlDocument);
    }

    /* JADX INFO: renamed from: k4 */
    public static kfh m5093k4() {
        return new k4();
    }

    /* JADX INFO: renamed from: du */
    public final long m5094du() {
        return ((long) m5193k4("s", "", 0)) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final Object m5095kk() {
        dnf dnfVarM5196x1 = m5196x1("v", getNamespaceURI());
        if (dnfVarM5196x1 != null) {
            return dnfVarM5196x1.getInnerText();
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final String m5096to() {
        return m65912to("r", "");
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m5097x1() {
        return (byte) m5192k4(f4593k4, "t", "", 1);
    }
}
