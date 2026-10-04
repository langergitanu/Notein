package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.b2 */
/* JADX INFO: loaded from: classes3.dex */
class C0790b2 extends AbstractC14463so {

    /* JADX INFO: renamed from: kk */
    private IBulletFormat f4070kk;

    /* JADX INFO: renamed from: k4 */
    private short f4069k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private String f4071x1 = C14113y2.f47374k4;

    public C0790b2(IBulletFormat iBulletFormat) {
        this.f4070kk = iBulletFormat;
    }

    /* JADX INFO: renamed from: kk */
    private void m3937kk() {
        if (C7019kk.m27469x1(this.f4070kk, PVIObject.class)) {
            ((PVIObject) this.f4070kk).m2145uz();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final short m3938k4() {
        return this.f4069k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m3941x1() {
        return this.f4071x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3939k4(String str) {
        if (C3085sv.m13090k4(this.f4071x1, str)) {
            return;
        }
        this.f4071x1 = str;
        m3937kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3940k4(short s) {
        if (C3085sv.m13089k4(this.f4069k4, s)) {
            return;
        }
        this.f4069k4 = s;
        this.f4071x1 = C14113y2.m67405k4(new char[]{(char) s});
        m3937kk();
    }
}
