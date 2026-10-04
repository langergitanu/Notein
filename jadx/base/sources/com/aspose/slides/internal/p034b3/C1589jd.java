package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1589jd extends C1606x1 {

    /* JADX INFO: renamed from: c5 */
    protected int f6159c5;

    /* JADX INFO: renamed from: ck */
    protected List<C1606x1> f6160ck = null;

    /* JADX INFO: renamed from: dy */
    private boolean f6161dy;

    /* JADX INFO: renamed from: fa */
    private boolean f6162fa;

    /* JADX INFO: renamed from: jd */
    protected int f6163jd;

    /* JADX INFO: renamed from: up */
    private boolean f6164up;

    /* JADX INFO: renamed from: yj */
    private boolean f6165yj;

    /* JADX INFO: renamed from: ak */
    public final int m8578ak() {
        return this.f6163jd;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m8579b3() {
        return this.f6164up;
    }

    /* JADX INFO: renamed from: dq */
    public final boolean m8580dq() {
        return this.f6161dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8581k4(int i, boolean z, boolean z2) {
        this.f6159c5 = i;
        this.f6161dy = z;
        this.f6162fa = z2;
    }

    /* JADX INFO: renamed from: lr */
    public boolean m8583lr() {
        List<C1606x1> list = this.f6160ck;
        return list == null || list.size() == 0;
    }

    /* JADX INFO: renamed from: v4 */
    public final List<C1606x1> m8584v4() {
        return this.f6160ck;
    }

    /* JADX INFO: renamed from: wy */
    public final boolean m8585wy() {
        return this.f6165yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8586x1(int i, boolean z, boolean z2) {
        this.f6163jd = i;
        this.f6164up = z;
        this.f6165yj = z2;
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m8587xk() {
        return this.f6162fa;
    }

    /* JADX INFO: renamed from: yd */
    public final int m8588yd() {
        return this.f6159c5;
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
        if (this.f6160ck == null) {
            this.f6160ck = new List<>();
        }
        c1606x1.mo8680x1(this);
        this.f6160ck.addItem(c1606x1);
    }

    /* JADX INFO: renamed from: x1 */
    public void mo8483x1(C1581c5 c1581c5) {
        mo8582k4((C1606x1) c1581c5);
    }
}
