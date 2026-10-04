package com.aspose.slides.internal.p081de;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p475wh.C12009k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.de.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3156x1 extends AbstractC6888dy {

    /* JADX INFO: renamed from: k4 */
    private int f9384k4;

    /* JADX INFO: renamed from: kk */
    private C6895to f9385kk = null;

    /* JADX INFO: renamed from: to */
    private C3152yj f9386to;

    /* JADX INFO: renamed from: x1 */
    private C3180k4 f9387x1;

    public C3156x1(int i, int i2, int i3) {
        C3180k4 c3180k4;
        this.f9387x1 = null;
        this.f9384k4 = i;
        if (i == 0) {
            this.f9384k4 = 1;
            c3180k4 = new C3180k4(i2, i3);
        } else {
            if (i != 1) {
                throw new ArgumentOutOfRangeException();
            }
            c3180k4 = new C3180k4(i2, i3);
        }
        this.f9387x1 = c3180k4;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: E_ */
    public int mo13497E_() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13497E_();
        }
        if (i == 1) {
            return this.f9387x1.mo13497E_();
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: F_ */
    public int mo13498F_() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13498F_();
        }
        if (i == 1) {
            return this.f9387x1.mo13498F_();
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: a_ */
    public void mo13499a_(AbstractC3150x6 abstractC3150x6) {
        int i = this.f9384k4;
        if (i == 0) {
            this.f9386to.writeTo(abstractC3150x6);
        } else {
            if (i != 1) {
                throw new ArgumentOutOfRangeException();
            }
            this.f9387x1.mo13499a_(abstractC3150x6);
        }
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: c5 */
    public float mo13500c5() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13500c5();
        }
        if (i == 1) {
            return this.f9387x1.mo13500c5();
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        C3180k4 c3180k4 = this.f9387x1;
        if (c3180k4 != null) {
            c3180k4.dispose();
        }
        C6895to c6895to = this.f9385kk;
        if (c6895to != null) {
            c6895to.dispose();
        }
        C3152yj c3152yj = this.f9386to;
        if (c3152yj != null) {
            c3152yj.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: dy */
    public float mo13501dy() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13501dy();
        }
        if (i == 1) {
            return this.f9387x1.mo13501dy();
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: h4 */
    public int mo13502h4() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13502h4();
        }
        if (i == 1) {
            return this.f9387x1.mo13502h4();
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: jd */
    public AbstractC6890h4 mo13503jd() {
        AbstractC6888dy abstractC6888dy;
        int i = this.f9384k4;
        if (i == 0) {
            abstractC6888dy = this.f9385kk;
        } else {
            if (i != 1) {
                throw new ArgumentOutOfRangeException();
            }
            abstractC6888dy = this.f9387x1;
        }
        return AbstractC6890h4.m26992k4(abstractC6888dy);
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: m9 */
    public int mo13504m9() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13504m9();
        }
        if (i == 1) {
            return this.f9387x1.mo13504m9();
        }
        throw new ArgumentOutOfRangeException();
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6888dy
    /* JADX INFO: renamed from: to */
    public C12009k4 mo13505to() {
        int i = this.f9384k4;
        if (i == 0) {
            return this.f9385kk.mo13505to();
        }
        if (i == 1) {
            return this.f9387x1.mo13505to();
        }
        throw new ArgumentOutOfRangeException();
    }
}
