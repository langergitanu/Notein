package com.aspose.slides.internal.p077d8;

import com.aspose.slides.PptReadException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.tq */
/* JADX INFO: loaded from: classes3.dex */
public class C3088tq {

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f9163k4 = new C14047bz("F29F85E0-4FF9-1068-AB91-08002B27B3D9");

    /* JADX INFO: renamed from: x1 */
    public static final C14047bz f9164x1 = new C14047bz("D5CDD502-2E9C-101B-9397-08002B2CF9AE");

    /* JADX INFO: renamed from: c5 */
    private C14047bz f9165c5;

    /* JADX INFO: renamed from: ck */
    private C3080qw f9166ck;

    /* JADX INFO: renamed from: du */
    private long f9167du;

    /* JADX INFO: renamed from: dy */
    private C14047bz f9168dy;

    /* JADX INFO: renamed from: h4 */
    private C14047bz f9169h4;

    /* JADX INFO: renamed from: jd */
    private C3080qw f9170jd;

    /* JADX INFO: renamed from: kk */
    private int f9171kk;

    /* JADX INFO: renamed from: m9 */
    private long f9172m9;

    /* JADX INFO: renamed from: to */
    private int f9173to;

    public C3088tq(AbstractC3150x6 abstractC3150x6) {
        this.f9171kk = 65534;
        this.f9169h4 = new C14047bz();
        this.f9168dy = new C14047bz();
        this.f9165c5 = new C14047bz();
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        this.f9171kk = c3134k4.m13382u4();
        this.f9173to = c3134k4.m13382u4();
        this.f9167du = c3134k4.m13384uz();
        this.f9169h4 = new C14047bz(c3134k4.m13372dy(16));
        long jM13384uz = c3134k4.m13384uz();
        this.f9172m9 = jM13384uz;
        long jM13384uz2 = 0;
        if (C7019kk.m27435du(Long.valueOf(jM13384uz), 10) == 0) {
            this.f9172m9 = 1L;
            this.f9170jd = new C3080qw();
            return;
        }
        this.f9168dy = new C14047bz(c3134k4.m13372dy(16));
        long jM13384uz3 = c3134k4.m13384uz();
        if (C7019kk.m27435du(Long.valueOf(this.f9172m9), 10) == 1) {
            this.f9165c5 = new C14047bz(c3134k4.m13372dy(16));
            c3134k4.m13384uz();
            this.f9170jd = new C3080qw(abstractC3150x6, jM13384uz3, 0);
            return;
        }
        if (C7019kk.m27435du(Long.valueOf(this.f9172m9), 10) == 2) {
            this.f9165c5 = new C14047bz(c3134k4.m13372dy(16));
            jM13384uz2 = c3134k4.m13384uz();
        }
        this.f9170jd = new C3080qw(abstractC3150x6, jM13384uz3, 0);
        if (C7019kk.m27435du(Long.valueOf(this.f9172m9), 10) == 2) {
            try {
                this.f9166ck = new C3080qw(abstractC3150x6, jM13384uz2, 1);
            } catch (PptReadException e) {
                C3085sv.m13082k4(e);
                this.f9166ck = null;
                this.f9172m9 = 1L;
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final C3080qw m13122du() {
        return this.f9166ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m13123k4() {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13446k4(this.f9171kk);
        c3149x1.m13446k4(this.f9173to);
        c3149x1.m13447k4(this.f9167du);
        c3149x1.m13450k4(this.f9169h4.m66539k4());
        c3149x1.m13447k4(this.f9172m9);
        c3149x1.m13450k4(this.f9168dy.m66539k4());
        long jM27435du = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(c3152yj.getPosition()), 11)), 10) + 4), 10);
        if (C7019kk.m27435du(Long.valueOf(this.f9172m9), 10) == 2) {
            jM27435du = C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(jM27435du), 10) + 20), 10);
        }
        c3149x1.m13447k4(jM27435du);
        byte[] bArrM13028du = this.f9170jd.m13028du();
        if (C7019kk.m27435du(Long.valueOf(this.f9172m9), 10) == 2) {
            c3149x1.m13450k4(this.f9165c5.m66539k4());
            c3149x1.m13447k4(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(bArrM13028du.length), 9)), 10) + C7019kk.m27435du(Long.valueOf(jM27435du), 10)), 10));
        }
        c3149x1.m13450k4(bArrM13028du);
        if (C7019kk.m27435du(Long.valueOf(this.f9172m9), 10) == 2) {
            c3149x1.m13450k4(this.f9166ck.m13028du());
        }
        c3149x1.m13454x1();
        return c3152yj.toArray();
    }

    /* JADX INFO: renamed from: kk */
    public final long m13124kk() {
        return this.f9172m9;
    }

    /* JADX INFO: renamed from: to */
    public final C3080qw m13125to() {
        return this.f9170jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3080qw m13126x1() {
        C3080qw c3080qw = this.f9166ck;
        if (c3080qw != null) {
            return c3080qw;
        }
        this.f9172m9 = 2L;
        this.f9165c5 = new C14047bz("{d5cdd505-2e9c-101b-9397-08002b2cf9ae}");
        C3080qw c3080qw2 = new C3080qw();
        this.f9166ck = c3080qw2;
        return c3080qw2;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m13121k4(C14047bz c14047bz) {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13446k4(C7019kk.m27457kk((Object) 65534, 9));
        c3149x1.m13446k4(C7019kk.m27457kk((Object) 0, 9));
        c3149x1.m13447k4(C7019kk.m27435du((Object) 131334, 9));
        c3149x1.m13450k4(C14047bz.f47172k4.m66539k4());
        c3149x1.m13447k4(C7019kk.m27435du((Object) 1, 9));
        c3149x1.m13450k4(c14047bz.m66539k4());
        c3149x1.m13447k4(C7019kk.m27435du(Long.valueOf(c3152yj.getPosition() + 4), 11));
        C3080qw c3080qw = new C3080qw();
        c3080qw.m13029k4().removeAt(2);
        c3080qw.m13029k4().removeAt(0);
        c3149x1.m13450k4(c3080qw.m13028du());
        c3149x1.m13454x1();
        return c3152yj.toArray();
    }
}
