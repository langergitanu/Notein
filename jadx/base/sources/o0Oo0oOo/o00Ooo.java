package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.DeleteMaterialConfirmDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoOoo0.C29227OooO0O0;
import o0o00o0.C29935OooO0o0;
import o0o00oO0.C29990OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00Ooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100590OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100591OooOo0o;

    public /* synthetic */ o00Ooo(Object obj, int i) {
        this.f100591OooOo0o = i;
        this.f100590OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100591OooOo0o) {
            case 0:
                ((DeleteMaterialConfirmDialogFragment) this.f100590OooOo).dismissAllowingStateLoss();
                break;
            case 1:
                ((FirebaseUserLoginFragment) this.f100590OooOo).OoooO00(true);
                break;
            case 2:
                o000000O o000000o2 = ((C29227OooO0O0.C19967OooO0O0) this.f100590OooOo).f103642OooO00o;
                if (o000000o2 != null) {
                    o000000o2.onClick(view);
                }
                break;
            case 3:
                C29935OooO0o0 c29935OooO0o0 = ((C29990OooO0oO) this.f100590OooOo).f106537Oooo0o;
                if (c29935OooO0o0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    View.OnClickListener onClickListener = c29935OooO0o0.f106278OooO00o;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
                break;
            case 4:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) this.f100590OooOo), new C24564OooO00o(R.id.action_globalSettingsFragment_to_globalGestureSettingsFragment));
                break;
            default:
                StickerCollectionCreationFragment stickerCollectionCreationFragment = (StickerCollectionCreationFragment) this.f100590OooOo;
                stickerCollectionCreationFragment.f79438OooOooO.OooOoO(new C28374o00ooo(stickerCollectionCreationFragment, 1));
                break;
        }
    }
}
