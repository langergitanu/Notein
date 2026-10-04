package o0Ooo00O;

import android.content.ClipData;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Ooo00O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel", m80623f = "ItemsEditorPanel.kt", m80624l = {182}, m80625m = "performMultiItemsDrag")
public final class C29370OooO0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ClipData f104143OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ItemsEditorPanel f104144OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ItemsEditorPanel f104145OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f104146OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f104147OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29370OooO0o(ItemsEditorPanel itemsEditorPanel, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f104145OooOoO = itemsEditorPanel;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f104146OooOoO0 = obj;
        this.f104147OooOoOO |= Integer.MIN_VALUE;
        return ItemsEditorPanel.OooO0OO(this.f104145OooOoO, this);
    }
}
