package com.aspose.slides.internal.p513xw;

import Oooo0.C20855OooooOO;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1582ck;
import com.aspose.slides.internal.p034b3.C1602uz;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p051bz.C1927uz;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p150gi.C4266c6;
import com.aspose.slides.internal.p314oc.C7016dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10770ck;
import com.aspose.slides.internal.p409sv.C10780ks;
import com.aspose.slides.internal.p461vh.C11643kk;
import com.aspose.slides.internal.p462vj.C11663ks;
import com.aspose.slides.internal.p462vj.C11668rv;
import com.aspose.slides.internal.p462vj.C11674uz;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p486wy.C12311c5;
import com.aspose.slides.internal.p486wy.C12312ck;
import com.aspose.slides.internal.p486wy.C12314dy;
import com.aspose.slides.internal.p486wy.C12317jd;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12702ix extends AbstractC12732up {

    /* JADX INFO: renamed from: g8 */
    private static final C7016dy<Integer> f42247g8 = new C7016dy<>(0);

    /* JADX INFO: renamed from: ak */
    private int f42248ak;

    /* JADX INFO: renamed from: ar */
    private int f42249ar;

    /* JADX INFO: renamed from: b3 */
    private int f42250b3;

    /* JADX INFO: renamed from: bv */
    private boolean f42251bv;

    /* JADX INFO: renamed from: bz */
    private Object f42252bz;

    /* JADX INFO: renamed from: c5 */
    public int f42253c5;

    /* JADX INFO: renamed from: c6 */
    private int f42254c6;

    /* JADX INFO: renamed from: dq */
    private int f42255dq;

    /* JADX INFO: renamed from: e0 */
    private C1606x1 f42256e0;

    /* JADX INFO: renamed from: lr */
    private int f42257lr;

    /* JADX INFO: renamed from: qm */
    private boolean f42258qm;

    /* JADX INFO: renamed from: qq */
    private int f42259qq;

    /* JADX INFO: renamed from: sv */
    private boolean f42260sv;

    /* JADX INFO: renamed from: ts */
    private Object f42261ts;

    /* JADX INFO: renamed from: um */
    private int f42262um;

    /* JADX INFO: renamed from: uz */
    private boolean f42263uz;

    /* JADX INFO: renamed from: v4 */
    private int f42264v4;

    /* JADX INFO: renamed from: wl */
    private final List<C11663ks> f42265wl;

    /* JADX INFO: renamed from: wy */
    private int f42266wy;

    /* JADX INFO: renamed from: xk */
    private boolean f42267xk;

    /* JADX INFO: renamed from: yd */
    private int f42268yd;

    public C12702ix(C10770ck c10770ck) {
        super(c10770ck);
        this.f42265wl = new List<>();
        this.f42253c5 = -1;
        this.f42249ar = 0;
        this.f42262um = 0;
        this.f42248ak = 0;
        this.f42255dq = 0;
        this.f42267xk = false;
        this.f42254c6 = 0;
        this.f42261ts = null;
        this.f42256e0 = null;
        this.f42252bz = null;
        this.f42258qm = false;
        this.f42260sv = false;
    }

    /* JADX INFO: renamed from: k4 */
    private int m58945k4(C11663ks c11663ks, InterfaceC12711lr interfaceC12711lr) {
        AbstractC3524ks abstractC3524ksMo59012up = c11663ks.mo59012up();
        int iMo9886x1 = 0;
        while (interfaceC12711lr != null && abstractC3524ksMo59012up != interfaceC12711lr.mo59012up()) {
            C12687c5 c12687c5 = (C12687c5) C7019kk.m27452k4((Object) interfaceC12711lr, C12687c5.class);
            if (c12687c5 != null) {
                iMo9886x1 = c12687c5.m58881ts().m52229e0().f11652k4.mo9886x1(c12687c5) + iMo9886x1;
            }
            interfaceC12711lr = interfaceC12711lr.mo54977m9();
        }
        return iMo9886x1;
    }

    /* JADX INFO: renamed from: x1 */
    private List<InterfaceC1861h4> m58951x1(C12724ss c12724ss, int i) {
        return mo58879k4(new C12724ss(c12724ss), i, (Stack<InterfaceC12711lr>) null, (C12717os) null, (InterfaceC12711lr) null);
    }

    /* JADX INFO: renamed from: ai */
    public final int m58953ai() {
        return this.f42268yd;
    }

    /* JADX INFO: renamed from: b3 */
    public final List<C11663ks> m58954b3() {
        return this.f42265wl;
    }

    /* JADX INFO: renamed from: bs */
    public final C12014ne m58955bs() {
        int i = this.f42253c5;
        int i2 = i > 0 ? i * this.f42262um : 0;
        int i3 = this.f42249ar;
        int i4 = this.f42255dq;
        return i3 < i4 + i2 ? new C12014ne(this.f42248ak, (this.f42255dq + i2) - this.f42249ar, this.f42266wy, this.f42259qq) : i3 < (i4 + i2) + this.f42259qq ? new C12014ne(this.f42248ak, 0, this.f42266wy, ((this.f42255dq + i2) + this.f42259qq) - this.f42249ar) : i3 == 0 ? new C12014ne(this.f42248ak, 0, this.f42266wy, this.f42259qq) : new C12014ne(this.f42248ak, 0, this.f42266wy, 0);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m58956c5(int i) {
        this.f42255dq = i;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: c6 */
    public C4266c6 mo49020c6() {
        return m58957ca().m52210bz();
    }

    /* JADX INFO: renamed from: ca */
    public final C10770ck m58957ca() {
        return (C10770ck) this.f42282kk;
    }

    /* JADX INFO: renamed from: ck */
    public final void m58958ck(int i) {
        this.f42257lr = i;
        this.f42264v4 = i;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: dq */
    public C4266c6 mo49021dq() {
        return m58957ca().m52211e0();
    }

    /* JADX INFO: renamed from: dy */
    public final void m58959dy(int i) {
        this.f42248ak = i;
    }

    /* JADX INFO: renamed from: em */
    public final int m58960em() {
        return this.f42255dq;
    }

    /* JADX INFO: renamed from: fa */
    public final void m58961fa(int i) {
        this.f42268yd = i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m58962h4(int i) {
        this.f42262um = i;
    }

    /* JADX INFO: renamed from: he */
    public final boolean m58963he() {
        return this.f42260sv;
    }

    /* JADX INFO: renamed from: j2 */
    public final int m58964j2() {
        return this.f42266wy;
    }

    /* JADX INFO: renamed from: jd */
    public final void m58965jd(int i) {
        this.f42257lr = i;
    }

    /* JADX INFO: renamed from: jw */
    public final void m58966jw() {
        this.f42251bv = false;
        this.f42249ar = 0;
        this.f42268yd = 0;
        this.f42252bz = this.f42261ts;
        this.f42258qm = true;
    }

    /* JADX INFO: renamed from: kk */
    public final void m58970kk(C1606x1 c1606x1) {
        this.f42256e0 = c1606x1;
    }

    /* JADX INFO: renamed from: m2 */
    public final int m58971m2() {
        return ((C10770ck) mo59012up()).m52212qm();
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m58972m4() {
        return m58971m2() == 39;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m58973m9(int i) {
        this.f42254c6 = i;
    }

    /* JADX INFO: renamed from: os */
    public final int m58974os() {
        return this.f42248ak;
    }

    /* JADX INFO: renamed from: qw */
    public final boolean m58975qw() {
        return this.f42267xk;
    }

    /* JADX INFO: renamed from: ri */
    public final int m58976ri() {
        return this.f42250b3;
    }

    /* JADX INFO: renamed from: to */
    public final void m58977to(boolean z) {
        this.f42267xk = z;
    }

    /* JADX INFO: renamed from: tq */
    public final boolean m58978tq() {
        return this.f42251bv;
    }

    /* JADX INFO: renamed from: ts */
    public final Object m58979ts() {
        return this.f42261ts;
    }

    /* JADX INFO: renamed from: up */
    public final void m58980up(int i) {
        this.f42250b3 = i;
        this.f42253c5 = i + 1;
    }

    /* JADX INFO: renamed from: vh */
    public final boolean m58981vh() {
        return this.f42258qm;
    }

    /* JADX INFO: renamed from: vj */
    public final Object m58982vj() {
        return this.f42252bz;
    }

    /* JADX INFO: renamed from: w6 */
    public final int m58983w6() {
        return this.f42259qq;
    }

    /* JADX INFO: renamed from: wy */
    public final C1606x1 m58984wy() {
        return this.f42256e0;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up
    /* JADX INFO: renamed from: xk */
    public C4266c6 mo49032xk() {
        return m58957ca().m52213ts();
    }

    /* JADX INFO: renamed from: y2 */
    public final boolean m58986y2() {
        return m58971m2() == 135;
    }

    /* JADX INFO: renamed from: yd */
    public final boolean m58987yd() {
        return this.f42263uz;
    }

    /* JADX INFO: renamed from: zj */
    public final int m58988zj() {
        return this.f42257lr;
    }

    /* JADX INFO: renamed from: x1 */
    private C1606x1 m58952x1(List<InterfaceC1861h4> list) {
        C12714m9.m59058k4(null, new C12698g8(list, 0, list.size()), new C12724ss(0));
        return ((C11663ks) mo54977m9()).m54901ak();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo48950k4(C12724ss c12724ss, int i) {
        return super.mo48950k4(c12724ss, i);
    }

    /* JADX INFO: renamed from: k4 */
    private C1606x1 m58946k4(int i, C12724ss c12724ss, int i2, C1606x1 c1606x1, C12023wl[] c12023wlArr) throws Throwable {
        ((C11663ks) OooO0O0.OooO00o(this.f42265wl, 1)).m54904h4(true);
        C11663ks c11663ks = (C11663ks) OooO0O0.OooO00o(this.f42265wl, 1);
        List<C11663ks> list = this.f42265wl;
        list.removeAt(list.size() - 1);
        try {
            C11668rv.m54919x1().m54932x1(true);
            Stack<InterfaceC12711lr> stack = new Stack<>();
            m58948k4(stack, c11663ks.mo54977m9());
            c11663ks.mo54977m9().mo54975kk(c11663ks);
            mo49027ks();
            try {
                List<InterfaceC1861h4> listMo58879k4 = mo58879k4(new C12724ss(c12724ss), i2, stack, (C12717os) null, c11663ks);
                C11668rv.m54919x1().m54926k4(true);
                C1606x1 c1606x1M58952x1 = m58952x1(listMo58879k4);
                C11668rv.m54919x1().m54926k4(false);
                C11668rv.m54919x1().m54932x1(false);
                m58970kk(c1606x1M58952x1);
                c1606x1M58952x1.m8669k4(this);
                c1606x1M58952x1.mo8505k4(false).CloneTo(c12023wlArr[0]);
                return c1606x1M58952x1;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                C11668rv.m54919x1().m54926k4(false);
                C11668rv.m54919x1().m54932x1(false);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12732up, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x1 */
    public void mo48960x1(C1606x1 c1606x1) {
        int iM52212qm = ((C10770ck) mo59012up()).m52212qm();
        c1606x1.m8666k4(iM52212qm == 13 ? 3 : (iM52212qm == 135 || iM52212qm == 39) ? 5 : 0);
        mo54977m9().mo48960x1(c1606x1);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58985x1(Object obj) {
        this.f42252bz = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[Catch: all -> 0x0179, TRY_ENTER, TryCatch #1 {all -> 0x0179, blocks: (B:3:0x0009, B:12:0x005d, B:45:0x016f, B:47:0x0175, B:50:0x017c, B:52:0x0189, B:54:0x01a3, B:53:0x019f, B:57:0x01c6, B:59:0x01cc, B:60:0x01cf, B:11:0x004e, B:14:0x0069, B:17:0x0073, B:19:0x008c, B:23:0x00a8, B:26:0x00b1, B:28:0x00bb, B:29:0x00c0, B:31:0x00ce, B:35:0x010d, B:38:0x013f, B:40:0x0150, B:43:0x0161, B:42:0x0156, B:34:0x0109, B:37:0x0131, B:22:0x00a4), top: B:65:0x0009, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C12023wl m58947k4(int i, int i2, int i3, C12730u4 c12730u4, C12023wl c12023wl, C1606x1 c1606x1) throws Throwable {
        C12023wl c12023wl2;
        ?? r4 = 1;
        int i4 = 1;
        try {
            C7016dy<Integer> c7016dy = f42247g8;
            c7016dy.set(Integer.valueOf(c7016dy.get().intValue() + 1));
            int i5 = 0;
            this.f42251bv = false;
            c12730u4.m59256k4().m59308k4(this.f42265wl);
            C12738wl c12738wlM59257k4 = c12730u4.m59257k4(i, i2, i3);
            c12730u4.m59256k4().m59308k4((List<C11663ks>) null);
            if (c12738wlM59257k4.m59354x1() == i3) {
                try {
                    c12023wl2 = c12738wlM59257k4.m59353k4() != 0 ? new C12023wl((i3 - c12738wlM59257k4.m59354x1()) + c12738wlM59257k4.m59353k4(), 1) : c12023wl;
                } catch (Throwable th) {
                    th = th;
                    this.f42251bv = r4;
                    C7016dy<Integer> c7016dy2 = f42247g8;
                    c7016dy2.set(Integer.valueOf(c7016dy2.get().intValue() - r4));
                    throw th;
                }
            }
            C1606x1 c1602uz = new C1602uz();
            List.Enumerator<C11663ks> it = this.f42265wl.iterator();
            int iMo59057x1 = 0;
            while (it.hasNext()) {
                try {
                    C12702ix c12702ixM54906wy = it.next().m54906wy();
                    C12311c5 c12311c5 = new C12311c5();
                    C1581c5 c1581c5 = (C1581c5) C7019kk.m27452k4((Object) (C7019kk.m27469x1(c12702ixM54906wy.m58984wy(), C1582ck.class) ? (C1606x1) C7019kk.m27452k4((Object) ((C1582ck) c12702ixM54906wy.m58984wy()).m8584v4().get_Item(i5), C1581c5.class) : c12702ixM54906wy.m58984wy()), C1581c5.class);
                    if (c1581c5 != null) {
                        int iM58974os = c12702ixM54906wy.m58974os();
                        if (c12702ixM54906wy.m58975qw()) {
                            iM58974os -= c12702ixM54906wy.m58964j2();
                        }
                        if (f42247g8.get().intValue() == i4) {
                            int iM58945k4 = m58945k4((C11663ks) mo54977m9(), ((C11663ks) c12702ixM54906wy.mo54977m9()).f39361jd);
                            int[] iArr = {i5};
                            int[] iArr2 = {i5};
                            int i6 = i5;
                            m58950k4(((C11663ks) mo54977m9()).f39361jd, iArr, iArr2, c12730u4.m59256k4());
                            int i7 = iArr[i6];
                            iM58974os += iArr2[i6];
                            int i8 = iM58945k4 + i7;
                            ((C12314dy) c12311c5).f41170c5 = c12730u4.mo59057x1() < 0 ? 1 : c12730u4.mo59057x1();
                            m58949k4(c12702ixM54906wy.m58984wy(), (i8 - (c12730u4.mo59057x1() / 2)) - c12730u4.mo59055kk(), c12702ixM54906wy.f42266wy);
                            iMo59057x1 = i8 + (c12730u4.mo59057x1() / 2);
                            this.f42260sv = true;
                        } else {
                            m58949k4(c12702ixM54906wy.m58984wy(), i5, c12702ixM54906wy.f42266wy);
                        }
                        c1581c5.m8581k4(iM58974os, true, true);
                        c1581c5.m8586x1(c12702ixM54906wy.m58960em() + iMo59057x1, true, true);
                        if (c12702ixM54906wy.m58986y2() || c12702ixM54906wy.m58972m4()) {
                            c1581c5.m8514x1(true);
                            c1581c5.m8504jd(c12702ixM54906wy.m58964j2());
                        }
                        c12311c5.mo8582k4(c12702ixM54906wy.m58984wy());
                        c1602uz.mo8582k4((C1606x1) c12311c5);
                        i4 = 1;
                        i5 = 0;
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            m58970kk(c1606x1);
            ((C1581c5) C7019kk.m27452k4((Object) (C7019kk.m27469x1(m58984wy(), C1582ck.class) ? (C1606x1) C7019kk.m27452k4((Object) ((C1582ck) m58984wy()).m8584v4().get_Item(0), C1581c5.class) : m58984wy()), C1581c5.class)).mo8582k4(c1602uz);
            c1606x1.f6211du = true;
            this.f42251bv = true;
            C7016dy<Integer> c7016dy3 = f42247g8;
            c7016dy3.set(Integer.valueOf(c7016dy3.get().intValue() - 1));
            return c12023wl2;
        } catch (Throwable th3) {
            th = th3;
            r4 = 1;
            this.f42251bv = r4;
            C7016dy<Integer> c7016dy22 = f42247g8;
            c7016dy22.set(Integer.valueOf(c7016dy22.get().intValue() - r4));
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58967k4(int i, int i2, int i3, C12730u4 c12730u4) throws Throwable {
        C12023wl c12023wlM58947k4;
        if (this.f42251bv) {
            return;
        }
        this.f42251bv = true;
        if (m58984wy() != null) {
            return;
        }
        mo49031x6();
        int iM67483k4 = 0;
        try {
            C11668rv.m54919x1().m54932x1(true);
            List<InterfaceC1861h4> listM58951x1 = m58951x1(c12730u4.mo59056to(), c12730u4.mo59054du());
            C11668rv.m54919x1().m54926k4(true);
            C1606x1 c1606x1M58952x1 = m58952x1(listM58951x1);
            C11668rv.m54919x1().m54926k4(false);
            C11668rv.m54919x1().m54932x1(false);
            m58970kk(c1606x1M58952x1);
            c1606x1M58952x1.m8669k4(this);
            C12023wl c12023wlClone = c1606x1M58952x1.mo8505k4(false).Clone();
            List<C11663ks> listM59303dy = c12730u4.m59256k4().m59303dy();
            if (listM59303dy == null) {
                listM59303dy = C11668rv.m54919x1().m54931to().m59090yd();
            }
            if (c12023wlClone.m56865x1() == 0 && this.f42265wl.size() > 0 && ((C11663ks) OooO0O0.OooO00o(this.f42265wl, 1)).m54906wy() == null) {
                if (((C11663ks) mo54977m9()).m54902b3()) {
                    C12023wl[] c12023wlArr = {c12023wlClone};
                    c1606x1M58952x1 = m58946k4(i3, c12730u4.mo59056to(), c12730u4.mo59054du(), c1606x1M58952x1, c12023wlArr);
                    c12023wlM58947k4 = c12023wlArr[0];
                } else {
                    c12023wlM58947k4 = m58947k4(i, i2, i3, c12730u4, c12023wlClone.Clone(), c1606x1M58952x1);
                    c1606x1M58952x1 = c1606x1M58952x1;
                }
                c12023wlM58947k4.CloneTo(c12023wlClone);
            } else {
                List.Enumerator<C11663ks> it = this.f42265wl.iterator();
                while (it.hasNext()) {
                    try {
                        C11663ks next = it.next();
                        if (next.m54906wy() == null) {
                            listM59303dy.addItem(next);
                        } else {
                            iM67483k4 = C14116yg.m67483k4(iM67483k4, next.m54906wy().m58983w6());
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            this.f42259qq = c12023wlClone.m56862kk();
            this.f42266wy = c12023wlClone.m56865x1();
            if (f42247g8.get().intValue() != 0) {
                this.f42259qq = C14116yg.m67483k4(this.f42259qq, iM67483k4);
            }
            if (this.f42259qq == 0) {
                this.f42259qq = 1;
            }
            C1582ck c1582ck = (C1582ck) C7019kk.m27452k4((Object) c1606x1M58952x1, C1582ck.class);
            c1606x1M58952x1.m8667k4(43, new C1927uz(1000.0d, 10));
            if (c1582ck != null) {
                if (c1582ck.m8677up() == 0) {
                    this.f42266wy = c1582ck.m8516c6() + this.f42266wy;
                }
                if (c1582ck.m8662h4(17)) {
                    return;
                }
                this.f42255dq = -c1582ck.m8656dy();
            }
        } catch (Throwable th2) {
            C11668rv.m54919x1().m54926k4(false);
            C11668rv.m54919x1().m54932x1(false);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58968k4(int i, int i2, int i3, C12733uz c12733uz) {
        if (m58955bs().m56683x1() > 0) {
            C11643kk c11643kkM59309kk = c12733uz.m59309kk();
            if (c11643kkM59309kk != null && c11643kkM59309kk.m54771b3()) {
                return;
            }
            int i4 = i - this.f42253c5;
            int iOooO0O0 = C20855OooooOO.OooO0O0(m58955bs().m56670k4() / i2, 14);
            this.f42249ar = (i2 * i4) + this.f42249ar;
            if (iOooO0O0 <= i4) {
                i4 = iOooO0O0;
            }
            int i5 = this.f42268yd + i4;
            this.f42268yd = i5;
            if (i3 != -1) {
                this.f42268yd = i5 > i3 ? i5 - i3 : 0;
            }
        }
        this.f42253c5 = -1;
        m58965jd(0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m58948k4(Stack<InterfaceC12711lr> stack, InterfaceC12711lr interfaceC12711lr) {
        if (interfaceC12711lr == null || interfaceC12711lr == this) {
            return;
        }
        InterfaceC12711lr interfaceC12711lrMo54977m9 = interfaceC12711lr.mo54977m9();
        if (interfaceC12711lrMo54977m9.mo54971bv().size() == 0) {
            interfaceC12711lrMo54977m9.mo54975kk(interfaceC12711lr);
        }
        stack.push(interfaceC12711lr);
        m58948k4(stack, interfaceC12711lrMo54977m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m58949k4(C1606x1 c1606x1, int i, int i2) {
        List.Enumerator<C12314dy> it;
        C12311c5 c12311c5;
        boolean zM27456k4;
        C1582ck c1582ck = (C1582ck) C7019kk.m27452k4((Object) c1606x1, C1582ck.class);
        if (c1582ck != null) {
            it = c1582ck.m8584v4().iterator();
            while (it.hasNext()) {
                try {
                    m58949k4(it.next(), i, i2);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return;
            } else {
                return;
            }
        }
        C1602uz c1602uz = (C1602uz) C7019kk.m27452k4((Object) c1606x1, C1602uz.class);
        if (c1602uz != null) {
            List.Enumerator<C12314dy> it2 = c1602uz.m8640wl().iterator();
            while (it2.hasNext()) {
                try {
                    C12314dy next = it2.next();
                    C12312ck c12312ck = (C12312ck) C7019kk.m27452k4((Object) next, C12312ck.class);
                    if (c12312ck == null || (c12311c5 = (C12311c5) C7019kk.m27452k4((Object) c12312ck.m57563wl(), C12311c5.class)) == null) {
                        C12311c5 c12311c52 = (C12311c5) C7019kk.m27452k4((Object) next, C12311c5.class);
                        if (c12311c52 != null) {
                            next = c12311c52.m57558u4();
                        } else if (C7019kk.m27469x1(next, C12320ks.class)) {
                        }
                    } else {
                        next = c12311c5.m57558u4();
                    }
                    m58949k4(next, i, i2);
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
                return;
            }
            return;
        }
        C1581c5 c1581c5 = (C1581c5) C7019kk.m27452k4((Object) c1606x1, C1581c5.class);
        if (c1581c5 == null) {
            C12311c5 c12311c53 = (C12311c5) C7019kk.m27452k4((Object) c1606x1, C12311c5.class);
            if (c12311c53 != null) {
                m58949k4(c12311c53.m57558u4(), i, i2);
                return;
            }
            C12317jd c12317jd = (C12317jd) C7019kk.m27452k4((Object) c1606x1, C12317jd.class);
            if (c12317jd != null) {
                it = c12317jd.mo57566d_().iterator();
                while (it.hasNext()) {
                    try {
                        m58949k4(it.next(), i, i2);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                    return;
                }
                return;
            }
            return;
        }
        try {
            List<C1606x1> listM8584v4 = c1581c5.m8584v4();
            if (listM8584v4 != null) {
                List.Enumerator<C1606x1> it3 = listM8584v4.iterator();
                while (it3.hasNext()) {
                    try {
                        C1606x1 c1606x12 = (C1606x1) C7019kk.m27452k4((Object) it3.next(), C1606x1.class);
                        if (c1606x12 != null) {
                            m58949k4(c1606x12, i, i2);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
            if (c1581c5.mo8658e_() != 0 && c1581c5.mo8658e_() < i) {
                c1581c5.m8670kk(i);
            }
            if (c1581c5.m8678x1() == 0 || c1581c5.m8678x1() <= i2) {
                return;
            }
            c1581c5.m8679x1(i2);
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        C12724ss c12724ss2 = new C12724ss(0);
        List list = new List();
        InterfaceC12711lr interfaceC12711lrM59077to = null;
        while (interfaceC1870up.mo9764x1()) {
            C12717os c12717osMo9760kk = interfaceC1870up.mo9760kk();
            if (C7019kk.m27469x1(c12717osMo9760kk, C12696f9.class)) {
                C12717os c12717osMo58860kk = c12717osMo9760kk.mo58860kk();
                if (c12717osMo58860kk.m59077to() != this) {
                    list.addItem(c12717osMo58860kk);
                    interfaceC12711lrM59077to = c12717osMo58860kk.m59077to();
                }
            }
        }
        C12695em c12695em = new C12695em(new C1869to(list));
        while (true) {
            InterfaceC12711lr interfaceC12711lrM58935h4 = c12695em.m58935h4();
            if (interfaceC12711lrM58935h4 == null) {
                return;
            }
            c12724ss2.m59158k4(128, c12724ss.m59168kk() && interfaceC12711lrM58935h4 == interfaceC12711lrM59077to);
            interfaceC12711lrM58935h4.mo49023k4(c12695em, c12724ss2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m58950k4(InterfaceC12711lr interfaceC12711lr, int[] iArr, int[] iArr2, C12733uz c12733uz) {
        iArr[0] = 0;
        iArr2[0] = 0;
        while (interfaceC12711lr != null) {
            C11674uz c11674uz = (C11674uz) C7019kk.m27452k4((Object) interfaceC12711lr, C11674uz.class);
            if (c11674uz != null) {
                C10780ks c10780ks = (C10780ks) c11674uz.mo59012up();
                if (c10780ks.m52283g8().m10115du() != 9) {
                    iArr2[0] = c10780ks.m52283g8().mo9886x1(c11674uz);
                    if (c12733uz.m59302du() != null) {
                        iArr2[0] = iArr2[0] - c12733uz.m59302du().mo58913ar().m59331k4().m50381e0().f11653kk.mo9884to();
                    }
                }
                if (c10780ks.m52287qm().m10115du() != 9) {
                    iArr[0] = c10780ks.m52287qm().mo9886x1(c11674uz);
                    return;
                }
                return;
            }
            interfaceC12711lr = interfaceC12711lr.mo54977m9();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58969k4(Object obj) {
        this.f42261ts = obj;
    }
}
