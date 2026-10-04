package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.eb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2711eb implements IGenericCloneable<C2711eb> {

    /* JADX INFO: renamed from: du */
    private C2674bu[] f8568du;

    /* JADX INFO: renamed from: h4 */
    private C12007ix[] f8569h4;

    /* JADX INFO: renamed from: k4 */
    private final List<C2957x2> f8570k4;

    /* JADX INFO: renamed from: kk */
    private C2662au f8571kk;

    /* JADX INFO: renamed from: to */
    private C2789kf f8572to;

    /* JADX INFO: renamed from: x1 */
    private final C2768iu f8573x1;

    public C2711eb(C2768iu c2768iu) {
        if (c2768iu == null) {
            throw new ArgumentNullException();
        }
        this.f8571kk = new C2662au();
        this.f8573x1 = c2768iu;
        this.f8570k4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C12007ix[] m12219du() {
        return this.f8569h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2662au m12220k4() {
        return this.f8571kk;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final C2711eb cloneT() {
        C2711eb c2711eb = new C2711eb(this.f8573x1);
        c2711eb.f8571kk = this.f8571kk.cloneT();
        c2711eb.m12222k4(this.f8572to);
        List.Enumerator<C2957x2> it = this.f8570k4.iterator();
        while (it.hasNext()) {
            try {
                c2711eb.f8570k4.addItem(it.next().cloneT());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c2711eb;
    }

    /* JADX INFO: renamed from: to */
    public final C2674bu[] m12227to() {
        return this.f8568du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2957x2[] m12228x1() {
        return this.f8570k4.toArray(new C2957x2[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12221k4(IGenericList<C11896dy> iGenericList, IGenericList<C12007ix> iGenericList2) {
        int i;
        if (iGenericList.size() != iGenericList2.size()) {
            throw new ArgumentException("Count of charPaths list must be equals count of charBounds list");
        }
        this.f8568du = new C2674bu[iGenericList.size()];
        this.f8569h4 = (C12007ix[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12007ix.class), iGenericList2.size()));
        for (int i2 = 0; i2 < iGenericList.size(); i2++) {
            C2674bu c2674bu = new C2674bu(iGenericList.get_Item(i2), 12700.0f);
            c2674bu.m12146h4();
            this.f8568du[i2] = c2674bu;
            C12007ix c12007ixClone = iGenericList2.get_Item(i2).Clone();
            if (c2674bu.m12147jd() == 0 && (i = i2 + 1) < iGenericList.size()) {
                C12007ix c12007ixClone2 = iGenericList2.get_Item(i).Clone();
                if (c12007ixClone2.m56551ck() - c12007ixClone.m56551ck() < 0.1f) {
                    c12007ixClone.m56576x1(c12007ixClone2.m56557jd() - c12007ixClone.m56557jd());
                }
            }
            this.f8569h4[i2] = new C12007ix(c12007ixClone.m56557jd() * 12700.0f, c12007ixClone.m56551ck() * 12700.0f, c12007ixClone.m56550c5() * 12700.0f, c12007ixClone.m56575x1() * 12700.0f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12222k4(C2789kf c2789kf) {
        if (c2789kf == this.f8572to) {
            return;
        }
        this.f8572to = c2789kf != null ? c2789kf.cloneT() : null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12223k4(C2957x2 c2957x2) {
        if (c2957x2 == null) {
            throw new ArgumentNullException("paragraph");
        }
        this.f8570k4.addItem(c2957x2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2857pd[] m12224k4(C2891s1 c2891s1, double d) {
        return new C2840nz(this, c2891s1, d).m12429k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C11896dy[] m12225k4(C12007ix[] c12007ixArr) {
        C2857pd[] c2857pdArr;
        int i;
        C11896dy[] c11896dyArr;
        int i2;
        C2857pd[] c2857pdArrM12224k4 = m12224k4(this.f8573x1.m12317kk(), 3116.0d);
        C11896dy[] c11896dyArr2 = new C11896dy[c2857pdArrM12224k4.length];
        int i3 = 0;
        c12007ixArr[0] = new C12007ix();
        if (c2857pdArrM12224k4.length <= 0) {
            return c11896dyArr2;
        }
        float f = -3.4028235E38f;
        int i4 = 0;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = -3.4028235E38f;
        while (i4 < c2857pdArrM12224k4.length) {
            C2977y9[] c2977y9ArrM12286x1 = c2857pdArrM12224k4[i4].m12463x1().m12286x1();
            C11896dy c11896dy = new C11896dy();
            c11896dyArr2[i4] = c11896dy;
            int length = c2977y9ArrM12286x1.length;
            int i5 = i3;
            while (i5 < length) {
                C2977y9 c2977y9 = c2977y9ArrM12286x1[i5];
                if (c2977y9.m12626k4() > 0) {
                    C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c2977y9.m12626k4()));
                    int i6 = i3;
                    i = i6;
                    while (i6 < c2977y9.m12626k4()) {
                        C2865q1 c2865q1Clone = c2977y9.m12627k4(i6).Clone();
                        C2857pd[] c2857pdArr2 = c2857pdArrM12224k4;
                        float fM12477k4 = (float) (c2865q1Clone.m12477k4() / 12700.0d);
                        double dM12481x1 = c2865q1Clone.m12481x1();
                        C11896dy[] c11896dyArr3 = c11896dyArr2;
                        float f5 = (float) (dM12481x1 / 12700.0d);
                        if (f2 > fM12477k4) {
                            f2 = fM12477k4;
                        }
                        if (f3 > f5) {
                            f3 = f5;
                        }
                        if (f < fM12477k4) {
                            f = fM12477k4;
                        }
                        if (f4 < f5) {
                            f4 = f5;
                        }
                        c12025x6Arr[i6] = new C12025x6(fM12477k4, f5);
                        if (i6 > 0) {
                            int i7 = i6 - 1;
                            if (Math.abs(r2.m56897x1() - c12025x6Arr[i7].m56897x1()) < 9.0E-4d) {
                                i2 = i7;
                                c12025x6Arr[i6] = new C12025x6(c12025x6Arr[i7].m56897x1(), c12025x6Arr[i6].m56895kk());
                            } else {
                                i2 = i7;
                            }
                            if (Math.abs(c12025x6Arr[i6].m56895kk() - c12025x6Arr[i2].m56895kk()) < 9.0E-4d) {
                                c12025x6Arr[i6] = new C12025x6(c12025x6Arr[i6].m56897x1(), c12025x6Arr[i2].m56895kk());
                            }
                        }
                        i6++;
                        c11896dyArr2 = c11896dyArr3;
                        c2857pdArrM12224k4 = c2857pdArr2;
                    }
                    c2857pdArr = c2857pdArrM12224k4;
                    c11896dyArr = c11896dyArr2;
                    c11896dy.m55570to(c12025x6Arr);
                } else {
                    c2857pdArr = c2857pdArrM12224k4;
                    i = i3;
                    c11896dyArr = c11896dyArr2;
                }
                i5++;
                c11896dyArr2 = c11896dyArr;
                i3 = i;
                c2857pdArrM12224k4 = c2857pdArr;
            }
            i4++;
            i3 = i3;
        }
        int i8 = i3;
        C11896dy[] c11896dyArr4 = c11896dyArr2;
        c12007ixArr[i8] = new C12007ix(f2, f3, C14116yg.m67480k4(f - f2), C14116yg.m67480k4(f4 - f3));
        return c11896dyArr4;
    }
}
