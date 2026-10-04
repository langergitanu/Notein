package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.ai */
/* JADX INFO: loaded from: classes.dex */
public final class C5676ai extends AbstractC5728qw {

    /* JADX INFO: renamed from: du */
    private boolean f15681du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC10925du f15682h4;

    /* JADX INFO: renamed from: k4 */
    public AbstractC5728qw f15683k4;

    /* JADX INFO: renamed from: m9 */
    private AbstractC10925du f15684m9;

    /* JADX INFO: renamed from: to */
    private boolean f15685to;

    /* JADX INFO: renamed from: x1 */
    public AbstractC5728qw f15686x1;

    private C5676ai(C5676ai c5676ai) {
        super(c5676ai);
        this.f15683k4 = AbstractC5728qw.m23314k4(c5676ai.f15683k4);
        this.f15686x1 = AbstractC5728qw.m23314k4(c5676ai.f15686x1);
        this.f15685to = c5676ai.f15685to;
        this.f15681du = c5676ai.f15681du;
        this.f15682h4 = AbstractC5728qw.m23315kk(c5676ai.f15682h4);
        this.f15684m9 = AbstractC5728qw.m23315kk(c5676ai.f15684m9);
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC10925du m23145x1(AbstractC10925du abstractC10925du) {
        this.f15682h4 = abstractC10925du;
        this.f15681du = true;
        this.f15685to = true;
        return abstractC10925du;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15683k4.mo23138c5();
        this.f15686x1.mo23138c5();
        this.f15685to = true;
        this.f15681du = true;
        this.f15684m9 = null;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 3;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        if (abstractC10925du == null) {
            return null;
        }
        AbstractC10925du abstractC10925duMo23147k4 = this.f15683k4.mo23147k4(abstractC10925du);
        return abstractC10925duMo23147k4 != null ? abstractC10925duMo23147k4 : this.f15686x1.mo23147k4(abstractC10925du);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15682h4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        AbstractC10925du abstractC10925duMo23142m9 = this.f15685to ? this.f15683k4.mo23142m9() : this.f15684m9;
        AbstractC10925du abstractC10925duMo23142m92 = this.f15681du ? this.f15686x1.mo23142m9() : this.f15684m9;
        if (abstractC10925duMo23142m9 != null && abstractC10925duMo23142m92 != null) {
            int iM23313k4 = AbstractC5728qw.m23313k4(abstractC10925duMo23142m9, abstractC10925duMo23142m92);
            return iM23313k4 == 0 ? m23146x1(abstractC10925duMo23142m9, abstractC10925duMo23142m92) : iM23313k4 == 1 ? m23144kk(abstractC10925duMo23142m9, abstractC10925duMo23142m92) : m23145x1(abstractC10925duMo23142m9);
        }
        if (abstractC10925duMo23142m92 == null) {
            this.f15685to = true;
            this.f15681du = false;
            this.f15682h4 = abstractC10925duMo23142m9;
            this.f15684m9 = null;
            return abstractC10925duMo23142m9;
        }
        this.f15685to = false;
        this.f15681du = true;
        this.f15682h4 = abstractC10925duMo23142m92;
        this.f15684m9 = null;
        return abstractC10925duMo23142m92;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        throw new InvalidOperationException();
    }

    public C5676ai(AbstractC5728qw abstractC5728qw, AbstractC5728qw abstractC5728qw2) {
        this.f15683k4 = abstractC5728qw;
        this.f15686x1 = abstractC5728qw2;
        this.f15685to = true;
        this.f15681du = true;
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC10925du m23144kk(AbstractC10925du abstractC10925du, AbstractC10925du abstractC10925du2) {
        this.f15684m9 = abstractC10925du;
        this.f15685to = false;
        this.f15681du = true;
        this.f15682h4 = abstractC10925du2;
        return abstractC10925du2;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC10925du m23146x1(AbstractC10925du abstractC10925du, AbstractC10925du abstractC10925du2) {
        this.f15684m9 = abstractC10925du2;
        this.f15681du = false;
        this.f15685to = true;
        this.f15682h4 = abstractC10925du;
        return abstractC10925du;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5676ai(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        this.f15683k4.mo23148k4(abstractC10929m9);
        this.f15686x1.mo23148k4(abstractC10929m9);
        this.f15685to = true;
        this.f15681du = true;
        this.f15684m9 = null;
        m23294ck();
        return this;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15683k4.mo23149k4(abstractC7201m9);
        this.f15686x1.mo23149k4(abstractC7201m9);
    }
}
