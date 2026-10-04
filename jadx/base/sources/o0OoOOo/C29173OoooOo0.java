package o0OoOOo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.AudioFile;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0oO.C27610OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$updateAudioDurationOnStopRecording$result$1", m80623f = "NoteAudioViewModel.kt", m80624l = {EditingLanguage.ICELANDIC, EditingLanguage.ROMANSH}, m80625m = "invokeSuspend")
public final class C29173OoooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AudioFile>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103443OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f103444OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103445OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f103446OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f103447OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ long f103448OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f103449OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29173OoooOo0(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, String str2, long j, Continuation<? super C29173OoooOo0> continuation) {
        super(2, continuation);
        this.f103445OooOoO = oooO0o;
        this.f103447OooOoOO = str;
        this.f103449OooOoo0 = str2;
        this.f103448OooOoo = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29173OoooOo0 c29173OoooOo0 = new C29173OoooOo0(this.f103445OooOoO, this.f103447OooOoOO, this.f103449OooOoo0, this.f103448OooOoo, continuation);
        c29173OoooOo0.f103446OooOoO0 = obj;
        return c29173OoooOo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AudioFile> continuation) {
        return ((C29173OoooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String strOooO0o;
        Object objOooOo00;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103443OooOo;
        String str = this.f103449OooOoo0;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103445OooOoO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f103446OooOoO0;
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
            oooO0o.getClass();
            strOooO0o = C32501OooO0oO.OooO0o(new File(this.f103447OooOoOO));
            this.f103446OooOoO0 = interfaceC33636Oooo00o;
            this.f103444OooOo0o = strOooO0o;
            this.f103443OooOo = 1;
            objOooOo00 = oooO0o.f74223OooO0o.f97084OooO00o.OooOo00(strOooO0o, str, this);
            if (objOooOo00 != enumC32485OooO00o) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AudioFile audioFile = (AudioFile) this.f103446OooOoO0;
            C32446OooOOOo.OooO0O0(obj);
            return audioFile;
        }
        String str2 = this.f103444OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        strOooO0o = str2;
        objOooOo00 = obj;
        AudioFile audioFile2 = (AudioFile) objOooOo00;
        if (audioFile2 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "MediaToolbarViewModel", "updateAudioDurationOnStopRecording. audioFile is null. ", strOooO0o), new Object[0]);
            return null;
        }
        AudioFile audioFileCopy$default = AudioFile.copy$default(audioFile2, null, null, null, this.f103448OooOoo, 0.0f, 0L, 0L, 119, null);
        C27610OooO0o0 c27610OooO0o0 = oooO0o.f74223OooO0o;
        this.f103446OooOoO0 = audioFileCopy$default;
        this.f103444OooOo0o = null;
        this.f103443OooOo = 2;
        return c27610OooO0o0.OooO0OO(audioFileCopy$default, str, this) == enumC32485OooO00o ? enumC32485OooO00o : audioFileCopy$default;
    }
}
