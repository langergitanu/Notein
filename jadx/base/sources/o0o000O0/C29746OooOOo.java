package o0o000O0;

import android.content.ClipData;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesResizeAndRotateEditor;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0o000O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.shapeeditor.ShapesResizeAndRotateEditor", m80623f = "ShapesResizeAndRotateEditor.kt", m80624l = {229}, m80625m = "performStrokesDrag")
public final class C29746OooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ClipData f105480OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ShapesResizeAndRotateEditor f105481OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ShapesResizeAndRotateEditor f105482OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105483OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f105484OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29746OooOOo(ShapesResizeAndRotateEditor shapesResizeAndRotateEditor, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f105482OooOoO = shapesResizeAndRotateEditor;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f105483OooOoO0 = obj;
        this.f105484OooOoOO |= Integer.MIN_VALUE;
        return ShapesResizeAndRotateEditor.OooO0Oo(this.f105482OooOoO, this);
    }
}
