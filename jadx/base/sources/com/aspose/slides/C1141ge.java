package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p174hz.C4772y9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ge */
/* JADX INFO: loaded from: classes3.dex */
class C1141ge implements IFontData {

    /* JADX INFO: renamed from: dy */
    private final boolean f5194dy;

    /* JADX INFO: renamed from: k4 */
    private final byte f5196k4;

    /* JADX INFO: renamed from: kk */
    private final int f5197kk;

    /* JADX INFO: renamed from: to */
    private final IFontData f5199to;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f5200x1;

    /* JADX INFO: renamed from: du */
    private final IGenericDictionary<Integer, byte[]> f5193du = new Dictionary();

    /* JADX INFO: renamed from: h4 */
    private final IGenericDictionary<Integer, byte[]> f5195h4 = new Dictionary();

    /* JADX INFO: renamed from: m9 */
    private final IGenericDictionary<Integer, String> f5198m9 = new Dictionary();

    public C1141ge(String str, byte b, byte[] bArr, int i, boolean z) {
        this.f5199to = new FontData(str);
        this.f5196k4 = b;
        this.f5200x1 = bArr;
        this.f5197kk = i;
        this.f5194dy = z;
    }

    /* JADX INFO: renamed from: du */
    public final int m6500du() {
        return this.f5197kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m6501dy() {
        return this.f5194dy;
    }

    @Override // com.aspose.slides.IFontData
    public final String getFontName() {
        return this.f5199to.getFontName();
    }

    /* JADX INFO: renamed from: h4 */
    public final IGenericDictionary<Integer, byte[]> m6502h4() {
        return this.f5193du;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m6503k4() {
        return this.f5196k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m6507kk() {
        int i = this.f5197kk & 15;
        return i > 2 ? i == 8 ? 1 : 0 : i;
    }

    /* JADX INFO: renamed from: m9 */
    public final IGenericDictionary<Integer, byte[]> m6508m9() {
        return this.f5195h4;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m6509to() {
        return this.f5200x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m6510x1() {
        int i = this.f5197kk >> 4;
        if (i > 5) {
            return 0;
        }
        return i;
    }

    @Override // com.aspose.slides.IFontData
    public final String getFontName(IThemeEffectiveData iThemeEffectiveData) {
        return this.f5199to.getFontName(iThemeEffectiveData);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m6504k4(int i) {
        return this.f5193du.containsKey(Integer.valueOf(i)) ? this.f5198m9.get_Item(Integer.valueOf(i)) : "";
    }

    /* JADX INFO: renamed from: k4 */
    private String m6499k4(byte[] bArr) {
        C4772y9 c4772y9 = new C4772y9();
        try {
            return C14080ne.m66952k4(c4772y9.m19588x1(bArr));
        } finally {
            c4772y9.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6505k4(int i, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new ArgumentNullException("trueTypeData");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("eotData");
        }
        if (this.f5193du.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.f5193du.addItem(Integer.valueOf(i), bArr);
        this.f5195h4.addItem(Integer.valueOf(i), bArr2);
        this.f5198m9.addItem(Integer.valueOf(i), m6499k4(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6506k4(C1141ge c1141ge) {
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = c1141ge.f5198m9.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                this.f5198m9.addItem((Integer) keyValuePair.getKey(), (String) keyValuePair.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
