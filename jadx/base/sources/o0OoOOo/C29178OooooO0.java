package o0OoOOo;

import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOOo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$updateAudioSyncRecordDisplayItemId$runnable$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1171}, m80625m = "invokeSuspend")
public final class C29178OooooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103474OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103475OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f103476OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f103477OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29178OooooO0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, Map<String, String> map, Continuation<? super C29178OooooO0> continuation) {
        super(2, continuation);
        this.f103474OooOo = oooO0o;
        this.f103477OooOoO0 = str;
        this.f103476OooOoO = map;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29178OooooO0(this.f103474OooOo, this.f103477OooOoO0, this.f103476OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29178OooooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103475OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f103475OooOo0o = 1;
            Object objOooOOOO = this.f103474OooOo.f74223OooO0o.f97084OooO00o.OooOOOO(this.f103476OooOoO, this.f103477OooOoO0, this);
            if (objOooOOOO != enumC32485OooO00o) {
                objOooOOOO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOOOO != enumC32485OooO00o) {
                objOooOOOO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOOOO == enumC32485OooO00o) {
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
