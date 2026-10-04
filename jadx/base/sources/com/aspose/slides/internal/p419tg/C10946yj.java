package com.aspose.slides.internal.p419tg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3142to;
import com.aspose.slides.internal.p174hz.AbstractC4723ix;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4724j2;
import com.aspose.slides.internal.p174hz.C4731ks;
import com.aspose.slides.internal.p174hz.C4754u4;
import com.aspose.slides.internal.p525yi.C12823fa;
import com.aspose.slides.internal.p525yi.C12832ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tg.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C10946yj {

    /* JADX INFO: renamed from: k4 */
    private String f38141k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f38142kk;

    /* JADX INFO: renamed from: to */
    private boolean f38143to;

    /* JADX INFO: renamed from: x1 */
    private C10940kk f38144x1;

    public C10946yj(String str, boolean z) {
        this.f38141k4 = str;
        this.f38143to = z;
    }

    /* JADX INFO: renamed from: du */
    private ArrayList m52850du(String str) {
        String[] strArrM13425x1;
        ArrayList arrayList = new ArrayList();
        String strM13412x1 = C3141rv.m13412x1(this.f38141k4, str);
        if (m52851k4(strM13412x1, false) && (strArrM13425x1 = C3142to.m13425x1(strM13412x1, "*.crl")) != null && strArrM13425x1.length > 0) {
            for (String str2 : strArrM13425x1) {
                try {
                    arrayList.addItem(m52853kk(str2));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: kk */
    private C10944up m52853kk(String str) {
        return new C10944up(m52852k4(str));
    }

    /* JADX INFO: renamed from: to */
    private C10940kk m52854to(String str) {
        String[] strArrM13425x1;
        C10940kk c10940kk = new C10940kk();
        String strM13412x1 = C3141rv.m13412x1(this.f38141k4, str);
        if (m52851k4(strM13412x1, false) && (strArrM13425x1 = C3142to.m13425x1(strM13412x1, "*.cer")) != null && strArrM13425x1.length > 0) {
            for (String str2 : strArrM13425x1) {
                try {
                    c10940kk.m52783k4(m52855x1(str2));
                } catch (Exception unused) {
                }
            }
        }
        return c10940kk;
    }

    /* JADX INFO: renamed from: k4 */
    public C10940kk m52856k4() {
        if (this.f38144x1 == null) {
            this.f38144x1 = m52854to(this.f38141k4);
        }
        return this.f38144x1;
    }

    /* JADX INFO: renamed from: x1 */
    public ArrayList m52857x1() {
        if (!this.f38143to) {
            this.f38142kk = new ArrayList();
        }
        if (this.f38142kk == null) {
            this.f38142kk = m52850du(this.f38141k4);
        }
        return this.f38142kk;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52851k4(String str, boolean z) {
        try {
            if (C3142to.m13421kk(str)) {
                return true;
            }
            C3142to.m13416k4(str);
            return C3142to.m13421kk(str);
        } catch (Exception e) {
            if (z) {
                throw e;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C10945x1 m52855x1(String str) {
        C10945x1 c10945x1 = new C10945x1(m52852k4(str));
        C4731ks c4731ks = new C4731ks();
        c4731ks.f13193k4 = C12823fa.m59617k4(c10945x1.m52837kk());
        if (C14113y2.m67448x1(this.f38141k4, C10942m9.m52796x1())) {
            c4731ks.m19670k4(1);
        }
        if (new C12832ne(c4731ks).m59663kk()) {
            if (c10945x1.m52826dy() != null) {
                c10945x1.m52833k4((AbstractC4751tq) new C4724j2(c4731ks));
                return c10945x1;
            }
            if (c10945x1.m52831k4() != null) {
                c10945x1.m52832k4((AbstractC4723ix) new C4754u4(c4731ks));
            }
        }
        return c10945x1;
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m52852k4(String str) {
        C3130fa c3130faM13363to = C3131h4.m13363to(str);
        try {
            int length = (int) c3130faM13363to.getLength();
            byte[] bArr = new byte[length];
            c3130faM13363to.read(bArr, 0, length);
            c3130faM13363to.close();
            c3130faM13363to.dispose();
            return bArr;
        } catch (Throwable th) {
            if (c3130faM13363to != null) {
                c3130faM13363to.dispose();
            }
            throw th;
        }
    }
}
