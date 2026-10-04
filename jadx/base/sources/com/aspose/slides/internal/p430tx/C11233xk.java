package com.aspose.slides.internal.p430tx;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C11233xk {

    /* JADX INFO: renamed from: k4 */
    private C11179dq f38759k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC10925du f38760kk;

    /* JADX INFO: renamed from: x1 */
    private String f38761x1 = C14113y2.f47374k4;

    public C11233xk(AbstractC10925du abstractC10925du, C11179dq c11179dq) {
        this.f38760kk = abstractC10925du;
        this.f38759k4 = c11179dq;
    }

    /* JADX INFO: renamed from: du */
    public final C11179dq m54143du() {
        C11179dq c11179dq = new C11179dq(this.f38759k4);
        this.f38759k4 = c11179dq;
        return c11179dq;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m54144h4() {
        C11179dq c11179dq = this.f38759k4;
        if (c11179dq == null) {
            return;
        }
        for (C11182e0 c11182e0M54022k4 = c11179dq.m54022k4(); c11182e0M54022k4 != null; c11182e0M54022k4 = c11182e0M54022k4.m53711to()) {
            this.f38761x1 = c11182e0M54022k4.m53710kk();
        }
        this.f38759k4 = this.f38759k4.m53703x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11179dq m54145k4() {
        return this.f38759k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C11233xk m54149kk() {
        C11233xk c11233xk = new C11233xk(this.f38760kk, null);
        c11233xk.f38759k4 = this.f38759k4;
        c11233xk.f38761x1 = this.f38761x1;
        return c11233xk;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m54151m9() {
        return this.f38761x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC10925du m54152to() {
        return this.f38760kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C11179dq m54154x1() {
        return this.f38759k4.m53703x1();
    }

    /* JADX INFO: renamed from: du */
    private String m54142du(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (C11179dq c11179dqM53703x1 = this.f38759k4; c11179dqM53703x1 != null; c11179dqM53703x1 = c11179dqM53703x1.m53703x1()) {
            String strM54025x1 = c11179dqM53703x1.m54025x1(str);
            if (strM54025x1 != null) {
                return strM54025x1;
            }
        }
        throw XsltException.create("Prefix '{0}' is not defined.", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m54146k4(String str) {
        return str.length() == 0 ? this.f38761x1 : m54142du(str);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54150kk(String str) {
        for (C11179dq c11179dqM53703x1 = this.f38759k4; c11179dqM53703x1 != null; c11179dqM53703x1 = c11179dqM53703x1.m53703x1()) {
            if (c11179dqM53703x1.m53702to(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m54153to(String str) {
        for (C11179dq c11179dqM53703x1 = this.f38759k4; c11179dqM53703x1 != null; c11179dqM53703x1 = c11179dqM53703x1.m53703x1()) {
            if (c11179dqM53703x1.m53694h4(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m54155x1(String str) {
        return str.length() == 0 ? C14113y2.f47374k4 : m54142du(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54147k4(String str, String str2) {
        this.f38759k4.m54023k4(str, str2, this.f38761x1);
        if (str == null || str.length() == 0) {
            this.f38761x1 = str2;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54156x1(String[] strArr) {
        for (String str : strArr) {
            this.f38759k4.m53691du(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54148k4(String[] strArr) {
        for (String str : strArr) {
            this.f38759k4.m53700kk(str);
        }
    }
}
