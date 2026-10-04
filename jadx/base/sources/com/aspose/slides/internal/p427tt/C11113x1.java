package com.aspose.slides.internal.p427tt;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p244l7.C6012x1;
import com.aspose.slides.internal.p274mh.C6386to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.AbstractC9784rv;
import com.aspose.slides.internal.p353q7.C9758b3;
import com.aspose.slides.internal.p353q7.C9762c6;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p353q7.C9793up;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12022v4;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.tt.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11113x1 {

    /* JADX INFO: renamed from: k4 */
    private static final C6386to f38448k4 = new C6386to();

    /* JADX INFO: renamed from: x1 */
    private static final Dictionary<String, C6386to> f38450x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final List<String> f38449kk = new List<>();

    /* JADX INFO: renamed from: k4 */
    public static C9790ts m53655k4(C6012x1.k4 k4Var) {
        return C11111kk.m53646k4(k4Var);
    }

    /* JADX INFO: renamed from: kk */
    public static int m53660kk(C6012x1.k4 k4Var) {
        int i = (k4Var.f17013h4 & 255) != 0 ? 2 : 0;
        if ((k4Var.f17011dy & 255) != 0) {
            i |= 8;
        }
        if ((k4Var.f17017m9 & 255) != 0) {
            i |= 4;
        }
        return k4Var.f17010du >= 600 ? i | 1 : i;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12013m9 m53661x1(C6012x1.k4 k4Var) {
        C12004dy c12004dyM56523kk;
        float fM67482k4;
        int iM53660kk = m53660kk(k4Var);
        C9790ts c9790tsM53646k4 = C11111kk.m53646k4(k4Var);
        if (c9790tsM53646k4 == null) {
            throw new NullReferenceException();
        }
        try {
            c12004dyM56523kk = m53656k4(c9790tsM53646k4);
        } catch (ArgumentException unused) {
            c12004dyM56523kk = null;
        }
        if (c12004dyM56523kk == null) {
            c12004dyM56523kk = C12004dy.m56523kk();
        }
        int i = k4Var.f17015k4;
        if (i > 0) {
            c12004dyM56523kk.m56535to(iM53660kk);
            c12004dyM56523kk.m56526du(iM53660kk);
            fM67482k4 = (i * c9790tsM53646k4.m48175c5()) / c9790tsM53646k4.m48234up();
        } else {
            fM67482k4 = i < 0 ? C14116yg.m67482k4(i) : 16.0f;
        }
        return c12004dyM56523kk.m56529h4(iM53660kk) ? new C12013m9(c12004dyM56523kk, fM67482k4, iM53660kk, 0, k4Var.f17008c5) : new C12013m9(c12004dyM56523kk.m56527du(), fM67482k4, iM53660kk, 0, k4Var.f17008c5);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12004dy m53656k4(C9790ts c9790ts) {
        String strM67368h4 = C14113y2.m67368h4(c9790ts.m48228to());
        C6386to[] c6386toArr = {null};
        Dictionary<String, C6386to> dictionary = f38450x1;
        boolean zTryGetValue = dictionary.tryGetValue(c9790ts.m48187h4(), c6386toArr);
        C6386to c6386to = c6386toArr[0];
        if (!zTryGetValue) {
            c6386to = f38448k4;
        }
        if (!f38449kk.containsItem(strM67368h4) && c9790ts.m48233um().mo47983kk()) {
            AbstractC9784rv abstractC9784rvM48233um = c9790ts.m48233um();
            C9793up c9793up = (C9793up) C7019kk.m27452k4((Object) abstractC9784rvM48233um, C9793up.class);
            if (c9793up == null) {
                C9758b3 c9758b3 = (C9758b3) C7019kk.m27452k4((Object) abstractC9784rvM48233um, C9758b3.class);
                if (c9758b3 != null) {
                    byte[] bArrM47982k4 = c9758b3.m47982k4();
                    C14112xw c14112xwM15613k4 = C3914k4.m15613k4(bArrM47982k4.length);
                    C3914k4.m15621k4(bArrM47982k4, 0, c14112xwM15613k4, bArrM47982k4.length);
                    c6386to.m26218k4(c14112xwM15613k4, bArrM47982k4.length);
                    C3914k4.m15615k4(c14112xwM15613k4);
                }
            } else {
                c6386toArr[0] = c6386to;
                boolean zTryGetValue2 = dictionary.tryGetValue(c9793up.m48254k4(), c6386toArr);
                c6386to = c6386toArr[0];
                if (!zTryGetValue2) {
                    c6386to = new C6386to();
                    try {
                        c6386to.m26219kk(c9793up.m48254k4());
                        dictionary.addItem(c9793up.m48254k4(), c6386to);
                    } catch (FileNotFoundException unused) {
                        if (C3131h4.m13361kk(c9793up.m48254k4())) {
                            C3130fa c3130faM13363to = C3131h4.m13363to(c9793up.m48254k4());
                            try {
                                int length = (int) c3130faM13363to.getLength();
                                byte[] bArr = new byte[length];
                                c3130faM13363to.read(bArr, 0, length);
                                c3130faM13363to.close();
                                c3130faM13363to.dispose();
                                if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4))) {
                                    byte[] bArrM54219k4 = C11240k4.m54219k4(bArr);
                                    try {
                                        AbstractC4786k4 abstractC4786k4M19846k4 = AbstractC4786k4.m19846k4(bArrM54219k4);
                                        c6386to.m26218k4(abstractC4786k4M19846k4.m19848du(), bArrM54219k4.length);
                                        abstractC4786k4M19846k4.m19849h4();
                                        f38450x1.addItem(c9793up.m48254k4(), c6386to);
                                    } catch (FileNotFoundException unused2) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (c3130faM13363to != null) {
                                    c3130faM13363to.dispose();
                                }
                                throw th;
                            }
                        }
                    }
                }
            }
            f38449kk.addItem(strM67368h4);
        }
        if (c6386to.m26211k4().length > 0) {
            for (C12004dy c12004dy : c6386to.m26211k4()) {
                if (C14113y2.m67363du(c12004dy.m56527du(), c9790ts.m48202k4())) {
                    return c12004dy;
                }
            }
        }
        return new C12004dy(c9790ts.m48202k4(), c6386to);
    }

    /* JADX INFO: renamed from: x1 */
    public static C12013m9 m53662x1(String str, float f, int i, int i2) {
        C9790ts c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(str, i);
        C12004dy c12004dyM53656k4 = null;
        if (c9790tsMo48031k4 == null) {
            c9790tsMo48031k4 = C9762c6.m48021k4().m48025k4(str, i, (String) null);
        }
        try {
            c12004dyM53656k4 = m53656k4(c9790tsMo48031k4);
        } catch (ArgumentException unused) {
        }
        return c12004dyM53656k4 != null ? c12004dyM53656k4.m56529h4(i) ? new C12013m9(c12004dyM53656k4, f, i, i2) : new C12013m9(c12004dyM53656k4.m56527du(), f, i, i2) : new C12013m9(C12022v4.m56852x1().m56651x1(), (f / 96.0f) * 72.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m53657k4(String str, float f, int i) {
        return m53658k4(str, f, i, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m53658k4(String str, float f, int i, int i2) {
        C12004dy c12004dyM53656k4;
        C9790ts c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(str, i);
        if (c9790tsMo48031k4 == null) {
            throw new NullReferenceException();
        }
        try {
            c12004dyM53656k4 = m53656k4(c9790tsMo48031k4);
        } catch (ArgumentException unused) {
            c12004dyM53656k4 = null;
        }
        return c12004dyM53656k4 != null ? c12004dyM53656k4.m56529h4(i) ? new C12013m9(c12004dyM53656k4, f, i, i2) : new C12013m9(c12004dyM53656k4.m56527du(), f, i, i2) : new C12013m9(C12022v4.m56852x1().m56651x1(), (f / 96.0f) * 72.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m53659k4() {
        f38450x1.clear();
        f38449kk.clear();
    }
}
