package com.aspose.slides.internal.p159h0;

import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C4442e0 implements InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: to */
    private int f12205to;

    /* JADX INFO: renamed from: k4 */
    private C4473um f12203k4 = new C4473um();

    /* JADX INFO: renamed from: x1 */
    private C4473um f12206x1 = new C4473um();

    /* JADX INFO: renamed from: kk */
    private C4473um f12204kk = new C4473um();

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public final Object deepClone() {
        return m18161du();
    }

    /* JADX INFO: renamed from: du */
    public Object m18161du() {
        try {
            C4442e0 c4442e0 = (C4442e0) super.clone();
            C4473um c4473um = this.f12206x1;
            if (c4473um != null) {
                c4442e0.f12206x1 = c4473um.Clone();
            }
            C4473um c4473um2 = this.f12203k4;
            if (c4473um2 != null) {
                c4442e0.f12203k4 = c4473um2.Clone();
            }
            C4473um c4473um3 = this.f12204kk;
            if (c4473um3 != null) {
                c4442e0.f12204kk = c4473um3.Clone();
            }
            return c4442e0;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C4473um m18162k4() {
        return this.f12203k4.Clone();
    }

    /* JADX INFO: renamed from: kk */
    public final C4473um m18165kk() {
        return this.f12204kk.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final int m18167to() {
        return this.f12205to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C4473um m18168x1() {
        return this.f12206x1.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18163k4(int i) {
        this.f12205to = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m18166kk(C4473um c4473um) {
        this.f12204kk = c4473um.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18169x1(C4473um c4473um) {
        this.f12206x1 = c4473um.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18164k4(C4473um c4473um) {
        this.f12203k4 = c4473um.Clone();
    }
}
