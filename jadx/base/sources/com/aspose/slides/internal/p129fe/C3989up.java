package com.aspose.slides.internal.p129fe;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.ExternalException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p075d5.AbstractC3024x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p556zr.C13630k4;
import com.aspose.slides.internal.p556zr.C13631kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.up */
/* JADX INFO: loaded from: classes.dex */
public final class C3989up extends AbstractC12002ck {

    /* JADX INFO: renamed from: du */
    private C12009k4 f10883du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3024x1 f10884k4;

    /* JADX INFO: renamed from: to */
    private C13631kk f10885to = null;

    private C3989up(AbstractC3024x1 abstractC3024x1) {
        this.f10884k4 = abstractC3024x1;
    }

    /* JADX INFO: renamed from: du */
    private C3977ck m15748du(int i) {
        if (i == 1) {
            return C3977ck.m15684to();
        }
        if (i == 2) {
            return C3977ck.m15679fa();
        }
        if (i == 3 || i == 4 || i == 5) {
            return C3977ck.m15684to();
        }
        throw new ArgumentException("metafileType");
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: c5 */
    public C3988to mo15749c5() {
        throw new ExternalException();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: ck */
    public C3977ck mo15750ck() {
        return new C3977ck(m15748du(this.f10884k4.mo12733x1()).m15685k4());
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        try {
            return new C3989up((AbstractC3024x1) this.f10884k4.m12726du());
        } catch (CloneNotSupportedException e) {
            throw new NotSupportedException("Can't clone AsposeMetafile", new Exception(e));
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: dy */
    public float mo15752dy() {
        return this.f10884k4.mo21941dy();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: jd */
    public int mo15753jd() {
        return 139273;
    }

    /* JADX INFO: renamed from: k4 */
    public C3991yj m15754k4() {
        return new C3991yj(this.f10884k4);
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: m9 */
    public int mo15757m9() {
        return this.f10884k4.mo21949m9();
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: up */
    public float mo15758up() {
        return this.f10884k4.mo21939c5();
    }

    /* JADX INFO: renamed from: x1 */
    public synchronized C12009k4 m15759x1() {
        try {
            if (this.f10883du == null) {
                this.f10883du = this.f10884k4.mo12732to();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10883du;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: yj */
    public int mo15760yj() {
        return this.f10884k4.mo21943h4();
    }

    public C3989up(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentException("stream");
        }
        if (abstractC3150x6.getLength() == 0) {
            throw new ExternalException("stream");
        }
        try {
            this.f10884k4 = AbstractC3024x1.m12727k4(abstractC3150x6);
        } catch (Throwable th) {
            throw new ExternalException(th.getMessage(), th);
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: du */
    public C13631kk mo15751du() {
        if (this.f10885to == null) {
            C3979dy c3979dyM15688kk = C3979dy.m15688kk();
            this.f10885to = new C13631kk(m15759x1().m56608x1(), null, m15748du(this.f10884k4.mo12733x1()), this.f10884k4.mo21941dy(), this.f10884k4.mo21939c5(), c3979dyM15688kk);
        }
        return this.f10885to;
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: k4 */
    public C12007ix mo15755k4(int[] iArr) {
        return new C12007ix(this.f10884k4.mo12731kk().m56681to(), this.f10884k4.at_(), mo15760yj(), mo15757m9());
    }

    public C3989up(String str) {
        if (str == null) {
            throw new ArgumentException("filename");
        }
        try {
            this.f10884k4 = AbstractC3024x1.m12728k4(str);
        } catch (Throwable th) {
            throw new ExternalException(th.getMessage(), th);
        }
    }

    @Override // com.aspose.slides.internal.p475wh.AbstractC12002ck
    /* JADX INFO: renamed from: k4 */
    public void mo15756k4(AbstractC3150x6 abstractC3150x6, C13630k4 c13630k4, C3986m9 c3986m9) {
        C3977ck c3977ckM62912c5 = c13630k4.m62912c5();
        if (c3977ckM62912c5.m15686x1()) {
            throw new NotImplementedException();
        }
        this.f10884k4.mo12732to().m56333k4(abstractC3150x6, c3977ckM62912c5);
    }
}
