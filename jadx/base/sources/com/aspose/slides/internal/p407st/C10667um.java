package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.um */
/* JADX INFO: loaded from: classes4.dex */
public class C10667um extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f37424k4 = {4026, 0, 12005, Integer.MAX_VALUE};

    public C10667um() {
        m51409um().m51917k4(12004);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m51806k4(short s) {
        for (int i = 0; i < m50513yj().size(); i++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i), C10626rv.class) && ((C10626rv) m50513yj().get_Item(i)).m51409um().m51922kk() == s) {
                return ((C10626rv) m50513yj().get_Item(i)).m51659x1();
            }
        }
        return "";
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37424k4;
    }

    /* JADX INFO: renamed from: to */
    public final C10360ar m51807to() {
        return (C10360ar) C7019kk.m27452k4((Object) m50508kk(12005), C10360ar.class);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m51808x1() {
        return m51806k4((short) 0);
    }
}
