package com.aspose.slides.internal.p500xi;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p132fj.C4032ks;
import com.aspose.slides.internal.p132fj.C4036m9;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4055uz;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.AbstractC6751c5;
import com.aspose.slides.internal.p294n9.AbstractC6769ne;
import com.aspose.slides.internal.p294n9.C6777u4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p344pt.C9527qq;
import com.aspose.slides.internal.p349q3.C9666k4;
import com.aspose.slides.internal.p349q3.C9704ss;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p438ub.C11301k4;
import com.aspose.slides.internal.p438ub.C11302kk;
import com.aspose.slides.internal.p454v0.C11600k4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.internal.p488x0.C12333du;
import com.aspose.slides.internal.p488x0.C12338jd;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xi.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12531h4 {
    /* JADX INFO: renamed from: k4 */
    private static List<String> m58338k4(String str, int i) {
        List<String> list = new List<>();
        float f = i + 2;
        if (!C14113y2.m67411k4(str)) {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(200, 200));
            C12019um c12019um = new C12019um(C12019um.m56799c5());
            c12019um.m56817kk(c12019um.m56816kk() | 2048);
            C12013m9 c12013m9 = new C12013m9("Segoe UI", 8.0f);
            int i2 = 0;
            String strM67441x1 = "";
            while (true) {
                if (i2 >= str.length()) {
                    break;
                }
                strM67441x1 = C14113y2.m67441x1(strM67441x1, str.charAt(i2));
                if (abstractC12008jdM56582k4.mo17490k4(strM67441x1, c12013m9, new C12025x6(0.0f, 0.0f), c12019um).m56699x1() > f) {
                    if (C14113y2.m67359c5(strM67441x1, " ") && list.size() == 0 && str.charAt(i2) != ' ') {
                        while (str.charAt(i2) != ' ') {
                            i2--;
                        }
                    } else {
                        i2--;
                    }
                    if (list.size() != 0) {
                        list.addItem(C14113y2.m67443x1(strM67441x1, 0, (i2 - list.get_Item(0).length()) - 1));
                        break;
                    }
                    list.addItem(C14113y2.m67443x1(str, 0, i2 + 1));
                    strM67441x1 = "";
                }
                i2++;
            }
            if (list.size() == 0) {
                list.addItem(strM67441x1);
                return list;
            }
            if (list.size() == 1) {
                list.addItem(strM67441x1);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static byte[] m58345x1(C3152yj c3152yj, String[] strArr) throws Throwable {
        strArr[0] = "";
        List list = new List();
        List list2 = new List();
        C11301k4 c11301k4 = new C11301k4(c3152yj);
        try {
            IGenericEnumerator<C12535to> it = ((C3180k4) c11301k4.m54288k4()).m58364k4().iterator();
            while (it.hasNext()) {
                try {
                    C9723vw c9723vw = (C9723vw) it.next();
                    if (c9723vw.m47767v4() == 114) {
                        list.addItem(((C9666k4) C7019kk.m27452k4((Object) c9723vw, C9666k4.class)).m47373ix().m57639x1((C12533kk) null));
                    }
                    if (c9723vw.m47767v4() == 84) {
                        list2.addItem(AbstractC6747ar.m26643rv().m26681x1(((C9704ss) C7019kk.m27452k4((Object) c9723vw, C9704ss.class)).m47638h4().m25666dy()));
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
            c11301k4.dispose();
            if (list2.size() <= 2) {
                List.Enumerator it2 = list2.iterator();
                while (it2.hasNext()) {
                    try {
                        strArr[0] = C14113y2.m67400k4(strArr[0], (String) it2.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
            }
            if (list.size() != 1) {
                return c3152yj.toArray();
            }
            C3152yj c3152yj2 = new C3152yj();
            ((C12009k4) OooO0O0.OooO00o(list, 1)).m56603k4();
            ((C12009k4) list.get_Item(list.size() - 1)).m56333k4(c3152yj2, C3977ck.m15681jd());
            return c3152yj2.toArray();
        } catch (Throwable th2) {
            c11301k4.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12331c5 m58339k4(C12009k4 c12009k4) {
        C12331c5 c12331c5 = new C12331c5();
        byte[] bArrM58346x1 = m58346x1(c12009k4);
        C12333du c12333du = new C12333du();
        c12333du.m57761x1(24);
        c12333du.m57758k4(40L);
        c12333du.m57757k4(1);
        c12333du.m57659kk(c12009k4.mo15760yj());
        c12333du.m57663to(c12009k4.mo15757m9());
        c12333du.m57660kk(((long) bArrM58346x1.length) & 4294967295L);
        c12331c5.m57631k4(c12333du);
        c12331c5.m57632k4(new byte[0]);
        c12331c5.m57640x1(bArrM58346x1);
        return c12331c5;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m58340k4(C4055uz c4055uz, C4036m9 c4036m9, String str, int i) {
        c4055uz.m16137k4(str);
        AbstractC6747ar abstractC6747arM58552k4 = C12555c5.m58552k4(1252);
        if (i != 1252) {
            try {
                c4055uz.m16139k4(AbstractC6747ar.m26636k4(i, AbstractC6769ne.m26821to(), AbstractC6751c5.m26733to()).mo26677to(str));
                c4036m9.m16023k4().m57738to(C9527qq.m46691x1(i));
            } catch (C6777u4 unused) {
                c4055uz.m16139k4(abstractC6747arM58552k4.mo26677to(str));
            }
        } else {
            c4055uz.m16139k4(abstractC6747arM58552k4.mo26677to(str));
        }
        int length = c4055uz.m16143m9().length;
        c4055uz.m16142kk((short) length);
        c4055uz.m16066x1(((((long) (length % 2 > 0 ? length + 23 : length + 22)) & 4294967295L) / 2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static byte[] m58341k4(C3152yj c3152yj, String[] strArr) {
        List.Enumerator it;
        strArr[0] = "";
        List list = new List();
        List list2 = new List();
        C11302kk c11302kk = new C11302kk(c3152yj);
        try {
            IGenericEnumerator<C12535to> it2 = ((C11600k4) c11302kk.m54290k4()).m58364k4().iterator();
            C12338jd c12338jdM16023k4 = null;
            while (it2.hasNext()) {
                try {
                    C4047sv c4047sv = (C4047sv) it2.next();
                    if (c4047sv.m16063ks() == 2881) {
                        list.addItem(((C4032ks) C7019kk.m27452k4((Object) c4047sv, C4032ks.class)).m16006fa().m57639x1((C12533kk) null));
                    }
                    C4036m9 c4036m9 = (C4036m9) C7019kk.m27452k4((Object) c4047sv, C4036m9.class);
                    if (c4036m9 != null) {
                        c12338jdM16023k4 = c4036m9.m16023k4();
                    }
                    if (c4047sv.m16063ks() == 2610) {
                        C4055uz c4055uz = (C4055uz) C7019kk.m27452k4((Object) c4047sv, C4055uz.class);
                        String strM26681x1 = c12338jdM16023k4 != null ? C9527qq.m46686k4(c12338jdM16023k4.m57722jd(), c12338jdM16023k4.m57735ne()).m26681x1(c4055uz.m16143m9()) : C12555c5.m58552k4(1252).m26681x1(c4055uz.m16143m9());
                        if (!C14113y2.m67411k4(strM26681x1)) {
                            if (strM26681x1.charAt(strM26681x1.length() - 1) == 0) {
                                strM26681x1 = C14113y2.m67443x1(strM26681x1, 0, strM26681x1.length() - 1);
                            }
                            list2.addItem(strM26681x1);
                        }
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
            c11302kk.dispose();
            if (list2.size() <= 2) {
                it = list2.iterator();
                while (it.hasNext()) {
                    try {
                        strArr[0] = C14113y2.m67400k4(strArr[0], (String) it.next());
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            if (list.size() > 2 || list.size() == 0) {
                List.Enumerator it3 = list.iterator();
                while (it3.hasNext()) {
                    try {
                        ((C12009k4) it3.next()).dispose();
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
                return c3152yj.toArray();
            }
            C3152yj c3152yj2 = new C3152yj();
            ((C12009k4) OooO0O0.OooO00o(list, 1)).m56333k4(c3152yj2, C3977ck.m15681jd());
            it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((C12009k4) it.next()).dispose();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return c3152yj2.toArray();
        } catch (Throwable th2) {
            c11302kk.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static byte[] m58346x1(C12009k4 c12009k4) {
        C3983k4 c3983k4M56597k4 = null;
        try {
            c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
            int iM15715du = c3983k4M56597k4.m15715du() * c12009k4.mo15757m9();
            byte[] bArr = new byte[iM15715du];
            byte[] bArr2 = new byte[(iM15715du / 4) * 3];
            C3914k4.m15618k4(c3983k4M56597k4.m15721to(), bArr, 0, iM15715du);
            int iMo15757m9 = c12009k4.mo15757m9() - 1;
            int i = 0;
            while (i < c12009k4.mo15757m9()) {
                for (int i2 = 0; i2 < c12009k4.mo15760yj(); i2++) {
                    bArr2[((c12009k4.mo15757m9() * i) + i2) * 3] = bArr[((c12009k4.mo15757m9() * iMo15757m9) + i2) * 4];
                    bArr2[(((c12009k4.mo15757m9() * i) + i2) * 3) + 1] = bArr[(((c12009k4.mo15757m9() * iMo15757m9) + i2) * 4) + 1];
                    bArr2[(((c12009k4.mo15757m9() * i) + i2) * 3) + 2] = bArr[(((c12009k4.mo15757m9() * iMo15757m9) + i2) * 4) + 2];
                }
                i++;
                iMo15757m9--;
            }
            c12009k4.m56605k4(c3983k4M56597k4);
            return bArr2;
        } catch (Throwable th) {
            if (c3983k4M56597k4 != null) {
                c12009k4.m56605k4(c3983k4M56597k4);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58342k4(AbstractC12002ck abstractC12002ck, String str, AbstractC3150x6 abstractC3150x6, int i) {
        C12009k4 c12009k4;
        if (abstractC12002ck != null) {
            c12009k4 = new C12009k4(256, 256, 2498570);
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                abstractC12008jdM56582k4.mo17594x1(new C11999ar(C12003du.m56385i5().Clone()), new C12014ne(0, 0, 256, 256));
                abstractC12008jdM56582k4.mo17512k4(abstractC12002ck, new C12014ne(0, 0, 256, 256), new C12014ne(0, 0, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9()), 2);
                abstractC12008jdM56582k4.dispose();
            } finally {
            }
        } else {
            c12009k4 = null;
        }
        return m58343k4(c12009k4, str, abstractC3150x6, null, null, i);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private static byte[] m58343k4(C12009k4 c12009k4, String str, AbstractC3150x6 abstractC3150x6, C12331c5 c12331c5, C12331c5 c12331c52, int i) throws Throwable {
        C11302kk c11302kk;
        int i2;
        C11600k4 c11600k4;
        List list = new List();
        C11302kk c11302kk2 = new C11302kk(abstractC3150x6);
        try {
            C11600k4 c11600k42 = (C11600k4) c11302kk2.m54290k4();
            List<String> listM58338k4 = m58338k4(str, c11600k42.m54634rv().m15547k4().m56663c5());
            IGenericEnumerator<C12535to> it = c11600k42.m58364k4().iterator();
            C4036m9 c4036m9 = null;
            C4032ks c4032ks = null;
            while (true) {
                try {
                    try {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4047sv c4047sv = (C4047sv) it.next();
                        C4032ks c4032ks2 = (C4032ks) C7019kk.m27452k4((Object) c4047sv, C4032ks.class);
                        if (c4032ks2 == null) {
                            c11302kk = c11302kk2;
                            c11600k4 = c11600k42;
                            C4036m9 c4036m92 = (C4036m9) C7019kk.m27452k4((Object) c4047sv, C4036m9.class);
                            if (c4036m92 != null) {
                                c4036m9 = c4036m92;
                            }
                            C4055uz c4055uz = (C4055uz) C7019kk.m27452k4((Object) c4047sv, C4055uz.class);
                            if (c4055uz != null) {
                                list.addItem(c4055uz);
                            }
                        } else if (c12009k4 == null) {
                            c11302kk = c11302kk2;
                            c11600k4 = c11600k42;
                            if (c4032ks2.m16006fa().m57630k4().m57759kk() == 1) {
                                if (c12331c5 != null) {
                                    c4032ks2.m16009k4(c12331c5);
                                }
                            } else if (c12331c52 != null) {
                                c4032ks2.m16009k4(c12331c52);
                            }
                            if (C14113y2.m67411k4(str)) {
                                c4032ks2.m16005dy((short) 82);
                                c4032ks2.m16001c5((short) 96);
                                c4032ks2.m15995to((short) 0);
                            }
                        } else if (c4032ks2.m16006fa().m57630k4().m57759kk() == 1) {
                            c4032ks = c4032ks2;
                        } else {
                            int length = c4032ks2.m16006fa().m57629h4().length;
                            C12331c5 c12331c5M58339k4 = m58339k4(c12009k4);
                            c11302kk = c11302kk2;
                            c11600k4 = c11600k42;
                            try {
                                c4032ks2.m16066x1(((c4032ks2.m16068yj() & 4294967295L) + (((long) ((c12331c5M58339k4.m57629h4().length - length) / 2)) & 4294967295L)) & 4294967295L);
                                c4032ks2.m16009k4(c12331c5M58339k4);
                                c4032ks2.m15990k4(204L);
                                c4032ks2.m16007h4((short) c12009k4.mo15760yj());
                                c4032ks2.m16003du((short) c12009k4.mo15757m9());
                            } catch (Throwable th) {
                                th = th;
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                throw th;
                            }
                        }
                        c11600k42 = c11600k4;
                        c11302kk2 = c11302kk;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c11302kk.dispose();
                    throw th;
                }
            }
            c11302kk = c11302kk2;
            AbstractC12536x1 abstractC12536x1 = c11600k42;
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            if (listM58338k4.size() == 0) {
                List.Enumerator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        abstractC12536x1.m58364k4().removeItem((C4055uz) it2.next());
                    } catch (Throwable th4) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th4;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } else {
                for (i2 = 0; i2 < listM58338k4.size(); i2++) {
                    m58340k4((C4055uz) list.get_Item(i2), c4036m9, listM58338k4.get_Item(i2), i);
                }
                if (listM58338k4.size() == 1) {
                    abstractC12536x1.m58364k4().removeItem((C12535to) list.get_Item(1));
                }
            }
            if (c4032ks != null) {
                abstractC12536x1.m58364k4().removeItem(c4032ks);
            }
            C3152yj c3152yj = new C3152yj();
            try {
                abstractC12536x1.mo13499a_(c3152yj);
                byte[] array = c3152yj.toArray();
                c11302kk.dispose();
                return array;
            } finally {
                c3152yj.dispose();
            }
        } catch (Throwable th5) {
            th = th5;
            c11302kk = c11302kk2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m58344k4(String str, AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62, int i) {
        C11302kk c11302kk = new C11302kk(abstractC3150x6);
        try {
            IGenericEnumerator<C12535to> it = ((C11600k4) c11302kk.m54290k4()).m58364k4().iterator();
            C12331c5 c12331c5M16006fa = null;
            C12331c5 c12331c5M16006fa2 = null;
            while (it.hasNext()) {
                try {
                    C4047sv c4047sv = (C4047sv) it.next();
                    if (c4047sv.m16063ks() == 2881) {
                        C4032ks c4032ks = (C4032ks) C7019kk.m27452k4((Object) c4047sv, C4032ks.class);
                        if (c4032ks.m16006fa().m57630k4().m57759kk() == 1) {
                            c12331c5M16006fa = c4032ks.m16006fa();
                        } else {
                            c12331c5M16006fa2 = c4032ks.m16006fa();
                        }
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            c11302kk.dispose();
            return m58343k4(null, str, abstractC3150x62, c12331c5M16006fa, c12331c5M16006fa2, i);
        } catch (Throwable th) {
            c11302kk.dispose();
            throw th;
        }
    }
}
