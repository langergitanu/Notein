package com.aspose.slides.internal.p407st;

import com.aspose.slides.PptUnsupportedFormatException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C10528lr extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37190k4;

    /* JADX INFO: renamed from: x1 */
    private String f37192x1 = "";

    /* JADX INFO: renamed from: kk */
    private long f37191kk = 3817979999L;

    public C10528lr() {
        m51409um().m51917k4(4086);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f37192x1.length() + 24;
    }

    /* JADX INFO: renamed from: kk */
    public final String m51217kk() {
        return this.f37192x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51218x1() {
        return this.f37190k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10528lr m51214k4(C9816ck c9816ck) {
        try {
            C3152yj c3152yj = new C3152yj(((C9820h4) c9816ck.m48360k4().m48344to("Current User")).m48410k4());
            C10528lr c10528lr = new C10528lr();
            c10528lr.m51406kk(new C3134k4(c3152yj));
            c3152yj.close();
            return c10528lr;
        } catch (RuntimeException e) {
            throw new PptUnsupportedFormatException("Unknown file format.", e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51215k4(long j) {
        this.f37190k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int position = (int) c3134k4.m13371ck().getPosition();
        c3134k4.m13384uz();
        this.f37191kk = c3134k4.m13384uz() & 4294967295L;
        this.f37190k4 = c3134k4.m13384uz() & 4294967295L;
        short sM13381rv = c3134k4.m13381rv();
        c3134k4.m13381rv();
        c3134k4.m13387yj();
        c3134k4.m13387yj();
        c3134k4.m13381rv();
        if (sM13381rv > 0) {
            char[] cArrM26671k4 = new C6783wp().m26671k4(c3134k4.m13372dy(sM13381rv));
            if (cArrM26671k4 != null) {
                this.f37192x1 = C14113y2.m67405k4(cArrM26671k4);
            }
            c3134k4.m13386x6();
        } else {
            this.f37192x1 = "Aspose.Slides";
        }
        int position2 = ((int) c3134k4.m13371ck().getPosition()) - position;
        if (position2 < m51409um().m51914du()) {
            c3134k4.m13372dy(m51409um().m51914du() - position2);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(20L);
        c3149x1.m13447k4(this.f37191kk & 4294967295L);
        c3149x1.m13447k4(this.f37190k4 & 4294967295L);
        c3149x1.m13448k4((short) this.f37192x1.length());
        c3149x1.m13448k4((short) 1012);
        c3149x1.m13443k4((byte) 3);
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13448k4((short) 0);
        for (int i = 0; i < this.f37192x1.length(); i++) {
            c3149x1.m13443k4((byte) this.f37192x1.charAt(i));
        }
        c3149x1.m13455x1(8);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51216k4(String str) {
        if (str == null) {
            str = "";
        }
        this.f37192x1 = str;
    }
}
