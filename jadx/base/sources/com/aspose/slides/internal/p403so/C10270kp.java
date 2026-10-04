package com.aspose.slides.internal.p403so;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p171hq.AbstractC4623f9;
import com.aspose.slides.internal.p171hq.C4633j2;
import com.aspose.slides.internal.p171hq.C4652rv;
import com.aspose.slides.internal.p171hq.C4667w6;
import com.aspose.slides.internal.p542z7.C13454kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.so.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C10270kp extends AbstractC10258e0 {

    /* JADX INFO: renamed from: k4 */
    private final int f36719k4;

    public C10270kp(int i) {
        this.f36719k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4623f9 m50224k4(C3134k4 c3134k4) {
        C4633j2 c4633j2 = new C4633j2();
        long position = c3134k4.m13371ck().getPosition();
        c4633j2.m19054k4(C13454kk.m62588k4(c3134k4));
        c4633j2.m19155k4(c3134k4.m13386x6());
        c4633j2.m19157k4((C4667w6) new C10297wp().m50251k4(c3134k4));
        c4633j2.m19156k4((C4652rv) new C10267jd(this.f36719k4 - ((int) (c3134k4.m13371ck().getPosition() - position))).m50221k4(c3134k4));
        return c4633j2;
    }
}
