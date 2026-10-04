package o0O0o0oO;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.penkit.models.TextBoxInfo;

/* JADX INFO: renamed from: o0O0o0oO.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC26064o000000o implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final NoteInContextMenu f88973OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextBoxInfo f88974OooOo0o = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ViewGroup f88975OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o00000 f88976OooOoO0;

    /* JADX INFO: renamed from: o0O0o0oO.o000000o$OooO00o */
    public interface OooO00o {
        void OooO(TextBoxInfo textBoxInfo);

        void OooO00o(View view, boolean z);

        void OooO0O0(TextBoxInfo textBoxInfo);

        void OooO0OO(TextBoxInfo textBoxInfo);

        void OooO0Oo(TextBoxInfo textBoxInfo);

        void OooO0o(TextBoxInfo textBoxInfo);

        void OooO0o0(TextBoxInfo textBoxInfo);

        void OooO0oO(TextBoxInfo textBoxInfo);

        void OooO0oo();
    }

    public ViewOnAttachStateChangeListenerC26064o000000o(Context context, o00000 o00000Var) {
        this.f88976OooOoO0 = o00000Var;
        this.f88973OooOo = new NoteInContextMenu(context);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f88975OooOoO;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
            this.f88975OooOoO = null;
        }
        this.f88976OooOoO0.OooO0oo();
    }
}
