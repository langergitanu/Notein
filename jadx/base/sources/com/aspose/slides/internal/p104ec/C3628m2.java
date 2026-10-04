package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.m2 */
/* JADX INFO: loaded from: classes3.dex */
public class C3628m2 {
    /* JADX INFO: renamed from: k4 */
    private static AbstractC3598bs m14770k4(byte[] bArr, int[] iArr) {
        int i = 0;
        int i2 = 0;
        for (int i3 = iArr[0] - 1; i3 >= 0; i3--) {
            int i4 = 0;
            int i5 = i3;
            for (int i6 = iArr[0]; i6 < bArr.length && C7019kk.m27462to(Byte.valueOf(bArr[i6]), 6) == C7019kk.m27462to(Byte.valueOf(bArr[i5]), 6); i6++) {
                i4++;
                i5++;
            }
            if (i4 > i) {
                i2 = i3;
                i = i4;
            }
        }
        if (i < 3) {
            C3648up c3648up = new C3648up();
            c3648up.m14813k4(bArr[iArr[0]]);
            iArr[0] = iArr[0] + 1;
            return c3648up;
        }
        C3607dy c3607dy = new C3607dy();
        int i7 = iArr[0];
        iArr[0] = iArr[0] + c3607dy.m14722k4(i, i7 - i2, i7);
        return c3607dy;
    }

    /* JADX INFO: renamed from: kk */
    private static List<C3601c5> m14774kk(byte[] bArr) {
        List<C3601c5> list = new List<>();
        int i = 0;
        while (i < bArr.length) {
            int length = i + 4096 >= bArr.length ? bArr.length - i : 4096;
            byte[] bArr2 = new byte[length];
            C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) bArr), i, AbstractC14092to.m67208k4((Object) bArr2), 0, length);
            list.addItem(new C3601c5(bArr2));
            i += length;
        }
        return list;
    }

    /* JADX INFO: renamed from: to */
    private static C3630m9 m14775to(byte[] bArr) {
        C3152yj c3152yj = new C3152yj(bArr);
        try {
            C3134k4 c3134k4 = new C3134k4(c3152yj);
            try {
                C3630m9 c3630m9 = new C3630m9();
                c3630m9.mo14692k4(c3134k4);
                return c3630m9;
            } finally {
                c3134k4.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m14776x1(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new ArgumentNullException();
        }
        C3630m9 c3630m9 = new C3630m9();
        c3630m9.m14781k4((byte) 1);
        List.Enumerator<C3601c5> it = m14774kk(bArr).iterator();
        while (it.hasNext()) {
            try {
                c3630m9.m14780k4().addItem(m14771k4(it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                c3630m9.mo14697k4(c3149x1);
                return c3152yj.toArray();
            } finally {
                c3149x1.dispose();
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C3643to m14771k4(C3601c5 c3601c5) {
        List<C3616he> list = new List<>();
        int i = 0;
        int i2 = 0;
        while (i < c3601c5.m14702k4().length) {
            C3616he c3616he = new C3616he();
            i2++;
            for (int i3 = 0; i3 < 8 && i < c3601c5.m14702k4().length; i3++) {
                int[] iArr = {i};
                AbstractC3598bs abstractC3598bsM14770k4 = m14770k4(c3601c5.m14702k4(), iArr);
                i = iArr[0];
                int i4 = i2 + 1;
                if (C7019kk.m27469x1(abstractC3598bsM14770k4, C3607dy.class)) {
                    c3616he.m14745k4((byte) (C7019kk.m27462to(Byte.valueOf(c3616he.m14744k4()), 6) | C7019kk.m27462to(Byte.valueOf((byte) (1 << i3)), 6)));
                    i2 += 2;
                } else {
                    i2 = i4;
                }
                c3616he.m14746x1().addItem(abstractC3598bsM14770k4);
            }
            list.addItem(c3616he);
        }
        C3643to c3643to = new C3643to();
        C3615h4 c3615h4 = new C3615h4();
        c3643to.m14802k4(c3615h4);
        c3615h4.m14741x1((byte) 1);
        c3615h4.m14738k4((byte) 3);
        c3615h4.m14739k4(C7019kk.m27435du(Integer.valueOf(i2 - 1), 9));
        C3606du c3606du = new C3606du(c3615h4.m14737k4(), true);
        c3643to.m14801k4(c3606du);
        c3606du.m14716k4(list);
        return c3643to;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m14772k4(C3630m9 c3630m9) {
        if (c3630m9.m14780k4().size() == 0) {
            throw new InvalidOperationException();
        }
        C3152yj c3152yj = new C3152yj();
        try {
            List.Enumerator<AbstractC3598bs> it = c3630m9.m14780k4().iterator();
            while (it.hasNext()) {
                try {
                    C3643to next = it.next();
                    c3152yj = new C3152yj();
                    try {
                        C3149x1 c3149x1 = new C3149x1(c3152yj);
                        try {
                            if (C7019kk.m27462to(Byte.valueOf(next.m14800k4().m14740x1()), 6) != 1) {
                                c3149x1.m13450k4(next.m14803x1().m14717k4());
                            } else {
                                if (next.m14803x1().m14718x1().size() == 0) {
                                    throw new InvalidOperationException();
                                }
                                List.Enumerator<C3616he> it2 = next.m14803x1().m14718x1().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        it = it2.next().m14746x1().iterator();
                                        while (it.hasNext()) {
                                            try {
                                                it.next().mo14695x1(c3149x1);
                                            } finally {
                                            }
                                        }
                                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                            it.dispose();
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                            c3149x1.dispose();
                            byte[] buffer = c3152yj.getBuffer();
                            c3152yj.write(buffer, 0, buffer.length);
                        } catch (Throwable th2) {
                            c3149x1.dispose();
                            throw th2;
                        }
                    } finally {
                        c3152yj.dispose();
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            return c3152yj.getBuffer();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m14773k4(byte[] bArr) {
        if (bArr != null) {
            return m14772k4(m14775to(bArr));
        }
        throw new ArgumentNullException();
    }
}
