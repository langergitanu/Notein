package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class wh5 extends er8 {
    public wh5(Ink ink) {
        super(ink);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m72750k4(int i, int i2) {
        long j = ((long) i2) & 4294967295L;
        if (((i >> 24) & 255) != 0) {
            j = ((long) (i & i2)) & 4294967295L;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: k4 */
    public final Ink m72754k4() {
        return (Ink) m5629du();
    }

    /* JADX INFO: renamed from: k4 */
    private void m72751k4(C12009k4 c12009k4, C12009k4 c12009k42) {
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15757m9 = c12009k4.mo15757m9();
        C3983k4 c3983k4M56597k4 = c12009k42.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 1, 2498570);
        C3983k4 c3983k4M56597k42 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, 2498570);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        C14112xw c14112xwM15721to2 = c3983k4M56597k42.m15721to();
        int i = iMo15760yj * iMo15757m9;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        C3914k4.m15619k4(c14112xwM15721to, iArr, 0, i);
        C3914k4.m15619k4(c14112xwM15721to2, iArr2, 0, i);
        for (int i2 = 0; i2 < iMo15757m9; i2++) {
            for (int i3 = 0; i3 < iMo15760yj; i3++) {
                int i4 = (i2 * iMo15760yj) + i3;
                iArr2[i4] = m72750k4(iArr[i4], iArr2[i4]);
            }
        }
        C3914k4.m15622k4(iArr2, 0, c14112xwM15721to2, i);
        c12009k42.m56605k4(c3983k4M56597k4);
        c12009k4.m56605k4(c3983k4M56597k42);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72752k4(oxb oxbVar, List<InkTrace> list) {
        List.Enumerator<InkTrace> it = oxbVar.m68897x1().iterator();
        while (it.hasNext()) {
            try {
                m72752k4(it.next(), list);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = oxbVar.m68891k4().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0687 A[Catch: all -> 0x00dd, TryCatch #3 {all -> 0x00dd, blocks: (B:7:0x009b, B:10:0x00ba, B:12:0x00c4, B:17:0x00e4, B:19:0x00ea, B:24:0x0131, B:27:0x0161, B:28:0x0178, B:30:0x0182, B:31:0x0196, B:33:0x019c, B:35:0x01b8, B:36:0x01ca, B:38:0x01e4, B:39:0x01f6, B:41:0x0210, B:42:0x021a, B:43:0x0220, B:44:0x0236, B:46:0x0245, B:48:0x0255, B:52:0x0324, B:53:0x0328, B:55:0x0332, B:57:0x03cf, B:59:0x03db, B:60:0x040c, B:62:0x0418, B:64:0x0424, B:65:0x0447, B:67:0x0453, B:69:0x045f, B:70:0x0490, B:72:0x049c, B:74:0x04a8, B:75:0x04cb, B:77:0x04d7, B:79:0x04e3, B:80:0x0506, B:82:0x0512, B:84:0x051e, B:85:0x054f, B:87:0x055b, B:89:0x0567, B:90:0x058a, B:92:0x0596, B:94:0x05a2, B:95:0x05d3, B:97:0x05d9, B:101:0x05f8, B:103:0x05fe, B:108:0x0699, B:110:0x06a6, B:112:0x06b0, B:107:0x0687, B:23:0x00f4), top: B:143:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06a6 A[Catch: all -> 0x00dd, TryCatch #3 {all -> 0x00dd, blocks: (B:7:0x009b, B:10:0x00ba, B:12:0x00c4, B:17:0x00e4, B:19:0x00ea, B:24:0x0131, B:27:0x0161, B:28:0x0178, B:30:0x0182, B:31:0x0196, B:33:0x019c, B:35:0x01b8, B:36:0x01ca, B:38:0x01e4, B:39:0x01f6, B:41:0x0210, B:42:0x021a, B:43:0x0220, B:44:0x0236, B:46:0x0245, B:48:0x0255, B:52:0x0324, B:53:0x0328, B:55:0x0332, B:57:0x03cf, B:59:0x03db, B:60:0x040c, B:62:0x0418, B:64:0x0424, B:65:0x0447, B:67:0x0453, B:69:0x045f, B:70:0x0490, B:72:0x049c, B:74:0x04a8, B:75:0x04cb, B:77:0x04d7, B:79:0x04e3, B:80:0x0506, B:82:0x0512, B:84:0x051e, B:85:0x054f, B:87:0x055b, B:89:0x0567, B:90:0x058a, B:92:0x0596, B:94:0x05a2, B:95:0x05d3, B:97:0x05d9, B:101:0x05f8, B:103:0x05fe, B:108:0x0699, B:110:0x06a6, B:112:0x06b0, B:107:0x0687, B:23:0x00f4), top: B:143:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0182 A[Catch: all -> 0x00dd, TryCatch #3 {all -> 0x00dd, blocks: (B:7:0x009b, B:10:0x00ba, B:12:0x00c4, B:17:0x00e4, B:19:0x00ea, B:24:0x0131, B:27:0x0161, B:28:0x0178, B:30:0x0182, B:31:0x0196, B:33:0x019c, B:35:0x01b8, B:36:0x01ca, B:38:0x01e4, B:39:0x01f6, B:41:0x0210, B:42:0x021a, B:43:0x0220, B:44:0x0236, B:46:0x0245, B:48:0x0255, B:52:0x0324, B:53:0x0328, B:55:0x0332, B:57:0x03cf, B:59:0x03db, B:60:0x040c, B:62:0x0418, B:64:0x0424, B:65:0x0447, B:67:0x0453, B:69:0x045f, B:70:0x0490, B:72:0x049c, B:74:0x04a8, B:75:0x04cb, B:77:0x04d7, B:79:0x04e3, B:80:0x0506, B:82:0x0512, B:84:0x051e, B:85:0x054f, B:87:0x055b, B:89:0x0567, B:90:0x058a, B:92:0x0596, B:94:0x05a2, B:95:0x05d3, B:97:0x05d9, B:101:0x05f8, B:103:0x05fe, B:108:0x0699, B:110:0x06a6, B:112:0x06b0, B:107:0x0687, B:23:0x00f4), top: B:143:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0245 A[Catch: all -> 0x00dd, TryCatch #3 {all -> 0x00dd, blocks: (B:7:0x009b, B:10:0x00ba, B:12:0x00c4, B:17:0x00e4, B:19:0x00ea, B:24:0x0131, B:27:0x0161, B:28:0x0178, B:30:0x0182, B:31:0x0196, B:33:0x019c, B:35:0x01b8, B:36:0x01ca, B:38:0x01e4, B:39:0x01f6, B:41:0x0210, B:42:0x021a, B:43:0x0220, B:44:0x0236, B:46:0x0245, B:48:0x0255, B:52:0x0324, B:53:0x0328, B:55:0x0332, B:57:0x03cf, B:59:0x03db, B:60:0x040c, B:62:0x0418, B:64:0x0424, B:65:0x0447, B:67:0x0453, B:69:0x045f, B:70:0x0490, B:72:0x049c, B:74:0x04a8, B:75:0x04cb, B:77:0x04d7, B:79:0x04e3, B:80:0x0506, B:82:0x0512, B:84:0x051e, B:85:0x054f, B:87:0x055b, B:89:0x0567, B:90:0x058a, B:92:0x0596, B:94:0x05a2, B:95:0x05d3, B:97:0x05d9, B:101:0x05f8, B:103:0x05fe, B:108:0x0699, B:110:0x06a6, B:112:0x06b0, B:107:0x0687, B:23:0x00f4), top: B:143:0x009b }] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72753k4(AbstractC14897zn abstractC14897zn, List<InkTrace> list, kg7 kg7Var, C12007ix c12007ix) throws Throwable {
        List.Enumerator<InkTrace> enumerator;
        List.Enumerator<InkTrace> enumerator2;
        InkTrace inkTrace;
        AbstractC14897zn abstractC14897zn2;
        int i;
        boolean z;
        float f;
        float f2;
        boolean z2;
        AbstractC14897zn abstractC14897zn3 = abstractC14897zn;
        float fMo15752dy = abstractC14897zn3.m74625qq().mo15752dy() / abstractC14897zn3.mo67707du();
        float fMo15758up = abstractC14897zn3.m74625qq().mo15758up() / abstractC14897zn3.mo67709h4();
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55578x1(new C12007ix(0.0f, 0.0f, 100.0f, 50.0f));
        ajz ajzVar = new ajz(m5631fa().cloneT(), abstractC14897zn3.m74623ks(), c11896dy, m5642m9(), kg7Var);
        azo azoVar = new azo(ajzVar, m5629du().m2571lr());
        boolean z3 = true;
        azoVar.m3911k4(true);
        azoVar.m3908k4((byte) 0);
        C0962es c0962esM5669x1 = C0962es.m5669x1(ajzVar, m5629du().f3303dy);
        List.Enumerator<InkTrace> it = list.iterator();
        while (it.hasNext()) {
            try {
                try {
                    InkTrace next = it.next();
                    C12009k4 c12009k4M74625qq = abstractC14897zn3.m74625qq();
                    List list2 = new List();
                    List list3 = new List();
                    C12015qq c12015qqClone = ((InkBrush) next.getBrush()).m1800x1().Clone();
                    enumerator2 = it;
                    try {
                        azoVar.m3909k4(c12015qqClone.m56699x1());
                        azoVar.m3910k4(next.m1828up().Clone());
                        if (((InkBrush) next.getBrush()).m1798to() != 2) {
                            inkTrace = next;
                            abstractC14897zn2 = abstractC14897zn;
                            C12009k4 c12009k4 = c12009k4M74625qq;
                            c0962esM5669x1.m5678k4(azoVar.m3916m9().Clone());
                            c0962esM5669x1.m5683x1(azoVar.m3916m9().Clone());
                            i = 0;
                            while (i < inkTrace.m1829x1().size()) {
                                C12025x6 c12025x6 = new C12025x6();
                                List<Float> list4 = inkTrace.m1829x1().get_Item(i);
                                int i2 = i;
                                int i3 = 0;
                                float fFloatValue = 0.0f;
                                while (i3 < list4.size()) {
                                    C12015qq c12015qq = c12015qqClone;
                                    if ("X".equals(inkTrace.m1815fa().m4707x1().get_Item(i3).m69657x1())) {
                                        c12025x6.m56891k4(list4.get_Item(i3).floatValue() - c12007ix.m56571to());
                                    }
                                    if ("Y".equals(inkTrace.m1815fa().m4707x1().get_Item(i3).m69657x1())) {
                                        c12025x6.m56898x1(list4.get_Item(i3).floatValue() - c12007ix.m56554dy());
                                    }
                                    if ("F".equals(inkTrace.m1815fa().m4707x1().get_Item(i3).m69657x1())) {
                                        fFloatValue = list4.get_Item(i3).floatValue();
                                    }
                                    i3++;
                                    c12015qqClone = c12015qq;
                                }
                                list2.addItem(c12025x6.Clone());
                                list3.addItem(Float.valueOf(fFloatValue));
                                i = i2 + 1;
                                c12015qqClone = c12015qqClone;
                            }
                            C12015qq c12015qq2 = c12015qqClone;
                            if (((InkBrush) inkTrace.getBrush()).m1793kk() == 1) {
                                azoVar.m3909k4(1.0d);
                                new List();
                                if (list2.size() > 0) {
                                    C11896dy c11896dy2 = new C11896dy();
                                    List list5 = new List();
                                    C12025x6 c12025x6Clone = ((C12025x6) list2.get_Item(0)).Clone();
                                    C12025x6 c12025x62 = new C12025x6(c12025x6Clone.m56897x1() - (c12015qq2.m56699x1() / 2.0f), (c12015qq2.m56697kk() / 2.0f) + c12025x6Clone.m56895kk());
                                    list5.addItem(c12025x62.Clone());
                                    C12025x6 c12025x63 = c12025x62;
                                    C12025x6 c12025x64 = new C12025x6((c12015qq2.m56699x1() / 2.0f) + c12025x6Clone.m56897x1(), (c12015qq2.m56697kk() / 2.0f) + c12025x6Clone.m56895kk());
                                    list5.addItem(c12025x64.Clone());
                                    f = fMo15752dy;
                                    C12025x6 c12025x65 = new C12025x6((c12015qq2.m56699x1() / 2.0f) + c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk() - (c12015qq2.m56697kk() / 2.0f));
                                    list5.addItem(c12025x65.Clone());
                                    C12025x6 c12025x66 = c12025x65;
                                    C12025x6 c12025x67 = new C12025x6(c12025x6Clone.m56897x1() - (c12015qq2.m56699x1() / 2.0f), c12025x6Clone.m56895kk() - (c12015qq2.m56697kk() / 2.0f));
                                    list5.addItem(c12025x67.Clone());
                                    list5.addItem(c12025x63.Clone());
                                    c11896dy2.m55570to((C12025x6[]) list5.toArray(new C12025x6[0]));
                                    abstractC14897zn2.mo64338k4(c11896dy2, (azoVar.m3916m9().m56501c5() & 255) < 255 ? null : azoVar, c0962esM5669x1);
                                    int i4 = 0;
                                    while (true) {
                                        z = true;
                                        if (i4 >= list2.size() - 1) {
                                            break;
                                        }
                                        List list6 = new List();
                                        int i5 = i4 + 1;
                                        C12025x6 c12025x6Clone2 = ((C12025x6) list2.get_Item(i5)).Clone();
                                        C12025x6 c12025x68 = c12025x67;
                                        float f3 = fMo15758up;
                                        C12025x6 c12025x69 = new C12025x6(c12025x6Clone2.m56897x1() - (c12015qq2.m56699x1() / 2.0f), (c12015qq2.m56697kk() / 2.0f) + c12025x6Clone2.m56895kk());
                                        C12025x6 c12025x610 = new C12025x6((c12015qq2.m56699x1() / 2.0f) + c12025x6Clone2.m56897x1(), (c12015qq2.m56697kk() / 2.0f) + c12025x6Clone2.m56895kk());
                                        C12025x6 c12025x611 = new C12025x6((c12015qq2.m56699x1() / 2.0f) + c12025x6Clone2.m56897x1(), c12025x6Clone2.m56895kk() - (c12015qq2.m56697kk() / 2.0f));
                                        C12025x6 c12025x612 = new C12025x6(c12025x6Clone2.m56897x1() - (c12015qq2.m56699x1() / 2.0f), c12025x6Clone2.m56895kk() - (c12015qq2.m56697kk() / 2.0f));
                                        if (c12025x6Clone.m56897x1() < c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() > c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x68.Clone());
                                            list6.addItem(c12025x612.Clone());
                                            list6.addItem(c12025x611.Clone());
                                            list6.addItem(c12025x610.Clone());
                                            list6.addItem(c12025x64.Clone());
                                            list6.addItem(c12025x66.Clone());
                                            list6.addItem(c12025x68.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() == c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() > c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x68.Clone());
                                            list6.addItem(c12025x612.Clone());
                                            list6.addItem(c12025x611.Clone());
                                            list6.addItem(c12025x66.Clone());
                                            list6.addItem(c12025x68.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() > c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() > c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x63.Clone());
                                            list6.addItem(c12025x69.Clone());
                                            list6.addItem(c12025x612.Clone());
                                            list6.addItem(c12025x611.Clone());
                                            list6.addItem(c12025x66.Clone());
                                            list6.addItem(c12025x68.Clone());
                                            list6.addItem(c12025x63.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() < c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() == c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x66.Clone());
                                            list6.addItem(c12025x611.Clone());
                                            list6.addItem(c12025x610.Clone());
                                            list6.addItem(c12025x64.Clone());
                                            list6.addItem(c12025x66.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() > c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() == c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x68.Clone());
                                            list6.addItem(c12025x612.Clone());
                                            list6.addItem(c12025x69.Clone());
                                            list6.addItem(c12025x63.Clone());
                                            list6.addItem(c12025x68.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() < c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() < c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x63.Clone());
                                            list6.addItem(c12025x69.Clone());
                                            list6.addItem(c12025x610.Clone());
                                            list6.addItem(c12025x611.Clone());
                                            list6.addItem(c12025x66.Clone());
                                            list6.addItem(c12025x64.Clone());
                                            list6.addItem(c12025x63.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() == c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() < c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x63.Clone());
                                            list6.addItem(c12025x64.Clone());
                                            list6.addItem(c12025x610.Clone());
                                            list6.addItem(c12025x69.Clone());
                                            list6.addItem(c12025x63.Clone());
                                        }
                                        if (c12025x6Clone.m56897x1() > c12025x6Clone2.m56897x1() && c12025x6Clone.m56895kk() < c12025x6Clone2.m56895kk()) {
                                            list6.addItem(c12025x68.Clone());
                                            list6.addItem(c12025x612.Clone());
                                            list6.addItem(c12025x69.Clone());
                                            list6.addItem(c12025x610.Clone());
                                            list6.addItem(c12025x64.Clone());
                                            list6.addItem(c12025x63.Clone());
                                            list6.addItem(c12025x68.Clone());
                                        }
                                        if (list6.size() > 0) {
                                            c11896dy2.m55527fa();
                                            c11896dy2.m55570to((C12025x6[]) list6.toArray(new C12025x6[0]));
                                            abstractC14897zn2.mo64338k4(c11896dy2, (azoVar.m3916m9().m56501c5() & 255) < 255 ? null : azoVar, c0962esM5669x1);
                                        }
                                        c12025x6Clone2.CloneTo(c12025x6Clone);
                                        C12025x6 c12025x613 = new C12025x6(c12025x6Clone.m56897x1() - (c12015qq2.m56699x1() / 2.0f), (c12015qq2.m56697kk() / 2.0f) + c12025x6Clone.m56895kk());
                                        c12025x64 = new C12025x6((c12015qq2.m56699x1() / 2.0f) + c12025x6Clone.m56897x1(), (c12015qq2.m56697kk() / 2.0f) + c12025x6Clone.m56895kk());
                                        c12025x63 = c12025x613;
                                        c12025x66 = new C12025x6((c12015qq2.m56699x1() / 2.0f) + c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk() - (c12015qq2.m56697kk() / 2.0f));
                                        c12025x67 = new C12025x6(c12025x6Clone.m56897x1() - (c12015qq2.m56699x1() / 2.0f), c12025x6Clone.m56895kk() - (c12015qq2.m56697kk() / 2.0f));
                                        i4 = i5;
                                        fMo15758up = f3;
                                    }
                                } else {
                                    f = fMo15752dy;
                                    z = true;
                                }
                                f2 = fMo15758up;
                                z2 = false;
                            } else {
                                z = true;
                                f = fMo15752dy;
                                f2 = fMo15758up;
                                z2 = false;
                                abstractC14897zn2.m74614k4(azoVar, (C12025x6[]) list2.toArray(new C12025x6[0]));
                            }
                            if (((InkBrush) inkTrace.getBrush()).m1798to() != 2 || kg7Var.m63847m9().getInterpretMaskOpAsOpacity()) {
                                abstractC14897zn3 = abstractC14897zn;
                            } else {
                                try {
                                    m72751k4(c12009k4, abstractC14897zn2.m74625qq());
                                    abstractC14897zn3 = abstractC14897zn;
                                    abstractC14897zn3.mo64339k4(c12009k4, -abstractC14897zn.m74623ks().m17330dy(), -abstractC14897zn.m74623ks().m17328c5(), abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy());
                                    if (C7019kk.m27469x1(abstractC14897zn3, C14250os.class) || C7019kk.m27469x1(abstractC14897zn3, vhx.class)) {
                                        c12009k4.dispose();
                                        abstractC14897zn2.dispose();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    enumerator = enumerator2;
                                    if (C7019kk.m27456k4((Iterator) enumerator, (Class<IDisposable>) IDisposable.class)) {
                                    }
                                    throw th;
                                }
                            }
                            it = enumerator2;
                            z3 = z;
                            fMo15752dy = f;
                            fMo15758up = f2;
                        } else if (kg7Var.m63847m9().getInterpretMaskOpAsOpacity()) {
                            azoVar.m3910k4(C12003du.m56400k4(128, next.m1828up().Clone()).Clone());
                            inkTrace = next;
                            abstractC14897zn2 = abstractC14897zn;
                            C12009k4 c12009k42 = c12009k4M74625qq;
                            c0962esM5669x1.m5678k4(azoVar.m3916m9().Clone());
                            c0962esM5669x1.m5683x1(azoVar.m3916m9().Clone());
                            i = 0;
                            while (i < inkTrace.m1829x1().size()) {
                            }
                            C12015qq c12015qq22 = c12015qqClone;
                            if (((InkBrush) inkTrace.getBrush()).m1793kk() == 1) {
                            }
                            if (((InkBrush) inkTrace.getBrush()).m1798to() != 2) {
                                abstractC14897zn3 = abstractC14897zn;
                            }
                            it = enumerator2;
                            z3 = z;
                            fMo15752dy = f;
                            fMo15758up = f2;
                        } else {
                            if (C7019kk.m27469x1(abstractC14897zn3, C14250os.class) || C7019kk.m27469x1(abstractC14897zn3, vhx.class)) {
                                RenderingOptions renderingOptions = new RenderingOptions();
                                renderingOptions.getInkOptions().setHideInk(z3);
                                inkTrace = next;
                                c12009k4M74625qq = ((Slide) m5642m9()).m2691k4(renderingOptions, new C12023wl(C7019kk.m27462to(Float.valueOf(abstractC14897zn3.mo67711m9() * fMo15752dy), 13), C7019kk.m27462to(Float.valueOf(abstractC14897zn.mo67708dy() * fMo15758up), 13)));
                            } else {
                                inkTrace = next;
                            }
                            C12009k4 c12009k43 = new C12009k4(c12009k4M74625qq.mo15760yj(), c12009k4M74625qq.mo15757m9(), c12009k4M74625qq.mo15753jd());
                            c12009k43.m56603k4();
                            omq omqVar = new omq(c12009k43, abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy());
                            omqVar.m74622kk(abstractC14897zn.m74623ks());
                            abstractC14897zn2 = omqVar;
                            C12009k4 c12009k422 = c12009k4M74625qq;
                            c0962esM5669x1.m5678k4(azoVar.m3916m9().Clone());
                            c0962esM5669x1.m5683x1(azoVar.m3916m9().Clone());
                            i = 0;
                            while (i < inkTrace.m1829x1().size()) {
                            }
                            C12015qq c12015qq222 = c12015qqClone;
                            if (((InkBrush) inkTrace.getBrush()).m1793kk() == 1) {
                            }
                            if (((InkBrush) inkTrace.getBrush()).m1798to() != 2) {
                            }
                            it = enumerator2;
                            z3 = z;
                            fMo15752dy = f;
                            fMo15758up = f2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    enumerator2 = it;
                }
            } catch (Throwable th4) {
                th = th4;
                enumerator = it;
            }
            if (C7019kk.m27456k4((Iterator) enumerator, (Class<IDisposable>) IDisposable.class)) {
                enumerator.dispose();
            }
            throw th;
        }
        List.Enumerator<InkTrace> enumerator3 = it;
        if (C7019kk.m27456k4((Iterator) enumerator3, (Class<IDisposable>) IDisposable.class)) {
            enumerator3.dispose();
        }
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) throws Throwable {
        List.Enumerator<oxb> it;
        if (m5629du().getHidden() || kg7Var.m63847m9().getHideInk()) {
            return;
        }
        interruptionToken.throwIfInterruptionRequested();
        ShapeFrame shapeFrameM5631fa = m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return;
        }
        if (shapeFrameM5631fa.getWidth() == 0.0f && shapeFrameM5631fa.getHeight() == 0.0f) {
            return;
        }
        List<InkTrace> list = new List<>();
        if (m72754k4().m1773kk().size() > 0) {
            it = m72754k4().m1773kk().iterator();
            while (it.hasNext()) {
                try {
                    m72752k4(it.next(), list);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        it = m72754k4().m1771k4().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C11896dy c11896dy = new C11896dy();
        it = list.iterator();
        while (it.hasNext()) {
            try {
                c11896dy.m55564kk(it.next().m1818k4(C12023wl.m56853k4(new C12023wl(0, 0)).Clone()).toArray(new C12025x6[0]));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        boolean z = true;
        C4317dy c4317dy = new C4317dy(shapeFrameM5631fa.getFlipH() == 1 ? -1.0f : 1.0f, 0.0f, 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? -1.0f : 1.0f, shapeFrameM5631fa.getFlipH() == 1 ? shapeFrameM5631fa.getCenterX() * 2.0f : 0.0f, shapeFrameM5631fa.getFlipV() == 1 ? shapeFrameM5631fa.getCenterY() * 2.0f : 0.0f);
        if (!C14064he.m66715kk(shapeFrameM5631fa.getRotation())) {
            boolean z2 = shapeFrameM5631fa.getFlipH() == 1;
            if (shapeFrameM5631fa.getFlipV() != 1) {
                z = false;
            }
            c4317dy.m17339k4(z ^ z2 ? -shapeFrameM5631fa.getRotation() : shapeFrameM5631fa.getRotation(), new C12025x6(shapeFrameM5631fa.getCenterX(), shapeFrameM5631fa.getCenterY()), 0);
        }
        c4317dy.m17348x1(x, y);
        if (c12007ixClone.m56550c5() != 0.0f && c12007ixClone.m56575x1() != 0.0f) {
            c4317dy.m17335k4(width / c12007ixClone.m56550c5(), c12007ixClone.m56575x1() >= list.get_Item(0).getBrush().getSize().getWidth() ? height / c12007ixClone.m56575x1() : 1.0f);
        }
        abstractC14897zn.m74622kk(c4317dy);
        m72753k4(abstractC14897zn, list, kg7Var, c12007ixClone.Clone());
        abstractC14897zn.m74626rv();
    }
}
