package o0000OO0;

import OooOoo0.o0OOO0o;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.fragment.app.C21904OooOoo0;
import o0OOOO.C27080OooO0oo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33614OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public interface OooOOO0 {
    void OooO00o(Context context, C24192Oooo0oo c24192Oooo0oo, CancellationSignal cancellationSignal, OooO oooO, C24168OooOO0o c24168OooOO0o);

    default Object OooO0O0(Context context, C24192Oooo0oo c24192Oooo0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32479OooO0OO));
        c33614OooOOO0.OooOOoo();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c33614OooOOO0.OooOo0(new o0OOO0o(cancellationSignal, 1));
        OooO00o(context, c24192Oooo0oo, cancellationSignal, new OooO(), new C24168OooOO0o(c33614OooOOO0));
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }

    default Object OooO0OO(OooO00o oooO00o, C27080OooO0oo c27080OooO0oo) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c27080OooO0oo));
        c33614OooOOO0.OooOOoo();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c33614OooOOO0.OooOo0(new OooOO0(cancellationSignal));
        OooOO0O oooOO0O = new OooOO0O(c33614OooOOO0);
        OooO oooO = new OooO();
        InterfaceC24171OooOOo0 interfaceC24171OooOOo0OooO00o = C24170OooOOo.OooO00o(new C24170OooOOo((Context) ((OooOOOO) this).f81436OooO00o));
        if (interfaceC24171OooOOo0OooO00o == null) {
            oooOO0O.onError(new o0000OO.OooO0O0("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION", "clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC24171OooOOo0OooO00o.onClearCredential(oooO00o, cancellationSignal, oooO, oooOO0O);
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        return objOooOOo == EnumC32485OooO00o.f116726OooOo0o ? objOooOOo : C32460OooOooO.f116667OooO00o;
    }
}
