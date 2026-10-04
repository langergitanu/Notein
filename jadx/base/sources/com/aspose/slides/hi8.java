package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10395d2;
import com.aspose.slides.internal.p407st.C10408dt;
import com.aspose.slides.internal.p407st.C10480ii;
import com.aspose.slides.internal.p407st.C10482iq;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10552n0;
import com.aspose.slides.internal.p407st.C10553n2;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10639so;
import com.aspose.slides.internal.p407st.C10666ul;
import com.aspose.slides.internal.p407st.C10736yo;
import com.aspose.slides.internal.p407st.C10745z7;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18358t1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class hi8 {
    /* JADX INFO: renamed from: k4 */
    private static Placeholder m7173k4(qah qahVar, qah qahVar2) {
        C10553n2 c10553n2M50433rv;
        if (qahVar.m69493to().m64714fa() != 4 || (c10553n2M50433rv = qahVar.m69489kk().mo50862jd().m50433rv()) == null || qahVar.m69481du().m70145ne() == null) {
            return null;
        }
        if (qahVar2 != null && ((MasterSlide) C7019kk.m27452k4((Object) qahVar2.m69493to().m64735up(), MasterSlide.class)) == null) {
            return null;
        }
        List.Enumerator<Shape> it = m4c.m64704x1(((Slide) qahVar.m69493to().m64735up()).m2687bv()).iterator();
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                Placeholder placeholder = (Placeholder) C7019kk.m27452k4((Object) next.getPlaceholder(), Placeholder.class);
                if (placeholder != null && next.m2584wp() == c10553n2M50433rv.m51348x1()) {
                    return placeholder;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    private static void m7181kk(uz3 uz3Var) {
        rpo rpoVarM3738du = uz3Var.m3738du();
        if (m7180k4(rpoVarM3738du)) {
            Shape shapeMo64936jd = uz3Var.mo64936jd();
            byte type = shapeMo64936jd.getPlaceholder().getType();
            if (type == 4) {
                C10639so c10639soM51365x6 = ((C10556n5) rpoVarM3738du.m70228to()).m51365x6();
                c10639soM51365x6.m51693x1().m51649k4(true);
                AutoShape autoShape = (AutoShape) shapeMo64936jd;
                boolean zM285kk = autoShape.m285kk();
                c10639soM51365x6.m51693x1().m51645du(!zM285kk);
                ITextFrame textFrame = autoShape.getTextFrame();
                if (zM285kk) {
                    IPortion iPortion = textFrame.getParagraphs().get_Item(0).getPortions().get_Item(0);
                    c10639soM51365x6.m51693x1().m51648k4((short) (f6b.m5899k4(iPortion.getField().getType().getInternalString(), ai5.m3601k4(iPortion.getPortionFormat().getLanguageId()).Clone()) & 255));
                } else {
                    c10639soM51365x6.m51689k4(((TextFrame) textFrame).m2901c5());
                }
            } else if (type == 5) {
                ((C10556n5) rpoVarM3738du.m70228to()).m51365x6().m51693x1().m51656x1(true);
            } else {
                if (type != 6) {
                    return;
                }
                C10639so c10639soM51365x62 = ((C10556n5) rpoVarM3738du.m70228to()).m51365x6();
                c10639soM51365x62.m51693x1().m51653to(true);
                c10639soM51365x62.m51691kk(((TextFrame) ((AutoShape) shapeMo64936jd).getTextFrame()).m2901c5());
            }
            uz3Var.m3742k4(false);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7182x1(kiv kivVar) {
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) kivVar.m63911x1().mo64936jd(), AutoShape.class);
        if (autoShape == null) {
            return;
        }
        if ((C7019kk.m27469x1(autoShape.getSlide(), ISlide.class) || C7019kk.m27469x1(autoShape.getSlide(), INotesSlide.class)) && autoShape.getTextFrame() != null) {
            IPlaceholder placeholder = autoShape.getPlaceholder();
            if (m7179k4(placeholder)) {
                kivVar.m63903k4(1);
                kivVar.m63912x1(f6b.m5900k4(placeholder.getType()));
                kivVar.m63910to(0);
                kivVar.m63902k4();
                m7174k4(C10666ul.m51805k4(kivVar.m63899du(), kivVar.m63908m9()), kivVar.m63911x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7174k4(int i, uz3 uz3Var) {
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) uz3Var.mo64936jd(), AutoShape.class);
        if (autoShape == null) {
            return;
        }
        uz3Var.m72001k4(autoShape.getTextFrame(), i);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7183x1(uz3 uz3Var) {
        MasterNotesSlide masterNotesSlide;
        com.aspose.slides.internal.p332p7.qvp qvpVarM72932dy;
        boolean zM3744m9;
        boolean zM39712to;
        if (uz3Var.m3738du().m70220kk() != 6 || (masterNotesSlide = (MasterNotesSlide) C7019kk.m27452k4((Object) uz3Var.m3738du().m70215k4().m71946k4().getMasterNotesSlideManager().getMasterNotesSlide(), MasterNotesSlide.class)) == null || (qvpVarM72932dy = masterNotesSlide.m1933x6().m72932dy()) == null) {
            return;
        }
        byte type = uz3Var.mo64936jd().getPlaceholder().getType();
        if (type == 4) {
            zM3744m9 = uz3Var.m3744m9();
            zM39712to = qvpVarM72932dy.m39712to();
        } else if (type == 5) {
            zM3744m9 = uz3Var.m3744m9();
            zM39712to = qvpVarM72932dy.m39708k4();
        } else if (type == 6) {
            zM3744m9 = uz3Var.m3744m9();
            zM39712to = qvpVarM72932dy.m39710kk();
        } else {
            if (type != 7) {
                return;
            }
            zM3744m9 = uz3Var.m3744m9();
            zM39712to = qvpVarM72932dy.m39714x1();
        }
        uz3Var.m3742k4((!zM39712to) & zM3744m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7175k4(kiv kivVar) {
        C10534m3 c10534m3M72004qq = kivVar.m63911x1().m72004qq();
        C10736yo c10736yo = (C10736yo) C22223Oooo0o.OooO0O0(c10534m3M72004qq, FrameMetricsAggregator.EVERY_DURATION, C10736yo.class);
        if (c10736yo == null) {
            C10480ii c10480iiM51263x1 = c10534m3M72004qq.m51263x1();
            c10736yo = new C10736yo();
            c10480iiM51263x1.m50926k4(c10736yo);
        }
        c10736yo.m52088fa(false);
        if (kivVar.m63899du() != 13) {
            c10736yo.m52088fa(true);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m7184x1(IPlaceholder iPlaceholder) {
        if (iPlaceholder == null) {
            return false;
        }
        byte type = iPlaceholder.getType();
        return type == 0 || type == 1 || type == 4 || type == 5 || type == 6 || type == 7 || type == 14;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7176k4(qah qahVar) {
        IGenericDictionary<Byte, Placeholder> iGenericDictionaryM64711dq;
        byte[] bArrM3196v4 = qahVar.m69493to().m64712du().m3196v4();
        nt8 nt8VarM70145ne = qahVar.m69481du().m70145ne();
        if (nt8VarM70145ne == null) {
            return;
        }
        Shape shape = (Shape) C7019kk.m27452k4((Object) qahVar.m69481du().m70148u4(), Shape.class);
        if (shape == null) {
            throw new NullReferenceException("No target shape for placeholder!");
        }
        int iM68207kk = nt8VarM70145ne.m68207kk();
        if (iM68207kk == 0) {
            return;
        }
        byte[] bArr = {0};
        byte[] bArr2 = {0};
        f6b.m5906k4(iM68207kk, bArr, bArr2);
        byte b = bArr[0];
        byte b2 = bArr2[0];
        if (nt8VarM70145ne.m68203k4() == 1 && (iGenericDictionaryM64711dq = qahVar.m69493to().m64711dq()) != null && iGenericDictionaryM64711dq.containsKey(Byte.valueOf(b))) {
            nt8VarM70145ne.m68206k4(iGenericDictionaryM64711dq.get_Item(Byte.valueOf(b)).getIndex());
        }
        qah qahVarM69480ck = qahVar.m69480ck();
        if (qahVarM69480ck != null && qahVarM69480ck.m69481du().m70145ne() != null) {
            Placeholder placeholderM7173k4 = m7173k4(qahVar, qahVarM69480ck);
            nt8VarM70145ne.m68206k4(placeholderM7173k4 != null ? placeholderM7173k4.getIndex() : qahVarM69480ck.m69481du().m70145ne().m68209x1());
        }
        if (bArrM3196v4.length >= 21) {
            byte b3 = bArrM3196v4[10];
            if ((b3 & 255) == 100 || (b3 & 255) == 3) {
                shape.m2554k4(b2, nt8VarM70145ne.m68208to(), b, nt8VarM70145ne.m68209x1(), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r0 != 7) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7177k4(uz3 uz3Var) {
        C10639so c10639soM51721x6;
        int iM5900k4;
        byte[] bArrM73695f9 = uz3Var.m3738du().m70215k4().m73695f9();
        kiv kivVarM72008uz = uz3Var.m72008uz();
        if (kivVarM72008uz == null || uz3Var.m3738du().m70234wl()) {
            return;
        }
        m7183x1(uz3Var);
        m7181kk(uz3Var);
        if (!uz3Var.m3744m9() || bArrM73695f9.length < 21) {
            return;
        }
        byte b = bArrM73695f9[10];
        if ((b & 255) != 100 && (b & 255) != 3) {
            return;
        }
        m7182x1(kivVarM72008uz);
        if (kivVarM72008uz.m63909to() != 0) {
            return;
        }
        Shape shapeMo64936jd = uz3Var.mo64936jd();
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shapeMo64936jd, AutoShape.class);
        Placeholder placeholder = (Placeholder) shapeMo64936jd.getPlaceholder();
        kivVarM72008uz.m63903k4(0);
        if (!uz3Var.m3738du().m70232uz()) {
            if (C7019kk.m27469x1(shapeMo64936jd.getSlide(), ISlide.class)) {
                kivVarM72008uz.m63912x1(f6b.m5901k4(shapeMo64936jd.getPlaceholder().getType(), shapeMo64936jd.getPlaceholder().getOrientation()));
                m7174k4(C10666ul.m51805k4(kivVarM72008uz.m63899du(), kivVarM72008uz.m63908m9()), uz3Var);
                return;
            }
            if (C7019kk.m27469x1(shapeMo64936jd.getSlide(), INotesSlide.class) || C7019kk.m27469x1(shapeMo64936jd.getSlide(), IMasterNotesSlide.class)) {
                int iM5915kk = f6b.m5915kk(shapeMo64936jd.getPlaceholder().getType());
                if (iM5915kk == 0) {
                    uz3Var.m3742k4(false);
                    return;
                }
                kivVarM72008uz.m63912x1(iM5915kk);
                if (autoShape == null || autoShape.getTextFrame() == null || C14113y2.m67411k4(autoShape.getTextFrame().getText())) {
                    return;
                }
                uz3Var.m72001k4(autoShape.getTextFrame(), C10666ul.m51805k4(kivVarM72008uz.m63899du(), kivVarM72008uz.m63908m9()));
                return;
            }
            return;
        }
        int iM70220kk = uz3Var.m3738du().m70220kk();
        AbstractC10571o4 c10552n0 = null;
        if (iM70220kk == 0 || iM70220kk == 2 || iM70220kk == 3) {
            c10639soM51721x6 = uz3Var.m3738du().m70215k4().m71951m9().m51721x6();
            iM5900k4 = f6b.m5900k4(placeholder.getType());
        } else {
            if (iM70220kk != 5) {
                if (iM70220kk == 6) {
                    kivVarM72008uz.m63912x1(f6b.m5915kk(placeholder.getType()));
                }
                c10639soM51721x6 = null;
                if (m7179k4(placeholder)) {
                    if (autoShape != null) {
                        uz3Var.m72001k4(autoShape.getTextFrame(), C10666ul.m51805k4(kivVarM72008uz.m63899du(), kivVarM72008uz.m63908m9()));
                        return;
                    }
                    return;
                }
                TextFrame textFrame = new TextFrame(autoShape);
                if (autoShape != null && autoShape.getTextFrame() != null) {
                    textFrame.m2910k4(autoShape.getTextFrame());
                }
                uz3Var.m72001k4(textFrame, C10666ul.m51805k4(kivVarM72008uz.m63899du(), kivVarM72008uz.m63908m9()));
                if (textFrame.getParagraphs().getCount() <= 0 || textFrame.getParagraphs().get_Item(0).getPortions().getCount() <= 0 || textFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getField() == null) {
                    return;
                }
                IPortion iPortion = textFrame.getParagraphs().get_Item(0).getPortions().get_Item(0);
                C10395d2 c10395d2M51346x1 = uz3Var.m72006u4().m68604to().m51346x1();
                byte type = placeholder.getType();
                if (type == 4) {
                    c10552n0 = new C10552n0(c10395d2M51346x1);
                    if (c10639soM51721x6 != null) {
                        c10639soM51721x6.m51693x1().m51648k4((short) (f6b.m5899k4(iPortion.getField().getType().getInternalString(), ai5.m3601k4(iPortion.getPortionFormat().getLanguageId()).Clone()) & 255));
                    }
                } else if (type == 5) {
                    c10552n0 = new C10482iq(c10395d2M51346x1);
                } else if (type == 6) {
                    c10552n0 = new C10408dt(c10395d2M51346x1);
                } else if (type != 7) {
                    C6005k4.m24259k4("");
                } else {
                    c10552n0 = new C10745z7(c10395d2M51346x1);
                }
                if (c10552n0 != null) {
                    if (C14113y2.m67411k4(iPortion.getText())) {
                        iPortion.setText(C18358t1.g.f56183c);
                    }
                    c10395d2M51346x1.m50594k4().m52061k4(c10552n0);
                    return;
                }
                return;
            }
            c10639soM51721x6 = uz3Var.m3738du().m70215k4().m71951m9().m51711ne();
            iM5900k4 = f6b.m5994x1(placeholder.getType());
        }
        kivVarM72008uz.m63912x1(iM5900k4);
        if (m7179k4(placeholder)) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m7178k4(AutoShape autoShape) {
        AutoShape autoShape2;
        if (autoShape != null) {
            Shape[] shapeArrM2547c6 = autoShape.m2547c6();
            if (shapeArrM2547c6.length > 0 && (autoShape2 = (AutoShape) C7019kk.m27452k4((Object) shapeArrM2547c6[0], AutoShape.class)) != null && (autoShape2.m285kk() || C14113y2.m67411k4(autoShape.getTextFrame().getText()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m7179k4(IPlaceholder iPlaceholder) {
        if (iPlaceholder == null) {
            return false;
        }
        byte type = iPlaceholder.getType();
        return type == 4 || type == 5 || type == 6 || type == 7;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m7180k4(rpo rpoVar) {
        Slide slide = (Slide) C7019kk.m27452k4((Object) rpoVar.m70235x1(), Slide.class);
        boolean z = false;
        if (slide == null) {
            return false;
        }
        if (rpoVar.m70223lr().m67302x1()) {
            return rpoVar.m70223lr().m67297k4().booleanValue();
        }
        if (rpoVar.m70215k4().m73694e0() || rpoVar.m70215k4().m73732xk()) {
            rpoVar.m70217k4(new C14093tq<>(Boolean.TRUE));
            return true;
        }
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) slide.m391k4((byte) 6), AutoShape.class);
        AutoShape autoShape2 = (AutoShape) C7019kk.m27452k4((Object) slide.m391k4((byte) 4), AutoShape.class);
        if (m7178k4(autoShape) && (m7178k4(autoShape2) || (autoShape2 != null && autoShape2.m285kk()))) {
            z = true;
        }
        rpoVar.m70217k4(new C14093tq<>(Boolean.valueOf(z)));
        return z;
    }
}
