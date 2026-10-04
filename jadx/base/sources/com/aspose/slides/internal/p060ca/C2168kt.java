package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C2168kt implements InterfaceC2371xl {

    /* JADX INFO: renamed from: k4 */
    private C2132iq f7516k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<Integer, Integer> f7517x1;

    public C2168kt(C2132iq c2132iq) {
        this.f7516k4 = c2132iq;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final int mo10986k4(AbstractC2220nx abstractC2220nx) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 != null) {
            C2347wg c2347wgM10453k4 = this.f7516k4.m10758x1().m10548dy().m10453k4();
            if (c2347wgM10453k4 != null && ((c2347wgM10453k4.m11599kk() & 65535) != 3 || (c2347wgM10453k4.m11600to() & 65535) != 0)) {
                if (this.f7517x1 == null) {
                    SortedList<Long, Long> sortedList = new SortedList<>();
                    C2085fe c2085fe = (C2085fe) C7019kk.m27452k4((Object) c2347wgM10453k4, C2085fe.class);
                    if (c2085fe != null) {
                        c2085fe.m10526k4(sortedList);
                    } else {
                        sortedList.addItem(0L, Long.valueOf(C18177fb.f54859s));
                    }
                    this.f7517x1 = new Dictionary<>();
                    IGenericEnumerator<KeyValuePair<Long, Long>> it = sortedList.iterator();
                    while (it.hasNext()) {
                        try {
                            KeyValuePair<Long, Long> next = it.next();
                            for (int iIntValue = next.getKey().intValue(); iIntValue <= next.getValue().intValue(); iIntValue++) {
                                int iMo10360k4 = c2347wgM10453k4.mo10360k4(iIntValue);
                                if (iMo10360k4 != 0 && !this.f7517x1.containsKey(Integer.valueOf(iMo10360k4))) {
                                    this.f7517x1.set_Item(Integer.valueOf(iMo10360k4), Integer.valueOf(iIntValue));
                                }
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
                if (c2334v6.m11556k4() >= 0 && c2334v6.m11556k4() < (this.f7516k4.m10758x1().m10547du().m11521k4() & 65535)) {
                    Integer[] numArr = {0};
                    int iIntValue2 = this.f7517x1.tryGetValue(Integer.valueOf(c2334v6.m11556k4()), numArr) ? numArr[0].intValue() : 0;
                    numArr[0].getClass();
                    return iIntValue2;
                }
            } else if (this.f7516k4.m10758x1().m10546ck() != null) {
                String strM10447k4 = this.f7516k4.m10758x1().m10546ck().m10447k4(c2334v6.m11556k4());
                if (!".notdef".equals(strM10447k4)) {
                    return C2107h4.f7286k4.mo10660k4(strM10447k4);
                }
            }
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: x1 */
    public final AbstractC2220nx mo10989x1(int i) {
        C2347wg c2347wgM10453k4 = this.f7516k4.m10758x1().m10548dy().m10453k4();
        if (c2347wgM10453k4 == null) {
            return null;
        }
        int iMo10360k4 = c2347wgM10453k4.mo10360k4(i);
        if (iMo10360k4 >= this.f7516k4.m10753ne()) {
            iMo10360k4 = 0;
        } else if (iMo10360k4 == 0 && i < 256) {
            iMo10360k4 = c2347wgM10453k4.mo10360k4((char) (i + 61440));
        }
        return new C2334v6(iMo10360k4);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final AbstractC2220nx mo10987k4(int i) {
        return mo10989x1(i);
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2371xl
    /* JADX INFO: renamed from: k4 */
    public final void mo10988k4(int i, int i2) {
        this.f7516k4.m10758x1().m10548dy().m10456x1(i2, i & 65535);
    }
}
