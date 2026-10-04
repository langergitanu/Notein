package o0O0oo0O;

import Oooo0.o000000O;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.backup.ImportLocalDataDialogFragment;
import com.orion.notein.p607ui.label.OooO0OO;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oo.ViewOnClickListenerC26073OooO0O0;
import o0Ooo.ViewOnClickListenerC29256OooO0Oo;
import o0o0O.C30174OooO00o;
import o0o0O00.C30185OooO00o;
import o0oOoOo.C31055OooOoOO;
import o0oOoOoO.C31095OooO0O0;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31129OooOOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26210OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89538OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89539OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26210OooO00o(Object obj, int i) {
        this.f89539OooOo0o = i;
        this.f89538OooOo = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z;
        C30174OooO00o c30174OooO00o;
        int i = 3;
        switch (this.f89539OooOo0o) {
            case 0:
                ViewOnClickListenerC26073OooO0O0 viewOnClickListenerC26073OooO0O0 = (ViewOnClickListenerC26073OooO0O0) this.f89538OooOo;
                if (viewOnClickListenerC26073OooO0O0 != null) {
                    viewOnClickListenerC26073OooO0O0.onClick(view);
                    return;
                }
                return;
            case 1:
                ((OooO0OO.OooO00o) this.f89538OooOo).f71974OooO00o.setText("");
                return;
            case 2:
                LoginByThirdPartyChildFragment.OooOoO0((LoginByThirdPartyChildFragment) this.f89538OooOo);
                return;
            case 3:
                int i2 = PenBoxChildFragment.f75355o0000Ooo;
                ((PenBoxChildFragment) this.f89538OooOo).Oooo0o().OooOOO0(DrawToolFactory.LASSO_TYPE_FREE);
                return;
            case 4:
                ((C30185OooO00o) this.f89538OooOo).f107468OooO0O0.getClass();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FavoriteContainerFragment");
                c20358OooO00o.OooOO0O("onCopyClick() not supported in FavoriteContainerFragment", new Object[0]);
                return;
            case 5:
                int i3 = AiOcrEditorListContainer.f78420OoooOOO;
                ((AiOcrEditorListContainer) this.f89538OooOo).OooO0O0(2, Boolean.valueOf(!view.isActivated()));
                return;
            case 6:
                Context contextRequireContext = ((UserInfoFragment) this.f89538OooOo).requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31095OooO0O0(contextRequireContext, null), 3);
                return;
            case 7:
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteinFileVO");
                C31114OooO c31114OooOOooOoo0 = ((ImportLocalDataDialogFragment) this.f89538OooOo).OooOoo0();
                String noteId = ((C31055OooOoOO) tag).f110868OooO00o;
                OooOOO0.OooO0oO(noteId, "noteId");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c31114OooOOooOoo0);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31129OooOOOO(c31114OooOOooOoo0, noteId, null), 2);
                return;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f89538OooOo;
                OooOOO0.OooO0Oo(view);
                textRecognizeFragment.Oooo000();
                textRecognizeFragment.f78196Ooooooo = true;
                if (textRecognizeFragment.f78198o00O0O == null) {
                    ViewOnClickListenerC29256OooO0Oo viewOnClickListenerC29256OooO0Oo = new ViewOnClickListenerC29256OooO0Oo(textRecognizeFragment, i);
                    Context contextRequireContext2 = textRecognizeFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                    textRecognizeFragment.f78198o00O0O = new C30174OooO00o(contextRequireContext2, viewOnClickListenerC29256OooO0Oo);
                }
                C30174OooO00o c30174OooO00o2 = textRecognizeFragment.f78198o00O0O;
                if (c30174OooO00o2 == null) {
                    z = false;
                } else {
                    PopupWindow popupWindow = c30174OooO00o2.f107400OooO0OO;
                    if (popupWindow == null ? false : popupWindow.isShowing()) {
                        z = true;
                    }
                }
                if (z) {
                    C30174OooO00o c30174OooO00o3 = textRecognizeFragment.f78198o00O0O;
                    if (c30174OooO00o3 != null) {
                        c30174OooO00o3.OooO00o();
                        return;
                    }
                    return;
                }
                textRecognizeFragment.Oooo0o0();
                TextView textView = textRecognizeFragment.f78187OoooOoo;
                if (textView == null) {
                    OooOOO0.OooOOOO("btnChangeInputSource");
                    throw null;
                }
                if (!view.equals(textView) || (c30174OooO00o = textRecognizeFragment.f78198o00O0O) == null) {
                    return;
                }
                synchronized (c30174OooO00o) {
                    try {
                        if (c30174OooO00o.f107402OooO0o0.compareAndSet(false, true)) {
                            c30174OooO00o.OooO0O0();
                        }
                        Rect rect = new Rect();
                        view.getGlobalVisibleRect(rect);
                        int iOooO0o = rect.left - o000000O.OooO0o(192);
                        int iOooO0o2 = rect.bottom + o000000O.OooO0o(12);
                        PopupWindow popupWindow2 = c30174OooO00o.f107400OooO0OO;
                        if (popupWindow2 == null) {
                            OooOOO0.OooOOOO("popupWindow");
                            throw null;
                        }
                        popupWindow2.showAtLocation(view, 0, iOooO0o, iOooO0o2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
