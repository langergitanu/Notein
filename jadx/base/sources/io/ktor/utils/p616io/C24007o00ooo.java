package io.ktor.utils.p616io;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: io.ktor.utils.io.o00ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24007o00ooo extends OooOOOO implements InterfaceC32507OooOO0o<Throwable, Throwable> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Constructor f80885OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24007o00ooo(Constructor constructor) {
        super(1);
        this.f80885OooOo0o = constructor;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Throwable invoke(Throwable th) {
        Object objOooO00o;
        Throwable e = th;
        OooOOO0.OooO0oO(e, "e");
        try {
            Object objNewInstance = this.f80885OooOo0o.newInstance(e);
            OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            objOooO00o = (Throwable) objNewInstance;
        } catch (Throwable th2) {
            objOooO00o = C32446OooOOOo.OooO00o(th2);
        }
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = null;
        }
        return (Throwable) objOooO00o;
    }
}
