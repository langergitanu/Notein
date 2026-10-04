package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3185jd;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p087dm.C3188m9;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3792m9;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p136fr.C4115to;
import com.aspose.slides.internal.p136fr.C4116x1;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class sd0 {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f48789dy = new C7017h4("text", "tspan", DrawToolFactory.LASSO_TYPE_RECT, "circle", "ellipse", "line", "polyline", "polygon", "path");

    /* JADX INFO: renamed from: du */
    private C3787h4 f48790du;

    /* JADX INFO: renamed from: h4 */
    private i4y f48791h4;

    /* JADX INFO: renamed from: k4 */
    private final SvgImage f48792k4;

    /* JADX INFO: renamed from: kk */
    private C3783ck f48793kk;

    /* JADX INFO: renamed from: m9 */
    private s0t f48794m9;

    /* JADX INFO: renamed from: to */
    private Dictionary<String, IGenericDictionary<String, String>> f48795to;

    /* JADX INFO: renamed from: x1 */
    private C3792m9 f48796x1;

    public sd0(IPictureFrame iPictureFrame, ISvgImage iSvgImage) {
        this.f48792k4 = (SvgImage) iSvgImage;
        m70543k4(new i4y(iPictureFrame));
        m70549k4(new s0t(iPictureFrame));
    }

    /* JADX INFO: renamed from: du */
    private void m70536du() {
        C3181c5 c3181c5 = m70542k4(this.f48792k4.getSvgContent()).f9466h4;
        if (this.f48790du.m15134k4() != null) {
            IGenericEnumerator<InterfaceC5797ne> it = this.f48790du.m15134k4().mo23390x1().iterator();
            while (it.hasNext()) {
                try {
                    this.f48796x1.m15152k4(it.next().mo23406x1());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        Dictionary.Enumerator<String, String> it2 = this.f48796x1.m15151k4().iterator();
        while (it2.hasNext()) {
            try {
                KeyValuePair next = it2.next();
                int iM67364dy = C14113y2.m67364dy((String) next.getKey(), ".MsftOfcThm");
                int iM67364dy2 = C14113y2.m67364dy((String) next.getKey(), "Fill");
                if (iM67364dy >= 0 && iM67364dy2 >= 0) {
                    m70544k4(m70559k4(), (String) next.getKey(), iM67364dy2);
                }
                int iM67364dy3 = C14113y2.m67364dy((String) next.getKey(), "Stroke");
                if (iM67364dy >= 0 && iM67364dy3 >= 0) {
                    m70544k4(m70562x1(), (String) next.getKey(), iM67364dy3);
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
        m70552kk(c3181c5);
    }

    /* JADX INFO: renamed from: dy */
    private byte m70538dy(C3181c5 c3181c5) {
        C3187kk c3187kk = c3181c5.f9461x1;
        String str = c3187kk.get_Item("stroke-dasharray");
        c3187kk.get_Item("stroke-linecap");
        if (C14113y2.m67411k4(str)) {
            return (byte) -1;
        }
        String[] strArrM67416k4 = C14113y2.m67416k4(str, new char[]{ControlChar.SPACE_CHAR, ','}, (short) 1);
        int[] iArr = new int[strArrM67416k4.length];
        for (int i = 0; i < strArrM67416k4.length; i++) {
            C14064he.m66713k4(strArrM67416k4[i], 32, C11697x1.m55250kk(), new float[]{0.0f});
            iArr[i] = OooO.OooO00o(r5[0] / ((float) m70562x1().m70411ck()), 14);
        }
        return nbb.m67913k4(iArr);
    }

    /* JADX INFO: renamed from: h4 */
    private String m70539h4() {
        C6765kp c6765kp = new C6765kp();
        if (m70559k4().m7439x1() == 1 && m70559k4().m7425du() != -1) {
            c6765kp.m26792k4(C14113y2.m67408k4(".MsftOfcThm", C18115b5.CONNECTOR, C14042ak.m66410k4(SchemeColor.class, m70559k4().m7425du()), C18115b5.CONNECTOR));
            if (!C14064he.m66715kk(m70559k4().m7437m9())) {
                c6765kp.m26792k4(C14113y2.m67408k4("lumMod", C18115b5.CONNECTOR, C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(m70559k4().m7437m9() * 100.0f)), 14)), C18115b5.CONNECTOR));
            }
            if (!C14064he.m66715kk(m70559k4().m7426dy())) {
                c6765kp.m26792k4(C14113y2.m67408k4("lumOff", C18115b5.CONNECTOR, C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(m70559k4().m7426dy() * 100.0f)), 14)), C18115b5.CONNECTOR));
            }
            c6765kp.m26792k4("Fill");
            if (m70559k4().m7424c5()) {
                c6765kp.m26792k4("_v2");
            }
            c6765kp.m26792k4(C14113y2.m67408k4(" {\n fill:", m70559k4().m7438to(), ";\n}\n"));
        }
        if (m70562x1().m7439x1() == 1 && m70562x1().m7425du() != -1) {
            c6765kp.m26792k4(C14113y2.m67408k4(".MsftOfcThm", C18115b5.CONNECTOR, C14042ak.m66410k4(SchemeColor.class, m70562x1().m7425du()), C18115b5.CONNECTOR));
            if (!C14064he.m66715kk(m70562x1().m7437m9())) {
                c6765kp.m26792k4(C14113y2.m67408k4("lumMod", C18115b5.CONNECTOR, C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(m70562x1().m7437m9() * 100.0f)), 14)), C18115b5.CONNECTOR));
            }
            if (!C14064he.m66715kk(m70562x1().m7426dy())) {
                c6765kp.m26792k4(C14113y2.m67408k4("lumOff", C18115b5.CONNECTOR, C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(m70562x1().m7426dy() * 100.0f)), 14)), C18115b5.CONNECTOR));
            }
            c6765kp.m26792k4("Stroke");
            if (m70562x1().m7424c5()) {
                c6765kp.m26792k4("_v2");
            }
            c6765kp.m26792k4(C14113y2.m67408k4(" {\n stroke:", m70562x1().m7438to(), ";\n}\n"));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private float m70541k4(float f, String str) {
        float fM70551kk = m70551kk(str);
        if (f == -3.4028235E38f) {
            return fM70551kk;
        }
        if (f != fM70551kk) {
            return Float.NaN;
        }
        return f;
    }

    /* JADX INFO: renamed from: kk */
    private float m70551kk(String str) {
        if (C14113y2.m67411k4(str)) {
            return Float.NaN;
        }
        float[] fArr = {0.0f};
        boolean zM66713k4 = C14064he.m66713k4(C14113y2.m67393k4(str, ',', FilenameUtils.EXTENSION_SEPARATOR), 32, C11697x1.m55250kk(), fArr);
        float f = fArr[0];
        if (zM66713k4) {
            return f;
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: m9 */
    private void m70554m9(C3181c5 c3181c5) {
        C3187kk c3187kk = c3181c5.f9461x1;
        if (!C14044b3.m66437kk(m70562x1().m70411ck())) {
            m70562x1().m70413k4(m70541k4((float) m70562x1().m70411ck(), c3187kk.get_Item("stroke-width")));
        }
        if (!C14064he.m66715kk(m70562x1().m7427h4())) {
            m70562x1().m7430k4(m70541k4(m70562x1().m7427h4(), c3187kk.get_Item("stroke-opacity")));
        }
        if (!C14064he.m66715kk(m70559k4().m7427h4())) {
            m70559k4().m7430k4(m70541k4(m70559k4().m7427h4(), c3187kk.get_Item("fill-opacity")));
        }
        if (!m70559k4().m7434k4() && m70559k4().m7439x1() == 1 && m70559k4().m7425du() == -1) {
            C14093tq<C12003du> c14093tqClone = m70556x1(c3187kk.get_Item("fill")).Clone();
            if (C12003du.m56403k4(m70559k4().m7435kk(), C12003du.f40505to) && C14093tq.m67296x1(c14093tqClone, null)) {
                C14093tq<C12003du> c14093tqClone2 = c14093tqClone.Clone();
                if (!c14093tqClone2.m67302x1()) {
                    c14093tqClone2 = new C14093tq<>(C12003du.f40505to.Clone());
                }
                m70559k4().m7432k4(c14093tqClone2.m67297k4().Clone());
            } else if (C14093tq.m67296x1(new C14093tq(m70559k4().m7435kk().Clone()), c14093tqClone)) {
                m70559k4().m7432k4(C12003du.f40505to.Clone());
                m70559k4().m7429k4((byte) -1);
            }
        }
        if (!m70562x1().m7434k4() && m70562x1().m7439x1() == 1 && m70562x1().m7425du() == -1) {
            C14093tq<C12003du> c14093tqClone3 = m70556x1(c3187kk.get_Item("stroke")).Clone();
            if (C12003du.m56403k4(m70562x1().m7435kk(), C12003du.f40505to) && C14093tq.m67296x1(c14093tqClone3, null)) {
                C14093tq<C12003du> c14093tqClone4 = c14093tqClone3.Clone();
                if (!c14093tqClone4.m67302x1()) {
                    c14093tqClone4 = new C14093tq<>(C12003du.f40505to.Clone());
                }
                m70562x1().m7432k4(c14093tqClone4.m67297k4().Clone());
            } else if (C14093tq.m67296x1(new C14093tq(m70562x1().m7435kk().Clone()), c14093tqClone3)) {
                m70562x1().m7432k4(C12003du.f40505to.Clone());
                m70562x1().m7429k4((byte) -1);
            }
        }
        if (m70562x1().m70412fa() != -1) {
            byte bM70538dy = m70538dy(c3181c5);
            if (m70562x1().m70412fa() == 0) {
                m70562x1().m70414x1(bM70538dy);
            } else if (m70562x1().m70412fa() != bM70538dy) {
                m70562x1().m70414x1((byte) -1);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private C14093tq<C12003du> m70556x1(String str) {
        if (!C14113y2.m67411k4(str)) {
            int[] iArr = {0};
            boolean zM66589k4 = C14057f9.m66589k4(C14113y2.m67422kk(str, 1), 515, C11697x1.m55250kk(), iArr);
            int i = iArr[0];
            if (zM66589k4) {
                return new C14093tq<>(C12003du.m56400k4(255, C12003du.m56396k4(i).Clone()).Clone());
            }
        }
        return new C14093tq<>();
    }

    /* JADX INFO: renamed from: to */
    public final ISvgImage m70561to() {
        String strM70539h4 = m70539h4();
        C3185jd c3185jdM70542k4 = m70542k4(this.f48792k4.getSvgContent());
        C3181c5 c3181c5 = c3185jdM70542k4.f9466h4;
        m70547k4(c3181c5, new lkb() { // from class: com.aspose.slides.sd0.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.DOM.Util.SvgMsStyleConverter.RemoveAllPropsFromChildren(Aspose.Svg.Model.SvgNode)";
            }

            @Override // com.aspose.slides.lkb
            /* JADX INFO: renamed from: k4 */
            public void mo64447k4(C3181c5 c3181c52) {
                sd0.this.m70545k4(c3181c52);
            }
        });
        m70548k4(c3185jdM70542k4, strM70539h4);
        if (!m70562x1().m7434k4() || !m70559k4().m7434k4()) {
            m70547k4(c3181c5, new lkb() { // from class: com.aspose.slides.sd0.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.DOM.Util.SvgMsStyleConverter.ApplyNewMsStyle(Aspose.Svg.Model.SvgNode)";
                }

                @Override // com.aspose.slides.lkb
                /* JADX INFO: renamed from: k4 */
                public void mo64447k4(C3181c5 c3181c52) {
                    sd0.this.m70557x1(c3181c52);
                }
            });
        }
        return new SvgImage(C4115to.m16474k4(c3185jdM70542k4), this.f48792k4.getExternalResourceResolver(), this.f48792k4.getBaseUri());
    }

    /* JADX INFO: renamed from: du */
    private void m70537du(C3181c5 c3181c5) {
        int i = 0;
        while (i < c3181c5.m13628ar().m13697k4()) {
            C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
            if (!C3794up.m15164k4(c3181c5M13702x1) && AbstractJwtRequest.ClaimNames.USE.equals(c3181c5M13702x1.f9456h4)) {
                c3181c5.m13628ar().m13698k4(i);
                i--;
            }
            m70537du(c3181c5M13702x1);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public void m70540h4(C3181c5 c3181c5) {
        if (c3181c5 == null) {
            return;
        }
        switch (f48789dy.m27428k4(c3181c5.f9456h4)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                m70554m9(c3181c5);
                break;
        }
    }

    /* JADX INFO: renamed from: to */
    private void m70555to(C3181c5 c3181c5) {
        Dictionary.Enumerator<String, C3181c5> it = this.f48793kk.m15119x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (this.f48795to.containsKey((String) next.getKey())) {
                    IGenericDictionary<String, String> iGenericDictionary = this.f48795to.get_Item((String) next.getKey());
                    IGenericEnumerator<KeyValuePair<TKey, TValue>> it2 = iGenericDictionary.iterator();
                    while (it2.hasNext()) {
                        try {
                            KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                            if (((C3181c5) next.getValue()).f9461x1.containsKey((String) keyValuePair.getKey())) {
                                ((C3181c5) next.getValue()).f9461x1.set_Item((String) keyValuePair.getKey(), (String) keyValuePair.getValue());
                            } else {
                                ((C3181c5) next.getValue()).f9461x1.m13684k4((String) keyValuePair.getKey(), (String) keyValuePair.getValue());
                            }
                        } finally {
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    m70546k4((C3181c5) next.getValue(), iGenericDictionary);
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
        m70537du(c3181c5);
    }

    /* JADX INFO: renamed from: k4 */
    public final i4y m70559k4() {
        return this.f48791h4;
    }

    /* JADX INFO: renamed from: kk */
    public final ISvgImage m70560kk() {
        m70536du();
        return (m70562x1().m7434k4() && m70559k4().m7434k4()) ? this.f48792k4 : m70561to();
    }

    /* JADX INFO: renamed from: x1 */
    public final s0t m70562x1() {
        return this.f48794m9;
    }

    /* JADX INFO: renamed from: k4 */
    private C3185jd m70542k4(String str) {
        this.f48796x1 = new C3792m9();
        this.f48793kk = new C3783ck();
        this.f48795to = new Dictionary<>();
        this.f48790du = new C3787h4();
        C3185jd c3185jdM16477k4 = C4116x1.m16477k4(str);
        C3181c5 c3181c5 = c3185jdM16477k4.f9466h4;
        C3794up.m15159k4(c3181c5, this.f48796x1, false);
        C3794up.m15157k4(c3181c5, this.f48793kk, this.f48792k4.m2856x1());
        C3794up.m15162k4(c3181c5, false, this.f48795to);
        C3794up.m15160k4(c3181c5, this.f48792k4.m2856x1(), this.f48790du);
        return c3185jdM16477k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m70552kk(C3181c5 c3181c5) {
        m70555to(c3181c5);
        m70562x1().m70413k4(-3.4028234663852886E38d);
        m70559k4().m7430k4(-3.4028235E38f);
        m70562x1().m7430k4(-3.4028235E38f);
        m70559k4().m7429k4((byte) 1);
        m70562x1().m7429k4((byte) 1);
        m70562x1().m70414x1((byte) 0);
        m70547k4(c3181c5, new lkb() { // from class: com.aspose.slides.sd0.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.DOM.Util.SvgMsStyleConverter.CheckNode(Aspose.Svg.Model.SvgNode)";
            }

            @Override // com.aspose.slides.lkb
            /* JADX INFO: renamed from: k4 */
            public void mo64447k4(C3181c5 c3181c52) {
                sd0.this.m70540h4(c3181c52);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public void m70557x1(C3181c5 c3181c5) {
        if (c3181c5 == null || "svg".equals(c3181c5.f9456h4)) {
            return;
        }
        if (!m70559k4().m7434k4() && !m70559k4().m7424c5()) {
            c3181c5.f9461x1.set_Item("fill", m70559k4().m7438to());
            if (!C14064he.m66715kk(m70559k4().m7427h4())) {
                c3181c5.f9461x1.set_Item("fill-opacity", C14064he.m66711k4(m70559k4().m7427h4(), (InterfaceC14073kp) C11697x1.m55250kk()));
            }
        }
        if (m70562x1().m7434k4() || m70562x1().m7424c5()) {
            return;
        }
        c3181c5.f9461x1.set_Item("stroke", m70562x1().m7438to());
        if (!C14064he.m66715kk(m70562x1().m7427h4())) {
            c3181c5.f9461x1.set_Item("stroke-opacity", C14064he.m66711k4(m70562x1().m7427h4(), (InterfaceC14073kp) C11697x1.m55250kk()));
        }
        if (!C14044b3.m66437kk(m70562x1().m70411ck())) {
            c3181c5.f9461x1.set_Item("stroke-width", C14044b3.m66432k4(m70562x1().m70411ck(), (InterfaceC14073kp) C11697x1.m55250kk()));
        }
        if (m70562x1().m70412fa() == -1 || m70562x1().m70412fa() == 0) {
            return;
        }
        c3181c5.f9461x1.m13696x1("stroke-linecap");
        c3181c5.f9461x1.set_Item("stroke-dasharray", nbb.m67914k4(m70562x1().m70412fa(), m70562x1().m70411ck()));
        if (m70562x1().m70412fa() == 1) {
            c3181c5.f9461x1.set_Item("stroke-linecap", "round");
        }
        if (m70562x1().m70412fa() == 2) {
            c3181c5.f9461x1.set_Item("stroke-linecap", "square");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70543k4(i4y i4yVar) {
        this.f48791h4 = i4yVar;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70544k4(i4y i4yVar, String str, int i) {
        float f;
        String[] strArrM67416k4 = C14113y2.m67416k4(C14113y2.m67443x1(str, 0, i - 1), new char[]{'_'}, (short) 0);
        if (strArrM67416k4.length % 2 > 0) {
            throw new C3188m9(0, "Invalid SvgMsStyle", str);
        }
        float f2 = 0.0f;
        for (int i2 = 0; i2 < strArrM67416k4.length; i2 += 2) {
            if (".MsftOfcThm".equals(strArrM67416k4[i2])) {
                String strM67401k4 = C14113y2.m67401k4(strArrM67416k4[i2 + 1], "Main", "");
                if (C14113y2.m67411k4(strM67401k4)) {
                    strM67401k4 = "NotDefined";
                }
                i4yVar.m7431k4(Long.valueOf(AbstractC14106wy.parse(C7019kk.m27443k4((Class<?>) SchemeColor.class), strM67401k4)).intValue());
            } else {
                if ("lumMod".equals(strArrM67416k4[i2])) {
                    float[] fArr = {f2};
                    boolean zM66714k4 = C14064he.m66714k4(strArrM67416k4[i2 + 1], fArr);
                    f = fArr[0];
                    if (zM66714k4) {
                        i4yVar.m7440x1(f / 100.0f);
                    }
                } else if ("lumOff".equals(strArrM67416k4[i2])) {
                    float[] fArr2 = {f2};
                    boolean zM66714k42 = C14064he.m66714k4(strArrM67416k4[i2 + 1], fArr2);
                    f = fArr2[0];
                    if (zM66714k42) {
                        i4yVar.m7436kk(f / 100.0f);
                    }
                }
                f2 = f;
            }
        }
        i4yVar.m7429k4((byte) 1);
        if (C14113y2.m67424kk(str, "_v2")) {
            i4yVar.m7433k4(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m70545k4(C3181c5 c3181c5) {
        m70546k4(c3181c5, c3181c5.f9461x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70546k4(C3181c5 c3181c5, IGenericDictionary<String, String> iGenericDictionary) {
        int i = 0;
        while (i < c3181c5.m13628ar().m13697k4()) {
            C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
            IGenericEnumerator<KeyValuePair<TKey, TValue>> it = iGenericDictionary.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair keyValuePair = (KeyValuePair) it.next();
                    if (c3181c5M13702x1.f9461x1.containsKey((String) keyValuePair.getKey())) {
                        if (C14113y2.m67363du(c3181c5M13702x1.f9461x1.get_Item((String) keyValuePair.getKey()), (String) keyValuePair.getValue())) {
                            c3181c5M13702x1.f9461x1.m13696x1((String) keyValuePair.getKey());
                        } else if ("transform".equals(keyValuePair.getKey()) && C14113y2.m67448x1(c3181c5M13702x1.f9461x1.get_Item("transform"), iGenericDictionary.get_Item("transform"))) {
                            String strM67440x1 = C14113y2.m67440x1(C14113y2.m67396k4(c3181c5M13702x1.f9461x1.get_Item("transform"), 0, iGenericDictionary.get_Item("transform").length()));
                            if (C14113y2.m67411k4(strM67440x1)) {
                                c3181c5M13702x1.f9461x1.m13696x1("transform");
                                i--;
                            } else {
                                c3181c5M13702x1.f9461x1.set_Item("transform", strM67440x1);
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
            m70546k4(c3181c5M13702x1, iGenericDictionary);
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70547k4(C3181c5 c3181c5, lkb lkbVar) {
        for (int i = 0; i < c3181c5.m13628ar().m13697k4(); i++) {
            C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
            if (C3794up.m15164k4(c3181c5M13702x1)) {
                String str = c3181c5M13702x1.f9461x1.get_Item("visibility");
                if (!C14113y2.m67432to("hidden", str, (short) 3) && !C14113y2.m67432to("collapse", str, (short) 3) && !C14113y2.m67432to("none", c3181c5M13702x1.f9461x1.get_Item("display"), (short) 3)) {
                    lkbVar.mo64447k4(c3181c5M13702x1);
                    m70547k4(c3181c5M13702x1, lkbVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70548k4(C3185jd c3185jd, String str) {
        C3550du c3550duM13678k4 = c3185jd.m13678k4();
        int i = 0;
        while (true) {
            if (i >= c3550duM13678k4.m13628ar().m13697k4()) {
                break;
            }
            C3181c5 c3181c5M13702x1 = c3550duM13678k4.m13628ar().m13702x1(i);
            if ("style".equals(c3181c5M13702x1.f9456h4) && c3181c5M13702x1.f9461x1.size() == 0) {
                c3550duM13678k4.m13628ar().m13698k4(i);
                break;
            }
            i++;
        }
        if (C14113y2.m67411k4(str)) {
            return;
        }
        C3181c5 c3181c5 = new C3181c5("style", new C3187kk(), c3185jd.f9466h4);
        c3181c5.m13635k4(new C10229k4(str));
        c3550duM13678k4.m13628ar().m13703x1(0, c3181c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70549k4(s0t s0tVar) {
        this.f48794m9 = s0tVar;
    }
}
