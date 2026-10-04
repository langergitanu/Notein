package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11242x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
class bzf {
    /* JADX INFO: renamed from: k4 */
    public static float m4396k4(C14050ca c14050ca, float f, float f2) {
        return c14050ca.m66548k4(OooO00o.OooO00o(f, 10000.0d, 14), OooO00o.OooO00o(f2, 10000.0d, 14)) / 10000.0f;
    }

    /* JADX INFO: renamed from: k4 */
    private static f7k m4397k4(C12025x6 c12025x6, C12007ix c12007ix) {
        List list = new List();
        List list2 = new List();
        list.addItem((byte) 1);
        list2.addItem(c12025x6.Clone());
        return new f7k(list, C11242x1.m54227k4((C12025x6[]) list2.toArray(new C12025x6[0]), c12007ix.Clone(), new C11913yj()));
    }

    /* JADX INFO: renamed from: k4 */
    private static f7k m4398k4(C14050ca c14050ca, C12025x6 c12025x6, C12025x6 c12025x62, C12007ix c12007ix, int i) {
        List list = new List();
        List list2 = new List();
        float fM54226k4 = C11242x1.m54226k4(c12025x6.Clone(), c12025x62.Clone());
        float f = i;
        float fM4396k4 = m4396k4(c14050ca, 0.8f, 1.0f) * f;
        C12025x6[] c12025x6Arr = null;
        while (true) {
            if (fM54226k4 / fM4396k4 < 2.0f) {
                break;
            }
            C12025x6 c12025x63 = new C12025x6(((c12025x62.m56897x1() - c12025x6.m56897x1()) / C7019kk.m27462to(Float.valueOf(r4), 13)) + c12025x6.m56897x1(), ((c12025x62.m56895kk() - c12025x6.m56895kk()) / C7019kk.m27462to(Float.valueOf(r4), 13)) + c12025x6.m56895kk());
            C12025x6[] c12025x6ArrM4401k4 = m4401k4(c14050ca, c12025x6.Clone(), c12025x63.Clone(), i);
            if (c12025x6Arr != null) {
                c12025x6ArrM4401k4[0] = new C12025x6((c12025x6.m56897x1() - c12025x6Arr[1].m56897x1()) + c12025x6.m56897x1(), (c12025x6.m56895kk() - c12025x6Arr[1].m56895kk()) + c12025x6.m56895kk());
            }
            list2.addItem(c12025x6ArrM4401k4[0].Clone());
            list2.addItem(c12025x6ArrM4401k4[1].Clone());
            list2.addItem(c12025x63.Clone());
            c12025x63.CloneTo(c12025x6);
            list.addItem((byte) 5);
            fM54226k4 = C11242x1.m54226k4(c12025x6.Clone(), c12025x62.Clone());
            c12025x6Arr = c12025x6ArrM4401k4;
            fM4396k4 = m4396k4(c14050ca, 0.8f, 1.0f) * f;
        }
        C12025x6[] c12025x6ArrM4401k42 = m4401k4(c14050ca, c12025x6.Clone(), c12025x62.Clone(), i);
        if (c12025x6Arr != null) {
            c12025x6ArrM4401k42[0] = new C12025x6((c12025x6.m56897x1() - c12025x6Arr[1].m56897x1()) + c12025x6.m56897x1(), (c12025x6.m56895kk() - c12025x6Arr[1].m56895kk()) + c12025x6.m56895kk());
        }
        list2.addItem(c12025x6ArrM4401k42[0].Clone());
        list2.addItem(c12025x6ArrM4401k42[1].Clone());
        list2.addItem(c12025x62.Clone());
        list.addItem((byte) 5);
        return new f7k(list, C11242x1.m54227k4((C12025x6[]) list2.toArray(new C12025x6[0]), c12007ix.Clone(), new C11913yj()));
    }

    /* JADX INFO: renamed from: k4 */
    private static f7k m4399k4(C12025x6[] c12025x6Arr, C12007ix c12007ix, int i) {
        List list = new List();
        List list2 = new List();
        list.addItem((byte) 5);
        float f = i == 35 ? 6.0f : i == 45 ? 8.0f : 10.0f;
        list2.addItem(new C12025x6(c12025x6Arr[1].m56897x1() + (C14116yg.m67480k4(c12025x6Arr[1].m56897x1() - c12025x6Arr[0].m56897x1()) / f), c12025x6Arr[1].m56895kk() - (C14116yg.m67480k4(c12025x6Arr[1].m56895kk() - c12025x6Arr[0].m56895kk()) / f)));
        list2.addItem(new C12025x6(c12025x6Arr[2].m56897x1() - (C14116yg.m67480k4(c12025x6Arr[3].m56897x1() - c12025x6Arr[2].m56897x1()) / f), c12025x6Arr[2].m56895kk() + (C14116yg.m67480k4(c12025x6Arr[3].m56895kk() - c12025x6Arr[2].m56895kk()) / f)));
        list2.addItem(c12025x6Arr[3].Clone());
        return new f7k(list, C11242x1.m54227k4((C12025x6[]) list2.toArray(new C12025x6[0]), c12007ix.Clone(), new C11913yj()));
    }

    /* JADX INFO: renamed from: k4 */
    public static f7k[] m4400k4(C14050ca c14050ca, C12007ix c12007ix, ShapeElement[] shapeElementArr, int i) {
        byte b;
        char c;
        char c2 = 2;
        f7k[] f7kVarArr = new f7k[shapeElementArr.length];
        int iM27462to = i == 1 ? C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13) + 1 : i == 2 ? 45 : 35;
        int i2 = 0;
        while (i2 < shapeElementArr.length) {
            f7k f7kVar = new f7k();
            C11896dy c11896dyM2656k4 = shapeElementArr[i2].m2656k4();
            C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
            int i3 = 0;
            int i4 = 0;
            while (i3 < c11896dyM2656k4.m55571to().length) {
                int i5 = c11896dyM2656k4.m55571to()[i3] & 7;
                if (i5 == 0) {
                    b = 0;
                    f7k f7kVarM4397k4 = m4397k4(c11896dyM2656k4.m55565kk()[i4].Clone(), c12007ix.Clone());
                    f7kVar.m6040k4(f7kVarM4397k4.m6043m9(), f7kVarM4397k4.m6041k4());
                    c11896dyM2656k4.m55565kk()[i4].CloneTo(c12025x6Clone);
                } else {
                    b = 0;
                }
                if (i5 == 1) {
                    c = c2;
                    f7k f7kVarM4398k4 = m4398k4(c14050ca, c11896dyM2656k4.m55565kk()[i4 - 1].Clone(), c11896dyM2656k4.m55565kk()[i4].Clone(), c12007ix.Clone(), iM27462to);
                    f7kVar.m6040k4(f7kVarM4398k4.m6043m9(), f7kVarM4398k4.m6041k4());
                } else {
                    c = c2;
                }
                if (i5 == 3) {
                    C12025x6 c12025x6 = c11896dyM2656k4.m55565kk()[i4 - 1];
                    C12025x6 c12025x62 = c11896dyM2656k4.m55565kk()[i4];
                    C12025x6 c12025x63 = c11896dyM2656k4.m55565kk()[i4 + 1];
                    i4 += 2;
                    f7k f7kVarM4399k4 = m4399k4(new C12025x6[]{c12025x6, c12025x62, c12025x63, c11896dyM2656k4.m55565kk()[i4]}, c12007ix.Clone(), iM27462to);
                    f7kVar.m6040k4(f7kVarM4399k4.m6043m9(), f7kVarM4399k4.m6041k4());
                    i3 += 2;
                }
                if ((c11896dyM2656k4.m55571to()[i3] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    f7k f7kVarM4398k42 = m4398k4(c14050ca, c11896dyM2656k4.m55565kk()[i4].Clone(), c12025x6Clone.Clone(), c12007ix.Clone(), iM27462to);
                    f7kVar.m6040k4(f7kVarM4398k42.m6043m9(), f7kVarM4398k42.m6041k4());
                    byte[] bArr = new byte[1];
                    bArr[b] = b;
                    f7kVar.m6040k4(bArr, (long[]) null);
                }
                i3++;
                i4++;
                c2 = c;
            }
            char c3 = c2;
            f7kVar.m6047x1(C7019kk.m27438h4(Float.valueOf(c12007ix.m56575x1() * 12700.0f), 13));
            f7kVar.m6037k4(C7019kk.m27438h4(Float.valueOf(c12007ix.m56550c5() * 12700.0f), 13));
            f7kVar.m6039k4(shapeElementArr[i2].getStrokeSource() == 1);
            f7kVarArr[i2] = f7kVar;
            i2++;
            c2 = c3;
        }
        return f7kVarArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6[] m4401k4(C14050ca c14050ca, C12025x6 c12025x6, C12025x6 c12025x62, int i) {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        float fM4396k4 = m4396k4(c14050ca, 2.0f, 5.0f);
        float fM56897x1 = (c12025x62.m56897x1() - c12025x6.m56897x1()) / C14116yg.m67480k4(fM4396k4);
        float fM56895kk = (c12025x62.m56895kk() - c12025x6.m56895kk()) / C14116yg.m67480k4(fM4396k4);
        float fM54226k4 = C11242x1.m54226k4(c12025x6.Clone(), c12025x62.Clone()) / (i == 45 ? 25.0f : 10.0f);
        float f = -fM54226k4;
        C12015qq c12015qqClone = C11242x1.m54228k4(c12025x6.Clone(), c12025x62.Clone(), m4396k4(c14050ca, C14116yg.m67481k4(f, -12.0f), C14116yg.m67504x1(fM54226k4, 12.0f))).Clone();
        C12025x6.m56881k4(new C12025x6(c12025x6.m56897x1() + fM56897x1, c12025x6.m56895kk() + fM56895kk), c12015qqClone).CloneTo(c12025x6Arr[0]);
        C11242x1.m54228k4(c12025x6.Clone(), c12025x62.Clone(), m4396k4(c14050ca, C14116yg.m67481k4(f, -12.0f), C14116yg.m67504x1(fM54226k4, 12.0f))).CloneTo(c12015qqClone);
        C12025x6.m56881k4(new C12025x6(c12025x62.m56897x1() - fM56897x1, c12025x62.m56895kk() - fM56895kk), c12015qqClone).CloneTo(c12025x6Arr[1]);
        return c12025x6Arr;
    }
}
