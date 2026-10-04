package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class FontFallBackRule implements IFontFallBackRule {

    /* JADX INFO: renamed from: du */
    private List<FontFallBackRulesCollection> f2300du;

    /* JADX INFO: renamed from: k4 */
    private long f2301k4;

    /* JADX INFO: renamed from: kk */
    private long f2302kk;

    /* JADX INFO: renamed from: to */
    private List<C14744wn> f2303to;

    /* JADX INFO: renamed from: x1 */
    private long f2304x1;

    public FontFallBackRule(long j, long j2) {
        this.f2304x1 = 0L;
        this.f2302kk = 0L;
        this.f2303to = null;
        this.f2300du = new List<>();
        this.f2304x1 = j;
        this.f2302kk = j2;
        m1491du();
        this.f2303to = new List<>();
        m1494k4(0L);
    }

    /* JADX INFO: renamed from: du */
    private void m1491du() {
        if ((this.f2304x1 & 4294967295L) > (4294967295L & this.f2302kk)) {
            throw new ArgumentException("End index must be equal or greater than start index!");
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m1492h4() {
        List.Enumerator<FontFallBackRulesCollection> it = this.f2300du.iterator();
        while (it.hasNext()) {
            try {
                it.next().m1502k4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final void addFallBackFonts(String str) {
        if (C14113y2.m67411k4(C14113y2.m67440x1(str))) {
            throw new ArgumentException("Empty name of the font can't be added to list!");
        }
        for (String str2 : C14113y2.m67369h4(str, ',')) {
            this.f2303to.addItem(new C14744wn(C14113y2.m67440x1(str2)));
            m1492h4();
        }
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final void clear() {
        if (this.f2303to.size() == 0) {
            return;
        }
        this.f2303to.clear();
        m1492h4();
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final int getCount() {
        return this.f2303to.size();
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final long getRangeEndIndex() {
        return this.f2302kk;
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final long getRangeStartIndex() {
        return this.f2304x1;
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final String get_Item(int i) {
        return this.f2303to.get_Item(i).m72835k4();
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final int indexOf(String str) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("Font's name doesn't specified!");
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        for (int i = 0; i < this.f2303to.size(); i++) {
            if (C14113y2.m67363du(this.f2303to.get_Item(i).m72835k4(), strM67440x1)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C14744wn> m1493k4() {
        return this.f2303to;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1498kk() {
        this.f2300du.clear();
        this.f2300du = null;
        this.f2303to.clear();
        this.f2303to = null;
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final void remove(String str) {
        int iIndexOf = indexOf(str);
        if (iIndexOf < 0) {
            return;
        }
        this.f2303to.removeAt(iIndexOf);
        m1492h4();
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final void removeAt(int i) {
        if (i < 0 || i >= this.f2303to.size()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "The target index is out of range!");
        }
        this.f2303to.removeAt(i);
        m1492h4();
    }

    public final void setRangeEndIndex(long j) {
        if ((this.f2302kk & 4294967295L) != (4294967295L & j)) {
            this.f2302kk = j;
            m1491du();
            m1492h4();
        }
    }

    public final void setRangeStartIndex(long j) {
        if ((this.f2304x1 & 4294967295L) != (4294967295L & j)) {
            this.f2304x1 = j;
            m1491du();
            m1492h4();
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m1499to() {
        List.Enumerator<C14744wn> it = this.f2303to.iterator();
        while (it.hasNext()) {
            try {
                it.next().m72836k4(false);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final String[] toArray() {
        int size = this.f2303to.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = this.f2303to.get_Item(i).m72835k4();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m1500x1() {
        return this.f2301k4;
    }

    public FontFallBackRule(long j, long j2, FontFallBackRule fontFallBackRule) {
        this(j, j2);
        if (fontFallBackRule.f2303to.size() > 0) {
            this.f2303to.addRange(fontFallBackRule.f2303to);
        }
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final void addFallBackFonts(String[] strArr) {
        if (strArr == null) {
            throw new ArgumentNullException("fontNames", "Any fonts weren't defined for fall back range!");
        }
        for (String str : strArr) {
            addFallBackFonts(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1494k4(long j) {
        this.f2301k4 = j;
    }

    @Override // com.aspose.slides.IFontFallBackRule
    public final String[] toArray(int i, int i2) {
        int size = this.f2303to.size();
        if (i < 0 || i >= size) {
            throw new ArgumentOutOfRangeException("startIndex", "The startIndex index is out of range!");
        }
        if (i2 < 1) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "The defined length of the out array must be greater then zero!");
        }
        if (i + i2 > size) {
            throw new ArgumentException("The demanded part of fonts is out of range!");
        }
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f2303to.get_Item(i + i3).m72835k4();
        }
        return strArr;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1501x1(FontFallBackRulesCollection fontFallBackRulesCollection) {
        if (fontFallBackRulesCollection != null && this.f2300du.containsItem(fontFallBackRulesCollection)) {
            this.f2300du.removeItem(fontFallBackRulesCollection);
        }
    }

    public FontFallBackRule(long j, long j2, String str) {
        this(j, j2);
        addFallBackFonts(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1495k4(FontFallBackRule fontFallBackRule, boolean z) {
        if (fontFallBackRule == null) {
            return;
        }
        List.Enumerator<C14744wn> it = fontFallBackRule.f2303to.iterator();
        while (it.hasNext()) {
            try {
                m1497k4(it.next(), z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public FontFallBackRule(long j, long j2, String[] strArr) {
        this(j, j2);
        addFallBackFonts(strArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1496k4(FontFallBackRulesCollection fontFallBackRulesCollection) {
        if (fontFallBackRulesCollection == null || this.f2300du.containsItem(fontFallBackRulesCollection)) {
            return;
        }
        this.f2300du.addItem(fontFallBackRulesCollection);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1497k4(C14744wn c14744wn, boolean z) {
        boolean zM27456k4;
        if (c14744wn == null) {
            throw new ArgumentNullException("sourceFallBackFontContext", "Font's context doesn't specified!");
        }
        if (z) {
            List.Enumerator<C14744wn> it = this.f2303to.iterator();
            while (it.hasNext()) {
                try {
                    if (c14744wn == it.next()) {
                        if (zM27456k4) {
                            return;
                        } else {
                            return;
                        }
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
        }
        this.f2303to.addItem(c14744wn);
    }
}
