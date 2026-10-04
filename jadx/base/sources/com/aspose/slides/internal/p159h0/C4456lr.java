package com.aspose.slides.internal.p159h0;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.lr */
/* JADX INFO: loaded from: classes.dex */
public class C4456lr {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C4485xk m18247k4(C11896dy c11896dy, float f) {
        int i;
        if (c11896dy.m55525du() == 0) {
            return null;
        }
        C4485xk c4485xk = new C4485xk();
        C4459os c4459os = new C4459os(0.0f);
        int i2 = 0;
        while (i2 < c11896dy.m55525du()) {
            byte b = c11896dy.m55571to()[i2];
            int i3 = b & 3;
            if (i3 == 0) {
                i = i2;
                c4459os = new C4459os(c11896dy.m55565kk()[i].Clone());
                c4485xk.m18459k4(c4459os.Clone());
            } else if (i3 != 1) {
                if (i3 == 3) {
                    int i4 = i2;
                    int i5 = i4 + 2;
                    m18251k4(c4459os.Clone(), new C4459os(c11896dy.m55565kk()[i4].Clone()), new C4459os(c11896dy.m55565kk()[i4 + 1].Clone()), new C4459os(c11896dy.m55565kk()[i5].Clone()), c4485xk, f);
                    b = c11896dy.m55571to()[i5];
                    c4459os = new C4459os(c11896dy.m55565kk()[i5].Clone());
                    i2 = i5;
                }
                if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                    c4485xk.m18457k4();
                }
                i2++;
            } else {
                i = i2;
                c4459os = new C4459os(c11896dy.m55565kk()[i].Clone());
                c4485xk.m18464x1(c4459os.Clone());
            }
            i2 = i;
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
            }
            i2++;
        }
        return c4485xk;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4485xk m18248k4(C11896dy c11896dy, boolean z, C14093tq<C4459os> c14093tq) {
        return m18249k4(c11896dy, z, c14093tq, 0.25f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4485xk m18249k4(C11896dy c11896dy, boolean z, C14093tq<C4459os> c14093tq, float f) {
        C4485xk c4485xkM18247k4 = m18247k4(c11896dy, f);
        if (c4485xkM18247k4 == null) {
            throw new NullReferenceException("The path cannot be null.");
        }
        c4485xkM18247k4.m18460k4(z, c14093tq);
        return c4485xkM18247k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m18250k4(C4436c6 c4436c6, C4459os c4459os, C4459os c4459os2, C4436c6 c4436c62, float f, int i) {
        float f2;
        if (i > 15) {
            return;
        }
        C4459os c4459osClone = c4436c6.m18108k4().Clone();
        C4459os c4459osClone2 = c4436c62.m18108k4().Clone();
        C4459os c4459osClone3 = C4459os.m18278k4(C4459os.m18279k4(c4459os, c4459os2), 0.5f).Clone();
        C4459os[] c4459osArr = (C4459os[]) C22200OooO0o0.OooO00o(C4459os.class, 5);
        C4459os.m18278k4(C4459os.m18279k4(c4459osClone, c4459os), 0.5f).CloneTo(c4459osArr[0]);
        C4459os.m18278k4(C4459os.m18279k4(c4459osArr[0], c4459osClone3), 0.5f).CloneTo(c4459osArr[1]);
        C4459os.m18278k4(C4459os.m18279k4(c4459osClone2, c4459os2), 0.5f).CloneTo(c4459osArr[4]);
        C4459os.m18278k4(C4459os.m18279k4(c4459osArr[4], c4459osClone3), 0.5f).CloneTo(c4459osArr[3]);
        C4459os.m18278k4(C4459os.m18279k4(c4459osArr[1], c4459osArr[3]), 0.5f).CloneTo(c4459osArr[2]);
        if (C4479w6.m18415k4(c4459os.Clone(), c4459osArr[0].Clone()) && C4479w6.m18415k4(c4459os2.Clone(), c4459osArr[1].Clone())) {
            return;
        }
        if (C4479w6.m18415k4(c4459os.Clone(), c4459osArr[3].Clone()) && C4479w6.m18415k4(c4459os2.Clone(), c4459osArr[4].Clone())) {
            return;
        }
        if (i != 0) {
            f2 = f;
            if (!m18252k4(c4459osClone.Clone(), c4459osClone2.Clone(), c4459osArr[2].Clone(), f2)) {
                return;
            }
        } else {
            f2 = f;
        }
        C4436c6 c4436c63 = new C4436c6(c4459osArr[2].Clone(), 2);
        c4436c6.m18115x1(c4436c63);
        int i2 = i + 1;
        m18250k4(c4436c6, c4459osArr[0].Clone(), c4459osArr[1].Clone(), c4436c63, f2, i2);
        m18250k4(c4436c63, c4459osArr[3].Clone(), c4459osArr[4].Clone(), c4436c62, f, i2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m18251k4(C4459os c4459os, C4459os c4459os2, C4459os c4459os3, C4459os c4459os4, C4485xk c4485xk, float f) {
        C4436c6 c4436c6 = new C4436c6(c4459os.Clone(), 2);
        C4436c6 c4436c62 = new C4436c6(c4459os4.Clone(), 2);
        c4436c6.m18115x1(c4436c62);
        m18250k4(c4436c6, c4459os2.Clone(), c4459os3.Clone(), c4436c62, f, 0);
        for (C4436c6 c4436c6M18114x1 = c4436c6.m18114x1(); c4436c6M18114x1 != null; c4436c6M18114x1 = c4436c6M18114x1.m18114x1()) {
            c4485xk.m18458k4(c4436c6M18114x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m18252k4(C4459os c4459os, C4459os c4459os2, C4459os c4459os3, float f) {
        return C14116yg.m67480k4(((c4459os.m18290x1() * c4459os2.m18285k4()) + ((c4459os3.m18285k4() * (c4459os2.m18290x1() - c4459os.m18290x1())) - (c4459os3.m18290x1() * (c4459os2.m18285k4() - c4459os.m18285k4())))) - (c4459os.m18285k4() * c4459os2.m18290x1())) > f * ((float) C14116yg.m67496rv(C14116yg.m67469du((double) (c4459os2.m18285k4() - c4459os.m18285k4()), 2.0d) + C14116yg.m67469du((double) (c4459os2.m18290x1() - c4459os.m18290x1()), 2.0d)));
    }
}
