package com.aspose.slides.internal.p339pk;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.pk.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C9463yj extends AbstractC9451fa {

    /* JADX INFO: renamed from: kk */
    private C9458rv f34421kk;

    /* JADX INFO: renamed from: ak */
    private void m46459ak() {
        this.f34364k4.mo9969x1(this.f34421kk.m46388dy());
    }

    /* JADX INFO: renamed from: ar */
    private void m46460ar() {
        this.f34421kk.m13386x6();
        C9449du c9449du = new C9449du();
        c9449du.m46265kk(this.f34421kk);
        m46294k4(c9449du);
    }

    /* JADX INFO: renamed from: b3 */
    private void m46461b3() {
        this.f34364k4.mo9951k4(this.f34421kk.m46394m9());
    }

    /* JADX INFO: renamed from: bv */
    private void m46462bv() {
        m46282du().m46327dy(this.f34421kk.m13382u4() & 65535);
        if (m46282du().m46328fa() == 7) {
            this.f34368x1 = true;
        }
    }

    /* JADX INFO: renamed from: bz */
    private void m46463bz() {
        this.f34421kk.m13381rv();
        this.f34421kk.m13382u4();
    }

    /* JADX INFO: renamed from: c5 */
    private String m46464c5(int i) {
        byte[] bArrM13372dy = this.f34421kk.m13372dy(i);
        if (m46282du().m46351to().m46385m9() != 2 && !C11240k4.m54218k4(m46282du().m46351to().m46380h4())) {
            return m46282du().m46351to().m46386to().m26681x1(bArrM13372dy);
        }
        C6765kp c6765kp = new C6765kp();
        for (byte b : bArrM13372dy) {
            c6765kp.m26780k4(C11240k4.m54220kk((char) (b & 255)));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: c6 */
    private void m46465c6() {
        C12025x6 c12025x6Clone = this.f34421kk.m46390k4().Clone();
        C12025x6 c12025x6Clone2 = this.f34421kk.m46390k4().Clone();
        this.f34364k4.mo9966x1(this.f34421kk.m46395to().Clone().Clone(), c12025x6Clone2.Clone(), c12025x6Clone.Clone());
    }

    /* JADX INFO: renamed from: ck */
    private void m46466ck() {
        this.f34421kk.m13382u4();
    }

    /* JADX INFO: renamed from: dq */
    private void m46468dq() {
        C12025x6 c12025x6Clone = this.f34421kk.m46390k4().Clone();
        C12025x6 c12025x6Clone2 = this.f34421kk.m46390k4().Clone();
        this.f34364k4.mo9944k4(this.f34421kk.m46395to().Clone().Clone(), c12025x6Clone.Clone(), c12025x6Clone2.Clone());
    }

    /* JADX INFO: renamed from: dy */
    private void m46469dy(int i) {
        String strM46274k4;
        short[] sArr;
        C12025x6 c12025x6Clone = this.f34421kk.m46390k4().Clone();
        int iM13382u4 = this.f34421kk.m13382u4() & 65535;
        int iM13382u42 = this.f34421kk.m13382u4();
        int i2 = 65535 & iM13382u42;
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        if (i2 != 0) {
            this.f34421kk.m46393kk().CloneTo(c12007ixClone);
        }
        if (iM13382u4 != 0) {
            strM46274k4 = m46464c5(iM13382u4);
        } else {
            if ((iM13382u42 & 2) != 0) {
                this.f34364k4.mo9956kk(c12007ixClone.Clone());
            }
            strM46274k4 = "";
        }
        int i3 = 0;
        int i4 = 8 + ((i2 == 0 || !C12007ix.m56548to(c12007ixClone, C12007ix.f40519k4)) ? 0 : 8) + iM13382u4;
        if (i4 % 2 != 0) {
            this.f34421kk.m13387yj();
            i4++;
        }
        if (i4 >= i) {
            sArr = null;
        } else if (strM46274k4.length() == iM13382u4) {
            sArr = new short[iM13382u4];
            while (i3 < iM13382u4) {
                sArr[i3] = this.f34421kk.m13381rv();
                i3++;
            }
        } else {
            int i5 = iM13382u4 / 2;
            sArr = new short[i5];
            while (i3 < i5) {
                sArr[i3] = this.f34421kk.m13381rv();
                this.f34421kk.m13381rv();
                i3++;
            }
        }
        if ((iM13382u42 & 128) != 0) {
            strM46274k4 = AbstractC9451fa.m46274k4(strM46274k4);
            c12025x6Clone.m56891k4(c12025x6Clone.m56897x1() - (m46282du().m46335k4(strM46274k4).Clone().m56699x1() - c12007ixClone.m56550c5()));
        }
        this.f34364k4.mo9949k4(c12025x6Clone.Clone(), strM46274k4, sArr);
    }

    /* JADX INFO: renamed from: e0 */
    private void m46470e0() {
        C12015qq c12015qqClone = this.f34421kk.m46396x1().Clone();
        this.f34364k4.mo9943k4(this.f34421kk.m46395to().Clone().Clone(), c12015qqClone.Clone());
    }

    /* JADX INFO: renamed from: fa */
    private void m46471fa() {
        int iM13382u4 = this.f34421kk.m13382u4() & 65535;
        int iM13382u42 = 65535 & this.f34421kk.m13382u4();
        this.f34364k4.mo9939k4((C9462x6) m46286dy().m46399k4(iM13382u4), (C4320jd) null, m46282du().m46355x1(iM13382u42));
    }

    /* JADX INFO: renamed from: g8 */
    private void m46473g8() {
        C9462x6 c9462x6 = (C9462x6) C7019kk.m27452k4((Object) m46286dy().m46399k4(this.f34421kk.m13382u4() & 65535), C9462x6.class);
        if (c9462x6 == null) {
            m46282du().m46342k4(new C12018u4(m46287h4().Clone()));
            return;
        }
        List<C12007ix> listM46458to = c9462x6.m46458to();
        if (listM46458to.size() > 0) {
            m46282du().m46342k4(new C12018u4(listM46458to.get_Item(0).Clone()));
            for (int i = 1; i < listM46458to.size(); i++) {
                m46282du().m46358x6().m56759kk(listM46458to.get_Item(i).Clone());
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private C12015qq m46474h4(C12015qq c12015qq) {
        short sM13381rv = this.f34421kk.m13381rv();
        short sM13381rv2 = this.f34421kk.m13381rv();
        short sM13381rv3 = this.f34421kk.m13381rv();
        short sM13381rv4 = this.f34421kk.m13381rv();
        if (sM13381rv == 0 || sM13381rv3 == 0) {
            throw new InvalidOperationException("Invalid scale values.");
        }
        return new C12015qq((c12015qq.m56699x1() * sM13381rv4) / sM13381rv3, (c12015qq.m56697kk() * sM13381rv2) / sM13381rv);
    }

    /* JADX INFO: renamed from: ix */
    private void m46475ix() {
        C9462x6 c9462x6 = new C9462x6();
        c9462x6.m46456k4(this.f34421kk);
        m46294k4(c9462x6);
    }

    /* JADX INFO: renamed from: jd */
    private void m46476jd(int i) {
        this.f34421kk.m13382u4();
        this.f34421kk.m13382u4();
        this.f34421kk.m13382u4();
        m46472fa(i - 22);
    }

    /* JADX INFO: renamed from: ks */
    private void m46478ks() {
        this.f34364k4.mo9939k4((C9462x6) m46286dy().m46399k4(this.f34421kk.m13382u4() & 65535), (C4320jd) null, m46282du().m46344kk());
    }

    /* JADX INFO: renamed from: lr */
    private void m46479lr() {
        String strM46464c5 = m46464c5(this.f34421kk.m13382u4() & 65535);
        if (C12565ks.m58618k4(this.f34421kk.m13371ck().getPosition())) {
            this.f34421kk.m13371ck().setPosition(this.f34421kk.m13371ck().getPosition() + 1);
        }
        this.f34364k4.mo9948k4(this.f34421kk.m46390k4().Clone().Clone(), strM46464c5);
    }

    /* JADX INFO: renamed from: ne */
    private void m46480ne() {
        m46294k4(new C9447c5());
    }

    /* JADX INFO: renamed from: qm */
    private void m46481qm() {
        this.f34421kk.m13386x6();
        this.f34364k4.mo9965x1(this.f34421kk.m46387du().Clone().Clone());
    }

    /* JADX INFO: renamed from: qq */
    private void m46482qq() {
        C9449du c9449du = new C9449du();
        c9449du.m46269x1(this.f34421kk);
        m46294k4(c9449du);
    }

    /* JADX INFO: renamed from: rv */
    private void m46483rv() {
        C12025x6 c12025x6Clone = m46282du().m46329h4().m56552du().Clone();
        C12025x6 c12025x6Clone2 = this.f34421kk.m46390k4().Clone();
        m46282du().m46343k4(new C12025x6(c12025x6Clone2.m56897x1() + c12025x6Clone.m56897x1(), c12025x6Clone2.m56895kk() + c12025x6Clone.m56895kk()));
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: ts */
    private void m46484ts() {
        C12025x6 c12025x6Clone = this.f34421kk.m46390k4().Clone();
        C12025x6 c12025x6Clone2 = this.f34421kk.m46390k4().Clone();
        this.f34364k4.mo9957kk(this.f34421kk.m46395to().Clone().Clone(), c12025x6Clone2.Clone(), c12025x6Clone.Clone());
    }

    /* JADX INFO: renamed from: u4 */
    private void m46485u4() {
        C9447c5 c9447c5 = new C9447c5();
        if (m46305to().m9995to()) {
            c9447c5.m46248k4(this.f34421kk, C7019kk.m27462to(Float.valueOf(m46305to().m9996up().m10004x1().m56550c5() / (m46290jd().m54745x1().m56699x1() * 2.0f)), 13));
        } else {
            c9447c5.m46248k4(this.f34421kk, 1);
        }
        m46294k4(c9447c5);
    }

    /* JADX INFO: renamed from: um */
    private void m46486um() {
        m46282du().m46330h4(this.f34421kk.m13382u4() & 65535);
    }

    /* JADX INFO: renamed from: up */
    private void m46487up() {
        int iM13382u4 = this.f34421kk.m13382u4() & 65535;
        int iM13382u42 = 65535 & this.f34421kk.m13382u4();
        this.f34421kk.m13381rv();
        this.f34364k4.mo9939k4((C9462x6) m46286dy().m46399k4(iM13382u4), new C4320jd(m46282du().m46355x1(iM13382u42), this.f34421kk.m13381rv()), (C4328x1) null);
    }

    /* JADX INFO: renamed from: uz */
    private void m46489uz() {
        C9449du c9449du = new C9449du();
        c9449du.m46263k4(this.f34421kk);
        m46294k4(c9449du);
    }

    /* JADX INFO: renamed from: v4 */
    private void m46490v4() {
        m46282du().m46333jd(this.f34421kk.m13381rv());
    }

    /* JADX INFO: renamed from: wl */
    private void m46491wl() {
        C9457m9 c9457m9 = new C9457m9();
        c9457m9.m46382k4(this.f34421kk);
        m46294k4(c9457m9);
    }

    /* JADX INFO: renamed from: wy */
    private void m46492wy() {
        this.f34364k4.mo9958kk(this.f34421kk.m46394m9());
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m46493x1(int i, int i2) {
        return (i + 6) / 2 != (i2 >> 8) + 3;
    }

    /* JADX INFO: renamed from: x6 */
    private void m46494x6() {
        C12025x6 c12025x6Clone = m46287h4().m56552du().Clone();
        C12025x6 c12025x6Clone2 = this.f34421kk.m46390k4().Clone();
        m46298k4(new C12025x6(c12025x6Clone2.m56897x1() + c12025x6Clone.m56897x1(), c12025x6Clone2.m56895kk() + c12025x6Clone.m56895kk()));
        m46282du().m46346ks();
    }

    /* JADX INFO: renamed from: xk */
    private void m46495xk() {
        this.f34364k4.mo9961to(this.f34421kk.m46395to().Clone());
    }

    /* JADX INFO: renamed from: yd */
    private void m46496yd() {
        this.f34364k4.mo9947k4(this.f34421kk.m46390k4().Clone().Clone(), this.f34421kk.m46389h4());
    }

    /* JADX INFO: renamed from: yj */
    private void m46497yj() {
        this.f34364k4.mo9939k4((C9462x6) m46286dy().m46399k4(this.f34421kk.m13382u4() & 65535), new C4320jd(C5656k4.f15518dy), (C4328x1) null);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9451fa
    /* JADX INFO: renamed from: k4 */
    public void mo46291k4() {
        AbstractC3150x6 abstractC3150x6M9989k4 = m46305to().m9989k4();
        abstractC3150x6M9989k4.setPosition(m46305to().m9990kk());
        this.f34421kk = new C9458rv(abstractC3150x6M9989k4);
        while (abstractC3150x6M9989k4.getPosition() < abstractC3150x6M9989k4.getLength()) {
            int iM13386x6 = this.f34421kk.m13386x6();
            int iM13382u4 = this.f34421kk.m13382u4() & 65535;
            int position = (int) abstractC3150x6M9989k4.getPosition();
            int i = (iM13386x6 * 2) - 6;
            if (!m46498k4(iM13382u4, i)) {
                return;
            }
            long j = position + i;
            if (abstractC3150x6M9989k4.getPosition() != j) {
                abstractC3150x6M9989k4.setPosition(j);
            }
        }
    }

    /* JADX INFO: renamed from: ck */
    private void m46467ck(int i) {
        this.f34421kk.m13382u4();
        this.f34421kk.m13382u4();
        m46472fa(i - 20);
    }

    /* JADX INFO: renamed from: fa */
    private void m46472fa(int i) {
        m46477k4(i, this.f34421kk.m46387du().Clone().Clone(), this.f34421kk.m46387du().Clone().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m46477k4(int i, C12007ix c12007ix, C12007ix c12007ix2) {
        if (i > 0) {
            this.f34364k4.mo9942k4(c12007ix.Clone(), c12007ix2.Clone(), C12549du.m58503k4(this.f34421kk, i));
        }
    }

    /* JADX INFO: renamed from: up */
    private void m46488up(int i) {
        if (m46493x1(i, 2368)) {
            this.f34421kk.m13386x6();
            float fM13382u4 = this.f34421kk.m13382u4() & 65535;
            float fM13382u42 = 65535 & this.f34421kk.m13382u4();
            C12007ix c12007ixClone = this.f34421kk.m46387du().Clone();
            m46477k4(i - 16, new C12007ix(fM13382u42, fM13382u4, c12007ixClone.m56550c5(), c12007ixClone.m56575x1()).Clone(), c12007ixClone.Clone());
            return;
        }
        int iM13386x6 = this.f34421kk.m13386x6();
        this.f34421kk.m13382u4();
        this.f34421kk.m13382u4();
        this.f34421kk.m13382u4();
        C12007ix c12007ixClone2 = this.f34421kk.m46387du().Clone();
        if (iM13386x6 != 15728673) {
            return;
        }
        this.f34364k4.mo9965x1(c12007ixClone2.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m46498k4(int i, int i2) {
        C12015qq c12015qqM46396x1;
        switch (i) {
            case 0:
                return false;
            case 30:
                m46309x1();
                return true;
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                m46480ne();
                return true;
            case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                m46283du(this.f34421kk.m13381rv());
                return true;
            case StyleIdentifier.COLORFUL_GRID_ACCENT_6 /* 259 */:
                m46310x1(this.f34421kk.m13381rv());
                return true;
            case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                m46462bv();
                return true;
            case StyleIdentifier.SUBTLE_REFERENCE /* 262 */:
                m46486um();
                return true;
            case StyleIdentifier.INTENSE_REFERENCE /* 263 */:
                m46466ck();
                return true;
            case StyleIdentifier.BOOK_TITLE /* 264 */:
                m46490v4();
                return true;
            case StyleIdentifier.GRID_TABLE_2_ACCENT_3 /* 295 */:
                m46299kk();
                return true;
            case StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3 /* 298 */:
                m46497yj();
                return true;
            case StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_3 /* 299 */:
                m46478ks();
                return true;
            case 300:
                m46473g8();
                return true;
            case 301:
                m46300kk(this.f34421kk.m13382u4() & 65535);
                return true;
            case 302:
                m46288h4(this.f34421kk.m13382u4() & 65535);
                return true;
            case StyleIdentifier.LIST_TABLE_1_LIGHT /* 322 */:
                m46460ar();
                return true;
            case 496:
                m46306to(this.f34421kk.m13382u4() & 65535);
                return true;
            case 505:
                m46482qq();
                return true;
            case InputDeviceCompat.SOURCE_DPAD /* 513 */:
                m46293k4(this.f34421kk.m46389h4());
                return true;
            case 521:
                m46311x1(this.f34421kk.m46389h4());
                return true;
            case 523:
                m46314x1(this.f34421kk.m46390k4().Clone());
                return true;
            case 524:
                c12015qqM46396x1 = this.f34421kk.m46396x1();
                break;
            case 525:
                m46303kk(this.f34421kk.m46390k4().Clone());
                return true;
            case 526:
                m46284du(this.f34421kk.m46396x1().Clone());
                return true;
            case 527:
                m46483rv();
                return true;
            case 529:
                m46494x6();
                return true;
            case 531:
                m46285du(this.f34421kk.m46390k4().Clone());
                return true;
            case 532:
                m46308to(this.f34421kk.m46390k4().Clone().Clone());
                return true;
            case 544:
                m46313x1(this.f34421kk.m46396x1().Clone());
                return true;
            case 552:
                m46471fa();
                return true;
            case 762:
                m46485u4();
                return true;
            case 763:
                m46491wl();
                return true;
            case 764:
                m46489uz();
                return true;
            case 804:
                m46492wy();
                return true;
            case 805:
                m46461b3();
                return true;
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                c12015qqM46396x1 = m46474h4(m46282du().m46329h4().m56570m9().Clone());
                break;
            case EditingLanguage.KOREAN /* 1042 */:
                m46307to(m46474h4(m46287h4().m56570m9().Clone()).Clone());
                return true;
            case EditingLanguage.POLISH /* 1045 */:
                m46312x1(this.f34421kk.m46395to().Clone());
                return true;
            case EditingLanguage.PORTUGUESE_BRAZIL /* 1046 */:
                m46296k4(this.f34421kk.m46395to().Clone());
                return true;
            case EditingLanguage.ROMANIAN /* 1048 */:
                m46495xk();
                return true;
            case 1051:
                m46301kk(this.f34421kk.m46395to().Clone());
                return true;
            case 1055:
                m46496yd();
                return true;
            case EditingLanguage.PERSIAN /* 1065 */:
                m46487up();
                return true;
            case 1313:
                m46479lr();
                return true;
            case 1336:
                m46459ak();
                return true;
            case 1564:
                m46470e0();
                return true;
            case 1565:
                m46481qm();
                return true;
            case 1574:
                m46463bz();
                return true;
            case 1791:
                m46475ix();
                return true;
            case 2071:
                m46468dq();
                return true;
            case EditingLanguage.SERBIAN_LATIN_SERBIA_AND_MONTENEGRO /* 2074 */:
                m46465c6();
                return true;
            case 2096:
                m46484ts();
                return true;
            case 2368:
                m46488up(i2);
                return true;
            case 2610:
                m46469dy(i2);
                return true;
            case 2881:
                m46467ck(i2);
                return true;
            case 3907:
                m46476jd(i2);
                return true;
            default:
                return true;
        }
        m46302kk(c12015qqM46396x1.Clone());
        return true;
    }
}
