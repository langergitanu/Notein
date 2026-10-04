package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.huawei.hms.support.sms.common.ReadSmsConstant;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.tx */
/* JADX INFO: loaded from: classes4.dex */
public class C10659tx extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f37419k4 = {4026, 0, 4026, 1, 4026, 2, 4026, 3, 2023, Integer.MAX_VALUE};

    public C10659tx() {
        m51409um().m51917k4(ReadSmsConstant.FAIL);
        m50513yj().addItem(new C10626rv("", (short) 0));
        m50513yj().addItem(new C10626rv(".WAV", (short) 1));
        m50513yj().addItem(new C10626rv("0", (short) 2));
        m50513yj().addItem(new C10737yq());
    }

    /* JADX INFO: renamed from: du */
    public final C10626rv m51783du() {
        return m50511x1((short) 2);
    }

    /* JADX INFO: renamed from: h4 */
    public final C10737yq m51784h4() {
        return (C10737yq) m50508kk(2023);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51785k4(int i) {
        C10626rv c10626rvM51783du = m51783du();
        if (c10626rvM51783du != null) {
            c10626rvM51783du.m51658k4(C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk()));
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37419k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m51786m9() {
        C10626rv c10626rvM51783du = m51783du();
        if (c10626rvM51783du == null) {
            return 0;
        }
        try {
            return C14057f9.m66582k4(c10626rvM51783du.m51659x1());
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: to */
    public final C10626rv m51787to() {
        return m50511x1((short) 1);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10626rv m51788x1() {
        return m50511x1((short) 0);
    }

    public C10659tx(int i) {
        m51409um().m51917k4(ReadSmsConstant.FAIL);
    }
}
