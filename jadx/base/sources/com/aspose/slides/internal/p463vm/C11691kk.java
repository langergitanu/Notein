package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p527yk.C12853to;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C11691kk implements InterfaceC14059g8, InterfaceC14073kp, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private static C11691kk f39560c5 = null;

    /* JADX INFO: renamed from: to */
    private static String f39567to = "This instance is read only";

    /* JADX INFO: renamed from: ak */
    private String[] f39568ak;

    /* JADX INFO: renamed from: ar */
    private String f39569ar;

    /* JADX INFO: renamed from: b3 */
    private String[] f39570b3;

    /* JADX INFO: renamed from: bv */
    private AbstractC11694rv f39571bv;

    /* JADX INFO: renamed from: bz */
    private String[] f39572bz;

    /* JADX INFO: renamed from: c6 */
    private String[] f39573c6;

    /* JADX INFO: renamed from: ck */
    private String f39574ck;

    /* JADX INFO: renamed from: dq */
    private String[] f39575dq;

    /* JADX INFO: renamed from: e0 */
    private String[] f39576e0;

    /* JADX INFO: renamed from: f9 */
    private String[] f39577f9;

    /* JADX INFO: renamed from: fa */
    private String f39578fa;

    /* JADX INFO: renamed from: g8 */
    private boolean f39579g8;

    /* JADX INFO: renamed from: gi */
    private String f39580gi;

    /* JADX INFO: renamed from: ix */
    private String f39581ix;

    /* JADX INFO: renamed from: j2 */
    private String[] f39582j2;

    /* JADX INFO: renamed from: jd */
    private boolean f39583jd;

    /* JADX INFO: renamed from: kk */
    HashMap<Character, String[]> f39584kk;

    /* JADX INFO: renamed from: kp */
    private String f39585kp;

    /* JADX INFO: renamed from: ks */
    private String f39586ks;

    /* JADX INFO: renamed from: lr */
    private String[] f39587lr;

    /* JADX INFO: renamed from: ne */
    private String f39588ne;

    /* JADX INFO: renamed from: qm */
    private int f39589qm;

    /* JADX INFO: renamed from: qq */
    private String f39590qq;

    /* JADX INFO: renamed from: qw */
    private String[] f39591qw;

    /* JADX INFO: renamed from: rv */
    private String f39592rv;

    /* JADX INFO: renamed from: s7 */
    private String[] f39593s7;

    /* JADX INFO: renamed from: ss */
    private boolean f39594ss;

    /* JADX INFO: renamed from: sv */
    private boolean f39595sv;

    /* JADX INFO: renamed from: t6 */
    private String[] f39596t6;

    /* JADX INFO: renamed from: tq */
    private String[] f39597tq;

    /* JADX INFO: renamed from: ts */
    private String[] f39598ts;

    /* JADX INFO: renamed from: u4 */
    private String f39599u4;

    /* JADX INFO: renamed from: um */
    private int f39600um;

    /* JADX INFO: renamed from: up */
    private String f39601up;

    /* JADX INFO: renamed from: uz */
    private String f39602uz;

    /* JADX INFO: renamed from: v4 */
    private int f39603v4;

    /* JADX INFO: renamed from: vh */
    private String[] f39604vh;

    /* JADX INFO: renamed from: vj */
    private int[] f39605vj;

    /* JADX INFO: renamed from: w6 */
    private String f39606w6;

    /* JADX INFO: renamed from: wl */
    private String f39607wl;

    /* JADX INFO: renamed from: wp */
    private int f39608wp;

    /* JADX INFO: renamed from: wy */
    private String[] f39609wy;

    /* JADX INFO: renamed from: x1 */
    String[] f39610x1;

    /* JADX INFO: renamed from: x6 */
    private String f39611x6;

    /* JADX INFO: renamed from: xk */
    private String[] f39612xk;

    /* JADX INFO: renamed from: xw */
    private String[] f39613xw;

    /* JADX INFO: renamed from: yd */
    private String[] f39614yd;

    /* JADX INFO: renamed from: yj */
    private String f39615yj;

    /* JADX INFO: renamed from: du */
    private static String[] f39561du = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    /* JADX INFO: renamed from: h4 */
    private static String[] f39563h4 = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    /* JADX INFO: renamed from: m9 */
    private static String[] f39565m9 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", ""};

    /* JADX INFO: renamed from: dy */
    private static String[] f39562dy = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", ""};

    /* JADX INFO: renamed from: k4 */
    static String[] f39564k4 = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};

    /* JADX INFO: renamed from: os */
    private static char[] f39566os = {'d', 'D', 'f', 'F', 'g', 'G', 'm', 'M', 'o', 'O', 'r', 'R', 's', 't', 'T', 'u', 'U', 'y', 'Y'};

    public C11691kk() {
        this(false);
    }

    /* JADX INFO: renamed from: ar */
    public static C11691kk m55139ar() {
        return C11697x1.m55252to().m55261du();
    }

    /* JADX INFO: renamed from: k4 */
    public static C11691kk m55140k4(C11691kk c11691kk) {
        C11691kk c11691kk2 = (C11691kk) c11691kk.deepClone();
        c11691kk2.f39583jd = true;
        return c11691kk2;
    }

    /* JADX INFO: renamed from: ts */
    private void m55144ts() {
        this.f39568ak = new String[]{"MM/dd/yyyy"};
        this.f39575dq = new String[]{"dddd, dd MMMM yyyy"};
        this.f39573c6 = new String[]{"HH:mm:ss"};
        this.f39612xk = new String[]{"HH:mm", "hh:mm tt", "H:mm", "h:mm tt"};
        this.f39598ts = new String[]{"MMMM dd"};
        this.f39576e0 = new String[]{"yyyy MMMM"};
    }

    /* JADX INFO: renamed from: um */
    public static C11691kk m55145um() {
        if (f39560c5 == null) {
            C11691kk c11691kkM55140k4 = m55140k4(new C11691kk());
            f39560c5 = c11691kkM55140k4;
            c11691kkM55140k4.m55144ts();
        }
        return f39560c5;
    }

    /* JADX INFO: renamed from: ak */
    public String m55147ak() {
        return this.f39569ar;
    }

    /* JADX INFO: renamed from: b3 */
    public String m55148b3() {
        return "yyyy'-'MM'-'dd'T'HH':'mm':'ss.fffffffK";
    }

    /* JADX INFO: renamed from: bv */
    public int m55149bv() {
        return this.f39600um;
    }

    /* JADX INFO: renamed from: c5 */
    public void m55150c5(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39581ix = str;
    }

    /* JADX INFO: renamed from: c6 */
    public int m55153c6() {
        return this.f39608wp;
    }

    /* JADX INFO: renamed from: ck */
    public void m55154ck(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39602uz = str;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11691kk c11691kk = (C11691kk) m55213xk();
        c11691kk.m55178k4(m55205v4());
        c11691kk.f39583jd = false;
        return c11691kk;
    }

    /* JADX INFO: renamed from: dq */
    public String[] m55157dq() {
        String[] strArr = this.f39610x1;
        if (strArr != null) {
            return m55146x6(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public void m55158du(int i) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        this.f39603v4 = i;
    }

    /* JADX INFO: renamed from: dy */
    public void m55162dy(int i) {
        this.f39608wp = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C11691kk)) {
            C11691kk c11691kk = (C11691kk) obj;
            if (m55153c6() == c11691kk.m55153c6() && m55188lr() == c11691kk.m55188lr() && m55149bv() == c11691kk.m55149bv() && Arrays.equals(this.f39593s7, c11691kk.f39593s7) && Arrays.equals(this.f39577f9, c11691kk.f39577f9) && Arrays.equals(m55211x1(), c11691kk.m55211x1()) && Arrays.equals(m55176jd(), c11691kk.m55176jd()) && Arrays.equals(m55199to(), c11691kk.m55199to()) && Arrays.equals(m55172h4(), c11691kk.m55172h4()) && Arrays.equals(m55156ck(), c11691kk.m55156ck()) && Arrays.equals(m55165dy(), c11691kk.m55165dy()) && Arrays.equals(m55168fa(), c11691kk.m55168fa()) && C14113y2.m67363du(m55201up(), c11691kk.m55201up()) && C14113y2.m67363du(m55215yj(), c11691kk.m55215yj()) && C14113y2.m67363du(m55187ks(), c11691kk.m55187ks()) && C14113y2.m67363du(m55195rv(), c11691kk.m55195rv()) && C14113y2.m67363du(m55194qq(), c11691kk.m55194qq()) && C14113y2.m67363du(m55212x6(), c11691kk.m55212x6()) && C14113y2.m67363du(m55200u4(), c11691kk.m55200u4()) && C14113y2.m67363du(m55193ne(), c11691kk.m55193ne()) && C14113y2.m67363du(m55173ix(), c11691kk.m55173ix()) && C14113y2.m67363du(m55214yd(), c11691kk.m55214yd()) && C14113y2.m67363du(m55147ak(), c11691kk.m55147ak()) && C14113y2.m67363du(m55207wy(), c11691kk.m55207wy()) && C14113y2.m67363du(m55204uz(), c11691kk.m55204uz()) && C14113y2.m67363du(m55206wl(), c11691kk.m55206wl()) && Arrays.equals(m55157dq(), c11691kk.m55157dq())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public void m55166fa(String str) {
        this.f39607wl = str;
    }

    /* JADX INFO: renamed from: h4 */
    public String m55169h4(int i) {
        if (i < 0 || i > 6) {
            throw new ArgumentOutOfRangeException();
        }
        return this.f39614yd[i];
    }

    public int hashCode() {
        int i = (this.f39583jd ? 1 : 0) * 31;
        String str = this.f39574ck;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39578fa;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39601up;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f39615yj;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f39586ks;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f39592rv;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f39611x6;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f39588ne;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f39581ix;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f39599u4;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f39602uz;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f39607wl;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f39590qq;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f39569ar;
        int iHashCode14 = (((iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31) + this.f39600um) * 31;
        AbstractC11694rv abstractC11694rv = this.f39571bv;
        int iHashCode15 = (((iHashCode14 + (abstractC11694rv != null ? abstractC11694rv.hashCode() : 0)) * 31) + this.f39603v4) * 31;
        String[] strArr = this.f39587lr;
        int iHashCode16 = (iHashCode15 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f39614yd;
        int iHashCode17 = (iHashCode16 + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        String[] strArr3 = this.f39570b3;
        int iHashCode18 = (iHashCode17 + (strArr3 != null ? Arrays.hashCode(strArr3) : 0)) * 31;
        String[] strArr4 = this.f39609wy;
        int iHashCode19 = (iHashCode18 + (strArr4 != null ? Arrays.hashCode(strArr4) : 0)) * 31;
        String[] strArr5 = this.f39568ak;
        int iHashCode20 = (iHashCode19 + (strArr5 != null ? Arrays.hashCode(strArr5) : 0)) * 31;
        String[] strArr6 = this.f39575dq;
        int iHashCode21 = (iHashCode20 + (strArr6 != null ? Arrays.hashCode(strArr6) : 0)) * 31;
        String[] strArr7 = this.f39612xk;
        int iHashCode22 = (iHashCode21 + (strArr7 != null ? Arrays.hashCode(strArr7) : 0)) * 31;
        String[] strArr8 = this.f39573c6;
        int iHashCode23 = (iHashCode22 + (strArr8 != null ? Arrays.hashCode(strArr8) : 0)) * 31;
        String[] strArr9 = this.f39598ts;
        int iHashCode24 = (iHashCode23 + (strArr9 != null ? Arrays.hashCode(strArr9) : 0)) * 31;
        String[] strArr10 = this.f39576e0;
        int iHashCode25 = (iHashCode24 + (strArr10 != null ? Arrays.hashCode(strArr10) : 0)) * 31;
        String[] strArr11 = this.f39572bz;
        int iHashCode26 = (((((((((((iHashCode25 + (strArr11 != null ? Arrays.hashCode(strArr11) : 0)) * 31) + this.f39589qm) * 31) + (this.f39579g8 ? 1 : 0)) * 31) + (this.f39595sv ? 1 : 0)) * 31) + this.f39608wp) * 31) + (this.f39594ss ? 1 : 0)) * 31;
        String str15 = this.f39585kp;
        int iHashCode27 = (iHashCode26 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f39580gi;
        int iHashCode28 = (iHashCode27 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String[] strArr12 = this.f39593s7;
        int iHashCode29 = (iHashCode28 + (strArr12 != null ? Arrays.hashCode(strArr12) : 0)) * 31;
        String[] strArr13 = this.f39577f9;
        int iHashCode30 = (iHashCode29 + (strArr13 != null ? Arrays.hashCode(strArr13) : 0)) * 31;
        String[] strArr14 = this.f39596t6;
        int iHashCode31 = (iHashCode30 + (strArr14 != null ? Arrays.hashCode(strArr14) : 0)) * 31;
        String[] strArr15 = this.f39613xw;
        int iHashCode32 = (iHashCode31 + (strArr15 != null ? Arrays.hashCode(strArr15) : 0)) * 31;
        int[] iArr = this.f39605vj;
        int iHashCode33 = (iHashCode32 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        String[] strArr16 = this.f39604vh;
        int iHashCode34 = (iHashCode33 + (strArr16 != null ? Arrays.hashCode(strArr16) : 0)) * 31;
        String[] strArr17 = this.f39591qw;
        int iHashCode35 = (iHashCode34 + (strArr17 != null ? Arrays.hashCode(strArr17) : 0)) * 31;
        String[] strArr18 = this.f39597tq;
        int iHashCode36 = (iHashCode35 + (strArr18 != null ? Arrays.hashCode(strArr18) : 0)) * 31;
        String[] strArr19 = this.f39582j2;
        int iHashCode37 = (iHashCode36 + (strArr19 != null ? Arrays.hashCode(strArr19) : 0)) * 31;
        String str17 = this.f39606w6;
        int iHashCode38 = (iHashCode37 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String[] strArr20 = this.f39610x1;
        int iHashCode39 = (iHashCode38 + (strArr20 != null ? Arrays.hashCode(strArr20) : 0)) * 31;
        HashMap<Character, String[]> map = this.f39584kk;
        return iHashCode39 + (map != null ? map.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ix */
    public String m55173ix() {
        return this.f39611x6;
    }

    /* JADX INFO: renamed from: jd */
    public void m55174jd(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39599u4 = str;
    }

    /* JADX INFO: renamed from: kk */
    public String m55183kk(int i) {
        if (i < 1 || i > 13) {
            throw new ArgumentOutOfRangeException();
        }
        return this.f39570b3[i - 1];
    }

    /* JADX INFO: renamed from: ks */
    public String m55187ks() {
        return this.f39601up;
    }

    /* JADX INFO: renamed from: lr */
    public int m55188lr() {
        return this.f39603v4;
    }

    /* JADX INFO: renamed from: m9 */
    public String m55189m9(int i) {
        if (i < 0 || i > 6) {
            throw new ArgumentOutOfRangeException();
        }
        return this.f39587lr[i];
    }

    /* JADX INFO: renamed from: ne */
    public String m55193ne() {
        return this.f39586ks;
    }

    /* JADX INFO: renamed from: qq */
    public String m55194qq() {
        return this.f39602uz;
    }

    /* JADX INFO: renamed from: rv */
    public String m55195rv() {
        return this.f39615yj;
    }

    /* JADX INFO: renamed from: to */
    public void m55196to(int i) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (i < 0 || i > 6) {
            throw new ArgumentOutOfRangeException();
        }
        this.f39600um = i;
    }

    /* JADX INFO: renamed from: u4 */
    public String m55200u4() {
        return this.f39588ne;
    }

    /* JADX INFO: renamed from: up */
    public String m55201up() {
        return this.f39574ck;
    }

    /* JADX INFO: renamed from: uz */
    public String m55204uz() {
        return this.f39581ix;
    }

    /* JADX INFO: renamed from: v4 */
    public AbstractC11694rv m55205v4() {
        if (this.f39571bv == null) {
            this.f39571bv = C12853to.m59909kk(this.f39608wp);
        }
        return this.f39571bv;
    }

    /* JADX INFO: renamed from: wl */
    public String m55206wl() {
        return this.f39599u4;
    }

    /* JADX INFO: renamed from: wy */
    public String m55207wy() {
        return this.f39590qq;
    }

    /* JADX INFO: renamed from: x1 */
    public String m55208x1(int i) {
        int[] iArrMo55093x1 = m55205v4().mo55093x1();
        for (int i2 = 0; i2 < iArrMo55093x1.length; i2++) {
            if (i == iArrMo55093x1[i2]) {
                return this.f39593s7[i2];
            }
        }
        throw new ArgumentOutOfRangeException("era", Integer.toString(i));
    }

    /* JADX INFO: renamed from: x6 */
    public String m55212x6() {
        return this.f39592rv;
    }

    /* JADX INFO: renamed from: xk */
    public Object m55213xk() {
        C11691kk c11691kk = new C11691kk(false);
        c11691kk.m55158du(m55188lr());
        c11691kk.m55196to(m55149bv());
        String[] strArr = this.f39593s7;
        if (strArr != null) {
            c11691kk.m55203up(strArr);
        }
        String[] strArr2 = this.f39577f9;
        if (strArr2 != null) {
            c11691kk.m55217yj(strArr2);
        }
        c11691kk.m55181k4(m55211x1());
        c11691kk.m55151c5(m55176jd());
        c11691kk.m55185kk(m55199to());
        c11691kk.m55160du(m55172h4());
        c11691kk.m55175jd(m55156ck());
        c11691kk.m55191m9(m55165dy());
        c11691kk.m55155ck(m55168fa());
        c11691kk.m55179k4(m55201up());
        c11691kk.m55209x1(m55215yj());
        c11691kk.m55184kk(m55187ks());
        c11691kk.m55197to(m55195rv());
        c11691kk.m55154ck(m55194qq());
        c11691kk.m55159du(m55212x6());
        c11691kk.m55163dy(m55200u4());
        c11691kk.m55170h4(m55193ne());
        c11691kk.m55190m9(m55173ix());
        c11691kk.m55166fa(m55214yd());
        c11691kk.m55216yj(m55147ak());
        c11691kk.m55202up(m55207wy());
        c11691kk.m55150c5(m55204uz());
        c11691kk.m55174jd(m55206wl());
        c11691kk.m55167fa(m55157dq());
        if (this.f39584kk != null) {
            c11691kk.m55180k4(new HashMap<>(this.f39584kk));
        }
        c11691kk.m55162dy(m55153c6());
        return c11691kk;
    }

    /* JADX INFO: renamed from: yd */
    public String m55214yd() {
        return this.f39607wl;
    }

    /* JADX INFO: renamed from: yj */
    public String m55215yj() {
        return this.f39578fa;
    }

    public C11691kk(boolean z) {
        this.f39571bv = null;
        this.f39583jd = z;
        this.f39574ck = "AM";
        this.f39578fa = "PM";
        this.f39601up = "/";
        this.f39615yj = C18241k5.f55433h;
        this.f39586ks = "MM/dd/yyyy";
        this.f39592rv = "dddd, dd MMMM yyyy";
        this.f39611x6 = "HH:mm";
        this.f39588ne = "HH:mm:ss z";
        this.f39581ix = "MMMM dd";
        this.f39599u4 = "MMMM, yyyy";
        this.f39602uz = "dddd, dd MMMM yyyy HH:mm:ss zzz";
        this.f39607wl = "ddd, dd MMM yyyy HH':'mm':'ss 'GMT'";
        this.f39590qq = "yyyy'-'MM'-'dd'T'HH':'mm':'ss";
        this.f39569ar = "yyyy'-'MM'-'dd HH':'mm':'ss'Z'";
        this.f39600um = 0;
        this.f39587lr = f39561du;
        this.f39614yd = f39563h4;
        String[] strArr = f39565m9;
        this.f39609wy = strArr;
        String[] strArr2 = f39562dy;
        this.f39570b3 = strArr2;
        this.f39597tq = strArr;
        this.f39591qw = strArr2;
        this.f39572bz = f39564k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11691kk m55141k4(InterfaceC14073kp interfaceC14073kp) {
        C11691kk c11691kk;
        return (interfaceC14073kp == null || (c11691kk = (C11691kk) interfaceC14073kp.mo55052k4(C7019kk.m27443k4((Class<?>) C11691kk.class))) == null) ? m55139ar() : c11691kk;
    }

    /* JADX INFO: renamed from: ks */
    private void m55142ks(String[] strArr) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (strArr == null) {
            throw new ArgumentNullException();
        }
        if (strArr.length != 7) {
            throw new ArgumentException("An array with exactly 7 elements is required");
        }
        int iM67202k4 = AbstractC14092to.m67202k4(strArr, (Object) null, 0, strArr.length);
        if (iM67202k4 >= 0) {
            throw new ArgumentNullException(C14113y2.m67402k4("Element at index {0} is null", Integer.valueOf(iM67202k4)));
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m55143rv(String[] strArr) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (strArr == null) {
            throw new ArgumentNullException();
        }
        if (strArr.length != 13) {
            throw new ArgumentException("An array with exactly 13 elements is required");
        }
        int iM67202k4 = AbstractC14092to.m67202k4(strArr, (Object) null, 0, strArr.length);
        if (iM67202k4 >= 0) {
            throw new ArgumentNullException(C14113y2.m67402k4("Element at index {0} is null", Integer.valueOf(iM67202k4)));
        }
    }

    /* JADX INFO: renamed from: x6 */
    private String[] m55146x6(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        if (length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        return strArr2;
    }

    /* JADX INFO: renamed from: c5 */
    public void m55151c5(String[] strArr) {
        m55143rv(strArr);
        this.f39597tq = strArr;
    }

    /* JADX INFO: renamed from: ck */
    public void m55155ck(String[] strArr) {
        m55142ks(strArr);
        this.f39572bz = strArr;
    }

    /* JADX INFO: renamed from: du */
    public void m55159du(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39592rv = str;
    }

    /* JADX INFO: renamed from: dy */
    public void m55163dy(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39588ne = str;
    }

    /* JADX INFO: renamed from: fa */
    public void m55167fa(String[] strArr) {
        this.f39610x1 = strArr;
    }

    /* JADX INFO: renamed from: h4 */
    public void m55170h4(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39586ks = str;
    }

    /* JADX INFO: renamed from: jd */
    public void m55175jd(String[] strArr) {
        m55143rv(strArr);
        this.f39591qw = strArr;
    }

    /* JADX INFO: renamed from: kk */
    public void m55184kk(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39601up = str;
    }

    /* JADX INFO: renamed from: m9 */
    public void m55190m9(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39611x6 = str;
    }

    /* JADX INFO: renamed from: to */
    public void m55197to(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39615yj = str;
    }

    /* JADX INFO: renamed from: up */
    public void m55202up(String str) {
        this.f39590qq = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55209x1(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39578fa = str;
    }

    /* JADX INFO: renamed from: yj */
    public void m55216yj(String str) {
        this.f39569ar = str;
    }

    /* JADX INFO: renamed from: c5 */
    public String[] m55152c5() {
        return this.f39570b3;
    }

    /* JADX INFO: renamed from: ck */
    public String[] m55156ck() {
        return m55146x6(this.f39591qw);
    }

    /* JADX INFO: renamed from: du */
    public void m55160du(String[] strArr) {
        m55171h4(strArr);
    }

    /* JADX INFO: renamed from: dy */
    public void m55164dy(String[] strArr) {
        m55143rv(strArr);
        this.f39570b3 = m55146x6(strArr);
    }

    /* JADX INFO: renamed from: fa */
    public String[] m55168fa() {
        return m55146x6(this.f39572bz);
    }

    /* JADX INFO: renamed from: h4 */
    public void m55171h4(String[] strArr) {
        m55142ks(strArr);
        this.f39614yd = m55146x6(strArr);
    }

    /* JADX INFO: renamed from: jd */
    public String[] m55176jd() {
        return m55146x6(this.f39597tq);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14073kp
    /* JADX INFO: renamed from: k4 */
    public Object mo55052k4(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5.m66751kk(C7019kk.m27443k4((Class<?>) C11691kk.class))) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public void m55185kk(String[] strArr) {
        m55198to(strArr);
    }

    /* JADX INFO: renamed from: m9 */
    public void m55191m9(String[] strArr) {
        m55164dy(strArr);
    }

    /* JADX INFO: renamed from: to */
    public void m55198to(String[] strArr) {
        m55143rv(strArr);
        this.f39609wy = m55146x6(strArr);
    }

    /* JADX INFO: renamed from: up */
    public void m55203up(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f39593s7 = new String[]{"A.D."};
        } else {
            this.f39593s7 = m55146x6(strArr);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m55210x1(String[] strArr) {
        m55142ks(strArr);
        this.f39587lr = m55146x6(strArr);
    }

    /* JADX INFO: renamed from: yj */
    public void m55217yj(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            this.f39577f9 = new String[]{"AD"};
        } else {
            this.f39577f9 = m55146x6(strArr);
        }
    }

    /* JADX INFO: renamed from: du */
    public String[] m55161du() {
        return this.f39609wy;
    }

    /* JADX INFO: renamed from: dy */
    public String[] m55165dy() {
        return m55146x6(m55152c5());
    }

    /* JADX INFO: renamed from: h4 */
    public String[] m55172h4() {
        return m55146x6(m55192m9());
    }

    /* JADX INFO: renamed from: k4 */
    public String m55177k4(int i) {
        if (i < 1 || i > 13) {
            throw new ArgumentOutOfRangeException();
        }
        return this.f39609wy[i - 1];
    }

    /* JADX INFO: renamed from: kk */
    public String[] m55186kk() {
        return this.f39587lr;
    }

    /* JADX INFO: renamed from: m9 */
    public String[] m55192m9() {
        return this.f39614yd;
    }

    /* JADX INFO: renamed from: to */
    public String[] m55199to() {
        return m55146x6(m55161du());
    }

    /* JADX INFO: renamed from: x1 */
    public String[] m55211x1() {
        return m55146x6(m55186kk());
    }

    /* JADX INFO: renamed from: k4 */
    public void m55178k4(AbstractC11694rv abstractC11694rv) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (abstractC11694rv == null) {
            throw new ArgumentNullException();
        }
        this.f39571bv = abstractC11694rv;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55179k4(String str) {
        if (m55182k4()) {
            throw new InvalidOperationException(f39567to);
        }
        if (str == null) {
            throw new ArgumentNullException();
        }
        this.f39574ck = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55180k4(HashMap<Character, String[]> map) {
        this.f39584kk = map;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55181k4(String[] strArr) {
        m55210x1(strArr);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m55182k4() {
        return this.f39583jd;
    }
}
