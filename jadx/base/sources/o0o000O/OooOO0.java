package o0o000O;

import android.content.ClipData;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.strokeeditor.StrokesResizeAndRotateEditor", m80623f = "StrokesResizeAndRotateEditor.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "performStrokesDrag")
public final class OooOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ClipData f105458OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public StrokesResizeAndRotateEditor f105459OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ StrokesResizeAndRotateEditor f105460OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105461OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f105462OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(StrokesResizeAndRotateEditor strokesResizeAndRotateEditor, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f105460OooOoO = strokesResizeAndRotateEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f105461OooOoO0 = obj;
        this.f105462OooOoOO |= Integer.MIN_VALUE;
        return this.f105460OooOoO.OooO0O0(this);
    }
}
