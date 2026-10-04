package com.aspose.slides.internal.p407st;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.kp */
/* JADX INFO: loaded from: classes4.dex */
public class C10513kp extends AbstractC10376bv {

    /* JADX INFO: renamed from: k4 */
    private static final int[] f37155k4 = {4040, Integer.MAX_VALUE, 2005, Integer.MAX_VALUE, 4004, Integer.MAX_VALUE, 4005, Integer.MAX_VALUE, 4011, Integer.MAX_VALUE, 4009, Integer.MAX_VALUE, 4003, Integer.MAX_VALUE};

    public C10513kp() {
        m51409um().m51917k4(1010);
    }

    /* JADX INFO: renamed from: c5 */
    public final C10536m5 m51121c5() {
        return (C10536m5) m50508kk(4003);
    }

    /* JADX INFO: renamed from: du */
    public final C10612qv m51122du() {
        return (C10612qv) m50508kk(4004);
    }

    /* JADX INFO: renamed from: dy */
    public final C10442fp m51123dy() {
        return (C10442fp) m50508kk(4009);
    }

    /* JADX INFO: renamed from: h4 */
    public final C10723xz m51124h4() {
        return (C10723xz) m50508kk(4005);
    }

    /* JADX INFO: renamed from: jd */
    public final List<C10536m5> m51125jd() {
        List<C10536m5> list = new List<>();
        List.Enumerator<AbstractC10571o4> it = AbstractC10376bv.m50503k4(this, 4003).iterator();
        while (it.hasNext()) {
            try {
                list.addItem((C10536m5) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37155k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10356ak m51126m9() {
        return (C10356ak) m50508kk(4011);
    }

    /* JADX INFO: renamed from: to */
    public final C10699wt m51127to() {
        return (C10699wt) m50508kk(2005);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10476i5 m51128x1() {
        return (C10476i5) m50508kk(4040);
    }
}
