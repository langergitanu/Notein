package oO0OOo0o;

import com.google.common.p563io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.BitSet;
import oO0OOo0o.C33094OoooO;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f119617OooO00o = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final BaseEncoding f119618OooO0O0 = C33094OoooO.f119653OooO0o0;

    public interface OooO00o<T> extends C33094OoooO.InterfaceC33097OooO0oO<T> {
    }

    public static C33094OoooO.OooO0o OooO00o(String str, OooO00o oooO00o) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        BitSet bitSet = C33094OoooO.AbstractC33095OooO0Oo.f119657OooO0Oo;
        return new C33094OoooO.OooO0o(str, z, oooO00o);
    }
}
