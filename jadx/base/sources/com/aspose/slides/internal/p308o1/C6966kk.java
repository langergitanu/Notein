package com.aspose.slides.internal.p308o1;

import com.aspose.slides.internal.p133fk.C4074du;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p345pu.C9558c5;
import com.aspose.slides.internal.p345pu.C9559ck;
import com.aspose.slides.internal.p345pu.C9560du;
import com.aspose.slides.internal.p345pu.C9561dy;
import com.aspose.slides.internal.p345pu.C9563h4;
import com.aspose.slides.internal.p345pu.C9564jd;
import com.aspose.slides.internal.p345pu.C9567m9;
import com.aspose.slides.internal.p345pu.C9568to;
import com.aspose.slides.internal.p345pu.C9569up;
import com.aspose.slides.internal.p345pu.InterfaceC9562fa;
import com.aspose.slides.internal.p370qv.AbstractC9947x1;
import com.aspose.slides.internal.p370qv.C9944k4;
import com.aspose.slides.internal.p370qv.C9946to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11903ks;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11911x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.o1.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6966kk {

    /* JADX INFO: renamed from: c5 */
    private C12003du[] f18953c5;

    /* JADX INFO: renamed from: du */
    private boolean f18954du;

    /* JADX INFO: renamed from: dy */
    private List<AbstractC9947x1> f18955dy;

    /* JADX INFO: renamed from: h4 */
    private C4074du f18956h4;

    /* JADX INFO: renamed from: k4 */
    private C11906rv f18957k4;

    /* JADX INFO: renamed from: kk */
    private C11903ks f18958kk;

    /* JADX INFO: renamed from: m9 */
    private InterfaceC9562fa f18959m9;

    /* JADX INFO: renamed from: to */
    private C12025x6 f18960to;

    /* JADX INFO: renamed from: x1 */
    private C11896dy f18961x1;

    public C6966kk(C11906rv c11906rv, C11896dy c11896dy, C11913yj c11913yj, C11896dy c11896dy2) {
        this.f18954du = false;
        this.f18957k4 = c11906rv;
        this.f18961x1 = c11896dy2;
        this.f18958kk = c11896dy2.m55573x1();
        this.f18960to = C9467to.m46525k4(c11906rv.m55684dy(), c11913yj);
        this.f18954du = m27234k4(this.f18957k4);
        C12003du[] c12003duArrM27235k4 = m27235k4(this.f18957k4, this.f18958kk);
        this.f18953c5 = c12003duArrM27235k4;
        this.f18955dy = m27233k4(this.f18957k4, this.f18958kk, c12003duArrM27235k4);
        this.f18956h4 = new C4074du(c11906rv, c11896dy, c11913yj);
        this.f18959m9 = m27230k4();
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC9562fa m27230k4() {
        C11911x1 c11911x1M55686h4 = this.f18957k4.m55686h4();
        if (c11911x1M55686h4 == null) {
            return this.f18954du ? new C9567m9(this.f18957k4) : m27236x1() ? new C9560du(this.f18957k4) : new C9564jd(this.f18957k4);
        }
        float[] fArrM55747x1 = c11911x1M55686h4.m55747x1();
        float[] fArrM55744kk = c11911x1M55686h4.m55744kk();
        return (fArrM55747x1.length == 1 && fArrM55747x1[0] == 1.0f && fArrM55744kk.length == 1 && fArrM55744kk[0] == 0.0f) ? this.f18954du ? new C9561dy(this.f18957k4) : m27236x1() ? new C9569up(this.f18957k4) : new C9559ck(this.f18957k4, this.f18953c5) : this.f18954du ? new C9563h4(this.f18957k4) : m27236x1() ? new C9568to(this.f18957k4) : new C9558c5(this.f18957k4);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m27236x1() {
        return (this.f18957k4.m55681c5().m56897x1() == 0.0f && this.f18957k4.m55681c5().m56895kk() == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9947x1 m27231k4(double d, double d2) {
        List<AbstractC9947x1> list = this.f18955dy;
        ListIterator<AbstractC9947x1> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            AbstractC9947x1 abstractC9947x1Previous = listIterator.previous();
            if (abstractC9947x1Previous.mo48883k4(d, d2)) {
                return abstractC9947x1Previous;
            }
        }
        List<AbstractC9947x1> list2 = this.f18955dy;
        ListIterator<AbstractC9947x1> listIterator2 = list2.listIterator(list2.size());
        while (listIterator2.hasPrevious()) {
            AbstractC9947x1 abstractC9947x1Previous2 = listIterator2.previous();
            if (abstractC9947x1Previous2.mo48885x1(d, d2)) {
                return abstractC9947x1Previous2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du m27232k4(C12025x6 c12025x6) {
        C12003du c12003duMo46705k4;
        C12025x6 c12025x6M16230k4 = this.f18956h4.m16230k4(c12025x6);
        AbstractC9947x1 abstractC9947x1M27231k4 = m27231k4(c12025x6M16230k4.m56897x1(), c12025x6M16230k4.m56895kk());
        return (abstractC9947x1M27231k4 == null || (c12003duMo46705k4 = this.f18959m9.mo46705k4(c12025x6M16230k4.m56897x1(), c12025x6M16230k4.m56895kk(), abstractC9947x1M27231k4)) == null) ? C12003du.m56396k4(0) : c12003duMo46705k4;
    }

    /* JADX INFO: renamed from: k4 */
    private List<AbstractC9947x1> m27233k4(C11906rv c11906rv, C11903ks c11903ks, C12003du[] c12003duArr) {
        C12025x6[] c12025x6ArrM55672k4 = c11903ks.m55672k4();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < c12025x6ArrM55672k4.length) {
            int i2 = i < c12025x6ArrM55672k4.length + (-1) ? i + 1 : 0;
            C12025x6 c12025x6 = c12025x6ArrM55672k4[i];
            C12025x6 c12025x62 = c12025x6ArrM55672k4[i2];
            arrayList.add((this.f18954du || !m27236x1()) ? new C9946to(this.f18960to, c12025x6, c12025x62, c12003duArr[i], c12003duArr[i2]) : new C9944k4(this.f18960to, c12025x6, c12025x62, c12003duArr[i], c12003duArr[i2], c11906rv.m55681c5()));
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m27234k4(C11906rv c11906rv) {
        C12003du[] c12003duArrM55682ck = c11906rv.m55682ck();
        int length = c12003duArrM55682ck.length;
        int i = 0;
        while (i < length - 1) {
            C12003du c12003du = c12003duArrM55682ck[i];
            i++;
            if (!c12003du.equals(c12003duArrM55682ck[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public int[] m27237k4(int i, int i2, int i3, int i4) {
        int[] iArr = new int[i3 * i4];
        C12025x6 c12025x6 = new C12025x6();
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                c12025x6.m56891k4(i + i6);
                c12025x6.m56898x1(i2 + i5);
                iArr[(i5 * i3) + i6] = m27232k4(c12025x6).m56506h4();
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    private C12003du[] m27235k4(C11906rv c11906rv, C11903ks c11903ks) {
        int length = c11903ks.m55672k4().length;
        C12003du[] c12003duArr = new C12003du[length];
        C12003du[] c12003duArrM55682ck = c11906rv.m55682ck();
        int length2 = c12003duArrM55682ck.length;
        for (int i = 0; i < length; i++) {
            if (i < length2) {
                c12003duArr[i] = c12003duArrM55682ck[i];
            } else {
                c12003duArr[i] = c12003duArr[length2 - 1];
            }
        }
        return c12003duArr;
    }
}
