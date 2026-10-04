package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13969rq;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.j2 */
/* JADX INFO: loaded from: classes4.dex */
public class C11193j2 extends AbstractC11200ks {

    /* JADX INFO: renamed from: ck */
    private boolean f38560ck;

    /* JADX INFO: renamed from: du */
    private C11204m9 f38561du;

    /* JADX INFO: renamed from: fa */
    private C11233xk f38563fa;

    /* JADX INFO: renamed from: h4 */
    private String f38564h4;

    /* JADX INFO: renamed from: jd */
    private C11218tq f38565jd;

    /* JADX INFO: renamed from: kk */
    private C11204m9 f38567kk;

    /* JADX INFO: renamed from: to */
    private C11204m9 f38569to;

    /* JADX INFO: renamed from: x1 */
    private C11204m9 f38570x1;

    /* JADX INFO: renamed from: k4 */
    private int f38566k4 = -1;

    /* JADX INFO: renamed from: m9 */
    private int f38568m9 = 1;

    /* JADX INFO: renamed from: dy */
    private int f38562dy = 1;

    /* JADX INFO: renamed from: c5 */
    private int f38559c5 = 0;

    /* JADX INFO: renamed from: k4 */
    private int m53809k4(String str, C11233xk c11233xk) {
        if (str == null || "text".equals(str)) {
            return 1;
        }
        if ("number".equals(str)) {
            return 2;
        }
        String[] strArr = {null};
        C11184f9.m53724k4(str, strArr, new String[]{null});
        String str2 = strArr[0];
        c11233xk.m54146k4(str2);
        if (str2.length() != 0 || this.f38560ck) {
            return 1;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "data-type", str);
    }

    /* JADX INFO: renamed from: kk */
    private int m53811kk(String str) {
        if (str == null) {
            return 0;
        }
        if ("upper-first".equals(str)) {
            return 1;
        }
        if ("lower-first".equals(str)) {
            return 2;
        }
        if (this.f38560ck) {
            return 0;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "case-order", str);
    }

    /* JADX INFO: renamed from: x1 */
    private int m53812x1(String str) {
        if (str == null || "ascending".equals(str)) {
            return 1;
        }
        if ("descending".equals(str)) {
            return 2;
        }
        if (this.f38560ck) {
            return 1;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "order", str);
    }

    /* JADX INFO: renamed from: k4 */
    private String m53810k4(String str) {
        if (str == null) {
            return null;
        }
        if (C13969rq.m65821k4(C14113y2.m67365dy(str), 0, str.length()) || !(str.length() == 0 || C11697x1.m55256x1(str) == null)) {
            return str;
        }
        if (this.f38560ck) {
            return null;
        }
        throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, str);
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15088d4)) {
            this.f38566k4 = c11212rv.m53987yj(strM53752x6);
            return true;
        }
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15161vh)) {
            this.f38570x1 = C11204m9.m53858k4(c11212rv, strM53752x6);
            return true;
        }
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15129ne)) {
            this.f38567kk = C11204m9.m53858k4(c11212rv, strM53752x6);
            return true;
        }
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15179y9)) {
            this.f38569to = C11204m9.m53858k4(c11212rv, strM53752x6);
            return true;
        }
        if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15083c5)) {
            return false;
        }
        this.f38561du = C11204m9.m53858k4(c11212rv, strM53752x6);
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public void m53813x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        m53850du(c11212rv);
        if (this.f38566k4 == -1) {
            this.f38566k4 = c11212rv.m53987yj(".");
        }
        this.f38560ck = c11212rv.m53919fa();
        this.f38563fa = c11212rv.m53925ix();
        C11204m9[] c11204m9Arr = {this.f38570x1};
        this.f38564h4 = m53810k4(AbstractC11200ks.m53849k4(c11204m9Arr));
        this.f38570x1 = c11204m9Arr[0];
        C11204m9[] c11204m9Arr2 = {this.f38567kk};
        this.f38568m9 = m53809k4(AbstractC11200ks.m53849k4(c11204m9Arr2), this.f38563fa);
        this.f38567kk = c11204m9Arr2[0];
        C11204m9[] c11204m9Arr3 = {this.f38569to};
        this.f38562dy = m53812x1(AbstractC11200ks.m53849k4(c11204m9Arr3));
        this.f38569to = c11204m9Arr3[0];
        C11204m9[] c11204m9Arr4 = {this.f38561du};
        int iM53811kk = m53811kk(AbstractC11200ks.m53849k4(c11204m9Arr4));
        this.f38559c5 = iM53811kk;
        C11204m9 c11204m9 = c11204m9Arr4[0];
        this.f38561du = c11204m9;
        if (this.f38570x1 == null && this.f38567kk == null && this.f38569to == null && c11204m9 == null) {
            this.f38565jd = new C11218tq(this.f38566k4, this.f38564h4, this.f38568m9, this.f38562dy, iM53811kk);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        C11218tq c11218tq = this.f38565jd;
        if (c11218tq == null) {
            int i = this.f38566k4;
            C11204m9 c11204m9 = this.f38570x1;
            String strM53810k4 = c11204m9 == null ? this.f38564h4 : m53810k4(c11204m9.m53859k4(c11234xw, c11231x1));
            C11204m9 c11204m92 = this.f38567kk;
            int iM53809k4 = c11204m92 == null ? this.f38568m9 : m53809k4(c11204m92.m53859k4(c11234xw, c11231x1), this.f38563fa);
            C11204m9 c11204m93 = this.f38569to;
            int iM53812x1 = c11204m93 == null ? this.f38562dy : m53812x1(c11204m93.m53859k4(c11234xw, c11231x1));
            C11204m9 c11204m94 = this.f38561du;
            c11218tq = new C11218tq(i, strM53810k4, iM53809k4, iM53812x1, c11204m94 == null ? this.f38559c5 : m53811kk(c11204m94.m53859k4(c11234xw, c11231x1)));
        }
        c11234xw.m54182k4(c11218tq);
        c11231x1.m54091jd();
    }
}
