package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.g8 */
/* JADX INFO: loaded from: classes.dex */
public final class C4446g8 implements InterfaceC4472u4 {

    /* JADX INFO: renamed from: k4 */
    private List<k4> f12215k4;

    /* JADX INFO: renamed from: kk */
    private int f12216kk;

    /* JADX INFO: renamed from: x1 */
    private k4 f12217x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.h0.g8$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private C12009k4 f12218k4;

        /* JADX INFO: renamed from: kk */
        private float f12219kk;

        /* JADX INFO: renamed from: x1 */
        private byte[] f12220x1;

        public k4(C12009k4 c12009k4) {
            if (c12009k4 == null) {
                throw new ArgumentNullException("texture");
            }
            m18198k4(c12009k4);
            m18197k4(new C4459os(c12009k4.mo15760yj(), c12009k4.mo15757m9()).m18288kk() / ((float) C14116yg.m67496rv(2.0d)));
        }

        /* JADX INFO: renamed from: k4 */
        public final void m18196k4() {
            C3983k4 c3983k4M56597k4 = m18202x1().m56597k4(new C12014ne(0, 0, m18202x1().mo15760yj(), m18202x1().mo15757m9()).Clone(), 1, 2498570);
            int iMo15757m9 = m18202x1().mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
            m18199k4(new byte[iMo15757m9]);
            C3914k4.m15618k4(c3983k4M56597k4.m15721to(), m18200kk(), 0, iMo15757m9);
            m18202x1().m56605k4(c3983k4M56597k4);
        }

        /* JADX INFO: renamed from: kk */
        public final byte[] m18200kk() {
            return this.f12220x1;
        }

        /* JADX INFO: renamed from: to */
        public final float m18201to() {
            return this.f12219kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final C12009k4 m18202x1() {
            return this.f12218k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m18197k4(float f) {
            this.f12219kk = f;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m18198k4(C12009k4 c12009k4) {
            this.f12218k4 = c12009k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m18199k4(byte[] bArr) {
            this.f12220x1 = bArr;
        }
    }

    public C4446g8(C12009k4 c12009k4, int i) {
        this(c12009k4, i, 32);
    }

    /* JADX INFO: renamed from: kk */
    private void m18191kk() {
        List<k4> list = this.f12215k4;
        if (list == null || list.size() == 0) {
            throw new NullReferenceException("texture");
        }
        k4 k4Var = this.f12215k4.get_Item(0);
        C12009k4 c12009k4M18202x1 = k4Var.m18202x1();
        while (k4Var.m18202x1().mo15760yj() > 64 && k4Var.m18202x1().mo15757m9() > 64) {
            int iMo15760yj = k4Var.m18202x1().mo15760yj() / 2;
            int iMo15757m9 = k4Var.m18202x1().mo15757m9() / 2;
            C12009k4 c12009k4 = new C12009k4(iMo15760yj, iMo15757m9, 2498570);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17586x1(2);
                abstractC12008jdM56582k4.mo17560kk(7);
                abstractC12008jdM56582k4.mo17476du(4);
                abstractC12008jdM56582k4.mo17495k4(1);
                abstractC12008jdM56582k4.mo17508k4(c12009k4M18202x1, new C12014ne(0, 0, iMo15760yj, iMo15757m9));
                abstractC12008jdM56582k4.dispose();
                k4Var = new k4(c12009k4);
                this.f12215k4.addItem(k4Var);
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: k4 */
    public final void mo18192k4() {
        List<k4> list = this.f12215k4;
        if (list == null || list.size() == 0) {
            throw new NullReferenceException("texture");
        }
        List.Enumerator<k4> it = this.f12215k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m18196k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: x1 */
    public final void mo18195x1() {
        List<k4> list = this.f12215k4;
        if (list == null || list.size() == 0) {
            throw new NullReferenceException("texture");
        }
        List.Enumerator<k4> it = this.f12215k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().m18199k4((byte[]) null);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public C4446g8(C12009k4 c12009k4, int i, int i2) {
        this.f12215k4 = new List<>();
        if (c12009k4 == null) {
            throw new ArgumentNullException("texture");
        }
        this.f12216kk = i;
        k4 k4Var = new k4(c12009k4);
        this.f12215k4.addItem(k4Var);
        this.f12217x1 = k4Var;
        if (i2 > 0) {
            m18191kk();
        }
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: k4 */
    public final void mo18193k4(float f) {
        this.f12217x1 = null;
        List.Enumerator<k4> it = this.f12215k4.iterator();
        while (it.hasNext()) {
            try {
                k4 next = it.next();
                this.f12217x1 = next;
                if (f >= next.m18201to()) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p159h0.InterfaceC4472u4
    /* JADX INFO: renamed from: k4 */
    public final void mo18194k4(float f, float f2, C4428ai[] c4428aiArr) {
        int iMo15760yj = this.f12217x1.m18202x1().mo15760yj();
        int iMo15757m9 = this.f12217x1.m18202x1().mo15757m9();
        int i = this.f12216kk;
        float f3 = 1.0f;
        if (i == 1) {
            if (f < 0.0f) {
                f = C7019kk.m27462to(Float.valueOf(f), 13) % 2 == 0 ? (-f) % 1.0f : (f % 1.0f) + 1.0f;
            } else {
                int iM27462to = C7019kk.m27462to(Float.valueOf(f), 13) % 2;
                f %= 1.0f;
                if (iM27462to != 0) {
                    f = 1.0f - f;
                }
            }
            if (f2 < 0.0f) {
                if (C7019kk.m27462to(Float.valueOf(f2), 13) % 2 == 0) {
                    f2 = -f2;
                }
            } else if (C7019kk.m27462to(Float.valueOf(f2), 13) % 2 != 0) {
                f3 = 1.0f - (f2 % 1.0f);
                f2 = f3;
            }
        } else if (i != 2) {
            f %= 1.0f;
            if (f < 0.0f) {
                f += 1.0f;
            }
            f2 = f2 < 0.0f ? (f2 % 1.0f) + 1.0f : f2 % 1.0f;
        } else {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = f3;
            }
        }
        int iM27462to2 = ((C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(f2 * (iMo15757m9 - 1))), 14) * iMo15760yj) + OooO.OooO00o(f * (iMo15760yj - 1), 14)) * 4;
        c4428aiArr[0] = new C4428ai((this.f12217x1.m18200kk()[iM27462to2] & 255) / 255.0f, (this.f12217x1.m18200kk()[iM27462to2 + 1] & 255) / 255.0f, (this.f12217x1.m18200kk()[iM27462to2 + 2] & 255) / 255.0f, (this.f12217x1.m18200kk()[iM27462to2 + 3] & 255) / 255.0f);
    }
}
