package o0Ooooo;

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

/* JADX INFO: renamed from: o0Ooooo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$special$$inlined$flatMapLatest$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C29685OooOo0o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super NoteMeta>, String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f105236OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f105237OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105238OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f105239OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29685OooOo0o(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, Continuation continuation) {
        super(3, continuation);
        this.f105238OooOoO = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super NoteMeta> interfaceC33723OooO0oO, String str, Continuation<? super C32460OooOooO> continuation) {
        C29685OooOo0o c29685OooOo0o = new C29685OooOo0o(this.f105238OooOoO, continuation);
        c29685OooOo0o.f105236OooOo = interfaceC33723OooO0oO;
        c29685OooOo0o.f105239OooOoO0 = str;
        return c29685OooOo0o.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f105237OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f105236OooOo;
            InterfaceC33721OooO0o<NoteMeta> interfaceC33721OooO0oOooOoO = this.f105238OooOoO.f76066OooO0Oo.OooOoO((String) this.f105239OooOoO0);
            this.f105237OooOo0o = 1;
            C25252OooO0Oo.OooOOO(interfaceC33723OooO0oO);
            Object objCollect = ((o000O00) interfaceC33721OooO0oOooOoO).collect(new C29662OooO(interfaceC33723OooO0oO), this);
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
