package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.a3u;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.BadImageFormatException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p060ca.AbstractC2313tw;
import com.aspose.slides.internal.p060ca.C2033cj;
import com.aspose.slides.internal.p060ca.C2096ga;
import com.aspose.slides.internal.p060ca.C2132iq;
import com.aspose.slides.internal.p060ca.C2350wl;
import com.aspose.slides.internal.p077d8.C3060ix;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3088tq;
import com.aspose.slides.internal.p077d8.C3114yo;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p104ec.C3662y9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7712fy;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p356qb.C9826to;
import com.aspose.slides.internal.p407st.AbstractC10376bv;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.AbstractC10657tu;
import com.aspose.slides.internal.p407st.C10382c3;
import com.aspose.slides.internal.p407st.C10384c5;
import com.aspose.slides.internal.p407st.C10403dk;
import com.aspose.slides.internal.p407st.C10413dy;
import com.aspose.slides.internal.p407st.C10414e0;
import com.aspose.slides.internal.p407st.C10421eg;
import com.aspose.slides.internal.p407st.C10423ek;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10432f5;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10442fp;
import com.aspose.slides.internal.p407st.C10451gi;
import com.aspose.slides.internal.p407st.C10459h0;
import com.aspose.slides.internal.p407st.C10483iu;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10497jm;
import com.aspose.slides.internal.p407st.C10498jn;
import com.aspose.slides.internal.p407st.C10504k5;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10580ou;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p407st.C10608qm;
import com.aspose.slides.internal.p407st.C10612qv;
import com.aspose.slides.internal.p407st.C10614qx;
import com.aspose.slides.internal.p407st.C10618r9;
import com.aspose.slides.internal.p407st.C10624rs;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10634sc;
import com.aspose.slides.internal.p407st.C10639so;
import com.aspose.slides.internal.p407st.C10641ss;
import com.aspose.slides.internal.p407st.C10658tw;
import com.aspose.slides.internal.p407st.C10667um;
import com.aspose.slides.internal.p407st.C10676v0;
import com.aspose.slides.internal.p407st.C10690w8;
import com.aspose.slides.internal.p407st.C10696wp;
import com.aspose.slides.internal.p407st.C10699wt;
import com.aspose.slides.internal.p407st.C10723xz;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.C11708b5;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11848x3;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13970rs;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.aspose.words.EditingLanguage;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gni {

    /* JADX INFO: renamed from: k4 */
    private final Presentation f5290k4;

    /* JADX INFO: renamed from: x1 */
    private a3u f5291x1;

    public gni(Presentation presentation) {
        this.f5290k4 = presentation;
        if (presentation == null) {
            throw new ArgumentNullException();
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m6802c5() {
        C11708b5 c11708b5;
        this.f5290k4.m2351fa().m68374k4(new oyy(this.f5290k4));
        C10690w8 c10690w8M51699ar = this.f5291x1.m71951m9().m51699ar();
        if (c10690w8M51699ar == null) {
            return;
        }
        try {
            c11708b5 = new C11708b5(new C3152yj(c10690w8M51699ar.mo51148to()), new AbstractC3174jd() { // from class: com.aspose.slides.gni.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(gni.this.f5291x1.m71955yj()) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
                }

                @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
                /* JADX INFO: renamed from: k4 */
                public void mo4791k4() {
                    gni.this.f5291x1.m71955yj().throwIfInterruptionRequested();
                }
            });
        } catch (C11848x3 unused) {
            c11708b5 = null;
        }
        if (c11708b5 == null || c11708b5.m55286x6() == null) {
            return;
        }
        C11791os c11791osM55286x6 = c11708b5.m55286x6();
        this.f5291x1.m3188ks().m55337k4(c11791osM55286x6.m55377up());
        new w0x(c11791osM55286x6, this.f5291x1.m3188ks()).m72619k4(this.f5290k4.m2351fa().m68389u4());
    }

    /* JADX INFO: renamed from: ck */
    private void m6803ck() {
        long jM51928du = this.f5291x1.m71951m9().m51702du().m51928du();
        if (((C10618r9) this.f5291x1.m71950kk().m50962k4(jM51928du)) == null) {
            return;
        }
        C10495ji c10495ji = new C10495ji(null);
        c10495ji.m51008k4(jM51928du);
        c10495ji.m51013x1(1L);
        c10495ji.m51413x1(this.f5291x1.m71953up());
        agf.m3571k4(new m4c(c10495ji, this.f5291x1));
    }

    /* JADX INFO: renamed from: du */
    private void m6804du() {
        try {
            if (this.f5291x1.m71944h4().m50900x1()) {
                List list = new List();
                C10459h0 c10459h0M51672x1 = this.f5291x1.m71951m9().m51701ck().m51672x1();
                if (c10459h0M51672x1 == null || c10459h0M51672x1.m50870to() == null) {
                    return;
                }
                C10423ek c10423ekM50870to = c10459h0M51672x1.m50870to();
                c10423ekM50870to.m51408lr();
                c10423ekM50870to.m50513yj().size();
                boolean z = false;
                for (int i = 0; i < c10423ekM50870to.m50513yj().size(); i++) {
                    this.f5291x1.m71955yj().throwIfInterruptionRequested();
                    C10403dk c10403dk = (C10403dk) C7019kk.m27452k4((Object) c10423ekM50870to.m50513yj().get_Item(i), C10403dk.class);
                    if (c10403dk != null) {
                        try {
                            long jM50677du = c10403dk.m50677du();
                            c10403dk.m50684to();
                            AbstractC10657tu abstractC10657tu = (AbstractC10657tu) C7019kk.m27452k4((Object) this.f5291x1.m71944h4().m50898k4(jM50677du & 4294967295L), AbstractC10657tu.class);
                            if (abstractC10657tu != null && abstractC10657tu.m51776dy().length != 0) {
                                abstractC10657tu.f37415jd = c10403dk.m50677du();
                                list.addItem(new C14047bz(c10403dk.m50687x1()));
                                c10403dk.m50680k4(((long) (abstractC10657tu.mo50440k4() + 8)) & 4294967295L);
                                new uki(abstractC10657tu, 0, i + 1, this.f5291x1).m71720k4(c10403dk);
                                if (C7019kk.m27469x1(abstractC10657tu, C10432f5.class)) {
                                    z = true;
                                } else {
                                    C3085sv.m13083k4(C14047bz.m66535k4((C14047bz) list.get_Item(list.size() - 1), abstractC10657tu.m51779m9()), C14113y2.m67408k4("Guid: ", ((C14047bz) list.get_Item(list.size() - 1)).toString(), " != Guid: ", abstractC10657tu.m51779m9().toString()));
                                }
                            }
                        } catch (RuntimeException e) {
                            if (!C7019kk.m27469x1(e, BadImageFormatException.class) && !C7019kk.m27469x1(e, ArgumentException.class) && !C7019kk.m27469x1(e, OutOfMemoryException.class)) {
                                C3085sv.m13082k4(e);
                            } else if (z) {
                                ((ImageCollection) this.f5291x1.m71946k4().getImages()).m1736kk(C14113y2.m67408k4("image", C14057f9.m66591x1(i + 1), ".pict"));
                            } else {
                                ((ImageCollection) this.f5291x1.m71946k4().getImages()).m1741x1(C14113y2.m67408k4("image", C14057f9.m66591x1(i + 1)));
                            }
                        }
                    }
                }
                this.f5291x1.m3187k4((C14047bz[]) list.toArray(new C14047bz[0]));
            }
        } catch (OperationCanceledException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            C3085sv.m13082k4(e3);
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m6805dy() {
        C10536m5 c10536m5;
        List<C10536m5> listM51125jd = this.f5291x1.m71951m9().m51700c5().m51125jd();
        jio jioVar = null;
        for (int i = 0; i < 9; i++) {
            if (i != 3) {
                List.Enumerator<C10536m5> it = listM51125jd.iterator();
                while (true) {
                    try {
                        if (it.hasNext()) {
                            c10536m5 = it.next();
                            if (c10536m5.m51409um().m51922kk() == i) {
                                break;
                            }
                        } else {
                            c10536m5 = null;
                            break;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (c10536m5 == null) {
                    c10536m5 = new C10536m5(i);
                }
                jio jioVar2 = new jio(c10536m5, this.f5291x1);
                if (i == 4) {
                    jioVar2.m63331k4((TextStyle) this.f5290k4.getDefaultTextStyle());
                    jioVar = jioVar2;
                }
            }
        }
        C10612qv c10612qvM51122du = this.f5291x1.m71951m9().m51700c5().m51122du();
        if (c10612qvM51122du == null) {
            c10612qvM51122du = new C10612qv();
            c10612qvM51122du.m51606kk();
        }
        C10723xz c10723xzM51124h4 = this.f5291x1.m71951m9().m51700c5().m51124h4();
        if (c10723xzM51124h4 == null) {
            c10723xzM51124h4 = new C10723xz();
            c10723xzM51124h4.m52023kk();
        }
        if (jioVar == null) {
            throw new NullReferenceException("TextStyle couldn't be empty.");
        }
        jioVar.m63330k4();
        jha.m63316k4(0, c10723xzM51124h4.m52024x1(), null, c10612qvM51122du.m51607x1(), jioVar);
        jioVar.m63337x1();
        C10442fp c10442fpM51123dy = this.f5291x1.m71951m9().m51700c5().m51123dy();
        if (c10442fpM51123dy != null) {
            C10382c3 c10382c3M50800x1 = c10442fpM51123dy.m50800x1();
            IPortionFormat defaultPortionFormat = this.f5290k4.getDefaultTextStyle().getDefaultParagraphFormat().getDefaultPortionFormat();
            if (c10382c3M50800x1.m50522k4().m67302x1()) {
                defaultPortionFormat.setLanguageId(ai5.m3602k4(c10382c3M50800x1.m50522k4().m67297k4().intValue()));
            }
            if (!c10382c3M50800x1.m50529x1().m67302x1() || (c10382c3M50800x1.m50529x1().m67297k4().intValue() & 65535) == 0) {
                return;
            }
            defaultPortionFormat.setAlternativeLanguageId(ai5.m3602k4(c10382c3M50800x1.m50529x1().m67297k4().intValue()));
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m6806fa() {
        long jM51931h4 = this.f5291x1.m71951m9().m51702du().m51931h4();
        if (((C10634sc) this.f5291x1.m71950kk().m50962k4(jM51931h4)) == null) {
            return;
        }
        C10495ji c10495ji = new C10495ji(null);
        c10495ji.m51008k4(jM51931h4);
        c10495ji.m51013x1(2L);
        c10495ji.m51413x1(this.f5291x1.m71953up());
        C14661v2.m72057k4(new m4c(c10495ji, this.f5291x1));
    }

    /* JADX INFO: renamed from: h4 */
    private void m6807h4() {
        C10608qm c10608qmM50723to;
        C10498jn c10498jnM51596x1;
        C10413dy c10413dyM51039to;
        if (this.f5291x1.m71951m9().m51713rv() == null || (c10608qmM50723to = this.f5291x1.m71951m9().m51713rv().m50723to()) == null || (c10498jnM51596x1 = c10608qmM50723to.m51596x1()) == null || (c10413dyM51039to = c10498jnM51596x1.m51039to()) == null) {
            return;
        }
        for (C10384c5 c10384c5 : c10413dyM51039to.m50715x1()) {
            new uki((AbstractC10657tu) c10384c5.m50539x1(), 1, -1, this.f5291x1);
        }
    }

    /* JADX INFO: renamed from: ix */
    private void m6808ix() {
        m6830u4();
        m6832uz();
    }

    /* JADX INFO: renamed from: jd */
    private void m6809jd() {
        List<AbstractC10571o4> listM50513yj;
        C10626rv c10626rv;
        C10433f7 c10433f7M51703h4 = this.f5291x1.m71951m9().m51703h4();
        C3060ix c3060ixM72151u4 = this.f5291x1.m3192rv().m72151u4();
        if (c10433f7M51703h4 == null || c3060ixM72151u4 == null || c3060ixM72151u4.m12956k4().size() <= 0) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < c10433f7M51703h4.m50513yj().size(); i2++) {
            C10580ou c10580ou = (C10580ou) C7019kk.m27452k4((Object) c10433f7M51703h4.m50513yj().get_Item(i2), C10580ou.class);
            if (c10580ou != null) {
                if (c3060ixM72151u4.m12956k4().size() > i) {
                    if (c3060ixM72151u4.m12956k4().get_Item(i).m13014k4() == 1) {
                        int iM67429to = C14113y2.m67429to(c3060ixM72151u4.m12956k4().get_Item(i).m13015x1(), '#');
                        if (iM67429to < 0 || C14113y2.m67418kk(c3060ixM72151u4.m12956k4().get_Item(i).m13015x1(), ',') >= iM67429to) {
                            if (c10580ou.m51447h4() != null) {
                                c10580ou.m50513yj().removeItem(c10580ou.m51447h4());
                            }
                            listM50513yj = c10580ou.m50513yj();
                            c10626rv = new C10626rv(c3060ixM72151u4.m12956k4().get_Item(i).m13015x1(), (short) 3);
                            listM50513yj.addItem(c10626rv);
                        } else {
                            if (c10580ou.m51447h4() != null) {
                                c10580ou.m50513yj().removeItem(c10580ou.m51447h4());
                            }
                            c10580ou.m50513yj().addItem(new C10626rv(C14113y2.m67422kk(c3060ixM72151u4.m12956k4().get_Item(i).m13015x1(), iM67429to + 1), (short) 3));
                            if (c10580ou.m51446du() != null) {
                                c10580ou.m50513yj().removeItem(c10580ou.m51446du());
                            }
                            c10580ou.m50513yj().addItem(new C10626rv(C14113y2.m67443x1(c3060ixM72151u4.m12956k4().get_Item(i).m13015x1(), 0, iM67429to), (short) 1));
                        }
                    } else if (c3060ixM72151u4.m12956k4().get_Item(i).m13014k4() == 2 && c10580ou.m51446du() == null) {
                        listM50513yj = c10580ou.m50513yj();
                        c10626rv = new C10626rv(c3060ixM72151u4.m12956k4().get_Item(i).m13015x1(), (short) 1);
                        listM50513yj.addItem(c10626rv);
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m6810k4(int i) {
        return i >> 1;
    }

    /* JADX INFO: renamed from: kk */
    private void m6824kk() {
        IViewProperties viewProperties = this.f5290k4.getViewProperties();
        C10414e0 c10414e0M51713rv = this.f5291x1.m71951m9().m51713rv();
        viewProperties.setLastView(f6b.m5868fa(this.f5291x1.m71950kk().m50964ks().m50470du()));
        if (c10414e0M51713rv == null) {
            ViewProperties viewProperties2 = (ViewProperties) viewProperties;
            viewProperties2.getNormalViewProperties().setHorizontalBarState(1);
            viewProperties2.getNormalViewProperties().setVerticalBarState(1);
            viewProperties2.getNormalViewProperties().getRestoredLeft().setDimensionSize(15.6f);
            viewProperties2.getNormalViewProperties().getRestoredTop().setDimensionSize(94.6f);
            return;
        }
        if (c10414e0M51713rv.m50718du() != null) {
            ahk.m3579k4(c10414e0M51713rv.m50718du().m50825to(), ((ViewProperties) viewProperties).getNormalViewProperties());
        }
        if (c10414e0M51713rv.m50719dy() != null) {
            C13823m7.m64786k4(c10414e0M51713rv.m50719dy().m51743to(), viewProperties.getSlideViewProperties());
        }
        if (c10414e0M51713rv.m50716c5() != null) {
            C13823m7.m64786k4(c10414e0M51713rv.m50716c5().m51743to(), viewProperties.getNotesViewProperties());
        } else {
            viewProperties.getNotesViewProperties().setVariableScale(true);
        }
    }

    /* JADX INFO: renamed from: ks */
    private void m6825ks() {
        List<C10495ji> listM52056h4;
        if (this.f5291x1.m71951m9().m51715u4() == null || (listM52056h4 = this.f5291x1.m71951m9().m51715u4().m51969x1().m52056h4()) == null) {
            return;
        }
        List.Enumerator<C10495ji> it = listM52056h4.iterator();
        while (it.hasNext()) {
            try {
                try {
                    m4c m4cVar = new m4c(it.next(), this.f5291x1);
                    if ((((C10676v0) m4cVar.m64710ck()).m51837m9() & 4294967295L) >= 1) {
                        k4v.m63651k4(m4cVar);
                    }
                } catch (RuntimeException e) {
                    if (!C7019kk.m27469x1(e, ArgumentOutOfRangeException.class)) {
                        throw e;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m6826m9() throws Throwable {
        C10699wt c10699wtM51127to = this.f5291x1.m71951m9().m51700c5().m51127to();
        C13827mb c13827mbM6639k4 = this.f5291x1.m71946k4().m2389rv().m6639k4();
        this.f5291x1.m71946k4().m2349du();
        C10497jm c10497jm = null;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < c10699wtM51127to.m50513yj().size(); i2++) {
            if (C7019kk.m27469x1(c10699wtM51127to.m50513yj().get_Item(i2), C10497jm.class)) {
                c10497jm = (C10497jm) c10699wtM51127to.m50513yj().get_Item(i2);
                FontData fontData = new FontData(C14113y2.m67440x1(c10497jm.m51028x1()), c10497jm);
                c13827mbM6639k4.m64800k4(C13827mb.m64790k4(fontData.getFontName()), fontData, true, new C14093tq<>(Integer.valueOf(i)));
                i++;
            } else if (C7019kk.m27469x1(c10699wtM51127to.m50513yj().get_Item(i2), C10658tw.class)) {
                z = m6820k4(this.f5291x1.m71946k4().m2385ks().m7122k4(), (C10658tw) c10699wtM51127to.m50513yj().get_Item(i2), c10497jm) || z;
            }
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m6827ne() {
        x3j x3jVarM2393up = this.f5290k4.m2393up();
        C10641ss c10641ssM50965m9 = this.f5291x1.m71950kk().m50965m9();
        x3jVarM2393up.m73076k4(c10641ssM50965m9.m51702du().m51941to().Clone());
        x3jVarM2393up.m73077k4(c10641ssM50965m9.m51702du().m51926c5());
        x3jVarM2393up.m73089x1(c10641ssM50965m9.m51702du().m51927ck());
        x3jVarM2393up.m73084kk(c10641ssM50965m9.m51702du().m51930fa());
        x3jVarM2393up.m73052k4(c10641ssM50965m9.m51700c5().m51128x1());
        x3jVarM2393up.m73041k4(c10641ssM50965m9.m51700c5().m51126m9());
        if (c10641ssM50965m9.m51705jd() != null) {
            x3jVarM2393up.m73082k4(c10641ssM50965m9.m51705jd().m51043to());
        }
        x3jVarM2393up.m73056k4(c10641ssM50965m9.m51701ck().m51672x1().m50866du());
        x3jVarM2393up.m73074k4(c10641ssM50965m9.m51701ck().m51672x1().m50868h4());
        x3jVarM2393up.m73043k4(c10641ssM50965m9.m51701ck().m51672x1().m50869m9());
        x3jVarM2393up.m73046k4(c10641ssM50965m9.m51701ck().m51672x1().m50867dy());
        if (c10641ssM50965m9.m51713rv() != null) {
            x3jVarM2393up.m73048k4(c10641ssM50965m9.m51713rv().m50718du());
            x3jVarM2393up.m73073k4(c10641ssM50965m9.m51713rv().m50720h4());
            x3jVarM2393up.m73044k4(c10641ssM50965m9.m51713rv().m50722m9());
            x3jVarM2393up.m73071k4(c10641ssM50965m9.m51713rv().m50719dy());
            x3jVarM2393up.m73088x1(c10641ssM50965m9.m51713rv().m50716c5());
            x3jVarM2393up.m73061k4(c10641ssM50965m9.m51713rv().m50721jd());
        }
        if (c10641ssM50965m9.m51713rv() != null && c10641ssM50965m9.m51713rv().m50723to() != null) {
            if (c10641ssM50965m9.m51713rv().m50723to().m51596x1() != null) {
                x3jVarM2393up.m73065k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51032du());
                x3jVarM2393up.m73063k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51034h4());
                x3jVarM2393up.m73051k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51033dy());
                x3jVarM2393up.m73053k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51030c5());
                x3jVarM2393up.m73072k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51035jd());
                x3jVarM2393up.m73049k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51031ck());
                x3jVarM2393up.m73070k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51036ks());
                x3jVarM2393up.m73079k4(c10641ssM50965m9.m51713rv().m50723to().m51596x1().m51038rv());
            }
            if (c10641ssM50965m9.m51713rv().m50723to().m51595to() != null) {
                x3jVarM2393up.m73086x1().m74562k4(c10641ssM50965m9.m51713rv().m50723to().m51595to());
                x3jVarM2393up.m73054k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51508x1());
                x3jVarM2393up.m73080k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51506to());
                x3jVarM2393up.m73069k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51497du());
                x3jVarM2393up.m73059k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51499h4());
                x3jVarM2393up.m73075k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51498dy());
                x3jVarM2393up.m73064k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51495c5());
                x3jVarM2393up.m73087x1(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51501jd());
                x3jVarM2393up.m73057k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51496ck());
                x3jVarM2393up.m73066k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51502ks());
                x3jVarM2393up.m73068k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51505rv());
                x3jVarM2393up.m73058k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51509x6());
                x3jVarM2393up.m73081k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51504ne());
                x3jVarM2393up.m73060k4(c10641ssM50965m9.m51713rv().m50723to().m51595to().m51507u4());
            }
            if (c10641ssM50965m9.m51713rv().m50723to().m51592du() != null) {
                x3jVarM2393up.m73062k4(c10641ssM50965m9.m51713rv().m50723to().m51592du().m51752x1());
                x3jVarM2393up.m73042k4(c10641ssM50965m9.m51713rv().m50723to().m51592du().m51751to());
            }
            if (c10641ssM50965m9.m51713rv().m50723to().m51593h4() != null) {
                x3jVarM2393up.m73045k4(c10641ssM50965m9.m51713rv().m50723to().m51593h4().m51848x1());
            }
        }
        x3jVarM2393up.m73067k4(c10641ssM50965m9.m51711ne());
        x3jVarM2393up.m73055k4(c10641ssM50965m9.m51716uz());
        x3jVarM2393up.m73047k4(c10641ssM50965m9.m51717wl());
        x3jVarM2393up.m73050k4(c10641ssM50965m9.m51712qq());
    }

    /* JADX INFO: renamed from: rv */
    private void m6828rv() {
        int i;
        AutoShape autoShape;
        AutoShape autoShape2;
        PresentationHeaderFooterManager presentationHeaderFooterManager = (PresentationHeaderFooterManager) this.f5290k4.getHeaderFooterManager();
        C10639so c10639soM51721x6 = this.f5291x1.m71951m9().m51721x6();
        if (c10639soM51721x6 != null) {
            C10624rs c10624rsM51693x1 = c10639soM51721x6.m51693x1();
            m6817k4(this.f5291x1, c10639soM51721x6);
            if (c10624rsM51693x1.m51652m9()) {
                presentationHeaderFooterManager.m2424k4((byte) 4, c10639soM51721x6.m51692to(), true);
            }
            boolean zM67411k4 = C14113y2.m67411k4(c10639soM51721x6.m51687h4());
            if (c10624rsM51693x1.m51647h4() || !zM67411k4) {
                presentationHeaderFooterManager.m2424k4((byte) 6, c10639soM51721x6.m51687h4(), zM67411k4);
            }
        }
        Dictionary.ValueCollection.Enumerator<Long, m4c> it = this.f5291x1.m3193u4().getValues().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    break;
                }
                m4c next = it.next();
                if (next.m64714fa() == 4) {
                    Slide slide = (Slide) next.m64735up();
                    C10639so c10639soM51365x6 = ((C10431f3) next.m64717jd()).m51365x6();
                    if (!((((C10487j0) next.m64710ck()).m50982m9() == 0) & this.f5291x1.m71951m9().m51702du().m51932jd())) {
                        if (c10639soM51365x6 != null) {
                            C10624rs c10624rsM51693x12 = c10639soM51365x6.m51693x1();
                            SlideHeaderFooterManager slideHeaderFooterManagerM2710u4 = slide.m2710u4();
                            boolean zM51651kk = c10624rsM51693x12.m51651kk();
                            slideHeaderFooterManagerM2710u4.setDateTimeVisibility(zM51651kk);
                            if (zM51651kk) {
                                if (c10624rsM51693x12.m51652m9()) {
                                    slideHeaderFooterManagerM2710u4.setDateTimeText(c10639soM51365x6.m51692to());
                                } else {
                                    AutoShape autoShape3 = (AutoShape) C7019kk.m27452k4((Object) slide.m391k4((byte) 4), AutoShape.class);
                                    if (autoShape3 != null) {
                                        Portion portion = (Portion) autoShape3.addTextFrame(C14084qq.m67081jd().m67150u4()).getParagraphs().get_Item(0).getPortions().get_Item(0);
                                        portion.addField(f6b.m5904k4(c10624rsM51693x12.m51655x1(), ai5.m3601k4(portion.getPortionFormat().getLanguageId()).Clone()));
                                    }
                                }
                            }
                            slideHeaderFooterManagerM2710u4.setSlideNumberVisibility(c10624rsM51693x12.m51654to());
                            if (c10624rsM51693x12.m51654to()) {
                                slideHeaderFooterManagerM2710u4.m415k4(C14057f9.m66586k4(next.m64744yd() + 1, (InterfaceC14073kp) C11697x1.m55250kk()));
                            }
                            slideHeaderFooterManagerM2710u4.setFooterVisibility(c10624rsM51693x12.m51647h4());
                            if (c10624rsM51693x12.m51647h4()) {
                                slideHeaderFooterManagerM2710u4.setFooterText(c10639soM51365x6.m51687h4());
                            }
                        } else if (c10639soM51721x6 != null) {
                            C10624rs c10624rsM51693x13 = c10639soM51721x6.m51693x1();
                            if (c10624rsM51693x13.m51651kk() && ((autoShape2 = (AutoShape) slide.m2687bv().m391k4((byte) 4)) == null || !C14113y2.m67411k4(autoShape2.m288x1().m2901c5()))) {
                                slide.getHeaderFooterManager().setDateTimeVisibility(true);
                            }
                            if (c10624rsM51693x13.m51654to()) {
                                slide.getHeaderFooterManager().setSlideNumberVisibility(true);
                            }
                            if (c10624rsM51693x13.m51647h4() && ((autoShape = (AutoShape) slide.m2687bv().m391k4((byte) 6)) == null || !C14113y2.m67411k4(autoShape.m288x1().m2901c5()))) {
                                slide.getHeaderFooterManager().setFooterVisibility(true);
                            }
                        }
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
        MasterNotesSlide masterNotesSlide = (MasterNotesSlide) this.f5290k4.getMasterNotesSlideManager().getMasterNotesSlide();
        if (masterNotesSlide == null) {
            return;
        }
        C10639so c10639soM51711ne = this.f5291x1.m71951m9().m51711ne();
        if (c10639soM51711ne == null) {
            if (masterNotesSlide.m391k4((byte) 5) != null) {
                presentationHeaderFooterManager.m2425k4((byte) 5, true, true);
                return;
            }
            return;
        }
        C10624rs c10624rsM51693x14 = c10639soM51711ne.m51693x1();
        com.aspose.slides.internal.p332p7.qvp qvpVar = new com.aspose.slides.internal.p332p7.qvp();
        if (c10624rsM51693x14.m51646du()) {
            presentationHeaderFooterManager.m2425k4((byte) 7, true, true);
            presentationHeaderFooterManager.m2432x1((byte) 7, c10639soM51711ne.m51686du(), false);
        } else {
            qvpVar.m39713x1(false);
        }
        if (c10624rsM51693x14.m51651kk()) {
            presentationHeaderFooterManager.m2425k4((byte) 4, true, true);
            if (c10624rsM51693x14.m51652m9()) {
                presentationHeaderFooterManager.m2432x1((byte) 4, c10639soM51711ne.m51692to(), true);
            }
        } else {
            qvpVar.m39711to(false);
        }
        if (c10624rsM51693x14.m51647h4()) {
            presentationHeaderFooterManager.m2425k4((byte) 6, true, true);
            presentationHeaderFooterManager.m2432x1((byte) 6, c10639soM51711ne.m51687h4(), false);
        } else {
            qvpVar.m39709kk(false);
        }
        if (c10624rsM51693x14.m51654to()) {
            presentationHeaderFooterManager.m2425k4((byte) 5, true, true);
        } else {
            for (i = 0; i < this.f5290k4.getSlides().size(); i++) {
                if (this.f5290k4.getSlides().get_Item(i).getNotesSlideManager().getNotesSlide() != null) {
                    break;
                }
            }
            presentationHeaderFooterManager.m2425k4((byte) 5, true, true);
        }
        if (c10624rsM51693x14.m51646du() || c10624rsM51693x14.m51651kk() || c10624rsM51693x14.m51647h4() || c10624rsM51693x14.m51654to()) {
            masterNotesSlide.m1933x6().m72933k4(qvpVar);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6829to() {
        C10696wp c10696wpM51702du = this.f5291x1.m71951m9().m51702du();
        f6b.m5910k4(c10696wpM51702du, (SlideSize) this.f5290k4.getSlideSize());
        f6b.m5909k4(c10696wpM51702du, m6811k4(c10696wpM51702du));
    }

    /* JADX INFO: renamed from: u4 */
    private void m6830u4() {
        C10451gi c10451gi;
        try {
            SortedList sortedList = new SortedList();
            C10483iu c10483iuM71950kk = this.f5291x1.m71950kk();
            for (int i = 0; i < c10483iuM71950kk.m50513yj().size(); i++) {
                AbstractC10376bv abstractC10376bv = (AbstractC10376bv) C7019kk.m27452k4((Object) c10483iuM71950kk.m50513yj().get_Item(i), AbstractC10376bv.class);
                if (abstractC10376bv != null && (c10451gi = (C10451gi) C7019kk.m27452k4((Object) abstractC10376bv.m50508kk(EditingLanguage.FRENCH_FRANCE), C10451gi.class)) != null) {
                    sortedList.set_Item(Long.valueOf(c10451gi.m50827x1().m51561x1().m52121x1() & 65535), null);
                }
            }
            C10614qx c10614qxM50871x1 = this.f5291x1.m71951m9().m51701ck().m51672x1().m50871x1();
            c10614qxM50871x1.m51613kk(((long) sortedList.size()) & 4294967295L);
            for (int i2 = 0; i2 < c10614qxM50871x1.m51614to().size(); i2++) {
                C10421eg c10421eg = (C10421eg) C7019kk.m27452k4((Object) c10614qxM50871x1.m51614to().get_Item(i2), C10421eg.class);
                if (c10421eg != null && (c10421eg.m50742k4() & 4294967295L) != 0 && !sortedList.containsKey(Long.valueOf(c10421eg.m50742k4()))) {
                    c10421eg.m50743k4(0L);
                }
            }
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: up */
    private void m6831up() {
        List<C10495ji> listM52056h4 = this.f5291x1.m71951m9().m51709ks().m51969x1().m52056h4();
        List<m4c> list = new List<>();
        List.Enumerator it = listM52056h4.iterator();
        while (it.hasNext()) {
            try {
                list.addItem(new m4c(it.next(), this.f5291x1));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m6815k4(list);
        List list2 = new List();
        List list3 = new List();
        List.Enumerator<m4c> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                m4c next = it2.next();
                next.m64732to();
                int iM64714fa = next.m64714fa();
                if (iM64714fa == 0 || iM64714fa == 1) {
                    list2.addItem(next);
                } else if (iM64714fa == 3) {
                    list3.addItem(next);
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
        this.f5291x1.m3182k4((m4c) list2.get_Item(0));
        List.Enumerator it3 = list2.iterator();
        while (it3.hasNext()) {
            try {
                yiz.m73911k4((m4c) it3.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
            it3.dispose();
        }
        it = list3.iterator();
        while (it.hasNext()) {
            try {
                gh7.m6653k4((m4c) it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        gh7.m6652k4(this.f5291x1);
        if (this.f5290k4.getMasters().size() > 0) {
            this.f5290k4.m2360k4(((MasterThemeManager) ((m4c) list2.get_Item(0)).m64739wy().m69805k4()).getOverrideTheme());
        }
    }

    /* JADX INFO: renamed from: uz */
    private void m6832uz() {
        IBaseSlide iBaseSlideM3180k4;
        int i;
        int iM66582k4;
        IBaseSlide iBaseSlide;
        for (int i2 = 0; i2 < this.f5291x1.m3190ne().size(); i2++) {
            Hyperlink hyperlink = this.f5291x1.m3190ne().get_Item(i2);
            if (hyperlink.m1698m9() != null && hyperlink.m1698m9().length() > 0) {
                String strM67443x1 = hyperlink.m1698m9().charAt(0) == '#' ? C14113y2.m67443x1(hyperlink.m1698m9(), 1, hyperlink.m1698m9().length() - 1) : hyperlink.m1698m9();
                int i3 = 0;
                while (i3 < strM67443x1.length() && strM67443x1.charAt(i3) >= '0' && strM67443x1.charAt(i3) <= '9') {
                    i3++;
                }
                if (i3 < strM67443x1.length()) {
                    String strM67443x12 = C14113y2.m67443x1(strM67443x1, 0, i3);
                    if (strM67443x1.charAt(i3) == '.') {
                        if (C14057f9.m66582k4(strM67443x12) <= this.f5290k4.getSlides().size()) {
                            iBaseSlide = this.f5290k4.getSlides().get_Item(C14057f9.m66582k4(strM67443x12) - 1);
                            iBaseSlideM3180k4 = (BaseSlide) iBaseSlide;
                        }
                        iBaseSlideM3180k4 = null;
                    } else if (C14114y9.m67463k4(strM67443x12, new long[]{0})) {
                        IBaseSlide iBaseSlideM3180k42 = this.f5291x1.m3180k4(C14114y9.m67456k4(strM67443x12));
                        if (iBaseSlideM3180k42 == null) {
                            int i4 = i3 + 1;
                            int i5 = i4;
                            while (i5 < strM67443x1.length() && strM67443x1.charAt(i5) >= '0' && strM67443x1.charAt(i5) <= '9') {
                                i5++;
                            }
                            if (i5 < strM67443x1.length() && (i = i5 - i4) > 0 && (iM66582k4 = C14057f9.m66582k4(C14113y2.m67443x1(strM67443x1, i4, i))) > 0 && iM66582k4 <= this.f5290k4.getSlides().size()) {
                                iBaseSlide = this.f5290k4.getSlides().get_Item(iM66582k4 - 1);
                                iBaseSlideM3180k4 = (BaseSlide) iBaseSlide;
                            }
                        }
                        iBaseSlideM3180k4 = iBaseSlideM3180k42;
                    } else {
                        iBaseSlideM3180k4 = null;
                    }
                } else {
                    iBaseSlideM3180k4 = this.f5291x1.m3180k4(C14114y9.m67456k4(strM67443x1));
                }
                if (iBaseSlideM3180k4 != null) {
                    hyperlink.m1702x1((String) null);
                } else if (C14113y2.m67448x1(hyperlink.m1698m9(), "#")) {
                    hyperlink.m1695k4((String) null);
                    hyperlink.m1696k4(true);
                }
                hyperlink.m1699to().m4794k4((ISlide) iBaseSlideM3180k4);
            }
        }
    }

    /* JADX INFO: renamed from: wl */
    private void m6833wl() {
        IGenericEnumerator<qah> it = this.f5291x1.m3178ix().getValues().iterator();
        while (it.hasNext()) {
            try {
                qah next = it.next();
                if (next.m69482dy() >= 10 && next.m69482dy() <= 13) {
                    IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) next.m69481du().m70148u4(), IAudioFrame.class);
                    if (iAudioFrame != null) {
                        kjx.m63927k4(iAudioFrame);
                    } else {
                        IVideoFrame iVideoFrame = (IVideoFrame) C7019kk.m27452k4((Object) next.m69481du().m70148u4(), IVideoFrame.class);
                        if (iVideoFrame != null) {
                            kjx.m63929k4(iVideoFrame);
                        }
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
        this.f5291x1.m3188ks().m6779ix();
    }

    /* JADX INFO: renamed from: x1 */
    public static C9816ck m6834x1(AbstractC3150x6 abstractC3150x6) {
        try {
            return new C9816ck(abstractC3150x6);
        } catch (C9826to e) {
            throw new PptUnsupportedFormatException(e.getMessage(), e);
        } catch (RuntimeException e2) {
            throw new PptReadException("Can't read MSCDFileSystem.", e2);
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m6837x6() {
        if (this.f5291x1.m71951m9().m51713rv() == null || this.f5291x1.m71951m9().m51713rv().m50717ck() == null) {
            return;
        }
        Presentation presentationM71946k4 = this.f5291x1.m71946k4();
        C10504k5 c10504k5M50963kk = this.f5291x1.m71950kk().m50963kk(this.f5291x1.m71951m9().m51713rv().m50717ck().m50725to().m51099x1());
        if (c10504k5M50963kk != null) {
            C3152yj c3152yj = new C3152yj(c10504k5M50963kk.m51095kk());
            try {
                presentationM71946k4.m2368k4(new C3662y9(m6834x1(c3152yj)));
                presentationM71946k4.setVbaProject(new VbaProject(presentationM71946k4.m2396x1()));
                presentationM71946k4.m2351fa().m68378k4(c10504k5M50963kk.m51095kk());
                presentationM71946k4.m2351fa().m68368k4(((VbaProject) presentationM71946k4.getVbaProject()).m3051k4());
            } finally {
                c3152yj.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: yj */
    private void m6838yj() {
        if (this.f5291x1.m71951m9().m51704ix() == null) {
            return;
        }
        List.Enumerator<C10495ji> it = this.f5291x1.m71951m9().m51704ix().m51969x1().m52056h4().iterator();
        boolean z = true;
        while (it.hasNext()) {
            try {
                m4c m4cVar = new m4c(it.next(), this.f5291x1);
                if (z) {
                    m4cVar.m64725kk(true);
                    z = false;
                }
                dki.m5124k4(m4cVar);
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
        this.f5290k4.m2351fa().m68353ar();
    }

    /* JADX INFO: renamed from: k4 */
    private NotesSize m6811k4(C10696wp c10696wp) {
        NotesSize notesSize = (NotesSize) this.f5290k4.getNotesSize();
        this.f5290k4.m2351fa().m68397x1(c10696wp.m51927ck());
        this.f5290k4.setFirstSlideNumber(c10696wp.m51940m9() & 65535);
        this.f5290k4.m2351fa().m68377k4(!c10696wp.m51932jd());
        this.f5290k4.m2393up().m73084kk(c10696wp.m51930fa());
        String[] strArr = {null};
        ((C3114yo) gij.f5258k4.m13029k4().get_Item(18L)).m13288k4(strArr, 1251);
        this.f5291x1.m3186k4(AbstractC6747ar.m26635ix().mo26677to(strArr[0]));
        if (C14084qq.m67081jd().m67130fa() % 2 == 0) {
            this.f5291x1.m3186k4(new byte[]{0, 10, -6, 1, 7, 18, -1, 0, -38, 1, 3, -1, -1, 23, 0, 35, 0, 0, -1, 67, 120, 0, 83, -102, 116, 23});
        }
        return notesSize;
    }

    /* JADX INFO: renamed from: x1 */
    private void m6835x1() throws Throwable {
        if (this.f5290k4 == null) {
            throw new ArgumentNullException();
        }
        if (this.f5291x1.m71951m9() == null && this.f5290k4.getProtectionManager().isOnlyDocumentPropertiesLoaded()) {
            throw new Exception(C14113y2.m67408k4("Presentation.IsOnlyDocumentPropertiesLoaded is true ", "that mean only document properties of this presentation are loaded. ", "Check Presentation.LoadOptions.OnlyLoadDocumentProperties property value."));
        }
        m6829to();
        m6824kk();
        m6804du();
        m6807h4();
        m6826m9();
        m6805dy();
        m6802c5();
        if (this.f5291x1.m71951m9().m51713rv() == null || this.f5291x1.m71951m9().m51713rv().m50723to() == null) {
            return;
        }
        C10608qm c10608qmM50723to = this.f5291x1.m71951m9().m51713rv().m50723to();
        C13658is.m63092k4(this.f5290k4.getCustomData(), c10608qmM50723to);
        this.f5291x1.f3768to = c10608qmM50723to.m51594m9() != null;
        m6819k4(c10608qmM50723to);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m6836x1(C9816ck c9816ck) {
        if (c9816ck == null) {
            throw new ArgumentNullException("fileSystem");
        }
        try {
            return c9816ck.m48360k4().m48345x1("EncryptionInfo");
        } catch (RuntimeException e) {
            throw new PptReadException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC2313tw m6813k4(byte[] bArr) {
        LoadOptions loadOptionsM2349du = this.f5291x1.m71946k4().m2349du();
        try {
            return AbstractC2313tw.m11469k4(new C2033cj(0, "fntdata", new C2350wl(bArr)));
        } catch (C2096ga e) {
            if (loadOptionsM2349du == null) {
                return null;
            }
            loadOptionsM2349du.m1921k4(C14113y2.m67402k4("Font could not be loaded: {0}", e.getMessage()), 1);
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6814k4() {
        C3088tq c3088tq;
        C3088tq c3088tq2 = null;
        if (this.f5291x1.m71952to() != null) {
            C3152yj c3152yj = new C3152yj(this.f5291x1.m71952to());
            c3088tq = new C3088tq(c3152yj);
            c3152yj.close();
        } else {
            c3088tq = null;
        }
        if (this.f5291x1.m71941du() != null) {
            C3152yj c3152yj2 = new C3152yj(this.f5291x1.m71941du());
            c3088tq2 = new C3088tq(c3152yj2);
            this.f5290k4.m2393up().m73078k4(m6823k4(c3088tq2));
            c3152yj2.close();
        }
        C14670va c14670va = new C14670va(c3088tq2, c3088tq);
        this.f5291x1.m3183k4(c14670va);
        m6816k4((DocumentProperties) this.f5290k4.getDocumentProperties(), c14670va);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6815k4(List<m4c> list) {
        m4c m4cVar;
        IGenericEnumerator<KeyValuePair<Long, a3u.C0703k4>> it = this.f5291x1.m3195uz().iterator();
        while (it.hasNext()) {
            try {
                a3u.C0703k4 value = it.next().getValue();
                if (value.m3202k4().containsKey(-1)) {
                    m4cVar = value.m3202k4().get_Item(-1);
                    IGenericEnumerator<KeyValuePair<Integer, m4c>> it2 = value.m3202k4().iterator();
                    while (it2.hasNext()) {
                        try {
                            KeyValuePair<Integer, m4c> next = it2.next();
                            if (next.getKey().intValue() >= 0) {
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
                } else {
                    m4cVar = new m4c(value.m3202k4().getValues().get_Item(0).m64709c5(), this.f5291x1);
                    m4cVar.m64741x1(true);
                    value.m3202k4().addItem(-1, m4cVar);
                    list.addItem(m4cVar);
                }
                m4cVar.m64721k4(value.m3202k4());
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6816k4(DocumentProperties documentProperties, C14670va c14670va) {
        documentProperties.setAuthor(c14670va.m72140kk());
        documentProperties.setCategory(c14670va.m72161yj());
        documentProperties.setPresentationFormat(c14670va.m72110ck());
        documentProperties.setComments(C3085sv.m13107x1(c14670va.m72112du()));
        documentProperties.setCompany(C3085sv.m13107x1(c14670va.m72152up()));
        documentProperties.m1336k4(c14670va.m72108c5().Clone());
        documentProperties.setKeywords(c14670va.m72149to());
        documentProperties.m1343kk(c14670va.m72144m9().Clone());
        documentProperties.setLastSavedBy(c14670va.m72118h4());
        documentProperties.m1346to(c14670va.m72121jd().Clone());
        documentProperties.setManager(c14670va.m72116fa());
        documentProperties.setNameOfApplication(c14670va.m72143ks());
        documentProperties.setRevisionNumber(c14670va.m72160x6());
        documentProperties.setSubject(c14670va.m72156x1());
        documentProperties.setApplicationTemplate(c14670va.m72148rv());
        documentProperties.setTitle(c14670va.m72123k4());
        documentProperties.m1335k4(c14670va.m72114dy().Clone());
        documentProperties.setHyperlinkBase(c14670va.m72120ix());
        for (int i = 0; i < c14670va.m72146ne(); i++) {
            String strM72157x1 = c14670va.m72157x1(i);
            C14084qq c14084qq = new C14084qq();
            boolean[] zArr = {false};
            boolean zM72139k4 = c14670va.m72139k4(strM72157x1, zArr);
            boolean z = zArr[0];
            if (zM72139k4) {
                documentProperties.setCustomPropertyValue(strM72157x1, z);
            } else {
                int[] iArr = {0};
                boolean zM72136k4 = c14670va.m72136k4(strM72157x1, iArr);
                int i2 = iArr[0];
                if (zM72136k4) {
                    documentProperties.setCustomPropertyValue(strM72157x1, i2);
                } else {
                    C14084qq[] c14084qqArr = {c14084qq};
                    boolean zM72137k4 = c14670va.m72137k4(strM72157x1, c14084qqArr);
                    c14084qqArr[0].CloneTo(c14084qq);
                    if (zM72137k4) {
                        documentProperties.m1338k4(strM72157x1, c14084qq.Clone());
                    } else {
                        String[] strArr = {null};
                        boolean zM72138k4 = c14670va.m72138k4(strM72157x1, strArr);
                        String str = strArr[0];
                        if (zM72138k4) {
                            documentProperties.setCustomPropertyValue(strM72157x1, str);
                        } else {
                            float[] fArr = {0.0f};
                            boolean zM72135k4 = c14670va.m72135k4(strM72157x1, fArr);
                            float f = fArr[0];
                            if (zM72135k4) {
                                documentProperties.setCustomPropertyValue(strM72157x1, f);
                            } else {
                                double[] dArr = {0.0d};
                                boolean zM72134k4 = c14670va.m72134k4(strM72157x1, dArr);
                                double d = dArr[0];
                                if (zM72134k4) {
                                    documentProperties.setCustomPropertyValue(strM72157x1, d);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6817k4(a3u a3uVar, C10639so c10639so) {
        m4c m4cVarM3194um = a3uVar.m3194um();
        if (m4cVarM3194um != null) {
            C10624rs c10624rsM51693x1 = c10639so.m51693x1();
            C14437s8 c14437s8M72984dy = ((MasterSlide) m4cVarM3194um.m64735up()).m1944x6().m72984dy();
            boolean z = true;
            c14437s8M72984dy.m70466x1(c10624rsM51693x1.m51647h4() || !C14113y2.m67411k4(c10639so.m51687h4()));
            if (!c10624rsM51693x1.m51651kk() || (c10624rsM51693x1.m51652m9() && C14113y2.m67411k4(c10639so.m51692to()))) {
                z = false;
            }
            c14437s8M72984dy.m70460k4(z);
            c14437s8M72984dy.m70464to(c10624rsM51693x1.m51654to());
            c14437s8M72984dy.m70462kk(c10624rsM51693x1.m51646du());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6818k4(AbstractC3150x6 abstractC3150x6, boolean[] zArr, boolean[] zArr2, boolean[] zArr3) {
        try {
            abstractC3150x6.seek(0L, 0);
            C10591pk.m51477k4(m6834x1(abstractC3150x6), zArr, zArr2, zArr3);
        } catch (RuntimeException e) {
            throw new PptReadException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6839k4(C9816ck c9816ck, InterruptionToken interruptionToken) throws Throwable {
        if (c9816ck.m48360k4().m48345x1("EncryptedPackage") && c9816ck.m48360k4().m48345x1("EncryptionInfo")) {
            ((ProtectionManager) this.f5290k4.getProtectionManager()).m2466k4(c9816ck);
            return;
        }
        if (!c9816ck.m48360k4().m48345x1("Current User")) {
            if (!c9816ck.m48360k4().m48345x1("\u0005SummaryInformation") || !c9816ck.m48360k4().m48345x1("VBA") || !c9816ck.m48360k4().m48345x1("PROJECT")) {
                throw new PptUnsupportedFormatException("Unknown file format.");
            }
            this.f5290k4.f3084k4 = 0;
            this.f5291x1 = new a3u(new C10591pk(), this.f5290k4, interruptionToken);
            kye.m64232k4(this.f5290k4);
            this.f5290k4.getSlides().removeAt(0);
            C9820h4 c9820h4 = (C9820h4) c9816ck.m48360k4().m48344to("\u0005SummaryInformation");
            if (c9820h4 != null) {
                this.f5291x1.m71954x1().m51486k4(c9820h4.m48410k4());
            }
            C9820h4 c9820h42 = (C9820h4) c9816ck.m48360k4().m48344to("\u0005DocumentSummaryInformation");
            if (c9820h42 != null) {
                this.f5291x1.m71954x1().m51492x1(c9820h42.m48410k4());
            }
            m6814k4();
            this.f5290k4.m2368k4(new C3662y9(c9816ck));
            Presentation presentation = this.f5290k4;
            presentation.setVbaProject(new VbaProject(presentation.m2396x1()));
            return;
        }
        C10591pk c10591pk = new C10591pk(c9816ck, this.f5290k4.m2349du());
        this.f5291x1 = new a3u(c10591pk, this.f5290k4, interruptionToken);
        this.f5290k4.f3084k4 = 0;
        m6814k4();
        if (c10591pk.m51489m9()) {
            return;
        }
        m6835x1();
        m6837x6();
        m6809jd();
        m6831up();
        m6803ck();
        m6806fa();
        m6838yj();
        m6825ks();
        m6828rv();
        if (c10591pk.m51484h4() != null) {
            List.Enumerator<byte[]> it = c10591pk.m51484h4().iterator();
            while (it.hasNext()) {
                try {
                    byte[] next = it.next();
                    XmlDocument xmlDocument = new XmlDocument();
                    C3152yj c3152yj = new C3152yj(next);
                    try {
                        xmlDocument.load(c3152yj);
                        c3152yj.dispose();
                        C13981tl documentElement = xmlDocument.getDocumentElement();
                        C13970rs c13970rs = new C13970rs(documentElement);
                        try {
                            List<C7712fy> listM5798k4 = C0972f0.m5798k4(c13970rs);
                            if (listM5798k4 != null) {
                                List.Enumerator<C7712fy> it2 = listM5798k4.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        C7712fy next2 = it2.next();
                                        DigitalSignature digitalSignature = new DigitalSignature();
                                        if (C14331q7.m69455x1(digitalSignature, next2, null)) {
                                            C14331q7.m69446k4(digitalSignature, documentElement);
                                        }
                                        this.f5290k4.getDigitalSignatures().add(digitalSignature);
                                    } finally {
                                    }
                                }
                                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                    it2.dispose();
                                }
                            }
                            c13970rs.dispose();
                        } finally {
                            c13970rs.dispose();
                        }
                    } catch (Throwable th) {
                        c3152yj.dispose();
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        m6808ix();
        m6833wl();
        m6827ne();
    }

    /* JADX INFO: renamed from: k4 */
    private void m6819k4(C10608qm c10608qm) {
        if (c10608qm.m51595to() != null) {
            for (C10667um c10667um : c10608qm.m51595to().m51503m9()) {
                if (this.f5290k4.getCommentAuthors().findByName(c10667um.m51808x1()).length == 0) {
                    CommentAuthor commentAuthor = (CommentAuthor) this.f5290k4.getCommentAuthors().addAuthor(c10667um.m51808x1(), C14113y2.f47374k4);
                    if (c10667um.m51807to() != null) {
                        commentAuthor.m1175x1().m7033k4(c10667um.m51807to().m50443x1());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m6820k4(C0758ap c0758ap, C10658tw c10658tw, C10497jm c10497jm) {
        C2132iq c2132iq = (C2132iq) C7019kk.m27452k4((Object) m6813k4(c10658tw.m51782x1()), C2132iq.class);
        if (c2132iq == null) {
            return false;
        }
        c0758ap.m3690k4(C14113y2.m67411k4(c10497jm.m51028x1()) ? c2132iq.mo10262h4() : c10497jm.m51028x1(), c10497jm.m51023kk(), c2132iq.m10758x1().m10581x6().m10624ks(), c10497jm.m51025m9() & 255, m6810k4(c2132iq.mo10738dy()), c10658tw.m51782x1(), (c10497jm.m51026to() & 255) != 0, this.f5291x1.m71946k4().m2349du());
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m6821k4(AbstractC3150x6 abstractC3150x6) {
        try {
            abstractC3150x6.seek(0L, 0);
            return C10591pk.m51478k4(m6834x1(abstractC3150x6));
        } catch (RuntimeException e) {
            throw new PptxReadException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m6822k4(C9816ck c9816ck) {
        if (c9816ck == null) {
            throw new ArgumentNullException("fileSystem");
        }
        try {
            return c9816ck.m48360k4().m48345x1("EncryptedPackage");
        } catch (RuntimeException e) {
            throw new PptReadException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m6823k4(C3088tq c3088tq) {
        if (c3088tq == null || c3088tq.m13125to() == null || c3088tq.m13125to().m13029k4() == null || c3088tq.m13125to().m13029k4().size() == 0 || !c3088tq.m13125to().m13029k4().containsKey(24L)) {
            return null;
        }
        return c3088tq.m13125to().m13029k4().get_Item(24L).mo12907x1();
    }
}
