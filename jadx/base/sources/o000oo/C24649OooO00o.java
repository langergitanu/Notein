package o000oo;

import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.OooOOO0;
import o000oo.AbstractC24653OooO0o0;
import o000ooo.InterfaceC24747OooO0O0;
import o000oooO.InterfaceC24756OooO0O0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o000oo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24649OooO00o implements InterfaceC24747OooO0O0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC24756OooO0O0 f83490OooOo0o;

    public C24649OooO00o(InterfaceC24756OooO0O0 db) {
        OooOOO0.OooO0oO(db, "db");
        this.f83490OooOo0o = db;
    }

    @Override // o000ooo.InterfaceC24747OooO0O0
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final AbstractC24653OooO0o0 o0ooOOo(String sql) {
        String strSubstring;
        int i;
        OooOOO0.OooO0oO(sql, "sql");
        InterfaceC24756OooO0O0 db = this.f83490OooOo0o;
        OooOOO0.OooO0oO(db, "db");
        String upperCase = C33599OooOo0O.Oooooo0(sql).toString().toUpperCase(Locale.ROOT);
        OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iOooo0 = 0;
            loop0: while (iOooo0 < length) {
                char cCharAt = upperCase.charAt(iOooo0);
                if (OooOOO0.OooO(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iOooo02 = iOooo0 + 1;
                            if (upperCase.charAt(iOooo02) == '*') {
                                do {
                                    iOooo02 = C33599OooOo0O.Oooo0(upperCase, '*', iOooo02 + 1, 4);
                                    if (iOooo02 >= 0) {
                                        i = iOooo02 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iOooo0 = iOooo02 + 2;
                            }
                        }
                        i2 = iOooo0;
                        break;
                    }
                    if (upperCase.charAt(iOooo0 + 1) == '-') {
                        iOooo0 = C33599OooOo0O.Oooo0(upperCase, '\n', iOooo0 + 2, 4);
                        if (iOooo0 < 0) {
                            break;
                        }
                    } else {
                        i2 = iOooo0;
                        break;
                    }
                }
                iOooo0++;
            }
        }
        if (i2 < 0 || i2 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
            OooOOO0.OooO0o(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new AbstractC24653OooO0o0.OooO0O0(db, sql);
        }
        int iHashCode = strSubstring.hashCode();
        if (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) {
            return new AbstractC24653OooO0o0.OooO0O0(db, sql);
        }
        AbstractC24653OooO0o0.OooO00o oooO00o = new AbstractC24653OooO0o0.OooO00o(db, sql);
        oooO00o.f83502OooOoO = new int[0];
        oooO00o.f83503OooOoOO = new long[0];
        oooO00o.f83505OooOoo0 = new double[0];
        oooO00o.f83504OooOoo = new String[0];
        oooO00o.f83506OooOooO = new byte[0][];
        return oooO00o;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f83490OooOo0o.close();
    }
}
