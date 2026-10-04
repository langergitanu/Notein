package com.aspose.slides.internal.p159h0;

import OooOO0.OooO0OO;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.v4 */
/* JADX INFO: loaded from: classes.dex */
public class C4476v4 implements IGenericEnumerable<C4433bv> {

    /* JADX INFO: renamed from: k4 */
    private List<C4433bv> f12314k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private float f12315kk;

    /* JADX INFO: renamed from: x1 */
    private short f12316x1;

    public C4476v4() {
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C4433bv> iterator() {
        return this.f12314k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18394k4(C4433bv c4433bv) {
        if (c4433bv == null) {
            throw new ArgumentNullException("mesh");
        }
        short s = this.f12316x1;
        this.f12316x1 = (short) (s + 1);
        c4433bv.m18079k4(s);
        this.f12314k4.addItem(c4433bv);
    }

    public C4476v4(C11896dy c11896dy, float f, float f2, int i, int i2, C4441dy c4441dy, boolean z, boolean z2, C14093tq<C4459os> c14093tq) {
        m18397k4(c11896dy, f, f2, i, i2, c4441dy, z, z2, c14093tq);
    }

    /* JADX INFO: renamed from: k4 */
    private void m18391k4(C4439dq c4439dq, C4489zj[] c4489zjArr, int i) {
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

    /* JADX INFO: renamed from: k4 */
    public final void m18395k4(C4459os c4459os, C4459os c4459os2) {
        C4489zj c4489zj = new C4489zj();
        C4489zj c4489zj2 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj};
        C4489zj[] c4489zjArr2 = {c4489zj2};
        m18396k4(C4473um.m18358k4().Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[0].CloneTo(c4489zj);
        c4489zjArr2[0].CloneTo(c4489zj2);
        List.Enumerator<C4433bv> it = this.f12314k4.iterator();
        while (it.hasNext()) {
            try {
                C4433bv next = it.next();
                for (int i : next.m18084kk()) {
                    next.m18087x1()[i] = new C4459os(OooO0OO.OooO0O0(c4459os2.m18285k4(), c4459os.m18285k4(), (next.m18083k4()[i].m18506k4() - c4489zj.m18506k4()) / (c4489zj2.m18506k4() - c4489zj.m18506k4()), c4459os.m18285k4()), OooO0OO.OooO0O0(c4459os2.m18290x1(), c4459os.m18290x1(), (c4489zj2.m18511x1() - next.m18083k4()[i].m18511x1()) / (c4489zj2.m18511x1() - c4489zj.m18511x1()), c4459os.m18290x1()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18396k4(C4473um c4473um, C4489zj[] c4489zjArr, C4489zj[] c4489zjArr2) {
        c4489zjArr[0] = new C4489zj(Float.POSITIVE_INFINITY);
        c4489zjArr2[0] = new C4489zj(Float.NEGATIVE_INFINITY);
        List.Enumerator<C4433bv> it = this.f12314k4.iterator();
        while (it.hasNext()) {
            try {
                C4433bv next = it.next();
                C4489zj[] c4489zjArrM18083k4 = next.m18083k4();
                for (int i : next.m18084kk()) {
                    C4489zj c4489zjClone = c4473um.m18370k4(c4489zjArrM18083k4[i].Clone()).Clone();
                    C4489zj c4489zj = c4489zjArr[0];
                    c4489zj.m18507k4(C14116yg.m67504x1(c4489zj.m18506k4(), c4489zjClone.m18506k4()));
                    C4489zj c4489zj2 = c4489zjArr[0];
                    c4489zj2.m18512x1(C14116yg.m67504x1(c4489zj2.m18511x1(), c4489zjClone.m18511x1()));
                    C4489zj c4489zj3 = c4489zjArr[0];
                    c4489zj3.m18509kk(C14116yg.m67504x1(c4489zj3.m18508kk(), c4489zjClone.m18508kk()));
                    C4489zj c4489zj4 = c4489zjArr2[0];
                    c4489zj4.m18507k4(C14116yg.m67481k4(c4489zj4.m18506k4(), c4489zjClone.m18506k4()));
                    C4489zj c4489zj5 = c4489zjArr2[0];
                    c4489zj5.m18512x1(C14116yg.m67481k4(c4489zj5.m18511x1(), c4489zjClone.m18511x1()));
                    C4489zj c4489zj6 = c4489zjArr2[0];
                    c4489zj6.m18509kk(C14116yg.m67481k4(c4489zj6.m18508kk(), c4489zjClone.m18508kk()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m18392k4(C4485xk c4485xk, float f, float f2, int i, int i2, boolean z) {
        Class<C4489zj> cls = C4489zj.class;
        C4459os c4459osClone = c4485xk.m18463x1().Clone();
        C4459os c4459osClone2 = c4485xk.m18461kk().Clone();
        C4459os c4459osClone3 = C4459os.m18282x1(c4459osClone2, c4459osClone).Clone();
        IGenericEnumerator<C4439dq> it = c4485xk.iterator();
        while (it.hasNext()) {
            try {
                C4439dq next = it.next();
                char c = 2;
                if (next.m18138h4() >= 2) {
                    int iM18138h4 = next.m18138h4() - 1;
                    int i3 = iM18138h4 * 4;
                    int i4 = iM18138h4 * 2;
                    C4489zj[] c4489zjArr = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls), i3));
                    int i5 = 0;
                    while (i5 < iM18138h4) {
                        int i6 = i5 * 2;
                        char c2 = c;
                        c4489zjArr[i6] = new C4489zj(next.m18149x1(i5).m18113to(), next.m18149x1(i5).m18107du(), f - this.f12315kk);
                        int i7 = i5 + 1;
                        c4489zjArr[i6 + 1] = new C4489zj(next.m18149x1(i7).m18113to(), next.m18149x1(i7).m18107du(), f - this.f12315kk);
                        int i8 = i6 + i4;
                        float f3 = f - f2;
                        c4489zjArr[i8] = new C4489zj(next.m18149x1(i5).m18113to(), next.m18149x1(i5).m18107du(), f3 - this.f12315kk);
                        c4489zjArr[i8 + 1] = new C4489zj(next.m18149x1(i7).m18113to(), next.m18149x1(i7).m18107du(), f3 - this.f12315kk);
                        i5 = i7;
                        c4459osClone = c4459osClone;
                        cls = cls;
                        c4459osClone2 = c4459osClone2;
                        c = c2;
                    }
                    Class<C4489zj> cls2 = cls;
                    C4459os c4459os = c4459osClone;
                    C4459os c4459os2 = c4459osClone2;
                    C4489zj[] c4489zjArr2 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), i3));
                    int i9 = 0;
                    while (i9 < iM18138h4) {
                        int i10 = i9 + 1;
                        C4489zj c4489zjClone = new C4489zj(next.m18149x1(i10).m18107du() - next.m18149x1(i9).m18107du(), -(next.m18149x1(i10).m18113to() - next.m18149x1(i9).m18113to()), 0.0f).m18510to().Clone();
                        int i11 = i9 * 2;
                        int i12 = i11 + i4;
                        c4489zjClone.CloneTo(c4489zjArr2[i12 + 1]);
                        c4489zjClone.CloneTo(c4489zjArr2[i12]);
                        c4489zjClone.CloneTo(c4489zjArr2[i11 + 1]);
                        c4489zjClone.CloneTo(c4489zjArr2[i11]);
                        i9 = i10;
                    }
                    C4459os[] c4459osArr = (C4459os[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4459os.class), i3));
                    for (int i13 = 0; i13 < i3; i13++) {
                        c4459osArr[i13].m18286k4(c4459osClone3.m18285k4() > 0.0f ? (c4489zjArr[i13].m18506k4() - c4459os.m18285k4()) / c4459osClone3.m18285k4() : 0.0f);
                        c4459osArr[i13].m18291x1(c4459osClone3.m18290x1() > 0.0f ? (c4459os2.m18290x1() - c4489zjArr[i13].m18511x1()) / c4459osClone3.m18290x1() : 0.0f);
                    }
                    m18391k4(next, c4489zjArr2, i2);
                    int i14 = iM18138h4 * 6;
                    int[] iArr = new int[i14];
                    int i15 = 0;
                    for (int i16 = 0; i16 < iM18138h4; i16++) {
                        int i17 = i16 * 2;
                        int i18 = i17 + i4;
                        iArr[i15] = i17;
                        iArr[i15 + 1] = i18;
                        int i19 = i17 + 1;
                        iArr[i15 + 2] = i19;
                        iArr[i15 + 3] = i18 + 1;
                        int i20 = i15 + 5;
                        iArr[i15 + 4] = i19;
                        i15 += 6;
                        iArr[i20] = i18;
                    }
                    C4433bv c4433bv = new C4433bv(4);
                    c4433bv.m18082k4(c4489zjArr);
                    c4433bv.m18080k4(iArr);
                    c4433bv.m18086x1(c4489zjArr2);
                    c4433bv.m18081k4(c4459osArr);
                    m18394k4(c4433bv);
                    if (!next.m18151x1() || (i & 2) == 0 || z) {
                        C4489zj[] c4489zjArr3 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4489zjArr2.length));
                        for (int i21 = 0; i21 < c4489zjArr3.length; i21++) {
                            C4489zj.m18497k4(c4489zjArr2[i21]).CloneTo(c4489zjArr3[i21]);
                        }
                        int[] iArr2 = new int[i14];
                        for (int i22 = 0; i22 < i14; i22 += 3) {
                            int i23 = i22 + 2;
                            iArr2[i22] = iArr[i23];
                            int i24 = i22 + 1;
                            iArr2[i24] = iArr[i24];
                            iArr2[i23] = iArr[i22];
                        }
                        C4433bv c4433bv2 = new C4433bv(4);
                        c4433bv2.m18082k4(c4489zjArr);
                        c4433bv2.m18080k4(iArr2);
                        c4433bv2.m18086x1(c4489zjArr3);
                        c4433bv2.m18081k4(c4459osArr);
                        m18394k4(c4433bv2);
                    }
                    c4459osClone = c4459os;
                    cls = cls2;
                    c4459osClone2 = c4459os2;
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
    private void m18393k4(C4485xk c4485xk, float f, float f2, int i, C4441dy c4441dy) {
        boolean zM18206k4;
        boolean zM18206k42;
        Class<C4489zj> cls;
        boolean z;
        C4459os c4459os;
        C4459os c4459os2;
        int i2;
        C4438ck c4438ck;
        char c;
        C4489zj c4489zj;
        C4463ri c4463ri;
        boolean z2;
        float fM18303k4;
        float f3 = 0.0f;
        this.f12315kk = 0.0f;
        if (c4441dy == null || c4441dy.m18159kk()) {
            zM18206k4 = false;
            zM18206k42 = false;
        } else {
            if (c4441dy.m18158k4() != null) {
                this.f12315kk = c4441dy.m18158k4().m18207x1();
                zM18206k42 = c4441dy.m18158k4().m18206k4(c4485xk, f - this.f12315kk, true, i, this);
            } else {
                zM18206k42 = false;
            }
            zM18206k4 = c4441dy.m18160x1() != null ? c4441dy.m18160x1().m18206k4(c4485xk, (f - f2) - this.f12315kk, false, i, this) : false;
        }
        if (zM18206k42 && zM18206k4) {
            return;
        }
        C4489zj c4489zj2 = new C4489zj(0.0f, 0.0f, 1.0f);
        C4489zj c4489zj3 = new C4489zj(0.0f, 0.0f, -1.0f);
        C4459os c4459osClone = c4485xk.m18463x1().Clone();
        C4459os c4459osClone2 = c4485xk.m18461kk().Clone();
        C4459os c4459osClone3 = C4459os.m18282x1(c4459osClone2, c4459osClone).Clone();
        List.Enumerator<C4439dq> it = c4485xk.m18462to().iterator();
        while (it.hasNext()) {
            try {
                try {
                    C4445fa c4445faM18222k4 = new C4451jd(new C4444f9(it.next().m18137fa())).m18222k4();
                    if (c4445faM18222k4 != null) {
                        int i3 = 0;
                        while (i3 < c4445faM18222k4.m18188k4()) {
                            C4438ck c4438ckM18189k4 = c4445faM18222k4.m18189k4(i3);
                            float f4 = f3;
                            C4459os[] c4459osArr = (C4459os[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C4459os.class), c4438ckM18189k4.m18182k4().m18116k4()));
                            int i4 = 0;
                            while (i4 < c4438ckM18189k4.m18182k4().m18116k4()) {
                                C4463ri c4463riM18125x1 = c4438ckM18189k4.m18182k4().m18125x1(i4);
                                C4445fa c4445fa = c4445faM18222k4;
                                C4459os c4459os3 = c4459osArr[i4];
                                if (c4459osClone3.m18285k4() > f4) {
                                    c4463ri = c4463riM18125x1;
                                    z2 = zM18206k42;
                                    fM18303k4 = (((float) c4463ri.m18303k4()) - c4459osClone.m18285k4()) / c4459osClone3.m18285k4();
                                } else {
                                    c4463ri = c4463riM18125x1;
                                    z2 = zM18206k42;
                                    fM18303k4 = f4;
                                }
                                c4459os3.m18286k4(fM18303k4);
                                c4459osArr[i4].m18291x1(c4459osClone3.m18290x1() > f4 ? (c4459osClone2.m18290x1() - ((float) c4463ri.m18310x1())) / c4459osClone3.m18290x1() : f4);
                                i4++;
                                c4445faM18222k4 = c4445fa;
                                zM18206k42 = z2;
                            }
                            C4445fa c4445fa2 = c4445faM18222k4;
                            boolean z3 = zM18206k42;
                            Class<C4489zj> cls2 = C4489zj.class;
                            if (z3) {
                                cls = cls2;
                                z = zM18206k4;
                                c4459os = c4459osClone2;
                                c4459os2 = c4459osClone3;
                                i2 = i3;
                                c4438ck = c4438ckM18189k4;
                                c = 1;
                            } else {
                                c = 1;
                                C4489zj[] c4489zjArr = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4438ckM18189k4.m18182k4().m18116k4()));
                                C4489zj[] c4489zjArr2 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls2), c4438ckM18189k4.m18182k4().m18116k4()));
                                int i5 = 0;
                                while (true) {
                                    cls = cls2;
                                    if (i5 >= c4438ckM18189k4.m18182k4().m18116k4()) {
                                        break;
                                    }
                                    C4463ri c4463riM18125x12 = c4438ckM18189k4.m18182k4().m18125x1(i5);
                                    c4489zjArr[i5] = new C4489zj((float) c4463riM18125x12.m18303k4(), (float) c4463riM18125x12.m18310x1(), f - this.f12315kk);
                                    c4489zj2.CloneTo(c4489zjArr2[i5]);
                                    i5++;
                                    i3 = i3;
                                    cls2 = cls;
                                    c4459osClone2 = c4459osClone2;
                                    c4459osClone3 = c4459osClone3;
                                    c4438ckM18189k4 = c4438ckM18189k4;
                                }
                                c4459os = c4459osClone2;
                                c4459os2 = c4459osClone3;
                                i2 = i3;
                                c4438ck = c4438ckM18189k4;
                                int[] iArr = new int[c4438ck.m18186to().m18321k4() * 3];
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < c4438ck.m18186to().m18321k4()) {
                                    int iM18122kk = c4438ck.m18182k4().m18122kk(c4438ck.m18186to().m18327x1(i6).m18427k4()[0]);
                                    boolean z4 = zM18206k4;
                                    int iM18122kk2 = c4438ck.m18182k4().m18122kk(c4438ck.m18186to().m18327x1(i6).m18427k4()[1]);
                                    iArr[i7] = c4438ck.m18182k4().m18122kk(c4438ck.m18186to().m18327x1(i6).m18427k4()[2]);
                                    iArr[i7 + 1] = iM18122kk2;
                                    iArr[i7 + 2] = iM18122kk;
                                    i6++;
                                    i7 += 3;
                                    zM18206k4 = z4;
                                }
                                z = zM18206k4;
                                C4433bv c4433bv = new C4433bv(2);
                                c4433bv.m18082k4(c4489zjArr);
                                c4433bv.m18080k4(iArr);
                                c4433bv.m18086x1(c4489zjArr2);
                                c4433bv.m18081k4(c4459osArr);
                                m18394k4(c4433bv);
                            }
                            if (z) {
                                c4489zj = c4489zj2;
                            } else {
                                C4489zj[] c4489zjArr3 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls), c4438ck.m18182k4().m18116k4()));
                                C4489zj[] c4489zjArr4 = (C4489zj[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) cls), c4438ck.m18182k4().m18116k4()));
                                for (int i8 = 0; i8 < c4438ck.m18182k4().m18116k4(); i8++) {
                                    C4463ri c4463riM18125x13 = c4438ck.m18182k4().m18125x1(i8);
                                    c4489zjArr3[i8] = new C4489zj((float) c4463riM18125x13.m18303k4(), (float) c4463riM18125x13.m18310x1(), (f - f2) - this.f12315kk);
                                    c4489zj3.CloneTo(c4489zjArr4[i8]);
                                }
                                int[] iArr2 = new int[c4438ck.m18186to().m18321k4() * 3];
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < c4438ck.m18186to().m18321k4()) {
                                    int iM18122kk3 = c4438ck.m18182k4().m18122kk(c4438ck.m18186to().m18327x1(i9).m18427k4()[0]);
                                    int iM18122kk4 = c4438ck.m18182k4().m18122kk(c4438ck.m18186to().m18327x1(i9).m18427k4()[c]);
                                    C4489zj c4489zj4 = c4489zj2;
                                    int iM18122kk5 = c4438ck.m18182k4().m18122kk(c4438ck.m18186to().m18327x1(i9).m18427k4()[2]);
                                    iArr2[i10] = iM18122kk3;
                                    iArr2[i10 + 1] = iM18122kk4;
                                    iArr2[i10 + 2] = iM18122kk5;
                                    i9++;
                                    i10 += 3;
                                    c4489zj2 = c4489zj4;
                                }
                                c4489zj = c4489zj2;
                                C4433bv c4433bv2 = new C4433bv(2);
                                c4433bv2.m18082k4(c4489zjArr3);
                                c4433bv2.m18080k4(iArr2);
                                c4433bv2.m18086x1(c4489zjArr4);
                                c4433bv2.m18081k4(c4459osArr);
                                m18394k4(c4433bv2);
                            }
                            i3 = i2 + 1;
                            c4445faM18222k4 = c4445fa2;
                            zM18206k42 = z3;
                            zM18206k4 = z;
                            f3 = f4;
                            c4489zj2 = c4489zj;
                            c4459osClone2 = c4459os;
                            c4459osClone3 = c4459os2;
                        }
                    }
                } catch (RuntimeException e) {
                    boolean z5 = zM18206k4;
                    C4489zj c4489zj5 = c4489zj2;
                    float f5 = f3;
                    boolean z6 = zM18206k42;
                    C4459os c4459os4 = c4459osClone2;
                    C4459os c4459os5 = c4459osClone3;
                    C3085sv.m13082k4(e);
                    zM18206k42 = z6;
                    zM18206k4 = z5;
                    f3 = f5;
                    c4489zj2 = c4489zj5;
                    c4459osClone2 = c4459os4;
                    c4459osClone3 = c4459os5;
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
    public final void m18397k4(C11896dy c11896dy, float f, float f2, int i, int i2, C4441dy c4441dy, boolean z, boolean z2, C14093tq<C4459os> c14093tq) {
        float f3;
        int i3;
        float f4;
        if (c11896dy == null) {
            throw new ArgumentNullException("graphicsPath");
        }
        C4485xk c4485xkM18248k4 = C4456lr.m18248k4(c11896dy, z2, c14093tq);
        if ((i & 2) != 0) {
            f3 = f2;
            m18393k4(c4485xkM18248k4, f, f3, i2, c4441dy);
            f4 = f;
            i3 = i2;
        } else {
            f3 = f2;
            i3 = i2;
            f4 = f;
        }
        if ((i & 4) != 0) {
            m18392k4(c4485xkM18248k4, f4, f3, i, i3, z);
        }
    }
}
