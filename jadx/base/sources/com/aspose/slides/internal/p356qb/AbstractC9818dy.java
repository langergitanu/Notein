package com.aspose.slides.internal.p356qb;

import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.qb.dy */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9818dy {

    /* JADX INFO: renamed from: k4 */
    protected String f35574k4 = "";

    /* JADX INFO: renamed from: x1 */
    protected short f35579x1 = 0;

    /* JADX INFO: renamed from: kk */
    protected short f35575kk = 0;

    /* JADX INFO: renamed from: to */
    protected byte[] f35577to = null;

    /* JADX INFO: renamed from: du */
    protected long f35569du = 0;

    /* JADX INFO: renamed from: h4 */
    protected long f35572h4 = 0;

    /* JADX INFO: renamed from: m9 */
    protected AbstractC9818dy f35576m9 = null;

    /* JADX INFO: renamed from: dy */
    protected long f35570dy = 0;

    /* JADX INFO: renamed from: c5 */
    protected int f35567c5 = 0;

    /* JADX INFO: renamed from: jd */
    protected int f35573jd = -1;

    /* JADX INFO: renamed from: ck */
    private AbstractC9818dy f35568ck = null;

    /* JADX INFO: renamed from: fa */
    private AbstractC9818dy f35571fa = null;

    /* JADX INFO: renamed from: up */
    private AbstractC9818dy f35578up = null;

    /* JADX INFO: renamed from: c5 */
    public final AbstractC9818dy m48371c5() {
        return this.f35578up;
    }

    /* JADX INFO: renamed from: ck */
    public final String m48372ck() {
        return this.f35574k4;
    }

    /* JADX INFO: renamed from: du */
    public final int m48373du() {
        return this.f35573jd;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC9818dy m48374dy() {
        return this.f35571fa;
    }

    /* JADX INFO: renamed from: fa */
    public final int m48375fa() {
        return this.f35567c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte[] m48376h4() {
        return this.f35577to;
    }

    /* JADX INFO: renamed from: jd */
    public final short m48377jd() {
        return this.f35579x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48378k4(long j) {
        this.f35570dy = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m48382kk(int i) {
        this.f35573jd = i;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC9818dy m48384m9() {
        return this.f35568ck;
    }

    /* JADX INFO: renamed from: to */
    public final int m48385to(AbstractC9818dy abstractC9818dy) {
        if (this.f35574k4.length() > abstractC9818dy.m48372ck().length()) {
            return 1;
        }
        if (this.f35574k4.length() < abstractC9818dy.m48372ck().length()) {
            return -1;
        }
        for (int i = 0; i < this.f35574k4.length(); i++) {
            char cM67541u4 = C14117yj.m67541u4(this.f35574k4.charAt(i));
            char cM67541u42 = C14117yj.m67541u4(abstractC9818dy.m48372ck().charAt(i));
            if (cM67541u4 > cM67541u42) {
                return 1;
            }
            if (cM67541u4 < cM67541u42) {
                return -1;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48388x1(AbstractC9818dy abstractC9818dy) {
        this.f35571fa = abstractC9818dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48379k4(AbstractC9818dy abstractC9818dy) {
        this.f35568ck = abstractC9818dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m48383kk(AbstractC9818dy abstractC9818dy) {
        this.f35578up = abstractC9818dy;
    }

    /* JADX INFO: renamed from: to */
    public final long m48386to() {
        return this.f35570dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m48389x1(byte[] bArr) {
        this.f35577to = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48380k4(String str) {
        this.f35574k4 = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m48387to(int i) {
        this.f35567c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48381k4(short s) {
        this.f35579x1 = s;
    }
}
