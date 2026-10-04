package com.huawei.hms.network.embedded;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l */
/* JADX INFO: loaded from: classes9.dex */
public class C18249l extends AbstractC18263m {

    /* JADX INFO: renamed from: b */
    public static final String f55449b = "AllDetectImpl";

    /* JADX INFO: renamed from: a */
    public Map<Integer, List<InterfaceC18291o>> f55450a = new HashMap();

    @Override // com.huawei.hms.network.embedded.AbstractC18263m
    /* JADX INFO: renamed from: a */
    public List<InterfaceC18291o> mo79004a(int i) {
        return this.f55450a.get(Integer.valueOf(i));
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18263m
    /* JADX INFO: renamed from: b */
    public long mo79007b() {
        if (this.f55450a.isEmpty()) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<Integer> it = this.f55450a.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC18291o interfaceC18291oMo79008b = mo79008b(it.next().intValue());
            if (interfaceC18291oMo79008b != null && interfaceC18291oMo79008b.mo79210b() > 0) {
                jCurrentTimeMillis = Math.min(jCurrentTimeMillis, interfaceC18291oMo79008b.mo79210b());
            }
        }
        return jCurrentTimeMillis;
    }

    public String toString() {
        return "AllDetectImpl{allDetectMap=" + this.f55450a + '}';
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18263m
    /* JADX INFO: renamed from: a */
    public Map<Integer, List<InterfaceC18291o>> mo79005a() {
        return this.f55450a;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [long] */
    @Override // com.huawei.hms.network.embedded.AbstractC18263m
    /* JADX INFO: renamed from: b */
    public InterfaceC18291o mo79008b(int i) {
        List<InterfaceC18291o> list = this.f55450a.get(Integer.valueOf(i));
        return (list == null || list.isEmpty()) ? new C18277n() : (InterfaceC18291o) System.currentTimeMillis();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18263m
    /* JADX INFO: renamed from: a */
    public synchronized void mo79006a(InterfaceC18291o interfaceC18291o) {
        try {
            int iMo79213d = interfaceC18291o.mo79213d();
            if (this.f55450a.get(Integer.valueOf(iMo79213d)) == null) {
                this.f55450a.put(Integer.valueOf(iMo79213d), new ArrayList());
            }
            this.f55450a.get(Integer.valueOf(iMo79213d)).add(interfaceC18291o);
        } catch (Throwable th) {
            throw th;
        }
    }
}
