package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.mb */
/* JADX INFO: loaded from: classes3.dex */
class C13827mb {

    /* JADX INFO: renamed from: c5 */
    private final IGenericDictionary<Integer, Integer> f46188c5;

    /* JADX INFO: renamed from: du */
    private final Dictionary<String, Integer> f46189du;

    /* JADX INFO: renamed from: dy */
    private FontsManager f46190dy;

    /* JADX INFO: renamed from: h4 */
    private final String[] f46191h4;

    /* JADX INFO: renamed from: jd */
    private final IGenericList<Integer> f46192jd;

    /* JADX INFO: renamed from: m9 */
    private boolean f46193m9;

    /* JADX INFO: renamed from: x1 */
    public final List<C14382rc> f46194x1;

    /* JADX INFO: renamed from: kk */
    private static final Object f46186kk = new Object();

    /* JADX INFO: renamed from: to */
    private static final Object f46187to = new Object();

    /* JADX INFO: renamed from: k4 */
    public static final FontData f46185k4 = new FontData("Arial");

    public C13827mb() {
        this.f46191h4 = new String[3];
        this.f46188c5 = new Dictionary();
        this.f46192jd = new List();
        this.f46194x1 = new List<>();
        this.f46189du = new Dictionary<>();
    }

    /* JADX INFO: renamed from: x1 */
    private int m64795x1(String str) {
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f46189du.tryGetValue(str, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            return 65535 & iIntValue;
        }
        return -1;
    }

    /* JADX INFO: renamed from: du */
    public final int m64796du() {
        return this.f46192jd.size();
    }

    /* JADX INFO: renamed from: dy */
    public final void m64797dy() {
        this.f46188c5.clear();
        this.f46192jd.clear();
    }

    /* JADX INFO: renamed from: h4 */
    public final IGenericList<C14382rc> m64798h4() {
        return this.f46194x1.asReadOnly();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m64799k4(int i, IFontData iFontData) {
        return m64800k4(i, iFontData, false, new C14093tq<>());
    }

    /* JADX INFO: renamed from: kk */
    public final int m64807kk() {
        List.Enumerator<C14382rc> it = this.f46194x1.iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                if (it.next().m70070kk().m67302x1()) {
                    i++;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m64809m9() {
        return this.f46193m9;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: to */
    public final IGenericList<IFontData> m64810to() {
        List list = new List();
        synchronized (f46187to) {
            try {
                IGenericEnumerator<Integer> it = this.f46192jd.iterator();
                while (it.hasNext()) {
                    try {
                        IFontData iFontDataM70073x1 = m64802k4(((Integer) C7019kk.m27464to(it.next(), Integer.TYPE)).intValue() & 65535).m70073x1();
                        if (!list.containsItem(iFontDataM70073x1)) {
                            list.addItem(iFontDataM70073x1);
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public C13827mb(C13827mb c13827mb) {
        this.f46191h4 = new String[3];
        this.f46188c5 = new Dictionary();
        this.f46192jd = new List();
        this.f46194x1 = new List<>();
        this.f46189du = new Dictionary<>();
        List.Enumerator<C14382rc> it = c13827mb.f46194x1.iterator();
        while (it.hasNext()) {
            try {
                C14382rc next = it.next();
                m64800k4(next.m70066k4(), next.m70073x1(), false, next.m70070kk().Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<C14382rc> it2 = this.f46194x1.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m70065h4();
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it2 = this.f46194x1.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().m70069k4(false);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (this.f46194x1.size() > 200) {
            this.f46194x1.clear();
            this.f46189du.clear();
            m64799k4(0, (IFontData) new FontData("Arial"));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final int m64800k4(int i, IFontData iFontData, boolean z, C14093tq<Integer> c14093tq) throws Throwable {
        Throwable th;
        int iM64795x1;
        IFontData iFontData2;
        int i2 = 65535;
        if (m64794k4(iFontData)) {
            iFontData2 = iFontData;
        } else if (iFontData.getFontName() == null) {
            int iM64795x12 = m64795x1("00Arial");
            this.f46194x1.get_Item(iM64795x12).m70069k4(m64809m9());
            i2 = 65535 & iM64795x12;
            iFontData2 = iFontData;
        } else {
            if ("Arial".equals(iFontData.getFontName())) {
                i = 0;
            }
            int i3 = i;
            String strM64791k4 = m64791k4(i3, (FontData) iFontData);
            synchronized (f46186kk) {
                try {
                    try {
                        iM64795x1 = m64795x1(strM64791k4);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                if (z || iM64795x1 == -1) {
                    if (this.f46194x1.size() >= 65535) {
                        throw new InvalidOperationException();
                    }
                    iFontData2 = iFontData;
                    this.f46194x1.addItem(new C14382rc(this, i3, iFontData2, c14093tq.Clone(), m64809m9()));
                    int size = (this.f46194x1.size() - 1) & 65535;
                    if (iM64795x1 == -1) {
                        this.f46189du.addItem(strM64791k4, Integer.valueOf(size));
                    }
                    i2 = size;
                    th = th;
                    throw th;
                }
                try {
                    this.f46194x1.get_Item(iM64795x1).m70069k4(m64809m9());
                    i2 = iM64795x1 & 65535;
                    iFontData2 = iFontData;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        m64792k4(iFontData2, i2);
        return i2;
    }

    /* JADX INFO: renamed from: kk */
    public final int m64808kk(int i) {
        if (this.f46188c5.containsKey(Integer.valueOf(i))) {
            return this.f46188c5.get_Item(Integer.valueOf(i)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C14382rc> m64811x1(final int i, final IFontData iFontData) {
        return this.f46194x1.findAll(new AbstractC14041ai<C14382rc>() { // from class: com.aspose.slides.mb.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C14382rc c14382rc) {
                return C13827mb.m64793k4(i, c14382rc, iFontData);
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public static int m64790k4(String str) {
        if (str != null && str.length() > 5 && C14113y2.m67375k4(str, 4, TranslateLanguage.LITHUANIAN, 0, 2) == 0) {
            return 0;
        }
        if (str == null || str.length() <= 5 || C14113y2.m67375k4(str, 4, "ea", 0, 2) != 0) {
            return (str == null || str.length() <= 5 || C14113y2.m67375k4(str, 4, TranslateLanguage.CZECH, 0, 2) != 0) ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14382rc m64812x1(final int i) {
        int iFindIndex = this.f46194x1.findIndex(new AbstractC14041ai<C14382rc>() { // from class: com.aspose.slides.mb.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14041ai
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public boolean invoke(C14382rc c14382rc) {
                return c14382rc.m70070kk().m67302x1() && c14382rc.m70070kk().m67297k4().intValue() == i;
            }
        });
        return iFindIndex == -1 ? m64802k4(m64795x1("00Arial")) : m64802k4(iFindIndex);
    }

    /* JADX INFO: renamed from: k4 */
    public final FontsManager m64801k4() {
        return this.f46190dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64813x1() {
        IGenericEnumerator<C14382rc> it = m64798h4().iterator();
        while (it.hasNext()) {
            try {
                it.next().m70074x1(null);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C14382rc m64802k4(int i) {
        C14382rc c14382rc;
        if ((i == 65535 || i >= this.f46194x1.size()) && (i = m64795x1("00Arial")) == -1) {
            if (this.f46194x1.size() == 0) {
                m64799k4(0, (IFontData) new FontData("Arial"));
            }
            c14382rc = this.f46194x1.get_Item(0);
        } else {
            c14382rc = this.f46194x1.get_Item(i);
        }
        return c14382rc;
    }

    /* JADX INFO: renamed from: k4 */
    private String m64791k4(int i, FontData fontData) {
        this.f46191h4[0] = C14098up.m67319k4((byte) i, (InterfaceC14073kp) C11697x1.m55250kk());
        this.f46191h4[1] = C14098up.m67319k4(fontData.m1490x1(), (InterfaceC14073kp) C11697x1.m55250kk());
        this.f46191h4[2] = fontData.getFontName();
        String[] strArr = this.f46191h4;
        return C14113y2.m67402k4("{0}{1}{2}", strArr[0], strArr[1], strArr[2]);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64803k4(FontsManager fontsManager) {
        this.f46190dy = fontsManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r7.f46188c5.set_Item(java.lang.Integer.valueOf(r9), (java.lang.Integer) r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r1, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r1.dispose();
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m64792k4(IFontData iFontData, int i) {
        if (m64794k4(iFontData) || C14113y2.m67359c5(iFontData.getFontName(), "+m")) {
            return;
        }
        synchronized (f46187to) {
            try {
                if (!this.f46188c5.containsKey(Integer.valueOf(i))) {
                    IGenericEnumerator<KeyValuePair<TKey, TValue>> it = this.f46188c5.iterator();
                    int iIntValue = 65535;
                    while (true) {
                        try {
                            if (it.hasNext()) {
                                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                                if (C14113y2.m67363du(m64802k4(((Integer) keyValuePair.getKey()).intValue() & 65535).m70073x1().getFontName(), iFontData.getFontName())) {
                                    break;
                                } else if (iIntValue == 65535 || (iIntValue & 65535) < (((Integer) keyValuePair.getValue()).intValue() & 65535)) {
                                    iIntValue = ((Integer) keyValuePair.getValue()).intValue();
                                }
                            } else {
                                this.f46188c5.set_Item(Integer.valueOf(i), Integer.valueOf(iIntValue == 65535 ? 0 : iIntValue + 1));
                                this.f46192jd.addItem(Integer.valueOf(i));
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64804k4(boolean z) {
        this.f46193m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m64793k4(int i, C14382rc c14382rc, IFontData iFontData) {
        boolean z = c14382rc.m70066k4() == i && C14113y2.m67363du(c14382rc.m70073x1().getFontName(), iFontData.getFontName());
        return z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m64794k4(IFontData iFontData) {
        return iFontData == null || C14113y2.m67411k4(iFontData.getFontName());
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final boolean m64805k4(IFontData iFontData, IFontData iFontData2) {
        boolean z;
        IEnumerator it = AbstractC14106wy.getValues(C7019kk.m27443k4((Class<?>) C0887d9.class)).iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                try {
                    List<C14382rc> listM64811x1 = m64811x1(C7019kk.m27462to(it.next(), 11), iFontData);
                    if (listM64811x1 != null && listM64811x1.size() != 0) {
                        List.Enumerator<C14382rc> it2 = listM64811x1.iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            try {
                                C14382rc next = it2.next();
                                if (((FontData) C7019kk.m27452k4((Object) next.m70073x1(), FontData.class)) != null) {
                                    next.m70068k4(iFontData2);
                                    i++;
                                }
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        if (i > 0) {
                            z = true;
                        }
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    throw th2;
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    public final boolean m64806k4(IFontData iFontData, IFontData iFontData2, int i) {
        boolean z;
        IEnumerator it = AbstractC14106wy.getValues(C7019kk.m27443k4((Class<?>) C0887d9.class)).iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                try {
                    List<C14382rc> listM64811x1 = m64811x1(C7019kk.m27462to(it.next(), 11), iFontData);
                    if (listM64811x1 != null && listM64811x1.size() != 0) {
                        List.Enumerator<C14382rc> it2 = listM64811x1.iterator();
                        int i2 = 0;
                        while (it2.hasNext()) {
                            try {
                                C14382rc next = it2.next();
                                if (!next.m70063du()) {
                                    if (((FontData) C7019kk.m27452k4((Object) next.m70073x1(), FontData.class)) != null) {
                                        next.m70074x1(iFontData2);
                                        next.m70067k4(i);
                                    }
                                }
                                i2++;
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        if (i2 > 0) {
                            z = true;
                        }
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    throw th2;
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            ((IDisposable) it).dispose();
        }
        return z;
    }
}
