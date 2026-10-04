package com.aspose.slides.internal.p371qw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p481wp.C12225k4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9956kk {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC9956kk f35925k4 = new C9958to();

    /* JADX INFO: renamed from: k4 */
    public static int m48995k4(int i, int i2) {
        return m48998kk(m48999x1(i), m48999x1(i2));
    }

    /* JADX INFO: renamed from: kk */
    private static int m48997kk(int i) {
        switch (i) {
            case 71:
                return -4;
            case 72:
            case 74:
            default:
                throw new InvalidOperationException();
            case 73:
            case 77:
            case 78:
                return -2;
            case 75:
                return 0;
            case 76:
                return -3;
            case 79:
                return -1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static int m48999x1(int i) {
        if (i == 31) {
            return -2;
        }
        if (i == 55) {
            return -6;
        }
        if (i == 67) {
            return -7;
        }
        if (i == 101) {
            return -5;
        }
        if (i == 119) {
            return -4;
        }
        if (i == 133) {
            return -1;
        }
        if (i == 36) {
            return -3;
        }
        if (i == 37) {
            return 0;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("Illegal border style: ", C14057f9.m66591x1(i)));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C12225k4 mo49001k4(C12225k4 c12225k4, C12225k4 c12225k42);

    /* JADX INFO: renamed from: k4 */
    public static AbstractC9956kk m48996k4(int i) {
        if (i == 26) {
            return f35925k4;
        }
        if (i == 27) {
            return null;
        }
        throw new ArgumentException("Illegal border-collapse mode.");
    }

    /* JADX INFO: renamed from: kk */
    private static int m48998kk(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m49000x1(int i, int i2) {
        return m48998kk(m48997kk(i), m48997kk(i2));
    }
}
