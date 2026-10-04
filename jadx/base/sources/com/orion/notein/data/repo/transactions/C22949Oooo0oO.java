package com.orion.notein.data.repo.transactions;

import OooOoOO.C20519OooO0Oo;
import OooooOO.C21355Ooooooo;
import com.android.billingclient.api.Purchase;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.orion.notein.data.p602db.entity.NoteinGoogleDeveloperOfferEntity;
import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import com.orion.notein.domain.mapper.NoteinGoogleOfferMapper;
import com.orion.notein.domain.mapper.NoteinGooglePurchaseMapper;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleDeveloperOffer;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.domain.models.transactions.google.ProductPurchase;
import com.orion.notein.domain.models.transactions.google.SubscriptionPurchaseV2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0OOOOOo.OooO0O0;
import o0OOOo0.C27174OooO0O0;
import o0OOo0Oo.InterfaceC27300OooOOOo;
import o0o0OOoo.C30574OooO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
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
import oO0o0OO.o0000;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oo0oO0.o0oOO;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22949Oooo0oO implements InterfaceC27300OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GoogleBillingDataSource f70201OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0Oo0oo f70202OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Ooo f70203OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final NoteinGooglePurchaseMapper f70204OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33898OooO0Oo f70205OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final NoteinGoogleOfferMapper f70206OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C32447OooOOo f70207OooO0oO;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$checkVipEntitlement$1", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {229, 232, 233}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f70209OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f70210OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ boolean f70211OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f70211OooOoO0 = z;
            this.f70210OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C22949Oooo0oO.this.new OooO00o(this.f70211OooOoO0, this.f70210OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r9.OooO0oO(r6, r8) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        
            if (r7.OooO0O0(r2, r6, r8) != r0) goto L25;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f70209OooOo0o;
            String str = this.f70210OooOoO;
            boolean z = this.f70211OooOoO0;
            C22949Oooo0oO c22949Oooo0oO = C22949Oooo0oO.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (c22949Oooo0oO.OooOOOo()) {
                    GoogleBillingDataSource googleBillingDataSource = c22949Oooo0oO.f70201OooO00o;
                    this.f70209OooOo0o = 1;
                } else {
                    this.f70209OooOo0o = 2;
                    if (c22949Oooo0oO.OooO0oo(str, z, this) != enumC32485OooO00o) {
                        this.f70209OooOo0o = 3;
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f70209OooOo0o = 3;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC33721OooO0o<NoteinGoogleSubscriptionPurchase> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f70212OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33769Ooooo0o f70213OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f70214OooOoO0;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ String f70215OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70216OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ String f70217OooOoO0;

            /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getSubscriptionPurchase$$inlined$map$1$2", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19134OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70218OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70219OooOo0o;

                public C19134OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70219OooOo0o = obj;
                    this.f70218OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str, String str2) {
                this.f70216OooOo0o = interfaceC33723OooO0oO;
                this.f70215OooOo = str;
                this.f70217OooOoO0 = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19134OooO00o c19134OooO00o;
                Object next;
                if (continuation instanceof C19134OooO00o) {
                    c19134OooO00o = (C19134OooO00o) continuation;
                    int i = c19134OooO00o.f70218OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19134OooO00o.f70218OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19134OooO00o = new C19134OooO00o(continuation);
                    }
                }
                Object obj2 = c19134OooO00o.f70219OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19134OooO00o.f70218OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(NoteinGoogleSubscriptionPurchase.INSTANCE.fromSubscriptionPurchaseV2((SubscriptionPurchaseV2) it.next(), this.f70215OooOo));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleSubscriptionPurchase) next).getPurchaseToken(), this.f70217OooOoO0)) {
                            break;
                        }
                    }
                    c19134OooO00o.f70218OooOo = 1;
                    if (this.f70216OooOo0o.emit(next, c19134OooO00o) == enumC32485OooO00o) {
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

        public OooO0O0(C33769Ooooo0o c33769Ooooo0o, String str, String str2) {
            this.f70213OooOo0o = c33769Ooooo0o;
            this.f70212OooOo = str;
            this.f70214OooOoO0 = str2;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteinGoogleSubscriptionPurchase> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70213OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f70212OooOo, this.f70214OooOoO0), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO0OO */
    public static final class OooO0OO implements InterfaceC33721OooO0o<NoteinGoogleSubscriptionPurchase> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C22949Oooo0oO f70221OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33721OooO0o f70222OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO0OO$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ C22949Oooo0oO f70223OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f70224OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oO$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getSubscriptionPurchase$$inlined$map$2$2", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
            public static final class C19135OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f70225OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f70226OooOo0o;

                public C19135OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f70226OooOo0o = obj;
                    this.f70225OooOo |= Integer.MIN_VALUE;
                    return OooO00o.this.emit(null, this);
                }
            }

            public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C22949Oooo0oO c22949Oooo0oO) {
                this.f70224OooOo0o = interfaceC33723OooO0oO;
                this.f70223OooOo = c22949Oooo0oO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C19135OooO00o c19135OooO00o;
                if (continuation instanceof C19135OooO00o) {
                    c19135OooO00o = (C19135OooO00o) continuation;
                    int i = c19135OooO00o.f70225OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c19135OooO00o.f70225OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c19135OooO00o = new C19135OooO00o(continuation);
                    }
                }
                Object obj2 = c19135OooO00o.f70226OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c19135OooO00o.f70225OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity = (NoteinGoogleSubscriptionPurchaseEntity) obj;
                    NoteinGoogleSubscriptionPurchase subscriptionModel = noteinGoogleSubscriptionPurchaseEntity != null ? this.f70223OooOo.f70204OooO0Oo.toSubscriptionModel(noteinGoogleSubscriptionPurchaseEntity) : null;
                    c19135OooO00o.f70225OooOo = 1;
                    if (this.f70224OooOo0o.emit(subscriptionModel, c19135OooO00o) == enumC32485OooO00o) {
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

        public OooO0OO(InterfaceC33721OooO0o interfaceC33721OooO0o, C22949Oooo0oO c22949Oooo0oO) {
            this.f70222OooOo0o = interfaceC33721OooO0o;
            this.f70221OooOo = c22949Oooo0oO;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super NoteinGoogleSubscriptionPurchase> interfaceC33723OooO0oO, Continuation continuation) {
            Object objCollect = this.f70222OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f70221OooOo), continuation);
            return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
        }
    }

    public C22949Oooo0oO(GoogleBillingDataSource googleBillingDataSource, o0Oo0oo o0oo0oo2, o00Ooo o00ooo2, NoteinGooglePurchaseMapper mapper, NoteinGoogleOfferMapper offerMapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(offerMapper, "offerMapper");
        this.f70201OooO00o = googleBillingDataSource;
        this.f70202OooO0O0 = o0oo0oo2;
        this.f70203OooO0OO = o00ooo2;
        this.f70204OooO0Oo = mapper;
        this.f70206OooO0o0 = offerMapper;
        this.f70205OooO0o = C33900OooO0o0.OooO00o();
        this.f70207OooO0oO = C20519OooO0Oo.OooO0OO(new C22946Oooo0OO());
        googleBillingDataSource.f70025OooO0o0 = OooOOOo();
    }

    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    public final Object OooO(String str, String str2, C30574OooO0o c30574OooO0o) {
        o0Oo0oo o0oo0oo2 = this.f70202OooO0O0;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22972o00ooo(str, str2, o0oo0oo2, null), c30574OooO0o);
    }

    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    public final InterfaceC33721OooO0o<NoteinGoogleSubscriptionPurchase> OooO00o(String str, String str2) {
        return OooOOOo() ? new OooO0O0(this.f70201OooO00o.f70040OooOo00, str2, str) : new OooO0OO(this.f70203OooO0OO.f70347OooO00o.OooO00o(str, str2), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b5, code lost:
    
        if (r2 != r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[LOOP:2: B:42:0x00bc->B:44:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0O0(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22953OoooO00 c22953OoooO00;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        String str2;
        C22949Oooo0oO c22949Oooo0oO;
        C22949Oooo0oO c22949Oooo0oO2;
        Iterator it;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Object objOooO0o;
        String str3;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        C22949Oooo0oO c22949Oooo0oO3;
        C27174OooO0O0 c27174OooO0O0;
        C22949Oooo0oO c22949Oooo0oO4;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof C22953OoooO00) {
            c22953OoooO00 = (C22953OoooO00) abstractC32479OooO0OO;
            int i = c22953OoooO00.f70252OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22953OoooO00.f70252OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c22953OoooO00 = new C22953OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o2 = c22953OoooO00.f70249OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22953OoooO00.f70252OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o2);
            if (OooOOOo()) {
                c22953OoooO00.f70248OooOo0o = this;
                c22953OoooO00.f70247OooOo = str4;
                c22953OoooO00.f70252OooOoo0 = 1;
                if (this.f70201OooO00o.OooO0oO(z, c22953OoooO00) != enumC32485OooO00o) {
                    c22949Oooo0oO2 = this;
                    List list = (List) c22949Oooo0oO2.f70201OooO00o.f70040OooOo00.f121747OooOo0o.getValue();
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return arrayList;
                }
            } else {
                c22953OoooO00.f70248OooOo0o = this;
                c22953OoooO00.f70247OooOo = str4;
                interfaceC33895OooO00o = this.f70205OooO0o;
                c22953OoooO00.f70250OooOoO0 = interfaceC33895OooO00o;
                c22953OoooO00.f70252OooOoo0 = 2;
                if (interfaceC33895OooO00o.OooO00o(c22953OoooO00) != enumC32485OooO00o) {
                    str2 = str4;
                    c22949Oooo0oO = this;
                    o0Oo0oo o0oo0oo2 = c22949Oooo0oO.f70202OooO0O0;
                    c22953OoooO00.f70248OooOo0o = c22949Oooo0oO;
                    c22953OoooO00.f70247OooOo = str2;
                    c22953OoooO00.f70250OooOoO0 = interfaceC33895OooO00o;
                    c22953OoooO00.f70252OooOoo0 = 3;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22973o0ooOO0(o0oo0oo2, null), c22953OoooO00);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str4 = c22953OoooO00.f70247OooOo;
            c22949Oooo0oO2 = c22953OoooO00.f70248OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o2);
            List list2 = (List) c22949Oooo0oO2.f70201OooO00o.f70040OooOo00.f121747OooOo0o.getValue();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(NoteinGoogleSubscriptionPurchase.INSTANCE.fromSubscriptionPurchaseV2((SubscriptionPurchaseV2) it.next(), str4));
            }
            return arrayList2;
        }
        if (i2 == 2) {
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = c22953OoooO00.f70250OooOoO0;
            str2 = c22953OoooO00.f70247OooOo;
            c22949Oooo0oO = c22953OoooO00.f70248OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o2);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            try {
                o0Oo0oo o0oo0oo22 = c22949Oooo0oO.f70202OooO0O0;
                c22953OoooO00.f70248OooOo0o = c22949Oooo0oO;
                c22953OoooO00.f70247OooOo = str2;
                c22953OoooO00.f70250OooOoO0 = interfaceC33895OooO00o;
                c22953OoooO00.f70252OooOoo0 = 3;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22973o0ooOO0(o0oo0oo22, null), c22953OoooO00);
            } catch (Exception e) {
                e = e;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                c22949Oooo0oO3 = c22949Oooo0oO;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingRepo");
                c20358OooO00o.OooO0Oo(e, "Failed to query active subscription purchases", new Object[0]);
            } catch (Throwable th) {
                th = th;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
            if (objOooO0o != enumC32485OooO00o) {
                str3 = str2;
                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                objOooO0o2 = objOooO0o;
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GoogleBillingRepo");
                c20358OooO00o2.OooO0OO("Failed to fetch subscription purchases from server. " + c27174OooO0O0, new Object[0]);
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                c22949Oooo0oO4 = c22949Oooo0oO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo2 = c22949Oooo0oO4.f70203OooO0OO;
                c22953OoooO00.f70248OooOo0o = c22949Oooo0oO4;
                c22953OoooO00.f70247OooOo = null;
                c22953OoooO00.f70250OooOoO0 = null;
                c22953OoooO00.f70252OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22969Ooooooo(o00ooo2, str3, null), c22953OoooO00);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 3) {
            interfaceC33895OooO00o3 = c22953OoooO00.f70250OooOoO0;
            str3 = c22953OoooO00.f70247OooOo;
            c22949Oooo0oO = c22953OoooO00.f70248OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o2);
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
            } catch (Exception e2) {
                e = e2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                str2 = str3;
                c22949Oooo0oO3 = c22949Oooo0oO;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("GoogleBillingRepo");
                c20358OooO00o3.OooO0Oo(e, "Failed to query active subscription purchases", new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("GoogleBillingRepo");
                c20358OooO00o22.OooO0OO("Failed to fetch subscription purchases from server. " + c27174OooO0O0, new Object[0]);
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                c22949Oooo0oO4 = c22949Oooo0oO;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo22 = c22949Oooo0oO4.f70203OooO0OO;
                c22953OoooO00.f70248OooOo0o = c22949Oooo0oO4;
                c22953OoooO00.f70247OooOo = null;
                c22953OoooO00.f70250OooOoO0 = null;
                c22953OoooO00.f70252OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22969Ooooooo(o00ooo22, str3, null), c22953OoooO00);
            } else {
                Iterable iterable = (Iterable) c27174OooO0O0.OooO0O0();
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(c22949Oooo0oO.f70204OooO0Oo.toSubscriptionEntity((NoteinGoogleSubscriptionPurchase) it2.next()));
                }
                o00Ooo o00ooo3 = c22949Oooo0oO.f70203OooO0OO;
                c22953OoooO00.f70248OooOo0o = c22949Oooo0oO;
                c22953OoooO00.f70247OooOo = str3;
                c22953OoooO00.f70250OooOoO0 = interfaceC33895OooO00o3;
                c22953OoooO00.f70252OooOoo0 = 4;
                C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00Oo0(o00ooo3, str3, arrayList3, null), c22953OoooO00);
                if (objOooO0o3 != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o3 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o3 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                str2 = str3;
                c22949Oooo0oO3 = c22949Oooo0oO;
                str3 = str2;
                c22949Oooo0oO4 = c22949Oooo0oO3;
                C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo222 = c22949Oooo0oO4.f70203OooO0OO;
                c22953OoooO00.f70248OooOo0o = c22949Oooo0oO4;
                c22953OoooO00.f70247OooOo = null;
                c22953OoooO00.f70250OooOoO0 = null;
                c22953OoooO00.f70252OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO322 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22969Ooooooo(o00ooo222, str3, null), c22953OoooO00);
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22949Oooo0oO4 = c22953OoooO00.f70248OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o2);
                List list3 = (List) objOooO0o2;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("GoogleBillingRepo");
                c20358OooO00o4.OooO0o0("fetchSubscriptionPurchase: localData: " + list3, new Object[0]);
                List list4 = list3;
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(c22949Oooo0oO4.f70204OooO0Oo.toSubscriptionModel((NoteinGoogleSubscriptionPurchaseEntity) it3.next()));
                }
                return arrayList4;
            }
            interfaceC33895OooO00o2 = c22953OoooO00.f70250OooOoO0;
            str2 = c22953OoooO00.f70247OooOo;
            c22949Oooo0oO3 = c22953OoooO00.f70248OooOo0o;
            try {
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o2);
                } catch (Exception e3) {
                    e = e3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32.OooOOO0("GoogleBillingRepo");
                    c20358OooO00o32.OooO0Oo(e, "Failed to query active subscription purchases", new Object[0]);
                }
                str3 = str2;
                c22949Oooo0oO4 = c22949Oooo0oO3;
                C32460OooOooO c32460OooOooO222 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo2222 = c22949Oooo0oO4.f70203OooO0OO;
                c22953OoooO00.f70248OooOo0o = c22949Oooo0oO4;
                c22953OoooO00.f70247OooOo = null;
                c22953OoooO00.f70250OooOoO0 = null;
                c22953OoooO00.f70252OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO3222 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22969Ooooooo(o00ooo2222, str3, null), c22953OoooO00);
            } catch (Throwable th3) {
                th = th3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
    }

    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    public final void OooO0OO(String userId, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(z, userId, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22965OooooOo c22965OooooOo;
        String str2;
        Object objOooOOO;
        C22949Oooo0oO c22949Oooo0oO;
        C27174OooO0O0 c27174OooO0O0;
        Map map;
        ArrayList arrayList;
        String str3;
        C22949Oooo0oO c22949Oooo0oO2;
        C27174OooO0O0 c27174OooO0O02;
        String errorMsg;
        ArrayList arrayList2;
        C27174OooO0O0 c27174OooO0O03;
        String errorMsg2;
        ArrayList arrayList3;
        String str4;
        C22949Oooo0oO c22949Oooo0oO3;
        C27174OooO0O0 c27174OooO0O04;
        String errorMsg3;
        C22949Oooo0oO c22949Oooo0oO4;
        Serializable serializableOooO0O0;
        List list;
        if (abstractC32479OooO0OO instanceof C22965OooooOo) {
            c22965OooooOo = (C22965OooooOo) abstractC32479OooO0OO;
            int i = c22965OooooOo.f70315OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22965OooooOo.f70315OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c22965OooooOo = new C22965OooooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c22965OooooOo.f70312OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        switch (c22965OooooOo.f70315OooOoo0) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooO0o);
                if (OooOOOo()) {
                    c22965OooooOo.f70315OooOoo0 = 1;
                    GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22936OooOoO0(googleBillingDataSource, null), c22965OooooOo);
                    if (objOooO0o2 != enumC32485OooO00o) {
                        return objOooO0o2;
                    }
                } else {
                    c22965OooooOo.f70311OooOo0o = this;
                    str2 = str;
                    c22965OooooOo.f70310OooOo = str2;
                    c22965OooooOo.f70315OooOoo0 = 2;
                    objOooOOO = OooOOO(z, c22965OooooOo);
                    if (objOooOOO != enumC32485OooO00o) {
                        c22949Oooo0oO = this;
                        c27174OooO0O0 = (C27174OooO0O0) objOooOOO;
                        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "300001");
                        if (c27174OooO0O0.f94862OooO00o && !zOooO0O0) {
                            return new C27174OooO0O0(false, null, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg(), 2);
                        }
                        map = (Map) c27174OooO0O0.OooO0O0();
                        if (map == null) {
                            map = C34436OooOoOO.f123455OooOo0o;
                        }
                        if (!C34428OooOOo.OooOo00(map.values()).isEmpty()) {
                            return zOooO0O0 ? new C27174OooO0O0(false, null, "300001", "", 2) : new C27174OooO0O0(false, null, "310005", "", 2);
                        }
                        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                        List list2 = (List) map.get("inapp");
                        if (list2 != null) {
                            arrayList = new ArrayList();
                            for (Object obj : list2) {
                                if (obj instanceof Purchase) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            c32465OooO0O0OooO0Oo.addAll(arrayList);
                        }
                        C32465OooO0O0 c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                        o0Oo0oo o0oo0oo2 = c22949Oooo0oO.f70202OooO0O0;
                        c22965OooooOo.f70311OooOo0o = c22949Oooo0oO;
                        c22965OooooOo.f70310OooOo = str2;
                        c22965OooooOo.f70313OooOoO0 = map;
                        c22965OooooOo.f70315OooOoo0 = 3;
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0ooOOo(c32465OooO0O0OooO0O0, o0oo0oo2, null), c22965OooooOo);
                        if (objOooO0o3 != enumC32485OooO00o) {
                            C22949Oooo0oO c22949Oooo0oO5 = c22949Oooo0oO;
                            str3 = str2;
                            objOooO0o = objOooO0o3;
                            c22949Oooo0oO2 = c22949Oooo0oO5;
                            c27174OooO0O02 = (C27174OooO0O0) objOooO0o;
                            if (c27174OooO0O02.f94862OooO00o || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O02.getErrorCode(), "0")) {
                                String errorCode = c27174OooO0O02.getErrorCode();
                                String str5 = errorCode != null ? "300002" : errorCode;
                                errorMsg = c27174OooO0O02.getErrorMsg();
                                if (errorMsg == null) {
                                    errorMsg = "Failed to submit in-app purchases to server";
                                }
                                return new C27174OooO0O0(false, null, str5, errorMsg, 2);
                            }
                            C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                            List list3 = (List) map.get("subs");
                            if (list3 != null) {
                                arrayList2 = new ArrayList();
                                for (Object obj2 : list3) {
                                    if (obj2 instanceof Purchase) {
                                        arrayList2.add(obj2);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                c32465OooO0O0OooO0Oo2.addAll(arrayList2);
                            }
                            C32465OooO0O0 c32465OooO0O0OooO0O02 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2);
                            o0Oo0oo o0oo0oo3 = c22949Oooo0oO2.f70202OooO0O0;
                            c22965OooooOo.f70311OooOo0o = c22949Oooo0oO2;
                            c22965OooooOo.f70310OooOo = str3;
                            c22965OooooOo.f70313OooOoO0 = map;
                            c22965OooooOo.f70315OooOoo0 = 4;
                            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOO0o(c32465OooO0O0OooO0O02, o0oo0oo3, null), c22965OooooOo);
                            if (objOooO0o != enumC32485OooO00o) {
                                c27174OooO0O03 = (C27174OooO0O0) objOooO0o;
                                if (c27174OooO0O03.f94862OooO00o || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O03.getErrorCode(), "0")) {
                                    String errorCode2 = c27174OooO0O03.getErrorCode();
                                    String str6 = errorCode2 != null ? "300002" : errorCode2;
                                    errorMsg2 = c27174OooO0O03.getErrorMsg();
                                    if (errorMsg2 == null) {
                                        errorMsg2 = "Failed to submit subscription purchases to server";
                                    }
                                    return new C27174OooO0O0(false, null, str6, errorMsg2, 2);
                                }
                                C32465OooO0O0 c32465OooO0O0OooO0Oo3 = com.facebook.soloader.OooOo.OooO0Oo();
                                List list4 = (List) map.get("local_cache");
                                if (list4 != null) {
                                    arrayList3 = new ArrayList();
                                    for (Object obj3 : list4) {
                                        if (obj3 instanceof String) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                } else {
                                    arrayList3 = null;
                                }
                                if (arrayList3 != null) {
                                    c32465OooO0O0OooO0Oo3.addAll(arrayList3);
                                }
                                C32465OooO0O0 c32465OooO0O0OooO0O03 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo3);
                                o0Oo0oo o0oo0oo4 = c22949Oooo0oO2.f70202OooO0O0;
                                c22965OooooOo.f70311OooOo0o = c22949Oooo0oO2;
                                c22965OooooOo.f70310OooOo = str3;
                                c22965OooooOo.f70313OooOoO0 = null;
                                c22965OooooOo.f70315OooOoo0 = 5;
                                C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22974o0ooOoO(c32465OooO0O0OooO0O03, o0oo0oo4, null), c22965OooooOo);
                                if (objOooO0o != enumC32485OooO00o) {
                                    str4 = str3;
                                    c22949Oooo0oO3 = c22949Oooo0oO2;
                                    c27174OooO0O04 = (C27174OooO0O0) objOooO0o;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("GoogleBillingRepo");
                                    c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("submitLocalResult: ", c27174OooO0O04.getErrorCode(), ", ", c27174OooO0O04.getErrorMsg()), new Object[0]);
                                    if (c27174OooO0O04.f94862OooO00o || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O04.getErrorCode(), "0")) {
                                        String errorCode3 = c27174OooO0O04.getErrorCode();
                                        String str7 = errorCode3 != null ? "300002" : errorCode3;
                                        errorMsg3 = c27174OooO0O04.getErrorMsg();
                                        if (errorMsg3 == null) {
                                            errorMsg3 = "Failed to submit local purchases to server";
                                        }
                                        return new C27174OooO0O0(false, null, str7, errorMsg3, 2);
                                    }
                                    c22965OooooOo.f70311OooOo0o = c22949Oooo0oO3;
                                    c22965OooooOo.f70310OooOo = str4;
                                    c22965OooooOo.f70315OooOoo0 = 6;
                                    objOooO0o = c22949Oooo0oO3.OooO0oo(str4, false, c22965OooooOo);
                                    if (objOooO0o != enumC32485OooO00o) {
                                        c22949Oooo0oO4 = c22949Oooo0oO3;
                                        List list5 = (List) objOooO0o;
                                        c22965OooooOo.f70311OooOo0o = list5;
                                        c22965OooooOo.f70310OooOo = null;
                                        c22965OooooOo.f70315OooOoo0 = 7;
                                        serializableOooO0O0 = c22949Oooo0oO4.OooO0O0(str4, false, c22965OooooOo);
                                        if (serializableOooO0O0 != enumC32485OooO00o) {
                                            list = list5;
                                            objOooO0o = serializableOooO0O0;
                                            return (list.isEmpty() || !((List) objOooO0o).isEmpty()) ? new C27174OooO0O0(true, null, "0", "", 2) : new C27174OooO0O0(false, null, "310002", "No purchases found", 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(objOooO0o);
                return objOooO0o;
            case 2:
                String str8 = c22965OooooOo.f70310OooOo;
                c22949Oooo0oO = (C22949Oooo0oO) c22965OooooOo.f70311OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                objOooOOO = objOooO0o;
                str2 = str8;
                c27174OooO0O0 = (C27174OooO0O0) objOooOOO;
                boolean zOooO0O02 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "300001");
                if (c27174OooO0O0.f94862OooO00o) {
                }
                map = (Map) c27174OooO0O0.OooO0O0();
                if (map == null) {
                }
                if (!C34428OooOOo.OooOo00(map.values()).isEmpty()) {
                }
                break;
            case 3:
                map = c22965OooooOo.f70313OooOoO0;
                str3 = c22965OooooOo.f70310OooOo;
                c22949Oooo0oO2 = (C22949Oooo0oO) c22965OooooOo.f70311OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                c27174OooO0O02 = (C27174OooO0O0) objOooO0o;
                if (c27174OooO0O02.f94862OooO00o) {
                    break;
                }
                String errorCode4 = c27174OooO0O02.getErrorCode();
                if (errorCode4 != null) {
                }
                errorMsg = c27174OooO0O02.getErrorMsg();
                if (errorMsg == null) {
                }
                return new C27174OooO0O0(false, null, str5, errorMsg, 2);
            case 4:
                map = c22965OooooOo.f70313OooOoO0;
                str3 = c22965OooooOo.f70310OooOo;
                c22949Oooo0oO2 = (C22949Oooo0oO) c22965OooooOo.f70311OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                c27174OooO0O03 = (C27174OooO0O0) objOooO0o;
                if (c27174OooO0O03.f94862OooO00o) {
                    break;
                }
                String errorCode22 = c27174OooO0O03.getErrorCode();
                if (errorCode22 != null) {
                }
                errorMsg2 = c27174OooO0O03.getErrorMsg();
                if (errorMsg2 == null) {
                }
                return new C27174OooO0O0(false, null, str6, errorMsg2, 2);
            case 5:
                str4 = c22965OooooOo.f70310OooOo;
                c22949Oooo0oO3 = (C22949Oooo0oO) c22965OooooOo.f70311OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                c27174OooO0O04 = (C27174OooO0O0) objOooO0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GoogleBillingRepo");
                c20358OooO00o2.OooO0o0(C22237OooO0o0.OooO00o("submitLocalResult: ", c27174OooO0O04.getErrorCode(), ", ", c27174OooO0O04.getErrorMsg()), new Object[0]);
                if (c27174OooO0O04.f94862OooO00o) {
                    break;
                }
                String errorCode32 = c27174OooO0O04.getErrorCode();
                if (errorCode32 != null) {
                }
                errorMsg3 = c27174OooO0O04.getErrorMsg();
                if (errorMsg3 == null) {
                }
                return new C27174OooO0O0(false, null, str7, errorMsg3, 2);
            case 6:
                str4 = c22965OooooOo.f70310OooOo;
                c22949Oooo0oO4 = (C22949Oooo0oO) c22965OooooOo.f70311OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                List list52 = (List) objOooO0o;
                c22965OooooOo.f70311OooOo0o = list52;
                c22965OooooOo.f70310OooOo = null;
                c22965OooooOo.f70315OooOoo0 = 7;
                serializableOooO0O0 = c22949Oooo0oO4.OooO0O0(str4, false, c22965OooooOo);
                if (serializableOooO0O0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                list = (List) c22965OooooOo.f70311OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                if (list.isEmpty()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(String str, Purchase purchase, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22967Oooooo0 c22967Oooooo0;
        String str3;
        C22949Oooo0oO c22949Oooo0oO;
        C27174OooO0O0 c27174OooO0O0;
        String errorMsg;
        C27174OooO0O0 c27174OooO0O02;
        String errorMsg2;
        Object objOooO0O0;
        List list;
        if (abstractC32479OooO0OO instanceof C22967Oooooo0) {
            c22967Oooooo0 = (C22967Oooooo0) abstractC32479OooO0OO;
            int i = c22967Oooooo0.f70322OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22967Oooooo0.f70322OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c22967Oooooo0 = new C22967Oooooo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c22967Oooooo0.f70321OooOoO0;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22967Oooooo0.f70322OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (OooOOOo()) {
                c22967Oooooo0.f70322OooOoOO = 1;
                GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22936OooOoO0(googleBillingDataSource, null), c22967Oooooo0);
                if (objOooO0o2 != obj) {
                    return objOooO0o2;
                }
            } else {
                boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(str, "inapp");
                o0Oo0oo o0oo0oo2 = this.f70202OooO0O0;
                if (zOooO0O0) {
                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(purchase);
                    c22967Oooooo0.f70319OooOo0o = this;
                    c22967Oooooo0.f70318OooOo = str2;
                    c22967Oooooo0.f70322OooOoOO = 2;
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0ooOOo(listOooO0oO, o0oo0oo2, null), c22967Oooooo0);
                    if (objOooO0o != obj) {
                        str3 = str2;
                        c22949Oooo0oO = this;
                        c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
                        if (c27174OooO0O0.f94862OooO00o) {
                        }
                        String errorCode = c27174OooO0O0.getErrorCode();
                        if (errorCode != null) {
                        }
                        errorMsg = c27174OooO0O0.getErrorMsg();
                        if (errorMsg == null) {
                        }
                        return new C27174OooO0O0(false, null, str, errorMsg, 2);
                    }
                } else if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "subs")) {
                    List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(purchase);
                    c22967Oooooo0.f70319OooOo0o = this;
                    c22967Oooooo0.f70318OooOo = str2;
                    c22967Oooooo0.f70322OooOoOO = 3;
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OOO0o(listOooO0oO2, o0oo0oo2, null), c22967Oooooo0);
                    if (objOooO0o != obj) {
                        str3 = str2;
                        c22949Oooo0oO = this;
                        c27174OooO0O02 = (C27174OooO0O0) objOooO0o;
                        if (c27174OooO0O02.f94862OooO00o) {
                        }
                        String errorCode2 = c27174OooO0O02.getErrorCode();
                        if (errorCode2 != null) {
                        }
                        errorMsg2 = c27174OooO0O02.getErrorMsg();
                        if (errorMsg2 == null) {
                        }
                        return new C27174OooO0O0(false, null, str, errorMsg2, 2);
                    }
                } else {
                    str3 = str2;
                    c22949Oooo0oO = this;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            return objOooO0o;
        }
        if (i2 == 2) {
            str3 = c22967Oooooo0.f70318OooOo;
            c22949Oooo0oO = (C22949Oooo0oO) c22967Oooooo0.f70319OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
            if (c27174OooO0O0.f94862OooO00o || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                String errorCode3 = c27174OooO0O0.getErrorCode();
                String str4 = errorCode3 != null ? "300002" : errorCode3;
                errorMsg = c27174OooO0O0.getErrorMsg();
                if (errorMsg == null) {
                    errorMsg = "Failed to submit in-app purchases to server";
                }
                return new C27174OooO0O0(false, null, str4, errorMsg, 2);
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) c22967Oooooo0.f70319OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    return (list.isEmpty() || !((List) objOooO0o).isEmpty()) ? new C27174OooO0O0(true, null, "0", "", 2) : new C27174OooO0O0(false, null, "310002", "No purchases found", 2);
                }
                str3 = c22967Oooooo0.f70318OooOo;
                c22949Oooo0oO = (C22949Oooo0oO) c22967Oooooo0.f70319OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                List list2 = (List) objOooO0o;
                c22967Oooooo0.f70319OooOo0o = list2;
                c22967Oooooo0.f70318OooOo = null;
                c22967Oooooo0.f70322OooOoOO = 5;
                objOooO0O0 = c22949Oooo0oO.OooO0O0(str3, false, c22967Oooooo0);
                if (objOooO0O0 != obj) {
                    objOooO0o = objOooO0O0;
                    list = list2;
                    if (list.isEmpty()) {
                    }
                }
                return obj;
            }
            str3 = c22967Oooooo0.f70318OooOo;
            c22949Oooo0oO = (C22949Oooo0oO) c22967Oooooo0.f70319OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            c27174OooO0O02 = (C27174OooO0O0) objOooO0o;
            if (c27174OooO0O02.f94862OooO00o || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O02.getErrorCode(), "0")) {
                String errorCode22 = c27174OooO0O02.getErrorCode();
                String str5 = errorCode22 != null ? "300002" : errorCode22;
                errorMsg2 = c27174OooO0O02.getErrorMsg();
                if (errorMsg2 == null) {
                    errorMsg2 = "Failed to submit subscription purchases to server";
                }
                return new C27174OooO0O0(false, null, str5, errorMsg2, 2);
            }
        }
        c22967Oooooo0.f70319OooOo0o = c22949Oooo0oO;
        c22967Oooooo0.f70318OooOo = str3;
        c22967Oooooo0.f70322OooOoOO = 4;
        objOooO0o = c22949Oooo0oO.OooO0oo(str3, false, c22967Oooooo0);
        if (objOooO0o != obj) {
            List list22 = (List) objOooO0o;
            c22967Oooooo0.f70319OooOo0o = list22;
            c22967Oooooo0.f70318OooOo = null;
            c22967Oooooo0.f70322OooOoOO = 5;
            objOooO0O0 = c22949Oooo0oO.OooO0O0(str3, false, c22967Oooooo0);
            if (objOooO0O0 != obj) {
            }
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
    
        if (r14 == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0o0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22950Oooo0oo c22950Oooo0oo;
        C22949Oooo0oO c22949Oooo0oO;
        C22949Oooo0oO c22949Oooo0oO2;
        C27174OooO0O0 c27174OooO0O0;
        String str2;
        C22949Oooo0oO c22949Oooo0oO3;
        if (abstractC32479OooO0OO instanceof C22950Oooo0oo) {
            c22950Oooo0oo = (C22950Oooo0oo) abstractC32479OooO0OO;
            int i = c22950Oooo0oo.f70232OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22950Oooo0oo.f70232OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c22950Oooo0oo = new C22950Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c22950Oooo0oo.f70231OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22950Oooo0oo.f70232OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            try {
                o0Oo0oo o0oo0oo2 = this.f70202OooO0O0;
                c22950Oooo0oo.f70229OooOo0o = this;
                c22950Oooo0oo.f70228OooOo = str;
                c22950Oooo0oo.f70232OooOoOO = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new oo000o(o0oo0oo2, null), c22950Oooo0oo);
            } catch (Exception e) {
                e = e;
                c22949Oooo0oO = this;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingRepo");
                c20358OooO00o.OooO0Oo(e, "Failed to query active subscription offers", new Object[0]);
            }
            if (objOooO0o != enumC32485OooO00o) {
                c22949Oooo0oO2 = this;
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GoogleBillingRepo");
                c20358OooO00o2.OooO0OO("Failed to fetch subscription offers from server. " + c27174OooO0O0, new Object[0]);
                str2 = str;
                c22949Oooo0oO3 = c22949Oooo0oO2;
                o00Ooo o00ooo2 = c22949Oooo0oO3.f70203OooO0OO;
                c22950Oooo0oo.f70229OooOo0o = c22949Oooo0oO3;
                c22950Oooo0oo.f70228OooOo = null;
                c22950Oooo0oo.f70232OooOoOO = 3;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22968OoooooO(o00ooo2, str2, null), c22950Oooo0oo);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str = c22950Oooo0oo.f70228OooOo;
            c22949Oooo0oO2 = c22950Oooo0oo.f70229OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o;
            } catch (Exception e2) {
                e = e2;
                c22949Oooo0oO = c22949Oooo0oO2;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("GoogleBillingRepo");
                c20358OooO00o3.OooO0Oo(e, "Failed to query active subscription offers", new Object[0]);
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("GoogleBillingRepo");
                c20358OooO00o22.OooO0OO("Failed to fetch subscription offers from server. " + c27174OooO0O0, new Object[0]);
                str2 = str;
                c22949Oooo0oO3 = c22949Oooo0oO2;
                o00Ooo o00ooo22 = c22949Oooo0oO3.f70203OooO0OO;
                c22950Oooo0oo.f70229OooOo0o = c22949Oooo0oO3;
                c22950Oooo0oo.f70228OooOo = null;
                c22950Oooo0oo.f70232OooOoOO = 3;
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22968OoooooO(o00ooo22, str2, null), c22950Oooo0oo);
            } else {
                Iterable iterable = (Iterable) c27174OooO0O0.OooO0O0();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(c22949Oooo0oO2.f70206OooO0o0.toEntity((NoteinGoogleDeveloperOffer) it.next()));
                }
                o00Ooo o00ooo3 = c22949Oooo0oO2.f70203OooO0OO;
                c22950Oooo0oo.f70229OooOo0o = c22949Oooo0oO2;
                c22950Oooo0oo.f70228OooOo = str;
                c22950Oooo0oo.f70232OooOoOO = 2;
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o0OoOo0(o00ooo3, arrayList, null), c22950Oooo0oo);
                if (objOooO0o2 != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o2 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o2 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c22949Oooo0oO = c22949Oooo0oO2;
                str2 = str;
                c22949Oooo0oO3 = c22949Oooo0oO;
                o00Ooo o00ooo222 = c22949Oooo0oO3.f70203OooO0OO;
                c22950Oooo0oo.f70229OooOo0o = c22949Oooo0oO3;
                c22950Oooo0oo.f70228OooOo = null;
                c22950Oooo0oo.f70232OooOoOO = 3;
                C33874OooO0OO c33874OooO0OO222 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22968OoooooO(o00ooo222, str2, null), c22950Oooo0oo);
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22949Oooo0oO3 = c22950Oooo0oo.f70229OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                List list = (List) objOooO0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("GoogleBillingRepo");
                c20358OooO00o4.OooO0o0("fetchSubscriptionOffers: localData: " + list, new Object[0]);
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(c22949Oooo0oO3.f70206OooO0o0.toModel((NoteinGoogleDeveloperOfferEntity) it2.next()));
                }
                return arrayList2;
            }
            str = c22950Oooo0oo.f70228OooOo;
            c22949Oooo0oO = c22950Oooo0oo.f70229OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o);
            } catch (Exception e3) {
                e = e3;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("GoogleBillingRepo");
                c20358OooO00o32.OooO0Oo(e, "Failed to query active subscription offers", new Object[0]);
            }
            str2 = str;
            c22949Oooo0oO3 = c22949Oooo0oO;
            o00Ooo o00ooo2222 = c22949Oooo0oO3.f70203OooO0OO;
            c22950Oooo0oo.f70229OooOo0o = c22949Oooo0oO3;
            c22950Oooo0oo.f70228OooOo = null;
            c22950Oooo0oo.f70232OooOoOO = 3;
            C33874OooO0OO c33874OooO0OO2222 = C33649OoooOOo.f121328OooO00o;
            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22968OoooooO(o00ooo2222, str2, null), c22950Oooo0oo);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o322.OooOOO0("GoogleBillingRepo");
        c20358OooO00o322.OooO0Oo(e, "Failed to query active subscription offers", new Object[0]);
        str2 = str;
        c22949Oooo0oO3 = c22949Oooo0oO;
        o00Ooo o00ooo22222 = c22949Oooo0oO3.f70203OooO0OO;
        c22950Oooo0oo.f70229OooOo0o = c22949Oooo0oO3;
        c22950Oooo0oo.f70228OooOo = null;
        c22950Oooo0oo.f70232OooOoOO = 3;
        C33874OooO0OO c33874OooO0OO22222 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22968OoooooO(o00ooo22222, str2, null), c22950Oooo0oo);
    }

    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    public final C33763OoooOOO OooO0oO(String userId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(userId, "userId");
        boolean zOooOOOo = OooOOOo();
        GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
        C33769Ooooo0o c33769Ooooo0o = googleBillingDataSource.f70040OooOo00;
        C33769Ooooo0o c33769Ooooo0o2 = googleBillingDataSource.f70037OooOOoo;
        if (zOooOOOo) {
            return new C33763OoooOOO(new C22959OoooOoO(c33769Ooooo0o2, userId), new C22961Ooooo00(c33769Ooooo0o, userId, 0), new C22962Ooooo0o(userId, null));
        }
        boolean zOooOOOo2 = OooOOOo();
        o0oOO o0ooo2 = this.f70203OooO0OO.f70347OooO00o;
        return new C33763OoooOOO(zOooOOOo2 ? new C22952OoooO0(c33769Ooooo0o2, userId) : new C22954OoooO0O(o0ooo2.OooO0o(userId), this), OooOOOo() ? new C22951OoooO(c33769Ooooo0o, userId) : new o000oOoO(o0ooo2.OooO0oO(userId), this, 0), new C22963OooooO0(userId, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b5, code lost:
    
        if (r2 != r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[LOOP:2: B:42:0x00bc->B:44:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO0oo(String str, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22942Oooo c22942Oooo;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        String str2;
        C22949Oooo0oO c22949Oooo0oO;
        C22949Oooo0oO c22949Oooo0oO2;
        Iterator it;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Object objOooO0o;
        String str3;
        InterfaceC33895OooO00o interfaceC33895OooO00o3;
        C22949Oooo0oO c22949Oooo0oO3;
        C27174OooO0O0 c27174OooO0O0;
        C22949Oooo0oO c22949Oooo0oO4;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof C22942Oooo) {
            c22942Oooo = (C22942Oooo) abstractC32479OooO0OO;
            int i = c22942Oooo.f70165OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22942Oooo.f70165OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c22942Oooo = new C22942Oooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o2 = c22942Oooo.f70162OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22942Oooo.f70165OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o2);
            if (OooOOOo()) {
                c22942Oooo.f70161OooOo0o = this;
                c22942Oooo.f70160OooOo = str4;
                c22942Oooo.f70165OooOoo0 = 1;
                if (this.f70201OooO00o.OooO0oO(z, c22942Oooo) != enumC32485OooO00o) {
                    c22949Oooo0oO2 = this;
                    List list = (List) c22949Oooo0oO2.f70201OooO00o.f70037OooOOoo.f121747OooOo0o.getValue();
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    return arrayList;
                }
            } else {
                c22942Oooo.f70161OooOo0o = this;
                c22942Oooo.f70160OooOo = str4;
                interfaceC33895OooO00o = this.f70205OooO0o;
                c22942Oooo.f70163OooOoO0 = interfaceC33895OooO00o;
                c22942Oooo.f70165OooOoo0 = 2;
                if (interfaceC33895OooO00o.OooO00o(c22942Oooo) != enumC32485OooO00o) {
                    str2 = str4;
                    c22949Oooo0oO = this;
                    o0Oo0oo o0oo0oo2 = c22949Oooo0oO.f70202OooO0O0;
                    c22942Oooo.f70161OooOo0o = c22949Oooo0oO;
                    c22942Oooo.f70160OooOo = str2;
                    c22942Oooo.f70163OooOoO0 = interfaceC33895OooO00o;
                    c22942Oooo.f70165OooOoo0 = 3;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22971o00oO0o(o0oo0oo2, null), c22942Oooo);
                    if (objOooO0o != enumC32485OooO00o) {
                    }
                }
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str4 = c22942Oooo.f70160OooOo;
            c22949Oooo0oO2 = c22942Oooo.f70161OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o2);
            List list2 = (List) c22949Oooo0oO2.f70201OooO00o.f70037OooOOoo.f121747OooOo0o.getValue();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(NoteinGoogleInAppPurchase.INSTANCE.fromProductPurchase((ProductPurchase) it.next(), str4));
            }
            return arrayList2;
        }
        if (i2 == 2) {
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = c22942Oooo.f70163OooOoO0;
            str2 = c22942Oooo.f70160OooOo;
            c22949Oooo0oO = c22942Oooo.f70161OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o2);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            try {
                o0Oo0oo o0oo0oo22 = c22949Oooo0oO.f70202OooO0O0;
                c22942Oooo.f70161OooOo0o = c22949Oooo0oO;
                c22942Oooo.f70160OooOo = str2;
                c22942Oooo.f70163OooOoO0 = interfaceC33895OooO00o;
                c22942Oooo.f70165OooOoo0 = 3;
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22971o00oO0o(o0oo0oo22, null), c22942Oooo);
            } catch (Exception e) {
                e = e;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                c22949Oooo0oO3 = c22949Oooo0oO;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingRepo");
                c20358OooO00o.OooO0Oo(e, "Failed to query active in-app purchases", new Object[0]);
            } catch (Throwable th) {
                th = th;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
            if (objOooO0o != enumC32485OooO00o) {
                str3 = str2;
                interfaceC33895OooO00o3 = interfaceC33895OooO00o;
                objOooO0o2 = objOooO0o;
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("GoogleBillingRepo");
                c20358OooO00o2.OooO0OO("Failed to fetch in-app purchases from server. " + c27174OooO0O0, new Object[0]);
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                c22949Oooo0oO4 = c22949Oooo0oO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo2 = c22949Oooo0oO4.f70203OooO0OO;
                c22942Oooo.f70161OooOo0o = c22949Oooo0oO4;
                c22942Oooo.f70160OooOo = null;
                c22942Oooo.f70163OooOoO0 = null;
                c22942Oooo.f70165OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22966Oooooo(o00ooo2, str3, null), c22942Oooo);
            }
            return enumC32485OooO00o;
        }
        if (i2 == 3) {
            interfaceC33895OooO00o3 = c22942Oooo.f70163OooOoO0;
            str3 = c22942Oooo.f70160OooOo;
            c22949Oooo0oO = c22942Oooo.f70161OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objOooO0o2);
                c27174OooO0O0 = (C27174OooO0O0) objOooO0o2;
            } catch (Exception e2) {
                e = e2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                str2 = str3;
                c22949Oooo0oO3 = c22949Oooo0oO;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("GoogleBillingRepo");
                c20358OooO00o3.OooO0Oo(e, "Failed to query active in-app purchases", new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || c27174OooO0O0.OooO0O0() == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("GoogleBillingRepo");
                c20358OooO00o22.OooO0OO("Failed to fetch in-app purchases from server. " + c27174OooO0O0, new Object[0]);
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                c22949Oooo0oO4 = c22949Oooo0oO;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo22 = c22949Oooo0oO4.f70203OooO0OO;
                c22942Oooo.f70161OooOo0o = c22949Oooo0oO4;
                c22942Oooo.f70160OooOo = null;
                c22942Oooo.f70163OooOoO0 = null;
                c22942Oooo.f70165OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO32 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22966Oooooo(o00ooo22, str3, null), c22942Oooo);
            } else {
                Iterable iterable = (Iterable) c27174OooO0O0.OooO0O0();
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(c22949Oooo0oO.f70204OooO0Oo.toInAppEntity((NoteinGoogleInAppPurchase) it2.next()));
                }
                o00Ooo o00ooo3 = c22949Oooo0oO.f70203OooO0OO;
                c22942Oooo.f70161OooOo0o = c22949Oooo0oO;
                c22942Oooo.f70160OooOo = str3;
                c22942Oooo.f70163OooOoO0 = interfaceC33895OooO00o3;
                c22942Oooo.f70165OooOoo0 = 4;
                C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22975ooOO(o00ooo3, str3, arrayList3, null), c22942Oooo);
                if (objOooO0o3 != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o3 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o3 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                str2 = str3;
                c22949Oooo0oO3 = c22949Oooo0oO;
                str3 = str2;
                c22949Oooo0oO4 = c22949Oooo0oO3;
                C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo222 = c22949Oooo0oO4.f70203OooO0OO;
                c22942Oooo.f70161OooOo0o = c22949Oooo0oO4;
                c22942Oooo.f70160OooOo = null;
                c22942Oooo.f70163OooOoO0 = null;
                c22942Oooo.f70165OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO322 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22966Oooooo(o00ooo222, str3, null), c22942Oooo);
            }
        } else {
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22949Oooo0oO4 = c22942Oooo.f70161OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o2);
                List list3 = (List) objOooO0o2;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("GoogleBillingRepo");
                c20358OooO00o4.OooO0o0("fetchInAppPurchases: localData: " + list3, new Object[0]);
                List list4 = list3;
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(c22949Oooo0oO4.f70204OooO0Oo.toInAppModel((NoteinGoogleInAppPurchaseEntity) it3.next()));
                }
                return arrayList4;
            }
            interfaceC33895OooO00o2 = c22942Oooo.f70163OooOoO0;
            str2 = c22942Oooo.f70160OooOo;
            c22949Oooo0oO3 = c22942Oooo.f70161OooOo0o;
            try {
                try {
                    C32446OooOOOo.OooO0O0(objOooO0o2);
                } catch (Exception e3) {
                    e = e3;
                    C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o32.OooOOO0("GoogleBillingRepo");
                    c20358OooO00o32.OooO0Oo(e, "Failed to query active in-app purchases", new Object[0]);
                }
                str3 = str2;
                c22949Oooo0oO4 = c22949Oooo0oO3;
                C32460OooOooO c32460OooOooO222 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                o00Ooo o00ooo2222 = c22949Oooo0oO4.f70203OooO0OO;
                c22942Oooo.f70161OooOo0o = c22949Oooo0oO4;
                c22942Oooo.f70160OooOo = null;
                c22942Oooo.f70163OooOoO0 = null;
                c22942Oooo.f70165OooOoo0 = 5;
                C33874OooO0OO c33874OooO0OO3222 = C33649OoooOOo.f121328OooO00o;
                objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22966Oooooo(o00ooo2222, str3, null), c22942Oooo);
            } catch (Throwable th3) {
                th = th3;
                interfaceC33895OooO00o2.OooOOO0(null);
                throw th;
            }
        }
    }

    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    public final Object OooOO0(List list, String str, AbstractC32476OooO abstractC32476OooO) {
        GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        return C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new OooO(googleBillingDataSource, list, str, null), abstractC32476OooO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r2 == r9) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0237, code lost:
    
        if (r0 == r9) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:99:0x023a, B:23:0x005d, B:60:0x0177, B:62:0x017f, B:73:0x01b0, B:75:0x01b6, B:87:0x01ea, B:90:0x020f, B:96:0x0235, B:93:0x0230, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01e0, B:65:0x018a, B:66:0x018e, B:68:0x0194, B:70:0x01a8, B:26:0x0071, B:56:0x015b, B:29:0x0089, B:48:0x0106, B:50:0x0138, B:52:0x0144, B:101:0x0247, B:44:0x00cf), top: B:105:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:99:0x023a, B:23:0x005d, B:60:0x0177, B:62:0x017f, B:73:0x01b0, B:75:0x01b6, B:87:0x01ea, B:90:0x020f, B:96:0x0235, B:93:0x0230, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01e0, B:65:0x018a, B:66:0x018e, B:68:0x0194, B:70:0x01a8, B:26:0x0071, B:56:0x015b, B:29:0x0089, B:48:0x0106, B:50:0x0138, B:52:0x0144, B:101:0x0247, B:44:0x00cf), top: B:105:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:16:0x003f, B:99:0x023a, B:23:0x005d, B:60:0x0177, B:62:0x017f, B:73:0x01b0, B:75:0x01b6, B:87:0x01ea, B:90:0x020f, B:96:0x0235, B:93:0x0230, B:78:0x01c2, B:79:0x01c6, B:81:0x01cc, B:83:0x01e0, B:65:0x018a, B:66:0x018e, B:68:0x0194, B:70:0x01a8, B:26:0x0071, B:56:0x015b, B:29:0x0089, B:48:0x0106, B:50:0x0138, B:52:0x0144, B:101:0x0247, B:44:0x00cf), top: B:105:0x0033 }] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.orion.notein.data.repo.transactions.Oooo0oO, java.lang.Object, java.lang.String, kotlin.coroutines.Continuation] */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, Purchase purchase, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22948Oooo0o0 c22948Oooo0o0;
        String str4;
        boolean z;
        Object obj;
        Purchase purchase2;
        String str5;
        C22949Oooo0oO c22949Oooo0oO;
        Object obj2;
        String str6;
        C27174OooO0O0 c27174OooO0O0;
        C22949Oooo0oO c22949Oooo0oO2;
        String str7;
        Object obj3;
        Object objOooO0O0;
        List list;
        ?? r13;
        List<NoteinGoogleInAppPurchase> list2;
        boolean z2;
        List<NoteinGoogleSubscriptionPurchase> list3;
        if (abstractC32479OooO0OO instanceof C22948Oooo0o0) {
            c22948Oooo0o0 = (C22948Oooo0o0) abstractC32479OooO0OO;
            int i = c22948Oooo0o0.f70200OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22948Oooo0o0.f70200OooOooO = i - Integer.MIN_VALUE;
            } else {
                c22948Oooo0o0 = new C22948Oooo0o0(this, abstractC32479OooO0OO);
            }
        }
        C22948Oooo0o0 c22948Oooo0o02 = c22948Oooo0o0;
        Object objOooO0o = c22948Oooo0o02.f70199OooOoo0;
        Object obj4 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22948Oooo0o02.f70200OooOooO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                if (OooOOOo()) {
                    c22948Oooo0o02.f70200OooOooO = 1;
                    GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22923OooO0Oo(purchase, googleBillingDataSource, null), c22948Oooo0o02);
                } else {
                    o0Oo0oo o0oo0oo2 = this.f70202OooO0O0;
                    c22948Oooo0o02.f70194OooOo0o = this;
                    c22948Oooo0o02.f70193OooOo = str;
                    c22948Oooo0o02.f70196OooOoO0 = purchase;
                    c22948Oooo0o02.f70195OooOoO = str2;
                    str4 = str3;
                    c22948Oooo0o02.f70197OooOoOO = str4;
                    c22948Oooo0o02.f70200OooOooO = 2;
                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                    z = true;
                    obj = null;
                    Object objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22970o00o0O(purchase, str2, str, o0oo0oo2, null), c22948Oooo0o02);
                    if (objOooO0o2 != obj4) {
                        purchase2 = purchase;
                        str5 = str2;
                        c22949Oooo0oO = this;
                        obj2 = objOooO0o2;
                        str6 = str;
                        c27174OooO0O0 = (C27174OooO0O0) obj2;
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("GoogleBillingRepo");
                        c20358OooO00o.OooO0o0("acknowledgePurchase: productType: " + str6 + ", purchase: " + purchase2 + ", " + c27174OooO0O0, new Object[0]);
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                        }
                        return new C27174OooO0O0(false, null, "310004", "Failed to acknowledge purchase. Acknowledge result is false", 2);
                    }
                }
                return obj4;
            }
            if (i2 == 1) {
                C32446OooOOOo.OooO0O0(objOooO0o);
                boolean zBooleanValue = ((Boolean) objOooO0o).booleanValue();
                return new C27174OooO0O0(zBooleanValue, null, zBooleanValue ? "0" : "310004", "Using GoogleDataSource to acknowledge purchase", 2);
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    str7 = c22948Oooo0o02.f70195OooOoO;
                    str5 = (String) c22948Oooo0o02.f70196OooOoO0;
                    purchase2 = (Purchase) c22948Oooo0o02.f70193OooOo;
                    c22949Oooo0oO2 = c22948Oooo0o02.f70194OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    z = true;
                    obj3 = null;
                    List list4 = (List) objOooO0o;
                    c22948Oooo0o02.f70194OooOo0o = c22949Oooo0oO2;
                    c22948Oooo0o02.f70193OooOo = purchase2;
                    c22948Oooo0o02.f70196OooOoO0 = str5;
                    c22948Oooo0o02.f70195OooOoO = str7;
                    c22948Oooo0o02.f70197OooOoOO = list4;
                    c22948Oooo0o02.f70200OooOooO = 4;
                    objOooO0O0 = c22949Oooo0oO2.OooO0O0(str7, false, c22948Oooo0o02);
                    if (objOooO0O0 != obj4) {
                        return obj4;
                    }
                    list = list4;
                    objOooO0o = objOooO0O0;
                    r13 = obj3;
                    List list5 = (List) objOooO0o;
                    list2 = list;
                    if (list2 instanceof Collection) {
                    }
                    while (r3.hasNext()) {
                    }
                    z2 = false;
                    list3 = list5;
                    if (list3 instanceof Collection) {
                    }
                    while (r2.hasNext()) {
                    }
                    z = false;
                    if (z2) {
                    }
                    if (str5 != null) {
                    }
                    return new C27174OooO0O0(true, null, "0", "", 2);
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(objOooO0o);
                    return new C27174OooO0O0(true, null, "0", "", 2);
                }
                list = (List) c22948Oooo0o02.f70197OooOoOO;
                str5 = (String) c22948Oooo0o02.f70196OooOoO0;
                purchase2 = (Purchase) c22948Oooo0o02.f70193OooOo;
                c22949Oooo0oO2 = c22948Oooo0o02.f70194OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                z = true;
                r13 = 0;
                List list52 = (List) objOooO0o;
                list2 = list;
                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                    for (NoteinGoogleInAppPurchase noteinGoogleInAppPurchase : list2) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteinGoogleInAppPurchase.getPurchaseToken(), purchase2.OooO0OO()) && noteinGoogleInAppPurchase.isAcknowledged()) {
                            z2 = z;
                            break;
                        }
                    }
                }
                z2 = false;
                list3 = list52;
                if ((list3 instanceof Collection) || !list3.isEmpty()) {
                    for (NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase : list3) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteinGoogleSubscriptionPurchase.getPurchaseToken(), purchase2.OooO0OO()) && noteinGoogleSubscriptionPurchase.isAcknowledged()) {
                            break;
                        }
                    }
                }
                z = false;
                if (z2 && !z) {
                    return new C27174OooO0O0(false, null, "310002", "Failed to acknowledge purchase. No purchases found. Token: " + purchase2.OooO0OO(), 2);
                }
                if (str5 != null) {
                    c22948Oooo0o02.f70194OooOo0o = r13;
                    c22948Oooo0o02.f70193OooOo = r13;
                    c22948Oooo0o02.f70196OooOoO0 = r13;
                    c22948Oooo0o02.f70195OooOoO = r13;
                    c22948Oooo0o02.f70197OooOoOO = r13;
                    c22948Oooo0o02.f70200OooOooO = 5;
                    o00Ooo o00ooo2 = c22949Oooo0oO2.f70203OooO0OO;
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    Object objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O0O(o00ooo2, str5, r13), c22948Oooo0o02);
                    Object obj5 = EnumC32485OooO00o.f116726OooOo0o;
                    if (objOooO0o3 != obj5) {
                        objOooO0o3 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o3 != obj5) {
                        objOooO0o3 = C32460OooOooO.f116667OooO00o;
                    }
                }
                return new C27174OooO0O0(true, null, "0", "", 2);
            }
            String str8 = (String) c22948Oooo0o02.f70197OooOoOO;
            str5 = c22948Oooo0o02.f70195OooOoO;
            purchase2 = (Purchase) c22948Oooo0o02.f70196OooOoO0;
            String str9 = (String) c22948Oooo0o02.f70193OooOo;
            C22949Oooo0oO c22949Oooo0oO3 = c22948Oooo0o02.f70194OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            z = true;
            c22949Oooo0oO = c22949Oooo0oO3;
            str4 = str8;
            obj2 = objOooO0o;
            str6 = str9;
            obj = null;
            c27174OooO0O0 = (C27174OooO0O0) obj2;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingRepo");
            c20358OooO00o2.OooO0o0("acknowledgePurchase: productType: " + str6 + ", purchase: " + purchase2 + ", " + c27174OooO0O0, new Object[0]);
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0") || !kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
                return new C27174OooO0O0(false, null, "310004", "Failed to acknowledge purchase. Acknowledge result is false", 2);
            }
            c22948Oooo0o02.f70194OooOo0o = c22949Oooo0oO;
            c22948Oooo0o02.f70193OooOo = purchase2;
            c22948Oooo0o02.f70196OooOoO0 = str5;
            c22948Oooo0o02.f70195OooOoO = str4;
            c22948Oooo0o02.f70197OooOoOO = obj;
            c22948Oooo0o02.f70200OooOooO = 3;
            objOooO0o = c22949Oooo0oO.OooO0oo(str4, false, c22948Oooo0o02);
            if (objOooO0o == obj4) {
                return obj4;
            }
            c22949Oooo0oO2 = c22949Oooo0oO;
            str7 = str4;
            obj3 = obj;
            List list42 = (List) objOooO0o;
            c22948Oooo0o02.f70194OooOo0o = c22949Oooo0oO2;
            c22948Oooo0o02.f70193OooOo = purchase2;
            c22948Oooo0o02.f70196OooOoO0 = str5;
            c22948Oooo0o02.f70195OooOoO = str7;
            c22948Oooo0o02.f70197OooOoOO = list42;
            c22948Oooo0o02.f70200OooOooO = 4;
            objOooO0O0 = c22949Oooo0oO2.OooO0O0(str7, false, c22948Oooo0o02);
            if (objOooO0O0 != obj4) {
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("GoogleBillingRepo");
            c20358OooO00o3.OooO0Oo(e, "Failed to acknowledge purchase", new Object[0]);
            return new C27174OooO0O0(false, null, "310004", "Failed to acknowledge purchase. " + e, 2);
        }
    }

    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    public final void OooOO0o(String str, Purchase purchase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(purchase, "purchase");
        GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
        GoogleBillingDataSource.TinyPurchase.INSTANCE.getClass();
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(GoogleBillingDataSource.TinyPurchase.Companion.OooO00o(purchase));
        C33781o00o0O c33781o00o0O = googleBillingDataSource.f70035OooOOo;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, listOooO0oO);
        googleBillingDataSource.OooO(0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x016a: MOVE (r6 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:20:0x0162 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0166: MOVE (r1 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:20:0x0162 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0445 A[Catch: o0000 -> 0x0455, TRY_LEAVE, TryCatch #7 {o0000 -> 0x0455, blocks: (B:146:0x0441, B:148:0x0445), top: B:358:0x0441 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c6 A[LOOP:10: B:173:0x04c0->B:175:0x04c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ff A[LOOP:11: B:177:0x04f9->B:179:0x04ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0457 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x03e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023c A[Catch: o0000 -> 0x01d4, TRY_LEAVE, TryCatch #8 {o0000 -> 0x01d4, blocks: (B:26:0x01cd, B:52:0x0238, B:54:0x023c, B:31:0x01e3, B:43:0x0219), top: B:345:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02d3 A[LOOP:15: B:78:0x02cd->B:80:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030c A[LOOP:16: B:82:0x0306->B:84:0x030c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0352  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [long] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v9 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [long] */
    /* JADX WARN: Type inference failed for: r5v20, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22956OoooOOO c22956OoooOOO;
        String str;
        String str2;
        C22949Oooo0oO c22949Oooo0oO;
        C22949Oooo0oO c22949Oooo0oO2;
        C34434OooOoO c34434OooOoO;
        List list;
        List list2;
        String str3;
        C22949Oooo0oO c22949Oooo0oO3;
        C34434OooOoO c34434OooOoO2;
        ?? r5;
        ?? r2;
        List list3;
        String str4;
        Iterator it;
        Iterator it2;
        Object objOooO00o;
        Object obj;
        ?? r1;
        C27174OooO0O0 c27174OooO0O0;
        List<OooO0O0.OooO0o.OooO00o> listOooO00o;
        ?? linkedHashMap;
        int i;
        Object objOooOOO0;
        C27174OooO0O0 c27174OooO0O02;
        Object objOooO;
        List list4;
        C22949Oooo0oO c22949Oooo0oO4;
        ?? r10;
        List list5;
        List list6;
        ?? r52;
        ?? r22;
        String str5;
        String str6;
        Iterator it3;
        Iterator it4;
        Object objOooO00o2;
        C22949Oooo0oO c22949Oooo0oO5;
        Object obj2;
        List list7;
        C27174OooO0O0 c27174OooO0O03;
        List list8;
        ?? r102;
        ?? r53;
        ?? r23;
        C27174OooO0O0 c27174OooO0O04;
        String str7;
        List<OooO0O0.OooO0o.OooO00o> listOooO00o2;
        int i2;
        Object objOooO0o;
        C27174OooO0O0 c27174OooO0O05;
        C22949Oooo0oO c22949Oooo0oO6;
        ?? r6;
        ?? r54;
        int i3;
        List list9;
        Map map;
        ?? r103;
        List list10;
        Object objOooO00o3;
        ?? r104;
        List list11;
        ?? r15;
        String str8;
        Object obj3;
        Map map2;
        List list12;
        List list13;
        ?? r9;
        int i4;
        C22949Oooo0oO c22949Oooo0oO7;
        C27174OooO0O0 c27174OooO0O06;
        String str9;
        List list14;
        ?? r55;
        Map map3;
        List list15;
        Object obj4;
        int i5;
        ?? r4;
        List list16;
        ?? r152;
        C27174OooO0O0 c27174OooO0O07;
        List<OooO0O0.OooO0o.OooO00o> listOooO00o3;
        List<OooO0O0.OooO0o.OooO00o> listOooO00o4;
        boolean z2;
        int i6;
        int iIntValue;
        LinkedHashMap linkedHashMap2;
        int iIntValue2;
        Object objOooOOO02;
        Object objOooO2;
        long j;
        ?? r24;
        List list17;
        long j2;
        ?? r25;
        ?? r26 = z;
        if (abstractC32479OooO0OO instanceof C22956OoooOOO) {
            c22956OoooOOO = (C22956OoooOOO) abstractC32479OooO0OO;
            int i7 = c22956OoooOOO.f70278Oooo0O0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c22956OoooOOO.f70278Oooo0O0 = i7 - Integer.MIN_VALUE;
            } else {
                c22956OoooOOO = new C22956OoooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj5 = c22956OoooOOO.f70277Oooo00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r56 = c22956OoooOOO.f70278Oooo0O0;
        C34434OooOoO c34434OooOoO3 = C34434OooOoO.f123453OooOo0o;
        String str10 = "subs";
        String str11 = "GoogleBillingRepo";
        try {
            try {
            } catch (o0000 e) {
                e = e;
                str = "310007";
                str2 = "inapp";
                c22949Oooo0oO2 = c22949Oooo0oO;
                c34434OooOoO = c34434OooOoO3;
                list2 = list;
                str3 = "300002";
            }
        } catch (o0000 e2) {
            e = e2;
        }
        switch (r56) {
            case 0:
                c34434OooOoO2 = c34434OooOoO3;
                C32446OooOOOo.OooO0O0(obj5);
                if (OooOOOo()) {
                    return new C27174OooO0O0("0", "Notein billing is disabled", C34436OooOoOO.f123455OooOo0o, true);
                }
                r56 = 15000;
                j2 = 15000;
                r56 = 15000;
                j = 15000;
                if (r26 == 0) {
                    try {
                        C22957OoooOOo c22957OoooOOo = new C22957OoooOOo(this, null);
                        c22956OoooOOO.f70266OooOo0o = this;
                        c22956OoooOOO.f70272OooOooO = r26;
                        c22956OoooOOO.f70273OooOooo = 15000L;
                        c22956OoooOOO.f70278Oooo0O0 = 2;
                        objOooO2 = C21355Ooooooo.OooO(15000L, c22957OoooOOo, c22956OoooOOO);
                        break;
                    } catch (o0000 e3) {
                        e = e3;
                        c22949Oooo0oO3 = this;
                    }
                    if (objOooO2 != enumC32485OooO00o) {
                        c22949Oooo0oO3 = this;
                        r25 = r26;
                        list17 = (List) objOooO2;
                        r26 = r25;
                        r56 = j2;
                        if (list17 != null) {
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("GoogleBillingRepo");
                        c20358OooO00o.OooO0Oo(e, "Failed to query in-app purchases", new Object[0]);
                        list3 = c34434OooOoO2;
                        r5 = r56;
                        r2 = r26 == true ? 1 : 0;
                    }
                    return enumC32485OooO00o;
                }
                try {
                    GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
                    c22956OoooOOO.f70266OooOo0o = this;
                    c22956OoooOOO.f70272OooOooO = r26;
                    c22956OoooOOO.f70273OooOooo = 15000L;
                    c22956OoooOOO.f70278Oooo0O0 = 1;
                    objOooOOO02 = googleBillingDataSource.OooOOO0("inapp", c22956OoooOOO);
                    break;
                } catch (o0000 e4) {
                    e = e4;
                    c22949Oooo0oO3 = this;
                }
                if (objOooOOO02 != enumC32485OooO00o) {
                    c22949Oooo0oO3 = this;
                    r24 = r26;
                    list17 = (List) objOooOOO02;
                    r26 = r24;
                    r56 = j;
                    if (list17 != null) {
                        return new C27174OooO0O0(false, null, "310005", "Failed to query product purchases", 2);
                    }
                    try {
                        List list18 = list17;
                        ArrayList arrayList = new ArrayList();
                        r26 = r26;
                        r56 = r56;
                        for (Object obj6 : list18) {
                            Purchase purchase = (Purchase) obj6;
                            boolean z3 = r26 == true ? 1 : 0;
                            try {
                                int iOooO0O0 = purchase.OooO0O0();
                                ?? r19 = r56;
                                if (iOooO0O0 == 1) {
                                    try {
                                        arrayList.add(obj6);
                                    } catch (o0000 e5) {
                                        e = e5;
                                        r26 = z3 ? 1 : 0;
                                        r56 = r19;
                                    }
                                }
                                r26 = z3 ? 1 : 0;
                                r56 = r19;
                            } catch (o0000 e6) {
                                e = e6;
                                r26 = z3 ? 1 : 0;
                            }
                            break;
                        }
                        boolean z4 = r26 == true ? 1 : 0;
                        list3 = arrayList;
                        r2 = r26;
                        r5 = r56;
                    } catch (o0000 e7) {
                        e = e7;
                        boolean z5 = r26 == true ? 1 : 0;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("GoogleBillingRepo");
                    c20358OooO00o2.OooO0Oo(e, "Failed to query in-app purchases", new Object[0]);
                    list3 = c34434OooOoO2;
                    r5 = r56;
                    r2 = r26 == true ? 1 : 0;
                }
                return enumC32485OooO00o;
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("GoogleBillingRepo");
                str = "310007";
                List list19 = list3;
                str3 = "300002";
                c34434OooOoO = c34434OooOoO2;
                str4 = "subs";
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list19, 10));
                it = list19.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Purchase) it.next()).OooO0OO());
                }
                c20358OooO00o3.OooO0o0("getUnboundPurchases: inAppHistory: " + arrayList2, new Object[0]);
                o0Oo0oo o0oo0oo2 = c22949Oooo0oO3.f70202OooO0O0;
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list19, 10));
                it2 = list19.iterator();
                while (it2.hasNext()) {
                    String strOooO0OO = ((Purchase) it2.next()).OooO0OO();
                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
                    arrayList3.add(strOooO0OO);
                }
                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO3;
                c22956OoooOOO.f70265OooOo = list3;
                c22956OoooOOO.f70272OooOooO = r2;
                c22956OoooOOO.f70273OooOooo = r5;
                c22956OoooOOO.f70278Oooo0O0 = 3;
                objOooO00o = o0oo0oo2.OooO00o("inapp", arrayList3, c22956OoooOOO);
                if (objOooO00o != enumC32485OooO00o) {
                    ?? r28 = r5;
                    list2 = list3;
                    obj = objOooO00o;
                    r56 = r2;
                    r1 = r28;
                    c27174OooO0O0 = (C27174OooO0O0) obj;
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooO00o(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o4, "GoogleBillingRepo", "getUnboundPurchases: inAppFetchResult: ", c27174OooO0O0), new Object[0]);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                        String errorCode = c27174OooO0O0.getErrorCode();
                        String str12 = errorCode == null ? str3 : errorCode;
                        String errorMsg = c27174OooO0O0.getErrorMsg();
                        if (errorMsg == null) {
                            errorMsg = "Failed to fetch in-app purchases from server";
                        }
                        return new C27174OooO0O0(false, null, str12, errorMsg, 2);
                    }
                    OooO0O0.OooO0o oooO0o = (OooO0O0.OooO0o) c27174OooO0O0.OooO0O0();
                    if (oooO0o == null || (listOooO00o = oooO0o.OooO00o()) == null) {
                        listOooO00o = c34434OooOoO;
                    }
                    List<OooO0O0.OooO0o.OooO00o> list20 = listOooO00o;
                    int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list20, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    for (Iterator it5 = list20.iterator(); it5.hasNext(); it5 = it5) {
                        OooO0O0.OooO0o.OooO00o oooO00o = (OooO0O0.OooO0o.OooO00o) it5.next();
                        linkedHashMap.put(oooO00o.getPurchaseToken(), new Integer(oooO00o.getStatus()));
                    }
                    Collection collectionValues = linkedHashMap.values();
                    if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                        i = 0;
                        if (r56 != 0) {
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o5.OooOOO0("GoogleBillingRepo");
                        c22949Oooo0oO4 = c22949Oooo0oO2;
                        c20358OooO00o5.OooO0Oo(e, "Failed to query subscription purchases", new Object[0]);
                        list5 = c34434OooOoO;
                        r22 = r26;
                        r52 = r56;
                        list6 = list2;
                        r10 = linkedHashMap;
                        C22949Oooo0oO c22949Oooo0oO8 = c22949Oooo0oO4;
                        C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o6.OooOOO0("GoogleBillingRepo");
                        List list21 = list5;
                        str5 = "GoogleBillingRepo";
                        str6 = "0";
                        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list21, 10));
                        it3 = list21.iterator();
                        while (it3.hasNext()) {
                        }
                        c20358OooO00o6.OooO0o0("getUnboundPurchases: subscriptionHistory: " + arrayList4, new Object[0]);
                        o0Oo0oo o0oo0oo3 = c22949Oooo0oO8.f70202OooO0O0;
                        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(list21, 10));
                        it4 = list21.iterator();
                        while (it4.hasNext()) {
                        }
                        c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO8;
                        c22956OoooOOO.f70265OooOo = list6;
                        c22956OoooOOO.f70268OooOoO0 = c27174OooO0O02;
                        c22956OoooOOO.f70267OooOoO = r10;
                        c22956OoooOOO.f70269OooOoOO = list5;
                        c22956OoooOOO.f70272OooOooO = r52;
                        c22956OoooOOO.f70275Oooo000 = r22 == true ? 1 : 0;
                        c22956OoooOOO.f70278Oooo0O0 = 6;
                        objOooO00o2 = o0oo0oo3.OooO00o(str10, arrayList5, c22956OoooOOO);
                        if (objOooO00o2 != enumC32485OooO00o) {
                        }
                    } else {
                        Iterator it6 = collectionValues.iterator();
                        while (it6.hasNext()) {
                            if (((Number) it6.next()).intValue() == 2) {
                                i = 1;
                                if (r56 != 0) {
                                    try {
                                        GoogleBillingDataSource googleBillingDataSource2 = c22949Oooo0oO3.f70201OooO00o;
                                        c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO3;
                                        c22956OoooOOO.f70265OooOo = list2;
                                        c22956OoooOOO.f70268OooOoO0 = c27174OooO0O0;
                                        c22956OoooOOO.f70267OooOoO = linkedHashMap;
                                        c22956OoooOOO.f70272OooOooO = r56;
                                        c22956OoooOOO.f70275Oooo000 = i;
                                        c22956OoooOOO.f70278Oooo0O0 = 4;
                                        str10 = str4;
                                        try {
                                            objOooOOO0 = googleBillingDataSource2.OooOOO0(str10, c22956OoooOOO);
                                        } catch (o0000 e8) {
                                            e = e8;
                                            r26 = i;
                                            str2 = "inapp";
                                            c22949Oooo0oO2 = c22949Oooo0oO3;
                                            c27174OooO0O02 = c27174OooO0O0;
                                        }
                                    } catch (o0000 e9) {
                                        e = e9;
                                        str10 = str4;
                                    }
                                    if (objOooOOO0 != enumC32485OooO00o) {
                                        r26 = i;
                                        c22949Oooo0oO2 = c22949Oooo0oO3;
                                        c27174OooO0O02 = c27174OooO0O0;
                                        r56 = r56;
                                        list2 = list2;
                                        linkedHashMap = linkedHashMap;
                                        try {
                                            list4 = (List) objOooOOO0;
                                            str2 = "inapp";
                                            r26 = r26;
                                            r56 = r56;
                                            list2 = list2;
                                            linkedHashMap = linkedHashMap;
                                        } catch (o0000 e10) {
                                            e = e10;
                                            str2 = "inapp";
                                        }
                                        if (list4 != null) {
                                            return new C27174OooO0O0(false, null, "310005", "Failed to query subscription purchases", 2);
                                        }
                                        try {
                                            ArrayList arrayList6 = new ArrayList();
                                            for (Object obj7 : list4) {
                                                C22949Oooo0oO c22949Oooo0oO9 = c22949Oooo0oO2;
                                                if (((Purchase) obj7).OooO0O0() == 1) {
                                                    try {
                                                        arrayList6.add(obj7);
                                                    } catch (o0000 e11) {
                                                        e = e11;
                                                        c22949Oooo0oO2 = c22949Oooo0oO9;
                                                    }
                                                }
                                                c22949Oooo0oO2 = c22949Oooo0oO9;
                                                break;
                                            }
                                            c22949Oooo0oO4 = c22949Oooo0oO2;
                                            r22 = r26;
                                            r52 = r56;
                                            list6 = list2;
                                            list5 = arrayList6;
                                            r10 = linkedHashMap;
                                        } catch (o0000 e12) {
                                            e = e12;
                                        }
                                        C22949Oooo0oO c22949Oooo0oO82 = c22949Oooo0oO4;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o62 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o62.OooOOO0("GoogleBillingRepo");
                                        List list212 = list5;
                                        str5 = "GoogleBillingRepo";
                                        str6 = "0";
                                        ArrayList arrayList42 = new ArrayList(C34428OooOOo.OooOOoo(list212, 10));
                                        it3 = list212.iterator();
                                        while (it3.hasNext()) {
                                            arrayList42.add(((Purchase) it3.next()).OooO0OO());
                                        }
                                        c20358OooO00o62.OooO0o0("getUnboundPurchases: subscriptionHistory: " + arrayList42, new Object[0]);
                                        o0Oo0oo o0oo0oo32 = c22949Oooo0oO82.f70202OooO0O0;
                                        ArrayList arrayList52 = new ArrayList(C34428OooOOo.OooOOoo(list212, 10));
                                        it4 = list212.iterator();
                                        while (it4.hasNext()) {
                                            String strOooO0OO2 = ((Purchase) it4.next()).OooO0OO();
                                            kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO2, "getPurchaseToken(...)");
                                            arrayList52.add(strOooO0OO2);
                                        }
                                        c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO82;
                                        c22956OoooOOO.f70265OooOo = list6;
                                        c22956OoooOOO.f70268OooOoO0 = c27174OooO0O02;
                                        c22956OoooOOO.f70267OooOoO = r10;
                                        c22956OoooOOO.f70269OooOoOO = list5;
                                        c22956OoooOOO.f70272OooOooO = r52;
                                        c22956OoooOOO.f70275Oooo000 = r22 == true ? 1 : 0;
                                        c22956OoooOOO.f70278Oooo0O0 = 6;
                                        objOooO00o2 = o0oo0oo32.OooO00o(str10, arrayList52, c22956OoooOOO);
                                        if (objOooO00o2 != enumC32485OooO00o) {
                                            c22949Oooo0oO5 = c22949Oooo0oO82;
                                            obj2 = objOooO00o2;
                                            C27174OooO0O0 c27174OooO0O08 = c27174OooO0O02;
                                            list7 = list6;
                                            c27174OooO0O03 = c27174OooO0O08;
                                            list8 = list5;
                                            r23 = r22;
                                            r53 = r52;
                                            r102 = r10;
                                            c27174OooO0O04 = (C27174OooO0O0) obj2;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                                            str11 = str5;
                                            c20358OooO00o7.OooO00o(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o7, str11, "getUnboundPurchases: subsFetchResult: ", c27174OooO0O04), new Object[0]);
                                            str7 = str6;
                                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O04.getErrorCode(), str7)) {
                                                String errorCode2 = c27174OooO0O04.getErrorCode();
                                                String str13 = errorCode2 == null ? str3 : errorCode2;
                                                String errorMsg2 = c27174OooO0O04.getErrorMsg();
                                                if (errorMsg2 == null) {
                                                    errorMsg2 = "Failed to fetch subscription purchases from server";
                                                }
                                                return new C27174OooO0O0(false, null, str13, errorMsg2, 2);
                                            }
                                            OooO0O0.OooO0o oooO0o2 = (OooO0O0.OooO0o) c27174OooO0O04.OooO0O0();
                                            if (oooO0o2 == null || (listOooO00o2 = oooO0o2.OooO00o()) == null) {
                                                listOooO00o2 = c34434OooOoO;
                                            }
                                            List<OooO0O0.OooO0o.OooO00o> list22 = listOooO00o2;
                                            int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list22, 10));
                                            if (iOooO0Oo2 < 16) {
                                                iOooO0Oo2 = 16;
                                            }
                                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iOooO0Oo2);
                                            for (Iterator it7 = list22.iterator(); it7.hasNext(); it7 = it7) {
                                                OooO0O0.OooO0o.OooO00o oooO00o2 = (OooO0O0.OooO0o.OooO00o) it7.next();
                                                linkedHashMap3.put(oooO00o2.getPurchaseToken(), new Integer(oooO00o2.getStatus()));
                                            }
                                            Collection collectionValues2 = linkedHashMap3.values();
                                            if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                                                i2 = 0;
                                                GoogleBillingDataSource googleBillingDataSource3 = c22949Oooo0oO5.f70201OooO00o;
                                                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO5;
                                                c22956OoooOOO.f70265OooOo = list7;
                                                c22956OoooOOO.f70268OooOoO0 = c27174OooO0O03;
                                                c22956OoooOOO.f70267OooOoO = r102;
                                                c22956OoooOOO.f70269OooOoOO = list8;
                                                c22956OoooOOO.f70271OooOoo0 = linkedHashMap3;
                                                c22956OoooOOO.f70272OooOooO = r53;
                                                c22956OoooOOO.f70275Oooo000 = r23;
                                                c22956OoooOOO.f70276Oooo00O = i2;
                                                c22956OoooOOO.f70278Oooo0O0 = 7;
                                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                                int i8 = i2;
                                                C22949Oooo0oO c22949Oooo0oO10 = c22949Oooo0oO5;
                                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22931OooOOoo(googleBillingDataSource3, null), c22956OoooOOO);
                                                if (objOooO0o != enumC32485OooO00o) {
                                                }
                                            } else {
                                                Iterator it8 = collectionValues2.iterator();
                                                while (it8.hasNext()) {
                                                    if (((Number) it8.next()).intValue() == 2) {
                                                        i2 = 1;
                                                        GoogleBillingDataSource googleBillingDataSource32 = c22949Oooo0oO5.f70201OooO00o;
                                                        c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO5;
                                                        c22956OoooOOO.f70265OooOo = list7;
                                                        c22956OoooOOO.f70268OooOoO0 = c27174OooO0O03;
                                                        c22956OoooOOO.f70267OooOoO = r102;
                                                        c22956OoooOOO.f70269OooOoOO = list8;
                                                        c22956OoooOOO.f70271OooOoo0 = linkedHashMap3;
                                                        c22956OoooOOO.f70272OooOooO = r53;
                                                        c22956OoooOOO.f70275Oooo000 = r23;
                                                        c22956OoooOOO.f70276Oooo00O = i2;
                                                        c22956OoooOOO.f70278Oooo0O0 = 7;
                                                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                                        int i82 = i2;
                                                        C22949Oooo0oO c22949Oooo0oO102 = c22949Oooo0oO5;
                                                        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22931OooOOoo(googleBillingDataSource32, null), c22956OoooOOO);
                                                        if (objOooO0o != enumC32485OooO00o) {
                                                            c27174OooO0O05 = c27174OooO0O03;
                                                            c22949Oooo0oO6 = c22949Oooo0oO102;
                                                            r6 = r53;
                                                            r54 = r23;
                                                            i3 = i82;
                                                            list10 = list8;
                                                            r103 = r102;
                                                            map = linkedHashMap3;
                                                            list9 = list7;
                                                            List list23 = (List) objOooO0o;
                                                            o0Oo0oo o0oo0oo4 = c22949Oooo0oO6.f70202OooO0O0;
                                                            c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO6;
                                                            c22956OoooOOO.f70265OooOo = list9;
                                                            c22956OoooOOO.f70268OooOoO0 = c27174OooO0O05;
                                                            c22956OoooOOO.f70267OooOoO = r103;
                                                            c22956OoooOOO.f70269OooOoOO = list10;
                                                            c22956OoooOOO.f70271OooOoo0 = map;
                                                            c22956OoooOOO.f70270OooOoo = list23;
                                                            c22956OoooOOO.f70272OooOooO = r6;
                                                            c22956OoooOOO.f70275Oooo000 = r54;
                                                            c22956OoooOOO.f70276Oooo00O = i3;
                                                            C22949Oooo0oO c22949Oooo0oO11 = c22949Oooo0oO6;
                                                            c22956OoooOOO.f70278Oooo0O0 = 8;
                                                            String str14 = str2;
                                                            objOooO00o3 = o0oo0oo4.OooO00o(str14, list23, c22956OoooOOO);
                                                            if (objOooO00o3 != enumC32485OooO00o) {
                                                                ?? r31 = r103;
                                                                r104 = r6;
                                                                list11 = list9;
                                                                r15 = r31;
                                                                str8 = str14;
                                                                obj3 = objOooO00o3;
                                                                map2 = map;
                                                                list12 = list23;
                                                                list13 = list10;
                                                                r9 = r54;
                                                                i4 = i3;
                                                                c22949Oooo0oO7 = c22949Oooo0oO11;
                                                                c27174OooO0O06 = (C27174OooO0O0) obj3;
                                                                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                                                String str15 = str10;
                                                                int i9 = i4;
                                                                str9 = str11;
                                                                c20358OooO00o8.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o8, str11, "localInAppBindStatusResult: ", c27174OooO0O06), new Object[0]);
                                                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O06.getErrorCode(), str7)) {
                                                                    String errorCode3 = c27174OooO0O05.getErrorCode();
                                                                    String str16 = errorCode3 == null ? str : errorCode3;
                                                                    String errorMsg3 = c27174OooO0O05.getErrorMsg();
                                                                    if (errorMsg3 == null) {
                                                                        errorMsg3 = "(Local) Failed to fetch in-app purchases bind status from server.";
                                                                    }
                                                                    return new C27174OooO0O0(false, null, str16, errorMsg3, 2);
                                                                }
                                                                o0Oo0oo o0oo0oo5 = c22949Oooo0oO7.f70202OooO0O0;
                                                                c22956OoooOOO.f70266OooOo0o = list11;
                                                                c22956OoooOOO.f70265OooOo = c27174OooO0O05;
                                                                c22956OoooOOO.f70268OooOoO0 = r15;
                                                                c22956OoooOOO.f70267OooOoO = list13;
                                                                c22956OoooOOO.f70269OooOoOO = map2;
                                                                c22956OoooOOO.f70271OooOoo0 = list12;
                                                                c22956OoooOOO.f70270OooOoo = c27174OooO0O06;
                                                                c22956OoooOOO.f70272OooOooO = r104;
                                                                c22956OoooOOO.f70275Oooo000 = r9;
                                                                c22956OoooOOO.f70276Oooo00O = i9;
                                                                c22956OoooOOO.f70278Oooo0O0 = 9;
                                                                str10 = str15;
                                                                Object objOooO00o4 = o0oo0oo5.OooO00o(str10, list12, c22956OoooOOO);
                                                                if (objOooO00o4 == enumC32485OooO00o) {
                                                                    return enumC32485OooO00o;
                                                                }
                                                                list14 = list11;
                                                                r55 = r104;
                                                                map3 = map2;
                                                                list15 = list13;
                                                                obj4 = objOooO00o4;
                                                                i5 = i9;
                                                                r4 = r9;
                                                                list16 = list12;
                                                                r152 = r15;
                                                            }
                                                        }
                                                    }
                                                }
                                                i2 = 0;
                                                GoogleBillingDataSource googleBillingDataSource322 = c22949Oooo0oO5.f70201OooO00o;
                                                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO5;
                                                c22956OoooOOO.f70265OooOo = list7;
                                                c22956OoooOOO.f70268OooOoO0 = c27174OooO0O03;
                                                c22956OoooOOO.f70267OooOoO = r102;
                                                c22956OoooOOO.f70269OooOoOO = list8;
                                                c22956OoooOOO.f70271OooOoo0 = linkedHashMap3;
                                                c22956OoooOOO.f70272OooOooO = r53;
                                                c22956OoooOOO.f70275Oooo000 = r23;
                                                c22956OoooOOO.f70276Oooo00O = i2;
                                                c22956OoooOOO.f70278Oooo0O0 = 7;
                                                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                                                int i822 = i2;
                                                C22949Oooo0oO c22949Oooo0oO1022 = c22949Oooo0oO5;
                                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22931OooOOoo(googleBillingDataSource322, null), c22956OoooOOO);
                                                if (objOooO0o != enumC32485OooO00o) {
                                                }
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    str10 = str4;
                                    try {
                                        str2 = "inapp";
                                        try {
                                            C22958OoooOo0 c22958OoooOo0 = new C22958OoooOo0(c22949Oooo0oO3, null);
                                            c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO3;
                                            c22956OoooOOO.f70265OooOo = list2;
                                            c22956OoooOOO.f70268OooOoO0 = c27174OooO0O0;
                                            c22956OoooOOO.f70267OooOoO = linkedHashMap;
                                            c22956OoooOOO.f70272OooOooO = r56;
                                            c22956OoooOOO.f70275Oooo000 = i;
                                            c22956OoooOOO.f70278Oooo0O0 = 5;
                                            objOooO = C21355Ooooooo.OooO(r1, c22958OoooOo0, c22956OoooOOO);
                                            if (objOooO != enumC32485OooO00o) {
                                                r26 = i;
                                                c22949Oooo0oO2 = c22949Oooo0oO3;
                                                c27174OooO0O02 = c27174OooO0O0;
                                                r56 = r56;
                                                list2 = list2;
                                                linkedHashMap = linkedHashMap;
                                                try {
                                                    list4 = (List) objOooO;
                                                    r26 = r26;
                                                    r56 = r56;
                                                    list2 = list2;
                                                    linkedHashMap = linkedHashMap;
                                                    if (list4 != null) {
                                                    }
                                                } catch (o0000 e13) {
                                                    e = e13;
                                                }
                                            }
                                        } catch (o0000 e14) {
                                            e = e14;
                                            r26 = i;
                                            c22949Oooo0oO2 = c22949Oooo0oO3;
                                            c27174OooO0O02 = c27174OooO0O0;
                                        }
                                    } catch (o0000 e15) {
                                        e = e15;
                                        str2 = "inapp";
                                    }
                                }
                                C34406OooO00o.C20358OooO00o c20358OooO00o52 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o52.OooOOO0("GoogleBillingRepo");
                                c22949Oooo0oO4 = c22949Oooo0oO2;
                                c20358OooO00o52.OooO0Oo(e, "Failed to query subscription purchases", new Object[0]);
                                list5 = c34434OooOoO;
                                r22 = r26;
                                r52 = r56;
                                list6 = list2;
                                r10 = linkedHashMap;
                                C22949Oooo0oO c22949Oooo0oO822 = c22949Oooo0oO4;
                                C34406OooO00o.C20358OooO00o c20358OooO00o622 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o622.OooOOO0("GoogleBillingRepo");
                                List list2122 = list5;
                                str5 = "GoogleBillingRepo";
                                str6 = "0";
                                ArrayList arrayList422 = new ArrayList(C34428OooOOo.OooOOoo(list2122, 10));
                                it3 = list2122.iterator();
                                while (it3.hasNext()) {
                                }
                                c20358OooO00o622.OooO0o0("getUnboundPurchases: subscriptionHistory: " + arrayList422, new Object[0]);
                                o0Oo0oo o0oo0oo322 = c22949Oooo0oO822.f70202OooO0O0;
                                ArrayList arrayList522 = new ArrayList(C34428OooOOo.OooOOoo(list2122, 10));
                                it4 = list2122.iterator();
                                while (it4.hasNext()) {
                                }
                                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO822;
                                c22956OoooOOO.f70265OooOo = list6;
                                c22956OoooOOO.f70268OooOoO0 = c27174OooO0O02;
                                c22956OoooOOO.f70267OooOoO = r10;
                                c22956OoooOOO.f70269OooOoOO = list5;
                                c22956OoooOOO.f70272OooOooO = r52;
                                c22956OoooOOO.f70275Oooo000 = r22 == true ? 1 : 0;
                                c22956OoooOOO.f70278Oooo0O0 = 6;
                                objOooO00o2 = o0oo0oo322.OooO00o(str10, arrayList522, c22956OoooOOO);
                                if (objOooO00o2 != enumC32485OooO00o) {
                                }
                            }
                        }
                        i = 0;
                        if (r56 != 0) {
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o522 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o522.OooOOO0("GoogleBillingRepo");
                        c22949Oooo0oO4 = c22949Oooo0oO2;
                        c20358OooO00o522.OooO0Oo(e, "Failed to query subscription purchases", new Object[0]);
                        list5 = c34434OooOoO;
                        r22 = r26;
                        r52 = r56;
                        list6 = list2;
                        r10 = linkedHashMap;
                        C22949Oooo0oO c22949Oooo0oO8222 = c22949Oooo0oO4;
                        C34406OooO00o.C20358OooO00o c20358OooO00o6222 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o6222.OooOOO0("GoogleBillingRepo");
                        List list21222 = list5;
                        str5 = "GoogleBillingRepo";
                        str6 = "0";
                        ArrayList arrayList4222 = new ArrayList(C34428OooOOo.OooOOoo(list21222, 10));
                        it3 = list21222.iterator();
                        while (it3.hasNext()) {
                        }
                        c20358OooO00o6222.OooO0o0("getUnboundPurchases: subscriptionHistory: " + arrayList4222, new Object[0]);
                        o0Oo0oo o0oo0oo3222 = c22949Oooo0oO8222.f70202OooO0O0;
                        ArrayList arrayList5222 = new ArrayList(C34428OooOOo.OooOOoo(list21222, 10));
                        it4 = list21222.iterator();
                        while (it4.hasNext()) {
                        }
                        c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO8222;
                        c22956OoooOOO.f70265OooOo = list6;
                        c22956OoooOOO.f70268OooOoO0 = c27174OooO0O02;
                        c22956OoooOOO.f70267OooOoO = r10;
                        c22956OoooOOO.f70269OooOoOO = list5;
                        c22956OoooOOO.f70272OooOooO = r52;
                        c22956OoooOOO.f70275Oooo000 = r22 == true ? 1 : 0;
                        c22956OoooOOO.f70278Oooo0O0 = 6;
                        objOooO00o2 = o0oo0oo3222.OooO00o(str10, arrayList5222, c22956OoooOOO);
                        if (objOooO00o2 != enumC32485OooO00o) {
                        }
                    }
                    c27174OooO0O07 = (C27174OooO0O0) obj4;
                    C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
                    String str17 = str9;
                    C27174OooO0O0 c27174OooO0O09 = c27174OooO0O06;
                    c20358OooO00o9.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o9, str17, "localSubsBindStatusResult: ", c27174OooO0O07), new Object[0]);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O07.getErrorCode(), str7)) {
                        String errorCode4 = c27174OooO0O05.getErrorCode();
                        String str18 = errorCode4 == null ? str : errorCode4;
                        String errorMsg4 = c27174OooO0O05.getErrorMsg();
                        if (errorMsg4 == null) {
                            errorMsg4 = "(Local) Failed to fetch subscription purchases bind status from server.";
                        }
                        return new C27174OooO0O0(false, null, str18, errorMsg4, 2);
                    }
                    OooO0O0.OooO0o oooO0o3 = (OooO0O0.OooO0o) c27174OooO0O09.OooO0O0();
                    if (oooO0o3 == null || (listOooO00o3 = oooO0o3.OooO00o()) == null) {
                        listOooO00o3 = c34434OooOoO;
                    }
                    List<OooO0O0.OooO0o.OooO00o> list24 = listOooO00o3;
                    int iOooO0Oo3 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list24, 10));
                    if (iOooO0Oo3 < 16) {
                        iOooO0Oo3 = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iOooO0Oo3);
                    for (OooO0O0.OooO0o.OooO00o oooO00o3 : list24) {
                        linkedHashMap4.put(oooO00o3.getPurchaseToken(), new Integer(oooO00o3.getStatus()));
                    }
                    OooO0O0.OooO0o oooO0o4 = (OooO0O0.OooO0o) c27174OooO0O07.OooO0O0();
                    if (oooO0o4 == null || (listOooO00o4 = oooO0o4.OooO00o()) == null) {
                        listOooO00o4 = c34434OooOoO;
                    }
                    List<OooO0O0.OooO0o.OooO00o> list25 = listOooO00o4;
                    int iOooO0Oo4 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list25, 10));
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(iOooO0Oo4 < 16 ? 16 : iOooO0Oo4);
                    for (Iterator it9 = list25.iterator(); it9.hasNext(); it9 = it9) {
                        OooO0O0.OooO0o.OooO00o oooO00o4 = (OooO0O0.OooO0o.OooO00o) it9.next();
                        linkedHashMap5.put(oooO00o4.getPurchaseToken(), new Integer(oooO00o4.getStatus()));
                    }
                    C32466OooO0OO c32466OooO0OO = new C32466OooO0OO();
                    List<String> list26 = list16;
                    List list27 = list14;
                    for (String str19 : list26) {
                        Integer num = (Integer) linkedHashMap4.get(str19);
                        if (num != null) {
                            i6 = i5;
                            iIntValue = num.intValue();
                        } else {
                            i6 = i5;
                            iIntValue = 0;
                        }
                        Integer num2 = (Integer) linkedHashMap5.get(str19);
                        if (num2 != null) {
                            linkedHashMap2 = linkedHashMap5;
                            iIntValue2 = num2.intValue();
                        } else {
                            linkedHashMap2 = linkedHashMap5;
                            iIntValue2 = 0;
                        }
                        List list28 = list27;
                        i5 = i6;
                        linkedHashMap5 = linkedHashMap2;
                        list27 = list28;
                    }
                    int i10 = i5;
                    List list29 = list27;
                    C32466OooO0OO c32466OooO0OOOooO0O0 = c32466OooO0OO.OooO0O0();
                    C34406OooO00o.C20358OooO00o c20358OooO00o10 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o10.OooOOO0(str17);
                    c20358OooO00o10.OooO0o0("localPurchasesLinkStatus: " + c32466OooO0OOOooO0O0, new Object[0]);
                    Collection collectionValues3 = c32466OooO0OOOooO0O0.values();
                    if (collectionValues3.isEmpty()) {
                        z2 = false;
                    } else {
                        Iterator it10 = collectionValues3.iterator();
                        while (it10.hasNext()) {
                            if (((Number) it10.next()).intValue() == 2) {
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj8 : list29) {
                        Integer num3 = (Integer) r152.get(((Purchase) obj8).OooO0OO());
                        if (num3 != null && num3.intValue() == 0) {
                            arrayList7.add(obj8);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj9 : list15) {
                        Integer num4 = (Integer) map3.get(((Purchase) obj9).OooO0OO());
                        if (num4 != null && num4.intValue() == 0) {
                            arrayList8.add(obj9);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj10 : list26) {
                        Integer num5 = (Integer) c32466OooO0OOOooO0O0.get((String) obj10);
                        if (num5 != null && num5.intValue() == 0) {
                            arrayList9.add(obj10);
                        }
                    }
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    linkedHashMap6.put(str8, arrayList7);
                    linkedHashMap6.put(str10, arrayList8);
                    linkedHashMap6.put("local_cache", arrayList9);
                    return ((r4 == 0 && i10 == 0 && !z2) || r55 == 0) ? new C27174OooO0O0(str7, "", linkedHashMap6, true) : new C27174OooO0O0("300001", "Conflict found in in-app or subscription purchases", linkedHashMap6, false);
                }
                return enumC32485OooO00o;
            case 1:
                c34434OooOoO2 = c34434OooOoO3;
                long j3 = c22956OoooOOO.f70273OooOooo;
                boolean z6 = c22956OoooOOO.f70272OooOooO;
                c22949Oooo0oO3 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                objOooOOO02 = obj5;
                r24 = z6;
                j = j3;
                list17 = (List) objOooOOO02;
                r26 = r24;
                r56 = j;
                if (list17 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("GoogleBillingRepo");
                c20358OooO00o22.OooO0Oo(e, "Failed to query in-app purchases", new Object[0]);
                list3 = c34434OooOoO2;
                r5 = r56;
                r2 = r26 == true ? 1 : 0;
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("GoogleBillingRepo");
                str = "310007";
                List list192 = list3;
                str3 = "300002";
                c34434OooOoO = c34434OooOoO2;
                str4 = "subs";
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list192, 10));
                it = list192.iterator();
                while (it.hasNext()) {
                }
                c20358OooO00o32.OooO0o0("getUnboundPurchases: inAppHistory: " + arrayList22, new Object[0]);
                o0Oo0oo o0oo0oo22 = c22949Oooo0oO3.f70202OooO0O0;
                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(list192, 10));
                it2 = list192.iterator();
                while (it2.hasNext()) {
                }
                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO3;
                c22956OoooOOO.f70265OooOo = list3;
                c22956OoooOOO.f70272OooOooO = r2;
                c22956OoooOOO.f70273OooOooo = r5;
                c22956OoooOOO.f70278Oooo0O0 = 3;
                objOooO00o = o0oo0oo22.OooO00o("inapp", arrayList32, c22956OoooOOO);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                c34434OooOoO2 = c34434OooOoO3;
                long j4 = c22956OoooOOO.f70273OooOooo;
                boolean z7 = c22956OoooOOO.f70272OooOooO;
                c22949Oooo0oO3 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                objOooO2 = obj5;
                r25 = z7;
                j2 = j4;
                list17 = (List) objOooO2;
                r26 = r25;
                r56 = j2;
                if (list17 != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o222.OooOOO0("GoogleBillingRepo");
                c20358OooO00o222.OooO0Oo(e, "Failed to query in-app purchases", new Object[0]);
                list3 = c34434OooOoO2;
                r5 = r56;
                r2 = r26 == true ? 1 : 0;
                C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o322.OooOOO0("GoogleBillingRepo");
                str = "310007";
                List list1922 = list3;
                str3 = "300002";
                c34434OooOoO = c34434OooOoO2;
                str4 = "subs";
                ArrayList arrayList222 = new ArrayList(C34428OooOOo.OooOOoo(list1922, 10));
                it = list1922.iterator();
                while (it.hasNext()) {
                }
                c20358OooO00o322.OooO0o0("getUnboundPurchases: inAppHistory: " + arrayList222, new Object[0]);
                o0Oo0oo o0oo0oo222 = c22949Oooo0oO3.f70202OooO0O0;
                ArrayList arrayList322 = new ArrayList(C34428OooOOo.OooOOoo(list1922, 10));
                it2 = list1922.iterator();
                while (it2.hasNext()) {
                }
                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO3;
                c22956OoooOOO.f70265OooOo = list3;
                c22956OoooOOO.f70272OooOooO = r2;
                c22956OoooOOO.f70273OooOooo = r5;
                c22956OoooOOO.f70278Oooo0O0 = 3;
                objOooO00o = o0oo0oo222.OooO00o("inapp", arrayList322, c22956OoooOOO);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                long j5 = c22956OoooOOO.f70273OooOooo;
                boolean z8 = c22956OoooOOO.f70272OooOooO;
                List list30 = (List) c22956OoooOOO.f70265OooOo;
                c22949Oooo0oO3 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                list2 = list30;
                r1 = j5;
                r56 = z8;
                str3 = "300002";
                c34434OooOoO = c34434OooOoO3;
                str4 = "subs";
                obj = obj5;
                str = "310007";
                c27174OooO0O0 = (C27174OooO0O0) obj;
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42.OooO00o(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o42, "GoogleBillingRepo", "getUnboundPurchases: inAppFetchResult: ", c27174OooO0O0), new Object[0]);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                }
                break;
            case 4:
                int i11 = c22956OoooOOO.f70275Oooo000;
                boolean z9 = c22956OoooOOO.f70272OooOooO;
                Map map4 = (Map) c22956OoooOOO.f70267OooOoO;
                c27174OooO0O02 = (C27174OooO0O0) c22956OoooOOO.f70268OooOoO0;
                List list31 = (List) c22956OoooOOO.f70265OooOo;
                C22949Oooo0oO c22949Oooo0oO12 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                objOooOOO0 = obj5;
                c22949Oooo0oO2 = c22949Oooo0oO12;
                c34434OooOoO = c34434OooOoO3;
                str = "310007";
                list2 = list31;
                str3 = "300002";
                r26 = i11;
                r56 = z9;
                linkedHashMap = map4;
                list4 = (List) objOooOOO0;
                str2 = "inapp";
                r26 = r26;
                r56 = r56;
                list2 = list2;
                linkedHashMap = linkedHashMap;
                if (list4 != null) {
                }
                break;
            case 5:
                int i12 = c22956OoooOOO.f70275Oooo000;
                boolean z10 = c22956OoooOOO.f70272OooOooO;
                Map map5 = (Map) c22956OoooOOO.f70267OooOoO;
                c27174OooO0O02 = (C27174OooO0O0) c22956OoooOOO.f70268OooOoO0;
                List list32 = (List) c22956OoooOOO.f70265OooOo;
                C22949Oooo0oO c22949Oooo0oO13 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                str2 = "inapp";
                objOooO = obj5;
                c22949Oooo0oO2 = c22949Oooo0oO13;
                c34434OooOoO = c34434OooOoO3;
                str = "310007";
                list2 = list32;
                str3 = "300002";
                r26 = i12;
                r56 = z10;
                linkedHashMap = map5;
                list4 = (List) objOooO;
                r26 = r26;
                r56 = r56;
                list2 = list2;
                linkedHashMap = linkedHashMap;
                if (list4 != null) {
                }
                break;
            case 6:
                int i13 = c22956OoooOOO.f70275Oooo000;
                boolean z11 = c22956OoooOOO.f70272OooOooO;
                List list33 = (List) c22956OoooOOO.f70269OooOoOO;
                Map map6 = (Map) c22956OoooOOO.f70267OooOoO;
                C27174OooO0O0 c27174OooO0O010 = (C27174OooO0O0) c22956OoooOOO.f70268OooOoO0;
                List list34 = (List) c22956OoooOOO.f70265OooOo;
                C22949Oooo0oO c22949Oooo0oO14 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                c22949Oooo0oO5 = c22949Oooo0oO14;
                c34434OooOoO = c34434OooOoO3;
                c27174OooO0O03 = c27174OooO0O010;
                str5 = "GoogleBillingRepo";
                str2 = "inapp";
                str6 = "0";
                obj2 = obj5;
                str = "310007";
                r102 = map6;
                list8 = list33;
                r53 = z11;
                r23 = i13;
                str3 = "300002";
                list7 = list34;
                c27174OooO0O04 = (C27174OooO0O0) obj2;
                C34406OooO00o.C20358OooO00o c20358OooO00o72 = C34406OooO00o.f123390OooO00o;
                str11 = str5;
                c20358OooO00o72.OooO00o(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o72, str11, "getUnboundPurchases: subsFetchResult: ", c27174OooO0O04), new Object[0]);
                str7 = str6;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O04.getErrorCode(), str7)) {
                }
                break;
            case 7:
                int i14 = c22956OoooOOO.f70276Oooo00O;
                int i15 = c22956OoooOOO.f70275Oooo000;
                boolean z12 = c22956OoooOOO.f70272OooOooO;
                Map map7 = (Map) c22956OoooOOO.f70271OooOoo0;
                List list35 = (List) c22956OoooOOO.f70269OooOoOO;
                Map map8 = (Map) c22956OoooOOO.f70267OooOoO;
                C27174OooO0O0 c27174OooO0O011 = (C27174OooO0O0) c22956OoooOOO.f70268OooOoO0;
                List list36 = (List) c22956OoooOOO.f70265OooOo;
                C22949Oooo0oO c22949Oooo0oO15 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                c22949Oooo0oO6 = c22949Oooo0oO15;
                c34434OooOoO = c34434OooOoO3;
                str2 = "inapp";
                objOooO0o = obj5;
                r6 = z12;
                str = "310007";
                map = map7;
                str7 = "0";
                c27174OooO0O05 = c27174OooO0O011;
                list9 = list36;
                r54 = i15;
                i3 = i14;
                list10 = list35;
                r103 = map8;
                List list232 = (List) objOooO0o;
                o0Oo0oo o0oo0oo42 = c22949Oooo0oO6.f70202OooO0O0;
                c22956OoooOOO.f70266OooOo0o = c22949Oooo0oO6;
                c22956OoooOOO.f70265OooOo = list9;
                c22956OoooOOO.f70268OooOoO0 = c27174OooO0O05;
                c22956OoooOOO.f70267OooOoO = r103;
                c22956OoooOOO.f70269OooOoOO = list10;
                c22956OoooOOO.f70271OooOoo0 = map;
                c22956OoooOOO.f70270OooOoo = list232;
                c22956OoooOOO.f70272OooOooO = r6;
                c22956OoooOOO.f70275Oooo000 = r54;
                c22956OoooOOO.f70276Oooo00O = i3;
                C22949Oooo0oO c22949Oooo0oO112 = c22949Oooo0oO6;
                c22956OoooOOO.f70278Oooo0O0 = 8;
                String str142 = str2;
                objOooO00o3 = o0oo0oo42.OooO00o(str142, list232, c22956OoooOOO);
                if (objOooO00o3 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                int i16 = c22956OoooOOO.f70276Oooo00O;
                int i17 = c22956OoooOOO.f70275Oooo000;
                boolean z13 = c22956OoooOOO.f70272OooOooO;
                List list37 = (List) c22956OoooOOO.f70270OooOoo;
                Map map9 = (Map) c22956OoooOOO.f70271OooOoo0;
                List list38 = (List) c22956OoooOOO.f70269OooOoOO;
                Map map10 = (Map) c22956OoooOOO.f70267OooOoO;
                C27174OooO0O0 c27174OooO0O012 = (C27174OooO0O0) c22956OoooOOO.f70268OooOoO0;
                List list39 = (List) c22956OoooOOO.f70265OooOo;
                C22949Oooo0oO c22949Oooo0oO16 = (C22949Oooo0oO) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                c27174OooO0O05 = c27174OooO0O012;
                obj3 = obj5;
                str = "310007";
                c34434OooOoO = c34434OooOoO3;
                str8 = "inapp";
                list11 = list39;
                list12 = list37;
                str7 = "0";
                map2 = map9;
                r9 = i17;
                c22949Oooo0oO7 = c22949Oooo0oO16;
                list13 = list38;
                r104 = z13;
                i4 = i16;
                r15 = map10;
                c27174OooO0O06 = (C27174OooO0O0) obj3;
                C34406OooO00o.C20358OooO00o c20358OooO00o82 = C34406OooO00o.f123390OooO00o;
                String str152 = str10;
                int i92 = i4;
                str9 = str11;
                c20358OooO00o82.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o82, str11, "localInAppBindStatusResult: ", c27174OooO0O06), new Object[0]);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O06.getErrorCode(), str7)) {
                }
                break;
            case 9:
                i5 = c22956OoooOOO.f70276Oooo00O;
                int i18 = c22956OoooOOO.f70275Oooo000;
                boolean z14 = c22956OoooOOO.f70272OooOooO;
                C27174OooO0O0 c27174OooO0O013 = (C27174OooO0O0) c22956OoooOOO.f70270OooOoo;
                list16 = (List) c22956OoooOOO.f70271OooOoo0;
                Map map11 = (Map) c22956OoooOOO.f70269OooOoOO;
                List list40 = (List) c22956OoooOOO.f70267OooOoO;
                Map map12 = (Map) c22956OoooOOO.f70268OooOoO0;
                C27174OooO0O0 c27174OooO0O014 = (C27174OooO0O0) c22956OoooOOO.f70265OooOo;
                List list41 = (List) c22956OoooOOO.f70266OooOo0o;
                C32446OooOOOo.OooO0O0(obj5);
                c27174OooO0O05 = c27174OooO0O014;
                obj4 = obj5;
                str = "310007";
                c34434OooOoO = c34434OooOoO3;
                c27174OooO0O06 = c27174OooO0O013;
                str9 = "GoogleBillingRepo";
                str8 = "inapp";
                str7 = "0";
                list15 = list40;
                r152 = map12;
                list14 = list41;
                r4 = i18;
                r55 = z14;
                map3 = map11;
                c27174OooO0O07 = (C27174OooO0O0) obj4;
                C34406OooO00o.C20358OooO00o c20358OooO00o92 = C34406OooO00o.f123390OooO00o;
                String str172 = str9;
                C27174OooO0O0 c27174OooO0O092 = c27174OooO0O06;
                c20358OooO00o92.OooO0o0(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o92, str172, "localSubsBindStatusResult: ", c27174OooO0O07), new Object[0]);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O07.getErrorCode(), str7)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0120 A[LOOP:0: B:41:0x011a->B:43:0x0120, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C22964OooooOO c22964OooooOO;
        C22949Oooo0oO c22949Oooo0oO;
        String str2;
        C22949Oooo0oO c22949Oooo0oO2;
        ArrayList arrayList;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C22964OooooOO) {
            c22964OooooOO = (C22964OooooOO) abstractC32479OooO0OO;
            int i = c22964OooooOO.f70309OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22964OooooOO.f70309OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c22964OooooOO = new C22964OooooOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c22964OooooOO.f70306OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22964OooooOO.f70309OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            if (!OooOOOo()) {
                c22964OooooOO.f70305OooOo0o = this;
                c22964OooooOO.f70304OooOo = str;
                c22964OooooOO.f70309OooOoo0 = 1;
                o00Ooo o00ooo2 = this.f70203OooO0OO;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22966Oooooo(o00ooo2, str, null), c22964OooooOO);
                if (objOooO0o != enumC32485OooO00o) {
                    c22949Oooo0oO = this;
                }
                return enumC32485OooO00o;
            }
            GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
            Iterable iterable = (Iterable) googleBillingDataSource.f70037OooOOoo.f121747OooOo0o.getValue();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(NoteinGoogleInAppPurchase.INSTANCE.fromProductPurchase((ProductPurchase) it2.next(), str));
            }
            Iterable iterable2 = (Iterable) googleBillingDataSource.f70040OooOo00.f121747OooOo0o.getValue();
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
            Iterator it3 = iterable2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(NoteinGoogleSubscriptionPurchase.INSTANCE.fromSubscriptionPurchaseV2((SubscriptionPurchaseV2) it3.next(), str));
            }
            return new FirebaseUserMembership(str, arrayList2, arrayList3);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = c22964OooooOO.f70307OooOoO0;
            str2 = c22964OooooOO.f70304OooOo;
            c22949Oooo0oO2 = c22964OooooOO.f70305OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            Iterable iterable3 = (Iterable) objOooO0o;
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(iterable3, 10));
            it = iterable3.iterator();
            while (it.hasNext()) {
                arrayList4.add(c22949Oooo0oO2.f70204OooO0Oo.toSubscriptionModel((NoteinGoogleSubscriptionPurchaseEntity) it.next()));
            }
            return new FirebaseUserMembership(str2, arrayList, arrayList4);
        }
        str = c22964OooooOO.f70304OooOo;
        c22949Oooo0oO = c22964OooooOO.f70305OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0o);
        Iterable iterable4 = (Iterable) objOooO0o;
        ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(iterable4, 10));
        Iterator it4 = iterable4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(c22949Oooo0oO.f70204OooO0Oo.toInAppModel((NoteinGoogleInAppPurchaseEntity) it4.next()));
        }
        o00Ooo o00ooo3 = c22949Oooo0oO.f70203OooO0OO;
        c22964OooooOO.f70305OooOo0o = c22949Oooo0oO;
        c22964OooooOO.f70304OooOo = str;
        c22964OooooOO.f70307OooOoO0 = arrayList5;
        c22964OooooOO.f70309OooOoo0 = 2;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C22969Ooooooo(o00ooo3, str, null), c22964OooooOO);
        if (objOooO0o != enumC32485OooO00o) {
            str2 = str;
            c22949Oooo0oO2 = c22949Oooo0oO;
            arrayList = arrayList5;
            Iterable iterable32 = (Iterable) objOooO0o;
            ArrayList arrayList42 = new ArrayList(C34428OooOOo.OooOOoo(iterable32, 10));
            it = iterable32.iterator();
            while (it.hasNext()) {
            }
            return new FirebaseUserMembership(str2, arrayList, arrayList42);
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o0OOo0Oo.InterfaceC27300OooOOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C22947Oooo0o c22947Oooo0o;
        String str2;
        Object objOooO0oo;
        C22949Oooo0oO c22949Oooo0oO;
        Iterator it;
        C22949Oooo0oO c22949Oooo0oO2;
        String str3;
        C22949Oooo0oO c22949Oooo0oO3;
        List list;
        C22947Oooo0o c22947Oooo0o2;
        String str4;
        C22949Oooo0oO c22949Oooo0oO4;
        Iterator it2;
        if (abstractC32479OooO0OO instanceof C22947Oooo0o) {
            c22947Oooo0o = (C22947Oooo0o) abstractC32479OooO0OO;
            int i = c22947Oooo0o.f70192OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22947Oooo0o.f70192OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c22947Oooo0o = new C22947Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oo2 = c22947Oooo0o.f70189OooOoO;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c22947Oooo0o.f70192OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oo2);
            boolean zOooOOOo = OooOOOo();
            GoogleBillingDataSource googleBillingDataSource = this.f70201OooO00o;
            if (zOooOOOo) {
                if (googleBillingDataSource.f70039OooOo0.OooOOOo()) {
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO0o(googleBillingDataSource, null), 3);
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                    c20358OooO00o.OooO0OO("checkPendingPurchases: BillingClient is not ready", new Object[0]);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            c22947Oooo0o.f70188OooOo0o = this;
            str2 = str;
            c22947Oooo0o.f70187OooOo = str2;
            c22947Oooo0o.f70192OooOoo0 = 1;
            objOooO0oo = googleBillingDataSource.OooO0oo("inapp", c22947Oooo0o);
            if (objOooO0oo != obj) {
                c22949Oooo0oO = this;
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                it = c22947Oooo0o.f70190OooOoO0;
                String str5 = c22947Oooo0o.f70187OooOo;
                c22949Oooo0oO2 = c22947Oooo0o.f70188OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo2);
                str2 = str5;
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    c22947Oooo0o.f70188OooOo0o = c22949Oooo0oO2;
                    c22947Oooo0o.f70187OooOo = str2;
                    c22947Oooo0o.f70190OooOoO0 = it;
                    c22947Oooo0o.f70192OooOoo0 = 2;
                    String str6 = str2;
                    C22947Oooo0o c22947Oooo0o3 = c22947Oooo0o;
                    if (c22949Oooo0oO2.OooOO0O("inapp", purchase, null, str6, c22947Oooo0o3) == obj) {
                        break;
                    }
                    str2 = str6;
                    c22947Oooo0o = c22947Oooo0o3;
                }
                c22949Oooo0oO = c22949Oooo0oO2;
                str3 = str2;
                GoogleBillingDataSource googleBillingDataSource2 = c22949Oooo0oO.f70201OooO00o;
                c22947Oooo0o.f70188OooOo0o = c22949Oooo0oO;
                c22947Oooo0o.f70187OooOo = str3;
                c22947Oooo0o.f70190OooOoO0 = null;
                c22947Oooo0o.f70192OooOoo0 = 3;
                objOooO0oo2 = googleBillingDataSource2.OooO0oo("subs", c22947Oooo0o);
                if (objOooO0oo2 != obj) {
                    c22949Oooo0oO3 = c22949Oooo0oO;
                    list = (List) objOooO0oo2;
                    if (list != null) {
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                str3 = c22947Oooo0o.f70187OooOo;
                c22949Oooo0oO3 = c22947Oooo0o.f70188OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo2);
                list = (List) objOooO0oo2;
                if (list != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("GoogleBillingRepo");
                    c20358OooO00o2.OooO0OO("Failed to query pending subscription purchases", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
                c22947Oooo0o2 = c22947Oooo0o;
                str4 = str3;
                c22949Oooo0oO4 = c22949Oooo0oO3;
                it2 = list.iterator();
                while (it2.hasNext()) {
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it2 = c22947Oooo0o.f70190OooOoO0;
            String str7 = c22947Oooo0o.f70187OooOo;
            C22949Oooo0oO c22949Oooo0oO5 = c22947Oooo0o.f70188OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo2);
            c22947Oooo0o2 = c22947Oooo0o;
            str4 = str7;
            c22949Oooo0oO4 = c22949Oooo0oO5;
            while (it2.hasNext()) {
                Purchase purchase2 = (Purchase) it2.next();
                c22947Oooo0o2.f70188OooOo0o = c22949Oooo0oO4;
                c22947Oooo0o2.f70187OooOo = str4;
                c22947Oooo0o2.f70190OooOoO0 = it2;
                c22947Oooo0o2.f70192OooOoo0 = 4;
                if (c22949Oooo0oO4.OooOO0O("subs", purchase2, null, str4, c22947Oooo0o2) == obj) {
                    return obj;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        String str8 = c22947Oooo0o.f70187OooOo;
        c22949Oooo0oO = c22947Oooo0o.f70188OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0oo2);
        objOooO0oo = objOooO0oo2;
        str2 = str8;
        List list2 = (List) objOooO0oo;
        if (list2 == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("GoogleBillingRepo");
            c20358OooO00o3.OooO0OO("Failed to query pending in-app purchases", new Object[0]);
            str3 = str2;
            GoogleBillingDataSource googleBillingDataSource22 = c22949Oooo0oO.f70201OooO00o;
            c22947Oooo0o.f70188OooOo0o = c22949Oooo0oO;
            c22947Oooo0o.f70187OooOo = str3;
            c22947Oooo0o.f70190OooOoO0 = null;
            c22947Oooo0o.f70192OooOoo0 = 3;
            objOooO0oo2 = googleBillingDataSource22.OooO0oo("subs", c22947Oooo0o);
            if (objOooO0oo2 != obj) {
            }
            return obj;
        }
        it = list2.iterator();
        c22949Oooo0oO2 = c22949Oooo0oO;
        while (it.hasNext()) {
        }
        c22949Oooo0oO = c22949Oooo0oO2;
        str3 = str2;
        GoogleBillingDataSource googleBillingDataSource222 = c22949Oooo0oO.f70201OooO00o;
        c22947Oooo0o.f70188OooOo0o = c22949Oooo0oO;
        c22947Oooo0o.f70187OooOo = str3;
        c22947Oooo0o.f70190OooOoO0 = null;
        c22947Oooo0o.f70192OooOoo0 = 3;
        objOooO0oo2 = googleBillingDataSource222.OooO0oo("subs", c22947Oooo0o);
        if (objOooO0oo2 != obj) {
        }
        return obj;
    }

    public final boolean OooOOOo() {
        return ((Boolean) this.f70207OooO0oO.getValue()).booleanValue();
    }
}
