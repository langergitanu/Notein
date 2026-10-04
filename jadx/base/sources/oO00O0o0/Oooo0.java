package oO00O0o0;

import OooO0Oo.C20398OooO0O0;
import com.aspose.words.EditingLanguage;
import com.microsoft.identity.common.java.AuthenticationConstants;
import java.util.LinkedHashMap;
import java.util.List;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Oooo0 f115581OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final LinkedHashMap f115582OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115583OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f115584OooO0O0;

    static {
        Oooo0 oooo0 = new Oooo0("http", 80);
        f115581OooO0OO = oooo0;
        List listOooOO0o = C34429OooOOo0.OooOO0o(oooo0, new Oooo0(AuthenticationConstants.HTTPS_PROTOCOL_STRING, 443), new Oooo0("ws", 80), new Oooo0("wss", 443), new Oooo0("socks", EditingLanguage.FAEROESE));
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        for (Object obj : listOooOO0o) {
            linkedHashMap.put(((Oooo0) obj).f115583OooO00o, obj);
        }
        f115582OooO0Oo = linkedHashMap;
    }

    public Oooo0(String str, int i) {
        this.f115583OooO00o = str;
        this.f115584OooO0O0 = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return this.f115583OooO00o.equals(oooo0.f115583OooO00o) && this.f115584OooO0O0 == oooo0.f115584OooO0O0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115584OooO0O0) + (this.f115583OooO00o.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.f115583OooO00o);
        sb.append(", defaultPort=");
        return C20398OooO0O0.OooO00o(')', sb, this.f115584OooO0O0);
    }
}
