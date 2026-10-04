package o0OoO0oo;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.penkit.models.ImageInfo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0oo.o00OO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28854o00OO00o implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ RectF f102201OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f102202OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102203OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f102204OooOoO0;

    public /* synthetic */ C28854o00OO00o(String str, RectF rectF, float f, NoteEditorFragment noteEditorFragment) {
        this.f102202OooOo0o = str;
        this.f102201OooOo = rectF;
        this.f102204OooOoO0 = f;
        this.f102203OooOoO = noteEditorFragment;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        String filePath = (String) obj;
        Bitmap nextBitmap = (Bitmap) obj2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(filePath, "filePath");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nextBitmap, "nextBitmap");
        ImageInfo imageInfo = new ImageInfo(this.f102202OooOo0o, filePath, this.f102201OooOo, this.f102204OooOoO0, null, 0L, nextBitmap, false, 176, null);
        NoteEditorFragment noteEditorFragment = this.f102203OooOoO;
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView != null) {
            pDFView.OooOO0O(C34434OooOoO.f123453OooOo0o, com.facebook.soloader.OooOo.OooO0oO(imageInfo), noteEditorFragment.f73063oo000o);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
        throw null;
    }
}
