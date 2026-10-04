package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.ku */
/* JADX INFO: loaded from: classes3.dex */
class C13748ku {

    /* JADX INFO: renamed from: k4 */
    private C12380dy f45870k4;

    /* JADX INFO: renamed from: kk */
    private final t5f f45871kk;

    /* JADX INFO: renamed from: to */
    private final C13809lt f45872to = new C13809lt();

    /* JADX INFO: renamed from: x1 */
    private C12380dy f45873x1;

    public C13748ku(t5f t5fVar) {
        if (t5fVar == null) {
            throw new ArgumentNullException();
        }
        this.f45871kk = t5fVar;
        if (t5fVar.m70966x1()) {
            this.f45870k4 = new C12380dy(C14113y2.m67402k4("{0}(.*?){1}", "<p:graphicFrame>", "</p:graphicFrame>"));
            this.f45873x1 = new C12380dy(C14113y2.m67402k4("{0}(.*?){1}", "<p:sp>", "</p:sp>"));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C6765kp m64169x1(String str) {
        return m64165k4(pe5.f48045to, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6765kp m64171k4(byte b, String str) {
        switch (b) {
            case 0:
                throw new InvalidOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return m64166k4(str);
            case 6:
                return m64169x1(str);
            default:
                throw new ArgumentOutOfRangeException("contentType", C14042ak.m66410k4(ezp.class, b), null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C6765kp m64165k4(C12380dy c12380dy, String str) {
        C6765kp c6765kp = new C6765kp();
        C12385to c12385toM57989x1 = this.f45873x1.m57989x1(str);
        C12385to c12385toM57989x12 = this.f45870k4.m57989x1(str);
        while (true) {
            if (!c12385toM57989x1.mo58006to() && !c12385toM57989x12.mo58006to()) {
                if (c6765kp.m26807x1() == 0) {
                    return null;
                }
                return c6765kp;
            }
            if (c12385toM57989x1.mo58006to()) {
                c6765kp.m26792k4(m64170x1(c12380dy, OooOo.OooO00o(c12385toM57989x1, 1)));
                c12385toM57989x1 = c12385toM57989x1.m58005h4();
            } else {
                if (!c12385toM57989x12.mo58006to()) {
                    throw new InvalidOperationException();
                }
                c6765kp.m26792k4(m64170x1(c12380dy, OooOo.OooO00o(c12385toM57989x12, 1)));
                c12385toM57989x12 = c12385toM57989x12.m58005h4();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private String m64170x1(C12380dy c12380dy, String str) {
        C12385to c12385toM57989x1 = c12380dy.m57989x1(str);
        if (!c12385toM57989x1.mo58006to()) {
            return null;
        }
        C6765kp c6765kp = new C6765kp();
        while (c12385toM57989x1.mo58006to()) {
            c6765kp.m26792k4(c12385toM57989x1.m58004du().m58000k4(1).mo57995kk());
            c12385toM57989x1 = c12385toM57989x1.m58005h4();
        }
        return C3038bv.m12790k4(c6765kp.toString());
    }

    /* JADX INFO: renamed from: k4 */
    private C6765kp m64166k4(String str) {
        return m64165k4(pe5.f48043kk, str);
    }

    /* JADX INFO: renamed from: k4 */
    private vbz m64167k4(byte b, String str, boolean z) {
        if (b != 0) {
            return (z && (b == 3 || b == 4)) ? this.f45872to.m64584k4(str, true) : this.f45872to.m64583k4(str);
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64172k4(byte b, vbz vbzVar, gwj gwjVar, C0813bd c0813bd) {
        switch (b) {
            case 1:
                gwjVar.m6930k4(c0813bd.m4146k4(), b, vbzVar);
                return;
            case 2:
                c0813bd.m4148x1().m64829k4(c0813bd.m4146k4(), vbzVar.m72172k4());
                return;
            case 3:
                c0813bd.m4148x1().m64838x1(c0813bd.m4146k4(), new kup(vbzVar));
                return;
            case 4:
                c0813bd.m4148x1().m64830k4(c0813bd.m4146k4(), new kup(vbzVar));
                return;
            case 5:
                c0813bd.m4148x1().m64832kk(c0813bd.m4146k4(), vbzVar.m72172k4());
                return;
            case 6:
                c0813bd.m4148x1().m64837x1(c0813bd.m4146k4(), vbzVar.m72172k4());
                return;
            default:
                throw new ArgumentOutOfRangeException(C18437z2.f56754h, C14042ak.m66410k4(ezp.class, b));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m64168k4(byte b, String str, gwj gwjVar, C0813bd c0813bd) {
        m64172k4(b, new vbz(), gwjVar, c0813bd);
        if (b == 3 || b == 4 || b == 1) {
            List<jrz> listM72182k4 = C14673vd.m72182k4(str);
            if (b == 1) {
                gwjVar.m6931k4(c0813bd.m4146k4(), listM72182k4);
            } else if (b == 3) {
                c0813bd.m4148x1().m64828k4(c0813bd.m4146k4(), listM72182k4);
            } else {
                if (b != 4) {
                    return;
                }
                c0813bd.m4148x1().m64836x1(c0813bd.m4146k4(), listM72182k4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64173k4(byte b, String str, gwj gwjVar, C0813bd c0813bd, boolean z) {
        this.f45872to.m64585k4(!z);
        if (z) {
            m64168k4(b, str, gwjVar, c0813bd);
            return;
        }
        vbz vbzVarM64167k4 = m64167k4(b, str, true);
        if (vbzVarM64167k4 != null) {
            m64172k4(b, vbzVarM64167k4, gwjVar, c0813bd);
        }
    }
}
