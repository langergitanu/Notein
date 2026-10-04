package o0OoOOo;

import android.media.MediaMetadataRetriever;
import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.note.AudioFile;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0OOo0oO.C27610OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$updatePendingDurations$2", m80623f = "NoteAudioViewModel.kt", m80624l = {EditingLanguage.INDONESIAN, EditingLanguage.SUTU}, m80625m = "invokeSuspend")
public final class C29179OooooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f103478OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.audio.OooO0o f103479OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f103480OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f103481OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103482OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f103483OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29179OooooOO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, String str, Continuation<? super C29179OooooOO> continuation) {
        super(2, continuation);
        this.f103482OooOoOO = oooO0o;
        this.f103483OooOoo0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29179OooooOO(this.f103482OooOoOO, this.f103483OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29179OooooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r2 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        Iterator it;
        Long lOooOOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103480OooOoO;
        String str = this.f103483OooOoo0;
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103482OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27610OooO0o0 c27610OooO0o0 = oooO0o.f74223OooO0o;
            this.f103480OooOoO = 1;
            objOooO00o = c27610OooO0o0.f97084OooO00o.OooO00o(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f103481OooOoO0;
                str = this.f103478OooOo;
                oooO0o = this.f103479OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                while (it.hasNext()) {
                    AudioFile audioFile = (AudioFile) it.next();
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(audioFile.getFilePath());
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (strExtractMetadata != null && (lOooOOO = C33596OooOOo0.OooOOO(strExtractMetadata)) != null) {
                        AudioFile audioFileCopy$default = AudioFile.copy$default(audioFile, null, null, null, lOooOOO.longValue(), 0.0f, 0L, 0L, 119, null);
                        C27610OooO0o0 c27610OooO0o02 = oooO0o.f74223OooO0o;
                        this.f103479OooOo0o = oooO0o;
                        this.f103478OooOo = str;
                        this.f103481OooOoO0 = it;
                        this.f103480OooOoO = 2;
                        if (c27610OooO0o02.OooO0OO(audioFileCopy$default, str, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            objOooO00o = obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objOooO00o) {
            if (((AudioFile) obj2).getDuration() == -1) {
                arrayList.add(obj2);
            }
        }
        C34406OooO00o.f123390OooO00o.OooO00o("updatePendingDurations. audioFileList: " + arrayList, new Object[0]);
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
