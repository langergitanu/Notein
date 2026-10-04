package o0OoO000;

import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserResetPasswordFragment;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import o0o00oO0.C30006OooOooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.o0000oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28592o0000oOo implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101334OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101335OooOo0o;

    public /* synthetic */ C28592o0000oOo(Object obj, int i) {
        this.f101335OooOo0o = i;
        this.f101334OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        switch (this.f101335OooOo0o) {
            case 0:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseUserResetPasswordFragment");
                c20358OooO00o.OooO00o("Email sent.", new Object[0]);
                FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment = (FirebaseUserResetPasswordFragment) this.f101334OooOo;
                String string = firebaseUserResetPasswordFragment.getString(R.string.send_successful);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                FirebaseUserResetPasswordFragment.Oooo00o(firebaseUserResetPasswordFragment, string);
                C21989OooOooO.OooO00o(firebaseUserResetPasswordFragment).OooO0O0(new o000(firebaseUserResetPasswordFragment, null));
                return C32460OooOooO.f116667OooO00o;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                ((C30006OooOooo) this.f101334OooOo).f106619Oooo000.setText(oO0O00O.OooO00o.OooO0O0(fFloatValue * 100) + "%");
                return C32460OooOooO.f116667OooO00o;
            default:
                InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("delete from StickerEntity where parent_id = ?");
                String str = (String) this.f101334OooOo;
                try {
                    if (str == null) {
                        interfaceC24749OooO0OoO0ooOOo.OooO0oO(1);
                    } else {
                        interfaceC24749OooO0OoO0ooOOo.o000000O(1, str);
                    }
                    interfaceC24749OooO0OoO0ooOOo.o00oO0o();
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC24749OooO0OoO0ooOOo.close();
                    return c32460OooOooO;
                } catch (Throwable th) {
                    interfaceC24749OooO0OoO0ooOOo.close();
                    throw th;
                }
        }
    }
}
