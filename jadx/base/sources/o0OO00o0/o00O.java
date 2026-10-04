package o0OO00o0;

import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.data.p602db.entity.LabelEntity;
import com.orion.notein.domain.mapper.LabelMapper;
import com.orion.notein.domain.mapper.LabelRefMapper;
import com.orion.notein.domain.models.Label;
import com.orion.notein.domain.models.LabelColor;
import com.orion.notein.domain.models.LabelRef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27306OooOo00;
import o0OOoOo0.C27794OooO0O0;
import o0OOoOo0.C27797OooO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class o00O implements InterfaceC27306OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0oO0.o000O0Oo f91622OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LabelMapper f91623OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LabelRefMapper f91624OooO0OO;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LabelRepoImpl$getLabelsForPageIds$2$1", m80623f = "LabelRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Map<String, ? extends Map<String, ? extends List<? extends Label>>>, Map<String, ? extends Map<String, ? extends List<? extends Label>>>, Continuation<? super Map<String, ? extends Map<String, ? extends List<? extends Label>>>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Map f91625OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Map f91626OooOo0o;

        @Override // oO0O000o.InterfaceC32510OooOOo0
        public final Object invoke(Map<String, ? extends Map<String, ? extends List<? extends Label>>> map, Map<String, ? extends Map<String, ? extends List<? extends Label>>> map2, Continuation<? super Map<String, ? extends Map<String, ? extends List<? extends Label>>>> continuation) {
            OooO00o oooO00o = new OooO00o(3, continuation);
            oooO00o.f91626OooOo0o = map;
            oooO00o.f91625OooOo = map2;
            return oooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return C34444Oooo0O0.OooOO0(this.f91626OooOo0o, this.f91625OooOo);
        }
    }

    public static final class OooO0O0 implements InterfaceC33721OooO0o<Map<String, ? extends Map<String, ? extends List<? extends Label>>>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f91627OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33763OoooOOO f91628OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ String f91629OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f91630OooOo0o;

            /* JADX INFO: renamed from: o0OO00o0.o00O$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LabelRepoImpl$getLabelsForPageIds$lambda$16$$inlined$map$1$2", m80623f = "LabelRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19791OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f91631OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f91632OooOo0o;

                public C19791OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f91632OooOo0o = obj;
                    this.f91631OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str) {
                this.f91630OooOo0o = interfaceC33723OooO0oO;
                this.f91629OooOo = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19791OooO00o c19791OooO00o;
                if (continuation instanceof C19791OooO00o) {
                    c19791OooO00o = (C19791OooO00o) continuation;
                    int i = c19791OooO00o.f91631OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19791OooO00o.f91631OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19791OooO00o = new C19791OooO00o(continuation);
                    }
                }
                Object obj2 = c19791OooO00o.f91632OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19791OooO00o.f91631OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    Map mapOooO0o0 = oOo000Oo.Oooo0.OooO0o0(new C32443OooOOO(this.f91629OooOo, (Map) obj));
                    c19791OooO00o.f91631OooOo = 1;
                    if (this.f91630OooOo0o.emit(mapOooO0o0, c19791OooO00o) == enumC32485OooO00o) {
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

        public OooO0O0(C33763OoooOOO c33763OoooOOO, String str) {
            this.f91628OooOo0o = c33763OoooOOO;
            this.f91627OooOo = str;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super Map<String, ? extends Map<String, ? extends List<? extends Label>>>> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f91628OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91627OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public o00O(oo0oO0.o000O0Oo labelDao, LabelMapper labelMapper, LabelRefMapper labelRefMapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(labelDao, "labelDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(labelMapper, "labelMapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(labelRefMapper, "labelRefMapper");
        this.f91622OooO00o = labelDao;
        this.f91623OooO0O0 = labelMapper;
        this.f91624OooO0OO = labelRefMapper;
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final Object OooO(long j, C27797OooO0o c27797OooO0o) {
        Object objOooO = this.f91622OooO00o.OooO(j, c27797OooO0o);
        return objOooO == EnumC32485OooO00o.f116726OooOo0o ? objOooO : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C26601o00O0oOO OooO00o(List list) {
        return new C26601o00O0oOO(this.f91622OooO00o.OooO00o(list), this);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C26599o00O0o0o OooO0O0(long j) {
        return new C26599o00O0o0o(this.f91622OooO00o.OooO0O0(j), this);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C26602o00O0oOo OooO0OO(List list) {
        return new C26602o00O0oOo(this.f91622OooO00o.OooO0OO(list), this);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C26604o00O0oo0 OooO0Oo() {
        return new C26604o00O0oo0(this.f91622OooO00o.OooO0Oo(), this);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final InterfaceC33721OooO0o OooO0o(ArrayList arrayList) {
        return this.f91622OooO00o.OooO0o(arrayList);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final Object OooO0o0(long j, C27797OooO0o c27797OooO0o) {
        Object objOooO0o0 = this.f91622OooO00o.OooO0o0(j, c27797OooO0o);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C26598o00O0o0O OooO0oO(List list) {
        return new C26598o00O0o0O(this.f91622OooO00o.OooO0oO(list), this);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C26600o00O0oO OooO0oo(int i) {
        return new C26600o00O0oO(this.f91622OooO00o.OooO0oo(i), this);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final Object OooOO0(LabelRef labelRef, C27794OooO0O0 c27794OooO0O0) {
        ItemLabelCrossRef entity = this.f91624OooO0OO.toEntity(labelRef);
        kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
        Object objOooOOO = this.f91622OooO00o.OooOOO(entity, c27794OooO0O0);
        return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C33763OoooOOO OooOO0O(List list) {
        oo0oO0.o000O0Oo o000o0oo2 = this.f91622OooO00o;
        return new C33763OoooOOO(o000o0oo2.OooOO0O(list), o000o0oo2.OooO0Oo(), new C26605o00O0ooo(this, null));
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final Object OooOO0o(int i, long j, String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooOOOO = this.f91622OooO00o.OooOOOO(i, j, str, str2, abstractC32479OooO0OO);
        return objOooOOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOOO : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final Object OooOOO(Label label, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        LabelEntity entity = this.f91623OooO0O0.toEntity(label);
        kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
        return this.f91622OooO00o.OooOOOo(entity, abstractC32479OooO0OO);
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final List OooOOO0() {
        return oOo000Oo.OooOOO.OoooOO0(LabelColor.values());
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final C33763OoooOOO OooOOOO(List list) {
        oo0oO0.o000O0Oo o000o0oo2 = this.f91622OooO00o;
        return new C33763OoooOOO(o000o0oo2.OooOOO0(list), o000o0oo2.OooO0Oo(), new C26603o00O0oo(this, null));
    }

    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    public final InterfaceC33721OooO0o<Map<String, Map<String, List<Label>>>> OooOOOo(Map<String, ? extends List<String>> map) {
        Object obj;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, ? extends List<String>>> it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends List<String>> next = it.next();
            String key = next.getKey();
            List<String> value = next.getValue();
            oo0oO0.o000O0Oo o000o0oo2 = this.f91622OooO00o;
            arrayList.add(new OooO0O0(new C33763OoooOOO(o000o0oo2.OooOO0o(key), o000o0oo2.OooO0Oo(), new o00OO000(value, this, null)), key));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            while (it2.hasNext()) {
                next2 = new C33763OoooOOO((InterfaceC33721OooO0o) next2, (InterfaceC33721OooO0o) it2.next(), new OooO00o(3, null));
            }
            obj = next2;
        }
        InterfaceC33721OooO0o<Map<String, Map<String, List<Label>>>> interfaceC33721OooO0o = (InterfaceC33721OooO0o) obj;
        return interfaceC33721OooO0o == null ? new C33716OooO(C34436OooOoOO.f123455OooOo0o) : interfaceC33721OooO0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r9.OooOOOo(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo(Label label, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00OO00O o00oo00o;
        o00O o00o2;
        if (abstractC32479OooO0OO instanceof o00OO00O) {
            o00oo00o = (o00OO00O) abstractC32479OooO0OO;
            int i = o00oo00o.f91791OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo00o.f91791OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00oo00o = new o00OO00O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOo0 = o00oo00o.f91790OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo00o.f91791OooOoOO;
        boolean z = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOo0);
            long id = label.getId();
            o00oo00o.f91788OooOo0o = this;
            o00oo00o.f91787OooOo = label;
            o00oo00o.f91791OooOoOO = 1;
            objOooOOo0 = this.f91622OooO00o.OooOOo0(id, o00oo00o);
            if (objOooOOo0 != enumC32485OooO00o) {
                o00o2 = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOo0);
            return Boolean.valueOf(z);
        }
        label = o00oo00o.f91787OooOo;
        o00o2 = o00oo00o.f91788OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOo0);
        if (((LabelEntity) objOooOOo0) != null) {
            oo0oO0.o000O0Oo o000o0oo2 = o00o2.f91622OooO00o;
            LabelEntity entity = o00o2.f91623OooO0O0.toEntity(label);
            kotlin.jvm.internal.OooOOO0.OooO0o(entity, "toEntity(...)");
            o00oo00o.f91788OooOo0o = null;
            o00oo00o.f91787OooOo = null;
            o00oo00o.f91791OooOoOO = 2;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27306OooOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26595o00O0o c26595o00O0o;
        o00O o00o2;
        if (abstractC32479OooO0OO instanceof C26595o00O0o) {
            c26595o00O0o = (C26595o00O0o) abstractC32479OooO0OO;
            int i = c26595o00O0o.f91718OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26595o00O0o.f91718OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26595o00O0o = new C26595o00O0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0 = c26595o00O0o.f91716OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26595o00O0o.f91718OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0);
            c26595o00O0o.f91717OooOo0o = this;
            c26595o00O0o.f91718OooOoO = 1;
            objOooOO0 = this.f91622OooO00o.OooOO0(str, c26595o00O0o);
            if (objOooOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            o00o2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00o2 = c26595o00O0o.f91717OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0);
        }
        LabelEntity labelEntity = (LabelEntity) objOooOO0;
        if (labelEntity != null) {
            return o00o2.f91623OooO0O0.toModel(labelEntity);
        }
        return null;
    }
}
