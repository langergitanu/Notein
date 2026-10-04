package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p061cc.AbstractC2417k4;
import com.aspose.slides.internal.p061cc.C2419x1;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p211jo.C5520c5;
import com.aspose.slides.internal.p211jo.C5521ck;
import com.aspose.slides.internal.p211jo.C5522du;
import com.aspose.slides.internal.p211jo.C5523dy;
import com.aspose.slides.internal.p211jo.C5524h4;
import com.aspose.slides.internal.p211jo.C5525jd;
import com.aspose.slides.internal.p211jo.C5526k4;
import com.aspose.slides.internal.p211jo.C5527kk;
import com.aspose.slides.internal.p211jo.C5528m9;
import com.aspose.slides.internal.p211jo.C5529to;
import com.aspose.slides.internal.p211jo.C5530x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.j2 */
/* JADX INFO: loaded from: classes.dex */
class C4543j2 extends AbstractC4550m9 {
    public C4543j2(AbstractC3150x6 abstractC3150x6, C4562tq c4562tq) {
        super(abstractC3150x6, c4562tq);
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC2417k4 m18750kk(byte b, byte[] bArr) {
        C4562tq c4562tq = (C4562tq) this.f12695x1;
        if (b == 0) {
            if (c4562tq.m18686yj() != 1) {
                c4562tq.m18655kk(0);
                return null;
            }
            m18796k4((byte) 1, (byte) 100);
            return null;
        }
        if (b == 2) {
            return new C5520c5(this.f12695x1, bArr);
        }
        if (b == 20) {
            return new C5523dy(this.f12695x1, bArr);
        }
        switch (b) {
            case 11:
                return new C5524h4(this.f12695x1, bArr);
            case 12:
                return new C5521ck(this.f12695x1, bArr);
            case 13:
                return new C5528m9(this.f12695x1, bArr);
            case 14:
                return new C5525jd(this.f12695x1, bArr);
            default:
                throw new C4545k4((byte) 10, C14113y2.m67391k4(C11697x1.m55255x1(), "Unknown server handshake message received ({0})", C14042ak.m66410k4(C2419x1.class, b)));
        }
    }

    /* JADX INFO: renamed from: to */
    private AbstractC2417k4 m18751to(byte b) {
        if (b == 1) {
            return new C5529to(this.f12695x1);
        }
        if (b == 11) {
            return new C5526k4(this.f12695x1);
        }
        if (b == 20) {
            return new C5527kk(this.f12695x1);
        }
        if (b == 15) {
            return new C5530x1(this.f12695x1);
        }
        if (b == 16) {
            return new C5522du(this.f12695x1);
        }
        throw new InvalidOperationException(C14113y2.m67408k4("Unknown client handshake message type: ", C14042ak.m66410k4(C2419x1.class, b)));
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4550m9
    /* JADX INFO: renamed from: k4 */
    public AbstractC2417k4 mo18752k4(byte b) {
        return m18751to(b);
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4550m9
    /* JADX INFO: renamed from: k4 */
    public void mo18753k4(C4540gi c4540gi) {
        byte[] bArr;
        byte bM27442k4 = C7019kk.m27442k4(Byte.valueOf(c4540gi.m18748x1()), 6);
        int iM18747to = c4540gi.m18747to();
        if (iM18747to > 0) {
            bArr = new byte[iM18747to];
            c4540gi.read(bArr, 0, iM18747to);
        } else {
            bArr = null;
        }
        AbstractC2417k4 abstractC2417k4M18750kk = m18750kk(bM27442k4, bArr);
        if (abstractC2417k4M18750kk != null) {
            abstractC2417k4M18750kk.m11840yj();
        }
        m18791k4().m18647k4(bM27442k4);
        if (abstractC2417k4M18750kk != null) {
            abstractC2417k4M18750kk.mo11835dy();
            m18791k4().m18663ne().writeByte(bM27442k4);
            m18791k4().m18663ne().m18749x1(iM18747to);
            if (iM18747to > 0) {
                m18791k4().m18663ne().write(bArr, 0, bArr.length);
            }
        }
    }
}
