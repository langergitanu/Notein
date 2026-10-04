package com.aspose.slides.internal.p420th;

import com.aspose.slides.internal.p085dk.C3169ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.ix */
/* JADX INFO: loaded from: classes4.dex */
public class C10959ix {

    /* JADX INFO: renamed from: du */
    private final int f38180du;

    /* JADX INFO: renamed from: h4 */
    private final int f38181h4;

    /* JADX INFO: renamed from: k4 */
    private final C12007ix f38182k4;

    /* JADX INFO: renamed from: kk */
    private String f38183kk;

    /* JADX INFO: renamed from: m9 */
    private final String f38184m9;

    /* JADX INFO: renamed from: to */
    private final int f38185to;

    /* JADX INFO: renamed from: x1 */
    private final boolean f38186x1;

    public C10959ix(int i, C12007ix c12007ix, String str) {
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        this.f38182k4 = c12007ixClone;
        this.f38184m9 = str;
        this.f38185to = 1;
        this.f38180du = i;
        c12007ix.CloneTo(c12007ixClone);
        this.f38186x1 = true;
        this.f38181h4 = -1;
    }

    /* JADX INFO: renamed from: du */
    public final int m52937du() {
        return this.f38180du;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m52940k4((C10959ix) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final int m52938h4() {
        return this.f38181h4;
    }

    public int hashCode() {
        int iHashCode = ((this.f38182k4.hashCode() * 397) ^ C14051ck.m66552k4(this.f38186x1)) * 397;
        String str = this.f38183kk;
        int iHashCode2 = (iHashCode ^ (str != null ? str.hashCode() : 0)) * 397;
        String str2 = this.f38184m9;
        return ((((((iHashCode2 ^ (str2 != null ? str2.hashCode() : 0)) * 397) ^ this.f38185to) * 397) ^ this.f38180du) * 397) ^ this.f38181h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m52939k4() {
        return this.f38182k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m52941kk() {
        return this.f38183kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m52942m9() {
        return this.f38184m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m52943to() {
        return this.f38185to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m52944x1() {
        return this.f38186x1;
    }

    public C10959ix(C12007ix c12007ix, int i, String str) {
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        this.f38182k4 = c12007ixClone;
        this.f38184m9 = str;
        this.f38185to = 1;
        this.f38180du = 7;
        c12007ix.CloneTo(c12007ixClone);
        this.f38186x1 = true;
        this.f38181h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m52940k4(C10959ix c10959ix) {
        new C10959ix(new C12007ix(0.0f, 0.0f, 20.0f, 20.0f), "test", "test");
        return this.f38182k4.equals(c10959ix.f38182k4.Clone()) && C14051ck.m66558x1(this.f38186x1, c10959ix.f38186x1) && C14113y2.m67363du(this.f38183kk, c10959ix.f38183kk) && this.f38185to == c10959ix.f38185to && this.f38180du == c10959ix.f38180du && this.f38181h4 == c10959ix.f38181h4 && C14113y2.m67363du(this.f38184m9, c10959ix.f38184m9);
    }

    public C10959ix(C12007ix c12007ix, String str, String str2) {
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        this.f38182k4 = c12007ixClone;
        c12007ix.CloneTo(c12007ixClone);
        this.f38184m9 = str2;
        if (C3169ck.m13547to(str)) {
            this.f38186x1 = true;
            this.f38183kk = C14113y2.m67422kk(str, 1);
        } else {
            this.f38186x1 = false;
            this.f38183kk = str;
        }
        this.f38185to = 0;
        this.f38180du = 0;
        this.f38181h4 = -1;
    }
}
