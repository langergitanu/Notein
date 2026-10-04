package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0OoOoo0.C29227OooO0O0;
import o0Ooo0oo.C29555o00Ooo;
import o0Ooo0oo.ViewOnClickListenerC29468OooOooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0O0O00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101357OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101358OooOo0o;

    public /* synthetic */ o0O0O00(Object obj, int i) {
        this.f101358OooOo0o = i;
        this.f101357OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101358OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((FirebaseUserLoginFragment) this.f101357OooOo).OooOOo(R.id.firebaseUserAuthFragment, false);
                break;
            case 1:
                o0Oo0oOo.o000000O o000000o2 = ((C29227OooO0O0.C19967OooO0O0) this.f101357OooOo).f103642OooO00o;
                if (o000000o2 != null) {
                    o000000o2.onClick(view);
                }
                break;
            case 2:
                ViewOnClickListenerC29468OooOooo viewOnClickListenerC29468OooOooo = ((C29555o00Ooo) this.f101357OooOo).f104845OooO0O0;
                if (viewOnClickListenerC29468OooOooo != null) {
                    viewOnClickListenerC29468OooOooo.onClick(view);
                }
                break;
            case 3:
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) this.f101357OooOo), R.id.action_globalSettingsFragment_to_appearanceSettingsFragment, null);
                break;
            default:
                final StickerCollectionCreationFragment stickerCollectionCreationFragment = (StickerCollectionCreationFragment) this.f101357OooOo;
                stickerCollectionCreationFragment.f79438OooOooO.OooOoOO(new InterfaceC32507OooOO0o() { // from class: o0oOOooo.OooO0O0
                    @Override // oO0O000o.InterfaceC32507OooOO0o
                    public final Object invoke(Object obj) {
                        List<? extends Uri> it = (List) obj;
                        OooOOO0.OooO0oO(it, "it");
                        stickerCollectionCreationFragment.OooOoo0().OooO0o0(it);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                break;
        }
    }
}
