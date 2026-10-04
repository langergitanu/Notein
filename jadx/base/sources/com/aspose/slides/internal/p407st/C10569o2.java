package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.o2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10569o2 extends AbstractC10716xo {

    /* JADX INFO: renamed from: du */
    private String f37249du;

    /* JADX INFO: renamed from: h4 */
    private String f37250h4;

    /* JADX INFO: renamed from: k4 */
    private long f37251k4;

    /* JADX INFO: renamed from: kk */
    private String f37252kk;

    /* JADX INFO: renamed from: to */
    private long f37253to;

    /* JADX INFO: renamed from: x1 */
    private String f37254x1;

    /* JADX INFO: renamed from: c5 */
    public final long m51391c5() {
        String str = this.f37249du;
        return ((long) ((str != null ? str.length() : 0) + 1)) & 4294967295L;
    }

    /* JADX INFO: renamed from: du */
    public final String m51392du() {
        return this.f37252kk;
    }

    /* JADX INFO: renamed from: dy */
    public final String m51393dy() {
        return this.f37250h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m51394h4() {
        return this.f37254x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public C14047bz mo50989k4() {
        return C10517kw.f37159du;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: kk */
    public long mo50992kk() {
        long jM51397x1 = ((m51397x1() & 4294967295L) + 4) & 4294967295L;
        String str = this.f37252kk;
        long length = (((((jM51397x1 + (((long) (str == null ? 0 : str.length() * 2)) & 4294967295L)) & 4294967295L) + 4) & 4294967295L) + (m51391c5() & 4294967295L)) & 4294967295L;
        String str2 = this.f37250h4;
        return (length + (((long) (str2 != null ? str2.length() * 2 : 0)) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m51396m9() {
        return this.f37249du;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: to */
    public String mo50993to() {
        return C14113y2.m67402k4("{0}{1}", m51394h4(), m51396m9());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51397x1() {
        String str = this.f37254x1;
        return ((long) ((str != null ? str.length() : 0) + 1)) & 4294967295L;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50990k4(C3134k4 c3134k4) {
        this.f37251k4 = c3134k4.m13384uz();
        this.f37254x1 = C3085sv.m13079k4(c3134k4);
        if ((this.f37251k4 & 4294967295L) > r0.length() + 1) {
            this.f37252kk = AbstractC6747ar.m26643rv().m26681x1(c3134k4.m13372dy((int) (((((this.f37251k4 & 4294967295L) - ((long) this.f37254x1.length())) & 4294967295L) / 2) & 4294967295L)));
        }
        this.f37253to = c3134k4.m13384uz();
        this.f37249du = C3085sv.m13079k4(c3134k4);
        if ((this.f37253to & 4294967295L) > r0.length() + 1) {
            this.f37250h4 = AbstractC6747ar.m26643rv().m26681x1(c3134k4.m13372dy((int) (((((this.f37253to & 4294967295L) - ((long) this.f37249du.length())) & 4294967295L) / 2) & 4294967295L)));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51398x1(String str) {
        this.f37249du = str;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50991k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m51397x1());
        if ((m51397x1() & 4294967295L) > 1) {
            c3149x1.m13450k4(AbstractC6747ar.m26644to(1252).mo26677to(m51394h4()));
        }
        c3149x1.m13443k4((byte) 0);
        if (!C14113y2.m67411k4(m51392du())) {
            c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to(m51392du()));
        }
        c3149x1.m13447k4(m51391c5());
        if ((4294967295L & m51391c5()) > 1) {
            c3149x1.m13450k4(AbstractC6747ar.m26644to(1252).mo26677to(m51396m9()));
        }
        c3149x1.m13443k4((byte) 0);
        if (C14113y2.m67411k4(m51393dy())) {
            return;
        }
        c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to(m51393dy()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51395k4(String str) {
        this.f37254x1 = str;
    }
}
