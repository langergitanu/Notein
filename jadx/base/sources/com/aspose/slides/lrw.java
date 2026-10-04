package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class lrw implements vbl {

    /* JADX INFO: renamed from: kk */
    private int f46085kk = 0;

    /* JADX INFO: renamed from: k4 */
    private final List<xvt> f46084k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private double f46086x1 = 0.0d;

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: I_ */
    public final void mo4311I_() {
        if (this.f46084k4.size() == 0) {
            return;
        }
        for (int i = this.f46085kk; i < this.f46084k4.size(); i++) {
            this.f46085kk = i;
            this.f46084k4.get_Item(i).f50212k4.mo4311I_();
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        if (this.f46084k4.size() == 0) {
            return;
        }
        for (int size = this.f46084k4.size() - 1; size >= 0; size--) {
            this.f46084k4.get_Item(size).f50212k4.dispose();
        }
        this.f46084k4.clear();
        this.f46085kk = 0;
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: k4 */
    public final void mo4312k4(double d) {
        if (this.f46084k4.size() == 0) {
            return;
        }
        if (d >= mo4315kk()) {
            mo4311I_();
            return;
        }
        int i = -1;
        xvt xvtVar = null;
        for (int i2 = 0; i2 < this.f46084k4.size(); i2++) {
            xvt xvtVar2 = this.f46084k4.get_Item(i2);
            if (xvtVar2.f50214x1 <= d && d < xvtVar2.f50213kk) {
                i = i2;
                xvtVar = xvtVar2;
            }
        }
        if (xvtVar != null) {
            int i3 = this.f46085kk;
            if (i > i3) {
                while (i3 < i) {
                    this.f46085kk = i3;
                    this.f46084k4.get_Item(i3).f50212k4.mo4311I_();
                    i3++;
                }
            }
            this.f46085kk = i;
            xvtVar.f50212k4.mo4312k4(d - xvtVar.f50214x1);
        }
    }

    @Override // com.aspose.slides.vbl
    /* JADX INFO: renamed from: kk */
    public final double mo4315kk() {
        return this.f46086x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64544k4(vbl vblVar) {
        if (vblVar == null) {
            throw new ArgumentNullException("player");
        }
        double d = this.f46086x1;
        xvt xvtVar = new xvt(vblVar);
        xvtVar.f50214x1 = d;
        double dMo4315kk = d + vblVar.mo4315kk();
        xvtVar.f50213kk = dMo4315kk;
        this.f46086x1 = dMo4315kk;
        this.f46084k4.addItem(xvtVar);
    }
}
