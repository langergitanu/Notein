package com.aspose.slides.internal.p532yu;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13968ri;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.a3 */
/* JADX INFO: loaded from: classes5.dex */
public class C12888a3 extends AbstractC7020m9<C12888a3> {

    /* JADX INFO: renamed from: du */
    private int f43403du;

    /* JADX INFO: renamed from: h4 */
    private int f43404h4;

    /* JADX INFO: renamed from: k4 */
    private int f43405k4;

    /* JADX INFO: renamed from: kk */
    private int f43406kk;

    /* JADX INFO: renamed from: m9 */
    private long f43407m9;

    /* JADX INFO: renamed from: to */
    private int f43408to;

    /* JADX INFO: renamed from: x1 */
    private int f43409x1;

    public C12888a3() {
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public C12888a3 Clone() {
        C12888a3 c12888a3 = new C12888a3();
        CloneTo(c12888a3);
        return c12888a3;
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final int m59994du() {
        return this.f43408to;
    }

    /* JADX INFO: renamed from: dy */
    public final int m59995dy() {
        return (int) (this.f43407m9 & 2147483647L);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12888a3) {
            return m59992x1((C12888a3) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m59996h4() {
        return this.f43403du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14077m4 m59997k4(int i) {
        C14077m4 c14077m4 = new C14077m4();
        C14077m4[] c14077m4Arr = {c14077m4};
        RuntimeException runtimeExceptionM59998k4 = m59998k4(i, c14077m4Arr);
        c14077m4Arr[0].CloneTo(c14077m4);
        if (runtimeExceptionM59998k4 == null) {
            return c14077m4;
        }
        throw runtimeExceptionM59998k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m60002kk() {
        return this.f43409x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m60003m9() {
        return this.f43404h4;
    }

    /* JADX INFO: renamed from: to */
    public final int m60004to() {
        return this.f43406kk;
    }

    public String toString() {
        return m60006x1(0);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m60005x1() {
        return this.f43405k4;
    }

    public C12888a3(C14077m4 c14077m4, int i) {
        long jM27461m9;
        boolean z;
        int i2;
        long jM66813du = c14077m4.m66813du();
        if (jM66813du < 0) {
            jM27461m9 = C7019kk.m27461m9(Long.valueOf(-jM66813du), 11);
            z = true;
        } else {
            jM27461m9 = C7019kk.m27461m9(Long.valueOf(jM66813du), 11);
            z = false;
        }
        if (i == 1) {
            int iM27461m9 = (int) (jM27461m9 / (C7019kk.m27461m9(864000000000L, 11) * 365));
            int iM27461m92 = (int) ((jM27461m9 % (C7019kk.m27461m9(864000000000L, 11) * 365)) / (C7019kk.m27461m9(864000000000L, 11) * 30));
            if (iM27461m92 == 12) {
                iM27461m9++;
                i2 = 0;
            } else {
                i2 = iM27461m92;
            }
            new C12888a3(z, iM27461m9, i2, 0, 0, 0, 0, 0).CloneTo(this);
            return;
        }
        long j = (((jM27461m9 % 10000000) & 4294967295L) * 100) & 4294967295L;
        this.f43407m9 = j;
        if (z) {
            this.f43407m9 = (2147483648L | j) & 4294967295L;
        }
        this.f43405k4 = 0;
        this.f43409x1 = 0;
        this.f43406kk = (int) (jM27461m9 / C7019kk.m27461m9(864000000000L, 11));
        this.f43408to = (int) ((jM27461m9 / C7019kk.m27461m9(36000000000L, 11)) % 24);
        this.f43403du = (int) ((jM27461m9 / C7019kk.m27461m9(600000000L, 11)) % 60);
        this.f43404h4 = (int) ((jM27461m9 / C7019kk.m27461m9(10000000L, 11)) % 60);
    }

    /* JADX INFO: renamed from: k4 */
    public final RuntimeException m59998k4(int i, C14077m4[] c14077m4Arr) {
        long jM27461m9;
        if (i != 2) {
            try {
                jM27461m9 = ((C7019kk.m27461m9(Integer.valueOf(this.f43409x1), 9) % 12) * 30) + ((C7019kk.m27461m9(Integer.valueOf(this.f43405k4), 9) + (C7019kk.m27461m9(Integer.valueOf(this.f43409x1), 9) / 12)) * 365);
            } catch (OverflowException unused) {
                C14077m4.f47266x1.CloneTo(c14077m4Arr[0]);
                return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", Integer.valueOf(i), "TimeSpan"));
            }
        } else {
            jM27461m9 = 0;
        }
        long jM27461m92 = i != 1 ? ((((((((jM27461m9 + C7019kk.m27461m9(Integer.valueOf(this.f43406kk), 9)) * 24) + C7019kk.m27461m9(Integer.valueOf(this.f43408to), 9)) * 60) + C7019kk.m27461m9(Integer.valueOf(this.f43403du), 9)) * 60) + C7019kk.m27461m9(Integer.valueOf(this.f43404h4), 9)) * C7019kk.m27461m9(10000000L, 11)) + (C7019kk.m27461m9(Integer.valueOf(m59995dy()), 9) / 100) : jM27461m9 * C7019kk.m27461m9(864000000000L, 11);
        if (!m60001k4()) {
            c14077m4Arr[0] = new C14077m4(jM27461m92);
            return null;
        }
        if (jM27461m92 == C7019kk.m27461m9(Long.valueOf(LocationRequestCompat.PASSIVE_INTERVAL), 11) + 1) {
            c14077m4Arr[0] = new C14077m4(Long.MIN_VALUE);
            return null;
        }
        c14077m4Arr[0] = new C14077m4(-jM27461m92);
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m60006x1(int i) {
        String str;
        C6765kp c6765kp = new C6765kp(20);
        if (m60001k4()) {
            c6765kp.m26780k4('-');
        }
        c6765kp.m26780k4('P');
        if (i != 2) {
            int i2 = this.f43405k4;
            if (i2 != 0) {
                c6765kp.m26792k4(C13850af.m65103k4(i2));
                c6765kp.m26780k4('Y');
            }
            int i3 = this.f43409x1;
            if (i3 != 0) {
                c6765kp.m26792k4(C13850af.m65103k4(i3));
                c6765kp.m26780k4('M');
            }
        }
        if (i != 1) {
            int i4 = this.f43406kk;
            if (i4 != 0) {
                c6765kp.m26792k4(C13850af.m65103k4(i4));
                c6765kp.m26780k4('D');
            }
            if (this.f43408to != 0 || this.f43403du != 0 || this.f43404h4 != 0 || m59995dy() != 0) {
                c6765kp.m26780k4('T');
                int i5 = this.f43408to;
                if (i5 != 0) {
                    c6765kp.m26792k4(C13850af.m65103k4(i5));
                    c6765kp.m26780k4('H');
                }
                int i6 = this.f43403du;
                if (i6 != 0) {
                    c6765kp.m26792k4(C13850af.m65103k4(i6));
                    c6765kp.m26780k4('M');
                }
                int iM59995dy = m59995dy();
                int i7 = this.f43404h4;
                if (i7 != 0 || iM59995dy != 0) {
                    c6765kp.m26792k4(C13850af.m65103k4(i7));
                    if (iM59995dy != 0) {
                        c6765kp.m26780k4(FilenameUtils.EXTENSION_SEPARATOR);
                        int iM26807x1 = c6765kp.m26807x1();
                        c6765kp.m26801k4(c6765kp.m26807x1() + 9);
                        int iM26807x12 = c6765kp.m26807x1() - 1;
                        int i8 = iM26807x12;
                        while (iM26807x12 >= iM26807x1) {
                            int i9 = iM59995dy % 10;
                            c6765kp.m26802k4(iM26807x12, (char) (i9 + 48));
                            if (i8 == iM26807x12 && i9 == 0) {
                                i8--;
                            }
                            iM59995dy /= 10;
                            iM26807x12--;
                        }
                        c6765kp.m26801k4(i8 + 1);
                    }
                    c6765kp.m26780k4('S');
                }
            }
            if (c6765kp.m26806x1(c6765kp.m26807x1() - 1) == 'P') {
                str = "T0S";
                c6765kp.m26792k4(str);
            }
        } else if (c6765kp.m26806x1(c6765kp.m26807x1() - 1) == 'P') {
            str = "0M";
            c6765kp.m26792k4(str);
        }
        return c6765kp.toString();
    }

    public C12888a3(String str, int i) {
        C12888a3 c12888a3 = new C12888a3();
        C12888a3[] c12888a3Arr = {c12888a3};
        RuntimeException runtimeExceptionM59989k4 = m59989k4(str, i, c12888a3Arr);
        c12888a3Arr[0].CloneTo(c12888a3);
        if (runtimeExceptionM59989k4 != null) {
            throw runtimeExceptionM59989k4;
        }
        this.f43405k4 = c12888a3.m60005x1();
        this.f43409x1 = c12888a3.m60002kk();
        this.f43406kk = c12888a3.m60004to();
        this.f43408to = c12888a3.m59994du();
        this.f43403du = c12888a3.m59996h4();
        this.f43404h4 = c12888a3.m60003m9();
        this.f43407m9 = ((long) c12888a3.m59995dy()) & 4294967295L;
        if (c12888a3.m60001k4()) {
            this.f43407m9 = (this.f43407m9 | 2147483648L) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static RuntimeException m59989k4(String str, int i, C12888a3[] c12888a3Arr) {
        int i2;
        int i3;
        c12888a3Arr[0] = new C12888a3();
        String strM67440x1 = C14113y2.m67440x1(str);
        int length = strM67440x1.length();
        if (length <= 0) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
        }
        if (strM67440x1.charAt(0) == '-') {
            c12888a3Arr[0].f43407m9 = 2147483648L;
            i2 = 1;
        } else {
            c12888a3Arr[0].f43407m9 = 0L;
            i2 = 0;
        }
        if (i2 >= length) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
        }
        int i4 = i2 + 1;
        if (strM67440x1.charAt(i2) != 'P') {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
        }
        int[] iArr = {i4};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        String strM59991k4 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
        int i5 = iArr[0];
        int i6 = iArr2[0];
        int i7 = iArr3[0];
        if (strM59991k4 != null) {
            return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
        }
        if (i5 >= length) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
        }
        if (strM67440x1.charAt(i5) != 'Y') {
            i3 = 0;
        } else {
            if (i7 == 0) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            c12888a3Arr[0].f43405k4 = i6;
            int i8 = i5 + 1;
            if (i8 == length) {
                if (i == 2) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                return null;
            }
            iArr[0] = i8;
            iArr2[0] = i6;
            iArr3[0] = i7;
            String strM59991k42 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
            i5 = iArr[0];
            i6 = iArr2[0];
            i7 = iArr3[0];
            if (strM59991k42 != null) {
                return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
            }
            if (i5 >= length) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            i3 = 1;
        }
        if (strM67440x1.charAt(i5) == 'M') {
            if (i7 == 0) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            i3 |= 2;
            c12888a3Arr[0].f43409x1 = i6;
            int i9 = i5 + 1;
            if (i9 == length) {
                if (i3 == 0) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                if (i != 2 || (i3 & 3) == 0) {
                    return null;
                }
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            iArr[0] = i9;
            iArr2[0] = i6;
            iArr3[0] = i7;
            String strM59991k43 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
            int i10 = iArr[0];
            int i11 = iArr2[0];
            int i12 = iArr3[0];
            if (strM59991k43 != null) {
                return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
            }
            if (i10 >= length) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            i5 = i10;
            i6 = i11;
            i7 = i12;
        }
        if (strM67440x1.charAt(i5) == 'D') {
            if (i7 == 0) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            i3 |= 4;
            c12888a3Arr[0].f43406kk = i6;
            int i13 = i5 + 1;
            if (i13 == length) {
                if (i3 == 0) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                if (i == 2) {
                    if ((i3 & 3) != 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                } else if (i == 1) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                return null;
            }
            iArr[0] = i13;
            iArr2[0] = i6;
            iArr3[0] = i7;
            String strM59991k44 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
            i5 = iArr[0];
            i6 = iArr2[0];
            i7 = iArr3[0];
            if (strM59991k44 != null) {
                return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
            }
            if (i5 >= length) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
        }
        if (strM67440x1.charAt(i5) == 'T') {
            if (i7 != 0) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            iArr[0] = i5 + 1;
            iArr2[0] = i6;
            iArr3[0] = i7;
            String strM59991k45 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
            i5 = iArr[0];
            int i14 = iArr2[0];
            i7 = iArr3[0];
            if (strM59991k45 != null) {
                return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
            }
            if (i5 >= length) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            if (strM67440x1.charAt(i5) == 'H') {
                if (i7 == 0) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                i3 |= 8;
                c12888a3Arr[0].f43408to = i14;
                int i15 = i5 + 1;
                if (i15 == length) {
                    if (i3 == 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                    if (i == 2) {
                        if ((i3 & 3) != 0) {
                            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                        }
                    } else if (i == 1 && (i3 & (-4)) != 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                    return null;
                }
                iArr[0] = i15;
                iArr2[0] = i14;
                iArr3[0] = i7;
                String strM59991k46 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
                i5 = iArr[0];
                i14 = iArr2[0];
                i7 = iArr3[0];
                if (strM59991k46 != null) {
                    return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
                }
                if (i5 >= length) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
            }
            if (strM67440x1.charAt(i5) == 'M') {
                if (i7 == 0) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                i3 |= 16;
                c12888a3Arr[0].f43403du = i14;
                int i16 = i5 + 1;
                if (i16 == length) {
                    if (i3 == 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                    if (i == 2) {
                        if ((i3 & 3) != 0) {
                            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                        }
                    } else if (i == 1 && (i3 & (-4)) != 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                    return null;
                }
                iArr[0] = i16;
                iArr2[0] = i14;
                iArr3[0] = i7;
                String strM59991k47 = m59991k4(strM67440x1, iArr, false, iArr2, iArr3);
                i5 = iArr[0];
                i14 = iArr2[0];
                i7 = iArr3[0];
                if (strM59991k47 != null) {
                    return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
                }
                if (i5 >= length) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
            }
            if (strM67440x1.charAt(i5) == '.') {
                int i17 = i3 | 32;
                c12888a3Arr[0].f43404h4 = i14;
                iArr[0] = i5 + 1;
                iArr2[0] = i14;
                iArr3[0] = i7;
                String strM59991k48 = m59991k4(strM67440x1, iArr, true, iArr2, iArr3);
                int i18 = iArr[0];
                int i19 = iArr2[0];
                int i20 = iArr3[0];
                if (strM59991k48 != null) {
                    return new OverflowException(C13968ri.m65819k4("Value '{0}' was either too large or too small for {1}.", strM67440x1, Integer.valueOf(i)));
                }
                if (i20 == 0) {
                    i19 = 0;
                }
                while (i20 > 9) {
                    i19 /= 10;
                    i20--;
                }
                i7 = i20;
                while (i7 < 9) {
                    i19 *= 10;
                    i7++;
                }
                C12888a3 c12888a3 = c12888a3Arr[0];
                c12888a3.f43407m9 = (c12888a3.f43407m9 | (((long) i19) & 4294967295L)) & 4294967295L;
                if (i18 < length && strM67440x1.charAt(i18) == 'S') {
                    i5 = i18 + 1;
                    if (i5 == length) {
                        if (i17 == 0) {
                            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                        }
                        if (i == 2) {
                            if ((i17 & 3) != 0) {
                                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                            }
                        } else if (i == 1 && (i17 & (-4)) != 0) {
                            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                        }
                        return null;
                    }
                }
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
            }
            if (strM67440x1.charAt(i5) == 'S') {
                if (i7 == 0) {
                    return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                }
                int i21 = i3 | 32;
                c12888a3Arr[0].f43404h4 = i14;
                i5++;
                if (i5 == length) {
                    if (i21 == 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                    if (i == 2) {
                        if ((i21 & 3) != 0) {
                            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                        }
                    } else if (i == 1 && (i21 & (-4)) != 0) {
                        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
                    }
                    return null;
                }
            }
        }
        if (i7 == 0 && i5 == length) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM67440x1, Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m59992x1(C12888a3 c12888a3) {
        return c12888a3.f43405k4 == this.f43405k4 && c12888a3.f43409x1 == this.f43409x1 && c12888a3.f43406kk == this.f43406kk && c12888a3.f43408to == this.f43408to && c12888a3.f43403du == this.f43403du && c12888a3.f43404h4 == this.f43404h4 && c12888a3.f43407m9 == this.f43407m9;
    }

    public C12888a3(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("years");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("months");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("days");
        }
        if (i4 < 0) {
            throw new ArgumentOutOfRangeException("hours");
        }
        if (i5 < 0) {
            throw new ArgumentOutOfRangeException("minutes");
        }
        if (i6 < 0) {
            throw new ArgumentOutOfRangeException("seconds");
        }
        if (i7 < 0 || i7 > 999999999) {
            throw new ArgumentOutOfRangeException("nanoseconds");
        }
        this.f43405k4 = i;
        this.f43409x1 = i2;
        this.f43406kk = i3;
        this.f43408to = i4;
        this.f43403du = i5;
        this.f43404h4 = i6;
        long j = ((long) i7) & 4294967295L;
        this.f43407m9 = j;
        if (z) {
            this.f43407m9 = (j | 2147483648L) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static RuntimeException m59990k4(String str, C12888a3[] c12888a3Arr) {
        return m59989k4(str, 0, c12888a3Arr);
    }

    /* JADX INFO: renamed from: k4 */
    public final RuntimeException m59999k4(C14077m4[] c14077m4Arr) {
        return m59998k4(0, c14077m4Arr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r13[0] = r10[0] - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m59991k4(String str, int[] iArr, boolean z, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int length = str.length();
        iArr2[0] = 0;
        iArr3[0] = 0;
        while (true) {
            int i2 = iArr[0];
            if (i2 >= length || str.charAt(i2) < '0' || str.charAt(iArr[0]) > '9') {
                break;
            }
            int iCharAt = str.charAt(iArr[0]) - '0';
            int i3 = iArr2[0];
            if (i3 > (Integer.MAX_VALUE - iCharAt) / 10) {
                if (!z) {
                    return "Value '{0}' was either too large or too small for {1}.";
                }
                iArr3[0] = iArr[0] - i;
                while (true) {
                    int i4 = iArr[0];
                    if (i4 >= length || str.charAt(i4) < '0' || str.charAt(iArr[0]) > '9') {
                        break;
                    }
                    iArr[0] = iArr[0] + 1;
                }
                return null;
            }
            iArr2[0] = (i3 * 10) + iCharAt;
            iArr[0] = iArr[0] + 1;
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12888a3 c12888a3) {
        if (c12888a3 == null) {
            c12888a3 = new C12888a3();
        }
        c12888a3.f43405k4 = this.f43405k4;
        c12888a3.f43409x1 = this.f43409x1;
        c12888a3.f43406kk = this.f43406kk;
        c12888a3.f43408to = this.f43408to;
        c12888a3.f43403du = this.f43403du;
        c12888a3.f43404h4 = this.f43404h4;
        c12888a3.f43407m9 = this.f43407m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m60001k4() {
        return (this.f43407m9 & 2147483648L) != 0;
    }
}
