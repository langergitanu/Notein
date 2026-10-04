package com.orion.notein.data.repo.transactions;

import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import com.orion.notein.domain.models.transactions.google.ProductPurchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22959OoooOoO implements InterfaceC33721OooO0o<List<? extends NoteinGoogleInAppPurchase>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f70283OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f70284OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooOoO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f70285OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f70286OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getUserMembership$$inlined$map$1$2", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19139OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f70287OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f70288OooOo0o;

            public C19139OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f70288OooOo0o = obj;
                this.f70287OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str) {
            this.f70286OooOo0o = interfaceC33723OooO0oO;
            this.f70285OooOo = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19139OooO00o c19139OooO00o;
            if (continuation instanceof C19139OooO00o) {
                c19139OooO00o = (C19139OooO00o) continuation;
                int i = c19139OooO00o.f70287OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19139OooO00o.f70287OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19139OooO00o = new C19139OooO00o(continuation);
                }
            }
            Object obj2 = c19139OooO00o.f70288OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19139OooO00o.f70287OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(NoteinGoogleInAppPurchase.INSTANCE.fromProductPurchase((ProductPurchase) it.next(), this.f70285OooOo));
                }
                c19139OooO00o.f70287OooOo = 1;
                if (this.f70286OooOo0o.emit(arrayList, c19139OooO00o) == enumC32485OooO00o) {
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

    public C22959OoooOoO(C33769Ooooo0o c33769Ooooo0o, String str) {
        this.f70284OooOo0o = c33769Ooooo0o;
        this.f70283OooOo = str;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleInAppPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f70284OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f70283OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
