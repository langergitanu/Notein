package com.aspose.slides.internal.p430tx;

import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13988u1;
import com.aspose.slides.p559ms.System.Xml.C14022y4;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.t6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11216t6 extends C11232x6 {

    /* JADX INFO: renamed from: k4 */
    private C11204m9 f38699k4;

    /* JADX INFO: renamed from: to */
    private String f38700to;

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk == 1) {
                if (c11234xw.m54163du(7)) {
                    c11231x1.m54091jd();
                    return;
                } else {
                    c11231x1.m54094k4(1);
                    return;
                }
            }
            if (iM54107kk != 3) {
                C6005k4.m24259k4("Invalid ElementAction execution state");
                c11231x1.m54091jd();
                return;
            } else if (!c11234xw.m54188k4(7, C14113y2.f47374k4, c11231x1.m54113x1(), C14113y2.f47374k4, false)) {
                c11231x1.m54094k4(3);
                return;
            } else {
                c11234xw.m54184k4(c11231x1);
                c11231x1.m54094k4(1);
                return;
            }
        }
        C11204m9 c11204m9 = this.f38699k4;
        if (c11204m9 == null) {
            c11231x1.m54105k4(this.f38700to);
            if (this.f38700to == null) {
                c11231x1.m54091jd();
                return;
            }
        } else {
            c11231x1.m54105k4(c11204m9.m53859k4(c11234xw, c11231x1));
            if (!m54016k4(c11231x1.m54113x1())) {
                c11231x1.m54091jd();
                return;
            }
        }
        if (!c11234xw.m54188k4(7, C14113y2.f47374k4, c11231x1.m54113x1(), C14113y2.f47374k4, false)) {
            c11231x1.m54094k4(3);
        } else {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15078bs)) {
            return false;
        }
        this.f38699k4 = C11204m9.m53858k4(c11212rv, strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53851k4(c11212rv, this.f38699k4, "name");
        if (this.f38699k4.m53860k4()) {
            String strM53859k4 = this.f38699k4.m53859k4((C11234xw) null, (C11231x1) null);
            this.f38700to = strM53859k4;
            this.f38699k4 = null;
            if (!m54016k4(strM53859k4)) {
                this.f38700to = null;
            }
        }
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54016k4(String str) {
        int iM66230to;
        if (str == null) {
            return false;
        }
        int length = str.length();
        C14022y4 c14022y4Clone = C14022y4.m66318k4().Clone();
        int i = 0;
        while (i < length && c14022y4Clone.m66333k4(str.charAt(i))) {
            i++;
        }
        if (i >= length || (iM66230to = C13988u1.m66230to(str, i)) == 0) {
            return false;
        }
        int i2 = i + iM66230to;
        while (i2 < length && c14022y4Clone.m66333k4(str.charAt(i2))) {
            i2++;
        }
        if (i2 < length) {
            return false;
        }
        return (length == 3 && (str.charAt(0) == 'X' || str.charAt(0) == 'x') && ((str.charAt(1) == 'M' || str.charAt(1) == 'm') && (str.charAt(2) == 'L' || str.charAt(2) == 'l'))) ? false : true;
    }
}
