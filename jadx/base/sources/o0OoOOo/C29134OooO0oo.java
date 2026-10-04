package o0OoOOo;

import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import o0OoOo.C29196OooO0OO;

/* JADX INFO: renamed from: o0OoOOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29134OooO0oo implements AudioFileRenameDialogFragment.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103261OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C29196OooO0OO f103262OooO0O0;

    public C29134OooO0oo(AudioBarChildFragment audioBarChildFragment, C29196OooO0OO c29196OooO0OO) {
        this.f103261OooO00o = audioBarChildFragment;
        this.f103262OooO0O0 = c29196OooO0OO;
    }

    @Override // com.orion.notein.ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment.OooO00o
    public final void OooO00o(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        this.f103261OooO00o.OooOoo0().OooOoO0(this.f103262OooO0O0.f103556OooO00o, name);
    }
}
