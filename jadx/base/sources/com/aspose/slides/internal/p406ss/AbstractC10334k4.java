package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p057c6.InterfaceC1986to;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10334k4 extends AbstractC3524ks {

    /* JADX INFO: renamed from: c5 */
    private String f36785c5;

    /* JADX INFO: renamed from: ck */
    private char f36786ck;

    /* JADX INFO: renamed from: dy */
    protected int f36787dy;

    /* JADX INFO: renamed from: fa */
    private int f36788fa;

    /* JADX INFO: renamed from: h4 */
    protected InterfaceC1986to f36789h4;

    /* JADX INFO: renamed from: jd */
    private int f36790jd;

    /* JADX INFO: renamed from: ks */
    private String f36791ks;

    /* JADX INFO: renamed from: m9 */
    protected int f36792m9;

    /* JADX INFO: renamed from: rv */
    private String f36793rv;

    /* JADX INFO: renamed from: up */
    private InterfaceC1986to f36794up;

    /* JADX INFO: renamed from: x6 */
    private C10329dy f36795x6;

    /* JADX INFO: renamed from: yj */
    private String f36796yj;

    public AbstractC10334k4(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36787dy = 0;
    }

    /* JADX INFO: renamed from: bz */
    public final int m50358bz() {
        return this.f36792m9;
    }

    /* JADX INFO: renamed from: du */
    public final String m50359du(int i) {
        return this.f36795x6.m50348k4(i);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m50360e0() {
        return this.f36787dy;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        this.f36795x6 = new C10329dy(this.f36785c5, this.f36786ck, this.f36788fa, this.f36790jd, this.f36793rv, this.f36796yj, this.f36791ks);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f36789h4 = abstractC3533um.m14385du(126).mo9878h4();
        this.f36792m9 = abstractC3533um.m14385du(109).mo17251du();
        this.f36785c5 = abstractC3533um.m14385du(110).mo9926j_();
        this.f36790jd = abstractC3533um.m14385du(142).mo17251du();
        this.f36786ck = abstractC3533um.m14385du(113).mo17252h_();
        this.f36788fa = ((Integer) C7019kk.m27464to(abstractC3533um.m14385du(114).mo9924m9(), Integer.TYPE)).intValue();
        this.f36794up = abstractC3533um.m14385du(197).mo9878h4();
        this.f36796yj = abstractC3533um.m14385du(134).mo9926j_();
        this.f36791ks = abstractC3533um.m14385du(81).mo9926j_();
        this.f36793rv = abstractC3533um.m14385du(StyleIdentifier.GRID_TABLE_4).mo9926j_();
    }

    /* JADX INFO: renamed from: qm */
    public final InterfaceC1986to m50361qm() {
        return this.f36789h4;
    }

    /* JADX INFO: renamed from: ts */
    public final void m50362ts() {
        int i;
        if (this.f36789h4.m10115du() == 0) {
            int iMo9884to = this.f36789h4.mo9884to();
            this.f36787dy = iMo9884to > 0 ? iMo9884to : 1;
            return;
        }
        this.f36787dy = mo14126yj().m50397e0() + 1;
        int iM10115du = this.f36789h4.m10115du();
        if (iM10115du == 11) {
            i = this.f36787dy;
            if (i % 2 != 0) {
                return;
            }
        } else {
            if (iM10115du != 10) {
                return;
            }
            i = this.f36787dy;
            if (i % 2 != 1) {
                return;
            }
        }
        this.f36787dy = i + 1;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: yj */
    public C10345uz mo14126yj() {
        return (C10345uz) m14115s_();
    }
}
