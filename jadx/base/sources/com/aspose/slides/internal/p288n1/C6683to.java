package com.aspose.slides.internal.p288n1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p227kg.C5673k4;
import com.aspose.slides.internal.p421tk.C10988bz;
import com.aspose.slides.internal.p501xj.C12537k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.n1.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6683to {

    /* JADX INFO: renamed from: k4 */
    private final C5673k4 f18471k4;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC3150x6 f18472x1;

    public C6683to(C5673k4 c5673k4, AbstractC3150x6 abstractC3150x6) {
        this.f18471k4 = c5673k4;
        this.f18472x1 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10988bz[] m26441k4(long j) {
        if ((j & 4294967295L) < 12) {
            return new C10988bz[0];
        }
        List list = new List();
        do {
            C10988bz c10988bz = new C10988bz(this.f18471k4);
            long position = this.f18472x1.getPosition();
            c10988bz.m53203kk(this.f18472x1.getPosition());
            AbstractC6681k4.m26429k4(c10988bz, this.f18472x1);
            AbstractC6681k4 abstractC6681k4M26442k4 = C6684x1.m26442k4(c10988bz.m53206rv());
            C10988bz[] c10988bzArr = {c10988bz};
            boolean zMo26430k4 = abstractC6681k4M26442k4.mo26430k4(c10988bzArr, this.f18472x1);
            C10988bz c10988bz2 = c10988bzArr[0];
            if (zMo26430k4) {
                this.f18471k4.m23133x1().addItem(c10988bz2);
                list.addItem(c10988bz2);
            }
            int iMo53197h4 = c10988bz2.mo53197h4() - ((int) (this.f18472x1.getPosition() - position));
            if (iMo53197h4 > 0) {
                this.f18472x1.seek(iMo53197h4, 1);
            } else if (iMo53197h4 < 0) {
                throw new C12537k4("Readed more bytes than the record size.");
            }
            j = ((j & 4294967295L) - (((long) c10988bz2.mo53197h4()) & 4294967295L)) & 4294967295L;
        } while (j >= 12);
        return (C10988bz[]) list.toArray(new C10988bz[0]);
    }
}
