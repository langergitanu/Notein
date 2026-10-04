package o0o000oo;

import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0OoOo.C29196OooO0OO;

/* JADX INFO: renamed from: o0o000oo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29839Oooo0o0 implements AudioFileRenameDialogFragment.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C29196OooO0OO f105846OooO0O0;

    public C29839Oooo0o0(BaseToolbarChildFragment baseToolbarChildFragment, C29196OooO0OO c29196OooO0OO) {
        this.f105845OooO00o = baseToolbarChildFragment;
        this.f105846OooO0O0 = c29196OooO0OO;
    }

    @Override // com.orion.notein.ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment.OooO00o
    public final void OooO00o(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f105845OooO00o.Oooo000().OooOoO0(this.f105846OooO0O0.f103556OooO00o, name);
    }
}
