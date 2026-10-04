package com.aspose.slides.internal.p231kk;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.kk.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C5796m9 extends AbstractC5788h4 implements IGenericEnumerable<AbstractC5788h4>, InterfaceC5809v4 {

    /* JADX INFO: renamed from: k4 */
    private List<AbstractC5788h4> f15860k4;

    public C5796m9() {
        super((short) 2);
        this.f15860k4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        C6765kp c6765kp = new C6765kp();
        if (mo23681k4() > 0) {
            c6765kp.m26792k4(mo23682k4(0).mo23414h4());
        }
        for (int i = 1; i < mo23681k4(); i++) {
            c6765kp.m26780k4(ControlChar.SPACE_CHAR);
            c6765kp.m26792k4(this.f15860k4.get_Item(i).mo23414h4());
        }
        return c6765kp.toString();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<AbstractC5788h4> iterator() {
        return this.f15860k4.iterator();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5809v4
    /* JADX INFO: renamed from: k4 */
    public final int mo23681k4() {
        return this.f15860k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m23683x1(AbstractC5788h4 abstractC5788h4) {
        this.f15860k4.addItem(abstractC5788h4);
    }

    public C5796m9(IGenericList<AbstractC5788h4> iGenericList) {
        super((short) 2);
        this.f15860k4 = new List<>(iGenericList);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5809v4
    /* JADX INFO: renamed from: k4 */
    public final AbstractC5788h4 mo23682k4(int i) {
        return this.f15860k4.get_Item(i);
    }

    public C5796m9(AbstractC5788h4... abstractC5788h4Arr) {
        super((short) 2);
        this.f15860k4 = new List<>(AbstractC14092to.m67204k4((Object[]) abstractC5788h4Arr));
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }
}
