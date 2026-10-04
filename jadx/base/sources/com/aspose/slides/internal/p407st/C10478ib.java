package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ib */
/* JADX INFO: loaded from: classes4.dex */
public class C10478ib extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private long f37057du;

    /* JADX INFO: renamed from: k4 */
    private int f37058k4;

    /* JADX INFO: renamed from: kk */
    private float f37059kk;

    /* JADX INFO: renamed from: to */
    private float f37060to;

    /* JADX INFO: renamed from: x1 */
    private float f37061x1;

    public C10478ib() {
        m51409um().m51917k4(61752);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 20;
    }

    /* JADX INFO: renamed from: kk */
    public final float m50913kk() {
        return this.f37059kk;
    }

    /* JADX INFO: renamed from: to */
    public final float m50916to() {
        return this.f37060to;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m50917x1() {
        return this.f37061x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50911k4(float f) {
        this.f37061x1 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50914kk(float f) {
        this.f37060to = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50918x1(float f) {
        this.f37059kk = f;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37058k4 = c3134k4.m13386x6();
        this.f37061x1 = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37059kk = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37060to = C14069jd.m66766dy(C14069jd.m66776k4(c3134k4.m13384uz()), 0);
        this.f37057du = c3134k4.m13384uz();
    }

    /* JADX INFO: renamed from: kk */
    public final void m50915kk(boolean z) {
        this.f37058k4 = z ? this.f37058k4 | 4 : this.f37058k4 & (-5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50919x1(boolean z) {
        this.f37058k4 = z ? this.f37058k4 | 2 : this.f37058k4 & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37058k4);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37061x1), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37059kk), 0) & 4294967295L);
        c3149x1.m13447k4(C14069jd.m66784x1(C14069jd.m66774k4(this.f37060to), 0) & 4294967295L);
        c3149x1.m13447k4(this.f37057du & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50912k4(boolean z) {
        this.f37058k4 = z ? this.f37058k4 | 1 : this.f37058k4 & (-2);
    }
}
