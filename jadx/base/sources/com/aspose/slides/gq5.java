package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gq5 {

    /* JADX INFO: renamed from: k4 */
    public static final String f5329k4 = C14113y2.m67408k4("text:", "a");

    /* JADX INFO: renamed from: h4 */
    private static final String f5328h4 = C14113y2.m67408k4("text:", "s");

    /* JADX INFO: renamed from: x1 */
    public static final String f5332x1 = C14113y2.m67408k4("text:", "tab");

    /* JADX INFO: renamed from: kk */
    public static final String f5330kk = C14113y2.m67408k4("text:", "line-break");

    /* JADX INFO: renamed from: to */
    public static final String f5331to = C14113y2.m67408k4("text:", "page-number");

    /* JADX INFO: renamed from: du */
    public static final String f5327du = C14113y2.m67408k4("text:", "date");

    /* JADX INFO: renamed from: k4 */
    public static void m6887k4(IPortionFormat iPortionFormat, com.aspose.slides.internal.p332p7.hqi hqiVar, wxb wxbVar) {
        if (hqiVar == null) {
            throw new ArgumentNullException("aElement");
        }
        String strM33589k4 = hqiVar.m33589k4();
        if (C14113y2.m67411k4(strM33589k4)) {
            return;
        }
        if (!C14113y2.m67448x1(strM33589k4, "#")) {
            iPortionFormat.setHyperlinkClick(new Hyperlink(true, strM33589k4, 1));
        } else {
            iPortionFormat.setHyperlinkClick(new Hyperlink(false, strM33589k4, 8));
            wxbVar.m72957k4().m69956m9().addItem((Hyperlink) iPortionFormat.getHyperlinkClick());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m6890x1(Portion portion, com.aspose.slides.internal.p332p7.omk omkVar, wxb wxbVar, gga ggaVar) {
        String strM39917x1;
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<C7394ca> it = omkVar.m38371x1().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                String strM72719k4 = null;
                if (f5329k4.equals(next.m29539k4())) {
                    com.aspose.slides.internal.p332p7.hqi hqiVar = (com.aspose.slides.internal.p332p7.hqi) next.m29542x1();
                    it = hqiVar.m33591x1().iterator();
                    while (it.hasNext()) {
                        try {
                            C7394ca next2 = it.next();
                            if ("_TEXT".equals(next2.m29539k4())) {
                                strM72719k4 = (String) next2.m29541kk();
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    m6887k4(portion.getPortionFormat(), hqiVar, wxbVar);
                } else {
                    if (f5330kk.equals(next.m29539k4())) {
                        strM39917x1 = "\u000b";
                    } else if (f5328h4.equals(next.m29539k4())) {
                        int iM45326k4 = (int) ((com.aspose.slides.internal.p332p7.z1e) next.m29542x1()).m45326k4();
                        if (iM45326k4 > 0) {
                            c6765kp.m26783k4(ControlChar.SPACE_CHAR, iM45326k4);
                        } else if (c6765kp.m26807x1() == 0) {
                            c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                        }
                    } else if (f5332x1.equals(next.m29539k4())) {
                        strM39917x1 = "\t";
                    } else if (f5331to.equals(next.m29539k4())) {
                        portion.addField("slidenum");
                        ((Field) portion.getField()).m1445k4(new C14047bz("93AE1883-0942-4AA3-9DB2-9C7C3A0314B1"));
                        strM39917x1 = C14113y2.m67408k4("‹", "#", "›");
                    } else if (f5327du.equals(next.m29539k4())) {
                        com.aspose.slides.internal.p332p7.r9q r9qVar = (com.aspose.slides.internal.p332p7.r9q) next.m29542x1();
                        if (r9qVar.m39916k4() != 1) {
                            portion.addField(FieldType.getDateTime());
                            ((Field) portion.getField()).m1445k4(new C14047bz("E8FD0B7A-F5DD-4F40-B4CB-3B2C354B893A"));
                        } else if (!C14113y2.m67411k4(r9qVar.m39917x1())) {
                            strM39917x1 = r9qVar.m39917x1();
                        }
                    } else {
                        strM72719k4 = wgi.m72719k4(next);
                    }
                    c6765kp.m26792k4(strM39917x1);
                }
                if (strM72719k4 != null) {
                    c6765kp.m26792k4(strM72719k4);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        portion.m2289k4(c6765kp.toString());
        m6889k4(portion, omkVar.m38370k4(), wxbVar, ggaVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6888k4(Portion portion, com.aspose.slides.internal.p332p7.omk omkVar, wxb wxbVar, gga ggaVar) {
        if (portion == null) {
            throw new ArgumentNullException("portion");
        }
        if (omkVar == null) {
            throw new ArgumentNullException("spanElementData");
        }
        if (omkVar.m38371x1() != null && omkVar.m38371x1().size() != 0) {
            m6890x1(portion, omkVar, wxbVar, ggaVar);
        } else {
            portion.m2289k4("");
            m6889k4(portion, omkVar.m38370k4(), wxbVar, ggaVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6889k4(Portion portion, String str, wxb wxbVar, gga ggaVar) {
        if (wgi.m72727k4(ggaVar)) {
            wr8.m72900k4(portion, ggaVar.m6642k4(), wxbVar);
        }
        if (wgi.m72731kk(str)) {
            wr8.m72900k4(portion, str, wxbVar);
        }
    }
}
