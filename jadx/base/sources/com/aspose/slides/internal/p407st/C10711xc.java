package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.xc */
/* JADX INFO: loaded from: classes4.dex */
public class C10711xc extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int[] f37502k4 = null;

    /* JADX INFO: renamed from: x1 */
    private final C10480ii f37503x1 = new C10480ii();

    public C10711xc() {
        m51409um().m51917k4(61730);
        m51409um().m51916k4((byte) 3);
        m51973k4((int[]) null);
    }

    /* JADX INFO: renamed from: du */
    private void m51972du() {
        int length = this.f37502k4.length;
        C10749ze c10749ze = new C10749ze(928, C3085sv.m13071k4(length), 4);
        for (int i = 0; i < length; i++) {
            c10749ze.m52132k4(i, ((long) this.f37502k4[i]) & 4294967295L);
        }
        m51976x1().m50924k4(928, c10749ze);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int[] iArr = this.f37502k4;
        if (iArr != null && iArr.length > 0) {
            m51972du();
        }
        return this.f37503x1.m50927kk();
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m51974kk() {
        return this.f37502k4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m51975to() {
        C10564nv c10564nv = (C10564nv) C7019kk.m27452k4((Object) m51976x1().m50923k4(927), C10564nv.class);
        if (c10564nv != null) {
            return c10564nv.m51384x1();
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10480ii m51976x1() {
        return this.f37503x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37503x1.m50929x1();
        this.f37503x1.m50925k4(c3134k4, m51409um().m51914du(), m51409um().m51922kk());
        C10749ze c10749ze = (C10749ze) C7019kk.m27452k4((Object) m51976x1().m50923k4(928), C10749ze.class);
        if (c10749ze != null) {
            int iM52134to = c10749ze.m52134to() & 65535;
            this.f37502k4 = new int[iM52134to];
            for (int i = 0; i < iM52134to; i++) {
                this.f37502k4[i] = (int) c10749ze.m52135x1(i);
            }
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        int[] iArr = this.f37502k4;
        if (iArr != null && iArr.length > 0) {
            m51972du();
        }
        m51409um().m51920k4((short) this.f37503x1.m50921k4());
        this.f37503x1.m50922k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51973k4(int[] iArr) {
        if (iArr != null) {
            this.f37502k4 = iArr;
        } else {
            this.f37502k4 = new int[0];
        }
    }
}
