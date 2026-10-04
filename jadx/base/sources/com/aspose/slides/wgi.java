package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12006h4;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class wgi {

    /* JADX INFO: renamed from: com.aspose.slides.wgi$k4 */
    public static abstract class AbstractC14737k4<T> extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract String mo69249k4(T t);
    }

    /* JADX INFO: renamed from: c5 */
    public static double m72697c5(String str) {
        if (C14113y2.m67364dy(str, "cm") > 0) {
            str = C14113y2.m67401k4(str, "cm", "");
        }
        return C14044b3.m66428k4(str, C11697x1.m55250kk()) * 28.348214285714285d;
    }

    /* JADX INFO: renamed from: ck */
    public static C12003du m72698ck(String str) {
        return m72715k4(str, C12006h4.m56538x1(255).Clone());
    }

    /* JADX INFO: renamed from: du */
    public static byte m72699du(String str) {
        return m72706k4(str, (byte) -1);
    }

    /* JADX INFO: renamed from: dy */
    public static double m72701dy(String str) {
        if (C14113y2.m67364dy(str, BackupFile.EXTENSION_NOTEIN_FILE) > 0) {
            str = C14113y2.m67401k4(str, BackupFile.EXTENSION_NOTEIN_FILE, "");
        }
        return C14044b3.m66428k4(str, C11697x1.m55250kk()) * 72.02813067150636d;
    }

    /* JADX INFO: renamed from: fa */
    public static double m72702fa(String str) {
        return C14044b3.m66428k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, TranslateLanguage.PORTUGUESE, ""), BackupFile.EXTENSION_NOTEIN_FILE, ""), "%", ""), C11697x1.m55250kk()) * (C14113y2.m67364dy(str, BackupFile.EXTENSION_NOTEIN_FILE) > 0 ? 72.0d : 1.0d);
    }

    /* JADX INFO: renamed from: h4 */
    public static double m72703h4(String str) {
        return m72708k4(str, Double.NaN);
    }

    /* JADX INFO: renamed from: jd */
    public static double m72705jd(String str) {
        if (C14113y2.m67364dy(str, TranslateLanguage.PORTUGUESE) > 0) {
            str = C14113y2.m67401k4(str, TranslateLanguage.PORTUGUESE, "");
        }
        return C14044b3.m66428k4(str, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m72706k4(String str, byte b) {
        return !m72731kk(str) ? b : (TelemetryEventStrings.Value.FALSE.equals(str) || "0".equals(str) || "f".equals(str)) ? (byte) 0 : (byte) 1;
    }

    /* JADX INFO: renamed from: kk */
    public static String m72730kk(double d) {
        return C14113y2.m67402k4("{0}pt", C14044b3.m66432k4(d, (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ks */
    public static boolean m72732ks(String str) {
        return C14113y2.m67411k4(C14113y2.m67440x1(m72736rv(str)));
    }

    /* JADX INFO: renamed from: m9 */
    public static double m72733m9(String str) {
        return m72740x1(str, Double.NaN);
    }

    /* JADX INFO: renamed from: ne */
    public static C14077m4 m72735ne(String str) {
        String strMo57995kk;
        int iM67429to = C14113y2.m67429to(str, 'T');
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("[0-9]+(?=S)", str);
        String strMo57995kk2 = "0";
        String strMo57995kk3 = c12385toOooO00o.mo58006to() ? c12385toOooO00o.mo57995kk() : "0";
        C12385to c12385toOooO00o2 = C22210OooOo0o.OooO00o("[0-9]+(?=H)", str);
        String strMo57995kk4 = c12385toOooO00o2.mo58006to() ? c12385toOooO00o2.mo57995kk() : "0";
        C12385to c12385toOooO00o3 = C22210OooOo0o.OooO00o("[0-9]+(?=D)", str);
        String strMo57995kk5 = c12385toOooO00o3.mo58006to() ? c12385toOooO00o3.mo57995kk() : "0";
        C12385to c12385toOooO00o4 = C22210OooOo0o.OooO00o("[0-9]+(?=Y)", str);
        String strMo57995kk6 = c12385toOooO00o4.mo58006to() ? c12385toOooO00o4.mo57995kk() : "0";
        C12380dy c12380dy = new C12380dy("[0-9]+(?=M)");
        if (iM67429to < 0 || iM67429to >= str.length()) {
            C12385to c12385toM57989x1 = c12380dy.m57989x1(str);
            if (c12385toM57989x1.mo58006to()) {
                strMo57995kk = "0";
                strMo57995kk2 = c12385toM57989x1.mo57995kk();
            } else {
                strMo57995kk = "0";
            }
        } else {
            C12385to c12385toM57990x1 = c12380dy.m57990x1(str, iM67429to);
            strMo57995kk = c12385toM57990x1.mo58006to() ? c12385toM57990x1.mo57995kk() : "0";
            if (iM67429to > 0) {
                C12385to c12385toM57981k4 = c12380dy.m57981k4(str, 0, iM67429to);
                if (c12385toM57981k4.mo58006to()) {
                    strMo57995kk2 = c12385toM57981k4.mo57995kk();
                }
            }
        }
        C14077m4 c14077m4Clone = C14084qq.m67073c5(new C14084qq(C14057f9.m66582k4(strMo57995kk6) + 1, C14057f9.m66582k4(strMo57995kk2) + 1, C14057f9.m66582k4(strMo57995kk5) + 1, C14057f9.m66582k4(strMo57995kk4), C14057f9.m66582k4(strMo57995kk), C14057f9.m66582k4(strMo57995kk3)), C14084qq.f47299x1).Clone();
        if (C14113y2.m67429to(str, '-') == 0) {
            c14077m4Clone.m66812ck().CloneTo(c14077m4Clone);
        }
        return c14077m4Clone;
    }

    /* JADX INFO: renamed from: rv */
    public static String m72736rv(String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(str, "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "");
    }

    /* JADX INFO: renamed from: to */
    public static int m72737to(String str) {
        return m72710k4(str, 100);
    }

    /* JADX INFO: renamed from: up */
    public static double m72739up(String str) {
        return C14044b3.m66428k4(C12380dy.m57972k4(str, "[^0-9.-]", ""), C11697x1.m55250kk()) * (C14113y2.m67367h4(str, "cm", (short) 4) > 0 ? 28.348214285714285d : C14113y2.m67367h4(str, "mm", (short) 4) > 0 ? 2.8348214285714284d : C14113y2.m67367h4(str, BackupFile.EXTENSION_NOTEIN_FILE, (short) 4) > 0 ? 72.02813067150636d : C14113y2.m67367h4(str, TranslateLanguage.PORTUGUESE, (short) 4) > 0 ? 803.3883971827371d : 1.0d);
    }

    /* JADX INFO: renamed from: x1 */
    public static double m72740x1(String str, double d) {
        return !m72731kk(str) ? d : m72742x1(str) ? m72737to(str) : m72703h4(str) * (-1.0d);
    }

    /* JADX INFO: renamed from: x6 */
    public static float m72743x6(String str) {
        if (C14113y2.m67411k4(str)) {
            return 0.0f;
        }
        int iM67429to = C14113y2.m67429to(str, '%');
        if (iM67429to > 0) {
            str = C14113y2.m67443x1(str, 0, iM67429to);
        }
        if (C14113y2.m67448x1(str, "super")) {
            str = C14113y2.m67440x1(C14113y2.m67422kk(str, 6));
        } else if (C14113y2.m67448x1(str, "sub")) {
            str = C14113y2.m67440x1(C14113y2.m67422kk(str, 3));
            if (str.charAt(0) != '-') {
                str = C14113y2.m67407k4('-', str);
            }
        }
        return C14064he.m66707k4(str, C11697x1.m55250kk().m55263fa());
    }

    /* JADX INFO: renamed from: yj */
    public static int[] m72744yj(String str) {
        return m72728k4(str, new int[]{0});
    }

    /* JADX INFO: renamed from: du */
    public static String m72700du(double d) {
        if (C14044b3.m66437kk(d)) {
            d = 100.0d;
        }
        return C14113y2.m67408k4(C14044b3.m66432k4(d, (InterfaceC14073kp) C11697x1.m55250kk()), "%");
    }

    /* JADX INFO: renamed from: h4 */
    public static String m72704h4(double d) {
        return d <= 0.0d ? m72717k4(d * (-1.0d)) : m72718k4(C7019kk.m27462to(Double.valueOf(d), 14));
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m72707k4(boolean z) {
        return z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m72731kk(String str) {
        return !C14113y2.m67411k4(str);
    }

    /* JADX INFO: renamed from: m9 */
    public static String m72734m9(double d) {
        return C14113y2.m67408k4(C14044b3.m66432k4(d, (InterfaceC14073kp) C11697x1.m55250kk()), TranslateLanguage.PORTUGUESE);
    }

    /* JADX INFO: renamed from: to */
    public static String m72738to(double d) {
        return C14044b3.m66432k4(d, (InterfaceC14073kp) C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static String m72741x1(double d) {
        return C14113y2.m67402k4("{0}in", C14044b3.m66432k4(C14116yg.m67477k4(d / 72.02813067150636d, 5), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public static double m72708k4(String str, double d) {
        return !m72731kk(str) ? d : C14113y2.m67367h4(str, BackupFile.EXTENSION_NOTEIN_FILE, (short) 4) > 0 ? m72701dy(str) : C14113y2.m67367h4(str, TranslateLanguage.PORTUGUESE, (short) 4) > 0 ? m72705jd(str) : m72697c5(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m72742x1(String str) {
        return !C14113y2.m67411k4(str) && C14113y2.m67364dy(str, "%") > -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m72709k4(String str, float f) {
        if (C14113y2.m67411k4(str)) {
            return f;
        }
        return C14064he.m66707k4(C12380dy.m57972k4(str, "[^0-9.-]", ""), C11697x1.m55250kk()) * (C14113y2.m67367h4(str, "rad", (short) 4) > 0 ? 57.29578f : C14113y2.m67367h4(str, "grad", (short) 4) > 0 ? 0.9f : 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m72710k4(String str, int i) {
        if (m72731kk(str) && m72742x1(str)) {
            double[] dArr = {0.0d};
            boolean zM66435k4 = C14044b3.m66435k4(C14113y2.m67401k4(str, "%", ""), FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), dArr);
            double d = dArr[0];
            if (zM66435k4) {
                return C7019kk.m27462to(Double.valueOf(d), 14);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static List<int[]> m72711k4(String str) {
        List<int[]> list = new List<>();
        if (!C14113y2.m67411k4(str)) {
            String[] strArrM67369h4 = C14113y2.m67369h4(str, ControlChar.SPACE_CHAR, ',');
            for (int i = 0; i < strArrM67369h4.length; i += 2) {
                list.addItem(new int[]{C14080ne.m67015to(strArrM67369h4[i]), C14080ne.m67015to(strArrM67369h4[i + 1])});
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T extends AbstractC7361bz> T m72712k4(Class<T> cls, String str, IGenericEnumerable<C7394ca> iGenericEnumerable) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentNullException("name");
        }
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("namedObjects");
        }
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (C14113y2.m67363du(next.m29539k4(), str)) {
                    return (T) next.m29542x1();
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
        return (T) C7019kk.m27467x1((Class) cls);
    }

    /* JADX INFO: renamed from: k4 */
    public static <T extends AbstractC7361bz> T m72713k4(Class<T> cls, String str, IGenericEnumerable<C7394ca> iGenericEnumerable, C7394ca.k4 k4Var) {
        T t = (T) m72712k4(cls, str, iGenericEnumerable);
        return t == null ? (T) k4Var.mo2788k4(str).m29542x1() : t;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m72714k4(C12003du c12003du, int i) {
        return C12003du.m56400k4(C7019kk.m27442k4(Double.valueOf(C14116yg.m67497to((i / 100.0f) * 255.0f)), 14) & 255, c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m72715k4(String str, C12003du c12003du) {
        int iM66583k4;
        int iM66583k42;
        String strM67407k4;
        if (!m72731kk(str)) {
            return c12003du;
        }
        if (C14113y2.m67429to(str, '#') != -1) {
            str = C14113y2.m67401k4(str, "#", "");
        } else if (C14113y2.m67363du(C14113y2.m67368h4(str), "transparent")) {
            return C12003du.f40505to;
        }
        int iM66583k43 = 0;
        if (str.length() == 6) {
            iM66583k43 = C14057f9.m66583k4(C14113y2.m67443x1(str, 0, 2), 512);
            iM66583k42 = C14057f9.m66583k4(C14113y2.m67443x1(str, 2, 2), 512);
            strM67407k4 = C14113y2.m67443x1(str, 4, 2);
        } else {
            if (str.length() != 3) {
                iM66583k4 = 0;
                iM66583k42 = 0;
                return C12003du.m56397k4(iM66583k43, iM66583k42, iM66583k4);
            }
            iM66583k43 = C14057f9.m66583k4(C14113y2.m67407k4(Character.valueOf(str.charAt(0)), C14117yj.m67537ne(str.charAt(0))), 512);
            iM66583k42 = C14057f9.m66583k4(C14113y2.m67407k4(Character.valueOf(str.charAt(1)), C14117yj.m67537ne(str.charAt(1))), 512);
            strM67407k4 = C14113y2.m67407k4(Character.valueOf(str.charAt(2)), C14117yj.m67537ne(str.charAt(2)));
        }
        iM66583k4 = C14057f9.m66583k4(strM67407k4, 512);
        return C12003du.m56397k4(iM66583k43, iM66583k42, iM66583k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m72716k4(String str, String str2, String str3, String str4) {
        C12007ix c12007ix = new C12007ix((float) m72703h4(str), (float) m72703h4(str2), (float) m72703h4(str3), (float) m72703h4(str4));
        if (C14064he.m66715kk(c12007ix.m56557jd())) {
            c12007ix.m56566kk(0.0f);
        }
        if (C14064he.m66715kk(c12007ix.m56551ck())) {
            c12007ix.m56572to(0.0f);
        }
        return c12007ix;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72717k4(double d) {
        return C14113y2.m67402k4("{0}cm", C14044b3.m66432k4(C14116yg.m67477k4(d * 0.0352755905511811d, 3), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72718k4(int i) {
        return C14113y2.m67408k4(C13850af.m65103k4(i), "%");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72719k4(C7394ca c7394ca) {
        return (String) C7019kk.m27452k4(c7394ca.m29541kk(), String.class);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72720k4(C12003du c12003du) {
        if (C12003du.m56403k4(c12003du, C12003du.f40505to)) {
            return "transparent";
        }
        int iM56507jd = c12003du.m56507jd() & 255;
        int iM56502ck = c12003du.m56502ck() & 255;
        int iM56505fa = c12003du.m56505fa() & 255;
        String strM66940k4 = C14080ne.m66940k4(iM56507jd, 16);
        String strM66940k42 = C14080ne.m66940k4(iM56502ck, 16);
        String strM66940k43 = C14080ne.m66940k4(iM56505fa, 16);
        if (strM66940k4.length() == 1) {
            strM66940k4 = C14113y2.m67408k4("0", strM66940k4);
        }
        if (strM66940k42.length() == 1) {
            strM66940k42 = C14113y2.m67408k4("0", strM66940k42);
        }
        if (strM66940k43.length() == 1) {
            strM66940k43 = C14113y2.m67408k4("0", strM66940k43);
        }
        return C14113y2.m67408k4("#", strM66940k4, strM66940k42, strM66940k43);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m72721k4(C14077m4 c14077m4) {
        C14084qq c14084qq = new C14084qq(c14077m4.m66817jd().m66813du());
        String strM67400k4 = C14077m4.m66797h4(c14077m4, C14077m4.f47265kk) ? "-P" : "P";
        if (c14084qq.m67158yj() - 1 > 0) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(C14057f9.m66591x1(c14084qq.m67158yj() - 1), "Y"));
        }
        if (c14084qq.m67129dy() - 1 > 0) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(C14057f9.m66591x1(c14084qq.m67129dy() - 1), "M"));
        }
        if (c14084qq.m67153x1() - 1 > 0) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(C14057f9.m66591x1(c14084qq.m67153x1() - 1), "D"));
        }
        if (c14084qq.m67147to() <= 0 && c14084qq.m67144m9() <= 0 && c14084qq.m67126ck() <= 0) {
            return strM67400k4;
        }
        String strM67400k42 = C14113y2.m67400k4(strM67400k4, "T");
        if (c14084qq.m67147to() > 0) {
            strM67400k42 = C14113y2.m67400k4(strM67400k42, C14113y2.m67408k4(C14057f9.m66591x1(c14084qq.m67147to()), "H"));
        }
        if (c14084qq.m67144m9() > 0) {
            strM67400k42 = C14113y2.m67400k4(strM67400k42, C14113y2.m67408k4(C14057f9.m66591x1(c14084qq.m67144m9()), "M"));
        }
        return c14084qq.m67126ck() > 0 ? C14113y2.m67400k4(strM67400k42, C14113y2.m67408k4(C14057f9.m66591x1(c14084qq.m67126ck()), "S")) : strM67400k42;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72722k4(IShape iShape, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
        strArr[0] = m72717k4(iShape.getX());
        strArr2[0] = m72717k4(iShape.getY());
        strArr3[0] = m72717k4(iShape.getWidth());
        strArr4[0] = m72717k4(iShape.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> void m72723k4(Class<T> cls, IGenericDictionary<String, T> iGenericDictionary, String str, C7394ca c7394ca, AbstractC14737k4<T> abstractC14737k4) {
        if (C14113y2.m67363du(c7394ca.m29539k4(), str)) {
            Object objM27452k4 = C7019kk.m27452k4((Object) c7394ca.m29542x1(), (Class<Object>) cls);
            if (objM27452k4 == null) {
                throw new InvalidOperationException();
            }
            if (iGenericDictionary.containsKey(abstractC14737k4.mo69249k4(objM27452k4))) {
                return;
            }
            iGenericDictionary.addItem(abstractC14737k4.mo69249k4(objM27452k4), objM27452k4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> void m72724k4(Class<T> cls, IGenericList<T> iGenericList, String str, C7394ca c7394ca, AbstractC14737k4<T> abstractC14737k4) {
        if (C14113y2.m67363du(c7394ca.m29539k4(), str)) {
            Object objM27452k4 = C7019kk.m27452k4((Object) c7394ca.m29542x1(), (Class<Object>) cls);
            if (objM27452k4 == null) {
                throw new InvalidOperationException();
            }
            iGenericList.addItem(objM27452k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72725k4(String str, int[] iArr, int[] iArr2) {
        iArr2[0] = 0;
        iArr[0] = 0;
        if (C14113y2.m67411k4(str)) {
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ControlChar.SPACE_CHAR);
        C14057f9.m66590k4(strArrM67414k4[0], iArr);
        C14057f9.m66590k4(strArrM67414k4[1], iArr2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72726k4(String str, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        iArr4[0] = 0;
        iArr3[0] = 0;
        iArr2[0] = 0;
        iArr[0] = 0;
        if (C14113y2.m67411k4(str)) {
            return;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ControlChar.SPACE_CHAR);
        iArr[0] = C14080ne.m67015to(strArrM67414k4[0]);
        iArr2[0] = C14080ne.m67015to(strArrM67414k4[1]);
        iArr3[0] = C14080ne.m67015to(strArrM67414k4[2]);
        iArr4[0] = C14080ne.m67015to(strArrM67414k4[3]);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m72727k4(gga ggaVar) {
        return ggaVar != gga.m6641x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m72728k4(String str, int[] iArr) {
        if (!m72731kk(str)) {
            return iArr;
        }
        String[] strArrM67433to = C14113y2.m67433to(str);
        int[] iArr2 = new int[strArrM67433to.length];
        for (int i = 0; i < strArrM67433to.length; i++) {
            iArr2[i] = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(C14080ne.m66906fa(strArrM67433to[i], (InterfaceC14073kp) C11697x1.m55250kk()))), 14);
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static <T extends AbstractC7361bz> Object[] m72729k4(String str, IGenericEnumerable<C7394ca> iGenericEnumerable) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentNullException("name");
        }
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("namedObjects");
        }
        List list = new List();
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (C14113y2.m67363du(next.m29539k4(), str)) {
                    list.addItem(next.m29542x1());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list.toArray(new Object[0]);
    }
}
