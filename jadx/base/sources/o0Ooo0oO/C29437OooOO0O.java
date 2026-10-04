package o0Ooo0oO;

import OoooooO.C21421OooO0oO;
import androidx.core.location.LocationRequestCompat;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O.C33549OooO00o;
import oO0o0O.C33550OooO0O0;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;

/* JADX INFO: renamed from: o0Ooo0oO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29437OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f104485OooO00o = 0;

    public static final long OooO00o(String str) {
        EnumC33551OooO0OO enumC33551OooO0OO;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = C33549OooO00o.f121147OooOoO;
        char cCharAt2 = str.charAt(0);
        int i2 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = (i2 > 0) && C33599OooOo0O.OoooOOo(str, '-');
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException();
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            throw new IllegalArgumentException();
        }
        EnumC33551OooO0OO enumC33551OooO0OO2 = null;
        long jOooO0oO = 0;
        boolean z2 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length() && (('0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') || C33599OooOo0O.OooOoo0("+-.", cCharAt))) {
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                OooOOO0.OooO0o(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        enumC33551OooO0OO = EnumC33551OooO0OO.f121156OooOoo0;
                    } else if (cCharAt3 == 'M') {
                        enumC33551OooO0OO = EnumC33551OooO0OO.f121154OooOoOO;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException(C21421OooO0oO.OooO00o("Invalid duration ISO time unit: ", cCharAt3));
                        }
                        enumC33551OooO0OO = EnumC33551OooO0OO.f121152OooOoO;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException(C21421OooO0oO.OooO00o("Invalid or unsupported duration ISO non-time unit: ", cCharAt3));
                    }
                    enumC33551OooO0OO = EnumC33551OooO0OO.f121155OooOoo;
                }
                if (enumC33551OooO0OO2 != null && enumC33551OooO0OO2.compareTo(enumC33551OooO0OO) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iOooo0 = C33599OooOo0O.Oooo0(strSubstring, FilenameUtils.EXTENSION_SEPARATOR, 0, 6);
                if (enumC33551OooO0OO != EnumC33551OooO0OO.f121152OooOoO || iOooo0 <= 0) {
                    jOooO0oO = C33549OooO00o.OooO0oO(jOooO0oO, OooO0oO(OooO0o0(strSubstring), enumC33551OooO0OO));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iOooo0);
                    OooOOO0.OooO0o(strSubstring2, "substring(...)");
                    long jOooO0oO2 = C33549OooO00o.OooO0oO(jOooO0oO, OooO0oO(OooO0o0(strSubstring2), enumC33551OooO0OO));
                    String strSubstring3 = strSubstring.substring(iOooo0);
                    OooOOO0.OooO0o(strSubstring3, "substring(...)");
                    double d = Double.parseDouble(strSubstring3);
                    double dOooO0O0 = o0O0OOO0.OooO00o.OooO0O0(d, enumC33551OooO0OO, EnumC33551OooO0OO.f121151OooOo);
                    if (Double.isNaN(dOooO0O0)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jOooO0OO = oO0O00O.OooO00o.OooO0OO(dOooO0O0);
                    jOooO0oO = C33549OooO00o.OooO0oO(jOooO0oO2, (-4611686018426999999L > jOooO0OO || jOooO0OO >= 4611686018427000000L) ? OooO0OO(oO0O00O.OooO00o.OooO0OO(o0O0OOO0.OooO00o.OooO0O0(d, enumC33551OooO0OO, EnumC33551OooO0OO.f121153OooOoO0))) : OooO0Oo(jOooO0OO));
                }
                enumC33551OooO0OO2 = enumC33551OooO0OO;
                i3 = i5;
            } else {
                if (z2 || (i3 = i3 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        if (!z) {
            return jOooO0oO;
        }
        long j = ((-(jOooO0oO >> 1)) << 1) + ((long) (((int) jOooO0oO) & 1));
        int i6 = C33550OooO0O0.f121150OooO00o;
        return j;
    }

    public static final long OooO0O0(long j) {
        long j2 = (j << 1) + 1;
        int i = C33549OooO00o.f121147OooOoO;
        int i2 = C33550OooO0O0.f121150OooO00o;
        return j2;
    }

    public static final long OooO0OO(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? OooO0O0(oO0O00oo.OooOO0.OooO0oO(j, -4611686018427387903L, 4611686018427387903L)) : OooO0Oo(j * ((long) 1000000));
    }

    public static final long OooO0Oo(long j) {
        long j2 = j << 1;
        int i = C33549OooO00o.f121147OooOoO;
        int i2 = C33550OooO0O0.f121150OooO00o;
        return j2;
    }

    public static final long OooO0o(int i, EnumC33551OooO0OO unit) {
        OooOOO0.OooO0oO(unit, "unit");
        return unit.compareTo(EnumC33551OooO0OO.f121152OooOoO) <= 0 ? OooO0Oo(o0O0OOO0.OooO00o.OooO0OO(i, unit, EnumC33551OooO0OO.f121151OooOo)) : OooO0oO(i, unit);
    }

    public static final long OooO0o0(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !C33599OooOo0O.OooOoo0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return LocationRequestCompat.PASSIVE_INTERVAL;
                }
            }
        }
        return (!C33595OooOOo.OooOoO0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(C33600OooOo0o.Oooooo(1, str));
    }

    public static final long OooO0oO(long j, EnumC33551OooO0OO unit) {
        OooOOO0.OooO0oO(unit, "unit");
        EnumC33551OooO0OO enumC33551OooO0OO = EnumC33551OooO0OO.f121151OooOo;
        long jOooO0OO = o0O0OOO0.OooO00o.OooO0OO(4611686018426999999L, enumC33551OooO0OO, unit);
        if ((-jOooO0OO) <= j && j <= jOooO0OO) {
            return OooO0Oo(o0O0OOO0.OooO00o.OooO0OO(j, unit, enumC33551OooO0OO));
        }
        EnumC33551OooO0OO targetUnit = EnumC33551OooO0OO.f121153OooOoO0;
        OooOOO0.OooO0oO(targetUnit, "targetUnit");
        return OooO0O0(oO0O00oo.OooOO0.OooO0oO(targetUnit.f121158OooOo0o.convert(j, unit.f121158OooOo0o), -4611686018427387903L, 4611686018427387903L));
    }
}
