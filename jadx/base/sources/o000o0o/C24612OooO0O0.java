package o000o0o;

import androidx.concurrent.futures.C21617OooO0Oo;
import androidx.concurrent.futures.C21619OooO0oO;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33632Oooo;

/* JADX INFO: renamed from: o000o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24612OooO0O0 extends OooOOOO implements InterfaceC32507OooOO0o<Throwable, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C33632Oooo f83396OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C21617OooO0Oo<Object> f83397OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24612OooO0O0(C21617OooO0Oo c21617OooO0Oo, C33632Oooo c33632Oooo) {
        super(1);
        this.f83397OooOo0o = c21617OooO0Oo;
        this.f83396OooOo = c33632Oooo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Throwable th) throws Throwable {
        Throwable th2 = th;
        C21617OooO0Oo<Object> c21617OooO0Oo = this.f83397OooOo0o;
        if (th2 == null) {
            Object objOooOoo = this.f83396OooOo.OooOoo();
            c21617OooO0Oo.f63602OooO0Oo = true;
            C21619OooO0oO<Object> c21619OooO0oO = c21617OooO0Oo.f63600OooO0O0;
            if (c21619OooO0oO != null && c21619OooO0oO.f63603OooOo.set(objOooOoo)) {
                c21617OooO0Oo.f63599OooO00o = null;
                c21617OooO0Oo.f63600OooO0O0 = null;
                c21617OooO0Oo.f63601OooO0OO = null;
            }
        } else if (th2 instanceof CancellationException) {
            c21617OooO0Oo.f63602OooO0Oo = true;
            C21619OooO0oO<Object> c21619OooO0oO2 = c21617OooO0Oo.f63600OooO0O0;
            if (c21619OooO0oO2 != null && c21619OooO0oO2.f63603OooOo.cancel(true)) {
                c21617OooO0Oo.f63599OooO00o = null;
                c21617OooO0Oo.f63600OooO0O0 = null;
                c21617OooO0Oo.f63601OooO0OO = null;
            }
        } else {
            c21617OooO0Oo.f63602OooO0Oo = true;
            C21619OooO0oO<Object> c21619OooO0oO3 = c21617OooO0Oo.f63600OooO0O0;
            if (c21619OooO0oO3 != null && c21619OooO0oO3.f63603OooOo.setException(th2)) {
                c21617OooO0Oo.f63599OooO00o = null;
                c21617OooO0Oo.f63600OooO0O0 = null;
                c21617OooO0Oo.f63601OooO0OO = null;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
