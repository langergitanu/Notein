package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.NoteinGoogleSubscriptionPurchaseEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingLocalDataSource$setSubscriptionPurchases$2", m80623f = "NoteinGoogleBillingLocalDataSource.kt", m80624l = {70}, m80625m = "invokeSuspend")
public final class o00Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70342OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f70343OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70344OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f70345OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f70346OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(o00Ooo o00ooo2, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f70345OooOoO0 = o00ooo2;
        this.f70344OooOoO = str;
        this.f70346OooOoOO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00Oo0(this.f70345OooOoO0, this.f70344OooOoO, this.f70346OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70342OooOo;
        String str = this.f70344OooOoO;
        o00Ooo o00ooo2 = this.f70345OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<NoteinGoogleSubscriptionPurchaseEntity> listOooO0o0 = o00ooo2.f70347OooO00o.OooO0o0(str);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = listOooO0o0.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f70346OooOoOO;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                NoteinGoogleSubscriptionPurchaseEntity noteinGoogleSubscriptionPurchaseEntity = (NoteinGoogleSubscriptionPurchaseEntity) next;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleSubscriptionPurchaseEntity) it2.next()).getPurchaseToken(), noteinGoogleSubscriptionPurchaseEntity.getPurchaseToken())) {
                            break;
                        }
                    }
                }
                arrayList3.add(next);
            }
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((NoteinGoogleSubscriptionPurchaseEntity) it3.next()).getPurchaseToken());
            }
            NoteinGoogleSubscriptionPurchaseEntity[] noteinGoogleSubscriptionPurchaseEntityArr = (NoteinGoogleSubscriptionPurchaseEntity[]) arrayList.toArray(new NoteinGoogleSubscriptionPurchaseEntity[0]);
            NoteinGoogleSubscriptionPurchaseEntity[] noteinGoogleSubscriptionPurchaseEntityArr2 = (NoteinGoogleSubscriptionPurchaseEntity[]) Arrays.copyOf(noteinGoogleSubscriptionPurchaseEntityArr, noteinGoogleSubscriptionPurchaseEntityArr.length);
            this.f70343OooOo0o = arrayList4;
            this.f70342OooOo = 1;
            if (o00ooo2.f70347OooO00o.OooO0O0(noteinGoogleSubscriptionPurchaseEntityArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            arrayList2 = arrayList4;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList2 = this.f70343OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!arrayList2.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteinGoogleBillingLocalDataSource");
            c20358OooO00o.OooOO0O("Removing subscription purchases: " + arrayList2, new Object[0]);
            o00ooo2.f70347OooO00o.OooO0OO(str, arrayList2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
