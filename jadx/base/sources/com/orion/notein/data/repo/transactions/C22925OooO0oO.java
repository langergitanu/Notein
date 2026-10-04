package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import com.aspose.words.EditingLanguage;
import com.huawei.hms.network.embedded.C18250l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$checkVipEntitlementServer$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {EditingLanguage.TURKMEN, EditingLanguage.PUNJABI_INDIA, EditingLanguage.ASSAMESE, EditingLanguage.KHMER, EditingLanguage.GALICIAN, 1223, EditingLanguage.KASHMIRI_ARABIC}, m80625m = "invokeSuspend")
public final class C22925OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f70065OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f70066OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public GoogleBillingDataSource f70067OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C33898OooO0Oo f70068OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f70069OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70070OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ boolean f70071OooOoo0;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooO0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$checkVipEntitlementServer$2$queryFunc$1", m80623f = "GoogleBillingDataSource.kt", m80624l = {1200, EditingLanguage.YIDDISH}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public GoogleBillingDataSource f70072OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public InterfaceC33895OooO00o f70073OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ GoogleBillingDataSource f70074OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f70075OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(GoogleBillingDataSource googleBillingDataSource, Continuation<? super OooO00o> continuation) {
            super(1, continuation);
            this.f70074OooOoO = googleBillingDataSource;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
            return new OooO00o(this.f70074OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            GoogleBillingDataSource googleBillingDataSource;
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            InterfaceC33895OooO00o interfaceC33895OooO00o2;
            Throwable th;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70075OooOoO0;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    googleBillingDataSource = this.f70074OooOoO;
                    interfaceC33895OooO00o = googleBillingDataSource.f70024OooO0o;
                    this.f70073OooOo0o = interfaceC33895OooO00o;
                    this.f70072OooOo = googleBillingDataSource;
                    this.f70075OooOoO0 = 1;
                    if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = this.f70073OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                googleBillingDataSource = this.f70072OooOo;
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f70073OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = interfaceC33895OooO00o3;
                this.f70073OooOo0o = interfaceC33895OooO00o;
                this.f70072OooOo = null;
                this.f70075OooOoO0 = 2;
                if (GoogleBillingDataSource.OooO00o(googleBillingDataSource, this) != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            } catch (Throwable th3) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                th = th3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22925OooO0oO(boolean z, GoogleBillingDataSource googleBillingDataSource, Continuation<? super C22925OooO0oO> continuation) {
        super(2, continuation);
        this.f70071OooOoo0 = z;
        this.f70070OooOoo = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22925OooO0oO(this.f70071OooOoo0, this.f70070OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C22925OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1.invoke(r13) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r1.invoke(r13) == r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[PHI: r14
      0x0107: PHI (r14v27 java.lang.Object) = (r14v26 java.lang.Object), (r14v0 java.lang.Object) binds: [B:48:0x0103, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        InterfaceC32507OooOO0o oooO00o;
        long jLongValue;
        Long l;
        ArrayList arrayList;
        Map linkedHashMap;
        C33898OooO0Oo c33898OooO0Oo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70069OooOoOO;
        GoogleBillingDataSource googleBillingDataSource = this.f70070OooOoo;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                jCurrentTimeMillis = System.currentTimeMillis();
                oooO00o = new OooO00o(googleBillingDataSource, null);
                if (this.f70071OooOoo0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o.OooO0o0("checkVipEntitlementServer. force query.", new Object[0]);
                    this.f70069OooOoOO = 1;
                    break;
                } else {
                    InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = googleBillingDataSource.f70023OooO0Oo.getData();
                    this.f70065OooOo = oooO00o;
                    this.f70066OooOo0o = jCurrentTimeMillis;
                    this.f70069OooOoOO = 2;
                    obj = C25252OooO0Oo.OooOOo(data, this);
                    if (obj != enumC32485OooO00o) {
                        AbstractC24338OooO0o0 abstractC24338OooO0o0 = (AbstractC24338OooO0o0) obj;
                        Long l2 = (Long) abstractC24338OooO0o0.OooO0OO(GoogleBillingDataSource.f70015OooOoO);
                        jLongValue = l2 == null ? l2.longValue() : C18250l0.g.f55493g;
                        l = (Long) abstractC24338OooO0o0.OooO0OO(GoogleBillingDataSource.f70016OooOoO0);
                        if (jCurrentTimeMillis - (l == null ? l.longValue() : 0L) <= jLongValue) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
                            c20358OooO00o2.OooO0o0("checkVipEntitlementServer. query.", new Object[0]);
                            this.f70065OooOo = null;
                            this.f70069OooOoOO = 3;
                            break;
                        } else {
                            if (((List) googleBillingDataSource.f70035OooOOo.getValue()).isEmpty()) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o3.OooOOO0("GoogleBillingDataSource");
                                c20358OooO00o3.OooOO0O("checkVipEntitlementServer. no purchase cache.", new Object[0]);
                                this.f70065OooOo = null;
                                this.f70069OooOoOO = 4;
                                if (C33644OoooO0.OooO00o(500L, this) != enumC32485OooO00o) {
                                }
                            }
                            this.f70065OooOo = null;
                            this.f70069OooOoOO = 5;
                            obj = googleBillingDataSource.OooOO0o(this);
                            if (obj != enumC32485OooO00o) {
                                Map map = (Map) obj;
                                List<List> listOooo0o0 = oOo000Oo.OooOo.Oooo0o0(map.values());
                                arrayList = new ArrayList();
                                for (List list : listOooo0o0) {
                                    ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((Purchase) it.next()).OooO0OO());
                                    }
                                    C34431OooOo0.OooOo0o(arrayList, arrayList2);
                                }
                                int iOooO00o = googleBillingDataSource.f70021OooO0O0.OooO00o(arrayList);
                                if (!arrayList.isEmpty() || arrayList.size() <= iOooO00o) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o4.OooOOO0("GoogleBillingDataSource");
                                    c20358OooO00o4.OooO0o0("checkVipEntitlementServer. nothing happened.", new Object[0]);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o5.OooOOO0("GoogleBillingDataSource");
                                c20358OooO00o5.OooO0o0("checkVipEntitlementServer. has new purchase record.", new Object[0]);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry entry : map.entrySet()) {
                                    if (((List) entry.getValue()) != null) {
                                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(linkedHashMap2.size()));
                                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                                    Object key = entry2.getKey();
                                    Object value = entry2.getValue();
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(value);
                                    linkedHashMap.put(key, (List) value);
                                }
                                this.f70065OooOo = linkedHashMap;
                                c33898OooO0Oo = googleBillingDataSource.f70024OooO0o;
                                this.f70068OooOoO0 = c33898OooO0Oo;
                                this.f70067OooOoO = googleBillingDataSource;
                                this.f70069OooOoOO = 6;
                                if (c33898OooO0Oo.OooO00o(this) != enumC32485OooO00o) {
                                    try {
                                        this.f70065OooOo = c33898OooO0Oo;
                                        this.f70068OooOoO0 = null;
                                        this.f70067OooOoO = null;
                                        this.f70069OooOoOO = 7;
                                        AbstractC24338OooO0o0.OooO00o<Long> oooO00o2 = GoogleBillingDataSource.f70016OooOoO0;
                                        if (googleBillingDataSource.OooOO0(linkedHashMap, this) != enumC32485OooO00o) {
                                            interfaceC33895OooO00o = c33898OooO0Oo;
                                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                            interfaceC33895OooO00o.OooOOO0(null);
                                            return C32460OooOooO.f116667OooO00o;
                                        }
                                    } catch (Throwable th2) {
                                        interfaceC33895OooO00o = c33898OooO0Oo;
                                        th = th2;
                                        interfaceC33895OooO00o.OooOOO0(null);
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 2:
                jCurrentTimeMillis = this.f70066OooOo0o;
                oooO00o = (InterfaceC32507OooOO0o) this.f70065OooOo;
                C32446OooOOOo.OooO0O0(obj);
                AbstractC24338OooO0o0 abstractC24338OooO0o02 = (AbstractC24338OooO0o0) obj;
                Long l22 = (Long) abstractC24338OooO0o02.OooO0OO(GoogleBillingDataSource.f70015OooOoO);
                if (l22 == null) {
                }
                l = (Long) abstractC24338OooO0o02.OooO0OO(GoogleBillingDataSource.f70016OooOoO0);
                if (jCurrentTimeMillis - (l == null ? l.longValue() : 0L) <= jLongValue) {
                }
                return enumC32485OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                this.f70065OooOo = null;
                this.f70069OooOoOO = 5;
                obj = googleBillingDataSource.OooOO0o(this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                Map map2 = (Map) obj;
                List<List> listOooo0o02 = oOo000Oo.OooOo.Oooo0o0(map2.values());
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                }
                int iOooO00o2 = googleBillingDataSource.f70021OooO0O0.OooO00o(arrayList);
                if (arrayList.isEmpty()) {
                    break;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o42.OooO0o0("checkVipEntitlementServer. nothing happened.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            case 6:
                googleBillingDataSource = this.f70067OooOoO;
                C33898OooO0Oo c33898OooO0Oo2 = this.f70068OooOoO0;
                linkedHashMap = (Map) this.f70065OooOo;
                C32446OooOOOo.OooO0O0(obj);
                c33898OooO0Oo = c33898OooO0Oo2;
                this.f70065OooOo = c33898OooO0Oo;
                this.f70068OooOoO0 = null;
                this.f70067OooOoO = null;
                this.f70069OooOoOO = 7;
                AbstractC24338OooO0o0.OooO00o<Long> oooO00o22 = GoogleBillingDataSource.f70016OooOoO0;
                if (googleBillingDataSource.OooOO0(linkedHashMap, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.f70065OooOo;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33895OooO00o.OooOOO0(null);
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
