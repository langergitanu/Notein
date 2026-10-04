package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14042ak;

/* JADX INFO: loaded from: classes3.dex */
class ysr {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Byte, vbz> f50402k4;

    /* JADX INFO: renamed from: x1 */
    private final kup f50403x1 = new kup();

    public ysr() {
        Dictionary dictionary = new Dictionary();
        dictionary.addItem((byte) 1, new vbz());
        dictionary.addItem((byte) 3, new vbz());
        dictionary.addItem((byte) 4, new vbz());
        dictionary.addItem((byte) 5, new vbz());
        this.f50402k4 = new Dictionary<>(dictionary);
    }

    /* JADX INFO: renamed from: k4 */
    private axo m74074k4(int i, int i2, mcc mccVar) {
        if (i == 0) {
            return new bd4(this.f50402k4, i2, mccVar);
        }
        if (i == 1) {
            return new C13820m4(this.f50402k4, i2, mccVar, this.f50403x1);
        }
        throw new ArgumentOutOfRangeException("mode", C14042ak.m66410k4(TextExtractionArrangingMode.class, i));
    }

    /* JADX INFO: renamed from: k4 */
    public final gt8 m74075k4(int i, mcc mccVar, int i2) {
        return m74074k4(i2, i, mccVar).m3793x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74076k4(byte b, vbz vbzVar) {
        if (b == 6) {
            this.f50402k4.set_Item((byte) 1, vbzVar);
        } else {
            this.f50402k4.set_Item(Byte.valueOf(b), vbzVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74077k4(List<jrz> list) {
        this.f50403x1.m64182k4(list);
    }
}
