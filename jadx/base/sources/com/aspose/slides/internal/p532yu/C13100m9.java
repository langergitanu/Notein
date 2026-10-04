package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13100m9 {

    /* JADX INFO: renamed from: du */
    private int f44105du;

    /* JADX INFO: renamed from: h4 */
    private String f44106h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC13883dt f44107k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13319z7 f44108kk;

    /* JADX INFO: renamed from: to */
    private C12903b2 f44109to;

    /* JADX INFO: renamed from: x1 */
    private C13058k1 f44110x1;

    public C13100m9(AbstractC13883dt abstractC13883dt, C13058k1 c13058k1, AbstractC13319z7 abstractC13319z7) {
        this(abstractC13883dt, c13058k1, abstractC13319z7, new C12903b2());
    }

    /* JADX INFO: renamed from: du */
    public final boolean m61164du() {
        return this.f44105du != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13883dt m61165k4() {
        return this.f44107k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC13319z7 m61176kk() {
        return this.f44108kk;
    }

    /* JADX INFO: renamed from: to */
    public final C12903b2 m61177to() {
        return this.f44109to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13058k1 m61178x1() {
        if (this.f44110x1 == null) {
            this.f44110x1 = new C13058k1(this.f44107k4);
        }
        return this.f44110x1;
    }

    public C13100m9(AbstractC13883dt abstractC13883dt, C13058k1 c13058k1, AbstractC13319z7 abstractC13319z7, C12903b2 c12903b2) {
        this.f44105du = 0;
        this.f44107k4 = abstractC13883dt;
        this.f44110x1 = c13058k1;
        this.f44108kk = abstractC13319z7;
        this.f44109to = c12903b2;
        this.f44106h4 = abstractC13883dt.mo65266k4("http://www.w3.org/XML/1998/namespace");
    }

    /* JADX INFO: renamed from: kk */
    private boolean m61162kk(AbstractC13018hl abstractC13018hl, AbstractC13018hl abstractC13018hl2, C13005gv c13005gv) {
        C12943dd c12943dd = (C12943dd) C7019kk.m27452k4((Object) abstractC13018hl2, C12943dd.class);
        C12943dd c12943dd2 = (C12943dd) C7019kk.m27452k4((Object) abstractC13018hl, C12943dd.class);
        if (c12943dd2 != c12943dd.m60221ss()) {
            return c12943dd2.m60221ss() == c12943dd;
        }
        if (c12943dd2.m60226wp() != null) {
            return false;
        }
        c13005gv.m60652x1(c12943dd.m60210bv(), c12943dd);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61166k4(XmlSchemaException xmlSchemaException) {
        m61167k4(xmlSchemaException, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61179x1(XmlSchemaException xmlSchemaException, int i) {
        if (i == 0) {
            this.f44105du++;
        }
        AbstractC13319z7 abstractC13319z7 = this.f44108kk;
        if (abstractC13319z7 != null) {
            abstractC13319z7.mo12838k4(null, new C13020hq(xmlSchemaException, i));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m61163x1(AbstractC13018hl abstractC13018hl, AbstractC13018hl abstractC13018hl2, C13005gv c13005gv) {
        C13147p5 c13147p5 = (C13147p5) C7019kk.m27452k4((Object) abstractC13018hl2, C13147p5.class);
        C13147p5 c13147p52 = (C13147p5) C7019kk.m27452k4((Object) abstractC13018hl, C13147p5.class);
        if (c13147p52 != c13147p5.m61379dy()) {
            return c13147p52.m61379dy() == c13147p5;
        }
        if (c13147p52.m61388m9() != null) {
            return false;
        }
        c13005gv.m60652x1(c13147p5.m61380h4(), c13147p5);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61167k4(XmlSchemaException xmlSchemaException, int i) {
        if (i == 0) {
            this.f44105du++;
        }
        AbstractC13319z7 abstractC13319z7 = this.f44108kk;
        if (abstractC13319z7 != null) {
            abstractC13319z7.mo12838k4(null, new C13020hq(xmlSchemaException, i));
        } else if (i == 0) {
            throw xmlSchemaException;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61168k4(C13005gv c13005gv, C13890ei c13890ei, AbstractC13018hl abstractC13018hl) {
        String str;
        if (c13890ei.m65289x1().length() == 0) {
            return;
        }
        AbstractC13018hl abstractC13018hlM60649kk = c13005gv.m60649kk(c13890ei);
        if (abstractC13018hlM60649kk == null) {
            c13005gv.m60647k4(c13890ei, abstractC13018hl);
            return;
        }
        if (abstractC13018hlM60649kk == abstractC13018hl) {
            return;
        }
        if (C7019kk.m27469x1(abstractC13018hl, C13149p8.class)) {
            if (C13851ai.m65152k4(this.f44107k4.mo65266k4(c13890ei.m65284k4()), this.f44106h4)) {
                AbstractC13018hl abstractC13018hlM60649kk2 = C13091ly.m61144m9().m61727up().m60649kk(c13890ei);
                if (abstractC13018hlM60649kk == abstractC13018hlM60649kk2) {
                    c13005gv.m60652x1(c13890ei, abstractC13018hl);
                    return;
                } else if (abstractC13018hl == abstractC13018hlM60649kk2) {
                    return;
                }
            } else if (m61161k4(abstractC13018hlM60649kk, abstractC13018hl, c13005gv)) {
                return;
            }
            str = "The attributeGroup '{0}' has already been declared.";
        } else if (C7019kk.m27469x1(abstractC13018hl, C13146p4.class)) {
            if (C13851ai.m65152k4(this.f44107k4.mo65266k4(c13890ei.m65284k4()), this.f44106h4)) {
                AbstractC13018hl abstractC13018hlM60649kk3 = C13091ly.m61144m9().m61701fa().m60649kk(c13890ei);
                if (abstractC13018hlM60649kk == abstractC13018hlM60649kk3) {
                    c13005gv.m60652x1(c13890ei, abstractC13018hl);
                    return;
                } else if (abstractC13018hl == abstractC13018hlM60649kk3) {
                    return;
                }
            }
            str = "The global attribute '{0}' has already been declared.";
        } else if (C7019kk.m27469x1(abstractC13018hl, C13164q9.class)) {
            if (m61162kk(abstractC13018hlM60649kk, abstractC13018hl, c13005gv)) {
                return;
            } else {
                str = "The simpleType '{0}' has already been declared.";
            }
        } else if (C7019kk.m27469x1(abstractC13018hl, C12969en.class)) {
            if (m61162kk(abstractC13018hlM60649kk, abstractC13018hl, c13005gv)) {
                return;
            } else {
                str = "The complexType '{0}' has already been declared.";
            }
        } else if (!C7019kk.m27469x1(abstractC13018hl, C13147p5.class)) {
            str = C7019kk.m27469x1(abstractC13018hl, C13237ul.class) ? "The notation '{0}' has already been declared." : C7019kk.m27469x1(abstractC13018hl, C12887a0.class) ? "The identity constraint '{0}' has already been declared." : "The global element '{0}' has already been declared.";
        } else if (m61163x1(abstractC13018hlM60649kk, abstractC13018hl, c13005gv)) {
            return;
        } else {
            str = "The group '{0}' has already been declared.";
        }
        m61171k4(str, c13890ei.toString(), abstractC13018hl);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61169k4(String str, AbstractC13018hl abstractC13018hl) {
        m61167k4(new XmlSchemaException(str, abstractC13018hl), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61170k4(String str, AbstractC13018hl abstractC13018hl, int i) {
        m61167k4(new XmlSchemaException(str, abstractC13018hl), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61171k4(String str, String str2, AbstractC13018hl abstractC13018hl) {
        m61167k4(new XmlSchemaException(str, str2, abstractC13018hl), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61172k4(String str, String str2, AbstractC13018hl abstractC13018hl, int i) {
        m61167k4(new XmlSchemaException(str, str2, abstractC13018hl), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61173k4(String str, String str2, String str3, AbstractC13018hl abstractC13018hl) {
        m61167k4(new XmlSchemaException(str, new String[]{str2, str3}, abstractC13018hl), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61174k4(String str, String str2, String str3, String str4, int i, int i2) {
        m61167k4(new XmlSchemaException(str, new String[]{str2, str3}, str4, i, i2), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61175k4(String str, String[] strArr, RuntimeException runtimeException, AbstractC13018hl abstractC13018hl) {
        m61167k4(new XmlSchemaException(str, strArr, runtimeException, abstractC13018hl.m60693xk(), abstractC13018hl.m60676ak(), abstractC13018hl.m60678dq(), abstractC13018hl), 0);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m61161k4(AbstractC13018hl abstractC13018hl, AbstractC13018hl abstractC13018hl2, C13005gv c13005gv) {
        C13149p8 c13149p8 = (C13149p8) C7019kk.m27452k4((Object) abstractC13018hl2, C13149p8.class);
        C13149p8 c13149p82 = (C13149p8) C7019kk.m27452k4((Object) abstractC13018hl, C13149p8.class);
        if (c13149p82 != c13149p8.m61395jd()) {
            return c13149p82.m61395jd() == c13149p8;
        }
        if (c13149p82.m61393dy().m60651x1() != 0) {
            return false;
        }
        c13005gv.m60652x1(c13149p8.m61401m9(), c13149p8);
        return true;
    }
}
