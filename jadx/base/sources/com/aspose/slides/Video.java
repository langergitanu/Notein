package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3111yg;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Video implements IVideo, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private final InterfaceC13443dy f3655du;

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC14397rj f3656k4;

    /* JADX INFO: renamed from: kk */
    private final ph0 f3657kk = new ph0();

    /* JADX INFO: renamed from: to */
    private long f3658to;

    /* JADX INFO: renamed from: x1 */
    private final Presentation f3659x1;

    public Video(VideoCollection videoCollection, InterfaceC13443dy interfaceC13443dy) {
        this.f3656k4 = videoCollection;
        this.f3659x1 = videoCollection.m3073x1();
        this.f3655du = interfaceC13443dy;
    }

    /* JADX INFO: renamed from: c5 */
    private void m3057c5() {
        ph0 ph0VarM3059m9;
        String strM13265x1;
        ph0 ph0VarM3059m92;
        String strM13264kk;
        AbstractC3150x6 abstractC3150x6Mo18614x1 = this.f3655du.mo18614x1();
        try {
            int i = (int) C13447k4.f45030k4;
            byte[] bArr = new byte[i];
            abstractC3150x6Mo18614x1.read(bArr, 0, i);
            C3111yg c3111yg = new C3111yg(bArr);
            abstractC3150x6Mo18614x1.dispose();
            if (C14113y2.m67411k4(m3059m9().m69051k4()) && c3111yg.m13263k4()) {
                ph0VarM3059m9 = m3059m9();
                strM13265x1 = c3111yg.m13265x1();
            } else {
                ph0VarM3059m9 = m3059m9();
                strM13265x1 = "video/unknown";
            }
            ph0VarM3059m9.m69052k4(strM13265x1);
            if (C14113y2.m67411k4(m3059m9().m69053x1()) && c3111yg.m13263k4()) {
                ph0VarM3059m92 = m3059m9();
                strM13264kk = c3111yg.m13264kk();
            } else {
                ph0VarM3059m92 = m3059m9();
                strM13264kk = "video";
            }
            ph0VarM3059m92.m69054x1(strM13264kk);
        } catch (Throwable th) {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: dy */
    private boolean m3058dy() {
        return (C14113y2.m67411k4(m3059m9().m69051k4()) || C14113y2.m67411k4(m3059m9().m69053x1())) ? false : true;
    }

    /* JADX INFO: renamed from: m9 */
    private ph0 m3059m9() {
        return this.f3657kk;
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC13443dy m3060du() {
        return this.f3655du;
    }

    @Override // com.aspose.slides.IVideo
    public final byte[] getBinaryData() {
        C3152yj c3152yj = new C3152yj();
        AbstractC3150x6 abstractC3150x6Mo18614x1 = this.f3655du.mo18614x1();
        try {
            C13447k4.m62557k4(abstractC3150x6Mo18614x1, c3152yj, C13447k4.f45030k4);
            return c3152yj.toArray();
        } finally {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
        }
    }

    @Override // com.aspose.slides.IVideo
    public final String getContentType() {
        if (!m3058dy()) {
            m3057c5();
        }
        return m3059m9().m69051k4();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3656k4;
    }

    @Override // com.aspose.slides.IVideo
    public final InputStream getStream() {
        return AbstractC3150x6.toJava(m3061h4());
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC3150x6 m3061h4() {
        return this.f3655du.mo18614x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m3062k4() {
        if ((this.f3658to & 4294967295L) == 0) {
            this.f3658to = C11610to.m54691k4(m3065x1());
        }
        return this.f3658to;
    }

    /* JADX INFO: renamed from: kk */
    public final IPresentation m3063kk() {
        return this.f3659x1;
    }

    /* JADX INFO: renamed from: to */
    public final String m3064to() {
        if (!m3058dy()) {
            m3057c5();
        }
        return m3059m9().m69053x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m3065x1() {
        return this.f3655du.mo18611k4();
    }

    public Video(VideoCollection videoCollection, InterfaceC13443dy interfaceC13443dy, String str, String str2) {
        this.f3656k4 = videoCollection;
        this.f3659x1 = videoCollection.m3073x1();
        this.f3655du = interfaceC13443dy;
        m3059m9().m69052k4(str);
        m3059m9().m69054x1(str2);
    }
}
