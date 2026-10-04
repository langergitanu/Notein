package oO0OoO;

import java.io.InputStream;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34596OooO0o;

/* JADX INFO: renamed from: oO0OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33228OooO0O0 extends OooOO0O implements InterfaceC32507OooOO0o<String, InputStream> {
    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34596OooO0o getOwner() {
        return C24035Oooo00o.f80943OooO00o.OooO0O0(C33231OooO0o0.class);
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InputStream invoke(String str) {
        String p0 = str;
        OooOOO0.OooO0oO(p0, "p0");
        ((C33231OooO0o0) this.receiver).getClass();
        return C33231OooO0o0.OooO00o(p0);
    }
}
