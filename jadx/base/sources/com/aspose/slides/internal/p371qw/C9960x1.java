package com.aspose.slides.internal.p371qw;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p481wp.C12236up;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9960x1 {

    /* JADX INFO: renamed from: c5 */
    private int f35963c5;

    /* JADX INFO: renamed from: ck */
    private boolean f35964ck;

    /* JADX INFO: renamed from: du */
    private int f35965du;

    /* JADX INFO: renamed from: dy */
    private int f35966dy;

    /* JADX INFO: renamed from: h4 */
    private int f35967h4;

    /* JADX INFO: renamed from: jd */
    private int f35968jd;

    /* JADX INFO: renamed from: k4 */
    public C12236up f35969k4;

    /* JADX INFO: renamed from: kk */
    public int f35970kk;

    /* JADX INFO: renamed from: m9 */
    private int f35971m9;

    /* JADX INFO: renamed from: to */
    private int f35972to;

    /* JADX INFO: renamed from: x1 */
    public int f35973x1;

    public C9960x1(C12236up c12236up, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f35969k4 = c12236up;
        this.f35973x1 = i;
        this.f35970kk = i2;
        this.f35964ck = z;
        this.f35972to = i3;
        this.f35965du = i4;
        this.f35967h4 = i5;
        this.f35971m9 = i6;
        this.f35966dy = i7;
        this.f35963c5 = i8;
        this.f35968jd = i9;
    }

    /* JADX INFO: renamed from: du */
    public final int m49037du() {
        return this.f35967h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49038k4(boolean z) {
        return z ? this.f35966dy : this.f35971m9;
    }

    /* JADX INFO: renamed from: kk */
    public final int m49040kk() {
        return this.f35972to;
    }

    /* JADX INFO: renamed from: to */
    public final int m49041to() {
        return this.f35965du;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp("IPart: ");
        C6765kp c6765kpM26805kk = c6765kp.m26805kk(this.f35973x1);
        String str = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        c6765kpM26805kk.m26792k4(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR).m26805kk(this.f35970kk);
        C6765kp c6765kpM26792k4 = c6765kp.m26792k4(" [").m26792k4(m49039k4() ? "F" : CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        if (m49043x1()) {
            str = "L";
        }
        c6765kpM26792k4.m26792k4(str);
        c6765kp.m26792k4("] ").m26791k4(this.f35969k4);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m49042x1(boolean z) {
        return z ? this.f35968jd : this.f35963c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m49039k4() {
        return this.f35973x1 == 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m49043x1() {
        return this.f35964ck;
    }
}
