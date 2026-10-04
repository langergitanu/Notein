package com.aspose.slides.internal.p358qe;

import com.aspose.slides.exceptions.AmbiguousMatchException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14048c5;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.InterfaceC14056em;

/* JADX INFO: renamed from: com.aspose.slides.internal.qe.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9844h4 extends AbstractC9853x1 {
    /* JADX INFO: renamed from: k4 */
    public static int m48545k4(AbstractC14068j5 abstractC14068j5) {
        int i = 0;
        do {
            i++;
            abstractC14068j5 = abstractC14068j5.mo48620k4();
        } while (abstractC14068j5 != null);
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    private int m48553x1(AbstractC14068j5 abstractC14068j5, AbstractC14068j5 abstractC14068j52) {
        if (abstractC14068j5 == abstractC14068j52) {
            return 0;
        }
        if (abstractC14068j5.m66760wy() && !abstractC14068j52.m66760wy()) {
            return 1;
        }
        if (!abstractC14068j5.m66760wy() && abstractC14068j52.m66760wy()) {
            return -1;
        }
        if (abstractC14068j5.m66741c6() && abstractC14068j52.m66741c6()) {
            return m48553x1(abstractC14068j5.mo48611c5(), abstractC14068j52.mo48611c5());
        }
        if (abstractC14068j5.m66749k4(abstractC14068j52)) {
            return -1;
        }
        if (abstractC14068j52.m66749k4(abstractC14068j5)) {
            return 1;
        }
        if (!abstractC14068j5.m66740bv() || AbstractC14092to.m67202k4(abstractC14068j52.mo48630yj(), abstractC14068j5, 0, abstractC14068j52.mo48630yj().length) < 0) {
            return (!abstractC14068j52.m66740bv() || AbstractC14092to.m67202k4(abstractC14068j5.mo48630yj(), abstractC14068j52, 0, abstractC14068j5.mo48630yj().length) < 0) ? 0 : -1;
        }
        return 1;
    }

    @Override // com.aspose.slides.internal.p358qe.AbstractC9853x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC9842dy mo48554k4(int i, AbstractC9842dy[] abstractC9842dyArr, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr) {
        return m48546k4(i, abstractC9842dyArr, abstractC14068j5Arr, c9840ckArr, false);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9842dy m48546k4(int i, AbstractC9842dy[] abstractC9842dyArr, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr, boolean z) {
        if (abstractC9842dyArr == null) {
            throw new ArgumentNullException("match");
        }
        AbstractC9842dy abstractC9842dy = null;
        AbstractC9842dy abstractC9842dy2 = null;
        int i2 = 0;
        while (true) {
            if (i2 >= abstractC9842dyArr.length) {
                break;
            }
            AbstractC9842dy abstractC9842dy3 = abstractC9842dyArr[i2];
            C9845jd[] c9845jdArrMo48533m9 = abstractC9842dy3.mo48533m9();
            if (c9845jdArrMo48533m9.length == abstractC14068j5Arr.length) {
                int i3 = 0;
                while (i3 < abstractC14068j5Arr.length && abstractC14068j5Arr[i3] == c9845jdArrMo48533m9[i3].m48561k4()) {
                    i3++;
                }
                if (i3 != abstractC14068j5Arr.length) {
                    continue;
                } else {
                    if (abstractC9842dy2 != null) {
                        abstractC9842dy2 = null;
                        break;
                    }
                    abstractC9842dy2 = abstractC9842dy3;
                }
            }
            i2++;
        }
        if (abstractC9842dy2 != null) {
            return abstractC9842dy2;
        }
        for (AbstractC9842dy abstractC9842dy4 : abstractC9842dyArr) {
            C9845jd[] c9845jdArrMo48533m92 = abstractC9842dy4.mo48533m9();
            if (c9845jdArrMo48533m92.length <= abstractC14068j5Arr.length + 1 && c9845jdArrMo48533m92.length != 0 && AbstractC14048c5.m66543k4(c9845jdArrMo48533m92[c9845jdArrMo48533m92.length - 1], C7019kk.m27443k4((Class<?>) InterfaceC14056em.class))) {
                AbstractC14068j5 abstractC14068j5Mo48611c5 = c9845jdArrMo48533m92[c9845jdArrMo48533m92.length - 1].m48561k4().mo48611c5();
                int i4 = 0;
                while (i4 < abstractC14068j5Arr.length && ((i4 >= c9845jdArrMo48533m92.length - 1 || abstractC14068j5Arr[i4] == c9845jdArrMo48533m92[i4].m48561k4()) && (i4 < c9845jdArrMo48533m92.length - 1 || abstractC14068j5Arr[i4] == abstractC14068j5Mo48611c5))) {
                    i4++;
                }
                if (i4 == abstractC14068j5Arr.length) {
                    return abstractC9842dy4;
                }
            }
        }
        if ((i & 65536) != 0) {
            return null;
        }
        for (AbstractC9842dy abstractC9842dyM48547k4 : abstractC9842dyArr) {
            C9845jd[] c9845jdArrMo48533m93 = abstractC9842dyM48547k4.mo48533m9();
            if (c9845jdArrMo48533m93.length == abstractC14068j5Arr.length && m48552k4(abstractC14068j5Arr, c9845jdArrMo48533m93, z)) {
                if (abstractC9842dy != null) {
                    abstractC9842dyM48547k4 = m48547k4(abstractC9842dy, abstractC9842dyM48547k4, abstractC14068j5Arr);
                }
                abstractC9842dy = abstractC9842dyM48547k4;
            }
        }
        return abstractC9842dy;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC9842dy m48547k4(AbstractC9842dy abstractC9842dy, AbstractC9842dy abstractC9842dy2, AbstractC14068j5[] abstractC14068j5Arr) {
        C9845jd[] c9845jdArrMo48533m9 = abstractC9842dy.mo48533m9();
        C9845jd[] c9845jdArrMo48533m92 = abstractC9842dy2.mo48533m9();
        int i = 0;
        for (int i2 = 0; i2 < c9845jdArrMo48533m9.length; i2++) {
            int iM48553x1 = m48553x1(c9845jdArrMo48533m9[i2].m48561k4(), c9845jdArrMo48533m92[i2].m48561k4());
            if (iM48553x1 != 0 && i != 0 && i != iM48553x1) {
                throw new AmbiguousMatchException();
            }
            if (iM48553x1 != 0) {
                i = iM48553x1;
            }
        }
        if (i != 0) {
            return i > 0 ? abstractC9842dy2 : abstractC9842dy;
        }
        AbstractC14068j5 abstractC14068j5Mo48543to = abstractC9842dy.mo48543to();
        AbstractC14068j5 abstractC14068j5Mo48543to2 = abstractC9842dy2.mo48543to();
        if (abstractC14068j5Mo48543to != abstractC14068j5Mo48543to2) {
            if (!abstractC14068j5Mo48543to.m66749k4(abstractC14068j5Mo48543to2)) {
                if (!abstractC14068j5Mo48543to2.m66749k4(abstractC14068j5Mo48543to)) {
                }
            }
        }
        boolean z = (abstractC9842dy.mo48525ck() & 2) != 0;
        boolean z2 = (abstractC9842dy2.mo48525ck() & 2) != 0;
        if (!z || z2) {
            if (!z2 || z) {
                throw new AmbiguousMatchException();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC9842dy m48548k4(AbstractC9842dy[] abstractC9842dyArr, int i) {
        AbstractC9842dy abstractC9842dy = null;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int iM48545k4 = m48545k4(abstractC9842dyArr[i3].mo48543to());
            if (iM48545k4 == i2) {
                throw new AmbiguousMatchException("Ambiguous match found.");
            }
            if (iM48545k4 > i2) {
                abstractC9842dy = abstractC9842dyArr[i3];
                i2 = iM48545k4;
            }
        }
        return abstractC9842dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC9842dy m48549k4(AbstractC9842dy[] abstractC9842dyArr, AbstractC14068j5[] abstractC14068j5Arr, C9840ck[] c9840ckArr) {
        if (abstractC9842dyArr == null) {
            throw new ArgumentNullException("match");
        }
        AbstractC9842dy[] abstractC9842dyArr2 = new AbstractC9842dy[abstractC9842dyArr.length];
        int i = 0;
        for (int i2 = 0; i2 < abstractC9842dyArr.length; i2++) {
            C9845jd[] c9845jdArrMo48528h4 = abstractC9842dyArr[i2].mo48528h4();
            if (c9845jdArrMo48528h4.length != 0) {
                int i3 = 0;
                while (i3 < abstractC14068j5Arr.length && c9845jdArrMo48528h4[i3].m48561k4().m66751kk(abstractC14068j5Arr[i3])) {
                    i3++;
                }
                if (i3 >= abstractC14068j5Arr.length) {
                    abstractC9842dyArr2[i] = abstractC9842dyArr[i2];
                    i++;
                }
            }
        }
        if (i != 0) {
            return i != 1 ? m48548k4(abstractC9842dyArr2, i) : abstractC9842dyArr2[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m48550k4(AbstractC9842dy abstractC9842dy, AbstractC9842dy abstractC9842dy2) {
        C9845jd[] c9845jdArrMo48528h4 = abstractC9842dy.mo48528h4();
        C9845jd[] c9845jdArrMo48528h42 = abstractC9842dy2.mo48528h4();
        if (c9845jdArrMo48528h4.length != c9845jdArrMo48528h42.length) {
            return false;
        }
        int length = c9845jdArrMo48528h4.length;
        for (int i = 0; i < length; i++) {
            if (!c9845jdArrMo48528h4[i].m48561k4().m66751kk(c9845jdArrMo48528h42[i].m48561k4())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48551k4(AbstractC14068j5 abstractC14068j5, AbstractC14068j5 abstractC14068j52) {
        if (abstractC14068j5 == abstractC14068j52 || abstractC14068j5 == null) {
            return true;
        }
        if (abstractC14068j52.m66737ak() != abstractC14068j5.m66737ak()) {
            return false;
        }
        if (abstractC14068j52.m66740bv()) {
            return abstractC14068j52.m66761x1(abstractC14068j5);
        }
        if (abstractC14068j52.m66763yd() && abstractC14068j5 == (abstractC14068j52 = AbstractC14106wy.getUnderlyingType(abstractC14068j52))) {
            return true;
        }
        if (!abstractC14068j52.mo48625m9() || abstractC14068j52.m66754ts() != C7019kk.m27443k4((Class<?>) C14093tq.class) || abstractC14068j52.mo48613dy()[0] != abstractC14068j5) {
            int iM66733to = AbstractC14068j5.m66733to(abstractC14068j5);
            int iM66733to2 = AbstractC14068j5.m66733to(abstractC14068j52);
            switch (iM66733to) {
                case 3:
                    if (iM66733to2 == 3) {
                        return true;
                    }
                    break;
                case 4:
                    switch (iM66733to2) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            break;
                        default:
                            if (abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class)) {
                            }
                            break;
                    }
                    return true;
                case 5:
                    return iM66733to2 == 7 || iM66733to2 == 9 || iM66733to2 == 11 || iM66733to2 == 13 || iM66733to2 == 14 || abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class) || (abstractC14068j5.m66763yd() && abstractC14068j52 == C7019kk.m27443k4((Class<?>) AbstractC14106wy.class));
                case 6:
                    if (iM66733to2 != 4) {
                        switch (iM66733to2) {
                            default:
                                if (abstractC14068j52 != C7019kk.m27443k4((Class<?>) Object.class) && (!abstractC14068j5.m66763yd() || abstractC14068j52 != C7019kk.m27443k4((Class<?>) AbstractC14106wy.class))) {
                                    return false;
                                }
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                                return true;
                        }
                    }
                    return true;
                case 7:
                    return iM66733to2 == 9 || iM66733to2 == 11 || iM66733to2 == 13 || iM66733to2 == 14 || abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class) || (abstractC14068j5.m66763yd() && abstractC14068j52 == C7019kk.m27443k4((Class<?>) AbstractC14106wy.class));
                case 8:
                    switch (iM66733to2) {
                        default:
                            if (abstractC14068j52 != C7019kk.m27443k4((Class<?>) Object.class) && (!abstractC14068j5.m66763yd() || abstractC14068j52 != C7019kk.m27443k4((Class<?>) AbstractC14106wy.class))) {
                                return false;
                            }
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            return true;
                    }
                    break;
                case 9:
                    return iM66733to2 == 9 || iM66733to2 == 11 || iM66733to2 == 13 || iM66733to2 == 14 || abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class) || (abstractC14068j5.m66763yd() && abstractC14068j52 == C7019kk.m27443k4((Class<?>) AbstractC14106wy.class));
                case 10:
                    switch (iM66733to2) {
                        default:
                            if (abstractC14068j52 != C7019kk.m27443k4((Class<?>) Object.class) && (!abstractC14068j5.m66763yd() || abstractC14068j52 != C7019kk.m27443k4((Class<?>) AbstractC14106wy.class))) {
                                return false;
                            }
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                            return true;
                    }
                    break;
                case 11:
                case 12:
                    return iM66733to2 == 13 || iM66733to2 == 14 || abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class) || (abstractC14068j5.m66763yd() && abstractC14068j52 == C7019kk.m27443k4((Class<?>) AbstractC14106wy.class));
                case 13:
                    return iM66733to2 == 14 || abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class);
            }
            if (abstractC14068j52 == C7019kk.m27443k4((Class<?>) Object.class) && abstractC14068j5.m66758v4()) {
                return true;
            }
            if (abstractC14068j52.m66742dq() && abstractC14068j5 == C7019kk.m27443k4((Class<?>) C14112xw.class)) {
                return true;
            }
            return abstractC14068j52.m66761x1(abstractC14068j5);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m48552k4(AbstractC14068j5[] abstractC14068j5Arr, C9845jd[] c9845jdArr, boolean z) {
        for (int i = 0; i < abstractC14068j5Arr.length; i++) {
            boolean zM48551k4 = m48551k4(abstractC14068j5Arr[i], c9845jdArr[i].m48561k4());
            if (!zM48551k4 && z) {
                AbstractC14068j5 abstractC14068j5M48561k4 = c9845jdArr[i].m48561k4();
                if (abstractC14068j5M48561k4.m66737ak()) {
                    zM48551k4 = m48551k4(abstractC14068j5Arr[i], abstractC14068j5M48561k4.mo48611c5());
                }
            }
            if (!zM48551k4) {
                return false;
            }
        }
        return true;
    }
}
