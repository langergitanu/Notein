package com.aspose.slides.internal.p409sv;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p150gi.C4270dy;
import com.aspose.slides.internal.p150gi.C4273fa;
import com.aspose.slides.internal.p150gi.InterfaceC4260ak;
import com.aspose.slides.internal.p150gi.InterfaceC4307wy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.sv.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10787u4 extends AbstractC3524ks implements InterfaceC4260ak, InterfaceC4307wy {

    /* JADX INFO: renamed from: c5 */
    private int f37803c5;

    /* JADX INFO: renamed from: ck */
    private C4266c6 f37804ck;

    /* JADX INFO: renamed from: dy */
    private C4273fa f37805dy;

    /* JADX INFO: renamed from: fa */
    private C4266c6 f37806fa;

    /* JADX INFO: renamed from: h4 */
    private C4270dy f37807h4;

    /* JADX INFO: renamed from: jd */
    private int f37808jd;

    /* JADX INFO: renamed from: ks */
    private InterfaceC1984kk f37809ks;

    /* JADX INFO: renamed from: m9 */
    private C4265c5 f37810m9;

    /* JADX INFO: renamed from: rv */
    private boolean f37811rv;

    /* JADX INFO: renamed from: up */
    private C4266c6 f37812up;

    /* JADX INFO: renamed from: yj */
    private InterfaceC1984kk f37813yj;

    public C10787u4(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f37811rv = false;
    }

    /* JADX INFO: renamed from: bz */
    public final C4265c5 m52345bz() {
        return this.f37810m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (!this.f37811rv) {
            m14123x1("marker* (list-item)+");
        }
        mo14107n_().mo14211x1(this);
    }

    /* JADX INFO: renamed from: e0 */
    public final C4273fa m52346e0() {
        return this.f37805dy;
    }

    /* JADX INFO: renamed from: g8 */
    public final C4266c6 m52347g8() {
        return this.f37812up;
    }

    /* JADX INFO: renamed from: gi */
    public final InterfaceC1984kk m52348gi() {
        return this.f37809ks;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: h4 */
    public void mo14083h4() {
        super.mo14083h4();
        mo14107n_().mo14185k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 40;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f37807h4 = C4270dy.m17199k4(abstractC3533um);
        this.f37810m9 = abstractC3533um.m14401to();
        this.f37805dy = abstractC3533um.m14399m9();
        this.f37803c5 = abstractC3533um.m14385du(58).mo17251du();
        this.f37808jd = abstractC3533um.m14385du(59).mo17251du();
        this.f37804ck = abstractC3533um.m14385du(131).mo17190up();
        this.f37806fa = abstractC3533um.m14385du(132).mo17190up();
        this.f37812up = abstractC3533um.m14385du(133).mo17190up();
        this.f37813yj = abstractC3533um.m14385du(StyleIdentifier.PLAIN_TABLE_5).mo9877dy();
        this.f37809ks = abstractC3533um.m14385du(StyleIdentifier.TABLE_GRID_LIGHT).mo9877dy();
    }

    /* JADX INFO: renamed from: kp */
    public final InterfaceC1984kk m52349kp() {
        return this.f37813yj;
    }

    /* JADX INFO: renamed from: qm */
    public final C4266c6 m52350qm() {
        return this.f37806fa;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "list-block";
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4307wy
    /* JADX INFO: renamed from: ss */
    public final int mo17279ss() {
        return this.f37808jd;
    }

    /* JADX INFO: renamed from: sv */
    public final C4266c6 m52351sv() {
        return this.f37804ck;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4260ak
    /* JADX INFO: renamed from: ts */
    public final C4270dy mo17117ts() {
        return this.f37807h4;
    }

    @Override // com.aspose.slides.internal.p150gi.InterfaceC4307wy
    /* JADX INFO: renamed from: wp */
    public final int mo17280wp() {
        return this.f37803c5;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            if (C14113y2.m67363du(str2, RequestParameters.MARKER)) {
                if (this.f37811rv) {
                    m14122x1(interfaceC3757h4, "fo:marker", "fo:list-item");
                }
            } else if (C14113y2.m67363du(str2, "list-item")) {
                this.f37811rv = true;
            } else {
                m14103kk(interfaceC3757h4, str, str2);
            }
        }
    }
}
