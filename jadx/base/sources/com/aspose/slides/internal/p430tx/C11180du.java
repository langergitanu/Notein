package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11180du extends C11232x6 {

    /* JADX INFO: renamed from: du */
    private C11233xk f38490du;

    /* JADX INFO: renamed from: dy */
    private C11184f9 f38491dy;

    /* JADX INFO: renamed from: h4 */
    private String f38492h4;

    /* JADX INFO: renamed from: k4 */
    private C11204m9 f38493k4;

    /* JADX INFO: renamed from: m9 */
    private String f38494m9;

    /* JADX INFO: renamed from: to */
    private C11204m9 f38495to;

    /* JADX INFO: renamed from: k4 */
    private static C11184f9 m53706k4(String str, String str2, C11233xk c11233xk) {
        if ("xmlns".equals(str)) {
            return null;
        }
        if ("http://www.w3.org/2000/xmlns/".equals(str2)) {
            throw XsltException.create("Elements and attributes cannot belong to the reserved namespace '{0}'.", str2);
        }
        C11184f9 c11184f9 = new C11184f9();
        c11184f9.m53727k4(str);
        if (str2 == null) {
            str2 = c11233xk.m54155x1(c11184f9.f38507k4);
        }
        c11184f9.f38508kk = str2;
        if (C14113y2.m67412k4(c11184f9.f38507k4, "xml", (short) 4)) {
            if (c11184f9.f38507k4.length() == 3) {
                if (!"http://www.w3.org/XML/1998/namespace".equals(c11184f9.f38508kk) || (!CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL.equals(c11184f9.f38509x1) && !"space".equals(c11184f9.f38509x1))) {
                    c11184f9.m53726k4();
                    return c11184f9;
                }
            } else if ("xmlns".equals(c11184f9.f38507k4)) {
                if ("http://www.w3.org/2000/xmlns/".equals(c11184f9.f38508kk)) {
                    throw XsltException.create("Prefix '{0}' is not defined.", c11184f9.f38507k4);
                }
                c11184f9.m53726k4();
                return c11184f9;
            }
        }
        return c11184f9;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15078bs)) {
            this.f38493k4 = C11204m9.m53858k4(c11212rv, strM53752x6);
            return true;
        }
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15107he)) {
            return false;
        }
        this.f38495to = C11204m9.m53858k4(c11212rv, strM53752x6);
        return true;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53851k4(c11212rv, this.f38493k4, "name");
        C11204m9[] c11204m9Arr = {this.f38493k4};
        this.f38492h4 = AbstractC11200ks.m53849k4(c11204m9Arr);
        this.f38493k4 = c11204m9Arr[0];
        C11204m9[] c11204m9Arr2 = {this.f38495to};
        this.f38494m9 = AbstractC11200ks.m53849k4(c11204m9Arr2);
        C11204m9 c11204m9 = c11204m9Arr2[0];
        this.f38495to = c11204m9;
        if (this.f38493k4 != null || c11204m9 != null) {
            this.f38490du = c11212rv.m53925ix();
        } else if (!"xmlns".equals(this.f38492h4)) {
            this.f38491dy = m53706k4(this.f38492h4, this.f38494m9, c11212rv.m53925ix());
        }
        if (c11212rv.m53924h4()) {
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk == 1) {
                if (c11234xw.m54163du(2)) {
                    c11231x1.m54091jd();
                    return;
                } else {
                    c11231x1.m54094k4(1);
                    return;
                }
            }
            if (iM54107kk != 2) {
                C6005k4.m24259k4("Invalid ElementAction execution state");
                return;
            }
            C11184f9 c11184f9M54092k4 = c11231x1.m54092k4();
            if (!c11234xw.m54188k4(2, c11184f9M54092k4.f38507k4, c11184f9M54092k4.f38509x1, c11184f9M54092k4.f38508kk, false)) {
                c11231x1.m54094k4(2);
                return;
            } else {
                c11234xw.m54184k4(c11231x1);
                c11231x1.m54094k4(1);
                return;
            }
        }
        C11184f9 c11184f9 = this.f38491dy;
        if (c11184f9 != null) {
            c11231x1.m54097k4(c11184f9);
        } else {
            C11204m9 c11204m9 = this.f38493k4;
            String strM53859k4 = c11204m9 == null ? this.f38492h4 : c11204m9.m53859k4(c11234xw, c11231x1);
            C11204m9 c11204m92 = this.f38495to;
            c11231x1.m54097k4(m53706k4(strM53859k4, c11204m92 == null ? this.f38494m9 : c11204m92.m53859k4(c11234xw, c11231x1), this.f38490du));
            if (c11231x1.m54092k4() == null) {
                c11231x1.m54091jd();
                return;
            }
        }
        C11184f9 c11184f9M54092k42 = c11231x1.m54092k4();
        if (!c11234xw.m54188k4(2, c11184f9M54092k42.f38507k4, c11184f9M54092k42.f38509x1, c11184f9M54092k42.f38508kk, false)) {
            c11231x1.m54094k4(2);
        } else {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }
}
