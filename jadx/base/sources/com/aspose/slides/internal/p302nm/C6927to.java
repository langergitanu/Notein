package com.aspose.slides.internal.p302nm;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.nm.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6927to extends AbstractC7020m9<C6927to> {

    /* JADX INFO: renamed from: k4 */
    public short f18903k4;

    /* JADX INFO: renamed from: kk */
    public short f18904kk;

    /* JADX INFO: renamed from: x1 */
    public short f18905x1;

    public C6927to() {
        this.f18903k4 = (short) 0;
        this.f18905x1 = (short) 0;
        this.f18904kk = (short) 0;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m27187x1(C6927to c6927to) {
        return c6927to.f18903k4 == this.f18903k4 && c6927to.f18905x1 == this.f18905x1 && c6927to.f18904kk == this.f18904kk;
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C6927to) {
            return m27187x1((C6927to) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C6927to Clone() {
        C6927to c6927to = new C6927to();
        CloneTo(c6927to);
        return c6927to;
    }

    public C6927to(int i, int i2, int i3) {
        this((short) i, (short) i2, (short) i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static C6927to m27186k4(short[] sArr, int i) {
        int i2 = i * 3;
        return new C6927to(sArr[i2], sArr[i2 + 1], sArr[i2 + 2]);
    }

    public C6927to(short s, short s2, short s3) {
        this.f18905x1 = s;
        this.f18903k4 = s2;
        this.f18904kk = s3;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C6927to c6927to) {
        c6927to.f18903k4 = this.f18903k4;
        c6927to.f18905x1 = this.f18905x1;
        c6927to.f18904kk = this.f18904kk;
    }
}
