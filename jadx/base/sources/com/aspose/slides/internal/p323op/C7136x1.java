package com.aspose.slides.internal.p323op;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7136x1 extends AbstractC7133kk {

    /* JADX INFO: renamed from: k4 */
    private final float f19251k4;

    /* JADX INFO: renamed from: x1 */
    private final float f19252x1;

    public C7136x1(float f, float f2) {
        this.f19251k4 = f;
        this.f19252x1 = f2;
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public boolean equals(Object obj) {
        C7136x1 c7136x1;
        return obj != null && (c7136x1 = (C7136x1) C7019kk.m27452k4(obj, C7136x1.class)) != null && super.equals(obj) && C14064he.m66718x1(this.f19251k4, c7136x1.f19251k4) && C14064he.m66718x1(this.f19252x1, c7136x1.f19252x1);
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public int hashCode() {
        return ((C14064he.m66708k4(this.f19252x1) + ((C14064he.m66708k4(this.f19251k4) - 324743029) * 486187739)) * 486187739) + super.hashCode();
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public String toString() {
        return C14113y2.m67402k4("{0}ImageCacheDerivedExtendedKey, width: {1}, height: {2}", super.toString(), Float.valueOf(this.f19251k4), Float.valueOf(this.f19252x1));
    }
}
