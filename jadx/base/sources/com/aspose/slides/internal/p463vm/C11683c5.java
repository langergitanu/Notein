package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p527yk.C12851kk;
import com.aspose.slides.internal.p527yk.C12852m9;
import com.aspose.slides.internal.p527yk.C12853to;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.c5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11683c5 implements InterfaceC14059g8, InterfaceC14073kp, Cloneable {

    /* JADX INFO: renamed from: ar */
    private String f39503ar;

    /* JADX INFO: renamed from: bv */
    private String f39504bv;

    /* JADX INFO: renamed from: c5 */
    private String f39505c5;

    /* JADX INFO: renamed from: ck */
    private String f39506ck;

    /* JADX INFO: renamed from: du */
    private int[] f39507du;

    /* JADX INFO: renamed from: dy */
    private String f39508dy;

    /* JADX INFO: renamed from: fa */
    private int f39509fa;

    /* JADX INFO: renamed from: h4 */
    private int f39510h4;

    /* JADX INFO: renamed from: ix */
    private String f39511ix;

    /* JADX INFO: renamed from: jd */
    private String f39512jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f39513k4;

    /* JADX INFO: renamed from: kk */
    private String f39514kk;

    /* JADX INFO: renamed from: ks */
    private int[] f39515ks;

    /* JADX INFO: renamed from: lr */
    private int f39516lr;

    /* JADX INFO: renamed from: m9 */
    private int f39517m9;

    /* JADX INFO: renamed from: ne */
    private String f39518ne;

    /* JADX INFO: renamed from: qq */
    private String f39519qq;

    /* JADX INFO: renamed from: rv */
    private int f39520rv;

    /* JADX INFO: renamed from: to */
    private String f39521to;

    /* JADX INFO: renamed from: u4 */
    private int[] f39522u4;

    /* JADX INFO: renamed from: um */
    private String f39523um;

    /* JADX INFO: renamed from: up */
    private String f39524up;

    /* JADX INFO: renamed from: uz */
    private int f39525uz;

    /* JADX INFO: renamed from: v4 */
    private String[] f39526v4;

    /* JADX INFO: renamed from: wl */
    private int f39527wl;

    /* JADX INFO: renamed from: x1 */
    private int f39528x1;

    /* JADX INFO: renamed from: x6 */
    private int f39529x6;

    /* JADX INFO: renamed from: yd */
    private int f39530yd;

    /* JADX INFO: renamed from: yj */
    private String f39531yj;

    public C11683c5() {
        this(false);
    }

    /* JADX INFO: renamed from: ck */
    public static C11683c5 m55033ck() {
        return new C11683c5(false);
    }

    /* JADX INFO: renamed from: jd */
    public static C11683c5 m55034jd() {
        C11683c5 c11683c5M55263fa = C11697x1.m55252to().m55263fa();
        c11683c5M55263fa.f39513k4 = true;
        return c11683c5M55263fa;
    }

    /* JADX INFO: renamed from: ak */
    public String m55036ak() {
        return this.f39523um;
    }

    /* JADX INFO: renamed from: ar */
    public String m55037ar() {
        return this.f39518ne;
    }

    /* JADX INFO: renamed from: b3 */
    public String m55038b3() {
        return this.f39519qq;
    }

    /* JADX INFO: renamed from: bv */
    public int[] m55039bv() {
        return (int[]) m55071v4().clone();
    }

    /* JADX INFO: renamed from: c5 */
    public String m55040c5() {
        return this.f39508dy;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11683c5 c11683c5 = (C11683c5) m55079xk();
        c11683c5.f39513k4 = false;
        return c11683c5;
    }

    /* JADX INFO: renamed from: dq */
    public String m55042dq() {
        return this.f39504bv;
    }

    /* JADX INFO: renamed from: du */
    public void m55043du(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39524up = str;
    }

    /* JADX INFO: renamed from: dy */
    public int m55045dy() {
        return this.f39517m9;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C11683c5)) {
            C11683c5 c11683c5 = (C11683c5) obj;
            if (c11683c5.m55051k4() == m55051k4() && c11683c5.m55074x1() == m55074x1() && C14113y2.m67363du(c11683c5.m55056kk(), m55056kk()) && C14113y2.m67363du(c11683c5.m55065to(), m55065to()) && Arrays.equals(c11683c5.m55044du(), m55044du()) && c11683c5.m55060m9() == m55060m9() && c11683c5.m55045dy() == m55045dy() && C14113y2.m67363du(c11683c5.m55040c5(), m55040c5()) && C14113y2.m67363du(c11683c5.m55047fa(), m55047fa()) && C14113y2.m67363du(c11683c5.m55058ks(), m55058ks()) && C14113y2.m67363du(c11683c5.m55064rv(), m55064rv()) && c11683c5.m55078x6() == m55078x6() && C14113y2.m67363du(c11683c5.m55062ne(), m55062ne()) && C14113y2.m67363du(c11683c5.m55050ix(), m55050ix()) && Arrays.equals(c11683c5.m55067u4(), m55067u4()) && c11683c5.m55072wl() == m55072wl() && c11683c5.m55063qq() == m55063qq() && C14113y2.m67363du(c11683c5.m55037ar(), m55037ar()) && C14113y2.m67363du(c11683c5.m55068um(), m55068um()) && Arrays.equals(c11683c5.m55039bv(), m55039bv()) && c11683c5.m55059lr() == m55059lr() && c11683c5.m55080yd() == m55080yd() && C14113y2.m67363du(c11683c5.m55038b3(), m55038b3()) && C14113y2.m67363du(c11683c5.m55073wy(), m55073wy()) && C14113y2.m67363du(c11683c5.m55036ak(), m55036ak()) && C14113y2.m67363du(c11683c5.m55042dq(), m55042dq()) && Arrays.deepEquals(c11683c5.m55069up(), m55069up()) && c11683c5.m55081yj() == m55081yj()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    public String m55047fa() {
        return this.f39505c5;
    }

    /* JADX INFO: renamed from: h4 */
    public void m55048h4(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39531yj = str;
    }

    public int hashCode() {
        int i = (((this.f39513k4 ? 1 : 0) * 31) + this.f39528x1) * 31;
        String str = this.f39514kk;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39521to;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int[] iArr = this.f39507du;
        int iHashCode3 = (((((iHashCode2 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31) + this.f39510h4) * 31) + this.f39517m9) * 31;
        String str3 = this.f39508dy;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f39505c5;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f39512jd;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f39506ck;
        int iHashCode7 = (((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f39509fa) * 31;
        String str7 = this.f39524up;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f39531yj;
        int iHashCode9 = (iHashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        int[] iArr2 = this.f39515ks;
        int iHashCode10 = (((((iHashCode9 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31) + this.f39520rv) * 31) + this.f39529x6) * 31;
        String str9 = this.f39518ne;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f39511ix;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        int[] iArr3 = this.f39522u4;
        int iHashCode13 = (((((iHashCode12 + (iArr3 != null ? Arrays.hashCode(iArr3) : 0)) * 31) + this.f39525uz) * 31) + this.f39527wl) * 31;
        String str11 = this.f39519qq;
        int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f39503ar;
        int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f39523um;
        int iHashCode16 = (iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f39504bv;
        int iHashCode17 = (iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String[] strArr = this.f39526v4;
        return ((((iHashCode17 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31) + this.f39516lr) * 31) + this.f39530yd;
    }

    /* JADX INFO: renamed from: ix */
    public String m55050ix() {
        return this.f39531yj;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55051k4() {
        return this.f39530yd;
    }

    /* JADX INFO: renamed from: kk */
    public String m55056kk() {
        return this.f39514kk;
    }

    /* JADX INFO: renamed from: ks */
    public String m55058ks() {
        return this.f39512jd;
    }

    /* JADX INFO: renamed from: lr */
    public int m55059lr() {
        return this.f39525uz;
    }

    /* JADX INFO: renamed from: m9 */
    public int m55060m9() {
        return this.f39510h4;
    }

    /* JADX INFO: renamed from: ne */
    public String m55062ne() {
        return this.f39524up;
    }

    /* JADX INFO: renamed from: qq */
    public int m55063qq() {
        return this.f39529x6;
    }

    /* JADX INFO: renamed from: rv */
    public String m55064rv() {
        return this.f39506ck;
    }

    /* JADX INFO: renamed from: to */
    public String m55065to() {
        return this.f39521to;
    }

    /* JADX INFO: renamed from: u4 */
    public int[] m55067u4() {
        return (int[]) m55070uz().clone();
    }

    /* JADX INFO: renamed from: um */
    public String m55068um() {
        return this.f39511ix;
    }

    /* JADX INFO: renamed from: up */
    public String[] m55069up() {
        return (String[]) this.f39526v4.clone();
    }

    /* JADX INFO: renamed from: uz */
    public int[] m55070uz() {
        return this.f39515ks;
    }

    /* JADX INFO: renamed from: v4 */
    public int[] m55071v4() {
        return this.f39522u4;
    }

    /* JADX INFO: renamed from: wl */
    public int m55072wl() {
        return this.f39520rv;
    }

    /* JADX INFO: renamed from: wy */
    public String m55073wy() {
        return this.f39503ar;
    }

    /* JADX INFO: renamed from: x1 */
    public int m55074x1() {
        return this.f39528x1;
    }

    /* JADX INFO: renamed from: x6 */
    public int m55078x6() {
        return this.f39509fa;
    }

    /* JADX INFO: renamed from: xk */
    public Object m55079xk() {
        C11683c5 c11683c5 = new C11683c5(m55051k4(), false);
        c11683c5.f39528x1 = this.f39528x1;
        c11683c5.f39514kk = this.f39514kk;
        c11683c5.f39521to = this.f39521to;
        c11683c5.f39507du = (int[]) this.f39507du.clone();
        c11683c5.f39510h4 = this.f39510h4;
        c11683c5.f39517m9 = this.f39517m9;
        c11683c5.f39508dy = this.f39508dy;
        c11683c5.f39505c5 = this.f39505c5;
        c11683c5.f39512jd = this.f39512jd;
        c11683c5.f39506ck = this.f39506ck;
        c11683c5.f39509fa = this.f39509fa;
        c11683c5.f39524up = this.f39524up;
        c11683c5.f39531yj = this.f39531yj;
        c11683c5.f39515ks = (int[]) this.f39515ks.clone();
        c11683c5.f39520rv = this.f39520rv;
        c11683c5.f39529x6 = this.f39529x6;
        c11683c5.f39518ne = this.f39518ne;
        c11683c5.f39511ix = this.f39511ix;
        c11683c5.f39522u4 = (int[]) this.f39522u4.clone();
        c11683c5.f39525uz = this.f39525uz;
        c11683c5.f39527wl = this.f39527wl;
        c11683c5.f39519qq = this.f39519qq;
        c11683c5.f39503ar = this.f39503ar;
        c11683c5.f39523um = this.f39523um;
        c11683c5.f39504bv = this.f39504bv;
        c11683c5.f39526v4 = (String[]) this.f39526v4.clone();
        return c11683c5;
    }

    /* JADX INFO: renamed from: yd */
    public int m55080yd() {
        return this.f39527wl;
    }

    /* JADX INFO: renamed from: yj */
    public int m55081yj() {
        return this.f39516lr;
    }

    public C11683c5(int i, boolean z) {
        this.f39526v4 = null;
        this.f39516lr = 1;
        this.f39530yd = i;
        this.f39513k4 = z;
        if (i == 127) {
            this.f39528x1 = 2;
            this.f39514kk = ".";
            this.f39521to = ",";
            this.f39507du = new int[]{3};
            this.f39510h4 = 0;
            this.f39517m9 = 0;
            this.f39508dy = "¤";
            this.f39505c5 = "NaN";
            this.f39512jd = "-Infinity";
            this.f39506ck = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
            this.f39509fa = 2;
            this.f39524up = ".";
            this.f39531yj = ",";
            this.f39515ks = new int[]{3};
            this.f39520rv = 1;
            this.f39529x6 = 2;
            this.f39518ne = ".";
            this.f39511ix = ",";
            this.f39522u4 = new int[]{3};
            this.f39525uz = 0;
            this.f39527wl = 0;
            this.f39519qq = "%";
            this.f39503ar = "‰";
            this.f39523um = "Infinity";
            this.f39504bv = "+";
            this.f39526v4 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            return;
        }
        C12851kk c12851kkM59914x1 = C12853to.m59914x1(i);
        if (c12851kkM59914x1 != null) {
            if (c12851kkM59914x1.f43298kk) {
                throw new InvalidOperationException(C14113y2.m67402k4("Culture '{0}' is a neutral culture. It cannot be used in formatting and parsing and therefore cannot be set as the thread's current ", c12851kkM59914x1.f43297k4));
            }
            C12852m9 c12852m9 = c12851kkM59914x1.f43296du;
            this.f39528x1 = c12852m9.f43311k4;
            this.f39514kk = c12852m9.f43324x1;
            this.f39521to = c12852m9.f43312kk;
            this.f39507du = c12852m9.f43318to;
            this.f39510h4 = c12852m9.f43305du;
            this.f39517m9 = c12852m9.f43308h4;
            this.f39508dy = c12852m9.f43314m9;
            this.f39505c5 = c12852m9.f43306dy;
            this.f39512jd = c12852m9.f43310jd;
            this.f39506ck = c12852m9.f43304ck;
            this.f39509fa = c12852m9.f43307fa;
            this.f39524up = c12852m9.f43321up;
            this.f39531yj = c12852m9.f43326yj;
            this.f39515ks = c12852m9.f43313ks;
            this.f39520rv = c12852m9.f43317rv;
            this.f39529x6 = c12852m9.f43325x6;
            this.f39518ne = c12852m9.f43315ne;
            this.f39511ix = c12852m9.f43309ix;
            this.f39522u4 = c12852m9.f43319u4;
            this.f39525uz = c12852m9.f43322uz;
            this.f39527wl = c12852m9.f43323wl;
            this.f39519qq = c12852m9.f43316qq;
            this.f39503ar = c12852m9.f43301ar;
            this.f39523um = c12852m9.f43320um;
            this.f39504bv = c12852m9.f43302bv;
            this.f39526v4 = c12852m9.f43303c5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11683c5 m55035k4(InterfaceC14073kp interfaceC14073kp) {
        if (interfaceC14073kp != null) {
            if (interfaceC14073kp instanceof C11697x1) {
                return ((C11697x1) interfaceC14073kp).m55263fa();
            }
            if (interfaceC14073kp instanceof C11683c5) {
                return (C11683c5) interfaceC14073kp;
            }
        }
        return m55034jd();
    }

    /* JADX INFO: renamed from: c5 */
    public void m55041c5(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39523um = str;
    }

    /* JADX INFO: renamed from: du */
    public int[] m55044du() {
        return (int[]) m55049h4().clone();
    }

    /* JADX INFO: renamed from: dy */
    public void m55046dy(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39503ar = str;
    }

    /* JADX INFO: renamed from: h4 */
    public int[] m55049h4() {
        return this.f39507du;
    }

    /* JADX INFO: renamed from: kk */
    public void m55057kk(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39512jd = str;
    }

    /* JADX INFO: renamed from: m9 */
    public void m55061m9(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39519qq = str;
    }

    /* JADX INFO: renamed from: to */
    public void m55066to(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39506ck = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55075x1(int i) {
        if (i < 0 || i > 99) {
            throw new ArgumentOutOfRangeException("The value specified for the property is less than 0 or greater than 99");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39509fa = i;
    }

    public C11683c5(boolean z) {
        this(127, z);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14073kp
    /* JADX INFO: renamed from: k4 */
    public Object mo55052k4(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5.mo48624ks().equals(C11683c5.class)) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55076x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39505c5 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55053k4(int i) {
        this.f39516lr = i;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55077x1(int[] iArr) {
        if (iArr == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        if (iArr.length == 0) {
            this.f39515ks = new int[0];
            return;
        }
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 < 1 || i2 > 9) {
                throw new ArgumentOutOfRangeException("One of the elements in the array specified is not between 1 and 9");
            }
        }
        int i3 = iArr[length];
        if (i3 < 0 || i3 > 9) {
            throw new ArgumentOutOfRangeException("Last element in the array specified is not between 0 and 9");
        }
        this.f39515ks = (int[]) iArr.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public void m55054k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("The value specified for the property is a null reference");
        }
        if (this.f39513k4) {
            throw new InvalidOperationException("The current instance is read-only and a set operation was attempted");
        }
        this.f39514kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55055k4(int[] iArr) {
        m55077x1(iArr);
    }
}
