package com.aspose.slides.internal.p135fp;

import com.aspose.slides.internal.p291n4.C6739k4;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p381rm.C10020x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.AbstractC13613um;
import com.aspose.slides.internal.p550zi.C13609qq;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.uz */
/* JADX INFO: loaded from: classes.dex */
public class C4107uz implements InterfaceC6899c5 {

    /* JADX INFO: renamed from: k4 */
    private final C4101qq f11256k4;

    /* JADX INFO: renamed from: kk */
    private final C13609qq f11257kk;

    /* JADX INFO: renamed from: to */
    private C10020x1 f11258to;

    /* JADX INFO: renamed from: x1 */
    private C6739k4 f11259x1;

    /* JADX INFO: renamed from: h4 */
    private C12014ne f11255h4 = new C12014ne();

    /* JADX INFO: renamed from: du */
    private int f11254du = 0;

    public C4107uz(C4101qq c4101qq, C6739k4 c6739k4, AbstractC13613um abstractC13613um, C13609qq c13609qq, C10020x1 c10020x1) {
        this.f11256k4 = c4101qq;
        this.f11259x1 = c6739k4;
        this.f11257kk = c13609qq;
        abstractC13613um.m62756dy().CloneTo(this.f11255h4);
        if (this.f11259x1 == null) {
            this.f11259x1 = new C6739k4();
        }
        this.f11258to = c10020x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m16428k4() {
        Iterator<C4108v4> it = this.f11258to.m49261k4().m16455h4().getValues().iterator();
        while (it.hasNext()) {
            C4108v4.m16430k4(this.f11256k4, new C4108v4[]{it.next()});
        }
        C4098ks.m16346k4(this.f11256k4, this.f11258to.m49261k4().m16453du());
        this.f11258to.m49262k4(this.f11256k4);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6899c5
    /* JADX INFO: renamed from: k4 */
    public void mo16292k4(C12014ne c12014ne, byte[] bArr, C12016rv c12016rv, C12016rv c12016rv2) {
        for (int iM56666dy = c12014ne.m56666dy(); iM56666dy < c12014ne.m56670k4(); iM56666dy++) {
            for (int iM56681to = c12014ne.m56681to(); iM56681to < c12014ne.m56668h4(); iM56681to++) {
                for (int i = 0; i < this.f11257kk.m62786du(); i++) {
                    this.f11258to.m49267x1()[i][(this.f11258to.m49261k4().m16456jd() * iM56666dy * 8) + iM56681to] = (short) (bArr[((((iM56666dy - c12014ne.m56666dy()) * c12014ne.m56663c5()) + iM56681to) * this.f11257kk.m62786du()) + i] & 255);
                }
                this.f11254du++;
            }
        }
        if (this.f11254du == this.f11255h4.m56683x1() * this.f11255h4.m56663c5()) {
            for (int i2 = 0; i2 < this.f11255h4.m56683x1(); i2++) {
                for (int iM56668h4 = this.f11255h4.m56668h4(); iM56668h4 < this.f11258to.m49261k4().m16456jd() * 8; iM56668h4++) {
                    for (int i3 = 0; i3 < this.f11257kk.m62786du(); i3++) {
                        this.f11258to.m49267x1()[i3][(this.f11258to.m49261k4().m16456jd() * i2 * 8) + iM56668h4] = this.f11258to.m49267x1()[i3][(this.f11255h4.m56668h4() + (this.f11258to.m49261k4().m16456jd() * i2)) - 1];
                    }
                }
            }
            for (int iM56670k4 = this.f11255h4.m56670k4(); iM56670k4 < this.f11258to.m49261k4().m16467to() * 8; iM56670k4++) {
                for (int i4 = 0; i4 < this.f11257kk.m62786du(); i4++) {
                    System.arraycopy(this.f11258to.m49267x1()[i4], this.f11258to.m49261k4().m16456jd() * (this.f11255h4.m56670k4() - 1) * 8, this.f11258to.m49267x1()[i4], this.f11258to.m49261k4().m16456jd() * iM56670k4 * 8, this.f11258to.m49261k4().m16456jd() * 8);
                }
            }
            m16428k4();
        }
    }
}
