package o0Oo0oO0;

import android.content.Context;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;
import com.huawei.hms.network.embedded.C18196h2;
import com.orion.notein.p607ui.feedback.FeedbackFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.user.settings.profile.UserAvatarModifyFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0OoOo.C29194OooO00o;
import o0o00.C29719OooO00o;
import o0o00Oo.C29906OooOOoo;
import o0oOoOo.C31038OooOO0;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100351OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100352OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f100352OooOo0o = i;
        this.f100351OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100352OooOo0o) {
            case 0:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FeedbackTypeVO");
                C31038OooOO0 c31038OooOO0 = (C31038OooOO0) tag;
                OooOOO OooOoO2 = ((FeedbackFragment) this.f100351OooOo).OooOoO();
                List<C31038OooOO0> list = OooOOO.f100372OooOOOO;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int i = ((C31038OooOO0) it.next()).f110814OooO00o;
                    arrayList.add(new C31038OooOO0(i, c31038OooOO0.f110814OooO00o == i));
                }
                C33781o00o0O c33781o00o0O = OooOoO2.f100376OooO0o0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, arrayList);
                break;
            case 1:
                Context contextRequireContext = ((FirebaseCreateUserVerificationFragment) this.f100351OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                break;
            case 2:
                AudioBarChildFragment audioBarChildFragment = (AudioBarChildFragment) this.f100351OooOo;
                C29194OooO00o c29194OooO00o = (C29194OooO00o) audioBarChildFragment.OooOoo0().f74239OooOo00.f121747OooOo0o.getValue();
                if (c29194OooO00o != null) {
                    audioBarChildFragment.OooOoo0().OooOooO(c29194OooO00o.f103546OooO0OO + C18196h2.f55021c);
                    break;
                }
                break;
            case 3:
                View.OnClickListener onClickListener = ((C29719OooO00o) this.f100351OooOo).f105372OooO0OO;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 4:
                View.OnClickListener onClickListener2 = ((C29906OooOOoo) this.f100351OooOo).f106105OooO0O0;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                break;
            default:
                UserAvatarModifyFragment userAvatarModifyFragment = (UserAvatarModifyFragment) this.f100351OooOo;
                Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                OooO0o.OooO0O0<Intent> oooO0O0 = userAvatarModifyFragment.f80014OooOooO;
                if (oooO0O0 != null) {
                    oooO0O0.OooO00o(intent);
                }
                break;
        }
    }
}
