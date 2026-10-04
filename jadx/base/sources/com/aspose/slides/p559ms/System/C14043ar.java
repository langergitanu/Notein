package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p463vm.C11691kk;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ar */
/* JADX INFO: loaded from: classes5.dex */
public class C14043ar extends AbstractC7020m9<C14043ar> implements Comparable<C14043ar> {

    /* JADX INFO: renamed from: kk */
    static final /* synthetic */ boolean f47161kk = true;

    /* JADX INFO: renamed from: du */
    private C14077m4 f47163du;

    /* JADX INFO: renamed from: to */
    private C14084qq f47164to;

    /* JADX INFO: renamed from: k4 */
    public static C14043ar f47160k4 = new C14043ar(C14084qq.f47293kk.Clone(), C14077m4.f47265kk.Clone());

    /* JADX INFO: renamed from: x1 */
    public static C14043ar f47162x1 = new C14043ar(C14084qq.f47299x1.Clone(), C14077m4.f47265kk.Clone());

    public C14043ar() {
        this.f47164to = new C14084qq();
        this.f47163du = new C14077m4();
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C14043ar Clone() {
        C14043ar c14043ar = new C14043ar();
        CloneTo(c14043ar);
        return c14043ar;
    }

    public boolean equals(Object obj) {
        if (!f47161kk && obj == null) {
            throw new AssertionError();
        }
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C14043ar) {
            return m66415kk((C14043ar) obj);
        }
        return false;
    }

    public int hashCode() {
        return this.f47164to.hashCode() ^ this.f47163du.hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14043ar c14043ar) {
        return m66421to().compareTo(c14043ar.m66421to().Clone());
    }

    /* JADX INFO: renamed from: kk */
    public C14077m4 m66420kk() {
        return this.f47163du;
    }

    /* JADX INFO: renamed from: to */
    public C14084qq m66421to() {
        return C14084qq.m67087k4(C14084qq.m67121x1(this.f47164to, this.f47163du).Clone(), 1L);
    }

    public String toString() {
        return m66419k4(null, null);
    }

    /* JADX INFO: renamed from: x1 */
    public C14084qq m66422x1() {
        return m66421to().m67145ne();
    }

    public C14043ar(long j, C14077m4 c14077m4) {
        this(new C14084qq(j), c14077m4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C14043ar m66414k4(C14084qq c14084qq) {
        return new C14043ar(c14084qq.Clone());
    }

    /* JADX INFO: renamed from: kk */
    private boolean m66415kk(C14043ar c14043ar) {
        return C14067j2.m66728k4(c14043ar.f47164to, this.f47164to) && C14067j2.m66728k4(c14043ar.f47163du, this.f47163du);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14043ar c14043ar) {
        this.f47164to.CloneTo(c14043ar.f47164to);
        this.f47163du.CloneTo(c14043ar.f47163du);
    }

    public C14043ar(C14084qq c14084qq) {
        this.f47164to = new C14084qq();
        this.f47163du = new C14077m4();
        c14084qq.CloneTo(this.f47164to);
        (c14084qq.m67127du() == 1 ? C14077m4.f47265kk : C14076m2.m66792k4(TimeZone.getDefault(), c14084qq.Clone())).CloneTo(this.f47163du);
        if (C14084qq.m67110kk(m66421to(), C14084qq.f47299x1) || C14084qq.m67094k4(m66421to(), C14084qq.f47293kk)) {
            throw new ArgumentOutOfRangeException("The UTC date and time that results from applying the offset is earlier than MinValue or later than MaxValue.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C14084qq m66418k4() {
        return C14084qq.m67087k4(this.f47164to.Clone(), 0L);
    }

    public C14043ar(C14084qq c14084qq, C14077m4 c14077m4) {
        this.f47164to = new C14084qq();
        this.f47163du = new C14077m4();
        if (c14084qq.m67127du() == 1 && !C14077m4.m66810x1(c14077m4, C14077m4.f47265kk)) {
            throw new ArgumentException("dateTime.Kind equals Utc and offset does not equal zero.");
        }
        if (c14084qq.m67127du() == 2 && !C14077m4.m66810x1(c14077m4, C14076m2.m66792k4(TimeZone.getDefault(), c14084qq.Clone()))) {
            throw new ArgumentException("dateTime.Kind equals Local and offset does not equal the offset of the system's local time zone.");
        }
        if (c14077m4.m66813du() % 600000000 != 0) {
            throw new ArgumentException("offset is not specified in whole minutes.");
        }
        if (C14077m4.m66797h4(c14077m4, new C14077m4(-14, 0, 0)) || C14077m4.m66807to(c14077m4, new C14077m4(14, 0, 0))) {
            throw new ArgumentOutOfRangeException("offset is less than -14 hours or greater than 14 hours.");
        }
        c14084qq.CloneTo(this.f47164to);
        c14077m4.CloneTo(this.f47163du);
        if (C14084qq.m67110kk(m66421to(), C14084qq.f47299x1) || C14084qq.m67094k4(m66421to(), C14084qq.f47293kk)) {
            throw new ArgumentOutOfRangeException("The UtcDateTime property is earlier than MinValue or later than MaxValue.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[PHI: r3
      0x0037: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v3 java.lang.String) binds: [B:12:0x0035, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m66419k4(String str, InterfaceC14073kp interfaceC14073kp) {
        C14084qq c14084qqClone;
        C14077m4 c14077m4M66420kk;
        boolean z;
        C11691kk c11691kkM55141k4 = C11691kk.m55141k4(interfaceC14073kp);
        boolean z2 = false;
        boolean z3 = interfaceC14073kp == null;
        if (str == null || C14113y2.m67363du(str, "")) {
            str = C14113y2.m67408k4(c11691kkM55141k4.m55193ne(), " ", c11691kkM55141k4.m55200u4());
            if (str.indexOf("zzz") < 0) {
                String str2 = "zz";
                if (str.indexOf("zz") > 0) {
                    str = str.replace(str2, "zzz");
                } else {
                    str2 = "z";
                    if (str.indexOf("z") <= 0) {
                        str = str.concat(" zzz");
                    }
                }
            }
            z3 = false;
        }
        if (str.length() == 1) {
            try {
                boolean[] zArr = {false};
                str = C14097um.m67314x1(str.charAt(0), c11691kkM55141k4, zArr, new boolean[]{false}, true);
                z = zArr[0];
            } catch (Exception unused) {
                str = null;
                z = false;
            }
            if (str == null) {
                throw new FormatException("format is not one of the format specifier characters defined for DateTimeFormatInfo");
            }
            z2 = z;
            z3 = false;
        }
        if (z2) {
            c14084qqClone = m66421to().Clone();
            c14077m4M66420kk = C14077m4.f47265kk;
        } else {
            c14084qqClone = m66418k4().Clone();
            c14077m4M66420kk = m66420kk();
        }
        return C14097um.m67310k4(c14084qqClone, c14077m4M66420kk.Clone(), str, c11691kkM55141k4, z3);
    }
}
