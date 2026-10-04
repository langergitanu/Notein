package com.aspose.slides.internal.p502xk;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p284mx.OooO00o;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.internal.p380ri.C10010du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.api.ConnectionResult;
import com.orion.notein.domain.models.User;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12542kk {

    /* JADX INFO: renamed from: ak */
    private static final String[] f41974ak;

    /* JADX INFO: renamed from: ar */
    private static final String[] f41975ar;

    /* JADX INFO: renamed from: b3 */
    private static final String[] f41976b3;

    /* JADX INFO: renamed from: bv */
    private static final String[] f41977bv;

    /* JADX INFO: renamed from: bz */
    private static final int[] f41978bz;

    /* JADX INFO: renamed from: c6 */
    private static final String[] f41979c6;

    /* JADX INFO: renamed from: dq */
    private static final String[] f41980dq;

    /* JADX INFO: renamed from: e0 */
    private static final String[] f41981e0;

    /* JADX INFO: renamed from: f9 */
    private static final int[] f41982f9;

    /* JADX INFO: renamed from: g8 */
    private static final String[] f41983g8;

    /* JADX INFO: renamed from: gi */
    private static final int[] f41984gi;

    /* JADX INFO: renamed from: ix */
    private static final String[] f41985ix;

    /* JADX INFO: renamed from: kp */
    private static final int[] f41987kp;

    /* JADX INFO: renamed from: lr */
    private static final String[] f41989lr;

    /* JADX INFO: renamed from: ne */
    private static final String[] f41990ne;

    /* JADX INFO: renamed from: qm */
    private static final String[] f41991qm;

    /* JADX INFO: renamed from: qq */
    private static final String[] f41992qq;

    /* JADX INFO: renamed from: s7 */
    private static final int[] f41994s7;

    /* JADX INFO: renamed from: ss */
    private static final int[] f41995ss;

    /* JADX INFO: renamed from: sv */
    private static final String[] f41996sv;

    /* JADX INFO: renamed from: ts */
    private static final String[] f41997ts;

    /* JADX INFO: renamed from: u4 */
    private static final String[] f41998u4;

    /* JADX INFO: renamed from: um */
    private static final String[] f41999um;

    /* JADX INFO: renamed from: uz */
    private static final String[] f42001uz;

    /* JADX INFO: renamed from: v4 */
    private static final String[] f42002v4;

    /* JADX INFO: renamed from: wl */
    private static final String[] f42003wl;

    /* JADX INFO: renamed from: wp */
    private static final int[] f42004wp;

    /* JADX INFO: renamed from: wy */
    private static final String[] f42005wy;

    /* JADX INFO: renamed from: xk */
    private static final String[] f42008xk;

    /* JADX INFO: renamed from: yd */
    private static final String[] f42009yd;

    /* JADX INFO: renamed from: c5 */
    private int f42011c5;

    /* JADX INFO: renamed from: ck */
    private final String f42012ck;

    /* JADX INFO: renamed from: du */
    private int[][] f42013du;

    /* JADX INFO: renamed from: dy */
    private final int f42014dy;

    /* JADX INFO: renamed from: fa */
    private final String f42015fa;

    /* JADX INFO: renamed from: h4 */
    private int[][] f42016h4;

    /* JADX INFO: renamed from: jd */
    private final String f42017jd;

    /* JADX INFO: renamed from: kk */
    private int[] f42018kk;

    /* JADX INFO: renamed from: m9 */
    private final int f42019m9;

    /* JADX INFO: renamed from: to */
    private int[] f42020to;

    /* JADX INFO: renamed from: k4 */
    private static final int[] f41986k4 = {49};

    /* JADX INFO: renamed from: x1 */
    private static final int[] f42006x1 = {46};

    /* JADX INFO: renamed from: up */
    private static final String[][] f42000up = {new String[]{"eng", TranslateLanguage.ENGLISH}, new String[]{"fra", "fre", TranslateLanguage.FRENCH}, new String[]{"spa", TranslateLanguage.SPANISH}};

    /* JADX INFO: renamed from: yj */
    private static final int[][] f42010yj = {new int[]{65, 26}, new int[]{97, 26}};

    /* JADX INFO: renamed from: ks */
    private static final int[][] f41988ks = {new int[]{73}, new int[]{105}, new int[]{913}, new int[]{945}, new int[]{1488}, new int[]{1571}, new int[]{1575}, new int[]{3585}, new int[]{12354}, new int[]{12356}, new int[]{12450}, new int[]{12452}};

    /* JADX INFO: renamed from: rv */
    private static final String[] f41993rv = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    /* JADX INFO: renamed from: x6 */
    private static final String[] f42007x6 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$c5 */
    public static class c5 implements du {

        /* JADX INFO: renamed from: k4 */
        private int f42021k4;

        public c5(int i) {
            this.f42021k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        private static List<String> m58436k4(List<String> list, int i) {
            String str;
            int i2 = i % 10;
            int i3 = (i / 10) % 10;
            int i4 = (i / 100) % 10;
            if (i4 > 0) {
                list.addItem((i4 == 1 && i3 == 0 && i2 == 0) ? C12542kk.f41979c6[1] : C12542kk.f42008xk[i4]);
            }
            if (i3 <= 0) {
                if (i2 > 0) {
                    str = C12542kk.f41976b3[i2];
                    list.addItem(str);
                    return list;
                }
                return list;
            }
            if (i3 == 1) {
                str = C12542kk.f42005wy[i2];
            } else {
                if (i3 != 2) {
                    list.addItem(C12542kk.f41980dq[i3]);
                    if (i2 > 0) {
                        list.addItem("y");
                        str = C12542kk.f41976b3[i2];
                    }
                    return list;
                }
                str = C12542kk.f41974ak[i2];
            }
            list.addItem(str);
            return list;
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            String str4;
            List<String> list = new List<>();
            if (j >= 1000000000000L) {
                return null;
            }
            boolean zM58401kk = C12542kk.m58401kk(str, "ordinal");
            if (j == 0) {
                str4 = C12542kk.f41976b3[0];
            } else {
                if (!zM58401kk || j > 10) {
                    int i3 = (int) (j % 1000);
                    int i4 = (int) ((j / 1000) % 1000);
                    int i5 = (int) ((j / 1000000) % 1000);
                    int i6 = (int) ((j / 1000000000) % 1000);
                    if (i6 > 0) {
                        if (i6 > 1) {
                            list = m58436k4(list, i6);
                        }
                        list.addItem(C12542kk.f41979c6[2]);
                        list.addItem(C12542kk.f41979c6[4]);
                    }
                    if (i5 > 0) {
                        if (i5 == 1) {
                            list.addItem(C12542kk.f41979c6[0]);
                        } else {
                            list = m58436k4(list, i5);
                        }
                        String[] strArr = C12542kk.f41979c6;
                        list.addItem(i5 > 1 ? strArr[4] : strArr[3]);
                    }
                    if (i4 > 0) {
                        if (i4 > 1) {
                            list = m58436k4(list, i4);
                        }
                        list.addItem(C12542kk.f41979c6[2]);
                    }
                    if (i3 > 0) {
                        list = m58436k4(list, i3);
                    }
                    return C12543to.m58444k4(C12542kk.m58423x1((List<String>) C12542kk.m58421x1(list, this.f42021k4), " "), 0, true);
                }
                str4 = C12542kk.m58401kk(str, User.FEMALE) ? C12542kk.f41981e0[(int) j] : C12542kk.f41997ts[(int) j];
            }
            list.addItem(str4);
            return C12543to.m58444k4(C12542kk.m58423x1((List<String>) C12542kk.m58421x1(list, this.f42021k4), " "), 0, true);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$du */
    public interface du {
        /* JADX INFO: renamed from: k4 */
        int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$dy */
    public static class dy implements du {
        private dy() {
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            String[] strArr;
            String str4;
            List list = new List();
            if (j == 0) {
                return null;
            }
            int i3 = 199999;
            if (C12542kk.m58401kk(str, "unicode-number-forms")) {
                strArr = C12542kk.f41996sv;
            } else if (C12542kk.m58401kk(str, "large")) {
                strArr = C12542kk.f41983g8;
            } else {
                strArr = C12542kk.f41991qm;
                i3 = 4999;
            }
            if (j > i3) {
                return null;
            }
            while (j > 0) {
                int length = C12542kk.f41978bz.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        long j2 = C12542kk.f41978bz[i4];
                        if (j >= j2 && (str4 = strArr[i4]) != null) {
                            C12542kk.m58399kk((List<Integer>) list, (List<Integer>) new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) C12543to.m58444k4(str4, 0, true)))));
                            j -= j2;
                            break;
                        }
                        i4++;
                    }
                }
            }
            if (i == 73) {
                return C12542kk.m58411to(C10010du.m49140k4(list));
            }
            if (i == 105) {
                return C12542kk.m58375du(C10010du.m49140k4(list));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$h4 */
    public static class h4 implements du {
        private h4() {
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$jd */
    public static class jd implements du {
        private jd() {
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            if (i == 3585 && i2 == 1) {
                return C12542kk.m58428x1(j, i, C12542kk.f41982f9.length, C12542kk.f41982f9);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$k4 */
    public static class k4 implements du {
        private k4() {
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            if (i == 1575) {
                int[] iArr = (i2 != 2 && i2 == 1) ? C12542kk.f41987kp : C12542kk.f41995ss;
                return C12542kk.m58428x1(j, i, iArr.length, iArr);
            }
            if (i != 1571 || j == 0 || j > 1999) {
                return null;
            }
            return m58438k4(j, str, str3);
        }

        /* JADX INFO: renamed from: k4 */
        private static int[] m58438k4(long j, String str, String str2) {
            List list = new List();
            int[] iArr = C12542kk.f41995ss;
            int i = (int) ((j / 1000) % 10);
            int i2 = (int) ((j / 100) % 10);
            int i3 = (int) ((j / 10) % 10);
            int i4 = (int) (j % 10);
            if (i > 0) {
                list.addItem(Integer.valueOf(iArr[i + 26]));
            }
            if (i2 > 0) {
                list.addItem(Integer.valueOf(iArr[i2 + 17]));
            }
            if (i3 > 0) {
                list.addItem(Integer.valueOf(iArr[i3 + 8]));
            }
            if (i4 > 0) {
                list.addItem(Integer.valueOf(iArr[i4 - 1]));
            }
            return C10010du.m49140k4(list);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$kk */
    public static class kk implements du {

        /* JADX INFO: renamed from: k4 */
        private int f42022k4;

        public kk(int i) {
            this.f42022k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        private static List<String> m58439k4(List<String> list, int i) {
            String string;
            C6765kp c6765kp;
            String str;
            int i2 = i % 10;
            int i3 = (i / 10) % 10;
            int i4 = (i / 100) % 10;
            if (i4 > 0) {
                if (i4 > 1) {
                    list.addItem(C12542kk.f41975ar[i4]);
                }
                list.addItem((i4 > 1 && i3 == 0 && i2 == 0) ? C12542kk.f42002v4[1] : C12542kk.f42002v4[0]);
            }
            if (i3 <= 0) {
                if (i2 > 0) {
                    string = C12542kk.f41975ar[i2];
                    list.addItem(string);
                    return list;
                }
                return list;
            }
            if (i3 == 1) {
                string = C12542kk.f41999um[i2];
            } else if (i3 >= 7) {
                if (i3 == 7) {
                    if (i2 == 1) {
                        list.addItem(C12542kk.f41977bv[6]);
                        list.addItem(TranslateLanguage.ESTONIAN);
                        string = C12542kk.f41999um[i2];
                    } else {
                        c6765kp = new C6765kp();
                        c6765kp.m26792k4(C12542kk.f41977bv[6]);
                        c6765kp.m26780k4('-');
                        str = C12542kk.f41999um[i2];
                        c6765kp.m26792k4(str);
                    }
                } else {
                    if (i3 != 8) {
                        if (i3 == 9) {
                            C6765kp c6765kp2 = new C6765kp();
                            c6765kp2.m26792k4(C12542kk.f41977bv[8]);
                            c6765kp2.m26780k4('-');
                            c6765kp2.m26792k4(C12542kk.f41999um[i2]);
                            string = c6765kp2.toString();
                        }
                        return list;
                    }
                    c6765kp = new C6765kp();
                    c6765kp.m26792k4(C12542kk.f41977bv[i3]);
                    if (i2 > 0) {
                        c6765kp.m26780k4('-');
                        str = C12542kk.f41975ar[i2];
                        c6765kp.m26792k4(str);
                    } else {
                        c6765kp.m26780k4('s');
                    }
                }
                string = c6765kp.toString();
            } else if (i2 == 1) {
                list.addItem(C12542kk.f41977bv[i3]);
                list.addItem(TranslateLanguage.ESTONIAN);
                string = C12542kk.f41975ar[i2];
            } else {
                c6765kp = new C6765kp();
                c6765kp.m26792k4(C12542kk.f41977bv[i3]);
                if (i2 > 0) {
                    c6765kp.m26780k4('-');
                    str = C12542kk.f41975ar[i2];
                    c6765kp.m26792k4(str);
                }
                string = c6765kp.toString();
            }
            list.addItem(string);
            return list;
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            String str4;
            List<String> list = new List<>();
            if (j >= 1000000000000L) {
                return null;
            }
            boolean zM58401kk = C12542kk.m58401kk(str, "ordinal");
            if (j == 0) {
                str4 = C12542kk.f41975ar[0];
            } else {
                if (!zM58401kk || j > 10) {
                    int i3 = (int) (j % 1000);
                    int i4 = (int) ((j / 1000) % 1000);
                    int i5 = (int) ((j / 1000000) % 1000);
                    int i6 = (int) ((j / 1000000000) % 1000);
                    if (i6 > 0) {
                        list = m58439k4(list, i6);
                        list.addItem(i6 == 1 ? C12542kk.f42002v4[5] : C12542kk.f42002v4[6]);
                    }
                    if (i5 > 0) {
                        list = m58439k4(list, i5);
                        String[] strArr = C12542kk.f42002v4;
                        list.addItem(i5 == 1 ? strArr[3] : strArr[4]);
                    }
                    if (i4 > 0) {
                        if (i4 > 1) {
                            list = m58439k4(list, i4);
                        }
                        list.addItem(C12542kk.f42002v4[2]);
                    }
                    if (i3 > 0) {
                        list = m58439k4(list, i3);
                    }
                    return C12543to.m58444k4(C12542kk.m58423x1((List<String>) C12542kk.m58421x1(list, this.f42022k4), " "), 0, true);
                }
                str4 = C12542kk.m58401kk(str, User.FEMALE) ? C12542kk.f42009yd[(int) j] : C12542kk.f41989lr[(int) j];
            }
            list.addItem(str4);
            return C12543to.m58444k4(C12542kk.m58423x1((List<String>) C12542kk.m58421x1(list, this.f42022k4), " "), 0, true);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$m9 */
    public static class m9 implements du {
        private m9() {
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            if (i == 12354 && i2 == 1) {
                return C12542kk.m58428x1(j, i, C12542kk.f41984gi.length, C12542kk.f41984gi);
            }
            if (i == 12450 && i2 == 1) {
                return C12542kk.m58428x1(j, i, C12542kk.f41994s7.length, C12542kk.f41994s7);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$to */
    public static class to implements du {
        private to() {
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            if (i == 1488) {
                if (i2 == 1) {
                    return C12542kk.m58428x1(j, i, C12542kk.f42004wp.length, C12542kk.f42004wp);
                }
                if (i2 == 2 && j != 0 && j <= 1999) {
                    return m58440k4(j, str, str3);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k4 */
        private static int[] m58440k4(long j, String str, String str2) {
            int i;
            int i2;
            List list = new List();
            int[] iArr = C12542kk.f42004wp;
            int i3 = (int) ((j / 1000) % 10);
            int i4 = (int) ((j / 100) % 10);
            int i5 = (int) ((j / 10) % 10);
            int i6 = (int) (j % 10);
            if (i3 > 0) {
                OooO00o.OooO00o(iArr[i3 - 1], 1523, list);
            }
            if (i4 > 0) {
                if (i4 < 5) {
                    i2 = iArr[i4 + 17];
                } else if (i4 < 9) {
                    list.addItem(Integer.valueOf(iArr[21]));
                    list.addItem(1524);
                    i2 = iArr[i4 + 13];
                } else if (i4 == 9) {
                    list.addItem(Integer.valueOf(iArr[21]));
                    list.addItem(Integer.valueOf(iArr[21]));
                    list.addItem(1524);
                    i2 = iArr[i4 + 9];
                }
                list.addItem(Integer.valueOf(i2));
            }
            if (j == 15) {
                OooO00o.OooO00o(iArr[8], 1524, list);
                i = iArr[5];
            } else {
                if (j != 16) {
                    if (i5 > 0) {
                        list.addItem(Integer.valueOf(iArr[i5 + 8]));
                    }
                    if (i6 > 0) {
                        i = iArr[i6 - 1];
                    }
                    return C10010du.m49140k4(list);
                }
                OooO00o.OooO00o(iArr[8], 1524, list);
                i = iArr[6];
            }
            list.addItem(Integer.valueOf(i));
            return C10010du.m49140k4(list);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xk.kk$x1 */
    public static class x1 implements du {

        /* JADX INFO: renamed from: k4 */
        private int f42023k4;

        public x1(int i) {
            this.f42023k4 = i;
        }

        /* JADX INFO: renamed from: k4 */
        private static List<String> m58441k4(List<String> list, int i) {
            return m58442k4(list, i, false);
        }

        /* JADX INFO: renamed from: k4 */
        private static List<String> m58442k4(List<String> list, int i, boolean z) {
            String str;
            int i2 = i % 10;
            int i3 = (i / 10) % 10;
            int i4 = (i / 100) % 10;
            if (i4 > 0) {
                list.addItem(C12542kk.f41993rv[i4]);
                list.addItem((z && i % 100 == 0) ? C12542kk.f41992qq[0] : C12542kk.f41985ix[0]);
            }
            if (i3 <= 0) {
                if (i2 > 0) {
                    str = z ? C12542kk.f41998u4[i2] : C12542kk.f41993rv[i2];
                    list.addItem(str);
                    return list;
                }
                return list;
            }
            if (i3 != 1) {
                list.addItem((z && i2 == 0) ? C12542kk.f42003wl[i3] : C12542kk.f41990ne[i3]);
                if (i2 > 0) {
                    str = z ? C12542kk.f41998u4[i2] : C12542kk.f41993rv[i2];
                }
                return list;
            }
            str = z ? C12542kk.f42001uz[i2] : C12542kk.f42007x6[i2];
            list.addItem(str);
            return list;
        }

        @Override // com.aspose.slides.internal.p502xk.C12542kk.du
        /* JADX INFO: renamed from: k4 */
        public final int[] mo58437k4(long j, int i, int i2, String str, String str2, String str3) {
            String str4;
            String str5;
            String str6;
            String str7;
            List<String> list = new List<>();
            if (j >= 1000000000000L) {
                return null;
            }
            boolean zM58401kk = C12542kk.m58401kk(str, "ordinal");
            if (j == 0) {
                str7 = C12542kk.f41993rv[0];
            } else {
                if (!zM58401kk || j >= 10) {
                    long j2 = j % 1000;
                    int i3 = (int) j2;
                    int i4 = (int) ((j / 1000) % 1000);
                    int i5 = (int) ((j / 1000000) % 1000);
                    int i6 = (int) ((j / 1000000000) % 1000);
                    if (i6 > 0) {
                        list = m58441k4(list, i6);
                        if (!zM58401kk || j % 1000000000 != 0) {
                            str6 = C12542kk.f41985ix[3];
                        } else {
                            str6 = C12542kk.f41992qq[3];
                        }
                        list.addItem(str6);
                    }
                    if (i5 > 0) {
                        list = m58441k4(list, i5);
                        if (!zM58401kk || j % 1000000 != 0) {
                            str5 = C12542kk.f41985ix[2];
                        } else {
                            str5 = C12542kk.f41992qq[2];
                        }
                        list.addItem(str5);
                    }
                    if (i4 > 0) {
                        List<String> listM58441k4 = m58441k4(list, i4);
                        if (!zM58401kk || j2 != 0) {
                            str4 = C12542kk.f41985ix[1];
                        } else {
                            str4 = C12542kk.f41992qq[1];
                        }
                        listM58441k4.addItem(str4);
                        list = listM58441k4;
                    }
                    if (i3 > 0) {
                        list = m58442k4(list, i3, zM58401kk);
                    }
                    return C12543to.m58444k4(C12542kk.m58423x1((List<String>) C12542kk.m58421x1(list, this.f42023k4), " "), 0, true);
                }
                str7 = C12542kk.f41998u4[(int) j];
            }
            list.addItem(str7);
            return C12543to.m58444k4(C12542kk.m58423x1((List<String>) C12542kk.m58421x1(list, this.f42023k4), " "), 0, true);
        }
    }

    static {
        String str = C14113y2.f47374k4;
        f41990ne = new String[]{str, "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        f41985ix = new String[]{"hundred", "thousand", "million", "billion"};
        f41998u4 = new String[]{"none", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth"};
        f42001uz = new String[]{"tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth"};
        f42003wl = new String[]{str, "tenth", "twentieth", "thirtieth", "fortieth", "fiftieth", "sixtieth", "seventieth", "eightieth", "ninetith"};
        f41992qq = new String[]{"hundredth", "thousandth", "millionth", "billionth"};
        f41975ar = new String[]{"zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf"};
        f41999um = new String[]{"dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf"};
        f41977bv = new String[]{str, "dix", "vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix", "quatre-vingt", "quatre-vingt-dix"};
        f42002v4 = new String[]{"cent", "cents", "mille", "million", "millions", "milliard", "milliards"};
        f41989lr = new String[]{"premier", "deuxième", "troisième", "quatrième", "cinquième", "sixième", "septième", "huitième", "neuvième", "dixième"};
        f42009yd = new String[]{"première", "deuxième", "troisième", "quatrième", "cinquième", "sixième", "septième", "huitième", "neuvième", "dixième"};
        f41976b3 = new String[]{"cero", "uno", "dos", "tres", "cuatro", "cinco", "seise", "siete", "ocho", "nueve"};
        f42005wy = new String[]{"diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
        f41974ak = new String[]{"veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"};
        f41980dq = new String[]{str, "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        f42008xk = new String[]{str, "ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
        f41979c6 = new String[]{"un", "cien", "mil", "millón", "millones"};
        f41997ts = new String[]{"ninguno", "primero", "segundo", "tercero", "cuarto", "quinto", "sexto", "séptimo", "octavo", "novento", "décimo"};
        f41981e0 = new String[]{"ninguna", "primera", "segunda", "tercera", "cuarta", "quinta", "sexta", "séptima", "octava", "noventa", "décima"};
        f41978bz = new int[]{100000, 90000, 50000, 40000, 10000, ConnectionResult.NETWORK_ERROR, 5000, 4000, 1000, SQLitePersistence.MAX_ARGS, 500, 400, 100, 90, 50, 40, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        f41991qm = new String[]{null, null, null, null, null, null, null, null, "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", null, null, null, "v", "iv", null, null, ContextChain.TAG_INFRA};
        f41983g8 = new String[]{"ↈ", "ↂↈ", "ↇ", "ↂↇ", "ↂ", "ↀↂ", "ↁ", "ↀↁ", "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", null, null, null, "v", "iv", null, null, ContextChain.TAG_INFRA};
        f41996sv = new String[]{"ↈ", "ↂↈ", "ↇ", "ↂↇ", "ↂ", "ↀↂ", "ↁ", "ↀↁ", "Ⅿ", "ⅭⅯ", "Ⅾ", "ⅭⅮ", "Ⅽ", "ⅩⅭ", "Ⅼ", "ⅩⅬ", "Ⅹ", "Ⅸ", "Ⅷ", "Ⅶ", "Ⅵ", "Ⅴ", "Ⅳ", "Ⅲ", "Ⅱ", "Ⅰ"};
        f42004wp = new int[]{1488, 1489, 1490, 1491, 1492, 1493, 1494, 1495, 1496, 1497, 1499, com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 1502, 1504, 1505, 1506, 1508, 1510, 1511, 1512, 1513, 1514, 1498, 1501, 1503, 1507, 1509};
        f41995ss = new int[]{1571, 1576, 1580, 1583, 1607, 1608, 1586, 1581, 1591, 1609, 1603, 1604, 1605, 1606, 1587, 1593, 1601, 1589, 1602, 1585, 1588, 1578, 1579, 1582, 1584, 1590, 1592, 1594};
        f41987kp = new int[]{1571, 1576, 1578, 1579, 1580, 1581, 1582, 1583, 1584, 1585, 1586, 1587, 1588, 1589, 1590, 1591, 1592, 1593, 1594, 1601, 1602, 1603, 1604, 1605, 1606, 1607, 1608, 1609};
        f41984gi = new int[]{12354, 12356, 12358, 12360, 12362, 12363, 12365, 12367, 12369, 12371, 12373, 12375, 12377, 12379, 12381, 12383, 12385, 12388, 12390, 12392, 12394, 12395, 12396, 12397, 12398, 12399, 12402, 12405, 12408, 12411, 12414, 12415, 12416, 12417, 12418, 12420, 12422, 12424, 12425, 12426, 12427, 12428, 12429, 12431, 12432, 12433, 12434, 12435};
        f41994s7 = new int[]{12450, 12452, 12454, 12456, 12458, 12459, 12461, 12463, 12465, 12467, 12469, 12471, 12473, 12475, 12477, 12479, 12481, 12484, 12486, 12488, 12490, 12491, 12492, 12493, 12494, 12495, 12498, GoogleSignInStatusCodes.SIGN_IN_CANCELLED, 12504, 12507, 12510, 12511, 12512, 12513, 12514, 12516, 12518, 12520, 12521, 12522, 12523, 12524, 12525, 12527, 12528, 12529, 12530, 12531};
        f41982f9 = new int[]{3585, 3586, 3587, 3588, 3589, 3590, 3591, 3592, 3593, 3594, 3595, 3596, 3597, 3598, 3599, 3600, 3601, 3602, 3603, 3604, 3605, 3606, 3607, 3608, 3609, 3610, 3611, 3612, 3613, 3614, 3615, 3616, 3617, 3618, 3619, 3621, 3623, 3624, 3625, 3626, 3627, 3628, 3629, 3630};
    }

    public C12542kk(String str, int i, int i2, int i3, String str2, String str3, String str4) {
        this.f42019m9 = i;
        this.f42014dy = i2;
        this.f42011c5 = i3;
        this.f42017jd = str2;
        this.f42012ck = str3 != null ? C14113y2.m67368h4(str3) : null;
        this.f42015fa = str4 != null ? C14113y2.m67368h4(str4) : null;
        m58389k4(str);
    }

    /* JADX INFO: renamed from: du */
    private static int m58374du(int i) {
        for (int[] iArr : f42010yj) {
            if (iArr[0] == i) {
                return iArr[1];
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: h4 */
    private static boolean m58379h4(int i) {
        for (int[] iArr : f41988ks) {
            if (iArr[0] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public static void m58399kk(List<Integer> list, List<Integer> list2) {
        List.Enumerator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            try {
                Integer num = (Integer) C7019kk.m27464to(it.next(), Integer.TYPE);
                num.intValue();
                list.addItem(num);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static boolean m58410to(int i) {
        for (int[] iArr : f42010yj) {
            if (iArr[0] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m58420x1(int i) {
        char c = (char) i;
        if (C14117yj.m67545x1(c) == 8) {
            return C7019kk.m27462to(Double.valueOf(C14117yj.m67524k4(c)), 14);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public static int[] m58375du(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = C14117yj.m67538rv((char) iArr[i]);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static List<Integer> m58384k4(List<Integer> list, int i, int i2) {
        if (list.size() <= i) {
            return list;
        }
        List<Integer> list2 = new List<>();
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (size - i4) - 1;
            if (i3 == i) {
                list2.insertItem(0, Integer.valueOf(i2));
                i3 = 1;
            } else {
                i3++;
            }
            list2.insertItem(0, list.get_Item(i5));
        }
        return list2;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m58400kk(int i) {
        return C14117yj.m67524k4((char) i) == 1.0d && C14117yj.m67524k4((char) (i + (-1))) == 0.0d && C14117yj.m67524k4((char) (i + 8)) == 9.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public static int[] m58411to(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = C14117yj.m67521ix((char) iArr[i]);
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static List<String> m58421x1(List<String> list, int i) {
        List<String> list2 = new List<>();
        List.Enumerator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                list2.addItem(m58387k4(it.next(), i));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: k4 */
    private static du m58385k4(int i, int i2, String str, String str2) {
        if (i != 73 && i != 105) {
            if (i != 913 && i != 945) {
                if (i == 1488) {
                    return new to();
                }
                if (i != 1571 && i != 1575) {
                    if (i == 3585) {
                        return new jd();
                    }
                    if (i == 12354 || i == 12356 || i == 12450 || i == 12452) {
                        return new m9();
                    }
                    return null;
                }
                return new k4();
            }
            return new h4();
        }
        return new dy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: kk */
    public static boolean m58401kk(String str, String str2) {
        if (str != null) {
            for (String str3 : C14113y2.m67414k4(str, ',')) {
                if (C14113y2.m67363du(C14113y2.m67414k4(str3, '=')[0], str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m58422x1(List<Integer> list) {
        return C12543to.m58443k4(C10010du.m49140k4(list));
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m58402kk(int[] iArr) {
        if (m58420x1(iArr[iArr.length - 1]) != 1) {
            return false;
        }
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            if (m58420x1(iArr[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static String m58423x1(List<String> list, String str) {
        C6765kp c6765kp = new C6765kp();
        List.Enumerator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                if (c6765kp.m26807x1() > 0) {
                    c6765kp.m26792k4(str);
                }
                c6765kp.m26792k4(next);
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
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m58434k4(long j) {
        List<Long> list = new List<>();
        list.addItem(Long.valueOf(j));
        return m58435k4(list);
    }

    /* JADX INFO: renamed from: x1 */
    private void m58424x1(List<Integer> list, List<Long> list2) {
        int[] iArr = f41986k4;
        int length = this.f42013du.length;
        int length2 = this.f42016h4.length;
        List.Enumerator<Long> it = list2.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            try {
                long jLongValue = ((Long) C7019kk.m27464to(it.next(), Long.TYPE)).longValue();
                int[] iArr2 = null;
                if (i < length) {
                    if (i2 > 0) {
                        if (i3 < length2) {
                            int[] iArr3 = this.f42016h4[i3];
                            i3++;
                            iArr2 = iArr3;
                        } else {
                            iArr2 = f42006x1;
                        }
                    }
                    iArr = this.f42013du[i];
                    i++;
                }
                m58399kk(list, (List<Integer>) new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) m58396k4(jLongValue, iArr2, iArr)))));
                i2++;
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
    public final String m58435k4(List<Long> list) {
        List<Integer> list2 = new List<>();
        int[] iArr = this.f42018kk;
        if (iArr != null) {
            m58399kk(list2, (List<Integer>) new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr))));
        }
        m58424x1(list2, list);
        int[] iArr2 = this.f42020to;
        if (iArr2 != null) {
            m58399kk(list2, (List<Integer>) new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr2))));
        }
        return m58422x1(list2);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m58425x1(String str) {
        String str2 = this.f42012ck;
        if (str2 == null) {
            return false;
        }
        if (C14113y2.m67363du(str2, str)) {
            return true;
        }
        return m58426x1(str, this.f42012ck);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m58387k4(String str, int i) {
        if (i == 0) {
            return C14113y2.m67358c5(str);
        }
        if (i == 1) {
            return C14113y2.m67368h4(str);
        }
        if (i != 2) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            String strM49139k4 = C10009ck.m49139k4(str, i2, i3);
            c6765kp.m26792k4(i2 == 0 ? C14113y2.m67358c5(strM49139k4) : C14113y2.m67368h4(strM49139k4));
            i2 = i3;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m58426x1(String str, String str2) {
        for (String[] strArr : f42000up) {
            if (C14113y2.m67363du(strArr[0], str)) {
                for (String str3 : strArr) {
                    if (C14113y2.m67363du(str3, str2)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private int[] m58427x1(long j, int i) {
        return (m58425x1("eng") ? new x1(i) : m58425x1("spa") ? new c5(i) : m58425x1("fra") ? new kk(i) : new x1(i)).mo58437k4(j, 0, this.f42011c5, this.f42017jd, this.f42012ck, this.f42015fa);
    }

    /* JADX INFO: renamed from: k4 */
    private void m58389k4(String str) {
        List list = new List();
        List list2 = new List();
        if (str == null || str.length() == 0) {
            str = "1";
        }
        List list3 = new List();
        char c = 0;
        for (int i : C12543to.m58444k4(str, 0, true)) {
            char c2 = m58390k4(i) ? (char) 1 : (char) 2;
            if (c2 != c) {
                if (list3.size() > 0) {
                    if (c == 1) {
                        list.addItem(C10010du.m49140k4(list3));
                    } else {
                        list2.addItem(C10010du.m49140k4(list3));
                    }
                    list3.clear();
                }
                c = c2;
            }
            list3.addItem(Integer.valueOf(i));
        }
        if (list3.size() > 0) {
            int[] iArrM49140k4 = C10010du.m49140k4(list3);
            if (c == 1) {
                list.addItem(iArrM49140k4);
            } else {
                list2.addItem(iArrM49140k4);
            }
        }
        if (list2.size() != 0) {
            this.f42018kk = (int[]) list2.get_Item(0);
            list2.removeAt(0);
        }
        if (list2.size() != 0) {
            this.f42020to = (int[]) OooO0O0.OooO00o(list2, 1);
            list2.removeAt(list2.size() - 1);
        }
        this.f42016h4 = new int[list2.size()][];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            this.f42016h4[i2] = new int[((int[]) list2.get_Item(i2)).length];
            for (int i3 = 0; i3 < ((int[]) list2.get_Item(i2)).length; i3++) {
                this.f42016h4[i2][i3] = ((int[]) list2.get_Item(i2))[i3];
            }
        }
        this.f42013du = new int[list.size()][];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f42013du[i4] = new int[((int[]) list.get_Item(i4)).length];
            for (int i5 = 0; i5 < ((int[]) list.get_Item(i4)).length; i5++) {
                this.f42013du[i4][i5] = ((int[]) list.get_Item(i4))[i5];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static int[] m58428x1(long j, int i, int i2, int[] iArr) {
        List list = new List();
        if (j == 0) {
            return null;
        }
        while (j > 0) {
            long j2 = j - 1;
            long j3 = i2;
            int i3 = (int) (j2 % j3);
            list.insertItem(0, Integer.valueOf(iArr != null ? iArr[i3] : i3 + i));
            j = j2 / j3;
        }
        return C10010du.m49140k4(list);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m58390k4(int i) {
        int iM67545x1 = C14117yj.m67545x1((char) i);
        if (iM67545x1 != 0 && iM67545x1 != 1 && iM67545x1 != 2 && iM67545x1 != 3 && iM67545x1 != 4) {
            switch (iM67545x1) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m58392k4(long j, int i) {
        du duVarM58385k4 = m58385k4(i, this.f42011c5, this.f42017jd, this.f42015fa);
        if (duVarM58385k4 != null) {
            return duVarM58385k4.mo58437k4(j, i, this.f42011c5, this.f42017jd, this.f42012ck, this.f42015fa);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m58393k4(long j, int i, int i2) {
        int i3;
        List<Integer> list = new List<>();
        int i4 = i - 1;
        while (j > 0) {
            list.insertItem(0, Integer.valueOf(((int) (j % 10)) + i4));
            j /= 10;
        }
        while (i2 > list.size()) {
            list.insertItem(0, Integer.valueOf(i4));
        }
        int i5 = this.f42014dy;
        if (i5 != 0 && (i3 = this.f42019m9) != 0) {
            list = m58384k4(list, i5, i3);
        }
        return C10010du.m49140k4(list);
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m58395k4(long j, int[] iArr) {
        int[] iArrM58393k4;
        if (j < 0) {
            throw new ArgumentException("number must be non-negative");
        }
        if (iArr.length == 1) {
            int i = iArr[0];
            if (i == 49) {
                iArrM58393k4 = m58393k4(j, 49, 1);
            } else if (i == 87 || i == 119) {
                iArrM58393k4 = m58427x1(j, i != 87 ? 1 : 0);
            } else {
                iArrM58393k4 = m58400kk(i) ? m58393k4(j, i, 1) : m58410to(i) ? m58428x1(j, i, m58374du(i), null) : m58379h4(i) ? m58392k4(j, i) : null;
            }
        } else if (iArr.length == 2 && iArr[0] == 87 && iArr[1] == 119) {
            iArrM58393k4 = m58427x1(j, 2);
        } else {
            if (!m58402kk(iArr)) {
                throw new ArgumentException(C14113y2.m67408k4("invalid format token: \"", C12543to.m58443k4(iArr), "\""));
            }
            iArrM58393k4 = m58393k4(j, iArr[iArr.length - 1], iArr.length);
        }
        return iArrM58393k4 == null ? m58395k4(j, f41986k4) : iArrM58393k4;
    }

    /* JADX INFO: renamed from: k4 */
    private int[] m58396k4(long j, int[] iArr, int[] iArr2) {
        List list = new List();
        if (iArr != null) {
            m58399kk((List<Integer>) list, (List<Integer>) new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) iArr))));
        }
        if (iArr2 != null) {
            m58399kk((List<Integer>) list, (List<Integer>) new List(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) m58395k4(j, iArr2)))));
        }
        return C10010du.m49140k4(list);
    }
}
