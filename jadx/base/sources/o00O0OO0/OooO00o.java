package o00O0OO0;

import android.os.Looper;
import androidx.core.os.HandlerCompat;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f84325OooO00o;

    public OooO00o() {
        this.f84325OooO00o = HandlerCompat.createAsync(Looper.getMainLooper());
    }

    public OooO00o(HyperLinkEditorPanel hyperLinkEditorPanel) {
        this.f84325OooO00o = hyperLinkEditorPanel;
    }
}
