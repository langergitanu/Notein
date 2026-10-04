package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.gm */
/* JADX INFO: loaded from: classes4.dex */
public class C10454gm extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37025k4;

    /* JADX INFO: renamed from: kk */
    private C10378by f37026kk;

    /* JADX INFO: renamed from: to */
    private C10378by f37027to;

    /* JADX INFO: renamed from: x1 */
    private C10378by f37028x1;

    public C10454gm() {
        m51409um().m51917k4(61749);
        this.f37028x1 = new C10378by();
        this.f37026kk = new C10378by();
        this.f37027to = new C10378by();
    }

    /* JADX INFO: renamed from: du */
    public final void m50840du(boolean z) {
        this.f37025k4 = z ? this.f37025k4 | 16 : this.f37025k4 & (-17);
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m50842h4() {
        return (this.f37025k4 & 8) == 8;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 52;
    }

    /* JADX INFO: renamed from: kk */
    public final C10378by m50845kk() {
        return this.f37027to;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m50848m9() {
        return (this.f37025k4 & 16) == 16;
    }

    /* JADX INFO: renamed from: to */
    public final void m50849to(boolean z) {
        this.f37025k4 = z ? this.f37025k4 | 8 : this.f37025k4 & (-9);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10378by m50851x1() {
        return this.f37026kk;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m50841du() {
        return (this.f37025k4 & 4) == 4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37025k4 = c3134k4.m13386x6();
        this.f37028x1.m50515k4(c3134k4);
        this.f37026kk.m50515k4(c3134k4);
        this.f37027to.m50515k4(c3134k4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m50846kk(C10378by c10378by) {
        this.f37027to = c10378by;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m50850to() {
        return (this.f37025k4 & 2) == 2;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50852x1(C10378by c10378by) {
        this.f37026kk = c10378by;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37025k4);
        this.f37028x1.m50516k4(c3149x1);
        this.f37026kk.m50516k4(c3149x1);
        this.f37027to.m50516k4(c3149x1);
    }

    /* JADX INFO: renamed from: kk */
    public final void m50847kk(boolean z) {
        this.f37025k4 = z ? this.f37025k4 | 4 : this.f37025k4 & (-5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50853x1(boolean z) {
        this.f37025k4 = z ? this.f37025k4 | 2 : this.f37025k4 & (-3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50843k4(C10378by c10378by) {
        this.f37028x1 = c10378by;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50844k4(boolean z) {
        this.f37025k4 = z ? this.f37025k4 | 1 : this.f37025k4 & (-2);
    }
}
