package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3104x5;
import com.aspose.slides.internal.p081de.C3153k4;
import com.aspose.slides.internal.p081de.C3155to;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.C3185jd;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p099e3.C3550du;
import com.aspose.slides.internal.p099e3.C3553kk;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3792m9;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p115eq.C3795x1;
import com.aspose.slides.internal.p115eq.InterfaceC3793to;
import com.aspose.slides.internal.p136fr.C4116x1;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p248lf.InterfaceC6031k4;
import com.aspose.slides.internal.p298nh.AbstractC6890h4;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p298nh.C6898yj;
import com.aspose.slides.internal.p300nj.AbstractC6913k4;
import com.aspose.slides.internal.p300nj.C6912h4;
import com.aspose.slides.internal.p300nj.C6914kk;
import com.aspose.slides.internal.p300nj.C6915to;
import com.aspose.slides.internal.p300nj.C6916x1;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p321on.C7126to;
import com.aspose.slides.internal.p324oq.InterfaceC7137k4;
import com.aspose.slides.internal.p400sk.AbstractC10231to;
import com.aspose.slides.internal.p400sk.C10229k4;
import com.aspose.slides.internal.p404sp.C10307du;
import com.aspose.slides.internal.p404sp.C10310jd;
import com.aspose.slides.internal.p404sp.C10314to;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.UnsignedBytes;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class no7 {

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f47572yj = new C7017h4("text", "tspan", "rawText", "image", DrawToolFactory.LASSO_TYPE_RECT, "circle", "ellipse", "line", "polyline", "polygon", "path", "square", "round", "bevel");

    /* JADX INFO: renamed from: c5 */
    private C3792m9 f47573c5;

    /* JADX INFO: renamed from: ck */
    private C12015qq f47574ck;

    /* JADX INFO: renamed from: du */
    private C3783ck f47575du;

    /* JADX INFO: renamed from: dy */
    private zv9 f47576dy;

    /* JADX INFO: renamed from: fa */
    private Dictionary<String, IGenericDictionary<String, String>> f47577fa;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC3793to f47578h4;

    /* JADX INFO: renamed from: jd */
    private C12007ix f47579jd;

    /* JADX INFO: renamed from: k4 */
    private IGroupShape f47580k4;

    /* JADX INFO: renamed from: kk */
    private C3791ks f47581kk;

    /* JADX INFO: renamed from: m9 */
    private C3787h4 f47582m9;

    /* JADX INFO: renamed from: to */
    private C3786fa f47583to;

    /* JADX INFO: renamed from: up */
    private boolean f47584up;

    /* JADX INFO: renamed from: x1 */
    private C11913yj f47585x1;

    public no7() {
        this(new C3795x1());
    }

    /* JADX INFO: renamed from: du */
    private void m68120du(C3181c5 c3181c5) {
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        String[] strArrM67417k4 = c3181c5.f9461x1.containsKey("viewBox") ? C14113y2.m67417k4(c3181c5.f9461x1.get_Item("viewBox"), new String[]{" ", ","}, 1) : null;
        C3550du c3550du = (C3550du) c3181c5;
        if (c3550du.m14437ts() != null) {
            C12015qq[] c12015qqArr = {c12015qq};
            C3794up.m15158k4(c3181c5, this.f47583to, c12015qqArr, c3550du.m14437ts());
            c12015qqArr[0].CloneTo(c12015qq);
            c12015qq.CloneTo(this.f47574ck);
        } else {
            c3550du.mo13679k4(this.f47583to, new C12015qq()).m56570m9().CloneTo(this.f47574ck);
        }
        if (this.f47579jd.m56568kk()) {
            this.f47579jd = new C12007ix(0.0f, 0.0f, this.f47574ck.m56699x1(), this.f47574ck.m56697kk());
        }
        this.f47585x1 = new C11913yj(this.f47579jd.m56550c5() / this.f47574ck.m56699x1(), 0.0f, 0.0f, this.f47579jd.m56575x1() / this.f47574ck.m56697kk(), 0.0f, 0.0f);
        if (c3181c5.f9461x1.containsKey("viewBox") && strArrM67417k4.length == 4) {
            C3786fa c3786fa = this.f47583to;
            c3786fa.m15130k4(c3786fa.m15128k4(strArrM67417k4[2], "viewBox", c3181c5));
            C3786fa c3786fa2 = this.f47583to;
            c3786fa2.m15133x1(c3786fa2.m15128k4(strArrM67417k4[3], "viewBox", c3181c5));
            C11913yj c11913yj = new C11913yj();
            C10310jd c10310jdM14437ts = c3550du.m14437ts();
            C12015qq c12015qq2 = new C12015qq((float) C14116yg.m67501x1(c12015qq.m56699x1()), (float) C14116yg.m67501x1(c12015qq.m56697kk()));
            C12007ix c12007ixClone = c3550du.mo13679k4(this.f47583to, c12015qq.Clone()).Clone();
            if (c10310jdM14437ts != null) {
                c12015qq2 = c10310jdM14437ts.m50276k4(this.f47583to).m56570m9();
            }
            C12015qq c12015qqClone = c12015qq2.Clone();
            C12007ix c12007ixClone2 = C3794up.m15154k4(c3550du.m14432e0(), new C12007ix(C12025x6.f40591k4.Clone(), c12015qqClone.Clone()), c12007ixClone.Clone()).Clone();
            if (c10310jdM14437ts != null) {
                c11913yj.m55786x1(-c10310jdM14437ts.m50276k4(this.f47583to).m56557jd(), -c10310jdM14437ts.m50276k4(this.f47583to).m56551ck(), 1);
            }
            c11913yj.m55764k4(c12007ixClone2.m56550c5() / c12015qqClone.m56699x1(), c12007ixClone2.m56575x1() / c12015qqClone.m56697kk(), 1);
            c11913yj.m55786x1(c12007ixClone2.m56557jd(), c12007ixClone2.m56551ck(), 1);
            this.f47585x1.m55769k4(c11913yj, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r3 = r3.getValue();
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte m68121k4(C3181c5 c3181c5, byte[] bArr, byte[] bArr2) {
        C3181c5 value;
        bArr[0] = -1;
        bArr2[0] = -1;
        if (c3181c5.m13628ar().m13697k4() == 0) {
            return (byte) -1;
        }
        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c3181c5.m13628ar().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    value = null;
                    break;
                }
                KeyValuePair<Integer, C3181c5> next = it.next();
                if (!"rawText".equals(next.getValue().f9456h4)) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (value == null) {
            return (byte) -1;
        }
        byte b = ("ellipse".equals(value.f9456h4) || "circle".equals(value.f9456h4)) ? (byte) 4 : (byte) 1;
        C11913yj[] c11913yjArr = {null};
        C11896dy c11896dyM68126k4 = m68126k4(value, c11913yjArr);
        C11913yj c11913yj = c11913yjArr[0];
        if (c11896dyM68126k4 != null) {
            int iM55525du = c11896dyM68126k4.m55525du();
            if (iM55525du == 4) {
                if ((c11896dyM68126k4.m55571to()[iM55525du - 1] & 255) != 129) {
                    b = 5;
                }
            } else if (iM55525du == 5) {
                b = C12025x6.m56883k4(c11896dyM68126k4.m55565kk()[2], C12025x6.f40591k4) ? (byte) 2 : (byte) 3;
            }
            C12007ix c12007ixClone = c11896dyM68126k4.m55532k4(c11913yj).Clone();
            if (!c12007ixClone.m56568kk()) {
                float fM56550c5 = 10.0f / c12007ixClone.m56550c5();
                float fM56575x1 = 10.0f / c12007ixClone.m56575x1();
                if (fM56550c5 < 2.99f) {
                    bArr[0] = 0;
                } else if (fM56550c5 < 3.99f) {
                    bArr[0] = 1;
                } else {
                    bArr[0] = 2;
                }
                if (fM56575x1 < 2.99f) {
                    bArr2[0] = 0;
                    return b;
                }
                if (fM56575x1 < 3.99f) {
                    bArr2[0] = 1;
                    return b;
                }
                bArr2[0] = 2;
                return b;
            }
            bArr[0] = 1;
            bArr2[0] = 1;
        }
        return b;
    }

    /* JADX INFO: renamed from: x1 */
    private float m68137x1(C3181c5 c3181c5, float f) {
        String[] strArr = {null};
        boolean z = false;
        if (m68134k4(c3181c5.f9461x1, "vector-effect", strArr) && "non-scaling-stroke".equals(strArr[0])) {
            z = true;
        }
        if (z) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: kk */
    public final C3787h4 m68145kk() {
        return this.f47582m9;
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC3793to m68146to() {
        return this.f47578h4;
    }

    public no7(InterfaceC3793to interfaceC3793to) {
        this.f47579jd = new C12007ix();
        this.f47574ck = new C12015qq();
        this.f47577fa = new Dictionary<>();
        this.f47578h4 = interfaceC3793to;
        this.f47573c5 = new C3792m9();
        this.f47575du = new C3783ck();
        this.f47582m9 = new C3787h4();
        this.f47583to = new C3786fa();
        this.f47581kk = new C3791ks(this.f47583to);
        this.f47585x1 = new C11913yj();
    }

    /* JADX INFO: renamed from: k4 */
    private double m68122k4(C3181c5 c3181c5, float f) {
        String[] strArr = {null};
        boolean zM68134k4 = m68134k4(c3181c5.f9461x1, "stroke-width", strArr);
        String str = strArr[0];
        if (zM68134k4) {
            return this.f47583to.m15128k4(str, "", c3181c5) * m68137x1(c3181c5, f);
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: kk */
    private void m68135kk(C3181c5 c3181c5) {
        C3553kk c3553kk = (C3553kk) C7019kk.m27452k4((Object) c3181c5, C3553kk.class);
        if (c3553kk == null || c3553kk.m14445c6()) {
            return;
        }
        C11913yj c11913yjM55760h4 = this.f47585x1.m55760h4();
        if (c3181c5.m13642v4() != null) {
            c11913yjM55760h4.m55787x1(this.f47581kk.m15149k4(c3181c5.m13642v4(), this.f47574ck.Clone()));
        }
        try {
            byte[] bArrM14450k4 = c3553kk.m14450k4(this.f47578h4);
            if (bArrM14450k4 == null) {
                return;
            }
            PPImage pPImage = new PPImage(this.f47580k4.getPresentation(), bArrM14450k4);
            C12007ix c12007ixClone = c3553kk.mo13679k4(this.f47583to, this.f47574ck.Clone()).Clone();
            String[] strArr = {null};
            boolean zM13688k4 = c3553kk.f9461x1.m13688k4("bounding-box-width", strArr);
            String str = strArr[0];
            if (zM13688k4) {
                float fM15125k4 = this.f47583to.m15125k4(C10307du.m50262k4(str, C10307du.m50263kk(0.0f)), "", c3553kk, this.f47574ck.Clone());
                if (fM15125k4 < c12007ixClone.m56550c5()) {
                    c12007ixClone.m56576x1(fM15125k4);
                }
            }
            strArr[0] = str;
            boolean zM13688k42 = c3553kk.f9461x1.m13688k4("bounding-box-height", strArr);
            String str2 = strArr[0];
            if (zM13688k42) {
                float fM15125k42 = this.f47583to.m15125k4(C10307du.m50262k4(str2, C10307du.m50263kk(0.0f)), "", c3553kk, this.f47574ck.Clone());
                if (fM15125k42 < c12007ixClone.m56575x1()) {
                    c12007ixClone.m56560k4(fM15125k42);
                }
            }
            this.f47580k4.getShapes().addPictureFrame(5, (c12007ixClone.m56557jd() * c11913yjM55760h4.m55776k4()[0]) + this.f47579jd.m56557jd() + c11913yjM55760h4.m55783to(), (c12007ixClone.m56551ck() * c11913yjM55760h4.m55776k4()[3]) + this.f47579jd.m56551ck() + c11913yjM55760h4.m55757du(), c12007ixClone.m56550c5() * c11913yjM55760h4.m55776k4()[0], c12007ixClone.m56575x1() * c11913yjM55760h4.m55776k4()[3], pPImage);
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: to */
    private void m68136to(C3181c5 c3181c5) {
        if (c3181c5 == null) {
            return;
        }
        C11913yj[] c11913yjArr = {null};
        C11896dy c11896dyM68126k4 = m68126k4(c3181c5, c11913yjArr);
        C11913yj c11913yj = c11913yjArr[0];
        if (c11896dyM68126k4 == null || c11896dyM68126k4.m55525du() == 0) {
            return;
        }
        C12007ix c12007ixClone = c11896dyM68126k4.m55532k4(c11913yj).Clone();
        List list = new List();
        List<Long> listM68123k4 = m68123k4(c11896dyM68126k4.m55565kk(), c12007ixClone.Clone(), c11913yj);
        int i = 0;
        while (i < c11896dyM68126k4.m55571to().length) {
            int i2 = c11896dyM68126k4.m55571to()[i] & 7;
            if (i2 == 0) {
                list.addItem((byte) 1);
            }
            if (i2 == 1) {
                list.addItem((byte) 2);
            }
            if (i2 == 3) {
                list.addItem((byte) 5);
                i += 2;
            }
            if ((c11896dyM68126k4.m55571to()[i] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                list.addItem((byte) 0);
            }
            i++;
        }
        IShape iShapeM68124k4 = m68124k4(c12007ixClone.Clone(), c3181c5, c11913yj.m55776k4()[0]);
        C0735a7 c0735a7M1591yj = ((GeometryShape) iShapeM68124k4).m1591yj();
        c0735a7M1591yj.m3317k4(0);
        f7k f7kVar = new f7k(list, listM68123k4);
        f7kVar.m6047x1(C7019kk.m27438h4(Float.valueOf(iShapeM68124k4.getHeight() * 12700.0f), 13));
        f7kVar.m6037k4(C7019kk.m27438h4(Float.valueOf(iShapeM68124k4.getWidth() * 12700.0f), 13));
        c0735a7M1591yj.m3320k4(new f7k[]{f7kVar});
    }

    /* JADX INFO: renamed from: du */
    public final boolean m68139du() {
        return this.f47584up;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3786fa m68147x1() {
        return this.f47583to;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68138x1(C3181c5 c3181c5) {
        String str = c3181c5.f9461x1.get_Item("visibility");
        if (C14113y2.m67432to("hidden", str, (short) 3) || C14113y2.m67432to("collapse", str, (short) 3) || C14113y2.m67432to("none", c3181c5.f9461x1.get_Item("display"), (short) 3)) {
            return;
        }
        switch (f47572yj.m27428k4(c3181c5.f9456h4)) {
            case 0:
                zv9 zv9Var = new zv9(this);
                this.f47576dy = zv9Var;
                zv9Var.m24353k4((AbstractC10231to) c3181c5, this.f47574ck.Clone());
                break;
            case 1:
                this.f47576dy.m24353k4((AbstractC10231to) c3181c5, this.f47574ck.Clone());
                break;
            case 2:
                if ("text".equals(c3181c5.f9457k4.f9456h4) || "tspan".equals(c3181c5.f9457k4.f9456h4)) {
                    this.f47576dy.m24351k4((C10229k4) c3181c5, this.f47574ck.Clone());
                }
                break;
            case 3:
                m68135kk(c3181c5);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                m68136to(c3181c5);
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AutoShape m68140k4(zv9 zv9Var, C3181c5 c3181c5, String str, C6029du c6029du, InterfaceC6031k4 interfaceC6031k4) {
        C11913yj[] c11913yjArr = {null};
        m68126k4(c3181c5, c11913yjArr);
        C11913yj c11913yj = c11913yjArr[0];
        float f = -((float) ((C14116yg.m67498to(c11913yj.m55776k4()[2], c11913yj.m55776k4()[0]) * 180.0d) / 3.141592653589793d));
        C12025x6[] c12025x6Arr = {new C12025x6(zv9Var.m74844k4(), zv9Var.m74845x1() - ((C3104x5) interfaceC6031k4).m24359k4().m23111c5())};
        c11913yj.m55775k4(c12025x6Arr);
        IAutoShape iAutoShapeAddAutoShape = this.f47580k4.getShapes().addAutoShape(5, c12025x6Arr[0].m56897x1() + this.f47579jd.m56557jd(), c12025x6Arr[0].m56895kk() + this.f47579jd.m56551ck(), 1.0f, 1.0f);
        iAutoShapeAddAutoShape.setX(iAutoShapeAddAutoShape.getX() - ((float) iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().getEffective().getMarginLeft()));
        iAutoShapeAddAutoShape.setY(iAutoShapeAddAutoShape.getY() - ((float) iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().getEffective().getMarginTop()));
        AutoShape autoShape = (AutoShape) iAutoShapeAddAutoShape;
        autoShape.m1589u4();
        iAutoShapeAddAutoShape.setRotation(f);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setAnchoringType((byte) 0);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setAutofitType((byte) 2);
        iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setWrapText((byte) 0);
        iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(0);
        iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().clear();
        m68142k4(iAutoShapeAddAutoShape, zv9Var, c3181c5, str, c6029du, interfaceC6031k4);
        return autoShape;
    }

    /* JADX INFO: renamed from: k4 */
    private List<Long> m68123k4(C12025x6[] c12025x6Arr, C12007ix c12007ix, C11913yj c11913yj) {
        List<Long> list = new List<>();
        c11913yj.m55775k4(c12025x6Arr);
        for (int i = 0; i < c12025x6Arr.length; i++) {
            C12025x6 c12025x6 = c12025x6Arr[i];
            c12025x6.m56891k4(c12025x6.m56897x1() - c12007ix.m56557jd());
            C12025x6 c12025x62 = c12025x6Arr[i];
            c12025x62.m56898x1(c12025x62.m56895kk() - c12007ix.m56551ck());
            list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(c12025x6Arr[i].m56897x1() * 12700.0f), 13)));
            list.addItem(Long.valueOf(C7019kk.m27438h4(Float.valueOf(c12025x6Arr[i].m56895kk() * 12700.0f), 13)));
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private IAutoShape m68124k4(C12007ix c12007ix, C3181c5 c3181c5, float f) {
        IAutoShape iAutoShapeAddAutoShape = this.f47580k4.getShapes().addAutoShape(5, c12007ix.m56557jd() + this.f47579jd.m56557jd(), c12007ix.m56551ck() + this.f47579jd.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
        ((AutoShape) iAutoShapeAddAutoShape).m1589u4();
        iAutoShapeAddAutoShape.getLineFormat().setWidth(m68122k4(c3181c5, f));
        m68131k4(iAutoShapeAddAutoShape.getLineFormat(), c3181c5, f);
        m68130k4(iAutoShapeAddAutoShape.getLineFormat().getFillFormat(), c3181c5);
        m68128k4(iAutoShapeAddAutoShape.getFillFormat(), iAutoShapeAddAutoShape, c3181c5);
        C3182du c3182du = (C3182du) c3181c5;
        iAutoShapeAddAutoShape.getFillFormat().getSolidFillColor().getColorTransform().add(5, c3182du.m13663ks());
        iAutoShapeAddAutoShape.getLineFormat().getFillFormat().getSolidFillColor().getColorTransform().add(5, c3182du.m13645c5());
        return iAutoShapeAddAutoShape;
    }

    /* JADX INFO: renamed from: k4 */
    private C3185jd m68125k4(String str) {
        C3185jd c3185jdM16477k4 = C4116x1.m16477k4(str);
        C3181c5 c3181c5 = c3185jdM16477k4.f9466h4;
        C3794up.m15157k4(c3181c5, this.f47575du, this.f47578h4);
        C3794up.m15156k4(c3181c5, this.f47575du);
        C3794up.m15159k4(c3181c5, this.f47573c5, false);
        C3794up.m15160k4(c3181c5, this.f47578h4, this.f47582m9);
        if (this.f47582m9.m15134k4() != null) {
            IGenericEnumerator<InterfaceC5797ne> it = this.f47582m9.m15134k4().mo23390x1().iterator();
            while (it.hasNext()) {
                try {
                    this.f47573c5.m15152k4(it.next().mo23406x1());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        C3794up.m15162k4(c3181c5, false, this.f47577fa);
        return c3185jdM16477k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3783ck m68141k4() {
        return this.f47575du;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C11896dy m68126k4(C3181c5 c3181c5, C11913yj[] c11913yjArr) {
        C11913yj c11913yjM55760h4 = this.f47585x1.m55760h4();
        if (c3181c5.m13642v4() != null) {
            c11913yjM55760h4.m55787x1(this.f47581kk.m15149k4(c3181c5.m13642v4(), this.f47574ck.Clone()));
        }
        c11913yjArr[0] = c11913yjM55760h4.m55760h4();
        if (C7019kk.m27469x1(c3181c5, InterfaceC7137k4.class)) {
            return C3153k4.m13468k4(((InterfaceC7137k4) c3181c5).mo17081x1(this.f47583to, this.f47574ck.Clone()));
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck m68127k4(C6915to c6915to, C12007ix c12007ix) {
        c6915to.m27099k4(this.f47575du);
        int i = c6915to.m27091b3() == 1 ? 1 : 0;
        C3786fa c3786fa = this.f47583to;
        int i2 = c3786fa.f10318k4;
        c3786fa.f10318k4 = i;
        float fM15125k4 = c3786fa.m15125k4(c6915to.m27107xk(), "width", c6915to, c12007ix.m56570m9().Clone());
        float fM15125k42 = this.f47583to.m15125k4(c6915to.m27093c6(), "height", c6915to, c12007ix.m56570m9().Clone());
        this.f47583to.f10318k4 = i2;
        if (C14116yg.m67480k4(fM15125k4) < 0.001d && C14116yg.m67480k4(fM15125k42) < 0.001d) {
            return null;
        }
        C10310jd c10310jdM27104ts = c6915to.m27104ts();
        boolean z = c10310jdM27104ts != null;
        C12007ix c12007ixClone = (z ? c10310jdM27104ts.m50276k4(this.f47583to) : c12007ix).Clone();
        C11913yj c11913yj = new C11913yj();
        try {
            boolean z2 = c6915to.m27105wy() == 1;
            if (z) {
                c11913yj.m55763k4(fM15125k4 / c12007ixClone.m56550c5(), fM15125k42 / c12007ixClone.m56575x1());
                c11913yj.m55777kk(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck());
            } else if (z2) {
                c11913yj.m55763k4(c12007ix.m56550c5(), c12007ix.m56575x1());
            } else {
                c11913yj.m55763k4(c12007ixClone.m56550c5() / fM15125k4, c12007ixClone.m56575x1() / fM15125k42);
                fM15125k4 *= 1.3333334f;
                fM15125k42 *= 1.3333334f;
            }
            C6895to c6895to = new C6895to(new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fM15125k4)), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fM15125k42)), 14)));
            AbstractC6890h4 abstractC6890h4M26992k4 = AbstractC6890h4.m26992k4(c6895to);
            try {
                abstractC6890h4M26992k4.mo9698k4(c11913yj);
                abstractC6890h4M26992k4.mo9702kk(2);
                abstractC6890h4M26992k4.mo9705x1(2);
                if (z) {
                    abstractC6890h4M26992k4.mo9706x1(new C12018u4(c12007ixClone.Clone()));
                }
                C7126to.m27667k4(new C3155to(abstractC6890h4M26992k4, null, this.f47575du, this.f47583to, this.f47582m9, this.f47581kk, this.f47578h4), c6915to, c12007ix.m56570m9().Clone());
                abstractC6890h4M26992k4.dispose();
                C6898yj c6898yj = new C6898yj(c6895to);
                C6895to c6895to2 = new C6895to(new C12009k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12007ix.m56550c5())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12007ix.m56575x1())), 14)));
                abstractC6890h4M26992k4 = AbstractC6890h4.m26992k4(c6895to2);
                try {
                    abstractC6890h4M26992k4.mo9696k4(c6898yj, new C12007ix(new C12025x6(), c12007ix.m56570m9().Clone()));
                    abstractC6890h4M26992k4.dispose();
                    AbstractC12002ck abstractC12002ckM27022k4 = c6895to2.m27022k4();
                    c11913yj.dispose();
                    return abstractC12002ckM27022k4;
                } finally {
                    if (abstractC6890h4M26992k4 != null) {
                        abstractC6890h4M26992k4.dispose();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (Throwable th2) {
            c11913yj.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68142k4(IAutoShape iAutoShape, zv9 zv9Var, C3181c5 c3181c5, String str, C6029du c6029du, InterfaceC6031k4 interfaceC6031k4) {
        int i;
        Portion portion;
        C11913yj[] c11913yjArr = {null};
        m68126k4(c3181c5, c11913yjArr);
        C11913yj c11913yj = c11913yjArr[0];
        Portion portion2 = new Portion();
        IPortionFormat portionFormat = portion2.getPortionFormat();
        portionFormat.setLatinFont(new FontData(c6029du.f17101x1));
        double dM67498to = C14116yg.m67498to(c11913yj.m55776k4()[2], c11913yj.m55776k4()[0]);
        float f = -((float) ((180.0d * dM67498to) / 3.141592653589793d));
        float f2 = c6029du.f17083du;
        float fM67477k4 = c11913yj.m55776k4()[0];
        if (c3181c5.m13642v4() != null) {
            new C11913yj().m55762k4(f);
            i = 0;
            portion = portion2;
            if (C14116yg.m67477k4(r14.m55776k4()[1], 2) != 0.0d) {
                fM67477k4 = (float) C14116yg.m67477k4(c11913yj.m55776k4()[1] / r14.m55776k4()[1], 2);
            }
        } else {
            i = 0;
            portion = portion2;
        }
        portionFormat.setFontHeight(f2 * fM67477k4);
        m68132k4((PortionFormat) portionFormat, c3181c5, c6029du, c11913yj.m55776k4()[i]);
        Portion portion3 = portion;
        portion3.setText(str);
        float width = iAutoShape.getWidth();
        float height = iAutoShape.getHeight();
        iAutoShape.getTextFrame().getParagraphs().get_Item(i).getPortions().add(portion3);
        if (f != 0.0f) {
            float width2 = (iAutoShape.getWidth() - width) / 2.0f;
            float height2 = (iAutoShape.getHeight() - height) / 2.0f;
            iAutoShape.setX((width2 * ((float) C14116yg.m67470dy(dM67498to))) + iAutoShape.getX());
            iAutoShape.setY(iAutoShape.getY() - (height2 * ((float) C14116yg.m67495m9(dM67498to))));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68128k4(IFillFormat iFillFormat, IShape iShape, C3181c5 c3181c5) {
        C3181c5 c3181c5M15116k4;
        AbstractC12002ck abstractC12002ckM68127k4;
        String[] strArr = {null};
        boolean zM68134k4 = m68134k4(c3181c5.f9461x1, "fill", strArr);
        String str = strArr[0];
        if (!zM68134k4) {
            if (iShape != null) {
                iShape.getFillFormat().setFillType((byte) 1);
                ((ColorFormat) iShape.getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
                return;
            }
            return;
        }
        if (!"none".equals(str)) {
            if (C14113y2.m67359c5(str, "url")) {
                C3783ck c3783ck = this.f47575du;
                while (true) {
                    c3181c5M15116k4 = c3783ck.m15116k4(str);
                    if (!c3181c5M15116k4.f9461x1.containsKey("xlink:href")) {
                        break;
                    }
                    c3783ck = this.f47575du;
                    str = c3181c5M15116k4.f9461x1.get_Item("xlink:href");
                }
                if (C7019kk.m27469x1(c3181c5M15116k4, AbstractC6913k4.class)) {
                    m68129k4(iFillFormat, (AbstractC6913k4) c3181c5M15116k4, ((C3182du) c3181c5).m13663ks());
                } else if (C7019kk.m27469x1(c3181c5M15116k4, C6915to.class) && iShape != null && (abstractC12002ckM68127k4 = m68127k4((C6915to) c3181c5M15116k4, ((ShapeFrame) iShape.getFrame()).m2660k4().Clone())) != null) {
                    IPPImage iPPImageM1724k4 = ((ImageCollection) iShape.getPresentation().getImages()).m1724k4(abstractC12002ckM68127k4);
                    iFillFormat.setFillType((byte) 4);
                    iFillFormat.getPictureFillFormat().getPicture().setImage(iPPImageM1724k4);
                    iFillFormat.getPictureFillFormat().setPictureFillMode(1);
                }
            } else {
                iFillFormat.setFillType((byte) 1);
                ((ColorFormat) iFillFormat.getSolidFillColor()).m1080k4(C10314to.m50289k4(str).m50292k4().Clone());
            }
        }
        String[] strArr2 = {null};
        boolean zM68134k42 = m68134k4(c3181c5.f9461x1, "fill-opacity", strArr2);
        String str2 = strArr2[0];
        if (zM68134k42) {
            iFillFormat.getSolidFillColor().getColorTransform().add(5, (float) C14044b3.m66428k4(str2, C11697x1.m55250kk()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68129k4(IFillFormat iFillFormat, AbstractC6913k4 abstractC6913k4, float f) {
        C6916x1 c6916x1 = (C6916x1) C7019kk.m27452k4((Object) abstractC6913k4, C6916x1.class);
        if (c6916x1 == null || !m68139du()) {
            iFillFormat.setFillType((byte) 1);
            ((ColorFormat) iFillFormat.getSolidFillColor()).m1080k4(abstractC6913k4.m27073ts().get_Item(0).m27061wy().m50292k4().Clone());
            return;
        }
        iFillFormat.setFillType((byte) 2);
        iFillFormat.getGradientFormat().setGradientShape((byte) 0);
        List.Enumerator<C6912h4> it = c6916x1.m27073ts().iterator();
        while (it.hasNext()) {
            try {
                C6912h4 next = it.next();
                ((GradientStopCollection) iFillFormat.getGradientFormat().getGradientStops()).m1625k4(next.m27056b3(), C12003du.m56400k4(C7019kk.m27462to(Float.valueOf(next.m27055ak() * f * 255.0f), 13), next.m27061wy().m50292k4().Clone()).Clone().Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        iFillFormat.getGradientFormat().setLinearGradientAngle(C6916x1.m27108k4(c6916x1.m27112e0().m50265k4(), c6916x1.m27116qm().m50265k4(), c6916x1.m27110bz().m50265k4(), c6916x1.m27113g8().m50265k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68143k4(IGroupShape iGroupShape, String str, C12007ix c12007ix) {
        if (iGroupShape == null || C14113y2.m67411k4(str)) {
            return;
        }
        this.f47580k4 = iGroupShape;
        c12007ix.CloneTo(this.f47579jd);
        C3181c5 c3181c5M13702x1 = m68125k4(str).f9466h4;
        if (c3181c5M13702x1 == null) {
            return;
        }
        while (!"svg".equals(c3181c5M13702x1.f9456h4) && c3181c5M13702x1.m13628ar().m13697k4() > 0) {
            c3181c5M13702x1 = c3181c5M13702x1.m13628ar().m13702x1(0);
        }
        if ("svg".equals(c3181c5M13702x1.f9456h4)) {
            m68120du(c3181c5M13702x1);
        }
        m68133k4(c3181c5M13702x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68130k4(ILineFillFormat iLineFillFormat, C3181c5 c3181c5) {
        ColorFormat colorFormat;
        C10314to c10314toM27061wy;
        String[] strArr = {null};
        boolean z = m68134k4(c3181c5.f9461x1, "stroke", strArr) && !"none".equals(strArr[0]);
        String str = strArr[0];
        if (z) {
            if (C14113y2.m67359c5(str, "url")) {
                C3181c5 c3181c5M15116k4 = this.f47575du.m15116k4(str);
                while (c3181c5M15116k4.f9461x1.containsKey("xlink:href")) {
                    c3181c5M15116k4 = this.f47575du.m15116k4(c3181c5M15116k4.f9461x1.get_Item("xlink:href"));
                }
                if (!C7019kk.m27469x1(c3181c5M15116k4, AbstractC6913k4.class)) {
                    return;
                }
                iLineFillFormat.setFillType((byte) 1);
                colorFormat = (ColorFormat) iLineFillFormat.getSolidFillColor();
                c10314toM27061wy = ((AbstractC6913k4) c3181c5M15116k4).m27073ts().get_Item(0).m27061wy();
            } else {
                iLineFillFormat.setFillType((byte) 1);
                colorFormat = (ColorFormat) iLineFillFormat.getSolidFillColor();
                c10314toM27061wy = C10314to.m50289k4(str);
            }
            colorFormat.m1080k4(c10314toM27061wy.m50292k4().Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68131k4(ILineFormat iLineFormat, C3181c5 c3181c5, float f) {
        byte b;
        byte b2;
        C6914kk c6914kk;
        C6914kk c6914kk2;
        String[] strArr = {null};
        boolean zM68134k4 = m68134k4(c3181c5.f9461x1, "stroke-linecap", strArr);
        String str = strArr[0];
        if (zM68134k4) {
            int iM27428k4 = f47572yj.m27428k4(str);
            if (iM27428k4 == 11) {
                iLineFormat.setCapStyle((byte) 1);
            } else if (iM27428k4 != 12) {
                iLineFormat.setCapStyle((byte) 2);
            } else {
                iLineFormat.setCapStyle((byte) 0);
            }
        }
        String[] strArr2 = {null};
        boolean zM68134k42 = m68134k4(c3181c5.f9461x1, "stroke-linejoin", strArr2);
        String str2 = strArr2[0];
        if (zM68134k42) {
            int iM27428k42 = f47572yj.m27428k4(str2);
            if (iM27428k42 == 12) {
                iLineFormat.setJoinStyle((byte) 0);
            } else if (iM27428k42 != 13) {
                iLineFormat.setJoinStyle((byte) 2);
            } else {
                iLineFormat.setJoinStyle((byte) 1);
            }
        }
        String[] strArr3 = {null};
        boolean zM68134k43 = m68134k4(c3181c5.f9461x1, "stroke-miterlimit", strArr3);
        String str3 = strArr3[0];
        if (zM68134k43) {
            iLineFormat.setMiterLimit(this.f47583to.m15128k4(str3, "", c3181c5) * m68137x1(c3181c5, f));
            if (iLineFormat.getMiterLimit() >= iLineFormat.getWidth() && iLineFormat.getJoinStyle() == -1) {
                iLineFormat.setJoinStyle((byte) 2);
            }
        }
        if (m68139du()) {
            String[] strArr4 = {null};
            boolean z = m68134k4(c3181c5.f9461x1, "marker-end", strArr4) && C14113y2.m67359c5(strArr4[0], "url");
            String str4 = strArr4[0];
            if (!z || (c6914kk2 = (C6914kk) C7019kk.m27452k4((Object) this.f47575du.m15116k4(str4), C6914kk.class)) == null) {
                b = 0;
                b2 = 0;
            } else {
                byte[] bArr = {0};
                byte[] bArr2 = {0};
                iLineFormat.setEndArrowheadStyle(m68121k4(c6914kk2, bArr, bArr2));
                b = bArr[0];
                b2 = bArr2[0];
                iLineFormat.setEndArrowheadWidth(b);
                iLineFormat.setEndArrowheadLength(b2);
            }
            String[] strArr5 = {null};
            boolean z2 = m68134k4(c3181c5.f9461x1, "marker-start", strArr5) && C14113y2.m67359c5(strArr5[0], "url");
            String str5 = strArr5[0];
            if (!z2 || (c6914kk = (C6914kk) C7019kk.m27452k4((Object) this.f47575du.m15116k4(str5), C6914kk.class)) == null) {
                return;
            }
            byte[] bArr3 = {b};
            byte[] bArr4 = {b2};
            iLineFormat.setBeginArrowheadStyle(m68121k4(c6914kk, bArr3, bArr4));
            byte b3 = bArr3[0];
            byte b4 = bArr4[0];
            iLineFormat.setBeginArrowheadWidth(b3);
            iLineFormat.setBeginArrowheadLength(b4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68132k4(PortionFormat portionFormat, C3181c5 c3181c5, C6029du c6029du, float f) {
        portionFormat.getLineFormat().setWidth(m68122k4(c3181c5, f));
        m68130k4(portionFormat.getLineFormat().getFillFormat(), c3181c5);
        m68128k4(portionFormat.getFillFormat(), (IShape) null, c3181c5);
        int iM24342x1 = c6029du.m24342x1();
        if (iM24342x1 == 1) {
            portionFormat.setFontBold((byte) 1);
        } else if (iM24342x1 == 2) {
            portionFormat.setFontItalic((byte) 1);
        } else if (iM24342x1 == 4) {
            portionFormat.setFontUnderline((byte) 2);
        } else if (iM24342x1 == 8) {
            portionFormat.setStrikethroughType((byte) 1);
        }
        if (c6029du.f17103yj) {
            portionFormat.setFontUnderline((byte) 2);
        }
        if (c6029du.f17095rv) {
            portionFormat.setStrikethroughType((byte) 1);
        }
        portionFormat.setSpacing(c6029du.f17082ck);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68133k4(C3181c5 c3181c5) {
        for (int i = 0; i < c3181c5.m13628ar().m13697k4(); i++) {
            C3181c5 c3181c5M13702x1 = c3181c5.m13628ar().m13702x1(i);
            if (C3794up.m15164k4(c3181c5M13702x1)) {
                m68138x1(c3181c5M13702x1);
                m68133k4(c3181c5M13702x1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68144k4(boolean z) {
        this.f47584up = z;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68134k4(C3187kk c3187kk, String str, String[] strArr) {
        if (c3187kk.m13688k4(str, strArr)) {
            return true;
        }
        strArr[0] = null;
        String[] strArr2 = {null};
        boolean zM13688k4 = c3187kk.m13688k4("style", strArr2);
        String str2 = strArr2[0];
        if (!zM13688k4) {
            String[] strArr3 = {null};
            boolean zM13688k42 = c3187kk.m13688k4("class", strArr3);
            String str3 = strArr3[0];
            if (zM13688k42) {
                strArr2[0] = str2;
                this.f47573c5.m15151k4().tryGetValue(C14113y2.m67408k4(".", str3), strArr2);
                str2 = strArr2[0];
            }
        }
        if (!C14113y2.m67411k4(str2)) {
            try {
                for (C14198nr c14198nr : C0853cg.m4578x1(str2).m70187x1()) {
                    if (C14113y2.m67363du(c14198nr.m68177k4(), str)) {
                        strArr[0] = c14198nr.m68178x1();
                        return true;
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }
}
