package com.aspose.slides.internal.p323op;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7132k4 extends AbstractC7133kk {

    /* JADX INFO: renamed from: k4 */
    private final int f19245k4;

    public C7132k4(int i) {
        this.f19245k4 = i;
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public boolean equals(Object obj) {
        C7132k4 c7132k4;
        return obj != null && (c7132k4 = (C7132k4) C7019kk.m27452k4(obj, C7132k4.class)) != null && super.equals(obj) && C14057f9.m66592x1(this.f19245k4, c7132k4.f19245k4);
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public int hashCode() {
        return ((C14057f9.m66579k4(this.f19245k4) - 324743029) * 486187739) + super.hashCode();
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public String toString() {
        return C14113y2.m67402k4("{0}ImageCacheDerivedDarkerLighterKey, multiplier: {1}", super.toString(), Integer.valueOf(this.f19245k4));
    }
}
