package com.orion.notein.data.repo.transactions;

import OooOoo0.o00000;
import Oooo.C20813OooO0o0;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.C21532OooOOo;
import com.android.billingclient.api.C22159OooO0Oo;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.OooO0O0;
import com.android.billingclient.api.Purchase;
import com.google.gson.Gson;
import com.orion.notein.data.repo.transactions.GoogleBillingDataSource.OooO00o;
import com.orion.notein.domain.models.transactions.google.ProductPurchase;
import com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24030OooOoo;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OOOOOo.InterfaceC27155OooO00o;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooOO.C32466OooO0OO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;
import oOo00O0O.C34467OooOo0;
import oo0oO0.InterfaceC34952o00oo0oO;

/* JADX INFO: loaded from: classes9.dex */
public final class GoogleBillingDataSource {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Handler f70019OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27155OooO00o f70020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC34952o00oo0oO f70021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f70022OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f70023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33898OooO0Oo f70024OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f70025OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C22162OooO0oo f70026OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C22162OooO0oo f70027OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final AtomicInteger f70028OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicLong f70029OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f70030OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final double f70031OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f70032OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final String f70033OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Gson f70034OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33781o00o0O f70035OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final oOo00O0O.OooOo00 f70036OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33769Ooooo0o f70037OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final RunnableC22938OooOoo f70038OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C22159OooO0Oo f70039OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f70040OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C22924OooO0o0 f70041OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final RunnableC22939OooOoo0 f70042OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Long> f70016OooOoO0 = C24340OooO0oo.OooO0Oo("key_last_query_purchases_from_server_time");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Long> f70015OooOoO = C24340OooO0oo.OooO0Oo("key_query_purchases_from_server_interval");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<Set<String>> f70017OooOoOO = C24340OooO0oo.OooO0o("key_purchases");

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final AbstractC24338OooO0o0.OooO00o<String> f70018OooOoo0 = C24340OooO0oo.OooO0o0("key_free_trial");

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$acknowledgePurchaseUnchecked$1$1", m80623f = "GoogleBillingDataSource.kt", m80624l = {918}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70044OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C22162OooO0oo f70045OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C22162OooO0oo c22162OooO0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f70045OooOoO0 = c22162OooO0oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return GoogleBillingDataSource.this.new OooO00o(this.f70045OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70044OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C22162OooO0oo c22162OooO0oo = this.f70045OooOoO0;
                int i2 = c22162OooO0oo.f66936OooO00o;
                String str = c22162OooO0oo.f66938OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0o(str, "getDebugMessage(...)");
                this.f70044OooOo0o = 1;
                if (GoogleBillingDataSource.OooO0Oo(GoogleBillingDataSource.this, i2, str, this) == enumC32485OooO00o) {
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

    public GoogleBillingDataSource(InterfaceC27155OooO00o apiService, InterfaceC34952o00oo0oO playPurchaseDao, AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, o0000o0O.OooOO0 dataStore) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(apiService, "apiService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(playPurchaseDao, "playPurchaseDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f70020OooO00o = apiService;
        this.f70021OooO0O0 = playPurchaseDao;
        this.f70022OooO0OO = abstractApplicationC26277OooOoOO;
        this.f70023OooO0Oo = dataStore;
        this.f70024OooO0o = C33900OooO0o0.OooO00o();
        C22162OooO0oo c22162OooO0oo = new C22162OooO0oo();
        this.f70026OooO0oO = c22162OooO0oo;
        this.f70027OooO0oo = c22162OooO0oo;
        this.f70019OooO = new Handler(Looper.getMainLooper());
        int i = 0;
        this.f70028OooOO0 = new AtomicInteger(0);
        this.f70029OooOO0O = new AtomicLong(1000L);
        this.f70030OooOO0o = 1000L;
        this.f70032OooOOO0 = 60000L;
        this.f70031OooOOO = 2.0d;
        this.f70033OooOOOO = abstractApplicationC26277OooOoOO.getPackageName();
        this.f70034OooOOOo = new Gson();
        this.f70036OooOOo0 = C34467OooOo0.OooO00o(new com.orion.notein.data.repo.transactions.OooO00o(i));
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(c34434OooOoO);
        this.f70035OooOOo = c33781o00o0OOooO00o;
        C22941OooOooo c22941OooOooo = new C22941OooOooo(dataStore.getData(), this, i);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C25252OooO0Oo.OooOoO0(c22941OooOooo, C33633Oooo0.OooO00o(executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(3), null);
        Oooo000 oooo000 = new Oooo000(playPurchaseDao.OooO0OO("inapp"), this);
        C22943Oooo00O c22943Oooo00O = new C22943Oooo00O(playPurchaseDao.OooO0OO("subs"), this);
        C33763OoooOOO c33763OoooOOO = new C33763OoooOOO(oooo000, c33781o00o0OOooO00o, new OooOOO0(3, null));
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(executorC33873OooO0O0);
        oO0000oo.OooO0OO oooO0OO = InterfaceC33788ooOO.OooO00o.f121818OooO00o;
        this.f70037OooOOoo = C25252OooO0Oo.OooOoO0(c33763OoooOOO, c33822OooO0OOOooO00o, oooO0OO, c34434OooOoO);
        this.f70040OooOo00 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c22943Oooo00O, c33781o00o0OOooO00o, new C22944Oooo00o(3, null)), C33633Oooo0.OooO00o(executorC33873OooO0O0), oooO0OO, c34434OooOoO);
        C21532OooOOo c21532OooOOo = new C21532OooOOo();
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(abstractApplicationC26277OooOoOO);
        oooO00o.f66891OooO0OO = c21532OooOOo;
        oooO00o.f66889OooO00o = new com.android.billingclient.api.OooOO0();
        C22159OooO0Oo c22159OooO0OoOooO00o = oooO00o.OooO00o();
        this.f70039OooOo0 = c22159OooO0OoOooO00o;
        C22924OooO0o0 c22924OooO0o0 = new C22924OooO0o0(this);
        this.f70041OooOo0O = c22924OooO0o0;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(executorC33873OooO0O0), null, null, new OooO0OO(this, null), 3);
        c22159OooO0OoOooO00o.OooO0o0(c22924OooO0o0);
        this.f70042OooOo0o = new RunnableC22939OooOoo0(this);
        this.f70038OooOo = new RunnableC22938OooOoo(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r7.OooOO0(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO00o(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOOO oooOOO;
        googleBillingDataSource.getClass();
        if (abstractC32479OooO0OO instanceof OooOOO) {
            oooOOO = (OooOOO) abstractC32479OooO0OO;
            int i = oooOOO.f70086OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f70086OooOoO = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(googleBillingDataSource, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = oooOOO.f70084OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOO.f70086OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            oooOOO.f70085OooOo0o = googleBillingDataSource;
            oooOOO.f70086OooOoO = 1;
            objOooOO0o = googleBillingDataSource.OooOO0o(oooOOO);
            if (objOooOO0o != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOO0o);
            return C32460OooOooO.f116667OooO00o;
        }
        googleBillingDataSource = oooOOO.f70085OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOO0o);
        Map map = (Map) objOooOO0o;
        List list = (List) map.get("inapp");
        List list2 = (List) map.get("subs");
        if (list == null || list2 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0OO("queryAndUpdatePurchasesServerLocked error. inAppPurchases: " + list + ", subPurchases: " + list2, new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        Map mapOooO0oo = C34444Oooo0O0.OooO0oo(new C32443OooOOO("inapp", list), new C32443OooOOO("subs", list2));
        oooOOO.f70085OooOo0o = null;
        oooOOO.f70086OooOoO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ab, code lost:
    
        if (r9.OooOOOO(r0, r2) == r3) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cc, code lost:
    
        if (r0 == r3) goto L161;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0244 A[LOOP:4: B:102:0x023e->B:104:0x0244, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027e A[PHI: r0 r1 r4 r9
      0x027e: PHI (r0v23 java.util.List) = (r0v31 java.util.List), (r0v32 java.util.List) binds: [B:106:0x027a, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r1v26 java.lang.Object) = (r1v25 java.lang.Object), (r1v1 java.lang.Object) binds: [B:106:0x027a, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r4v16 java.util.List) = (r4v31 java.util.List), (r4v32 java.util.List) binds: [B:106:0x027a, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r9v15 com.orion.notein.data.repo.transactions.GoogleBillingDataSource) = 
      (r9v11 com.orion.notein.data.repo.transactions.GoogleBillingDataSource)
      (r9v16 com.orion.notein.data.repo.transactions.GoogleBillingDataSource)
     binds: [B:106:0x027a, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0295 A[LOOP:0: B:109:0x028f->B:111:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0O0(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22935OooOoO c22935OooOoO;
        C22162OooO0oo c22162OooO0oo;
        List list;
        List list2;
        GoogleBillingDataSource googleBillingDataSource2;
        List list3;
        List list4;
        GoogleBillingDataSource googleBillingDataSource3;
        List list5;
        C32465OooO0O0 c32465OooO0O0;
        List list6;
        List list7;
        ListIterator listIterator;
        C32465OooO0O0.C20232OooO0O0 c20232OooO0O0;
        GoogleBillingDataSource googleBillingDataSource4 = googleBillingDataSource;
        googleBillingDataSource4.getClass();
        if (abstractC32479OooO0OO instanceof C22935OooOoO) {
            c22935OooOoO = (C22935OooOoO) abstractC32479OooO0OO;
            int i = c22935OooOoO.f70141OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22935OooOoO.f70141OooOoo = i - Integer.MIN_VALUE;
            } else {
                c22935OooOoO = new C22935OooOoO(googleBillingDataSource4, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c22935OooOoO.f70140OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        boolean z = false;
        switch (c22935OooOoO.f70141OooOoo) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooOOO0);
                if (!googleBillingDataSource4.f70039OooOo0.OooOOOo()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o.OooO0o0("restorePurchasesLocked: BillingClient is not ready", new Object[0]);
                    Handler handler = googleBillingDataSource4.f70019OooO;
                    RunnableC22939OooOoo0 runnableC22939OooOoo0 = googleBillingDataSource4.f70042OooOo0o;
                    handler.removeCallbacks(runnableC22939OooOoo0);
                    c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o.OooO0o0("retryBillingConnectionInstantly", new Object[0]);
                    handler.postDelayed(runnableC22939OooOoo0, googleBillingDataSource4.f70030OooOO0o);
                    synchronized (googleBillingDataSource4.f70027OooO0oo) {
                        c22162OooO0oo = googleBillingDataSource4.f70027OooO0oo;
                    }
                    return kotlin.jvm.internal.OooOOO0.OooO0O0(c22162OooO0oo, googleBillingDataSource4.f70026OooO0oO) ? new C27174OooO0O0(false, null, "310001", "BillingClient is not ready. Please try again later.", 2) : new C27174OooO0O0(false, null, String.valueOf(c22162OooO0oo.f66936OooO00o), c22162OooO0oo.f66938OooO0OO, 2);
                }
                c22935OooOoO.f70137OooOo0o = googleBillingDataSource4;
                c22935OooOoO.f70141OooOoo = 1;
                objOooOOO0 = googleBillingDataSource4.OooOOO0("subs", c22935OooOoO);
                if (objOooOOO0 != enumC32485OooO00o) {
                    list = (List) objOooOOO0;
                    if (list != null) {
                        return new C27174OooO0O0(false, null, "310005", "Failed to query subscription purchases from Play Store cache", 2);
                    }
                    c22935OooOoO.f70137OooOo0o = googleBillingDataSource4;
                    c22935OooOoO.f70136OooOo = list;
                    c22935OooOoO.f70141OooOoo = 2;
                    Object objOooOOO02 = googleBillingDataSource4.OooOOO0("inapp", c22935OooOoO);
                    if (objOooOOO02 != enumC32485OooO00o) {
                        list2 = list;
                        objOooOOO0 = objOooOOO02;
                        googleBillingDataSource2 = googleBillingDataSource4;
                        list3 = (List) objOooOOO0;
                        if (list3 != null) {
                            return new C27174OooO0O0(false, null, "310005", "Failed to query in-app purchases from Play Store cache", 2);
                        }
                        ArrayList<Purchase> arrayListOooooOO = oOo000Oo.OooOo.OooooOO(list2, list3);
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
                        c20358OooO00o2.OooO0o0("queryPurchases from play store successful. " + arrayListOooooOO, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        C24030OooOoo c24030OooOoo = new C24030OooOoo();
                        for (Purchase purchase : arrayListOooooOO) {
                            boolean z2 = purchase.OooO0O0() == 1 ? true : z;
                            boolean z3 = (z2 && purchase.OooO0Oo()) ? true : z;
                            c24030OooOoo.f80938OooOo0o = c24030OooOoo.f80938OooOo0o || z3;
                            if (z2 && !z3) {
                                arrayList.add(purchase);
                            }
                            z = false;
                        }
                        if (!c24030OooOoo.f80938OooOo0o) {
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    googleBillingDataSource2.OooO0o0((Purchase) it.next(), true);
                                }
                            }
                            if (list3.isEmpty() && list2.isEmpty()) {
                                return new C27174OooO0O0(false, null, "310005", "No purchases found. Please ensure you have completed the purchase or clear Play Store data and try again.", 2);
                            }
                            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                            c22935OooOoO.f70137OooOo0o = googleBillingDataSource2;
                            c22935OooOoO.f70136OooOo = list2;
                            c22935OooOoO.f70139OooOoO0 = c32465OooO0O0OooO0Oo;
                            c22935OooOoO.f70138OooOoO = c32465OooO0O0OooO0Oo;
                            c22935OooOoO.f70141OooOoo = 4;
                            objOooOOO0 = googleBillingDataSource2.OooOO0O(list3, c22935OooOoO);
                            if (objOooOOO0 != enumC32485OooO00o) {
                                list4 = list2;
                                googleBillingDataSource3 = googleBillingDataSource2;
                                list5 = c32465OooO0O0OooO0Oo;
                                c32465OooO0O0 = c32465OooO0O0OooO0Oo;
                                List<ProductPurchase> list8 = (List) objOooOOO0;
                                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list8, 10));
                                for (ProductPurchase productPurchase : list8) {
                                    arrayList2.add(new TinyPurchase(productPurchase.getPurchaseToken(), productPurchase.isPurchased(), productPurchase.isAcknowledged(), false, 8, null));
                                }
                                c32465OooO0O0.addAll(arrayList2);
                                c22935OooOoO.f70137OooOo0o = googleBillingDataSource3;
                                c22935OooOoO.f70136OooOo = list5;
                                c22935OooOoO.f70139OooOoO0 = c32465OooO0O0;
                                c22935OooOoO.f70138OooOoO = null;
                                c22935OooOoO.f70141OooOoo = 5;
                                objOooOOO0 = googleBillingDataSource3.OooOOO(list4, c22935OooOoO);
                                list7 = c32465OooO0O0;
                                list6 = list5;
                                if (objOooOOO0 != enumC32485OooO00o) {
                                    List<SubscriptionPurchaseV2> list9 = (List) objOooOOO0;
                                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list9, 10));
                                    for (SubscriptionPurchaseV2 subscriptionPurchaseV2 : list9) {
                                        arrayList3.add(new TinyPurchase(subscriptionPurchaseV2.getPurchaseToken(), subscriptionPurchaseV2.isPurchased(), subscriptionPurchaseV2.isAcknowledged(), false, 8, null));
                                    }
                                    list7.addAll(arrayList3);
                                    C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(list6);
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o3.OooOOO0("GoogleBillingDataSource");
                                    c20358OooO00o3.OooO0o0("queryPurchases from server. " + c32465OooO0O0OooO0O0, new Object[0]);
                                    ArrayList arrayList4 = new ArrayList();
                                    C24030OooOoo c24030OooOoo2 = new C24030OooOoo();
                                    C24030OooOoo c24030OooOoo3 = new C24030OooOoo();
                                    listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                                    while (true) {
                                        c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                                        if (c20232OooO0O0.hasNext()) {
                                            if (c32465OooO0O0OooO0O0.isEmpty()) {
                                                return new C27174OooO0O0(false, null, "310002", "No purchases found. Please check your network connection.", 2);
                                            }
                                            if (!c24030OooOoo2.f80938OooOo0o) {
                                                return new C27174OooO0O0(false, null, "310003", "No purchased order found. Please ensure you have completed the purchase.", 2);
                                            }
                                            if (!c24030OooOoo3.f80938OooOo0o) {
                                                HashSet hashSet = new HashSet();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj : arrayList4) {
                                                    if (hashSet.add(((TinyPurchase) obj).getPurchaseToken())) {
                                                        arrayList5.add(obj);
                                                    }
                                                }
                                                Iterator it2 = arrayList5.iterator();
                                                while (it2.hasNext()) {
                                                    googleBillingDataSource3.OooO0o(((TinyPurchase) it2.next()).getPurchaseToken(), true);
                                                }
                                                return new C27174OooO0O0(false, null, "310004", "No acknowledged order found. Please try again later.", 2);
                                            }
                                            c22935OooOoO.f70137OooOo0o = null;
                                            c22935OooOoO.f70136OooOo = null;
                                            c22935OooOoO.f70139OooOoO0 = null;
                                            c22935OooOoO.f70141OooOoo = 6;
                                            break;
                                        } else {
                                            TinyPurchase tinyPurchase = (TinyPurchase) c20232OooO0O0.next();
                                            boolean zIsPurchased = tinyPurchase.isPurchased();
                                            boolean z4 = zIsPurchased && tinyPurchase.isAcknowledged();
                                            c24030OooOoo2.f80938OooOo0o = c24030OooOoo2.f80938OooOo0o || zIsPurchased;
                                            c24030OooOoo3.f80938OooOo0o = c24030OooOoo3.f80938OooOo0o || z4;
                                            if (zIsPurchased && !z4) {
                                                arrayList4.add(tinyPurchase);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c22935OooOoO.f70137OooOo0o = null;
                            c22935OooOoO.f70136OooOo = null;
                            c22935OooOoO.f70141OooOoo = 3;
                            C33781o00o0O c33781o00o0O = googleBillingDataSource2.f70035OooOOo;
                            ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayListOooooOO, 10));
                            for (Purchase purchase2 : arrayListOooooOO) {
                                TinyPurchase.INSTANCE.getClass();
                                arrayList6.add(TinyPurchase.Companion.OooO00o(purchase2));
                            }
                            c33781o00o0O.getClass();
                            c33781o00o0O.OooOO0(null, arrayList6);
                            Object objOooO00o = C24332OooO.OooO00o(googleBillingDataSource2.f70023OooO0Oo, new C22945Oooo0O0(arrayListOooooOO, null), c22935OooOoO);
                            if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                                objOooO00o = C32460OooOooO.f116667OooO00o;
                            }
                            break;
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                googleBillingDataSource4 = c22935OooOoO.f70137OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                list = (List) objOooOOO0;
                if (list != null) {
                }
                break;
            case 2:
                List list10 = c22935OooOoO.f70136OooOo;
                googleBillingDataSource2 = c22935OooOoO.f70137OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                list2 = list10;
                list3 = (List) objOooOOO0;
                if (list3 != null) {
                }
                break;
            case 3:
                C32446OooOOOo.OooO0O0(objOooOOO0);
                return new C27174OooO0O0(true, null, "0", null, 10);
            case 4:
                C32465OooO0O0 c32465OooO0O02 = c22935OooOoO.f70138OooOoO;
                List list11 = c22935OooOoO.f70139OooOoO0;
                List list12 = c22935OooOoO.f70136OooOo;
                GoogleBillingDataSource googleBillingDataSource5 = c22935OooOoO.f70137OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                list4 = list12;
                googleBillingDataSource3 = googleBillingDataSource5;
                c32465OooO0O0 = c32465OooO0O02;
                list5 = list11;
                List<ProductPurchase> list82 = (List) objOooOOO0;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list82, 10));
                while (r1.hasNext()) {
                }
                c32465OooO0O0.addAll(arrayList22);
                c22935OooOoO.f70137OooOo0o = googleBillingDataSource3;
                c22935OooOoO.f70136OooOo = list5;
                c22935OooOoO.f70139OooOoO0 = c32465OooO0O0;
                c22935OooOoO.f70138OooOoO = null;
                c22935OooOoO.f70141OooOoo = 5;
                objOooOOO0 = googleBillingDataSource3.OooOOO(list4, c22935OooOoO);
                list7 = c32465OooO0O0;
                list6 = list5;
                if (objOooOOO0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                List list13 = c22935OooOoO.f70139OooOoO0;
                List list14 = c22935OooOoO.f70136OooOo;
                googleBillingDataSource3 = c22935OooOoO.f70137OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO0);
                list7 = list13;
                list6 = list14;
                List<SubscriptionPurchaseV2> list92 = (List) objOooOOO0;
                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(list92, 10));
                while (r1.hasNext()) {
                }
                list7.addAll(arrayList32);
                C32465OooO0O0 c32465OooO0O0OooO0O02 = com.facebook.soloader.OooOo.OooO0O0(list6);
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o32.OooO0o0("queryPurchases from server. " + c32465OooO0O0OooO0O02, new Object[0]);
                ArrayList arrayList42 = new ArrayList();
                C24030OooOoo c24030OooOoo22 = new C24030OooOoo();
                C24030OooOoo c24030OooOoo32 = new C24030OooOoo();
                listIterator = c32465OooO0O0OooO0O02.listIterator(0);
                while (true) {
                    c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (c20232OooO0O0.hasNext()) {
                    }
                }
                break;
            case 6:
                C32446OooOOOo.OooO0O0(objOooOOO0);
                return new C27174OooO0O0(true, null, "0", null, 10);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void OooO0OO(GoogleBillingDataSource googleBillingDataSource) {
        Handler handler = googleBillingDataSource.f70019OooO;
        RunnableC22939OooOoo0 runnableC22939OooOoo0 = googleBillingDataSource.f70042OooOo0o;
        handler.removeCallbacks(runnableC22939OooOoo0);
        long j = googleBillingDataSource.f70029OooOO0O.get();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("GoogleBillingDataSource");
        c20358OooO00o.OooO0o0("retryBillingConnection after " + j + " ms", new Object[0]);
        handler.postDelayed(runnableC22939OooOoo0, j);
    }

    public static final Object OooO0Oo(GoogleBillingDataSource googleBillingDataSource, int i, String str, AbstractC32476OooO abstractC32476OooO) throws Throwable {
        googleBillingDataSource.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(C33833OooOOOO.f121946OooO00o, new C22937OooOoOO(googleBillingDataSource, i, str, null), abstractC32476OooO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    public final void OooO(long j) {
        Handler handler = this.f70019OooO;
        RunnableC22938OooOoo runnableC22938OooOoo = this.f70038OooOo;
        handler.removeCallbacks(runnableC22938OooOoo);
        handler.postDelayed(runnableC22938OooOoo, j);
    }

    public final void OooO0o(String str, final boolean z) {
        if (this.f70025OooO0o0) {
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C20813OooO0o0 c20813OooO0o0 = new C20813OooO0o0();
            c20813OooO0o0.f59765OooO00o = str;
            this.f70039OooOo0.OooO00o(c20813OooO0o0, new com.android.billingclient.api.OooO00o() { // from class: com.orion.notein.data.repo.transactions.OooO0O0
                @Override // com.android.billingclient.api.OooO00o
                public final void OooO00o(C22162OooO0oo billingResult) {
                    kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
                    int i = billingResult.f66936OooO00o;
                    GoogleBillingDataSource googleBillingDataSource = this.f70052OooO00o;
                    if (i == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                        c20358OooO00o.OooO0o0("acknowledgePurchase success", new Object[0]);
                        googleBillingDataSource.OooO(1000L);
                        return;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o2.OooO0o0("acknowledgePurchase error. " + billingResult, new Object[0]);
                    if (z) {
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(C33833OooOOOO.f121946OooO00o), null, null, googleBillingDataSource.new OooO00o(billingResult, null), 3);
                    }
                }
            });
        }
    }

    public final void OooO0o0(Purchase purchase, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(purchase, "purchase");
        if (purchase.OooO0O0() != 1 || purchase.OooO0Oo()) {
            return;
        }
        String strOooO0OO = purchase.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
        OooO0o(strOooO0OO, z);
    }

    public final Object OooO0oO(boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22925OooO0oO(z, this, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22927OooOO0o c22927OooOO0o;
        if (abstractC32479OooO0OO instanceof C22927OooOO0o) {
            c22927OooOO0o = (C22927OooOO0o) abstractC32479OooO0OO;
            int i = c22927OooOO0o.f70083OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22927OooOO0o.f70083OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c22927OooOO0o = new C22927OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c22927OooOO0o.f70082OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22927OooOO0o.f70083OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            if (!this.f70039OooOo0.OooOOOo()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o.OooO0OO("checkPendingPurchases: BillingClient is not ready", new Object[0]);
                return C34434OooOoO.f123453OooOo0o;
            }
            c22927OooOO0o.f70083OooOoO0 = 1;
            objOooOOO0 = OooOOO0(str, c22927OooOO0o);
            if (objOooOOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        List list = (List) objOooOOO0;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.OooO0O0() == 1 && !purchase.OooO0Oo()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0156, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r1, r2, r3) != r4) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(Map map, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOOOO oooOOOO;
        GoogleBillingDataSource googleBillingDataSource;
        List list;
        List list2;
        GoogleBillingDataSource googleBillingDataSource2;
        List list3;
        List list4;
        List list5;
        Map map2 = map;
        if (abstractC32479OooO0OO instanceof OooOOOO) {
            oooOOOO = (OooOOOO) abstractC32479OooO0OO;
            int i = oooOOOO.f70094OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f70094OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0O = oooOOOO.f70093OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOOOO.f70094OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0O);
            List list6 = (List) map2.get("inapp");
            if (list6 != null) {
                oooOOOO.f70091OooOo0o = this;
                oooOOOO.f70090OooOo = map2;
                oooOOOO.f70094OooOoOO = 1;
                objOooOO0O = OooOO0O(list6, oooOOOO);
                if (objOooOO0O != enumC32485OooO00o) {
                    googleBillingDataSource = this;
                }
                return enumC32485OooO00o;
            }
            googleBillingDataSource = this;
            list = null;
            list2 = (List) map2.get("subs");
            if (list2 != null) {
                googleBillingDataSource2 = googleBillingDataSource;
                list3 = list;
                list4 = null;
                if (list3 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o.OooO0OO("queryPurchasesFromServer error", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            oooOOOO.f70091OooOo0o = googleBillingDataSource;
            oooOOOO.f70090OooOo = list;
            oooOOOO.f70094OooOoOO = 2;
            Object objOooOOO = googleBillingDataSource.OooOOO(list2, oooOOOO);
            if (objOooOOO != enumC32485OooO00o) {
                List list7 = list;
                objOooOO0O = objOooOOO;
                list5 = list7;
                list4 = (List) objOooOO0O;
                GoogleBillingDataSource googleBillingDataSource3 = googleBillingDataSource;
                list3 = list5;
                googleBillingDataSource2 = googleBillingDataSource3;
                if (list3 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o2.OooO0OO("queryPurchasesFromServer error", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            map2 = (Map) oooOOOO.f70090OooOo;
            googleBillingDataSource = oooOOOO.f70091OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
        } else {
            if (i2 == 2) {
                list5 = (List) oooOOOO.f70090OooOo;
                googleBillingDataSource = oooOOOO.f70091OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOO0O);
                list4 = (List) objOooOO0O;
                GoogleBillingDataSource googleBillingDataSource32 = googleBillingDataSource;
                list3 = list5;
                googleBillingDataSource2 = googleBillingDataSource32;
                if (list3 != null || list4 == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o22.OooO0OO("queryPurchasesFromServer error", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                List<ProductPurchase> list8 = list3;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list8, 10));
                for (ProductPurchase purchase : list8) {
                    TinyPurchase.INSTANCE.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(purchase, "purchase");
                    arrayList.add(new TinyPurchase(purchase.getPurchaseToken(), purchase.isPurchased(), purchase.isAcknowledged(), false, 8, null));
                }
                c32465OooO0O0OooO0Oo.addAll(arrayList);
                List<SubscriptionPurchaseV2> list9 = list4;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list9, 10));
                for (SubscriptionPurchaseV2 purchase2 : list9) {
                    TinyPurchase.INSTANCE.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(purchase2, "purchase");
                    arrayList2.add(new TinyPurchase(purchase2.getPurchaseToken(), purchase2.isPurchased(), purchase2.isAcknowledged(), false, 8, null));
                }
                c32465OooO0O0OooO0Oo.addAll(arrayList2);
                C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                oooOOOO.f70091OooOo0o = googleBillingDataSource2;
                oooOOOO.f70090OooOo = null;
                oooOOOO.f70094OooOoOO = 3;
                if (googleBillingDataSource2.OooOOOO(c32465OooO0O0OooO0O0, oooOOOO) != enumC32485OooO00o) {
                    o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = googleBillingDataSource2.f70023OooO0Oo;
                    C22928OooOOOo c22928OooOOOo = new C22928OooOOOo(2, null);
                    oooOOOO.f70091OooOo0o = null;
                    oooOOOO.f70094OooOoOO = 4;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOO0O);
                return C32460OooOooO.f116667OooO00o;
            }
            googleBillingDataSource2 = oooOOOO.f70091OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0O);
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO022 = googleBillingDataSource2.f70023OooO0Oo;
            C22928OooOOOo c22928OooOOOo2 = new C22928OooOOOo(2, null);
            oooOOOO.f70091OooOo0o = null;
            oooOOOO.f70094OooOoOO = 4;
        }
        list = (List) objOooOO0O;
        list2 = (List) map2.get("subs");
        if (list2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:18:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b5 -> B:24:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22929OooOOo c22929OooOOo;
        List arrayList;
        Iterator it;
        GoogleBillingDataSource googleBillingDataSource;
        if (abstractC32479OooO0OO instanceof C22929OooOOo) {
            c22929OooOOo = (C22929OooOOo) abstractC32479OooO0OO;
            int i = c22929OooOOo.f70104OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22929OooOOo.f70104OooOooo = i - Integer.MIN_VALUE;
            } else {
                c22929OooOOo = new C22929OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22929OooOOo.f70101OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22929OooOOo.f70104OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            arrayList = new ArrayList();
            it = list.iterator();
            googleBillingDataSource = this;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = c22929OooOOo.f70102OooOoo0;
            Collection collection = c22929OooOOo.f70100OooOoOO;
            Purchase purchase = c22929OooOOo.f70098OooOoO;
            Iterator it3 = c22929OooOOo.f70099OooOoO0;
            List list2 = c22929OooOOo.f70096OooOo;
            GoogleBillingDataSource googleBillingDataSource2 = c22929OooOOo.f70097OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C22929OooOOo c22929OooOOo2 = c22929OooOOo;
            List list3 = list2;
            Purchase purchase2 = purchase;
            GoogleBillingDataSource googleBillingDataSource3 = googleBillingDataSource2;
            Collection collection2 = collection;
            ProductPurchase productPurchase = (ProductPurchase) obj;
            if (productPurchase != null) {
                collection2.add(productPurchase);
            }
            Iterator it4 = it3;
            Purchase purchase3 = purchase2;
            Collection arrayList2 = collection2;
            if (it2.hasNext()) {
                String str = (String) it2.next();
                String strOooO0OO = purchase3.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
                kotlin.jvm.internal.OooOOO0.OooO0Oo(str);
                c22929OooOOo2.f70097OooOo0o = googleBillingDataSource3;
                c22929OooOOo2.f70096OooOo = list3;
                c22929OooOOo2.f70099OooOoO0 = it4;
                c22929OooOOo2.f70098OooOoO = purchase3;
                c22929OooOOo2.f70100OooOoOO = arrayList2;
                c22929OooOOo2.f70102OooOoo0 = it2;
                c22929OooOOo2.f70104OooOooo = 1;
                googleBillingDataSource3.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22930OooOOo0(googleBillingDataSource3, strOooO0OO, str, null), c22929OooOOo2);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                Purchase purchase4 = purchase3;
                it3 = it4;
                obj = objOooO0o;
                collection2 = arrayList2;
                purchase2 = purchase4;
                ProductPurchase productPurchase2 = (ProductPurchase) obj;
                if (productPurchase2 != null) {
                }
                Iterator it42 = it3;
                Purchase purchase32 = purchase2;
                Collection arrayList22 = collection2;
                if (it2.hasNext()) {
                    list3.addAll((List) arrayList22);
                    it = it42;
                    arrayList = list3;
                    c22929OooOOo = c22929OooOOo2;
                    googleBillingDataSource = googleBillingDataSource3;
                    if (it.hasNext()) {
                        return arrayList;
                    }
                    Purchase purchase5 = (Purchase) it.next();
                    ArrayList arrayListOooO00o = purchase5.OooO00o();
                    arrayList22 = new ArrayList();
                    List list4 = arrayList;
                    it42 = it;
                    it2 = arrayListOooO00o.iterator();
                    purchase32 = purchase5;
                    googleBillingDataSource3 = googleBillingDataSource;
                    c22929OooOOo2 = c22929OooOOo;
                    list3 = list4;
                    if (it2.hasNext()) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooOO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22932OooOo0 c22932OooOo0;
        GoogleBillingDataSource googleBillingDataSource;
        String str;
        C32466OooO0OO c32466OooO0OO;
        Map map;
        Map map2;
        String str2;
        Map builder;
        Map map3;
        if (abstractC32479OooO0OO instanceof C22932OooOo0) {
            c22932OooOo0 = (C22932OooOo0) abstractC32479OooO0OO;
            int i = c22932OooOo0.f70124OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22932OooOo0.f70124OooOooO = i - Integer.MIN_VALUE;
            } else {
                c22932OooOo0 = new C22932OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c22932OooOo0.f70123OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22932OooOo0.f70124OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32466OooO0OO c32466OooO0OO2 = new C32466OooO0OO();
            c22932OooOo0.f70118OooOo0o = this;
            c22932OooOo0.f70117OooOo = c32466OooO0OO2;
            c22932OooOo0.f70120OooOoO0 = c32466OooO0OO2;
            c22932OooOo0.f70119OooOoO = "subs";
            c22932OooOo0.f70121OooOoOO = c32466OooO0OO2;
            c22932OooOo0.f70124OooOooO = 1;
            Object objOooOOO0 = OooOOO0("subs", c22932OooOo0);
            if (objOooOOO0 != enumC32485OooO00o) {
                googleBillingDataSource = this;
                str = "subs";
                C32466OooO0OO c32466OooO0OO3 = c32466OooO0OO2;
                obj = objOooOOO0;
                c32466OooO0OO = c32466OooO0OO3;
                map2 = c32466OooO0OO2;
                map = c32466OooO0OO3;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map4 = c22932OooOo0.f70120OooOoO0;
            str2 = (String) c22932OooOo0.f70117OooOo;
            Map map5 = (Map) c22932OooOo0.f70118OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            builder = map5;
            map3 = map4;
            map3.put(str2, obj);
            kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
            return ((C32466OooO0OO) builder).OooO0O0();
        }
        C32466OooO0OO c32466OooO0OO4 = c22932OooOo0.f70121OooOoOO;
        String str3 = c22932OooOo0.f70119OooOoO;
        Map map6 = c22932OooOo0.f70120OooOoO0;
        Map map7 = (Map) c22932OooOo0.f70117OooOo;
        googleBillingDataSource = (GoogleBillingDataSource) c22932OooOo0.f70118OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c32466OooO0OO = c32466OooO0OO4;
        map2 = map7;
        str = str3;
        map = map6;
        c32466OooO0OO.put(str, obj);
        c22932OooOo0.f70118OooOo0o = map2;
        c22932OooOo0.f70117OooOo = "inapp";
        c22932OooOo0.f70120OooOoO0 = map;
        c22932OooOo0.f70119OooOoO = null;
        c22932OooOo0.f70121OooOoOO = null;
        c22932OooOo0.f70124OooOooO = 2;
        Object objOooOOO02 = googleBillingDataSource.OooOOO0("inapp", c22932OooOo0);
        if (objOooOOO02 != enumC32485OooO00o) {
            Map map8 = map2;
            str2 = "inapp";
            obj = objOooOOO02;
            builder = map8;
            map3 = map;
            map3.put(str2, obj);
            kotlin.jvm.internal.OooOOO0.OooO0oO(builder, "builder");
            return ((C32466OooO0OO) builder).OooO0O0();
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0078 -> B:20:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        OooOo oooOo;
        Iterator it;
        GoogleBillingDataSource googleBillingDataSource;
        Collection collection;
        if (abstractC32479OooO0OO instanceof OooOo) {
            oooOo = (OooOo) abstractC32479OooO0OO;
            int i = oooOo.f70116OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f70116OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = oooOo.f70113OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo.f70116OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            googleBillingDataSource = this;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = oooOo.f70114OooOoO0;
            collection = oooOo.f70111OooOo;
            googleBillingDataSource = oooOo.f70112OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            SubscriptionPurchaseV2 subscriptionPurchaseV2 = (SubscriptionPurchaseV2) objOooO0o;
            if (subscriptionPurchaseV2 != null) {
                collection.add(subscriptionPurchaseV2);
            }
            if (it.hasNext()) {
                String strOooO0OO = ((Purchase) it.next()).OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
                oooOo.f70112OooOo0o = googleBillingDataSource;
                oooOo.f70111OooOo = collection;
                oooOo.f70114OooOoO0 = it;
                oooOo.f70116OooOoo0 = 1;
                googleBillingDataSource.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22934OooOo0o(googleBillingDataSource, strOooO0OO, null), oooOo);
                if (objOooO0o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                SubscriptionPurchaseV2 subscriptionPurchaseV22 = (SubscriptionPurchaseV2) objOooO0o;
                if (subscriptionPurchaseV22 != null) {
                }
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }

    public final Object OooOOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22933OooOo0O(this, str, null), abstractC32479OooO0OO);
    }

    public final Object OooOOOO(AbstractList abstractList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        this.f70035OooOOo.setValue(abstractList);
        Object objOooO00o = C24332OooO.OooO00o(this.f70023OooO0Oo, new Oooo0(abstractList, this, null), abstractC32479OooO0OO);
        return objOooO00o == EnumC32485OooO00o.f116726OooOo0o ? objOooO00o : C32460OooOooO.f116667OooO00o;
    }

    @Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\b\u0083\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\r¨\u0006\u001e"}, m80612d2 = {"Lcom/orion/notein/data/repo/transactions/GoogleBillingDataSource$TinyPurchase;", "", "", "purchaseToken", "", "isPurchased", "isAcknowledged", "isTiny", "<init>", "(Ljava/lang/String;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZZZ)Lcom/orion/notein/data/repo/transactions/GoogleBillingDataSource$TinyPurchase;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPurchaseToken", "Z", "Companion", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class TinyPurchase {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private final boolean isAcknowledged;
        private final boolean isPurchased;
        private final boolean isTiny;
        private final String purchaseToken;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.GoogleBillingDataSource$TinyPurchase$OooO00o, reason: from kotlin metadata */
        public static final class Companion {
            public static TinyPurchase OooO00o(Purchase purchase) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(purchase, "purchase");
                String strOooO0OO = purchase.OooO0OO();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
                return new TinyPurchase(strOooO0OO, purchase.OooO0O0() == 1, purchase.OooO0Oo(), false, 8, null);
            }
        }

        public TinyPurchase(String purchaseToken, boolean z, boolean z2, boolean z3) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
            this.purchaseToken = purchaseToken;
            this.isPurchased = z;
            this.isAcknowledged = z2;
            this.isTiny = z3;
        }

        public static /* synthetic */ TinyPurchase copy$default(TinyPurchase tinyPurchase, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tinyPurchase.purchaseToken;
            }
            if ((i & 2) != 0) {
                z = tinyPurchase.isPurchased;
            }
            if ((i & 4) != 0) {
                z2 = tinyPurchase.isAcknowledged;
            }
            if ((i & 8) != 0) {
                z3 = tinyPurchase.isTiny;
            }
            return tinyPurchase.copy(str, z, z2, z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsPurchased() {
            return this.isPurchased;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsAcknowledged() {
            return this.isAcknowledged;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsTiny() {
            return this.isTiny;
        }

        public final TinyPurchase copy(String purchaseToken, boolean isPurchased, boolean isAcknowledged, boolean isTiny) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
            return new TinyPurchase(purchaseToken, isPurchased, isAcknowledged, isTiny);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TinyPurchase)) {
                return false;
            }
            TinyPurchase tinyPurchase = (TinyPurchase) other;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.purchaseToken, tinyPurchase.purchaseToken) && this.isPurchased == tinyPurchase.isPurchased && this.isAcknowledged == tinyPurchase.isAcknowledged && this.isTiny == tinyPurchase.isTiny;
        }

        public final String getPurchaseToken() {
            return this.purchaseToken;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isTiny) + o00000.OooO0O0(o00000.OooO0O0(this.purchaseToken.hashCode() * 31, 31, this.isPurchased), 31, this.isAcknowledged);
        }

        public final boolean isAcknowledged() {
            return this.isAcknowledged;
        }

        public final boolean isPurchased() {
            return this.isPurchased;
        }

        public final boolean isTiny() {
            return this.isTiny;
        }

        public String toString() {
            return "TinyPurchase(purchaseToken=" + this.purchaseToken + ", isPurchased=" + this.isPurchased + ", isAcknowledged=" + this.isAcknowledged + ", isTiny=" + this.isTiny + ")";
        }

        public /* synthetic */ TinyPurchase(String str, boolean z, boolean z2, boolean z3, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, z, z2, (i & 8) != 0 ? true : z3);
        }
    }
}
