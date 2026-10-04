package oO00O0o0;

import OooOooo.C20785Oooo00o;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.List;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32193OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115548OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f115549OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f115550OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C32193OooOo0O f115543OooO0Oo = new C32193OooOo0O("HTTP", 2, 0);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C32193OooOo0O f115545OooO0o0 = new C32193OooOo0O("HTTP", 1, 1);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C32193OooOo0O f115544OooO0o = new C32193OooOo0O("HTTP", 1, 0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C32193OooOo0O f115546OooO0oO = new C32193OooOo0O("SPDY", 3, 0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C32193OooOo0O f115547OooO0oo = new C32193OooOo0O("QUIC", 1, 0);

    /* JADX INFO: renamed from: oO00O0o0.OooOo0O$OooO00o */
    public static final class OooO00o {
        public static C32193OooOo0O OooO00o(CharSequence value) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
            List listOoooOO0 = C33599OooOo0O.OoooOO0(value, new String[]{"/", "."});
            if (listOoooOO0.size() != 3) {
                throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) value)).toString());
            }
            String name = (String) listOoooOO0.get(0);
            String str = (String) listOoooOO0.get(1);
            String str2 = (String) listOoooOO0.get(2);
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
            return (name.equals("HTTP") && i == 1 && i2 == 0) ? C32193OooOo0O.f115544OooO0o : (name.equals("HTTP") && i == 1 && i2 == 1) ? C32193OooOo0O.f115545OooO0o0 : (name.equals("HTTP") && i == 2 && i2 == 0) ? C32193OooOo0O.f115543OooO0Oo : new C32193OooOo0O(name, i, i2);
        }
    }

    public C32193OooOo0O(String str, int i, int i2) {
        this.f115548OooO00o = str;
        this.f115549OooO0O0 = i;
        this.f115550OooO0OO = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32193OooOo0O)) {
            return false;
        }
        C32193OooOo0O c32193OooOo0O = (C32193OooOo0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115548OooO00o, c32193OooOo0O.f115548OooO00o) && this.f115549OooO0O0 == c32193OooOo0O.f115549OooO0O0 && this.f115550OooO0OO == c32193OooOo0O.f115550OooO0OO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115550OooO0OO) + C20785Oooo00o.OooO00o(this.f115549OooO0O0, this.f115548OooO00o.hashCode() * 31, 31);
    }

    public final String toString() {
        return this.f115548OooO00o + IOUtils.DIR_SEPARATOR_UNIX + this.f115549OooO0O0 + FilenameUtils.EXTENSION_SEPARATOR + this.f115550OooO0OO;
    }
}
