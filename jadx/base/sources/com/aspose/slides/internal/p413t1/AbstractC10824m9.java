package com.aspose.slides.internal.p413t1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4986g8;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.m9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10824m9 extends AbstractC5120du {
    /* JADX INFO: renamed from: k4 */
    private static void m52399k4(C12016rv c12016rv, C12014ne c12014ne, Queue<C12016rv> queue, List<C12016rv> list) {
        if (!c12014ne.m56687x1(c12016rv.Clone()) || queue.contains(c12016rv.Clone()) || list.containsItem(c12016rv.Clone())) {
            return;
        }
        queue.enqueue(c12016rv.Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        long j;
        C4986g8 c4986g8 = (C4986g8) c5061vw;
        long jM21029kk = c4986g8.m21029kk();
        C11999ar c11999ar = (C11999ar) C7019kk.m27452k4((Object) c4201h4.m16679c5(), C11999ar.class);
        if (c11999ar == null) {
            return;
        }
        int iM56506h4 = c11999ar.m56305h4().m56506h4();
        int iM56506h42 = c4986g8.m21030x1().m58099k4().m56506h4();
        mo16635k4(new C12025x6[]{c4986g8.m21024k4().m58198to()}, c4201h4);
        int iOooO00o = OooO.OooO00o(r0[0].m56897x1(), 14);
        int iOooO00o2 = OooO.OooO00o(r0[0].m56895kk(), 14);
        C12014ne c12014ne = new C12014ne(0, 0, c4201h4.m16694g8().mo15760yj(), c4201h4.m16694g8().mo15757m9());
        C3983k4 c3983k4M56597k4 = c4201h4.m16694g8().m56597k4(c12014ne.Clone(), 3, 2498570);
        int iM15716k4 = c3983k4M56597k4.m15716k4() * (c3983k4M56597k4.m15715du() / 4);
        int[] iArr = new int[iM15716k4];
        C3914k4.m15619k4(c3983k4M56597k4.m15721to(), iArr, 0, iM15716k4);
        int i = iArr[((c3983k4M56597k4.m15715du() * iOooO00o2) / 4) + iOooO00o];
        if ((jM21029kk == 0 && i != iM56506h42) || (jM21029kk == 1 && i == iM56506h42)) {
            List list = new List();
            Queue queue = new Queue();
            queue.enqueue(new C12016rv(iOooO00o, iOooO00o2));
            while (queue.size() > 0) {
                C12016rv c12016rvClone = ((C12016rv) queue.dequeue()).Clone();
                if (jM21029kk == 0) {
                    if (iM56506h42 == iArr[((c3983k4M56597k4.m15715du() * c12016rvClone.m56713x1()) / 4) + c12016rvClone.m56708k4()]) {
                        if (jM21029kk == 1) {
                            if (iArr[((c3983k4M56597k4.m15715du() * c12016rvClone.m56713x1()) / 4) + c12016rvClone.m56708k4()] == iM56506h42) {
                                iArr[((c3983k4M56597k4.m15715du() * c12016rvClone.m56713x1()) / 4) + c12016rvClone.m56708k4()] = iM56506h4;
                                list.addItem(c12016rvClone.Clone());
                                C12016rv c12016rv = new C12016rv(c12016rvClone.m56708k4() - 1, c12016rvClone.m56713x1());
                                j = jM21029kk;
                                C12016rv c12016rv2 = new C12016rv(c12016rvClone.m56708k4() + 1, c12016rvClone.m56713x1());
                                C12016rv c12016rv3 = new C12016rv(c12016rvClone.m56708k4(), c12016rvClone.m56713x1() - 1);
                                C12016rv c12016rv4 = new C12016rv(c12016rvClone.m56708k4(), c12016rvClone.m56713x1() + 1);
                                m52399k4(c12016rv.Clone(), c12014ne.Clone(), queue, list);
                                m52399k4(c12016rv2.Clone(), c12014ne.Clone(), queue, list);
                                m52399k4(c12016rv3.Clone(), c12014ne.Clone(), queue, list);
                                m52399k4(c12016rv4.Clone(), c12014ne.Clone(), queue, list);
                            }
                        }
                        j = jM21029kk;
                    }
                }
                jM21029kk = j;
            }
            C3914k4.m15622k4(iArr, 0, c3983k4M56597k4.m15721to(), iM15716k4);
        }
        c4201h4.m16694g8().m56605k4(c3983k4M56597k4);
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16635k4(C12025x6[] c12025x6Arr, C4201h4 c4201h4);
}
