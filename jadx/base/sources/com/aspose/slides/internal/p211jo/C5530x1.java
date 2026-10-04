package com.aspose.slides.internal.p211jo;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p166hg.AbstractC4523ai;
import com.aspose.slides.internal.p166hg.C4545k4;
import com.aspose.slides.internal.p166hg.C4562tq;
import com.aspose.slides.internal.p166hg.C4563ts;
import com.aspose.slides.internal.p174hz.AbstractC4709du;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p174hz.C4701bs;
import com.aspose.slides.internal.p174hz.C4724j2;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12821du;
import com.aspose.slides.internal.p525yi.C12824h4;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.jo.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5530x1 extends AbstractC2417k4 {
    public C5530x1(AbstractC4523ai abstractC4523ai) {
        super(abstractC4523ai, (byte) 15);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4751tq m22602k4(AbstractC4751tq abstractC4751tq) {
        C4701bs c4701bs = new C4701bs();
        C4701bs c4701bsClone = abstractC4751tq.mo19642x1(true).Clone();
        C12842x1 c12842x1 = new C12842x1(m11834ck().m18639fa().m18841x1().get_Item(0).m15283jd());
        C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
        if (c12842x1M59710k4 == null || C7019kk.m27462to(Byte.valueOf(c12842x1M59710k4.m59718x1()), 6) != 2) {
            return null;
        }
        C12842x1 c12842x1M59710k42 = c12842x1.m59710k4(1);
        if (C7019kk.m27462to(Byte.valueOf(c12842x1M59710k42.m59718x1()), 6) != 2) {
            return null;
        }
        c4701bs.f13121m9 = m22603x1(c12842x1M59710k4.m59717to());
        c4701bs.f13117dy = c12842x1M59710k42.m59717to();
        c4701bs.f13120kk = c4701bsClone.f13120kk;
        c4701bs.f13122to = c4701bsClone.f13122to;
        c4701bs.f13116du = c4701bsClone.f13116du;
        c4701bs.f13118h4 = c4701bsClone.f13118h4;
        c4701bs.f13119k4 = c4701bsClone.f13119k4;
        c4701bs.f13123x1 = c4701bsClone.f13123x1;
        C12824h4 c12824h4 = new C12824h4(c4701bs.f13121m9.length << 3);
        c12824h4.mo19639k4(c4701bs.Clone());
        return c12824h4;
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m22603x1(byte[] bArr) {
        if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 0) {
            return bArr;
        }
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        C14058fa.m66596k4(bArr, 1, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: c5 */
    public void mo11833c5() {
        byte[] bArrM18848k4;
        C4562tq c4562tq = (C4562tq) m11834ck();
        AbstractC4709du abstractC4709duM18864x1 = c4562tq.m18842k4().m18864x1(c4562tq.m18639fa().m18839kk(), c4562tq.m18639fa().m18835k4());
        if (abstractC4709duM18864x1 == null) {
            throw new C4545k4((byte) 90, "Client certificate Private Key unavailable.");
        }
        C4563ts c4563ts = new C4563ts(c4562tq.m18672um());
        c4563ts.mo19564k4(c4562tq.m18663ne().m18739h4(), 0, C7019kk.m27462to(Long.valueOf(c4562tq.m18663ne().getLength()), 11));
        if (C7019kk.m27469x1(abstractC4709duM18864x1, C4724j2.class)) {
            bArrM18848k4 = null;
        } else {
            try {
                bArrM18848k4 = c4563ts.m18848k4((AbstractC4751tq) abstractC4709duM18864x1);
            } catch (NotImplementedException unused) {
                bArrM18848k4 = null;
            }
        }
        if (bArrM18848k4 == null) {
            bArrM18848k4 = c4563ts.m18848k4(m22602k4((AbstractC4751tq) abstractC4709duM18864x1));
        }
        m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrM18848k4.length), 9));
        write(bArrM18848k4, 0, bArrM18848k4.length);
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: dy */
    public void mo11835dy() {
        super.mo11835dy();
        m18738du();
    }

    @Override // com.aspose.slides.internal.p061cc.AbstractC2417k4
    /* JADX INFO: renamed from: jd */
    public void mo11837jd() {
        byte[] bArrM59616k4;
        C4562tq c4562tq = (C4562tq) m11834ck();
        AbstractC4709du abstractC4709duM18864x1 = c4562tq.m18842k4().m18864x1(c4562tq.m18639fa().m18839kk(), c4562tq.m18639fa().m18835k4());
        if (abstractC4709duM18864x1 == null) {
            throw new C4545k4((byte) 90, "Client certificate Private Key unavailable.");
        }
        C12821du c12821du = new C12821du();
        c12821du.m19586kk(c4562tq.m18663ne().m18739h4(), 0, C7019kk.m27462to(Long.valueOf(c4562tq.m18663ne().getLength()), 11));
        if (C7019kk.m27469x1(abstractC4709duM18864x1, C4724j2.class)) {
            bArrM59616k4 = null;
        } else {
            try {
                bArrM59616k4 = c12821du.m59616k4((AbstractC4751tq) abstractC4709duM18864x1);
            } catch (NotImplementedException unused) {
                bArrM59616k4 = null;
            }
        }
        if (bArrM59616k4 == null) {
            bArrM59616k4 = c12821du.m59616k4(m22602k4((AbstractC4751tq) abstractC4709duM18864x1));
        }
        m18741k4(C7019kk.m27468x1(Integer.valueOf(bArrM59616k4.length), 9));
        write(bArrM59616k4, 0, bArrM59616k4.length);
    }
}
