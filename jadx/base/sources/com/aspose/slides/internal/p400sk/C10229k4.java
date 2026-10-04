package com.aspose.slides.internal.p400sk;

import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sk.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10229k4 extends C3182du {

    /* JADX INFO: renamed from: c5 */
    public boolean f36668c5;

    /* JADX INFO: renamed from: dy */
    public String f36669dy;

    public C10229k4() {
        super("rawText");
        this.f36669dy = C14113y2.f47374k4;
        this.f36668c5 = false;
    }

    @Override // com.aspose.slides.internal.p087dm.C3181c5
    /* JADX INFO: renamed from: yd */
    public C3181c5 mo13644yd() {
        C10229k4 c10229k4 = (C10229k4) super.mo13644yd();
        c10229k4.f36669dy = this.f36669dy;
        return c10229k4;
    }

    public C10229k4(String str) {
        this();
        this.f36669dy = str;
    }

    public C10229k4(String str, boolean z) {
        this();
        this.f36669dy = str;
        this.f36668c5 = z;
    }
}
