package com.aspose.slides.internal.p344pt;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4055uz;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.internal.p505xn.C12567ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.common.primitives.UnsignedBytes;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.qq */
/* JADX INFO: loaded from: classes4.dex */
public class C9527qq extends AbstractC9530rv {

    /* JADX INFO: renamed from: k4 */
    private static final Dictionary<Byte, Integer> f34542k4;

    static {
        Dictionary<Byte, Integer> dictionary = new Dictionary<>();
        f34542k4 = dictionary;
        dictionary.addItem((byte) 1, 1252);
        dictionary.addItem((byte) 0, 1252);
        dictionary.addItem((byte) -78, 1256);
        dictionary.addItem((byte) -70, 1257);
        dictionary.addItem((byte) -120, 950);
        dictionary.addItem((byte) -18, 1250);
        dictionary.addItem((byte) -122, 936);
        dictionary.addItem((byte) -95, 1253);
        dictionary.addItem((byte) -127, 949);
        dictionary.addItem((byte) -79, 1255);
        dictionary.addItem((byte) -126, 1361);
        dictionary.addItem((byte) 77, 10029);
        dictionary.addItem((byte) -1, 437);
        dictionary.addItem((byte) -52, 1251);
        dictionary.addItem(Byte.valueOf(UnsignedBytes.MAX_POWER_OF_TWO), 932);
        dictionary.addItem((byte) 2, 1252);
        dictionary.addItem((byte) -34, 874);
        dictionary.addItem((byte) -94, 1254);
        dictionary.addItem((byte) -93, 1258);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m46686k4(byte b, C9790ts c9790ts) {
        AbstractC6747ar abstractC6747arM26635ix = AbstractC6747ar.m26635ix();
        if (b != 1) {
            Integer[] numArr = {0};
            return f34542k4.tryGetValue(Byte.valueOf(b), numArr) ? C12555c5.m58552k4(numArr[0].intValue()) : abstractC6747arM26635ix;
        }
        if (c9790ts != null && C12567ne.f42083k4) {
            AbstractC6747ar abstractC6747arM58551k4 = C12555c5.m58551k4();
            if (c9790ts.m48239wl().m48298k4(3, 1).length > 0 || ((abstractC6747arM58551k4.mo26673ks() == 936 && c9790ts.m48239wl().m48298k4(3, 3).length > 0) || (abstractC6747arM58551k4.mo26673ks() == 932 && c9790ts.m48239wl().m48298k4(3, 2).length > 0))) {
                return abstractC6747arM58551k4;
            }
        }
        return C12555c5.m58552k4(1252);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte m46691x1(int i) {
        if (i == 1252) {
            return (byte) 1;
        }
        Dictionary.Enumerator<Byte, Integer> it = f34542k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (((Integer) next.getValue()).intValue() == i) {
                    return ((Byte) next.getKey()).byteValue();
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
        return (byte) 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11913yj m46687k4(C12025x6 c12025x6, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4, boolean[] zArr, float[] fArr) {
        float f;
        C12025x6 c12025x62;
        C11913yj c11913yjM55760h4 = abstractC12008jd.mo17577u4().m55760h4();
        boolean z = c3856h4.m15482k4() == 8 && c3856h4.m15514to().m55776k4()[3] < 0.0f && c3856h4.m15514to().m55776k4()[0] > 0.0f;
        zArr[0] = z;
        if (z) {
            c11913yjM55760h4.m55763k4(1.0f, -1.0f);
        }
        fArr[0] = 1.0f;
        float[] fArrM55776k4 = c11913yjM55760h4.m55776k4();
        if (C14116yg.m67480k4(fArrM55776k4[0] - fArrM55776k4[3]) > 1.0E-4d) {
            fArr[0] = fArrM55776k4[0] / fArrM55776k4[3];
            float f2 = fArrM55776k4[3];
            c11913yjM55760h4 = new C11913yj(f2, fArrM55776k4[1], fArrM55776k4[2], f2, fArrM55776k4[4], fArrM55776k4[5]);
        }
        if (c3856h4.m15481jd().m57737to() != 0) {
            f = (-c3856h4.m15481jd().m57737to()) / 10.0f;
            c12025x62 = new C12025x6(c12025x6.m56897x1() * fArr[0], c12025x6.m56895kk());
        } else {
            if (c3856h4.m15481jd().m57729kk() == 0) {
                return c11913yjM55760h4;
            }
            f = (-c3856h4.m15481jd().m57729kk()) / 10.0f;
            c12025x62 = new C12025x6(c12025x6.m56897x1() * fArr[0], c12025x6.m56895kk());
        }
        c11913yjM55760h4.m55766k4(f, c12025x62);
        return c11913yjM55760h4;
    }

    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        C4055uz c4055uz = (C4055uz) c4047sv;
        if ((c4055uz.m16144to() & 2) > 0) {
            abstractC12008jd.mo17594x1(new C11999ar(c3856h4.m15540yj().Clone()), c4055uz.m16133h4().m57807h4().Clone());
        }
        if (c3856h4.m15481jd() == null) {
            return;
        }
        C11999ar c11999ar = new C11999ar(c3856h4.m15475fa().Clone());
        C12019um c12019umM46692k4 = m46692k4(c4055uz.m16144to());
        int iM16145x1 = c4055uz.m16145x1();
        int iM16134k4 = c4055uz.m16134k4();
        if ((c3856h4.m15507ks() & 1) == 1) {
            iM16145x1 = c3856h4.m15537x6().m56708k4();
            iM16134k4 = c3856h4.m15537x6().m56713x1();
        }
        int i = iM16145x1;
        int i2 = iM16134k4;
        C12025x6 c12025x6 = new C12025x6(i, i2);
        C12013m9 c12013m9M57744x6 = c3856h4.m15481jd().m57744x6();
        C9790ts c9790tsM57735ne = c3856h4.m15481jd().m57735ne();
        String strM46689k4 = m46689k4(c4055uz, c3856h4.m15481jd().m57722jd(), c9790tsM57735ne);
        if ((c4055uz.m16144to() & 4) > 0) {
            abstractC12008jd.mo17520k4(c4055uz.m16133h4().m57807h4().Clone(), 0);
        }
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        boolean[] zArr = {false};
        float[] fArr = {0.0f};
        C11913yj c11913yjM46687k4 = m46687k4(c12025x6.Clone(), abstractC12008jd, c3856h4, zArr, fArr);
        boolean z = zArr[0];
        float f = fArr[0];
        C12025x6 c12025x6Clone = m46688k4(c12025x6.Clone(), strM46689k4, c12013m9M57744x6.m56639dy(), z, f, c3856h4).Clone();
        float fM56897x1 = c12025x6Clone.m56897x1() - c12025x6.m56897x1();
        float fM56895kk = c12025x6Clone.m56895kk() - c12025x6.m56895kk();
        if (c4055uz.m16132dy() == null || c4055uz.m16132dy().length <= 0) {
            abstractC12008jd2 = abstractC12008jd;
            m46690k4(abstractC12008jd2, strM46689k4, c12013m9M57744x6, c11999ar, c12025x6Clone.Clone(), c12019umM46692k4, c11913yjM46687k4);
        } else {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < strM46689k4.length()) {
                String strM67537ne = C14117yj.m67537ne(strM46689k4.charAt(i3));
                int i6 = i3;
                C12025x6 c12025x6Clone2 = C12025x6.m56886x1(c12025x6.Clone(), new C12015qq((i4 * f) + fM56897x1, fM56895kk)).Clone();
                C11913yj c11913yj = c11913yjM46687k4;
                C12019um c12019um = c12019umM46692k4;
                String str = strM46689k4;
                C12013m9 c12013m9 = c12013m9M57744x6;
                float f2 = fM56895kk;
                C11999ar c11999ar2 = c11999ar;
                m46690k4(abstractC12008jd, strM67537ne, c12013m9, c11999ar2, c12025x6Clone2, c12019um, c11913yj);
                int iMo26658k4 = m46686k4(c3856h4.m15481jd().m57722jd(), c9790tsM57735ne).mo26658k4(C14117yj.m67537ne(str.charAt(i6)));
                i4 = i4;
                int i7 = 0;
                while (i7 < iMo26658k4) {
                    i4 += c4055uz.m16132dy()[i5];
                    i7++;
                    i5++;
                }
                i3 = i6 + 1;
                c11999ar = c11999ar2;
                c11913yjM46687k4 = c11913yj;
                fM56895kk = f2;
                c12013m9M57744x6 = c12013m9;
                strM46689k4 = str;
                c12019umM46692k4 = c12019um;
            }
            int i8 = i4;
            if ((c3856h4.m15507ks() & 1) == 1) {
                c3856h4.m15505kk(new C12016rv(i + i8, i2));
            }
            abstractC12008jd2 = abstractC12008jd;
        }
        abstractC12008jd2.mo17496k4(c11893c5Mo17583x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12019um m46692k4(int i) {
        C12019um c12019um = new C12019um(C12019um.m56799c5());
        if ((i & 128) > 0) {
            c12019um.m56817kk(c12019um.m56816kk() | 1);
        }
        if ((i & 2048) > 0) {
            c12019um.m56813k4(C11697x1.m55250kk().m55262dy(), 2);
        }
        if ((i & 1024) > 0) {
            c12019um.m56813k4(C11697x1.m55252to().m55262dy(), 1);
        }
        return c12019um;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12025x6 m46688k4(C12025x6 c12025x6, String str, float f, boolean z, float f2, C3856h4 c3856h4) {
        float f3;
        float fM56897x1 = c12025x6.m56897x1() * f2;
        float fM56895kk = c12025x6.m56895kk();
        C9790ts c9790tsM57735ne = c3856h4.m15481jd().m57735ne();
        int iM48175c5 = c9790tsM57735ne.m48175c5();
        int iM48177ck = c9790tsM57735ne.m48177ck();
        int iM48191jd = c9790tsM57735ne.m48191jd();
        int i = iM48177ck + iM48191jd;
        float f4 = f / iM48175c5;
        if ((c3856h4.m15507ks() & 24) != 24) {
            if ((c3856h4.m15507ks() & 8) == 8) {
                f3 = i;
            }
            float fM48197k4 = c9790tsM57735ne.m48197k4(str, f);
            if ((c3856h4.m15507ks() & 6) == 6) {
                if ((c3856h4.m15507ks() & 2) == 2) {
                }
                if (z) {
                    fM56895kk = (fM56895kk - c12025x6.m56895kk()) - c12025x6.m56895kk();
                }
                return new C12025x6(fM56897x1, fM56895kk);
            }
            fM48197k4 /= 2.0f;
            fM56897x1 -= fM48197k4;
            if (z) {
            }
            return new C12025x6(fM56897x1, fM56895kk);
        }
        f3 = iM48191jd;
        fM56895kk -= f3 * f4;
        float fM48197k42 = c9790tsM57735ne.m48197k4(str, f);
        if ((c3856h4.m15507ks() & 6) == 6) {
        }
        fM56897x1 -= fM48197k42;
        if (z) {
        }
        return new C12025x6(fM56897x1, fM56895kk);
    }

    /* JADX INFO: renamed from: k4 */
    private String m46689k4(C4055uz c4055uz, byte b, C9790ts c9790ts) {
        AbstractC6747ar abstractC6747arM46686k4 = m46686k4(b, c9790ts);
        String strMo26682x1 = abstractC6747arM46686k4.mo26682x1(c4055uz.m16143m9(), 0, c4055uz.m16141kk());
        return (abstractC6747arM46686k4.mo26673ks() != 1252 || C14113y2.m67411k4(strMo26682x1)) ? strMo26682x1 : C12380dy.m57972k4(strMo26682x1, "[\\u0080-\\u009F]", "");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m46690k4(AbstractC12008jd abstractC12008jd, String str, C12013m9 c12013m9, AbstractC12024x1 abstractC12024x1, C12025x6 c12025x6, C12019um c12019um, C11913yj c11913yj) throws Throwable {
        AbstractC12008jd abstractC12008jd2;
        Throwable th;
        C11913yj c11913yjMo17577u4 = abstractC12008jd.mo17577u4();
        try {
            if (!c11913yj.equals(c11913yjMo17577u4)) {
                try {
                    abstractC12008jd.mo17588x1(c11913yj);
                } catch (Throwable th2) {
                    th = th2;
                    abstractC12008jd2 = abstractC12008jd;
                    abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
                    throw th;
                }
            }
            abstractC12008jd2 = abstractC12008jd;
            try {
                abstractC12008jd2.mo17554k4(str, c12013m9, abstractC12024x1, C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12025x6.m56897x1())), 14), C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(c12025x6.m56895kk())), 14), c12019um);
                abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                abstractC12008jd2.mo17588x1(c11913yjMo17577u4);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            abstractC12008jd2 = abstractC12008jd;
        }
    }
}
