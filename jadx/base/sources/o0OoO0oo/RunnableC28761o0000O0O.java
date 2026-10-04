package o0OoO0oo;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OooO00o;
import o0Ooo0oo.C29568oo000o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.o0000O0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC28761o0000O0O implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101856OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101857OooOo0o;

    public /* synthetic */ RunnableC28761o0000O0O(Object obj, int i) {
        this.f101857OooOo0o = i;
        this.f101856OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f101857OooOo0o) {
            case 0:
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0Oooo000 = ((NoteEditorContainerFragment) this.f101856OooOo).Oooo000();
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0O0Oooo000), oooO0O0Oooo000.f75201o00Ooo, null, new C29568oo000o(oooO0O0Oooo000, true, null), 2);
                break;
            default:
                OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) this.f101856OooOo;
                Object parent = oooO0O0.f75879OooO00o.getParent();
                kotlin.jvm.internal.OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.View");
                ImageView expandIcon = oooO0O0.f75879OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0o(expandIcon, "expandIcon");
                int iOooO0o = Oooo0.o000000O.OooO0o(8);
                Rect rect = new Rect();
                expandIcon.getHitRect(rect);
                rect.left -= iOooO0o;
                rect.top -= iOooO0o;
                rect.right += iOooO0o;
                rect.bottom += iOooO0o;
                ((View) parent).setTouchDelegate(new TouchDelegate(rect, expandIcon));
                break;
        }
    }
}
