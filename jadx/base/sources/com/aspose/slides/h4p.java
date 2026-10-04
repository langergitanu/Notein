package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p159h0.C4433bv;
import com.aspose.slides.internal.p159h0.C4438ck;
import com.aspose.slides.internal.p159h0.C4439dq;
import com.aspose.slides.internal.p159h0.C4444f9;
import com.aspose.slides.internal.p159h0.C4445fa;
import com.aspose.slides.internal.p159h0.C4451jd;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4463ri;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4485xk;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class h4p {

    /* JADX INFO: renamed from: c5 */
    private float f5414c5;

    /* JADX INFO: renamed from: ck */
    private float f5415ck;

    /* JADX INFO: renamed from: dy */
    protected ilw f5417dy;

    /* JADX INFO: renamed from: fa */
    private float f5418fa;

    /* JADX INFO: renamed from: jd */
    private float f5420jd;

    /* JADX INFO: renamed from: kk */
    protected float f5422kk;

    /* JADX INFO: renamed from: ks */
    private float f5423ks;

    /* JADX INFO: renamed from: m9 */
    protected int f5424m9;

    /* JADX INFO: renamed from: rv */
    private float f5425rv;

    /* JADX INFO: renamed from: to */
    protected float f5426to;

    /* JADX INFO: renamed from: up */
    private float f5427up;

    /* JADX INFO: renamed from: x1 */
    protected C11896dy f5428x1;

    /* JADX INFO: renamed from: yj */
    private float f5429yj;

    /* JADX INFO: renamed from: k4 */
    protected boolean f5421k4 = false;

    /* JADX INFO: renamed from: du */
    protected C14093tq<C4459os> f5416du = new C14093tq<>();

    /* JADX INFO: renamed from: h4 */
    protected int f5419h4 = 0;

    public h4p(C11896dy c11896dy, float f, float f2, int i, ilw ilwVar, C14093tq<C4459os> c14093tq) {
        if (c11896dy == null) {
            throw new ArgumentNullException("graphicsPath");
        }
        this.f5428x1 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        this.f5422kk = f;
        this.f5426to = f2;
        this.f5424m9 = i;
        this.f5417dy = ilwVar;
        c14093tq.CloneTo(this.f5416du);
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        m7014k4(c12007ixClone.m56557jd());
        m7018x1(c12007ixClone.m56551ck());
        m7015kk(c12007ixClone.m56550c5());
        m7017to(c12007ixClone.m56575x1());
        m7011du(c12007ixClone.m56575x1() + c12007ixClone.m56551ck());
        m7013h4(c12007ixClone.m56550c5() + c12007ixClone.m56557jd());
        m7016m9(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()));
        m7012dy(C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
    }

    /* JADX INFO: renamed from: x1 */
    private void m7018x1(float f) {
        this.f5420jd = f;
    }

    /* JADX INFO: renamed from: c5 */
    public final float m7019c5() {
        return this.f5423ks;
    }

    /* JADX INFO: renamed from: ck */
    public C4489zj m7020ck() {
        return C14164n2.m67858x1(this.f5424m9) ? new C4489zj(-1.0f, 0.0f, 0.0f) : new C4489zj(0.0f, -1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: du */
    public final float m7021du() {
        return this.f5415ck;
    }

    /* JADX INFO: renamed from: dy */
    public final float m7022dy() {
        return this.f5429yj;
    }

    /* JADX INFO: renamed from: fa */
    public C4489zj m7023fa() {
        return C14164n2.m67858x1(this.f5424m9) ? new C4489zj(1.0f, 0.0f, 0.0f) : new C4489zj(0.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: h4 */
    public final float m7024h4() {
        return this.f5418fa;
    }

    /* JADX INFO: renamed from: jd */
    public final float m7025jd() {
        return this.f5425rv;
    }

    /* JADX INFO: renamed from: k4 */
    public C4476v4 mo6948k4() throws Throwable {
        C4476v4 c4476v4 = new C4476v4();
        C4485xk c4485xkMo3144x1 = mo3144x1();
        m7027k4(c4476v4, c4485xkMo3144x1);
        m7031x1(c4476v4, c4485xkMo3144x1);
        return c4476v4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C4489zj mo3143k4(float f, float f2);

    /* JADX INFO: renamed from: kk */
    public final float m7028kk() {
        return this.f5414c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m7029m9() {
        return this.f5427up;
    }

    /* JADX INFO: renamed from: to */
    public final float m7030to() {
        return this.f5420jd;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract C4485xk mo3144x1();

    /* JADX INFO: renamed from: x1 */
    public abstract C4489zj mo3145x1(float f, float f2);

    /* JADX INFO: renamed from: du */
    private void m7011du(float f) {
        this.f5427up = f;
    }

    /* JADX INFO: renamed from: dy */
    private void m7012dy(float f) {
        this.f5425rv = f;
    }

    /* JADX INFO: renamed from: h4 */
    private void m7013h4(float f) {
        this.f5429yj = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m7014k4(float f) {
        this.f5414c5 = f;
    }

    /* JADX INFO: renamed from: kk */
    private void m7015kk(float f) {
        this.f5415ck = f;
    }

    /* JADX INFO: renamed from: m9 */
    private void m7016m9(float f) {
        this.f5423ks = f;
    }

    /* JADX INFO: renamed from: to */
    private void m7017to(float f) {
        this.f5418fa = f;
    }

    /* JADX INFO: renamed from: x1 */
    public void m7031x1(C4476v4 c4476v4, C4485xk c4485xk) {
        Class<C4489zj> cls = C4489zj.class;
        C4459os c4459osClone = c4485xk.m18463x1().Clone();
        C4459os c4459osClone2 = C4459os.m18282x1(c4485xk.m18461kk().Clone(), c4459osClone).Clone();
        IGenericEnumerator<C4439dq> it = c4485xk.iterator();
        while (it.hasNext()) {
            try {
                C4439dq next = it.next();
                if (next.m18138h4() >= 2) {
                    int iM18138h4 = next.m18138h4() - 1;
                    int i = iM18138h4 * 4;
                    int i2 = iM18138h4 * 2;
                    C4489zj[] c4489zjArr = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls), i));
                    int i3 = 0;
                    while (i3 < iM18138h4) {
                        int i4 = i3 * 2;
                        mo3143k4(next.m18149x1(i3).m18113to(), next.m18149x1(i3).m18107du()).CloneTo(c4489zjArr[i4]);
                        int i5 = i3 + 1;
                        mo3143k4(next.m18149x1(i5).m18113to(), next.m18149x1(i5).m18107du()).CloneTo(c4489zjArr[i4 + 1]);
                        int i6 = i4 + i2;
                        mo3145x1(next.m18149x1(i3).m18113to(), next.m18149x1(i3).m18107du()).CloneTo(c4489zjArr[i6]);
                        mo3145x1(next.m18149x1(i5).m18113to(), next.m18149x1(i5).m18107du()).CloneTo(c4489zjArr[i6 + 1]);
                        i3 = i5;
                        cls = cls;
                    }
                    Class<C4489zj> cls2 = cls;
                    C4489zj[] c4489zjArr2 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), i));
                    int i7 = 0;
                    while (i7 < iM18138h4) {
                        int i8 = i7 * 2;
                        int i9 = i8 + i2;
                        C4459os c4459os = c4459osClone;
                        int i10 = i8 + 1;
                        C4489zj c4489zjClone = C4489zj.m18497k4(C4489zj.m18502to(C4489zj.m18504x1(c4489zjArr[i8], c4489zjArr[i9]).Clone().Clone(), C4489zj.m18504x1(c4489zjArr[i10], c4489zjArr[i8]).Clone().Clone()).m18510to()).Clone();
                        c4489zjClone.CloneTo(c4489zjArr2[i9 + 1]);
                        c4489zjClone.CloneTo(c4489zjArr2[i9]);
                        c4489zjClone.CloneTo(c4489zjArr2[i10]);
                        c4489zjClone.CloneTo(c4489zjArr2[i8]);
                        i7++;
                        c4459osClone = c4459os;
                        c4459osClone2 = c4459osClone2;
                    }
                    C4459os c4459os2 = c4459osClone;
                    C4459os c4459os3 = c4459osClone2;
                    C4459os[] c4459osArr = (C4459os[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4459os.class), i));
                    for (int i11 = 0; i11 < i; i11++) {
                        float fM7024h4 = 0.0f;
                        c4459osArr[i11].m18286k4(c4459os3.m18285k4() > 0.0f ? (c4489zjArr[i11].m18506k4() - c4459os2.m18285k4()) / c4459os3.m18285k4() : 0.0f);
                        C4459os c4459os4 = c4459osArr[i11];
                        if (c4459os3.m18290x1() > 0.0f) {
                            fM7024h4 = ((m7024h4() / 2.0f) - c4489zjArr[i11].m18511x1()) / m7024h4();
                        }
                        c4459os4.m18291x1(fM7024h4);
                    }
                    m7026k4(next, c4489zjArr2, this.f5419h4);
                    int i12 = iM18138h4 * 6;
                    int[] iArr = new int[i12];
                    int i13 = 0;
                    for (int i14 = 0; i14 < iM18138h4; i14++) {
                        int i15 = i14 * 2;
                        int i16 = i15 + i2;
                        iArr[i13] = i15;
                        iArr[i13 + 1] = i16;
                        int i17 = i15 + 1;
                        iArr[i13 + 2] = i17;
                        iArr[i13 + 3] = i16 + 1;
                        int i18 = i13 + 5;
                        iArr[i13 + 4] = i17;
                        i13 += 6;
                        iArr[i18] = i16;
                    }
                    C4433bv c4433bv = new C4433bv(4);
                    if (C14164n2.m67858x1(this.f5424m9)) {
                        C4489zj[] c4489zjArr3 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4489zjArr2.length));
                        for (int i19 = 0; i19 < c4489zjArr3.length; i19++) {
                            C4489zj.m18497k4(c4489zjArr2[i19]).CloneTo(c4489zjArr3[i19]);
                        }
                        int[] iArr2 = new int[i12];
                        for (int i20 = 0; i20 < i12; i20 += 3) {
                            int i21 = i20 + 2;
                            iArr2[i20] = iArr[i21];
                            int i22 = i20 + 1;
                            iArr2[i22] = iArr[i22];
                            iArr2[i21] = iArr[i20];
                        }
                        C4433bv c4433bv2 = new C4433bv(4);
                        c4433bv2.m18082k4(c4489zjArr);
                        c4433bv2.m18080k4(iArr2);
                        c4433bv2.m18086x1(c4489zjArr3);
                        c4433bv2.m18081k4(c4459osArr);
                        c4476v4.m18394k4(c4433bv2);
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                            return;
                        }
                        return;
                    }
                    c4433bv.m18082k4(c4489zjArr);
                    c4433bv.m18080k4(iArr);
                    c4433bv.m18086x1(c4489zjArr2);
                    c4433bv.m18081k4(c4459osArr);
                    c4476v4.m18394k4(c4433bv);
                    c4459osClone = c4459os2;
                    cls = cls2;
                    c4459osClone2 = c4459os3;
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

    /* JADX INFO: renamed from: k4 */
    public final void m7026k4(C4439dq c4439dq, C4489zj[] c4489zjArr, int i) {
        C4489zj c4489zjClone;
        C4489zj c4489zj;
        if (i == -1) {
            return;
        }
        int iM18138h4 = c4439dq.m18138h4();
        int i2 = iM18138h4 - 1;
        int i3 = i2 * 2;
        int i4 = 1;
        if (i != 0) {
            if (i == 1) {
                while (i4 < i2) {
                    int i5 = i4 * 2;
                    int i6 = i5 - 1;
                    if (C4489zj.m18500kk(c4489zjArr[i6].Clone(), c4489zjArr[i5].Clone()) > 0.7071068f) {
                        C4489zj c4489zjClone2 = C4489zj.m18499k4(c4489zjArr[i6], c4489zjArr[i5]).m18510to().Clone();
                        c4489zjClone2.CloneTo(c4489zjArr[i5 + i3]);
                        c4489zjClone2.CloneTo(c4489zjArr[i6 + i3]);
                        c4489zjClone2.CloneTo(c4489zjArr[i5]);
                        c4489zjClone2.CloneTo(c4489zjArr[i6]);
                    }
                    i4++;
                }
                if (!c4439dq.m18151x1()) {
                    return;
                }
                int i7 = i3 - 1;
                if (C4489zj.m18500kk(c4489zjArr[0].Clone(), c4489zjArr[i7].Clone()) <= 0.7071068f) {
                    return;
                }
                c4489zjClone = C4489zj.m18499k4(c4489zjArr[0], c4489zjArr[i7]).m18510to().Clone();
                c4489zjClone.CloneTo(c4489zjArr[i7 + i3]);
                c4489zjClone.CloneTo(c4489zjArr[i3]);
                c4489zjClone.CloneTo(c4489zjArr[i7]);
                c4489zj = c4489zjArr[0];
            } else {
                if (i != 2) {
                    return;
                }
                while (i4 < i2) {
                    int i8 = i4 * 2;
                    int i9 = i8 - 1;
                    C4489zj c4489zjClone3 = C4489zj.m18499k4(c4489zjArr[i9], c4489zjArr[i8]).m18510to().Clone();
                    c4489zjClone3.CloneTo(c4489zjArr[i8 + i3]);
                    c4489zjClone3.CloneTo(c4489zjArr[i9 + i3]);
                    c4489zjClone3.CloneTo(c4489zjArr[i8]);
                    c4489zjClone3.CloneTo(c4489zjArr[i9]);
                    i4++;
                }
                if (!c4439dq.m18151x1()) {
                    return;
                }
                int i10 = i3 - 1;
                c4489zjClone = C4489zj.m18499k4(c4489zjArr[0], c4489zjArr[i10]).m18510to().Clone();
                c4489zjClone.CloneTo(c4489zjArr[i10 + i3]);
                c4489zjClone.CloneTo(c4489zjArr[i3]);
                c4489zjClone.CloneTo(c4489zjArr[i10]);
                c4489zj = c4489zjArr[0];
            }
        } else if (c4439dq.m18145kk()) {
            int i11 = iM18138h4 - 2;
            for (int i12 = i11; i12 > 0; i12--) {
                if (c4439dq.m18149x1(i12).m18112kk() == 2 && c4439dq.m18149x1(i12 - 1).m18112kk() == 2) {
                    int i13 = i12 * 2;
                    int i14 = i13 - 1;
                    C4489zj c4489zjClone4 = C4489zj.m18499k4(c4489zjArr[i14], c4489zjArr[i13]).m18510to().Clone();
                    c4489zjClone4.CloneTo(c4489zjArr[i13 + i3]);
                    c4489zjClone4.CloneTo(c4489zjArr[i14 + i3]);
                    c4489zjClone4.CloneTo(c4489zjArr[i13]);
                    c4489zjClone4.CloneTo(c4489zjArr[i14]);
                }
            }
            if (!c4439dq.m18151x1() || c4439dq.m18149x1(0).m18112kk() != 2 || c4439dq.m18149x1(i11).m18112kk() != 2) {
                return;
            }
            int i15 = i3 - 1;
            c4489zjClone = C4489zj.m18499k4(c4489zjArr[0], c4489zjArr[i15]).m18510to().Clone();
            c4489zjClone.CloneTo(c4489zjArr[i15 + i3]);
            c4489zjClone.CloneTo(c4489zjArr[i3]);
            c4489zjClone.CloneTo(c4489zjArr[i15]);
            c4489zj = c4489zjArr[0];
        } else {
            for (int i16 = 1; i16 < i2; i16++) {
                if (c4439dq.m18149x1(i16).m18112kk() == 2 && c4439dq.m18149x1(i16 + 1).m18112kk() == 2) {
                    int i17 = i16 * 2;
                    int i18 = i17 - 1;
                    C4489zj c4489zjClone5 = C4489zj.m18499k4(c4489zjArr[i18], c4489zjArr[i17]).m18510to().Clone();
                    c4489zjClone5.CloneTo(c4489zjArr[i17 + i3]);
                    c4489zjClone5.CloneTo(c4489zjArr[i18 + i3]);
                    c4489zjClone5.CloneTo(c4489zjArr[i17]);
                    c4489zjClone5.CloneTo(c4489zjArr[i18]);
                }
            }
            if (!c4439dq.m18151x1() || c4439dq.m18149x1(i2).m18112kk() != 2 || c4439dq.m18149x1(1).m18112kk() != 2) {
                return;
            }
            int i19 = i3 - 1;
            c4489zjClone = C4489zj.m18499k4(c4489zjArr[0], c4489zjArr[i19]).m18510to().Clone();
            c4489zjClone.CloneTo(c4489zjArr[i19 + i3]);
            c4489zjClone.CloneTo(c4489zjArr[i3]);
            c4489zjClone.CloneTo(c4489zjArr[i19]);
            c4489zj = c4489zjArr[0];
        }
        c4489zjClone.CloneTo(c4489zj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x021b, code lost:
    
        r2 = new int[r15];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x021f, code lost:
    
        if (r4 >= r15) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0221, code lost:
    
        r5 = r4 + 2;
        r2[r4] = r23[r5];
        r7 = r4 + 1;
        r2[r7] = r23[r7];
        r2[r5] = r23[r4];
        r4 = r4 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0234, code lost:
    
        r4 = new com.aspose.slides.internal.p159h0.C4433bv(4);
        r4.m18082k4(r6);
        r4.m18080k4(r2);
        r4.m18086x1(r9);
        r4.m18081k4(r11);
        r29.m18394k4(r4);
        r2 = new int[r13];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x024c, code lost:
    
        if (r10 >= r13) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x024e, code lost:
    
        r4 = r10 + 2;
        r2[r10] = r14[r4];
        r5 = r10 + 1;
        r2[r5] = r14[r5];
        r2[r4] = r14[r10];
        r10 = r10 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0261, code lost:
    
        r4 = new com.aspose.slides.internal.p159h0.C4433bv(4);
        r4.m18082k4(r25);
        r4.m18080k4(r2);
        r4.m18086x1(r24);
        r4.m18081k4(r11);
        r29.m18394k4(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0279, code lost:
    
        r12 = r17;
        r0 = com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r12, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) r26);
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0281, code lost:
    
        if (r0 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02e9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0038, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f0  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.aspose.slides.internal.h0.f9] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.aspose.slides.ms.System.IDisposable, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.aspose.slides.ms.System.IDisposable] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [int] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.aspose.slides.internal.h0.zj[]] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.aspose.slides.internal.h0.v4] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class<com.aspose.slides.ms.System.IDisposable>] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.aspose.slides.internal.h0.bv] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.aspose.slides.internal.h0.zj] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.aspose.slides.internal.h0.zj] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.aspose.slides.internal.h0.zj[]] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.aspose.slides.internal.h0.bv] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.aspose.slides.Collections.Generic.List$Enumerator] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m7027k4(C4476v4 c4476v4, C4485xk c4485xk) throws Throwable {
        ?? r10;
        ?? r12;
        ?? r122;
        ?? M18188k4;
        ?? c4444f9;
        int[] iArr;
        ?? r26;
        ?? r17;
        C4463ri c4463riM18125x1;
        C4489zj[] c4489zjArr;
        ?? r25;
        ?? r2 = IDisposable.class;
        Class<C4489zj> cls = C4489zj.class;
        C4489zj c4489zjClone = m7020ck().Clone();
        C4489zj c4489zjClone2 = m7023fa().Clone();
        C4459os c4459osClone = c4485xk.m18463x1().Clone();
        C4459os c4459osClone2 = C4459os.m18282x1(c4485xk.m18461kk().Clone(), c4459osClone).Clone();
        ?? it = c4485xk.m18462to().iterator();
        loop0: while (true) {
            try {
            } catch (Throwable th) {
                th = th;
                r10 = r2;
                r12 = it;
            }
            if (it.hasNext()) {
                try {
                    c4444f9 = new C4444f9(((C4439dq) it.next()).m18137fa());
                    C4445fa c4445faM18222k4 = new C4451jd(c4444f9).m18222k4();
                    if (c4445faM18222k4 == null) {
                        continue;
                    } else {
                        int i = 0;
                        while (true) {
                            M18188k4 = c4445faM18222k4.m18188k4();
                            if (i < M18188k4) {
                                C4438ck c4438ckM18189k4 = c4445faM18222k4.m18189k4(i);
                                int iM18321k4 = c4438ckM18189k4.m18186to().m18321k4() * 3;
                                int[] iArr2 = new int[iM18321k4];
                                int iM18321k42 = c4438ckM18189k4.m18186to().m18321k4() * 3;
                                int[] iArr3 = new int[iM18321k42];
                                Class<C4489zj> cls2 = cls;
                                C4459os c4459os = c4459osClone;
                                ?? r3 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4438ckM18189k4.m18182k4().m18116k4()));
                                C4459os c4459os2 = c4459osClone2;
                                C4489zj[] c4489zjArr2 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4438ckM18189k4.m18182k4().m18116k4()));
                                C4445fa c4445fa = c4445faM18222k4;
                                C4489zj[] c4489zjArr3 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4438ckM18189k4.m18182k4().m18116k4()));
                                int i2 = i;
                                C4489zj[] c4489zjArr4 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4438ckM18189k4.m18182k4().m18116k4()));
                                C4459os[] c4459osArr = (C4459os[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4459os.class), c4438ckM18189k4.m18182k4().m18116k4()));
                                int i3 = 0;
                                while (true) {
                                    iArr = iArr3;
                                    if (i3 >= c4438ckM18189k4.m18182k4().m18116k4()) {
                                        break;
                                    }
                                    try {
                                        c4463riM18125x1 = c4438ckM18189k4.m18182k4().m18125x1(i3);
                                        c4489zjArr = c4489zjArr3;
                                        r17 = it;
                                        try {
                                            ?? r8 = r2;
                                            r25 = r3;
                                            try {
                                                mo3143k4((float) c4463riM18125x1.m18303k4(), (float) c4463riM18125x1.m18310x1()).CloneTo(r25[i3]);
                                                r3 = r8;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r3 = r8;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            r3 = r2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r3 = r2;
                                        r17 = it;
                                    }
                                    try {
                                        mo3145x1((float) c4463riM18125x1.m18303k4(), (float) c4463riM18125x1.m18310x1()).CloneTo(c4489zjArr2[i3]);
                                        c4489zjClone.CloneTo(c4489zjArr[i3]);
                                        c4489zjClone2.CloneTo(c4489zjArr4[i3]);
                                        c4459osArr[i3].m18286k4((((float) c4463riM18125x1.m18303k4()) - c4459os.m18285k4()) / c4459os2.m18285k4());
                                        c4459osArr[i3].m18291x1((((float) c4463riM18125x1.m18310x1()) - c4459os.m18290x1()) / c4459os2.m18290x1());
                                        i3++;
                                        r2 = r3;
                                        it = r17;
                                        iArr3 = iArr;
                                        c4489zjArr3 = c4489zjArr;
                                        r3 = r25;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r10 = r3;
                                        r12 = r17;
                                        if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) r10)) {
                                        }
                                        throw th;
                                    }
                                    if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) r10)) {
                                        r12.dispose();
                                    }
                                    throw th;
                                }
                                ?? r252 = r3;
                                C4489zj[] c4489zjArr5 = c4489zjArr3;
                                ?? r172 = it;
                                ?? r32 = r2;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < c4438ckM18189k4.m18186to().m18321k4()) {
                                    try {
                                        int iM18122kk = c4438ckM18189k4.m18182k4().m18122kk(c4438ckM18189k4.m18186to().m18327x1(i4).m18427k4()[0]);
                                        int iM18122kk2 = c4438ckM18189k4.m18182k4().m18122kk(c4438ckM18189k4.m18186to().m18327x1(i4).m18427k4()[1]);
                                        r26 = r32;
                                        try {
                                            int iM18122kk3 = c4438ckM18189k4.m18182k4().m18122kk(c4438ckM18189k4.m18186to().m18327x1(i4).m18427k4()[2]);
                                            iArr2[i5] = iM18122kk3;
                                            iArr[i5] = iM18122kk;
                                            int i6 = i5 + 1;
                                            iArr2[i6] = iM18122kk2;
                                            iArr[i6] = iM18122kk2;
                                            int i7 = i5 + 2;
                                            iArr2[i7] = iM18122kk;
                                            iArr[i7] = iM18122kk3;
                                            i4++;
                                            i5 += 3;
                                            r32 = r26;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r12 = r172;
                                            r10 = r26;
                                            if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) r10)) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r26 = r32;
                                        r12 = r172;
                                        r10 = r26;
                                        if (C7019kk.m27456k4((Iterator) r12, (Class<IDisposable>) r10)) {
                                        }
                                        throw th;
                                    }
                                }
                                r26 = r32;
                                ?? c4433bv = new C4433bv(4);
                                if (C14164n2.m67858x1(this.f5424m9)) {
                                    break loop0;
                                }
                                M18188k4 = r172;
                                c4444f9 = r26;
                                try {
                                    c4433bv.m18082k4(r252);
                                    c4433bv.m18080k4(iArr2);
                                    c4433bv.m18086x1(c4489zjArr5);
                                    c4433bv.m18081k4(c4459osArr);
                                    c4476v4.m18394k4(c4433bv);
                                    C4433bv c4433bv2 = new C4433bv(4);
                                    c4433bv2.m18082k4(c4489zjArr2);
                                    c4433bv2.m18080k4(iArr);
                                    c4433bv2.m18086x1(c4489zjArr4);
                                    c4433bv2.m18081k4(c4459osArr);
                                    c4476v4.m18394k4(c4433bv2);
                                    i = i2 + 1;
                                    r2 = c4444f9;
                                    it = M18188k4;
                                    cls = cls2;
                                    c4459osClone = c4459os;
                                    c4459osClone2 = c4459os2;
                                    c4445faM18222k4 = c4445fa;
                                } catch (Throwable th8) {
                                    th = th8;
                                    r10 = c4444f9;
                                    r12 = M18188k4;
                                }
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    c4444f9 = r2;
                    Class<C4489zj> cls3 = cls;
                    C4459os c4459os3 = c4459osClone;
                    C4459os c4459os4 = c4459osClone2;
                    M18188k4 = it;
                    C6005k4.m24264to("Drawing3D: Triangulation error. The mesh is skipped.");
                    r2 = c4444f9;
                    it = M18188k4;
                    cls = cls3;
                    c4459osClone = c4459os3;
                    c4459osClone2 = c4459os4;
                }
            } else {
                ?? r123 = it;
                boolean zM27456k4 = C7019kk.m27456k4((Iterator) r123, (Class<IDisposable>) r2);
                r122 = r123;
                if (!zM27456k4) {
                    return;
                }
            }
        }
        r122.dispose();
    }
}
