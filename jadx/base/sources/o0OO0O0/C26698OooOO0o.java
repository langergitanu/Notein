package o0OO0O0;

import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO0O0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$getNoteAudioFileIdsSync$2", m80623f = "AudioLocalDataSource.kt", m80624l = {154}, m80625m = "invokeSuspend")
public final class C26698OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super NoteAudioFileIdsFieldEntity>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92222OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92223OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92224OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26698OooOO0o(String str, Continuation<? super C26698OooOO0o> continuation) {
        super(2, continuation);
        this.f92224OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26698OooOO0o c26698OooOO0o = new C26698OooOO0o(this.f92224OooOoO0, continuation);
        c26698OooOO0o.f92222OooOo = obj;
        return c26698OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super NoteAudioFileIdsFieldEntity> continuation) {
        return ((C26698OooOO0o) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92223OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        oo0oO0.OooOo00 oooOo00 = (oo0oO0.OooOo00) this.f92222OooOo;
        this.f92223OooOo0o = 1;
        Object objOooOOO = oooOo00.OooOOO(this.f92224OooOoO0, this);
        return objOooOOO == enumC32485OooO00o ? enumC32485OooO00o : objOooOOO;
    }
}
