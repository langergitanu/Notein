package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.o4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10571o4 {

    /* JADX INFO: renamed from: ck */
    protected C10695wm f37257ck;

    /* JADX INFO: renamed from: k4 */
    private boolean f37258k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC10571o4 f37259x1;

    public AbstractC10571o4() {
        this.f37257ck = new C10695wm();
    }

    /* JADX INFO: renamed from: k4 */
    private void m51401k4(C3134k4 c3134k4, long j, int i) {
        long position = c3134k4.m13371ck().getPosition();
        c3134k4.m13371ck().setPosition(j);
        long length = c3134k4.m13371ck().getLength();
        if (((long) i) + j > length) {
            i = (int) (length - j);
        }
        if (i < 8) {
            if (i > 0) {
                c3134k4.m13372dy(i);
                return;
            }
            return;
        }
        c3134k4.m13382u4();
        c3134k4.m13382u4();
        byte[] bArrM13372dy = c3134k4.m13372dy(4);
        byte b = bArrM13372dy[0];
        byte b2 = bArrM13372dy[1];
        byte b3 = bArrM13372dy[2];
        byte b4 = bArrM13372dy[3];
        int i2 = i - 8;
        if (i2 < 1) {
            return;
        }
        c3134k4.m13372dy(i2);
        c3134k4.m13371ck().setPosition(position);
    }

    /* JADX INFO: renamed from: ak */
    public final AbstractC10571o4 m51402ak() {
        return this.f37259x1;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m51403b3() {
        return this.f37258k4;
    }

    /* JADX INFO: renamed from: bv */
    public final int m51404bv() {
        return C3085sv.m13071k4(this.f37257ck.m51923to());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo50440k4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo50441k4(C3134k4 c3134k4);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo50442k4(C3149x1 c3149x1);

    /* JADX INFO: renamed from: kk */
    public final void m51406kk(C3134k4 c3134k4) {
        m51405k4(c3134k4, new C10695wm(c3134k4));
    }

    /* JADX INFO: renamed from: lr */
    public final short m51408lr() {
        return this.f37257ck.m51922kk();
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, Header:{1}", C14067j2.m66727k4(this).mo48540du(), this.f37257ck.toString());
    }

    /* JADX INFO: renamed from: um */
    public final C10695wm m51409um() {
        return this.f37257ck;
    }

    /* JADX INFO: renamed from: v4 */
    public final byte m51410v4() {
        return this.f37257ck.m51924x1();
    }

    /* JADX INFO: renamed from: wy */
    public final AbstractC10571o4 m51411wy() {
        this.f37258k4 = true;
        return this;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51412x1(C3149x1 c3149x1) {
        int position = (int) c3149x1.m13442k4().getPosition();
        int i = position + 8;
        c3149x1.m13442k4().seek(i, 0);
        mo50442k4(c3149x1);
        int iM66997m9 = C14080ne.m66997m9(Long.valueOf(c3149x1.m13442k4().getPosition()));
        m51409um().m51925x1(iM66997m9 - i);
        c3149x1.m13442k4().seek(position, 0);
        m51409um().m51919k4(c3149x1);
        c3149x1.m13442k4().seek(iM66997m9, 0);
        int i2 = iM66997m9 - position;
        int iMo50440k4 = mo50440k4() + 8;
        if (i2 == iMo50440k4) {
            return i2;
        }
        throw new Exception(C14113y2.m67408k4("Writed number of bytes [0x", C14057f9.m66587k4(i2, "X4"), "] not equal to record size [0x", C14057f9.m66587k4(iMo50440k4, "X4"), "] ", toString()));
    }

    /* JADX INFO: renamed from: yd */
    public final int m51414yd() {
        return this.f37257ck.m51914du();
    }

    public AbstractC10571o4(int i, byte b) {
        C10695wm c10695wm = new C10695wm();
        this.f37257ck = c10695wm;
        c10695wm.m51917k4(i);
        this.f37257ck.m51916k4(b);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51405k4(C3134k4 c3134k4, C10695wm c10695wm) {
        this.f37257ck = c10695wm;
        int position = (int) c3134k4.m13371ck().getPosition();
        mo50441k4(c3134k4);
        int position2 = ((int) c3134k4.m13371ck().getPosition()) - position;
        if (position2 >= this.f37257ck.m51914du()) {
            if (position2 > this.f37257ck.m51914du()) {
                C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67408k4("Read wrong number of bytes [ 0x", C14057f9.m66587k4(position2, "X2"), " greater than hdr.Length=0x", C14057f9.m66587k4(this.f37257ck.m51914du(), "X2"), " ] from record! "), C14113y2.m67408k4("\nRecord: ", toString())), C14113y2.m67408k4("\nOffset: 0x", C14057f9.m66587k4(position, "X4"))), C14113y2.m67408k4(" / From: 0x", C14091t6.m67187k4(c3134k4.m13371ck().getLength(), "X4")));
                m51401k4(c3134k4, ((long) position) - 8, this.f37257ck.m51914du() + 16);
                return;
            }
            return;
        }
        int iM51914du = this.f37257ck.m51914du() - position2;
        long j = iM51914du;
        if (c3134k4.m13371ck().getPosition() + j > c3134k4.m13371ck().getLength()) {
            C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67408k4("Can't read a record data (", C14091t6.m67191x1((c3134k4.m13371ck().getPosition() + j) - c3134k4.m13371ck().getLength()), " byte(s) missing"), C14113y2.m67408k4("\nRecord: ", toString())), C14113y2.m67408k4("\nOffset: 0x", C14057f9.m66587k4(position, "X4")));
        } else {
            c3134k4.m13372dy(iM51914du);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m51407kk(short s) {
        this.f37257ck.m51920k4(s);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51413x1(AbstractC10571o4 abstractC10571o4) {
        this.f37259x1 = abstractC10571o4;
    }
}
