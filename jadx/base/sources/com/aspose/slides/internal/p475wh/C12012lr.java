package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3979dy;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p472w8.C11910uz;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p556zr.C13631kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.lr */
/* JADX INFO: loaded from: classes5.dex */
public final class C12012lr extends AbstractC12024x1 {

    /* JADX INFO: renamed from: du */
    private C3976c5 f40533du;

    /* JADX INFO: renamed from: kk */
    private AbstractC12002ck f40534kk;

    /* JADX INFO: renamed from: to */
    private int f40535to;

    /* JADX INFO: renamed from: x1 */
    private final C12007ix f40536x1;

    public C12012lr(AbstractC12002ck abstractC12002ck) {
        this(abstractC12002ck, 0);
    }

    /* JADX INFO: renamed from: c5 */
    private void m56615c5() {
        if (m56873k4()) {
            throw new ArgumentException("TextureBrush object already disposed.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m56616k4(AbstractC12002ck abstractC12002ck) {
        if (abstractC12002ck != null) {
            return new C12007ix(0.0f, 0.0f, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9());
        }
        throw new ArgumentNullException("image");
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12024x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        m56615c5();
        C12012lr c12012lr = (C12012lr) m56874kk();
        AbstractC12002ck abstractC12002ck = this.f40534kk;
        if (abstractC12002ck != null) {
            c12012lr.f40534kk = (AbstractC12002ck) abstractC12002ck.deepClone();
        }
        return c12012lr;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12024x1, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m56876x1();
    }

    /* JADX INFO: renamed from: dy */
    public int m56618dy() {
        m56615c5();
        return this.f40535to;
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC12002ck m56619h4() {
        m56615c5();
        return (AbstractC12002ck) this.f40534kk.deepClone();
    }

    /* JADX INFO: renamed from: kk */
    public void m56621kk(float f, float f2) {
        m56615c5();
        super.m56877x1(f, f2);
    }

    /* JADX INFO: renamed from: m9 */
    public C11913yj m56624m9() {
        m56615c5();
        return m56867du();
    }

    /* JADX INFO: renamed from: to */
    public void m56625to(float f, float f2) {
        m56615c5();
        super.m56868k4(f, f2);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56628x1(float f, int i) {
        m56615c5();
        super.m56870k4(f, i);
    }

    public C12012lr(AbstractC12002ck abstractC12002ck, int i) {
        this(abstractC12002ck, i, m56616k4(abstractC12002ck));
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4 m56617k4(C3989up c3989up, C12014ne c12014ne) {
        InterfaceC2624k4 interfaceC2624k4Mo11981k4 = c3989up.mo15751du().m62930k4().mo11981k4(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
        return new C12009k4(new C13631kk(interfaceC2624k4Mo11981k4, null, C3977ck.m15675c5(), interfaceC2624k4Mo11981k4.mo11992x1(), interfaceC2624k4Mo11981k4.mo11988kk(), C3979dy.m15690x1()));
    }

    /* JADX INFO: renamed from: kk */
    public void m56622kk(float f, float f2, int i) {
        m56615c5();
        super.m56878x1(f, f2, i);
    }

    /* JADX INFO: renamed from: to */
    public void m56626to(float f, float f2, int i) {
        m56615c5();
        super.m56869k4(f, f2, i);
    }

    /* JADX INFO: renamed from: x1 */
    public void m56629x1(C11913yj c11913yj, int i) {
        m56615c5();
        super.m56872k4(c11913yj, i);
    }

    public C12012lr(AbstractC12002ck abstractC12002ck, int i, C12007ix c12007ix) {
        this(abstractC12002ck, i, c12007ix, null, true);
    }

    /* JADX INFO: renamed from: k4 */
    public void m56620k4(int i) {
        m56615c5();
        if (!AbstractC14106wy.isDefined((Class<?>) C11910uz.class, i)) {
            throw new InvalidEnumArgumentException("wrapMode");
        }
        this.f40535to = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m56623kk(C11913yj c11913yj) {
        m56615c5();
        m56871k4(c11913yj);
    }

    /* JADX INFO: renamed from: to */
    public void m56627to(C11913yj c11913yj) {
        m56615c5();
        super.m56879x1(c11913yj);
    }

    private C12012lr(AbstractC12002ck abstractC12002ck, int i, C12007ix c12007ix, C3976c5 c3976c5, boolean z) {
        C12007ix c12007ix2 = new C12007ix();
        this.f40536x1 = c12007ix2;
        this.f40534kk = null;
        this.f40533du = null;
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("image");
        }
        if (c12007ix == null) {
            throw new ArgumentNullException("image");
        }
        if (c12007ix.m56568kk() || !m56616k4(abstractC12002ck).m56581x1(c12007ix)) {
            throw new OutOfMemoryException("Out of memory");
        }
        if (!AbstractC14106wy.isDefined((Class<?>) C11910uz.class, i)) {
            throw new InvalidEnumArgumentException("wrapMode");
        }
        c12007ix.CloneTo(c12007ix2);
        if (abstractC12002ck instanceof C12009k4) {
            if (z) {
                abstractC12002ck = ((C12009k4) abstractC12002ck).m56601k4(C12014ne.m56661x1(c12007ix));
            }
        } else {
            if (!(abstractC12002ck instanceof C3989up)) {
                throw new IllegalArgumentException("Image neither Bitmap nor Metafile");
            }
            abstractC12002ck = m56617k4((C3989up) abstractC12002ck, C12014ne.m56661x1(c12007ix));
        }
        this.f40534kk = abstractC12002ck;
        this.f40535to = i;
        this.f40533du = c3976c5;
    }

    public C12012lr(AbstractC12002ck abstractC12002ck, int i, C12014ne c12014ne) {
        this(abstractC12002ck, i, new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1()));
    }

    public C12012lr(AbstractC12002ck abstractC12002ck, C12007ix c12007ix) {
        this(abstractC12002ck, 0, c12007ix.Clone());
    }

    public C12012lr(AbstractC12002ck abstractC12002ck, C12007ix c12007ix, C3976c5 c3976c5) {
        this(abstractC12002ck, c3976c5 != null ? 4 : 0, c12007ix.Clone(), c3976c5, true);
    }
}
