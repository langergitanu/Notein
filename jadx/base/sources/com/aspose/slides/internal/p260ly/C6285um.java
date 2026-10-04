package com.aspose.slides.internal.p260ly;

import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ly.um */
/* JADX INFO: loaded from: classes4.dex */
public class C6285um extends AbstractC6280ne {

    /* JADX INFO: renamed from: du */
    private float f17855du;

    /* JADX INFO: renamed from: h4 */
    private float f17856h4;

    /* JADX INFO: renamed from: k4 */
    private float f17857k4;

    /* JADX INFO: renamed from: kk */
    private float f17858kk;

    /* JADX INFO: renamed from: to */
    private float f17859to;

    /* JADX INFO: renamed from: x1 */
    private float f17860x1;

    /* JADX INFO: renamed from: du */
    public final void m25636du(float f) {
        this.f17855du = f;
    }

    /* JADX INFO: renamed from: dy */
    public final C11913yj m25637dy() {
        return new C11913yj(this.f17857k4, this.f17860x1, this.f17858kk, this.f17859to, this.f17855du, this.f17856h4);
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
        return m25642k4((C6285um) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final float m25638h4() {
        return this.f17855du;
    }

    public int hashCode() {
        return (((((((((C14064he.m66708k4(this.f17857k4) * 397) ^ C14064he.m66708k4(this.f17860x1)) * 397) ^ C14064he.m66708k4(this.f17858kk)) * 397) ^ C14064he.m66708k4(this.f17859to)) * 397) ^ C14064he.m66708k4(this.f17855du)) * 397) ^ C14064he.m66708k4(this.f17856h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final float m25640k4() {
        return this.f17857k4;
    }

    /* JADX INFO: renamed from: kk */
    public final float m25643kk() {
        return this.f17858kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m25645m9() {
        return this.f17856h4;
    }

    /* JADX INFO: renamed from: to */
    public final float m25646to() {
        return this.f17859to;
    }

    public String toString() {
        return C14113y2.m67402k4("[M11: {0}, M12: {1}, M21: {2}, M22: {3}, Dx: {4}, Dy: {5}]", Float.valueOf(this.f17857k4), Float.valueOf(this.f17860x1), Float.valueOf(this.f17858kk), Float.valueOf(this.f17859to), Float.valueOf(this.f17855du), Float.valueOf(this.f17856h4));
    }

    /* JADX INFO: renamed from: x1 */
    public final float m25648x1() {
        return this.f17860x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m25639h4(float f) {
        this.f17856h4 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25641k4(float f) {
        this.f17857k4 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25644kk(float f) {
        this.f17858kk = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m25647to(float f) {
        this.f17859to = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25649x1(float f) {
        this.f17860x1 = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m25642k4(C6285um c6285um) {
        return C14064he.m66718x1(this.f17857k4, c6285um.f17857k4) && C14064he.m66718x1(this.f17860x1, c6285um.f17860x1) && C14064he.m66718x1(this.f17858kk, c6285um.f17858kk) && C14064he.m66718x1(this.f17859to, c6285um.f17859to) && C14064he.m66718x1(this.f17855du, c6285um.f17855du) && C14064he.m66718x1(this.f17856h4, c6285um.f17856h4);
    }
}
