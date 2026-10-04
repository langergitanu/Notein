package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesResizeAndRotateEditor;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoOoo0.C29226OooO00o;
import o0OoOoo0.ViewOnClickListenerC29233OooO0oo;
import o0Ooo0oo.C29553o00O0O;
import o0o00oO0.C29990OooO0oO;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0OO00O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101359OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101360OooOo0o;

    public /* synthetic */ o0OO00O(Object obj, int i) {
        this.f101360OooOo0o = i;
        this.f101359OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101359OooOo;
        switch (this.f101360OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseUserLoginFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                break;
            case 1:
                ViewOnClickListenerC29233OooO0oo viewOnClickListenerC29233OooO0oo = ((C29226OooO00o) obj).f103627OooO0O0;
                if (viewOnClickListenerC29233OooO0oo != null) {
                    viewOnClickListenerC29233OooO0oo.onClick(view);
                }
                break;
            case 2:
                View.OnClickListener onClickListener = ((C29553o00O0O) obj).f104835OooO0Oo;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 3:
                int i = ShapesResizeAndRotateEditor.f76325Oooo0O0;
                o0o000O0.OooO0o eventListener = ((ShapesResizeAndRotateEditor) obj).getEventListener();
                if (eventListener != null) {
                    eventListener.onCancel();
                }
                break;
            case 4:
                ((C29990OooO0oO) obj).OooO0o0(1);
                break;
            case 5:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) obj), new C24564OooO00o(R.id.action_globalSettingsFragment_to_pageSettingsFragment));
                break;
            default:
                C21030OooOO0o.OooO0OO((StickerCollectionCreationFragment) obj).OooOOo0();
                break;
        }
    }
}
