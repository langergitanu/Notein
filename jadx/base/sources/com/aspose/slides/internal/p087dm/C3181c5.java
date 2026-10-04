package com.aspose.slides.internal.p087dm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p099e3.C3552k4;
import com.aspose.slides.internal.p252lk.C6108x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.dm.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3181c5 {

    /* JADX INFO: renamed from: du */
    public Dictionary<String, String> f9454du;

    /* JADX INFO: renamed from: dy */
    private C3189to f9455dy;

    /* JADX INFO: renamed from: h4 */
    public String f9456h4;

    /* JADX INFO: renamed from: k4 */
    public C3181c5 f9457k4;

    /* JADX INFO: renamed from: kk */
    public Dictionary<String, String> f9458kk;

    /* JADX INFO: renamed from: m9 */
    public int f9459m9;

    /* JADX INFO: renamed from: to */
    public Dictionary<String, String> f9460to;

    /* JADX INFO: renamed from: x1 */
    public C3187kk f9461x1;

    public C3181c5() {
        this.f9457k4 = null;
        this.f9461x1 = new C3187kk();
        this.f9458kk = new Dictionary<>();
        this.f9460to = new Dictionary<>();
        this.f9454du = new Dictionary<>();
        this.f9456h4 = C14113y2.f47374k4;
        this.f9459m9 = -1;
        m13626k4();
        this.f9455dy = new C3189to(this);
    }

    /* JADX INFO: renamed from: k4 */
    private void m13626k4() {
        this.f9458kk.addItem("stroke-width", "0");
        this.f9458kk.addItem("fill", "black");
    }

    /* JADX INFO: renamed from: x1 */
    private static Dictionary<String, String> m13627x1(C3181c5 c3181c5) {
        Dictionary<String, String> dictionary = new Dictionary<>();
        if (c3181c5.f9461x1.containsKey("style")) {
            for (String str : C14113y2.m67417k4(c3181c5.f9461x1.get_Item("style").toString(), new String[]{";"}, 1)) {
                String[] strArrM67417k4 = C14113y2.m67417k4(str, new String[]{C18241k5.f55433h}, 1);
                if (strArrM67417k4.length >= 2) {
                    dictionary.addItem(C14113y2.m67440x1(strArrM67417k4[0]), C14113y2.m67440x1(strArrM67417k4[1]));
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: ar */
    public final C3189to m13628ar() {
        return this.f9455dy;
    }

    /* JADX INFO: renamed from: bv */
    public int m13629bv() {
        return C6108x1.m24743k4(this.f9461x1.m13690kk("fill-rule", "nonzero"));
    }

    /* JADX INFO: renamed from: c5 */
    public final void m13630c5(String str) {
        this.f9461x1.set_Item("transform", str);
    }

    /* JADX INFO: renamed from: du */
    public void m13631du(int i) {
        this.f9461x1.set_Item("clip-rule", C6108x1.m24744k4(i));
    }

    /* JADX INFO: renamed from: dy */
    public final void m13632dy(String str) {
        this.f9461x1.set_Item("clip-path", str);
    }

    /* JADX INFO: renamed from: h4 */
    public void m13633h4(int i) {
        this.f9461x1.set_Item("fill-rule", C6108x1.m24744k4(i));
    }

    /* JADX INFO: renamed from: ix */
    public final void m13634ix() {
        IGenericDictionary iGenericDictionaryM13627x1 = m13627x1(this);
        if ((this.f9461x1.containsKey("stroke") || iGenericDictionaryM13627x1.containsKey("stroke")) && !this.f9461x1.containsKey("stroke-width") && !iGenericDictionaryM13627x1.containsKey("stroke-width")) {
            this.f9461x1.m13684k4("stroke-width", "1");
        }
        Dictionary.Enumerator<String, String> it = this.f9458kk.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!this.f9461x1.containsKey((String) next.getKey()) && (!this.f9461x1.containsKey("style") || !iGenericDictionaryM13627x1.containsKey(next.getKey()))) {
                    this.f9461x1.m13684k4((String) next.getKey(), (String) next.getValue());
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

    /* JADX INFO: renamed from: lr */
    public final boolean m13636lr() {
        return this.f9461x1.containsKey("transform");
    }

    /* JADX INFO: renamed from: m9 */
    public final void m13637m9(String str) {
        this.f9461x1.set_Item("id", str);
    }

    /* JADX INFO: renamed from: qq */
    public C3181c5 m13638qq() {
        return this.f9457k4;
    }

    /* JADX INFO: renamed from: u4 */
    public boolean m13639u4() {
        return this.f9455dy.m13697k4() > 0;
    }

    /* JADX INFO: renamed from: um */
    public int m13640um() {
        return C6108x1.m24743k4(this.f9461x1.m13690kk("clip-rule", "nonzero"));
    }

    /* JADX INFO: renamed from: uz */
    public final String m13641uz() {
        return this.f9461x1.get_Item("id");
    }

    /* JADX INFO: renamed from: v4 */
    public final String m13642v4() {
        return this.f9461x1.get_Item("transform");
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m13643wl() {
        if (C7019kk.m27469x1(this, C3552k4.class)) {
            return true;
        }
        C3181c5 c3181c5 = this.f9457k4;
        return c3181c5 != null && c3181c5.m13643wl();
    }

    /* JADX INFO: renamed from: yd */
    public C3181c5 mo13644yd() {
        C3181c5 c3181c5M13677k4 = C3184h4.m13677k4(this.f9456h4);
        IGenericEnumerator<KeyValuePair<String, String>> it = this.f9461x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                if (!c3181c5M13677k4.f9461x1.containsKey(next.getKey())) {
                    c3181c5M13677k4.f9461x1.m13684k4(next.getKey(), next.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        Dictionary.Enumerator<String, String> it2 = this.f9458kk.iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next2 = it2.next();
                if (!c3181c5M13677k4.f9458kk.containsKey((String) next2.getKey())) {
                    c3181c5M13677k4.f9458kk.addItem((String) next2.getKey(), (String) next2.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        Dictionary.Enumerator<String, String> it3 = this.f9460to.iterator();
        while (it3.hasNext()) {
            try {
                KeyValuePair next3 = it3.next();
                if (!c3181c5M13677k4.f9460to.containsKey((String) next3.getKey())) {
                    c3181c5M13677k4.f9460to.addItem((String) next3.getKey(), (String) next3.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        Dictionary.Enumerator<String, String> it4 = this.f9454du.iterator();
        while (it4.hasNext()) {
            try {
                KeyValuePair next4 = it4.next();
                if (!c3181c5M13677k4.f9454du.containsKey((String) next4.getKey())) {
                    c3181c5M13677k4.f9454du.addItem((String) next4.getKey(), (String) next4.getValue());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        c3181c5M13677k4.f9457k4 = this.f9457k4;
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it5 = this.f9455dy.iterator();
        while (it5.hasNext()) {
            try {
                KeyValuePair<Integer, C3181c5> next5 = it5.next();
                C3181c5 c3181c5Mo13644yd = next5.getValue().mo13644yd();
                c3181c5Mo13644yd.f9457k4 = c3181c5M13677k4;
                c3181c5M13677k4.m13628ar().m13699k4(next5.getKey().intValue(), c3181c5Mo13644yd);
            } finally {
                if (C7019kk.m27456k4((Iterator) it5, (Class<IDisposable>) IDisposable.class)) {
                    it5.dispose();
                }
            }
        }
        return c3181c5M13677k4;
    }

    public C3181c5(String str, C3187kk c3187kk, C3181c5 c3181c5) {
        this.f9457k4 = null;
        this.f9461x1 = new C3187kk();
        this.f9458kk = new Dictionary<>();
        this.f9460to = new Dictionary<>();
        this.f9454du = new Dictionary<>();
        String str2 = C14113y2.f47374k4;
        this.f9459m9 = -1;
        this.f9456h4 = str;
        this.f9457k4 = c3181c5;
        this.f9461x1 = c3187kk;
        m13626k4();
        this.f9455dy = new C3189to(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m13635k4(C3181c5 c3181c5) {
        this.f9455dy.m13700k4(c3181c5);
    }
}
