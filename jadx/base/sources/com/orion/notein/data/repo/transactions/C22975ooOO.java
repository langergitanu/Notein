package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.p602db.entity.NoteinGoogleInAppPurchaseEntity;
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

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingLocalDataSource$setInAppPurchases$2", m80623f = "NoteinGoogleBillingLocalDataSource.kt", m80624l = {53}, m80625m = "invokeSuspend")
public final class C22975ooOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70388OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList f70389OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f70390OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f70391OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f70392OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22975ooOO(o00Ooo o00ooo2, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f70391OooOoO0 = o00ooo2;
        this.f70390OooOoO = str;
        this.f70392OooOoOO = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22975ooOO(this.f70391OooOoO0, this.f70390OooOoO, this.f70392OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C22975ooOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70388OooOo;
        String str = this.f70390OooOoO;
        o00Ooo o00ooo2 = this.f70391OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<NoteinGoogleInAppPurchaseEntity> listOooO = o00ooo2.f70347OooO00o.OooO(str);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = listOooO.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f70392OooOoOO;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                NoteinGoogleInAppPurchaseEntity noteinGoogleInAppPurchaseEntity = (NoteinGoogleInAppPurchaseEntity) next;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((NoteinGoogleInAppPurchaseEntity) it2.next()).getPurchaseToken(), noteinGoogleInAppPurchaseEntity.getPurchaseToken())) {
                            break;
                        }
                    }
                }
                arrayList3.add(next);
            }
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((NoteinGoogleInAppPurchaseEntity) it3.next()).getPurchaseToken());
            }
            NoteinGoogleInAppPurchaseEntity[] noteinGoogleInAppPurchaseEntityArr = (NoteinGoogleInAppPurchaseEntity[]) arrayList.toArray(new NoteinGoogleInAppPurchaseEntity[0]);
            NoteinGoogleInAppPurchaseEntity[] noteinGoogleInAppPurchaseEntityArr2 = (NoteinGoogleInAppPurchaseEntity[]) Arrays.copyOf(noteinGoogleInAppPurchaseEntityArr, noteinGoogleInAppPurchaseEntityArr.length);
            this.f70389OooOo0o = arrayList4;
            this.f70388OooOo = 1;
            if (o00ooo2.f70347OooO00o.OooO0Oo(noteinGoogleInAppPurchaseEntityArr2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            arrayList2 = arrayList4;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList2 = this.f70389OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!arrayList2.isEmpty()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteinGoogleBillingLocalDataSource");
            c20358OooO00o.OooOO0O("Removing in-app purchases: " + arrayList2, new Object[0]);
            o00ooo2.f70347OooO00o.OooO0oo(str, arrayList2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
