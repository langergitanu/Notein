package com.google.firebase.sessions;

import com.huawei.hms.support.account.AccountAuthManager;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import java.util.ArrayList;
import o0OOOO0o.C27099OooO0oo;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C34001o0ooOO0;
import oO0oO00.InterfaceC33966Oooo0OO;
import oO0oO00.o00oO0O;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68684OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68685OooOo0o;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f68685OooOo0o = i;
        this.f68684OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        ArrayList arrayList;
        InterfaceC33911OooO0OO<?>[] interfaceC33911OooO0OOArrTypeParametersSerializers;
        switch (this.f68685OooOo0o) {
            case 0:
                return ProcessDataManagerImpl.myUuid_delegate$lambda$1((UuidGenerator) this.f68684OooOo);
            case 1:
                return AccountAuthManager.getService(((C27099OooO0oo) this.f68684OooOo).f94438OooO0O0, new AccountAuthParamsHelper(AccountAuthParams.DEFAULT_AUTH_REQUEST_PARAM).setAuthorizationCode().createParams());
            default:
                InterfaceC33966Oooo0OO<?> interfaceC33966Oooo0OO = ((C34001o0ooOO0) this.f68684OooOo).f122281OooO0O0;
                if (interfaceC33966Oooo0OO == null || (interfaceC33911OooO0OOArrTypeParametersSerializers = interfaceC33966Oooo0OO.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(interfaceC33911OooO0OOArrTypeParametersSerializers.length);
                    for (InterfaceC33911OooO0OO<?> interfaceC33911OooO0OO : interfaceC33911OooO0OOArrTypeParametersSerializers) {
                        arrayList.add(interfaceC33911OooO0OO.getDescriptor());
                    }
                }
                return o00oO0O.OooO0O0(arrayList);
        }
    }
}
