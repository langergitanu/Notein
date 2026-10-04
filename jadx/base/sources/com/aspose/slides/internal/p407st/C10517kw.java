package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.kw */
/* JADX INFO: loaded from: classes4.dex */
public final class C10517kw {

    /* JADX INFO: renamed from: k4 */
    public static final C14047bz f37160k4 = new C14047bz(new byte[]{-32, -55, -22, 121, -7, -70, -50, 17, -116, -126, 0, -86, 0, 75, -87, 11});

    /* JADX INFO: renamed from: x1 */
    public static final C14047bz f37163x1 = new C14047bz(new byte[]{3, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});

    /* JADX INFO: renamed from: kk */
    public static final C14047bz f37161kk = new C14047bz(new byte[]{9, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});

    /* JADX INFO: renamed from: to */
    public static final C14047bz f37162to = new C14047bz(new byte[]{5, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});

    /* JADX INFO: renamed from: du */
    public static final C14047bz f37159du = new C14047bz(new byte[]{4, 3, 0, 0, 0, 0, 0, 0, -64, 0, 0, 0, 0, 0, 0, 70});

    /* JADX INFO: renamed from: k4 */
    public static AbstractC10716xo m51143k4(C14047bz c14047bz, C3134k4 c3134k4) {
        AbstractC10716xo abstractC10716xoM51145x1 = m51145x1(c14047bz.Clone());
        abstractC10716xoM51145x1.mo50990k4(c3134k4);
        return abstractC10716xoM51145x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC10716xo m51145x1(C14047bz c14047bz) {
        if (C14047bz.m66535k4(c14047bz, f37163x1)) {
            return new C10583p4();
        }
        if (C14047bz.m66535k4(c14047bz, f37161kk)) {
            return new C10527lq();
        }
        if (C14047bz.m66535k4(c14047bz, f37159du)) {
            return new C10569o2();
        }
        if (C14047bz.m66535k4(c14047bz, f37162to)) {
            return new C10545mq();
        }
        if (C14047bz.m66535k4(c14047bz, f37160k4)) {
            return new C10747zb();
        }
        throw new NotImplementedException("Unsupported moniker type.");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m51144k4(C14047bz c14047bz) {
        return C14047bz.m66535k4(c14047bz, f37160k4) || C14047bz.m66535k4(c14047bz, f37163x1) || C14047bz.m66535k4(c14047bz, f37161kk) || C14047bz.m66535k4(c14047bz, f37162to) || C14047bz.m66535k4(c14047bz, f37159du);
    }
}
