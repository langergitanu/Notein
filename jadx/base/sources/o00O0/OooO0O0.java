package o00O0;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<WindowLayoutInfo, C32460OooOooO> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(WindowLayoutInfo windowLayoutInfo) {
        WindowLayoutInfo p0 = windowLayoutInfo;
        OooOOO0.OooO0oO(p0, "p0");
        ((MulticastConsumer) this.receiver).accept(p0);
        return C32460OooOooO.f116667OooO00o;
    }
}
