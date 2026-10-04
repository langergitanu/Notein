package com.aspose.slides.internal.p036b6;

import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1633jd {

    /* JADX INFO: renamed from: du */
    private static double f6290du;

    /* JADX INFO: renamed from: fa */
    private static int f6292fa;

    /* JADX INFO: renamed from: h4 */
    private static double f6293h4;

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<String, Object> f6295k4;

    /* JADX INFO: renamed from: kk */
    private static double f6296kk;

    /* JADX INFO: renamed from: to */
    private static double f6300to;

    /* JADX INFO: renamed from: x1 */
    private static long f6302x1;

    /* JADX INFO: renamed from: m9 */
    private static List<C1624du> f6298m9 = new List<>();

    /* JADX INFO: renamed from: dy */
    private static List<C1620c5> f6291dy = new List<>();

    /* JADX INFO: renamed from: c5 */
    private static C1624du f6288c5 = null;

    /* JADX INFO: renamed from: jd */
    private static int f6294jd = 0;

    /* JADX INFO: renamed from: ck */
    private static boolean f6289ck = false;

    /* JADX INFO: renamed from: up */
    private static boolean f6301up = false;

    /* JADX INFO: renamed from: yj */
    private static double f6303yj = 0.0d;

    /* JADX INFO: renamed from: ks */
    private static double f6297ks = 0.0d;

    /* JADX INFO: renamed from: rv */
    private static C1635kk<Double> f6299rv = new C1635kk<>(Double.class);

    /* JADX INFO: renamed from: k4 */
    public static C1625dy m8828k4(Object obj, Dictionary<String, Object> dictionary, long j) {
        byte[] bArr = (byte[]) C7019kk.m27458kk(obj, byte[].class);
        f6295k4 = dictionary;
        f6302x1 = j;
        f6292fa = ((Integer) C7019kk.m27464to(dictionary.get_Item("defaultWidthX"), Integer.TYPE)).intValue();
        f6294jd = 0;
        f6289ck = false;
        f6301up = false;
        f6303yj = 0.0d;
        f6297ks = 0.0d;
        f6296kk = 0.0d;
        f6300to = 0.0d;
        f6290du = 0.0d;
        f6293h4 = 0.0d;
        f6298m9.clear();
        f6291dy.clear();
        f6299rv.m8850to();
        m8832k4(bArr);
        List.Enumerator<C1624du> it = f6298m9.iterator();
        while (it.hasNext()) {
            try {
                C1624du next = it.next();
                int iM8748k4 = next.m8748k4() - 1;
                if (next.m8750x1().get_Item(0).m8817kk() == next.m8750x1().get_Item(iM8748k4).m8817kk() && next.m8750x1().get_Item(0).m8818to() == next.m8750x1().get_Item(iM8748k4).m8818to()) {
                    next.m8750x1().removeAt(iM8748k4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C1625dy c1625dy = new C1625dy();
        c1625dy.m8758k4().addRange(f6298m9);
        c1625dy.m8760k4(f6292fa & 65535);
        if (f6291dy.size() > 0) {
            c1625dy.m8763k4(true);
            c1625dy.m8770x1().addRange(f6291dy);
        }
        return c1625dy;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m8833x1(double d, double d2) {
        if (f6301up) {
            f6298m9.addItem(f6288c5);
        }
        f6288c5 = new C1624du();
        m8830k4(d, d2);
        f6301up = true;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8829k4() {
        if (f6299rv.m8847k4() % 2 != 0 && !f6289ck) {
            f6292fa = C22201OooO0oO.OooO00o(f6299rv.m8849kk().doubleValue(), ((Integer) f6295k4.get_Item("nominalWidthX")).intValue(), 14);
        }
        f6294jd += f6299rv.m8847k4() >> 1;
        f6299rv.m8850to();
        f6289ck = true;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8830k4(double d, double d2) {
        f6288c5.m8749k4(new C1631h4(true, d, d2));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8831k4(double d, double d2, double d3, double d4, double d5, double d6) {
        f6288c5.m8749k4(new C1631h4(d, d2));
        f6288c5.m8749k4(new C1631h4(d3, d4));
        f6288c5.m8749k4(new C1631h4(true, d5, d6));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m8832k4(byte[] bArr) {
        C1635kk<Double> c1635kk;
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        double dDoubleValue5;
        double dDoubleValue6;
        double dDoubleValue7;
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            int i2 = i + 1;
            switch (b) {
                case 1:
                case 3:
                case 18:
                    m8829k4();
                    i = i2;
                    break;
                case 2:
                case 9:
                case 13:
                case 15:
                case 16:
                case 17:
                default:
                    int i3 = b & 255;
                    if (i3 < 32) {
                        C6005k4.m24259k4(C14113y2.m67408k4("Glyph ", C14114y9.m67465x1(f6302x1), ": unknown operator ", C14098up.m67323x1(b)));
                    } else if (i3 >= 247) {
                        if (i3 < 251) {
                            byte b2 = bArr[i2];
                            i += 2;
                            c1635kk = f6299rv;
                            dDoubleValue = new Long(((long) (((i3 - 247) * 256) + (b2 & 255) + 108)) & 4294967295L).doubleValue();
                        } else if (i3 >= 255) {
                            byte b3 = bArr[i2];
                            byte b4 = bArr[i + 2];
                            byte b5 = bArr[i + 3];
                            byte b6 = bArr[i + 4];
                            i += 5;
                            f6299rv.m8848k4(Double.valueOf((((((b3 & 255) << 24) | ((b4 & 255) << 16)) | ((b5 & 255) << 8)) | (b6 & 255)) / 65536.0f));
                        } else {
                            byte b7 = bArr[i2];
                            i += 2;
                            c1635kk = f6299rv;
                            dDoubleValue = (((-(i3 - 251)) * 256) - (b7 & 255)) + BackupEvent.ERROR_UID_NOT_EXIST;
                        }
                        c1635kk.m8848k4(Double.valueOf(dDoubleValue));
                    } else {
                        f6299rv.m8848k4(Double.valueOf(i3 - 139));
                    }
                    i = i2;
                    break;
                case 4:
                    if (f6299rv.m8847k4() > 1 && !f6289ck) {
                        f6292fa = C22201OooO0oO.OooO00o(f6299rv.m8849kk().doubleValue(), ((Integer) f6295k4.get_Item("nominalWidthX")).intValue(), 14);
                        f6289ck = true;
                    }
                    double dDoubleValue8 = f6299rv.m8851x1().doubleValue() + f6297ks;
                    f6297ks = dDoubleValue8;
                    m8833x1(f6303yj, dDoubleValue8);
                    i = i2;
                    break;
                case 5:
                    while (f6299rv.m8847k4() > 0) {
                        f6303yj = f6299rv.m8849kk().doubleValue() + f6303yj;
                        double dDoubleValue9 = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6297ks = dDoubleValue9;
                        m8830k4(f6303yj, dDoubleValue9);
                    }
                    i = i2;
                    break;
                case 6:
                    while (f6299rv.m8847k4() > 0) {
                        double dDoubleValue10 = f6299rv.m8849kk().doubleValue() + f6303yj;
                        f6303yj = dDoubleValue10;
                        m8830k4(dDoubleValue10, f6297ks);
                        if (f6299rv.m8847k4() == 0) {
                            i = i2;
                        } else {
                            double dDoubleValue11 = f6299rv.m8849kk().doubleValue() + f6297ks;
                            f6297ks = dDoubleValue11;
                            m8830k4(f6303yj, dDoubleValue11);
                        }
                        break;
                    }
                    i = i2;
                    break;
                case 7:
                    while (f6299rv.m8847k4() > 0) {
                        double dDoubleValue12 = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6297ks = dDoubleValue12;
                        m8830k4(f6303yj, dDoubleValue12);
                        if (f6299rv.m8847k4() == 0) {
                            i = i2;
                        } else {
                            double dDoubleValue13 = f6299rv.m8849kk().doubleValue() + f6303yj;
                            f6303yj = dDoubleValue13;
                            m8830k4(dDoubleValue13, f6297ks);
                        }
                        break;
                    }
                    i = i2;
                    break;
                case 8:
                    while (f6299rv.m8847k4() > 0) {
                        f6296kk = f6299rv.m8849kk().doubleValue() + f6303yj;
                        f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                        f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                        f6303yj = f6299rv.m8849kk().doubleValue() + f6290du;
                        double dDoubleValue14 = f6299rv.m8849kk().doubleValue() + f6293h4;
                        f6297ks = dDoubleValue14;
                        m8831k4(f6296kk, f6300to, f6290du, f6293h4, f6303yj, dDoubleValue14);
                    }
                    i = i2;
                    break;
                case 10:
                    Object obj = ((Object[]) C7019kk.m27458kk(f6295k4.get_Item("subrs"), Object[].class))[(int) C7019kk.m27435du(Double.valueOf(f6299rv.m8851x1().doubleValue() + (((Long) f6295k4.get_Item("subrsBias")).longValue() & 4294967295L)), 14)];
                    if (obj != null) {
                        m8832k4((byte[]) C7019kk.m27458kk(obj, byte[].class));
                    }
                    i = i2;
                    break;
                case 11:
                    break;
                case 12:
                    byte b8 = bArr[i2];
                    i += 2;
                    switch (b8) {
                        case 34:
                            double dDoubleValue15 = f6299rv.m8849kk().doubleValue() + f6303yj;
                            f6296kk = dDoubleValue15;
                            f6300to = f6297ks;
                            f6290du = f6299rv.m8849kk().doubleValue() + dDoubleValue15;
                            f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                            dDoubleValue2 = f6299rv.m8849kk().doubleValue() + f6290du;
                            dDoubleValue3 = f6293h4;
                            dDoubleValue4 = f6299rv.m8849kk().doubleValue() + dDoubleValue2;
                            dDoubleValue5 = f6293h4;
                            dDoubleValue6 = f6299rv.m8849kk().doubleValue() + dDoubleValue4;
                            dDoubleValue7 = f6297ks;
                            f6303yj = f6299rv.m8849kk().doubleValue() + dDoubleValue6;
                            m8831k4(f6296kk, f6300to, f6290du, f6293h4, dDoubleValue2, dDoubleValue3);
                            m8831k4(dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, f6303yj, f6297ks);
                            break;
                        case 35:
                            f6296kk = f6299rv.m8849kk().doubleValue() + f6303yj;
                            f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                            f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                            f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                            dDoubleValue2 = f6299rv.m8849kk().doubleValue() + f6290du;
                            dDoubleValue3 = f6299rv.m8849kk().doubleValue() + f6293h4;
                            dDoubleValue4 = f6299rv.m8849kk().doubleValue() + dDoubleValue2;
                            dDoubleValue5 = f6299rv.m8849kk().doubleValue() + dDoubleValue3;
                            dDoubleValue6 = f6299rv.m8849kk().doubleValue() + dDoubleValue4;
                            dDoubleValue7 = f6299rv.m8849kk().doubleValue() + dDoubleValue5;
                            f6303yj = f6299rv.m8849kk().doubleValue() + dDoubleValue6;
                            f6297ks = f6299rv.m8849kk().doubleValue() + dDoubleValue7;
                            f6299rv.m8849kk();
                            m8831k4(f6296kk, f6300to, f6290du, f6293h4, dDoubleValue2, dDoubleValue3);
                            m8831k4(dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, f6303yj, f6297ks);
                            break;
                        case 36:
                            f6296kk = f6299rv.m8849kk().doubleValue() + f6303yj;
                            f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                            f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                            f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                            dDoubleValue2 = f6299rv.m8849kk().doubleValue() + f6290du;
                            dDoubleValue3 = f6293h4;
                            dDoubleValue4 = f6299rv.m8849kk().doubleValue() + dDoubleValue2;
                            dDoubleValue5 = f6293h4;
                            dDoubleValue6 = f6299rv.m8849kk().doubleValue() + dDoubleValue4;
                            dDoubleValue7 = f6299rv.m8849kk().doubleValue() + dDoubleValue5;
                            f6303yj = f6299rv.m8849kk().doubleValue() + dDoubleValue6;
                            m8831k4(f6296kk, f6300to, f6290du, f6293h4, dDoubleValue2, dDoubleValue3);
                            m8831k4(dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, f6303yj, f6297ks);
                            break;
                        case 37:
                            f6296kk = f6299rv.m8849kk().doubleValue() + f6303yj;
                            f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                            f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                            f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                            dDoubleValue2 = f6299rv.m8849kk().doubleValue() + f6290du;
                            dDoubleValue3 = f6299rv.m8849kk().doubleValue() + f6293h4;
                            dDoubleValue4 = f6299rv.m8849kk().doubleValue() + dDoubleValue2;
                            dDoubleValue5 = f6299rv.m8849kk().doubleValue() + dDoubleValue3;
                            dDoubleValue6 = f6299rv.m8849kk().doubleValue() + dDoubleValue4;
                            dDoubleValue7 = f6299rv.m8849kk().doubleValue() + dDoubleValue5;
                            if (C14116yg.m67475k4(dDoubleValue6 - f6303yj) > C14116yg.m67475k4(dDoubleValue7 - f6297ks)) {
                                f6303yj = f6299rv.m8849kk().doubleValue() + dDoubleValue6;
                            } else {
                                f6297ks = f6299rv.m8849kk().doubleValue() + dDoubleValue7;
                            }
                            m8831k4(f6296kk, f6300to, f6290du, f6293h4, dDoubleValue2, dDoubleValue3);
                            m8831k4(dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, f6303yj, f6297ks);
                            break;
                        default:
                            C6005k4.m24259k4(C14113y2.m67408k4("Glyph ", C14114y9.m67465x1(f6302x1), ": unknown operator ", C14057f9.m66591x1((b8 & 255) + 1200)));
                            f6299rv.m8850to();
                            break;
                    }
                    break;
                case 14:
                    if (f6299rv.m8847k4() == 1 && !f6289ck) {
                        f6292fa = C22201OooO0oO.OooO00o(f6299rv.m8849kk().doubleValue(), ((Integer) f6295k4.get_Item("nominalWidthX")).intValue(), 14);
                        f6289ck = true;
                    } else if (f6299rv.m8847k4() == 4 || f6299rv.m8847k4() == 5) {
                        if (f6299rv.m8847k4() == 5) {
                            if (!f6289ck) {
                                f6292fa = C22201OooO0oO.OooO00o(f6299rv.m8849kk().doubleValue(), ((Integer) f6295k4.get_Item("nominalWidthX")).intValue(), 14);
                            }
                            f6289ck = true;
                        }
                        List list = new List(AbstractC14092to.m67204k4((Object[]) C7019kk.m27458kk(f6295k4.get_Item("charset"), String[].class)));
                        String[] strArr = (String[]) C7019kk.m27458kk(f6295k4.get_Item("encoding"), String[].class);
                        C1620c5 c1620c5 = new C1620c5();
                        c1620c5.m8716k4(list.indexOf(strArr[C7019kk.m27462to(f6299rv.m8851x1(), 14)]));
                        c1620c5.m8718x1().m8739k4((byte) 1);
                        c1620c5.m8718x1().m8745x1((byte) 0);
                        c1620c5.m8718x1().m8741kk((byte) 0);
                        c1620c5.m8718x1().m8743to((byte) 1);
                        c1620c5.m8718x1().m8735du((byte) 0);
                        c1620c5.m8718x1().m8737h4((byte) 0);
                        C1620c5 c1620c52 = new C1620c5();
                        c1620c52.m8716k4(list.indexOf(strArr[C7019kk.m27462to(f6299rv.m8851x1(), 14)]));
                        c1620c52.m8718x1().m8739k4((byte) 1);
                        c1620c52.m8718x1().m8745x1((byte) 0);
                        c1620c52.m8718x1().m8741kk((byte) 0);
                        c1620c52.m8718x1().m8743to((byte) 1);
                        c1620c52.m8718x1().m8735du((byte) 0);
                        c1620c52.m8718x1().m8737h4((byte) 0);
                        c1620c5.m8718x1().m8737h4(C7019kk.m27442k4(f6299rv.m8851x1(), 14));
                        c1620c5.m8718x1().m8735du(C7019kk.m27442k4(f6299rv.m8851x1(), 14));
                        f6291dy.addItem(c1620c52);
                        f6291dy.addItem(c1620c5);
                    }
                    if (f6301up) {
                        f6298m9.addItem(f6288c5);
                        f6301up = false;
                    }
                    i = i2;
                    break;
                case 19:
                case 20:
                    m8829k4();
                    i2 += (f6294jd + 7) >> 3;
                    i = i2;
                    break;
                case 21:
                    if (f6299rv.m8847k4() > 2 && !f6289ck) {
                        f6292fa = C22201OooO0oO.OooO00o(f6299rv.m8849kk().doubleValue(), ((Integer) f6295k4.get_Item("nominalWidthX")).intValue(), 14);
                        f6289ck = true;
                    }
                    f6297ks = f6299rv.m8851x1().doubleValue() + f6297ks;
                    double dDoubleValue16 = f6299rv.m8851x1().doubleValue() + f6303yj;
                    f6303yj = dDoubleValue16;
                    m8833x1(dDoubleValue16, f6297ks);
                    i = i2;
                    break;
                case 22:
                    if (f6299rv.m8847k4() > 1 && !f6289ck) {
                        f6292fa = C22201OooO0oO.OooO00o(f6299rv.m8849kk().doubleValue(), ((Integer) f6295k4.get_Item("nominalWidthX")).intValue(), 14);
                        f6289ck = true;
                    }
                    double dDoubleValue162 = f6299rv.m8851x1().doubleValue() + f6303yj;
                    f6303yj = dDoubleValue162;
                    m8833x1(dDoubleValue162, f6297ks);
                    i = i2;
                    break;
                case 23:
                    m8829k4();
                    i = i2;
                    break;
                case 24:
                    while (f6299rv.m8847k4() > 2) {
                        f6296kk = f6299rv.m8849kk().doubleValue() + f6303yj;
                        f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                        f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                        f6303yj = f6299rv.m8849kk().doubleValue() + f6290du;
                        double dDoubleValue17 = f6299rv.m8849kk().doubleValue() + f6293h4;
                        f6297ks = dDoubleValue17;
                        m8831k4(f6296kk, f6300to, f6290du, f6293h4, f6303yj, dDoubleValue17);
                    }
                    f6303yj = f6299rv.m8849kk().doubleValue() + f6303yj;
                    double dDoubleValue18 = f6299rv.m8849kk().doubleValue() + f6297ks;
                    f6297ks = dDoubleValue18;
                    m8830k4(f6303yj, dDoubleValue18);
                    i = i2;
                    break;
                case 25:
                    while (f6299rv.m8847k4() > 6) {
                        f6303yj = f6299rv.m8849kk().doubleValue() + f6303yj;
                        double dDoubleValue19 = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6297ks = dDoubleValue19;
                        m8830k4(f6303yj, dDoubleValue19);
                    }
                    f6296kk = f6299rv.m8849kk().doubleValue() + f6303yj;
                    f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                    f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                    f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                    f6303yj = f6299rv.m8849kk().doubleValue() + f6290du;
                    double dDoubleValue20 = f6299rv.m8849kk().doubleValue() + f6293h4;
                    f6297ks = dDoubleValue20;
                    m8831k4(f6296kk, f6300to, f6290du, f6293h4, f6303yj, dDoubleValue20);
                    i = i2;
                    break;
                case 26:
                    if (f6299rv.m8847k4() % 2 == 1) {
                        f6303yj = f6299rv.m8849kk().doubleValue() + f6303yj;
                    }
                    while (f6299rv.m8847k4() > 0) {
                        f6296kk = f6303yj;
                        f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                        double dDoubleValue21 = f6299rv.m8849kk().doubleValue() + f6300to;
                        f6293h4 = dDoubleValue21;
                        f6303yj = f6290du;
                        double dDoubleValue22 = f6299rv.m8849kk().doubleValue() + dDoubleValue21;
                        f6297ks = dDoubleValue22;
                        m8831k4(f6296kk, f6300to, f6290du, f6293h4, f6303yj, dDoubleValue22);
                    }
                    i = i2;
                    break;
                case 27:
                    if (f6299rv.m8847k4() % 2 == 1) {
                        f6297ks = f6299rv.m8849kk().doubleValue() + f6297ks;
                    }
                    while (f6299rv.m8847k4() > 0) {
                        double dDoubleValue23 = f6299rv.m8849kk().doubleValue() + f6303yj;
                        f6296kk = dDoubleValue23;
                        f6300to = f6297ks;
                        f6290du = f6299rv.m8849kk().doubleValue() + dDoubleValue23;
                        f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                        double dDoubleValue24 = f6299rv.m8849kk().doubleValue() + f6290du;
                        f6303yj = dDoubleValue24;
                        double d = f6293h4;
                        f6297ks = d;
                        m8831k4(f6296kk, f6300to, f6290du, d, dDoubleValue24, d);
                    }
                    i = i2;
                    break;
                case 28:
                    f6299rv.m8848k4(Double.valueOf((((bArr[i2] & 255) << 24) | ((bArr[i + 2] & 255) << 16)) >> 16));
                    i += 3;
                    break;
                case 29:
                    Object obj2 = ((Object[]) C7019kk.m27458kk(f6295k4.get_Item("gsubrs"), Object[].class))[(int) C7019kk.m27435du(Double.valueOf(f6299rv.m8851x1().doubleValue() + (((Long) f6295k4.get_Item("gsubrsBias")).longValue() & 4294967295L)), 14)];
                    if (obj2 != null) {
                        m8832k4((byte[]) C7019kk.m27458kk(obj2, byte[].class));
                    }
                    i = i2;
                    break;
                case 30:
                    while (f6299rv.m8847k4() > 0) {
                        f6296kk = f6303yj;
                        f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                        f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                        f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                        f6303yj = f6299rv.m8849kk().doubleValue() + f6290du;
                        double dDoubleValue25 = f6293h4 + (f6299rv.m8847k4() == 1 ? f6299rv.m8849kk().doubleValue() : 0.0d);
                        f6297ks = dDoubleValue25;
                        m8831k4(f6296kk, f6300to, f6290du, f6293h4, f6303yj, dDoubleValue25);
                        if (f6299rv.m8847k4() == 0) {
                            i = i2;
                        } else {
                            double dDoubleValue26 = f6299rv.m8849kk().doubleValue() + f6303yj;
                            f6296kk = dDoubleValue26;
                            f6300to = f6297ks;
                            f6290du = f6299rv.m8849kk().doubleValue() + dDoubleValue26;
                            double dDoubleValue27 = f6299rv.m8849kk().doubleValue() + f6300to;
                            f6293h4 = dDoubleValue27;
                            f6297ks = f6299rv.m8849kk().doubleValue() + dDoubleValue27;
                            double dDoubleValue28 = f6290du + (f6299rv.m8847k4() == 1 ? f6299rv.m8849kk().doubleValue() : 0.0d);
                            f6303yj = dDoubleValue28;
                            m8831k4(f6296kk, f6300to, f6290du, f6293h4, dDoubleValue28, f6297ks);
                        }
                        break;
                    }
                    i = i2;
                    break;
                case 31:
                    while (f6299rv.m8847k4() > 0) {
                        double dDoubleValue29 = f6299rv.m8849kk().doubleValue() + f6303yj;
                        f6296kk = dDoubleValue29;
                        f6300to = f6297ks;
                        f6290du = f6299rv.m8849kk().doubleValue() + dDoubleValue29;
                        double dDoubleValue30 = f6299rv.m8849kk().doubleValue() + f6300to;
                        f6293h4 = dDoubleValue30;
                        f6297ks = f6299rv.m8849kk().doubleValue() + dDoubleValue30;
                        double dDoubleValue31 = f6290du + (f6299rv.m8847k4() == 1 ? f6299rv.m8849kk().doubleValue() : 0.0d);
                        f6303yj = dDoubleValue31;
                        m8831k4(f6296kk, f6300to, f6290du, f6293h4, dDoubleValue31, f6297ks);
                        if (f6299rv.m8847k4() == 0) {
                            i = i2;
                        } else {
                            f6296kk = f6303yj;
                            f6300to = f6299rv.m8849kk().doubleValue() + f6297ks;
                            f6290du = f6299rv.m8849kk().doubleValue() + f6296kk;
                            f6293h4 = f6299rv.m8849kk().doubleValue() + f6300to;
                            f6303yj = f6299rv.m8849kk().doubleValue() + f6290du;
                            double dDoubleValue32 = f6293h4 + (f6299rv.m8847k4() == 1 ? f6299rv.m8849kk().doubleValue() : 0.0d);
                            f6297ks = dDoubleValue32;
                            m8831k4(f6296kk, f6300to, f6290du, f6293h4, f6303yj, dDoubleValue32);
                        }
                        break;
                    }
                    i = i2;
                    break;
            }
        }
    }
}
