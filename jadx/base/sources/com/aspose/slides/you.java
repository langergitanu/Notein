package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p159h0.C4441dy;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4471ts;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4476v4;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.AbstractC14071k4;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class you extends AbstractC14780xb {

    /* JADX INFO: renamed from: du */
    private AbstractC14071k4<C4471ts> f50380du;

    /* JADX INFO: renamed from: kk */
    private boolean f50381kk;

    /* JADX INFO: renamed from: to */
    private C4471ts f50382to;

    public you(float f) {
        this(f, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0224  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<tfm> m73953k4(GeometryShape geometryShape, ShapeFrame shapeFrame, ShapeElement[] shapeElementArr, IFillParamSource iFillParamSource, int i, AbstractC14897zn abstractC14897zn, kg7 kg7Var, a1f a1fVar, C4473um c4473um, boolean z, C4489zj[] c4489zjArr, C4459os[] c4459osArr) {
        float f;
        ShapeFrame shapeFrame2;
        char c;
        int i2;
        float f2;
        List<tfm> list;
        ShapeFrame shapeFrame3;
        int i3;
        C0962es[] c0962esArr;
        azo azoVar;
        C11913yj c11913yj;
        boolean z2;
        C11896dy c11896dy;
        C12009k4 c12009k4M73281k4;
        C12009k4 c12009k4M73281k42;
        C12009k4 c12009k4M73281k43;
        you youVar = this;
        ShapeElement[] shapeElementArr2 = shapeElementArr;
        c4489zjArr[0] = new C4489zj(0.0f, 0.0f, 0.0f);
        c4459osArr[0] = new C4459os(0.0f, 0.0f);
        float fM3152k4 = a1fVar != null ? a1fVar.m3152k4() : 0.0f;
        float fM3163x1 = a1fVar != null ? a1fVar.m3163x1() : 0.0f;
        C14093tq<C12003du> c14093tqClone = (a1fVar != null ? a1fVar.m3158kk() : new C14093tq<>()).Clone();
        C0962es[] c0962esArr2 = new C0962es[6];
        C4459os c4459os = new C4459os(0.0f, 0.0f);
        C11913yj c11913yj2 = new C11913yj(shapeFrame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrame.getFlipV() != 1 ? 1.0f : -1.0f, shapeFrame.getFlipH() == 1 ? shapeFrame.getCenterX() * 2.0f : 0.0f, shapeFrame.getFlipV() == 1 ? shapeFrame.getCenterY() * 2.0f : 0.0f);
        if (youVar.m73299x1()) {
            ShapeFrame shapeFrameM5635k4 = geometryShape.m2546bz().m5635k4(true);
            f = 0.0f;
            c11913yj2.m55766k4(geometryShape.getRotation() - geometryShape.getParentGroup().getRotation(), new C12025x6(shapeFrameM5635k4.getCenterX(), shapeFrameM5635k4.getCenterY()));
            shapeFrame2 = shapeFrameM5635k4;
        } else {
            f = 0.0f;
            shapeFrame2 = shapeFrame;
        }
        C14093tq<C12003du> c14093tqClone2 = (a1fVar != null ? a1fVar.m3148du() : new C14093tq<>()).Clone();
        float fM3162to = a1fVar != null ? a1fVar.m3162to() : f;
        boolean z3 = c14093tqClone2.m67302x1() && !c14093tqClone2.m67297k4().m56504dy() && fM3162to > f;
        List<tfm> list2 = new List<>();
        int length = shapeElementArr2.length;
        float fM67481k4 = 1.0f;
        int i4 = 0;
        while (i4 < length) {
            C14093tq<C12003du> c14093tq = c14093tqClone2;
            ShapeElement shapeElement = shapeElementArr2[i4];
            float f3 = fM3163x1;
            if (shapeElement.f3355x1.m55525du() == 0) {
                c0962esArr = c0962esArr2;
                i2 = i4;
                f2 = fM3162to;
                list = list2;
                shapeFrame3 = shapeFrame2;
                i3 = length;
            } else {
                tfm tfmVar = new tfm();
                C0962es[] c0962esArr3 = c0962esArr2;
                tfmVar.m71141kk(i);
                i2 = i4;
                f2 = fM3162to;
                azo azoVarM4332k4 = geometryShape.m1586ks().m4332k4(shapeFrame2, abstractC14897zn.m74623ks(), shapeElement.f3355x1, kg7Var);
                if (shapeElement.getFillSource() != 0) {
                    C11913yj c11913yj3 = c11913yj2;
                    i3 = length;
                    list = list2;
                    C0962es c0962esMo4333k4 = geometryShape.m1586ks().mo4333k4(abstractC14897zn, shapeFrame2, shapeElement.f3355x1, c0962esArr3, shapeElement.getFillSource(), iFillParamSource, kg7Var);
                    shapeFrame3 = shapeFrame2;
                    c0962esArr = c0962esArr3;
                    if (c0962esMo4333k4 == null || c0962esMo4333k4.m5681to() == 0 || c0962esMo4333k4.m5681to() == -1) {
                        c11913yj = c11913yj3;
                        azoVar = azoVarM4332k4;
                    } else {
                        if (c0962esMo4333k4.m5681to() == 0 || shapeElement.getStrokeSource() == 0 || azoVarM4332k4 == null || !azoVarM4332k4.m3903h4() || azoVarM4332k4.m3906k4() <= 1.0d) {
                            if (c0962esMo4333k4.m5681to() != 1) {
                                c11913yj = c11913yj3;
                                azoVar = azoVarM4332k4;
                                c12009k4M73281k43 = AbstractC14780xb.m73283k4(abstractC14897zn, shapeElement.m2656k4(), c0962esMo4333k4, (azo) null, c11913yj, (azo) null, youVar.f50033k4);
                            } else {
                                c11913yj = c11913yj3;
                                azoVar = azoVarM4332k4;
                                c12009k4M73281k43 = AbstractC14780xb.m73281k4(c0962esMo4333k4.m5676k4().Clone());
                            }
                            tfmVar.m71139k4(c12009k4M73281k43);
                            if (z3) {
                                tfmVar.m71147x1(tfmVar.m71132du());
                                azo azoVar2 = new azo(c14093tq.m67297k4().Clone(), 0.3f * f2);
                                tfmVar.m71139k4(AbstractC14780xb.m73283k4(abstractC14897zn, shapeElement.m2656k4(), c0962esMo4333k4, azoVar2, (C11913yj) null, azoVar2, youVar.f50033k4));
                            }
                        } else {
                            tfmVar.m71139k4(AbstractC14780xb.m73283k4(abstractC14897zn, shapeElement.m2656k4(), c0962esMo4333k4, azoVarM4332k4, (C11913yj) null, (azo) null, youVar.f50033k4));
                            c11913yj = c11913yj3;
                            azoVar = azoVarM4332k4;
                        }
                        z2 = true;
                        if (!z3) {
                            tfmVar.m71147x1(C14093tq.m67296x1(c14093tqClone, null) ? AbstractC14780xb.m73281k4(c14093tqClone.m67297k4().Clone()) : tfmVar.m71132du());
                        }
                        if (shapeElement.getStrokeSource() != 0 || azoVar == null || !azoVar.m3903h4() || azoVar.m3901dy() == null || azoVar.m3901dy().m5681to() == 0 || azoVar.m3901dy().m5681to() == -1) {
                            c11913yj2 = c11913yj;
                            if (tfmVar.m71132du() == null || tfmVar.m71134h4() != null) {
                                c11896dy = (C11896dy) shapeElement.f3355x1.deepClone();
                                if (z2 && azoVar != null && azoVar.m3903h4()) {
                                    youVar.m73957k4(c11896dy, azoVar);
                                }
                                c11896dy.m55577x1(c11913yj2);
                                tfmVar.m71137k4(new List<>());
                                tfmVar.m71144to().addItem(c11896dy);
                                tfmVar.m71136k4((!z2 ? 2 : 0) | 4);
                                tfmVar.m71146x1(0);
                                if (!z2 || azoVar == null || (azoVar.m3906k4() <= 0.0d && azoVar.m3897c5() <= 0 && azoVar.m3905jd() <= 0)) {
                                    fM67481k4 = fM67481k4;
                                } else {
                                    C12026yj c12026yjM3930x6 = azoVar.m3930x6();
                                    if (fM3152k4 != f) {
                                        c12026yjM3930x6.m56927kk(0);
                                    }
                                    boolean zM73960k4 = m73960k4(c11896dy);
                                    C12556ck.m58562k4(c11896dy, c12026yjM3930x6);
                                    C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
                                    fM67481k4 = C14116yg.m67481k4(fM67481k4, C14116yg.m67504x1(c12007ixClone.m56550c5(), c12007ixClone.m56575x1()));
                                    tfmVar.m71140k4(true);
                                    tfmVar.m71136k4(2 | tfmVar.m71135k4());
                                    tfmVar.m71146x1(1);
                                    C4459os c4459os2 = new C4459os(shapeFrame.getWidth(), shapeFrame.getHeight());
                                    C4459os.m18282x1(AbstractC14780xb.m73280k4(azoVar.m3922u4(), azoVar.m3905jd(), c4459os2.Clone()).Clone(), AbstractC14780xb.m73280k4(azoVar.m3904ix(), azoVar.m3897c5(), c4459os2.Clone()).Clone()).CloneTo(c4459os);
                                    if (!zM73960k4) {
                                        tfmVar.m71137k4(m73961x1(c11896dy));
                                    }
                                }
                                list.addItem(tfmVar);
                            }
                        } else if (C14093tq.m67296x1(c14093tqClone, null)) {
                            if (tfmVar.m71132du() == null) {
                                if (azoVar.m3901dy().m5681to() != 1) {
                                    C12026yj c12026yjM3930x62 = azoVar.m3930x6();
                                    c12026yjM3930x62.m56927kk(0);
                                    C11896dy c11896dy2 = (C11896dy) shapeElement.m2656k4().deepClone();
                                    C12556ck.m58562k4(c11896dy2, c12026yjM3930x62);
                                    c12009k4M73281k42 = AbstractC14780xb.m73283k4(abstractC14897zn, c11896dy2, azoVar.m3901dy(), (azo) null, c11913yj, (azo) null, youVar.f50033k4);
                                } else {
                                    c12009k4M73281k42 = AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone());
                                }
                                tfmVar.m71139k4(c12009k4M73281k42);
                            }
                            c11913yj2 = c11913yj;
                            if (tfmVar.m71132du() == null) {
                                c11896dy = (C11896dy) shapeElement.f3355x1.deepClone();
                                if (z2) {
                                    youVar.m73957k4(c11896dy, azoVar);
                                }
                                c11896dy.m55577x1(c11913yj2);
                                tfmVar.m71137k4(new List<>());
                                tfmVar.m71144to().addItem(c11896dy);
                                tfmVar.m71136k4((!z2 ? 2 : 0) | 4);
                                tfmVar.m71146x1(0);
                                if (z2) {
                                    fM67481k4 = fM67481k4;
                                    list.addItem(tfmVar);
                                }
                            }
                        } else {
                            if (azoVar.m3901dy().m5681to() != 1) {
                                C12026yj c12026yjM3930x63 = azoVar.m3930x6();
                                c12026yjM3930x63.m56927kk(0);
                                C11896dy c11896dy3 = (C11896dy) shapeElement.m2656k4().deepClone();
                                C12556ck.m58562k4(c11896dy3, c12026yjM3930x63);
                                c12009k4M73281k4 = AbstractC14780xb.m73283k4(abstractC14897zn, c11896dy3, azoVar.m3901dy(), (azo) null, c11913yj, (azo) null, youVar.f50033k4);
                                c11913yj2 = c11913yj;
                            } else {
                                c11913yj2 = c11913yj;
                                c12009k4M73281k4 = AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone());
                            }
                            tfmVar.m71147x1(c12009k4M73281k4);
                            if (tfmVar.m71132du() == null) {
                                tfmVar.m71139k4(tfmVar.m71134h4());
                            }
                            if (tfmVar.m71132du() == null) {
                            }
                        }
                    }
                } else {
                    list = list2;
                    shapeFrame3 = shapeFrame2;
                    i3 = length;
                    c0962esArr = c0962esArr3;
                    azoVar = azoVarM4332k4;
                    c11913yj = c11913yj2;
                }
                z2 = false;
                if (!z3) {
                }
                if (shapeElement.getStrokeSource() != 0) {
                    c11913yj2 = c11913yj;
                    if (tfmVar.m71132du() == null) {
                    }
                }
            }
            i4 = i2 + 1;
            youVar = this;
            list2 = list;
            length = i3;
            c0962esArr2 = c0962esArr;
            c14093tqClone2 = c14093tq;
            fM3163x1 = f3;
            fM3162to = f2;
            shapeFrame2 = shapeFrame3;
            shapeElementArr2 = shapeElementArr;
        }
        float f4 = fM3163x1;
        List<tfm> list3 = list2;
        float f5 = fM67481k4;
        if (list3.size() == 0) {
            return list3;
        }
        c4489zjArr[0] = new C4489zj(shapeFrame.m2660k4().m56550c5() / 2.0f, shapeFrame.m2660k4().m56575x1() / 2.0f, fM3152k4);
        c4459osArr[0] = new C4459os(shapeFrame.getCenterX(), shapeFrame.getCenterY());
        if (list3.size() == 1) {
            if (shapeFrame.getFlipH() == 1) {
                c4459os.m18286k4(-c4459os.m18285k4());
            }
            if (shapeFrame.getFlipV() == 1) {
                c4459os.m18291x1(-c4459os.m18290x1());
            }
            c = 0;
            C4459os.m18279k4(c4459osArr[0], c4459os).CloneTo(c4459osArr[0]);
        } else {
            c = 0;
        }
        m73955k4(list3, a1fVar, f4, fM3152k4, c4459osArr[c].Clone(), z);
        if (C7019kk.m27469x1(geometryShape, SmartArtShape.class)) {
            SmartArtShape smartArtShape = (SmartArtShape) geometryShape;
            if (smartArtShape.m2821up().m4099m9().m72922rv().m3347dy() == smartArtShape.m2821up().m5146rv() || m73959k4(smartArtShape.m2821up().m4099m9().m72922rv().m3357x1())) {
                tfm tfmVarM73954k4 = m73954k4(geometryShape, shapeFrame, abstractC14897zn, kg7Var, shapeElementArr, f5, a1fVar, f4, c4459osArr[0].Clone(), c4459os.Clone());
                if (tfmVarM73954k4 != null) {
                    list3.addItem(tfmVarM73954k4);
                }
            }
        }
        m73956k4(list3, c4473um.Clone(), c4489zjArr);
        return list3;
    }

    /* JADX INFO: renamed from: x1 */
    public static List<C11896dy> m73961x1(C11896dy c11896dy) {
        byte[] bArrM55571to = c11896dy.m55571to();
        int i = 0;
        int i2 = 0;
        for (byte b : bArrM55571to) {
            if ((b & 7) == 0 && i > 0) {
                i2++;
                i = 0;
            }
            i++;
        }
        if (i > 0) {
            i2++;
        }
        List<C11896dy> list = new List<>(i2);
        if (i2 < 2) {
            list.addItem(c11896dy);
            return list;
        }
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        List list2 = new List();
        List list3 = new List();
        for (int i3 = 0; i3 < c11896dy.m55525du(); i3++) {
            if ((bArrM55571to[i3] & 7) == 0 && list2.size() > 0) {
                list.addItem(new C11896dy((C12025x6[]) list2.toArray(new C12025x6[0]), C3085sv.m13110x1((List<Byte>) list3), c11896dy.m55531k4()));
                list2.clear();
                list3.clear();
            }
            list2.addItem(c12025x6ArrM55565kk[i3].Clone());
            list3.addItem(Byte.valueOf(bArrM55571to[i3]));
        }
        if (list2.size() > 0) {
            list.addItem(new C11896dy((C12025x6[]) list2.toArray(new C12025x6[0]), C3085sv.m13110x1((List<Byte>) list3), c11896dy.m55531k4()));
        }
        return list;
    }

    /* JADX INFO: renamed from: kk */
    public final void m73965kk() {
        AbstractC14071k4<C4471ts> abstractC14071k4;
        C4471ts c4471ts;
        if (!m73966to() || (abstractC14071k4 = this.f50380du) == null || (c4471ts = this.f50382to) == null) {
            return;
        }
        abstractC14071k4.invoke(c4471ts);
        this.f50382to = null;
        this.f50380du = null;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m73966to() {
        return this.f50381kk;
    }

    public you(float f, boolean z) {
        super(f, 100.0f);
        m73967x1(z);
    }

    @Override // com.aspose.slides.AbstractC14780xb
    /* JADX INFO: renamed from: k4 */
    public C4471ts mo73286k4(AbstractC14897zn abstractC14897zn, C4459os c4459os, int i) {
        if (!m73966to()) {
            return super.mo73286k4(abstractC14897zn, c4459os.Clone(), i);
        }
        if (this.f50382to == null) {
            C12023wl c12023wlClone = m73291k4(c4459os.Clone(), abstractC14897zn).Clone();
            C4471ts c4471ts = new C4471ts(c12023wlClone.m56865x1(), c12023wlClone.m56862kk(), i == 2 || i == 3 || i == 4 || i == 5);
            this.f50382to = c4471ts;
            c4471ts.m18352k4(0L);
            this.f50382to.m18353k4(m73285k4());
        }
        return this.f50382to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73967x1(boolean z) {
        this.f50381kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m73962x1(int i) {
        if (i == 73 || i == 74 || i == 82 || i == 83 || i == 115 || i == 116 || i == 127 || i == 128) {
            return true;
        }
        switch (i) {
            case 68:
            case 69:
            case 70:
            case 71:
                return true;
            default:
                switch (i) {
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                        return true;
                    default:
                        switch (i) {
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m73963k4(GeometryShape geometryShape, ShapeFrame shapeFrame) {
        C14562th c14562thM71271k4;
        a1f a1fVarM4291k4;
        float f;
        List<tfm> list;
        byte b;
        ShapeFrame shapeFrameM5635k4;
        C12007ix c12007ix = new C12007ix(geometryShape.getX(), geometryShape.getY(), geometryShape.getWidth(), geometryShape.getHeight());
        C14562th c14562thM71269k4 = C14570tp.m71269k4(geometryShape);
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) geometryShape, AutoShape.class);
        if (autoShape == null || !autoShape.isTextBox()) {
            c14562thM71271k4 = null;
            a1fVarM4291k4 = null;
        } else {
            TextFrame textFrameM288x1 = autoShape.m288x1();
            if (textFrameM288x1 == null || C14113y2.m67411k4(autoShape.getTextFrame().getText())) {
                c14562thM71271k4 = null;
                a1fVarM4291k4 = null;
            } else {
                c14562thM71271k4 = C14570tp.m71271k4(textFrameM288x1);
                a1fVarM4291k4 = bp9.m4291k4(textFrameM288x1);
            }
            if (a1fVarM4291k4 != null && c14562thM71271k4 != null) {
                C12007ix c12007ix2 = new C12007ix();
                C12007ix[] c12007ixArr = {c12007ix2};
                jq6.m63490k4(textFrameM288x1.f3523to, new ShapeFrame[]{null}, c12007ixArr, (kg7) null);
                c12007ixArr[0].CloneTo(c12007ix2);
                InterfaceC13762l4 interfaceC13762l4 = textFrameM288x1.f3523to;
                oju ojuVarClone = interfaceC13762l4.mo64300x1().Clone();
                pj5 pj5VarClone = textFrameM288x1.m2903du().Clone();
                C4459os c4459os = new C4459os(geometryShape.getX() + pj5VarClone.f48081x1 + ojuVarClone.f47836k4, geometryShape.getY() + pj5VarClone.f48079kk + ojuVarClone.f47837x1);
                C4459os c4459os2 = new C4459os(interfaceC13762l4.mo64296kk().f47836k4, jq6.m63493kk(interfaceC13762l4));
                c12007ix = new C12007ix(c4459os.m18285k4(), c4459os.m18290x1(), c4459os2.m18285k4(), c4459os2.m18290x1());
            }
        }
        if (c14562thM71269k4 != null || c14562thM71271k4 != null) {
            if (c14562thM71269k4 == null) {
                c14562thM71269k4 = c14562thM71271k4;
            }
            boolean[] zArr = {false};
            a1f a1fVarM4289k4 = bp9.m4289k4(geometryShape, zArr);
            boolean z = zArr[0];
            if (a1fVarM4289k4 != null) {
                a1fVarM4291k4 = a1fVarM4289k4;
            }
            float[] fArrM71273k4 = C14570tp.m71273k4(c14562thM71269k4.m71169kk(), c14562thM71269k4.m71168k4(), c14562thM71269k4.m71170x1(), z);
            if (fArrM71273k4 != null) {
                float fM3152k4 = a1fVarM4291k4 != null ? a1fVarM4291k4.m3152k4() : 0.0f;
                float fM3163x1 = a1fVarM4291k4 != null ? a1fVarM4291k4.m3163x1() : 0.0f;
                C14093tq<C12003du> c14093tqClone = (a1fVarM4291k4 != null ? a1fVarM4291k4.m3158kk() : new C14093tq<>()).Clone();
                int iM73277k4 = AbstractC14780xb.m73277k4(a1fVarM4291k4, false);
                boolean z2 = C14093tq.m67296x1(c14093tqClone, null) && (iM73277k4 == 2 || iM73277k4 == 3);
                C4473um c4473umClone = ck8.m4611x1(fArrM71273k4).Clone();
                C11913yj c11913yj = new C11913yj(shapeFrame.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrame.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrame.getFlipH() == 1 ? shapeFrame.getCenterX() * 2.0f : 0.0f, shapeFrame.getFlipV() == 1 ? shapeFrame.getCenterY() * 2.0f : 0.0f);
                tfm tfmVar = new tfm();
                tfmVar.m71141kk(iM73277k4);
                C11896dy c11896dy = new C11896dy();
                c11896dy.m55578x1(c12007ix.Clone());
                c11896dy.m55577x1(c11913yj);
                tfmVar.m71137k4(new List<>());
                tfmVar.m71144to().addItem(c11896dy);
                tfmVar.m71136k4(6);
                tfmVar.m71146x1(0);
                C4489zj c4489zj = new C4489zj(c12007ix.m56550c5() / 2.0f, c12007ix.m56575x1() / 2.0f, fM3152k4);
                C4459os c4459os3 = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
                float f2 = fM3163x1;
                List<tfm> list2 = new List<>();
                list2.addItem(tfmVar);
                a1f a1fVar = a1fVarM4291k4;
                m73955k4(list2, a1fVar, f2, fM3152k4, c4459os3.Clone(), z2);
                IEffectFormatEffectiveData effective = geometryShape.m2595yd().getEffective();
                if (effective == null || effective.isNoEffects()) {
                    f = 2.0f;
                    list = list2;
                } else {
                    if (m73299x1()) {
                        b = 1;
                        shapeFrameM5635k4 = geometryShape.m2546bz().m5635k4(true);
                    } else {
                        b = 1;
                        shapeFrameM5635k4 = shapeFrame;
                    }
                    C12007ix c12007ixClone = C14381rb.m70047k4(effective, c11896dy.m55523c5().Clone()).Clone();
                    f = 2.0f;
                    C4459os c4459os4 = new C4459os(0.0f, 0.0f);
                    C4317dy c4317dy = new C4317dy(shapeFrameM5635k4.getFlipH() == b ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrameM5635k4.getFlipV() == b ? -1.0f : 1.0f, shapeFrameM5635k4.getFlipH() == b ? (-c4459os4.m18285k4()) * 2.0f : 0.0f, shapeFrameM5635k4.getFlipV() == b ? c4459os4.m18290x1() * 2.0f : 0.0f);
                    float height = f2 - fM3152k4;
                    if (a1fVar.m3161m9() != null) {
                        height -= (float) a1fVar.m3161m9().getHeight();
                    }
                    tfm tfmVar2 = new tfm();
                    tfmVar.m71141kk(iM73277k4);
                    list = list2;
                    tfmVar2.m71138k4(m73288k4(c4459os3.Clone(), height, c12007ixClone.Clone(), false, this.f50035x1, c4317dy));
                    list.addItem(tfmVar2);
                }
                C4489zj[] c4489zjArr = {c4489zj};
                m73956k4(list, c4473umClone.Clone(), c4489zjArr);
                c4489zjArr[0].CloneTo(c4489zj);
                C4443em c4443em = new C4443em(0, 0);
                C4473um c4473umClone2 = ck8.m4609k4(fArrM71273k4).Clone();
                c4443em.m18174k4(C7019kk.m27462to(Float.valueOf(((C14116yg.m67480k4(c4473umClone2.m18367du()) * c4489zj.m18508kk()) + c4489zj.m18506k4() + 1.0f) * f), 13));
                c4443em.m18178x1(C7019kk.m27462to(Float.valueOf(((C14116yg.m67480k4(c4473umClone2.m18369h4()) * c4489zj.m18508kk()) + c4489zj.m18511x1() + 1.0f) * f), 13));
                return new C12007ix(c4459os3.m18285k4() - (c4443em.m18173k4() / f), c4459os3.m18290x1() - (c4443em.m18177x1() / f), c4443em.m18173k4(), c4443em.m18177x1());
            }
        }
        return c12007ix;
    }

    /* JADX INFO: renamed from: k4 */
    private tfm m73954k4(GeometryShape geometryShape, ShapeFrame shapeFrame, AbstractC14897zn abstractC14897zn, kg7 kg7Var, ShapeElement[] shapeElementArr, float f, a1f a1fVar, float f2, C4459os c4459os, C4459os c4459os2) {
        IEffectFormatEffectiveData effective = geometryShape.m2595yd().getEffective();
        if (effective == null) {
            return null;
        }
        if (effective.getGlowEffect() == null && effective.getOuterShadowEffect() == null && effective.getReflectionEffect() == null) {
            return null;
        }
        C12007ix c12007ix = new C12007ix();
        ShapeFrame shapeFrameM5635k4 = m73299x1() ? geometryShape.m2546bz().m5635k4(true) : shapeFrame;
        C12007ix[] c12007ixArr = {c12007ix};
        C12009k4 c12009k4M73290k4 = m73290k4(abstractC14897zn, kg7Var, geometryShape, shapeElementArr, shapeFrameM5635k4, f, (byte) 2, c12007ixArr);
        c12007ixArr[0].CloneTo(c12007ix);
        tfm tfmVar = new tfm();
        tfmVar.m71139k4(c12009k4M73290k4);
        tfmVar.m71147x1(c12009k4M73290k4);
        C4317dy c4317dy = new C4317dy(shapeFrameM5635k4.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrameM5635k4.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrameM5635k4.getFlipH() == 1 ? (-c4459os2.m18285k4()) * 2.0f : 0.0f, shapeFrameM5635k4.getFlipV() == 1 ? c4459os2.m18290x1() * 2.0f : 0.0f);
        float fM3152k4 = f2 - (a1fVar.m3152k4() + 0.5f);
        if (a1fVar.m3161m9() != null) {
            float height = (float) a1fVar.m3161m9().getHeight();
            if (height < 2.0f) {
                height *= 2.0f;
            }
            fM3152k4 -= height;
        }
        tfmVar.m71138k4(m73288k4(c4459os.Clone(), fM3152k4, c12007ix.Clone(), false, C14116yg.m67504x1(c12007ix.m56550c5(), c12007ix.m56575x1()) / 3.0f, c4317dy));
        tfmVar.m71141kk(1);
        return tfmVar;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73955k4(List<tfm> list, a1f a1fVar, float f, float f2, C4459os c4459os, boolean z) {
        C4441dy c4441dyM74347k4 = C14877z9.m74347k4(a1fVar);
        List.Enumerator<tfm> it = list.iterator();
        while (it.hasNext()) {
            try {
                tfm next = it.next();
                next.m71138k4(new C4476v4(next.m71144to().get_Item(0), f, f2, next.m71135k4(), next.m71145x1(), c4441dyM74347k4, z, next.m71142kk(), new C14093tq(c4459os.Clone())));
                for (int i = 1; i < next.m71144to().size(); i++) {
                    next.m71143m9().m18397k4(next.m71144to().get_Item(i), f, f2, next.m71135k4(), next.m71145x1(), c4441dyM74347k4, z, next.m71142kk(), new C14093tq<>(c4459os.Clone()));
                }
                if (next.m71144to().size() > 1) {
                    next.m71143m9().m18395k4(new C4459os(0.0f, 0.0f), new C4459os(1.0f, 1.0f));
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
    private void m73956k4(List<tfm> list, C4473um c4473um, C4489zj[] c4489zjArr) {
        List.Enumerator<tfm> it = list.iterator();
        while (it.hasNext()) {
            try {
                tfm next = it.next();
                C4489zj c4489zj = new C4489zj();
                C4489zj c4489zj2 = new C4489zj();
                C4489zj[] c4489zjArr2 = {c4489zj};
                C4489zj[] c4489zjArr3 = {c4489zj2};
                next.m71143m9().m18396k4(c4473um.Clone(), c4489zjArr2, c4489zjArr3);
                c4489zjArr2[0].CloneTo(c4489zj);
                c4489zjArr3[0].CloneTo(c4489zj2);
                C4489zj c4489zj3 = c4489zjArr[0];
                c4489zj3.m18507k4(C4479w6.m18405k4(c4489zj3.m18506k4(), C14116yg.m67480k4(c4489zj.m18506k4()), C14116yg.m67480k4(c4489zj2.m18506k4())));
                C4489zj c4489zj4 = c4489zjArr[0];
                c4489zj4.m18512x1(C4479w6.m18405k4(c4489zj4.m18511x1(), C14116yg.m67480k4(c4489zj.m18511x1()), C14116yg.m67480k4(c4489zj2.m18511x1())));
                C4489zj c4489zj5 = c4489zjArr[0];
                c4489zj5.m18509kk(C4479w6.m18405k4(c4489zj5.m18508kk(), C14116yg.m67480k4(c4489zj.m18508kk()), C14116yg.m67480k4(c4489zj2.m18508kk())));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73957k4(C11896dy c11896dy, azo azoVar) {
        if (azoVar == null || !azoVar.m3903h4() || azoVar.m3901dy().m5681to() != 1 || azoVar.m3906k4() <= 2.0d) {
            return;
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        float fOooO00o = C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd());
        float fOooO0O0 = C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck());
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55777kk(fOooO00o, fOooO0O0);
        c11913yj.m55763k4((c12007ixClone.m56550c5() + ((float) azoVar.m3906k4())) / c12007ixClone.m56550c5(), (c12007ixClone.m56575x1() + ((float) azoVar.m3906k4())) / c12007ixClone.m56575x1());
        c11913yj.m55777kk(-fOooO00o, -fOooO0O0);
        c11896dy.m55577x1(c11913yj);
    }

    @Override // com.aspose.slides.AbstractC14780xb
    /* JADX INFO: renamed from: k4 */
    public void mo73295k4(final AbstractC14897zn abstractC14897zn, C4471ts c4471ts, final C4317dy c4317dy, final C4459os c4459os, final C4443em c4443em) {
        if (m73966to()) {
            this.f50380du = new AbstractC14071k4<C4471ts>() { // from class: com.aspose.slides.you.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14071k4
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public void invoke(C4471ts c4471ts2) {
                    AbstractC12002ck abstractC12002ckM73289k4 = you.this.m73289k4(c4471ts2);
                    try {
                        you.this.m73296k4(abstractC14897zn, abstractC12002ckM73289k4, c4317dy, c4459os.Clone(), c4443em.Clone());
                        if (abstractC12002ckM73289k4 != null) {
                            abstractC12002ckM73289k4.dispose();
                        }
                    } finally {
                    }
                }
            };
        } else {
            super.mo73295k4(abstractC14897zn, c4471ts, c4317dy, c4459os.Clone(), c4443em.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73958k4(Shape shape) {
        float[] fArrM71272k4;
        C14562th c14562thM71270k4 = C14570tp.m71270k4(shape.m2545bv());
        if (c14562thM71270k4 == null || (fArrM71272k4 = C14570tp.m71272k4(c14562thM71270k4.m71169kk(), c14562thM71270k4.m71168k4(), c14562thM71270k4.m71170x1())) == null) {
            return false;
        }
        for (int i = 0; i < C14116yg.m67507x1(4, fArrM71272k4.length); i++) {
            if (fArrM71272k4[i] != 0.0f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m73959k4(SmartArt smartArt) {
        int layout = smartArt.getLayout();
        return (layout == 13 || layout == 40 || layout == 91 || layout == 116 || layout == 132) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m73960k4(C11896dy c11896dy) {
        for (byte b : c11896dy.m55571to()) {
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m73964k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, GeometryShape geometryShape, ShapeElement[] shapeElementArr, ShapeFrame shapeFrame, IFillParamSource iFillParamSource) throws PackageManager.NameNotFoundException {
        C14562th c14562thM71269k4;
        List<tfm> list;
        you youVar;
        if (shapeElementArr.length == 0 || (c14562thM71269k4 = C14570tp.m71269k4(geometryShape)) == null) {
            return false;
        }
        boolean[] zArr = {false};
        a1f a1fVarM4289k4 = bp9.m4289k4(geometryShape, zArr);
        float[] fArrM71273k4 = C14570tp.m71273k4(c14562thM71269k4.m71169kk(), c14562thM71269k4.m71168k4(), c14562thM71269k4.m71170x1(), zArr[0]);
        if (fArrM71273k4 == null) {
            return false;
        }
        C14093tq<C12003du> c14093tqClone = (a1fVarM4289k4 != null ? a1fVarM4289k4.m3158kk() : new C14093tq<>()).Clone();
        int iM73277k4 = AbstractC14780xb.m73277k4(a1fVarM4289k4, false);
        boolean z = C14093tq.m67296x1(c14093tqClone, null) && AbstractC14780xb.m73284k4(iM73277k4);
        C4473um c4473umClone = ck8.m4611x1(fArrM71273k4).Clone();
        C4489zj c4489zj = new C4489zj();
        C4459os c4459os = new C4459os();
        C4489zj[] c4489zjArr = {c4489zj};
        C4459os[] c4459osArr = {c4459os};
        List<tfm> listM73953k4 = m73953k4(geometryShape, shapeFrame, shapeElementArr, iFillParamSource, iM73277k4, abstractC14897zn, kg7Var, a1fVarM4289k4, c4473umClone.Clone(), z, c4489zjArr, c4459osArr);
        c4489zjArr[0].CloneTo(c4489zj);
        c4459osArr[0].CloneTo(c4459os);
        if (listM73953k4.size() == 0) {
            return true;
        }
        if (a1fVarM4289k4 == null || a1fVarM4289k4.m3150h4() == 6) {
            list = listM73953k4;
            youVar = this;
            youVar.m73294k4(abstractC14897zn, geometryShape, list, c4473umClone.Clone(), c4459os.Clone(), c4489zj.Clone(), fArrM71273k4);
        } else {
            list = listM73953k4;
            youVar = this;
            youVar.m73293k4(abstractC14897zn, geometryShape, list, c4473umClone.Clone(), c4459os.Clone(), c4489zj.Clone(), iM73277k4, fArrM71273k4, txr.m71436k4(a1fVarM4289k4));
        }
        youVar.m73292k4(list);
        return true;
    }
}
