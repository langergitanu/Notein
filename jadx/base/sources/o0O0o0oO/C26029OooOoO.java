package o0O0o0oO;

import android.content.Context;
import android.view.View;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.penkit.models.ImageInfo;

/* JADX INFO: renamed from: o0O0o0oO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26029OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26031OooOoOO f88885OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteInContextMenu f88886OooO0O0;

    /* JADX INFO: renamed from: o0O0o0oO.OooOoO$OooO00o */
    public interface OooO00o {
        void OooO(ImageInfo imageInfo);

        void OooO00o(View view, boolean z);

        void OooO0O0(ImageInfo imageInfo);

        void OooO0OO(ImageInfo imageInfo);

        void OooO0Oo(ImageInfo imageInfo, int i);

        void OooO0o(ImageInfo imageInfo);

        void OooO0o0(ImageInfo imageInfo);

        void OooO0oO(ImageInfo imageInfo);

        void OooO0oo(ImageInfo imageInfo);
    }

    public C26029OooOoO(Context context, C26031OooOoOO c26031OooOoOO) {
        this.f88885OooO00o = c26031OooOoOO;
        this.f88886OooO0O0 = new NoteInContextMenu(context);
    }
}
