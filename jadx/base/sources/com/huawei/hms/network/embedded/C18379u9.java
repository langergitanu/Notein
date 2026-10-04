package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.InterfaceC18429y7;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18379u9 implements InterfaceC18429y7.a {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC18429y7> f56306a;

    /* JADX INFO: renamed from: b */
    public final C18287n9 f56307b;

    /* JADX INFO: renamed from: c */
    public final C18175f9 f56308c;

    /* JADX INFO: renamed from: d */
    public final int f56309d;

    /* JADX INFO: renamed from: e */
    public final C18160e8 f56310e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC18159e7 f56311f;

    /* JADX INFO: renamed from: g */
    public final int f56312g;

    /* JADX INFO: renamed from: h */
    public final int f56313h;

    /* JADX INFO: renamed from: i */
    public final int f56314i;

    /* JADX INFO: renamed from: j */
    public int f56315j;

    public C18379u9(List<InterfaceC18429y7> list, C18287n9 c18287n9, C18175f9 c18175f9, int i, C18160e8 c18160e8, InterfaceC18159e7 interfaceC18159e7, int i2, int i3, int i4) {
        this.f56306a = list;
        this.f56307b = c18287n9;
        this.f56308c = c18175f9;
        this.f56309d = i;
        this.f56310e = c18160e8;
        this.f56311f = interfaceC18159e7;
        this.f56312g = i2;
        this.f56313h = i3;
        this.f56314i = i4;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: a */
    public C18188g8 mo79643a(C18160e8 c18160e8) throws IOException {
        return m79644a(c18160e8, this.f56307b, this.f56308c);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: b */
    public int mo79647b() {
        return this.f56314i;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: c */
    public int mo79649c() {
        return this.f56313h;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    public InterfaceC18159e7 call() {
        return this.f56311f;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: d */
    public int mo79651d() {
        return this.f56312g;
    }

    /* JADX INFO: renamed from: e */
    public C18175f9 m79652e() {
        C18175f9 c18175f9 = this.f56308c;
        if (c18175f9 != null) {
            return c18175f9;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: f */
    public C18287n9 m79653f() {
        return this.f56307b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    public C18160e8 request() {
        return this.f56310e;
    }

    /* JADX INFO: renamed from: a */
    public C18188g8 m79644a(C18160e8 c18160e8, C18287n9 c18287n9, C18175f9 c18175f9) throws IOException {
        if (this.f56309d >= this.f56306a.size()) {
            throw new AssertionError();
        }
        this.f56315j++;
        C18175f9 c18175f92 = this.f56308c;
        if (c18175f92 != null && !c18175f92.m78427b().m78787a(c18160e8.m78310k())) {
            throw new IllegalStateException("network interceptor " + this.f56306a.get(this.f56309d - 1) + " must retain the same host and port");
        }
        if (this.f56308c != null && this.f56315j > 1) {
            throw new IllegalStateException("network interceptor " + this.f56306a.get(this.f56309d - 1) + " must call proceed() exactly once");
        }
        C18379u9 c18379u9 = new C18379u9(this.f56306a, c18287n9, c18175f9, this.f56309d + 1, c18160e8, this.f56311f, this.f56312g, this.f56313h, this.f56314i);
        InterfaceC18429y7 interfaceC18429y7 = this.f56306a.get(this.f56309d);
        C18188g8 c18188g8Intercept = interfaceC18429y7.intercept(c18379u9);
        if (c18175f9 != null && this.f56309d + 1 < this.f56306a.size() && c18379u9.f56315j != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC18429y7 + " must call proceed() exactly once");
        }
        if (c18188g8Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC18429y7 + " returned null");
        }
        if (c18188g8Intercept.m78585s() != null || c18160e8.m78305f()) {
            return c18188g8Intercept;
        }
        throw new IllegalStateException("interceptor " + interfaceC18429y7 + " returned a response with no body");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: b */
    public InterfaceC18429y7.a mo79648b(int i, TimeUnit timeUnit) {
        return new C18379u9(this.f56306a, this.f56307b, this.f56308c, this.f56309d, this.f56310e, this.f56311f, this.f56312g, this.f56313h, C18313p8.m79361a("timeout", i, timeUnit));
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: c */
    public InterfaceC18429y7.a mo79650c(int i, TimeUnit timeUnit) {
        return new C18379u9(this.f56306a, this.f56307b, this.f56308c, this.f56309d, this.f56310e, this.f56311f, C18313p8.m79361a("timeout", i, timeUnit), this.f56313h, this.f56314i);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: a */
    public InterfaceC18229j7 mo79645a() {
        C18175f9 c18175f9 = this.f56308c;
        if (c18175f9 != null) {
            return c18175f9.m78427b();
        }
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18429y7.a
    /* JADX INFO: renamed from: a */
    public InterfaceC18429y7.a mo79646a(int i, TimeUnit timeUnit) {
        return new C18379u9(this.f56306a, this.f56307b, this.f56308c, this.f56309d, this.f56310e, this.f56311f, this.f56312g, C18313p8.m79361a("timeout", i, timeUnit), this.f56314i);
    }
}
