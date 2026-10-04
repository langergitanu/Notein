package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.p559ms.System.C14047bz;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.op */
/* JADX INFO: loaded from: classes4.dex */
public class C10578op {

    /* JADX INFO: renamed from: k4 */
    private C10718xq f37270k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f37271x1 = {0, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70};

    public C10578op() {
        m51439k4(new C10718xq());
    }

    /* JADX INFO: renamed from: k4 */
    public final C10718xq m51437k4() {
        return this.f37270k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51440x1(AbstractC3150x6 abstractC3150x6) {
        C9816ck c9816ck = new C9816ck();
        if (m51437k4() != null) {
            C3152yj c3152yj = new C3152yj();
            try {
                C3149x1 c3149x1 = new C3149x1(c3152yj);
                try {
                    m51437k4().m51997k4(c3149x1);
                    c3149x1.dispose();
                    c3152yj.flush();
                    C9820h4 c9820h4 = new C9820h4("\u0001Ole");
                    c9820h4.m48409k4(c3152yj.toArray());
                    c9820h4.m48389x1(C14047bz.f47172k4.m66539k4());
                    c9816ck.m48360k4().m48340du(c9820h4);
                    c9816ck.m48360k4().m48389x1(this.f37271x1);
                } catch (Throwable th) {
                    c3149x1.dispose();
                    throw th;
                }
            } finally {
                c3152yj.dispose();
            }
        }
        c9816ck.m48362x1(abstractC3150x6);
    }

    public C10578op(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            m51438k4(c3152yj);
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51438k4(AbstractC3150x6 abstractC3150x6) {
        C9820h4 c9820h4 = (C9820h4) new C9816ck(abstractC3150x6).m48360k4().m48344to("\u0001Ole");
        if (c9820h4 != null) {
            C3152yj c3152yj = new C3152yj(c9820h4.m48410k4());
            try {
                C3134k4 c3134k4 = new C3134k4(c3152yj);
                try {
                    try {
                        this.f37270k4 = new C10718xq(c3134k4);
                    } catch (Throwable th) {
                        c3134k4.dispose();
                        throw th;
                    }
                } catch (C10563nm e) {
                    C3085sv.m13082k4(e);
                    this.f37270k4 = null;
                }
                c3134k4.dispose();
            } finally {
                c3152yj.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51439k4(C10718xq c10718xq) {
        this.f37270k4 = c10718xq;
    }
}
