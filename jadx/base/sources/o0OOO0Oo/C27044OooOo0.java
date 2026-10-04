package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.mapper.PageLayerMapper;
import com.orion.notein.domain.models.page.PageLayer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import o0OOooO.C27875OooO0Oo;
import o0OOooO.C27877OooO0o0;
import o0OOooO.C27879OooO0oo;
import o0o0OoOo.C30741OooOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33734OooOOoo;
import oOo000Oo.C34428OooOOo;
import oo0oO0.AbstractC34903o00o0OoO;

/* JADX INFO: renamed from: o0OOO0Oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27044OooOo0 implements InterfaceC27318Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27040OooOOOo f94169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PageLayerMapper f94170OooO0O0;

    public C27044OooOo0(C27040OooOOOo localDataSource, PageLayerMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(localDataSource, "localDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f94169OooO00o = localDataSource;
        this.f94170OooO0O0 = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final C27043OooOOoo OooO(String noteId) throws Throwable {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        C26454OooO0Oo c26454OooO0Oo = c27040OooOOOo.f94150OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        AbstractC34903o00o0OoO it = c26454OooO0Oo.OooO0o(noteId).OooOooO();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C27033OooO0oo(it, noteId, null));
        return new C27043OooOOoo(new C33734OooOOoo(it.OooOOOo(noteId), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this);
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO00o(List list, String str, com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0o oooO0o) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f94170OooO0O0.toEntity((PageLayer) it.next()));
        }
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27039OooOOOO(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0O0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27038OooOOO0(str2, str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0OO(List list, String str, C27875OooO0Oo c27875OooO0Oo) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f94170OooO0O0.toEntity((PageLayer) it.next()));
        }
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27027OooO0O0(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0Oo(String str, C30741OooOo0 c30741OooOo0) {
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        return c27040OooOOOo.OooO00o(str, new C27029OooO0Oo(2, null));
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0o(Map map, String str, AbstractC32476OooO abstractC32476OooO) {
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27037OooOOO(map, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0o0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f94170OooO0O0.toEntity((PageLayer) it.next()));
        }
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27026OooO00o(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0oO(String str, AbstractC32476OooO abstractC32476OooO) {
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27028OooO0OO(str, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooO0oo(List list, String str, String str2, C27879OooO0oo c27879OooO0oo) {
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str2, new C27035OooOO0O(str, list, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27045OooOo00 c27045OooOo00;
        C27044OooOo0 c27044OooOo0;
        if (abstractC32479OooO0OO instanceof C27045OooOo00) {
            c27045OooOo00 = (C27045OooOo00) abstractC32479OooO0OO;
            int i = c27045OooOo00.f94173OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27045OooOo00.f94173OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27045OooOo00 = new C27045OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27045OooOo00.f94171OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27045OooOo00.f94173OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c27045OooOo00.f94172OooOo0o = this;
            c27045OooOo00.f94173OooOoO = 1;
            C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
            c27040OooOOOo.getClass();
            objOooO00o = c27040OooOOOo.OooO00o(str, new C27025OooO(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27044OooOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27044OooOo0 = c27045OooOo00.f94172OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27044OooOo0.f94170OooO0O0.toPageLayer((PageLayerEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooOO0O(String str, String str2, C27877OooO0o0 c27877OooO0o0) {
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        return c27040OooOOOo.OooO00o(str, new C27031OooO0o0(str2, null));
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final Object OooOO0o(C32465OooO0O0 c32465OooO0O0, String str, C27879OooO0oo c27879OooO0oo) {
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(c32465OooO0O0, 10));
        Iterator<E> it = c32465OooO0O0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f94170OooO0O0.toEntity((PageLayer) it.next()));
        }
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        Object objOooO00o = c27040OooOOOo.OooO00o(str, new C27036OooOO0o(str, arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    public final C27042OooOOo0 OooOOO(String noteId, List ids) throws Throwable {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ids, "ids");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
        c27040OooOOOo.getClass();
        C26454OooO0Oo c26454OooO0Oo = c27040OooOOOo.f94150OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        AbstractC34903o00o0OoO it = c26454OooO0Oo.OooO0o(noteId).OooOooO();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C27030OooO0o(it, noteId, null));
        return new C27042OooOOo0(new C33734OooOOoo(it.OooOOO0(ids), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27318Oooo00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOO0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27041OooOOo c27041OooOOo;
        C27044OooOo0 c27044OooOo0;
        if (abstractC32479OooO0OO instanceof C27041OooOOo) {
            c27041OooOOo = (C27041OooOOo) abstractC32479OooO0OO;
            int i = c27041OooOOo.f94153OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27041OooOOo.f94153OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27041OooOOo = new C27041OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27041OooOOo.f94151OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27041OooOOo.f94153OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c27041OooOOo.f94152OooOo0o = this;
            c27041OooOOo.f94153OooOoO = 1;
            C27040OooOOOo c27040OooOOOo = this.f94169OooO00o;
            c27040OooOOOo.getClass();
            objOooO00o = c27040OooOOOo.OooO00o(str, new C27032OooO0oO(str, list, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27044OooOo0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27044OooOo0 = c27041OooOOo.f94152OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27044OooOo0.f94170OooO0O0.toPageLayer((PageLayerEntity) it.next()));
        }
        return arrayList;
    }
}
