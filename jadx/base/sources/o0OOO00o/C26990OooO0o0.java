package o0OOO00o;

import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.data.p602db.entity.NoteMetaEntity;
import com.orion.notein.domain.mapper.NoteMetaMapper;
import com.orion.notein.domain.models.note.NoteMeta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24340OooO0oo;
import o0O0oooO.o000O00;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27587o00ooO0O;
import o0OOo0o.o0O0O00;
import o0oOO0Oo.C30816OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;
import oo0oO0.C34828o00O0o0o;
import oo0oO0.InterfaceC34824o00O0o;

/* JADX INFO: renamed from: o0OOO00o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26990OooO0o0 implements InterfaceC27313OooOoo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f93822OooO0Oo = C24340OooO0oo.OooO0o0("note_sort");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34824o00O0o f93823OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f93824OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final NoteMetaMapper f93825OooO0OO;

    /* JADX INFO: renamed from: o0OOO00o.OooO0o0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.notemeta.NoteMetaRepoImpl", m80623f = "NoteMetaRepoImpl.kt", m80624l = {138}, m80625m = "getNoteMetaByIdSync")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f93826OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C26990OooO0o0 f93827OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f93828OooOoO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f93826OooOo = obj;
            this.f93828OooOoO |= Integer.MIN_VALUE;
            return C26990OooO0o0.this.OooO0oo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: o0OOO00o.OooO0o0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.notemeta.NoteMetaRepoImpl$getNoteMetasById$2$1", m80623f = "NoteMetaRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends NoteMeta>, List<? extends NoteMeta>, Continuation<? super List<? extends NoteMeta>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ List f93830OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f93831OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(List<? extends NoteMeta> list, List<? extends NoteMeta> list2, Continuation<? super List<? extends NoteMeta>> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(3, continuation);
            oooO0O0.f93831OooOo0o = list;
            oooO0O0.f93830OooOo = list2;
            return oooO0O0.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return OooOo.OooooOO(this.f93831OooOo0o, this.f93830OooOo);
        }
    }

    /* JADX INFO: renamed from: o0OOO00o.OooO0o0$OooO0OO */
    public static final class OooO0OO implements InterfaceC33721OooO0o<List<? extends NoteMeta>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C26990OooO0o0 f93832OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f93833OooOo0o;

        /* JADX INFO: renamed from: o0OOO00o.OooO0o0$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C26990OooO0o0 f93834OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f93835OooOo0o;

            /* JADX INFO: renamed from: o0OOO00o.OooO0o0$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.notemeta.NoteMetaRepoImpl$getNoteMetasById$lambda$13$$inlined$map$1$2", m80623f = "NoteMetaRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19834OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f93836OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f93837OooOo0o;

                public C19834OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f93837OooOo0o = obj;
                    this.f93836OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C26990OooO0o0 c26990OooO0o0) {
                this.f93835OooOo0o = interfaceC33723OooO0oO;
                this.f93834OooOo = c26990OooO0o0;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19834OooO00o c19834OooO00o;
                if (continuation instanceof C19834OooO00o) {
                    c19834OooO00o = (C19834OooO00o) continuation;
                    int i = c19834OooO00o.f93836OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19834OooO00o.f93836OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19834OooO00o = new C19834OooO00o(continuation);
                    }
                }
                Object obj2 = c19834OooO00o.f93837OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19834OooO00o.f93836OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f93834OooOo.f93825OooO0OO.toModel((NoteMetaEntity) it.next()));
                    }
                    c19834OooO00o.f93836OooOo = 1;
                    if (this.f93835OooOo0o.emit(arrayList, c19834OooO00o) == enumC32485OooO00o) {
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

        public OooO0OO(InterfaceC33721OooO0o interfaceC33721OooO0o, C26990OooO0o0 c26990OooO0o0) {
            this.f93833OooOo0o = interfaceC33721OooO0o;
            this.f93832OooOo = c26990OooO0o0;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteMeta>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f93833OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f93832OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C26990OooO0o0(InterfaceC34824o00O0o noteMetaDao, o0000o0O.OooOO0<AbstractC24338OooO0o0> dataStore, NoteMetaMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaDao, "noteMetaDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f93823OooO00o = noteMetaDao;
        this.f93824OooO0O0 = dataStore;
        this.f93825OooO0OO = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOOO oooOOOO;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f93877OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f93877OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = oooOOOO.f93875OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f93877OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            oooOOOO.f93876OooOo0o = this;
            oooOOOO.f93877OooOoO = 1;
            objOooOOo = this.f93823OooO00o.OooOOo(oooOOOO);
            if (objOooOOo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26990OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26990OooO0o0 = oooOOOO.f93876OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        }
        Iterable iterable = (Iterable) objOooOOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26990OooO0o0.f93825OooO0OO.toModel((NoteMetaEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final o000O00 OooO0O0(String id, String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return new o000O00(this.f93823OooO00o.OooO0O0(id, userId), this, 1);
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final OooOO0O OooO0OO(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return new OooOO0O(this.f93823OooO00o.OooO0OO(userId), this);
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final Object OooO0Oo(String str, String str2, o0O0O00 o0o0o00) {
        InterfaceC34824o00O0o interfaceC34824o00O0o = this.f93823OooO00o;
        return str == null ? interfaceC34824o00O0o.OooOOO(str2, o0o0o00) : interfaceC34824o00O0o.OooO0Oo(str, str2, o0o0o00);
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final o0OOO00o.OooO0OO OooO0o(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return new o0OOO00o.OooO0OO(this.f93823OooO00o.OooO0o(userId), this);
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final Object OooO0o0(String str, C27587o00ooO0O c27587o00ooO0O) {
        return this.f93823OooO00o.OooO0o0(str, c27587o00ooO0O);
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final OooO OooO0oO(String str, String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        InterfaceC34824o00O0o interfaceC34824o00O0o = this.f93823OooO00o;
        return new OooO(str != null ? interfaceC34824o00O0o.OooO0oO(str, userId) : interfaceC34824o00O0o.OooOOOO(userId), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, String str2, Continuation<? super NoteMeta> continuation) {
        OooO00o oooO00o;
        C26990OooO0o0 c26990OooO0o0;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f93828OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f93828OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooOO0O = oooO00o.f93826OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f93828OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            oooO00o.f93827OooOo0o = this;
            oooO00o.f93828OooOoO = 1;
            objOooOO0O = this.f93823OooO00o.OooOO0O(str, str2, oooO00o);
            if (objOooOO0O == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26990OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26990OooO0o0 = oooO00o.f93827OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
        }
        NoteMetaEntity noteMetaEntity = (NoteMetaEntity) objOooOO0O;
        if (noteMetaEntity != null) {
            return c26990OooO0o0.f93825OooO0OO.toModel(noteMetaEntity);
        }
        return null;
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final InterfaceC33721OooO0o OooOO0(String userId, List ids) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ids, "ids");
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        ArrayList arrayListOo0o0Oo = OooOo.oo0o0Oo(100, 100, ids);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOo0o0Oo, 10));
        Iterator it = arrayListOo0o0Oo.iterator();
        while (it.hasNext()) {
            arrayList.add(new OooO0OO(this.f93823OooO00o.OooOo00(userId, (List) it.next()), this));
        }
        Iterator it2 = arrayList.iterator();
        Object obj = null;
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                next = new C33763OoooOOO((InterfaceC33721OooO0o) next, (InterfaceC33721OooO0o) it2.next(), new OooO0O0(3, null));
            }
            obj = next;
        }
        InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) obj;
        return interfaceC33721OooO0o == null ? new C33716OooO(C34434OooOoO.f123453OooOo0o) : interfaceC33721OooO0o;
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final Object OooOO0O(String str, C30816OooOOo c30816OooOOo) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C26994OooOOOo(this, str, null), c30816OooOOo);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r4.f93823OooO00o.OooOO0(new com.orion.notein.data.p602db.entity.NoteMetaEntity[]{r1}, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26997OooOOoo c26997OooOOoo;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof C26997OooOOoo) {
            c26997OooOOoo = (C26997OooOOoo) abstractC32479OooO0OO;
            int i = c26997OooOOoo.f93893OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26997OooOOoo.f93893OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26997OooOOoo = new C26997OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c26997OooOOoo.f93891OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26997OooOOoo.f93893OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            c26997OooOOoo.f93892OooOo0o = this;
            c26997OooOOoo.f93893OooOoO = 1;
            objOooOO0O = this.f93823OooO00o.OooOO0O(str, str2, c26997OooOOoo);
            if (objOooOO0O != enumC32485OooO00o) {
                c26990OooO0o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0O);
            return C32460OooOooO.f116667OooO00o;
        }
        c26990OooO0o0 = c26997OooOOoo.f93892OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0O);
        NoteMetaEntity noteMetaEntity = (NoteMetaEntity) objOooOO0O;
        if (noteMetaEntity == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        NoteMetaEntity noteMetaEntityCopy$default = NoteMetaEntity.copy$default(noteMetaEntity, null, null, null, null, null, false, null, 0, 0, false, 0L, 0L, null, null, 0, false, false, false, System.currentTimeMillis(), 262143, null);
        c26997OooOOoo.f93892OooOo0o = null;
        c26997OooOOoo.f93893OooOoO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r4.f93823OooO00o.OooOO0(new com.orion.notein.data.p602db.entity.NoteMetaEntity[]{r1}, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26995OooOOo c26995OooOOo;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof C26995OooOOo) {
            c26995OooOOo = (C26995OooOOo) abstractC32479OooO0OO;
            int i = c26995OooOOo.f93886OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26995OooOOo.f93886OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26995OooOOo = new C26995OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = c26995OooOOo.f93884OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26995OooOOo.f93886OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            c26995OooOOo.f93885OooOo0o = this;
            c26995OooOOo.f93886OooOoO = 1;
            objOooOO0O = this.f93823OooO00o.OooOO0O(str, str2, c26995OooOOo);
            if (objOooOO0O != enumC32485OooO00o) {
                c26990OooO0o0 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0O);
            return C32460OooOooO.f116667OooO00o;
        }
        c26990OooO0o0 = c26995OooOOo.f93885OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0O);
        NoteMetaEntity noteMetaEntity = (NoteMetaEntity) objOooOO0O;
        if (noteMetaEntity == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        NoteMetaEntity noteMetaEntityCopy$default = NoteMetaEntity.copy$default(noteMetaEntity, null, null, null, null, null, false, null, 0, 0, false, 0L, System.currentTimeMillis(), null, null, 0, false, false, false, 0L, 522239, null);
        c26995OooOOo.f93885OooOo0o = null;
        c26995OooOOo.f93886OooOoO = 2;
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final Object OooOOO0(NoteMeta noteMeta, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOO0o = this.f93823OooO00o.OooOO0o(new NoteMetaEntity[]{this.f93825OooO0OO.toEntity(noteMeta)}, abstractC32479OooO0OO);
        return objOooOO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooOO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d A[LOOP:0: B:22:0x0097->B:24:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:21:0x0088). Please report as a decompilation issue!!! */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26992OooO0oo c26992OooO0oo;
        String str2;
        Collection collection;
        Iterator it;
        C26990OooO0o0 c26990OooO0o0;
        Object obj;
        if (abstractC32479OooO0OO instanceof C26992OooO0oo) {
            c26992OooO0oo = (C26992OooO0oo) abstractC32479OooO0OO;
            int i = c26992OooO0oo.f93850OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26992OooO0oo.f93850OooOooO = i - Integer.MIN_VALUE;
            } else {
                c26992OooO0oo = new C26992OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c26992OooO0oo.f93849OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26992OooO0oo.f93850OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayListOooo00O = OooOo.Oooo00O(list, 100);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooo00O, 10));
            Iterator it2 = arrayListOooo00O.iterator();
            str2 = str;
            collection = arrayList;
            it = it2;
            c26990OooO0o0 = this;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = c26992OooO0oo.f93847OooOoOO;
            Iterator it3 = c26992OooO0oo.f93845OooOoO;
            Collection collection2 = c26992OooO0oo.f93846OooOoO0;
            String str3 = c26992OooO0oo.f93843OooOo;
            c26990OooO0o0 = c26992OooO0oo.f93844OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            C26992OooO0oo c26992OooO0oo2 = c26992OooO0oo;
            Iterator it4 = it3;
            str2 = str3;
            C26992OooO0oo c26992OooO0oo3 = c26992OooO0oo2;
            Iterable iterable = (Iterable) obj2;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it5 = iterable.iterator();
            while (it5.hasNext()) {
                arrayList2.add(c26990OooO0o0.f93825OooO0OO.toModel((NoteMetaEntity) it5.next()));
            }
            collection.add(arrayList2);
            it = it4;
            collection = collection2;
            c26992OooO0oo = c26992OooO0oo3;
            if (it.hasNext()) {
                List list2 = (List) it.next();
                InterfaceC34824o00O0o interfaceC34824o00O0o = c26990OooO0o0.f93823OooO00o;
                c26992OooO0oo.f93844OooOo0o = c26990OooO0o0;
                c26992OooO0oo.f93843OooOo = str2;
                Collection collection3 = collection;
                c26992OooO0oo.f93846OooOoO0 = collection3;
                c26992OooO0oo.f93845OooOoO = it;
                c26992OooO0oo.f93847OooOoOO = collection3;
                c26992OooO0oo.f93850OooOooO = 1;
                Object objOooOOO0 = interfaceC34824o00O0o.OooOOO0(list2, str2, c26992OooO0oo);
                if (objOooOOO0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26992OooO0oo3 = c26992OooO0oo;
                it4 = it;
                obj2 = objOooOOO0;
                collection2 = collection;
                Iterable iterable2 = (Iterable) obj2;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                Iterator it52 = iterable2.iterator();
                while (it52.hasNext()) {
                }
                collection.add(arrayList22);
                it = it4;
                collection = collection2;
                c26992OooO0oo = c26992OooO0oo3;
                if (it.hasNext()) {
                    Iterator it6 = ((List) collection).iterator();
                    if (it6.hasNext()) {
                        Object next = it6.next();
                        while (it6.hasNext()) {
                            next = OooOo.OooooOO((List) next, (List) it6.next());
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    List list3 = (List) obj;
                    return list3 == null ? C34434OooOoO.f123453OooOo0o : list3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:12:0x0033). Please report as a decompilation issue!!! */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOOo(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26993OooOO0o c26993OooOO0o;
        Collection arrayList2;
        String str2;
        Iterator it;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof C26993OooOO0o) {
            c26993OooOO0o = (C26993OooOO0o) abstractC32479OooO0OO;
            int i = c26993OooOO0o.f93867OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26993OooOO0o.f93867OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26993OooOO0o = new C26993OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26993OooOO0o.f93866OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26993OooOO0o.f93867OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (arrayList.isEmpty()) {
                return C34436OooOoOO.f123455OooOo0o;
            }
            ArrayList arrayListOo0o0Oo = OooOo.oo0o0Oo(100, 100, arrayList);
            arrayList2 = new ArrayList();
            Iterator it2 = arrayListOo0o0Oo.iterator();
            str2 = str;
            it = it2;
            c26990OooO0o0 = this;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c26993OooOO0o.f93864OooOoO;
            Collection collection = c26993OooOO0o.f93865OooOoO0;
            String str3 = c26993OooOO0o.f93862OooOo;
            c26990OooO0o0 = c26993OooOO0o.f93863OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C26993OooOO0o c26993OooOO0o2 = c26993OooOO0o;
            Collection collection2 = collection;
            str2 = str3;
            C26993OooOO0o c26993OooOO0o3 = c26993OooOO0o2;
            C34431OooOo0.OooOo0o(collection2, (Iterable) obj);
            arrayList2 = collection2;
            c26993OooOO0o = c26993OooOO0o3;
            if (it.hasNext()) {
                List list = (List) it.next();
                InterfaceC34824o00O0o interfaceC34824o00O0o = c26990OooO0o0.f93823OooO00o;
                c26993OooOO0o.f93863OooOo0o = c26990OooO0o0;
                c26993OooOO0o.f93862OooOo = str2;
                c26993OooOO0o.f93865OooOoO0 = arrayList2;
                c26993OooOO0o.f93864OooOoO = it;
                c26993OooOO0o.f93867OooOoo = 1;
                Object objOooO = interfaceC34824o00O0o.OooO(list, str2, c26993OooOO0o);
                if (objOooO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c26993OooOO0o2 = c26993OooOO0o;
                collection2 = arrayList2;
                obj = objOooO;
                C26993OooOO0o c26993OooOO0o32 = c26993OooOO0o2;
                C34431OooOo0.OooOo0o(collection2, (Iterable) obj);
                arrayList2 = collection2;
                c26993OooOO0o = c26993OooOO0o32;
                if (it.hasNext()) {
                    List<C34828o00O0o0o> list2 = (List) arrayList2;
                    int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    for (C34828o00O0o0o c34828o00O0o0o : list2) {
                        linkedHashMap.put(c34828o00O0o0o.f125292OooO00o, c34828o00O0o0o.f125293OooO0O0);
                    }
                    return linkedHashMap;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooO0o oooO0o;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof OooO0o) {
            oooO0o = (OooO0o) abstractC32479OooO0OO;
            int i = oooO0o.f93820OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f93820OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOo0 = oooO0o.f93818OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO0o.f93820OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOo0);
            oooO0o.f93819OooOo0o = this;
            oooO0o.f93820OooOoO = 1;
            objOooOo0 = this.f93823OooO00o.OooOo0(str, oooO0o);
            if (objOooOo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26990OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26990OooO0o0 = oooO0o.f93819OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOo0);
        }
        NoteMetaEntity noteMetaEntity = (NoteMetaEntity) objOooOo0;
        if (noteMetaEntity != null) {
            return c26990OooO0o0.f93825OooO0OO.toModel(noteMetaEntity);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOo0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26991OooO0oO c26991OooO0oO;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof C26991OooO0oO) {
            c26991OooO0oO = (C26991OooO0oO) abstractC32479OooO0OO;
            int i = c26991OooO0oO.f93841OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26991OooO0oO.f93841OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26991OooO0oO = new C26991OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo0 = c26991OooO0oO.f93839OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26991OooO0oO.f93841OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo0);
            c26991OooO0oO.f93840OooOo0o = this;
            c26991OooO0oO.f93841OooOoO = 1;
            objOooOOo0 = this.f93823OooO00o.OooOOo0(c26991OooO0oO);
            if (objOooOOo0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26990OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26990OooO0o0 = c26991OooO0oO.f93840OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo0);
        }
        Iterable iterable = (Iterable) objOooOOo0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26990OooO0o0.f93825OooO0OO.toModel((NoteMetaEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOOoo(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOO0 oooOO02;
        C26990OooO0o0 c26990OooO0o0;
        if (abstractC32479OooO0OO instanceof OooOO0) {
            oooOO02 = (OooOO0) abstractC32479OooO0OO;
            int i = oooOO02.f93853OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO02.f93853OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOO02 = new OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOoo = oooOO02.f93851OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOO02.f93853OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOoo);
            oooOO02.f93852OooOo0o = this;
            oooOO02.f93853OooOoO = 1;
            objOooOOoo = this.f93823OooO00o.OooOOoo(str, str2, oooOO02);
            if (objOooOOoo == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26990OooO0o0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26990OooO0o0 = oooOO02.f93852OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOoo);
        }
        Iterable iterable = (Iterable) objOooOOoo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26990OooO0o0.f93825OooO0OO.toModel((NoteMetaEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final OooOOO OooOo0() {
        return new OooOOO(this.f93824OooO0O0.getData(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo00(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0OOO00o.OooO00o oooO00o;
        if (abstractC32479OooO0OO instanceof o0OOO00o.OooO00o) {
            oooO00o = (o0OOO00o.OooO00o) abstractC32479OooO0OO;
            int i = oooO00o.f93797OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f93797OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new o0OOO00o.OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooO00o.f93795OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f93797OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooO00o.f93796OooOo0o = str;
            oooO00o.f93797OooOoO = 1;
            if (this.f93823OooO00o.OooOOOo(str, str2, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = oooO00o.f93796OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteMetaRepoImpl", "NoteMetaRepoImpl.deleteNoteMeta for id: ", str, "."), new Object[0]);
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOo0O(NoteMeta[] noteMetaArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26996OooOOo0 c26996OooOOo0;
        if (abstractC32479OooO0OO instanceof C26996OooOOo0) {
            c26996OooOOo0 = (C26996OooOOo0) abstractC32479OooO0OO;
            int i = c26996OooOOo0.f93890OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26996OooOOo0.f93890OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c26996OooOOo0 = new C26996OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c26996OooOOo0.f93889OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26996OooOOo0.f93890OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(noteMetaArr.length);
            int length = noteMetaArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3;
                arrayList.add(this.f93825OooO0OO.toEntity(NoteMeta.copy$default(noteMetaArr[i4], null, null, null, null, null, false, null, 0, 0, false, null, 0, 0L, jCurrentTimeMillis, null, false, false, false, 0L, 516095, null)));
                i3 = i4 + 1;
            }
            c26996OooOOo0.f93890OooOoO0 = 1;
            if (this.f93823OooO00o.OooO0oo(arrayList, c26996OooOOo0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return Boolean.TRUE;
    }

    @Override // o0OOo0Oo.InterfaceC27313OooOoo0
    public final o0OOO00o.OooO0O0 OooOo0o(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        return new o0OOO00o.OooO0O0(this.f93823OooO00o.OooO00o(userId), this);
    }
}
