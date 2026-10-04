package com.aspose.slides.internal.p261m0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3790kk;
import com.aspose.slides.internal.p250lh.AbstractC6038k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p420th.C10969to;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p420th.C10974v4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6301x1 {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f17953kk = new C7017h4("cx", TranslateLanguage.WELSH, "r", "rx", "ry");

    /* JADX INFO: renamed from: k4 */
    private C3786fa f17954k4;

    /* JADX INFO: renamed from: x1 */
    private C6297k4 f17955x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.m0.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private static final double[][] f17956du;

        /* JADX INFO: renamed from: k4 */
        private static final int[] f17957k4 = {0, 3, 1, 3};

        /* JADX INFO: renamed from: kk */
        private static final double[][] f17958kk;

        /* JADX INFO: renamed from: to */
        private static final double[][] f17959to;

        /* JADX INFO: renamed from: x1 */
        private static final double[][] f17960x1;

        static {
            double dM67496rv = 0.5d - ((C14116yg.m67496rv(2.0d) - 1.0d) * 0.6666666666666666d);
            f17960x1 = new double[][]{new double[]{0.0d, 0.0d, 0.0d, 0.5d}, new double[]{0.0d, 0.0d, 0.0d, dM67496rv, 0.0d, dM67496rv, 0.0d, 0.0d, 0.0d, 0.5d, 0.0d, 0.0d}, new double[]{1.0d, -0.5d, 0.0d, 0.0d}, new double[]{1.0d, d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.5d}};
            double d = -dM67496rv;
            f17958kk = new double[][]{new double[]{1.0d, -0.5d, 0.0d, 0.0d}, new double[]{1.0d, d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.5d}, new double[]{1.0d, 0.0d, 1.0d, -0.5d}, new double[]{1.0d, 0.0d, 1.0d, d, 1.0d, d, 1.0d, 0.0d, 1.0d, -0.5d, 1.0d, 0.0d}};
            f17959to = new double[][]{new double[]{1.0d, 0.0d, 1.0d, -0.5d}, new double[]{1.0d, 0.0d, 1.0d, d, 1.0d, d, 1.0d, 0.0d, 1.0d, -0.5d, 1.0d, 0.0d}, new double[]{0.0d, 0.5d, 1.0d, 0.0d}, new double[]{0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, d, 0.0d, 0.0d, 1.0d, -0.5d}};
            f17956du = new double[][]{new double[]{0.0d, 0.5d, 1.0d, 0.0d}, new double[]{0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, d, 0.0d, 0.0d, 1.0d, -0.5d}, new double[]{0.0d, 0.0d, 0.0d, 0.5d}, new double[]{0.0d, 0.0d, 0.0d, dM67496rv, 0.0d, dM67496rv, 0.0d, 0.0d, 0.0d, 0.5d, 0.0d, 0.0d}};
        }

        /* JADX INFO: renamed from: k4 */
        public static C10950bv m25811k4(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
            return m25812k4(f17960x1, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
        }

        /* JADX INFO: renamed from: kk */
        public static C10950bv m25813kk(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
            return m25812k4(f17959to, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
        }

        /* JADX INFO: renamed from: to */
        public static C10950bv m25814to(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
            return m25812k4(f17956du, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
        }

        /* JADX INFO: renamed from: x1 */
        public static C10950bv m25815x1(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
            return m25812k4(f17958kk, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
        }

        /* JADX INFO: renamed from: k4 */
        private static C10950bv m25812k4(double[][] dArr, C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
            C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
            C10950bv c10950bv = new C10950bv();
            int i = 0;
            while (i <= dArr.length) {
                float[] fArr = new float[6];
                if (i == dArr.length) {
                    break;
                }
                double[] dArr2 = dArr[i];
                float fM67504x1 = C14116yg.m67504x1(c12007ix.m56550c5(), i <= 1 ? c12025x6.m56897x1() : c12025x62.m56897x1());
                float fM67504x12 = C14116yg.m67504x1(c12007ix.m56575x1(), i <= 1 ? c12025x6.m56895kk() : c12025x62.m56895kk());
                int i2 = 0;
                int i3 = 0;
                while (i2 < dArr2.length) {
                    int i4 = i3 + 1;
                    float f = fM67504x12;
                    fArr[i3] = (float) ((dArr2[i2 + 1] * ((double) fM67504x1)) + (dArr2[i2] * ((double) c12007ix.m56550c5())) + ((double) c12007ix.m56557jd()));
                    i3 += 2;
                    fArr[i4] = (float) ((dArr2[i2 + 3] * ((double) f)) + (dArr2[i2 + 2] * ((double) c12007ix.m56575x1())) + ((double) c12007ix.m56551ck()));
                    i2 += 4;
                    fM67504x12 = f;
                    i = i;
                }
                int i5 = i;
                int i6 = f17957k4[i5];
                if (i6 == 0) {
                    c12025x6Clone = new C12025x6(fArr[0], fArr[1]);
                } else if (i6 == 1) {
                    C12025x6 c12025x63 = new C12025x6(fArr[0], fArr[1]);
                    c10950bv.m52900x1(c12025x6Clone.Clone(), c12025x63.Clone());
                    c12025x63.CloneTo(c12025x6Clone);
                } else if (i6 == 3) {
                    C12025x6 c12025x64 = new C12025x6(fArr[4], fArr[5]);
                    C10955du c10955du = new C10955du(c12025x6Clone.Clone(), new C12025x6(fArr[0], fArr[1]), new C12025x6(fArr[2], fArr[3]), c12025x64.Clone());
                    c12025x64.CloneTo(c12025x6Clone);
                    c10950bv.m52930k4(c10955du);
                }
                i = i5 + 1;
            }
            return c10950bv;
        }
    }

    public C6301x1(C3786fa c3786fa, C6297k4 c6297k4) {
        this.f17954k4 = c3786fa;
        this.f17955x1 = c6297k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10950bv m25804k4(C3181c5 c3181c5, C12015qq c12015qq) {
        IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
        float fM15128k4 = 0.0f;
        float fM15128k42 = 0.0f;
        float fM15128k43 = 0.0f;
        while (it.hasNext()) {
            try {
                int iM27428k4 = f17953kk.m27428k4(it.next().getKey());
                if (iM27428k4 == 0) {
                    fM15128k4 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("cx").toString(), "cx", c3181c5);
                } else if (iM27428k4 == 1) {
                    fM15128k42 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item(TranslateLanguage.WELSH).toString(), TranslateLanguage.WELSH, c3181c5);
                } else if (iM27428k4 == 2) {
                    fM15128k43 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("r").toString(), "r", c3181c5);
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
        List list = new List(AbstractC6038k4.m24375k4(fM15128k43, fM15128k4, fM15128k42));
        C10950bv c10950bv = new C10950bv();
        for (int i = 0; i < list.size(); i++) {
            float[] fArr = (float[]) list.get_Item(i);
            C10969to c10969to = new C10969to();
            c10969to.m53052k4(new C12025x6(fArr[0], fArr[1]));
            c10969to.m53058x1(new C12025x6(fArr[2], fArr[3]));
            c10969to.m53054kk(new C12025x6(fArr[4], fArr[5]));
            c10969to.m53056to(new C12025x6(fArr[6], fArr[7]));
            c10950bv.m52930k4(new C10955du(c10969to.Clone()));
        }
        return c10950bv;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10950bv m25809x1(C3181c5 c3181c5, C12015qq c12015qq) {
        c3181c5.m13634ix();
        IGenericEnumerator<KeyValuePair<String, String>> it = c3181c5.f9461x1.iterator();
        float fM15128k4 = 0.0f;
        float fM15128k42 = 0.0f;
        float fM15128k43 = 0.0f;
        float fM15128k44 = 0.0f;
        while (it.hasNext()) {
            try {
                int iM27428k4 = f17953kk.m27428k4(it.next().getKey().toString());
                if (iM27428k4 == 0) {
                    fM15128k4 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("cx").toString(), "cx", c3181c5);
                } else if (iM27428k4 == 1) {
                    fM15128k42 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item(TranslateLanguage.WELSH).toString(), TranslateLanguage.WELSH, c3181c5);
                } else if (iM27428k4 == 3) {
                    fM15128k43 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("rx").toString(), "rx", c3181c5);
                } else if (iM27428k4 == 4) {
                    fM15128k44 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("ry").toString(), "ry", c3181c5);
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
        List list = new List(AbstractC6038k4.m24376k4(fM15128k4 - fM15128k43, fM15128k42 - fM15128k44, fM15128k43 * 2.0f, fM15128k44 * 2.0f));
        C10950bv c10950bv = new C10950bv();
        for (int i = 0; i < list.size(); i++) {
            float[] fArr = (float[]) list.get_Item(i);
            C10969to c10969to = new C10969to();
            c10969to.m53052k4(new C12025x6(fArr[0], fArr[1]));
            c10969to.m53058x1(new C12025x6(fArr[2], fArr[3]));
            c10969to.m53054kk(new C12025x6(fArr[4], fArr[5]));
            c10969to.m53056to(new C12025x6(fArr[6], fArr[7]));
            c10950bv.m52930k4(new C10955du(c10969to.Clone()));
        }
        return c10950bv;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10955du m25805k4(C3181c5 c3181c5, C3785dy[] c3785dyArr, C3785dy c3785dy, boolean z, float f, float f2) {
        int i;
        int i2;
        float[] fArr = new float[8];
        List list = new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) new int[]{9, 10, 11, 12})));
        List list2 = new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) new int[]{13, 14, 15, 16})));
        C3785dy c3785dy2 = c3785dyArr[0];
        int i3 = c3785dy2.f10313k4;
        if (i3 == 9 || i3 == 10) {
            char c = 0;
            fArr[0] = f;
            fArr[1] = f2;
            if (i3 == 10) {
                fArr[2] = c3785dy2.f10315x1.get_Item(0).floatValue() + f;
                fArr[3] = c3785dyArr[0].f10315x1.get_Item(1).floatValue() + f2;
                fArr[4] = c3785dyArr[0].f10315x1.get_Item(2).floatValue() + f;
                fArr[5] = c3785dyArr[0].f10315x1.get_Item(3).floatValue() + f2;
                fArr[6] = c3785dyArr[0].f10315x1.get_Item(4).floatValue() + f;
                fArr[7] = c3785dyArr[0].f10315x1.get_Item(5).floatValue() + f2;
            } else {
                fArr[2] = c3785dy2.f10315x1.get_Item(0).floatValue();
                fArr[3] = c3785dyArr[0].f10315x1.get_Item(1).floatValue();
                fArr[4] = c3785dyArr[0].f10315x1.get_Item(2).floatValue();
                fArr[5] = c3785dyArr[0].f10315x1.get_Item(3).floatValue();
                fArr[6] = c3785dyArr[0].f10315x1.get_Item(4).floatValue();
                fArr[7] = c3785dyArr[0].f10315x1.get_Item(5).floatValue();
            }
            int i4 = 0;
            while (i4 < 8) {
                float f3 = fArr[i4];
                Dictionary<Integer, Float> dictionary = c3785dyArr[c].f10314kk;
                dictionary.addItem(Integer.valueOf(dictionary.size()), Float.valueOf(f3));
                i4++;
                c = 0;
            }
        } else if (i3 == 11 || i3 == 12) {
            if (list.containsItem(Integer.valueOf(c3785dy.f10313k4))) {
                fArr[0] = f;
                fArr[1] = f2;
                C12025x6 c12025x6 = new C12025x6(c3785dy.f10314kk.get_Item(Integer.valueOf(r6.size() - 4)).floatValue(), c3785dy.f10314kk.get_Item(Integer.valueOf(r7.size() - 3)).floatValue());
                float fFloatValue = c3785dy.f10314kk.get_Item(Integer.valueOf(r7.size() - 2)).floatValue();
                Dictionary<Integer, Float> dictionary2 = c3785dy.f10314kk;
                C12025x6 c12025x6Clone = m25802k4(c12025x6, new C12025x6(fFloatValue, dictionary2.get_Item(Integer.valueOf(dictionary2.size() - 1)).floatValue())).Clone();
                fArr[2] = c12025x6Clone.m56897x1();
                fArr[3] = c12025x6Clone.m56895kk();
                i = 0;
            } else {
                i = 0;
                fArr[0] = f;
                fArr[1] = f2;
                fArr[2] = f;
                fArr[3] = f2;
            }
            C3785dy c3785dy3 = c3785dyArr[i];
            if (c3785dy3.f10313k4 == 12) {
                fArr[4] = c3785dy3.f10315x1.get_Item(i).floatValue() + f;
                fArr[5] = c3785dyArr[i].f10315x1.get_Item(1).floatValue() + f2;
                fArr[6] = c3785dyArr[i].f10315x1.get_Item(2).floatValue() + f;
                fArr[7] = c3785dyArr[i].f10315x1.get_Item(3).floatValue() + f2;
            } else {
                fArr[4] = c3785dy3.f10315x1.get_Item(i).floatValue();
                fArr[5] = c3785dyArr[i].f10315x1.get_Item(1).floatValue();
                fArr[6] = c3785dyArr[i].f10315x1.get_Item(2).floatValue();
                fArr[7] = c3785dyArr[i].f10315x1.get_Item(3).floatValue();
            }
            for (int i5 = i; i5 < 8; i5++) {
                float f4 = fArr[i5];
                Dictionary<Integer, Float> dictionary3 = c3785dyArr[i].f10314kk;
                dictionary3.addItem(Integer.valueOf(dictionary3.size()), Float.valueOf(f4));
            }
        } else if (i3 == 13 || i3 == 14) {
            float[] fArr2 = new float[6];
            char c2 = 0;
            fArr2[0] = f;
            fArr2[1] = f2;
            if (i3 == 14) {
                fArr2[2] = c3785dy2.f10315x1.get_Item(0).floatValue() + f;
                fArr2[3] = c3785dyArr[0].f10315x1.get_Item(1).floatValue() + f2;
                fArr2[4] = c3785dyArr[0].f10315x1.get_Item(2).floatValue() + f;
                fArr2[5] = c3785dyArr[0].f10315x1.get_Item(3).floatValue() + f2;
            } else {
                fArr2[2] = c3785dy2.f10315x1.get_Item(0).floatValue();
                fArr2[3] = c3785dyArr[0].f10315x1.get_Item(1).floatValue();
                fArr2[4] = c3785dyArr[0].f10315x1.get_Item(2).floatValue();
                fArr2[5] = c3785dyArr[0].f10315x1.get_Item(3).floatValue();
            }
            float[] fArrM24377k4 = AbstractC6038k4.m24377k4(fArr2);
            int i6 = 0;
            while (i6 < 6) {
                float f5 = fArr2[i6];
                Dictionary<Integer, Float> dictionary4 = c3785dyArr[c2].f10314kk;
                dictionary4.addItem(Integer.valueOf(dictionary4.size()), Float.valueOf(f5));
                i6++;
                c2 = 0;
            }
            fArr = fArrM24377k4;
        } else if (i3 == 15 || i3 == 16) {
            float[] fArr3 = new float[6];
            if (list2.containsItem(Integer.valueOf(c3785dy.f10313k4))) {
                fArr3[0] = f;
                fArr3[1] = f2;
                C12025x6 c12025x62 = new C12025x6();
                m25802k4(new C12025x6(c3785dy.f10314kk.get_Item(Integer.valueOf(r7.size() - 4)).floatValue(), c3785dy.f10314kk.get_Item(Integer.valueOf(r1.size() - 3)).floatValue()), new C12025x6(f, f2)).CloneTo(c12025x62);
                fArr3[2] = c12025x62.m56897x1();
                fArr3[3] = c12025x62.m56895kk();
            } else {
                fArr3[0] = f;
                fArr3[1] = f2;
                fArr3[2] = f;
                fArr3[3] = f2;
            }
            C3785dy c3785dy4 = c3785dyArr[0];
            if (c3785dy4.f10313k4 == 16) {
                i2 = 0;
                fArr3[4] = c3785dy4.f10315x1.get_Item(0).floatValue() + f;
                fArr3[5] = c3785dyArr[0].f10315x1.get_Item(1).floatValue() + f2;
            } else {
                i2 = 0;
                fArr3[4] = c3785dy4.f10315x1.get_Item(0).floatValue();
                fArr3[5] = c3785dyArr[0].f10315x1.get_Item(1).floatValue();
            }
            float[] fArrM24377k42 = AbstractC6038k4.m24377k4(fArr3);
            int i7 = i2;
            while (i7 < 6) {
                float f6 = fArr3[i7];
                Dictionary<Integer, Float> dictionary5 = c3785dyArr[i2].f10314kk;
                dictionary5.addItem(Integer.valueOf(dictionary5.size()), Float.valueOf(f6));
                i7++;
                i2 = 0;
            }
            fArr = fArrM24377k42;
        }
        C10969to c10969to = new C10969to();
        c10969to.m53052k4(new C12025x6(fArr[0], fArr[1]));
        c10969to.m53058x1(new C12025x6(fArr[2], fArr[3]));
        c10969to.m53054kk(new C12025x6(fArr[4], fArr[5]));
        c10969to.m53056to(new C12025x6(fArr[6], fArr[7]));
        return new C10955du(c10969to.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public final C10950bv m25810x1(C3181c5 c3181c5, C12015qq c12015qq, boolean z) {
        C10950bv c10950bv = new C10950bv();
        c3181c5.m13634ix();
        if (c3181c5.f9461x1.containsKey("x") && c3181c5.f9461x1.containsKey("y") && c3181c5.f9461x1.containsKey("width") && c3181c5.f9461x1.containsKey("height")) {
            c12015qq.m56699x1();
            c12015qq.m56697kk();
            if (c3181c5.f9461x1.containsKey("bounding-box-width")) {
                this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("bounding-box-width").toString(), C14113y2.f47374k4, c3181c5);
            }
            if (c3181c5.f9461x1.containsKey("bounding-box-height")) {
                this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("bounding-box-height").toString(), C14113y2.f47374k4, c3181c5);
            }
            float fM15128k4 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("width").toString(), "width", c3181c5);
            float fM15128k42 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("height").toString(), "height", c3181c5);
            float fM15128k43 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("x").toString(), "x", c3181c5);
            float fM15128k44 = this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("y").toString(), "y", c3181c5);
            if (c3181c5.f9461x1.containsKey("rx") || c3181c5.f9461x1.containsKey("ry")) {
                C12007ix c12007ix = new C12007ix(fM15128k43, fM15128k44, fM15128k4, fM15128k42);
                float fM15128k45 = c3181c5.f9461x1.containsKey("rx") ? this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("rx").toString(), "rx", c3181c5) : 0.0f;
                float fM15128k46 = c3181c5.f9461x1.containsKey("ry") ? this.f17954k4.m15128k4(c3181c5.f9461x1.get_Item("ry").toString(), "ry", c3181c5) : 0.0f;
                C10950bv c10950bvM25811k4 = k4.m25811k4(c12007ix.Clone(), new C12025x6(fM15128k45, fM15128k46), new C12025x6(fM15128k45, fM15128k46));
                for (int i = 0; i < c10950bvM25811k4.m52927c5(); i++) {
                    c10950bv.m52930k4(c10950bvM25811k4.m52931k4(i));
                }
                C10950bv c10950bvM25815x1 = k4.m25815x1(c12007ix.Clone(), new C12025x6(fM15128k45, fM15128k46), new C12025x6(fM15128k45, fM15128k46));
                for (int i2 = 0; i2 < c10950bvM25815x1.m52927c5(); i2++) {
                    c10950bv.m52930k4(c10950bvM25815x1.m52931k4(i2));
                }
                C10950bv c10950bvM25813kk = k4.m25813kk(c12007ix.Clone(), new C12025x6(fM15128k45, fM15128k46), new C12025x6(fM15128k45, fM15128k46));
                for (int i3 = 0; i3 < c10950bvM25813kk.m52927c5(); i3++) {
                    c10950bv.m52930k4(c10950bvM25813kk.m52931k4(i3));
                }
                C10950bv c10950bvM25814to = k4.m25814to(c12007ix.Clone(), new C12025x6(fM15128k45, fM15128k46), new C12025x6(fM15128k45, fM15128k46));
                for (int i4 = 0; i4 < c10950bvM25814to.m52927c5(); i4++) {
                    c10950bv.m52930k4(c10950bvM25814to.m52931k4(i4));
                }
            } else {
                c10950bv.m52899x1(new C12007ix(fM15128k43, fM15128k44, fM15128k4, fM15128k42));
            }
            c10950bv.m52895k4(true);
            if (c3181c5.f9461x1.containsKey("transform")) {
                this.f17955x1.m25776k4(c3181c5, c10950bv, c12015qq.Clone());
            }
        }
        return c10950bv;
    }

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
    public final C10971um m25806k4(C3181c5 c3181c5, C12015qq c12015qq, boolean z) {
        c3181c5.m13634ix();
        float[] fArrM25808k4 = m25808k4(c12015qq.Clone(), c3181c5, z);
        C10971um c10971um = new C10971um();
        C10950bv c10950bv = new C10950bv();
        c10950bv.m52930k4(new C10974v4(fArrM25808k4));
        c10971um.m52930k4(c10950bv);
        c10950bv.m52895k4(z);
        if (c3181c5.f9461x1.containsKey("transform")) {
            this.f17955x1.m25776k4(c3181c5, c10971um, c12015qq.Clone());
        }
        return c10971um;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10974v4 m25807k4(C3181c5 c3181c5, Dictionary<Integer, Float> dictionary, boolean z) {
        float[] fArr = new float[dictionary.size()];
        for (int i = 0; i < dictionary.size(); i++) {
            fArr[i] = dictionary.get_Item(Integer.valueOf(i)).floatValue();
        }
        return new C10974v4(fArr);
    }

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m25802k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        C12025x6 c12025x63 = new C12025x6();
        c12025x63.m56891k4((c12025x62.m56897x1() - c12025x6.m56897x1()) + c12025x62.m56897x1());
        c12025x63.m56898x1((c12025x62.m56895kk() - c12025x6.m56895kk()) + c12025x62.m56895kk());
        return c12025x63;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25803k4(C12025x6 c12025x6, C12025x6 c12025x62, C12015qq c12015qq, float f, boolean z, boolean z2, C10950bv c10950bv) {
        int i = 0;
        int[] iArr = {0};
        List<C12025x6> listM15143k4 = C3790kk.m15143k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12015qq.m56699x1(), c12015qq.m56697kk(), f, z, z2, c12025x62.m56897x1(), c12025x62.m56895kk(), iArr);
        int i2 = iArr[0];
        if (i2 == -1) {
            c10950bv.m52930k4(new C10974v4(c12025x6.Clone(), c12025x6.Clone()));
        } else {
            if (i2 == 0) {
                c10950bv.m52930k4(new C10974v4(c12025x6.Clone(), c12025x62.Clone()));
                return;
            }
            while (i < listM15143k4.size()) {
                c10950bv.m52930k4(new C10955du((i == 0 ? c12025x6 : listM15143k4.get_Item(i - 1)).Clone(), listM15143k4.get_Item(i).Clone(), listM15143k4.get_Item(i + 1).Clone(), listM15143k4.get_Item(i + 2).Clone()));
                i += 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x007a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] m25808k4(C12015qq c12015qq, C3181c5 c3181c5, boolean z) {
        boolean z2;
        String[] strArrM67417k4 = C14113y2.m67417k4(C14080ne.m66851c5(c3181c5.f9461x1.get_Item("points")), new String[]{" ", ",", "\r", IOUtils.LINE_SEPARATOR_UNIX, "\t"}, 1);
        int length = strArrM67417k4.length;
        if (z) {
            z2 = ((double) C14116yg.m67480k4(this.f17954k4.m15128k4(C14113y2.m67440x1(strArrM67417k4[0]), C14113y2.f47374k4, c3181c5) - this.f17954k4.m15128k4(C14113y2.m67440x1(strArrM67417k4[length + (-2)]), C14113y2.f47374k4, c3181c5))) > 1.0E-5d || ((double) C14116yg.m67480k4(this.f17954k4.m15128k4(C14113y2.m67440x1(strArrM67417k4[1]), C14113y2.f47374k4, c3181c5) - this.f17954k4.m15128k4(C14113y2.m67440x1(strArrM67417k4[length + (-1)]), C14113y2.f47374k4, c3181c5))) > 1.0E-5d;
        }
        int i = ((length / 2) * 2) + (z2 ? 2 : 0);
        float[] fArr = new float[i];
        for (int i2 = 2; i2 <= length; i2 += 2) {
            int i3 = i2 - 2;
            fArr[i3] = this.f17954k4.m15128k4(C14113y2.m67440x1(strArrM67417k4[i3]), C14113y2.f47374k4, c3181c5);
            int i4 = i2 - 1;
            fArr[i4] = this.f17954k4.m15128k4(C14113y2.m67440x1(strArrM67417k4[i4]), C14113y2.f47374k4, c3181c5);
        }
        if (z2) {
            fArr[i - 2] = fArr[0];
            fArr[i - 1] = fArr[1];
        }
        return fArr;
    }
}
