package com.aspose.slides.internal.p257ls;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p419tg.C10934du;
import com.aspose.slides.internal.p525yi.C12842x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ls.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6229to extends C10934du {

    /* JADX INFO: renamed from: to */
    private C6226h4 f17653to;

    public C6229to() {
        this.f38027k4 = "2.5.29.17";
        this.f17653to = new C6226h4();
    }

    /* JADX INFO: renamed from: h4 */
    public String[] m25223h4() {
        return this.f17653to.m25219k4();
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    /* JADX INFO: renamed from: k4 */
    public void mo25217k4() {
        C12842x1 c12842x1 = new C12842x1(this.f38028kk.m59717to());
        if (C7019kk.m27462to(Byte.valueOf(c12842x1.m59718x1()), 6) != 48) {
            throw new ArgumentException("Invalid SubjectAltName extension");
        }
        this.f17653to = new C6226h4(c12842x1);
    }

    /* JADX INFO: renamed from: m9 */
    public String[] m25224m9() {
        return this.f17653to.m25220x1();
    }

    @Override // com.aspose.slides.internal.p419tg.C10934du
    public String toString() {
        return this.f17653to.toString();
    }

    public C6229to(C10934du c10934du) {
        super(c10934du);
    }
}
