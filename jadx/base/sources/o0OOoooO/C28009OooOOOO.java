package o0OOoooO;

import com.orion.notein.data.p602db.entity.FolderEntity;
import com.orion.notein.domain.mapper.FolderMapper;
import com.orion.notein.domain.models.folder.Folder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o000oo0o.C24718OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o0OOOO0o.C27129OoooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oo0oO0.o00000O0;

/* JADX INFO: renamed from: o0OOoooO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28009OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0 f99335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FolderMapper f99336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27129OoooOOO f99337OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27996OooO00o f99338OooO0Oo;

    public C28009OooOOOO(o00000O0 folderDao, FolderMapper mapper, C27129OoooOOO c27129OoooOOO, C27996OooO00o folderLocalDataSource) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderDao, "folderDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(folderLocalDataSource, "folderLocalDataSource");
        this.f99335OooO00o = folderDao;
        this.f99336OooO0O0 = mapper;
        this.f99337OooO0OO = c27129OoooOOO;
        this.f99338OooO0Oo = folderLocalDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28008OooOOO0 c28008OooOOO0;
        C28009OooOOOO c28009OooOOOO;
        if (abstractC32479OooO0OO instanceof C28008OooOOO0) {
            c28008OooOOO0 = (C28008OooOOO0) abstractC32479OooO0OO;
            int i = c28008OooOOO0.f99333OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28008OooOOO0.f99333OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28008OooOOO0 = new C28008OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOo = c28008OooOOO0.f99331OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28008OooOOO0.f99333OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOOo);
            c28008OooOOO0.f99332OooOo0o = this;
            c28008OooOOO0.f99333OooOoO = 1;
            objOooOOOo = this.f99335OooO00o.OooOOOo(c28008OooOOO0);
            if (objOooOOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28009OooOOOO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28009OooOOOO = c28008OooOOO0.f99332OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOOo);
        }
        Iterable iterable = (Iterable) objOooOOOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c28009OooOOOO.f99336OooO0O0.toFolder((FolderEntity) it.next()));
        }
        return arrayList;
    }

    public final Object OooO00o(Folder folder, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27997OooO0O0(folder, this, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27998OooO0OO c27998OooO0OO;
        C28009OooOOOO c28009OooOOOO;
        if (abstractC32479OooO0OO instanceof C27998OooO0OO) {
            c27998OooO0OO = (C27998OooO0OO) abstractC32479OooO0OO;
            int i = c27998OooO0OO.f99287OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27998OooO0OO.f99287OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27998OooO0OO = new C27998OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo = c27998OooO0OO.f99285OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27998OooO0OO.f99287OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            c27998OooO0OO.f99286OooOo0o = this;
            c27998OooO0OO.f99287OooOoO = 1;
            objOooO0oo = this.f99335OooO00o.OooO0oo(c27998OooO0OO);
            if (objOooO0oo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28009OooOOOO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28009OooOOOO = c27998OooO0OO.f99286OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo);
        }
        Iterable iterable = (Iterable) objOooO0oo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c28009OooOOOO.f99336OooO0O0.toFolder((FolderEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27999OooO0Oo c27999OooO0Oo;
        C28009OooOOOO c28009OooOOOO;
        if (abstractC32479OooO0OO instanceof C27999OooO0Oo) {
            c27999OooO0Oo = (C27999OooO0Oo) abstractC32479OooO0OO;
            int i = c27999OooO0Oo.f99291OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27999OooO0Oo.f99291OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27999OooO0Oo = new C27999OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0 = c27999OooO0Oo.f99289OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27999OooO0Oo.f99291OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0);
            c27999OooO0Oo.f99290OooOo0o = this;
            c27999OooO0Oo.f99291OooOoO = 1;
            objOooOO0 = this.f99335OooO00o.OooOO0(str, c27999OooO0Oo);
            if (objOooOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28009OooOOOO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28009OooOOOO = c27999OooO0Oo.f99290OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0);
        }
        Iterable iterable = (Iterable) objOooOO0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c28009OooOOOO.f99336OooO0O0.toFolder((FolderEntity) it.next()));
        }
        return arrayList;
    }

    public final Folder OooO0Oo(String str) {
        FolderEntity folderEntityOooO0OO = this.f99335OooO00o.OooO0OO(str, this.f99337OooO0OO.OooO0Oo());
        if (folderEntityOooO0OO != null) {
            return this.f99336OooO0O0.toFolder(folderEntityOooO0OO);
        }
        return null;
    }

    public final C28003OooO0oo OooO0o(List idList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(idList, "idList");
        return new C28003OooO0oo(this.f99335OooO00o.OooO0o0(this.f99337OooO0OO.OooO0Oo(), idList), this, 0);
    }

    public final Folder OooO0o0(String str) {
        FolderEntity folderEntityOooO0Oo = this.f99335OooO00o.OooO0Oo(str);
        if (folderEntityOooO0Oo != null) {
            return this.f99336OooO0O0.toFolder(folderEntityOooO0Oo);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[LOOP:0: B:26:0x006d->B:28:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28004OooOO0 c28004OooOO0;
        C28009OooOOOO c28009OooOOOO;
        C28009OooOOOO c28009OooOOOO2;
        Iterator<T> it;
        if (abstractC32479OooO0OO instanceof C28004OooOO0) {
            c28004OooOO0 = (C28004OooOO0) abstractC32479OooO0OO;
            int i = c28004OooOO0.f99317OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28004OooOO0.f99317OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28004OooOO0 = new C28004OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c28004OooOO0.f99315OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28004OooOO0.f99317OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            String strOooO0Oo = this.f99337OooO0OO.OooO0Oo();
            o00000O0 o00000o02 = this.f99335OooO00o;
            if (str != null && (listOooO0oO = o00000o02.OooO0oO(str, strOooO0Oo)) != null) {
                c28009OooOOOO2 = this;
                List<FolderEntity> list = listOooO0oO;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(c28009OooOOOO2.f99336OooO0O0.toFolder((FolderEntity) it.next()));
                }
                return arrayList;
            }
            C24718OooOO0o c24718OooOO0oOooO0o = o00000o02.OooO0o(strOooO0Oo);
            c28004OooOO0.f99316OooOo0o = this;
            c28004OooOO0.f99317OooOoO = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(c24718OooOO0oOooO0o, c28004OooOO0);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28009OooOOOO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28009OooOOOO = c28004OooOO0.f99316OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        List<FolderEntity> list2 = (List) objOooOOo;
        c28009OooOOOO2 = c28009OooOOOO;
        List<FolderEntity> listOooO0oO = list2;
        List<FolderEntity> list3 = listOooO0oO;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C28005OooOO0O c28005OooOO0O;
        C28009OooOOOO c28009OooOOOO;
        if (abstractC32479OooO0OO instanceof C28005OooOO0O) {
            c28005OooOO0O = (C28005OooOO0O) abstractC32479OooO0OO;
            int i = c28005OooOO0O.f99321OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28005OooOO0O.f99321OooOoO = i - Integer.MIN_VALUE;
            } else {
                c28005OooOO0O = new C28005OooOO0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO = c28005OooOO0O.f99319OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28005OooOO0O.f99321OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO);
            c28005OooOO0O.f99320OooOo0o = this;
            c28005OooOO0O.f99321OooOoO = 1;
            objOooOOO = this.f99335OooO00o.OooOOO(c28005OooOO0O);
            if (objOooOOO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c28009OooOOOO = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28009OooOOOO = c28005OooOO0O.f99320OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO);
        }
        Iterable iterable = (Iterable) objOooOOO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c28009OooOOOO.f99336OooO0O0.toFolder((FolderEntity) it.next()));
        }
        return arrayList;
    }

    public final Object OooOO0(Folder[] folderArr, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28007OooOOO(folderArr, this, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
