package com.aspose.slides.internal.p407st;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.eo */
/* JADX INFO: loaded from: classes4.dex */
public class C10426eo extends AbstractC10571o4 {

    /* JADX INFO: renamed from: kk */
    private boolean f36976kk;

    /* JADX INFO: renamed from: to */
    private boolean f36977to;

    /* JADX INFO: renamed from: k4 */
    private C10674uy f36975k4 = new C10674uy();

    /* JADX INFO: renamed from: x1 */
    private C12016rv f36978x1 = new C12016rv(0, 0);

    public C10426eo() {
        m51409um().m51917k4(PointerIconCompat.TYPE_GRABBING);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 52;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50770kk() {
        return this.f36976kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10674uy m50771x1() {
        return this.f36975k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50768k4(int i) {
        if (i == 0) {
            this.f36975k4.m51831k4(new C10627s0(68, 100));
            this.f36975k4.m51833x1(new C10627s0(68, 100));
            this.f36978x1 = new C12016rv(BackupEvent.ERROR_TOKEN_EXPIRED, -26);
            this.f36976kk = true;
            this.f36977to = false;
            return;
        }
        if (i != 1) {
            return;
        }
        this.f36975k4.m51831k4(new C10627s0(100, 100));
        this.f36975k4.m51833x1(new C10627s0(100, 100));
        this.f36978x1 = new C12016rv(0, 0);
        this.f36976kk = false;
        this.f36977to = true;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36975k4.m51829k4(c3134k4);
        c3134k4.m13372dy(24);
        this.f36978x1 = new C12016rv(c3134k4.m13386x6(), c3134k4.m13386x6());
        this.f36976kk = (c3134k4.m13387yj() & 255) != 0;
        this.f36977to = (c3134k4.m13387yj() & 255) != 0;
        c3134k4.m13381rv();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        this.f36975k4.m51830k4(c3149x1);
        for (int i = 0; i < 6; i++) {
            c3149x1.m13447k4(0L);
        }
        c3149x1.m13455x1(this.f36978x1.m56708k4());
        c3149x1.m13455x1(this.f36978x1.m56713x1());
        c3149x1.m13443k4(this.f36976kk ? (byte) 1 : (byte) 0);
        c3149x1.m13443k4(this.f36977to ? (byte) 1 : (byte) 0);
        c3149x1.m13446k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50769k4(boolean z) {
        this.f36976kk = z;
    }
}
