package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class nl8 extends gmx {
    public nl8(ixg ixgVar, C13847mr c13847mr) {
        super(ixgVar, c13847mr);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68076k4(AbstractC1164gw abstractC1164gw) {
        if (C7019kk.m27469x1(m6216ks().f45392kk, ValueAxisBase.class)) {
            double dM3033gi = ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45392kk, ValueAxisBase.class)).m3033gi();
            double dM3039s7 = ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45392kk, ValueAxisBase.class)).m3039s7();
            if (C7019kk.m27469x1(m6216ks().f45392kk, C14568tn.class)) {
                dM3033gi = m6216ks().f45392kk.m73026k4().m73391k4(dM3033gi);
                dM3039s7 = m6216ks().f45392kk.m73026k4().m73391k4(dM3039s7);
            }
            if (abstractC1164gw.m6923up() < dM3039s7 || abstractC1164gw.m6923up() > dM3033gi) {
                return true;
            }
        }
        if (!C7019kk.m27469x1(m6216ks().f45394x1, ValueAxisBase.class)) {
            return false;
        }
        double dM3033gi2 = ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class)).m3033gi();
        double dM3039s72 = ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45394x1, ValueAxisBase.class)).m3039s7();
        if (C7019kk.m27469x1(m6216ks().f45394x1, iuf.class)) {
            dM3033gi2 = m6216ks().f45394x1.m73026k4().m73391k4(dM3033gi2);
            dM3039s72 = m6216ks().f45394x1.m73026k4().m73391k4(dM3039s72);
        }
        return abstractC1164gw.m6918fa() < dM3039s72 || abstractC1164gw.m6918fa() > dM3033gi2;
    }

    /* JADX INFO: renamed from: kk */
    private void m68077kk(C14713vw c14713vw) {
        float fM73219qm;
        float fM56897x1;
        float fM73205bz;
        float fMo4964k4;
        for (int i = 0; i < ((fml) this).f5069kk.size(); i++) {
            if (((fml) this).f5069kk.get_Item(i) != null) {
                AbstractC1164gw abstractC1164gwM5248to = ((dt0) ((fml) this).f5069kk.get_Item(i)).m5248to();
                C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
                if (abstractC1164gwM5248to.mo3221T_()) {
                    int iM4559dy = abstractC1164gwM5248to.m6926yj().m5003ks().m4559dy();
                    float fM73225wy = 4.0f;
                    if (iM4559dy != 0) {
                        if (iM4559dy == 2) {
                            fMo4964k4 = m6216ks().f45394x1.mo4964k4(abstractC1164gwM5248to.m6918fa());
                            fM73225wy = c14177nd.m73203ak() / 2.0f;
                        } else if (iM4559dy == 5) {
                            c14177nd.m73212h4(m6216ks().f45394x1.mo4964k4(abstractC1164gwM5248to.m6918fa()) - (c14177nd.m73203ak() / 2.0f));
                            fM56897x1 = abstractC1164gwM5248to.m73205bz() - c14177nd.m73225wy();
                            fM73205bz = fM56897x1 - fM73225wy;
                            c14177nd.m73208du(fM73205bz);
                            mxy mxyVar = (mxy) c14713vw;
                            C12025x6 c12025x6Clone = c14177nd.m67976x1(new C12025x6(c14177nd.m73205bz(), c14177nd.m73219qm()), new C12007ix(-mxyVar.m67814to(), -mxyVar.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone()).Clone();
                            c14177nd.m73208du(c12025x6Clone.m56897x1());
                            c14177nd.m73212h4(c12025x6Clone.m56895kk());
                        } else if (iM4559dy != 8) {
                            c14177nd.m73212h4(m6216ks().f45394x1.mo4964k4(abstractC1164gwM5248to.m6918fa()) - (c14177nd.m73203ak() / 2.0f));
                            fM73205bz = abstractC1164gwM5248to.m73205bz() + abstractC1164gwM5248to.m73225wy() + 4.0f;
                            c14177nd.m73208du(fM73205bz);
                            mxy mxyVar2 = (mxy) c14713vw;
                            C12025x6 c12025x6Clone2 = c14177nd.m67976x1(new C12025x6(c14177nd.m73205bz(), c14177nd.m73219qm()), new C12007ix(-mxyVar2.m67814to(), -mxyVar2.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone()).Clone();
                            c14177nd.m73208du(c12025x6Clone2.m56897x1());
                            c14177nd.m73212h4(c12025x6Clone2.m56895kk());
                        } else {
                            fMo4964k4 = abstractC1164gwM5248to.m73219qm() - c14177nd.m73203ak();
                        }
                        fM73219qm = fMo4964k4 - fM73225wy;
                    } else {
                        fM73219qm = abstractC1164gwM5248to.m73219qm() + abstractC1164gwM5248to.m73203ak() + 4.0f;
                    }
                    c14177nd.m73212h4(fM73219qm);
                    fM56897x1 = abstractC1164gwM5248to.m73223ts().m56897x1();
                    fM73225wy = c14177nd.m73225wy() / 2.0f;
                    fM73205bz = fM56897x1 - fM73225wy;
                    c14177nd.m73208du(fM73205bz);
                    mxy mxyVar22 = (mxy) c14713vw;
                    C12025x6 c12025x6Clone22 = c14177nd.m67976x1(new C12025x6(c14177nd.m73205bz(), c14177nd.m73219qm()), new C12007ix(-mxyVar22.m67814to(), -mxyVar22.m67811du(), m73218lr().m73225wy(), m73218lr().m73203ak()).Clone()).Clone();
                    c14177nd.m73208du(c12025x6Clone22.m56897x1());
                    c14177nd.m73212h4(c12025x6Clone22.m56895kk());
                } else {
                    c14177nd.m67970k4(false);
                }
                if (!m6220yj().m64945h4().getChart().getShowDataLabelsOverMaximum() && m68076k4(((dt0) c14177nd).m5248to())) {
                    m73226x1(c14177nd);
                }
                c14177nd.m73220ss();
                c14177nd.m67969k4(new C12025x6(abstractC1164gwM5248to.m73223ts().m56897x1() - c14177nd.m73205bz(), abstractC1164gwM5248to.m73223ts().m56895kk() - c14177nd.m73219qm()));
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m68078to() {
        for (int i = 0; i < ((fml) this).f5071to.size(); i++) {
            AbstractC1164gw abstractC1164gwM5248to = ((dt0) ((fml) this).f5069kk.get_Item(i)).m5248to();
            C14177nd c14177nd = ((fml) this).f5069kk.get_Item(i);
            klm klmVar = ((fml) this).f5071to.get_Item(i);
            C12025x6 c12025x6Clone = abstractC1164gwM5248to.mo3520k4(c14177nd).Clone();
            boolean zM63973k4 = klmVar.m63973k4(c14177nd.m73209e0().Clone(), new C12025x6[]{c12025x6Clone}, (c14177nd.m73227xk() > c12025x6Clone.m56897x1() || c14177nd.m73227xk() + c14177nd.m73225wy() < c12025x6Clone.m56897x1()) ? c14177nd.m67973ne() : c14177nd.m67965ix());
            boolean zM56569kk = c14177nd.m73209e0().m56569kk(abstractC1164gwM5248to.m73209e0().Clone());
            boolean z = (c14177nd.m67962c5() == 0.0f && c14177nd.m67966jd() == 0.0f) ? false : true;
            float fM67504x1 = C14116yg.m67504x1(klmVar.m63975m9().m56897x1(), klmVar.m63971dy().m56897x1());
            float fM67481k4 = C14116yg.m67481k4(klmVar.m63975m9().m56897x1(), klmVar.m63971dy().m56897x1());
            float fM67504x12 = C14116yg.m67504x1(klmVar.m63975m9().m56895kk(), klmVar.m63971dy().m56895kk());
            boolean zM56569kk2 = c14177nd.m73209e0().m56569kk(new C12007ix(fM67504x1, fM67504x12, fM67481k4 - fM67504x1, C14116yg.m67481k4(klmVar.m63975m9().m56895kk(), klmVar.m63971dy().m56895kk()) - fM67504x12).Clone());
            if (!zM63973k4 || zM56569kk || !z || c12025x6Clone.m56897x1() > m73218lr().m73207dq().f47836k4 || c12025x6Clone.m56895kk() > m73218lr().m73207dq().f47837x1 || zM56569kk2) {
                klmVar.m63972k4(false);
            } else {
                klmVar.m63972k4(true);
            }
            klmVar.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        AbstractC1164gw abstractC1164gw;
        float fM73203ak;
        AbstractC1164gw abstractC1164gw2;
        float fM6923up;
        float fM73225wy;
        for (int i = 0; i < ((fml) this).f5072x1.size(); i++) {
            if (C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14265p3.class)) {
                AbstractC14763x3 abstractC14763x3 = m6216ks().f45392kk;
                int size = m6216ks().f45392kk.f49904k4.size();
                boolean zM73375b3 = m6216ks().f45392kk.m73026k4().m73375b3();
                float fM73225wy2 = abstractC14763x3.m73225wy();
                if (zM73375b3) {
                    abstractC1164gw2 = ((fml) this).f5072x1.get_Item(i);
                    fM6923up = ((float) ((((fml) this).f5072x1.get_Item(i).m6923up() / ((double) size)) * ((double) fM73225wy2))) - (((fml) this).f5072x1.get_Item(i).m73225wy() / 2.0f);
                    fM73225wy = m6769m9();
                } else {
                    abstractC1164gw2 = ((fml) this).f5072x1.get_Item(i);
                    fM6923up = (float) (((((fml) this).f5072x1.get_Item(i).m6923up() - 1.0d) / ((double) (size - 1))) * ((double) fM73225wy2));
                    fM73225wy = ((fml) this).f5072x1.get_Item(i).m73225wy();
                }
                abstractC1164gw2.m73208du(fM6923up - (fM73225wy / 2.0f));
            } else {
                ((fml) this).f5072x1.get_Item(i).m73208du(m6216ks().f45392kk.mo4964k4(((fml) this).f5072x1.get_Item(i).m6923up()) - (((fml) this).f5072x1.get_Item(i).m73225wy() / 2.0f));
                if (C7019kk.m27469x1(m6216ks().f45392kk, AbstractC14464sp.class)) {
                    ((fml) this).f5072x1.get_Item(i).m73208du((m6769m9() / 2.0f) + ((fml) this).f5072x1.get_Item(i).m73205bz());
                }
            }
            if (C7019kk.m27469x1(m6216ks().f45394x1, AbstractC14265p3.class)) {
                if (m6216ks().f45394x1.m73026k4().m73375b3()) {
                    abstractC1164gw = ((fml) this).f5072x1.get_Item(i);
                    fM73203ak = m73203ak() - ((i + 0.5f) * ((d6s) C7019kk.m27452k4((Object) m6216ks().f45394x1, d6s.class)).m4965kp());
                } else {
                    abstractC1164gw = ((fml) this).f5072x1.get_Item(i);
                    fM73203ak = m73203ak() - (((d6s) C7019kk.m27452k4((Object) m6216ks().f45394x1, d6s.class)).m4965kp() * i);
                }
                abstractC1164gw.m73212h4(fM73203ak - (((fml) this).f5072x1.get_Item(i).m73203ak() / 2.0f));
            } else {
                ((fml) this).f5072x1.get_Item(i).m73212h4(m6216ks().f45394x1.mo4964k4(((fml) this).f5072x1.get_Item(i).m6918fa()) - (((fml) this).f5072x1.get_Item(i).m73203ak() / 2.0f));
            }
            if (C7019kk.m27469x1(m6216ks().f45392kk, ValueAxisBase.class)) {
                double dM3033gi = ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45392kk, ValueAxisBase.class)).m3033gi();
                double dM3039s7 = ((ValueAxisBase) C7019kk.m27452k4((Object) m6216ks().f45392kk, ValueAxisBase.class)).m3039s7();
                if (C7019kk.m27469x1(m6216ks().f45392kk, C14568tn.class)) {
                    dM3033gi = m6216ks().f45392kk.m73026k4().m73391k4(dM3033gi);
                    dM3039s7 = m6216ks().f45392kk.m73026k4().m73391k4(dM3039s7);
                }
                if (((fml) this).f5072x1.get_Item(i).m6923up() < dM3039s7 || ((fml) this).f5072x1.get_Item(i).m6923up() > dM3033gi) {
                    ((fml) this).f5072x1.get_Item(i).mo63967x1(false);
                }
            }
            ((fml) this).f5072x1.get_Item(i).m73220ss();
        }
        m68077kk(c14713vw);
        m68078to();
        m6210fa();
        m6209ck();
    }
}
