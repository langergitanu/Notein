package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10373br;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10510kk;
import com.aspose.slides.internal.p407st.C10665uh;
import com.aspose.slides.internal.p407st.C10676v0;
import com.aspose.slides.internal.p407st.C10695wm;
import com.aspose.slides.internal.p407st.C10712xh;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class tif {

    /* JADX INFO: renamed from: c5 */
    private tif f49144c5;

    /* JADX INFO: renamed from: du */
    private C10510kk f49146du;

    /* JADX INFO: renamed from: dy */
    private tif f49147dy;

    /* JADX INFO: renamed from: k4 */
    private C10495ji f49151k4;

    /* JADX INFO: renamed from: kk */
    private C3134k4 f49152kk;

    /* JADX INFO: renamed from: to */
    private C10695wm f49156to;

    /* JADX INFO: renamed from: x1 */
    private svz f49158x1;

    /* JADX INFO: renamed from: h4 */
    private List<AbstractC10571o4> f49149h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private List<wiq> f49154m9 = new List<>();

    /* JADX INFO: renamed from: jd */
    private String f49150jd = null;

    /* JADX INFO: renamed from: ck */
    private String f49145ck = null;

    /* JADX INFO: renamed from: fa */
    private int f49148fa = -1;

    /* JADX INFO: renamed from: up */
    private int f49157up = -1;

    /* JADX INFO: renamed from: yj */
    private int f49159yj = -1;

    /* JADX INFO: renamed from: ks */
    private int f49153ks = -1;

    /* JADX INFO: renamed from: rv */
    private boolean f49155rv = false;

    public tif(C10495ji c10495ji, svz svzVar) {
        this.f49158x1 = svzVar;
        this.f49151k4 = c10495ji;
        C3134k4 c3134k4M70807x1 = svzVar.m70807x1();
        this.f49152kk = c3134k4M70807x1;
        c3134k4M70807x1.m13371ck().setPosition(this.f49158x1.m70801k4().m70351x1().get_Item(Long.valueOf(this.f49151k4.m51012x1())).longValue() & 4294967295L);
        this.f49156to = new C10695wm(this.f49152kk);
        C10695wm c10695wm = new C10695wm(this.f49152kk);
        C10510kk c10487j0 = (c10695wm.m51923to() & 65535) == 1007 ? new C10487j0() : new C10676v0();
        this.f49146du = c10487j0;
        c10487j0.m51405k4(this.f49152kk, c10695wm);
    }

    /* JADX INFO: renamed from: c5 */
    public final long m71214c5() {
        return this.f49146du.m51111du();
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m71215ck() {
        return (this.f49151k4.m51011to() & 2147483648L) != 0;
    }

    /* JADX INFO: renamed from: du */
    public final tif m71216du() {
        svz svzVarM70349m9;
        if (this.f49144c5 == null) {
            if (C7019kk.m27469x1(this.f49146du, C10676v0.class)) {
                if (this.f49158x1.m70801k4().m70344du() != null) {
                    svzVarM70349m9 = this.f49158x1.m70801k4().m70344du();
                    this.f49144c5 = svzVarM70349m9.m70803k4(m71214c5());
                }
            } else if (this.f49158x1.m70801k4().m70349m9() != null) {
                svzVarM70349m9 = this.f49158x1.m70801k4().m70349m9();
                this.f49144c5 = svzVarM70349m9.m70803k4(m71214c5());
            }
        }
        return this.f49144c5;
    }

    /* JADX INFO: renamed from: dy */
    public final int m71217dy() {
        return this.f49148fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m71218h4() {
        if (C14113y2.m67411k4(this.f49150jd)) {
            this.f49150jd = m71227x1().toString();
        }
        return this.f49150jd;
    }

    /* JADX INFO: renamed from: jd */
    public final long m71219jd() {
        if (this.f49146du.m51112h4()) {
            return 0L;
        }
        return ((C10487j0) this.f49146du).m50978c5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C6765kp m71220k4() {
        boolean zM27456k4;
        int i;
        apf[] apfVarArr;
        int i2;
        String strM67400k4;
        int i3;
        int i4;
        int i5 = 1;
        C6765kp c6765kp = new C6765kp();
        C12023wl c12023wlClone = (this.f49146du.m51112h4() ? this.f49158x1.m70801k4().m70350to().m51937kk() : this.f49158x1.m70801k4().m70350to().m51943x1()).Clone();
        int iM56865x1 = c12023wlClone.m56865x1() / this.f49148fa;
        int i6 = (iM56865x1 / 10) * 10;
        this.f49159yj = i6;
        if (i6 < iM56865x1) {
            this.f49159yj = i6 + 10;
        }
        this.f49153ks = ((c12023wlClone.m56862kk() * this.f49159yj) / c12023wlClone.m56865x1()) / 3;
        int iM56862kk = c12023wlClone.m56862kk();
        int i7 = this.f49153ks;
        this.f49157up = iM56862kk / i7;
        apf[] apfVarArr2 = new apf[i7 + 1];
        m71212k4(this, apfVarArr2, 1);
        List list = new List();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i8 > this.f49153ks) {
                break;
            }
            apf apfVar = apfVarArr2[i8];
            if (apfVar == null) {
                i10 += i5;
                if (list.size() < i10) {
                    list.addItem("");
                }
                i = i5;
                apfVarArr = apfVarArr2;
                i2 = i8;
            } else {
                if (i10 < i11) {
                    i10 = i11;
                }
                IGenericEnumerator<KeyValuePair<Integer, wiq>> it = apfVar.m3706k4().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair<Integer, wiq> next = it.next();
                        String[] strArrM67369h4 = C14113y2.m67369h4(next.getValue().m72767k4(), ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.LINE_BREAK_CHAR);
                        int i12 = i5;
                        int i13 = i10;
                        while (true) {
                            int i14 = 0;
                            while (i14 < strArrM67369h4.length && (i4 = i13 + i14) < list.size()) {
                                i14++;
                                if (((String) list.get_Item(i4)).length() + 1 >= next.getKey().intValue()) {
                                    break;
                                }
                            }
                            i13 = i14 + i13;
                        }
                        int length = strArrM67369h4.length;
                        int i15 = i13;
                        int i16 = 0;
                        while (i16 < length) {
                            int i17 = length;
                            String str = strArrM67369h4[i16];
                            if (str.length() > 0) {
                                i9 = i12;
                            }
                            apf[] apfVarArr3 = apfVarArr2;
                            int i18 = i8;
                            if (i15 >= list.size()) {
                                strM67400k4 = next.getKey().intValue() > 0 ? C14113y2.m67389k4(ControlChar.SPACE_CHAR, next.getKey().intValue()) : "";
                                list.addItem(strM67400k4);
                                i3 = i9;
                            } else {
                                strM67400k4 = (String) list.get_Item(i15);
                                i3 = i9;
                                int iIntValue = next.getKey().intValue() - strM67400k4.length();
                                if (iIntValue > 0) {
                                    strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67389k4(ControlChar.SPACE_CHAR, iIntValue));
                                }
                            }
                            list.set_Item(i15, C14113y2.m67408k4(strM67400k4, str));
                            i15++;
                            i16++;
                            length = i17;
                            apfVarArr2 = apfVarArr3;
                            i8 = i18;
                            i9 = i3;
                        }
                        apf[] apfVarArr4 = apfVarArr2;
                        int i19 = i8;
                        if (i11 < i15) {
                            i11 = i15;
                        }
                        i5 = i12;
                        apfVarArr2 = apfVarArr4;
                        i8 = i19;
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                i = i5;
                apfVarArr = apfVarArr2;
                i2 = i8;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            i8 = i2 + 1;
            i5 = i;
            apfVarArr2 = apfVarArr;
        }
        if (i9 != 0) {
            c6765kp.m26810x1(C14113y2.m67389k4('_', this.f49159yj));
            List.Enumerator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    c6765kp.m26810x1((String) it2.next());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c6765kp;
            }
        }
        return c6765kp;
    }

    /* JADX INFO: renamed from: kk */
    public final List<wiq> m71224kk() {
        return this.f49154m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m71225m9() {
        if (C14113y2.m67411k4(this.f49145ck)) {
            this.f49145ck = m71220k4().toString();
        }
        return this.f49145ck;
    }

    /* JADX INFO: renamed from: to */
    public final tif m71226to() {
        if (this.f49147dy == null) {
            if ((m71219jd() & 4294967295L) == 0) {
                return null;
            }
            tif tifVarM70803k4 = this.f49158x1.m70801k4().m70345h4().m70803k4(m71219jd());
            this.f49147dy = tifVarM70803k4;
            if (tifVarM70803k4 == null) {
                this.f49147dy = this.f49158x1.m70801k4().m70344du().m70803k4(m71219jd());
            }
        }
        return this.f49147dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C6765kp m71227x1() {
        C10695wm c10695wmM68511k4;
        C6765kp c6765kp = new C6765kp();
        ofi ofiVar = new ofi(this.f49156to, this.f49152kk);
        try {
            if (ofiVar.m68513x1() != null && (c10695wmM68511k4 = ofiVar.m68511k4(EditingLanguage.FRENCH_FRANCE)) != null) {
                ofiVar = new ofi(c10695wmM68511k4, this.f49152kk);
                try {
                    C10695wm c10695wmM68511k42 = ofiVar.m68511k4(61442);
                    if (c10695wmM68511k42 != null) {
                        m71210k4(c10695wmM68511k42, c6765kp);
                    }
                    ofiVar.dispose();
                } finally {
                    ofiVar.dispose();
                }
            }
            return c6765kp;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f6, code lost:
    
        r0.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        throw r8;
     */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m71213x1(C10695wm c10695wm, C6765kp c6765kp) {
        C10695wm c10695wmM68513x1;
        boolean zM70800du;
        int iM51923to;
        if (c10695wm == null) {
            return;
        }
        ofi ofiVar = new ofi(c10695wm, this.f49152kk);
        try {
            C10695wm c10695wmM68511k4 = ofiVar.m68511k4(61453);
            if (c10695wmM68511k4 != null) {
                ofiVar = new ofi(c10695wmM68511k4, this.f49152kk);
                do {
                    c10695wmM68513x1 = ofiVar.m68513x1();
                    if (c10695wmM68513x1 != null) {
                        zM70800du = this.f49158x1.m70800du();
                        iM51923to = c10695wmM68513x1.m51923to();
                        if (iM51923to == 3998) {
                            C10373br c10373br = new C10373br(null);
                            c10373br.m51405k4(this.f49152kk, c10695wmM68513x1);
                            if (c10373br.m50483x1() >= this.f49149h4.size()) {
                                throw new IndexOutOfRangeException("No outlined text!");
                            }
                            AbstractC10571o4 abstractC10571o4 = this.f49149h4.get_Item(c10373br.m50483x1());
                            c6765kp.m26810x1((abstractC10571o4.m51404bv() & 65535) == 4000 ? zM70800du ? C3038bv.m12790k4(((C10665uh) abstractC10571o4).mo51804x1()) : ((C10665uh) abstractC10571o4).mo51804x1() : zM70800du ? C3038bv.m12790k4(((C10712xh) abstractC10571o4).mo51804x1()) : ((C10712xh) abstractC10571o4).mo51804x1());
                            ofiVar.dispose();
                            return;
                        }
                        if (iM51923to == 4000) {
                            C10665uh c10665uh = new C10665uh(null);
                            c10665uh.m51405k4(this.f49152kk, c10695wmM68513x1);
                            c6765kp.m26810x1(zM70800du ? C3038bv.m12790k4(c10665uh.mo51804x1()) : c10665uh.mo51804x1());
                            ofiVar.dispose();
                            return;
                        }
                    } else {
                        ofiVar.dispose();
                    }
                } while (iM51923to != 4008);
                C10712xh c10712xh = new C10712xh(null);
                c10712xh.m51405k4(this.f49152kk, c10695wmM68513x1);
                c6765kp.m26810x1(zM70800du ? C3038bv.m12790k4(c10712xh.mo51804x1()) : c10712xh.mo51804x1());
                ofiVar.dispose();
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71221k4(int i) {
        if (i > 0) {
            int i2 = this.f49148fa;
            if (i2 > i || i2 < 0) {
                this.f49148fa = i;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71222k4(AbstractC10571o4 abstractC10571o4) {
        this.f49149h4.addItem(abstractC10571o4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71209k4(C10695wm c10695wm) {
        if (c10695wm == null) {
            return;
        }
        pya pyaVar = new pya(this.f49152kk);
        ofi ofiVar = new ofi(c10695wm, this.f49152kk);
        while (true) {
            try {
                C10695wm c10695wmM68513x1 = ofiVar.m68513x1();
                if (c10695wmM68513x1 == null) {
                    ofiVar.dispose();
                    return;
                }
                switch (c10695wmM68513x1.m51923to()) {
                    case 61443:
                        m71209k4(c10695wmM68513x1);
                        break;
                    case 61444:
                        m71211k4(c10695wmM68513x1, pyaVar);
                        break;
                }
            } catch (Throwable th) {
                ofiVar.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71210k4(C10695wm c10695wm, C6765kp c6765kp) {
        if (c10695wm == null) {
            return;
        }
        ofi ofiVar = new ofi(c10695wm, this.f49152kk);
        while (true) {
            try {
                C10695wm c10695wmM68513x1 = ofiVar.m68513x1();
                if (c10695wmM68513x1 == null) {
                    ofiVar.dispose();
                    return;
                }
                switch (c10695wmM68513x1.m51923to()) {
                    case 61443:
                        m71210k4(c10695wmM68513x1, c6765kp);
                        break;
                    case 61444:
                        m71213x1(c10695wmM68513x1, c6765kp);
                        break;
                }
            } catch (Throwable th) {
                ofiVar.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71211k4(C10695wm c10695wm, pya pyaVar) {
        if (c10695wm == null) {
            return;
        }
        wiq wiqVar = new wiq(pyaVar, this.f49152kk);
        ofi ofiVar = new ofi(c10695wm, this.f49152kk);
        while (true) {
            try {
                C10695wm c10695wmM68513x1 = ofiVar.m68513x1();
                if (c10695wmM68513x1 == null) {
                    ofiVar.dispose();
                    return;
                }
                int iM51923to = c10695wmM68513x1.m51923to();
                if (iM51923to == 61449) {
                    pyaVar.m69330k4(c10695wmM68513x1);
                    ofiVar.dispose();
                    return;
                } else if (iM51923to != 61453) {
                    switch (iM51923to) {
                        case 61455:
                        case 61456:
                            wiqVar.m72768k4(c10695wmM68513x1);
                            break;
                        case 61457:
                            wiqVar.m72772x1(c10695wmM68513x1);
                            break;
                    }
                } else {
                    wiqVar.m72769k4(c10695wmM68513x1, this.f49149h4);
                    if (!C14113y2.m67411k4(wiqVar.m72767k4())) {
                        this.f49154m9.addItem(wiqVar);
                        m71221k4(wiqVar.m72766k4(this.f49158x1.m70800du()));
                    }
                }
            } catch (Throwable th) {
                ofiVar.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71212k4(tif tifVar, apf[] apfVarArr, int i) {
        if (!this.f49146du.m51112h4()) {
            tif tifVarM71226to = tifVar.m71226to();
            if (i > 0 && tifVarM71226to != null) {
                m71212k4(tifVarM71226to, apfVarArr, i - 1);
            }
        }
        List.Enumerator<wiq> it = tifVar.m71224kk().iterator();
        while (it.hasNext()) {
            try {
                wiq next = it.next();
                if (!next.m72770kk() || !tifVar.m71215ck()) {
                    int iM56713x1 = next.m72771x1().m56713x1() / this.f49157up;
                    if (iM56713x1 < 0) {
                        iM56713x1 = 0;
                    }
                    int i2 = this.f49153ks;
                    if (iM56713x1 > i2) {
                        iM56713x1 = i2;
                    }
                    int iM56708k4 = next.m72771x1().m56708k4() / this.f49148fa;
                    apf apfVar = apfVarArr[iM56713x1];
                    if (apfVar == null) {
                        apfVar = new apf(iM56713x1);
                        apfVarArr[iM56713x1] = apfVar;
                    }
                    while (apfVar.m3706k4().containsKey(Integer.valueOf(iM56708k4))) {
                        iM56708k4++;
                    }
                    apfVar.m3706k4().addItem(Integer.valueOf(iM56708k4), next);
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

    /* JADX INFO: renamed from: k4 */
    public final void m71223k4(boolean z) {
        tif tifVarM71216du;
        C10695wm c10695wmM68511k4;
        if (this.f49155rv) {
            return;
        }
        tif tifVarM71226to = m71226to();
        if (tifVarM71226to != null) {
            tifVarM71226to.m71221k4(this.f49148fa);
            tifVarM71226to.m71223k4(true);
        }
        ofi ofiVar = new ofi(this.f49156to, this.f49152kk);
        try {
            if (ofiVar.m68513x1() != null && (c10695wmM68511k4 = ofiVar.m68511k4(EditingLanguage.FRENCH_FRANCE)) != null) {
                ofiVar = new ofi(c10695wmM68511k4, this.f49152kk);
                try {
                    C10695wm c10695wmM68511k42 = ofiVar.m68511k4(61442);
                    if (c10695wmM68511k42 != null) {
                        m71209k4(c10695wmM68511k42);
                    }
                    ofiVar.dispose();
                } finally {
                    ofiVar.dispose();
                }
            }
            if (z && (tifVarM71216du = m71216du()) != null) {
                tifVarM71216du.m71221k4(this.f49148fa);
                tifVarM71216du.m71223k4(false);
            }
            this.f49155rv = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
