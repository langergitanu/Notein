package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h */
/* JADX INFO: loaded from: classes9.dex */
public class C18193h extends AbstractC18179g<AbstractC18263m, AbstractC18263m> {

    /* JADX INFO: renamed from: b */
    public static final String f54994b = "DetectInfoCache";

    /* JADX INFO: renamed from: c */
    public static C18193h f54995c = new C18193h();

    /* JADX INFO: renamed from: a */
    public LimitQueue<AbstractC18263m> f54996a = new LimitQueue<>(5, false);

    /* JADX INFO: renamed from: b */
    public static C18193h m78641b() {
        return f54995c;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public int mo78515a(long j, long j2) {
        AbstractC18263m abstractC18263mMo78516a = mo78516a();
        if (abstractC18263mMo78516a.mo79008b(1).mo79212c() == 204) {
            return 4;
        }
        return abstractC18263mMo78516a.mo79008b(0).mo79212c() == 204 ? 5 : 0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public AbstractC18263m mo78516a() {
        AbstractC18263m abstractC18263mPeekLast = this.f54996a.peekLast();
        if (abstractC18263mPeekLast == null) {
            return new C18249l();
        }
        return Math.abs(System.currentTimeMillis() - abstractC18263mPeekLast.mo79007b()) < 300000 ? abstractC18263mPeekLast : new C18249l();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo78517a(AbstractC18263m abstractC18263m) {
        Logger.m76965v(f54994b, "DetectCache update :" + abstractC18263m.toString());
        this.f54996a.remove(abstractC18263m);
        this.f54996a.add(abstractC18263m);
    }
}
