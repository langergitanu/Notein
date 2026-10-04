package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p021af.C1369x1;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class b4a extends umg {

    /* JADX INFO: renamed from: k4 */
    private final List<AbstractC10973uz> f4122k4;

    public b4a(C14247oq c14247oq, C12804k4 c12804k4) {
        super(c14247oq, c12804k4);
        this.f4122k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    private int m3997k4(C12804k4 c12804k4) {
        Integer[] numArr = {0};
        int iIntValue = m68059k4().m68749k4().tryGetValue(c12804k4, numArr) ? numArr[0].intValue() : 0;
        numArr[0].getClass();
        return iIntValue;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC10973uz[] m4002to() {
        return this.f4122k4.toArray(new AbstractC10973uz[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4003x1(AbstractC10973uz abstractC10973uz) {
        this.f4122k4.addItem(abstractC10973uz);
    }

    /* JADX INFO: renamed from: k4 */
    private TextFrame m3998k4(C1369x1 c1369x1, float f) {
        C12007ix c12007ixClone = c1369x1.m8124kk().Clone();
        m71736k4((AutoShape) m68059k4().m68747du().addAutoShape(5, m68061x1().m56897x1(), m68058k4(m4002to()[0]).Clone().m56895kk() + f, c12007ixClone.m56550c5(), 0.0f));
        m71735du().getShapeStyle().setFillStyleIndex((short) 0);
        m71735du().getShapeStyle().setLineStyleIndex(0);
        m71735du().getShapeStyle().setFontCollectionIndex((byte) 0);
        m71735du().getShapeStyle().getFontColor().setSchemeColor(1);
        m71735du().addTextFrame("");
        TextFrame textFrame = (TextFrame) m71735du().getTextFrame();
        textFrame.getTextFrameFormat().setAutofitType((byte) 2);
        textFrame.getTextFrameFormat().setAnchoringType((byte) 0);
        ((TextFrameFormat) textFrame.getTextFrameFormat()).m2953k4(xmh.f50156k4.Clone());
        textFrame.getParagraphs().clear();
        return textFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4001k4(TextFrame textFrame) {
        m4000k4(textFrame, m68060kk());
    }

    /* JADX INFO: renamed from: k4 */
    private void m3999k4(TextFrame textFrame, float f, C12804k4 c12804k4, IGenericList<InterfaceC12777qq> iGenericList) {
        if (iGenericList.size() == 0) {
            return;
        }
        if (textFrame == null) {
            textFrame = m3998k4(m68059k4().m68752x1().mo8118x1(c12804k4), f);
        }
        new C14782xd((ParagraphCollection) textFrame.getParagraphs(), m68059k4().m68750kk(), m68059k4().m68751to(), true).m63244k4(c12804k4, iGenericList);
        iGenericList.clear();
    }

    /* JADX INFO: renamed from: k4 */
    private void m4000k4(TextFrame textFrame, C12804k4 c12804k4) {
        IGenericEnumerator<IParagraph> it;
        boolean zM27456k4;
        float fM56558k4 = 0.0f;
        if ((m3997k4(c12804k4) & 12) != 0) {
            List list = new List();
            it = c12804k4.mo22671yd().iterator();
            while (it.hasNext()) {
                try {
                    InterfaceC12777qq next = it.next();
                    if (C7019kk.m27469x1(next, C12804k4.class)) {
                        C12804k4 c12804k42 = (C12804k4) next;
                        if ((m3997k4(c12804k42) & 12) != 0) {
                            m3999k4(textFrame, fM56558k4, c12804k4, list);
                            if (!C14722w3.m72633x1(c12804k42) && !C14722w3.m72629k4(c12804k4)) {
                                m4000k4(textFrame, c12804k42);
                            }
                            fM56558k4 = (m68059k4().m68752x1().mo8118x1(c12804k42).m8124kk().m56558k4() - m68059k4().m68752x1().mo8118x1(c12804k4).m8124kk().m56554dy()) * 0.75f;
                        } else if (C14722w3.m72625c5(c12804k42)) {
                        }
                    }
                    list.addItem(next);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            m3999k4(textFrame, fM56558k4, c12804k4, list);
            return;
        }
        if (textFrame == null) {
            textFrame = m3998k4(m68059k4().m68752x1().mo8118x1(c12804k4), 0.0f);
        }
        new C14782xd((ParagraphCollection) textFrame.getParagraphs(), m68059k4().m68750kk(), m68059k4().m68751to(), true).m63242k4((AbstractC5535bv) c12804k4);
        if (C14722w3.m72631m9(c12804k4)) {
            IGenericEnumerator<IParagraph> it2 = textFrame.getParagraphs().iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().getParagraphFormat().setAlignment(1);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        if (C14722w3.m72627dy(c12804k4)) {
            it = textFrame.getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    IGenericEnumerator<IPortion> it3 = it.next().getPortions().iterator();
                    while (it3.hasNext()) {
                        try {
                            it3.next().getPortionFormat().setFontBold((byte) 1);
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        it3.dispose();
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }
}
