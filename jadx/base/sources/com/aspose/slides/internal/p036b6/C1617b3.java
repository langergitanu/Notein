package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.b3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1617b3 extends C1634k4 {
    public C1617b3(long j, long j2, long j3) {
        super("hmtx", j, j2, j3);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public long mo8701k4(C1627f9 c1627f9) {
        int iM8751c5 = c1627f9.m8785m9()[c1627f9.m8785m9().length - 1].m8751c5();
        int i = 0;
        for (int length = c1627f9.m8785m9().length - 2; length >= 0 && iM8751c5 == c1627f9.m8785m9()[length].m8751c5(); length--) {
            i++;
        }
        int length2 = c1627f9.m8785m9().length - i;
        c1627f9.m8777k4("hhea").set_Item("numOfLongHorMetrics", Integer.valueOf(65535 & length2));
        return ((long) ((i * 2) + (length2 * 4))) & 4294967295L;
    }

    public C1617b3(Dictionary<String, Object> dictionary) {
        super("hmtx");
        this.f6307dy = dictionary;
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public Dictionary<String, Object> mo8703k4(C1636kp c1636kp, C1627f9 c1627f9) {
        int i;
        c1636kp.m8868k4(this.f6313x1);
        int iIntValue = ((Integer) C7019kk.m27464to(c1627f9.m8777k4("hhea").get_Item("numOfLongHorMetrics"), Integer.TYPE)).intValue();
        List list = new List();
        int i2 = 0;
        while (true) {
            i = iIntValue & 65535;
            if (i2 >= i) {
                break;
            }
            list.addItem(new C1659wy(c1636kp.m8874to(), c1636kp.m8873m9()));
            i2++;
        }
        int iM9030k4 = ((C1659wy) list.get_Item(i - 1)).m9030k4();
        int iIntValue2 = (((Integer) c1627f9.m8777k4("maxp").get_Item("numGlyphs")).intValue() & 65535) - i;
        for (int i3 = 0; i3 < iIntValue2; i3++) {
            list.addItem(new C1659wy(iM9030k4, c1636kp.m8873m9()));
        }
        return C1656vj.m9016k4(list);
    }

    @Override // com.aspose.slides.internal.p036b6.C1634k4
    /* JADX INFO: renamed from: k4 */
    public void mo8702k4(C1655vh c1655vh, C1627f9 c1627f9) {
        int i;
        int iIntValue = ((Integer) C7019kk.m27464to(c1627f9.m8777k4("hhea").get_Item("numOfLongHorMetrics"), Integer.TYPE)).intValue();
        int i2 = 0;
        while (true) {
            i = 65535 & iIntValue;
            if (i2 >= i) {
                break;
            }
            c1655vh.m8995k4(c1627f9.m8785m9()[i2].m8751c5());
            c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(c1627f9.m8785m9()[i2].m8755dy()), 14));
            i2++;
        }
        int length = c1627f9.m8785m9().length - i;
        for (int i3 = 0; i3 < length; i3++) {
            c1655vh.m9005k4(C7019kk.m27468x1(Double.valueOf(c1627f9.m8785m9()[i + i3].m8755dy()), 14));
        }
    }
}
