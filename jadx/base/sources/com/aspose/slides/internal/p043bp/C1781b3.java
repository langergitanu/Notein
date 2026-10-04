package com.aspose.slides.internal.p043bp;

import com.aspose.slides.internal.p027aq.C1513ar;
import com.aspose.slides.internal.p027aq.C1520dq;
import com.aspose.slides.internal.p027aq.C1522dy;
import com.aspose.slides.internal.p027aq.C1539qq;
import com.aspose.slides.internal.p027aq.C1540rv;
import com.aspose.slides.internal.p027aq.C1541s7;
import com.aspose.slides.internal.p027aq.C1542ss;
import com.aspose.slides.internal.p027aq.C1546ts;
import com.aspose.slides.internal.p027aq.C1550uz;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p251li.C6097xk;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p292n5.AbstractC6744x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bp.b3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1781b3 extends AbstractC6744x1 {
    @Override // com.aspose.slides.internal.p292n5.AbstractC6744x1
    /* JADX INFO: renamed from: x1 */
    public void mo9558x1(C6045bz c6045bz, AbstractC3150x6 abstractC3150x6) {
        C6097xk c6097xk = (C6097xk) c6045bz;
        C3149x1 c3149x1 = new C3149x1(abstractC3150x6);
        if (c6097xk.m24698kk()) {
            c3149x1.m13455x1(c6097xk.m24689c5());
            c3149x1.m13450k4(c6097xk.m24690ck());
            return;
        }
        int iMo24432H_ = c6097xk.mo24432H_();
        long position = abstractC3150x6.getPosition();
        switch (c6097xk.m24699to()) {
            case 0:
                throw new C6490k4("The object is not a valid object.");
            case 1:
                new C1522dy(iMo24432H_).m8310k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 2:
                new C1546ts(iMo24432H_).m8334k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 3:
                new C1520dq().m8308k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 4:
                new C1542ss().m8330k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 5:
                new C1513ar(null, iMo24432H_, iMo24432H_).m8301k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 6:
                new C1550uz().m8338k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 7:
                new C1541s7().m8329k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 8:
                new C1539qq().m8327k4(c6097xk.m24692jd(), c3149x1);
                break;
            case 9:
                new C1540rv().m8328k4(c6097xk.m24692jd(), c3149x1);
                break;
            default:
                throw new C6490k4("Unknown object type: " + (c6097xk.m24699to() & 255));
        }
        int position2 = (int) (abstractC3150x6.getPosition() - position);
        if (position2 > iMo24432H_) {
            throw new C6490k4("Stream position is out of object bounds.");
        }
        int i = iMo24432H_ - position2;
        if (i > 4) {
            C6005k4.m24264to(C14113y2.m67408k4("Unparsed data remains in the stream. Count=", C14057f9.m66591x1(i)));
        }
    }
}
