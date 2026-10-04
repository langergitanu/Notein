package com.aspose.slides.internal.p144g6;

import com.aspose.slides.internal.p085dk.C3175k4;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.g6.ks */
/* JADX INFO: loaded from: classes.dex */
public class C4217ks {
    /* JADX INFO: renamed from: k4 */
    private static String m16963k4(float[] fArr) {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < fArr.length; i++) {
            c6765kp.m26792k4(C9574to.m46741k4(fArr[i]));
            if (i < fArr.length - 1) {
                c6765kp.m26792k4(" ");
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16964k4(C3175k4 c3175k4) {
        c3175k4.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16965k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C4320jd c4320jd) throws Throwable {
        c4213ix.m13593x1("Path.Stroke");
        C4223x1.m17006k4(c4213ix, abstractC4221to, c4320jd.m17362h4());
        c4213ix.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m16966k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C4328x1 c4328x1) throws Throwable {
        c4213ix.m13593x1("Path.Fill");
        C4223x1.m17006k4(c4213ix, abstractC4221to, c4328x1);
        c4213ix.m13588kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m16967k4(C4213ix c4213ix, AbstractC4221to abstractC4221to, C10971um c10971um) throws Throwable {
        C4225yj c4225yj = new C4225yj();
        String strM17023kk = c4225yj.m17023kk(c10971um);
        if (!C12565ks.m58630x1(strM17023kk) || "F 1 ".equals(strM17023kk)) {
            return false;
        }
        c4213ix.m13593x1("Path");
        if (c10971um.m53098k4() != null) {
            c4213ix.m16934k4("StrokeThickness", c10971um.m53098k4().m17375x1());
            c4213ix.m13590kk("StrokeLineJoin", C4209du.m16894k4(c10971um.m53098k4().m17358du()));
            if (c10971um.m53098k4().m17358du() == 0 || c10971um.m53098k4().m17358du() == 3) {
                c4213ix.m16934k4("StrokeMiterLimit", c10971um.m53098k4().m17372m9());
            }
            c4213ix.m13590kk("StrokeStartLineCap", C4209du.m16897x1(c10971um.m53098k4().m17369kk()));
            c4213ix.m13590kk("StrokeEndLineCap", C4209du.m16897x1(c10971um.m53098k4().m17373to()));
            if (c10971um.m53098k4().m17364jd() != 0) {
                c4213ix.m16934k4("StrokeDashOffset", c10971um.m53098k4().m17360dy());
                c4213ix.m13590kk("StrokeDashCap", C4209du.m16895kk(c10971um.m53098k4().m17356c5()));
                c4213ix.m13590kk("StrokeDashArray", m16963k4(c10971um.m53098k4().m17357ck()));
            }
        }
        if (c10971um.mo52909to() != null) {
            c4213ix.m16936k4("RenderTransform", c10971um.mo52909to());
        }
        c4213ix.m13590kk("Data", strM17023kk);
        if (c10971um.mo52902du() != null) {
            c4213ix.m13590kk("Clip", c4225yj.m17023kk(c10971um.mo52902du()));
        }
        if (c10971um.m53107x1() != null) {
            m16966k4(c4213ix, abstractC4221to, c10971um.m53107x1());
        }
        if (c10971um.m53098k4() == null) {
            return true;
        }
        m16965k4(c4213ix, abstractC4221to, c10971um.m53098k4());
        return true;
    }
}
