package o0o0OOO;

import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0o0OOO.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {1684}, m80625m = "deleteCustomPaperColor-gIAlu-s")
public final class C30519Ooooooo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f108971OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30520o000000o f108972OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f108973OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108974OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f108975OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30519Ooooooo(C30520o000000o c30520o000000o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f108973OooOoO = c30520o000000o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f108974OooOoO0 = obj;
        this.f108975OooOoOO |= Integer.MIN_VALUE;
        Object objOooOO0o = this.f108973OooOoO.OooOO0o(0, this);
        return objOooOO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0o : new C32445OooOOOO(objOooOO0o);
    }
}
