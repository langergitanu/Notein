package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.s7 */
/* JADX INFO: loaded from: classes4.dex */
public class C10631s7 extends AbstractC10376bv {

    /* JADX INFO: renamed from: x1 */
    private static final int[] f37363x1 = {61440, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: k4 */
    private C10459h0 f37364k4 = null;

    public C10631s7() {
        m51409um().m51916k4((byte) 15);
        m51409um().m51920k4((short) 0);
        m51409um().m51917k4(EditingLanguage.FINNISH);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int iM66997m9 = C14080ne.m66997m9(Long.valueOf(c3134k4.m13371ck().getPosition() + ((long) m51409um().m51914du())));
        C10459h0 c10459h0 = (C10459h0) C7019kk.m27452k4((Object) C10576og.m51429k4(c3134k4), C10459h0.class);
        m50513yj().addItem(c10459h0);
        if (c10459h0 == null) {
            throw new Exception("First Escher record is not DggContainer.");
        }
        if (c3134k4.m13371ck().getPosition() < iM66997m9) {
            throw new Exception("Probably DrawingGroupContainer contains more DggContainer records.");
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37363x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10459h0 m51672x1() {
        C10459h0 c10459h0 = this.f37364k4;
        if (c10459h0 != null) {
            return c10459h0;
        }
        C10459h0 c10459h02 = (C10459h0) m50508kk(61440);
        this.f37364k4 = c10459h02;
        if (c10459h02 == null && m50505fa()) {
            C10459h0 c10459h03 = new C10459h0();
            this.f37364k4 = c10459h03;
            c10459h03.m50512x1(true);
            m50513yj().addItem(this.f37364k4);
        }
        return this.f37364k4;
    }
}
