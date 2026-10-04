package com.aspose.slides;

import com.aspose.slides.android.Size;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
class yyn implements IImage {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck f50426k4;

    public yyn(AbstractC12002ck abstractC12002ck) {
        if (abstractC12002ck == null) {
            throw new ArgumentNullException("imageData");
        }
        this.f50426k4 = abstractC12002ck;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        AbstractC12002ck abstractC12002ck = this.f50426k4;
        if (abstractC12002ck != null) {
            abstractC12002ck.dispose();
        }
    }

    @Override // com.aspose.slides.IImage
    public final int getHeight() {
        return this.f50426k4.mo15757m9();
    }

    @Override // com.aspose.slides.IImage
    public final Size getSize() {
        return (Size) C12023wl.m56858x1(m74150x1());
    }

    @Override // com.aspose.slides.IImage
    public final int getWidth() {
        return this.f50426k4.mo15760yj();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m74148k4() {
        return this.f50426k4;
    }

    @Override // com.aspose.slides.IImage
    public final void save(OutputStream outputStream, final int i) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.yyn.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                yyn.this.m74149k4(abstractC3150x6, i);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public C12023wl m74150x1() {
        return new C12023wl(getWidth(), getHeight());
    }

    public yyn(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("imageData");
        }
        this.f50426k4 = m74147k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck m74147k4(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        return C3099wl.m13195m9(c3152yj.toArray()) ? AbstractC12536x1.m58363k4(c3152yj).mo13505to() : AbstractC12002ck.m56312k4(c3152yj);
    }

    @Override // com.aspose.slides.IImage
    public final void save(String str) throws Throwable {
        this.f50426k4.m56343x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void m74149k4(AbstractC3150x6 abstractC3150x6, int i) {
        this.f50426k4.m56333k4(abstractC3150x6, g6i.m6453k4(i));
    }

    @Override // com.aspose.slides.IImage
    public final void save(String str, int i) throws Throwable {
        this.f50426k4.m56340k4(str, g6i.m6453k4(i));
    }
}
