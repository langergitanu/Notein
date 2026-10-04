package o0OoO0oo;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.o000ooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {598}, m80625m = "recoverAllPages-IoAF18A")
public final class C28826o000ooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102056OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f102057OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f102058OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28826o000ooO0(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f102056OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f102057OooOo0o = obj;
        this.f102058OooOoO0 |= Integer.MIN_VALUE;
        Object objOooOoO = this.f102056OooOo.OooOoO(this);
        return objOooOoO == EnumC32485OooO00o.f116726OooOo0o ? objOooOoO : new C32445OooOOOO(objOooOoO);
    }
}
