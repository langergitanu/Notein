package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class ezv extends AbstractC7020m9<ezv> {

    /* JADX INFO: renamed from: k4 */
    private byte f4946k4;

    /* JADX INFO: renamed from: x1 */
    private byte f4947x1;

    public ezv() {
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
        if (obj instanceof ezv) {
            return m5790x1((ezv) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Byte.valueOf(this.f4946k4), Byte.valueOf(this.f4947x1));
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m5791k4() {
        return this.f4946k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public ezv Clone() {
        ezv ezvVar = new ezv();
        CloneTo(ezvVar);
        return ezvVar;
    }

    public String toString() {
        return C14113y2.m67402k4("Dx = {0:00}; Dy = {1:00}", Byte.valueOf(this.f4946k4), Byte.valueOf(this.f4947x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m5794x1() {
        return this.f4947x1;
    }

    public ezv(byte b, byte b2) {
        this.f4946k4 = b;
        this.f4947x1 = b2;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m5790x1(ezv ezvVar) {
        return ezvVar.f4946k4 == this.f4946k4 && ezvVar.f4947x1 == this.f4947x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(ezv ezvVar) {
        ezvVar.f4946k4 = this.f4946k4;
        ezvVar.f4947x1 = this.f4947x1;
    }
}
