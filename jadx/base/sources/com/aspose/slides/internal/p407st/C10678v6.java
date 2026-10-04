package com.aspose.slides.internal.p407st;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.v6 */
/* JADX INFO: loaded from: classes4.dex */
public class C10678v6 extends C10556n5 {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f37440k4 = {1007, Integer.MAX_VALUE, 2032, 6, 4003, Integer.MAX_VALUE, EditingLanguage.BELARUSIAN, Integer.MAX_VALUE, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 0, 4057, Integer.MAX_VALUE, EditingLanguage.BELARUSIAN, Integer.MAX_VALUE, EditingLanguage.FRENCH_FRANCE, Integer.MAX_VALUE, 2032, 1, 4026, 3, 5000, Integer.MAX_VALUE, EditingLanguage.HUNGARIAN, Integer.MAX_VALUE, EditingLanguage.ICELANDIC, Integer.MAX_VALUE, EditingLanguage.THAI, Integer.MAX_VALUE, 1053, Integer.MAX_VALUE, 1052, Integer.MAX_VALUE, 11021, Integer.MAX_VALUE, 11019, Integer.MAX_VALUE, 4026, 2};

    /* JADX INFO: renamed from: x1 */
    private SortedList<Integer, C10692wh> f37441x1 = null;

    public C10678v6() {
        m51409um().m51917k4(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m51840c5() {
        C10626rv c10626rvM51759k4 = m51759k4((short) 2);
        return c10626rvM51759k4 != null ? c10626rvM51759k4.m51659x1() : "";
    }

    /* JADX INFO: renamed from: ck */
    public final C10536m5[] m51841ck() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10536m5 c10536m5 = (C10536m5) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10536m5.class);
            if (c10536m5 != null) {
                list.addItem(c10536m5);
            }
        }
        return (C10536m5[]) list.toArray(new C10536m5[0]);
    }

    /* JADX INFO: renamed from: jd */
    public final C10675uz[] m51842jd() {
        List list = new List();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10675uz c10675uz = (C10675uz) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10675uz.class);
            if (c10675uz != null && c10675uz.m51409um().m51922kk() == 6) {
                list.addItem(c10675uz);
            }
        }
        return (C10675uz[]) list.toArray(new C10675uz[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10536m5 m51843k4(int i) {
        for (int i2 = 0; i2 < m50513yj().size(); i2++) {
            C10536m5 c10536m5 = (C10536m5) C7019kk.m27452k4((Object) m50513yj().get_Item(i2), C10536m5.class);
            if (c10536m5 != null && c10536m5.m51409um().m51922kk() == ((short) i)) {
                return (C10536m5) c10536m5.m51411wy();
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37440k4;
    }

    /* JADX INFO: renamed from: ks */
    public final C10418eb m51845ks() {
        return (C10418eb) m50508kk(EditingLanguage.BELARUSIAN);
    }

    /* JADX INFO: renamed from: rv */
    public final SortedList<Integer, C10692wh> m51846rv() {
        if (this.f37441x1 == null) {
            for (int i = 0; i < m50513yj().size(); i++) {
                C10692wh c10692wh = (C10692wh) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10692wh.class);
                if (c10692wh != null) {
                    if (this.f37441x1 == null) {
                        this.f37441x1 = new SortedList<>();
                    }
                    this.f37441x1.addItem(Integer.valueOf(c10692wh.m51408lr()), c10692wh);
                }
            }
        }
        return this.f37441x1;
    }

    /* JADX INFO: renamed from: to */
    public final C10575of m51847to(int i) {
        C10350a0 c10350a0M51390x1;
        C10567nz c10567nzM51756du = m51756du();
        if (c10567nzM51756du == null || (c10350a0M51390x1 = c10567nzM51756du.m51390x1()) == null) {
            return null;
        }
        List.Enumerator<AbstractC10571o4> it = c10350a0M51390x1.m50513yj().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                if ((next.m51404bv() & 65535) == 4013 && next.m51409um().m51922kk() == i) {
                    return (C10575of) next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51844k4(String str) {
        m51760k4((short) 2, str);
    }
}
