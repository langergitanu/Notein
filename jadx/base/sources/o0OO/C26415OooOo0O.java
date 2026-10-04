package o0OO;

import com.orion.notein.data.p602db.entity.NotePlaceholderEntity;
import com.orion.notein.domain.mapper.NotePlaceholderMapper;
import com.orion.notein.domain.models.note.NotePlaceHolder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o000oo0o.C24718OooOO0o;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27314OooOooO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oo0oO0.o0o0Oo;

/* JADX INFO: renamed from: o0OO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26415OooOo0O implements InterfaceC27314OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0o0Oo f90698OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NotePlaceholderMapper f90699OooO0O0;

    /* JADX INFO: renamed from: o0OO.OooOo0O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.NotePlaceholderRepoImpl$1", m80623f = "NotePlaceholderRepoImpl.kt", m80624l = {30}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f90701OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ long f90702OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f90702OooOoO0 = j;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C26415OooOo0O.this.new OooO00o(this.f90702OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f90701OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f90701OooOo0o = 1;
                if (C26415OooOo0O.OooO0oo(C26415OooOo0O.this, this.f90702OooOoO0, this) == enumC32485OooO00o) {
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

    public C26415OooOo0O(o0o0Oo notePlaceholderDao, NotePlaceholderMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(notePlaceholderDao, "notePlaceholderDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f90698OooO00o = notePlaceholderDao;
        this.f90699OooO0O0 = mapper;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(jCurrentTimeMillis, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        if (r1.OooO00o(r0, r2) != r3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161 A[LOOP:1: B:62:0x015b->B:64:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oo(C26415OooOo0O c26415OooOo0O, long j, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26418OooOoO0 c26418OooOoO0;
        long j2;
        C26415OooOo0O c26415OooOo0O2;
        ArrayList arrayList;
        C26415OooOo0O c26415OooOo0O3 = c26415OooOo0O;
        c26415OooOo0O3.getClass();
        if (abstractC32479OooO0OO instanceof C26418OooOoO0) {
            c26418OooOoO0 = (C26418OooOoO0) abstractC32479OooO0OO;
            int i = c26418OooOoO0.f90717OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26418OooOoO0.f90717OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c26418OooOoO0 = new C26418OooOoO0(c26415OooOo0O3, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo = c26418OooOoO0.f90714OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26418OooOoO0.f90717OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo);
            C24718OooOO0o all = c26415OooOo0O3.f90698OooO00o.getAll();
            c26418OooOoO0.f90713OooOo0o = c26415OooOo0O3;
            j2 = j;
            c26418OooOoO0.f90715OooOoO0 = j2;
            c26418OooOoO0.f90717OooOoo0 = 1;
            objOooOOo = C25252OooO0Oo.OooOOo(all, c26418OooOoO0);
            if (objOooOOo != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            j2 = c26418OooOoO0.f90715OooOoO0;
            c26415OooOo0O3 = c26418OooOoO0.f90713OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOo);
                return C32460OooOooO.f116667OooO00o;
            }
            arrayList = c26418OooOoO0.f90712OooOo;
            c26415OooOo0O2 = c26418OooOoO0.f90713OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOo);
            ArrayList<NotePlaceholderEntity> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String string = ((NotePlaceholderEntity) obj).getExtras().getString("hw_cloud_file_id");
                if (string != null && string.length() != 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            for (NotePlaceholderEntity notePlaceholderEntity : arrayList2) {
                arrayList3.add(NotePlaceholderEntity.copy$default(notePlaceholderEntity, null, null, null, 0L, null, null, (int) notePlaceholderEntity.getExtras().getDouble("state"), null, 191, null));
            }
            o0o0Oo o0o0oo = c26415OooOo0O2.f90698OooO00o;
            NotePlaceholderEntity[] notePlaceholderEntityArr = (NotePlaceholderEntity[]) arrayList3.toArray(new NotePlaceholderEntity[0]);
            NotePlaceholderEntity[] notePlaceholderEntityArr2 = (NotePlaceholderEntity[]) Arrays.copyOf(notePlaceholderEntityArr, notePlaceholderEntityArr.length);
            c26418OooOoO0.f90713OooOo0o = null;
            c26418OooOoO0.f90712OooOo = null;
            c26418OooOoO0.f90717OooOoo0 = 3;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : (Iterable) objOooOOo) {
            if (((NotePlaceholderEntity) obj2).getCreationTime() < j2) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            NotePlaceholderEntity notePlaceholderEntity2 = (NotePlaceholderEntity) obj3;
            String string2 = notePlaceholderEntity2.getExtras().getString("hw_cloud_file_id");
            boolean z = string2 == null || string2.length() == 0;
            boolean z2 = notePlaceholderEntity2.getState() != 5;
            if (z && z2) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
        Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            arrayList6.add(NotePlaceholderEntity.copy$default((NotePlaceholderEntity) it.next(), null, null, null, 0L, null, null, 1, null, 191, null));
        }
        o0o0Oo o0o0oo2 = c26415OooOo0O3.f90698OooO00o;
        NotePlaceholderEntity[] notePlaceholderEntityArr3 = (NotePlaceholderEntity[]) arrayList6.toArray(new NotePlaceholderEntity[0]);
        NotePlaceholderEntity[] notePlaceholderEntityArr4 = (NotePlaceholderEntity[]) Arrays.copyOf(notePlaceholderEntityArr3, notePlaceholderEntityArr3.length);
        c26418OooOoO0.f90713OooOo0o = c26415OooOo0O3;
        c26418OooOoO0.f90712OooOo = arrayList4;
        c26418OooOoO0.f90717OooOoo0 = 2;
        if (o0o0oo2.OooO00o(notePlaceholderEntityArr4, c26418OooOoO0) != enumC32485OooO00o) {
            c26415OooOo0O2 = c26415OooOo0O3;
            arrayList = arrayList4;
            ArrayList<NotePlaceholderEntity> arrayList22 = new ArrayList();
            while (r0.hasNext()) {
            }
            ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(arrayList22, 10));
            while (r1.hasNext()) {
            }
            o0o0Oo o0o0oo3 = c26415OooOo0O2.f90698OooO00o;
            NotePlaceholderEntity[] notePlaceholderEntityArr5 = (NotePlaceholderEntity[]) arrayList32.toArray(new NotePlaceholderEntity[0]);
            NotePlaceholderEntity[] notePlaceholderEntityArr22 = (NotePlaceholderEntity[]) Arrays.copyOf(notePlaceholderEntityArr5, notePlaceholderEntityArr5.length);
            c26418OooOoO0.f90713OooOo0o = null;
            c26418OooOoO0.f90712OooOo = null;
            c26418OooOoO0.f90717OooOoo0 = 3;
        }
        return enumC32485OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    public final Object OooO00o(NotePlaceHolder[] notePlaceHolderArr, AbstractC32476OooO abstractC32476OooO) {
        ArrayList arrayList = new ArrayList(notePlaceHolderArr.length);
        for (NotePlaceHolder notePlaceHolder : notePlaceHolderArr) {
            arrayList.add(this.f90699OooO0O0.toEntity(notePlaceHolder));
        }
        NotePlaceholderEntity[] notePlaceholderEntityArr = (NotePlaceholderEntity[]) arrayList.toArray(new NotePlaceholderEntity[0]);
        Object objOooO0O0 = this.f90698OooO00o.OooO0O0((NotePlaceholderEntity[]) Arrays.copyOf(notePlaceholderEntityArr, notePlaceholderEntityArr.length), abstractC32476OooO);
        return objOooO0O0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    public final OooOo OooO0O0() {
        return new OooOo(this.f90698OooO00o.getAll(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:21:0x0081). Please report as a decompilation issue!!! */
    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0OO(Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26416OooOo0o c26416OooOo0o;
        C26415OooOo0O c26415OooOo0O;
        Iterator it;
        Collection collection;
        Object obj;
        if (abstractC32479OooO0OO instanceof C26416OooOo0o) {
            c26416OooOo0o = (C26416OooOo0o) abstractC32479OooO0OO;
            int i = c26416OooOo0o.f90708OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26416OooOo0o.f90708OooOoo = i - Integer.MIN_VALUE;
            } else {
                c26416OooOo0o = new C26416OooOo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c26416OooOo0o.f90707OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26416OooOo0o.f90708OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(set, 100);
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooo00O, 10));
            c26415OooOo0O = this;
            it = arrayListOooo00O.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = c26416OooOo0o.f90705OooOoO;
            it = c26416OooOo0o.f90706OooOoO0;
            Collection collection2 = c26416OooOo0o.f90703OooOo;
            c26415OooOo0O = c26416OooOo0o.f90704OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            collection.add((List) objOooO0Oo);
            collection = collection2;
            if (it.hasNext()) {
                List list = (List) it.next();
                o0o0Oo o0o0oo = c26415OooOo0O.f90698OooO00o;
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(list);
                c26416OooOo0o.f90704OooOo0o = c26415OooOo0O;
                Collection collection3 = collection;
                c26416OooOo0o.f90703OooOo = collection3;
                c26416OooOo0o.f90706OooOoO0 = it;
                c26416OooOo0o.f90705OooOoO = collection3;
                c26416OooOo0o.f90708OooOoo = 1;
                objOooO0Oo = o0o0oo.OooO0Oo(setO0OO00O, c26416OooOo0o);
                if (objOooO0Oo == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                collection2 = collection;
                collection.add((List) objOooO0Oo);
                collection = collection2;
                if (it.hasNext()) {
                    Iterator it2 = ((List) collection).iterator();
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        while (it2.hasNext()) {
                            next = oOo000Oo.OooOo.OooooOO((List) next, (List) it2.next());
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    List list2 = (List) obj;
                    if (list2 == null) {
                        return C34434OooOoO.f123453OooOo0o;
                    }
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(c26415OooOo0O.f90699OooO0O0.toNotePlaceholder((NotePlaceholderEntity) it3.next()));
                    }
                    return arrayList2;
                }
            }
        }
    }

    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    public final NotePlaceHolder OooO0Oo(String str) {
        NotePlaceholderEntity notePlaceholderEntityOooO0o = this.f90698OooO00o.OooO0o(str);
        if (notePlaceholderEntityOooO0o != null) {
            return this.f90699OooO0O0.toNotePlaceholder(notePlaceholderEntityOooO0o);
        }
        return null;
    }

    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    public final Object OooO0o(String[] strArr, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO0o0 = this.f90698OooO00o.OooO0o0((String[]) Arrays.copyOf(strArr, strArr.length), abstractC32479OooO0OO);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    public final ArrayList OooO0o0(String str) {
        List<NotePlaceholderEntity> listOooO0OO = this.f90698OooO00o.OooO0OO(str);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0OO, 10));
        Iterator<T> it = listOooO0OO.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f90699OooO0O0.toNotePlaceholder((NotePlaceholderEntity) it.next()));
        }
        return arrayList;
    }

    @Override // o0OOo0Oo.InterfaceC27314OooOooO
    public final Object OooO0oO(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO00o;
        o0o0Oo o0o0oo = this.f90698OooO00o;
        NotePlaceholderEntity notePlaceholderEntityOooO0o = o0o0oo.OooO0o(str);
        return (notePlaceholderEntityOooO0o == null || (objOooO00o = o0o0oo.OooO00o(new NotePlaceholderEntity[]{NotePlaceholderEntity.copy$default(notePlaceholderEntityOooO0o, null, null, null, 0L, null, null, i, null, 191, null)}, abstractC32479OooO0OO)) != EnumC32485OooO00o.f116726OooOo0o) ? C32460OooOooO.f116667OooO00o : objOooO00o;
    }
}
