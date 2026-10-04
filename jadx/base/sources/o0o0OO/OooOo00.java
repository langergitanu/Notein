package o0o0OO;

import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.o000O00;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$special$$inlined$flatMapLatest$1", m80623f = "TiledPageViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class OooOo00 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteMeta>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f108418OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108419OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108420OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f108421OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Continuation continuation, C30367OooO0o0 c30367OooO0o0) {
        super(3, continuation);
        this.f108420OooOoO = c30367OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteMeta> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        OooOo00 oooOo00 = new OooOo00(continuation, this.f108420OooOoO);
        oooOo00.f108418OooOo = interfaceC33723OooO0oO;
        oooOo00.f108421OooOoO0 = str;
        return oooOo00.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108419OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f108418OooOo;
            InterfaceC33721OooO0o<NoteMeta> interfaceC33721OooO0oOooOoO = this.f108420OooOoO.f108328OooO0Oo.OooOoO((String) this.f108421OooOoO0);
            this.f108419OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = ((o000O00) interfaceC33721OooO0oOooOoO).collect(new C30369OooO0oo(interfaceC33723OooO0oO), this);
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
