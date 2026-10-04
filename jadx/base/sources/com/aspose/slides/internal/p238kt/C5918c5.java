package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.SortedList;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13857b1;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C5918c5 extends C13981tl implements InterfaceC5919c6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f16738k4;

    public C5918c5(String str, String str2, String str3, XmlDocument xmlDocument, boolean z) {
        super(str, str2, str3, xmlDocument);
        this.f16738k4 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23905k4(AbstractC4705c6 abstractC4705c6, int i, AbstractC5941k4 abstractC5941k4) {
        AbstractC4705c6 abstractC4705c62;
        Hashtable hashtable = new Hashtable();
        SortedList sortedList = new SortedList(new C5927f9());
        SortedList sortedList2 = new SortedList(new C5975x1());
        C6783wp c6783wp = new C6783wp(false);
        C13857b1 attributes = getAttributes();
        if (attributes != null) {
            IEnumerator it = attributes.iterator();
            while (it.hasNext()) {
                try {
                    C13940my c13940my = (C13940my) it.next();
                    if (((C5923du) c13940my).m23939k4() || C5934he.m23985k4((AbstractC13901ga) c13940my) || C5934he.m24002x1((AbstractC13901ga) c13940my)) {
                        if (C5934he.m23985k4((AbstractC13901ga) c13940my)) {
                            abstractC5941k4.mo23936k4(c13940my, sortedList, hashtable);
                        } else if (C5934he.m24002x1((AbstractC13901ga) c13940my)) {
                            abstractC5941k4.mo23937k4(c13940my, sortedList, sortedList2, hashtable);
                        } else if (m23908k4()) {
                            sortedList2.addItem(c13940my, null);
                        }
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
        if (!C5934he.m23990k4(this, getPrefix(), getNamespaceURI())) {
            C13940my c13940myCreateAttribute = getOwnerDocument().createAttribute(getPrefix().length() > 0 ? C14113y2.m67408k4("xmlns", C18241k5.f55433h, getPrefix()) : "xmlns");
            c13940myCreateAttribute.setValue(getNamespaceURI());
            abstractC5941k4.mo23936k4(c13940myCreateAttribute, sortedList, hashtable);
        }
        if (m23908k4()) {
            abstractC5941k4.mo23938k4(this, sortedList2, sortedList, hashtable);
            byte[] bArrMo26677to = c6783wp.mo26677to(C14113y2.m67408k4("<", getName()));
            abstractC4705c62 = abstractC4705c6;
            abstractC4705c62.mo19562k4(bArrMo26677to, 0, bArrMo26677to.length, bArrMo26677to, 0);
            Iterator it2 = sortedList.getKeyList().iterator();
            while (it2.hasNext()) {
                try {
                    ((C5923du) C7019kk.m27452k4(it2.next(), C5923du.class)).mo23905k4(abstractC4705c6, i, abstractC5941k4);
                } finally {
                    if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it2).dispose();
                    }
                }
            }
            if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it2).dispose();
            }
            it2 = sortedList2.getKeyList().iterator();
            while (it2.hasNext()) {
                try {
                    ((C5923du) C7019kk.m27452k4(it2.next(), C5923du.class)).mo23905k4(abstractC4705c6, i, abstractC5941k4);
                } finally {
                    if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it2).dispose();
                    }
                }
            }
            byte[] bArrMo26677to2 = c6783wp.mo26677to(">");
            abstractC4705c62.mo19562k4(bArrMo26677to2, 0, bArrMo26677to2.length, bArrMo26677to2, 0);
        } else {
            abstractC4705c62 = abstractC4705c6;
        }
        abstractC5941k4.m24046x1();
        abstractC5941k4.m24041k4(hashtable);
        abstractC5941k4.m24042k4(sortedList);
        IEnumerator it3 = getChildNodes().iterator();
        while (it3.hasNext()) {
            try {
                C5956rv.m24097k4((AbstractC13901ga) it3.next(), abstractC4705c6, i, abstractC5941k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        abstractC5941k4.m24044kk();
        if (m23908k4()) {
            byte[] bArrMo26677to3 = c6783wp.mo26677to(C14113y2.m67408k4("</", getName(), ">"));
            abstractC4705c62.mo19562k4(bArrMo26677to3, 0, bArrMo26677to3.length, bArrMo26677to3, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23906k4(C6765kp c6765kp, int i, AbstractC5941k4 abstractC5941k4) {
        Hashtable hashtable = new Hashtable();
        SortedList sortedList = new SortedList(new C5927f9());
        SortedList sortedList2 = new SortedList(new C5975x1());
        C13857b1 attributes = getAttributes();
        if (attributes != null) {
            IEnumerator it = attributes.iterator();
            while (it.hasNext()) {
                try {
                    C13940my c13940my = (C13940my) it.next();
                    if (((C5923du) c13940my).m23939k4() || C5934he.m23985k4((AbstractC13901ga) c13940my) || C5934he.m24002x1((AbstractC13901ga) c13940my)) {
                        if (C5934he.m23985k4((AbstractC13901ga) c13940my)) {
                            abstractC5941k4.mo23936k4(c13940my, sortedList, hashtable);
                        } else if (C5934he.m24002x1((AbstractC13901ga) c13940my)) {
                            abstractC5941k4.mo23937k4(c13940my, sortedList, sortedList2, hashtable);
                        } else if (m23908k4()) {
                            sortedList2.addItem(c13940my, null);
                        }
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
        if (!C5934he.m23990k4(this, getPrefix(), getNamespaceURI())) {
            C13940my c13940myCreateAttribute = getOwnerDocument().createAttribute(getPrefix().length() > 0 ? C14113y2.m67408k4("xmlns", C18241k5.f55433h, getPrefix()) : "xmlns");
            c13940myCreateAttribute.setValue(getNamespaceURI());
            abstractC5941k4.mo23936k4(c13940myCreateAttribute, sortedList, hashtable);
        }
        if (m23908k4()) {
            abstractC5941k4.mo23938k4(this, sortedList2, sortedList, hashtable);
            c6765kp.m26792k4(C14113y2.m67408k4("<", getName()));
            Iterator it2 = sortedList.getKeyList().iterator();
            while (it2.hasNext()) {
                try {
                    ((C5923du) C7019kk.m27452k4(it2.next(), C5923du.class)).mo23906k4(c6765kp, i, abstractC5941k4);
                } finally {
                }
            }
            if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it2).dispose();
            }
            it2 = sortedList2.getKeyList().iterator();
            while (it2.hasNext()) {
                try {
                    ((C5923du) C7019kk.m27452k4(it2.next(), C5923du.class)).mo23906k4(c6765kp, i, abstractC5941k4);
                } finally {
                }
            }
            if (C7019kk.m27456k4(it2, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it2).dispose();
            }
            c6765kp.m26792k4(">");
        }
        abstractC5941k4.m24046x1();
        abstractC5941k4.m24041k4(hashtable);
        abstractC5941k4.m24042k4(sortedList);
        IEnumerator it3 = getChildNodes().iterator();
        while (it3.hasNext()) {
            try {
                C5956rv.m24098k4((AbstractC13901ga) it3.next(), c6765kp, i, abstractC5941k4);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it3).dispose();
                }
            }
        }
        abstractC5941k4.m24044kk();
        if (m23908k4()) {
            c6765kp.m26792k4(C14113y2.m67408k4("</", getName(), ">"));
        }
    }

    @Override // com.aspose.slides.internal.p238kt.InterfaceC5919c6
    /* JADX INFO: renamed from: k4 */
    public final void mo23907k4(boolean z) {
        this.f16738k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m23908k4() {
        return this.f16738k4;
    }
}
