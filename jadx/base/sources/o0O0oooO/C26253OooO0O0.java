package o0O0oooO;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.App;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0O0oooO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.App$initJobAsync$1", m80623f = "App.kt", m80624l = {StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1, StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
public final class C26253OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ App f89706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f89707OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26253OooO0O0(App app, Continuation<? super C26253OooO0O0> continuation) {
        super(2, continuation);
        this.f89706OooOo = app;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26253OooO0O0(this.f89706OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26253OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (com.orion.notein.App.OooO0O0(r2, r5) == r0) goto L23;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetworkCapabilities networkCapabilities;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f89707OooOo0o;
        App app = this.f89706OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f89707OooOo0o = 1;
            if (App.OooO0OO(app, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
        Object systemService = app.getSystemService("connectivity");
        kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if ((activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities.hasTransport(1)) {
            this.f89707OooOo0o = 2;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
