package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18351s7 extends AbstractC18174f8 {

    /* JADX INFO: renamed from: c */
    public static final C18442z7 f56125c = C18442z7.m80033a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a */
    public final List<String> f56126a;

    /* JADX INFO: renamed from: b */
    public final List<String> f56127b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<String> f56128a;

        /* JADX INFO: renamed from: b */
        public final List<String> f56129b;

        /* JADX INFO: renamed from: c */
        public final Charset f56130c;

        public a() {
            this(null);
        }

        /* JADX INFO: renamed from: a */
        public a m79505a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f56128a.add(C18416x7.m79904a(str, C18416x7.f56649s, false, false, true, true, this.f56130c));
            this.f56129b.add(C18416x7.m79904a(str2, C18416x7.f56649s, false, false, true, true, this.f56130c));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m79507b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f56128a.add(C18416x7.m79904a(str, C18416x7.f56649s, true, false, true, true, this.f56130c));
            this.f56129b.add(C18416x7.m79904a(str2, C18416x7.f56649s, true, false, true, true, this.f56130c));
            return this;
        }

        public a(Charset charset) {
            this.f56128a = new ArrayList();
            this.f56129b = new ArrayList();
            this.f56130c = charset;
        }

        /* JADX INFO: renamed from: a */
        public C18351s7 m79506a() {
            return new C18351s7(this.f56128a, this.f56129b);
        }
    }

    public C18351s7(List<String> list, List<String> list2) {
        this.f56126a = C18313p8.m79372a(list);
        this.f56127b = C18313p8.m79372a(list2);
    }

    /* JADX INFO: renamed from: a */
    public int m79500a() {
        return this.f56126a.size();
    }

    /* JADX INFO: renamed from: b */
    public String m79502b(int i) {
        return this.f56127b.get(i);
    }

    /* JADX INFO: renamed from: c */
    public String m79503c(int i) {
        return C18416x7.m79905a(m79501a(i), true);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public long contentLength() {
        return m79499a(null, true);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public C18442z7 contentType() {
        return f56125c;
    }

    /* JADX INFO: renamed from: d */
    public String m79504d(int i) {
        return C18416x7.m79905a(m79502b(i), true);
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18174f8
    public void writeTo(InterfaceC18275mb interfaceC18275mb) throws IOException {
        m79499a(interfaceC18275mb, false);
    }

    /* JADX INFO: renamed from: a */
    private long m79499a(InterfaceC18275mb interfaceC18275mb, boolean z) {
        C18261lb c18261lb = z ? new C18261lb() : interfaceC18275mb.mo78258a();
        int size = this.f56126a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c18261lb.writeByte(38);
            }
            c18261lb.mo78261a(this.f56126a.get(i));
            c18261lb.writeByte(61);
            c18261lb.mo78261a(this.f56127b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long jM79076B = c18261lb.m79076B();
        c18261lb.m79095s();
        return jM79076B;
    }

    /* JADX INFO: renamed from: a */
    public String m79501a(int i) {
        return this.f56126a.get(i);
    }
}
