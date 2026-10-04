package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.qm */
/* JADX INFO: loaded from: classes5.dex */
public class C12718qm extends AbstractC12729ts {

    /* JADX INFO: renamed from: k4 */
    public static final C12718qm f42303k4 = new C12718qm(0, 0, false, null, true);

    /* JADX INFO: renamed from: kk */
    private final boolean f42304kk;

    /* JADX INFO: renamed from: to */
    private int f42305to;

    /* JADX INFO: renamed from: x1 */
    private int f42306x1;

    public C12718qm(int i, int i2, boolean z, int i3, C12717os c12717os, boolean z2) {
        this(i, i2, z, c12717os, z2);
        this.f42305to = i3;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m59079k4(int i) {
        String str = i < 0 ? CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR : C14113y2.f47374k4;
        int iM67482k4 = C14116yg.m67482k4(i);
        return C14113y2.m67400k4(str, iM67482k4 == 1000 ? "INFINITE" : C14057f9.m66591x1(iM67482k4));
    }

    /* JADX INFO: renamed from: kk */
    private static String m59080kk(int i) {
        return AbstractC12741x1.m59361k4(i);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m59081c5() {
        return this.f42305to;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12723s7
    /* JADX INFO: renamed from: dy */
    public boolean mo59082dy() {
        return this.f42306x1 == -1000;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m59083m9() {
        return this.f42304kk;
    }

    public String toString() {
        String str;
        C6765kp c6765kp = new C6765kp(64);
        if (m59251ks()) {
            c6765kp.m26792k4("aux. ");
        }
        c6765kp.m26792k4("penalty");
        c6765kp.m26792k4(" p=");
        c6765kp.m26792k4(m59079k4(this.f42306x1));
        if (this.f42304kk) {
            c6765kp.m26792k4(" [flagged]");
        }
        c6765kp.m26792k4(" w=");
        c6765kp.m26805kk(m59252rv());
        if (!mo59082dy()) {
            str = (this.f42306x1 >= 0 && this.f42305to != -1) ? " (keep constraint, " : " (forced break, ";
            return c6765kp.toString();
        }
        c6765kp.m26792k4(str).m26792k4(m59080kk(this.f42305to)).m26792k4(")");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59084x1(int i) {
        this.f42306x1 = i;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12729ts
    /* JADX INFO: renamed from: x6 */
    public int mo59085x6() {
        return this.f42306x1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12723s7
    /* JADX INFO: renamed from: y_ */
    public boolean mo59086y_() {
        return true;
    }

    public C12718qm(int i, int i2, boolean z, C12717os c12717os, boolean z2) {
        super(i, c12717os, z2);
        this.f42305to = -1;
        this.f42306x1 = i2;
        this.f42304kk = z;
    }
}
