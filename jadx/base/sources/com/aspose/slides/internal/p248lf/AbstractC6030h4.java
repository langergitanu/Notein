package com.aspose.slides.internal.p248lf;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3184h4;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p087dm.C3189to;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p099e3.C3556x1;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p148gb.C4251h4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9758b3;
import com.aspose.slides.internal.p353q7.C9760bz;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p400sk.AbstractC10231to;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p400sk.C10230kk;
import com.aspose.slides.internal.p400sk.C10232x1;
import com.aspose.slides.internal.p404sp.C10306c5;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p404sp.C10309h4;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lf.h4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6030h4 {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f17104dy = new C7017h4("serif", "sans-serif", "monospace");

    /* JADX INFO: renamed from: du */
    protected final C3786fa f17105du;

    /* JADX INFO: renamed from: h4 */
    protected final C3787h4 f17106h4;

    /* JADX INFO: renamed from: m9 */
    protected final InterfaceC3793to f17109m9;

    /* JADX INFO: renamed from: to */
    protected final C3783ck f17110to;

    /* JADX INFO: renamed from: k4 */
    protected float f17107k4 = 0.0f;

    /* JADX INFO: renamed from: x1 */
    protected float f17111x1 = 0.0f;

    /* JADX INFO: renamed from: kk */
    protected float f17108kk = 0.0f;

    public AbstractC6030h4(C3783ck c3783ck, C3786fa c3786fa, C3787h4 c3787h4, InterfaceC3793to interfaceC3793to) {
        this.f17105du = c3786fa;
        this.f17110to = c3783ck;
        this.f17109m9 = interfaceC3793to;
        this.f17106h4 = c3787h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {all -> 0x007b, blocks: (B:6:0x002d, B:8:0x0033, B:10:0x0050, B:17:0x007e, B:26:0x009e, B:28:0x00a8, B:33:0x00bd, B:35:0x00c9, B:37:0x00ed, B:22:0x008b, B:23:0x008f, B:24:0x0094, B:25:0x0099), top: B:51:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private InterfaceC6031k4 m24343k4(AbstractC10231to abstractC10231to, C6029du c6029du) {
        C12004dy c12004dyM56524to;
        C9790ts c9790tsMo48031k4;
        String str = c6029du.f17101x1;
        if (str == null) {
            str = "";
        }
        List list = new List(AbstractC14092to.m67204k4((Object[]) C14113y2.m67417k4(str, new String[]{",", "\r", IOUtils.LINE_SEPARATOR_UNIX, "\t"}, 1)));
        int iM24342x1 = c6029du.m24342x1();
        float f = c6029du.f17083du;
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                String strM67423kk = C14113y2.m67423kk(C14113y2.m67440x1((String) it.next()), '\"', '\'');
                if (c6029du.m24341kk().containsKey(strM67423kk)) {
                    return mo24345k4(c6029du, new C5659x1(f, iM24342x1, new C9760bz().m48011k4(new C9758b3(c6029du.m24341kk().get_Item(strM67423kk)), strM67423kk)));
                }
                int iM27428k4 = f17104dy.m27428k4(strM67423kk);
                if (iM27428k4 == 0) {
                    c12004dyM56524to = C12004dy.m56524to();
                } else if (iM27428k4 == 1) {
                    c12004dyM56524to = C12004dy.m56523kk();
                } else if (iM27428k4 != 2) {
                    c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(strM67423kk, iM24342x1);
                    if (c9790tsMo48031k4 == null) {
                        c6029du.f17101x1 = strM67423kk;
                        AbstractC6033m9 abstractC6033m9Mo24345k4 = mo24345k4(c6029du, new C5659x1(f, iM24342x1, c9790tsMo48031k4));
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return abstractC6033m9Mo24345k4;
                    }
                    if (this.f17110to.m15115k4().containsKey(strM67423kk)) {
                        List<C6035x1> listM24362k4 = C6035x1.m24362k4(C6035x1.m24364x1(C6035x1.m24363k4(this.f17110to.m15115k4().get_Item(strM67423kk), c6029du.f17086h4), c6029du.f17088jd), c6029du.f17092m9);
                        if (listM24362k4.size() > 0) {
                            AbstractC6032kk abstractC6032kkMo24344k4 = mo24344k4(c6029du, listM24362k4.get_Item(0));
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return abstractC6032kkMo24344k4;
                        }
                    }
                } else {
                    c12004dyM56524to = C12004dy.m56525x1();
                }
                strM67423kk = c12004dyM56524to.m56527du();
                c9790tsMo48031k4 = C9763ck.m48030to().mo48031k4(strM67423kk, iM24342x1);
                if (c9790tsMo48031k4 == null) {
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
        return mo24345k4(c6029du, C9763ck.m48030to().m48331k4("Times-Roman", f, iM24342x1));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6032kk mo24344k4(C6029du c6029du, C6035x1 c6035x1);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC6033m9 mo24345k4(C6029du c6029du, C5659x1 c5659x1);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo24350k4(C4251h4 c4251h4, C12015qq c12015qq);

    /* JADX INFO: renamed from: k4 */
    public final String m24346k4(C10229k4 c10229k4) {
        String str = c10229k4.f36669dy;
        if ("preserve".equals(c10229k4.m13638qq().f9461x1.get_Item("xml:space"))) {
            return C14113y2.m67393k4(C14113y2.m67393k4(C14113y2.m67401k4(C14113y2.m67393k4(str, '\t', ControlChar.SPACE_CHAR), IOUtils.LINE_SEPARATOR_WINDOWS, " "), ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.SPACE_CHAR), '\n', ControlChar.SPACE_CHAR);
        }
        C3189to c3189toM13628ar = c10229k4.f9457k4.m13628ar();
        boolean z = c3189toM13628ar.m13702x1(0) == c10229k4;
        boolean z2 = c3189toM13628ar.m13702x1(c3189toM13628ar.m13697k4() - 1) == c10229k4;
        C6765kp c6765kp = new C6765kp();
        String strM67401k4 = C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67393k4(C14113y2.m67362du(str, ControlChar.PARAGRAPH_BREAK_CHAR, '\n'), '\t', ControlChar.SPACE_CHAR), "\r", " "), IOUtils.LINE_SEPARATOR_UNIX, " ");
        if (z) {
            strM67401k4 = C14113y2.m67431to(strM67401k4, ControlChar.SPACE_CHAR);
        }
        if (z2) {
            strM67401k4 = C14113y2.m67362du(strM67401k4, ControlChar.SPACE_CHAR);
        }
        char c = 0;
        for (int i = 0; i < strM67401k4.length(); i++) {
            char cCharAt = strM67401k4.charAt(i);
            if ((cCharAt <= 8202 || cCharAt >= 8208) && (cCharAt <= 8233 || cCharAt >= 8239)) {
                if (c != ' ' || cCharAt != ' ') {
                    c6765kp.m26780k4(cCharAt);
                }
                c = cCharAt;
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24347k4(int i, C3181c5 c3181c5, C10309h4 c10309h4, C10309h4 c10309h42, C12015qq c12015qq) {
        if (i < c10309h4.size()) {
            this.f17107k4 = this.f17105du.m15129k4(c10309h4.get_Item(i).toString(), "dx", c3181c5, c12015qq.Clone()) + this.f17107k4;
        }
        if (i < c10309h42.size()) {
            this.f17111x1 = this.f17105du.m15129k4(c10309h42.get_Item(i).toString(), "dy", c3181c5, c12015qq.Clone()) + this.f17111x1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24348k4(C3181c5 c3181c5, InterfaceC6031k4 interfaceC6031k4) {
        float f;
        while (true) {
            c3181c5 = c3181c5.m13638qq();
            if (c3181c5 == null) {
                return;
            }
            AbstractC10231to abstractC10231to = (AbstractC10231to) C7019kk.m27452k4((Object) c3181c5, AbstractC10231to.class);
            if (abstractC10231to != null && abstractC10231to.m50094bz() != null) {
                float fMo24356k4 = interfaceC6031k4.mo24356k4(abstractC10231to.m50094bz());
                int iM50101e0 = abstractC10231to.m50101e0();
                if (iM50101e0 != 1) {
                    if (iM50101e0 == 2) {
                        f = this.f17107k4;
                    }
                    abstractC10231to.m50098ck((String) null);
                    return;
                }
                f = this.f17107k4;
                fMo24356k4 /= 2.0f;
                this.f17107k4 = f - fMo24356k4;
                abstractC10231to.m50098ck((String) null);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo24349k4(C3181c5 c3181c5, String str, C12015qq c12015qq, C6029du c6029du, InterfaceC6031k4 interfaceC6031k4, boolean z) {
        C10309h4 c10309h4;
        float fMo24355k4;
        InterfaceC6031k4 interfaceC6031k42 = interfaceC6031k4;
        AbstractC10231to abstractC10231to = (AbstractC10231to) c3181c5.m13638qq();
        C10309h4 c10309h4M50093b3 = abstractC10231to.m50093b3();
        if (c10309h4M50093b3 == null) {
            c10309h4M50093b3 = new C10309h4();
        }
        C10309h4 c10309h42 = c10309h4M50093b3;
        C10309h4 c10309h4M50109wy = abstractC10231to.m50109wy();
        if (c10309h4M50109wy == null) {
            c10309h4M50109wy = new C10309h4();
        }
        C10309h4 c10309h43 = c10309h4M50109wy;
        C10309h4 c10309h4M50092ak = abstractC10231to.m50092ak();
        if (c10309h4M50092ak == null) {
            c10309h4M50092ak = new C10309h4();
        }
        C10309h4 c10309h4M50099dq = abstractC10231to.m50099dq();
        if (c10309h4M50099dq == null) {
            c10309h4M50099dq = new C10309h4();
        }
        if (z) {
            c10309h4M50092ak = new C10309h4();
            c10309h4M50099dq = new C10309h4();
        }
        C10309h4 c10309h44 = c10309h4M50092ak;
        C10306c5 c10306c5M50112xk = abstractC10231to.m50112xk();
        if (c10306c5M50112xk == null) {
            c10306c5M50112xk = new C10306c5();
        }
        C10306c5 c10306c5 = c10306c5M50112xk;
        float f = 0.0f;
        float fMo24356k4 = (C14064he.m66718x1(c6029du.f17081c5, 0.0f) || str.length() <= 1) ? 0.0f : (interfaceC6031k42.mo24356k4(str) - c6029du.f17081c5) / (str.length() - 1);
        if (!C14064he.m66718x1(c6029du.f17082ck, 0.0f) && str.length() > 1) {
            f = c6029du.f17082ck;
        }
        float f2 = f;
        int i = 0;
        AbstractC6030h4 abstractC6030h4 = this;
        C3181c5 c3181c52 = c3181c5;
        abstractC6030h4.m24347k4(0, c3181c52, c10309h43, c10309h4M50099dq, c12015qq.Clone());
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (i > 0) {
                if (i < c10309h42.size()) {
                    c10309h4 = c10309h43;
                    fMo24355k4 = abstractC6030h4.f17105du.m15129k4(c10309h42.get_Item(i).toString(), "x", c3181c52, c12015qq.Clone());
                } else {
                    c10309h4 = c10309h43;
                    fMo24355k4 = abstractC6030h4.f17107k4 - interfaceC6031k42.mo24355k4(str.charAt(i - 1), cCharAt);
                }
                abstractC6030h4.f17107k4 = fMo24355k4;
                if (i < c10309h44.size()) {
                    abstractC6030h4.f17111x1 = abstractC6030h4.f17105du.m15129k4(c10309h44.get_Item(i).toString(), "y", c3181c52, c12015qq.Clone());
                }
                c10309h43 = c10309h4;
                abstractC6030h4.m24347k4(i, c3181c52, c10309h43, c10309h4M50099dq, c12015qq.Clone());
            }
            AbstractC6030h4 abstractC6030h42 = abstractC6030h4;
            int i2 = i;
            C10309h4 c10309h45 = c10309h43;
            C10309h4 c10309h46 = c10309h4M50099dq;
            float fMo24354k4 = z ? interfaceC6031k42.mo24354k4(cCharAt) : interfaceC6031k4.mo6762k4(c3181c5, cCharAt, abstractC6030h42.f17107k4, abstractC6030h42.f17111x1, abstractC6030h42.f17108kk, c12015qq.Clone());
            i = i2 + 1;
            if (i < c10306c5.size()) {
                abstractC6030h42.f17108kk = c10306c5.get_Item(i).floatValue();
            }
            abstractC6030h42.f17107k4 = (fMo24354k4 - fMo24356k4) + f2 + abstractC6030h42.f17107k4;
            c3181c52 = c3181c5;
            interfaceC6031k42 = interfaceC6031k4;
            abstractC6030h4 = abstractC6030h42;
            c10309h43 = c10309h45;
            c10309h4M50099dq = c10309h46;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m24351k4(C10229k4 c10229k4, C12015qq c12015qq) {
        C3187kk c3187kk;
        String strM50272k4;
        try {
            String strM24346k4 = m24346k4(c10229k4);
            if (C14113y2.m67411k4(strM24346k4)) {
                return;
            }
            List list = new List();
            C3181c5 c3181c5M13638qq = c10229k4.m13638qq();
            list.insertItem(0, c3181c5M13638qq);
            while (c3181c5M13638qq.m13638qq() != null) {
                c3181c5M13638qq = c3181c5M13638qq.m13638qq();
                if (C7019kk.m27469x1(c3181c5M13638qq, C3556x1.class) || C7019kk.m27469x1(c3181c5M13638qq, C10230kk.class) || C7019kk.m27469x1(c3181c5M13638qq, C3550du.class)) {
                    list.insertItem(0, c3181c5M13638qq);
                }
            }
            C6029du c6029du = new C6029du(this.f17105du, this.f17106h4, this.f17109m9, this.f17110to);
            List.Enumerator it = list.iterator();
            while (it.hasNext()) {
                try {
                    try {
                        c6029du.m24338k4((C3181c5) it.next());
                    } catch (RuntimeException e) {
                        if (!C4113k4.f11284k4) {
                            throw e;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            c6029du.f17084dy = strM24346k4;
            float f = this.f17107k4;
            mo24349k4(c10229k4, c6029du.f17084dy, c12015qq.Clone(), c6029du, m24343k4((AbstractC10231to) c10229k4.f9457k4, c6029du), false);
            if (c6029du.f17103yj || c6029du.f17091ks || c6029du.f17095rv) {
                float fM15122kk = C3786fa.m15122kk();
                C4251h4 c4251h4 = (C4251h4) C3184h4.m13677k4(DrawToolFactory.LASSO_TYPE_RECT);
                float f2 = c6029du.f17083du / 14.0f;
                if (c6029du.f17102x6.f9461x1.containsKey("stroke")) {
                    c4251h4.f9461x1.m13684k4("stroke", c6029du.f17102x6.f9461x1.get_Item("stroke"));
                }
                if (c6029du.f17102x6.f9461x1.containsKey("stroke-width")) {
                    c4251h4.f9461x1.m13684k4("stroke-width", c6029du.f17102x6.f9461x1.get_Item("stroke-width"));
                }
                if (c6029du.f17102x6.f9461x1.containsKey("fill")) {
                    c4251h4.f9461x1.m13684k4("fill", c6029du.f17102x6.f9461x1.get_Item("fill"));
                }
                c4251h4.f9461x1.m13684k4("x", C10308dy.m50272k4(f * fM15122kk));
                c4251h4.f9461x1.m13684k4("width", C10308dy.m50272k4((this.f17107k4 - f) * fM15122kk));
                c4251h4.f9461x1.m13684k4("height", C10308dy.m50272k4(f2 * fM15122kk));
                if (c6029du.f17103yj) {
                    float f3 = f2 * 1.2f;
                    c4251h4.f9461x1.m13684k4("y", C10308dy.m50272k4((this.f17111x1 + f3) * fM15122kk));
                    c4251h4.f9461x1.set_Item("height", C10308dy.m50272k4(f3 * fM15122kk));
                } else {
                    if (c6029du.f17091ks) {
                        c3187kk = c4251h4.f9461x1;
                        strM50272k4 = C10308dy.m50272k4((this.f17111x1 - (c6029du.f17083du * 0.8f)) * fM15122kk);
                    } else if (c6029du.f17095rv) {
                        c3187kk = c4251h4.f9461x1;
                        strM50272k4 = C10308dy.m50272k4(((this.f17111x1 - (c6029du.f17083du / 3.0f)) + f2) * fM15122kk);
                    }
                    c3187kk.m13684k4("y", strM50272k4);
                }
                if (c10229k4.f9461x1.containsKey("transform")) {
                    c4251h4.f9461x1.m13684k4("transform", c10229k4.f9461x1.get_Item("transform").toString());
                }
                mo24350k4(c4251h4, c12015qq.Clone());
            }
        } catch (RuntimeException e2) {
            if (!C4113k4.f11284k4) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m24352k4(AbstractC10231to abstractC10231to, float f, int i, C12015qq c12015qq, int i2, String[] strArr, AbstractC10231to[] abstractC10231toArr) {
        C3187kk c3187kk;
        for (int i3 = i2; i3 < abstractC10231to.m13628ar().m13697k4(); i3++) {
            C3181c5 c3181c5M13702x1 = abstractC10231to.m13628ar().m13702x1(i3);
            if (C7019kk.m27469x1(c3181c5M13702x1, C10229k4.class)) {
                String strM24346k4 = m24346k4((C10229k4) c3181c5M13702x1);
                if (!C14113y2.m67411k4(strM24346k4)) {
                    strArr[0] = C14113y2.m67400k4(strArr[0], strM24346k4);
                    if (i == 1 || i == 2) {
                        List list = new List();
                        C3181c5 c3181c5M13638qq = c3181c5M13702x1.m13638qq();
                        while (true) {
                            list.insertItem(0, c3181c5M13638qq);
                            while (c3181c5M13638qq.m13638qq() != null) {
                                c3181c5M13638qq = c3181c5M13638qq.m13638qq();
                                if (C7019kk.m27469x1(c3181c5M13638qq, C3556x1.class) || C7019kk.m27469x1(c3181c5M13638qq, C10230kk.class) || C7019kk.m27469x1(c3181c5M13638qq, C3550du.class)) {
                                    break;
                                }
                            }
                        }
                        C6029du c6029du = new C6029du(this.f17105du, this.f17106h4, this.f17109m9, this.f17110to);
                        List.Enumerator it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                try {
                                    c6029du.m24338k4((C3181c5) it.next());
                                } catch (RuntimeException e) {
                                    if (!C4113k4.f11284k4) {
                                        throw e;
                                    }
                                }
                            } finally {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                            }
                        }
                        c6029du.f17084dy = strM24346k4;
                        mo24349k4(c3181c5M13702x1, c6029du.f17084dy, c12015qq.Clone(), c6029du, m24343k4((AbstractC10231to) c3181c5M13702x1.f9457k4, c6029du), true);
                    }
                }
            } else {
                if (C7019kk.m27469x1(c3181c5M13702x1, C10232x1.class)) {
                    C10232x1 c10232x1 = (C10232x1) C7019kk.m27452k4((Object) c3181c5M13702x1, C10232x1.class);
                    if (c3181c5M13702x1.f9461x1.containsKey("x") && i2 < i3) {
                        return;
                    }
                    if (c3181c5M13702x1.f9461x1.containsKey("text-anchor")) {
                        c3187kk = c3181c5M13702x1.f9461x1;
                    } else {
                        for (C3181c5 c3181c5M13638qq2 = c3181c5M13702x1.m13638qq(); c3181c5M13638qq2 != null; c3181c5M13638qq2 = c3181c5M13638qq2.m13638qq()) {
                            if (c3181c5M13638qq2.f9461x1.containsKey("text-anchor")) {
                                c3187kk = c3181c5M13638qq2.f9461x1;
                            }
                        }
                        m24352k4((AbstractC10231to) abstractC10231to.m13628ar().m13702x1(i3), f, i, c12015qq.Clone(), 0, strArr, abstractC10231toArr);
                    }
                    c10232x1.m50097ck(C6034to.m24361k4(c3187kk.get_Item("text-anchor")));
                    m24352k4((AbstractC10231to) abstractC10231to.m13628ar().m13702x1(i3), f, i, c12015qq.Clone(), 0, strArr, abstractC10231toArr);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24353k4(AbstractC10231to abstractC10231to, C12015qq c12015qq) {
        int iM24361k4;
        AbstractC10231to abstractC10231to2;
        int i;
        float f;
        C3187kk c3187kk = abstractC10231to.f9461x1;
        if (C7019kk.m27469x1(abstractC10231to, C10230kk.class)) {
            this.f17108kk = 0.0f;
            this.f17111x1 = 0.0f;
            this.f17107k4 = 0.0f;
        }
        if (c3187kk.containsKey("x")) {
            this.f17107k4 = this.f17105du.m15129k4(abstractC10231to.m50093b3().get_Item(0).toString(), "x", abstractC10231to, c12015qq.Clone());
        }
        if (c3187kk.containsKey("y")) {
            this.f17111x1 = this.f17105du.m15129k4(abstractC10231to.m50092ak().get_Item(0).toString(), "y", abstractC10231to, c12015qq.Clone());
        }
        if (c3187kk.containsKey("rotate")) {
            this.f17108kk = abstractC10231to.m50112xk().get_Item(0).floatValue();
        }
        if (C7019kk.m27469x1(abstractC10231to, C10230kk.class) || (C7019kk.m27469x1(abstractC10231to, C10232x1.class) && c3187kk.containsKey("x"))) {
            if (abstractC10231to.f9461x1.containsKey("text-anchor")) {
                iM24361k4 = C6034to.m24361k4(abstractC10231to.f9461x1.get_Item("text-anchor"));
                abstractC10231to.m50097ck(iM24361k4);
            } else {
                iM24361k4 = 0;
            }
            String str = C14113y2.f47374k4;
            int i2 = iM24361k4;
            float f2 = this.f17107k4;
            if (C7019kk.m27469x1(abstractC10231to, C10232x1.class) && C7019kk.m27469x1(abstractC10231to.m13638qq(), C10230kk.class)) {
                abstractC10231to2 = (AbstractC10231to) abstractC10231to.m13638qq();
                i = 0;
                while (i < abstractC10231to2.m13628ar().m13697k4()) {
                    if (abstractC10231to2.m13628ar().m13702x1(i) == abstractC10231to) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                abstractC10231to2 = abstractC10231to;
            }
            i = 0;
            String[] strArr = {str};
            AbstractC10231to[] abstractC10231toArr = {abstractC10231to};
            m24352k4(abstractC10231to2, f2, i2, c12015qq.Clone(), i, strArr, abstractC10231toArr);
            String str2 = strArr[0];
            AbstractC10231to abstractC10231to3 = abstractC10231toArr[0];
            if (i2 != 1) {
                if (i2 == 2) {
                    f = this.f17107k4 - f2;
                }
                this.f17107k4 = f2;
                abstractC10231to3.m50098ck(str2);
            }
            f = (this.f17107k4 - f2) / 2.0f;
            f2 -= f;
            this.f17107k4 = f2;
            abstractC10231to3.m50098ck(str2);
        }
    }
}
