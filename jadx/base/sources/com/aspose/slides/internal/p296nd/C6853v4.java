package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1761v4;
import com.aspose.slides.internal.p075d5.C3020k4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11318m9;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6853v4 extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C12018u4 c12018u4M54399ck;
        C1761v4 c1761v4 = (C1761v4) c1752sv;
        if ((c1761v4.m9479k4() & 65535) < c11315h4.m54440m9().length && (c12018u4M54399ck = c11315h4.m54399ck(c1761v4.m9479k4())) != null) {
            abstractC12008jd.mo17523k4(c12018u4M54399ck, 1);
            int i = 0;
            C3983k4 c3983k4M56597k4 = c11315h4.m54409ix().m56597k4(new C12014ne(0, 0, c11315h4.m54409ix().mo15760yj(), c11315h4.m54409ix().mo15757m9()).Clone(), 3, 2498570);
            C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
            int i2 = 0;
            int i3 = 0;
            while (i2 < c3983k4M56597k4.m15716k4()) {
                int iM67482k4 = C14116yg.m67482k4(c3983k4M56597k4.m15715du());
                byte[] bArr = new byte[iM67482k4];
                C3914k4.m15618k4(c14112xwM15721to, bArr, i, iM67482k4);
                int i4 = i;
                int i5 = i4;
                while (i4 < iM67482k4) {
                    if (abstractC12008jd.mo17480h4().m56754k4(i5, i3)) {
                        int i6 = i4 + 3;
                        int i7 = i4 + 2;
                        int i8 = i4 + 1;
                        C12003du c12003duClone = C11318m9.m54478k4(new C3020k4(C12003du.m56398k4(bArr[i6] & 255, bArr[i7] & 255, bArr[i8] & 255, bArr[i4] & 255).Clone().Clone())).mo12707x1().Clone();
                        bArr[i4] = c12003duClone.m56505fa();
                        bArr[i8] = c12003duClone.m56502ck();
                        bArr[i7] = c12003duClone.m56507jd();
                        bArr[i6] = -1;
                    }
                    i4 += 4;
                    i5++;
                    i = 0;
                }
                int i9 = i;
                C3914k4.m15621k4(bArr, i9, c14112xwM15721to, iM67482k4);
                i2++;
                i3++;
                c14112xwM15721to = new C14112xw(c14112xwM15721to.m67357x1() + ((long) iM67482k4));
                i = i9;
            }
            c11315h4.m54409ix().m56605k4(c3983k4M56597k4);
        }
    }
}
