package o0OoO0oo;

import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.penkit.models.DrawResult;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OoO0oo.o00oO000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel", m80623f = "NoteEditorViewModel.kt", m80624l = {1922}, m80625m = "shouldTriggerAutoAddPage")
public final class C28942o00oO000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f102541OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public DrawResult f102542OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f102543OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102544OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28942o00oO000(C23344OooOOo c23344OooOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f102544OooOoO0 = c23344OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f102541OooOo = obj;
        this.f102543OooOoO |= Integer.MIN_VALUE;
        return this.f102544OooOoO0.OooOOoo(null, null, this);
    }
}
