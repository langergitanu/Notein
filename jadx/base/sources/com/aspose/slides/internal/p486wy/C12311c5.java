package com.aspose.slides.internal.p486wy;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12311c5 extends C12314dy {

    /* JADX INFO: renamed from: ck */
    protected C1581c5 f41165ck = null;

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public C12023wl mo8505k4(boolean z) {
        C12023wl c12023wlClone = this.f41165ck.mo8505k4(z).Clone();
        c12023wlClone.m56866x1(0);
        return c12023wlClone;
    }

    /* JADX INFO: renamed from: u4 */
    public final C1581c5 m57558u4() {
        return this.f41165ck;
    }

    @Override // com.aspose.slides.internal.p486wy.C12314dy, com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
        if (this.f41165ck != null) {
            throw new InvalidOperationException("InlineBlockParent may have only one child area.");
        }
        if (!C7019kk.m27469x1(c1606x1, C1581c5.class)) {
            throw new InvalidOperationException(C14113y2.m67408k4("The child of an InlineBlockParent must be a", " Block area"));
        }
        this.f41165ck = (C1581c5) c1606x1;
        m8679x1(c1606x1.m8659f_());
        m8670kk(c1606x1.m8654du());
    }
}
