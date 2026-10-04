package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p294n9.C6765kp;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.sv */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12725sv extends List<InterfaceC1861h4> implements InterfaceC1861h4 {

    /* JADX INFO: renamed from: kk */
    public int f42366kk;

    public AbstractC12725sv() {
        this.f42366kk = -1;
    }

    /* JADX INFO: renamed from: c5 */
    public void mo55020c5() {
    }

    /* JADX INFO: renamed from: ck */
    public final InterfaceC1861h4 m59196ck() {
        if (size() == 0) {
            return null;
        }
        InterfaceC1861h4 interfaceC1861h4 = (InterfaceC1861h4) super.get_Item(size() - 1);
        super.removeAt(size() - 1);
        return interfaceC1861h4;
    }

    /* JADX INFO: renamed from: dy */
    public abstract boolean mo58835dy();

    /* JADX INFO: renamed from: jd */
    public final AbstractC12723s7 m59197jd() {
        if (size() == 0) {
            return null;
        }
        return (AbstractC12723s7) super.get_Item(size() - 1);
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1861h4
    /* JADX INFO: renamed from: k4 */
    public final AbstractC12723s7 mo9727k4() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo58836k4(AbstractC12725sv abstractC12725sv);

    /* JADX INFO: renamed from: k4 */
    public abstract boolean mo58837k4(AbstractC12725sv abstractC12725sv, boolean z, C12722rv c12722rv);

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1861h4
    /* JADX INFO: renamed from: kk */
    public final boolean mo9728kk() {
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract AbstractC12725sv mo55023m9();

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1861h4
    /* JADX INFO: renamed from: to */
    public final boolean mo9729to() {
        return true;
    }

    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("<KnuthSequence [");
        for (int i = 0; i < size(); i++) {
            c6765kpOooO00o.m26791k4(get_Item(i));
            if (i != size() - 1) {
                c6765kpOooO00o.m26792k4(", ");
            }
        }
        c6765kpOooO00o.m26792k4("]>");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m59201x1(int i) {
        if (size() == 0 || i < 0 || i >= size()) {
            return -1;
        }
        int size = size();
        AbstractC12723s7 abstractC12723s7M59198k4 = null;
        int i2 = i;
        while (i2 < size) {
            abstractC12723s7M59198k4 = m59198k4(i2);
            if (abstractC12723s7M59198k4.mo58895yj()) {
                break;
            }
            i2++;
        }
        return (i2 == i || abstractC12723s7M59198k4 == null || !abstractC12723s7M59198k4.mo58895yj()) ? i : i2 - 1;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo58838x1(AbstractC12725sv abstractC12725sv);

    public AbstractC12725sv(List<InterfaceC1861h4> list) {
        super(list);
        this.f42366kk = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12723s7 m59198k4(int i) {
        if (i >= size() || i < 0) {
            return null;
        }
        return (AbstractC12723s7) super.get_Item(i);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m59200kk(AbstractC12725sv abstractC12725sv) {
        if (mo58838x1(abstractC12725sv)) {
            return true;
        }
        mo55023m9();
        return false;
    }

    @Override // com.aspose.slides.internal.p048bv.InterfaceC1861h4
    /* JADX INFO: renamed from: x1 */
    public final AbstractC12725sv mo9730x1() {
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59199k4(InterfaceC12711lr interfaceC12711lr) {
        Iterator<InterfaceC1861h4> it = iterator();
        while (it.hasNext()) {
            AbstractC12723s7 abstractC12723s7 = (AbstractC12723s7) it.next();
            abstractC12723s7.m59132k4(interfaceC12711lr.mo54973k4(new C12696f9(interfaceC12711lr, abstractC12723s7.m59134uz())));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m59202x1(AbstractC12725sv abstractC12725sv, boolean z, C12722rv c12722rv) {
        if (mo58837k4(abstractC12725sv, z, c12722rv)) {
            return true;
        }
        mo55023m9();
        return false;
    }
}
