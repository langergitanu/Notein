package o0OO0O0;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$createAudioFile$2", m80623f = "AudioLocalDataSource.kt", m80624l = {70}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92200OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92201OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AudioFileEntity f92202OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(AudioFileEntity audioFileEntity, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f92202OooOoO0 = audioFileEntity;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0OO oooO0OO = new OooO0OO(this.f92202OooOoO0, continuation);
        oooO0OO.f92200OooOo = obj;
        return oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92201OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oo0oO0.OooOo00 oooOo00 = (oo0oO0.OooOo00) this.f92200OooOo;
            AudioFileEntity[] audioFileEntityArr = {this.f92202OooOoO0};
            this.f92201OooOo0o = 1;
            if (oooOo00.OooOOOO(audioFileEntityArr, this) == enumC32485OooO00o) {
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
