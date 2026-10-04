package o0OOO0oO;

import com.google.firebase.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import com.huawei.hms.network.inner.api.NetworkService;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooo.C26359OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOO0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.remoteconfig.FirebaseRemoteConfigDataSource$init$1", m80623f = "FirebaseRemoteConfigDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27056OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27060OooO0oO f94195OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27056OooO0OO(C27060OooO0oO c27060OooO0oO, Continuation<? super C27056OooO0OO> continuation) {
        super(2, continuation);
        this.f94195OooOo0o = c27060OooO0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27056OooO0OO(this.f94195OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27056OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C27060OooO0oO c27060OooO0oO = this.f94195OooOo0o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FirebaseRemoteConfigDataSource");
        c20358OooO00o.OooO0o0("init Firebase remote config sdk", new Object[0]);
        c27060OooO0oO.f94199OooO0O0 = RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);
        FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsRemoteConfigSettings = RemoteConfigKt.remoteConfigSettings(new C26359OooO0OO(1));
        FirebaseRemoteConfig firebaseRemoteConfig = c27060OooO0oO.f94199OooO0O0;
        if (firebaseRemoteConfig == null) {
            OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
            throw null;
        }
        firebaseRemoteConfig.setConfigSettingsAsync(firebaseRemoteConfigSettingsRemoteConfigSettings);
        FirebaseRemoteConfig firebaseRemoteConfig2 = c27060OooO0oO.f94199OooO0O0;
        if (firebaseRemoteConfig2 == null) {
            OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
            throw null;
        }
        firebaseRemoteConfig2.setDefaultsAsync(R.xml.remote_config_firebase);
        Boolean bool = Boolean.TRUE;
        C33781o00o0O c33781o00o0O = c27060OooO0oO.f94198OooO00o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool);
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C27057OooO0Oo(c27060OooO0oO, null), 3);
        FirebaseRemoteConfig firebaseRemoteConfig3 = c27060OooO0oO.f94199OooO0O0;
        if (firebaseRemoteConfig3 != null) {
            firebaseRemoteConfig3.addOnConfigUpdateListener(new C27058OooO0o(c27060OooO0oO));
            return C32460OooOooO.f116667OooO00o;
        }
        OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
        throw null;
    }
}
