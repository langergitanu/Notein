package com.aspose.slides.internal.p318oh;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.internal.p539z4.AbstractC13373f9;
import com.aspose.slides.internal.p539z4.C13362bv;
import com.aspose.slides.internal.p539z4.C13411um;

/* JADX INFO: renamed from: com.aspose.slides.internal.oh.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C7068ne extends AbstractC7052e0 {
    /* JADX INFO: renamed from: k4 */
    public AbstractC13373f9 m27589k4(C3134k4 c3134k4) {
        C13411um c13411um = new C13411um();
        c13411um.m62362k4(c3134k4.m13386x6());
        long position = c3134k4.m13371ck().getPosition();
        c13411um.m62363k4((C13362bv) new C7090wl().m27611k4(c3134k4));
        if (c13411um.m62365x1() == ((int) (c3134k4.m13371ck().getPosition() - position))) {
            return c13411um;
        }
        throw new C12537k4("Readed more bytes than the object size.");
    }
}
