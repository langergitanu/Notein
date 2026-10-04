package com.aspose.slides.internal.p167hh;

import androidx.core.graphics.OooO0O0;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p347px.C9579bv;
import java.awt.font.TextAttribute;

/* JADX INFO: renamed from: com.aspose.slides.internal.hh.to */
/* JADX INFO: loaded from: classes.dex */
public class C4586to extends AbstractC4584k4 {

    /* JADX INFO: renamed from: dy */
    protected AbstractC4584k4.k4 f12807dy;

    /* JADX INFO: renamed from: m9 */
    protected C9579bv f12808m9;

    public C4586to(C9579bv c9579bv, float f, int i) {
        super(c9579bv.m46778k4(), c9579bv.m46789kk(), f, i);
        this.f12808m9 = c9579bv;
        this.f12807dy = m18945k4(c9579bv);
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: c5 */
    public float mo18923c5() {
        return (m18926h4() ? TextAttribute.POSTURE_OBLIQUE : TextAttribute.POSTURE_REGULAR).floatValue();
    }

    /* JADX INFO: renamed from: ck */
    public C9579bv mo18944ck() {
        C9579bv c9579bv = this.f12808m9;
        if (c9579bv != null) {
            return c9579bv;
        }
        throw new IllegalArgumentException("Font is not initialized yet");
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: jd */
    public AbstractC4584k4.k4 mo18927jd() {
        AbstractC4584k4.k4 k4Var = this.f12807dy;
        if (k4Var != null) {
            return k4Var;
        }
        throw new IllegalArgumentException("Font is not initialized yet");
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public float mo18928k4(char c, float f) {
        return mo18944ck().m46774k4(c, f);
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: x1 */
    public boolean mo18938x1(int i) {
        if (Character.isValidCodePoint(i)) {
            return mo18944ck().m46764du().m46907k4(i) != null;
        }
        throw new IllegalArgumentException(OooO0O0.OooO00o(i, new StringBuilder("invalid code point: ")));
    }

    public C4586to(String str, String str2, float f, int i) {
        super(str, str2, f, i);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4.k4 m18945k4(C9579bv c9579bv) {
        return new AbstractC4584k4.k4(c9579bv.m46794m9(), c9579bv.m46766dy(), c9579bv.m46760c5(), c9579bv.m46762ck());
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18929k4(float f) {
        return new C4586to(mo18944ck(), f, this.f12799to);
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18930k4(float f, int i) {
        return new C4586to(mo18944ck(), f, i);
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18931k4(int i) {
        return new C4586to(mo18944ck(), this.f12798kk, i);
    }

    @Override // com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public boolean mo18933k4(char c) {
        return mo18944ck().m46764du().m46907k4(c) != null;
    }
}
