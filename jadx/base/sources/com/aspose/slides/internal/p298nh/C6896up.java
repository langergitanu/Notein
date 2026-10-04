package com.aspose.slides.internal.p298nh;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nh.up */
/* JADX INFO: loaded from: classes4.dex */
public final class C6896up extends AbstractC6897x1 {

    /* JADX INFO: renamed from: k4 */
    private C11999ar f18846k4;

    private C6896up() {
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C6896up c6896up = new C6896up();
        c6896up.f18846k4 = (C11999ar) this.f18846k4.deepClone();
        return c6896up;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1, com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f18846k4.dispose();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C6896up.class) && m27023k4((C6896up) obj);
    }

    public int hashCode() {
        C11999ar c11999ar = this.f18846k4;
        if (c11999ar != null) {
            return c11999ar.hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p298nh.AbstractC6897x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC12024x1 mo26959k4() {
        return this.f18846k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12003du m27024x1() {
        return this.f18846k4.m56305h4();
    }

    public C6896up(C12003du c12003du) {
        this.f18846k4 = new C11999ar(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m27023k4(C6896up c6896up) {
        return C14067j2.m66728k4(this.f18846k4, c6896up.f18846k4);
    }
}
