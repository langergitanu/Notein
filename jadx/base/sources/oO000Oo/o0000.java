package oO000Oo;

import com.google.common.base.Strings;
import java.util.Map;
import oO000Oo.C32018o00000oO;
import oO0OOo0o.AbstractC33086Oooo0o;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.o000oOoO;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000 extends AbstractC33086Oooo0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f114316OooO0O0;

    static {
        f114316OooO0O0 = !Strings.isNullOrEmpty(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooO0OO
    public final AbstractC33087Oooo0o0 OooO00o(AbstractC33087Oooo0o0.AbstractC33089OooO0o0 abstractC33089OooO0o0) {
        return f114316OooO0O0 ? new C32014o00000o0(abstractC33089OooO0o0) : new C32018o00000oO(abstractC33089OooO0o0);
    }

    @Override // oO0OOo0o.AbstractC33086Oooo0o
    public final String OooO0O0() {
        return "pick_first";
    }

    @Override // oO0OOo0o.AbstractC33086Oooo0o
    public final o000oOoO.OooO0O0 OooO0OO(Map<String, ?> map) {
        try {
            return new o000oOoO.OooO0O0(new C32018o00000oO.OooO0O0(o0OoOo0.OooO0O0("shuffleAddressList", map)));
        } catch (RuntimeException e) {
            return new o000oOoO.OooO0O0(oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oO(e).OooO0oo("Failed parsing configuration for pick_first"));
        }
    }
}
