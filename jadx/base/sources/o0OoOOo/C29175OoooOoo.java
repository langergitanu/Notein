package o0OoOOo;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoOOo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$updateAudioSyncRecordByDisplayItems$runnable$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1191}, m80625m = "invokeSuspend")
public final class C29175OoooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103455OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103456OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC31284OooO0O0> f103457OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f103458OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC31284OooO0O0> f103459OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ long f103460OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29175OoooOoo(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, List<? extends InterfaceC31284OooO0O0> list, List<? extends InterfaceC31284OooO0O0> list2, long j, Continuation<? super C29175OoooOoo> continuation) {
        super(2, continuation);
        this.f103455OooOo = oooO0o;
        this.f103458OooOoO0 = str;
        this.f103457OooOoO = list;
        this.f103459OooOoOO = list2;
        this.f103460OooOoo0 = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29175OoooOoo(this.f103455OooOo, this.f103458OooOoO0, this.f103457OooOoO, this.f103459OooOoOO, this.f103460OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29175OoooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103456OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f103456OooOo0o = 1;
            if (com.orion.notein.p607ui.noteeditor.audio.OooO0o.OooOO0O(this.f103455OooOo, this.f103458OooOoO0, this.f103457OooOoO, this.f103459OooOoOO, this.f103460OooOoo0, this) == enumC32485OooO00o) {
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
