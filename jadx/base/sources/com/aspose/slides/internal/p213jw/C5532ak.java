package com.aspose.slides.internal.p213jw;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.internal.p517y2.InterfaceC12784v4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.jw.ak */
/* JADX INFO: loaded from: classes.dex */
public class C5532ak extends AbstractC5539du implements InterfaceC12784v4 {
    public C5532ak(String str, C5552rv c5552rv) {
        super(str, c5552rv);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: c5 */
    public String mo22604c5() {
        return mo22612m9();
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC12784v4 m22605du(String str) {
        m22624bz();
        AbstractC5535bv abstractC5535bvMo22646kp = mo22646kp();
        AbstractC5535bv abstractC5535bvMo22654sv = mo22654sv();
        mo22646kp().m22663x1((AbstractC5535bv) this);
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        InterfaceC12784v4 interfaceC12784v4Mo22780h4 = abstractC5535bvMo22646kp.mo22660v4().mo22780h4(str);
        if (abstractC5535bvMo22654sv != null) {
            abstractC5535bvMo22646kp.m22664x1((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12784v4Mo22780h4, AbstractC5535bv.class), abstractC5535bvMo22654sv);
            return interfaceC12784v4Mo22780h4;
        }
        abstractC5535bvMo22646kp.m22655to(interfaceC12784v4Mo22780h4);
        return interfaceC12784v4Mo22780h4;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: dy */
    public String mo22606dy() {
        return mo22687k4();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: e0 */
    public String mo22607e0() {
        return mo22606dy();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: fa */
    public byte mo22608fa() {
        return (byte) 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12784v4 m22609k4(int i) {
        int iM22693x1 = m22693x1() - i;
        String strM22688k4 = m22688k4(i, iM22693x1);
        m22694x1(i, iM22693x1);
        InterfaceC12784v4 interfaceC12784v4Mo22780h4 = mo22660v4().mo22780h4(strM22688k4);
        mo22646kp().m22664x1((AbstractC5535bv) C7019kk.m27452k4((Object) interfaceC12784v4Mo22780h4, AbstractC5535bv.class), (AbstractC5535bv) this);
        return interfaceC12784v4Mo22780h4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m22610kk() {
        for (int i = 0; i < mo22687k4().length(); i++) {
            if (!C14117yj.m67534ks(mo22687k4().charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: ks */
    public void mo22611ks(String str) {
        m22605du(str);
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: m9 */
    public String mo22612m9() {
        return mo22660v4().f15271h4;
    }

    /* JADX INFO: renamed from: to */
    public final String m22613to() {
        return mo22607e0();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv
    public String toString() {
        return super.toString();
    }

    @Override // com.aspose.slides.internal.p213jw.AbstractC5535bv, com.aspose.slides.internal.p517y2.InterfaceC12777qq
    /* JADX INFO: renamed from: x1 */
    public InterfaceC12777qq mo22614x1(boolean z) {
        return mo22660v4().mo22780h4(mo22687k4());
    }
}
