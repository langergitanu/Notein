package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13612u4 {

    /* JADX INFO: renamed from: du */
    private long f45193du;

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f45194k4;

    /* JADX INFO: renamed from: kk */
    private final byte[] f45195kk;

    /* JADX INFO: renamed from: to */
    private int f45196to;

    /* JADX INFO: renamed from: x1 */
    private final long f45197x1;

    public C13612u4(AbstractC3150x6 abstractC3150x6, long j, long j2) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (j2 < 0) {
            throw new ArgumentOutOfRangeException("bytesCount", "Must be positive number.");
        }
        this.f45194k4 = abstractC3150x6;
        this.f45193du = j;
        if (j2 == 0) {
            this.f45195kk = new byte[0];
        } else {
            this.f45195kk = C13619x1.m62865k4(j2);
        }
        this.f45197x1 = this.f45193du + j2;
    }

    /* JADX INFO: renamed from: k4 */
    public C13604kk m62799k4() {
        int i = 0;
        this.f45196to = 0;
        int iM67492kk = (int) C14116yg.m67492kk(AbstractC14092to.m67208k4((Object) this.f45195kk).m67267h4(), this.f45197x1 - this.f45193du);
        String strM67408k4 = null;
        if (iM67492kk > 0) {
            this.f45194k4.seek(this.f45193du, 0);
            int i2 = this.f45194k4.read(this.f45195kk, 0, iM67492kk);
            if (i2 > 0) {
                this.f45193du += (long) i2;
                this.f45196to = i2;
            } else {
                strM67408k4 = C14113y2.m67408k4("Cannot read ", C14057f9.m66591x1(iM67492kk), " bytes from stream.");
                i = 2;
            }
        } else if (iM67492kk == 0) {
            i = 1;
            strM67408k4 = "There is no more data to read.";
        }
        C13604kk c13604kk = new C13604kk();
        c13604kk.f45171to = strM67408k4;
        c13604kk.f45170kk = i;
        c13604kk.f45169k4 = this.f45195kk;
        c13604kk.f45172x1 = this.f45196to;
        return c13604kk;
    }
}
