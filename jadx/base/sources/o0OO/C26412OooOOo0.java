package o0OO;

import com.orion.notein.data.p602db.entity.NoteContentEntity;
import com.orion.notein.data.p602db.entity.UpdateZoomEntity;
import com.orion.notein.domain.mapper.NoteContentMapper;
import com.orion.notein.domain.models.note.NoteContent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0o.C27440o000oooO;
import o0OOo0o.C27479o00Oo0O;
import o0OOo0o.o00O000o;
import o0OoO0oo.C28905o00o;
import o0OoO0oo.C28967o00oo000;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.o00O0O00;

/* JADX INFO: renamed from: o0OO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26412OooOOo0 implements InterfaceC27309OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f90678OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteContentMapper f90679OooO0O0;

    /* JADX INFO: renamed from: o0OO.OooOOo0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NoteContentRepoImpl", m80623f = "NoteContentRepoImpl.kt", m80624l = {41}, m80625m = "getNoteContentByIdSync")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f90680OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C26412OooOOo0 f90681OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f90682OooOoO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f90680OooOo = obj;
            this.f90682OooOoO |= Integer.MIN_VALUE;
            return C26412OooOOo0.this.OooOO0o(null, this);
        }
    }

    public C26412OooOOo0(OooOOO localDataSource, NoteContentMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f90678OooO00o = localDataSource;
        this.f90679OooO0O0 = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO(String str, o00O000o o00o000o2) {
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(str, new OooO0O0(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final C26410OooOOOo OooO00o(String id) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        C26454OooO0Oo c26454OooO0Oo = oooOOO.f90661OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(id);
        o00O0O00 dao = c26454OooO0Oo.OooO0o(id).OooOoOO();
        kotlin.jvm.internal.OooOOO0.OooO0oO(dao, "dao");
        return new C26410OooOOOo(new C33734OooOOoo(dao.OooO00o(id), new C26466OooO0o0(c26454OooO0Oo, id, null)), this, 0);
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(str, new OooOOO0(str2, str, null));
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO0OO(String str, float f, float f2, C28905o00o c28905o00o) {
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(str, new C26409OooOO0o(f, f2, str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO0Oo(NoteContent noteContent, C27440o000oooO c27440o000oooO) {
        NoteContentEntity entity = this.f90679OooO0O0.toEntity(noteContent);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(entity);
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(entity.getId(), new o0OO.OooO00o(entity, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO0o(String str, AbstractC32476OooO abstractC32476OooO) {
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(str, new OooO(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO0o0(String str, float f, C28967o00oo000 c28967o00oo000) {
        UpdateZoomEntity updateZoomEntity = new UpdateZoomEntity(str, f);
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(updateZoomEntity.getId(), new OooOO0(updateZoomEntity, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooO0oO(NoteContent noteContent, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        NoteContentEntity entity = this.f90679OooO0O0.toEntity(noteContent);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(entity);
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(entity.getId(), new C26408OooO0oo(entity, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oo(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26411OooOOo c26411OooOOo;
        C26412OooOOo0 c26412OooOOo0;
        if (abstractC32479OooO0OO instanceof C26411OooOOo) {
            c26411OooOOo = (C26411OooOOo) abstractC32479OooO0OO;
            int i = c26411OooOOo.f90676OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26411OooOOo.f90676OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26411OooOOo = new C26411OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26411OooOOo.f90674OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26411OooOOo.f90676OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26411OooOOo.f90675OooOo0o = this;
            c26411OooOOo.f90676OooOoO = 1;
            objOooO00o = this.f90678OooO00o.OooO00o(list, c26411OooOOo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26412OooOOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26412OooOOo0 = c26411OooOOo.f90675OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26412OooOOo0.f90679OooO0O0.toModel((NoteContentEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooOO0(String str, int i, C27479o00Oo0O c27479o00Oo0O) {
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        Object objOooO0O0 = oooOOO.OooO0O0(str, new OooOO0O(str, i, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    public final Object OooOO0O(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO = this.f90678OooO00o;
        oooOOO.getClass();
        return oooOOO.OooO0O0(str, new OooO0OO(str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27309OooOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(String str, Continuation<? super NoteContent> continuation) {
        OooO00o oooO00o;
        C26412OooOOo0 c26412OooOOo0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f90682OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f90682OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooO0O0 = oooO00o.f90680OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f90682OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooO00o.f90681OooOo0o = this;
            oooO00o.f90682OooOoO = 1;
            OooOOO oooOOO = this.f90678OooO00o;
            oooOOO.getClass();
            objOooO0O0 = oooOOO.OooO0O0(str, new C26405OooO0Oo(str, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26412OooOOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26412OooOOo0 = oooO00o.f90681OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        NoteContentEntity noteContentEntity = (NoteContentEntity) objOooO0O0;
        if (noteContentEntity != null) {
            return c26412OooOOo0.f90679OooO0O0.toModel(noteContentEntity);
        }
        return null;
    }
}
