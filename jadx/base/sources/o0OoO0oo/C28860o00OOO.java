package o0OoO0oo;

import android.graphics.Bitmap;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditorPanel;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesEditorPanel;
import java.util.Iterator;
import o0O0o0oO.InterfaceC26048OoooO0O;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoO0oo.o00OOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28860o00OOO implements InterfaceC26048OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102221OooO00o;

    public C28860o00OOO(NoteEditorFragment noteEditorFragment) {
        this.f102221OooO00o = noteEditorFragment;
    }

    @Override // o0O0o0oO.InterfaceC26048OoooO0O
    public final void OooO00o() {
        Bitmap bitmap;
        NoteEditorFragment noteEditorFragment = this.f102221OooO00o;
        ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
        Object obj = null;
        if (itemsEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
        if (shapesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
            throw null;
        }
        TextEditorPanel textEditorPanel = noteEditorFragment.f73022OoooOoO;
        if (textEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("textEditorPanel");
            throw null;
        }
        Iterator it = C34429OooOOo0.OooOO0o(itemsEditorPanel, strokesEditorPanel, shapesEditorPanel, textEditorPanel).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((View) next).isShown()) {
                obj = next;
                break;
            }
        }
        if (obj == null || (bitmap = ((InterfaceC28684OooO) obj).getBitmap()) == null) {
            return;
        }
        NoteEditorFragment.OooOoO(noteEditorFragment, bitmap);
    }
}
