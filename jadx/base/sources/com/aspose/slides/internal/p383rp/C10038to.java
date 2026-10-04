package com.aspose.slides.internal.p383rp;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p050by.C1896du;
import com.aspose.slides.internal.p050by.C1897dy;
import com.aspose.slides.internal.p050by.C1898h4;
import com.aspose.slides.internal.p050by.C1899k4;
import com.aspose.slides.internal.p050by.C1900kk;
import com.aspose.slides.internal.p050by.C1902to;
import com.aspose.slides.internal.p050by.C1903x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p262m1.C6303kk;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p299ni.InterfaceC6900ck;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p448ur.C11550kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13616v4;
import com.aspose.slides.internal.p550zi.C13620x6;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.rp.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10038to implements InterfaceC6900ck {

    /* JADX INFO: renamed from: du */
    private final C13620x6 f36176du;

    /* JADX INFO: renamed from: h4 */
    private final AbstractC10039x1 f36177h4;

    /* JADX INFO: renamed from: k4 */
    private final int f36178k4;

    /* JADX INFO: renamed from: kk */
    private final C6740x1 f36179kk;

    /* JADX INFO: renamed from: to */
    private final AbstractC3150x6 f36180to;

    /* JADX INFO: renamed from: x1 */
    private final int f36181x1;

    public C10038to(C6740x1 c6740x1, int i, int i2, AbstractC3150x6 abstractC3150x6, C13620x6 c13620x6) {
        if (c6740x1 == null) {
            throw new ArgumentNullException("dataOptions");
        }
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("dataStream");
        }
        this.f36179kk = c6740x1;
        this.f36180to = abstractC3150x6;
        this.f36178k4 = i;
        this.f36181x1 = i2;
        this.f36176du = c13620x6;
        this.f36177h4 = m49357x1();
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC10039x1 m49357x1() {
        int iM26560du = this.f36179kk.m26560du();
        if (iM26560du == 32773) {
            C1898h4 c1898h4 = new C1898h4(this.f36179kk, this.f36178k4, this.f36181x1, this.f36176du);
            c1898h4.mo9825kk(this.f36179kk.m26567ix());
            c1898h4.mo9823k4(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26589up()), 8));
            c1898h4.mo9826to(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26586to()[0]), 8));
            c1898h4.mo9827x1(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26589up()), 8) * this.f36178k4);
            return c1898h4;
        }
        if (iM26560du != 32946) {
            switch (iM26560du) {
                case 1:
                    return new C1897dy(this.f36179kk, this.f36178k4, this.f36181x1, this.f36176du);
                case 2:
                case 3:
                case 4:
                    return new C1899k4(this.f36179kk, this.f36178k4, this.f36181x1, this.f36176du);
                case 5:
                    C1902to c1902to = new C1902to(this.f36179kk, this.f36178k4, this.f36181x1, this.f36176du);
                    c1902to.mo9825kk(this.f36179kk.m26567ix());
                    c1902to.mo9823k4(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26589up()), 8));
                    c1902to.mo9826to(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26586to()[0]), 8));
                    c1902to.mo9827x1(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26589up()), 8) * this.f36178k4);
                    c1902to.m9846du(8);
                    return c1902to;
                case 6:
                    return new C1896du(this.f36179kk, this.f36178k4, this.f36181x1);
                case 7:
                    return new C1900kk(this.f36179kk, this.f36178k4, this.f36181x1);
                case 8:
                    break;
                default:
                    throw new ArgumentOutOfRangeException(C14113y2.m67408k4("codec not supported - Codec #", AbstractC14106wy.getName((Class<?>) C11550kk.class, this.f36179kk.m26560du())));
            }
        }
        C1903x1 c1903x1 = new C1903x1(this.f36179kk, this.f36178k4, this.f36181x1, this.f36176du, true);
        c1903x1.mo9825kk(this.f36179kk.m26567ix());
        c1903x1.mo9823k4(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26589up()), 8));
        c1903x1.mo9826to(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26586to()[0]), 8));
        c1903x1.mo9827x1(C7019kk.m27462to(Integer.valueOf(this.f36179kk.m26589up()), 8) * this.f36178k4);
        return c1903x1;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: ix */
    public boolean mo10016ix() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC10039x1 m49358k4() {
        return this.f36177h4;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6903fa
    /* JADX INFO: renamed from: k4 */
    public void mo10017k4(C12014ne c12014ne, C13616v4 c13616v4, InterfaceC6899c5 interfaceC6899c5) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6900ck
    /* JADX INFO: renamed from: x1 */
    public void mo10018x1(C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        this.f36180to.seek(0L, 0);
        m49358k4().mo9816k4(C6303kk.m25828k4(this.f36180to, this.f36179kk.m26576kk()), c12014ne.Clone(), interfaceC6908m9);
    }
}
