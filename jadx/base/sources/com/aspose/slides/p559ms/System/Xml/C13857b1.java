package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13857b1 extends C13941n0 implements ICollection {
    public C13857b1(AbstractC13901ga abstractC13901ga) {
        super(abstractC13901ga);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        int iM65634x1 = m65634x1();
        int i2 = 0;
        while (i2 < iM65634x1) {
            abstractC14092to.m67276kk(this.f46652x1.m65639k4(i2), i);
            i2++;
            i++;
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m65158du(C13940my c13940my) {
        C14023y6 iDInfoByElement;
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46651k4, C13981tl.class);
        if (c13981tl == null || this.f46651k4.getOwnerDocument() == null || (iDInfoByElement = this.f46651k4.getOwnerDocument().getIDInfoByElement(c13981tl.m65900dy())) == null || !C14113y2.m67363du(iDInfoByElement.m66349jd(), c13940my.m65626kk().m66349jd()) || !C14113y2.m67363du(iDInfoByElement.m66347dy(), c13940my.m65626kk().m66347dy())) {
            return;
        }
        this.f46651k4.getOwnerDocument().addElementWithId(c13940my.getValue(), c13981tl);
    }

    /* JADX INFO: renamed from: dy */
    public final C13940my m65159dy(C13940my c13940my) {
        AbstractC13901ga abstractC13901gaMo65173x1 = super.mo65173x1((AbstractC13901ga) c13940my);
        m65158du(c13940my);
        return (C13940my) abstractC13901gaMo65173x1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m65160h4(C13940my c13940my) {
        C14023y6 iDInfoByElement;
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46651k4, C13981tl.class);
        if (c13981tl == null || this.f46651k4.getOwnerDocument() == null || (iDInfoByElement = this.f46651k4.getOwnerDocument().getIDInfoByElement(c13981tl.m65900dy())) == null || !C14113y2.m67363du(iDInfoByElement.m66349jd(), c13940my.m65626kk().m66349jd()) || !C14113y2.m67363du(iDInfoByElement.m66347dy(), c13940my.m65626kk().m66347dy())) {
            return;
        }
        this.f46651k4.getOwnerDocument().removeElementWithId(c13940my.getValue(), c13981tl);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m65161k4(C13940my c13940my) {
        for (int i = 0; i < this.f46652x1.m65638k4(); i++) {
            C13940my c13940my2 = (C13940my) this.f46652x1.m65639k4(i);
            if (c13940my2.m65629x1() == c13940my.m65629x1() && C14113y2.m67363du(c13940my2.getLocalName(), c13940my.getLocalName()) && C14113y2.m67363du(c13940my2.getNamespaceURI(), c13940my.getNamespaceURI())) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13941n0
    /* JADX INFO: renamed from: kk */
    public AbstractC13901ga mo65168kk(int i) {
        AbstractC13901ga abstractC13901gaMo65168kk = super.mo65168kk(i);
        m65160h4((C13940my) abstractC13901gaMo65168kk);
        C13940my defaultAttribute = this.f46651k4.getOwnerDocument().getDefaultAttribute((C13981tl) this.f46651k4, abstractC13901gaMo65168kk.getPrefix(), abstractC13901gaMo65168kk.getLocalName(), abstractC13901gaMo65168kk.getNamespaceURI());
        if (defaultAttribute != null) {
            mo65162k4(i, defaultAttribute);
        }
        return abstractC13901gaMo65168kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m65171m9(C13940my c13940my) {
        int iM65632to = m65632to(c13940my.getLocalName(), c13940my.getNamespaceURI());
        if (iM65632to != -1) {
            C13940my c13940my2 = (C13940my) this.f46652x1.m65639k4(iM65632to);
            super.mo65168kk(iM65632to);
            m65160h4(c13940my2);
        }
        return iM65632to;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return super.m65634x1();
    }

    /* JADX INFO: renamed from: to */
    public final void m65172to(C13940my c13940my) {
        c13940my.m65623h4().getAttributes().m65169kk(c13940my);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13941n0
    /* JADX INFO: renamed from: x1 */
    public AbstractC13901ga mo65173x1(AbstractC13901ga abstractC13901ga) {
        C13940my c13940my = (C13940my) abstractC13901ga;
        m65171m9(c13940my);
        AbstractC13901ga abstractC13901gaMo65173x1 = super.mo65173x1(abstractC13901ga);
        m65158du(c13940my);
        return abstractC13901gaMo65173x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13941n0
    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo65162k4(int i, AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga abstractC13901gaMo65162k4 = super.mo65162k4(i, abstractC13901ga);
        m65158du((C13940my) abstractC13901ga);
        return abstractC13901gaMo65162k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C13940my m65169kk(C13940my c13940my) {
        int iM65638k4 = this.f46652x1.m65638k4();
        for (int i = 0; i < iM65638k4; i++) {
            if (this.f46652x1.m65639k4(i) == c13940my) {
                mo65168kk(i);
                return c13940my;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13940my m65174x1(int i) {
        if (i < 0 || i >= m65634x1()) {
            return null;
        }
        return (C13940my) mo65168kk(i);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13941n0
    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo65163k4(AbstractC13901ga abstractC13901ga) {
        if (abstractC13901ga != null && !C7019kk.m27469x1(abstractC13901ga, C13940my.class)) {
            throw new ArgumentException(C13968ri.m65818k4("An 'Attributes' collection can only contain 'Attribute' objects."));
        }
        int iM65632to = m65632to(abstractC13901ga.getLocalName(), abstractC13901ga.getNamespaceURI());
        if (iM65632to == -1) {
            return m65159dy((C13940my) abstractC13901ga);
        }
        AbstractC13901ga abstractC13901gaMo65168kk = super.mo65168kk(iM65632to);
        mo65162k4(iM65632to, abstractC13901ga);
        return abstractC13901gaMo65168kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m65170kk(String str, String str2) {
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46651k4, C13981tl.class);
        XmlDocument ownerDocument = this.f46651k4.getOwnerDocument();
        ownerDocument.removeElementWithId(str, c13981tl);
        ownerDocument.addElementWithId(str2, c13981tl);
    }

    /* JADX INFO: renamed from: x1 */
    public final C13940my m65175x1(C13940my c13940my) {
        XmlDocument ownerDocument = c13940my.getOwnerDocument();
        if (ownerDocument != null && ownerDocument.isLoading()) {
            super.m65630k4(c13940my, ownerDocument);
            m65158du(c13940my);
            return c13940my;
        }
        if (ownerDocument != null && ownerDocument != this.f46651k4.getOwnerDocument()) {
            throw new ArgumentException(C13968ri.m65818k4("The named node is from a different document context."));
        }
        if (c13940my.m65623h4() != null) {
            m65172to(c13940my);
        }
        mo65173x1((AbstractC13901ga) c13940my);
        return c13940my;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13940my m65164k4(int i) {
        try {
            return (C13940my) this.f46652x1.m65639k4(i);
        } catch (ArgumentOutOfRangeException unused) {
            throw new IndexOutOfRangeException(C13968ri.m65818k4("The index being passed in is out of range."));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m65176x1(String str, String str2) {
        C14023y6 iDInfoByElement = this.f46651k4.getOwnerDocument().getIDInfoByElement(((C13981tl) C7019kk.m27452k4((Object) this.f46651k4, C13981tl.class)).m65900dy());
        return iDInfoByElement != null && C14113y2.m67363du(iDInfoByElement.m66349jd(), str) && C14113y2.m67363du(iDInfoByElement.m66347dy(), str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C13940my m65165k4(String str) {
        int iM66343k4 = C14023y6.m66343k4(str);
        for (int i = 0; i < this.f46652x1.m65638k4(); i++) {
            C13940my c13940my = (C13940my) this.f46652x1.m65639k4(i);
            if (iM66343k4 == c13940my.m65629x1() && C14113y2.m67363du(str, c13940my.getName())) {
                return c13940my;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13940my m65166k4(String str, String str2) {
        int iM66343k4 = C14023y6.m66343k4(str);
        for (int i = 0; i < this.f46652x1.m65638k4(); i++) {
            C13940my c13940my = (C13940my) this.f46652x1.m65639k4(i);
            if (iM66343k4 == c13940my.m65629x1() && C14113y2.m67363du(str, c13940my.getLocalName()) && C14113y2.m67363du(str2, c13940my.getNamespaceURI())) {
                return c13940my;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65167k4() {
        int iM65634x1 = m65634x1();
        while (iM65634x1 > 0) {
            iM65634x1--;
            m65174x1(iM65634x1);
        }
    }
}
