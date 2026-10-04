package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3859m9;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4056v4;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p500xi.C12532k4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C9519lr extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C12018u4 c12018u4M15467ck;
        C4056v4 c4056v4 = (C4056v4) c4047sv;
        if ((c4056v4.m16147k4() & 65535) < c3856h4.m15510m9().length && (c12018u4M15467ck = c3856h4.m15467ck(c4056v4.m16147k4())) != null) {
            abstractC12008jd.mo17523k4(c12018u4M15467ck, 1);
            int i = 0;
            C3983k4 c3983k4M56597k4 = c3856h4.m15479ix().m56597k4(new C12014ne(0, 0, c3856h4.m15479ix().mo15760yj(), c3856h4.m15479ix().mo15757m9()).Clone(), 3, 2498570);
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
                        C12003du c12003duClone = C3859m9.m15553k4(new C12532k4(C12003du.m56398k4(bArr[i6] & 255, bArr[i7] & 255, bArr[i8] & 255, bArr[i4] & 255).Clone().Clone())).mo58349x1().Clone();
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
            c3856h4.m15479ix().m56605k4(c3983k4M56597k4);
        }
    }
}
