package com.aspose.slides.internal.p047bu;

import com.aspose.slides.Collections.Generic.Dictionary;

/* JADX INFO: renamed from: com.aspose.slides.internal.bu.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1854to {

    /* JADX INFO: renamed from: k4 */
    private int f6699k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private Object f6702x1 = new Object();

    /* JADX INFO: renamed from: kk */
    private Dictionary<Object, Byte> f6700kk = new Dictionary<>(64);

    /* JADX INFO: renamed from: to */
    private Dictionary<Byte, Object> f6701to = new Dictionary<>(64);

    /* JADX INFO: renamed from: k4 */
    public final boolean m9668k4(Object obj) {
        return this.f6700kk.containsKey(obj);
    }

    /* JADX INFO: renamed from: kk */
    public final byte m9669kk(Object obj) {
        if (!m9668k4(obj)) {
            if (this.f6700kk.size() < 64) {
                synchronized (this.f6702x1) {
                    this.f6700kk.addItem(obj, Byte.valueOf((byte) this.f6699k4));
                    this.f6701to.addItem(Byte.valueOf((byte) this.f6699k4), obj);
                    this.f6699k4++;
                }
            } else {
                synchronized (this.f6702x1) {
                    byte b = (byte) (this.f6699k4 % 64);
                    this.f6700kk.removeItemByKey(this.f6701to.get_Item(Byte.valueOf(b)));
                    this.f6701to.removeItemByKey(Byte.valueOf(b));
                    this.f6700kk.addItem(obj, Byte.valueOf(b));
                    this.f6701to.addItem(Byte.valueOf(b), obj);
                    this.f6699k4++;
                }
            }
        }
        return m9670x1(obj);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m9670x1(Object obj) {
        if (m9668k4(obj)) {
            return this.f6700kk.get_Item(obj).byteValue();
        }
        return (byte) 0;
    }
}
