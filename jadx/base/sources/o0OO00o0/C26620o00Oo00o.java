package o0OO00o0;

import com.orion.notein.data.p602db.entity.OutlineEntity;
import com.orion.notein.domain.mapper.OutlineMapper;
import com.orion.notein.domain.models.note.Outline;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.o00Oo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26620o00Oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f91877OooO0Oo = C24340OooO0oo.OooO0o0("outline_sort");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C26613o00OOOoO f91878OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f91879OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OutlineMapper f91880OooO0OO;

    public C26620o00Oo00o(C26613o00OOOoO outlineLocalDataSource, o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore, OutlineMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(outlineLocalDataSource, "outlineLocalDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f91878OooO00o = outlineLocalDataSource;
        this.f91879OooO0O0 = dataStore;
        this.f91880OooO0OO = mapper;
    }

    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91880OooO0OO.toEntity((Outline) it.next()));
        }
        C26613o00OOOoO c26613o00OOOoO = this.f91878OooO00o;
        c26613o00OOOoO.getClass();
        Object objOooO00o = c26613o00OOOoO.OooO00o(str, new o00OOO00(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26615o00OOooO c26615o00OOooO;
        C26620o00Oo00o c26620o00Oo00o;
        if (abstractC32479OooO0OO instanceof C26615o00OOooO) {
            c26615o00OOooO = (C26615o00OOooO) abstractC32479OooO0OO;
            int i = c26615o00OOooO.f91858OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26615o00OOooO.f91858OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26615o00OOooO = new C26615o00OOooO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26615o00OOooO.f91856OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26615o00OOooO.f91858OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26615o00OOooO.f91857OooOo0o = this;
            c26615o00OOooO.f91858OooOoO = 1;
            C26613o00OOOoO c26613o00OOOoO = this.f91878OooO00o;
            c26613o00OOOoO.getClass();
            objOooO00o = c26613o00OOOoO.OooO00o(str, new o00OOOO0(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26620o00Oo00o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26620o00Oo00o = c26615o00OOooO.f91857OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26620o00Oo00o.f91880OooO0OO.toModel((OutlineEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26616o00OOooo c26616o00OOooo;
        C26620o00Oo00o c26620o00Oo00o;
        if (abstractC32479OooO0OO instanceof C26616o00OOooo) {
            c26616o00OOooo = (C26616o00OOooo) abstractC32479OooO0OO;
            int i = c26616o00OOooo.f91862OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26616o00OOooo.f91862OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26616o00OOooo = new C26616o00OOooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26616o00OOooo.f91860OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26616o00OOooo.f91862OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26616o00OOooo.f91861OooOo0o = this;
            c26616o00OOooo.f91862OooOoO = 1;
            C26613o00OOOoO c26613o00OOOoO = this.f91878OooO00o;
            c26613o00OOOoO.getClass();
            objOooO00o = c26613o00OOOoO.OooO00o(str2, new o0o0Oo(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26620o00Oo00o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26620o00Oo00o = c26616o00OOooo.f91861OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26620o00Oo00o.f91880OooO0OO.toModel((OutlineEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26638o00OoOoO c26638o00OoOoO;
        C26620o00Oo00o c26620o00Oo00o;
        if (abstractC32479OooO0OO instanceof C26638o00OoOoO) {
            c26638o00OoOoO = (C26638o00OoOoO) abstractC32479OooO0OO;
            int i = c26638o00OoOoO.f91943OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26638o00OoOoO.f91943OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26638o00OoOoO = new C26638o00OoOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26638o00OoOoO.f91941OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26638o00OoOoO.f91943OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26638o00OoOoO.f91942OooOo0o = this;
            c26638o00OoOoO.f91943OooOoO = 1;
            C26613o00OOOoO c26613o00OOOoO = this.f91878OooO00o;
            c26613o00OOOoO.getClass();
            objOooO00o = c26613o00OOOoO.OooO00o(str2, new o00OOO(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26620o00Oo00o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26620o00Oo00o = c26638o00OoOoO.f91942OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        return c26620o00Oo00o.f91880OooO0OO.toModel((OutlineEntity) objOooO00o);
    }

    public final Object OooO0o(List list, String str, AbstractC32476OooO abstractC32476OooO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f91880OooO0OO.toEntity((Outline) it.next()));
        }
        C26613o00OOOoO c26613o00OOOoO = this.f91878OooO00o;
        c26613o00OOOoO.getClass();
        Object objOooO00o = c26613o00OOOoO.OooO00o(str, new C26611o00OOOo(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO00o != enumC32485OooO00o) {
            objOooO00o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO00o == enumC32485OooO00o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26619o00Oo000 c26619o00Oo000;
        C26620o00Oo00o c26620o00Oo00o;
        if (abstractC32479OooO0OO instanceof C26619o00Oo000) {
            c26619o00Oo000 = (C26619o00Oo000) abstractC32479OooO0OO;
            int i = c26619o00Oo000.f91875OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26619o00Oo000.f91875OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26619o00Oo000 = new C26619o00Oo000(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26619o00Oo000.f91873OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26619o00Oo000.f91875OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c26619o00Oo000.f91874OooOo0o = this;
            c26619o00Oo000.f91875OooOoO = 1;
            C26613o00OOOoO c26613o00OOOoO = this.f91878OooO00o;
            c26613o00OOOoO.getClass();
            objOooO00o = c26613o00OOOoO.OooO00o(str2, new o00OOOOo(str, null));
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26620o00Oo00o = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26620o00Oo00o = c26619o00Oo000.f91874OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26620o00Oo00o.f91880OooO0OO.toModel((OutlineEntity) it.next()));
        }
        return arrayList;
    }
}
