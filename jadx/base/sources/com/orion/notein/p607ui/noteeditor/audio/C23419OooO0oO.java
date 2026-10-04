package com.orion.notein.p607ui.noteeditor.audio;

import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import com.orion.notein.p607ui.noteeditor.audio.OooO0O0;
import com.orion.notein.p607ui.noteeditor.audio.OooO0o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOo0oO.C27610OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$deleteSelectedAudioFiles$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1426, 1439, 1446, 1451}, m80625m = "invokeSuspend")
public final class C23419OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f74399OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f74400OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f74401OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Set f74402OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Set<String> f74403OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f74404OooOoo0;

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.audio.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.NoteAudioViewModel$deleteSelectedAudioFiles$1$1", m80623f = "NoteAudioViewModel.kt", m80624l = {1427}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f74405OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74406OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o oooO0o, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f74405OooOo = oooO0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f74405OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74406OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                OooO0O0.OooOO0 oooOO02 = new OooO0O0.OooOO0();
                this.f74406OooOo0o = 1;
                AbstractC24338OooO0o0.OooO00o<Float> oooO00o = OooO0o.f74218OoooO0O;
                if (this.f74405OooOo.OooOOOo(oooOO02) == enumC32485OooO00o) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23419OooO0oO(Set<String> set, OooO0o oooO0o, Continuation<? super C23419OooO0oO> continuation) {
        super(2, continuation);
        this.f74403OooOoOO = set;
        this.f74404OooOoo0 = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23419OooO0oO(this.f74403OooOoOO, this.f74404OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23419OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r11.Oooo0o(r12, r18) == r1) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6 A[LOOP:2: B:35:0x00e0->B:37:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[LOOP:3: B:39:0x00ff->B:41:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Iterator it;
        Iterator it2;
        Set setO0OO00O;
        String str2;
        Set set;
        List list;
        NoteAudioFileIdsField noteAudioFileIdsField;
        String str3;
        List list2;
        Object objOooO0OO;
        List list3;
        List list4;
        Iterator it3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74401OooOoO;
        Set<String> set2 = this.f74403OooOoOO;
        OooO0o oooO0o = this.f74404OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (set2.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o.OooO0o0("deleteSelectedAudioFiles. selectedFileIds is empty", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            str = (String) oooO0o.f74230OooOOO.getValue();
            if (str == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (OooOo.Oooo00o(set2, oooO0o.f74235OooOOo0.getValue())) {
                OooO00o oooO00o = new OooO00o(oooO0o, null);
                this.f74400OooOo0o = str;
                this.f74401OooOoO = 1;
            } else {
                Iterable iterable = (Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (set2.contains(((OooO0o.OooO0O0) obj2).f74277OooO00o.getId())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((OooO0o.OooO0O0) it.next()).f74277OooO00o);
                }
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((AudioFile) it2.next()).getId());
                }
                setO0OO00O = OooOo.o0OO00O(arrayList3);
                this.f74400OooOo0o = str;
                this.f74399OooOo = arrayList2;
                this.f74402OooOoO0 = setO0OO00O;
                this.f74401OooOoO = 2;
                if (oooO0o.f74223OooO0o.OooO0O0(str, setO0OO00O, this) != enumC32485OooO00o) {
                    str2 = str;
                    set = setO0OO00O;
                    list = arrayList2;
                    noteAudioFileIdsField = (NoteAudioFileIdsField) oooO0o.f74232OooOOOO.f121747OooOo0o.getValue();
                    if (noteAudioFileIdsField != null) {
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list5 = (List) this.f74400OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    list3 = list5;
                    it3 = list3.iterator();
                    while (it3.hasNext()) {
                        File file = new File(((AudioFile) it3.next()).getFilePath());
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                set = this.f74402OooOoO0;
                List list6 = this.f74399OooOo;
                str3 = (String) this.f74400OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                list4 = list6;
                str2 = str3;
                list2 = list4;
                C27610OooO0o0 c27610OooO0o0 = oooO0o.f74223OooO0o;
                this.f74400OooOo0o = list2;
                this.f74399OooOo = null;
                this.f74402OooOoO0 = null;
                this.f74401OooOoO = 4;
                objOooO0OO = c27610OooO0o0.f97084OooO00o.OooO0OO(set, str2, this);
                if (objOooO0OO != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0OO = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0OO != enumC32485OooO00o) {
                    list3 = list2;
                    it3 = list3.iterator();
                    while (it3.hasNext()) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            }
            set = this.f74402OooOoO0;
            List list7 = this.f74399OooOo;
            str2 = (String) this.f74400OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list = list7;
            noteAudioFileIdsField = (NoteAudioFileIdsField) oooO0o.f74232OooOOOO.f121747OooOo0o.getValue();
            if (noteAudioFileIdsField != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("MediaToolbarViewModel");
                c20358OooO00o2.OooO0OO("deleteSelectedAudioFiles. currentAudioFileIdsField is null", new Object[0]);
                list2 = list;
                C27610OooO0o0 c27610OooO0o02 = oooO0o.f74223OooO0o;
                this.f74400OooOo0o = list2;
                this.f74399OooOo = null;
                this.f74402OooOoO0 = null;
                this.f74401OooOoO = 4;
                objOooO0OO = c27610OooO0o02.f97084OooO00o.OooO0OO(set, str2, this);
                if (objOooO0OO != EnumC32485OooO00o.f116726OooOo0o) {
                }
                if (objOooO0OO != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            NoteAudioFileIdsField noteAudioFileIdsFieldCopy$default = NoteAudioFileIdsField.copy$default(noteAudioFileIdsField, null, null, OooOo.Ooooo00(noteAudioFileIdsField.getFileIds(), set), 3, null);
            this.f74400OooOo0o = str2;
            this.f74399OooOo = list;
            this.f74402OooOoO0 = set;
            this.f74401OooOoO = 3;
            Object objOooO = oooO0o.f74223OooO0o.f97084OooO00o.OooO(noteAudioFileIdsFieldCopy$default, str2, this);
            if (objOooO != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO != enumC32485OooO00o) {
                str3 = str2;
                list4 = list;
                str2 = str3;
                list2 = list4;
                C27610OooO0o0 c27610OooO0o022 = oooO0o.f74223OooO0o;
                this.f74400OooOo0o = list2;
                this.f74399OooOo = null;
                this.f74402OooOoO0 = null;
                this.f74401OooOoO = 4;
                objOooO0OO = c27610OooO0o022.f97084OooO00o.OooO0OO(set, str2, this);
                if (objOooO0OO != EnumC32485OooO00o.f116726OooOo0o) {
                }
                if (objOooO0OO != enumC32485OooO00o) {
                }
            }
            return enumC32485OooO00o;
        }
        str = (String) this.f74400OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        oooO0o.f74235OooOOo0.setValue(null);
        Iterable iterable2 = (Iterable) oooO0o.f74233OooOOOo.f121747OooOo0o.getValue();
        ArrayList arrayList4 = new ArrayList();
        while (r9.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
        it = arrayList4.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayList22, 10));
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        setO0OO00O = OooOo.o0OO00O(arrayList32);
        this.f74400OooOo0o = str;
        this.f74399OooOo = arrayList22;
        this.f74402OooOoO0 = setO0OO00O;
        this.f74401OooOoO = 2;
        if (oooO0o.f74223OooO0o.OooO0O0(str, setO0OO00O, this) != enumC32485OooO00o) {
        }
        return enumC32485OooO00o;
    }
}
