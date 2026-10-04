package oOo00O0O;

import Ooooo00.C21246OooO0OO;
import OooooO0.C21292OooO0oo;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import kotlin.jvm.internal.C24035Oooo00o;
import oO00ooO.C32450OooOo;
import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33596OooOOo0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o0000O0O;
import oO0oO00.oo0o0Oo;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oOo00O0O.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34469OooOo0o implements InterfaceC33911OooO0OO<C34468OooOo0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34469OooOo0o f123527OooO00o = new C34469OooOo0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f123528OooO0O0 = oO0o.OooOO0O.OooO00o("kotlinx.serialization.json.JsonLiteral", AbstractC33526OooO0Oo.OooO.f121105OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        OooOO0O oooOO0OOooOOo0 = C21246OooO0OO.OooO0OO(oooO0OO).OooOOo0();
        if (oooOO0OOooOOo0 instanceof C34468OooOo0O) {
            return (C34468OooOo0O) oooOO0OOooOOo0;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw OoooO0O.OooOo.OooO0o0(oooOO0OOooOOo0.toString(), -1, androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, oooOO0OOooOOo0.getClass(), sb));
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f123528OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        C34468OooOo0O value = (C34468OooOo0O) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        C21246OooO0OO.OooO00o(encoder);
        boolean z = value.f123526OooOo0o;
        String str = value.f123525OooOo;
        if (z) {
            encoder.OooOOoo(str);
            return;
        }
        Long lOooOOO = C33596OooOOo0.OooOOO(str);
        if (lOooOOO != null) {
            encoder.OooOo0o(lOooOOO.longValue());
            return;
        }
        C32450OooOo c32450OooOoOooOO0O = C21292OooO0oo.OooOO0O(str);
        if (c32450OooOoOooOO0O != null) {
            encoder.OooO0oo(o0000O0O.f122244OooO0O0).OooOo0o(c32450OooOoOooOO0O.f116650OooOo0o);
            return;
        }
        Boolean bool = null;
        Double dValueOf = C33596OooOOo0.OooOO0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
        if (dValueOf != null) {
            encoder.OooOo00(dValueOf.doubleValue());
            return;
        }
        if (str.equals(TelemetryEventStrings.Value.TRUE)) {
            bool = Boolean.TRUE;
        } else if (str.equals(TelemetryEventStrings.Value.FALSE)) {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            encoder.OooOOO0(bool.booleanValue());
        } else {
            encoder.OooOOoo(str);
        }
    }
}
