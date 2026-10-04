package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C11528c5 extends AbstractC5788h4 {

    /* JADX INFO: renamed from: k4 */
    private String f39013k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5788h4[] f39014x1;

    public C11528c5(String str, AbstractC5788h4... abstractC5788h4Arr) {
        super((short) 3);
        this.f39013k4 = str;
        this.f39014x1 = abstractC5788h4Arr;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(this.f39013k4).m26780k4('(');
        AbstractC5788h4[] abstractC5788h4Arr = this.f39014x1;
        if (abstractC5788h4Arr.length != 0) {
            c6765kp.m26792k4(abstractC5788h4Arr[0].mo23414h4());
            for (int i = 1; i < this.f39014x1.length; i++) {
                c6765kp.m26792k4(", ").m26792k4(this.f39014x1[1].mo23414h4());
            }
        }
        c6765kp.m26780k4(')');
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m54518k4() {
        return this.f39013k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC5788h4[] m54519x1() {
        return this.f39014x1;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 9);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        C11528c5 c11528c5 = (C11528c5) C7019kk.m27452k4((Object) abstractC5788h4, C11528c5.class);
        if (C14067j2.m66729x1(null, c11528c5)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c11528c5)) {
            return true;
        }
        return C14113y2.m67363du(this.f39013k4, c11528c5.f39013k4);
    }
}
