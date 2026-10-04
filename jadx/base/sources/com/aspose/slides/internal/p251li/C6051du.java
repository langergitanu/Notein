package com.aspose.slides.internal.p251li;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.li.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6051du extends C6045bz {

    /* JADX INFO: renamed from: k4 */
    private byte[] f17163k4;

    public C6051du() {
        m24449x1((short) 16387);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: G_ */
    public short mo24431G_() {
        return super.mo24431G_();
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
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
        return m24485k4((C6051du) obj);
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: h4 */
    public int mo24416h4() {
        return m24486k4().length;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    public int hashCode() {
        if (m24486k4() != null) {
            return AbstractC14092to.m67208k4((Object) m24486k4()).hashCode();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p251li.C6045bz
    /* JADX INFO: renamed from: k4 */
    public void mo24437k4(short s) {
        if (s != 0) {
            throw new ArgumentOutOfRangeException("value");
        }
        super.mo24437k4(s);
    }

    public C6051du(C6045bz c6045bz) {
        super(c6045bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24484k4(byte[] bArr) {
        this.f17163k4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m24485k4(C6051du c6051du) {
        return C12530dy.m58330k4(m24486k4(), c6051du.m24486k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m24486k4() {
        return this.f17163k4;
    }
}
