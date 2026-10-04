package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p532yu.C13322zd;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.q6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13957q6 extends AbstractC14007wt {

    /* JADX INFO: renamed from: c5 */
    private C13322zd f46774c5;

    /* JADX INFO: renamed from: du */
    private String f46775du;

    /* JADX INFO: renamed from: dy */
    private C13941n0 f46776dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f46777h4;

    /* JADX INFO: renamed from: k4 */
    private String f46778k4;

    /* JADX INFO: renamed from: kk */
    private String f46779kk;

    /* JADX INFO: renamed from: m9 */
    private C13941n0 f46780m9;

    /* JADX INFO: renamed from: to */
    private String f46781to;

    public C13957q6(String str, String str2, String str3, String str4, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.f46778k4 = str;
        this.f46779kk = str2;
        this.f46781to = str3;
        this.f46777h4 = true;
        this.f46775du = str4;
        if (xmlDocument.isLoading()) {
            return;
        }
        xmlDocument.setLoading(true);
        new C13987tw().m66219k4(this);
        xmlDocument.setLoading(false);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createDocumentType(this.f46778k4, this.f46779kk, this.f46781to, this.f46775du);
    }

    /* JADX INFO: renamed from: du */
    public final String m65790du() {
        return this.f46775du;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.f46778k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.f46778k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 10;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m65791h4() {
        return this.f46777h4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isReadOnly() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13941n0 m65792k4() {
        if (this.f46780m9 == null) {
            this.f46780m9 = new C13941n0(this);
        }
        return this.f46780m9;
    }

    /* JADX INFO: renamed from: kk */
    public final String m65794kk() {
        return this.f46779kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C13322zd m65795m9() {
        return this.f46774c5;
    }

    /* JADX INFO: renamed from: to */
    public final String m65796to() {
        return this.f46781to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21908k4(this.f46778k4, this.f46779kk, this.f46781to, this.f46775du);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13941n0 m65797x1() {
        if (this.f46776dy == null) {
            this.f46776dy = new C13941n0(this);
        }
        return this.f46776dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65793k4(C13322zd c13322zd) {
        this.f46774c5 = c13322zd;
    }
}
