package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.ar */
/* JADX INFO: loaded from: classes5.dex */
public final class C11999ar extends AbstractC12024x1 {

    /* JADX INFO: renamed from: kk */
    private final C12003du f40497kk;

    /* JADX INFO: renamed from: x1 */
    boolean f40498x1 = true;

    public C11999ar(C12003du c12003du) {
        C12003du c12003du2 = new C12003du();
        this.f40497kk = c12003du2;
        c12003du.CloneTo(c12003du2);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12024x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        if (m56873k4()) {
            throw new ArgumentException("Parameter is invalid.");
        }
        C12003du c12003duClone = this.f40497kk.Clone();
        c12003duClone.f40508kk = C14113y2.m67402k4("{0:x}", Integer.valueOf(c12003duClone.m56506h4()));
        return new C11999ar(c12003duClone);
    }

    /* JADX INFO: renamed from: h4 */
    public C12003du m56305h4() {
        return this.f40497kk;
    }

    /* JADX INFO: renamed from: k4 */
    public void m56306k4(C12003du c12003du) {
        if (!this.f40498x1) {
            throw new ArgumentException("This SolidBrush object can't be modified.");
        }
        c12003du.CloneTo(this.f40497kk);
    }

    /* JADX INFO: renamed from: m9 */
    public C11999ar m56308m9() {
        if (m56873k4()) {
            throw new ArgumentException("Parameter is invalid.");
        }
        return new C11999ar(this.f40497kk.Clone());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12024x1
    /* JADX INFO: renamed from: k4 */
    public void mo56307k4(boolean z) {
        if (!this.f40498x1 && z) {
            throw new ArgumentException("This SolidBrush object can't be modified.");
        }
        m56876x1();
    }
}
