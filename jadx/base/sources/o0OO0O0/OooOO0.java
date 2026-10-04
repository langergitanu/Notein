package o0OO0O0;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$getAudioFilesByNoteIdSync$2", m80623f = "AudioLocalDataSource.kt", m80624l = {76}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super List<? extends AudioFileEntity>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92218OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92219OooOo0o;

    public OooOO0() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooOO0 oooOO02 = new OooOO0(2, continuation);
        oooOO02.f92218OooOo = obj;
        return oooOO02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super List<? extends AudioFileEntity>> continuation) {
        return ((OooOO0) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92219OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        oo0oO0.OooOo00 oooOo00 = (oo0oO0.OooOo00) this.f92218OooOo;
        this.f92219OooOo0o = 1;
        Object objOooOO0 = oooOo00.OooOO0(this);
        return objOooOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOO0;
    }
}
