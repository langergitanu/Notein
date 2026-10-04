package oO0o0O;

import androidx.core.location.LocationRequestCompat;
import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oO.C29437OooOO0O;
import oO0O00oo.OooOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO0o0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33549OooO00o implements Comparable<C33549OooO00o> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final long f121146OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f121147OooOoO = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final long f121148OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f121149OooOo0o;

    static {
        int i = C33550OooO0O0.f121150OooO00o;
        f121146OooOo = C29437OooOO0O.OooO0O0(4611686018427387903L);
        f121148OooOoO0 = C29437OooOO0O.OooO0O0(-4611686018427387903L);
    }

    public static final long OooO00o(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return C29437OooOO0O.OooO0O0(OooOO0.OooO0oO(j5, -4611686018427387903L, 4611686018427387903L));
        }
        return C29437OooOO0O.OooO0Oo((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void OooO0O0(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            String strOooo = C33599OooOo0O.Oooo(i3, String.valueOf(i2));
            int i4 = -1;
            int length = strOooo.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strOooo.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strOooo, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strOooo, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int OooO0OO(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return OooOOO0.OooOO0(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return j < 0 ? -i : i;
    }

    public static final long OooO0Oo(long j) {
        return ((((int) j) & 1) != 1 || OooO0o(j)) ? OooO0oo(j, EnumC33551OooO0OO.f121153OooOoO0) : j >> 1;
    }

    public static final boolean OooO0o(long j) {
        return j == f121146OooOo || j == f121148OooOoO0;
    }

    public static final int OooO0o0(long j) {
        if (OooO0o(j)) {
            return 0;
        }
        return (((int) j) & 1) == 1 ? (int) (((j >> 1) % ((long) 1000)) * ((long) 1000000)) : (int) ((j >> 1) % ((long) 1000000000));
    }

    public static final long OooO0oO(long j, long j2) {
        if (OooO0o(j)) {
            if (!OooO0o(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (OooO0o(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? OooO00o(j >> 1, j2 >> 1) : OooO00o(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        return i == 0 ? (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? C29437OooOO0O.OooO0O0(j3 / ((long) 1000000)) : C29437OooOO0O.OooO0Oo(j3) : C29437OooOO0O.OooO0OO(j3);
    }

    public static final long OooO0oo(long j, EnumC33551OooO0OO unit) {
        OooOOO0.OooO0oO(unit, "unit");
        if (j == f121146OooOo) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        if (j == f121148OooOoO0) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        EnumC33551OooO0OO sourceUnit = (((int) j) & 1) == 0 ? EnumC33551OooO0OO.f121151OooOo : EnumC33551OooO0OO.f121153OooOoO0;
        OooOOO0.OooO0oO(sourceUnit, "sourceUnit");
        return unit.f121158OooOo0o.convert(j2, sourceUnit.f121158OooOo0o);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C33549OooO00o c33549OooO00o) {
        return OooO0OO(this.f121149OooOo0o, c33549OooO00o.f121149OooOo0o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C33549OooO00o) {
            return this.f121149OooOo0o == ((C33549OooO00o) obj).f121149OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f121149OooOo0o);
    }

    public final String toString() {
        long j;
        int iOooO0oo;
        boolean z;
        int iOooO0oo2;
        int i;
        long j2 = this.f121149OooOo0o;
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == f121146OooOo) {
            return "Infinity";
        }
        if (j2 == f121148OooOoO0) {
            return "-Infinity";
        }
        boolean z2 = j2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (j2 < 0) {
            j2 = ((long) (((int) j2) & 1)) + ((-(j2 >> 1)) << 1);
            int i2 = C33550OooO0O0.f121150OooO00o;
        }
        long jOooO0oo = OooO0oo(j2, EnumC33551OooO0OO.f121155OooOoo);
        if (OooO0o(j2)) {
            j = 0;
            iOooO0oo = 0;
        } else {
            j = 0;
            iOooO0oo = (int) (OooO0oo(j2, EnumC33551OooO0OO.f121156OooOoo0) % ((long) 24));
        }
        if (OooO0o(j2)) {
            z = z2;
            iOooO0oo2 = 0;
        } else {
            z = z2;
            iOooO0oo2 = (int) (OooO0oo(j2, EnumC33551OooO0OO.f121154OooOoOO) % ((long) 60));
        }
        int iOooO0oo3 = OooO0o(j2) ? 0 : (int) (OooO0oo(j2, EnumC33551OooO0OO.f121152OooOoO) % ((long) 60));
        int iOooO0o0 = OooO0o0(j2);
        boolean z3 = jOooO0oo != j;
        boolean z4 = iOooO0oo != 0;
        boolean z5 = iOooO0oo2 != 0;
        boolean z6 = (iOooO0oo3 == 0 && iOooO0o0 == 0) ? false : true;
        if (z3) {
            sb.append(jOooO0oo);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append(iOooO0oo);
            sb.append('h');
            i = i3;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            sb.append(iOooO0oo2);
            sb.append('m');
            i = i4;
        }
        if (z6) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            if (iOooO0oo3 != 0 || z3 || z4 || z5) {
                OooO0O0(sb, iOooO0oo3, iOooO0o0, 9, "s", false);
            } else if (iOooO0o0 >= 1000000) {
                OooO0O0(sb, iOooO0o0 / 1000000, iOooO0o0 % 1000000, 6, TranslateLanguage.MALAY, false);
            } else if (iOooO0o0 >= 1000) {
                OooO0O0(sb, iOooO0o0 / 1000, iOooO0o0 % 1000, 3, "us", false);
            } else {
                sb.append(iOooO0o0);
                sb.append("ns");
            }
            i = i5;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
