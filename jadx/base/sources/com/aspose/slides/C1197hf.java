package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.FontFallBackRulesCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12001c5;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14087rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.hf */
/* JADX INFO: loaded from: classes3.dex */
class C1197hf implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    private String f5486c5;

    /* JADX INFO: renamed from: du */
    private C14483t2 f5487du;

    /* JADX INFO: renamed from: dy */
    private C13688jj f5488dy;

    /* JADX INFO: renamed from: k4 */
    private final LoadOptions f5490k4;

    /* JADX INFO: renamed from: kk */
    private final C14317pv f5491kk;

    /* JADX INFO: renamed from: m9 */
    private C13688jj f5492m9;

    /* JADX INFO: renamed from: x1 */
    private final C13736km f5494x1;

    /* JADX INFO: renamed from: to */
    private FontFallBackRulesCollection f5493to = null;

    /* JADX INFO: renamed from: h4 */
    private C14483t2 f5489h4 = null;

    public C1197hf(LoadOptions loadOptions) {
        this.f5487du = null;
        this.f5492m9 = null;
        this.f5488dy = null;
        this.f5490k4 = loadOptions;
        this.f5494x1 = new C13736km(loadOptions.getDocumentLevelFontSources());
        C14317pv c14317pv = new C14317pv();
        this.f5491kk = c14317pv;
        this.f5487du = new C14483t2(c14317pv);
        this.f5488dy = new C13688jj(c14317pv);
        this.f5492m9 = new C13688jj(c14317pv);
    }

    /* JADX INFO: renamed from: c5 */
    private void m7113c5() {
        this.f5489h4 = new C14483t2(this.f5491kk);
        FontFallBackRulesCollection fontFallBackRulesCollection = this.f5493to;
        if (fontFallBackRulesCollection == null) {
            return;
        }
        IGenericEnumerator<IFontFallBackRule> it = fontFallBackRulesCollection.iterator();
        while (it.hasNext()) {
            try {
                FontFallBackRule fontFallBackRule = (FontFallBackRule) it.next();
                C14087rv.m67171x1(C14113y2.m67408k4("... Rule: 0x", C14114y9.m67460k4(fontFallBackRule.getRangeStartIndex(), "X2"), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, C14114y9.m67460k4(fontFallBackRule.getRangeEndIndex(), "X2")));
                FontFallBackRule fontFallBackRule2 = new FontFallBackRule(fontFallBackRule.getRangeStartIndex(), fontFallBackRule.getRangeEndIndex());
                fontFallBackRule2.m1493k4().addRange(fontFallBackRule.m1493k4());
                this.f5489h4.m70922k4(fontFallBackRule2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C0757ao m7114k4(C13688jj c13688jj, String str, C1205hi c1205hi) {
        C14744wn c14744wnM69260k4 = this.f5491kk.m69260k4(str);
        C0757ao c0757aoM63338k4 = c13688jj.m63338k4(c14744wnM69260k4);
        if (c0757aoM63338k4 != null) {
            return c0757aoM63338k4;
        }
        if (c1205hi.m7160ck()) {
            return null;
        }
        List.Enumerator<C14744wn> it = this.f5491kk.m69259k4(c1205hi, str).iterator();
        while (it.hasNext()) {
            try {
                C14744wn next = it.next();
                if (c0757aoM63338k4 == null) {
                    c0757aoM63338k4 = new C0757ao(c14744wnM69260k4, next);
                } else {
                    c0757aoM63338k4.m3684k4(next, false);
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
        c13688jj.m63340k4(c0757aoM63338k4);
        return c0757aoM63338k4;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f5494x1.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final boolean m7119du() {
        return this.f5494x1.m64005k4().m3688k4() > 0;
    }

    /* JADX INFO: renamed from: dy */
    public final void m7120dy() {
        this.f5494x1.m64009to();
    }

    /* JADX INFO: renamed from: h4 */
    public final C14483t2 m7121h4() {
        if (this.f5489h4 == null) {
            m7113c5();
        }
        return this.f5489h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m7130kk() {
        return this.f5486c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m7131m9() {
        this.f5494x1.m64008kk();
    }

    /* JADX INFO: renamed from: to */
    public final void m7132to() {
        C14483t2 c14483t2 = this.f5489h4;
        if (c14483t2 != null) {
            c14483t2.m70920k4();
            this.f5489h4 = null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final IFontFallBackRulesCollection m7133x1() {
        if (this.f5493to == null) {
            m7117k4(new FontFallBackRulesCollection());
        }
        return this.f5493to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C0758ap m7122k4() {
        return this.f5494x1.m64005k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final C1141ge m7134x1(String str) {
        if (m7119du()) {
            return m7122k4().m3689k4(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m7123k4(String str, float f, int i) {
        return this.f5494x1.m64006k4(str, f, i);
    }

    /* JADX INFO: renamed from: k4 */
    public final C14251ot m7124k4(String str, byte b, int i, float f, int i2, boolean z) {
        return this.f5494x1.m64007k4(str, b, i, f, i2, z);
    }

    /* JADX INFO: renamed from: k4 */
    private C14483t2 m7115k4(byte[] bArr, boolean z) {
        C14483t2 c14483t2 = new C14483t2(new C14317pv());
        if (z) {
            c14483t2.m70921k4(3584L, 3711L, "Angsana New");
        }
        if (bArr != null) {
            C1205hi c1205hi = new C1205hi(bArr);
            if (c1205hi.m7171to() == 9 || c1205hi.m7160ck()) {
                c14483t2.m70921k4(8352L, 8399L, "Courier New");
            }
            if (c1205hi.m7160ck()) {
                c14483t2.m70921k4(880L, 1023L, "Courier New");
                c14483t2.m70921k4(8448L, 8527L, "Courier New");
                c14483t2.m70921k4(8704L, 8959L, "Courier New");
                c14483t2.m70921k4(181L, 181L, "Courier New");
            }
        }
        return c14483t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m7116k4(List<C14744wn> list, String str, C1205hi c1205hi) {
        List.Enumerator it;
        C0757ao c0757aoM63339k4 = this.f5488dy.m63339k4(str);
        C0757ao c0757aoM7114k4 = m7114k4(this.f5492m9, str, c1205hi);
        List list2 = c0757aoM63339k4 != null ? new List(c0757aoM63339k4.m3685x1()) : null;
        int i = 0;
        if (c0757aoM7114k4 != null) {
            if (list2 != null) {
                int size = list2.size();
                List<C14744wn> listM3685x1 = c0757aoM7114k4.m3685x1();
                if (size > 0) {
                    it = listM3685x1.iterator();
                    while (it.hasNext()) {
                        try {
                            C14744wn next = it.next();
                            int i2 = 0;
                            while (i2 < size && next != list2.get_Item(i2)) {
                                i2++;
                            }
                            if (i2 >= size) {
                                list2.addItem(next);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } else {
                    list2.addRange(listM3685x1);
                }
            } else {
                list2 = new List(c0757aoM7114k4.m3685x1());
            }
        }
        if (list2 == null || list2.size() == 0) {
            return;
        }
        it = list2.iterator();
        while (it.hasNext()) {
            try {
                C14744wn c14744wn = (C14744wn) it.next();
                int i3 = i;
                while (true) {
                    if (i3 >= list.size()) {
                        break;
                    }
                    if (c14744wn == list.get_Item(i3)) {
                        if (i3 > i) {
                            list.removeAt(i3);
                            list.insertItem(i, c14744wn);
                        }
                        i++;
                    } else {
                        i3++;
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

    /* JADX INFO: renamed from: k4 */
    private void m7117k4(FontFallBackRulesCollection fontFallBackRulesCollection) {
        FontFallBackRulesCollection fontFallBackRulesCollection2 = this.f5493to;
        if (fontFallBackRulesCollection2 != null) {
            fontFallBackRulesCollection2.m1503k4(null);
        }
        this.f5493to = fontFallBackRulesCollection;
        m7132to();
        FontFallBackRulesCollection fontFallBackRulesCollection3 = this.f5493to;
        if (fontFallBackRulesCollection3 == null) {
            return;
        }
        fontFallBackRulesCollection3.m1503k4(new FontFallBackRulesCollection.AbstractC0415k4() { // from class: com.aspose.slides.hf.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.FontsManagerInternal.UserFallBackDataWasChanged()";
            }

            @Override // com.aspose.slides.FontFallBackRulesCollection.AbstractC0415k4
            /* JADX INFO: renamed from: k4 */
            public void mo1504k4() {
                C1197hf.this.m7132to();
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7125k4(IFontFallBackRulesCollection iFontFallBackRulesCollection) {
        if (this.f5493to != iFontFallBackRulesCollection) {
            m7117k4((FontFallBackRulesCollection) iFontFallBackRulesCollection);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7126k4(String str) {
        this.f5486c5 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7127k4(byte[] bArr, byte[] bArr2, String str, byte b, byte[] bArr3, byte b2, int i, boolean z) {
        C1141ge c1141geM3689k4 = m7122k4().m3689k4(str);
        if (c1141geM3689k4 != null && c1141geM3689k4.m6502h4().getKeys().containsItem(Integer.valueOf(i))) {
            throw new ArgumentException(C14113y2.m67402k4("Font {0} ({1}) already embedded", str, C14042ak.m66410k4(C12001c5.class, i)), "fontName");
        }
        this.f5494x1.m64004du();
        m7122k4().m3691k4(str, b, bArr3, b2 & 255, i, bArr, bArr2, z, this.f5490k4);
    }

    /* JADX INFO: renamed from: k4 */
    private C14744wn[] m7118k4(int i, C14483t2 c14483t2) {
        FontFallBackRule fontFallBackRule;
        if (c14483t2.m70925x1() >= 1 && (fontFallBackRule = (FontFallBackRule) c14483t2.m70919k4(((long) i) & 4294967295L)) != null) {
            return fontFallBackRule.m1493k4().toArray(new C14744wn[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String[] m7128k4(int i, String str, byte[] bArr) {
        C1205hi c1205hi = new C1205hi(bArr);
        C14744wn[] c14744wnArrM7118k4 = m7118k4(i, m7121h4());
        C14744wn[] c14744wnArrM7118k42 = m7118k4(i, this.f5487du);
        int i2 = 0;
        int length = c14744wnArrM7118k4 != null ? c14744wnArrM7118k4.length : 0;
        List<C14744wn> list = new List<>((c14744wnArrM7118k42 != null ? c14744wnArrM7118k42.length : 0) + length + 1);
        if (c14744wnArrM7118k4 != null) {
            list.addRange(AbstractC14092to.m67204k4((Object[]) c14744wnArrM7118k4));
        }
        if (c14744wnArrM7118k42 != null) {
            if (length > 0) {
                for (C14744wn c14744wn : c14744wnArrM7118k42) {
                    for (int i3 = 0; i3 < length && list.get_Item(i3) != c14744wn; i3++) {
                    }
                    list.addItem(c14744wn);
                }
            } else {
                list.addRange(AbstractC14092to.m67204k4((Object[]) c14744wnArrM7118k42));
            }
        }
        if (list.size() > 0) {
            m7116k4(list, str, c1205hi);
        }
        String[] strArr = new String[list.size()];
        List.Enumerator<C14744wn> it = list.iterator();
        while (it.hasNext()) {
            try {
                strArr[i2] = it.next().m72835k4();
                i2++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final String[] m7129k4(int i, byte[] bArr, boolean z) {
        C14744wn[] c14744wnArrM7118k4 = m7118k4(i, m7115k4(bArr, z));
        int i2 = 0;
        int length = c14744wnArrM7118k4 != null ? c14744wnArrM7118k4.length : 0;
        if (length == 0) {
            return null;
        }
        List list = new List(length + 1);
        list.addRange(AbstractC14092to.m67204k4((Object[]) c14744wnArrM7118k4));
        String[] strArr = new String[list.size()];
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                strArr[i2] = ((C14744wn) it.next()).m72835k4();
                i2++;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return strArr;
    }
}
