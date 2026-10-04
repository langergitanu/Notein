package com.huawei.hms.network.embedded;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18403w7 {

    /* JADX INFO: renamed from: a */
    public final C18103a7 f56544a;

    /* JADX INFO: renamed from: b */
    public final List<C18217i9> f56545b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public int f56546c = 0;

    public C18403w7(C18103a7 c18103a7) {
        this.f56544a = c18103a7;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    private C18217i9 m79829d() {
        if (this.f56545b.isEmpty()) {
            return null;
        }
        if (this.f56546c >= this.f56545b.size()) {
            this.f56546c = 0;
        }
        int size = this.f56545b.size();
        for (int i = this.f56546c; i < size; i++) {
            C18217i9 c18217i9 = this.f56545b.get(i);
            if (c18217i9.f55254p.size() < c18217i9.f55253o && !c18217i9.f55249k) {
                this.f56546c++;
                return c18217i9;
            }
        }
        for (int i2 = 0; i2 < this.f56546c; i2++) {
            C18217i9 c18217i92 = this.f56545b.get(i2);
            if (c18217i92.f55254p.size() < c18217i92.f55253o && !c18217i92.f55249k) {
                this.f56546c++;
                return c18217i92;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private C18217i9 m79830e() {
        C18217i9 c18217i9 = null;
        int i = Integer.MAX_VALUE;
        for (C18217i9 c18217i92 : this.f56545b) {
            int size = c18217i92.f55254p.size();
            if (size < c18217i92.f55253o && !c18217i92.f55249k && size < i) {
                c18217i9 = c18217i92;
                i = size;
            }
        }
        return c18217i9;
    }

    /* JADX INFO: renamed from: a */
    public C18103a7 m79831a() {
        return this.f56544a;
    }

    /* JADX INFO: renamed from: b */
    public C18217i9 m79833b() {
        return m79830e();
    }

    /* JADX INFO: renamed from: c */
    public boolean m79835c() {
        return this.f56545b.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public void m79832a(C18217i9 c18217i9) {
        if (this.f56545b.contains(c18217i9)) {
            return;
        }
        this.f56545b.add(c18217i9);
    }

    /* JADX INFO: renamed from: b */
    public void m79834b(C18217i9 c18217i9) {
        this.f56545b.remove(c18217i9);
    }
}
