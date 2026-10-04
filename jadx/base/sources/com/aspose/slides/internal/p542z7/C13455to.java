package com.aspose.slides.internal.p542z7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p411sz.C10802k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.z7.to */
/* JADX INFO: loaded from: classes5.dex */
public class C13455to {

    /* JADX INFO: renamed from: k4 */
    private final C10802k4 f45046k4;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC3150x6 f45047x1;

    public C13455to(C10802k4 c10802k4, AbstractC3150x6 abstractC3150x6) {
        this.f45046k4 = c10802k4;
        this.f45047x1 = abstractC3150x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final C6045bz[] m62596k4(long j) {
        if ((j & 4294967295L) < 12) {
            return new C6045bz[0];
        }
        List list = new List();
        do {
            C6045bz c6045bz = new C6045bz(this.f45046k4);
            long position = this.f45047x1.getPosition();
            c6045bz.m24440kk(this.f45047x1.getPosition());
            AbstractC13453k4.m62585k4(c6045bz, this.f45047x1);
            AbstractC13453k4 abstractC13453k4M62597k4 = C13456x1.m62597k4(c6045bz.m24450x6());
            C6045bz[] c6045bzArr = {c6045bz};
            boolean zMo49687k4 = abstractC13453k4M62597k4.mo49687k4(c6045bzArr, this.f45047x1);
            C6045bz c6045bz2 = c6045bzArr[0];
            if (zMo49687k4) {
                this.f45046k4.m52378x1().addItem(c6045bz2);
                list.addItem(c6045bz2);
            }
            int iMo24441m9 = c6045bz2.mo24441m9() - ((int) (this.f45047x1.getPosition() - position));
            if (iMo24441m9 > 0) {
                this.f45047x1.seek(iMo24441m9, 1);
            } else if (iMo24441m9 < 0) {
                throw new C6490k4("Readed more bytes than the record size.");
            }
            j = ((j & 4294967295L) - (((long) c6045bz2.mo24441m9()) & 4294967295L)) & 4294967295L;
        } while (j >= 12);
        return (C6045bz[]) list.toArray(new C6045bz[0]);
    }
}
