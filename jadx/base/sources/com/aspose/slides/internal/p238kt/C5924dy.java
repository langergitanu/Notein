package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13854aq;
import com.aspose.slides.p559ms.System.Xml.C13862bp;
import com.aspose.slides.p559ms.System.Xml.C13939mt;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13947nk;
import com.aspose.slides.p559ms.System.Xml.C13954ph;
import com.aspose.slides.p559ms.System.Xml.C13959qk;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.C14040zm;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5924dy extends XmlDocument implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16750k4;

    /* JADX INFO: renamed from: kk */
    private boolean f16751kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f16752x1;

    public C5924dy(boolean z, boolean z2) {
        setPreserveWhitespace(true);
        this.f16752x1 = z2;
        this.f16750k4 = z;
        this.f16751kk = z;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13940my createAttribute(String str, String str2, String str3) {
        return new C5923du(str, str2, str3, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C14040zm createCDataSection(String str) {
        return new C5933h4(str, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13959qk createComment(String str) {
        return new C5948m9(str, this, this.f16750k4, this.f16752x1);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13940my createDefaultAttribute(String str, String str2, String str3) {
        return new C5923du(str, str2, str3, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13981tl createElement(String str, String str2, String str3) {
        return new C5918c5(str, str2, str3, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13947nk createEntityReference(String str) {
        return new C5939jd(str, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13954ph createProcessingInstruction(String str, String str2) {
        return new C5928fa(str, str2, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13862bp createSignificantWhitespace(String str) {
        return new C5966up(str, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13854aq createTextNode(String str) {
        return new C5983yj(str, this, this.f16750k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.XmlDocument
    public C13939mt createWhitespace(String str) {
        return new C5944ks(str, this, this.f16750k4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        IEnumerator it = getChildNodes().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                if (abstractC13901ga.getNodeType() == 1) {
                    C5956rv.m24097k4(abstractC13901ga, abstractC4705c6, 1, abstractC5941k4);
                    i2 = 2;
                } else {
                    C5956rv.m24097k4(abstractC13901ga, abstractC4705c6, i2, abstractC5941k4);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        IEnumerator it = getChildNodes().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                AbstractC13901ga abstractC13901ga = (AbstractC13901ga) it.next();
                if (abstractC13901ga.getNodeType() == 1) {
                    C5956rv.m24098k4(abstractC13901ga, c6765kp, 1, abstractC5941k4);
                    i2 = 2;
                } else {
                    C5956rv.m24098k4(abstractC13901ga, c6765kp, i2, abstractC5941k4);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16751kk = z;
    }
}
