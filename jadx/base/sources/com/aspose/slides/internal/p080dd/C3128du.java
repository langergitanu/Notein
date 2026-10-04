package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.DirectoryNotFoundException;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18358t1;
import java.io.File;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.du */
/* JADX INFO: loaded from: classes3.dex */
public final class C3128du extends AbstractC3145up {

    /* JADX INFO: renamed from: du */
    private String f9272du;

    /* JADX INFO: renamed from: to */
    private String f9273to;

    public C3128du(String str) {
        this(str, false);
    }

    /* JADX INFO: renamed from: dy */
    private void m13337dy() {
        String strM67441x1;
        int length = this.f9317k4.length();
        int i = length - 1;
        if (i > 1 && this.f9317k4.charAt(i) == C3141rv.f9302kk) {
            i = length - 2;
        }
        int iM67372k4 = C14113y2.m67372k4(this.f9317k4, C3141rv.f9302kk, i);
        if (iM67372k4 == -1 || (iM67372k4 == 0 && i == 0)) {
            this.f9273to = this.f9317k4;
            strM67441x1 = null;
        } else {
            this.f9273to = C14113y2.m67443x1(this.f9317k4, iM67372k4 + 1, i - iM67372k4);
            this.f9272du = (iM67372k4 != 0 || C14052dq.f47191x1) ? C14113y2.m67443x1(this.f9317k4, 0, iM67372k4) : C14113y2.m67392k4(Character.valueOf(C3141rv.f9302kk));
            if (!C14052dq.f47191x1 || this.f9272du.length() != 2 || this.f9272du.charAt(1) != ':' || !Character.isLetter(this.f9272du.charAt(0))) {
                return;
            } else {
                strM67441x1 = C14113y2.m67441x1(this.f9272du, C3141rv.f9302kk);
            }
        }
        this.f9272du = strM67441x1;
    }

    /* JADX INFO: renamed from: du */
    public C3128du[] m13338du() {
        return m13344x1(C18358t1.g.f56183c);
    }

    /* JADX INFO: renamed from: k4 */
    public void m13339k4(boolean z) {
        C3142to.m13419k4(this.f9317k4, z);
    }

    /* JADX INFO: renamed from: kk */
    public void m13342kk() {
        C3142to.m13416k4(this.f9317k4);
    }

    /* JADX INFO: renamed from: to */
    public C3126c5[] m13343to() {
        return m13341k4(C18358t1.g.f56183c);
    }

    public String toString() {
        return this.f9319x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3145up
    /* JADX INFO: renamed from: x1 */
    public String mo13336x1() {
        return this.f9273to;
    }

    public C3128du(String str, boolean z) {
        m13431kk(str);
        this.f9317k4 = C3141rv.m13406kk(str);
        this.f9319x1 = z ? C3141rv.m13403k4(str) : str;
        m13337dy();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m13340k4() {
        return new File(this.f9317k4).exists();
    }

    /* JADX INFO: renamed from: x1 */
    public C3128du[] m13344x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("searchPattern");
        }
        if (!m13340k4()) {
            throw new DirectoryNotFoundException(this.f9317k4);
        }
        String[] strArrM13420k4 = C3142to.m13420k4(this.f9317k4, str);
        C3128du[] c3128duArr = new C3128du[strArrM13420k4.length];
        int length = strArrM13420k4.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c3128duArr[i2] = new C3128du(strArrM13420k4[i]);
            i++;
            i2++;
        }
        return c3128duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C3126c5[] m13341k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("searchPattern");
        }
        if (!m13340k4()) {
            throw new DirectoryNotFoundException(this.f9317k4);
        }
        String[] strArrM13425x1 = C3142to.m13425x1(this.f9317k4, str);
        C3126c5[] c3126c5Arr = new C3126c5[strArrM13425x1.length];
        int length = strArrM13425x1.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            c3126c5Arr[i2] = new C3126c5(strArrM13425x1[i]);
            i++;
            i2++;
        }
        return c3126c5Arr;
    }
}
