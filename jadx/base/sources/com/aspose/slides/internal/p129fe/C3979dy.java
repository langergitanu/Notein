package com.aspose.slides.internal.p129fe;

import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.marker.PerfConstants;

/* JADX INFO: renamed from: com.aspose.slides.internal.fe.dy */
/* JADX INFO: loaded from: classes.dex */
public final class C3979dy {

    /* JADX INFO: renamed from: k4 */
    static C3979dy f10793k4;

    /* JADX INFO: renamed from: kk */
    static C3979dy f10794kk;

    /* JADX INFO: renamed from: x1 */
    static C3979dy f10795x1;

    /* JADX INFO: renamed from: du */
    private String f10796du;

    /* JADX INFO: renamed from: to */
    private C14047bz f10797to;

    public C3979dy(C14047bz c14047bz) {
        C14047bz c14047bz2 = new C14047bz();
        this.f10797to = c14047bz2;
        c14047bz.CloneTo(c14047bz2);
    }

    /* JADX INFO: renamed from: kk */
    public static C3979dy m15688kk() {
        if (f10795x1 == null) {
            f10795x1 = new C3979dy(new C14047bz("84236f7b-3bd3-428f-8dab-4ea1439ca315"), "Resolution");
        }
        return f10795x1;
    }

    /* JADX INFO: renamed from: to */
    public static C3979dy m15689to() {
        if (f10794kk == null) {
            f10794kk = new C3979dy(new C14047bz("6aedbd6d-3fb5-418a-83a6-7f45229dc872"), PerfConstants.CodeMarkerParameters.TIME);
        }
        return f10794kk;
    }

    /* JADX INFO: renamed from: x1 */
    public static C3979dy m15690x1() {
        if (f10793k4 == null) {
            f10793k4 = new C3979dy(new C14047bz("7462dc86-6180-4c7e-8e3f-ee7333a7a483"), "Page");
        }
        return f10793k4;
    }

    public boolean equals(Object obj) {
        C3979dy c3979dy = obj instanceof C3979dy ? (C3979dy) obj : null;
        return c3979dy != null && C14047bz.m66535k4(this.f10797to, c3979dy.f10797to);
    }

    public int hashCode() {
        return this.f10797to.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public C14047bz m15691k4() {
        return this.f10797to;
    }

    public String toString() {
        if (this.f10796du == null) {
            this.f10796du = C14113y2.m67402k4("[FrameDimension: {0}]", this.f10797to.Clone());
        }
        return this.f10796du;
    }

    public C3979dy(C14047bz c14047bz, String str) {
        C14047bz c14047bz2 = new C14047bz();
        this.f10797to = c14047bz2;
        c14047bz.CloneTo(c14047bz2);
        this.f10796du = str;
    }
}
