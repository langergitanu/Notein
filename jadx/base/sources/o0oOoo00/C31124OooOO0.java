package o0oOoo00;

import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;

/* JADX INFO: renamed from: o0oOoo00.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$notifyCorruptedFile$1", m80623f = "BackupViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_3}, m80625m = "invokeSuspend")
public final class C31124OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111071OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111072OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31124OooOO0(C31114OooO c31114OooO, Continuation continuation) {
        super(2, continuation);
        oO0O000.OooOO0 oooOO02 = oO0O000.OooOO0.f116798OooOo0o;
        this.f111071OooOo = c31114OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C31114OooO c31114OooO = this.f111071OooOo;
        oO0O000.OooOO0 oooOO02 = oO0O000.OooOO0.f116798OooOo0o;
        return new C31124OooOO0(c31114OooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31124OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111072OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33695OooO0o0 c33695OooO0o0 = this.f111071OooOo.f111029OooO0oo;
            this.f111072OooOo0o = 1;
            if (c33695OooO0o0.OooOOO(oO0O000.OooOO0.f116798OooOo0o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
