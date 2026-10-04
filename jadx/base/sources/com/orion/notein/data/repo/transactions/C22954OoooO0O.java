package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22954OoooO0O implements InterfaceC33721OooO0o<List<? extends NoteinGoogleInAppPurchase>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70253OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f70254OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooO0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C22949Oooo0oO f70255OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f70256OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OoooO0O$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl$getInAppPurchases$$inlined$map$2$2", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19138OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f70257OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f70258OooOo0o;

            public C19138OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f70258OooOo0o = obj;
                this.f70257OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C22949Oooo0oO c22949Oooo0oO) {
            this.f70256OooOo0o = interfaceC33723OooO0oO;
            this.f70255OooOo = c22949Oooo0oO;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19138OooO00o c19138OooO00o;
            if (continuation instanceof C19138OooO00o) {
                c19138OooO00o = (C19138OooO00o) continuation;
                int i = c19138OooO00o.f70257OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19138OooO00o.f70257OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19138OooO00o = new C19138OooO00o(continuation);
                }
            }
            Object obj2 = c19138OooO00o.f70258OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19138OooO00o.f70257OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f70255OooOo.f70204OooO0Oo.toInAppModel((NoteinGoogleInAppPurchaseEntity) it.next()));
                }
                c19138OooO00o.f70257OooOo = 1;
                if (this.f70256OooOo0o.emit(arrayList, c19138OooO00o) == enumC32485OooO00o) {
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

    public C22954OoooO0O(InterfaceC33721OooO0o interfaceC33721OooO0o, C22949Oooo0oO c22949Oooo0oO) {
        this.f70254OooOo0o = interfaceC33721OooO0o;
        this.f70253OooOo = c22949Oooo0oO;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends NoteinGoogleInAppPurchase>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f70254OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f70253OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
