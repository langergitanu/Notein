package o0OoO000;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.user.settings.profile.UserAvatarModifyFragment;
import java.util.concurrent.CancellationException;
import o0o00Oo.C29904OooOOo;
import o0oOoOO0.C31022OooO0oo;
import o0oOoOoO.C31099OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoO000.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28535OooOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101158OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101159OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28535OooOo0(Object obj, int i) {
        this.f101159OooOo0o = i;
        this.f101158OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101159OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseCreateUserVerificationFragment) this.f101158OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 1:
                ((AudioBarChildFragment) this.f101158OooOo).OooOoo0().Oooo0();
                return;
            case 2:
                View.OnClickListener onClickListener = ((C29904OooOOo) this.f101158OooOo).f106100OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 3:
                oO0o0OO.o00000OO o00000oo2 = ((NoteListContainerFragment) this.f101158OooOo).OooOoo().f77173OooooOo;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                    return;
                }
                return;
            default:
                UserAvatarModifyFragment userAvatarModifyFragment = (UserAvatarModifyFragment) this.f101158OooOo;
                View view2 = userAvatarModifyFragment.f80017Oooo00O;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnConfirm");
                    throw null;
                }
                view2.setEnabled(false);
                View view3 = userAvatarModifyFragment.f80018Oooo00o;
                if (view3 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("uploadingView");
                    throw null;
                }
                view3.setVisibility(0);
                InterfaceC21987OooOoo viewLifecycleOwner = userAvatarModifyFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C31022OooO0oo(userAvatarModifyFragment, null), 3);
                return;
        }
    }
}
