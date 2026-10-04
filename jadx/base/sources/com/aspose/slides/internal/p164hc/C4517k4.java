package com.aspose.slides.internal.p164hc;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.C13449m9;
import com.aspose.slides.internal.p541z6.C13450to;
import com.aspose.slides.internal.p541z6.C13451up;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;

/* JADX INFO: renamed from: com.aspose.slides.internal.hc.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4517k4 implements InterfaceC13443dy {

    /* JADX INFO: renamed from: k4 */
    private final C13452x1.k4 f12587k4;

    /* JADX INFO: renamed from: kk */
    private final C13450to f12588kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC13443dy f12589to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC3150x6 f12590x1;

    public C4517k4(AbstractC3150x6 abstractC3150x6, C13450to c13450to, C13452x1.k4 k4Var) {
        this.f12590x1 = abstractC3150x6;
        this.f12588kk = c13450to;
        this.f12587k4 = k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC13443dy m18618k4(byte[] bArr, AbstractC3150x6 abstractC3150x6) {
        C3152yj c3152yj = new C3152yj();
        if (bArr != null) {
            try {
                c3152yj.write(bArr, 0, bArr.length);
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
        byte[] bArrM62560k4 = C13447k4.m62560k4(abstractC3150x6, this.f12588kk.m62570to());
        c3152yj.write(bArrM62560k4, 0, bArrM62560k4.length);
        InterfaceC13443dy interfaceC13443dyM62563k4 = C13449m9.m62563k4(c3152yj.toArray());
        c3152yj.dispose();
        return interfaceC13443dyM62563k4;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        InterfaceC13443dy interfaceC13443dy = this.f12589to;
        if (interfaceC13443dy != null) {
            interfaceC13443dy.dispose();
            this.f12589to = null;
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: kk */
    public final long mo18612kk() {
        InterfaceC13443dy interfaceC13443dy = this.f12589to;
        if (interfaceC13443dy == null) {
            return 0L;
        }
        return interfaceC13443dy.mo18612kk();
    }

    /* JADX INFO: renamed from: to */
    public final void m18620to() {
        if (this.f12589to == null) {
            boolean zMo62584k4 = this.f12587k4.mo62584k4(this, this.f12588kk.m62571x1());
            byte[][] bArr = {null};
            boolean z = zMo62584k4 && m18619k4(this.f12588kk.m62571x1(), bArr);
            byte[] bArr2 = bArr[0];
            if (z) {
                this.f12589to = C13449m9.m62563k4(bArr2);
                return;
            }
            C4515du c4515du = new C4515du(this.f12588kk, this.f12590x1, bArr2);
            try {
                c4515du.m18613to();
                this.f12589to = c4515du;
            } catch (C13451up e) {
                c4515du.dispose();
                this.f12588kk.m62569kk().mo62542k4(e.toString());
                if (!zMo62584k4) {
                    throw new RuntimeException(e.getInnerException());
                }
                this.f12589to = m18618k4(bArr2, this.f12590x1);
            } catch (RuntimeException e2) {
                c4515du.dispose();
                throw e2;
            }
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo18614x1() {
        m18620to();
        return this.f12589to.mo18614x1();
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m18619k4(final long j, byte[][] bArr) {
        bArr[0] = null;
        if ((j < this.f12588kk.m62570to() ? j : this.f12588kk.m62570to()) == 0) {
            return false;
        }
        final C3152yj[] c3152yjArr = {new C3152yj()};
        try {
            boolean zM62558k4 = C13447k4.m62558k4(this.f12590x1, new C13447k4.k4() { // from class: com.aspose.slides.internal.hc.k4.1
                @Override // com.aspose.slides.internal.p541z6.C13447k4.k4
                /* JADX INFO: renamed from: k4 */
                public boolean mo18615k4(byte[] bArr2, int i) {
                    if (i == 0) {
                        return true;
                    }
                    c3152yjArr[0].write(bArr2, 0, i);
                    return C7019kk.m27461m9(Long.valueOf(c3152yjArr[0].getLength()), 11) <= j;
                }
            }, this.f12588kk.m62570to());
            bArr[0] = c3152yjArr[0].toArray();
            return zM62558k4;
        } finally {
            C3152yj c3152yj = c3152yjArr[0];
            if (c3152yj != null) {
                c3152yj.dispose();
            }
        }
    }

    @Override // com.aspose.slides.internal.p541z6.InterfaceC13443dy
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo18611k4() {
        InterfaceC13443dy interfaceC13443dy = this.f12589to;
        if (interfaceC13443dy != null) {
            return interfaceC13443dy.mo18611k4();
        }
        InterfaceC13443dy interfaceC13443dyM62563k4 = C13449m9.m62563k4(C13447k4.m62560k4(this.f12590x1, this.f12588kk.m62570to()));
        this.f12589to = interfaceC13443dyM62563k4;
        return interfaceC13443dyM62563k4.mo18611k4();
    }
}
