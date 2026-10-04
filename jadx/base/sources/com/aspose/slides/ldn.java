package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;

/* JADX INFO: loaded from: classes3.dex */
class ldn implements InterfaceC14089ss<ldn> {

    /* JADX INFO: renamed from: du */
    private C14093tq<Byte> f45971du = new C14093tq<>();

    /* JADX INFO: renamed from: h4 */
    private boolean f45972h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f45973k4;

    /* JADX INFO: renamed from: kk */
    private int f45974kk;

    /* JADX INFO: renamed from: to */
    private int f45975to;

    /* JADX INFO: renamed from: x1 */
    private boolean f45976x1;

    public ldn() {
        m64373k4(1);
        m64382x1(3);
    }

    /* JADX INFO: renamed from: du */
    public final C14093tq<Byte> m64371du() {
        return this.f45971du.Clone();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C14067j2.m66727k4(obj) == C14067j2.m66727k4(this) && m64377k4((ldn) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m64372h4() {
        return this.f45972h4;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64373k4(int i) {
        this.f45974kk = i;
    }

    /* JADX INFO: renamed from: kk */
    public final int m64378kk() {
        return this.f45974kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m64380m9() {
        return C0883d5.m4950k4(new ldn(), this);
    }

    /* JADX INFO: renamed from: to */
    public final int m64381to() {
        return this.f45975to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64382x1(int i) {
        this.f45975to = i;
    }

    public ldn(ldn ldnVar) {
        m64375k4(ldnVar.m64376k4());
        m64383x1(ldnVar.m64384x1());
        m64373k4(ldnVar.m64378kk());
        m64382x1(ldnVar.m64381to());
        m64374k4(ldnVar.m64371du().Clone());
        m64379kk(ldnVar.m64372h4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64374k4(C14093tq<Byte> c14093tq) {
        this.f45971du = c14093tq.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final void m64379kk(boolean z) {
        this.f45972h4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64383x1(boolean z) {
        this.f45976x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64375k4(boolean z) {
        this.f45973k4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m64384x1() {
        return this.f45976x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64376k4() {
        return this.f45973k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64377k4(ldn ldnVar) {
        return ldnVar != null && m64376k4() == ldnVar.m64376k4() && m64384x1() == ldnVar.m64384x1() && m64378kk() == ldnVar.m64378kk() && m64381to() == ldnVar.m64381to() && C14093tq.m67295k4(m64371du(), ldnVar.m64371du()) && m64372h4() == ldnVar.m64372h4();
    }
}
