package com.aspose.slides.internal.p407st;

import androidx.core.view.PointerIconCompat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.PptException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.iu */
/* JADX INFO: loaded from: classes4.dex */
public final class C10483iu extends AbstractC10376bv {

    /* JADX INFO: renamed from: kk */
    private static final int[] f37085kk = {1000, Integer.MAX_VALUE, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, Integer.MAX_VALUE, 1006, Integer.MAX_VALUE, 1008, Integer.MAX_VALUE, 4113, 0, AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, 1, 4085, 2};

    /* JADX INFO: renamed from: k4 */
    private long f37086k4 = 2;

    /* JADX INFO: renamed from: x1 */
    private C10641ss f37087x1 = null;

    /* JADX INFO: renamed from: rv */
    private long m50950rv() {
        long j = this.f37086k4;
        this.f37086k4 = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: c5 */
    public final List<C10431f3> m50951c5() {
        List<C10431f3> list = new List<>();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10431f3 c10431f3 = (C10431f3) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10431f3.class);
            if (c10431f3 != null) {
                list.addItem(c10431f3);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: ck */
    public final C10755zn m50952ck() {
        C10755zn c10755zn = null;
        int i = 0;
        for (int i2 = 0; i2 < m50513yj().size(); i2++) {
            if ((m50513yj().get_Item(i2).m51404bv() & 65535) == 6002) {
                c10755zn = (C10755zn) m50513yj().get_Item(i2);
                i++;
            }
        }
        if (i != 0) {
            return c10755zn;
        }
        throw new PptException("Can't open presentation. PersistDirectoryAtom record not found.");
    }

    /* JADX INFO: renamed from: du */
    public final long m50953du() {
        return m50952ck().m52162k4(m50513yj());
    }

    /* JADX INFO: renamed from: dy */
    public final List<C10678v6> m50954dy() {
        List<C10678v6> list = new List<>();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10678v6 c10678v6 = (C10678v6) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10678v6.class);
            if (c10678v6 != null) {
                list.addItem(c10678v6);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m50955h4() {
        long jM67508x1 = 0;
        for (int i = 0; i < m50513yj().size(); i++) {
            if (C7019kk.m27469x1(m50513yj().get_Item(i), InterfaceC10673uw.class)) {
                jM67508x1 = C14116yg.m67508x1(jM67508x1, ((InterfaceC10673uw) m50513yj().get_Item(i)).mo51092dy());
            }
        }
        return jM67508x1;
    }

    /* JADX INFO: renamed from: jd */
    public final List<C10504k5> m50956jd() {
        List<C10504k5> list = new List<>();
        for (int i = 0; i < m50513yj().size(); i++) {
            C10504k5 c10504k5 = (C10504k5) C7019kk.m27452k4((Object) m50513yj().get_Item(i), C10504k5.class);
            if (c10504k5 != null) {
                list.addItem(c10504k5);
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m50957k4(C10504k5 c10504k5) {
        c10504k5.mo51093k4(m50950rv());
        m50507k4((AbstractC10571o4) c10504k5);
        return c10504k5.mo51092dy();
    }

    /* JADX INFO: renamed from: kk */
    public final C10504k5 m50963kk(long j) {
        C10504k5 c10504k5;
        List.Enumerator<AbstractC10571o4> it = m50513yj().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                InterfaceC10673uw interfaceC10673uw = (InterfaceC10673uw) C7019kk.m27452k4((Object) next, InterfaceC10673uw.class);
                if (interfaceC10673uw != null && interfaceC10673uw.mo51092dy() == j && (c10504k5 = (C10504k5) C7019kk.m27452k4((Object) next, C10504k5.class)) != null) {
                    return c10504k5;
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

    /* JADX INFO: renamed from: ks */
    public final C10372bq m50964ks() {
        for (int size = m50513yj().size() - 1; size >= 0; size--) {
            if ((m50513yj().get_Item(size).m51404bv() & 65535) == 4085) {
                return (C10372bq) m50513yj().get_Item(size);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10641ss m50965m9() {
        C10641ss c10641ss = this.f37087x1;
        if (c10641ss != null) {
            return c10641ss;
        }
        C10641ss c10641ss2 = (C10641ss) m50508kk(1000);
        this.f37087x1 = c10641ss2;
        if (c10641ss2 == null && m50505fa()) {
            C10641ss c10641ss3 = new C10641ss();
            this.f37087x1 = c10641ss3;
            c10641ss3.m50512x1(true);
            m50513yj().insertItem(0, this.f37087x1);
            this.f37087x1.mo51093k4(1L);
            this.f37087x1.m51720x1();
        }
        return this.f37087x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m50966to() {
        int iMo50440k4 = -1;
        for (int i = 0; i < m50513yj().size() && (m50513yj().get_Item(i).m51404bv() & 65535) != 6002; i++) {
            if (i == 0) {
                iMo50440k4 = 0;
            }
            iMo50440k4 += m50513yj().get_Item(i).mo50440k4() + 8;
        }
        return iMo50440k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m50967x1() {
        int iMo50440k4 = -1;
        for (int i = 0; i < m50513yj().size() && (m50513yj().get_Item(i).m51404bv() & 65535) != 4085; i++) {
            if (i == 0) {
                iMo50440k4 = 0;
            }
            iMo50440k4 += m50513yj().get_Item(i).mo50440k4() + 8;
        }
        return iMo50440k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m50958k4(C10618r9 c10618r9) {
        c10618r9.mo51093k4(m50950rv());
        m50513yj().addItem(c10618r9);
        return c10618r9.mo51092dy();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10376bv
    /* JADX INFO: renamed from: kk */
    public int[] mo50413kk() {
        return f37085kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10495ji m50968x1(C10431f3 c10431f3, long j) {
        c10431f3.mo51093k4(m50950rv());
        m50513yj().addItem(c10431f3);
        return m50965m9().m51719x1(c10431f3, j);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m50959k4(C10634sc c10634sc) {
        c10634sc.mo51093k4(m50950rv());
        m50513yj().addItem(c10634sc);
        return c10634sc.mo51092dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final C10495ji m50969x1(C10618r9 c10618r9) {
        c10618r9.mo51093k4(m50950rv());
        m50513yj().addItem(c10618r9);
        return m50965m9().m51707k4(c10618r9);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10495ji m50960k4(C10431f3 c10431f3, long j) {
        c10431f3.mo51093k4(m50950rv());
        m50513yj().addItem(c10431f3);
        return m50965m9().m51706k4(c10431f3, j);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10652to m50970x1(long j) {
        C10652to c10652to;
        List.Enumerator<AbstractC10571o4> it = m50513yj().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                InterfaceC10673uw interfaceC10673uw = (InterfaceC10673uw) C7019kk.m27452k4((Object) next, InterfaceC10673uw.class);
                if (interfaceC10673uw != null && interfaceC10673uw.mo51092dy() == j && (c10652to = (C10652to) C7019kk.m27452k4((Object) next, C10652to.class)) != null) {
                    return c10652to;
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
    public final C10495ji m50961k4(C10678v6 c10678v6, long j) {
        c10678v6.mo51093k4(m50950rv());
        m50513yj().addItem(c10678v6);
        return m50965m9().m51708k4(c10678v6, j);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC10571o4 m50962k4(long j) {
        List.Enumerator<AbstractC10571o4> it = m50513yj().iterator();
        while (it.hasNext()) {
            try {
                AbstractC10571o4 next = it.next();
                InterfaceC10673uw interfaceC10673uw = (InterfaceC10673uw) C7019kk.m27452k4((Object) next, InterfaceC10673uw.class);
                if (interfaceC10673uw != null && interfaceC10673uw.mo51092dy() == j) {
                    return next;
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
}
