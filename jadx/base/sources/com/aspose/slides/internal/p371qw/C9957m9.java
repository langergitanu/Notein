package com.aspose.slides.internal.p371qw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p481wp.AbstractC12228lr;
import com.aspose.slides.internal.p481wp.C12219du;
import com.aspose.slides.internal.p481wp.C12220dy;
import com.aspose.slides.internal.p481wp.C12222h4;
import com.aspose.slides.internal.p481wp.C12232rv;
import com.aspose.slides.internal.p481wp.C12236up;
import com.aspose.slides.internal.p481wp.C12239wl;
import com.aspose.slides.internal.p481wp.C12243yd;
import com.aspose.slides.internal.p513xw.AbstractC12729ts;
import com.aspose.slides.internal.p513xw.C12684bs;
import com.aspose.slides.internal.p513xw.C12698g8;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12715ne;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9957m9 {

    /* JADX INFO: renamed from: c5 */
    private boolean[] f35926c5;

    /* JADX INFO: renamed from: ck */
    private C9960x1[] f35927ck;

    /* JADX INFO: renamed from: du */
    private int f35928du;

    /* JADX INFO: renamed from: dy */
    private int[] f35929dy;

    /* JADX INFO: renamed from: h4 */
    private int f35931h4;

    /* JADX INFO: renamed from: jd */
    private C9960x1[] f35932jd;

    /* JADX INFO: renamed from: k4 */
    private int f35933k4;

    /* JADX INFO: renamed from: ks */
    private C9948c5 f35935ks;

    /* JADX INFO: renamed from: to */
    private C12724ss f35937to;

    /* JADX INFO: renamed from: up */
    private C4265c5 f35938up;

    /* JADX INFO: renamed from: yj */
    private List<C1581c5> f35940yj;

    /* JADX INFO: renamed from: x1 */
    private int f35939x1 = 0;

    /* JADX INFO: renamed from: kk */
    private C12219du f35934kk = null;

    /* JADX INFO: renamed from: m9 */
    private List<Integer> f35936m9 = new List<>();

    /* JADX INFO: renamed from: fa */
    private int f35930fa = 0;

    public C9957m9(C9948c5 c9948c5, C12724ss c12724ss) {
        this.f35935ks = c9948c5;
        this.f35937to = c12724ss;
        int iM48922k4 = c9948c5.m48910kk().m48922k4();
        this.f35933k4 = iM48922k4;
        this.f35929dy = new int[iM48922k4];
        this.f35926c5 = new boolean[iM48922k4];
        this.f35932jd = new C9960x1[iM48922k4];
        this.f35927ck = new C9960x1[iM48922k4];
        this.f35928du = -1;
        this.f35931h4 = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49008k4() {
        return this.f35939x1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m49013kk() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f35926c5;
            if (i >= zArr.length) {
                return;
            }
            zArr[i] = false;
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m49014x1() {
        int i = 0;
        while (true) {
            boolean[] zArr = this.f35926c5;
            if (i >= zArr.length) {
                return;
            }
            zArr[i] = true;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m49002k4(int i) {
        return this.f35936m9.get_Item(i - this.f35928du).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    private void m49007x1(boolean z, boolean z2) {
        int i;
        C9960x1 c9960x1;
        int i2;
        m49004k4(this.f35934kk.m57019k4(), this.f35939x1);
        int iM67483k4 = 0;
        boolean z3 = true;
        boolean z4 = true;
        for (int i3 = 0; i3 < this.f35933k4; i3++) {
            C12220dy c12220dyM57020k4 = this.f35934kk.m57020k4(i3);
            if (!c12220dyM57020k4.m57032dy()) {
                if (c12220dyM57020k4.m57035jd() == 0 && ((z || c12220dyM57020k4.mo57031du()) && this.f35932jd[i3] != null)) {
                    iM67483k4 = C14116yg.m67483k4(iM67483k4, (m49002k4(C14116yg.m67483k4(this.f35932jd[i3].f35969k4.m57126ix(), this.f35928du)) + (this.f35927ck[i3].m49042x1(z) + (this.f35927ck[i3].m49037du() + this.f35929dy[i3]))) - this.f35939x1);
                }
                C9960x1 c9960x12 = this.f35932jd[i3];
                if (c9960x12 != null && !c9960x12.m49039k4()) {
                    z3 = false;
                }
                C9960x1 c9960x13 = this.f35927ck[i3];
                if (c9960x13 != null && !c9960x13.m49043x1()) {
                    z4 = false;
                }
            }
        }
        C1581c5 c1581c5 = new C1581c5();
        C9959up c9959upM48907k4 = this.f35935ks.m48907k4();
        C12243yd c12243ydM57022kk = this.f35934kk.m57022kk();
        if (c12243ydM57022kk != null) {
            C12712m2.m59048k4(c1581c5, c12243ydM57022kk.mo14334yd());
        }
        C1581c5 c1581c52 = c9959upM48907k4.f35945c5;
        c1581c52.mo8582k4((C1606x1) c1581c5);
        c9959upM48907k4.f35945c5 = c1581c5;
        c1581c5.m8679x1(c9959upM48907k4.mo48944dy());
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i4 >= this.f35933k4) {
                break;
            }
            C12220dy c12220dyM57020k42 = this.f35934kk.m57020k4(i4);
            if (!c12220dyM57020k42.m57032dy() || this.f35935ks.m48914x1()) {
                i = i4;
                if (c12220dyM57020k42.m57035jd() == 0 && ((z || c12220dyM57020k42.mo57031du()) && (c9960x1 = this.f35932jd[i]) != null)) {
                    int i6 = c9960x1.m49039k4() ? this.f35926c5[i] ? 1 : 0 : 2;
                    int i7 = this.f35927ck[i].m49043x1() ? z ? 1 : 0 : 2;
                    C9960x1 c9960x14 = this.f35932jd[i];
                    m49006k4(c9960x14.f35969k4, c9960x14.f35973x1, this.f35927ck[i].f35970kk, iM67483k4, i6, i7, z2);
                    this.f35932jd[i] = null;
                    for (int i8 = i; i8 < c12220dyM57020k42.m57034h4().m57111g8() + i; i8++) {
                        this.f35926c5[i8] = false;
                    }
                }
            } else {
                if (!z3) {
                    i2 = 2;
                } else if (this.f35926c5[i4]) {
                    i2 = 2;
                    i5 = 1;
                } else {
                    i2 = 2;
                    i5 = 0;
                }
                m49005k4((C12222h4) c12220dyM57020k42, this.f35934kk.m57019k4(), i4, iM67483k4, i5, z4 ? z ? 1 : 0 : i2, z2);
                i = i4;
                this.f35926c5[i] = false;
            }
            i4 = i + 1;
        }
        c1581c5.m8670kk(iM67483k4);
        c1581c5.m8502c5(2);
        c9959upM48907k4.f35945c5 = c1581c52;
        this.f35939x1 += iM67483k4;
        if (z) {
            this.f35934kk = null;
            this.f35928du = -1;
            this.f35936m9.clear();
            this.f35931h4 = Integer.MAX_VALUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static int m49003k4(C12236up c12236up, int i, int i2) {
        int iM59252rv = 0;
        if (i > i2) {
            return 0;
        }
        C1869to c1869to = new C1869to(c12236up.m57131ks(), i);
        for (boolean zMo58895yj = false; c1869to.mo9757h4() <= i2 && !zMo58895yj; zMo58895yj = ((AbstractC12729ts) c1869to.mo9760kk()).mo58895yj()) {
        }
        if (!((AbstractC12729ts) c1869to.mo9756du()).mo58895yj()) {
            return 0;
        }
        while (c1869to.mo9757h4() < i2) {
            AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
            if (abstractC12729ts.mo58895yj() || abstractC12729ts.mo58932x_()) {
                iM59252rv = abstractC12729ts.m59252rv() + iM59252rv;
            }
        }
        return C9955k4.m48975k4((AbstractC12729ts) c1869to.mo9760kk()) + iM59252rv;
    }

    /* JADX INFO: renamed from: k4 */
    private void m49004k4(int i, int i2) {
        for (int size = this.f35936m9.size(); size <= i - this.f35928du; size++) {
            this.f35936m9.addItem(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49009k4(C1581c5 c1581c5) {
        this.f35935ks.m48907k4().m49022k4(c1581c5);
        this.f35940yj.addItem(c1581c5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m49010k4(C9954jd c9954jd) {
        C12219du c12219duM48971m9;
        C1869to c1869to;
        if (this.f35934kk != null) {
            c12219duM48971m9 = c9954jd.m48971m9();
            if (c12219duM48971m9.m57019k4() > this.f35934kk.m57019k4()) {
                m49007x1(false, false);
            }
            if (this.f35928du < 0) {
                int iM57019k4 = this.f35934kk.m57019k4();
                this.f35928du = iM57019k4;
                if (this.f35931h4 < 0) {
                    this.f35931h4 = iM57019k4;
                }
            }
            c1869to = new C1869to(c9954jd.f35890k4);
            while (c1869to.mo9764x1()) {
                C9960x1 c9960x1 = (C9960x1) c1869to.mo9760kk();
                int iM57136u4 = c9960x1.f35969k4.m57136u4();
                C9960x1[] c9960x1Arr = this.f35932jd;
                if (c9960x1Arr[iM57136u4] == null) {
                    c9960x1Arr[iM57136u4] = c9960x1;
                    this.f35929dy[iM57136u4] = c9960x1.m49038k4(this.f35926c5[iM57136u4]);
                } else {
                    int[] iArr = this.f35929dy;
                    iArr[iM57136u4] = c9960x1.m49040kk() + iArr[iM57136u4];
                }
                int[] iArr2 = this.f35929dy;
                iArr2[iM57136u4] = c9960x1.m49041to() + iArr2[iM57136u4];
                this.f35927ck[iM57136u4] = c9960x1;
            }
        }
        c12219duM48971m9 = c9954jd.m48968k4();
        this.f35934kk = c12219duM48971m9;
        if (this.f35928du < 0) {
        }
        c1869to = new C1869to(c9954jd.f35890k4);
        while (c1869to.mo9764x1()) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49005k4(C12222h4 c12222h4, int i, int i2, int i3, int i4, int i5, boolean z) {
        C4265c5.k4 k4VarM57036k4 = c12222h4.m57036k4(i4);
        C4265c5.k4 k4VarM57050x1 = c12222h4.m57050x1(i5);
        C4265c5.k4 k4VarM57030ck = c12222h4.m57030ck();
        C4265c5.k4 k4VarM57033fa = c12222h4.m57033fa();
        if (k4VarM57036k4.m17172to() == 0 && k4VarM57050x1.m17172to() == 0 && k4VarM57030ck.m17172to() == 0 && k4VarM57033fa.m17172to() == 0) {
            return;
        }
        C9959up c9959upM48907k4 = this.f35935ks.m48907k4();
        C12232rv c12232rvM49033yd = c9959upM48907k4.m49033yd();
        C12239wl c12239wlM48925k4 = this.f35935ks.m48910kk().m48925k4(i2 + 1);
        boolean z2 = i == this.f35931h4;
        boolean z3 = i2 == 0;
        boolean z4 = i2 == c12232rvM49033yd.m57097sv() - 1;
        int iMo9886x1 = c12239wlM48925k4.m57159ts().mo9886x1(c9959upM48907k4) - ((k4VarM57033fa.m17172to() + k4VarM57030ck.m17172to()) / 2);
        int iM17172to = i3 - ((k4VarM57050x1.m17172to() + k4VarM57036k4.m17172to()) / 2);
        C1581c5 c1581c5 = new C1581c5();
        c1581c5.m8502c5(2);
        c1581c5.m8667k4(31, Boolean.TRUE);
        c1581c5.m8679x1(iMo9886x1);
        c1581c5.m8670kk(iM17172to);
        c1581c5.m8581k4((k4VarM57030ck.m17172to() / 2) + this.f35935ks.m48904k4(i2), false, false);
        c1581c5.m8586x1(m49002k4(i) - (k4VarM57036k4.m17172to() / 2), false, false);
        C12712m2.m59035k4(c1581c5, k4VarM57036k4, k4VarM57050x1, k4VarM57030ck, k4VarM57033fa, new boolean[]{z2, z, z3, z4});
        c9959upM48907k4.mo48960x1((C1606x1) c1581c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m49011k4(AbstractC12228lr abstractC12228lr) {
        C4265c5 c4265c5Mo57067vj = abstractC12228lr.mo57067vj();
        if (c4265c5Mo57067vj.m17149du()) {
            this.f35938up = c4265c5Mo57067vj;
            if (this.f35940yj == null) {
                this.f35940yj = new List<>();
            }
        }
        this.f35930fa = this.f35939x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m49006k4(C12236up c12236up, int i, int i2, int i3, int i4, int i5, boolean z) {
        int iM49002k4;
        int[] iArr;
        boolean z2;
        C9957m9 c9957m9;
        int i6;
        int i7;
        int i8;
        int i9;
        C9951dy c9951dy;
        int iM57019k4 = this.f35934kk.m57019k4();
        int iM57126ix = c12236up.m57126ix();
        int iM57126ix2 = this.f35928du;
        if (iM57126ix >= iM57126ix2) {
            iM57126ix2 = c12236up.m57126ix();
            iM49002k4 = iM57126ix2 < iM57019k4 ? m49002k4(iM57126ix2 + 1) - m49002k4(iM57126ix2) : i3;
        } else {
            iM49002k4 = 0;
        }
        if (this.f35935ks.m48907k4().m49033yd().m57102zj() || !c12236up.m57141wl()) {
            iArr = null;
        } else {
            int i10 = iM57019k4 - iM57126ix2;
            iArr = new int[i10 + 1];
            int iM49002k42 = m49002k4(iM57126ix2);
            int i11 = 0;
            while (i11 < i10) {
                int iM49002k43 = m49002k4(iM57126ix2 + i11 + 1);
                iArr[i11] = iM49002k43 - iM49002k42;
                i11++;
                iM49002k42 = iM49002k43;
            }
            iArr[i10] = i3;
        }
        int[] iArr2 = iArr;
        int iM49002k44 = m49002k4(iM57126ix2);
        int i12 = (i3 + this.f35939x1) - iM49002k44;
        C9951dy c9951dyM57145yj = c12236up.m57145yj();
        c9951dyM57145yj.m48955m9(this.f35935ks.m48905k4(c12236up));
        c9951dyM57145yj.m48947h4(iM49002k44);
        c9951dyM57145yj.m48945dy(m49003k4(c12236up, i, i2));
        c9951dyM57145yj.m48942c5(i12);
        int iM59063kk = C12715ne.m59063kk(c12236up.m57131ks(), i);
        if (i2 >= 0) {
            C12684bs.m58844k4(c12236up.m57131ks(), i, i2, iM59063kk);
        }
        C12698g8 c12698g8 = new C12698g8(c12236up.m57131ks(), i, i2 + 1);
        C12724ss c12724ss = this.f35937to;
        int iM57126ix3 = iM57126ix2 - c12236up.m57126ix();
        int iM57126ix4 = iM57019k4 - c12236up.m57126ix();
        if (iM57126ix2 == this.f35931h4) {
            z2 = true;
            c9957m9 = this;
            i9 = iM57126ix4;
            i7 = iM57126ix3;
            c9951dy = c9951dyM57145yj;
            i6 = i4;
            i8 = i5;
        } else {
            z2 = false;
            c9957m9 = this;
            i6 = i4;
            i7 = iM57126ix3;
            i8 = i5;
            i9 = iM57126ix4;
            c9951dy = c9951dyM57145yj;
        }
        c9951dy.m48953k4(c12698g8, c12724ss, iArr2, i7, i9, i6, i8, z2, z, c9957m9, iM49002k4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m49012k4(boolean z, boolean z2) {
        m49007x1(z, z2);
        if (this.f35938up != null) {
            C9959up c9959upM48907k4 = this.f35935ks.m48907k4();
            C1869to c1869to = new C1869to(this.f35940yj);
            while (c1869to.mo9764x1()) {
                C1581c5 c1581c5 = (C1581c5) c1869to.mo9760kk();
                C12712m2.m59038k4(c1581c5, this.f35938up, c9959upM48907k4, -c1581c5.m8588yd(), this.f35930fa - c1581c5.m8578ak(), c9959upM48907k4.mo48944dy(), this.f35939x1 - this.f35930fa);
            }
            this.f35938up = null;
            this.f35940yj.clear();
        }
    }
}
