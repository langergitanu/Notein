package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.ks */
/* JADX INFO: loaded from: classes4.dex */
public final class C11537ks extends AbstractC11535k4 {

    /* JADX INFO: renamed from: k4 */
    private final String f39028k4;

    public C11537ks(String str) {
        this(str, (short) 19);
    }

    /* JADX INFO: renamed from: kk */
    public static C11537ks m54523kk(String str) {
        return new C11537ks(str, (short) 21);
    }

    /* JADX INFO: renamed from: x1 */
    public static C11537ks m54524x1(String str) {
        return new C11537ks(str);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        return this.f39028k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }

    public C11537ks(String str, short s) {
        super(s);
        this.f39028k4 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public boolean mo23416k4(AbstractC5788h4 abstractC5788h4) {
        C11537ks c11537ks = (C11537ks) C7019kk.m27452k4((Object) abstractC5788h4, C11537ks.class);
        if (C14067j2.m66729x1(null, c11537ks)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c11537ks)) {
            return true;
        }
        return C14088s7.m67181x1(m23417m9(), c11537ks.m23417m9()) && C14113y2.m67363du(this.f39028k4, c11537ks.f39028k4);
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4, com.aspose.slides.internal.p231kk.AbstractC5803to
    /* JADX INFO: renamed from: x1 */
    public String mo23706x1() {
        return this.f39028k4;
    }
}
