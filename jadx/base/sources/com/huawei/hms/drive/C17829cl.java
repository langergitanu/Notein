package com.huawei.hms.drive;

import com.huawei.hms.drive.InterfaceC17793bc;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.cl */
/* JADX INFO: loaded from: classes6.dex */
public final class C17829cl implements InterfaceC17793bc.a {

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC17793bc> f53116a;

    /* JADX INFO: renamed from: b */
    private final C17822ce f53117b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC17825ch f53118c;

    /* JADX INFO: renamed from: d */
    private final C17818ca f53119d;

    /* JADX INFO: renamed from: e */
    private final int f53120e;

    /* JADX INFO: renamed from: f */
    private final C17798bh f53121f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC17775al f53122g;

    /* JADX INFO: renamed from: h */
    private final AbstractC17786aw f53123h;

    /* JADX INFO: renamed from: i */
    private final int f53124i;

    /* JADX INFO: renamed from: j */
    private final int f53125j;

    /* JADX INFO: renamed from: k */
    private final int f53126k;

    /* JADX INFO: renamed from: l */
    private int f53127l;

    public C17829cl(List<InterfaceC17793bc> list, C17822ce c17822ce, InterfaceC17825ch interfaceC17825ch, C17818ca c17818ca, int i, C17798bh c17798bh, InterfaceC17775al interfaceC17775al, AbstractC17786aw abstractC17786aw, int i2, int i3, int i4) {
        this.f53116a = list;
        this.f53119d = c17818ca;
        this.f53117b = c17822ce;
        this.f53118c = interfaceC17825ch;
        this.f53120e = i;
        this.f53121f = c17798bh;
        this.f53122g = interfaceC17775al;
        this.f53123h = abstractC17786aw;
        this.f53124i = i2;
        this.f53125j = i3;
        this.f53126k = i4;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc.a
    /* JADX INFO: renamed from: a */
    public C17798bh mo76181a() {
        return this.f53121f;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc.a
    /* JADX INFO: renamed from: b */
    public int mo76183b() {
        return this.f53124i;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc.a
    /* JADX INFO: renamed from: c */
    public int mo76184c() {
        return this.f53125j;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc.a
    /* JADX INFO: renamed from: d */
    public int mo76185d() {
        return this.f53126k;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC17779ap m76496e() {
        return this.f53119d;
    }

    /* JADX INFO: renamed from: f */
    public C17822ce m76497f() {
        return this.f53117b;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC17825ch m76498g() {
        return this.f53118c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC17775al m76499h() {
        return this.f53122g;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC17786aw m76500i() {
        return this.f53123h;
    }

    @Override // com.huawei.hms.drive.InterfaceC17793bc.a
    /* JADX INFO: renamed from: a */
    public C17800bj mo76182a(C17798bh c17798bh) throws IOException {
        return m76495a(c17798bh, this.f53117b, this.f53118c, this.f53119d);
    }

    /* JADX INFO: renamed from: a */
    public C17800bj m76495a(C17798bh c17798bh, C17822ce c17822ce, InterfaceC17825ch interfaceC17825ch, C17818ca c17818ca) throws IOException {
        if (this.f53120e < this.f53116a.size()) {
            this.f53127l++;
            if (this.f53118c != null && !this.f53119d.m76420a(c17798bh.m76261a())) {
                throw new IllegalStateException("network interceptor " + this.f53116a.get(this.f53120e - 1) + " must retain the same host and port");
            }
            if (this.f53118c != null && this.f53127l > 1) {
                throw new IllegalStateException("network interceptor " + this.f53116a.get(this.f53120e - 1) + " must call proceed() exactly once");
            }
            C17829cl c17829cl = new C17829cl(this.f53116a, c17822ce, interfaceC17825ch, c17818ca, this.f53120e + 1, c17798bh, this.f53122g, this.f53123h, this.f53124i, this.f53125j, this.f53126k);
            InterfaceC17793bc interfaceC17793bc = this.f53116a.get(this.f53120e);
            C17800bj c17800bjMo76180a = interfaceC17793bc.mo76180a(c17829cl);
            if (interfaceC17825ch != null && this.f53120e + 1 < this.f53116a.size() && c17829cl.f53127l != 1) {
                throw new IllegalStateException("network interceptor " + interfaceC17793bc + " must call proceed() exactly once");
            }
            if (c17800bjMo76180a == null) {
                throw new NullPointerException("interceptor " + interfaceC17793bc + " returned null");
            }
            if (c17800bjMo76180a.m76287f() != null || c17798bh.m76271j()) {
                return c17800bjMo76180a;
            }
            throw new IllegalStateException("interceptor " + interfaceC17793bc + " returned a response with no body");
        }
        throw new AssertionError();
    }
}
