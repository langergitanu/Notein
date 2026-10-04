package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3046du;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14113y2;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class Audio extends DomObject<AudioCollection> implements IAudio {

    /* JADX INFO: renamed from: du */
    private final C14758wz f202du;

    /* JADX INFO: renamed from: k4 */
    private IPresentationComponent f203k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC13443dy f204kk;

    /* JADX INFO: renamed from: to */
    private final C14612u1 f205to;

    /* JADX INFO: renamed from: x1 */
    private long f206x1;

    public Audio(InterfaceC13443dy interfaceC13443dy, AudioCollection audioCollection) {
        super(audioCollection);
        this.f205to = new C14612u1();
        this.f202du = new C14758wz();
        this.f204kk = interfaceC13443dy;
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m250c5() {
        return (C14113y2.m67411k4(m251dy().m71467k4()) || C14113y2.m67411k4(m251dy().m71469x1())) ? false : true;
    }

    /* JADX INFO: renamed from: dy */
    private C14612u1 m251dy() {
        return this.f205to;
    }

    /* JADX INFO: renamed from: jd */
    private void m252jd() {
        String strM12841k4;
        String strM12843x1;
        AbstractC3150x6 abstractC3150x6Mo18614x1 = this.f204kk.mo18614x1();
        try {
            int i = (int) C13447k4.f45030k4;
            byte[] bArr = new byte[i];
            abstractC3150x6Mo18614x1.read(bArr, 0, i);
            abstractC3150x6Mo18614x1.dispose();
            C3046du c3046du = new C3046du(bArr);
            if (c3046du.m12842kk()) {
                strM12841k4 = c3046du.m12841k4();
                strM12843x1 = c3046du.m12843x1();
            } else {
                strM12841k4 = "audio/unknown";
                strM12843x1 = "audio";
            }
            if (C14113y2.m67411k4(m251dy().m71467k4())) {
                m251dy().m71468k4(strM12841k4);
            }
            if (C14113y2.m67411k4(m251dy().m71469x1())) {
                m251dy().m71470x1(strM12843x1);
            }
        } catch (Throwable th) {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: du */
    public final IPresentation m253du() {
        return m260x1().getPresentation();
    }

    @Override // com.aspose.slides.IAudio
    public final byte[] getBinaryData() {
        C3152yj c3152yj = new C3152yj();
        AbstractC3150x6 abstractC3150x6Mo18614x1 = this.f204kk.mo18614x1();
        try {
            C13447k4.m62557k4(abstractC3150x6Mo18614x1, c3152yj, C13447k4.f45030k4);
            return c3152yj.toArray();
        } finally {
            if (abstractC3150x6Mo18614x1 != null) {
                abstractC3150x6Mo18614x1.dispose();
            }
        }
    }

    @Override // com.aspose.slides.IAudio
    public final String getContentType() {
        if (!m250c5()) {
            m252jd();
        }
        return m251dy().m71467k4();
    }

    @Override // com.aspose.slides.IAudio
    public final InputStream getStream() {
        return AbstractC3150x6.toJava(m258m9());
    }

    /* JADX INFO: renamed from: h4 */
    public final String m254h4() {
        if (!m250c5()) {
            m252jd();
        }
        return m251dy().m71469x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14758wz m255k4() {
        return this.f202du;
    }

    /* JADX INFO: renamed from: kk */
    public final long m257kk() {
        if ((this.f206x1 & 4294967295L) == 0) {
            this.f206x1 = C11610to.m54691k4(m259to());
        }
        return this.f206x1;
    }

    /* JADX INFO: renamed from: m9 */
    public AbstractC3150x6 m258m9() {
        return this.f204kk.mo18614x1();
    }

    public final void setContentType(String str) {
        m251dy().m71468k4(str);
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m259to() {
        return this.f204kk.mo18611k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final IPresentationComponent m260x1() {
        IPresentationComponent iPresentationComponent = this.f203k4;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f2127h4, iPresentationComponentArr);
            this.f203k4 = iPresentationComponentArr[0];
        }
        return this.f203k4;
    }

    public Audio(InterfaceC13443dy interfaceC13443dy, String str, String str2, AudioCollection audioCollection) {
        super(audioCollection);
        this.f205to = new C14612u1();
        this.f202du = new C14758wz();
        this.f204kk = interfaceC13443dy;
        m251dy().m71468k4(str);
        m251dy().m71470x1(str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m256k4(String str) {
        m251dy().m71470x1(str);
    }
}
