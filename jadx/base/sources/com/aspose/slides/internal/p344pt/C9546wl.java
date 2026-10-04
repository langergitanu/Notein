package com.aspose.slides.internal.p344pt;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.OooO;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4052u4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C9546wl extends AbstractC9530rv {
    /* JADX INFO: renamed from: k4 */
    private static void m46703k4(C12016rv c12016rv, C12014ne c12014ne, Queue<C12016rv> queue, List<C12016rv> list) {
        if (!c12014ne.m56687x1(c12016rv.Clone()) || queue.contains(c12016rv.Clone()) || list.containsItem(c12016rv.Clone())) {
            return;
        }
        queue.enqueue(c12016rv.Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        int i;
        C4052u4 c4052u4 = (C4052u4) c4047sv;
        int iM16101k4 = c4052u4.m16101k4();
        C11999ar c11999ar = (C11999ar) C7019kk.m27452k4((Object) c3856h4.m15472dy(), C11999ar.class);
        if (c11999ar == null) {
            return;
        }
        int iM56506h4 = c11999ar.m56305h4().m56506h4();
        int iM56506h42 = c4052u4.m16107x1().m57666h4().m56506h4();
        abstractC12008jd.mo17577u4().m55775k4(new C12025x6[]{new C12025x6(c4052u4.m16106to(), c4052u4.m16105kk())});
        int iOooO00o = OooO.OooO00o(r0[0].m56897x1(), 14);
        int iOooO00o2 = OooO.OooO00o(r0[0].m56895kk(), 14);
        C12014ne c12014ne = new C12014ne(0, 0, c3856h4.m15479ix().mo15760yj(), c3856h4.m15479ix().mo15757m9());
        C3983k4 c3983k4M56597k4 = c3856h4.m15479ix().m56597k4(c12014ne.Clone(), 3, 2498570);
        int iM15716k4 = c3983k4M56597k4.m15716k4() * (c3983k4M56597k4.m15715du() / 4);
        int[] iArr = new int[iM15716k4];
        C3914k4.m15619k4(c3983k4M56597k4.m15721to(), iArr, 0, iM15716k4);
        int i2 = iArr[((c3983k4M56597k4.m15715du() * iOooO00o2) / 4) + iOooO00o];
        int i3 = 1;
        if ((iM16101k4 == 0 && i2 != iM56506h42) || (iM16101k4 == 1 && i2 == iM56506h42)) {
            List list = new List();
            Queue queue = new Queue();
            queue.enqueue(new C12016rv(iOooO00o, iOooO00o2));
            while (queue.size() > 0) {
                C12016rv c12016rvClone = ((C12016rv) queue.dequeue()).Clone();
                if (iM16101k4 == 0) {
                    if (iM56506h42 == iArr[((c3983k4M56597k4.m15715du() * c12016rvClone.m56713x1()) / 4) + c12016rvClone.m56708k4()]) {
                        if (iM16101k4 == i3) {
                            if (iArr[((c3983k4M56597k4.m15715du() * c12016rvClone.m56713x1()) / 4) + c12016rvClone.m56708k4()] == iM56506h42) {
                                iArr[((c3983k4M56597k4.m15715du() * c12016rvClone.m56713x1()) / 4) + c12016rvClone.m56708k4()] = iM56506h4;
                                list.addItem(c12016rvClone.Clone());
                                C12016rv c12016rv = new C12016rv(c12016rvClone.m56708k4() - i3, c12016rvClone.m56713x1());
                                C12016rv c12016rv2 = new C12016rv(c12016rvClone.m56708k4() + i3, c12016rvClone.m56713x1());
                                i = i3;
                                C12016rv c12016rv3 = new C12016rv(c12016rvClone.m56708k4(), c12016rvClone.m56713x1() - 1);
                                C12016rv c12016rv4 = new C12016rv(c12016rvClone.m56708k4(), c12016rvClone.m56713x1() + 1);
                                m46703k4(c12016rv.Clone(), c12014ne.Clone(), (Queue<C12016rv>) queue, (List<C12016rv>) list);
                                m46703k4(c12016rv2.Clone(), c12014ne.Clone(), (Queue<C12016rv>) queue, (List<C12016rv>) list);
                                m46703k4(c12016rv3.Clone(), c12014ne.Clone(), (Queue<C12016rv>) queue, (List<C12016rv>) list);
                                m46703k4(c12016rv4.Clone(), c12014ne.Clone(), (Queue<C12016rv>) queue, (List<C12016rv>) list);
                            }
                        }
                        i = i3;
                    }
                }
                i3 = i;
            }
            C3914k4.m15622k4(iArr, 0, c3983k4M56597k4.m15721to(), iM15716k4);
        }
        c3856h4.m15479ix().m56605k4(c3983k4M56597k4);
    }
}
