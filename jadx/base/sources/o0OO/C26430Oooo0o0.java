package o0OO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoDefaultDataSource$getPenInfoListByNoteId$1", m80623f = "PenInfoDefaultDataSource.kt", m80624l = {StyleIdentifier.INTENSE_REFERENCE}, m80625m = "invokeSuspend")
public final class C26430Oooo0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends PenInfo>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90766OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90767OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<PenInfo> f90768OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26430Oooo0o0(List<PenInfo> list, Continuation<? super C26430Oooo0o0> continuation) {
        super(2, continuation);
        this.f90768OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26430Oooo0o0 c26430Oooo0o0 = new C26430Oooo0o0(this.f90768OooOoO0, continuation);
        c26430Oooo0o0.f90766OooOo = obj;
        return c26430Oooo0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends PenInfo>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26430Oooo0o0) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90767OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f90766OooOo;
            this.f90767OooOo0o = 1;
            if (interfaceC33723OooO0oO.emit(this.f90768OooOoO0, this) == enumC32485OooO00o) {
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
