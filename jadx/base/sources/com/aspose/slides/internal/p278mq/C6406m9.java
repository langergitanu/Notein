package com.aspose.slides.internal.p278mq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p271mc.C6359c5;
import com.aspose.slides.internal.p271mc.C6360ck;
import com.aspose.slides.internal.p271mc.C6363fa;
import com.aspose.slides.internal.p341po.C9470du;
import com.aspose.slides.internal.p401sl.AbstractC10240to;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mq.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6406m9 implements InterfaceC6405kk {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6408x1 f18199k4;

    /* JADX INFO: renamed from: kk */
    private List<C6360ck> f18200kk;

    /* JADX INFO: renamed from: to */
    private C6360ck f18201to;

    /* JADX INFO: renamed from: x1 */
    private C6360ck f18202x1;

    public C6406m9(InterfaceC6408x1 interfaceC6408x1) {
        if (interfaceC6408x1 == null) {
            throw new ArgumentNullException("IOrderer instance can not be null.");
        }
        this.f18199k4 = interfaceC6408x1;
        m26305k4(new List<>());
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: du */
    public final void mo26293du() {
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26095k4(true);
            mo26295k4().addItem(this.f18202x1);
            m26306k4(this.f18202x1);
            this.f18202x1 = null;
        }
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: h4 */
    public final void mo26294h4() {
        this.f18202x1 = null;
        m26306k4((C6360ck) null);
        mo26295k4().clear();
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: k4 */
    public final List<C6360ck> mo26295k4() {
        return this.f18200kk;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: kk */
    public final C6360ck mo26301kk() {
        return this.f18202x1;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: to */
    public final void mo26302to() {
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26105wl();
        }
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: x1 */
    public final C6360ck mo26303x1() {
        return this.f18201to;
    }

    /* JADX INFO: renamed from: k4 */
    private void m26305k4(List<C6360ck> list) {
        this.f18200kk = list;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: x1 */
    public final void mo26304x1(C12025x6 c12025x6) {
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26108x1(c12025x6.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m26306k4(C6360ck c6360ck) {
        this.f18201to = c6360ck;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: k4 */
    public final void mo26296k4(C12003du c12003du, float f, int i, int i2, float f2, float f3, float[] fArr, C11913yj c11913yj, C9470du c9470du) {
        if (c12003du == null) {
            throw new ArgumentNullException("Color instance for StrokePath method can not be null.");
        }
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26090k4(c12003du.Clone(), f, i, i2, f2, f3, fArr, c11913yj, c9470du);
            mo26295k4().addItem(this.f18202x1);
            this.f18202x1 = null;
            m26306k4((C6360ck) null);
        }
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: k4 */
    public final void mo26297k4(C12003du c12003du, int i, C6359c5 c6359c5, C6363fa c6363fa, AbstractC10240to abstractC10240to, C11913yj c11913yj, C9470du c9470du) {
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26091k4(c12003du.Clone(), i, c6359c5, c6363fa, abstractC10240to, c11913yj, c9470du);
            mo26295k4().addItem(this.f18202x1);
            this.f18202x1 = null;
            m26306k4((C6360ck) null);
        }
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: k4 */
    public final void mo26298k4(C12025x6 c12025x6) {
        if (this.f18202x1 == null) {
            this.f18202x1 = new C6360ck(c12025x6.Clone(), this.f18199k4.mo26291k4());
        }
        this.f18202x1.m26092k4(c12025x6.Clone());
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: k4 */
    public final void mo26299k4(C12025x6 c12025x6, float f, float f2, float f3) {
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26093k4(c12025x6.Clone(), f, f2, f3);
        } else {
            this.f18202x1 = new C6360ck(c12025x6.Clone(), f, f2, this.f18199k4.mo26291k4(), f3);
        }
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6405kk
    /* JADX INFO: renamed from: k4 */
    public final void mo26300k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63) {
        C6360ck c6360ck = this.f18202x1;
        if (c6360ck != null) {
            c6360ck.m26094k4(c12025x6.Clone(), c12025x62.Clone(), c12025x63.Clone());
        }
    }
}
