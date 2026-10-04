package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12024x1 implements IDisposable, InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: x1 */
    private C11913yj f40590x1 = new C11913yj();

    /* JADX INFO: renamed from: k4 */
    protected boolean f40589k4 = false;

    public abstract Object deepClone();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo56307k4(true);
    }

    /* JADX INFO: renamed from: du */
    public C11913yj m56867du() {
        return this.f40590x1.m55760h4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m56868k4(float f, float f2) {
        m56869k4(f, f2, 0);
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC12024x1 m56874kk() {
        AbstractC12024x1 abstractC12024x1 = (AbstractC12024x1) m56875to();
        abstractC12024x1.f40590x1 = this.f40590x1.m55760h4();
        return abstractC12024x1;
    }

    /* JADX INFO: renamed from: to */
    public Object m56875to() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m56876x1() {
        this.f40589k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56869k4(float f, float f2, int i) {
        this.f40590x1.m55786x1(f, f2, i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56877x1(float f, float f2) {
        m56878x1(f, f2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56870k4(float f, int i) {
        this.f40590x1.m55765k4(f, i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56878x1(float f, float f2, int i) {
        this.f40590x1.m55764k4(f, f2, i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56871k4(C11913yj c11913yj) {
        if (c11913yj == null) {
            throw new ArgumentNullException("Value cannot be null");
        }
        if (!c11913yj.m55778kk()) {
            throw new ArgumentException("Value is not valid");
        }
        c11913yj.m55768k4(this.f40590x1);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56879x1(C11913yj c11913yj) {
        m56872k4(c11913yj, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56872k4(C11913yj c11913yj, int i) {
        if (c11913yj == null) {
            throw new ArgumentNullException("Value of 'matrix' cannot be null");
        }
        if (!c11913yj.m55778kk()) {
            throw new ArgumentException("Value of 'matrix' is invalid");
        }
        this.f40590x1.m55769k4(c11913yj, i == 0 ? 0 : 1);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo56307k4(boolean z) {
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56873k4() {
        return this.f40589k4;
    }
}
