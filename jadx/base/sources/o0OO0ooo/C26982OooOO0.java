package o0OO0ooo;

import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OO0ooo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.message.NoteinMessageRepoImpl$getMessagesByUser$1", m80623f = "NoteinMessageRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26982OooOO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteinMessage>, List<? extends NoteinMessage>, Continuation<? super List<? extends NoteinMessage>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f93735OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f93736OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends NoteinMessage> list, List<? extends NoteinMessage> list2, Continuation<? super List<? extends NoteinMessage>> continuation) {
        C26982OooOO0 c26982OooOO0 = new C26982OooOO0(3, continuation);
        c26982OooOO0.f93736OooOo0o = list;
        c26982OooOO0.f93735OooOo = list2;
        return c26982OooOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return OooOo.OooooOO(this.f93736OooOo0o, this.f93735OooOo);
    }
}
