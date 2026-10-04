package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.ig */
/* JADX INFO: loaded from: classes4.dex */
public class C11191ig extends AbstractC11200ks implements Cloneable {

    /* JADX INFO: renamed from: u4 */
    private static final C7017h4 f38538u4 = new C7017h4("xml", "html", "text");

    /* JADX INFO: renamed from: c5 */
    private boolean f38539c5;

    /* JADX INFO: renamed from: ck */
    private String f38540ck;

    /* JADX INFO: renamed from: du */
    private String f38541du;

    /* JADX INFO: renamed from: ix */
    private Hashtable f38545ix;

    /* JADX INFO: renamed from: ks */
    private boolean f38549ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f38550m9;

    /* JADX INFO: renamed from: up */
    private String f38554up;

    /* JADX INFO: renamed from: k4 */
    private int f38547k4 = 4;

    /* JADX INFO: renamed from: x1 */
    private int f38555x1 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: kk */
    private AbstractC6747ar f38548kk = AbstractC6747ar.m26635ix();

    /* JADX INFO: renamed from: to */
    private int f38553to = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h4 */
    private int f38544h4 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: dy */
    private int f38542dy = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: jd */
    private int f38546jd = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: fa */
    private int f38543fa = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: yj */
    private int f38557yj = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: rv */
    private int f38552rv = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: x6 */
    private String f38556x6 = "text/html";

    /* JADX INFO: renamed from: ne */
    private int f38551ne = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k4 */
    private static int m53803k4(String str, C11212rv c11212rv) {
        C13890ei c13890eiM53927jd = c11212rv.m53927jd(str);
        if (c13890eiM53927jd.m65284k4().length() != 0) {
            return 3;
        }
        int iM27428k4 = f38538u4.m27428k4(c13890eiM53927jd.m65289x1());
        if (iM27428k4 == 0) {
            return 0;
        }
        int i = 1;
        if (iM27428k4 != 1) {
            i = 2;
            if (iM27428k4 != 2) {
                if (c11212rv.m53919fa()) {
                    return 4;
                }
                throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "method", str);
            }
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15071ai)) {
            if (c11212rv.m53977x1() <= this.f38555x1) {
                this.f38547k4 = m53803k4(strM53752x6, c11212rv);
                this.f38555x1 = c11212rv.m53977x1();
                if (this.f38552rv == Integer.MAX_VALUE) {
                    this.f38549ks = this.f38547k4 == 1;
                }
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15150tl)) {
            if (c11212rv.m53977x1() <= this.f38544h4) {
                this.f38541du = strM53752x6;
                this.f38544h4 = c11212rv.m53977x1();
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15076b3)) {
            if (c11212rv.m53977x1() <= this.f38553to) {
                try {
                    this.f38548kk = AbstractC6747ar.m26640kk(strM53752x6);
                    this.f38553to = c11212rv.m53977x1();
                } catch (ArgumentException | UnsupportedOperationException unused) {
                }
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15131nv)) {
            if (c11212rv.m53977x1() <= this.f38542dy) {
                this.f38550m9 = c11212rv.m53916dy(strM53752x6);
                this.f38542dy = c11212rv.m53977x1();
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15137qk)) {
            if (c11212rv.m53977x1() <= this.f38546jd) {
                this.f38539c5 = c11212rv.m53916dy(strM53752x6);
                this.f38546jd = c11212rv.m53977x1();
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15157um)) {
            if (c11212rv.m53977x1() <= this.f38543fa) {
                this.f38540ck = strM53752x6;
                this.f38543fa = c11212rv.m53977x1();
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15080bv)) {
            if (c11212rv.m53977x1() <= this.f38557yj) {
                this.f38554up = strM53752x6;
                this.f38557yj = c11212rv.m53977x1();
            }
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15149t6)) {
            if (c11212rv.m53977x1() <= this.f38552rv) {
                this.f38549ks = c11212rv.m53916dy(strM53752x6);
                this.f38552rv = c11212rv.m53977x1();
            }
        } else if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15097em)) {
            if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15113jd)) {
                return false;
            }
            String[] strArrM65133v4 = C13850af.m65133v4(strM53752x6);
            if (this.f38545ix == null) {
                this.f38545ix = new Hashtable(strArrM65133v4.length);
            }
            for (String str : strArrM65133v4) {
                C13890ei c13890eiM53910ck = c11212rv.m53910ck(str);
                this.f38545ix.set_Item(c13890eiM53910ck, c13890eiM53910ck);
            }
        } else if (c11212rv.m53977x1() <= this.f38551ne) {
            this.f38556x6 = strM53752x6;
            this.f38551ne = c11212rv.m53977x1();
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m53804x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53850du(c11212rv);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
    }
}
