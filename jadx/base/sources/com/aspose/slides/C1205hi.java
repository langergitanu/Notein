package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.hi */
/* JADX INFO: loaded from: classes3.dex */
class C1205hi {

    /* JADX INFO: renamed from: k4 */
    private byte[] f5508k4;

    public C1205hi() {
        this.f5508k4 = new byte[10];
    }

    /* JADX INFO: renamed from: c5 */
    public final int m7159c5() {
        return this.f5508k4[8] & 255;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m7160ck() {
        for (int i = 0; i < 10; i++) {
            if ((this.f5508k4[i] & 255) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: du */
    public final int m7161du() {
        return this.f5508k4[4] & 255;
    }

    /* JADX INFO: renamed from: dy */
    public final int m7162dy() {
        return this.f5508k4[7] & 255;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m7163h4() {
        return this.f5508k4[5] & 255;
    }

    /* JADX INFO: renamed from: jd */
    public final int m7164jd() {
        return this.f5508k4[9] & 255;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m7165k4() {
        return this.f5508k4[0] & 255;
    }

    /* JADX INFO: renamed from: kk */
    public final int m7169kk() {
        return this.f5508k4[2] & 255;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m7170m9() {
        return this.f5508k4[6] & 255;
    }

    /* JADX INFO: renamed from: to */
    public final int m7171to() {
        return this.f5508k4[3] & 255;
    }

    public String toString() {
        return C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4(C14113y2.m67400k4("FontPanose: ", C14113y2.m67408k4("FamilyKind: [0x", C14098up.m67320k4(this.f5508k4[0], "X2"), "]", C14042ak.m66410k4(gph.class, m7165k4()))), C14113y2.m67408k4(" * SerifStyle: [0x", C14098up.m67320k4(this.f5508k4[1], "X2"), "]", C14042ak.m66410k4(ji4.class, m7172x1()))), C14113y2.m67408k4(" * Weight: [0x", C14098up.m67320k4(this.f5508k4[2], "X2"), "]", C14042ak.m66410k4(ebm.class, m7169kk()))), C14113y2.m67408k4(" * Proportion: [0x", C14098up.m67320k4(this.f5508k4[3], "X2"), "]", C14042ak.m66410k4(zzn.class, m7171to()))), C14113y2.m67408k4(" * Contrast: [0x", C14098up.m67320k4(this.f5508k4[4], "X2"), "]", C14042ak.m66410k4(oqb.class, m7161du()))), C14113y2.m67408k4(" * StrokeVariation: [0x", C14098up.m67320k4(this.f5508k4[5], "X2"), "]", C14042ak.m66410k4(hf7.class, m7163h4()))), C14113y2.m67408k4(" * ArmStyle: [0x", C14098up.m67320k4(this.f5508k4[6], "X2"), "]", C14042ak.m66410k4(rew.class, m7170m9()))), C14113y2.m67408k4(" * LetterForm: [0x", C14098up.m67320k4(this.f5508k4[7], "X2"), "]", C14042ak.m66410k4(fon.class, m7162dy()))), C14113y2.m67408k4(" * Midline: [0x", C14098up.m67320k4(this.f5508k4[8], "X2"), "]", C14042ak.m66410k4(xov.class, m7159c5()))), C14113y2.m67408k4(" * Xheight: [0x", C14098up.m67320k4(this.f5508k4[9], "X2"), "]", C14042ak.m66410k4(kjw.class, m7164jd())));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m7172x1() {
        return this.f5508k4[1] & 255;
    }

    public C1205hi(byte[] bArr) {
        this();
        m7167k4(bArr);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final String m7166k4(Dictionary<byte[], String> dictionary) {
        Object key;
        Object value;
        Dictionary dictionary2 = new Dictionary();
        double[] dArr = {1.0d, 0.01d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 1.0d, 1.0d, 1.0d};
        Dictionary.Enumerator it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if ((this.f5508k4[3] & 255) == 9 && (((byte[]) next.getKey())[3] & 255) == 9) {
                    key = next.getKey();
                    value = next.getValue();
                } else if ((((byte[]) next.getKey())[3] & 255) != 9) {
                    key = next.getKey();
                    value = next.getValue();
                }
                dictionary2.addItem(key, value);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (dictionary2.size() == 0) {
            dictionary2 = new Dictionary(dictionary);
        }
        it = dictionary2.iterator();
        double d = Double.MAX_VALUE;
        String str = "";
        while (it.hasNext()) {
            try {
                KeyValuePair next2 = it.next();
                double dM67469du = 0.0d;
                for (int i = 0; i < 10; i++) {
                    byte b = this.f5508k4[i];
                    if ((b & 255) != 0) {
                        dM67469du += C14116yg.m67469du(((double) ((b & 255) - (((byte[]) next2.getKey())[i] & 255))) * dArr[i], 2.0d);
                    }
                }
                double dM67496rv = C14116yg.m67496rv(dM67469du);
                if (dM67496rv < d) {
                    str = (String) next2.getValue();
                    d = dM67496rv;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7167k4(byte[] bArr) {
        if (bArr == null || bArr.length != 10) {
            return;
        }
        AbstractC14092to.m67208k4((Object) bArr).copyTo(AbstractC14092to.m67208k4((Object) this.f5508k4), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m7168k4(C1205hi c1205hi) {
        for (int i = 0; i < 10; i++) {
            byte b = this.f5508k4[i];
            if ((b & 255) != 0) {
                byte b2 = c1205hi.f5508k4[i];
                if ((b2 & 255) != 0 && (b & 255) != (b2 & 255)) {
                    return false;
                }
            }
        }
        return true;
    }
}
