package com.aspose.slides.internal.p474wg;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.ck */
/* JADX INFO: loaded from: classes5.dex */
class C11928ck extends AbstractC7020m9<C11928ck> {

    /* JADX INFO: renamed from: to */
    static final /* synthetic */ boolean f40191to = true;

    /* JADX INFO: renamed from: du */
    private int f40192du;

    /* JADX INFO: renamed from: kk */
    int f40193kk;

    /* JADX INFO: renamed from: x1 */
    String f40194x1;

    /* JADX INFO: renamed from: k4 */
    static final String[] f40190k4 = {"r", "ddd, dd'-'MMM'-'yyyy HH':'mm':'ss 'GMT'", "ddd, dd'-'MMM'-'yy HH':'mm':'ss 'GMT'"};

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f40189h4 = new C7017h4("COMMENT", "COMMENTURL", "DISCARD", "DOMAIN", "HTTPONLY", "MAX-AGE", "EXPIRES", "PATH", "PORT", "SECURE", "VERSION", LocalePreferences.FirstDayOfWeek.MONDAY, LocalePreferences.FirstDayOfWeek.TUESDAY, LocalePreferences.FirstDayOfWeek.WEDNESDAY, LocalePreferences.FirstDayOfWeek.THURSDAY, LocalePreferences.FirstDayOfWeek.FRIDAY, LocalePreferences.FirstDayOfWeek.SATURDAY, LocalePreferences.FirstDayOfWeek.SUNDAY, "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");

    public C11928ck() {
    }

    /* JADX INFO: renamed from: du */
    private String m55895du() {
        int i;
        int i2 = this.f40192du;
        if (i2 >= this.f40193kk) {
            return null;
        }
        while (i2 < this.f40193kk && C14117yj.m67534ks(this.f40194x1.charAt(i2))) {
            i2++;
        }
        if (this.f40194x1.charAt(i2) == '\"') {
            int i3 = i2 + 1;
            while (i3 < this.f40193kk && this.f40194x1.charAt(i3) != '\"') {
                i3++;
            }
            i = i3 + 1;
            int i4 = i;
            while (i4 < this.f40193kk && this.f40194x1.charAt(i4) != ';' && this.f40194x1.charAt(i4) != ',') {
                i4++;
            }
            this.f40192du = i4;
        } else {
            i = i2;
            while (i < this.f40193kk && this.f40194x1.charAt(i) != ';' && this.f40194x1.charAt(i) != ',') {
                i++;
            }
            this.f40192du = i;
        }
        return C14113y2.m67440x1(C14113y2.m67443x1(this.f40194x1, i2, i - i2));
    }

    /* JADX INFO: renamed from: kk */
    private C11955m9 m55898kk() {
        String strM55899to = m55899to();
        int i = this.f40192du;
        if (i >= this.f40193kk) {
            return new C11955m9(strM55899to, C14113y2.f47374k4);
        }
        String strM55895du = C14113y2.f47374k4;
        if (this.f40194x1.charAt(i) == '=') {
            this.f40192du++;
            strM55895du = m55895du();
        }
        C11955m9 c11955m9 = new C11955m9(strM55899to, strM55895du);
        int i2 = this.f40192du;
        if (i2 < this.f40193kk) {
            if (this.f40194x1.charAt(i2) == ',') {
                this.f40192du++;
                return c11955m9;
            }
            String str = this.f40194x1;
            int i3 = this.f40192du;
            this.f40192du = i3 + 1;
            if (str.charAt(i3) == ';' && this.f40192du < this.f40193kk) {
                while (this.f40192du < this.f40193kk) {
                    String strM55899to2 = m55899to();
                    String strM55895du2 = C14113y2.f47374k4;
                    int i4 = this.f40192du;
                    if (i4 < this.f40193kk && this.f40194x1.charAt(i4) == '=') {
                        this.f40192du++;
                        strM55895du2 = m55895du();
                    }
                    m55896k4(c11955m9, strM55899to2, strM55895du2);
                    int i5 = this.f40192du;
                    if (i5 >= this.f40193kk) {
                        break;
                    }
                    if (this.f40194x1.charAt(i5) == ',') {
                        this.f40192du++;
                        return c11955m9;
                    }
                    if (this.f40194x1.charAt(this.f40192du) != ';') {
                        break;
                    }
                    this.f40192du++;
                }
            }
        }
        return c11955m9;
    }

    /* JADX INFO: renamed from: to */
    private String m55899to() {
        int i = this.f40192du;
        while (i < this.f40193kk && C14117yj.m67534ks(this.f40194x1.charAt(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < this.f40193kk && this.f40194x1.charAt(i2) != ';' && this.f40194x1.charAt(i2) != ',' && this.f40194x1.charAt(i2) != '=') {
            i2++;
        }
        this.f40192du = i2;
        return C14113y2.m67440x1(C14113y2.m67443x1(this.f40194x1, i, i2 - i));
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (!f40191to && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C11928ck) {
            return m55901x1((C11928ck) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public IGenericEnumerable<C11955m9> m55902k4() {
        List list = new List();
        while (this.f40192du < this.f40193kk) {
            try {
                list.add(m55898kk());
            } catch (RuntimeException unused) {
                while (true) {
                    int i = this.f40192du;
                    if (i >= this.f40193kk || this.f40194x1.charAt(i) == ',') {
                        break;
                    }
                    this.f40192du++;
                }
                this.f40192du++;
            }
        }
        return list;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C11928ck Clone() {
        C11928ck c11928ck = new C11928ck();
        CloneTo(c11928ck);
        return c11928ck;
    }

    public C11928ck(String str) {
        this.f40194x1 = str;
        this.f40193kk = str.length();
        this.f40192du = 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14084qq m55900x1(String str) {
        if (!C14113y2.m67411k4(str)) {
            int i = 0;
            while (true) {
                String[] strArr = f40190k4;
                if (i >= AbstractC14092to.m67208k4((Object) strArr).m67265du()) {
                    break;
                }
                try {
                    C14084qq c14084qqClone = C14084qq.m67090k4(str, strArr[i], C11697x1.m55250kk()).Clone();
                    C14084qq.m67087k4(c14084qqClone.Clone(), 1L).CloneTo(c14084qqClone);
                    return c14084qqClone.Clone().m67145ne();
                } catch (RuntimeException unused) {
                    i++;
                }
            }
        }
        return C14084qq.f47299x1.Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C11928ck c11928ck) {
        if (c11928ck == null) {
            c11928ck = new C11928ck();
        }
        c11928ck.f40194x1 = this.f40194x1;
        c11928ck.f40193kk = this.f40193kk;
        c11928ck.f40192du = this.f40192du;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55896k4(C11955m9 c11955m9, String str, String str2) {
        if (str == null || C14113y2.m67363du(str, C14113y2.f47374k4)) {
            throw new InvalidOperationException();
        }
        try {
            switch (f40189h4.m27428k4(C14113y2.m67371jd(str))) {
                case 0:
                    if (c11955m9.m56058k4() == null) {
                        c11955m9.m56062k4(str2);
                        return;
                    }
                    return;
                case 1:
                    if (c11955m9.m56075x1() == null) {
                        c11955m9.m56060k4(new C14062gk(str2));
                        return;
                    }
                    return;
                case 2:
                    c11955m9.m56063k4(true);
                    return;
                case 3:
                    if ("".equals(c11955m9.m56071to())) {
                        c11955m9.m56077x1(str2);
                        return;
                    }
                    return;
                case 4:
                    c11955m9.m56066kk(true);
                    return;
                case 5:
                    if (C14084qq.m67112m9(c11955m9.m56069m9(), C14084qq.f47299x1)) {
                        c11955m9.m56061k4(c11955m9.m56079yj().m67128du(C7019kk.m27433c5(Long.valueOf(C14114y9.m67456k4(str2)), 10)).Clone());
                        return;
                    }
                    return;
                case 6:
                    if (C14084qq.m67078dy(c11955m9.m56069m9(), C14084qq.f47299x1)) {
                        return;
                    }
                    int i = this.f40192du;
                    if (i < this.f40193kk && this.f40194x1.charAt(i) == ',' && m55897k4(str2)) {
                        this.f40192du++;
                        str2 = C14113y2.m67408k4(str2, ", ", m55895du());
                    }
                    c11955m9.m56061k4(m55900x1(str2).Clone());
                    return;
                case 7:
                    c11955m9.m56072to(str2);
                    return;
                case 8:
                    if (c11955m9.m56050ck() == null) {
                        c11955m9.m56051du(str2);
                        return;
                    }
                    return;
                case 9:
                    c11955m9.m56073to(true);
                    return;
                case 10:
                    c11955m9.m56059k4(C7019kk.m27462to(Long.valueOf(C14114y9.m67456k4(str2)), 10));
                    return;
                default:
                    return;
            }
        } catch (RuntimeException unused) {
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m55901x1(C11928ck c11928ck) {
        return C14067j2.m66728k4(c11928ck.f40194x1, this.f40194x1) && c11928ck.f40193kk == this.f40193kk && c11928ck.f40192du == this.f40192du;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m55897k4(String str) {
        switch (f40189h4.m27428k4(C14113y2.m67361du(str))) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return true;
            default:
                return false;
        }
    }
}
