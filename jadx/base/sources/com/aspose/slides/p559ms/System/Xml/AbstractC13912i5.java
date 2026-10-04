package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.i5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13912i5 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private static long f46573k4 = 24600;

    /* JADX INFO: renamed from: kk */
    private static long f46574kk = 157084;

    /* JADX INFO: renamed from: x1 */
    private static long f46575x1 = 123324;

    /* JADX INFO: renamed from: c5 */
    private boolean m65459c5() {
        mo65020du();
        if (mo65028jd() != 1 || mo65048u4()) {
            return mo65026h4();
        }
        int iMo65058x6 = mo65058x6();
        while (mo65026h4() && iMo65058x6 < mo65058x6()) {
        }
        if (mo65028jd() == 15) {
            return mo65026h4();
        }
        return false;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m65460du(int i) {
        return 0 != (((f46574kk & 4294967295L) & ((long) (1 << i))) & 4294967295L);
    }

    /* JADX INFO: renamed from: h4 */
    public static AbstractC13912i5 m65461h4(String str) {
        return m65470k4(str, (C13906gx) null, (C14015xb) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m65462k4(AbstractC13912i5 abstractC13912i5) {
        C13985tt c13985ttM65477x1 = m65477x1(abstractC13912i5);
        if (c13985ttM65477x1 != null) {
            return c13985ttM65477x1.m66111m4();
        }
        return 2;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m65475to(int i) {
        return 0 != (((f46573k4 & 4294967295L) & ((long) (1 << i))) & 4294967295L);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m65476x1(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6.canSeek()) {
            long length = abstractC3150x6.getLength();
            if (length < 4096) {
                return (int) length;
            }
            if (length > 65536) {
                return 8192;
            }
        }
        return 4096;
    }

    /* JADX INFO: renamed from: ak */
    public char mo65014ak() {
        return '\"';
    }

    /* JADX INFO: renamed from: ar */
    public abstract boolean mo65015ar();

    /* JADX INFO: renamed from: b3 */
    public abstract void mo65016b3();

    /* JADX INFO: renamed from: bv */
    public void mo65208bv() {
        if (mo65039m9() != 1) {
            return;
        }
        m65459c5();
    }

    /* JADX INFO: renamed from: bz */
    public C13950o3 mo65017bz() {
        return null;
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m65478c6() {
        return m65487xk() == 1;
    }

    /* JADX INFO: renamed from: ck */
    public String mo65019ck() {
        return mo65060yj().length() == 0 ? mo65023fa() : mo65059yd().mo65266k4(C14113y2.m67408k4(mo65060yj(), C18241k5.f55433h, mo65023fa()));
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m65483k4(true);
    }

    /* JADX INFO: renamed from: dq */
    public boolean mo65479dq() {
        return false;
    }

    /* JADX INFO: renamed from: du */
    public abstract boolean mo65020du();

    /* JADX INFO: renamed from: dy */
    public abstract boolean mo65021dy();

    /* JADX INFO: renamed from: e0 */
    public String m65481e0() {
        if (mo65039m9() != 1) {
            return C14113y2.f47374k4;
        }
        if (mo65028jd() != 2 && mo65028jd() != 1) {
            mo65026h4();
            return C14113y2.f47374k4;
        }
        C3125bv c3125bv = new C3125bv(C11697x1.m55250kk());
        AbstractC13958qb abstractC13958qbM65471k4 = m65471k4(c3125bv);
        try {
            if (mo65028jd() == 2) {
                abstractC13958qbM65471k4.mo21915to(mo65060yj(), mo65023fa(), mo65050up());
                m65472k4(abstractC13958qbM65471k4);
                abstractC13958qbM65471k4.mo21917x1();
            } else {
                abstractC13958qbM65471k4.mo65808x1(this, false);
            }
            abstractC13958qbM65471k4.mo21893du();
            return c3125bv.toString();
        } catch (Throwable th) {
            abstractC13958qbM65471k4.mo21893du();
            throw th;
        }
    }

    /* JADX INFO: renamed from: fa */
    public abstract String mo65023fa();

    /* JADX INFO: renamed from: h4 */
    public abstract boolean mo65026h4();

    /* JADX INFO: renamed from: ix */
    public boolean mo65027ix() {
        return false;
    }

    /* JADX INFO: renamed from: jd */
    public abstract int mo65028jd();

    /* JADX INFO: renamed from: k4 */
    public abstract String mo13292k4(String str);

    /* JADX INFO: renamed from: kk */
    public abstract String mo65034kk(int i);

    /* JADX INFO: renamed from: kk */
    public abstract boolean mo65035kk();

    /* JADX INFO: renamed from: kk */
    public abstract boolean mo65036kk(String str);

    /* JADX INFO: renamed from: ks */
    public boolean mo65038ks() {
        return m65460du(mo65028jd());
    }

    /* JADX INFO: renamed from: lr */
    public boolean mo65209lr() {
        return mo65041qq() > 0;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract int mo65039m9();

    /* JADX INFO: renamed from: ne */
    public abstract String mo65040ne();

    /* JADX INFO: renamed from: qm */
    public final boolean m65485qm() {
        if (mo65057x1()) {
            return true;
        }
        InterfaceC13298y4 interfaceC13298y4Mo65210wl = mo65210wl();
        return interfaceC13298y4Mo65210wl != null && interfaceC13298y4Mo65210wl.mo61763x1();
    }

    /* JADX INFO: renamed from: qq */
    public abstract int mo65041qq();

    /* JADX INFO: renamed from: rv */
    public abstract String mo65042rv();

    /* JADX INFO: renamed from: to */
    public abstract String mo65046to(String str);

    /* JADX INFO: renamed from: to */
    public abstract boolean mo65047to();

    /* JADX INFO: renamed from: ts */
    public String m65486ts() {
        if (mo65039m9() != 1) {
            return C14113y2.f47374k4;
        }
        if (mo65028jd() != 2 && mo65028jd() != 1) {
            mo65026h4();
            return C14113y2.f47374k4;
        }
        C3125bv c3125bv = new C3125bv(C11697x1.m55250kk());
        AbstractC13958qb abstractC13958qbM65471k4 = m65471k4(c3125bv);
        try {
            if (mo65028jd() == 2) {
                ((C13991ub) abstractC13958qbM65471k4).m66259kk(mo65014ak());
                m65472k4(abstractC13958qbM65471k4);
            }
            if (mo65028jd() == 1) {
                m65473k4(abstractC13958qbM65471k4, false);
            }
            abstractC13958qbM65471k4.mo21893du();
            return c3125bv.toString();
        } catch (Throwable th) {
            abstractC13958qbM65471k4.mo21893du();
            throw th;
        }
    }

    /* JADX INFO: renamed from: u4 */
    public abstract boolean mo65048u4();

    /* JADX INFO: renamed from: um */
    public void mo65049um() {
    }

    /* JADX INFO: renamed from: up */
    public abstract String mo65050up();

    /* JADX INFO: renamed from: uz */
    public int mo65051uz() {
        return 0;
    }

    /* JADX INFO: renamed from: v4 */
    public String mo65052v4() {
        if (mo65039m9() != 1) {
            return C14113y2.f47374k4;
        }
        mo65020du();
        if (mo65028jd() == 1) {
            if (mo65048u4()) {
                return C14113y2.f47374k4;
            }
            if (!mo65026h4()) {
                throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
            }
            if (mo65028jd() == 15) {
                return C14113y2.f47374k4;
            }
        }
        String strM67400k4 = C14113y2.f47374k4;
        while (m65475to(mo65028jd())) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, mo65042rv());
            if (!mo65026h4()) {
                break;
            }
        }
        return strM67400k4;
    }

    /* JADX INFO: renamed from: wl */
    public InterfaceC13298y4 mo65210wl() {
        return (InterfaceC13298y4) C7019kk.m27452k4((Object) this, InterfaceC13298y4.class);
    }

    /* JADX INFO: renamed from: wy */
    public InterfaceC13899g8 mo65054wy() {
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    public abstract int mo65058x6();

    /* JADX INFO: renamed from: xk */
    public int m65487xk() {
        do {
            int iMo65028jd = mo65028jd();
            if (iMo65028jd != 1) {
                if (iMo65028jd == 2) {
                    mo65020du();
                    return mo65028jd();
                }
                if (iMo65028jd == 3 || iMo65028jd == 4 || iMo65028jd == 5 || iMo65028jd == 15 || iMo65028jd == 16) {
                }
            }
            return mo65028jd();
        } while (mo65026h4());
        return mo65028jd();
    }

    /* JADX INFO: renamed from: yd */
    public abstract AbstractC13883dt mo65059yd();

    /* JADX INFO: renamed from: yj */
    public abstract String mo65060yj();

    /* JADX INFO: renamed from: x1 */
    private static C13985tt m65477x1(AbstractC13912i5 abstractC13912i5) {
        C13985tt c13985tt = (C13985tt) C7019kk.m27452k4((Object) abstractC13912i5, C13985tt.class);
        if (c13985tt != null) {
            return c13985tt;
        }
        C13938ms c13938ms = (C13938ms) C7019kk.m27452k4((Object) abstractC13912i5, C13938ms.class);
        if (c13938ms != null) {
            return c13938ms.m65620wp();
        }
        C13849aa c13849aa = (C13849aa) C7019kk.m27452k4((Object) abstractC13912i5, C13849aa.class);
        if (c13849aa != null) {
            return c13849aa.m65045sv();
        }
        C13986tu c13986tu = (C13986tu) C7019kk.m27452k4((Object) abstractC13912i5, C13986tu.class);
        if (c13986tu != null) {
            return c13986tu.m66195sv().m65045sv();
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public boolean m65480du(String str) {
        if (str == null || str.length() == 0) {
            throw C13850af.m65077k4(str, "name");
        }
        String strMo65266k4 = mo65059yd().mo65266k4(str);
        while (mo65026h4()) {
            if (mo65028jd() == 1 && C13851ai.m65152k4(strMo65266k4, mo65019ck())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo65482k4(char[] cArr, int i, int i2) {
        throw new NotSupportedException(C13968ri.m65818k4("ReadValueChunk method is not supported on this XmlReader. Use CanReadValueChunk property to find out if an XmlReader implements it."));
    }

    /* JADX INFO: renamed from: k4 */
    public C13906gx mo65029k4() {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void mo65055x1(int i) {
        if (i < 0 || i >= mo65041qq()) {
            throw new ArgumentOutOfRangeException(ContextChain.TAG_INFRA);
        }
        mo65020du();
        mo65035kk();
        for (int i2 = 0; i2 < i; i2++) {
            mo65047to();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65463k4(AbstractC3150x6 abstractC3150x6) {
        return m65464k4(abstractC3150x6, (C13906gx) null, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo65057x1() {
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65464k4(AbstractC3150x6 abstractC3150x6, C13906gx c13906gx, String str) {
        if (c13906gx == null) {
            c13906gx = new C13906gx();
        }
        return c13906gx.m65381k4(abstractC3150x6, null, str, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65465k4(AbstractC3151yd abstractC3151yd) {
        return m65468k4(abstractC3151yd, (C13906gx) null, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65466k4(AbstractC3151yd abstractC3151yd, C13906gx c13906gx) {
        return m65468k4(abstractC3151yd, c13906gx, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65467k4(AbstractC3151yd abstractC3151yd, C13906gx c13906gx, C14015xb c14015xb) {
        if (c13906gx == null) {
            c13906gx = new C13906gx();
        }
        return c13906gx.m65382k4(abstractC3151yd, C14113y2.f47374k4, c14015xb);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65468k4(AbstractC3151yd abstractC3151yd, C13906gx c13906gx, String str) {
        if (c13906gx == null) {
            c13906gx = new C13906gx();
        }
        return c13906gx.m65382k4(abstractC3151yd, str, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65469k4(AbstractC13912i5 abstractC13912i5, C13906gx c13906gx) {
        if (c13906gx == null) {
            c13906gx = new C13906gx();
        }
        return c13906gx.m65383k4(abstractC13912i5);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC13912i5 m65470k4(String str, C13906gx c13906gx, C14015xb c14015xb) {
        if (c13906gx == null) {
            c13906gx = new C13906gx();
        }
        return c13906gx.m65384k4(str, c14015xb);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13958qb m65471k4(C3125bv c3125bv) {
        C13991ub c13991ub = new C13991ub(c3125bv);
        m65474k4(c13991ub);
        return c13991ub;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65472k4(AbstractC13958qb abstractC13958qb) {
        String strMo65019ck = mo65019ck();
        while (mo65021dy()) {
            if (mo65028jd() == 5) {
                abstractC13958qb.mo21910kk(mo65019ck());
            } else {
                abstractC13958qb.mo21918x1(mo65042rv());
            }
        }
        mo65036kk(strMo65019ck);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65473k4(AbstractC13958qb abstractC13958qb, boolean z) {
        int iMo65058x6 = mo65028jd() == 0 ? -1 : mo65058x6();
        while (mo65026h4() && iMo65058x6 < mo65058x6()) {
            switch (mo65028jd()) {
                case 1:
                    abstractC13958qb.mo12953k4(mo65060yj(), mo65023fa(), mo65050up());
                    ((C13991ub) abstractC13958qb).m66259kk(mo65014ak());
                    abstractC13958qb.mo65803k4(this, z);
                    if (mo65048u4()) {
                        abstractC13958qb.mo21898jd();
                    }
                    break;
                case 3:
                    abstractC13958qb.mo21918x1(mo65042rv());
                    break;
                case 4:
                    abstractC13958qb.mo21894du(mo65042rv());
                    break;
                case 5:
                    abstractC13958qb.mo21910kk(mo65019ck());
                    break;
                case 7:
                case 17:
                    abstractC13958qb.mo21907k4(mo65019ck(), mo65042rv());
                    break;
                case 8:
                    abstractC13958qb.mo21897h4(mo65042rv());
                    break;
                case 10:
                    abstractC13958qb.mo21908k4(mo65019ck(), mo65046to("PUBLIC"), mo65046to("SYSTEM"), mo65042rv());
                    break;
                case 13:
                case 14:
                    abstractC13958qb.mo21913m9(mo65042rv());
                    break;
                case 15:
                    abstractC13958qb.mo21892ck();
                    break;
            }
        }
        if (iMo65058x6 == mo65058x6() && mo65028jd() == 15) {
            mo65026h4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65474k4(C13991ub c13991ub) {
        boolean zM66194g8;
        C13938ms c13938ms = (C13938ms) C7019kk.m27452k4((Object) this, C13938ms.class);
        if (c13938ms != null) {
            zM66194g8 = c13938ms.m65612c5();
        } else {
            C13986tu c13986tu = (C13986tu) C7019kk.m27452k4((Object) this, C13986tu.class);
            if (c13986tu == null) {
                return;
            } else {
                zM66194g8 = c13986tu.m66194g8();
            }
        }
        c13991ub.m66260kk(zM66194g8);
    }

    /* JADX INFO: renamed from: k4 */
    public void m65483k4(boolean z) {
        if (!z || mo65039m9() == 4) {
            return;
        }
        mo65049um();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m65484k4(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw C13850af.m65077k4(str, "localName");
        }
        if (str2 == null) {
            throw new ArgumentNullException("namespaceURI");
        }
        int iMo65058x6 = mo65058x6();
        if (mo65028jd() != 1) {
            if (mo65039m9() != 0) {
                return false;
            }
            iMo65058x6--;
        } else if (mo65048u4()) {
            return false;
        }
        String strMo65266k4 = mo65059yd().mo65266k4(str);
        String strMo65266k42 = mo65059yd().mo65266k4(str2);
        while (mo65026h4() && mo65058x6() > iMo65058x6) {
            if (mo65028jd() == 1 && C13851ai.m65152k4(strMo65266k4, mo65023fa()) && C13851ai.m65152k4(strMo65266k42, mo65050up())) {
                return true;
            }
        }
        return false;
    }
}
