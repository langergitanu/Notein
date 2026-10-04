package o0OoOOo;

import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import kotlin.coroutines.Continuation;
import o0OOo0oO.C27610OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$activateLatestAudioFile$1", m80623f = "NoteAudioViewModel.kt", m80624l = {439, 446}, m80625m = "invokeSuspend")
public final class C29150OooOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f103315OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f103316OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103317OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29150OooOoO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, Continuation<? super C29150OooOoO> continuation) {
        super(2, continuation);
        this.f103317OooOoO0 = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29150OooOoO(this.f103317OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29150OooOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103315OooOo;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103317OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str = (String) oooO0o.f74230OooOOO.getValue();
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            this.f103316OooOo0o = str;
            this.f103315OooOo = 1;
            obj = oooO0o.f74223OooO0o.f97084OooO00o.OooOOO0(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f103316OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (((AudioFile) obj) == null) {
                oooO0o.f74235OooOOo0.setValue(str2);
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "MediaToolbarViewModel", "activateLatestAudioFile. audioFile is null. latestAudioFileId: ", str2), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        str = this.f103316OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteAudioFileIdsField noteAudioFileIdsField = (NoteAudioFileIdsField) obj;
        if (noteAudioFileIdsField == null || noteAudioFileIdsField.getFileIds().isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooO0OO(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "MediaToolbarViewModel", "activateLatestAudioFile. audioFileListField is null. ", str), new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        String str3 = (String) oOo000Oo.OooOo.Oooo0oO(noteAudioFileIdsField.getFileIds());
        C27610OooO0o0 c27610OooO0o0 = oooO0o.f74223OooO0o;
        this.f103316OooOo0o = str3;
        this.f103315OooOo = 2;
        Object objOooOo00 = c27610OooO0o0.f97084OooO00o.OooOo00(str3, str, this);
        if (objOooOo00 != enumC32485OooO00o) {
            str2 = str3;
            obj = objOooOo00;
            if (((AudioFile) obj) == null) {
            }
        }
        return enumC32485OooO00o;
    }
}
