package com.aspose.slides.internal.p407st;

import androidx.core.view.PointerIconCompat;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.e0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10414e0 extends AbstractC10376bv {

    /* JADX INFO: renamed from: x1 */
    private static final int[] f36953x1 = {5000, Integer.MAX_VALUE, EditingLanguage.NORWEGIAN_BOKMAL, 1, EditingLanguage.DUTCH_NETHERLANDS, 1, EditingLanguage.GERMAN_GERMANY, 1, PointerIconCompat.TYPE_ZOOM_IN, 0, PointerIconCompat.TYPE_ZOOM_IN, 1, EditingLanguage.GREEK, 1, 1023, 1};

    /* JADX INFO: renamed from: k4 */
    private C10608qm f36954k4;

    public C10414e0() {
        m51409um().m51917k4(2000);
    }

    /* JADX INFO: renamed from: c5 */
    public final C10648tf m50716c5() {
        return (C10648tf) m50506k4(PointerIconCompat.TYPE_ZOOM_IN, (short) 1);
    }

    /* JADX INFO: renamed from: ck */
    public final C10415e2 m50717ck() {
        return (C10415e2) m50508kk(1023);
    }

    /* JADX INFO: renamed from: du */
    public final C10448g9 m50718du() {
        return (C10448g9) m50508kk(EditingLanguage.NORWEGIAN_BOKMAL);
    }

    /* JADX INFO: renamed from: dy */
    public final C10648tf m50719dy() {
        return (C10648tf) m50506k4(PointerIconCompat.TYPE_ZOOM_IN, (short) 0);
    }

    /* JADX INFO: renamed from: h4 */
    public final C10702x0 m50720h4() {
        return (C10702x0) m50508kk(EditingLanguage.DUTCH_NETHERLANDS);
    }

    /* JADX INFO: renamed from: jd */
    public final C10585p6 m50721jd() {
        return (C10585p6) m50508kk(EditingLanguage.GREEK);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f36953x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10425en m50722m9() {
        return (C10425en) m50508kk(EditingLanguage.GERMAN_GERMANY);
    }

    /* JADX INFO: renamed from: to */
    public final C10608qm m50723to() {
        C10608qm c10608qm = this.f36954k4;
        if (c10608qm != null) {
            return c10608qm;
        }
        C10608qm c10608qm2 = (C10608qm) m50508kk(5000);
        this.f36954k4 = c10608qm2;
        if (c10608qm2 == null && m50505fa()) {
            C10608qm c10608qm3 = new C10608qm();
            this.f36954k4 = c10608qm3;
            c10608qm3.m50512x1(true);
            m50507k4(this.f36954k4);
        }
        return this.f36954k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50724x1() {
        C10448g9 c10448g9 = new C10448g9();
        c10448g9.m50826x1();
        c10448g9.m51409um().m51916k4((byte) 15);
        c10448g9.m51409um().m51920k4((short) 1);
        m50513yj().addItem(c10448g9);
        C10648tf c10648tf = new C10648tf();
        c10648tf.m51744x1();
        c10648tf.m51409um().m51916k4((byte) 15);
        c10648tf.m51409um().m51920k4((short) 0);
        m50513yj().addItem(c10648tf);
        C10648tf c10648tf2 = new C10648tf();
        c10648tf2.m51744x1();
        c10648tf2.m51409um().m51916k4((byte) 15);
        c10648tf2.m51409um().m51920k4((short) 1);
        m50513yj().addItem(c10648tf2);
        C10702x0 c10702x0 = new C10702x0();
        c10702x0.m51964x1();
        c10702x0.m51409um().m51916k4((byte) 15);
        c10702x0.m51409um().m51920k4((short) 1);
        m50513yj().addItem(c10702x0);
        C10415e2 c10415e2 = new C10415e2();
        c10415e2.m50726x1();
        c10415e2.m51409um().m51920k4((short) 1);
        m50513yj().addItem(c10415e2);
        C10608qm c10608qm = new C10608qm();
        c10608qm.m50857k4(0);
        c10608qm.m51409um().m51916k4((byte) 15);
        c10608qm.m51409um().m51920k4((short) 0);
        m50513yj().addItem(c10608qm);
    }
}
