package com.aspose.slides.internal.p261m0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p087dm.C3187kk;
import com.aspose.slides.internal.p115eq.C3783ck;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3787h4;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p115eq.C3794up;
import com.aspose.slides.internal.p136fr.C4113k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p324oq.C7138x1;
import com.aspose.slides.internal.p379rg.C10006k4;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10965m9;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.to */
/* JADX INFO: loaded from: classes4.dex */
public class C6300to {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f17940up = new C7017h4("x1", "y1", "x2", "y2", "circle", "ellipse", "path", "polygon", DrawToolFactory.LASSO_TYPE_RECT, "polyline");

    /* JADX INFO: renamed from: du */
    private final C6297k4 f17943du;

    /* JADX INFO: renamed from: dy */
    private C6292c5 f17944dy;

    /* JADX INFO: renamed from: k4 */
    private C3786fa f17948k4;

    /* JADX INFO: renamed from: kk */
    private C6301x1 f17949kk;

    /* JADX INFO: renamed from: m9 */
    private C6298kk f17950m9;

    /* JADX INFO: renamed from: to */
    private final C3791ks f17951to;

    /* JADX INFO: renamed from: x1 */
    private C3783ck f17952x1;

    /* JADX INFO: renamed from: h4 */
    private final Dictionary<Integer, Float> f17946h4 = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    private Dictionary<Integer, Float> f17941c5 = new Dictionary<>();

    /* JADX INFO: renamed from: jd */
    private final List<Integer> f17947jd = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) new int[]{9, 10, 11, 12, 13, 14, 15, 16})));

    /* JADX INFO: renamed from: ck */
    private final List<Integer> f17942ck = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) new int[]{0, 1})));

    /* JADX INFO: renamed from: fa */
    private final List<Integer> f17945fa = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) new int[]{10, 18, 6, 4, 1, 14, 12, 16, 8})));

    public C6300to(C6292c5 c6292c5, C3783ck c3783ck, C3786fa c3786fa, C3787h4 c3787h4, C6297k4 c6297k4) {
        this.f17944dy = c6292c5;
        this.f17948k4 = c3786fa;
        this.f17952x1 = c3783ck;
        this.f17949kk = new C6301x1(c3786fa, c6297k4);
        this.f17943du = c6297k4;
        C3791ks c3791ksM25775k4 = c6297k4.m25775k4();
        this.f17951to = c3791ksM25775k4;
        this.f17950m9 = new C6298kk(this, this.f17952x1, this.f17948k4, c3791ksM25775k4, c3787h4, c6297k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6301x1 m25790k4() {
        return this.f17949kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25796kk(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        try {
            C10971um c10971um = new C10971um();
            c10971um.m52930k4(this.f17949kk.m25809x1(c3181c5, c12015qq.Clone()));
            if (c3181c5.f9461x1.containsKey("clip-path") || c3181c5.f9461x1.containsKey("view-clip-id")) {
                c10971um.m53103k4(m25792k4(c12015qq.Clone(), c3181c5));
            }
            if (c3181c5.f9461x1.containsKey("transform")) {
                this.f17943du.m25776k4(c3181c5, c10971um, c12015qq.Clone());
            }
            this.f17950m9.m25783k4(c10971um, c3181c5, c12015qq.Clone(), c10951c5);
            c10951c5.m52930k4((AbstractC10973uz) c10971um);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m25797to(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        try {
            C10971um c10971um = new C10971um();
            float[] fArr = new float[4];
            IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
            while (it.hasNext()) {
                try {
                    int iM27428k4 = f17940up.m27428k4(it.next().getKey());
                    if (iM27428k4 == 0) {
                        fArr[0] = this.f17948k4.m15128k4(c3181c5.f9461x1.get_Item("x1"), "x1", c3181c5);
                    } else if (iM27428k4 == 1) {
                        fArr[1] = this.f17948k4.m15128k4(c3181c5.f9461x1.get_Item("y1"), "y1", c3181c5);
                    } else if (iM27428k4 == 2) {
                        fArr[2] = this.f17948k4.m15128k4(c3181c5.f9461x1.get_Item("x2"), "x2", c3181c5);
                    } else if (iM27428k4 == 3) {
                        fArr[3] = this.f17948k4.m15128k4(c3181c5.f9461x1.get_Item("y2"), "y2", c3181c5);
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
            C10974v4 c10974v4 = new C10974v4(fArr);
            C10950bv c10950bv = new C10950bv();
            c10950bv.m52930k4(c10974v4);
            c10971um.m52930k4(c10950bv);
            if (c3181c5.f9461x1.containsKey("transform")) {
                this.f17943du.m25776k4(c3181c5, c10971um, c12015qq.Clone());
            }
            if (c3181c5.f9461x1.containsKey("clip-path") || c3181c5.f9461x1.containsKey("view-clip-id")) {
                c10971um.m53103k4(m25792k4(c12015qq.Clone(), c3181c5));
            }
            this.f17950m9.m25783k4(c10971um, c3181c5, c12015qq.Clone(), c10951c5);
            c10951c5.m52930k4((AbstractC10973uz) c10971um);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C6292c5 m25798x1() {
        return this.f17944dy;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0965 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0960 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C10971um m25791k4(C3181c5 c3181c5, C12015qq c12015qq) {
        C3181c5 c3181c52;
        C3785dy c3785dy;
        C3785dy c3785dy2;
        int i;
        C3785dy c3785dy3;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        C12025x6 c12025x6;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        C10950bv c10950bv;
        int i8;
        Float f5;
        C3181c5 c3181c53 = c3181c5;
        C10971um c10971um = new C10971um();
        List<C3785dy> listMo17081x1 = ((C7138x1) c3181c53).mo17081x1(this.f17948k4, c12015qq.Clone());
        if (listMo17081x1 != null && listMo17081x1.size() != 0) {
            this.f17941c5.clear();
            C10950bv c10950bv2 = new C10950bv();
            c10971um.m52930k4(c10950bv2);
            C10950bv c10950bv3 = c10950bv2;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            int i9 = 0;
            int i10 = 0;
            while (i9 < listMo17081x1.size()) {
                this.f17946h4.clear();
                try {
                    c3785dy = listMo17081x1.get_Item(i9);
                    if (i9 < listMo17081x1.size() - 1) {
                        try {
                            c3785dy2 = listMo17081x1.get_Item(i9 + 1);
                        } catch (RuntimeException e) {
                            e = e;
                            c3181c52 = c3181c53;
                            if (C4113k4.f11284k4) {
                            }
                        }
                    } else {
                        c3785dy2 = null;
                    }
                    C3785dy c3785dy4 = i9 > 0 ? listMo17081x1.get_Item(i9 - 1) : null;
                    try {
                        i = c3785dy.f10313k4;
                        c3785dy3 = c3785dy4;
                    } catch (RuntimeException e2) {
                        e = e2;
                        c3181c52 = c3181c53;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                    c3181c52 = c3181c53;
                }
                if (i == 0 || i == 1) {
                    c3181c52 = c3181c53;
                    C10950bv c10950bv4 = c10950bv3;
                    if (this.f17941c5.size() > 3) {
                        c10950bv4.m52930k4(this.f17949kk.m25807k4(c3181c52, this.f17941c5, false));
                        c10950bv4.m52895k4(true);
                        this.f17941c5 = new Dictionary<>();
                        c10950bv3 = new C10950bv();
                        c10971um.m52930k4(c10950bv3);
                    } else {
                        c10950bv3 = c10950bv4;
                    }
                    if (c3785dy.f10313k4 == 0) {
                        fFloatValue = 0.0f;
                        fFloatValue2 = 0.0f;
                    }
                    for (int i11 = 0; i11 < c3785dy.f10315x1.size(); i11 += 2) {
                        Dictionary<Integer, Float> dictionary = this.f17941c5;
                        dictionary.addItem(Integer.valueOf(dictionary.size()), Float.valueOf(c3785dy.f10315x1.get_Item(i11).floatValue() + fFloatValue));
                        Dictionary<Integer, Float> dictionary2 = c3785dy.f10314kk;
                        dictionary2.addItem(Integer.valueOf(dictionary2.size()), this.f17941c5.get_Item(Integer.valueOf(r5.size() - 1)));
                        Dictionary<Integer, Float> dictionary3 = this.f17941c5;
                        dictionary3.addItem(Integer.valueOf(dictionary3.size()), Float.valueOf(c3785dy.f10315x1.get_Item(i11 + 1).floatValue() + fFloatValue2));
                        Dictionary<Integer, Float> dictionary4 = c3785dy.f10314kk;
                        dictionary4.addItem(Integer.valueOf(dictionary4.size()), this.f17941c5.get_Item(Integer.valueOf(r5.size() - 1)));
                    }
                    Dictionary<Integer, Float> dictionary5 = this.f17941c5;
                    i2 = 2;
                    fFloatValue = dictionary5.get_Item(Integer.valueOf(dictionary5.size() - 2)).floatValue();
                    fFloatValue2 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1)).floatValue();
                } else {
                    if (i != 3) {
                        i3 = 2;
                        if (i == 4) {
                            if (c3785dy3 != null && this.f17941c5.size() == 0) {
                                Dictionary<Integer, Float> dictionary6 = this.f17941c5;
                                dictionary6.addItem(Integer.valueOf(dictionary6.size()), Float.valueOf(fFloatValue));
                                Dictionary<Integer, Float> dictionary7 = this.f17941c5;
                                dictionary7.addItem(Integer.valueOf(dictionary7.size()), Float.valueOf(fFloatValue2));
                            }
                            float fFloatValue3 = fFloatValue;
                            float fFloatValue4 = fFloatValue2;
                            for (int i12 = 0; i12 < c3785dy.f10315x1.size(); i12 += 2) {
                                Dictionary<Integer, Float> dictionary8 = this.f17941c5;
                                dictionary8.addItem(Integer.valueOf(dictionary8.size()), Float.valueOf(fFloatValue3 + c3785dy.f10315x1.get_Item(i12).floatValue()));
                                Dictionary<Integer, Float> dictionary9 = c3785dy.f10314kk;
                                dictionary9.addItem(Integer.valueOf(dictionary9.size()), this.f17941c5.get_Item(Integer.valueOf(r11.size() - 1)));
                                Dictionary<Integer, Float> dictionary10 = this.f17941c5;
                                dictionary10.addItem(Integer.valueOf(dictionary10.size()), Float.valueOf(fFloatValue4 + c3785dy.f10315x1.get_Item(i12 + 1).floatValue()));
                                Dictionary<Integer, Float> dictionary11 = c3785dy.f10314kk;
                                dictionary11.addItem(Integer.valueOf(dictionary11.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                                fFloatValue3 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 2)).floatValue();
                                fFloatValue4 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1)).floatValue();
                            }
                            fFloatValue = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 2)).floatValue();
                            f5 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1));
                        } else if (i == 5) {
                            if (c3785dy3 != null && this.f17941c5.size() == 0) {
                                Dictionary<Integer, Float> dictionary12 = this.f17941c5;
                                dictionary12.addItem(Integer.valueOf(dictionary12.size()), Float.valueOf(fFloatValue));
                                Dictionary<Integer, Float> dictionary13 = this.f17941c5;
                                dictionary13.addItem(Integer.valueOf(dictionary13.size()), Float.valueOf(fFloatValue2));
                            }
                            for (int i13 = 0; i13 < c3785dy.f10315x1.size(); i13++) {
                                Dictionary<Integer, Float> dictionary14 = this.f17941c5;
                                dictionary14.addItem(Integer.valueOf(dictionary14.size()), c3785dy.f10315x1.get_Item(i13));
                                Dictionary<Integer, Float> dictionary15 = c3785dy.f10314kk;
                                dictionary15.addItem(Integer.valueOf(dictionary15.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                                Dictionary<Integer, Float> dictionary16 = this.f17941c5;
                                dictionary16.addItem(Integer.valueOf(dictionary16.size()), Float.valueOf(fFloatValue2));
                                Dictionary<Integer, Float> dictionary17 = c3785dy.f10314kk;
                                dictionary17.addItem(Integer.valueOf(dictionary17.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                            }
                            fFloatValue = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 2)).floatValue();
                            f5 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1));
                        } else if (i == 6) {
                            if (c3785dy3 != null) {
                                Dictionary<Integer, Float> dictionary18 = this.f17941c5;
                                dictionary18.addItem(Integer.valueOf(dictionary18.size()), Float.valueOf(fFloatValue));
                                Dictionary<Integer, Float> dictionary19 = this.f17941c5;
                                dictionary19.addItem(Integer.valueOf(dictionary19.size()), Float.valueOf(fFloatValue2));
                                float fFloatValue5 = fFloatValue;
                                float fFloatValue6 = fFloatValue2;
                                for (int i14 = 0; i14 < c3785dy.f10315x1.size(); i14++) {
                                    float fFloatValue7 = fFloatValue5 + c3785dy.f10315x1.get_Item(i14).floatValue();
                                    Dictionary<Integer, Float> dictionary20 = this.f17941c5;
                                    dictionary20.addItem(Integer.valueOf(dictionary20.size()), Float.valueOf(fFloatValue7));
                                    Dictionary<Integer, Float> dictionary21 = c3785dy.f10314kk;
                                    dictionary21.addItem(Integer.valueOf(dictionary21.size()), this.f17941c5.get_Item(Integer.valueOf(r11.size() - 1)));
                                    Dictionary<Integer, Float> dictionary22 = this.f17941c5;
                                    dictionary22.addItem(Integer.valueOf(dictionary22.size()), Float.valueOf(fFloatValue6));
                                    Dictionary<Integer, Float> dictionary23 = c3785dy.f10314kk;
                                    dictionary23.addItem(Integer.valueOf(dictionary23.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                                    fFloatValue5 = this.f17941c5.get_Item(Integer.valueOf(r4.size() - 2)).floatValue();
                                    fFloatValue6 = this.f17941c5.get_Item(Integer.valueOf(r5.size() - 1)).floatValue();
                                }
                                fFloatValue = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 2)).floatValue();
                                f5 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1));
                            }
                            i8 = 2;
                            i2 = i8;
                            c3181c52 = c3181c53;
                        } else if (i == 7) {
                            if (c3785dy3 != null) {
                                Dictionary<Integer, Float> dictionary24 = this.f17941c5;
                                dictionary24.addItem(Integer.valueOf(dictionary24.size()), Float.valueOf(fFloatValue));
                                Dictionary<Integer, Float> dictionary25 = this.f17941c5;
                                dictionary25.addItem(Integer.valueOf(dictionary25.size()), Float.valueOf(fFloatValue2));
                                for (int i15 = 0; i15 < c3785dy.f10315x1.size(); i15++) {
                                    Dictionary<Integer, Float> dictionary26 = this.f17941c5;
                                    dictionary26.addItem(Integer.valueOf(dictionary26.size()), Float.valueOf(fFloatValue));
                                    Dictionary<Integer, Float> dictionary27 = c3785dy.f10314kk;
                                    dictionary27.addItem(Integer.valueOf(dictionary27.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                                    Dictionary<Integer, Float> dictionary28 = this.f17941c5;
                                    dictionary28.addItem(Integer.valueOf(dictionary28.size()), c3785dy.f10315x1.get_Item(i15));
                                    Dictionary<Integer, Float> dictionary29 = c3785dy.f10314kk;
                                    dictionary29.addItem(Integer.valueOf(dictionary29.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                                }
                                fFloatValue = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 2)).floatValue();
                                f5 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1));
                            }
                            i8 = 2;
                            i2 = i8;
                            c3181c52 = c3181c53;
                        } else {
                            if (i != 8) {
                                int i16 = 18;
                                if (i == 17 || i == 18) {
                                    char c = 3;
                                    if (this.f17941c5.size() > 3) {
                                        c10950bv3.m52930k4(this.f17949kk.m25807k4(c3181c53, this.f17941c5, false));
                                    }
                                    float fFloatValue8 = fFloatValue;
                                    float fFloatValue9 = fFloatValue2;
                                    int i17 = 0;
                                    while (i17 < c3785dy.f10315x1.size()) {
                                        try {
                                            if (c3785dy.f10313k4 == i16) {
                                                f3 = fFloatValue8;
                                                f4 = fFloatValue9;
                                            } else {
                                                f3 = 0.0f;
                                                f4 = 0.0f;
                                            }
                                            c12025x6 = new C12025x6(fFloatValue8, fFloatValue9);
                                        } catch (RuntimeException e4) {
                                            e = e4;
                                            c3181c52 = c3181c53;
                                        }
                                        try {
                                            i4 = i17 + 5;
                                            i5 = i17 + 6;
                                            C12025x6 c12025x62 = new C12025x6(c3785dy.f10315x1.get_Item(i4).floatValue() + f3, c3785dy.f10315x1.get_Item(i5).floatValue() + f4);
                                            fFloatValue = fFloatValue8;
                                            try {
                                                C12015qq c12015qq2 = new C12015qq(c3785dy.f10315x1.get_Item(i17).floatValue(), c3785dy.f10315x1.get_Item(i17 + 1).floatValue());
                                                float fFloatValue10 = c3785dy.f10315x1.get_Item(i17 + 2).floatValue();
                                                if (c3785dy.f10315x1.get_Item(i17 + 3).floatValue() != 0.0f) {
                                                    i6 = i17;
                                                    z = true;
                                                } else {
                                                    i6 = i17;
                                                    z = false;
                                                }
                                                f = fFloatValue;
                                                C10950bv c10950bv5 = c10950bv3;
                                                c3181c52 = c3181c5;
                                                i7 = i6;
                                                f2 = fFloatValue9;
                                                try {
                                                    C6301x1.m25803k4(c12025x6, c12025x62, c12015qq2, fFloatValue10, z, c3785dy.f10315x1.get_Item(i6 + 4).floatValue() != 0.0f, c10950bv5);
                                                    c10950bv = c10950bv5;
                                                } catch (RuntimeException e5) {
                                                    e = e5;
                                                    c10950bv = c10950bv5;
                                                }
                                            } catch (RuntimeException e6) {
                                                e = e6;
                                                c3181c52 = c3181c5;
                                                f2 = fFloatValue9;
                                            }
                                        } catch (RuntimeException e7) {
                                            e = e7;
                                            c3181c52 = c3181c5;
                                            f = fFloatValue8;
                                            f2 = fFloatValue9;
                                            fFloatValue = f;
                                            fFloatValue2 = f2;
                                            if (C4113k4.f11284k4) {
                                            }
                                        }
                                        try {
                                            fFloatValue8 = c3785dy.f10315x1.get_Item(i4).floatValue() + f3;
                                            try {
                                                fFloatValue9 = c3785dy.f10315x1.get_Item(i5).floatValue() + f4;
                                                i17 = i7 + 7;
                                                c10950bv3 = c10950bv;
                                                c3181c53 = c3181c52;
                                                c = 3;
                                                i16 = 18;
                                            } catch (RuntimeException e8) {
                                                e = e8;
                                                c10950bv3 = c10950bv;
                                                fFloatValue = fFloatValue8;
                                                fFloatValue2 = f2;
                                                if (C4113k4.f11284k4) {
                                                }
                                            }
                                        } catch (RuntimeException e9) {
                                            e = e9;
                                            c10950bv3 = c10950bv;
                                            fFloatValue = f;
                                            fFloatValue2 = f2;
                                            if (C4113k4.f11284k4) {
                                            }
                                        }
                                    }
                                    c3181c52 = c3181c53;
                                    float f6 = fFloatValue8;
                                    float f7 = fFloatValue9;
                                    C10950bv c10950bv6 = c10950bv3;
                                    this.f17941c5 = new Dictionary<>();
                                    c10950bv3 = c10950bv6;
                                    fFloatValue = f6;
                                    fFloatValue2 = f7;
                                    i2 = 2;
                                } else {
                                    if (this.f17947jd.containsItem(Integer.valueOf(i))) {
                                        if (this.f17941c5.size() > 3) {
                                            c10950bv3.m52930k4(this.f17949kk.m25807k4(c3181c53, this.f17941c5, false));
                                        }
                                        C3785dy c3785dy5 = c3785dy2;
                                        C3785dy[] c3785dyArr = {c3785dy};
                                        i8 = 2;
                                        C10955du c10955duM25805k4 = this.f17949kk.m25805k4(c3181c53, c3785dyArr, c3785dy3, true, fFloatValue, fFloatValue2);
                                        C3785dy c3785dy6 = c3785dyArr[0];
                                        c10950bv3.m52930k4(c10955duM25805k4);
                                        c3785dy = (c3785dy5 == null || !this.f17942ck.containsItem(Integer.valueOf(c3785dy5.f10313k4))) ? c3785dy6 : new C3785dy(2, new float[0]);
                                        this.f17941c5 = new Dictionary<>();
                                        fFloatValue = c10955duM25805k4.m52919k4().m53055to().m56897x1();
                                        fFloatValue2 = c10955duM25805k4.m52919k4().m53055to().m56895kk();
                                    }
                                    i2 = i8;
                                    c3181c52 = c3181c53;
                                }
                            } else if (c3785dy3 != null) {
                                Dictionary<Integer, Float> dictionary30 = this.f17941c5;
                                dictionary30.addItem(Integer.valueOf(dictionary30.size()), Float.valueOf(fFloatValue));
                                Dictionary<Integer, Float> dictionary31 = this.f17941c5;
                                dictionary31.addItem(Integer.valueOf(dictionary31.size()), Float.valueOf(fFloatValue2));
                                float fFloatValue11 = fFloatValue;
                                float fFloatValue12 = fFloatValue2;
                                for (int i18 = 0; i18 < c3785dy.f10315x1.size(); i18++) {
                                    float fFloatValue13 = fFloatValue12 + c3785dy.f10315x1.get_Item(i18).floatValue();
                                    Dictionary<Integer, Float> dictionary32 = this.f17941c5;
                                    dictionary32.addItem(Integer.valueOf(dictionary32.size()), Float.valueOf(fFloatValue11));
                                    Dictionary<Integer, Float> dictionary33 = c3785dy.f10314kk;
                                    dictionary33.addItem(Integer.valueOf(dictionary33.size()), this.f17941c5.get_Item(Integer.valueOf(r11.size() - 1)));
                                    Dictionary<Integer, Float> dictionary34 = this.f17941c5;
                                    dictionary34.addItem(Integer.valueOf(dictionary34.size()), Float.valueOf(fFloatValue13));
                                    Dictionary<Integer, Float> dictionary35 = c3785dy.f10314kk;
                                    dictionary35.addItem(Integer.valueOf(dictionary35.size()), this.f17941c5.get_Item(Integer.valueOf(r6.size() - 1)));
                                    fFloatValue11 = this.f17941c5.get_Item(Integer.valueOf(r4.size() - 2)).floatValue();
                                    fFloatValue12 = this.f17941c5.get_Item(Integer.valueOf(r4.size() - 1)).floatValue();
                                }
                                fFloatValue = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 2)).floatValue();
                                f5 = this.f17941c5.get_Item(Integer.valueOf(r2.size() - 1));
                            }
                            i8 = 2;
                            i2 = i8;
                            c3181c52 = c3181c53;
                        }
                        fFloatValue2 = f5.floatValue();
                        c3181c52 = c3181c53;
                        i2 = i3;
                    } else if (c3785dy3 != null) {
                        try {
                            if (this.f17941c5.size() == 0) {
                                Dictionary<Integer, Float> dictionary36 = this.f17941c5;
                                dictionary36.addItem(Integer.valueOf(dictionary36.size()), Float.valueOf(fFloatValue));
                                Dictionary<Integer, Float> dictionary37 = this.f17941c5;
                                dictionary37.addItem(Integer.valueOf(dictionary37.size()), Float.valueOf(fFloatValue2));
                            }
                            for (int i19 = 0; i19 < c3785dy.f10315x1.size(); i19++) {
                                Dictionary<Integer, Float> dictionary38 = this.f17941c5;
                                dictionary38.addItem(Integer.valueOf(dictionary38.size()), c3785dy.f10315x1.get_Item(i19));
                                c3785dy.f10314kk.addItem(Integer.valueOf(this.f17941c5.size() - 1), this.f17941c5.get_Item(Integer.valueOf(r11.size() - 1)));
                            }
                            i3 = 2;
                            fFloatValue = this.f17941c5.get_Item(Integer.valueOf(r4.size() - 2)).floatValue();
                            fFloatValue2 = this.f17941c5.get_Item(Integer.valueOf(r4.size() - 1)).floatValue();
                            c3181c52 = c3181c53;
                            i2 = i3;
                        } catch (RuntimeException e10) {
                            e = e10;
                            c3181c52 = c3181c53;
                            if (C4113k4.f11284k4) {
                                throw e;
                            }
                            i9++;
                            c3181c53 = c3181c52;
                        }
                    }
                    i9++;
                    c3181c53 = c3181c52;
                }
                if (c3785dy.f10313k4 == i2) {
                    try {
                        Dictionary<Integer, Float> dictionary39 = this.f17941c5;
                        dictionary39.addItem(Integer.valueOf(dictionary39.size()), Float.valueOf(fFloatValue));
                        Dictionary<Integer, Float> dictionary40 = this.f17941c5;
                        dictionary40.addItem(Integer.valueOf(dictionary40.size()), Float.valueOf(fFloatValue2));
                        Dictionary<Integer, Float> dictionary41 = this.f17941c5;
                        dictionary41.addItem(Integer.valueOf(dictionary41.size()), listMo17081x1.get_Item(i10).f10314kk.get_Item(0));
                        Dictionary<Integer, Float> dictionary42 = c3785dy.f10314kk;
                        dictionary42.addItem(Integer.valueOf(dictionary42.size()), this.f17941c5.get_Item(Integer.valueOf(r5.size() - 1)));
                        Dictionary<Integer, Float> dictionary43 = this.f17941c5;
                        dictionary43.addItem(Integer.valueOf(dictionary43.size()), listMo17081x1.get_Item(i10).f10314kk.get_Item(1));
                        Dictionary<Integer, Float> dictionary44 = c3785dy.f10314kk;
                        dictionary44.addItem(Integer.valueOf(dictionary44.size()), this.f17941c5.get_Item(Integer.valueOf(r3.size() - 1)));
                        if (this.f17941c5.size() > 3) {
                            c10950bv3.m52930k4(this.f17949kk.m25807k4(c3181c52, this.f17941c5, false));
                            c10950bv3.m52895k4(true);
                            C10950bv c10950bv7 = new C10950bv();
                            try {
                                c10971um.m52930k4(c10950bv7);
                                c10950bv3 = c10950bv7;
                            } catch (RuntimeException e11) {
                                e = e11;
                                c10950bv3 = c10950bv7;
                                if (C4113k4.f11284k4) {
                                }
                            }
                        }
                        Dictionary<Integer, Float> dictionary45 = this.f17941c5;
                        fFloatValue = dictionary45.get_Item(Integer.valueOf(dictionary45.size() - i2)).floatValue();
                        fFloatValue2 = this.f17941c5.get_Item(Integer.valueOf(r0.size() - 1)).floatValue();
                        this.f17941c5 = new Dictionary<>();
                        if (i9 < listMo17081x1.size() - 1) {
                            i10 = i9 + 1;
                        }
                    } catch (RuntimeException e12) {
                        e = e12;
                    }
                }
                i9++;
                c3181c53 = c3181c52;
            }
            C3181c5 c3181c54 = c3181c53;
            C10950bv c10950bv8 = c10950bv3;
            if (this.f17941c5.size() > 3) {
                c10950bv8.m52930k4(this.f17949kk.m25807k4(c3181c54, this.f17941c5, false));
            }
            if (c3181c54.f9461x1.containsKey("transform")) {
                this.f17943du.m25776k4(c3181c54, c10971um, c12015qq.Clone());
            }
        }
        return c10971um;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m25799x1(C3181c5 c3181c5, C12015qq c12015qq) {
        C10971um c10971um;
        C10950bv c10950bvM25804k4;
        C12007ix c12007ixM25793k4;
        AbstractC10973uz abstractC10973uzM25791k4;
        C12007ix c12007ix = new C12007ix();
        switch (f17940up.m27428k4(c3181c5.f9456h4)) {
            case 4:
                c10971um = new C10971um();
                c10950bvM25804k4 = m25790k4().m25804k4(c3181c5, c12015qq.Clone());
                c10971um.m52930k4(c10950bvM25804k4);
                c12007ixM25793k4 = m25793k4(c10971um);
                c12007ix.m56578x1(c12007ixM25793k4.m56570m9().Clone());
                break;
            case 5:
                c10971um = new C10971um();
                c10950bvM25804k4 = m25790k4().m25809x1(c3181c5, c12015qq.Clone());
                c10971um.m52930k4(c10950bvM25804k4);
                c12007ixM25793k4 = m25793k4(c10971um);
                c12007ix.m56578x1(c12007ixM25793k4.m56570m9().Clone());
                break;
            case 6:
                abstractC10973uzM25791k4 = m25791k4(c3181c5, c12015qq.Clone());
                c12007ixM25793k4 = m25793k4(abstractC10973uzM25791k4);
                c12007ix.m56578x1(c12007ixM25793k4.m56570m9().Clone());
                break;
            case 7:
            case 9:
                abstractC10973uzM25791k4 = m25790k4().m25806k4(c3181c5, c12015qq.Clone(), true);
                c12007ixM25793k4 = m25793k4(abstractC10973uzM25791k4);
                c12007ix.m56578x1(c12007ixM25793k4.m56570m9().Clone());
                break;
            case 8:
                abstractC10973uzM25791k4 = m25790k4().m25810x1(c3181c5, c12015qq.Clone(), true);
                c12007ixM25793k4 = m25793k4(abstractC10973uzM25791k4);
                c12007ix.m56578x1(c12007ixM25793k4.m56570m9().Clone());
                break;
        }
        return c12007ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10971um m25792k4(C12015qq c12015qq, C3181c5 c3181c5) {
        C10971um c10971um;
        C10950bv c10950bvM25804k4;
        List list = new List(AbstractC14092to.m67204k4((Object[]) new String[]{"circle", "ellipse", "path", "polygon", DrawToolFactory.LASSO_TYPE_RECT}));
        if (c3181c5.f9461x1.containsKey("clip-path")) {
            c10971um = null;
            for (String str : C14113y2.m67417k4(c3181c5.f9461x1.get_Item("clip-path").toString(), new String[]{";"}, 1)) {
                C10006k4 c10006k4 = (C10006k4) C7019kk.m27452k4((Object) this.f17952x1.m15116k4(C3794up.m15166kk(str)), C10006k4.class);
                if (c10006k4 != null) {
                    boolean zM49129wy = c10006k4.m49129wy();
                    C12007ix c12007ix = new C12007ix();
                    if (zM49129wy) {
                        m25799x1(c3181c5, c12015qq.Clone()).CloneTo(c12007ix);
                    }
                    C10971um c10971um2 = new C10971um();
                    IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = c10006k4.m13628ar().iterator();
                    while (it.hasNext()) {
                        try {
                            C3181c5 value = it.next().getValue();
                            if (zM49129wy && list.containsItem(value.f9456h4)) {
                                C3181c5[] c3181c5Arr = {value};
                                m25789k4(c3181c5Arr, c12007ix.Clone());
                                value = c3181c5Arr[0];
                            }
                            switch (f17940up.m27428k4(value.f9456h4)) {
                                case 4:
                                    c10950bvM25804k4 = m25790k4().m25804k4(value, c12015qq.Clone());
                                    c10971um2.m52930k4(c10950bvM25804k4);
                                    break;
                                case 5:
                                    c10950bvM25804k4 = m25790k4().m25809x1(value, c12015qq.Clone());
                                    c10971um2.m52930k4(c10950bvM25804k4);
                                    break;
                                case 6:
                                    c10971um2 = m25791k4(value, c12015qq.Clone());
                                    break;
                                case 7:
                                    c10971um2 = m25790k4().m25806k4(value, c12015qq.Clone(), true);
                                    break;
                                case 8:
                                    c10950bvM25804k4 = m25790k4().m25810x1(value, c12015qq.Clone(), true);
                                    c10971um2.m52930k4(c10950bvM25804k4);
                                    break;
                            }
                            if (c10971um2 != null) {
                                if (c10006k4.m13636lr()) {
                                    this.f17943du.m25776k4(c10006k4, c10971um2, c12015qq.Clone());
                                }
                                if (c10971um2.mo52909to() != null) {
                                    c10971um2.m53109x1(c10971um2.mo52909to());
                                    c10971um2.m53099k4((C4317dy) null);
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
                    c10971um = c10971um2;
                }
            }
        } else {
            c10971um = null;
        }
        c3181c5.f9461x1.containsKey("view-clip-id");
        if (c10971um == null || c10971um.m52927c5() == 0) {
            return null;
        }
        return c10971um;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25800x1(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        try {
            c3181c5.m13634ix();
            C10971um c10971um = new C10971um();
            c10951c5.m52930k4((AbstractC10973uz) c10971um);
            c10971um.m52930k4(this.f17949kk.m25804k4(c3181c5, c12015qq.Clone()));
            if (c3181c5.f9461x1.containsKey("clip-path") || c3181c5.f9461x1.containsKey("view-clip-id")) {
                c10971um.m53103k4(m25792k4(c12015qq.Clone(), c3181c5));
            }
            if (c3181c5.f9461x1.containsKey("transform")) {
                this.f17943du.m25776k4(c3181c5, c10971um, c12015qq.Clone());
            }
            this.f17950m9.m25783k4(c10971um, c3181c5, c12015qq.Clone(), c10951c5);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m25793k4(AbstractC10973uz abstractC10973uz) {
        return new C10965m9().m53022k4(abstractC10973uz);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25801x1(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq, boolean z) {
        try {
            C10971um c10971umM25806k4 = this.f17949kk.m25806k4(c3181c5, c12015qq.Clone(), z);
            if (c3181c5.f9461x1.containsKey("clip-path") || c3181c5.f9461x1.containsKey("view-clip-id")) {
                c10971umM25806k4.m53103k4(m25792k4(c12015qq.Clone(), c3181c5));
            }
            this.f17950m9.m25783k4(c10971umM25806k4, c3181c5, c12015qq.Clone(), c10951c5);
            c10951c5.m52930k4((AbstractC10973uz) c10971umM25806k4);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03a9, code lost:
    
        r7.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03ae, code lost:
    
        if (r1 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03b0, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03b3, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03b4, code lost:
    
        if (r1 != null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03b6, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03b9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03ba, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x03c6, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r7, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03c8, code lost:
    
        r7.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03de, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        r11 = new com.aspose.slides.internal.p083di.C3165x1();
        r11.m53112x1((com.aspose.slides.internal.p420th.AbstractC10973uz) r9);
        r11 = r11.m13532x1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0134, code lost:
    
        if (r9.mo52909to() != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0136, code lost:
    
        r13 = new com.aspose.slides.internal.p151gj.C4317dy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013f, code lost:
    
        r13 = r9.mo52909to();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        r11 = r11.m55532k4(com.aspose.slides.internal.p138fu.C4123dy.m16495k4(r13)).Clone();
        r13 = r11.Clone();
        r14 = r11.m56550c5() * r11.m56575x1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0161, code lost:
    
        if (r14 <= 4000000.0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0165, code lost:
    
        r15 = new com.aspose.slides.internal.p083di.C3164kk();
        r10 = r10.getValue();
        r16 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017a, code lost:
    
        if (r10.f9461x1.containsKey("stdDeviation") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017c, code lost:
    
        r6 = com.aspose.slides.internal.p314oc.C7019kk.m27437dy(com.aspose.slides.p559ms.System.C14046bv.m66503x1(r10.f9461x1.get_Item("stdDeviation"), com.aspose.slides.internal.p463vm.C11697x1.m55250kk()), 15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018f, code lost:
    
        r6 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0191, code lost:
    
        r13.m56561k4(r6, r6);
        r10 = new com.aspose.slides.internal.p475wh.C12009k4(com.aspose.slides.internal.p314oc.C7019kk.m27462to(java.lang.Float.valueOf(r13.m56550c5() * 1.25f), 13), com.aspose.slides.internal.p314oc.C7019kk.m27462to(java.lang.Float.valueOf(r13.m56575x1() * 1.25f), 13), 2498570);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01be, code lost:
    
        r10.m56332k4(120.0f, 120.0f);
        r1 = com.aspose.slides.internal.p475wh.AbstractC12008jd.m56582k4((com.aspose.slides.internal.p475wh.AbstractC12002ck) r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c5, code lost:
    
        r3 = new com.aspose.slides.internal.p475wh.C11999ar(com.aspose.slides.internal.p475wh.C12003du.m56398k4(1, 255, 255, 255).Clone());
        r11 = (com.aspose.slides.internal.p151gj.C4318fa) com.aspose.slides.internal.p314oc.C7019kk.m27452k4((java.lang.Object) r9.m53107x1(), com.aspose.slides.internal.p151gj.C4318fa.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e3, code lost:
    
        if (r11 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e5, code lost:
    
        r3 = (com.aspose.slides.internal.p475wh.C11999ar) com.aspose.slides.internal.p138fu.C4128kk.m16560k4((com.aspose.slides.internal.p151gj.C4328x1) r11);
        r20 = r13;
        r21 = r14;
        r3.m56306k4(com.aspose.slides.internal.p475wh.C12003du.m56398k4(1, r3.m56305h4().m56507jd() & 255, r3.m56305h4().m56502ck() & 255, 255 & r3.m56305h4().m56505fa()).Clone());
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x021a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021d, code lost:
    
        r20 = r13;
        r21 = r14;
        r11 = (com.aspose.slides.internal.p151gj.C4324m9) com.aspose.slides.internal.p314oc.C7019kk.m27452k4((java.lang.Object) r9.m53107x1(), com.aspose.slides.internal.p151gj.C4324m9.class);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x022d, code lost:
    
        if (r11 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x022f, code lost:
    
        r3 = new int[r11.m17409x1().length];
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023c, code lost:
    
        if (r13 >= r11.m17409x1().length) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x023e, code lost:
    
        r14 = r11.m17409x1()[r13];
        r3[r13] = r14.m17353k4().m23105x1();
        r14.m17354k4(com.aspose.slides.internal.p223ka.C5656k4.m23093k4(0, r14.m17353k4().m23102kk(), r14.m17353k4().m23104to(), r14.m17353k4().m23099du()));
        r13 = r13 + 1;
        r3 = r3;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027e, code lost:
    
        r23 = r3;
        r24 = r11;
        r12 = 0;
        r3 = com.aspose.slides.internal.p138fu.C4128kk.m16560k4((com.aspose.slides.internal.p151gj.C4328x1) r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x028d, code lost:
    
        if (r12 >= r24.m17409x1().length) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028f, code lost:
    
        r11 = r24.m17409x1()[r12];
        r11.m17354k4(com.aspose.slides.internal.p223ka.C5656k4.m23093k4(r23[r12], r11.m17353k4().m23102kk(), r11.m17353k4().m23104to(), r11.m17353k4().m23099du()));
        r12 = r12 + 1;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02c1, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02c3, code lost:
    
        r1.mo17593x1(r3, new com.aspose.slides.internal.p475wh.C12007ix(0.0f, 0.0f, r10.mo15760yj(), r10.mo15757m9()));
        r1.mo17588x1(new com.aspose.slides.internal.p472w8.C11913yj(0.75f, 0.0f, 0.0f, 0.75f, (-r20.m56557jd()) * 0.75f, (-r20.m56551ck()) * 0.75f));
        r15.m13526k4(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02fb, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0304, code lost:
    
        if (r30.f9461x1.containsKey("opacity") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0306, code lost:
    
        r0 = com.aspose.slides.internal.p314oc.C7019kk.m27437dy(com.aspose.slides.p559ms.System.C14046bv.m66503x1(r30.f9461x1.get_Item("opacity"), com.aspose.slides.internal.p463vm.C11697x1.m55250kk()), 15);
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x031f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0328, code lost:
    
        if (r30.f9461x1.containsKey("fill-opacity") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x032a, code lost:
    
        r1 = 15;
        r16 = com.aspose.slides.internal.p314oc.C7019kk.m27437dy(com.aspose.slides.p559ms.System.C14046bv.m66503x1(r30.f9461x1.get_Item("fill-opacity"), com.aspose.slides.internal.p463vm.C11697x1.m55250kk()), 15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x033e, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0341, code lost:
    
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x034d, code lost:
    
        if (r11.m56550c5() < 10.0f) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0355, code lost:
    
        if (r11.m56575x1() >= 10.0f) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x035d, code lost:
    
        if (r21 <= 1000000.0f) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x035f, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0366, code lost:
    
        if (r21 <= 5000000.0f) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0368, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x036a, code lost:
    
        r3 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x036c, code lost:
    
        r1 = com.aspose.slides.internal.p078db.C3118k4.m13293k4(r10, com.aspose.slides.internal.p078db.C3118k4.m13295k4(r3, r6), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0375, code lost:
    
        r0 = new com.aspose.slides.internal.p080dd.C3152yj();
        r1.m56333k4(r0, com.aspose.slides.internal.p129fe.C3977ck.m15681jd());
        r31.m52930k4(new com.aspose.slides.internal.p420th.C10970u4(r20.m56552du().Clone(), r20.m56570m9().Clone(), r0.toArray()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x039d, code lost:
    
        r1.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03a0, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a7, code lost:
    
        if (com.aspose.slides.internal.p314oc.C7019kk.m27456k4((java.util.Iterator) r7, (java.lang.Class<com.aspose.slides.p559ms.System.IDisposable>) com.aspose.slides.p559ms.System.IDisposable.class) == false) goto L123;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25794k4(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq) {
        try {
            String str = C14113y2.f47374k4;
            if (c3181c5.f9461x1.containsKey("x") || c3181c5.f9461x1.containsKey("y")) {
                String strM67408k4 = C14113y2.m67408k4(" translate(", C14064he.m66704h4(c3181c5.f9461x1.containsKey("x") ? this.f17948k4.m15128k4(c3181c5.f9461x1.get_Item("x").toString(), "x", c3181c5) : 0.0f), ", ", C14064he.m66704h4(c3181c5.f9461x1.containsKey("y") ? this.f17948k4.m15128k4(c3181c5.f9461x1.get_Item("y").toString(), "y", c3181c5) : 0.0f), ")");
                if (c3181c5.f9461x1.containsKey("transform")) {
                    c3181c5.f9461x1.set_Item("transform", c3181c5.f9461x1.get_Item("transform") + strM67408k4);
                } else {
                    c3181c5.f9461x1.m13684k4("transform", strM67408k4);
                }
            }
            C10971um c10971umM25791k4 = m25791k4(c3181c5, c12015qq.Clone());
            if (c3181c5.f9461x1.containsKey("clip-path") || c3181c5.f9461x1.containsKey("view-clip-id")) {
                c10971umM25791k4.m53103k4(m25792k4(c12015qq.Clone(), c3181c5));
            }
            this.f17950m9.m25783k4(c10971umM25791k4, c3181c5, c12015qq.Clone(), c10951c5);
            if (c3181c5.f9461x1.containsKey("filter")) {
                String str2 = c3181c5.f9461x1.get_Item("filter");
                if (C14113y2.m67448x1(str2, "url(#")) {
                    String strM15166kk = C3794up.m15166kk(str2);
                    if (this.f17952x1.m15119x1().containsKey(strM15166kk)) {
                        IGenericEnumerator<KeyValuePair<Integer, C3181c5>> it = this.f17952x1.m15119x1().get_Item(strM15166kk).m13628ar().iterator();
                        while (true) {
                            try {
                                if (!it.hasNext()) {
                                    break;
                                }
                                KeyValuePair<Integer, C3181c5> next = it.next();
                                if ("feGaussianBlur".equals(next.getValue().f9456h4)) {
                                    break;
                                }
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                throw th;
                            }
                        }
                    }
                }
            }
            c10951c5.m52930k4((AbstractC10973uz) c10971umM25791k4);
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25795k4(C3181c5 c3181c5, C10951c5 c10951c5, C12015qq c12015qq, boolean z) {
        try {
            C10950bv c10950bvM25810x1 = this.f17949kk.m25810x1(c3181c5, c12015qq.Clone(), z);
            C10971um c10971um = new C10971um();
            c10971um.m52930k4(c10950bvM25810x1);
            this.f17950m9.m25783k4(c10971um, c3181c5, c12015qq.Clone(), c10951c5);
            c10951c5.m52930k4((AbstractC10973uz) c10971um);
            if (!c3181c5.f9461x1.containsKey("clip-path") && !c3181c5.f9461x1.containsKey("view-clip-id")) {
                return;
            }
            c10971um.m53103k4(m25792k4(c12015qq.Clone(), c3181c5));
        } catch (RuntimeException e) {
            if (!C4113k4.f11284k4) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m25789k4(C3181c5[] c3181c5Arr, C12007ix c12007ix) {
        List list = new List(AbstractC14092to.m67204k4((Object[]) new String[]{"x", "cx", "r", "width"}));
        List list2 = new List(AbstractC14092to.m67204k4((Object[]) new String[]{"y", TranslateLanguage.WELSH, "height"}));
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5Arr[0].f9461x1.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, String> next = it.next();
                if (list.containsItem(next.getKey()) || list2.containsItem(next.getKey())) {
                    float fM27437dy = C7019kk.m27437dy(C14080ne.m67028up(next.getValue(), (InterfaceC14073kp) C11697x1.m55250kk()), 15);
                    if (list.containsItem(next.getKey())) {
                        fM27437dy *= c12007ix.m56550c5();
                    }
                    if (list2.containsItem(next.getKey())) {
                        fM27437dy *= c12007ix.m56575x1();
                    }
                    dictionary.addItem(next.getKey(), C14113y2.m67408k4(C14064he.m66704h4(fM27437dy), TranslateLanguage.PORTUGUESE));
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
        c3181c5Arr[0].f9461x1 = new C3187kk(dictionary);
    }
}
