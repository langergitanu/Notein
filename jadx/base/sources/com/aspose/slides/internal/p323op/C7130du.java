package com.aspose.slides.internal.p323op;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.du */
/* JADX INFO: loaded from: classes4.dex */
public class C7130du extends AbstractC7133kk {

    /* JADX INFO: renamed from: k4 */
    private final String f19240k4;

    public C7130du(String str) {
        this.f19240k4 = str;
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public boolean equals(Object obj) {
        C7130du c7130du;
        return obj != null && (c7130du = (C7130du) C7019kk.m27452k4(obj, C7130du.class)) != null && super.equals(obj) && C14113y2.m67363du(this.f19240k4, c7130du.f19240k4);
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public int hashCode() {
        return OooO00o.OooO0O0(-324743029, 486187739, this.f19240k4) + super.hashCode();
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public String toString() {
        return C14113y2.m67402k4("{0}ImageCacheDerivedTransformationsKey, tag: {1}", super.toString(), this.f19240k4);
    }
}
