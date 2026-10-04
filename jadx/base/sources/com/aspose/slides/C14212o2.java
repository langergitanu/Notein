package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p407st.C10389ck;
import com.aspose.slides.internal.p407st.C10407dq;
import com.aspose.slides.internal.p407st.C10435fa;
import com.aspose.slides.internal.p407st.C10559ne;
import com.aspose.slides.internal.p407st.C10625ru;
import com.aspose.slides.internal.p407st.C10653tp;
import com.aspose.slides.internal.p407st.C10708x6;
import com.aspose.slides.internal.p407st.C10714xk;

/* JADX INFO: renamed from: com.aspose.slides.o2 */
/* JADX INFO: loaded from: classes3.dex */
class C14212o2 {
    /* JADX INFO: renamed from: k4 */
    private static long m68318k4(int i) {
        if (i == 2) {
            return 1L;
        }
        if (i != 3) {
            return i != 4 ? 0L : 3L;
        }
        return 2L;
    }

    /* JADX INFO: renamed from: kk */
    private static long m68322kk(int i) {
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i != 4) {
            return i != 5 ? 0L : 4L;
        }
        return 3L;
    }

    /* JADX INFO: renamed from: x1 */
    private static long m68323x1(int i) {
        switch (i) {
            case 2:
                return 1L;
            case 3:
                return 2L;
            case 4:
                return 3L;
            case 5:
                return 4L;
            case 6:
                return 5L;
            case 7:
                return 6L;
            case 8:
                return 7L;
            case 9:
                return 8L;
            case 10:
                return 9L;
            case 11:
                return 10L;
            case 12:
                return 11L;
            case 13:
                return 12L;
            case 14:
                return 13L;
            case 15:
                return 14L;
            case 16:
                return 15L;
            case 17:
                return 16L;
            default:
                return 0L;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68319k4(com.aspose.slides.internal.p332p7.c9d c9dVar, C10435fa c10435fa, long[] jArr, gi8 gi8Var) {
        if (c9dVar == null) {
            return;
        }
        if (c9dVar.m29492k4() == null || fut.m6327k4(c9dVar.m29492k4(), gi8Var)) {
            if (c10435fa == null) {
                throw new InvalidOperationException();
            }
            C10625ru c10625ru = new C10625ru();
            c10435fa.m50513yj().addItem(c10625ru);
            C10389ck c10389ck = new C10389ck();
            c10625ru.m50513yj().addItem(c10389ck);
            c10389ck.m50560x1(c9dVar.m29501x1());
            c10389ck.m50555k4(1L);
            if (c9dVar.m29492k4() != null) {
                c10389ck.m50557kk(fut.m6329x1(c9dVar.m29492k4(), gi8Var));
            }
            c10389ck.m50554k4((byte) 1);
            c10389ck.m50559x1((byte) (c9dVar.m29498kk() ? 1 : 0));
            C10653tp c10653tp = new C10653tp();
            c10625ru.m50513yj().addItem(c10653tp);
            c10653tp.m51409um().m51916k4((byte) 1);
            c10653tp.m51766k4(c9dVar.m29500to() != 0 ? m68318k4(c9dVar.m29500to()) : 0L);
            c10653tp.m51773x1(c9dVar.m29489du());
            c10653tp.m51765k4((byte) (!c9dVar.m29491h4() ? 1 : 0));
            c10653tp.m51772x1(c9dVar.m29490dy() ? (byte) 1 : (byte) 0);
            c10653tp.m51768kk((byte) (!c9dVar.m29499m9() ? 1 : 0));
            c10653tp.m51770to((byte) 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68320k4(com.aspose.slides.internal.p332p7.ljk ljkVar, C10435fa c10435fa, gi8 gi8Var) {
        if (ljkVar == null) {
            return;
        }
        if (ljkVar.m36184k4() == null || fut.m6327k4(ljkVar.m36184k4(), gi8Var)) {
            if (c10435fa == null) {
                throw new InvalidOperationException();
            }
            C10559ne c10559ne = new C10559ne();
            c10435fa.m50513yj().addItem(c10559ne);
            C10389ck c10389ck = new C10389ck();
            c10559ne.m50513yj().addItem(c10389ck);
            c10389ck.m50555k4(2L);
            c10389ck.m50554k4((byte) 1);
            if (ljkVar.m36184k4() != null) {
                c10389ck.m50557kk(fut.m6329x1(ljkVar.m36184k4(), gi8Var));
            }
            C10708x6 c10708x6 = new C10708x6();
            c10559ne.m50513yj().addItem(c10708x6);
            c10708x6.m51970k4(m68322kk(ljkVar.m36187x1()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68321k4(com.aspose.slides.internal.p332p7.lkb lkbVar, C10435fa c10435fa, gi8 gi8Var) {
        if (lkbVar == null) {
            return;
        }
        if (lkbVar.m36213k4() == null || fut.m6327k4(lkbVar.m36213k4(), gi8Var)) {
            if (c10435fa == null) {
                throw new InvalidOperationException();
            }
            C10714xk c10714xk = new C10714xk();
            c10435fa.m50513yj().addItem(c10714xk);
            C10389ck c10389ck = new C10389ck();
            c10714xk.m50513yj().addItem(c10389ck);
            c10389ck.m50555k4(3L);
            c10389ck.m50554k4((byte) 1);
            if (lkbVar.m36213k4() != null) {
                c10389ck.m50557kk(fut.m6329x1(lkbVar.m36213k4(), gi8Var));
            }
            C10407dq c10407dq = new C10407dq();
            c10714xk.m50513yj().addItem(c10407dq);
            c10407dq.m50698k4(m68323x1(lkbVar.m36216x1()));
        }
    }
}
