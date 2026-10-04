package com.aspose.slides.internal.p339pk;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9459to {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, InterfaceC9461x1> f34413k4 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private int f34414kk;

    /* JADX INFO: renamed from: x1 */
    private final boolean f34415x1;

    public C9459to(boolean z) {
        this.f34415x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private int m46398k4() {
        for (int i = 0; i < this.f34413k4.size(); i++) {
            if (!this.f34413k4.containsKey(Integer.valueOf(i))) {
                throw new InvalidOperationException("WMF Objects find slot error");
            }
            if (this.f34413k4.get_Item(Integer.valueOf(i)) == null) {
                return i;
            }
        }
        throw new InvalidOperationException("Object count is out of range.");
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46401x1(int i) {
        if (!this.f34415x1) {
            this.f34413k4.set_Item(Integer.valueOf(i), null);
        } else {
            if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                return;
            }
            this.f34413k4.removeItemByKey(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC9461x1 m46399k4(int i) {
        InterfaceC9461x1[] interfaceC9461x1Arr = {null};
        this.f34413k4.tryGetValue(Integer.valueOf(i), interfaceC9461x1Arr);
        return interfaceC9461x1Arr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46400k4(InterfaceC9461x1 interfaceC9461x1) {
        int iM46398k4;
        if (this.f34415x1) {
            if (this.f34413k4.size() <= 19) {
                int i = this.f34414kk;
                this.f34414kk = i + 1;
                iM46398k4 = i | Integer.MIN_VALUE;
                interfaceC9461x1.mo46246k4(iM46398k4);
            } else {
                iM46398k4 = interfaceC9461x1.mo46249x1();
            }
        } else if (interfaceC9461x1 == null) {
            iM46398k4 = this.f34414kk;
            this.f34414kk = iM46398k4 + 1;
        } else {
            iM46398k4 = m46398k4();
        }
        this.f34413k4.set_Item(Integer.valueOf(iM46398k4), interfaceC9461x1);
    }
}
