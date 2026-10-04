package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p331p6.InterfaceC7203x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.j5 */
/* JADX INFO: loaded from: classes4.dex */
public class C11194j5 extends C11232x6 implements InterfaceC7203x1 {

    /* JADX INFO: renamed from: k4 */
    public static Object f38571k4 = new Object();

    /* JADX INFO: renamed from: c5 */
    protected int f38572c5;

    /* JADX INFO: renamed from: du */
    protected String f38573du;

    /* JADX INFO: renamed from: dy */
    protected int f38574dy;

    /* JADX INFO: renamed from: h4 */
    protected String f38575h4;

    /* JADX INFO: renamed from: jd */
    private int f38576jd;

    /* JADX INFO: renamed from: m9 */
    protected int f38577m9 = -1;

    /* JADX INFO: renamed from: to */
    protected C13890ei f38578to;

    public C11194j5(int i) {
        this.f38572c5 = i;
    }

    /* JADX INFO: renamed from: du */
    public final int m53814du() {
        return this.f38576jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m53815h4() {
        int i = this.f38572c5;
        return i == 0 || i == 1;
    }

    @Override // com.aspose.slides.internal.p331p6.InterfaceC7203x1
    /* JADX INFO: renamed from: k4 */
    public final int mo27872k4() {
        return 5;
    }

    /* JADX INFO: renamed from: kk */
    public final C13890ei m53816kk() {
        return this.f38578to;
    }

    /* JADX INFO: renamed from: to */
    public final String m53817to() {
        return this.f38573du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m53818x1() {
        return this.f38574dy;
    }

    @Override // com.aspose.slides.internal.p331p6.InterfaceC7203x1
    /* JADX INFO: renamed from: k4 */
    public final Object mo27873k4(AbstractC7201m9 abstractC7201m9) {
        return ((C11187gf) abstractC7201m9).m53776k4(this);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15078bs)) {
            this.f38573du = strM53752x6;
            this.f38578to = c11212rv.m53927jd(strM53752x6);
            return true;
        }
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15088d4)) {
            return false;
        }
        this.f38577m9 = c11212rv.m53987yj(strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        this.f38574dy = c11212rv.m53977x1();
        this.f38575h4 = c11212rv.m53964to().m53736ix();
        m53853to(c11212rv);
        m53851k4(c11212rv, this.f38578to, "name");
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
            if (this.f38577m9 != -1 && this.f38758x1 != null) {
                throw XsltException.create("The variable or parameter '{0}' cannot have both a 'select' attribute and non-empty content.", this.f38573du);
            }
        }
        this.f38575h4 = this.f38758x1 != null ? C14113y2.m67407k4(this.f38575h4, '#', c11212rv.m53911ck()) : null;
        this.f38576jd = c11212rv.m53928k4(this);
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        Object objM54207x1 = null;
        if (iM54107kk != 0) {
            if (iM54107kk == 1) {
                c11231x1.m54095k4(this.f38576jd, ((C11215sv) c11234xw.m54198ks()).m54015k4());
                c11231x1.m54091jd();
                return;
            } else if (iM54107kk != 2) {
                C6005k4.m24259k4("Invalid execution state inside VariableAction.Execute");
                return;
            } else {
                c11231x1.m54095k4(this.f38576jd, (Object) null);
                c11231x1.m54091jd();
                return;
            }
        }
        if (m53815h4()) {
            if (c11231x1.m54112to(this.f38576jd) != null) {
                c11231x1.m54091jd();
                return;
            }
            c11231x1.m54095k4(this.f38576jd, f38571k4);
        }
        int i = this.f38572c5;
        if (i == 1) {
            objM54207x1 = c11234xw.m54175k4(this.f38578to);
        } else if (i == 3) {
            objM54207x1 = c11234xw.m54207x1(this.f38578to);
        }
        if (objM54207x1 != null) {
            c11231x1.m54095k4(this.f38576jd, objM54207x1);
            c11231x1.m54091jd();
            return;
        }
        int i2 = this.f38577m9;
        if (i2 != -1) {
            c11231x1.m54095k4(this.f38576jd, c11234xw.m54195kk(c11231x1, i2));
            c11231x1.m54091jd();
        } else if (this.f38758x1 == null) {
            c11231x1.m54095k4(this.f38576jd, C14113y2.f47374k4);
            c11231x1.m54091jd();
        } else {
            c11234xw.m54183k4(new C11215sv(this.f38575h4));
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }
}
