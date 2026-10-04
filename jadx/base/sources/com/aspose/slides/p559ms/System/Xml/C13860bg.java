package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.p559ms.System.C14095u1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.bg */
/* JADX INFO: loaded from: classes5.dex */
public class C13860bg {

    /* JADX INFO: renamed from: k4 */
    private C14095u1 f46359k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13974sc f46360kk;

    /* JADX INFO: renamed from: x1 */
    private XmlDocument f46361x1;

    public C13860bg(XmlDocument xmlDocument, C13956q3 c13956q3) {
        this.f46360kk = null;
        this.f46361x1 = xmlDocument;
        this.f46359k4 = new C14095u1(c13956q3);
        C13925k5 c13925k5 = new C13925k5(this);
        this.f46360kk = c13925k5;
        xmlDocument.NodeInserted.mo27432x1(c13925k5);
        xmlDocument.NodeRemoved.mo27432x1(this.f46360kk);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65190k4() {
        synchronized (this) {
            try {
                if (this.f46359k4 != null) {
                    this.f46361x1.NodeInserted.mo27429k4(this.f46360kk);
                    this.f46361x1.NodeRemoved.mo27429k4(this.f46360kk);
                    this.f46359k4 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m65189k4(Object obj, C13979sz c13979sz) {
        synchronized (this) {
            try {
                C14095u1 c14095u1 = this.f46359k4;
                if (c14095u1 != null) {
                    C13956q3 c13956q3 = (C13956q3) c14095u1.m67304k4();
                    if (c13956q3 != null) {
                        c13956q3.m65787k4(c13979sz);
                    } else {
                        this.f46361x1.NodeInserted.mo27429k4(this.f46360kk);
                        this.f46361x1.NodeRemoved.mo27429k4(this.f46360kk);
                        this.f46359k4 = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
