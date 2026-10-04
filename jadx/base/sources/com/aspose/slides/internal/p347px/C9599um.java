package com.aspose.slides.internal.p347px;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p036b6.C1651um;
import com.aspose.slides.internal.p437u9.C11292du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12022v4;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.um */
/* JADX INFO: loaded from: classes4.dex */
public class C9599um extends AbstractC9588jd {

    /* JADX INFO: renamed from: x1 */
    private static final C9599um f34727x1 = new C9599um();

    /* JADX INFO: renamed from: k4 */
    private C9579bv f34728k4;

    private C9599um() {
        super(m46880jd(), null);
    }

    /* JADX INFO: renamed from: jd */
    private static String[] m46880jd() {
        try {
            return C1651um.m8967x1().mo8969k4();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final C9579bv m46882c5() {
        if (this.f34728k4 == null) {
            C9579bv c9579bvM46892k4 = C9589k4.m46842k4().m46840to().m46892k4(0);
            if (c9579bvM46892k4 == null) {
                c9579bvM46892k4 = C9589k4.m46842k4().m46840to().m46891k4();
            }
            this.f34728k4 = c9579bvM46892k4;
        }
        return this.f34728k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C9579bv m46883dy() {
        if (this.f34728k4 == null) {
            C9579bv c9579bvM46892k4 = m46840to().m46892k4(0);
            if (c9579bvM46892k4 == null) {
                c9579bvM46892k4 = m46840to().m46893k4(C12022v4.m56852x1().m56651x1().m56527du(), 0, false);
            }
            if (c9579bvM46892k4 == null) {
                c9579bvM46892k4 = m46840to().m46891k4();
            }
            this.f34728k4 = c9579bvM46892k4;
        }
        return this.f34728k4;
    }

    @Override // com.aspose.slides.internal.p347px.AbstractC9588jd
    /* JADX INFO: renamed from: k4 */
    public C9579bv mo46813k4(int i) {
        return m46840to().m46892k4(i);
    }

    @Override // com.aspose.slides.internal.p347px.AbstractC9588jd
    /* JADX INFO: renamed from: kk */
    public C9579bv mo46817kk(String str, int i) {
        return m46840to().m46893k4(str, i, true);
    }

    @Override // com.aspose.slides.internal.p347px.AbstractC9588jd
    /* JADX INFO: renamed from: x1 */
    public C9579bv mo46818x1(String str, int i) {
        return m46840to().m46894x1(str, i, true);
    }

    /* JADX INFO: renamed from: k4 */
    public C9579bv m46884k4(String str, int i) {
        return m46840to().m46893k4(str, i, true);
    }

    @Override // com.aspose.slides.internal.p347px.AbstractC9588jd
    /* JADX INFO: renamed from: x1 */
    public C9606x6[] mo46819x1() {
        return m46840to().m46895x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C9579bv m46885k4(String str, int i, String str2) {
        C9579bv c9579bvM46893k4 = m46840to().m46893k4(str, i, false);
        if (c9579bvM46893k4 == null) {
            if (C11292du.m54264k4(str2)) {
                c9579bvM46893k4 = m46840to().m46893k4(str2, i, false);
            }
            if (c9579bvM46893k4 == null && (c9579bvM46893k4 = m46840to().m46892k4(i)) == null) {
                c9579bvM46893k4 = m46840to().m46893k4(new C12013m9(str, 10.0f).m56648m9(), i, false);
                if (c9579bvM46893k4 == null && (c9579bvM46893k4 = m46883dy()) == null) {
                    C9579bv c9579bvM46893k42 = C9589k4.m46842k4().m46840to().m46893k4(str, i, false);
                    if (c9579bvM46893k42 == null) {
                        if (C11292du.m54264k4(str2)) {
                            c9579bvM46893k42 = C9589k4.m46842k4().m46840to().m46893k4(str2, i, false);
                        }
                        if (c9579bvM46893k42 == null) {
                            C9579bv c9579bvM46882c5 = m46882c5();
                            if (c9579bvM46882c5 != null) {
                                return c9579bvM46882c5;
                            }
                            throw new InvalidOperationException("Cannot find any fonts installed on the system.");
                        }
                    }
                    return c9579bvM46893k42;
                }
            }
        }
        return c9579bvM46893k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C9599um m46881k4() {
        return f34727x1;
    }
}
