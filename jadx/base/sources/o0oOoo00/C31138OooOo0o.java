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
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0oOoo00.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.CloudBackupViewModel$manualBackup$1", m80623f = "CloudBackupViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK}, m80625m = "invokeSuspend")
public final class C31138OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.backup.OooO00o f111106OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111107OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31138OooOo0o(com.orion.notein.p607ui.backup.OooO00o oooO00o, Continuation<? super C31138OooOo0o> continuation) {
        super(2, continuation);
        this.f111106OooOo = oooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31138OooOo0o(this.f111106OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31138OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111107OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33772OooooOo c33772OooooOo = this.f111106OooOo.f70694OooOOO;
            Boolean bool = Boolean.TRUE;
            this.f111107OooOo0o = 1;
            if (c33772OooooOo.emit(bool, this) == enumC32485OooO00o) {
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
