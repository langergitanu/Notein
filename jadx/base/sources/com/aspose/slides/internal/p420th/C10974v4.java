package com.aspose.slides.internal.p420th;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10974v4 extends AbstractC10973uz implements InterfaceC10952c6, InterfaceC10979xk {

    /* JADX INFO: renamed from: k4 */
    private C5656k4 f38262k4;

    /* JADX INFO: renamed from: x1 */
    private List<C12025x6> f38263x1;

    public C10974v4() {
        this.f38262k4 = C5656k4.f15518dy;
        this.f38263x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C12025x6> m53117k4() {
        return this.f38263x1;
    }

    @Override // com.aspose.slides.internal.p420th.InterfaceC10979xk
    /* JADX INFO: renamed from: x1 */
    public final AbstractC10973uz mo52921x1() {
        C10974v4 c10974v4 = new C10974v4(this.f38262k4);
        for (int i = 0; i < this.f38263x1.size(); i++) {
            C12025x6 c12025x6Clone = this.f38263x1.get_Item(i).Clone();
            c10974v4.f38263x1.addItem(new C12025x6(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()));
        }
        return c10974v4;
    }

    public C10974v4(C5656k4 c5656k4) {
        this.f38262k4 = C5656k4.f15518dy;
        this.f38263x1 = new List<>();
        this.f38262k4 = c5656k4;
    }

    @Override // com.aspose.slides.internal.p420th.InterfaceC10952c6
    /* JADX INFO: renamed from: k4 */
    public final void mo52910k4(C4317dy c4317dy) {
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), this.f38263x1.size()));
        for (int i = 0; i < this.f38263x1.size(); i++) {
            this.f38263x1.get_Item(i).CloneTo(c12025x6Arr[i]);
        }
        c4317dy.m17342k4(c12025x6Arr);
        for (int i2 = 0; i2 < c12025x6Arr.length; i2++) {
            this.f38263x1.set_Item(i2, c12025x6Arr[i2].Clone());
        }
    }

    public C10974v4(C12025x6 c12025x6, C12025x6 c12025x62) {
        this.f38262k4 = C5656k4.f15518dy;
        List<C12025x6> list = new List<>();
        this.f38263x1 = list;
        list.addItem(c12025x6.Clone());
        this.f38263x1.addItem(c12025x62.Clone());
    }

    public C10974v4(float[] fArr) {
        this.f38262k4 = C5656k4.f15518dy;
        this.f38263x1 = new List<>();
        int length = fArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            this.f38263x1.addItem(new C12025x6(fArr[i2], fArr[i2 + 1]));
        }
    }

    public C10974v4(C12025x6[] c12025x6Arr) {
        this.f38262k4 = C5656k4.f15518dy;
        this.f38263x1 = new List<>();
        for (C12025x6 c12025x6 : c12025x6Arr) {
            this.f38263x1.addItem(c12025x6.Clone());
        }
    }
}
