package com.aspose.slides.internal.p329p4;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10521l7;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p4.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7186k4 extends C7185jd implements IGenericEnumerable<C7185jd> {

    /* JADX INFO: renamed from: k4 */
    private final List<C7185jd> f19754k4 = new List<>();

    /* JADX INFO: renamed from: du */
    public final String m27776du(int i) {
        return m27781k4(i, (String) null);
    }

    /* JADX INFO: renamed from: h4 */
    public final C7191up m27777h4(int i) {
        C7185jd c7185jdM27787x1 = m27787x1(i);
        if (c7185jdM27787x1 == null || !C7019kk.m27469x1(c7185jdM27787x1, C7191up.class)) {
            return null;
        }
        return (C7191up) C7019kk.m27452k4((Object) c7185jdM27787x1, C7191up.class);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C7185jd> iterator() {
        return this.f19754k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m27778k4() {
        return this.f19754k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public final C7185jd m27785kk(int i) {
        if (this.f19754k4.size() > i) {
            return this.f19754k4.get_Item(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final int m27786to(int i) {
        return m27779k4(i, -1);
    }

    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("[ ");
        List.Enumerator<C7185jd> it = this.f19754k4.iterator();
        while (it.hasNext()) {
            try {
                c6765kpOooO00o.m26791k4(it.next());
                c6765kpOooO00o.m26780k4(ControlChar.SPACE_CHAR);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c6765kpOooO00o.m26792k4("]");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7185jd m27787x1(int i) {
        C7185jd c7185jdM27772kk = this.f19754k4.get_Item(i);
        if (C7019kk.m27469x1(c7185jdM27772kk, C7184h4.class)) {
            c7185jdM27772kk = ((C7184h4) c7185jdM27772kk).m27772kk();
        }
        if (c7185jdM27772kk != null && c7185jdM27772kk.equals(C7185jd.m27775dy())) {
            c7185jdM27772kk = null;
        }
        return c7185jdM27772kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m27779k4(int i, int i2) {
        if (i < m27778k4()) {
            C7185jd c7185jd = this.f19754k4.get_Item(i);
            if (C7019kk.m27469x1(c7185jd, C7179c5.class)) {
                return ((C7179c5) c7185jd).m27752kk();
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: x1 */
    public final float[] m27788x1() {
        float[] fArr = new float[m27778k4()];
        for (int i = 0; i < m27778k4(); i++) {
            C7185jd c7185jdM27787x1 = m27787x1(i);
            fArr[i] = C7019kk.m27469x1(c7185jdM27787x1, C7179c5.class) ? ((C7179c5) c7185jdM27787x1).m27753to() : 0.0f;
        }
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final <T> List<T> m27780k4(Class<T> cls) {
        C10521l7 c10521l7 = (List<T>) new List();
        for (int i = 0; i < this.f19754k4.size(); i++) {
            if (C7019kk.m27469x1(this.f19754k4.get_Item(i), cls)) {
                c10521l7.addItem(C7019kk.m27452k4((Object) this.f19754k4.get_Item(i), (Class) cls));
            }
        }
        return c10521l7;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m27781k4(int i, String str) {
        if (i < m27778k4()) {
            C7185jd c7185jd = this.f19754k4.get_Item(i);
            if (C7019kk.m27469x1(c7185jd, C7182dy.class)) {
                return ((C7182dy) c7185jd).m27766k4();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27782k4(int i) {
        this.f19754k4.removeAt(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27783k4(C7185jd c7185jd) {
        this.f19754k4.addItem(c7185jd);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27784k4(float[] fArr) {
        this.f19754k4.clear();
        for (float f : fArr) {
            m27783k4(new C7181du(f));
        }
    }
}
