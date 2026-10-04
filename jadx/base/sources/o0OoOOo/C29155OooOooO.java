package o0OoOOo;

import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$moveAudioFile$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1663}, m80625m = "invokeSuspend")
public final class C29155OooOooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.audio.OooO0o f103338OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103339OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f103340OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f103341OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29155OooOooO(com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o, int i, String str, Continuation<? super C29155OooOooO> continuation) {
        super(2, continuation);
        this.f103338OooOo = oooO0o;
        this.f103341OooOoO0 = i;
        this.f103340OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29155OooOooO(this.f103338OooOo, this.f103341OooOoO0, this.f103340OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29155OooOooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103339OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0o = this.f103338OooOo;
            NoteAudioFileIdsField noteAudioFileIdsField = (NoteAudioFileIdsField) oooO0o.f74232OooOOOO.f121747OooOo0o.getValue();
            if (noteAudioFileIdsField == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0OO("moveAudioFile. currentList is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            int i2 = this.f103341OooOoO0;
            if (i2 < 0 || i2 >= noteAudioFileIdsField.getFileIds().size()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o2.OooO0OO("moveAudioFile. newPos is out of range", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            Iterator<T> it = noteAudioFileIdsField.getFileIds().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0((String) next, this.f103340OooOoO)) {
                    break;
                }
            }
            String str = (String) next;
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(noteAudioFileIdsField.getFileIds());
            arrayListO0ooOoO.remove(str);
            arrayListO0ooOoO.add(i2, str);
            NoteAudioFileIdsField noteAudioFileIdsFieldCopy$default = NoteAudioFileIdsField.copy$default(noteAudioFileIdsField, null, null, arrayListO0ooOoO, 3, null);
            String noteId = noteAudioFileIdsField.getNoteId();
            this.f103339OooOo0o = 1;
            Object objOooO = oooO0o.f74223OooO0o.f97084OooO00o.OooO(noteAudioFileIdsFieldCopy$default, noteId, this);
            if (objOooO != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO == enumC32485OooO00o) {
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
