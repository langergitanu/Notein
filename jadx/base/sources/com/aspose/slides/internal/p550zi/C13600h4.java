package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p313oa.C6986dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13600h4 {
    /* JADX INFO: renamed from: k4 */
    public static C13597du m62731k4(int i) {
        int i2 = 255 - (i & 255);
        int i3 = 255 - ((i >> 8) & 255);
        int i4 = 255 - ((i >> 16) & 255);
        int iM67507x1 = C14116yg.m67507x1(C14116yg.m67507x1(i2, i3), i4);
        if (iM67507x1 >= 255) {
            return C13597du.m62712k4(0, 0, 0, iM67507x1);
        }
        int i5 = 255 - iM67507x1;
        return C13597du.m62712k4(((i4 - iM67507x1) * 255) / i5, OooO00o.OooO00o(i3, iM67507x1, 255, i5), OooO00o.OooO00o(i2, iM67507x1, 255, i5), iM67507x1);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13597du m62732k4(int i, int i2, int i3, int i4, C6986dy c6986dy) {
        double[] dArr = {((double) i2) / 255.0d, ((double) i3) / 255.0d, ((double) i4) / 255.0d};
        boolean z = c6986dy.m27335k4() != 3;
        double[] dArr2 = z ? new double[4] : new double[3];
        c6986dy.mo27338k4(dArr, dArr2);
        int iM27462to = C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Double.valueOf(dArr2[0] * 255.0d), 14)), 6);
        int iM27462to2 = C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Double.valueOf(dArr2[1] * 255.0d), 14)), 6);
        int iM27462to3 = C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Double.valueOf(dArr2[2] * 255.0d), 14)), 6);
        return z ? C13597du.m62712k4(iM27462to, iM27462to2, iM27462to3, C7019kk.m27462to(Byte.valueOf(C7019kk.m27442k4(Double.valueOf(dArr2[3] * 255.0d), 14)), 6)) : m62731k4(C12003du.m56398k4(255, iM27462to, iM27462to2, iM27462to3).m56506h4());
    }
}
