package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11543x6 extends AbstractC11535k4 {

    /* JADX INFO: renamed from: k4 */
    private String f39042k4;

    public C11543x6(String str) {
        super((short) 20);
        this.f39042k4 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        return C14113y2.m67407k4("url(", this.f39042k4, ')');
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: x1 */
    public String mo23706x1() {
        return this.f39042k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        C11543x6 c11543x6 = (C11543x6) C7019kk.m27452k4((Object) abstractC5788h4, C11543x6.class);
        if (C14067j2.m66729x1(null, c11543x6)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c11543x6)) {
            return true;
        }
        return C14088s7.m67181x1(m23417m9(), c11543x6.m23417m9()) && C14113y2.m67363du(this.f39042k4, c11543x6.f39042k4);
    }
}
