package o0ooOO0;

import Oooo0O0.C20935Oooo00o;
import OooooO0.C21291OooO0oO;
import android.view.ActionMode;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o0ooOoO.C31662OooO00o;
import o0ooOoO.C31663OooO0O0;

/* JADX INFO: renamed from: o0ooOO0.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31541OoooOO0 implements InterfaceC31574o0000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AndroidComposeView f112739OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ActionMode f112740OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C31663OooO0O0 f112741OooO0OO = new C31663OooO0O0(new C31537OoooO(this));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public EnumC31580o0000oOO f112742OooO0Oo = EnumC31580o0000oOO.f112837OooOo;

    public C31541OoooOO0(AndroidComposeView androidComposeView) {
        this.f112739OooO00o = androidComposeView;
    }

    @Override // o0ooOO0.InterfaceC31574o0000o
    public final void OooO00o(C21291OooO0oO c21291OooO0oO, C20935Oooo00o.OooO0OO oooO0OO, C20935Oooo00o.C20937OooO0o0 c20937OooO0o0, C20935Oooo00o.C20936OooO0Oo c20936OooO0Oo, C20935Oooo00o.OooO0o oooO0o) {
        C31663OooO0O0 c31663OooO0O0 = this.f112741OooO0OO;
        c31663OooO0O0.getClass();
        c31663OooO0O0.f113178OooO0O0 = c21291OooO0oO;
        c31663OooO0O0.f113179OooO0OO = oooO0OO;
        c31663OooO0O0.f113182OooO0o0 = c20936OooO0Oo;
        c31663OooO0O0.f113180OooO0Oo = c20937OooO0o0;
        c31663OooO0O0.f113181OooO0o = oooO0o;
        ActionMode actionMode = this.f112740OooO0O0;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f112742OooO0Oo = EnumC31580o0000oOO.f112838OooOo0o;
        this.f112740OooO0O0 = C31579o0000oO0.f112836OooO00o.OooO0O0(this.f112739OooO00o, new C31662OooO00o(c31663OooO0O0), 1);
    }

    @Override // o0ooOO0.InterfaceC31574o0000o
    public final EnumC31580o0000oOO getStatus() {
        return this.f112742OooO0Oo;
    }

    @Override // o0ooOO0.InterfaceC31574o0000o
    public final void hide() {
        this.f112742OooO0Oo = EnumC31580o0000oOO.f112837OooOo;
        ActionMode actionMode = this.f112740OooO0O0;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f112740OooO0O0 = null;
    }
}
