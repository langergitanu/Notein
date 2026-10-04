package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4317dy;

/* JADX INFO: loaded from: classes3.dex */
final class m4s extends C0833bw {
    public m4s(SmartArtShape smartArtShape) {
        super(smartArtShape);
    }

    /* JADX INFO: renamed from: k4 */
    public final SmartArtShape m64746k4() {
        return (SmartArtShape) m5629du();
    }

    @Override // com.aspose.slides.C0833bw, com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) throws Throwable {
        kg7 kg7Var2;
        AbstractC14897zn abstractC14897zn2;
        try {
            kg7Var.m63840k4(m5629du().getHyperlinkClick());
            super.mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            if (m5629du().getHidden() || m64746k4().m2820kk() == null) {
                kg7Var2 = kg7Var;
            } else {
                C4317dy c4317dyM63485k4 = jq6.m63485k4(m64746k4().m2820kk().f3523to, kg7Var);
                boolean zM5721k4 = C0964eu.m5721k4(abstractC14897zn, kg7Var, m64746k4(), m64746k4().m2820kk());
                try {
                    if (zM5721k4) {
                        abstractC14897zn2 = abstractC14897zn;
                        kg7Var2 = kg7Var;
                    } else {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            if (m64746k4().m2820kk().m2926m9()) {
                                C1099fg c1099fg = new C1099fg(null);
                                try {
                                    abstractC14897zn2 = abstractC14897zn;
                                    kg7Var2 = kg7Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    c1099fg.m6175k4(abstractC14897zn2, kg7Var2, m64746k4(), m64746k4().m2820kk(), c4317dyM63485k4);
                                    c1099fg.dispose();
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    c1099fg.dispose();
                                    throw th4;
                                }
                            } else {
                                abstractC14897zn2 = abstractC14897zn;
                                kg7Var2 = kg7Var;
                                abstractC14897zn2.m74622kk(c4317dyM63485k4);
                                m64746k4().m2820kk().f3523to.mo64295k4(abstractC14897zn2, kg7Var2);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            Throwable th6 = th;
                            if (!m64746k4().m2820kk().m2926m9() && !zM5721k4) {
                                abstractC14897zn.m74626rv();
                            }
                            if (kg7Var.m63835fa() == null) {
                                throw th6;
                            }
                            kg7Var.m63840k4((IHyperlink) null);
                            abstractC14897zn.mo68800x1();
                            throw th6;
                        }
                    }
                    if (!m64746k4().m2820kk().m2926m9() && !zM5721k4) {
                        abstractC14897zn2.m74626rv();
                    }
                    if (kg7Var2.m63835fa() != null) {
                        kg7Var2.m63840k4((IHyperlink) null);
                        abstractC14897zn2.mo68800x1();
                    }
                } catch (Throwable th7) {
                    th = th7;
                    Throwable th8 = th;
                    kg7Var.m63840k4((IHyperlink) null);
                    throw th8;
                }
            }
            kg7Var2.m63840k4((IHyperlink) null);
        } catch (Throwable th9) {
            th = th9;
        }
    }
}
