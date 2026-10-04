package io.ktor.utils.p616io;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class oo000o extends OooOOOO implements InterfaceC32507OooOO0o<Throwable, Throwable> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Constructor f80894OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(Constructor constructor) {
        super(1);
        this.f80894OooOo0o = constructor;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Throwable invoke(Throwable th) {
        Object objOooO00o;
        Throwable e = th;
        OooOOO0.OooO0oO(e, "e");
        try {
            Object objNewInstance = this.f80894OooOo0o.newInstance(e.getMessage());
            OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(e);
            objOooO00o = th2;
        } catch (Throwable th3) {
            objOooO00o = C32446OooOOOo.OooO00o(th3);
        }
        boolean z = objOooO00o instanceof C32445OooOOOO.OooO00o;
        Object obj = objOooO00o;
        if (z) {
            obj = null;
        }
        return (Throwable) obj;
    }
}
