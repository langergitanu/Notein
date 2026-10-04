package com.huawei.agconnect.common.api;

import android.text.TextUtils;
import com.huawei.agconnect.credential.obs.C17631i;
import com.huawei.agconnect.credential.obs.C17633k;
import com.huawei.agconnect.credential.obs.C17634l;
import com.huawei.agconnect.credential.obs.InterfaceC17638p;
import com.huawei.agconnect.datastore.annotation.ICrypto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class AgcCrypto implements InterfaceC17638p, ICrypto {
    private static final AgcCrypto INSTANCE = new AgcCrypto();
    private final List<ICrypto> cryptoList;

    public AgcCrypto() {
        ArrayList arrayList = new ArrayList();
        this.cryptoList = arrayList;
        arrayList.add(new C17634l());
        arrayList.add(new C17633k());
        arrayList.add(new C17631i());
    }

    public static ICrypto get() {
        return INSTANCE;
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17638p, com.huawei.agconnect.datastore.annotation.ICrypto
    public String decrypt(String str) {
        Iterator<ICrypto> it = this.cryptoList.iterator();
        while (it.hasNext()) {
            String strDecrypt = it.next().decrypt(str);
            if (!TextUtils.isEmpty(strDecrypt)) {
                return strDecrypt;
            }
        }
        return str;
    }

    @Override // com.huawei.agconnect.credential.obs.InterfaceC17638p, com.huawei.agconnect.datastore.annotation.ICrypto
    public String encrypt(String str) {
        return this.cryptoList.get(0).encrypt(str);
    }
}
