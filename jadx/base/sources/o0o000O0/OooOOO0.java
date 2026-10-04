package o0o000O0;

import android.content.ClipData;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.shapeeditor.ShapesEditorPanel", m80623f = "ShapesEditorPanel.kt", m80624l = {671}, m80625m = "performStrokesDrag")
public final class OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ClipData f105473OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ShapesEditorPanel f105474OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ShapesEditorPanel f105475OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105476OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f105477OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(ShapesEditorPanel shapesEditorPanel, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f105475OooOoO = shapesEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f105476OooOoO0 = obj;
        this.f105477OooOoOO |= Integer.MIN_VALUE;
        return ShapesEditorPanel.OooO0o0(this.f105475OooOoO, this);
    }
}
