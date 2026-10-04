package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p060ca.C2012bg;
import com.aspose.slides.internal.p060ca.C2155k5;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p175i1.AbstractC4786k4;
import com.aspose.slides.internal.p274mh.C6386to;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p353q7.InterfaceC9759bv;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ap */
/* JADX INFO: loaded from: classes3.dex */
final class C0758ap implements IGenericEnumerable<KeyValuePair<String, C1141ge>>, InterfaceC9759bv, IDisposable {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<String, C6386to> f3934k4 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private static final Object f3935kk = new Object();

    /* JADX INFO: renamed from: to */
    private boolean f3936to = false;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<String, C1141ge> f3937x1 = new Dictionary<>();

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m3686k4(true);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, C1141ge>> iterator() {
        return this.f3937x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m3688k4() {
        return this.f3937x1.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C1141ge m3689k4(String str) {
        Dictionary<String, C1141ge> dictionary = this.f3937x1;
        if (dictionary == null || dictionary.size() == 0) {
            return null;
        }
        Dictionary.Enumerator<String, C1141ge> it = this.f3937x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (C14113y2.m67363du((String) next.getKey(), str)) {
                    return (C1141ge) next.getValue();
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
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1141ge m3690k4(String str, byte b, byte[] bArr, int i, int i2, byte[] bArr2, boolean z, LoadOptions loadOptions) {
        C0758ap c0758ap;
        int i3;
        int i4;
        boolean z2;
        LoadOptions loadOptions2;
        String str2;
        byte b2;
        byte[] bArr3;
        byte[] bArrM1547x1;
        byte[] bArr4;
        String fontName = str;
        byte bM1485k4 = b;
        byte[] bArrM1488kk = bArr;
        if (C2155k5.m10869k4(bArr2)) {
            C3152yj c3152yj = new C3152yj(bArr2);
            try {
                C2012bg c2012bg = new C2012bg(c3152yj);
                if (!C14113y2.m67411k4(c2012bg.m10252k4().m10879h4()) && bM1485k4 != ((byte) c2012bg.m10252k4().m10874du()) && !C14113y2.m67448x1(c2012bg.m10252k4().m10879h4(), fontName) && bArrM1488kk != null && !Arrays.equals(bArrM1488kk, c2012bg.m10252k4().m10897to().m11419k4())) {
                    fontName = c2012bg.m10252k4().m10879h4();
                    bM1485k4 = (byte) c2012bg.m10252k4().m10874du();
                    bArrM1488kk = c2012bg.m10252k4().m10897to().m11419k4();
                }
                c3152yj.dispose();
                c0758ap = this;
                i3 = i;
                i4 = i2;
                z2 = z;
                loadOptions2 = loadOptions;
                str2 = fontName;
                b2 = bM1485k4;
                bArr3 = bArrM1488kk;
                bArr4 = bArr2;
                bArrM1547x1 = FontsManager.m1547x1(bArr2);
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        } else {
            FontData[] fontDataArr = {null};
            byte[] bArrM1544k4 = FontsManager.m1544k4(bArr2, fontDataArr);
            FontData fontData = fontDataArr[0];
            if (!C14113y2.m67411k4(fontData.getFontName()) && bM1485k4 != fontData.m1485k4() && !C14113y2.m67448x1(fontData.getFontName(), fontName) && bArrM1488kk != null && !Arrays.equals(bArrM1488kk, fontData.m1488kk())) {
                fontName = fontData.getFontName();
                bM1485k4 = fontData.m1485k4();
                bArrM1488kk = fontData.m1488kk();
            }
            c0758ap = this;
            i3 = i;
            i4 = i2;
            z2 = z;
            loadOptions2 = loadOptions;
            str2 = fontName;
            b2 = bM1485k4;
            bArr3 = bArrM1488kk;
            bArrM1547x1 = bArr2;
            bArr4 = bArrM1544k4;
        }
        return c0758ap.m3691k4(str2, b2, bArr3, i3, i4, bArrM1547x1, bArr4, z2, loadOptions2);
    }

    /* JADX INFO: renamed from: k4 */
    public final C1141ge m3691k4(String str, byte b, byte[] bArr, int i, int i2, byte[] bArr2, byte[] bArr3, boolean z, LoadOptions loadOptions) {
        String str2;
        C1141ge c1141ge;
        if (this.f3937x1.containsKey(str)) {
            c1141ge = this.f3937x1.get_Item(str);
            str2 = str;
        } else {
            str2 = str;
            C1141ge c1141ge2 = new C1141ge(str2, b, bArr, i, z);
            this.f3937x1.addItem(str2, c1141ge2);
            c1141ge = c1141ge2;
        }
        c1141ge.m6505k4(i2, bArr2, bArr3);
        m3687k4(bArr2, str2, loadOptions, c1141ge.m6504k4(i2));
        return c1141ge;
    }

    @Override // com.aspose.slides.internal.p353q7.InterfaceC9759bv
    /* JADX INFO: renamed from: k4 */
    public final C9790ts mo3692k4(String str, int i) {
        C1141ge[] c1141geArr = {null};
        boolean zTryGetValue = this.f3937x1.tryGetValue(str, c1141geArr);
        C1141ge c1141ge = c1141geArr[0];
        if (!zTryGetValue) {
            return null;
        }
        IGenericDictionary<Integer, byte[]> iGenericDictionaryM6502h4 = c1141ge.m6502h4();
        byte[][] bArr = {null};
        boolean zTryGetValue2 = iGenericDictionaryM6502h4.tryGetValue(Integer.valueOf(i), bArr);
        byte[] bArr2 = bArr[0];
        if (!zTryGetValue2) {
            bArr[0] = bArr2;
            boolean zTryGetValue3 = iGenericDictionaryM6502h4.tryGetValue(0, bArr);
            bArr2 = bArr[0];
            if (!zTryGetValue3) {
                bArr[0] = bArr2;
                boolean zTryGetValue4 = iGenericDictionaryM6502h4.tryGetValue(1, bArr);
                bArr2 = bArr[0];
                if (!zTryGetValue4) {
                    bArr[0] = bArr2;
                    boolean zTryGetValue5 = iGenericDictionaryM6502h4.tryGetValue(2, bArr);
                    bArr2 = bArr[0];
                    if (!zTryGetValue5) {
                        return null;
                    }
                }
            }
        }
        return FontsManager.m1539k4(bArr2, str);
    }

    @Override // com.aspose.slides.internal.p353q7.InterfaceC9759bv
    /* JADX INFO: renamed from: k4 */
    public C12013m9 mo3693k4(String str, float f, int i) {
        if (!this.f3937x1.containsKey(str)) {
            return null;
        }
        C1141ge c1141ge = this.f3937x1.get_Item(str);
        if (!c1141ge.m6502h4().containsKey(Integer.valueOf(i))) {
            if (c1141ge.m6502h4().containsKey(0)) {
                i = 0;
            } else {
                int i2 = 1;
                if (!c1141ge.m6502h4().containsKey(1)) {
                    i2 = 2;
                    if (!c1141ge.m6502h4().containsKey(2)) {
                        return null;
                    }
                }
                i = i2;
            }
        }
        String strM6504k4 = c1141ge.m6504k4(i);
        Dictionary<String, C6386to> dictionary = f3934k4;
        C12004dy c12004dy = dictionary.containsKey(strM6504k4) ? dictionary.get_Item(strM6504k4).m26211k4()[0] : null;
        if (c12004dy != null) {
            try {
                return C12013m9.m56630k4(c12004dy, f, i);
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m3694k4(C0758ap c0758ap) {
        if (c0758ap == null || c0758ap.m3688k4() == 0) {
            return;
        }
        Dictionary.Enumerator<String, C1141ge> it = c0758ap.f3937x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String str = (String) next.getKey();
                if (!this.f3937x1.containsKey(str)) {
                    C1141ge c1141ge = (C1141ge) next.getValue();
                    C1141ge c1141ge2 = new C1141ge(c1141ge.getFontName(), c1141ge.m6503k4(), c1141ge.m6509to(), c1141ge.m6507kk(), c1141ge.m6501dy());
                    c1141ge2.m6506k4(c1141ge);
                    IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = c1141ge.m6502h4().iterator();
                    while (it2.hasNext()) {
                        try {
                            KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                            c1141ge2.m6502h4().addItem(keyValuePair.getKey(), keyValuePair.getValue());
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    it2 = c1141ge.m6508m9().iterator();
                    while (it2.hasNext()) {
                        try {
                            KeyValuePair keyValuePair2 = (KeyValuePair) it2.next();
                            c1141ge2.m6508m9().addItem(keyValuePair2.getKey(), keyValuePair2.getValue());
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    this.f3937x1.addItem(str, c1141ge2);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3695k4(C1141ge c1141ge) {
        if (c1141ge == null) {
            throw new ArgumentNullException("embeddedFont");
        }
        if (!this.f3937x1.containsKey(c1141ge.getFontName())) {
            throw new InvalidOperationException(C14113y2.m67402k4("Collection does not contain {0} font", c1141ge.getFontName()));
        }
        this.f3937x1.removeItemByKey(c1141ge.getFontName());
    }

    /* JADX INFO: renamed from: k4 */
    private void m3686k4(boolean z) {
        if (this.f3936to) {
            return;
        }
        if (z) {
            this.f3937x1.clear();
            f3934k4.clear();
        }
        this.f3936to = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m3687k4(byte[] bArr, String str, LoadOptions loadOptions, String str2) {
        C14112xw c14112xwM19848du;
        int length;
        synchronized (f3935kk) {
            try {
                try {
                    Dictionary<String, C6386to> dictionary = f3934k4;
                    if (!dictionary.containsKey(str2)) {
                        C6386to c6386to = new C6386to();
                        if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(bArr, 0, 4))) {
                            byte[] bArrM54219k4 = C11240k4.m54219k4(bArr);
                            c14112xwM19848du = AbstractC4786k4.m19846k4(bArrM54219k4).m19848du();
                            length = bArrM54219k4.length;
                        } else {
                            c14112xwM19848du = AbstractC4786k4.m19846k4(bArr).m19848du();
                            length = bArr.length;
                        }
                        c6386to.m26218k4(c14112xwM19848du, length);
                        dictionary.addItem(str2, c6386to);
                    }
                } catch (FileNotFoundException e) {
                    C3085sv.m13082k4(e);
                    if (loadOptions != null) {
                        loadOptions.m1921k4(C14113y2.m67402k4("Font {0} could not be loaded", str), 1);
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m3696k4(int i) {
        List list = new List();
        Dictionary.ValueCollection.Enumerator<String, C1141ge> it = this.f3937x1.getValues().iterator();
        while (true) {
            try {
                int i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                C1141ge next = it.next();
                int i3 = i >> 4;
                if (i3 <= 5) {
                    i2 = i3;
                }
                if (next.m6510x1() == i2) {
                    list.addItem(next.getFontName());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return (String[]) list.toArray(new String[0]);
    }
}
