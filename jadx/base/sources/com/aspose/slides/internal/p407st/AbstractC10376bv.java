package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.bv */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10376bv extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private List<AbstractC10571o4> f36874k4 = new List<>(10);

    /* JADX INFO: renamed from: x1 */
    private boolean f36875x1 = false;

    public AbstractC10376bv() {
        m51409um().m51916k4((byte) 15);
        m51409um().m51917k4(0);
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m50505fa() {
        return this.f36875x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        int iMo50440k4 = 0;
        for (int i = 0; i < m50513yj().size(); i++) {
            AbstractC10571o4 abstractC10571o4 = m50513yj().get_Item(i);
            if (!C7019kk.m27469x1(abstractC10571o4, AbstractC10456gv.class) || ((AbstractC10456gv) abstractC10571o4).m50513yj().size() != 0) {
                iMo50440k4 = abstractC10571o4.mo50440k4() + 8 + iMo50440k4;
            }
        }
        return iMo50440k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC10571o4 m50508kk(int i) {
        for (int i2 = 0; i2 < m50513yj().size(); i2++) {
            AbstractC10571o4 abstractC10571o4 = (AbstractC10571o4) C7019kk.m27452k4((Object) m50513yj().get_Item(i2), AbstractC10571o4.class);
            if (abstractC10571o4.m51404bv() == i) {
                return abstractC10571o4.m51411wy();
            }
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("{0} Start\n", C14067j2.m66727k4(this).mo48540du());
        c6765kp.m26796k4("Self: {0}\n", super.toString());
        for (int i = 0; i < m50513yj().size(); i++) {
            c6765kp.m26796k4("{0}\n", m50513yj().get_Item(i));
        }
        c6765kp.m26796k4("{0} End\n", C14067j2.m66727k4(this).mo48540du());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    public void mo50509up() {
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10571o4 m50510x1(int i) {
        return this.f36874k4.get_Item(i);
    }

    /* JADX INFO: renamed from: yj */
    public final List<AbstractC10571o4> m50513yj() {
        return this.f36874k4;
    }

    public AbstractC10376bv(int i) {
        m51409um().m51916k4((byte) 15);
        m51409um().m51917k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static List<AbstractC10571o4> m50503k4(AbstractC10376bv abstractC10376bv, int i) {
        List<AbstractC10571o4> list = new List<>();
        m50504k4(abstractC10376bv.m50513yj(), i, list);
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: x1 */
    public final C10626rv m50511x1(short s) {
        for (int i = 0; i < m50513yj().size(); i++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i), C10626rv.class) && m50513yj().get_Item(i).m51409um().m51922kk() == s) {
                return (C10626rv) m50513yj().get_Item(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10571o4 m50506k4(int i, short s) {
        for (int i2 = 0; i2 < m50513yj().size(); i2++) {
            AbstractC10571o4 abstractC10571o4 = (AbstractC10571o4) C7019kk.m27452k4((Object) m50513yj().get_Item(i2), AbstractC10571o4.class);
            if (abstractC10571o4.m51404bv() == i && abstractC10571o4.m51409um().m51922kk() == s) {
                return abstractC10571o4.m51411wy();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50512x1(boolean z) {
        this.f36875x1 = z;
        if (z) {
            return;
        }
        mo50509up();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m50504k4(IGenericEnumerable<AbstractC10571o4> iGenericEnumerable, int i, List<AbstractC10571o4> list) {
        IGenericEnumerator<AbstractC10571o4> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                if (next.m51404bv() == i) {
                    list.addItem(next);
                } else {
                    AbstractC10571o4 abstractC10571o4 = (AbstractC10571o4) C7019kk.m27452k4((Object) next, AbstractC10376bv.class);
                    if (abstractC10571o4 != null) {
                        m50504k4(((AbstractC10376bv) abstractC10571o4).m50513yj(), i, list);
                    }
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

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        long position = c3134k4.m13371ck().getPosition() + ((long) m51409um().m51914du());
        while (c3134k4.m13371ck().getPosition() < position) {
            m50513yj().addItem(C10576og.m51431k4(c3134k4, this));
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        for (int i = 0; i < m50513yj().size(); i++) {
            AbstractC10571o4 abstractC10571o4 = m50513yj().get_Item(i);
            if (!C7019kk.m27469x1(abstractC10571o4, AbstractC10456gv.class) || ((AbstractC10456gv) abstractC10571o4).m50513yj().size() != 0) {
                m50513yj().get_Item(i).m51412x1(c3149x1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50507k4(AbstractC10571o4 abstractC10571o4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArrMo50413kk = mo50413kk();
        abstractC10571o4.m51413x1(this);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = i7 + 1;
            if (i >= iArrMo50413kk.length || (iArrMo50413kk[i7] == (abstractC10571o4.m51404bv() & 65535) && ((i5 = iArrMo50413kk[i]) == Integer.MAX_VALUE || i5 == abstractC10571o4.m51409um().m51922kk()))) {
                break;
            } else {
                i7 += 2;
            }
        }
        if (i >= iArrMo50413kk.length) {
            m50513yj().addItem(abstractC10571o4);
            return;
        }
        int i8 = 0;
        while (i6 < m50513yj().size()) {
            AbstractC10571o4 abstractC10571o42 = m50513yj().get_Item(i6);
            if (iArrMo50413kk[i8] == (abstractC10571o42.m51404bv() & 65535) && ((i4 = iArrMo50413kk[i8 + 1]) == Integer.MAX_VALUE || i4 == abstractC10571o42.m51409um().m51922kk())) {
                i6++;
            } else {
                while (true) {
                    i8 += 2;
                    i2 = i8 + 1;
                    if (i2 >= iArrMo50413kk.length || (iArrMo50413kk[i8] == (abstractC10571o42.m51404bv() & 65535) && ((i3 = iArrMo50413kk[i2]) == Integer.MAX_VALUE || i3 == abstractC10571o42.m51409um().m51922kk()))) {
                        break;
                    }
                }
                if (i2 >= iArrMo50413kk.length) {
                    m50513yj().insertItem(i6, abstractC10571o4);
                    return;
                } else if (i8 > i7) {
                    m50513yj().insertItem(i6, abstractC10571o4);
                    return;
                }
            }
        }
        m50513yj().addItem(abstractC10571o4);
    }
}
