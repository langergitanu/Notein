package com.aspose.slides.internal.p024al;

import android.util.SparseIntArray;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p066cl.AbstractC2621dy;
import com.aspose.slides.internal.p066cl.InterfaceC2624k4;
import com.aspose.slides.internal.p066cl.InterfaceC2626m9;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p162h8.C4511k4;
import com.aspose.slides.internal.p245la.C6015h4;
import com.aspose.slides.internal.p245la.InterfaceC6018m9;
import com.aspose.slides.internal.p402sn.C10242k4;
import com.aspose.slides.internal.p470w5.C11887kk;
import com.aspose.slides.internal.p470w5.C11888to;
import com.aspose.slides.internal.p490x2.C12370dy;
import com.aspose.slides.internal.p490x2.C12372k4;
import com.aspose.slides.internal.p550zi.C13618wy;
import java.io.IOException;

/* JADX INFO: renamed from: com.aspose.slides.internal.al.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1392kk extends AbstractC2621dy {

    /* JADX INFO: renamed from: du */
    private int f6033du;

    /* JADX INFO: renamed from: h4 */
    private SparseIntArray f6034h4;

    /* JADX INFO: renamed from: m9 */
    private C1394x1 f6036m9;

    /* JADX INFO: renamed from: to */
    private List<C11887kk> f6037to;

    /* JADX INFO: renamed from: x1 */
    private boolean f6038x1 = false;

    /* JADX INFO: renamed from: kk */
    private C6015h4 f6035kk = null;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.SparseIntArray, com.alipay.share.sdk.openapi.BaseReq] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
          (r0v1 ?? I:com.alipay.share.sdk.openapi.BaseReq) from 0x0014: INVOKE (r0v1 ?? I:com.alipay.share.sdk.openapi.BaseReq) DIRECT call: com.alipay.share.sdk.openapi.BaseReq.checkArgs():boolean A[MD:():boolean (m)]
          (r0v1 ?? I:android.util.SparseIntArray) from 0x0017: IPUT (r0v1 ?? I:android.util.SparseIntArray), (r3v0 'this' com.aspose.slides.internal.al.kk A[IMMUTABLE_TYPE, THIS]) com.aspose.slides.internal.al.kk.h4 android.util.SparseIntArray
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public C1392kk() {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f6038x1 = r0
            r1 = 0
            r3.f6035kk = r1
            com.aspose.slides.Collections.Generic.List r2 = new com.aspose.slides.Collections.Generic.List
            r2.<init>()
            r3.f6037to = r2
            r3.f6033du = r0
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.checkArgs()
            r3.f6034h4 = r0
            r3.f6036m9 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.slides.internal.p024al.C1392kk.<init>():void");
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: k4 */
    public int mo8278k4(boolean z) throws IOException {
        m8284x1();
        return this.f6033du;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: x1 */
    public InterfaceC2626m9 mo8280x1(int i) {
        m8284x1();
        m8282k4(i, true);
        return new C4511k4(this.f6035kk, this.f6037to.get_Item(i), Integer.valueOf(this.f6034h4.get(i)));
    }

    /* JADX INFO: renamed from: x1 */
    private void m8284x1() {
        if (this.f6038x1) {
            return;
        }
        AbstractC3150x6 abstractC3150x6 = this.f8432k4;
        if (abstractC3150x6 == null) {
            throw new IllegalArgumentException("input object was not set");
        }
        C6015h4 c6015h4 = (C6015h4) new C10242k4().m50152k4(new C13618wy(abstractC3150x6), null);
        this.f6035kk = c6015h4;
        InterfaceC6018m9[] interfaceC6018m9ArrM24304ks = c6015h4.m24304ks();
        if (m8283k4(interfaceC6018m9ArrM24304ks) && interfaceC6018m9ArrM24304ks.length > 1) {
            this.f6035kk.m24305qq();
            this.f6035kk.m24302k4(new C11888to());
            C6015h4 c6015h42 = this.f6035kk;
            c6015h42.m24302k4((InterfaceC6018m9) m8281k4(c6015h42, interfaceC6018m9ArrM24304ks));
        }
        for (InterfaceC6018m9 interfaceC6018m9 : this.f6035kk.m24304ks()) {
            if (interfaceC6018m9 instanceof C11887kk) {
                this.f6037to.addItem((C11887kk) interfaceC6018m9);
                this.f6033du++;
            } else if (interfaceC6018m9 instanceof C11888to) {
                C11888to c11888to = (C11888to) interfaceC6018m9;
                if (c11888to.m55498x1()) {
                    this.f6034h4.put(this.f6033du, c11888to.m55497k4() & 255);
                }
            }
        }
        this.f6036m9 = new C1394x1(this.f6035kk, this.f6037to);
        this.f6038x1 = true;
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: k4 */
    public InterfaceC2624k4 mo8279k4(int i) throws IOException {
        m8284x1();
        m8282k4(i, true);
        if (i >= this.f6033du) {
            return null;
        }
        C1394x1 c1394x1 = this.f6036m9;
        return i == 0 ? C12372k4.m57957k4(c1394x1.mo8291k4(i)) : C12370dy.m57951k4(c1394x1, i);
    }

    /* JADX INFO: renamed from: k4 */
    private C11887kk m8281k4(C6015h4 c6015h4, InterfaceC6018m9[] interfaceC6018m9Arr) {
        C11887kk c11887kk = new C11887kk(c6015h4.mo10012up(), c6015h4.mo10009jd());
        int[] iArr = new int[c6015h4.mo10009jd() * c6015h4.mo10012up()];
        for (InterfaceC6018m9 interfaceC6018m9 : interfaceC6018m9Arr) {
            if (interfaceC6018m9 instanceof C11887kk) {
                C11887kk c11887kk2 = (C11887kk) interfaceC6018m9;
                int[] iArrM62811kk = c11887kk2.m62811kk(c11887kk2.m62756dy());
                int iM55494um = c11887kk2.m55494um();
                int iMo10009jd = c11887kk2.mo10009jd() + iM55494um;
                int iM55491ar = c11887kk2.m55491ar();
                int iMo10012up = c11887kk2.mo10012up() + iM55491ar;
                int iMo10012up2 = (c11887kk.mo10012up() * iM55494um) + iM55491ar;
                int iMo10012up3 = 0;
                while (iM55494um < iMo10009jd) {
                    System.arraycopy(iArrM62811kk, iMo10012up3, iArr, iMo10012up2, c11887kk2.mo10012up());
                    iMo10012up3 += c11887kk2.mo10012up();
                    iMo10012up2 = (c11887kk.mo10012up() - iMo10012up) + iM55491ar + c11887kk2.mo10012up() + iMo10012up2;
                    iM55494um++;
                }
            }
        }
        c11887kk.m62816x1(c11887kk.m62756dy(), iArr);
        return c11887kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8282k4(int i, boolean z) {
        if (i < 0 || (i > this.f6033du - 1 && !z)) {
            throw new IndexOutOfBoundsException("imageIndex < 0");
        }
    }

    @Override // com.aspose.slides.internal.p066cl.AbstractC2621dy
    /* JADX INFO: renamed from: k4 */
    public void mo8285k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 instanceof C3152yj) {
            this.f8432k4 = abstractC3150x6;
        } else {
            this.f8432k4 = m11966x1(abstractC3150x6);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m8283k4(InterfaceC6018m9[] interfaceC6018m9Arr) {
        for (InterfaceC6018m9 interfaceC6018m9 : interfaceC6018m9Arr) {
            if (!(interfaceC6018m9 instanceof C11887kk)) {
                return false;
            }
        }
        return true;
    }
}
