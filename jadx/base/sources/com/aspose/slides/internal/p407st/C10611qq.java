package com.aspose.slides.internal.p407st;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C10611qq extends AbstractC10376bv {

    /* JADX INFO: renamed from: du */
    private static final int[] f37327du = {4026, 0, 4026, 1, 4026, 2, 12001, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: k4 */
    private C10626rv f37328k4;

    /* JADX INFO: renamed from: kk */
    private C10626rv f37329kk;

    /* JADX INFO: renamed from: to */
    private C10694wl f37330to;

    /* JADX INFO: renamed from: x1 */
    private C10626rv f37331x1;

    public C10611qq() {
        m51409um().m51917k4(12000);
        this.f37330to = new C10694wl();
    }

    /* JADX INFO: renamed from: du */
    public final String m51599du() {
        C10626rv c10626rv = this.f37329kk;
        return c10626rv != null ? c10626rv.m51659x1() : "";
    }

    /* JADX INFO: renamed from: h4 */
    public final C10694wl m51600h4() {
        return this.f37330to;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        C10626rv c10626rv = this.f37328k4;
        int iMo50440k4 = c10626rv != null ? c10626rv.mo50440k4() + 8 : 0;
        C10626rv c10626rv2 = this.f37331x1;
        if (c10626rv2 != null) {
            iMo50440k4 += c10626rv2.mo50440k4() + 8;
        }
        C10626rv c10626rv3 = this.f37329kk;
        if (c10626rv3 != null) {
            iMo50440k4 += c10626rv3.mo50440k4() + 8;
        }
        C10694wl c10694wl = this.f37330to;
        return c10694wl != null ? c10694wl.mo50440k4() + 8 + iMo50440k4 : iMo50440k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51602kk(String str) {
        if (C14113y2.m67411k4(str)) {
            this.f37329kk = null;
            return;
        }
        if (this.f37329kk == null) {
            this.f37329kk = new C10626rv("", (short) 2);
        }
        this.f37329kk.m51658k4(str);
    }

    /* JADX INFO: renamed from: to */
    public final String m51603to() {
        C10626rv c10626rv = this.f37331x1;
        return c10626rv != null ? c10626rv.m51659x1() : "";
    }

    /* JADX INFO: renamed from: x1 */
    public final String m51604x1() {
        C10626rv c10626rv = this.f37328k4;
        return c10626rv != null ? c10626rv.m51659x1() : "";
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition() + ((long) m51409um().m51914du());
        while (c3134k4.m13371ck().getPosition() < position) {
            AbstractC10571o4 abstractC10571o4M51431k4 = C10576og.m51431k4(c3134k4, this);
            if (C7019kk.m27469x1(abstractC10571o4M51431k4, C10626rv.class)) {
                short sM51922kk = abstractC10571o4M51431k4.m51409um().m51922kk();
                if (sM51922kk == 0) {
                    this.f37328k4 = (C10626rv) abstractC10571o4M51431k4;
                } else if (sM51922kk == 1) {
                    this.f37331x1 = (C10626rv) abstractC10571o4M51431k4;
                } else {
                    if (sM51922kk != 2) {
                        throw new Exception("Read Error! Unknown CString record in Comment10Container.");
                    }
                    this.f37329kk = (C10626rv) abstractC10571o4M51431k4;
                }
            } else {
                if (!C7019kk.m27469x1(abstractC10571o4M51431k4, C10694wl.class)) {
                    throw new Exception("Read Error! Unknown record in Comment10Container.");
                }
                this.f37330to = (C10694wl) abstractC10571o4M51431k4;
            }
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37327du;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51605x1(String str) {
        if (C14113y2.m67411k4(str)) {
            this.f37331x1 = null;
            return;
        }
        if (this.f37331x1 == null) {
            this.f37331x1 = new C10626rv("", (short) 1);
        }
        this.f37331x1.m51658k4(str);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        C10626rv c10626rv = this.f37328k4;
        if (c10626rv != null) {
            c10626rv.m51412x1(c3149x1);
        }
        C10626rv c10626rv2 = this.f37331x1;
        if (c10626rv2 != null) {
            c10626rv2.m51412x1(c3149x1);
        }
        C10626rv c10626rv3 = this.f37329kk;
        if (c10626rv3 != null) {
            c10626rv3.m51412x1(c3149x1);
        }
        C10694wl c10694wl = this.f37330to;
        if (c10694wl == null) {
            throw new Exception("Write Error! Comment10Container haven't Comment10Atom.");
        }
        c10694wl.m51412x1(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51601k4(String str) {
        if (C14113y2.m67411k4(str)) {
            this.f37328k4 = null;
            return;
        }
        if (this.f37328k4 == null) {
            this.f37328k4 = new C10626rv("", (short) 0);
        }
        this.f37328k4.m51658k4(str);
    }
}
