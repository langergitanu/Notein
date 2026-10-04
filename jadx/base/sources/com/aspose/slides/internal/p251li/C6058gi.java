package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p171hq.AbstractC4655sv;
import com.aspose.slides.internal.p312o9.C6976k4;
import com.aspose.slides.internal.p396sc.C10196rv;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C6058gi extends AbstractC6047c6 {

    /* JADX INFO: renamed from: k4 */
    private C6976k4 f17167k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f17168kk;

    /* JADX INFO: renamed from: to */
    private AbstractC4655sv f17169to;

    /* JADX INFO: renamed from: x1 */
    private long f17170x1;

    public C6058gi(C6045bz c6045bz) {
        super(c6045bz);
        this.f17167k4 = new C6976k4();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: G_ */
    public short mo24431G_() {
        return super.mo24431G_();
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC4655sv m24503c5() {
        return this.f17169to;
    }

    /* JADX INFO: renamed from: dy */
    public final byte[] m24504dy() {
        return this.f17168kk;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m24509k4((C6058gi) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ this.f17167k4.hashCode()) * 397) ^ ((int) m24511to())) * 397) ^ (m24504dy() != null ? AbstractC14092to.m67208k4((Object) m24504dy()).hashCode() : 0)) * 397) ^ (m24503c5() != null ? m24503c5().hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24505k4(long j) {
        this.f17170x1 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final C6976k4 m24510kk() {
        return this.f17167k4;
    }

    /* JADX INFO: renamed from: to */
    public final long m24511to() {
        return this.f17170x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24506k4(AbstractC4655sv abstractC4655sv) {
        this.f17169to = abstractC4655sv;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24507k4(C6976k4 c6976k4) {
        if (!C10196rv.m50013k4(c6976k4.toString())) {
            throw new ArgumentOutOfRangeException("value");
        }
        c6976k4.CloneTo(this.f17167k4);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: k4 */
    public void mo24437k4(short s) {
        if (s != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        super.mo24437k4(s);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24508k4(byte[] bArr) {
        this.f17168kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24509k4(C6058gi c6058gi) {
        return m24438k4((C6045bz) c6058gi) && this.f17167k4.m27290k4(c6058gi.f17167k4.Clone()) && m24511to() == c6058gi.m24511to() && C12530dy.m58330k4(m24504dy(), c6058gi.m24504dy()) && C14067j2.m66728k4(m24503c5(), c6058gi.m24503c5());
    }
}
