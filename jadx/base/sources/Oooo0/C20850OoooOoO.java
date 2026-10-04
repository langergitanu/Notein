package Oooo0;

import Oooo0O0.C20935Oooo00o;
import android.view.KeyEvent;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: Oooo0.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20850OoooOoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f59954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f59955OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f59956OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20850OoooOoO(int i, Object obj, Object obj2) {
        super(1);
        this.f59955OooOo0o = i;
        this.f59954OooOo = obj;
        this.f59956OooOoO0 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f59955OooOo0o) {
            case 0:
                KeyEvent keyEvent = ((o00O0O.OooO0O0) obj).f84203OooO00o;
                if (((o000O0) this.f59954OooOo).OooO00o() == EnumC20854OooooO0.f59963OooOo && keyEvent.getKeyCode() == 4) {
                    z = true;
                    if (o00O0O.OooO0OO.OooO00o(keyEvent) == 1) {
                        ((C20935Oooo00o) this.f59956OooOoO0).OooO0o0(null);
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((io.ktor.utils.p616io.OooO00o) this.f59954OooOo).OooO0Oo(th);
                    ((io.ktor.utils.p616io.OooO00o) this.f59956OooOoO0).OooO0Oo(th);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
