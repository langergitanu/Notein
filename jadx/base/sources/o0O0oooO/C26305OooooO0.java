package o0O0oooO;

import com.orion.notein.MainActivity;
import java.io.File;
import java.util.Locale;
import o0ooO0O0.C31430OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0oooO.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26305OooooO0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90143OooOo0o;

    public /* synthetic */ C26305OooooO0(int i) {
        this.f90143OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f90143OooOo0o) {
            case 0:
                return MainActivity.onResume$lambda$31((Void) obj);
            case 1:
                File file = (File) obj;
                return OooO0O0.OooO00o.OooO0O0(file.getName(), " (", C31430OooO00o.OooO0OO(file.length()), ")");
            default:
                String p = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
                if (p.length() == 2) {
                    for (int i = 0; i < p.length(); i++) {
                        if (Character.isLetter(p.charAt(i))) {
                        }
                    }
                    String upperCase = p.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
                if (p.length() != 4 || p.length() <= 0) {
                    return p;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((Object) io.ktor.utils.p616io.Oooo000.OooO0o(p.charAt(0)));
                String strSubstring = p.substring(1);
                kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
                sb.append(strSubstring);
                return sb.toString();
        }
    }
}
