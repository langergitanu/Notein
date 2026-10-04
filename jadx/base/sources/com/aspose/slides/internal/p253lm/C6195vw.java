package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14113y2;
import com.facebook.common.callercontext.ContextChain;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.vw */
/* JADX INFO: loaded from: classes4.dex */
public class C6195vw extends C6116bs {

    /* JADX INFO: renamed from: k4 */
    private String f17513k4;

    /* JADX INFO: renamed from: to */
    private int f17514to;

    public C6195vw(String str, boolean z, boolean z2, boolean z3, C6116bs c6116bs) {
        super(c6116bs);
        if (z3) {
            this.f17514to |= 8;
        }
        if (z2) {
            this.f17514to |= 66;
        }
        this.f17513k4 = str;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6211yd, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: C_ */
    public Object mo24769C_() {
        return null;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: ak */
    public String mo24790ak() {
        return C14113y2.m67408k4("/", this.f17513k4.toString(), "/");
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m25125ck() {
        return (this.f17514to & 66) == 66;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m25126fa() {
        return (this.f17514to & 8) == 8;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m25127jd() {
        return mo25032k4(AiFeatureConfig.DEFAULT_AI_ASSISTANT_MODEL_LOCATION).mo24772k4();
    }

    /* JADX INFO: renamed from: ks */
    public final int m25128ks() {
        return this.f17514to;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    /* JADX INFO: renamed from: to */
    public String mo24774to() {
        return "RegExp";
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67408k4("/", this.f17513k4.toString(), "/", m25127jd() ? "g" : C14113y2.f47374k4, m25125ck() ? ContextChain.TAG_INFRA : C14113y2.f47374k4, m25126fa() ? "m" : C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: up */
    public final String m25129up() {
        return this.f17513k4;
    }

    /* JADX INFO: renamed from: yj */
    public final C12380dy m25130yj() {
        return new C12380dy(this.f17513k4, this.f17514to);
    }
}
