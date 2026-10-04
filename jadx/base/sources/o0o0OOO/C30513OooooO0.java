package o0o0OOO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0o0OOO.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1651}, m80625m = "addCustomPaperColor-gIAlu-s")
public final class C30513OooooO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108948OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f108949OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f108950OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30513OooooO0(C30520o000000o c30520o000000o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f108948OooOo = c30520o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f108949OooOo0o = obj;
        this.f108950OooOoO0 |= Integer.MIN_VALUE;
        Object objOooO = this.f108948OooOo.OooO(0, this);
        return objOooO == EnumC32485OooO00o.f116726OooOo0o ? objOooO : new C32445OooOOOO(objOooO);
    }
}
