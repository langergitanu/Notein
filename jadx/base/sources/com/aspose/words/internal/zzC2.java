package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzC2 implements Iterable<Class> {
    private zzIM<Class> zztk = new zzIM<>();

    public final void add(Class cls) {
        zzZ4.zzY((Object) cls, C18437z2.f56754h);
        if (zzZWA.zzu(cls)) {
            throw new IllegalArgumentException("The type must be non-void.\r\nParameter name: type");
        }
        if (!zzZWA.zzt(cls)) {
            throw new IllegalArgumentException("The type must be visible.\r\nParameter name: type");
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("The type must be non-array.\r\nParameter name: type");
        }
        if (this.zztk.contains(cls)) {
            throw new IllegalArgumentException("The type is already added.\r\nParameter name: type");
        }
        this.zztk.add(cls);
    }

    public final void clear() {
        this.zztk.clear();
    }

    public final int getCount() {
        return this.zztk.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<Class> iterator() {
        return this.zztk.iterator();
    }

    public final void remove(Class cls) {
        zzZ4.zzY((Object) cls, C18437z2.f56754h);
        this.zztk.remove(cls);
    }
}
