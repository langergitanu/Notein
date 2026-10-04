package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.up */
/* JADX INFO: loaded from: classes5.dex */
public class C12271up extends AbstractC3150x6 implements IDisposable {

    /* JADX INFO: renamed from: kk */
    public static final C14084qq f41033kk = new C14084qq(1970, 1, 1, 0, 0, 0, C11697x1.m55250kk().m55266k4());

    /* JADX INFO: renamed from: to */
    public static final AbstractC6747ar f41034to = C12555c5.m58553k4("iso-8859-1");

    /* JADX INFO: renamed from: c5 */
    private String f41035c5;

    /* JADX INFO: renamed from: du */
    private int f41036du;

    /* JADX INFO: renamed from: dy */
    private String f41037dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f41038h4;

    /* JADX INFO: renamed from: jd */
    private int f41039jd;

    /* JADX INFO: renamed from: k4 */
    public C14084qq f41040k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f41041m9;

    /* JADX INFO: renamed from: x1 */
    public C12252dq f41042x1;

    public C12271up(AbstractC3150x6 abstractC3150x6, int i) {
        this(abstractC3150x6, i, 6, false);
    }

    /* JADX INFO: renamed from: kk */
    private int m57388kk() {
        byte[] bArrMo26677to = m57389k4() == null ? null : f41034to.mo26677to(m57389k4());
        byte[] bArrMo26677to2 = m57392x1() != null ? f41034to.mo26677to(m57392x1()) : null;
        int length = m57389k4() == null ? 0 : bArrMo26677to.length + 1;
        int length2 = m57392x1() == null ? 0 : bArrMo26677to2.length + 1;
        int i = length + 10 + length2;
        byte[] bArr = new byte[i];
        bArr[0] = 31;
        bArr[1] = -117;
        bArr[2] = 8;
        byte b = m57389k4() != null ? (byte) 16 : (byte) 0;
        if (m57392x1() != null) {
            b = (byte) ((b & 255) ^ 8);
        }
        bArr[3] = b;
        if (C14084qq.m67112m9(this.f41040k4, C14084qq.f47299x1)) {
            C14084qq.m67081jd().CloneTo(this.f41040k4);
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) C14069jd.m66785x1(C7019kk.m27462to(Double.valueOf(C14084qq.m67073c5(this.f41040k4, f41033kk).Clone().m66811c5()), 14))), 0, AbstractC14092to.m67208k4((Object) bArr), 4, 4);
        bArr[8] = 0;
        bArr[9] = -1;
        int i2 = 10;
        if (length2 != 0) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrMo26677to2), 0, AbstractC14092to.m67208k4((Object) bArr), 10, length2 - 1);
            i2 = length2 + 10;
            bArr[length2 + 9] = 0;
        }
        if (length != 0) {
            int i3 = length - 1;
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArrMo26677to), 0, AbstractC14092to.m67208k4((Object) bArr), i2, i3);
            bArr[i2 + i3] = 0;
        }
        this.f41042x1.f40831ck.write(bArr, 0, i);
        return i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        return this.f41042x1.f40831ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        return this.f41042x1.f40831ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        m57391k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6, com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m57391k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        this.f41042x1.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        C12252dq c12252dq = this.f41042x1;
        int i = c12252dq.f40845x1;
        if (i == 0) {
            return c12252dq.f40837k4.f41124dy + ((long) this.f41036du);
        }
        if (i == 1) {
            return c12252dq.f40837k4.f41132to + ((long) c12252dq.f40842rv);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m57389k4() {
        return this.f41035c5;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        int i3 = this.f41042x1.read(bArr, i, i2);
        if (!this.f41041m9) {
            this.f41041m9 = true;
            m57393x1(this.f41042x1.f40844up);
            m57390k4(this.f41042x1.f40847yj);
        }
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        C12252dq c12252dq = this.f41042x1;
        if (c12252dq.f40845x1 == 2) {
            if (!c12252dq.m57216x1()) {
                throw new InvalidOperationException();
            }
            this.f41036du = m57388kk();
        }
        this.f41042x1.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m57392x1() {
        return this.f41037dy;
    }

    public C12271up(AbstractC3150x6 abstractC3150x6, int i, int i2, boolean z) {
        this.f41040k4 = C14084qq.f47299x1.Clone();
        this.f41042x1 = new C12252dq(abstractC3150x6, i, i2, 1952, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57390k4(String str) {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        this.f41035c5 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57393x1(String str) {
        if (this.f41038h4) {
            throw new ObjectDisposedException("GZipStream");
        }
        this.f41037dy = str;
        if (str == null) {
            return;
        }
        if (C14113y2.m67364dy(str, "/") != -1) {
            this.f41037dy = C14113y2.m67401k4(this.f41037dy, "/", "\\");
        }
        if (C14113y2.m67424kk(this.f41037dy, "\\")) {
            throw new InvalidOperationException("Illegal filename");
        }
        if (C14113y2.m67364dy(this.f41037dy, "\\") != -1) {
            this.f41037dy = C3141rv.m13403k4(this.f41037dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m57391k4(boolean z) {
        C12252dq c12252dq;
        if (this.f41038h4) {
            return;
        }
        if (z && (c12252dq = this.f41042x1) != null) {
            c12252dq.close();
            this.f41039jd = this.f41042x1.m57215k4();
        }
        this.f41038h4 = true;
    }
}
