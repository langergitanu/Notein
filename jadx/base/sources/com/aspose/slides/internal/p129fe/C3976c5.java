package com.aspose.slides.internal.p129fe;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C3976c5 implements IDisposable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private k4 f10745du;

    /* JADX INFO: renamed from: h4 */
    private k4 f10747h4;

    /* JADX INFO: renamed from: kk */
    private k4 f10749kk;

    /* JADX INFO: renamed from: m9 */
    private k4 f10750m9;

    /* JADX INFO: renamed from: to */
    private k4 f10751to;

    /* JADX INFO: renamed from: x1 */
    public C12003du f10752x1;

    /* JADX INFO: renamed from: k4 */
    public int f10748k4 = 4;

    /* JADX INFO: renamed from: dy */
    private boolean f10746dy = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.fe.c5$k4 */
    public final class k4 {

        /* JADX INFO: renamed from: c5 */
        public String f10753c5;

        /* JADX INFO: renamed from: fa */
        public C3990x1[] f10757fa;

        /* JADX INFO: renamed from: h4 */
        public float f10758h4;

        /* JADX INFO: renamed from: k4 */
        public C3984kk f10760k4;

        /* JADX INFO: renamed from: kk */
        public C3984kk f10761kk;

        /* JADX INFO: renamed from: ks */
        public boolean f10762ks;

        /* JADX INFO: renamed from: m9 */
        public int f10763m9;

        /* JADX INFO: renamed from: to */
        public float f10765to;

        /* JADX INFO: renamed from: up */
        public boolean f10766up;

        /* JADX INFO: renamed from: x1 */
        public int f10767x1;

        /* JADX INFO: renamed from: yj */
        public C3988to f10768yj;

        /* JADX INFO: renamed from: du */
        public boolean f10755du = false;

        /* JADX INFO: renamed from: dy */
        public boolean f10756dy = false;

        /* JADX INFO: renamed from: jd */
        public C12003du f10759jd = new C12003du();

        /* JADX INFO: renamed from: ck */
        public C12003du f10754ck = new C12003du();

        public k4() {
        }

        /* JADX INFO: renamed from: k4 */
        public k4 m15674k4() {
            k4 k4Var = C3976c5.this.new k4();
            k4Var.f10760k4 = this.f10760k4;
            k4Var.f10767x1 = this.f10767x1;
            k4Var.f10761kk = this.f10761kk;
            k4Var.f10765to = this.f10765to;
            k4Var.f10755du = this.f10755du;
            k4Var.f10758h4 = this.f10758h4;
            k4Var.f10763m9 = this.f10763m9;
            k4Var.f10756dy = this.f10756dy;
            k4Var.f10753c5 = this.f10753c5;
            this.f10759jd.CloneTo(k4Var.f10759jd);
            this.f10754ck.CloneTo(k4Var.f10754ck);
            k4Var.f10757fa = this.f10757fa;
            k4Var.f10766up = this.f10766up;
            k4Var.f10768yj = this.f10768yj;
            k4Var.f10762ks = this.f10762ks;
            return k4Var;
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C3976c5 c3976c5 = new C3976c5();
        k4 k4Var = this.f10749kk;
        c3976c5.f10749kk = k4Var != null ? k4Var.m15674k4() : null;
        k4 k4Var2 = this.f10751to;
        c3976c5.f10751to = k4Var2 != null ? k4Var2.m15674k4() : null;
        k4 k4Var3 = this.f10745du;
        c3976c5.f10745du = k4Var3 != null ? k4Var3.m15674k4() : null;
        k4 k4Var4 = this.f10747h4;
        c3976c5.f10747h4 = k4Var4 != null ? k4Var4.m15674k4() : null;
        k4 k4Var5 = this.f10750m9;
        c3976c5.f10750m9 = k4Var5 != null ? k4Var5.m15674k4() : null;
        C12003du c12003du = this.f10752x1;
        c3976c5.f10752x1 = c12003du != null ? c12003du.Clone() : null;
        c3976c5.f10748k4 = this.f10748k4;
        return c3976c5;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
    }

    /* JADX INFO: renamed from: k4 */
    public k4 m15663k4(int i) {
        k4 k4Var = this.f10749kk;
        if (k4Var == null) {
            k4Var = new k4();
        }
        if (i == 0) {
            k4 k4VarM15674k4 = k4Var.m15674k4();
            this.f10749kk = k4VarM15674k4;
            return k4VarM15674k4;
        }
        if (i == 1) {
            if (this.f10751to == null) {
                this.f10751to = k4Var.m15674k4();
            }
            return this.f10751to;
        }
        if (i == 2) {
            if (this.f10745du == null) {
                this.f10745du = k4Var.m15674k4();
            }
            return this.f10745du;
        }
        if (i == 3) {
            if (this.f10747h4 == null) {
                this.f10747h4 = k4Var.m15674k4();
            }
            return this.f10747h4;
        }
        if (i != 4) {
            return null;
        }
        if (this.f10750m9 == null) {
            this.f10750m9 = k4Var.m15674k4();
        }
        return this.f10750m9;
    }

    /* JADX INFO: renamed from: x1 */
    public void m15673x1(int i) {
        m15665k4(i, new C12003du(), false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15664k4(int i, C12003du c12003du) {
        m15665k4(i, c12003du.Clone(), false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15665k4(int i, C12003du c12003du, boolean z) {
        this.f10746dy = true;
        this.f10748k4 = i;
        C12003du c12003du2 = this.f10752x1;
        if (c12003du2 == null) {
            this.f10752x1 = c12003du.Clone();
        } else {
            c12003du.CloneTo(c12003du2);
        }
        m15663k4(0).f10766up = z;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15666k4(C3984kk c3984kk) {
        m15667k4(c3984kk, 0, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15667k4(C3984kk c3984kk, int i, int i2) {
        m15663k4(i2).f10760k4 = c3984kk;
        m15663k4(i2).f10767x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15668k4(C12003du c12003du, C12003du c12003du2) {
        m15669k4(c12003du.Clone(), c12003du2.Clone(), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15669k4(C12003du c12003du, C12003du c12003du2, int i) {
        if ((c12003du.m56507jd() & 255) > (c12003du2.m56507jd() & 255) || (c12003du.m56502ck() & 255) > (c12003du2.m56502ck() & 255) || (c12003du.m56505fa() & 255) > (c12003du2.m56505fa() & 255)) {
            throw new ArgumentException();
        }
        c12003du.CloneTo(m15663k4(i).f10759jd);
        c12003du2.CloneTo(m15663k4(i).f10754ck);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15670k4(C3990x1[] c3990x1Arr) {
        m15671k4(c3990x1Arr, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public void m15671k4(C3990x1[] c3990x1Arr, int i) {
        m15663k4(i).f10757fa = c3990x1Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m15672k4() {
        return this.f10746dy;
    }
}
