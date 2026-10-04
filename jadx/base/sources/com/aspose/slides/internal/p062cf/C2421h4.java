package com.aspose.slides.internal.p062cf;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p347px.AbstractC9576ak;
import com.aspose.slides.internal.p347px.C9603wl;
import com.aspose.slides.internal.p347px.C9604wy;
import com.aspose.slides.internal.p437u9.C11296k4;
import com.aspose.slides.internal.p437u9.C11297kk;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.cf.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2421h4 {

    /* JADX INFO: renamed from: k4 */
    private int f8377k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC9576ak f8378kk;

    /* JADX INFO: renamed from: x1 */
    private int f8379x1;

    public C2421h4(int i, int i2, AbstractC9576ak abstractC9576ak) {
        this(abstractC9576ak);
        this.f8377k4 = i;
        this.f8379x1 = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo11841k4(int i) {
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public final int m11845kk() {
        return this.f8379x1;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m11846to() {
        return ((this.f8377k4 & 65535) == 3 && (this.f8379x1 & 65535) == 4) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m11847x1() {
        return this.f8377k4;
    }

    public C2421h4(AbstractC9576ak abstractC9576ak) {
        this.f8378kk = abstractC9576ak;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC9576ak m11844k4() {
        return this.f8378kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m11848x1(int i) {
        return ((this.f8377k4 & 65535) == 3 && (this.f8379x1 & 65535) == 4) ? AbstractC6747ar.m26638k4(AbstractC6747ar.m26643rv(), C11297kk.m54283k4("big5"), AbstractC6747ar.m26643rv().m26683x1(new char[]{(char) (i & 65535)})) : C14069jd.m66778k4((short) i);
    }

    /* JADX INFO: renamed from: k4 */
    public C9604wy mo11842k4(C9603wl c9603wl) {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo11843k4(C11296k4 c11296k4) {
    }
}
