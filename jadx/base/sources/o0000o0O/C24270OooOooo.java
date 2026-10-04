package o0000o0O;

import java.util.concurrent.CancellationException;
import o0000o0O.AbstractC24285OoooOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0000o0O.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24270OooOooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<AbstractC24285OoooOOO.OooO00o<Object>, Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C24270OooOooo f81668OooOo0o = new C24270OooOooo(2);

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(AbstractC24285OoooOOO.OooO00o<Object> oooO00o, Throwable th) {
        AbstractC24285OoooOOO.OooO00o<Object> msg = oooO00o;
        Throwable cancellationException = th;
        kotlin.jvm.internal.OooOOO0.OooO0oO(msg, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        msg.f81726OooO0O0.OooO00o(cancellationException);
        return C32460OooOooO.f116667OooO00o;
    }
}
