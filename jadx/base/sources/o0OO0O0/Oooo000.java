package o0OO0O0;

import com.orion.notein.data.p602db.entity.AudioFileEntity;
import com.orion.notein.data.p602db.entity.AudioSyncRecordEntity;
import com.orion.notein.data.p602db.entity.NoteAudioFileIdsFieldEntity;
import com.orion.notein.domain.mapper.AudioMapper;
import com.orion.notein.domain.models.note.AudioFile;
import com.orion.notein.domain.models.note.AudioSyncRecord;
import com.orion.notein.domain.models.note.NoteAudioFileIdsField;
import com.orion.notein.p607ui.noteeditor.audio.C23419OooO0oO;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26265OooOOOO;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OOo0Oo.InterfaceC27292OooO0oO;
import o0OOo0o.o00O00O;
import o0OOo0oO.C27606OooO00o;
import o0OOo0oO.C27607OooO0O0;
import o0OoOOo.C29164Oooo0oO;
import o0OoOOo.C29176Ooooo00;
import o0OoOOo.C29178OooooO0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33734OooOOoo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class Oooo000 implements InterfaceC27292OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26265OooOOOO f92297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AudioMapper f92298OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f92299OooO0OO;

    public Oooo000(C26265OooOOOO c26265OooOOOO, AudioMapper mapper, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f92297OooO00o = c26265OooOOOO;
        this.f92298OooO0O0 = mapper;
        this.f92299OooO0OO = abstractApplicationC26277OooOoOO;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooO(NoteAudioFileIdsField noteAudioFileIdsField, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        NoteAudioFileIdsFieldEntity entity = this.f92298OooO0O0.toEntity(noteAudioFileIdsField);
        kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new C26695OooO0o0(entity, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26706OooOoO c26706OooOoO;
        Oooo000 oooo000;
        if (abstractC32479OooO0OO instanceof C26706OooOoO) {
            c26706OooOoO = (C26706OooOoO) abstractC32479OooO0OO;
            int i = c26706OooOoO.f92270OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26706OooOoO.f92270OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26706OooOoO = new C26706OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26706OooOoO.f92268OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26706OooOoO.f92270OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26706OooOoO.f92269OooOo0o = this;
            c26706OooOoO.f92270OooOoO = 1;
            objOooO00o = this.f92297OooO00o.OooO00o(str, new OooOO0(2, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooo000 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooo000 = c26706OooOoO.f92269OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oooo000.f92298OooO0O0.toModel((AudioFileEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooO0O0(AudioFile audioFile, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        AudioFileEntity entity = this.f92298OooO0O0.toEntity(audioFile);
        kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new C26699OooOOOo(entity, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooO0OO(Set set, String str, C23419OooO0oO c23419OooO0oO) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new C26696OooO0oO(set, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final C26711OooOooO OooO0Oo(String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C26454OooO0Oo c26454OooO0Oo = (C26454OooO0Oo) this.f92297OooO00o.f89722OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        oo0oO0.OooOo00 it = c26454OooO0Oo.OooO0o(noteId).OooOo0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return new C26711OooOooO(new C33734OooOOoo(it.OooOOO0(noteId), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this);
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooO0o(AudioFile audioFile, String str, C27606OooO00o c27606OooO00o) {
        AudioFileEntity entity = this.f92298OooO0O0.toEntity(audioFile);
        kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new OooO0OO(entity, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooO0o0(Set set, String str, C29176Ooooo00 c29176Ooooo00) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new OooOOO(set, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(File file, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo00 oooOo00;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i = oooOo00.f92254OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f92254OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOo00.f92253OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo00.f92254OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C26703OooOo0 c26703OooOo0 = new C26703OooOo0(this, str2, str, file, null);
            oooOo00.f92254OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c26703OooOo0, oooOo00);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooO0oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new C26700OooOOo(str2, str, null));
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOO0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f92298OooO0O0.toEntity((AudioFile) it.next()));
        }
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new C26701OooOOo0(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOO0O(ArrayList arrayList, String str, C29176Ooooo00 c29176Ooooo00) {
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.f92298OooO0O0.toEntity((AudioSyncRecord) it.next()));
        }
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new C26694OooO0Oo(arrayList2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0o(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26709OooOoo c26709OooOoo;
        Oooo000 oooo000;
        if (abstractC32479OooO0OO instanceof C26709OooOoo) {
            c26709OooOoo = (C26709OooOoo) abstractC32479OooO0OO;
            int i = c26709OooOoo.f92281OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26709OooOoo.f92281OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26709OooOoo = new C26709OooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26709OooOoo.f92279OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26709OooOoo.f92281OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26709OooOoo.f92280OooOo0o = this;
            c26709OooOoo.f92281OooOoO = 1;
            objOooO00o = this.f92297OooO00o.OooO00o(str, new OooOO0O(set, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooo000 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooo000 = c26709OooOoo.f92280OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oooo000.f92298OooO0O0.toModel((AudioSyncRecordEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOOO(Set set, String str, C29176Ooooo00 c29176Ooooo00) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new OooO00o(set, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26712OooOooo c26712OooOooo;
        Oooo000 oooo000;
        if (abstractC32479OooO0OO instanceof C26712OooOooo) {
            c26712OooOooo = (C26712OooOooo) abstractC32479OooO0OO;
            int i = c26712OooOooo.f92295OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26712OooOooo.f92295OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26712OooOooo = new C26712OooOooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26712OooOooo.f92293OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26712OooOooo.f92295OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26712OooOooo.f92294OooOo0o = this;
            c26712OooOooo.f92295OooOoO = 1;
            objOooO00o = this.f92297OooO00o.OooO00o(str, new C26698OooOO0o(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooo000 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooo000 = c26712OooOooo.f92294OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        NoteAudioFileIdsFieldEntity noteAudioFileIdsFieldEntity = (NoteAudioFileIdsFieldEntity) objOooO00o;
        if (noteAudioFileIdsFieldEntity != null) {
            return oooo000.f92298OooO0O0.toModel(noteAudioFileIdsFieldEntity);
        }
        return null;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOOOO(Map map, String str, C29178OooooO0 c29178OooooO0) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new OooOOOO(map, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26707OooOoO0(this, str, null), abstractC32479OooO0OO);
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final C26710OooOoo0 OooOOo(String str, String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C26454OooO0Oo c26454OooO0Oo = (C26454OooO0Oo) this.f92297OooO00o.f89722OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        oo0oO0.OooOo00 it = c26454OooO0Oo.OooO0o(noteId).OooOo0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return new C26710OooOoo0(new C33734OooOOoo(it.OooOO0O(str), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this, 0);
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOOo0(String str, C29164Oooo0oO.OooO00o oooO00o) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new OooO0O0(2, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOOoo(String str, o00O00O o00o00o2) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26702OooOOoo(this, str, null), o00o00o2);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOo0(Set set, String str, C27607OooO0O0 c27607OooO0O0) {
        Object objOooO00o = this.f92297OooO00o.OooO00o(str, new OooO0o(set, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo00(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26704OooOo0O c26704OooOo0O;
        Oooo000 oooo000;
        if (abstractC32479OooO0OO instanceof C26704OooOo0O) {
            c26704OooOo0O = (C26704OooOo0O) abstractC32479OooO0OO;
            int i = c26704OooOo0O.f92257OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26704OooOo0O.f92257OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26704OooOo0O = new C26704OooOo0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26704OooOo0O.f92255OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26704OooOo0O.f92257OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26704OooOo0O.f92256OooOo0o = this;
            c26704OooOo0O.f92257OooOoO = 1;
            objOooO00o = this.f92297OooO00o.OooO00o(str2, new OooO(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooo000 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooo000 = c26704OooOo0O.f92256OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        AudioFileEntity audioFileEntity = (AudioFileEntity) objOooO00o;
        if (audioFileEntity != null) {
            return oooo000.f92298OooO0O0.toModel(audioFileEntity);
        }
        return null;
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final Object OooOo0O(Set set, String str, C29176Ooooo00 c29176Ooooo00) {
        return this.f92297OooO00o.OooO00o(str, new C26697OooO0oo(set, null));
    }

    @Override // o0OOo0Oo.InterfaceC27292OooO0oO
    public final C26705OooOo0o OooOo0o(String str, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList.add(new C32443OooOOO((String) obj, Integer.valueOf(i)));
            i = i2;
        }
        Map mapOooOO0o = C34444Oooo0O0.OooOO0o(arrayList);
        C26454OooO0Oo c26454OooO0Oo = (C26454OooO0Oo) this.f92297OooO00o.f89722OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(str);
        oo0oO0.OooOo00 it = c26454OooO0Oo.OooO0o(str).OooOo0();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return new C26705OooOo0o(new C33734OooOOoo(it.OooO(list), new C26466OooO0o0(c26454OooO0Oo, str, null)), this, mapOooOO0o);
    }
}
