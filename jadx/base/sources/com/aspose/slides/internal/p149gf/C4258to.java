package com.aspose.slides.internal.p149gf;

import com.aspose.slides.internal.p181ig.C4833h4;
import com.aspose.slides.internal.p213jw.C5546kk;
import com.aspose.slides.internal.p263m2.InterfaceC6310to;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.internal.p517y2.InterfaceC12778rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.gf.to */
/* JADX INFO: loaded from: classes.dex */
public class C4258to implements InterfaceC6310to {

    /* JADX INFO: renamed from: k4 */
    private int f11588k4;

    /* JADX INFO: renamed from: kk */
    private C4833h4 f11589kk;

    /* JADX INFO: renamed from: to */
    private boolean f11590to;

    /* JADX INFO: renamed from: x1 */
    private C5546kk f11591x1;

    public C4258to(int i, C5546kk c5546kk, String str) {
        this.f11588k4 = i;
        this.f11591x1 = c5546kk;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6310to
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12778rv mo17109k4(InterfaceC6311x1 interfaceC6311x1) {
        this.f11590to = true;
        try {
            C4833h4 c4833h4 = new C4833h4(this.f11591x1);
            this.f11589kk = c4833h4;
            return c4833h4.m20019k4(interfaceC6311x1);
        } finally {
            this.f11590to = false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17111x1(String... strArr) {
        for (String str : strArr) {
            this.f11589kk.m19995ck(C14113y2.m67407k4(str, Character.valueOf(ControlChar.PARAGRAPH_BREAK_CHAR)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17110k4(String... strArr) {
        for (String str : strArr) {
            this.f11589kk.m19995ck(str);
        }
    }
}
