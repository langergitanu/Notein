package o0OO;

import com.aspose.words.StyleIdentifier;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OO.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoDefaultDataSource$getLaserPenDisappears$1", m80623f = "PenInfoDefaultDataSource.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1}, m80625m = "invokeSuspend")
public final class C26428Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends Integer>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f90753OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f90754OooOo0o;

    public C26428Oooo0OO() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26428Oooo0OO c26428Oooo0OO = new C26428Oooo0OO(2, continuation);
        c26428Oooo0OO.f90753OooOo = obj;
        return c26428Oooo0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends Integer>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26428Oooo0OO) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f90754OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f90753OooOo;
            List listOooOO0o = C34429OooOOo0.OooOO0o(new Integer(1), new Integer(3), new Integer(15), new Integer(-1));
            this.f90754OooOo0o = 1;
            if (interfaceC33723OooO0oO.emit(listOooOO0o, this) == enumC32485OooO00o) {
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
