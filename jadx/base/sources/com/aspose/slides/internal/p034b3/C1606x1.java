package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p022ai.C1371ck;
import com.aspose.slides.internal.p022ai.C1377k4;
import com.aspose.slides.internal.p022ai.InterfaceC1380to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p513xw.C12702ix;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1606x1 extends C1594m9 {

    /* JADX INFO: renamed from: k4 */
    protected int f6214k4;

    /* JADX INFO: renamed from: to */
    protected Dictionary<Integer, Object> f6216to;

    /* JADX INFO: renamed from: x1 */
    protected int f6217x1;

    /* JADX INFO: renamed from: dy */
    private int f6212dy = 0;

    /* JADX INFO: renamed from: kk */
    protected int f6215kk = -1;

    /* JADX INFO: renamed from: c5 */
    private C1606x1 f6210c5 = null;

    /* JADX INFO: renamed from: jd */
    private C12702ix f6213jd = null;

    /* JADX INFO: renamed from: du */
    public boolean f6211du = false;

    /* JADX INFO: renamed from: c5 */
    public final int m8652c5() {
        if (m8662h4(27)) {
            return ((Integer) C7019kk.m27464to(m8655du(27), Integer.TYPE)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ck */
    public final int m8653ck() {
        C1377k4 c1377k4 = (C1377k4) m8655du(18);
        int i = c1377k4 != null ? c1377k4.f5974kk : 0;
        Object objM8655du = m8655du(22);
        return objM8655du != null ? ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue() + i : i;
    }

    /* JADX INFO: renamed from: du */
    public final int m8654du() {
        return m8671ks() + m8653ck() + mo8658e_() + m8656dy() + m8682yj();
    }

    /* JADX INFO: renamed from: dy */
    public final int m8656dy() {
        C1377k4 c1377k4 = (C1377k4) m8655du(17);
        int i = c1377k4 != null ? c1377k4.f5974kk : 0;
        Object objM8655du = m8655du(21);
        return objM8655du != null ? ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue() + i : i;
    }

    /* JADX INFO: renamed from: e_ */
    public int mo8658e_() {
        return this.f6217x1;
    }

    /* JADX INFO: renamed from: f_ */
    public final int m8659f_() {
        return m8663jd() + m8677up() + m8678x1() + m8660fa() + m8652c5();
    }

    /* JADX INFO: renamed from: fa */
    public final int m8660fa() {
        C1377k4 c1377k4 = (C1377k4) m8655du(15);
        int i = c1377k4 != null ? c1377k4.f5974kk : 0;
        Object objM8655du = m8655du(19);
        return objM8655du != null ? ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue() + i : i;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m8661h4() {
        m8676to(-1);
    }

    /* JADX INFO: renamed from: jd */
    public final int m8663jd() {
        if (m8662h4(28)) {
            return ((Integer) C7019kk.m27464to(m8655du(28), Integer.TYPE)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m8664k4() {
        return this.f6212dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8670kk(int i) {
        this.f6217x1 = i;
    }

    /* JADX INFO: renamed from: ks */
    public final int m8671ks() {
        Object objM8655du = m8655du(30);
        if (objM8655du != null) {
            return ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m8672m9() {
        return this.f6215kk;
    }

    /* JADX INFO: renamed from: ne */
    public final Dictionary<Integer, Object> m8674ne() {
        return this.f6216to;
    }

    /* JADX INFO: renamed from: rv */
    public final int m8675rv() {
        C1371ck c1371ck = (C1371ck) C7019kk.m27452k4(m8655du(45), C1371ck.class);
        if (c1371ck != null) {
            return c1371ck.m8127x1();
        }
        return 0;
    }

    /* JADX INFO: renamed from: to */
    public final void m8676to(int i) {
        this.f6215kk = i;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(super.toString());
        c6765kp.m26792k4(" {ipd=").m26805kk(m8678x1());
        c6765kp.m26792k4(", bpd=").m26805kk(mo8658e_());
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    public final int m8677up() {
        C1377k4 c1377k4 = (C1377k4) m8655du(16);
        int i = c1377k4 != null ? c1377k4.f5974kk : 0;
        Object objM8655du = m8655du(20);
        return objM8655du != null ? ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue() + i : i;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m8678x1() {
        return this.f6214k4;
    }

    /* JADX INFO: renamed from: x6 */
    public final C1606x1 m8681x6() {
        return this.f6210c5;
    }

    /* JADX INFO: renamed from: yj */
    public final int m8682yj() {
        Object objM8655du = m8655du(29);
        if (objM8655du != null) {
            return ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: du */
    public final Object m8655du(int i) {
        Dictionary<Integer, Object> dictionary = this.f6216to;
        if (dictionary == null || !dictionary.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return this.f6216to.get_Item(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: dy */
    public final int m8657dy(int i) {
        Object objM8655du = m8655du(i);
        if (objM8655du == null) {
            return 0;
        }
        if (C7019kk.m27469x1(objM8655du, Integer.class)) {
            return ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue();
        }
        throw new ArgumentException(C14113y2.m67408k4("Trait ", C14067j2.m66726k4(i).mo48540du(), " could not be converted to an int"));
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m8662h4(int i) {
        return m8655du(i) != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12023wl m8665k4(List<C1606x1> list, boolean z) {
        C12023wl c12023wlClone = C12023wl.f40585k4.Clone();
        if (list != null) {
            List.Enumerator<C1606x1> it = list.iterator();
            while (it.hasNext()) {
                try {
                    C12023wl c12023wlClone2 = it.next().mo8505k4(z).Clone();
                    c12023wlClone.m56860k4(C14116yg.m67483k4(c12023wlClone2.m56865x1(), c12023wlClone.m56865x1()));
                    c12023wlClone.m56866x1(C14116yg.m67483k4(c12023wlClone2.m56862kk(), c12023wlClone.m56862kk()));
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        if (!z) {
            return c12023wlClone;
        }
        int iM56865x1 = c12023wlClone.m56865x1();
        Class cls = Integer.TYPE;
        if (iM56865x1 == ((Integer) C7019kk.m27467x1(cls)).intValue()) {
            c12023wlClone.m56860k4(m8678x1());
        }
        if (c12023wlClone.m56862kk() == ((Integer) C7019kk.m27467x1(cls)).intValue()) {
            c12023wlClone.m56866x1(mo8658e_());
        }
        return c12023wlClone;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m8673m9(int i) {
        Object objM8655du = m8655du(i);
        return C7019kk.m27469x1(objM8655du, Boolean.class) && ((Boolean) C7019kk.m27464to(objM8655du, Boolean.TYPE)).booleanValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8679x1(int i) {
        this.f6214k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public C12023wl mo8505k4(boolean z) {
        return new C12023wl(m8659f_(), m8654du());
    }

    /* JADX INFO: renamed from: x1 */
    public void mo8680x1(C1606x1 c1606x1) {
        this.f6210c5 = c1606x1;
    }

    @Override // com.aspose.slides.internal.p034b3.C1594m9
    /* JADX INFO: renamed from: k4 */
    public Object mo8601k4(C1594m9 c1594m9) {
        C1606x1 c1606x1 = (C1606x1) super.mo8601k4(c1594m9);
        if (this.f6216to != null) {
            c1606x1.f6216to = new Dictionary<>(this.f6216to);
        }
        return c1606x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8666k4(int i) {
        this.f6212dy = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8667k4(int i, Object obj) {
        if (this.f6216to == null) {
            this.f6216to = new Dictionary<>();
        }
        this.f6216to.set_Item(Integer.valueOf(i), obj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8668k4(Dictionary<Integer, Object> dictionary) {
        if (dictionary != null) {
            this.f6216to = new Dictionary<>(dictionary);
        } else {
            this.f6216to = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8475k4(InterfaceC1380to interfaceC1380to) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo8582k4(C1606x1 c1606x1) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8669k4(C12702ix c12702ix) {
        this.f6213jd = c12702ix;
    }
}
