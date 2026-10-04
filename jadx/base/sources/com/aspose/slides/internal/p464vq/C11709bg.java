package com.aspose.slides.internal.p464vq;

import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.bg */
/* JADX INFO: loaded from: classes4.dex */
public class C11709bg {

    /* JADX INFO: renamed from: du */
    private AbstractC11819tq f39684du;

    /* JADX INFO: renamed from: h4 */
    private boolean f39685h4;

    /* JADX INFO: renamed from: k4 */
    private String f39686k4;

    /* JADX INFO: renamed from: kk */
    private String f39687kk;

    /* JADX INFO: renamed from: to */
    private byte f39688to;

    /* JADX INFO: renamed from: x1 */
    private String f39689x1;

    public C11709bg(AbstractC11819tq abstractC11819tq, String str, String str2, String str3, byte b) {
        this.f39684du = abstractC11819tq;
        this.f39686k4 = str;
        this.f39689x1 = str2;
        this.f39687kk = str3;
        this.f39688to = b;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m55288c5() {
        this.f39685h4 = true;
    }

    /* JADX INFO: renamed from: du */
    public final String m55289du() {
        return this.f39686k4;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m55290dy() {
        return this.f39685h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m55291h4() {
        return this.f39689x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m55292k4() {
        return this.f39687kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C11791os m55293kk() {
        if (this.f39688to != 1) {
            return this.f39684du.m55392h4(this.f39687kk);
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m55294m9() {
        return this.f39688to;
    }

    /* JADX INFO: renamed from: to */
    public final String m55295to() {
        String str = this.f39689x1;
        int iM67418kk = C14113y2.m67418kk(str, IOUtils.DIR_SEPARATOR_UNIX);
        return iM67418kk < 0 ? str : C14113y2.m67443x1(str, iM67418kk + 1, (str.length() - iM67418kk) - 1);
    }

    public String toString() {
        return C14113y2.m67408k4("used==", C14051ck.m66557x1(this.f39685h4), "; relId==", this.f39686k4, "; target==", this.f39687kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final C11791os m55296x1() {
        m55288c5();
        return m55293kk();
    }
}
