package o0OOO0OO;

import com.orion.notein.data.p602db.entity.PageEntity;
import com.orion.notein.domain.mapper.PageMapper;
import com.orion.notein.domain.models.page.Page;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OO000o.C26454OooO0Oo;
import o0OO000o.C26466OooO0o0;
import o0OOo0Oo.Oooo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oo0oO0.InterfaceC34887o00o00O0;

/* JADX INFO: renamed from: o0OOO0OO.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27020OooOoO0 implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27015OooOOoo f94064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PageMapper f94065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27017OooOo0O f94066OooO0OO;

    /* JADX INFO: renamed from: o0OOO0OO.OooOoO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageRepoImpl", m80623f = "PageRepoImpl.kt", m80624l = {41}, m80625m = "getPageByIdSync")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f94067OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C27020OooOoO0 f94068OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f94069OooOoO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f94067OooOo = obj;
            this.f94069OooOoO |= Integer.MIN_VALUE;
            return C27020OooOoO0.this.OooO0Oo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: o0OOO0OO.OooOoO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageRepoImpl$getPages$2$1", m80623f = "PageRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends Page>, List<? extends Page>, Continuation<? super List<? extends Page>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ List f94071OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f94072OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(List<? extends Page> list, List<? extends Page> list2, Continuation<? super List<? extends Page>> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(3, continuation);
            oooO0O0.f94072OooOo0o = list;
            oooO0O0.f94071OooOo = list2;
            return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return oOo000Oo.OooOo.OooooOO(this.f94072OooOo0o, this.f94071OooOo);
        }
    }

    /* JADX INFO: renamed from: o0OOO0OO.OooOoO0$OooO0OO */
    public static final class OooO0OO implements InterfaceC33721OooO0o<List<? extends Page>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27020OooOoO0 f94073OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33734OooOOoo f94074OooOo0o;

        /* JADX INFO: renamed from: o0OOO0OO.OooOoO0$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C27020OooOoO0 f94075OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f94076OooOo0o;

            /* JADX INFO: renamed from: o0OOO0OO.OooOoO0$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.PageRepoImpl$getPages$lambda$15$$inlined$map$1$2", m80623f = "PageRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19837OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f94077OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f94078OooOo0o;

                public C19837OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f94078OooOo0o = obj;
                    this.f94077OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27020OooOoO0 c27020OooOoO0) {
                this.f94076OooOo0o = interfaceC33723OooO0oO;
                this.f94075OooOo = c27020OooOoO0;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19837OooO00o c19837OooO00o;
                if (continuation instanceof C19837OooO00o) {
                    c19837OooO00o = (C19837OooO00o) continuation;
                    int i = c19837OooO00o.f94077OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19837OooO00o.f94077OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19837OooO00o = new C19837OooO00o(continuation);
                    }
                }
                Object obj2 = c19837OooO00o.f94078OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19837OooO00o.f94077OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f94075OooOo.f94065OooO0O0.toPage((PageEntity) it.next()));
                    }
                    c19837OooO00o.f94077OooOo = 1;
                    if (this.f94076OooOo0o.emit(arrayList, c19837OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0OO(C33734OooOOoo c33734OooOOoo, C27020OooOoO0 c27020OooOoO0) {
            this.f94074OooOo0o = c33734OooOOoo;
            this.f94073OooOo = c27020OooOoO0;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends Page>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f94074OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94073OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C27020OooOoO0(C27015OooOOoo pageLocalDataSource, PageMapper mapper, C27017OooOo0O memDataSource) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLocalDataSource, "pageLocalDataSource");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(memDataSource, "memDataSource");
        this.f94064OooO00o = pageLocalDataSource;
        this.f94065OooO0O0 = mapper;
        this.f94066OooO0OO = memDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[LOOP:0: B:27:0x00a4->B:29:0x00aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:12:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27024OooOooO c27024OooOooO;
        Collection arrayList;
        String str2;
        Iterator it;
        C27020OooOoO0 c27020OooOoO0;
        if (abstractC32479OooO0OO instanceof C27024OooOooO) {
            c27024OooOooO = (C27024OooOooO) abstractC32479OooO0OO;
            int i = c27024OooOooO.f94100OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27024OooOooO.f94100OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27024OooOooO = new C27024OooOooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27024OooOooO.f94099OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27024OooOooO.f94100OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (set.isEmpty()) {
                return C34434OooOoO.f123453OooOo0o;
            }
            ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, set);
            arrayList = new ArrayList();
            Iterator it2 = arrayListOo0o0Oo.iterator();
            str2 = str;
            it = it2;
            c27020OooOoO0 = this;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c27024OooOooO.f94097OooOoO;
            Collection collection = c27024OooOooO.f94098OooOoO0;
            String str3 = c27024OooOooO.f94095OooOo;
            c27020OooOoO0 = c27024OooOooO.f94096OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27024OooOooO c27024OooOooO2 = c27024OooOooO;
            Collection collection2 = collection;
            str2 = str3;
            C27024OooOooO c27024OooOooO3 = c27024OooOooO2;
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList2.add(c27020OooOoO0.f94065OooO0O0.toPage((PageEntity) it3.next()));
            }
            C34431OooOo0.OooOo0o(collection2, arrayList2);
            arrayList = collection2;
            c27024OooOooO = c27024OooOooO3;
            if (it.hasNext()) {
                List list = (List) it.next();
                C27015OooOOoo c27015OooOOoo = c27020OooOoO0.f94064OooO00o;
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(list);
                c27024OooOooO.f94096OooOo0o = c27020OooOoO0;
                c27024OooOooO.f94095OooOo = str2;
                c27024OooOooO.f94098OooOoO0 = arrayList;
                c27024OooOooO.f94097OooOoO = it;
                c27024OooOooO.f94100OooOoo = 1;
                c27015OooOOoo.getClass();
                Object objOooO0O0 = c27015OooOOoo.OooO0O0(str2, new C27011OooOO0o(setO0OO00O, null));
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27024OooOooO2 = c27024OooOooO;
                collection2 = arrayList;
                obj = objOooO0O0;
                C27024OooOooO c27024OooOooO32 = c27024OooOooO2;
                Iterable iterable2 = (Iterable) obj;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                Iterator it32 = iterable2.iterator();
                while (it32.hasNext()) {
                }
                C34431OooOo0.OooOo0o(collection2, arrayList22);
                arrayList = collection2;
                c27024OooOooO = c27024OooOooO32;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }

    public final Object OooO00o(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f94065OooO0O0.toEntity((Page) it.next()));
        }
        C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
        c27015OooOOoo.getClass();
        Object objOooO0O0 = c27015OooOOoo.OooO0O0(str, new C27008OooO0o0(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27018OooOo0o c27018OooOo0o;
        String str2;
        Iterator it;
        C27020OooOoO0 c27020OooOoO0;
        if (abstractC32479OooO0OO instanceof C27018OooOo0o) {
            c27018OooOo0o = (C27018OooOo0o) abstractC32479OooO0OO;
            int i = c27018OooOo0o.f94060OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27018OooOo0o.f94060OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27018OooOo0o = new C27018OooOo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27018OooOo0o.f94057OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27018OooOo0o.f94060OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Iterator it2 = oOo000Oo.OooOo.Oooo00O(set, 100).iterator();
            str2 = str;
            it = it2;
            c27020OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c27018OooOo0o.f94058OooOoO0;
            str2 = c27018OooOo0o.f94055OooOo;
            c27020OooOoO0 = c27018OooOo0o.f94056OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        while (it.hasNext()) {
            List list = (List) it.next();
            C27015OooOOoo c27015OooOOoo = c27020OooOoO0.f94064OooO00o;
            c27018OooOo0o.f94056OooOo0o = c27020OooOoO0;
            c27018OooOo0o.f94055OooOo = str2;
            c27018OooOo0o.f94058OooOoO0 = it;
            c27018OooOo0o.f94060OooOoo0 = 1;
            c27015OooOOoo.getClass();
            Object objOooO0O0 = c27015OooOOoo.OooO0O0(str2, new OooO0o(list, null));
            if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                objOooO0O0 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    public final OooOo OooO0OO(String id, String noteId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
        c27015OooOOoo.getClass();
        C26454OooO0Oo c26454OooO0Oo = c27015OooOOoo.f94033OooO00o;
        c26454OooO0Oo.getClass();
        c26454OooO0Oo.OooO0O0(noteId);
        InterfaceC34887o00o00O0 it = c26454OooO0Oo.OooO0o(noteId).OooOoo();
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        return new OooOo(new C33734OooOOoo(it.OooO0o0(id), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, String str2, Continuation<? super Page> continuation) {
        OooO00o oooO00o;
        C27020OooOoO0 c27020OooOoO0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f94069OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f94069OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooO0O0 = oooO00o.f94067OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f94069OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            oooO00o.f94068OooOo0o = this;
            oooO00o.f94069OooOoO = 1;
            C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
            c27015OooOOoo.getClass();
            objOooO0O0 = c27015OooOOoo.OooO0O0(str2, new C27010OooO0oo(str, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27020OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27020OooOoO0 = oooO00o.f94068OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        PageEntity pageEntity = (PageEntity) objOooO0O0;
        if (pageEntity != null) {
            return c27020OooOoO0.f94065OooO0O0.toPage(pageEntity);
        }
        return null;
    }

    public final InterfaceC33721OooO0o OooO0o(String noteId, Set set) {
        Object obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
        boolean zIsEmpty = set.isEmpty();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (zIsEmpty) {
            return new C33716OooO(c34434OooOoO);
        }
        ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, set);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOo0o0Oo, 10));
        Iterator it = arrayListOo0o0Oo.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O((List) it.next());
            C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
            c27015OooOOoo.getClass();
            C26454OooO0Oo c26454OooO0Oo = c27015OooOOoo.f94033OooO00o;
            c26454OooO0Oo.getClass();
            c26454OooO0Oo.OooO0O0(noteId);
            InterfaceC34887o00o00O0 it2 = c26454OooO0Oo.OooO0o(noteId).OooOoo();
            kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
            arrayList.add(new OooO0OO(new C33734OooOOoo(it2.OooOO0O(setO0OO00O), new C26466OooO0o0(c26454OooO0Oo, noteId, null)), this));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            while (it3.hasNext()) {
                next = new C33763OoooOOO((InterfaceC33721OooO0o) next, (InterfaceC33721OooO0o) it3.next(), new OooO0O0(3, null));
            }
            obj = next;
        }
        InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) obj;
        return interfaceC33721OooO0o == null ? new C33716OooO(c34434OooOoO) : interfaceC33721OooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27019OooOoO c27019OooOoO;
        if (abstractC32479OooO0OO instanceof C27019OooOoO) {
            c27019OooOoO = (C27019OooOoO) abstractC32479OooO0OO;
            int i = c27019OooOoO.f94063OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27019OooOoO.f94063OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27019OooOoO = new C27019OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27019OooOoO.f94062OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27019OooOoO.f94063OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27019OooOoO.f94063OooOoO0 = 1;
            C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
            c27015OooOOoo.getClass();
            objOooO0O0 = c27015OooOOoo.OooO0O0(str, new OooOO0O(str, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((PageEntity) it.next()).getId());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27023OooOoo0 c27023OooOoo0;
        C27020OooOoO0 c27020OooOoO0;
        if (abstractC32479OooO0OO instanceof C27023OooOoo0) {
            c27023OooOoo0 = (C27023OooOoo0) abstractC32479OooO0OO;
            int i = c27023OooOoo0.f94093OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27023OooOoo0.f94093OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27023OooOoo0 = new C27023OooOoo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27023OooOoo0.f94091OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27023OooOoo0.f94093OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            c27023OooOoo0.f94092OooOo0o = this;
            c27023OooOoo0.f94093OooOoO = 1;
            C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
            c27015OooOOoo.getClass();
            objOooO0O0 = c27015OooOOoo.OooO0O0(str, new OooOO0O(str, null));
            if (objOooO0O0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27020OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27020OooOoO0 = c27023OooOoo0.f94092OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
        }
        Iterable iterable = (Iterable) objOooO0O0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27020OooOoO0.f94065OooO0O0.toPage((PageEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oo(Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27022OooOoo c27022OooOoo;
        C27020OooOoO0 c27020OooOoO0;
        if (abstractC32479OooO0OO instanceof C27022OooOoo) {
            c27022OooOoo = (C27022OooOoo) abstractC32479OooO0OO;
            int i = c27022OooOoo.f94089OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27022OooOoo.f94089OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27022OooOoo = new C27022OooOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27022OooOoo.f94087OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27022OooOoo.f94089OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            c27022OooOoo.f94088OooOo0o = this;
            c27022OooOoo.f94089OooOoO = 1;
            objOooO00o = this.f94064OooO00o.OooO00o(set, c27022OooOoo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27020OooOoO0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27020OooOoO0 = c27022OooOoo.f94088OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c27020OooOoO0.f94065OooO0O0.toPage((PageEntity) it.next()));
        }
        return arrayList;
    }

    public final Object OooOO0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f94065OooO0O0.toEntity((Page) it.next()));
        }
        C27015OooOOoo c27015OooOOoo = this.f94064OooO00o;
        c27015OooOOoo.getClass();
        Object objOooO0O0 = c27015OooOOoo.OooO0O0(str, new C27013OooOOo(arrayList, null));
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }
}
