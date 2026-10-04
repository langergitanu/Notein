package o0oOo000;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00o0000.C25239OooO0O0;
import o00o0OO0.C25328OooO;
import o00o0OO0.C25345OooO0o;
import o00o0OO0.C25396OooO0oo;

/* JADX INFO: renamed from: o0oOo000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C30940OooO00o implements InterfaceC25121OooOO0O<InputStream, C25345OooO0o> {
    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final InterfaceC25145OooOo0o<C25345OooO0o> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
        InputStream source = inputStream;
        OooOOO0.OooO0oO(source, "source");
        try {
            C25345OooO0o c25345OooO0oOooO0o = new C25328OooO().OooO0o(source);
            OooOOO0.OooO0o(c25345OooO0oOooO0o, "getFromInputStream(...)");
            if (i != Integer.MIN_VALUE) {
                float f = i;
                C25345OooO0o.C25368OooOooo c25368OooOooo = c25345OooO0oOooO0o.f86343OooO00o;
                if (c25368OooOooo == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                c25368OooOooo.f86496OooOOo = new C25345OooO0o.OooOOOO(f);
            }
            if (i2 != Integer.MIN_VALUE) {
                float f2 = i2;
                C25345OooO0o.C25368OooOooo c25368OooOooo2 = c25345OooO0oOooO0o.f86343OooO00o;
                if (c25368OooOooo2 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                c25368OooOooo2.f86498OooOOoo = new C25345OooO0o.OooOOOO(f2);
            }
            return new C25239OooO0O0(c25345OooO0oOooO0o);
        } catch (C25396OooO0oo e) {
            throw new IOException("Cannot load SVG from stream", e);
        }
    }

    @Override // o00Ooo0o.InterfaceC25121OooOO0O
    public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) {
        InputStream source = inputStream;
        OooOOO0.OooO0oO(source, "source");
        return true;
    }
}
