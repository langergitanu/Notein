package com.aspose.slides.internal.p323op;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.op.to */
/* JADX INFO: loaded from: classes4.dex */
public class C7135to extends AbstractC7133kk {

    /* JADX INFO: renamed from: k4 */
    private final double f19249k4;

    /* JADX INFO: renamed from: x1 */
    private final double f19250x1;

    public C7135to(double d, double d2) {
        this.f19249k4 = d;
        this.f19250x1 = d2;
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public boolean equals(Object obj) {
        C7135to c7135to;
        return obj != null && (c7135to = (C7135to) C7019kk.m27452k4(obj, C7135to.class)) != null && super.equals(obj) && C14044b3.m66440x1(this.f19249k4, c7135to.f19249k4) && C14044b3.m66440x1(this.f19250x1, c7135to.f19250x1);
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public int hashCode() {
        return ((C14044b3.m66429k4(this.f19250x1) + ((C14044b3.m66429k4(this.f19249k4) - 324743029) * 486187739)) * 486187739) + super.hashCode();
    }

    @Override // com.aspose.slides.internal.p323op.AbstractC7133kk
    public String toString() {
        return C14113y2.m67402k4("{0}ImageCacheDerivedShrinkedKey, widthDivider: {1}, heightDivider: {2}", super.toString(), Double.valueOf(this.f19249k4), Double.valueOf(this.f19250x1));
    }

    public C7135to(AbstractC7133kk abstractC7133kk, double d, double d2) {
        super(abstractC7133kk);
        this.f19249k4 = d;
        this.f19250x1 = d2;
    }
}
