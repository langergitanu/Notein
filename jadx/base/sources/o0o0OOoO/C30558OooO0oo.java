package o0o0OOoO;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21111o0ooOoO;
import OoooOOo.C21192OooO0o;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.os.BundleKt;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.android.billingclient.api.C22159OooO0Oo;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.OooO0O0;
import com.android.billingclient.api.OooOO0O;
import com.aspose.slides.C22226Oooo0oo;
import com.google.firebase.firestore.util.RunnableC22710OooO0Oo;
import com.google.gson.reflect.TypeToken;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
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
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import o0OOo0Oo.InterfaceC27308OooOo0o;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import o0OOo0Oo.InterfaceC27325OoooO00;
import o0Ooo0oo.C29439OooO00o;
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
import oO0O000o.InterfaceC32509OooOOo;
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
import oOo000Oo.OooOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0o0OOoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o0OOoO/OooO0oo;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30558OooO0oo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33781o00o0O f109296OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC27300OooOOOo f109297OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC27322Oooo0o0 f109298OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27325OoooO00 f109299OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final InterfaceC27308OooOo0o f109300OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Object f109301OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33769Ooooo0o f109302OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C33769Ooooo0o f109303OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C33781o00o0O f109304OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33772OooooOo f109305OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C33781o00o0O f109306OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33772OooooOo f109307OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final C33781o00o0O f109308OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33772OooooOo f109309OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final C33781o00o0O f109310OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33772OooooOo f109311OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22159OooO0Oo f109312OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f109313OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f109314OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final List<C31058OooOooO> f109315OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33769Ooooo0o f109316OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32447OooOOo f109317OooOoO0;

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO00o */
    public static final class OooO00o implements com.android.billingclient.api.OooO0o {

        /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$1$onBillingSetupFinished$1", m80623f = "AiQuotaPayViewModel.kt", m80624l = {209}, m80625m = "invokeSuspend")
        public static final class C20106OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30558OooO0oo f109319OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f109320OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ C22162OooO0oo f109321OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20106OooO00o(C30558OooO0oo c30558OooO0oo, C22162OooO0oo c22162OooO0oo, Continuation<? super C20106OooO00o> continuation) {
                super(2, continuation);
                this.f109319OooOo = c30558OooO0oo;
                this.f109321OooOoO0 = c22162OooO0oo;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C20106OooO00o(this.f109319OooOo, this.f109321OooOoO0, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C20106OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f109320OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33772OooooOo c33772OooooOo = this.f109319OooOo.f109309OooOOo;
                    C22162OooO0oo c22162OooO0oo = this.f109321OooOoO0;
                    C32443OooOOO c32443OooOOO = new C32443OooOOO(new Integer(c22162OooO0oo.f66936OooO00o), c22162OooO0oo.f66938OooO0OO);
                    this.f109320OooOo0o = 1;
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
            c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
            c20358OooO00o.OooO0o0("onBillingSetupFinished", new Object[0]);
            int i = billingResult.f66936OooO00o;
            C30558OooO0oo c30558OooO0oo = C30558OooO0oo.this;
            if (i == 0) {
                c30558OooO0oo.OooO0oO(Event.C23765OooO0oO.f78709OooO00o, null);
            } else {
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30558OooO0oo), null, null, new C20106OooO00o(c30558OooO0oo, billingResult, null), 3);
            }
        }

        @Override // com.android.billingclient.api.OooO0o
        public final void OooO0O0() {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
            c20358OooO00o.OooO0o0("onBillingServiceDisconnected", new Object[0]);
            C30558OooO0oo c30558OooO0oo = C30558OooO0oo.this;
            c30558OooO0oo.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC22710OooO0Oo(c30558OooO0oo, 3), 1000L);
        }
    }

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0O0 */
    @Metadata(m80611d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00020\u0001¨\u0006\u0005"}, m80612d2 = {"o0o0OOoO/OooO0oo$OooO0O0", "Lcom/google/gson/reflect/TypeToken;", "", "", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class OooO0O0 extends TypeToken<Map<String, ? extends List<? extends String>>> {
    }

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0OO */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$privilegeList$1", m80623f = "AiQuotaPayViewModel.kt", m80624l = {179}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends C31058OooOooO>>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f109322OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109323OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0OO oooO0OO = C30558OooO0oo.this.new OooO0OO(continuation);
            oooO0OO.f109322OooOo = obj;
            return oooO0OO;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends C31058OooOooO>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109323OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f109322OooOo;
                List<C31058OooOooO> list = C30558OooO0oo.this.f109315OooOo0O;
                this.f109323OooOo0o = 1;
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

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$productVOList$1", m80623f = "AiQuotaPayViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C30559OooO0Oo extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends com.android.billingclient.api.OooOO0O>, List<? extends NoteinGoogleDeveloperOffer>, C31042OooOOO0, Continuation<? super List<? extends C31042OooOOO0>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ List f109325OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ List f109326OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ C31042OooOOO0 f109328OooOoO0;

        public C30559OooO0Oo(Continuation<? super C30559OooO0Oo> continuation) {
            super(4, continuation);
        }

        @Override // oO0O000o.InterfaceC32509OooOOo
        public final Object invoke(List<? extends com.android.billingclient.api.OooOO0O> list, List<? extends NoteinGoogleDeveloperOffer> list2, C31042OooOOO0 c31042OooOOO0, Continuation<? super List<? extends C31042OooOOO0>> continuation) {
            C30559OooO0Oo c30559OooO0Oo = C30558OooO0oo.this.new C30559OooO0Oo(continuation);
            c30559OooO0Oo.f109326OooOo0o = list;
            c30559OooO0Oo.f109325OooOo = list2;
            c30559OooO0Oo.f109328OooOoO0 = c31042OooOOO0;
            return c30559OooO0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0403  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x041f  */
        /* JADX WARN: Removed duplicated region for block: B:312:0x0413 A[SYNTHETIC] */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object next;
            Iterator it;
            List list;
            List<C31042OooOOO0> listOooo0o0;
            Object next2;
            List list2;
            boolean z;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            OooOO0O.C22163OooO0Oo c22163OooO0Oo;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Iterator it2;
            Iterator it3;
            Object next3;
            OooOO0O.C22163OooO0Oo c22163OooO0Oo2;
            Object next4;
            C31042OooOOO0 c31042OooOOO0;
            String str;
            Object obj2;
            boolean z2;
            Iterator it4;
            Object next5;
            Iterator it5;
            Object next6;
            OooOO0O.OooO00o OooO00o2;
            C30559OooO0Oo c30559OooO0Oo = this;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            List list3 = c30559OooO0Oo.f109326OooOo0o;
            List list4 = c30559OooO0Oo.f109325OooOo;
            C31042OooOOO0 c31042OooOOO02 = c30559OooO0Oo.f109328OooOoO0;
            if (list3 == null || list4 == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                c20358OooO00o.OooO0OO("products or developerOffers is null", new Object[0]);
                return null;
            }
            String strOooO0OO = c31042OooOOO02 != null ? c31042OooOOO02.OooO0OO() : null;
            ArrayList arrayList7 = new ArrayList();
            Iterator it6 = list3.iterator();
            while (true) {
                boolean zHasNext = it6.hasNext();
                C30558OooO0oo c30558OooO0oo = C30558OooO0oo.this;
                if (!zHasNext) {
                    ArrayList arrayListOooOo00 = C34428OooOOo.OooOo00(arrayList7);
                    final C30564OooOO0o c30564OooOO0o = new C30564OooOO0o();
                    List listO00O0O = OooOo.o00O0O(arrayListOooOo00, new Comparator() { // from class: o0o0OOoO.OooOOO0
                        @Override // java.util.Comparator
                        public final int compare(Object obj3, Object obj4) {
                            return ((Number) c30564OooOO0o.invoke(obj3, obj4)).intValue();
                        }
                    });
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj3 : listO00O0O) {
                        String str2 = ((C31042OooOOO0) obj3).f110826OooO00o.f66947OooO0OO;
                        kotlin.jvm.internal.OooOOO0.OooO0o(str2, "getProductId(...)");
                        if (((Map) c30558OooO0oo.f109317OooOoO0.getValue()).containsKey(str2)) {
                            arrayList8.add(obj3);
                        }
                    }
                    Iterator it7 = listO00O0O.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it7.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C31042OooOOO0) next).f110826OooO00o.f66947OooO0OO, GoogleBillingConstants.GOOGLE_AI_QUOTA_1_IN_APP)) {
                            break;
                        }
                    }
                    C31042OooOOO0 c31042OooOOO03 = (C31042OooOOO0) next;
                    Long l = c31042OooOOO03 != null ? new Long(c31042OooOOO03.f110830OooO0o) : null;
                    if (l == null) {
                        return arrayList8;
                    }
                    ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(arrayList8, 10));
                    Iterator it8 = arrayList8.iterator();
                    while (it8.hasNext()) {
                        arrayList9.add(C31042OooOOO0.OooO00o((C31042OooOOO0) it8.next(), BundleKt.bundleOf(new C32443OooOOO(GoogleBillingConstants.GOOGLE_AI_QUOTA_1_IN_APP, l))));
                    }
                    return arrayList9;
                }
                com.android.billingclient.api.OooOO0O oooOO0O = (com.android.billingclient.api.OooOO0O) it6.next();
                c30558OooO0oo.getClass();
                String str3 = oooOO0O.f66948OooO0Oo;
                int iHashCode = str3.hashCode();
                String str4 = "getPriceCurrencyCode(...)";
                String str5 = oooOO0O.f66947OooO0OO;
                if (iHashCode != 3541555) {
                    if (iHashCode == 100343516 && str3.equals("inapp") && (OooO00o2 = oooOO0O.OooO00o()) != null) {
                        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str5, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                        sbOooO0OO.append(oooOO0O.f66948OooO0Oo);
                        String string = sbOooO0OO.toString();
                        ChronoUnit chronoUnit = ChronoUnit.FOREVER;
                        String str6 = OooO00o2.f66956OooO0OO;
                        kotlin.jvm.internal.OooOOO0.OooO0o(str6, "getPriceCurrencyCode(...)");
                        listOooo0o0 = com.facebook.soloader.OooOo.OooO0oO(new C31042OooOOO0(oooOO0O, OooO00o2, null, 0, chronoUnit, OooO00o2.f66955OooO0O0, str6, kotlin.jvm.internal.OooOOO0.OooO0O0(string, strOooO0OO), null));
                        it = it6;
                        list = list4;
                    } else {
                        it = it6;
                        list = list4;
                        listOooo0o0 = null;
                    }
                } else if (str3.equals("subs")) {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : list4) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleDeveloperOffer) obj4).getProductId(), str5)) {
                            arrayList10.add(obj4);
                        }
                    }
                    ArrayList arrayList11 = oooOO0O.f66944OooO;
                    if (arrayList11 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj5 : arrayList11) {
                            String str7 = ((OooOO0O.C22163OooO0Oo) obj5).f66967OooO00o;
                            Object obj6 = linkedHashMap.get(str7);
                            if (obj6 == null) {
                                ArrayList arrayList12 = new ArrayList();
                                linkedHashMap.put(str7, arrayList12);
                                obj6 = arrayList12;
                            }
                            ((List) obj6).add(obj5);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(linkedHashMap.size()));
                        Iterator it9 = linkedHashMap.entrySet().iterator();
                        while (it9.hasNext()) {
                            Map.Entry entry = (Map.Entry) it9.next();
                            Object key = entry.getKey();
                            Object key2 = entry.getKey();
                            kotlin.jvm.internal.OooOOO0.OooO0o(key2, "component1(...)");
                            String str8 = (String) key2;
                            List list5 = (List) entry.getValue();
                            ArrayList arrayList13 = new ArrayList();
                            for (Object obj7 : arrayList10) {
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleDeveloperOffer) obj7).getBasePlanId(), str8)) {
                                    arrayList13.add(obj7);
                                }
                            }
                            ArrayList arrayList14 = new ArrayList();
                            List<OooOO0O.C22163OooO0Oo> list6 = list5;
                            boolean z3 = true;
                            Iterator it10 = it6;
                            if ((list6 instanceof Collection) && list6.isEmpty()) {
                                list2 = list4;
                                z = false;
                            } else {
                                Iterator it11 = list6.iterator();
                                while (it11.hasNext()) {
                                    list2 = list4;
                                    OooOO0O.C22163OooO0Oo c22163OooO0Oo3 = (OooOO0O.C22163OooO0Oo) it11.next();
                                    Iterator it12 = it11;
                                    if (c22163OooO0Oo3.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL) && !c22163OooO0Oo3.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_DEV)) {
                                        z = true;
                                        break;
                                    }
                                    it11 = it12;
                                    list4 = list2;
                                }
                                list2 = list4;
                                z = false;
                            }
                            Iterator it13 = arrayList13.iterator();
                            while (it13.hasNext()) {
                                NoteinGoogleDeveloperOffer noteinGoogleDeveloperOffer = (NoteinGoogleDeveloperOffer) it13.next();
                                Iterator it14 = list6.iterator();
                                while (true) {
                                    if (!it14.hasNext()) {
                                        z2 = z;
                                        it4 = it13;
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it14.next();
                                    z2 = z;
                                    it4 = it13;
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.C22163OooO0Oo) next5).f66968OooO0O0, noteinGoogleDeveloperOffer.getOfferId())) {
                                        break;
                                    }
                                    z = z2;
                                    it13 = it4;
                                }
                                OooOO0O.C22163OooO0Oo c22163OooO0Oo4 = (OooOO0O.C22163OooO0Oo) next5;
                                if (c22163OooO0Oo4 == null || !c22163OooO0Oo4.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_DEV)) {
                                    it5 = it9;
                                } else if (z2) {
                                    it5 = it9;
                                    String strOooO0Oo = C21111o0ooOoO.OooO0Oo(noteinGoogleDeveloperOffer.getOfferId(), GoogleBillingConstants.GOOGLE_TAG_SUFFIX_DISCOUNT_FREE_TRIAL);
                                    Iterator it15 = list6.iterator();
                                    while (true) {
                                        if (!it15.hasNext()) {
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it15.next();
                                        Iterator it16 = it15;
                                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.C22163OooO0Oo) next6).f66968OooO0O0, strOooO0Oo)) {
                                            break;
                                        }
                                        it15 = it16;
                                    }
                                    OooOO0O.C22163OooO0Oo c22163OooO0Oo5 = (OooOO0O.C22163OooO0Oo) next6;
                                    if (c22163OooO0Oo5 != null) {
                                        arrayList14.add(c22163OooO0Oo5);
                                    } else {
                                        arrayList14.add(c22163OooO0Oo4);
                                    }
                                } else {
                                    it5 = it9;
                                    arrayList14.add(c22163OooO0Oo4);
                                }
                                z = z2;
                                it13 = it4;
                                it9 = it5;
                            }
                            Iterator it17 = it9;
                            if (arrayList14.isEmpty()) {
                                z3 = false;
                            } else {
                                Iterator it18 = arrayList14.iterator();
                                while (it18.hasNext()) {
                                    if (((OooOO0O.C22163OooO0Oo) it18.next()).f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL)) {
                                        break;
                                    }
                                }
                                z3 = false;
                            }
                            for (OooOO0O.C22163OooO0Oo c22163OooO0Oo6 : list6) {
                                if (!c22163OooO0Oo6.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_DEV)) {
                                    if (!c22163OooO0Oo6.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL)) {
                                        arrayList14.add(c22163OooO0Oo6);
                                    } else if (!z3) {
                                        arrayList14.add(c22163OooO0Oo6);
                                    }
                                }
                            }
                            if (arrayList14.isEmpty()) {
                                arrayList = arrayList14;
                                arrayList2 = arrayList10;
                                arrayList3 = arrayList13;
                            } else {
                                Iterator it19 = arrayList14.iterator();
                                OooOO0O.C22163OooO0Oo c22163OooO0Oo7 = null;
                                while (it19.hasNext()) {
                                    OooOO0O.C22163OooO0Oo c22163OooO0Oo8 = (OooOO0O.C22163OooO0Oo) it19.next();
                                    if (c22163OooO0Oo7 == null) {
                                        arrayList4 = arrayList14;
                                    } else {
                                        boolean zContains = c22163OooO0Oo8.f66971OooO0o0.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL);
                                        arrayList4 = arrayList14;
                                        ArrayList arrayList15 = c22163OooO0Oo7.f66971OooO0o0;
                                        boolean zContains2 = arrayList15.contains(GoogleBillingConstants.GOOGLE_TAG_FREE_TRIAL);
                                        if (!zContains || zContains2) {
                                            if (zContains || !zContains2) {
                                                it2 = it19;
                                                boolean zContains3 = c22163OooO0Oo8.f66971OooO0o0.contains("discount");
                                                boolean zContains4 = arrayList15.contains("discount");
                                                if (zContains3 && !zContains4) {
                                                    c22163OooO0Oo = c22163OooO0Oo8;
                                                    arrayList5 = arrayList10;
                                                    arrayList6 = arrayList13;
                                                    arrayList14 = arrayList4;
                                                    it19 = it2;
                                                    arrayList13 = arrayList6;
                                                    arrayList10 = arrayList5;
                                                    c22163OooO0Oo7 = c22163OooO0Oo;
                                                } else if (zContains3 || !zContains4) {
                                                    ArrayList arrayList16 = c22163OooO0Oo8.f66970OooO0Oo.f66966OooO00o;
                                                    kotlin.jvm.internal.OooOOO0.OooO0o(arrayList16, "getPricingPhaseList(...)");
                                                    ArrayList arrayList17 = new ArrayList();
                                                    Iterator it20 = arrayList16.iterator();
                                                    while (it20.hasNext()) {
                                                        Object next7 = it20.next();
                                                        Iterator it21 = it20;
                                                        ArrayList arrayList18 = arrayList10;
                                                        ArrayList arrayList19 = arrayList13;
                                                        if (((OooOO0O.OooO0O0) next7).f66962OooO0O0 > 0) {
                                                            arrayList17.add(next7);
                                                        }
                                                        it20 = it21;
                                                        arrayList13 = arrayList19;
                                                        arrayList10 = arrayList18;
                                                    }
                                                    arrayList5 = arrayList10;
                                                    arrayList6 = arrayList13;
                                                    Iterator it22 = arrayList17.iterator();
                                                    if (!it22.hasNext()) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    long j = ((OooOO0O.OooO0O0) it22.next()).f66962OooO0O0;
                                                    while (it22.hasNext()) {
                                                        Iterator it23 = it22;
                                                        long j2 = ((OooOO0O.OooO0O0) it22.next()).f66962OooO0O0;
                                                        if (j > j2) {
                                                            j = j2;
                                                        }
                                                        it22 = it23;
                                                    }
                                                    ArrayList arrayList20 = c22163OooO0Oo7.f66970OooO0Oo.f66966OooO00o;
                                                    kotlin.jvm.internal.OooOOO0.OooO0o(arrayList20, "getPricingPhaseList(...)");
                                                    ArrayList arrayList21 = new ArrayList();
                                                    Iterator it24 = arrayList20.iterator();
                                                    while (it24.hasNext()) {
                                                        Object next8 = it24.next();
                                                        Iterator it25 = it24;
                                                        OooOO0O.C22163OooO0Oo c22163OooO0Oo9 = c22163OooO0Oo8;
                                                        long j3 = j;
                                                        if (((OooOO0O.OooO0O0) next8).f66962OooO0O0 > 0) {
                                                            arrayList21.add(next8);
                                                        }
                                                        it24 = it25;
                                                        c22163OooO0Oo8 = c22163OooO0Oo9;
                                                        j = j3;
                                                    }
                                                    c22163OooO0Oo = c22163OooO0Oo8;
                                                    long j4 = j;
                                                    Iterator it26 = arrayList21.iterator();
                                                    if (!it26.hasNext()) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    long j5 = ((OooOO0O.OooO0O0) it26.next()).f66962OooO0O0;
                                                    while (it26.hasNext()) {
                                                        long j6 = ((OooOO0O.OooO0O0) it26.next()).f66962OooO0O0;
                                                        if (j5 > j6) {
                                                            j5 = j6;
                                                        }
                                                    }
                                                    if (j4 < j5) {
                                                        arrayList14 = arrayList4;
                                                        it19 = it2;
                                                        arrayList13 = arrayList6;
                                                        arrayList10 = arrayList5;
                                                        c22163OooO0Oo7 = c22163OooO0Oo;
                                                    } else {
                                                        arrayList14 = arrayList4;
                                                        it19 = it2;
                                                        arrayList13 = arrayList6;
                                                        arrayList10 = arrayList5;
                                                    }
                                                }
                                            } else {
                                                it2 = it19;
                                            }
                                            arrayList5 = arrayList10;
                                            arrayList6 = arrayList13;
                                            arrayList14 = arrayList4;
                                            it19 = it2;
                                            arrayList13 = arrayList6;
                                            arrayList10 = arrayList5;
                                        }
                                    }
                                    it2 = it19;
                                    c22163OooO0Oo = c22163OooO0Oo8;
                                    arrayList5 = arrayList10;
                                    arrayList6 = arrayList13;
                                    arrayList14 = arrayList4;
                                    it19 = it2;
                                    arrayList13 = arrayList6;
                                    arrayList10 = arrayList5;
                                    c22163OooO0Oo7 = c22163OooO0Oo;
                                }
                                arrayList = arrayList14;
                                arrayList2 = arrayList10;
                                arrayList3 = arrayList13;
                                String str9 = c22163OooO0Oo7 != null ? c22163OooO0Oo7.f66969OooO0OO : null;
                                it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it3.next();
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooOO0O.C22163OooO0Oo) next3).f66969OooO0OO, str9)) {
                                        break;
                                    }
                                }
                                c22163OooO0Oo2 = (OooOO0O.C22163OooO0Oo) next3;
                                if (c22163OooO0Oo2 != null) {
                                    c31042OooOOO0 = null;
                                    str = str4;
                                    obj2 = key;
                                } else {
                                    String strOooO00o = C31042OooOOO0.OooO00o.OooO00o(oooOO0O, c22163OooO0Oo2);
                                    ArrayList arrayList22 = c22163OooO0Oo2.f66970OooO0Oo.f66966OooO00o;
                                    kotlin.jvm.internal.OooOOO0.OooO0o(arrayList22, "getPricingPhaseList(...)");
                                    OooOO0O.OooO0O0 oooO0O0 = (OooOO0O.OooO0O0) OooOo.OoooOOo(arrayList22);
                                    Period period = Period.parse(oooO0O0.f66964OooO0Oo);
                                    kotlin.jvm.internal.OooOOO0.OooO0o(period, "parse(...)");
                                    C32443OooOOO c32443OooOOOOooO0O0 = C31042OooOOO0.OooO00o.OooO0O0(period);
                                    if (c32443OooOOOOooO0O0 == null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o2.OooOOO0("AiQuotaPayViewModel");
                                        c20358OooO00o2.OooO0OO("billingPeriod is null", new Object[0]);
                                        c31042OooOOO0 = null;
                                        str = str4;
                                        obj2 = key;
                                    } else {
                                        Iterator it27 = arrayList3.iterator();
                                        while (true) {
                                            if (!it27.hasNext()) {
                                                next4 = null;
                                                break;
                                            }
                                            next4 = it27.next();
                                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleDeveloperOffer) next4).getOfferId(), c22163OooO0Oo2.f66968OooO0O0)) {
                                                break;
                                            }
                                        }
                                        NoteinGoogleDeveloperOffer noteinGoogleDeveloperOffer2 = (NoteinGoogleDeveloperOffer) next4;
                                        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("notein_offer_id", noteinGoogleDeveloperOffer2 != null ? noteinGoogleDeveloperOffer2.getId() : null));
                                        int iIntValue = ((Number) c32443OooOOOOooO0O0.f116638OooOo0o).intValue();
                                        ChronoUnit chronoUnit2 = (ChronoUnit) c32443OooOOOOooO0O0.f116637OooOo;
                                        String str10 = oooO0O0.f66963OooO0OO;
                                        kotlin.jvm.internal.OooOOO0.OooO0o(str10, str4);
                                        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(strOooO00o, strOooO0OO);
                                        str = str4;
                                        long j7 = oooO0O0.f66962OooO0O0;
                                        obj2 = key;
                                        c31042OooOOO0 = new C31042OooOOO0(oooOO0O, null, c22163OooO0Oo2, iIntValue, chronoUnit2, j7, str10, zOooO0O0, bundleBundleOf);
                                    }
                                }
                                linkedHashMap2.put(obj2, c31042OooOOO0);
                                str4 = str;
                                it6 = it10;
                                list4 = list2;
                                it9 = it17;
                                arrayList10 = arrayList2;
                            }
                            it3 = arrayList.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                }
                            }
                            c22163OooO0Oo2 = (OooOO0O.C22163OooO0Oo) next3;
                            if (c22163OooO0Oo2 != null) {
                            }
                            linkedHashMap2.put(obj2, c31042OooOOO0);
                            str4 = str;
                            it6 = it10;
                            list4 = list2;
                            it9 = it17;
                            arrayList10 = arrayList2;
                        }
                        it = it6;
                        list = list4;
                        listOooo0o0 = OooOo.Oooo0o0(linkedHashMap2.values());
                        ArrayList arrayList23 = new ArrayList();
                        for (Object obj8 : listOooo0o0) {
                            if (((C31042OooOOO0) obj8).f110831OooO0o0 == ChronoUnit.MONTHS) {
                                arrayList23.add(obj8);
                            }
                        }
                        Iterator it28 = arrayList23.iterator();
                        if (it28.hasNext()) {
                            next2 = it28.next();
                            if (it28.hasNext()) {
                                C31042OooOOO0 c31042OooOOO04 = (C31042OooOOO0) next2;
                                long j8 = c31042OooOOO04.f110830OooO0o / ((long) c31042OooOOO04.f110829OooO0Oo);
                                do {
                                    Object next9 = it28.next();
                                    C31042OooOOO0 c31042OooOOO05 = (C31042OooOOO0) next9;
                                    long j9 = c31042OooOOO05.f110830OooO0o / ((long) c31042OooOOO05.f110829OooO0Oo);
                                    if (j8 < j9) {
                                        next2 = next9;
                                        j8 = j9;
                                    }
                                } while (it28.hasNext());
                            }
                        } else {
                            next2 = null;
                        }
                        if (((C31042OooOOO0) next2) != null) {
                            Bundle bundleBundleOf2 = BundleKt.bundleOf(new C32443OooOOO("month_price", Float.valueOf((r1.f110830OooO0o * 1.0f) / r1.f110829OooO0Oo)));
                            ArrayList arrayList24 = new ArrayList(C34428OooOOo.OooOOoo(listOooo0o0, 10));
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
                                arrayList24.add(c31042OooOOO0OooO00o);
                            }
                            listOooo0o0 = arrayList24;
                        }
                    }
                }
                if (listOooo0o0 != null) {
                    arrayList7.add(listOooo0o0);
                }
                c30559OooO0Oo = this;
                it6 = it;
                list4 = list;
            }
        }
    }

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0o */
    public static final class OooO0o implements InterfaceC33721OooO0o<List<? extends NoteinGoogleInAppPurchase>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30558OooO0oo f109329OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f109330OooOo0o;

        /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0o$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30558OooO0oo f109331OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f109332OooOo0o;

            /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$special$$inlined$map$1$2", m80623f = "AiQuotaPayViewModel.kt", m80624l = {54, 50}, m80625m = "emit")
            public static final class C20107OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f109333OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f109334OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f109336OooOoO0;

                public C20107OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f109334OooOo0o = obj;
                    this.f109333OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30558OooO0oo c30558OooO0oo) {
                this.f109332OooOo0o = interfaceC33723OooO0oO;
                this.f109331OooOo = c30558OooO0oo;
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
                C20107OooO00o c20107OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                ArrayList arrayList;
                if (continuation instanceof C20107OooO00o) {
                    c20107OooO00o = (C20107OooO00o) continuation;
                    int i = c20107OooO00o.f109333OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20107OooO00o.f109333OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20107OooO00o = new C20107OooO00o(continuation);
                    }
                }
                Object obj2 = c20107OooO00o.f109334OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20107OooO00o.f109333OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) obj;
                    interfaceC33723OooO0oO = this.f109332OooOo0o;
                    if (str != null) {
                        InterfaceC27300OooOOOo interfaceC27300OooOOOo = this.f109331OooOo.f109297OooO0Oo;
                        c20107OooO00o.f109336OooOoO0 = interfaceC33723OooO0oO;
                        c20107OooO00o.f109333OooOo = 1;
                        Serializable serializableOooO0oo = interfaceC27300OooOOOo.OooO0oo(str, false, c20107OooO00o);
                        if (serializableOooO0oo != enumC32485OooO00o) {
                            obj2 = serializableOooO0oo;
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        }
                        return enumC32485OooO00o;
                    }
                    arrayList = null;
                    c20107OooO00o.f109336OooOoO0 = null;
                    c20107OooO00o.f109333OooOo = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC33723OooO0oO2 = c20107OooO00o.f109336OooOoO0;
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
                c20107OooO00o.f109336OooOoO0 = null;
                c20107OooO00o.f109333OooOo = 2;
            }
        }

        public OooO0o(C33781o00o0O c33781o00o0O, C30558OooO0oo c30558OooO0oo) {
            this.f109330OooOo0o = c33781o00o0O;
            this.f109329OooOo = c30558OooO0oo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleInAppPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f109330OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f109329OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0o0, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel", m80623f = "AiQuotaPayViewModel.kt", m80624l = {786, 788}, m80625m = "restorePurchase")
    public static final class C30560OooO0o0 extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f109337OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f109338OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public /* synthetic */ Object f109340OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f109341OooOoOO;

        public C30560OooO0o0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
            super(abstractC32479OooO0OO);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f109340OooOoO0 = obj;
            this.f109341OooOoOO |= Integer.MIN_VALUE;
            return C30558OooO0oo.this.OooO0o0(this);
        }
    }

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0oO, reason: case insensitive filesystem */
    public static final class C30561OooO0oO implements InterfaceC33721OooO0o<List<? extends NoteinGoogleSubscriptionPurchase>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30558OooO0oo f109342OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f109343OooOo0o;

        /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0oO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30558OooO0oo f109344OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f109345OooOo0o;

            /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0oO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$special$$inlined$map$2$2", m80623f = "AiQuotaPayViewModel.kt", m80624l = {54, 50}, m80625m = "emit")
            public static final class C20108OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f109346OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f109347OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f109349OooOoO0;

                public C20108OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f109347OooOo0o = obj;
                    this.f109346OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30558OooO0oo c30558OooO0oo) {
                this.f109345OooOo0o = interfaceC33723OooO0oO;
                this.f109344OooOo = c30558OooO0oo;
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
                C20108OooO00o c20108OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                ArrayList arrayList;
                if (continuation instanceof C20108OooO00o) {
                    c20108OooO00o = (C20108OooO00o) continuation;
                    int i = c20108OooO00o.f109346OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20108OooO00o.f109346OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20108OooO00o = new C20108OooO00o(continuation);
                    }
                }
                Object obj2 = c20108OooO00o.f109347OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20108OooO00o.f109346OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) obj;
                    interfaceC33723OooO0oO = this.f109345OooOo0o;
                    if (str != null) {
                        InterfaceC27300OooOOOo interfaceC27300OooOOOo = this.f109344OooOo.f109297OooO0Oo;
                        c20108OooO00o.f109349OooOoO0 = interfaceC33723OooO0oO;
                        c20108OooO00o.f109346OooOo = 1;
                        Serializable serializableOooO0O0 = interfaceC27300OooOOOo.OooO0O0(str, false, c20108OooO00o);
                        if (serializableOooO0O0 != enumC32485OooO00o) {
                            obj2 = serializableOooO0O0;
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        }
                        return enumC32485OooO00o;
                    }
                    arrayList = null;
                    c20108OooO00o.f109349OooOoO0 = null;
                    c20108OooO00o.f109346OooOo = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC33723OooO0oO2 = c20108OooO00o.f109349OooOoO0;
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
                c20108OooO00o.f109349OooOoO0 = null;
                c20108OooO00o.f109346OooOo = 2;
            }
        }

        public C30561OooO0oO(C33781o00o0O c33781o00o0O, C30558OooO0oo c30558OooO0oo) {
            this.f109343OooOo0o = c33781o00o0O;
            this.f109342OooOo = c30558OooO0oo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleSubscriptionPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f109343OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f109342OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0oo, reason: collision with other inner class name */
    public static final class C20109OooO0oo implements InterfaceC33721OooO0o<List<? extends NoteinGoogleDeveloperOffer>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30558OooO0oo f109350OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f109351OooOo0o;

        /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0oo$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C30558OooO0oo f109352OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f109353OooOo0o;

            /* JADX INFO: renamed from: o0o0OOoO.OooO0oo$OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayViewModel$special$$inlined$map$3$2", m80623f = "AiQuotaPayViewModel.kt", m80624l = {54, 50}, m80625m = "emit")
            public static final class C20110OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f109354OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f109355OooOo0o;

                /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
                public InterfaceC33723OooO0oO f109357OooOoO0;

                public C20110OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f109355OooOo0o = obj;
                    this.f109354OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C30558OooO0oo c30558OooO0oo) {
                this.f109353OooOo0o = interfaceC33723OooO0oO;
                this.f109352OooOo = c30558OooO0oo;
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
                C20110OooO00o c20110OooO00o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
                RandomAccess randomAccess;
                if (continuation instanceof C20110OooO00o) {
                    c20110OooO00o = (C20110OooO00o) continuation;
                    int i = c20110OooO00o.f109354OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20110OooO00o.f109354OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20110OooO00o = new C20110OooO00o(continuation);
                    }
                }
                Object obj2 = c20110OooO00o.f109355OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20110OooO00o.f109354OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    String str = (String) obj;
                    interfaceC33723OooO0oO = this.f109353OooOo0o;
                    if (str != null) {
                        InterfaceC27300OooOOOo interfaceC27300OooOOOo = this.f109352OooOo.f109297OooO0Oo;
                        c20110OooO00o.f109357OooOoO0 = interfaceC33723OooO0oO;
                        c20110OooO00o.f109354OooOo = 1;
                        Serializable serializableOooO0o0 = interfaceC27300OooOOOo.OooO0o0(str, c20110OooO00o);
                        if (serializableOooO0o0 != enumC32485OooO00o) {
                            obj2 = serializableOooO0o0;
                            interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        }
                        return enumC32485OooO00o;
                    }
                    randomAccess = C34434OooOoO.f123453OooOo0o;
                    c20110OooO00o.f109357OooOoO0 = null;
                    c20110OooO00o.f109354OooOo = 2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    interfaceC33723OooO0oO2 = c20110OooO00o.f109357OooOoO0;
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
                c20110OooO00o.f109357OooOoO0 = null;
                c20110OooO00o.f109354OooOo = 2;
            }
        }

        public C20109OooO0oo(C33781o00o0O c33781o00o0O, C30558OooO0oo c30558OooO0oo) {
            this.f109351OooOo0o = c33781o00o0O;
            this.f109350OooOo = c30558OooO0oo;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleDeveloperOffer>> interfaceC33723OooO0oO, Continuation continuation) {
            this.f109351OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f109350OooOo), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public C30558OooO0oo(Context context, InterfaceC27300OooOOOo googleBillingRepo, InterfaceC27325OoooO00 vertexAiRepo, InterfaceC27322Oooo0o0 remoteConfigRepo, InterfaceC27308OooOo0o logEventRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(googleBillingRepo, "googleBillingRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(vertexAiRepo, "vertexAiRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(remoteConfigRepo, "remoteConfigRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(logEventRepo, "logEventRepo");
        this.f109297OooO0Oo = googleBillingRepo;
        this.f109299OooO0o0 = vertexAiRepo;
        this.f109298OooO0o = remoteConfigRepo;
        this.f109300OooO0oO = logEventRepo;
        this.f109301OooO0oo = new Object();
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f109296OooO = c33781o00o0OOooO00o;
        OooO0o oooO0o = new OooO0o(c33781o00o0OOooO00o, this);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        this.f109302OooOO0 = C25252OooO0Oo.OooOoO0(oooO0o, C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f109303OooOO0O = C25252OooO0Oo.OooOoO0(new C30561OooO0oO(c33781o00o0OOooO00o, this), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(new C20109OooO0oo(c33781o00o0OOooO00o, this), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(State.OooO0O0.f78711OooO00o);
        this.f109304OooOO0o = c33781o00o0OOooO00o2;
        this.f109306OooOOO0 = c33781o00o0OOooO00o2;
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f109305OooOOO = c33772OooooOoOooO0O0;
        this.f109307OooOOOO = c33772OooooOoOooO0O0;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(null);
        this.f109308OooOOOo = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(null);
        this.f109310OooOOo0 = c33781o00o0OOooO00o4;
        C33772OooooOo c33772OooooOoOooO0O02 = C33773Oooooo.OooO0O0(0, 0, 7);
        this.f109309OooOOo = c33772OooooOoOooO0O02;
        this.f109311OooOOoo = c33772OooooOoOooO0O02;
        this.f109314OooOo00 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33781o00o0OOooO00o3, c33769Ooooo0oOooOoO0, c33781o00o0OOooO00o4, new C30559OooO0Oo(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f109315OooOo0O = C34429OooOOo0.OooOO0o(new C31058OooOooO(R.drawable.ic_privilege_handwriting_to_text, R.string.title_vip_feature_handwriting_to_text), new C31058OooOooO(R.drawable.ic_privilege_image_to_text, R.string.title_vip_feature_image_to_text), new C31058OooOooO(R.drawable.ic_privilege_pdf_to_text, R.string.title_vip_feature_pdf_to_text), new C31058OooOooO(R.drawable.ic_privilege_edit_in_app, R.string.title_vip_feature_edit_in_app), new C31058OooOooO(R.drawable.ic_privilege_ai_summarization, R.string.title_vip_feature_ai_summarization), new C31058OooOooO(R.drawable.ic_privilege_ai_chatbot, R.string.title_vip_feature_ai_chatbot));
        this.f109316OooOo0o = C25252OooO0Oo.OooOoO0(new C33770OooooO0(new OooO0OO(null)), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34434OooOoO.f123453OooOo0o);
        C21192OooO0o c21192OooO0o = new C21192OooO0o(this);
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(context);
        oooO00o.f66891OooO0OO = c21192OooO0o;
        oooO00o.f66889OooO00o = new com.android.billingclient.api.OooOO0();
        C22159OooO0Oo c22159OooO0OoOooO00o = oooO00o.OooO00o();
        this.f109312OooOo = c22159OooO0OoOooO00o;
        c22159OooO0OoOooO00o.OooO0o0(new OooO00o());
        this.f109317OooOoO0 = C20519OooO0Oo.OooO0OO(new C29439OooO00o(this, 2));
    }

    @Override // androidx.lifecycle.AbstractC22019Ooooooo
    public final void OooO0OO() {
        this.f109312OooOo.OooO0O0();
    }

    public final void OooO0o(State state, Object obj) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
        c20358OooO00o.OooO0o0("setTransactionsStateLocked newState: ".concat(state.getClass().getSimpleName()), new Object[0]);
        C33781o00o0O c33781o00o0O = this.f109304OooOO0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, state);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30563OooOO0O(state, this, obj, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(Continuation<? super C27174OooO0O0<C32460OooOooO>> continuation) {
        C30560OooO0o0 c30560OooO0o0;
        String str;
        C30558OooO0oo c30558OooO0oo;
        if (continuation instanceof C30560OooO0o0) {
            c30560OooO0o0 = (C30560OooO0o0) continuation;
            int i = c30560OooO0o0.f109341OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c30560OooO0o0.f109341OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c30560OooO0o0 = new C30560OooO0o0((AbstractC32479OooO0OO) continuation);
            }
        }
        Object objOooO0Oo = c30560OooO0o0.f109340OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c30560OooO0o0.f109341OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            str = (String) this.f109296OooO.getValue();
            if (str == null) {
                return new C27174OooO0O0(false, null, "199998", "User id is null", 2);
            }
            c30560OooO0o0.f109338OooOo0o = this;
            c30560OooO0o0.f109337OooOo = str;
            c30560OooO0o0.f109341OooOoOO = 1;
            objOooO0Oo = this.f109297OooO0Oo.OooO0Oo(str, true, c30560OooO0o0);
            if (objOooO0Oo != enumC32485OooO00o) {
                c30558OooO0oo = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = c30560OooO0o0.f109338OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            return obj;
        }
        str = c30560OooO0o0.f109337OooOo;
        c30558OooO0oo = (C30558OooO0oo) c30560OooO0o0.f109338OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        InterfaceC27325OoooO00 interfaceC27325OoooO00 = c30558OooO0oo.f109299OooO0o0;
        c30560OooO0o0.f109338OooOo0o = objOooO0Oo;
        c30560OooO0o0.f109337OooOo = null;
        c30560OooO0o0.f109341OooOoOO = 2;
        return interfaceC27325OoooO00.OooO0OO(str, c30560OooO0o0) == enumC32485OooO00o ? enumC32485OooO00o : objOooO0Oo;
    }

    public final void OooO0oO(Event event, Object obj) {
        synchronized (this.f109301OooO0oo) {
            State state = (State) this.f109304OooOO0o.getValue();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
            c20358OooO00o.OooO0o0("transitionToState currentState: " + state.getClass().getSimpleName() + ", event: " + event.getClass().getSimpleName(), new Object[0]);
            if (event.equals(Event.OooO.f78702OooO00o)) {
                OooO0o(State.C23767OooO0Oo.f78713OooO00o, obj);
                return;
            }
            State stateNextState = state.nextState(event);
            if (stateNextState != null) {
                OooO0o(stateNextState, obj);
            } else {
                c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                c20358OooO00o.OooO0OO("Can not change the state. current: " + state + " event: " + event, new Object[0]);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
