package o0OO0O0;

import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO0O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$updateNoteAudioFileIdsFieldOldNoteId$2", m80623f = "AudioLocalDataSource.kt", m80624l = {181, 183}, m80625m = "invokeSuspend")
public final class C26700OooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f92236OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92237OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f92238OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f92239OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26700OooOOo(String str, String str2, Continuation<? super C26700OooOOo> continuation) {
        super(2, continuation);
        this.f92239OooOoO0 = str;
        this.f92238OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26700OooOOo c26700OooOOo = new C26700OooOOo(this.f92239OooOoO0, this.f92238OooOoO, continuation);
        c26700OooOOo.f92236OooOo = obj;
        return c26700OooOOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super C32460OooOooO> continuation) {
        return ((C26700OooOOo) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r1.OooOOOo(r3, r9) == r0) goto L17;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oo0oO0.OooOo00 oooOo00;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92237OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooOo00 = (oo0oO0.OooOo00) this.f92236OooOo;
            this.f92236OooOo = oooOo00;
            this.f92237OooOo0o = 1;
            obj = oooOo00.OooOOO(this.f92239OooOoO0, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        oooOo00 = (oo0oO0.OooOo00) this.f92236OooOo;
        C32446OooOOOo.OooO0O0(obj);
        NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity = (NoteAudioFileIdsFieldEntity) obj;
        if (noteAudioFileIdsFieldEntity == null) {
            return null;
        }
        NoteAudioFileIdsFieldEntity[] noteAudioFileIdsFieldEntityArr = {NoteAudioFileIdsFieldEntity.copy$default(noteAudioFileIdsFieldEntity, null, this.f92238OooOoO, null, 5, null)};
        this.f92236OooOo = null;
        this.f92237OooOo0o = 2;
    }
}
