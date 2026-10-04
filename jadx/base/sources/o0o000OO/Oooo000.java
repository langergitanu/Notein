package o0o000OO;

import com.orion.notein.domain.models.page.Quote;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000O00.C24378OooOoO0;
import o00o00O0.C25252OooO0Oo;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OO00o0.C26628o00OoO;
import o0OO00o0.C26629o00OoO0;
import o0OOooo0.C27994OooOOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oo0oO0.AbstractC34954o00ooO0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$special$$inlined$flatMapLatest$3", m80623f = "TextAnnoViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super C32443OooOOO<? extends String, ? extends List<? extends Quote>>>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105642OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105643OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105644OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(Continuation continuation, OooOO0O oooOO0O) {
        super(3, continuation);
        this.f105643OooOoO = oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super C32443OooOOO<? extends String, ? extends List<? extends Quote>>> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        Oooo000 oooo000 = new Oooo000(continuation, this.f105643OooOoO);
        oooo000.f105641OooOo = interfaceC33723OooO0oO;
        oooo000.f105644OooOoO0 = str;
        return oooo000.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105642OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f105641OooOo;
            String noteId = (String) this.f105644OooOoO0;
            C27994OooOOOO c27994OooOOOO = this.f105643OooOoO.f105532OooO0o;
            c27994OooOOOO.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
            C24378OooOoO0 c24378OooOoO0 = c27994OooOOOO.f99260OooO00o;
            C26629o00OoO0 c26629o00OoO0 = (C26629o00OoO0) c24378OooOoO0.f82246OooO00o;
            c26629o00OoO0.getClass();
            C26454OooO0Oo c26454OooO0Oo = c26629o00OoO0.f91909OooO00o;
            c26454OooO0Oo.getClass();
            c26454OooO0Oo.OooO0O0(noteId);
            AbstractC34954o00ooO0 it = c26454OooO0Oo.OooO0o(noteId).Oooo00O();
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            C33734OooOOoo c33734OooOOoo = new C33734OooOOoo(it.OooO0Oo(), new C26466OooO0o0(c26454OooO0Oo, noteId, null));
            this.f105642OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = c33734OooOOoo.collect(new C26628o00OoO(new OooOOOO(interfaceC33723OooO0oO, noteId), c24378OooOoO0), this);
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect != enumC32485OooO00o) {
                objCollect = C32460OooOooO.f116667OooO00o;
            }
            if (objCollect == enumC32485OooO00o) {
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
