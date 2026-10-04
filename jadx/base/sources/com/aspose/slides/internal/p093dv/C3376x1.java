package com.aspose.slides.internal.p093dv;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p180ib.C4808m9;
import com.aspose.slides.internal.p247ld.C6027kk;
import com.aspose.slides.internal.p247ld.C6028x1;
import com.aspose.slides.internal.p459ve.C11625c5;
import com.aspose.slides.internal.p459ve.C11626ck;
import com.aspose.slides.internal.p459ve.C11627du;
import com.aspose.slides.internal.p459ve.C11628dy;
import com.aspose.slides.internal.p459ve.C11629fa;
import com.aspose.slides.internal.p459ve.C11630h4;
import com.aspose.slides.internal.p459ve.C11631jd;
import com.aspose.slides.internal.p459ve.C11634m9;
import com.aspose.slides.internal.p459ve.C11635to;
import com.aspose.slides.internal.p459ve.C11636up;
import com.aspose.slides.internal.p475wh.C12026yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.dv.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C3376x1 {
    /* JADX INFO: renamed from: k4 */
    public static InterfaceC3375k4 m13934k4(C4808m9 c4808m9, boolean z, boolean z2) {
        if (z) {
            return null;
        }
        C12026yj c12026yjM19879k4 = c4808m9.m19913x1().m19879k4();
        int iM56912fa = z2 ? c12026yjM19879k4.m56912fa() : c12026yjM19879k4.m56934up();
        if (iM56912fa == 1) {
            return c12026yjM19879k4.m56940x6().m55789x1() ? new C11625c5() : new C11626ck(c12026yjM19879k4.m56930ne() / 2.0f, c12026yjM19879k4.m56940x6());
        }
        if (iM56912fa == 2) {
            return c12026yjM19879k4.m56940x6().m55789x1() ? new C11634m9() : new C11631jd(c12026yjM19879k4.m56930ne() / 2.0f, c12026yjM19879k4.m56940x6());
        }
        if (iM56912fa == 3) {
            return c12026yjM19879k4.m56940x6().m55789x1() ? new C11636up() : new C11629fa(c12026yjM19879k4.m56930ne() / 2.0f, c12026yjM19879k4.m56940x6());
        }
        if (iM56912fa == 255) {
            try {
                return (z2 ? c12026yjM19879k4.m56929m9() : c12026yjM19879k4.m56913h4()).m55597ck() ? new C6027kk(c4808m9) : new C6028x1(c4808m9.m19911kk(), c4808m9.m19913x1());
            } catch (ArgumentException unused) {
                return null;
            }
        }
        switch (iM56912fa) {
            case 17:
                return new C11628dy();
            case 18:
                return new C11630h4(c12026yjM19879k4.m56930ne());
            case 19:
                return new C11627du(c4808m9.m19911kk(), c4808m9.m19913x1());
            case 20:
                return new C11635to();
            default:
                return null;
        }
    }
}
