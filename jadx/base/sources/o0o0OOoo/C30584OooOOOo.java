package o0o0OOoo;

import OooO0Oo.RunnableC20408OooOOOo;
import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.BundleKt;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.android.billingclient.api.C22159OooO0Oo;
import com.android.billingclient.api.C22161OooO0oO;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.OooO0O0;
import com.android.billingclient.api.OooOO0O;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.slides.C22227OoooO;
import com.google.gson.reflect.TypeToken;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleDeveloperOffer;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.Event;
import com.orion.notein.p607ui.pay.State;
import java.io.Serializable;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import o0OOo0Oo.InterfaceC27308OooOo0o;
import o0OOo0Oo.InterfaceC27315OooOooo;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import o0OoO000.C28546Oooo00O;
import o0oOoOo.C31042OooOOO0;
import o0oOoOo.C31058OooOooO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0o0OOoo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o0OOoo/OooOOOo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30584OooOOOo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f109399OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27300OooOOOo f109400OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27322Oooo0o0 f109401OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27315OooOooo f109402OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27308OooOo0o f109403OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f109404OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f109405OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f109406OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f109407OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33772OooooOo f109408OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f109409OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33772OooooOo f109410OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33781o00o0O f109411OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33772OooooOo f109412OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f109413OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33772OooooOo f109414OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f109415OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33781o00o0O f109416OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33781o00o0O f109417OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final AtomicBoolean f109418OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33769Ooooo0o f109419OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C22159OooO0Oo f109420OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final List<C31058OooOooO> f109421OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f109422OooOoOO;

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO00o */
    public static final class OooO00o implements com.android.billingclient.api.OooO0o {

        /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$1$onBillingSetupFinished$1", m80623f = "GooglePayViewModel.kt", m80624l = {239}, m80625m = "invokeSuspend")
        public static final class C20112OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30584OooOOOo f109424OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109425OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C22162OooO0oo f109426OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20112OooO00o(C30584OooOOOo c30584OooOOOo, C22162OooO0oo c22162OooO0oo, Continuation<? super C20112OooO00o> continuation) {
                super(2, continuation);
                this.f109424OooOo = c30584OooOOOo;
                this.f109426OooOoO0 = c22162OooO0oo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20112OooO00o(this.f109424OooOo, this.f109426OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C20112OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109425OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33772OooooOo c33772OooooOo = this.f109424OooOo.f109412OooOOo;
                    C22162OooO0oo c22162OooO0oo = this.f109426OooOoO0;
                    C32443OooOOO c32443OooOOO = new C32443OooOOO(new Integer(c22162OooO0oo.f66936OooO00o), c22162OooO0oo.f66938OooO0OO);
                    this.f109425OooOo0o = 1;
                    if (c33772OooooOo.emit(c32443OooOOO, this) == enumC32485OooO00o) {
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

        public OooO00o() {
        }

        @Override // com.android.billingclient.api.OooO0o
        public final void OooO00o(C22162OooO0oo billingResult) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PayViewModel");
            c20358OooO00o.OooO0o0("onBillingSetupFinished", new Object[0]);
            int i = billingResult.f66936OooO00o;
            C30584OooOOOo c30584OooOOOo = C30584OooOOOo.this;
            if (i == 0) {
                c30584OooOOOo.OooO0oo(Event.C23765OooO0oO.f78709OooO00o, null);
            } else {
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30584OooOOOo), null, null, new C20112OooO00o(c30584OooOOOo, billingResult, null), 3);
            }
        }

        @Override // com.android.billingclient.api.OooO0o
        public final void OooO0O0() {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PayViewModel");
            c20358OooO00o.OooO0o0("onBillingServiceDisconnected", new Object[0]);
            C30584OooOOOo c30584OooOOOo = C30584OooOOOo.this;
            c30584OooOOOo.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC20408OooOOOo(c30584OooOOOo, 3), 1000L);
        }
    }

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0O0 */
    @Metadata(m80611d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001¨\u0006\u0005"}, m80612d2 = {"o0o0OOoo/OooOOOo$OooO0O0", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO0O0 extends TypeToken<Map<String, ? extends List<? extends String>>> {
    }

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$privilegeList$1", m80623f = "GooglePayViewModel.kt", m80624l = {209}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends C31058OooOooO>>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f109427OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109428OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = C30584OooOOOo.this.new OooO0OO(continuation);
            oooO0OO.f109427OooOo = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends C31058OooOooO>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109428OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f109427OooOo;
                List<C31058OooOooO> list = C30584OooOOOo.this.f109421OooOoO0;
                this.f109428OooOo0o = 1;
                if (interfaceC33723OooO0oO.emit(list, this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$productVOList$1", m80623f = "GooglePayViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C30585OooO0Oo extends AbstractC32476OooO implements InterfaceC32511OooOOoo<List<? extends com.android.billingclient.api.OooOO0O>, List<? extends NoteinGoogleDeveloperOffer>, C31042OooOOO0, NoteinGoogleSubscriptionPurchase, Continuation<? super List<? extends C31042OooOOO0>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ List f109430OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f109431OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public /* synthetic */ NoteinGoogleSubscriptionPurchase f109432OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ C31042OooOOO0 f109433OooOoO0;

        public C30585OooO0Oo(Continuation<? super C30585OooO0Oo> continuation) {
            super(5, continuation);
        }

        @Override // oO0O000o.InterfaceC32511OooOOoo
        public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
            C30585OooO0Oo c30585OooO0Oo = C30584OooOOOo.this.new C30585OooO0Oo((Continuation) serializable);
            c30585OooO0Oo.f109431OooOo0o = (List) obj;
            c30585OooO0Oo.f109430OooOo = (List) obj2;
            c30585OooO0Oo.f109433OooOoO0 = (C31042OooOOO0) obj3;
            c30585OooO0Oo.f109432OooOoO = (NoteinGoogleSubscriptionPurchase) obj4;
            return c30585OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x041d  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x0423  */
        /* JADX WARN: Removed duplicated region for block: B:365:0x0417 A[SYNTHETIC] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object next;
            Iterator it;
            List list2;
            NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase;
            List<C31042OooOOO0> listOooo0o0;
            Object next2;
            List list3;
            NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase2;
            boolean z;
            boolean z2;
            ArrayList arrayList;
            Iterator it2;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Iterator it3;
            Iterator it4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Iterator it5;
            Object next3;
            OooOO0O.C22163OooO0Oo c22163OooO0Oo;
            Object next4;
            C31042OooOOO0 c31042OooOOO0;
            com.android.billingclient.api.OooOO0O oooOO0O;
            boolean z3;
            Iterator it6;
            Object next5;
            List list4;
            Object next6;
            OooOO0O.OooO00o OooO00o2;
            C30585OooO0Oo c30585OooO0Oo = this;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list5 = c30585OooO0Oo.f109431OooOo0o;
            List list6 = c30585OooO0Oo.f109430OooOo;
            C31042OooOOO0 c31042OooOOO02 = c30585OooO0Oo.f109433OooOoO0;
            NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase3 = c30585OooO0Oo.f109432OooOoO;
            if (list5 == null || list6 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PayViewModel");
                c20358OooO00o.OooO0OO("products or developerOffers is null", new Object[0]);
                return null;
            }
            String strOooO0OO = c31042OooOOO02 != null ? c31042OooOOO02.OooO0OO() : null;
            ArrayList arrayList7 = new ArrayList();
            Iterator it7 = list5.iterator();
            while (true) {
                boolean zHasNext = it7.hasNext();
                C30584OooOOOo c30584OooOOOo = C30584OooOOOo.this;
                if (!zHasNext) {
                    NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase4 = noteinGoogleSubscriptionPurchase3;
                    ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00(arrayList7);
                    final C30593OooOo00 c30593OooOo00 = new C30593OooOo00();
                    Iterable iterableO00O0O = oOo000Oo.OooOo.o00O0O(arrayListOooOo00, new Comparator() { // from class: o0o0OOoo.OooOo0
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            return ((Number) c30593OooOo00.invoke(obj2, obj3)).intValue();
                        }
                    });
                    if (noteinGoogleSubscriptionPurchase4 != null) {
                        c30584OooOOOo.getClass();
                        Iterable iterable = iterableO00O0O;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C31042OooOOO0) obj2).f110826OooO00o.f66948OooO0Oo, "subs")) {
                                arrayList8.add(obj2);
                            }
                        }
                        List<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem> lineItems = noteinGoogleSubscriptionPurchase4.getLineItems();
                        int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(lineItems, 10));
                        if (iOooO0Oo < 16) {
                            iOooO0Oo = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                        for (NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem subscriptionPurchaseLineItem : lineItems) {
                            linkedHashMap.put(subscriptionPurchaseLineItem.getProductId(), subscriptionPurchaseLineItem.getOfferDetails().getBasePlanId());
                        }
                        Iterator it8 = iterable.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it8.next();
                            C31042OooOOO0 c31042OooOOO03 = (C31042OooOOO0) next;
                            OooOO0O.C22163OooO0Oo c22163OooO0Oo2 = c31042OooOOO03.f110828OooO0OO;
                            String str = c22163OooO0Oo2 != null ? c22163OooO0Oo2.f66967OooO00o : null;
                            String str2 = c31042OooOOO03.f110826OooO00o.f66947OooO0OO;
                            kotlin.jvm.internal.OooOOO0.OooO0o(str2, "getProductId(...)");
                            if (str != null && kotlin.jvm.internal.OooOOO0.OooO0O0(linkedHashMap.get(str2), str)) {
                                break;
                            }
                        }
                        C31042OooOOO0 c31042OooOOO04 = (C31042OooOOO0) next;
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj3 : arrayList8) {
                            if (((C31042OooOOO0) obj3).f110828OooO0OO != null) {
                                arrayList9.add(obj3);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList();
                        for (Object obj4 : arrayList9) {
                            C31042OooOOO0 c31042OooOOO05 = (C31042OooOOO0) obj4;
                            if (linkedHashMap.containsKey(c31042OooOOO05.f110826OooO00o.f66947OooO0OO)) {
                                OooOO0O.C22163OooO0Oo c22163OooO0Oo3 = c31042OooOOO05.f110828OooO0OO;
                                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c22163OooO0Oo3 != null ? c22163OooO0Oo3.f66967OooO00o : null, linkedHashMap.get(c31042OooOOO05.f110826OooO00o.f66947OooO0OO));
                                boolean z4 = c31042OooOOO04 != null && c31042OooOOO04.f110831OooO0o0.ordinal() < c31042OooOOO05.f110831OooO0o0.ordinal();
                                if (zOooO0O0 || !z4) {
                                }
                            }
                            arrayList10.add(obj4);
                        }
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj5 : iterable) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C31042OooOOO0) obj5).f110826OooO00o.f66948OooO0Oo, "inapp")) {
                                arrayList11.add(obj5);
                            }
                        }
                        iterableO00O0O = oOo000Oo.OooOo.OooooOO(arrayList10, arrayList11);
                    }
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj6 : iterableO00O0O) {
                        C31042OooOOO0 c31042OooOOO06 = (C31042OooOOO0) obj6;
                        String str3 = c31042OooOOO06.f110826OooO00o.f66947OooO0OO;
                        kotlin.jvm.internal.OooOOO0.OooO0o(str3, "getProductId(...)");
                        if (((Map) c30584OooOOOo.f109422OooOoOO.getValue()).containsKey(str3)) {
                            OooOO0O.C22163OooO0Oo c22163OooO0Oo4 = c31042OooOOO06.f110828OooO0OO;
                            String str4 = c22163OooO0Oo4 != null ? c22163OooO0Oo4.f66967OooO00o : null;
                            if (str4 == null || (list = (List) ((Map) c30584OooOOOo.f109422OooOoOO.getValue()).get(str3)) == null || list.contains(str4)) {
                                arrayList12.add(obj6);
                            }
                        }
                    }
                    return arrayList12;
                }
                com.android.billingclient.api.OooOO0O oooOO0O2 = (com.android.billingclient.api.OooOO0O) it7.next();
                c30584OooOOOo.getClass();
                String str5 = oooOO0O2.f66948OooO0Oo;
                int iHashCode = str5.hashCode();
                String str6 = oooOO0O2.f66947OooO0OO;
                if (iHashCode != 3541555) {
                    if (iHashCode == 100343516 && str5.equals("inapp") && (OooO00o2 = oooOO0O2.OooO00o()) != null) {
                        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str6, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                        sbOooO0OO.append(oooOO0O2.f66948OooO0Oo);
                        String string = sbOooO0OO.toString();
                        ChronoUnit chronoUnit = ChronoUnit.FOREVER;
                        String str7 = OooO00o2.f66956OooO0OO;
                        kotlin.jvm.internal.OooOOO0.OooO0o(str7, "getPriceCurrencyCode(...)");
                        listOooo0o0 = com.facebook.soloader.OooOo.OooO0oO(new C31042OooOOO0(oooOO0O2, OooO00o2, null, 0, chronoUnit, OooO00o2.f66955OooO0O0, str7, kotlin.jvm.internal.OooOOO0.OooO0O0(string, strOooO0OO), null));
                        it = it7;
                        list2 = list6;
                        noteinGoogleSubscriptionPurchase = noteinGoogleSubscriptionPurchase3;
                    } else {
                        it = it7;
                        list2 = list6;
                        noteinGoogleSubscriptionPurchase = noteinGoogleSubscriptionPurchase3;
                        listOooo0o0 = null;
                    }
                } else if (str5.equals("subs")) {
                    ArrayList arrayList13 = new ArrayList();
                    for (Object obj7 : list6) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleDeveloperOffer) obj7).getProductId(), str6)) {
                            arrayList13.add(obj7);
                        }
                    }
                    ArrayList arrayList14 = oooOO0O2.f66944OooO;
                    if (arrayList14 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj8 : arrayList14) {
                            String str8 = ((OooOO0O.C22163OooO0Oo) obj8).f66967OooO00o;
                            Object arrayList15 = linkedHashMap2.get(str8);
                            if (arrayList15 == null) {
                                arrayList15 = new ArrayList();
                                linkedHashMap2.put(str8, arrayList15);
                            }
                            ((List) arrayList15).add(obj8);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap2.size()));
                        Iterator it9 = linkedHashMap2.entrySet().iterator();
                        while (it9.hasNext()) {
                            Map.Entry entry = (Map.Entry) it9.next();
                            Object key = entry.getKey();
                            Object key2 = entry.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key2, "component1(...)");
                            String str9 = (String) key2;
                            List list7 = (List) entry.getValue();
                            ArrayList arrayList16 = new ArrayList();
                            for (Object obj9 : arrayList13) {
                                Iterator it10 = it7;
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleDeveloperOffer) obj9).getBasePlanId(), str9)) {
                                    arrayList16.add(obj9);
                                }
                                it7 = it10;
                            }
                            Iterator it11 = it7;
                            ArrayList arrayList17 = new ArrayList();
                            List<OooOO0O.C22163OooO0Oo> list8 = list7;
                            if ((list8 instanceof Collection) && list8.isEmpty()) {
                                list3 = list6;
                                noteinGoogleSubscriptionPurchase2 = noteinGoogleSubscriptionPurchase3;
                                z = false;
                            } else {
                                for (OooOO0O.C22163OooO0Oo c22163OooO0Oo5 : list8) {
                                    list3 = list6;
                                    noteinGoogleSubscriptionPurchase2 = noteinGoogleSubscriptionPurchase3;
                                    if (c22163OooO0Oo5.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL) && !c22163OooO0Oo5.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_DEV)) {
                                        z = true;
                                        break;
                                    }
                                    list6 = list3;
                                    noteinGoogleSubscriptionPurchase3 = noteinGoogleSubscriptionPurchase2;
                                }
                                list3 = list6;
                                noteinGoogleSubscriptionPurchase2 = noteinGoogleSubscriptionPurchase3;
                                z = false;
                            }
                            Iterator it12 = arrayList16.iterator();
                            while (it12.hasNext()) {
                                NoteinGoogleDeveloperOffer noteinGoogleDeveloperOffer = (NoteinGoogleDeveloperOffer) it12.next();
                                Iterator it13 = list8.iterator();
                                while (true) {
                                    if (!it13.hasNext()) {
                                        z3 = z;
                                        it6 = it12;
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it13.next();
                                    z3 = z;
                                    it6 = it12;
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.C22163OooO0Oo) next5).f66968OooO0O0, noteinGoogleDeveloperOffer.getOfferId())) {
                                        break;
                                    }
                                    z = z3;
                                    it12 = it6;
                                }
                                OooOO0O.C22163OooO0Oo c22163OooO0Oo6 = (OooOO0O.C22163OooO0Oo) next5;
                                if (c22163OooO0Oo6 == null || !c22163OooO0Oo6.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_DEV)) {
                                    list4 = list8;
                                } else if (z3) {
                                    String offerId = noteinGoogleDeveloperOffer.getOfferId();
                                    list4 = list8;
                                    String strOooO0Oo = C21111o0ooOoO.OooO0Oo(offerId, GoogleBillingConstants.GOOGLE_TAG_SUFFIX_DISCOUNT_FREE_TRIAL);
                                    Iterator it14 = list4.iterator();
                                    while (true) {
                                        if (!it14.hasNext()) {
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it14.next();
                                        Iterator it15 = it14;
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.C22163OooO0Oo) next6).f66968OooO0O0, strOooO0Oo)) {
                                            break;
                                        }
                                        it14 = it15;
                                    }
                                    OooOO0O.C22163OooO0Oo c22163OooO0Oo7 = (OooOO0O.C22163OooO0Oo) next6;
                                    if (c22163OooO0Oo7 != null) {
                                        arrayList17.add(c22163OooO0Oo7);
                                    } else {
                                        arrayList17.add(c22163OooO0Oo6);
                                    }
                                } else {
                                    list4 = list8;
                                    arrayList17.add(c22163OooO0Oo6);
                                }
                                list8 = list4;
                                z = z3;
                                it12 = it6;
                            }
                            List<OooOO0O.C22163OooO0Oo> list9 = list8;
                            if (arrayList17.isEmpty()) {
                                z2 = false;
                            } else {
                                Iterator it16 = arrayList17.iterator();
                                while (it16.hasNext()) {
                                    if (((OooOO0O.C22163OooO0Oo) it16.next()).f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                                z2 = false;
                            }
                            for (OooOO0O.C22163OooO0Oo c22163OooO0Oo8 : list9) {
                                boolean z5 = z2;
                                if (!c22163OooO0Oo8.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_DEV)) {
                                    if (!c22163OooO0Oo8.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL)) {
                                        arrayList17.add(c22163OooO0Oo8);
                                    } else if (!z5) {
                                        arrayList17.add(c22163OooO0Oo8);
                                    }
                                }
                                z2 = z5;
                            }
                            if (arrayList17.isEmpty()) {
                                arrayList = arrayList17;
                                it2 = it9;
                                arrayList2 = arrayList13;
                                arrayList3 = arrayList16;
                            } else {
                                Iterator it17 = arrayList17.iterator();
                                OooOO0O.C22163OooO0Oo c22163OooO0Oo9 = null;
                                while (it17.hasNext()) {
                                    OooOO0O.C22163OooO0Oo c22163OooO0Oo10 = (OooOO0O.C22163OooO0Oo) it17.next();
                                    if (c22163OooO0Oo9 == null) {
                                        arrayList4 = arrayList17;
                                    } else {
                                        arrayList4 = arrayList17;
                                        boolean zContains = c22163OooO0Oo10.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL);
                                        ArrayList arrayList18 = c22163OooO0Oo9.f66971OooO0o0;
                                        boolean zContains2 = arrayList18.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL);
                                        if (!zContains || zContains2) {
                                            if (zContains || !zContains2) {
                                                it3 = it17;
                                                it4 = it9;
                                                boolean zContains3 = c22163OooO0Oo10.f66971OooO0o0.contains("discount");
                                                boolean zContains4 = arrayList18.contains("discount");
                                                if (!zContains3 || zContains4) {
                                                    if (zContains3 || !zContains4) {
                                                        ArrayList arrayList19 = c22163OooO0Oo10.f66970OooO0Oo.f66966OooO00o;
                                                        kotlin.jvm.internal.OooOOO0.OooO0o(arrayList19, "getPricingPhaseList(...)");
                                                        ArrayList arrayList20 = new ArrayList();
                                                        Iterator it18 = arrayList19.iterator();
                                                        while (it18.hasNext()) {
                                                            Object next7 = it18.next();
                                                            Iterator it19 = it18;
                                                            ArrayList arrayList21 = arrayList13;
                                                            ArrayList arrayList22 = arrayList16;
                                                            if (((OooOO0O.OooO0O0) next7).f66962OooO0O0 > 0) {
                                                                arrayList20.add(next7);
                                                            }
                                                            it18 = it19;
                                                            arrayList16 = arrayList22;
                                                            arrayList13 = arrayList21;
                                                        }
                                                        arrayList5 = arrayList13;
                                                        arrayList6 = arrayList16;
                                                        Iterator it20 = arrayList20.iterator();
                                                        if (!it20.hasNext()) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        long j = ((OooOO0O.OooO0O0) it20.next()).f66962OooO0O0;
                                                        while (it20.hasNext()) {
                                                            Iterator it21 = it20;
                                                            long j2 = ((OooOO0O.OooO0O0) it20.next()).f66962OooO0O0;
                                                            if (j > j2) {
                                                                j = j2;
                                                            }
                                                            it20 = it21;
                                                        }
                                                        ArrayList arrayList23 = c22163OooO0Oo9.f66970OooO0Oo.f66966OooO00o;
                                                        kotlin.jvm.internal.OooOOO0.OooO0o(arrayList23, "getPricingPhaseList(...)");
                                                        ArrayList arrayList24 = new ArrayList();
                                                        Iterator it22 = arrayList23.iterator();
                                                        while (it22.hasNext()) {
                                                            Object next8 = it22.next();
                                                            Iterator it23 = it22;
                                                            long j3 = j;
                                                            if (((OooOO0O.OooO0O0) next8).f66962OooO0O0 > 0) {
                                                                arrayList24.add(next8);
                                                            }
                                                            it22 = it23;
                                                            j = j3;
                                                        }
                                                        long j4 = j;
                                                        Iterator it24 = arrayList24.iterator();
                                                        if (!it24.hasNext()) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        long j5 = ((OooOO0O.OooO0O0) it24.next()).f66962OooO0O0;
                                                        while (it24.hasNext()) {
                                                            Iterator it25 = it24;
                                                            long j6 = ((OooOO0O.OooO0O0) it24.next()).f66962OooO0O0;
                                                            if (j5 > j6) {
                                                                j5 = j6;
                                                            }
                                                            it24 = it25;
                                                        }
                                                        if (j4 < j5) {
                                                        }
                                                    }
                                                    arrayList17 = arrayList4;
                                                    it17 = it3;
                                                    arrayList16 = arrayList6;
                                                    it9 = it4;
                                                    arrayList13 = arrayList5;
                                                }
                                                c22163OooO0Oo9 = c22163OooO0Oo10;
                                                arrayList17 = arrayList4;
                                                it17 = it3;
                                                arrayList16 = arrayList6;
                                                it9 = it4;
                                                arrayList13 = arrayList5;
                                            } else {
                                                it3 = it17;
                                                it4 = it9;
                                            }
                                            arrayList5 = arrayList13;
                                            arrayList6 = arrayList16;
                                            arrayList17 = arrayList4;
                                            it17 = it3;
                                            arrayList16 = arrayList6;
                                            it9 = it4;
                                            arrayList13 = arrayList5;
                                        }
                                        arrayList5 = arrayList13;
                                        arrayList6 = arrayList16;
                                        c22163OooO0Oo9 = c22163OooO0Oo10;
                                        arrayList17 = arrayList4;
                                        it17 = it3;
                                        arrayList16 = arrayList6;
                                        it9 = it4;
                                        arrayList13 = arrayList5;
                                    }
                                    it3 = it17;
                                    it4 = it9;
                                    arrayList5 = arrayList13;
                                    arrayList6 = arrayList16;
                                    c22163OooO0Oo9 = c22163OooO0Oo10;
                                    arrayList17 = arrayList4;
                                    it17 = it3;
                                    arrayList16 = arrayList6;
                                    it9 = it4;
                                    arrayList13 = arrayList5;
                                }
                                arrayList = arrayList17;
                                it2 = it9;
                                arrayList2 = arrayList13;
                                arrayList3 = arrayList16;
                                String str10 = c22163OooO0Oo9 != null ? c22163OooO0Oo9.f66969OooO0OO : null;
                                it5 = arrayList.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it5.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.C22163OooO0Oo) next3).f66969OooO0OO, str10)) {
                                        break;
                                    }
                                }
                                c22163OooO0Oo = (OooOO0O.C22163OooO0Oo) next3;
                                if (c22163OooO0Oo != null) {
                                    c31042OooOOO0 = null;
                                    oooOO0O = oooOO0O2;
                                } else {
                                    String strOooO00o = C31042OooOOO0.OooO00o.OooO00o(oooOO0O2, c22163OooO0Oo);
                                    ArrayList arrayList25 = c22163OooO0Oo.f66970OooO0Oo.f66966OooO00o;
                                    kotlin.jvm.internal.OooOOO0.OooO0o(arrayList25, "getPricingPhaseList(...)");
                                    OooOO0O.OooO0O0 oooO0O0 = (OooOO0O.OooO0O0) oOo000Oo.OooOo.OoooOOo(arrayList25);
                                    Period period = Period.parse(oooO0O0.f66964OooO0Oo);
                                    kotlin.jvm.internal.OooOOO0.OooO0o(period, "parse(...)");
                                    C32443OooOOO c32443OooOOOOooO0O0 = C31042OooOOO0.OooO00o.OooO0O0(period);
                                    if (c32443OooOOOOooO0O0 == null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("PayViewModel");
                                        c20358OooO00o2.OooO0OO("billingPeriod is null", new Object[0]);
                                        c31042OooOOO0 = null;
                                        oooOO0O = oooOO0O2;
                                    } else {
                                        Iterator it26 = arrayList3.iterator();
                                        while (true) {
                                            if (!it26.hasNext()) {
                                                next4 = null;
                                                break;
                                            }
                                            next4 = it26.next();
                                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleDeveloperOffer) next4).getOfferId(), c22163OooO0Oo.f66968OooO0O0)) {
                                                break;
                                            }
                                        }
                                        NoteinGoogleDeveloperOffer noteinGoogleDeveloperOffer2 = (NoteinGoogleDeveloperOffer) next4;
                                        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("notein_offer_id", noteinGoogleDeveloperOffer2 != null ? noteinGoogleDeveloperOffer2.getId() : null));
                                        int iIntValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue();
                                        ChronoUnit chronoUnit2 = (ChronoUnit) c32443OooOOOOooO0O0.f116637OooOo;
                                        String str11 = oooO0O0.f66963OooO0OO;
                                        kotlin.jvm.internal.OooOOO0.OooO0o(str11, "getPriceCurrencyCode(...)");
                                        oooOO0O = oooOO0O2;
                                        c31042OooOOO0 = new C31042OooOOO0(oooOO0O, null, c22163OooO0Oo, iIntValue, chronoUnit2, oooO0O0.f66962OooO0O0, str11, kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, strOooO0OO), bundleBundleOf);
                                    }
                                }
                                linkedHashMap3.put(key, c31042OooOOO0);
                                oooOO0O2 = oooOO0O;
                                it7 = it11;
                                list6 = list3;
                                noteinGoogleSubscriptionPurchase3 = noteinGoogleSubscriptionPurchase2;
                                it9 = it2;
                                arrayList13 = arrayList2;
                            }
                            it5 = arrayList.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                }
                            }
                            c22163OooO0Oo = (OooOO0O.C22163OooO0Oo) next3;
                            if (c22163OooO0Oo != null) {
                            }
                            linkedHashMap3.put(key, c31042OooOOO0);
                            oooOO0O2 = oooOO0O;
                            it7 = it11;
                            list6 = list3;
                            noteinGoogleSubscriptionPurchase3 = noteinGoogleSubscriptionPurchase2;
                            it9 = it2;
                            arrayList13 = arrayList2;
                        }
                        it = it7;
                        list2 = list6;
                        noteinGoogleSubscriptionPurchase = noteinGoogleSubscriptionPurchase3;
                        listOooo0o0 = oOo000Oo.OooOo.Oooo0o0(linkedHashMap3.values());
                        ArrayList arrayList26 = new ArrayList();
                        for (Object obj10 : listOooo0o0) {
                            if (((C31042OooOOO0) obj10).f110831OooO0o0 == ChronoUnit.MONTHS) {
                                arrayList26.add(obj10);
                            }
                        }
                        Iterator it27 = arrayList26.iterator();
                        if (it27.hasNext()) {
                            next2 = it27.next();
                            if (it27.hasNext()) {
                                C31042OooOOO0 c31042OooOOO07 = (C31042OooOOO0) next2;
                                long j7 = c31042OooOOO07.f110830OooO0o / ((long) c31042OooOOO07.f110829OooO0Oo);
                                do {
                                    Object next9 = it27.next();
                                    C31042OooOOO0 c31042OooOOO08 = (C31042OooOOO0) next9;
                                    long j8 = c31042OooOOO08.f110830OooO0o / ((long) c31042OooOOO08.f110829OooO0Oo);
                                    if (j7 < j8) {
                                        next2 = next9;
                                        j7 = j8;
                                    }
                                } while (it27.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        if (((C31042OooOOO0) next2) != null) {
                            Bundle bundleBundleOf2 = BundleKt.bundleOf(new C32443OooOOO("month_price", Float.valueOf((r1.f110830OooO0o * 1.0f) / r1.f110829OooO0Oo)));
                            ArrayList arrayList27 = new ArrayList(C34428OooOOo.OooOOoo(listOooo0o0, 10));
                            for (C31042OooOOO0 c31042OooOOO0OooO00o : listOooo0o0) {
                                if (c31042OooOOO0OooO00o.f110831OooO0o0 == ChronoUnit.YEARS) {
                                    Bundle bundle = c31042OooOOO0OooO00o.f110825OooO;
                                    if (bundle != null) {
                                        bundle.putAll(bundleBundleOf2);
                                    } else {
                                        bundle = bundleBundleOf2;
                                    }
                                    c31042OooOOO0OooO00o = C31042OooOOO0.OooO00o(c31042OooOOO0OooO00o, bundle);
                                }
                                arrayList27.add(c31042OooOOO0OooO00o);
                            }
                            listOooo0o0 = arrayList27;
                        }
                    }
                }
                if (listOooo0o0 != null) {
                    arrayList7.add(listOooo0o0);
                }
                c30585OooO0Oo = this;
                it7 = it;
                list6 = list2;
                noteinGoogleSubscriptionPurchase3 = noteinGoogleSubscriptionPurchase;
            }
        }
    }

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0o */
    public static final class OooO0o implements InterfaceC33721OooO0o<List<? extends NoteinGoogleSubscriptionPurchase>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30584OooOOOo f109435OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f109436OooOo0o;

        /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0o$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30584OooOOOo f109437OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f109438OooOo0o;

            /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$special$$inlined$map$2$2", m80623f = "GooglePayViewModel.kt", m80624l = {54, 50}, m80625m = "emit")
            public static final class C20113OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f109439OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f109440OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f109442OooOoO0;

                public C20113OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f109440OooOo0o = obj;
                    this.f109439OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30584OooOOOo c30584OooOOOo) {
                this.f109438OooOo0o = interfaceC33723OooO0oO;
                this.f109437OooOo = c30584OooOOOo;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
            
                if (r11.emit(r2, r0) != r1) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20113OooO00o c20113OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                ArrayList arrayList;
                if (continuation instanceof C20113OooO00o) {
                    c20113OooO00o = (C20113OooO00o) continuation;
                    int i = c20113OooO00o.f109439OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20113OooO00o.f109439OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20113OooO00o = new C20113OooO00o(continuation);
                    }
                }
                Object obj2 = c20113OooO00o.f109440OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20113OooO00o.f109439OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) obj;
                    interfaceC33723OooO0oO = this.f109438OooOo0o;
                    if (str != null) {
                        InterfaceC27300OooOOOo interfaceC27300OooOOOo = this.f109437OooOo.f109400OooO0Oo;
                        c20113OooO00o.f109442OooOoO0 = interfaceC33723OooO0oO;
                        c20113OooO00o.f109439OooOo = 1;
                        Serializable serializableOooO0O0 = interfaceC27300OooOOOo.OooO0O0(str, false, c20113OooO00o);
                        if (serializableOooO0O0 != enumC32485OooO00o) {
                            obj2 = serializableOooO0O0;
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        }
                        return enumC32485OooO00o;
                    }
                    arrayList = null;
                    c20113OooO00o.f109442OooOoO0 = null;
                    c20113OooO00o.f109439OooOo = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC33723OooO0oO2 = c20113OooO00o.f109442OooOoO0;
                    C32446OooOOOo.OooO0O0(obj2);
                }
                arrayList = new ArrayList();
                for (T t : (Iterable) obj2) {
                    NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) t;
                    if (noteinGoogleSubscriptionPurchase.isValid() && noteinGoogleSubscriptionPurchase.isAcknowledged()) {
                        arrayList.add(t);
                    }
                }
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                c20113OooO00o.f109442OooOoO0 = null;
                c20113OooO00o.f109439OooOo = 2;
            }
        }

        public OooO0o(C33781o00o0O c33781o00o0O, C30584OooOOOo c30584OooOOOo) {
            this.f109436OooOo0o = c33781o00o0O;
            this.f109435OooOo = c30584OooOOOo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleSubscriptionPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f109436OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f109435OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0o0, reason: case insensitive filesystem */
    public static final class C30586OooO0o0 implements InterfaceC33721OooO0o<List<? extends NoteinGoogleInAppPurchase>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30584OooOOOo f109443OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f109444OooOo0o;

        /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0o0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30584OooOOOo f109445OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f109446OooOo0o;

            /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$special$$inlined$map$1$2", m80623f = "GooglePayViewModel.kt", m80624l = {54, 50}, m80625m = "emit")
            public static final class C20114OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f109447OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f109448OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f109450OooOoO0;

                public C20114OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f109448OooOo0o = obj;
                    this.f109447OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30584OooOOOo c30584OooOOOo) {
                this.f109446OooOo0o = interfaceC33723OooO0oO;
                this.f109445OooOo = c30584OooOOOo;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
            
                if (r11.emit(r2, r0) != r1) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20114OooO00o c20114OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                ArrayList arrayList;
                if (continuation instanceof C20114OooO00o) {
                    c20114OooO00o = (C20114OooO00o) continuation;
                    int i = c20114OooO00o.f109447OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20114OooO00o.f109447OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20114OooO00o = new C20114OooO00o(continuation);
                    }
                }
                Object obj2 = c20114OooO00o.f109448OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20114OooO00o.f109447OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) obj;
                    interfaceC33723OooO0oO = this.f109446OooOo0o;
                    if (str != null) {
                        InterfaceC27300OooOOOo interfaceC27300OooOOOo = this.f109445OooOo.f109400OooO0Oo;
                        c20114OooO00o.f109450OooOoO0 = interfaceC33723OooO0oO;
                        c20114OooO00o.f109447OooOo = 1;
                        Serializable serializableOooO0oo = interfaceC27300OooOOOo.OooO0oo(str, false, c20114OooO00o);
                        if (serializableOooO0oo != enumC32485OooO00o) {
                            obj2 = serializableOooO0oo;
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        }
                        return enumC32485OooO00o;
                    }
                    arrayList = null;
                    c20114OooO00o.f109450OooOoO0 = null;
                    c20114OooO00o.f109447OooOo = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC33723OooO0oO2 = c20114OooO00o.f109450OooOoO0;
                    C32446OooOOOo.OooO0O0(obj2);
                }
                arrayList = new ArrayList();
                for (T t : (Iterable) obj2) {
                    NoteinGoogleInAppPurchase noteinGoogleInAppPurchase = (NoteinGoogleInAppPurchase) t;
                    if (noteinGoogleInAppPurchase.isValid() && noteinGoogleInAppPurchase.isAcknowledged()) {
                        arrayList.add(t);
                    }
                }
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                c20114OooO00o.f109450OooOoO0 = null;
                c20114OooO00o.f109447OooOo = 2;
            }
        }

        public C30586OooO0o0(C33781o00o0O c33781o00o0O, C30584OooOOOo c30584OooOOOo) {
            this.f109444OooOo0o = c33781o00o0O;
            this.f109443OooOo = c30584OooOOOo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleInAppPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f109444OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f109443OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0oO, reason: case insensitive filesystem */
    public static final class C30587OooO0oO implements InterfaceC33721OooO0o<List<? extends NoteinGoogleDeveloperOffer>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30584OooOOOo f109451OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f109452OooOo0o;

        /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0oO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30584OooOOOo f109453OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f109454OooOo0o;

            /* JADX INFO: renamed from: o0o0OOoo.OooOOOo$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayViewModel$special$$inlined$map$3$2", m80623f = "GooglePayViewModel.kt", m80624l = {54, 50}, m80625m = "emit")
            public static final class C20115OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f109455OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f109456OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f109458OooOoO0;

                public C20115OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f109456OooOo0o = obj;
                    this.f109455OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30584OooOOOo c30584OooOOOo) {
                this.f109454OooOo0o = interfaceC33723OooO0oO;
                this.f109453OooOo = c30584OooOOOo;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
            
                if (r9.emit(r8, r0) != r1) goto L33;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20115OooO00o c20115OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                RandomAccess randomAccess;
                if (continuation instanceof C20115OooO00o) {
                    c20115OooO00o = (C20115OooO00o) continuation;
                    int i = c20115OooO00o.f109455OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20115OooO00o.f109455OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20115OooO00o = new C20115OooO00o(continuation);
                    }
                }
                Object obj2 = c20115OooO00o.f109456OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20115OooO00o.f109455OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) obj;
                    interfaceC33723OooO0oO = this.f109454OooOo0o;
                    if (str != null) {
                        InterfaceC27300OooOOOo interfaceC27300OooOOOo = this.f109453OooOo.f109400OooO0Oo;
                        c20115OooO00o.f109458OooOoO0 = interfaceC33723OooO0oO;
                        c20115OooO00o.f109455OooOo = 1;
                        Serializable serializableOooO0o0 = interfaceC27300OooOOOo.OooO0o0(str, c20115OooO00o);
                        if (serializableOooO0o0 != enumC32485OooO00o) {
                            obj2 = serializableOooO0o0;
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        }
                        return enumC32485OooO00o;
                    }
                    randomAccess = C34434OooOoO.f123453OooOo0o;
                    c20115OooO00o.f109458OooOoO0 = null;
                    c20115OooO00o.f109455OooOo = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC33723OooO0oO2 = c20115OooO00o.f109458OooOoO0;
                    C32446OooOOOo.OooO0O0(obj2);
                }
                ArrayList arrayList = new ArrayList();
                for (T t : (Iterable) obj2) {
                    if (((NoteinGoogleDeveloperOffer) t).isActive()) {
                        arrayList.add(t);
                    }
                }
                interfaceC33723OooO0oO = interfaceC33723OooO0oO2;
                randomAccess = arrayList;
                c20115OooO00o.f109458OooOoO0 = null;
                c20115OooO00o.f109455OooOo = 2;
            }
        }

        public C30587OooO0oO(C33781o00o0O c33781o00o0O, C30584OooOOOo c30584OooOOOo) {
            this.f109452OooOo0o = c33781o00o0O;
            this.f109451OooOo = c30584OooOOOo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleDeveloperOffer>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f109452OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f109451OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public C30584OooOOOo(Context context, InterfaceC27300OooOOOo googleBillingRepo, InterfaceC27315OooOooo noteinFirebaseUserRepo, InterfaceC27322Oooo0o0 remoteConfigRepo, InterfaceC27308OooOo0o logEventRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(googleBillingRepo, "googleBillingRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteinFirebaseUserRepo, "noteinFirebaseUserRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(remoteConfigRepo, "remoteConfigRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(logEventRepo, "logEventRepo");
        this.f109400OooO0Oo = googleBillingRepo;
        this.f109402OooO0o0 = noteinFirebaseUserRepo;
        this.f109401OooO0o = remoteConfigRepo;
        this.f109403OooO0oO = logEventRepo;
        this.f109404OooO0oo = new Object();
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f109399OooO = c33781o00o0OOooO00o;
        C30586OooO0o0 c30586OooO0o0 = new C30586OooO0o0(c33781o00o0OOooO00o, this);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f109405OooOO0 = C25252OooO0Oo.OooOoO0(c30586OooO0o0, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f109406OooOO0O = C25252OooO0Oo.OooOoO0(new OooO0o(c33781o00o0OOooO00o, this), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new C30587OooO0oO(c33781o00o0OOooO00o, this), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(State.OooO0O0.f78711OooO00o);
        this.f109407OooOO0o = c33781o00o0OOooO00o2;
        this.f109409OooOOO0 = c33781o00o0OOooO00o2;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f109408OooOOO = c33772OooooOoOooO0O0;
        this.f109410OooOOOO = c33772OooooOoOooO0O0;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(null);
        this.f109411OooOOOo = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(null);
        this.f109413OooOOo0 = c33781o00o0OOooO00o4;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f109412OooOOo = c33772OooooOoOooO0O02;
        this.f109414OooOOoo = c33772OooooOoOooO0O02;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(null);
        this.f109417OooOo00 = c33781o00o0OOooO00o5;
        this.f109416OooOo0 = c33781o00o0OOooO00o5;
        this.f109418OooOo0O = new AtomicBoolean(false);
        this.f109419OooOo0o = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO(c33781o00o0OOooO00o3, c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o4, c33781o00o0OOooO00o5, new C30585OooO0Oo(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f109421OooOoO0 = C34429OooOOo0.OooOO0o(new C31058OooOooO(R.drawable.ic_privilege_data_sync, R.string.privilege_data_sync), new C31058OooOooO(R.drawable.ic_privilege_auto_backup, R.string.privilege_auto_backup), new C31058OooOooO(R.drawable.ic_privilege_ulimited_canvas, R.string.privilege_ulimited_canvas), new C31058OooOooO(R.drawable.ic_privilege_ppt_support, R.string.privilege_PPT_support), new C31058OooOooO(R.drawable.ic_privilege_doc_support, R.string.privilege_DOC_support), new C31058OooOooO(R.drawable.ic_privilege_duallink, R.string.privilege_duallink), new C31058OooOooO(R.drawable.ic_privilege_link, R.string.privilege_link), new C31058OooOooO(R.drawable.ic_privilege_layer, R.string.privilege_layer), new C31058OooOooO(R.drawable.ic_privilege_handwriting_recognition, R.string.privilege_handwriting_recognition), new C31058OooOooO(R.drawable.ic_privilege_dict_translate, R.string.privilege_dict_translate), new C31058OooOooO(R.drawable.ic_privilege_document_encryption, R.string.privilege_document_encryption), new C31058OooOooO(R.drawable.ic_privilege_masking_tape, R.string.privilege_masking_tape), new C31058OooOooO(R.drawable.ic_privilege_document_split, R.string.privilege_document_split), new C31058OooOooO(R.drawable.ic_privilege_document_merge, R.string.privilege_document_merge), new C31058OooOooO(R.drawable.ic_privilege_color_folder, R.string.privilege_color_folder), new C31058OooOooO(R.drawable.ic_privilege_font_import, R.string.privilege_font_import), new C31058OooOooO(R.drawable.ic_privilege_custom_template, R.string.privilege_custom_template), new C31058OooOooO(R.drawable.ic_privilege_template_library, R.string.privilege_template_library), new C31058OooOooO(R.drawable.ic_privilege_shape_pen, R.string.privilege_shape_pen), new C31058OooOooO(R.drawable.ic_privilege_laser_pen, R.string.privilege_laser_pen), new C31058OooOooO(R.drawable.ic_privilege_color_palette, R.string.privilege_color_palette), new C31058OooOooO(R.drawable.ic_privilege_color_picker, R.string.privilege_color_picker));
        C25252OooO0Oo.OooOoO0(new C33770OooooO0(new OooO0OO(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34434OooOoO.f123453OooOo0o);
        com.google.firebase.functions.OooO00o oooO00o = new com.google.firebase.functions.OooO00o(this);
        OooO0O0.OooO00o oooO00o2 = new OooO0O0.OooO00o(context);
        oooO00o2.f66891OooO0OO = oooO00o;
        oooO00o2.f66889OooO00o = new com.android.billingclient.api.OooOO0();
        C22159OooO0Oo c22159OooO0OoOooO00o = oooO00o2.OooO00o();
        this.f109420OooOoO = c22159OooO0OoOooO00o;
        c22159OooO0OoOooO00o.OooO0o0(new OooO00o());
        this.f109422OooOoOO = C20519OooO0Oo.OooO0OO(new C28546Oooo00O(this, 2));
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        this.f109420OooOoO.OooO0O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o(C31042OooOOO0 c31042OooOOO0) {
        boolean z;
        com.android.billingclient.api.OooOO0O oooOO0O = c31042OooOOO0.f110826OooO00o;
        String str = oooOO0O.f66948OooO0Oo;
        int iHashCode = str.hashCode();
        String str2 = oooOO0O.f66947OooO0OO;
        C33781o00o0O c33781o00o0O = this.f109399OooO;
        if (iHashCode != 3541555) {
            if (iHashCode == 100343516 && str.equals("inapp")) {
                if (((String) c33781o00o0O.getValue()) == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("PayViewModel");
                    c20358OooO00o.OooO0OO("User id is null", new Object[0]);
                    OooO0oo(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_NO_USER);
                    return;
                }
                OooO0oo(Event.C23763OooO0Oo.f78706OooO00o, null);
                List list = (List) this.f109405OooOO0.f121747OooOo0o.getValue();
                if (list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleInAppPurchase) it.next()).getProductId(), str2)) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("PayViewModel");
                                c20358OooO00o2.OooO0OO("User has more than 1 current purchase.", new Object[0]);
                                OooO0oo(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_OUT_OF_NUM_LIMIT);
                                return;
                            }
                        }
                    }
                }
                C22161OooO0oO.OooO00o OooO00o2 = C22161OooO0oO.OooO00o();
                C22161OooO0oO.OooO0O0.OooO00o oooO00o = new C22161OooO0oO.OooO0O0.OooO00o();
                oooO00o.OooO0O0(oooOO0O);
                OooO00o2.f66925OooO00o = new ArrayList(com.facebook.soloader.OooOo.OooO0oO(oooO00o.OooO00o()));
                OooO0oo(Event.OooO0o.f78707OooO00o, new C32443OooOOO(c31042OooOOO0, OooO00o2.OooO00o()));
                return;
            }
            return;
        }
        if (str.equals("subs")) {
            if (((String) c33781o00o0O.getValue()) == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("PayViewModel");
                c20358OooO00o3.OooO0OO("User id is null", new Object[0]);
                OooO0oo(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_NO_USER);
                return;
            }
            OooO0oo(Event.C23763OooO0Oo.f78706OooO00o, null);
            OooOO0O.C22163OooO0Oo c22163OooO0Oo = c31042OooOOO0.f110828OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c22163OooO0Oo);
            String str3 = c22163OooO0Oo.f66969OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0o(str3, "getOfferToken(...)");
            List list3 = (List) this.f109406OooOO0O.f121747OooOo0o.getValue();
            if (list3 != null) {
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = list4.iterator();
                    loop1: while (it2.hasNext()) {
                        List<NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem> lineItems = ((NoteinGoogleSubscriptionPurchase) it2.next()).getLineItems();
                        if (!(lineItems instanceof Collection) || !lineItems.isEmpty()) {
                            Iterator<T> it3 = lineItems.iterator();
                            while (it3.hasNext()) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleSubscriptionPurchase.SubscriptionPurchaseLineItem) it3.next()).getProductId(), str2)) {
                                    z = true;
                                    break loop1;
                                }
                            }
                        }
                    }
                    z = false;
                }
            }
            NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) this.f109417OooOo00.getValue();
            if (z && noteinGoogleSubscriptionPurchase == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("PayViewModel");
                c20358OooO00o4.OooO0OO("User has more than 1 current purchase.", new Object[0]);
                OooO0oo(Event.C23764OooO0o0.f78708OooO00o, TransactionsConstants.ERROR_CODE_ORDER_OUT_OF_NUM_LIMIT);
                return;
            }
            C22161OooO0oO.OooO00o OooO00o3 = C22161OooO0oO.OooO00o();
            C22161OooO0oO.OooO0O0.OooO00o oooO00o2 = new C22161OooO0oO.OooO0O0.OooO00o();
            oooO00o2.OooO0O0(oooOO0O);
            if (TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            oooO00o2.f66930OooO0O0 = str3;
            OooO00o3.f66925OooO00o = new ArrayList(com.facebook.soloader.OooOo.OooO0oO(oooO00o2.OooO00o()));
            String purchaseToken = noteinGoogleSubscriptionPurchase != null ? noteinGoogleSubscriptionPurchase.getPurchaseToken() : null;
            if (purchaseToken != null) {
                boolean z2 = (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = TextUtils.isEmpty(null);
                if (z2 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!z2 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C22161OooO0oO.OooO0OO oooO0OO = new C22161OooO0oO.OooO0OO();
                oooO0OO.f66931OooO00o = purchaseToken;
                oooO0OO.f66932OooO0O0 = 5;
                C22161OooO0oO.OooO0OO.OooO00o oooO00o3 = new C22161OooO0oO.OooO0OO.OooO00o();
                oooO00o3.f66933OooO00o = oooO0OO.f66931OooO00o;
                oooO00o3.f66935OooO0OO = oooO0OO.f66932OooO0O0;
                OooO00o3.f66926OooO0O0 = oooO00o3;
            }
            OooO0oo(Event.OooO0o.f78707OooO00o, new C32443OooOOO(c31042OooOOO0, OooO00o3.OooO00o()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30588OooOOo c30588OooOOo;
        if (abstractC32479OooO0OO instanceof C30588OooOOo) {
            c30588OooOOo = (C30588OooOOo) abstractC32479OooO0OO;
            int i = c30588OooOOo.f109461OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30588OooOOo.f109461OooOoO = i - Integer.MIN_VALUE;
            } else {
                c30588OooOOo = new C30588OooOOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c30588OooOOo.f109459OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30588OooOOo.f109461OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c30588OooOOo.f109460OooOo0o = str;
            c30588OooOOo.f109461OooOoO = 1;
            objOooOOO0 = this.f109400OooO0Oo.OooOOO0(str, c30588OooOOo);
            if (objOooOOO0 == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c30588OooOOo.f109460OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        FirebaseUserMembership firebaseUserMembership = (FirebaseUserMembership) objOooOOO0;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "PayViewModel", "checkIfUserHasVip: ", str, ", userMembership: ");
        sbOooO00o.append(firebaseUserMembership);
        c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
        return Boolean.valueOf(firebaseUserMembership.getMembershipType() != FirebaseUserMembership.MembershipType.FREE);
    }

    public final void OooO0oO(State state, Object obj) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PayViewModel");
        c20358OooO00o.OooO0o0("setTransactionsStateLocked newState: ".concat(state.getClass().getSimpleName()), new Object[0]);
        C33781o00o0O c33781o00o0O = this.f109407OooOO0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, state);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30590OooOOoo(state, this, obj, null), 2);
    }

    public final void OooO0oo(Event event, Object obj) {
        synchronized (this.f109404OooO0oo) {
            State state = (State) this.f109407OooOO0o.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PayViewModel");
            c20358OooO00o.OooO0o0("transitionToState currentState: " + state.getClass().getSimpleName() + ", event: " + event.getClass().getSimpleName(), new Object[0]);
            if (event.equals(Event.OooO.f78702OooO00o)) {
                OooO0oO(State.C23767OooO0Oo.f78713OooO00o, obj);
                return;
            }
            State stateNextState = state.nextState(event);
            if (stateNextState != null) {
                OooO0oO(stateNextState, obj);
            } else {
                c20358OooO00o.OooOOO0("PayViewModel");
                c20358OooO00o.OooO0OO("Can not change the state. current: " + state + " event: " + event, new Object[0]);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
