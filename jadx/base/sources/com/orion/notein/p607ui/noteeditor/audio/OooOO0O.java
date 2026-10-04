package com.orion.notein.p607ui.noteeditor.audio;

import androidx.core.view.PointerIconCompat;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.audio.OooO0o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$saveAudioFileOnStartRecording$result$1", m80623f = "NoteAudioViewModel.kt", m80624l = {PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW}, m80625m = "invokeSuspend")
public final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AudioFile>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f74415OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AudioFile f74416OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f74417OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f74418OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f74419OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooO0o oooO0o, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f74418OooOoO0 = oooO0o;
        this.f74417OooOoO = str;
        this.f74419OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0O(this.f74418OooOoO0, this.f74417OooOoO, this.f74419OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AudioFile> continuation) {
        return ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74415OooOo;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AudioFile audioFile = this.f74416OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return audioFile;
        }
        C32446OooOOOo.OooO0O0(obj);
        AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
        OooO0o oooO0o = this.f74418OooOoO0;
        oooO0o.getClass();
        String strOooO0o = C32501OooO0oO.OooO0o(new File(this.f74417OooOoO));
        Iterable iterable = (Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((OooO0o.OooO0O0) it.next()).f74277OooO00o.getAudioName());
        }
        Set setO0OO00O = OooOo.o0OO00O(arrayList);
        String string = oooO0o.f74222OooO0Oo.getString(R.string.default_audio_file_name_prefix);
        OooOOO0.OooO0o(string, "getString(...)");
        int i2 = 1;
        while (true) {
            if (i2 >= 100) {
                str = "";
                break;
            }
            str = string + " " + i2;
            if (!setO0OO00O.contains(str)) {
                break;
            }
            i2++;
        }
        AudioFile audioFile2 = new AudioFile(strOooO0o, this.f74417OooOoO, str.length() == 0 ? string : str, -1L, 1.0f, System.currentTimeMillis(), System.currentTimeMillis());
        this.f74416OooOo0o = audioFile2;
        this.f74415OooOo = 1;
        return oooO0o.OooOoo0(audioFile2, this.f74419OooOoOO, this) == enumC32485OooO00o ? enumC32485OooO00o : audioFile2;
    }
}
