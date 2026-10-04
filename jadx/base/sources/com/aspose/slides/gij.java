package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p077d8.C3080qw;
import com.aspose.slides.internal.p077d8.C3088tq;
import com.aspose.slides.internal.p077d8.C3114yo;
import com.aspose.slides.internal.p077d8.InterfaceC3096vh;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p407st.C10372bq;
import com.aspose.slides.internal.p407st.C10382c3;
import com.aspose.slides.internal.p407st.C10384c5;
import com.aspose.slides.internal.p407st.C10390cl;
import com.aspose.slides.internal.p407st.C10403dk;
import com.aspose.slides.internal.p407st.C10413dy;
import com.aspose.slides.internal.p407st.C10414e0;
import com.aspose.slides.internal.p407st.C10415e2;
import com.aspose.slides.internal.p407st.C10423ek;
import com.aspose.slides.internal.p407st.C10439fh;
import com.aspose.slides.internal.p407st.C10442fp;
import com.aspose.slides.internal.p407st.C10459h0;
import com.aspose.slides.internal.p407st.C10483iu;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10497jm;
import com.aspose.slides.internal.p407st.C10504k5;
import com.aspose.slides.internal.p407st.C10513kp;
import com.aspose.slides.internal.p407st.C10528lr;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10580ou;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p407st.C10593po;
import com.aspose.slides.internal.p407st.C10612qv;
import com.aspose.slides.internal.p407st.C10624rs;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10639so;
import com.aspose.slides.internal.p407st.C10641ss;
import com.aspose.slides.internal.p407st.C10646tb;
import com.aspose.slides.internal.p407st.C10658tw;
import com.aspose.slides.internal.p407st.C10677v4;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.internal.p407st.C10696wp;
import com.aspose.slides.internal.p407st.C10699wt;
import com.aspose.slides.internal.p407st.C10723xz;
import com.aspose.slides.internal.p407st.C10755zn;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.zlb;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gij {

    /* JADX INFO: renamed from: k4 */
    static final C3080qw f5258k4 = m6704h4();

    /* JADX INFO: renamed from: kk */
    private boolean f5259kk = false;

    /* JADX INFO: renamed from: x1 */
    private final y2n f5260x1;

    public gij(Presentation presentation, int[] iArr, InterruptionToken interruptionToken) {
        this.f5260x1 = new y2n(new C10591pk(), presentation, iArr, interruptionToken);
    }

    /* JADX INFO: renamed from: c5 */
    private void m6699c5() {
        C10483iu c10483iuM51483du = this.f5260x1.m71954x1().m51483du();
        if (!this.f5260x1.m71946k4().getProtectionManager().isEncrypted() || this.f5260x1.m71946k4().getProtectionManager().getEncryptionPassword() == null) {
            this.f5260x1.m71954x1().m51483du().m50964ks().m50471du(0L);
            return;
        }
        ((ProtectionManager) this.f5260x1.m71946k4().getProtectionManager()).m2464k4();
        y2n y2nVar = this.f5260x1;
        y2nVar.m73704k4(new C10677v4(y2nVar.m71946k4().getProtectionManager().getEncryptionPassword()));
        this.f5260x1.m73714lr().m51839x1().f37199kk.m51866k4().m51854x1(false);
        this.f5260x1.m73714lr().mo51093k4(((c10483iuM51483du.m50955h4() & 4294967295L) + 1) & 4294967295L);
        c10483iuM51483du.m50964ks().m50471du(this.f5260x1.m73714lr().mo51092dy());
        c10483iuM51483du.m50513yj().insertItem(c10483iuM51483du.m50513yj().size() - 2, this.f5260x1.m73714lr());
    }

    /* JADX INFO: renamed from: ck */
    private void m6700ck() {
        List.Enumerator<C10678v6> it = this.f5260x1.m71954x1().m51483du().m50954dy().iterator();
        while (it.hasNext()) {
            try {
                for (C10536m5 c10536m5 : it.next().m51841ck()) {
                    ai5.m3610k4(c10536m5);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: du */
    private C3088tq m6701du() {
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        c3149x1.m13446k4(65534);
        c3149x1.m13446k4(0);
        c3149x1.m13447k4(131334L);
        c3149x1.m13450k4(C14047bz.f47172k4.m66539k4());
        c3149x1.m13447k4(1L);
        c3149x1.m13450k4(new C14047bz("{f29f85e0-4ff9-1068-ab91-08002b27b3d9}").m66539k4());
        c3149x1.m13447k4((c3152yj.getPosition() + 4) & 4294967295L);
        C3080qw c3080qw = f5258k4;
        c3149x1.m13450k4(c3080qw.m13028du());
        c3152yj.setPosition(0L);
        C3088tq c3088tq = new C3088tq(c3152yj);
        c3149x1.m13454x1();
        String[] strArr = {null};
        ((C3114yo) c3080qw.m13029k4().get_Item(18L)).m13288k4(strArr, 1251);
        this.f5260x1.m73709k4(AbstractC6747ar.m26635ix().mo26677to(strArr[0]));
        if (C14084qq.m67081jd().m67130fa() % 2 == 0) {
            this.f5260x1.m73709k4(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
        }
        return c3088tq;
    }

    /* JADX INFO: renamed from: dy */
    private void m6702dy() {
        this.f5260x1.m71946k4().m2389rv().m6639k4().m64797dy();
    }

    /* JADX INFO: renamed from: fa */
    private void m6703fa() {
        List<C10495ji> listM52056h4;
        C10699wt c10699wtM51127to = this.f5260x1.m71954x1().m51483du().m50965m9().m51700c5().m51127to();
        if (c10699wtM51127to == null || c10699wtM51127to.m50513yj().size() < 1) {
            this.f5260x1.m71946k4().m2389rv().m6639k4().m64799k4(0, (IFontData) new FontData("Arial"));
        }
        this.f5260x1.m71954x1().m51483du().m50513yj().addItem(new C10755zn());
        C10372bq c10372bq = new C10372bq();
        this.f5260x1.m71954x1().m51483du().m50513yj().addItem(c10372bq);
        c10372bq.m50476kk(1L);
        c10372bq.m50471du(0L);
        c10372bq.m50474k4(0L);
        c10372bq.m50480x1(f6b.m5849ck(this.f5260x1.m71946k4().getViewProperties().getLastView()));
        if (this.f5260x1.m71946k4().getSlides().size() > 0 && (listM52056h4 = this.f5260x1.m71954x1().m51483du().m50965m9().m51704ix().m51969x1().m52056h4()) != null) {
            c10372bq.m50474k4(listM52056h4.get_Item(0).m51011to());
        }
        this.f5260x1.m71954x1().m51483du().m50953du();
        this.f5260x1.m71954x1().m51483du().m50964ks().m50481x1(0L);
        C10528lr c10528lr = new C10528lr();
        c10528lr.m51216k4("Aspose.Slides");
        this.f5260x1.m71954x1().m51490to().m52065k4(c10528lr);
    }

    /* JADX INFO: renamed from: h4 */
    private static C3080qw m6704h4() {
        C3080qw c3080qw = new C3080qw();
        c3080qw.m13029k4().removeItemByKey(0L);
        c3080qw.m13029k4().set_Item(1L, new C3114yo((short) 1251));
        c3080qw.m13029k4().set_Item(2L, new C3114yo("Slide 1", false));
        c3080qw.m13029k4().set_Item(4L, new C3114yo("Aspose.Slides", false));
        c3080qw.m13029k4().set_Item(8L, new C3114yo("Aspose.Slides", false));
        c3080qw.m13029k4().set_Item(9L, new C3114yo("1", false));
        c3080qw.m13029k4().set_Item(10L, new C3114yo(C14084qq.m67081jd().Clone()));
        c3080qw.m13029k4().set_Item(12L, new C3114yo(C14084qq.m67081jd().Clone()));
        c3080qw.m13029k4().set_Item(13L, new C3114yo(C14084qq.m67081jd().Clone()));
        c3080qw.m13029k4().set_Item(15L, new C3114yo(0));
        c3080qw.m13029k4().set_Item(18L, new C3114yo("Aspose.Slides Library", false));
        return c3080qw;
    }

    /* JADX INFO: renamed from: ix */
    private void m6705ix() {
        if (this.f5260x1.m71946k4().getImages().size() > 0) {
            List list = new List();
            IGenericEnumerator<KeyValuePair<Integer, uki>> it = this.f5260x1.m71939c5().iterator();
            long jM50684to = 0;
            while (it.hasNext()) {
                try {
                    C10403dk c10403dkM71718k4 = it.next().getValue().m71718k4(jM50684to);
                    jM50684to = ((jM50684to & 4294967295L) + (c10403dkM71718k4.m50684to() & 4294967295L)) & 4294967295L;
                    list.addItem(c10403dkM71718k4);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (this.f5260x1.m71945jd().size() > 0) {
                C10413dy c10413dyM51039to = this.f5260x1.m71954x1().m51483du().m50965m9().m51713rv().m50723to().m51596x1().m51039to();
                it = this.f5260x1.m71945jd().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair<Integer, uki> next = it.next();
                        C10384c5 c10384c5 = new C10384c5();
                        next.getValue().m71719k4(c10384c5);
                        c10413dyM51039to.m50513yj().addItem(c10384c5);
                    } finally {
                    }
                }
            }
            if (this.f5260x1.m71954x1().m51488kk().m50513yj().size() > 0) {
                C10423ek c10423ekM50870to = this.f5260x1.m71954x1().m51483du().m50965m9().m51701ck().m51672x1().m50870to();
                for (int i = 0; i < list.size(); i++) {
                    c10423ekM50870to.m50513yj().addItem(list.get_Item(i));
                }
                c10423ekM50870to.m51409um().m51920k4((short) c10423ekM50870to.m50513yj().size());
            }
        }
    }

    /* JADX INFO: renamed from: jd */
    private void m6706jd() {
        m6700ck();
    }

    /* JADX INFO: renamed from: k4 */
    private C14047bz m6707k4(ISaveOptions iSaveOptions) {
        C14047bz c14047bz = new C14047bz("{64818d11-4f9b-11cf-86ea-00aa00b929e8}");
        IPptOptions iPptOptions = (IPptOptions) C7019kk.m27452k4((Object) iSaveOptions, IPptOptions.class);
        return iPptOptions == null ? c14047bz : ((PptOptions) iPptOptions).m2318k4();
    }

    /* JADX INFO: renamed from: kk */
    private C3088tq m6716kk() {
        SortedList<Long, InterfaceC3096vh> sortedListM13029k4;
        long j;
        C3114yo c3114yo;
        C3152yj c3152yj = new C3152yj();
        C3149x1 c3149x1 = new C3149x1(c3152yj);
        oca ocaVar = new oca(this.f5260x1.m71946k4());
        c3149x1.m13446k4(65534);
        c3149x1.m13446k4(0);
        c3149x1.m13447k4(131334L);
        c3149x1.m13450k4(C14047bz.f47172k4.m66539k4());
        c3149x1.m13447k4(1L);
        c3149x1.m13450k4(new C14047bz("{d5cdd502-2e9c-101b-9397-08002b2cf9ae}").m66539k4());
        c3149x1.m13447k4((c3152yj.getPosition() + 4) & 4294967295L);
        C3080qw c3080qw = new C3080qw();
        c3080qw.m13029k4().removeItemByKey(0L);
        c3080qw.m13029k4().removeItemByKey(2L);
        c3080qw.m13029k4().set_Item(1L, new C3114yo((short) 1251));
        c3080qw.m13029k4().set_Item(3L, new C3114yo("On-screen Show (4:3)", false));
        c3080qw.m13029k4().set_Item(4L, new C3114yo(this.f5260x1.m71954x1().m51483du().mo50440k4()));
        c3080qw.m13029k4().set_Item(6L, new C3114yo(ocaVar.m68451to()));
        c3080qw.m13029k4().set_Item(7L, new C3114yo(ocaVar.m68452x1()));
        c3080qw.m13029k4().set_Item(8L, new C3114yo(ocaVar.m68449kk()));
        c3080qw.m13029k4().set_Item(9L, new C3114yo(ocaVar.m68448k4()));
        c3080qw.m13029k4().set_Item(10L, new C3114yo(ocaVar.m68446du()));
        c3080qw.m13029k4().set_Item(11L, new C3114yo(false));
        c3080qw.m13029k4().set_Item(15L, new C3114yo("Aspose", false));
        c3080qw.m13029k4().set_Item(16L, new C3114yo(false));
        c3080qw.m13029k4().set_Item(19L, new C3114yo(false));
        c3080qw.m13029k4().set_Item(22L, new C3114yo(false));
        c3080qw.m13029k4().set_Item(23L, new C3114yo(727464));
        c3080qw.m13029k4().set_Item(13L, new C3114yo(m6715k4(ocaVar)));
        c3080qw.m13029k4().set_Item(12L, new C3114yo(m6729x1(ocaVar)));
        if (m6725uz() && (this.f5260x1.m71946k4().m2351fa().m68385qq() != null || this.f5260x1.m71946k4().m2393up().m73085kk() != null)) {
            if (this.f5260x1.m71946k4().m2351fa().m68385qq() != null && this.f5260x1.m71946k4().m2393up().m73085kk() != null) {
                throw new InvalidOperationException();
            }
            if (this.f5260x1.m71946k4().m2351fa().m68385qq() != null) {
                sortedListM13029k4 = c3080qw.m13029k4();
                j = 24L;
                c3114yo = new C3114yo(65, m6722to());
            } else if (this.f5260x1.m71946k4().m2393up().m73085kk() != null) {
                sortedListM13029k4 = c3080qw.m13029k4();
                j = 24L;
                c3114yo = new C3114yo(this.f5260x1.m71946k4().m2393up().m73085kk());
            }
            sortedListM13029k4.set_Item(j, c3114yo);
        }
        c3149x1.m13450k4(c3080qw.m13028du());
        c3152yj.setPosition(0L);
        C3088tq c3088tq = new C3088tq(c3152yj);
        c3149x1.m13454x1();
        return c3088tq;
    }

    /* JADX INFO: renamed from: ks */
    private void m6717ks() {
        C10639so c10639soM51721x6 = this.f5260x1.m71954x1().m51483du().m50965m9().m51721x6();
        C10624rs c10624rsM51693x1 = c10639soM51721x6.m51693x1();
        c10624rsM51693x1.m51653to(this.f5260x1.m73694e0());
        if (c10624rsM51693x1.m51647h4()) {
            c10639soM51721x6.m51691kk(this.f5260x1.m73691bz());
        }
        c10624rsM51693x1.m51649k4(this.f5260x1.m73732xk());
        if (c10624rsM51693x1.m51651kk()) {
            c10624rsM51693x1.m51645du(this.f5260x1.m73692c6());
            if (c10624rsM51693x1.m51652m9()) {
                c10639soM51721x6.m51689k4(this.f5260x1.m73722ts());
            }
        }
        c10624rsM51693x1.m51656x1(this.f5260x1.m73716qm());
        List.Enumerator<rpo> it = this.f5260x1.m73720ss().iterator();
        while (it.hasNext()) {
            try {
                rpo next = it.next();
                C10556n5 c10556n5 = (C10556n5) next.m70228to();
                if (c10556n5.m51360qq().m50982m9() != 2) {
                    C10639so c10639soM51365x6 = c10556n5.m51365x6();
                    if (C14093tq.m67295k4(next.m70223lr(), new C14093tq(Boolean.FALSE)) || c10639soM51365x6.equals(c10639soM51721x6)) {
                        c10556n5.m50513yj().removeItem(c10639soM51365x6);
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

    /* JADX INFO: renamed from: m9 */
    private void m6718m9() throws Throwable {
        boolean z;
        Presentation presentationM71946k4 = this.f5260x1.m71946k4();
        m6702dy();
        m6724up();
        m6730x6();
        m6719ne();
        m6723u4();
        m6726wl();
        m6717ks();
        m6721rv();
        m6720qq();
        m6705ix();
        m6703fa();
        m6732k4();
        m6727x1();
        IDigitalSignatureCollection digitalSignatures = presentationM71946k4.getDigitalSignatures();
        if (digitalSignatures.size() > 0) {
            IGenericEnumerator<IDigitalSignature> it = digitalSignatures.iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    DigitalSignature digitalSignature = (DigitalSignature) it.next();
                    if (digitalSignature.getCertificate() != null && digitalSignature.m1326k4().m15327x6() != null) {
                        z = true;
                        break;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            z = false;
        }
        if (z) {
            List<byte[]> list = new List<>(digitalSignatures.size());
            IGenericEnumerator<IDigitalSignature> it2 = digitalSignatures.iterator();
            while (it2.hasNext()) {
                try {
                    DigitalSignature digitalSignature2 = (DigitalSignature) it2.next();
                    if (digitalSignature2.getCertificate() != null && digitalSignature2.m1326k4().m15327x6() != null) {
                        C3152yj c3152yj = new C3152yj();
                        try {
                            C3059ii c3059ii = new C3059ii(c3152yj, AbstractC6747ar.m26635ix(), 0);
                            c3059ii.m66262x1(4);
                            c3059ii.mo65747x1(true);
                            C0972f0.m5799k4(c3059ii, digitalSignature2, null);
                            c3059ii.m66257k4();
                            c3059ii.mo21896h4();
                            c3059ii.mo21893du();
                            list.addItem(c3152yj.toArray());
                            c3152yj.dispose();
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
            this.f5260x1.m71954x1().m51485k4(list);
        }
        m6706jd();
        m6699c5();
    }

    /* JADX INFO: renamed from: ne */
    private void m6719ne() {
        List.Enumerator<rpo> it = this.f5260x1.m73728wp().iterator();
        while (it.hasNext()) {
            try {
                yiz.m73912k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<rpo> it2 = this.f5260x1.m73728wp().iterator();
        while (it2.hasNext()) {
            try {
                gh7.m6655k4(it2.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        List.Enumerator<rpo> it3 = this.f5260x1.m73720ss().iterator();
        while (it3.hasNext()) {
            try {
                dki.m5125k4(it3.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        agf.m3572k4(this.f5260x1.m73696g8());
        C14661v2.m72058k4(this.f5260x1.m73721sv());
        it = this.f5260x1.m73712kp().iterator();
        while (it.hasNext()) {
            try {
                k4v.m63652k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: qq */
    private void m6720qq() {
        Dictionary.Enumerator<C10580ou, ISlide> it = this.f5260x1.m73727wl().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                long jM51011to = this.f5260x1.m73718rv().get_Item((BaseSlide) next.getValue()).m70209fa().m51011to();
                long j = (4294967295L & ((jM51011to & 4294967295L) - 256)) + 1;
                ((C10580ou) next.getKey()).m50513yj().addItem(new C10626rv(C14113y2.m67408k4("Slide ", C14114y9.m67465x1(j)), (short) 0));
                ((C10580ou) next.getKey()).m50513yj().addItem(new C10626rv(C14113y2.m67408k4(C14114y9.m67459k4(jM51011to, (InterfaceC14073kp) C11697x1.m55250kk()), ",", C14114y9.m67465x1(j), ",Slide ", C14114y9.m67465x1(j)), (short) 3));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m6721rv() {
        MasterNotesSlide masterNotesSlide = (MasterNotesSlide) this.f5260x1.m71946k4().getMasterNotesSlideManager().getMasterNotesSlide();
        if (masterNotesSlide != null) {
            C10639so c10639soM51711ne = this.f5260x1.m71954x1().m51483du().m50965m9().m51711ne();
            C10624rs c10624rsM51693x1 = c10639soM51711ne.m51693x1();
            if (masterNotesSlide.m1933x6().m72932dy() != null) {
                c10624rsM51693x1.m51649k4(masterNotesSlide.m1933x6().m72932dy().m39712to());
                c10624rsM51693x1.m51650kk(masterNotesSlide.m1933x6().m72932dy().m39714x1());
                c10624rsM51693x1.m51653to(masterNotesSlide.m1933x6().m72932dy().m39710kk());
                c10624rsM51693x1.m51656x1(masterNotesSlide.m1933x6().m72932dy().m39708k4());
                AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) masterNotesSlide.m391k4((byte) 4), AutoShape.class);
                if (c10624rsM51693x1.m51651kk() && autoShape != null && (autoShape.getTextFrame().getParagraphs().getCount() == 0 || autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().getCount() == 0 || autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getField() == null)) {
                    c10624rsM51693x1.m51645du(true);
                    c10639soM51711ne.m51689k4(autoShape.getTextFrame().getText());
                }
                AutoShape autoShape2 = (AutoShape) C7019kk.m27452k4((Object) masterNotesSlide.m391k4((byte) 7), AutoShape.class);
                if (c10624rsM51693x1.m51646du() && autoShape2 != null) {
                    c10639soM51711ne.m51694x1(autoShape2.getTextFrame().getText());
                }
                AutoShape autoShape3 = (AutoShape) C7019kk.m27452k4((Object) masterNotesSlide.m391k4((byte) 6), AutoShape.class);
                if (!c10624rsM51693x1.m51647h4() || autoShape3 == null) {
                    return;
                }
                c10639soM51711ne.m51691kk(autoShape3.getTextFrame().getText());
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private byte[] m6722to() {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            try {
                int length = this.f5260x1.m71946k4().m2351fa().m68385qq().length + 8;
                int length2 = this.f5260x1.m71946k4().m2351fa().m68385qq().length;
                c3149x1.m13450k4(C14069jd.m66785x1(length));
                c3149x1.m13450k4(C14069jd.m66785x1(length2));
                c3149x1.m13450k4(C14069jd.m66785x1(8));
                c3149x1.m13450k4(this.f5260x1.m71946k4().m2351fa().m68385qq());
                c3149x1.dispose();
                return c3152yj.toArray();
            } catch (Throwable th) {
                c3149x1.dispose();
                throw th;
            }
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: u4 */
    private void m6723u4() {
        if (this.f5260x1.m71946k4().getVbaProject() != null) {
            C10415e2 c10415e2M50717ck = this.f5260x1.m71954x1().m51483du().m50965m9().m51713rv().m50717ck();
            C10504k5 c10504k5 = new C10504k5();
            if (m6725uz()) {
                c10504k5.m51094k4(this.f5260x1.m71946k4().m2351fa().m68392uz());
            } else {
                c10504k5.m51094k4(this.f5260x1.m71946k4().m2396x1() == null ? null : this.f5260x1.m71946k4().m2396x1().m14856k4());
            }
            c10415e2M50717ck.m50725to().m51097k4(this.f5260x1.m71954x1().m51483du().m50957k4(c10504k5));
            c10415e2M50717ck.m50725to().m51098k4(true);
        }
    }

    /* JADX INFO: renamed from: up */
    private void m6724up() {
        Presentation presentationM71946k4 = this.f5260x1.m71946k4();
        C10641ss c10641ssM50965m9 = this.f5260x1.m71954x1().m51483du().m50965m9();
        m6714k4(c10641ssM50965m9.m51702du(), presentationM71946k4);
        C10513kp c10513kpM51700c5 = c10641ssM50965m9.m51700c5();
        C10612qv c10612qv = new C10612qv();
        c10513kpM51700c5.m50513yj().addItem(c10612qv);
        ai5.m3605k4(presentationM71946k4.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat(), c10612qv.m51607x1(), this.f5260x1);
        c10612qv.m51607x1().m51518h4((byte) 0);
        c10612qv.m51607x1().m51532m9(new C14093tq<>());
        C10723xz c10723xz = new C10723xz();
        c10513kpM51700c5.m50513yj().addItem(c10723xz);
        c10723xz.m52023kk();
        C10442fp c10442fp = new C10442fp();
        c10513kpM51700c5.m50513yj().addItem(c10442fp);
        m6711k4(presentationM71946k4.getDefaultTextStyle().getDefaultParagraphFormat(), c10442fp.m50800x1());
        C10536m5[] c10536m5Arr = new C10536m5[9];
        this.f5260x1.m73710k4(c10536m5Arr);
        for (int i = 0; i < 9; i++) {
            if (i != 3) {
                C10536m5 c10536m5 = new C10536m5();
                c10536m5Arr[i] = c10536m5;
                c10536m5.m51272k4(i, true);
            }
        }
        C10536m5 c10536m5M3600k4 = ai5.m3600k4(presentationM71946k4.getDefaultTextStyle(), this.f5260x1);
        if (c10536m5M3600k4 == null) {
            c10536m5M3600k4 = c10536m5Arr[4];
        } else {
            c10536m5Arr[4] = c10536m5M3600k4;
        }
        c10513kpM51700c5.m50513yj().addItem(c10536m5M3600k4);
        c10536m5M3600k4.m51409um().m51920k4((short) 4);
        m6713k4(c10536m5M3600k4, this.f5260x1.m71946k4().getMasterTheme(), this.f5260x1);
        C10459h0 c10459h0M51672x1 = c10641ssM50965m9.m51701ck().m51672x1();
        C10534m3 c10534m3 = new C10534m3();
        c10534m3.m51262k4(0, 0);
        c10459h0M51672x1.m50513yj().addItem(c10534m3);
        C10439fh c10439fh = new C10439fh(134217732L, 134217729L, 134217730L, 268435703L);
        c10439fh.m51409um().m51920k4((short) 4);
        c10459h0M51672x1.m50513yj().addItem(c10439fh);
        C10414e0 c10414e0 = new C10414e0();
        c10414e0.m50724x1();
        c10414e0.m51409um().m51916k4((byte) 15);
        c10414e0.m51409um().m51920k4((short) 0);
        c10641ssM50965m9.m50507k4(c10414e0);
        m6731yj();
    }

    /* JADX INFO: renamed from: uz */
    private boolean m6725uz() {
        return this.f5260x1.m71946k4().m2351fa().m68393wl() != null && this.f5260x1.m71946k4().m2351fa().m68393wl().m3053k4((VbaProject) this.f5260x1.m71946k4().getVbaProject());
    }

    /* JADX INFO: renamed from: wl */
    private void m6726wl() {
        if (this.f5260x1.m71946k4().getCustomData() != null) {
            C13658is.m63093x1(this.f5260x1.m71946k4().getCustomData(), this.f5260x1.m71954x1().m51483du().m50965m9().m51713rv().m50723to());
        }
        if (this.f5260x1.m71946k4().m2393up().m73086x1().m74565k4()) {
            final C10593po[] c10593poArr = {this.f5260x1.m71954x1().m51483du().m50965m9().m51713rv().m50723to().m51595to()};
            this.f5260x1.m71946k4().m2393up().m73086x1().m74563k4(new zlb.AbstractC14894k4() { // from class: com.aspose.slides.gij.1
                @Override // com.aspose.slides.zlb.AbstractC14894k4
                /* JADX INFO: renamed from: k4 */
                public void mo6736k4(C10626rv c10626rv) {
                    c10593poArr[0].m50513yj().addItem(c10626rv);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m6727x1() {
        IDocumentProperties documentProperties = this.f5260x1.m71946k4().getDocumentProperties();
        DocumentProperties documentProperties2 = (DocumentProperties) documentProperties;
        documentProperties2.m1346to(C14084qq.m67074c5().Clone());
        C14670va c14670va = new C14670va(m6716kk(), m6701du());
        documentProperties2.m1346to(C14084qq.m67074c5().Clone());
        byte[][] bArr = {null};
        byte[][] bArr2 = {null};
        m6710k4(documentProperties, c14670va, bArr, bArr2);
        byte[] bArr3 = bArr[0];
        byte[] bArr4 = bArr2[0];
        if (bArr3 != null) {
            this.f5260x1.m71954x1().m51486k4(bArr3);
        }
        if (bArr4 != null) {
            this.f5260x1.m71954x1().m51492x1(bArr4);
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m6730x6() {
        for (int i = 0; i < this.f5260x1.m71946k4().getMasters().size(); i++) {
            new rpo((MasterSlide) this.f5260x1.m71946k4().getMasters().get_Item(i), this.f5260x1);
        }
        if (this.f5260x1.m71946k4().getMasterNotesSlideManager().getMasterNotesSlide() != null) {
            new rpo((MasterNotesSlide) this.f5260x1.m71946k4().getMasterNotesSlideManager().getMasterNotesSlide(), this.f5260x1).m70228to();
        }
        IMasterHandoutSlide masterHandoutSlide = this.f5260x1.m71946k4().getMasterHandoutSlideManager().getMasterHandoutSlide();
        if (masterHandoutSlide != null) {
            new rpo((MasterHandoutSlide) masterHandoutSlide, this.f5260x1).m70228to();
        }
        List.Enumerator<rpo> it = this.f5260x1.m73728wp().iterator();
        while (it.hasNext()) {
            try {
                gh7.m6662x1(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        for (int i2 = 0; i2 < this.f5260x1.m71946k4().getSlides().size(); i2++) {
            new rpo((Slide) this.f5260x1.m71946k4().getSlides().get_Item(i2), this.f5260x1);
        }
    }

    /* JADX INFO: renamed from: yj */
    private void m6731yj() {
        IViewProperties viewProperties = this.f5260x1.m71946k4().getViewProperties();
        C10414e0 c10414e0M51713rv = this.f5260x1.m71954x1().m51483du().m50965m9().m51713rv();
        ahk.m3577k4(((ViewProperties) viewProperties).getNormalViewProperties(), c10414e0M51713rv.m50718du().m50825to());
        C13823m7.m64785k4(viewProperties.getSlideViewProperties(), c10414e0M51713rv.m50719dy().m51743to());
        C13823m7.m64785k4(viewProperties.getNotesViewProperties(), c10414e0M51713rv.m50716c5().m51743to());
    }

    /* JADX INFO: renamed from: x1 */
    private void m6728x1(ISaveOptions iSaveOptions) {
        this.f5259kk = true;
        this.f5260x1.m73702k4(iSaveOptions);
        String[] strArr = {null};
        ((C3114yo) f5258k4.m13029k4().get_Item(18L)).m13288k4(strArr, 1251);
        this.f5260x1.m73709k4(AbstractC6747ar.m26635ix().mo26677to(strArr[0]));
        if (C14084qq.m67081jd().m67130fa() % 2 == 0) {
            this.f5260x1.m73709k4(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6732k4() throws Throwable {
        gij gijVar;
        C10699wt c10699wt = new C10699wt();
        this.f5260x1.m71954x1().m51483du().m50965m9().m51700c5().m50507k4(c10699wt);
        C1197hf c1197hfM2385ks = this.f5260x1.m71946k4().m2385ks();
        IGenericList<IFontData> iGenericListM64810to = this.f5260x1.m71946k4().m2389rv().m6639k4().m64810to();
        List<String> list = new List<>();
        IGenericEnumerator<IFontData> it = iGenericListM64810to.iterator();
        while (it.hasNext()) {
            try {
                IFontData next = it.next();
                C1141ge c1141geM7134x1 = c1197hfM2385ks.m7134x1(next.getFontName());
                if (c1141geM7134x1 != null) {
                    try {
                        this.f5260x1.m71954x1().m51483du().m50965m9().m51702du().m51936k4(true);
                        try {
                            m6735k4(c1141geM7134x1.getFontName(), c1141geM7134x1.m6503k4(), (byte) c1141geM7134x1.m6500du(), c1141geM7134x1.m6501dy(), c10699wt);
                            gijVar = this;
                        } catch (Throwable th) {
                            th = th;
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gijVar = this;
                    }
                    try {
                        m6733k4(c1141geM7134x1, c10699wt);
                        list.addItem(c1141geM7134x1.getFontName());
                    } catch (Throwable th3) {
                        th = th3;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        }
                        throw th;
                    }
                } else {
                    FontData fontData = (FontData) next;
                    try {
                        m6735k4(fontData.getFontName(), fontData.m1485k4(), fontData.m1490x1(), false, c10699wt);
                    } catch (Throwable th4) {
                        th = th4;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m6708k4(list, c10699wt);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6708k4(List<String> list, C10699wt c10699wt) throws Throwable {
        C1197hf c1197hfM2385ks = this.f5260x1.m71946k4().m2385ks();
        if (c1197hfM2385ks.m7119du()) {
            IGenericEnumerator<KeyValuePair<String, C1141ge>> it = c1197hfM2385ks.m7122k4().iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair<String, C1141ge> next = it.next();
                    C1141ge value = next.getValue();
                    if (!list.containsItem(value.getFontName())) {
                        C10699wt c10699wt2 = c10699wt;
                        try {
                            m6735k4(value.getFontName(), value.m6503k4(), (byte) value.m6500du(), value.m6501dy(), c10699wt2);
                            m6733k4(next.getValue(), c10699wt2);
                            c10699wt = c10699wt2;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                throw th2;
                            }
                            it.dispose();
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m6729x1(oca ocaVar) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            c3149x1.m13447k4(4108L);
            c3149x1.m13447k4(6L);
            m6712k4(c3149x1, "Fonts Used", ocaVar.m68447h4().size());
            m6712k4(c3149x1, "Theme", 1);
            m6712k4(c3149x1, "Slide Titles", ocaVar.m68450m9().size());
            return c3152yj.toArray();
        } finally {
            c3152yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6709k4(IDocumentProperties iDocumentProperties, C14670va c14670va) {
        for (int i = 0; i < iDocumentProperties.getCountOfCustomProperties(); i++) {
            String customPropertyName = iDocumentProperties.getCustomPropertyName(i);
            Object objM1348x1 = ((DocumentProperties) iDocumentProperties).m1348x1(customPropertyName);
            if (C7019kk.m27469x1(objM1348x1, Boolean.class)) {
                c14670va.m72133k4(customPropertyName, ((Boolean) C7019kk.m27464to(objM1348x1, Boolean.TYPE)).booleanValue());
            } else if (C7019kk.m27469x1(objM1348x1, Integer.class)) {
                c14670va.m72130k4(customPropertyName, ((Integer) C7019kk.m27464to(objM1348x1, Integer.TYPE)).intValue());
            } else if (C7019kk.m27469x1(objM1348x1, C14084qq.class)) {
                c14670va.m72131k4(customPropertyName, ((C14084qq) C7019kk.m27464to(objM1348x1, C14084qq.class)).Clone());
            } else if (C7019kk.m27469x1(objM1348x1, Float.class)) {
                c14670va.m72129k4(customPropertyName, ((Float) C7019kk.m27464to(objM1348x1, Float.TYPE)).floatValue());
            } else if (C7019kk.m27469x1(objM1348x1, Double.class)) {
                c14670va.m72128k4(customPropertyName, ((Double) C7019kk.m27464to(objM1348x1, Double.TYPE)).doubleValue());
            } else {
                c14670va.m72132k4(customPropertyName, objM1348x1.toString());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6710k4(IDocumentProperties iDocumentProperties, C14670va c14670va, byte[][] bArr, byte[][] bArr2) {
        bArr[0] = null;
        bArr2[0] = null;
        c14670va.m72142kk(iDocumentProperties.getAuthor());
        c14670va.m72145m9(iDocumentProperties.getPresentationFormat());
        c14670va.m72122jd(iDocumentProperties.getCategory());
        c14670va.m72113du(iDocumentProperties.getComments());
        c14670va.m72109c5(iDocumentProperties.getCompany());
        DocumentProperties documentProperties = (DocumentProperties) iDocumentProperties;
        c14670va.m72158x1(documentProperties.m1347x1().Clone());
        c14670va.m72150to(iDocumentProperties.getKeywords());
        c14670va.m72126k4(documentProperties.m1345to().Clone());
        c14670va.m72119h4(iDocumentProperties.getLastSavedBy());
        c14670va.m72141kk(documentProperties.m1342kk().Clone());
        c14670va.m72115dy(iDocumentProperties.getManager());
        c14670va.m72111ck(iDocumentProperties.getNameOfApplication());
        c14670va.m72124k4(iDocumentProperties.getRevisionNumber());
        c14670va.m72159x1(iDocumentProperties.getSubject());
        c14670va.m72117fa(iDocumentProperties.getApplicationTemplate());
        c14670va.m72127k4(iDocumentProperties.getTitle());
        c14670va.m72125k4(documentProperties.m1334k4().Clone());
        c14670va.m72153up(iDocumentProperties.getHyperlinkBase());
        m6709k4(iDocumentProperties, c14670va);
        if (c14670va.m72147qq() != null) {
            bArr[0] = c14670va.m72147qq().m13123k4();
        }
        if (c14670va.m72155wl() != null) {
            bArr2[0] = c14670va.m72155wl().m13123k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6711k4(IParagraphFormat iParagraphFormat, C10382c3 c10382c3) {
        c10382c3.m50524k4(new C10390cl(false, true, false));
        IPortionFormat defaultPortionFormat = ((ParagraphFormat) iParagraphFormat).getPresentation().getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
        c10382c3.m50525k4(!C14113y2.m67411k4(defaultPortionFormat.getLanguageId()) ? ai5.m3601k4(defaultPortionFormat.getLanguageId()).Clone() : new C14093tq<>(1049));
        c10382c3.m50530x1(!C14113y2.m67411k4(defaultPortionFormat.getAlternativeLanguageId()) ? ai5.m3601k4(defaultPortionFormat.getAlternativeLanguageId()).Clone() : new C14093tq<>(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4 A[Catch: all -> 0x0108, LOOP:1: B:65:0x00de->B:45:0x00e4, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x0108, blocks: (B:43:0x00de, B:45:0x00e4), top: B:65:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6733k4(C1141ge c1141ge, C10699wt c10699wt) {
        IGenericDictionary iGenericDictionaryM6508m9;
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it;
        if (c1141ge.m6502h4().size() == 0) {
            throw new InvalidOperationException("EmbeddedFont.Styles length must be greater than zero");
        }
        if (c1141ge.m6501dy()) {
            IGenericDictionary<Integer, byte[]> iGenericDictionaryM1548k4 = ((FontsManager) this.f5260x1.m71946k4().getFontsManager()).m1548k4(c1141ge, this.f5260x1.f50258k4);
            iGenericDictionaryM6508m9 = new Dictionary();
            IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = iGenericDictionaryM1548k4.iterator();
            while (true) {
                try {
                    if (!it2.hasNext()) {
                        break;
                    }
                    KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                    try {
                        iGenericDictionaryM6508m9.addItem(keyValuePair.getKey(), FontsManager.m1544k4((byte[]) keyValuePair.getValue(), new FontData[]{null}));
                    } catch (RuntimeException unused) {
                        if (c1141ge.m6508m9().size() > 0) {
                            iGenericDictionaryM6508m9 = c1141ge.m6508m9();
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            }
                            it = iGenericDictionaryM6508m9.iterator();
                            while (it.hasNext()) {
                                try {
                                } finally {
                                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                        it.dispose();
                                    }
                                }
                            }
                        } else {
                            iGenericDictionaryM6508m9.addItem(keyValuePair.getKey(), keyValuePair.getValue());
                        }
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
        } else {
            iGenericDictionaryM6508m9 = c1141ge.m6508m9();
            if (iGenericDictionaryM6508m9.size() == 0) {
                iGenericDictionaryM6508m9 = new Dictionary(c1141ge.m6502h4().size());
                it = c1141ge.m6502h4().iterator();
                while (it.hasNext()) {
                    try {
                        KeyValuePair keyValuePair2 = (KeyValuePair) it.next();
                        iGenericDictionaryM6508m9.addItem(keyValuePair2.getKey(), FontsManager.m1544k4((byte[]) keyValuePair2.getValue(), new FontData[]{null}));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        it = iGenericDictionaryM6508m9.iterator();
        while (it.hasNext()) {
            KeyValuePair keyValuePair3 = (KeyValuePair) it.next();
            C10658tw c10658tw = new C10658tw();
            c10658tw.m51781k4((byte[]) keyValuePair3.getValue());
            c10658tw.m51409um().m51920k4((short) 0);
            c10699wt.m50513yj().addItem(c10658tw);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6712k4(C3149x1 c3149x1, String str, int i) {
        c3149x1.m13447k4(30L);
        c3149x1.m13447k4(((long) (str.length() + 1)) & 4294967295L);
        c3149x1.m13450k4(AbstractC6747ar.m26650yj().mo26677to(str));
        c3149x1.m13443k4((byte) 0);
        c3149x1.m13447k4(3L);
        c3149x1.m13455x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6734k4(AbstractC3150x6 abstractC3150x6, ISaveOptions iSaveOptions) throws Throwable {
        m6728x1(iSaveOptions);
        m6718m9();
        C9816ck c9816ck = new C9816ck();
        c9816ck.m48360k4().m48389x1(m6707k4(iSaveOptions).Clone().m66539k4());
        this.f5260x1.m71954x1().m51491x1(c9816ck);
        if (this.f5260x1.m71946k4().getProtectionManager().isEncrypted() && this.f5260x1.m71946k4().getProtectionManager().getEncryptionPassword() != null) {
            C10646tb.m51726k4(c9816ck, this.f5260x1.m73714lr(), this.f5260x1.m71954x1().m51483du().m50952ck(), this.f5260x1.m71946k4().getProtectionManager().getEncryptionPassword());
        }
        c9816ck.m48362x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6713k4(C10536m5 c10536m5, IMasterTheme iMasterTheme, y2n y2nVar) {
        C13827mb c13827mbM6639k4 = y2nVar.m71946k4().m2389rv().m6639k4();
        if (!c10536m5.m51276to().get_Item(0).m52151x1().m51510c5().m67302x1() && iMasterTheme.getFontScheme().getMajor().getLatinFont() != null && !C14113y2.m67411k4(iMasterTheme.getFontScheme().getMajor().getLatinFont().getFontName())) {
            c10536m5.m51276to().get_Item(0).m52151x1().m51540x1(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64799k4(0, iMasterTheme.getFontScheme().getMajor().getLatinFont()))));
        }
        if (c10536m5.m51276to().get_Item(0).m52151x1().m51520jd().m67302x1() || iMasterTheme.getFontScheme().getMajor().getEastAsianFont() == null || C14113y2.m67411k4(iMasterTheme.getFontScheme().getMajor().getEastAsianFont().getFontName())) {
            return;
        }
        c10536m5.m51276to().get_Item(0).m52151x1().m51528kk(new C14093tq<>(Integer.valueOf(c13827mbM6639k4.m64799k4(1, iMasterTheme.getFontScheme().getMajor().getEastAsianFont()))));
    }

    /* JADX INFO: renamed from: k4 */
    private void m6714k4(C10696wp c10696wp, Presentation presentation) {
        f6b.m5908k4((SlideSize) presentation.getSlideSize(), c10696wp);
        f6b.m5907k4((NotesSize) presentation.getNotesSize(), c10696wp);
        c10696wp.m51942to(presentation.m2393up().m73083k4());
        c10696wp.m51939kk(presentation.m2351fa().m68354c5());
        c10696wp.m51933k4(presentation.getFirstSlideNumber() & 65535);
        c10696wp.m51947x1(!r0.m68358dy());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6735k4(String str, byte b, byte b2, boolean z, C10699wt c10699wt) {
        C10497jm c10497jm = new C10497jm();
        c10497jm.m51409um().m51920k4((short) (c10699wt.m51951x1() + 1));
        c10699wt.m50513yj().addItem(c10497jm);
        c10497jm.m51022k4(str);
        c10497jm.m51021k4(b);
        c10497jm.m51029x1(z ? (byte) 1 : (byte) 0);
        c10497jm.m51024kk((byte) 4);
        c10497jm.m51027to(b2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private byte[] m6715k4(oca ocaVar) {
        C3152yj c3152yj = new C3152yj();
        try {
            C3149x1 c3149x1 = new C3149x1(c3152yj);
            c3149x1.m13447k4(4126L);
            List list = new List(ocaVar.m68447h4().size() + 1 + ocaVar.m68450m9().size());
            list.addRange(ocaVar.m68447h4());
            list.addItem(this.f5260x1.m71946k4().getMasterTheme().getName());
            list.addRange(ocaVar.m68450m9());
            c3149x1.m13455x1(list.size());
            List.Enumerator it = list.iterator();
            while (it.hasNext()) {
                try {
                    String str = (String) it.next();
                    c3149x1.m13447k4(((long) (str.length() + 1)) & 4294967295L);
                    c3149x1.m13450k4(AbstractC6747ar.m26650yj().mo26677to(str));
                    c3149x1.m13443k4((byte) 0);
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
            byte[] array = c3152yj.toArray();
            c3152yj.dispose();
            return array;
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }
}
