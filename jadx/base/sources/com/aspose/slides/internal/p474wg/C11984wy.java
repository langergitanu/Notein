package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p161h5.C4500kk;
import com.aspose.slides.internal.p161h5.C4508x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14107wz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.net.HttpHeaders;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.wy */
/* JADX INFO: loaded from: classes5.dex */
public class C11984wy extends AbstractC11956my implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private C11925c5 f40457c5;

    /* JADX INFO: renamed from: ck */
    private AbstractC3150x6 f40458ck;

    /* JADX INFO: renamed from: du */
    private C14107wz f40459du;

    /* JADX INFO: renamed from: dy */
    private long f40460dy;

    /* JADX INFO: renamed from: h4 */
    private int f40461h4;

    /* JADX INFO: renamed from: jd */
    private boolean f40462jd;

    /* JADX INFO: renamed from: k4 */
    private C14062gk f40463k4;

    /* JADX INFO: renamed from: kk */
    private C11931dy f40464kk;

    /* JADX INFO: renamed from: m9 */
    private String f40465m9;

    /* JADX INFO: renamed from: to */
    private String f40466to;

    /* JADX INFO: renamed from: x1 */
    private C11973u1 f40467x1;

    public C11984wy(C14062gk c14062gk, String str, C11941he c11941he, C11925c5 c11925c5) {
        AbstractC3150x6 c4508x1;
        this.f40463k4 = c14062gk;
        this.f40466to = str;
        this.f40467x1 = c11941he.f40251kk;
        this.f40459du = c11941he.f40253to;
        this.f40461h4 = c11941he.f40250k4;
        this.f40465m9 = c11941he.f40254x1;
        this.f40458ck = c11941he.f40249h4;
        this.f40460dy = C7019kk.m27438h4((Object) (-1), 9);
        try {
            String str2 = this.f40467x1.get_Item("Content-Length");
            long[] jArr = {this.f40460dy};
            boolean z = C14113y2.m67411k4(str2) || !C14091t6.m67190k4(str2, jArr);
            this.f40460dy = jArr[0];
            if (z) {
                this.f40460dy = C7019kk.m27438h4((Object) (-1), 9);
            }
        } catch (RuntimeException unused) {
            this.f40460dy = C7019kk.m27438h4((Object) (-1), 9);
        }
        if (c11925c5 != null) {
            this.f40457c5 = c11925c5;
            m56260c5();
        }
        String str3 = this.f40467x1.get_Item("Content-Encoding");
        if ("gzip".equals(str3) && (c11941he.m55975k4().m56237x1() & 1) != 0) {
            c4508x1 = new C4500kk(this.f40458ck, 1);
        } else if (!"deflate".equals(str3) || (c11941he.m55975k4().m56237x1() & 2) == 0) {
            return;
        } else {
            c4508x1 = new C4508x1(this.f40458ck, 1);
        }
        this.f40458ck = c4508x1;
    }

    /* JADX INFO: renamed from: c5 */
    private void m56260c5() {
        C11973u1 c11973u1 = this.f40467x1;
        if (c11973u1 == null) {
            return;
        }
        try {
            String str = c11973u1.get(HttpHeaders.SET_COOKIE);
            if (str != null) {
                if (m56263k4(str)) {
                    return;
                }
            }
        } catch (RuntimeException unused) {
        }
        try {
            String str2 = this.f40467x1.get(HttpHeaders.SET_COOKIE2);
            if (str2 != null) {
                m56263k4(str2);
            }
        } catch (RuntimeException unused2) {
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m56261dy() {
        if (this.f40462jd) {
            throw new ObjectDisposedException(C14067j2.m66727k4(this).mo48629x6());
        }
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11956my, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m56262k4(true);
    }

    /* JADX INFO: renamed from: du */
    public void m56264du() {
        C11953m2 c11953m2 = (C11953m2) C7019kk.m27452k4((Object) this.f40458ck, C11953m2.class);
        if (c11953m2 == null) {
            return;
        }
        try {
            c11953m2.m56034dy();
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11956my
    /* JADX INFO: renamed from: h4 */
    public AbstractC3150x6 mo56080h4() {
        m56261dy();
        if (this.f40458ck != null && !C14113y2.m67432to(this.f40466to, "HEAD", (short) 5)) {
            return this.f40458ck;
        }
        return AbstractC3150x6.Null;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11956my
    /* JADX INFO: renamed from: k4 */
    public C11973u1 mo56081k4() {
        return this.f40467x1;
    }

    /* JADX INFO: renamed from: kk */
    public int m56265kk() {
        return this.f40461h4;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11956my
    /* JADX INFO: renamed from: m9 */
    public void mo56082m9() {
        AbstractC3150x6 abstractC3150x6 = this.f40458ck;
        if (abstractC3150x6 != null) {
            this.f40458ck = null;
            if (abstractC3150x6 != null) {
                abstractC3150x6.close();
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public String m56266to() {
        m56261dy();
        return this.f40465m9;
    }

    @Override // com.aspose.slides.internal.p474wg.AbstractC11956my
    /* JADX INFO: renamed from: x1 */
    public C14062gk mo56083x1() {
        m56261dy();
        return this.f40463k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m56262k4(boolean z) {
        this.f40462jd = true;
        if (z) {
            mo56082m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m56263k4(String str) {
        if (this.f40464kk == null) {
            this.f40464kk = new C11931dy();
        }
        boolean z = false;
        for (C11955m9 c11955m9 : new C11928ck(str).m55902k4()) {
            if ("".equals(c11955m9.m56071to())) {
                c11955m9.m56077x1(this.f40463k4.m66678du());
                c11955m9.m56078x1(false);
            }
            if (!c11955m9.m56052du() || C11925c5.m55884k4(this.f40463k4, c11955m9.m56071to())) {
                this.f40464kk.m55925k4(c11955m9);
                C11925c5 c11925c5 = this.f40457c5;
                if (c11925c5 != null) {
                    c11925c5.m55892k4(this.f40463k4, c11955m9);
                    z = true;
                }
            }
        }
        return z;
    }
}
