package androidx.credentials.playservices.controllers.CreatePassword;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m80612d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "LoO00ooO/OooOooO;", "f", "invoke", "(Landroid/os/CancellationSignal;LoO0O000o/OooO00o;)V", "<anonymous>"}, m80613k = 3, m80614mv = {1, 8, 0})
public final class CredentialProviderCreatePasswordController$handleResponse$1 extends OooOOOO implements InterfaceC32508OooOOOo<CancellationSignal, oO0O000o.OooO00o<? extends C32460OooOooO>, C32460OooOooO> {
    public static final CredentialProviderCreatePasswordController$handleResponse$1 INSTANCE = new CredentialProviderCreatePasswordController$handleResponse$1();

    public CredentialProviderCreatePasswordController$handleResponse$1() {
        super(2);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public /* bridge */ /* synthetic */ C32460OooOooO invoke(CancellationSignal cancellationSignal, oO0O000o.OooO00o<? extends C32460OooOooO> oooO00o) {
        invoke2(cancellationSignal, (oO0O000o.OooO00o<C32460OooOooO>) oooO00o);
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CancellationSignal cancellationSignal, oO0O000o.OooO00o<C32460OooOooO> f) {
        OooOOO0.OooO0oO(f, "f");
        CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f);
    }
}
