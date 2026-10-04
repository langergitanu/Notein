package com.huawei.hms.drive;

import android.os.Bundle;
import com.huawei.hms.drive.C17788ay;
import java.io.Closeable;

/* JADX INFO: renamed from: com.huawei.hms.drive.bj */
/* JADX INFO: loaded from: classes6.dex */
public final class C17800bj implements Closeable {

    /* JADX INFO: renamed from: a */
    final C17798bh f52914a;

    /* JADX INFO: renamed from: b */
    final EnumC17796bf f52915b;

    /* JADX INFO: renamed from: c */
    final int f52916c;

    /* JADX INFO: renamed from: d */
    final String f52917d;

    /* JADX INFO: renamed from: e */
    final C17787ax f52918e;

    /* JADX INFO: renamed from: f */
    final C17788ay f52919f;

    /* JADX INFO: renamed from: g */
    final AbstractC17801bk f52920g;

    /* JADX INFO: renamed from: h */
    final C17800bj f52921h;

    /* JADX INFO: renamed from: i */
    final C17800bj f52922i;

    /* JADX INFO: renamed from: j */
    final C17800bj f52923j;

    /* JADX INFO: renamed from: k */
    final long f52924k;

    /* JADX INFO: renamed from: l */
    final long f52925l;

    /* JADX INFO: renamed from: m */
    private volatile C17774ak f52926m;

    /* JADX INFO: renamed from: com.huawei.hms.drive.bj$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        C17798bh f52927a;

        /* JADX INFO: renamed from: b */
        EnumC17796bf f52928b;

        /* JADX INFO: renamed from: c */
        int f52929c;

        /* JADX INFO: renamed from: d */
        String f52930d;

        /* JADX INFO: renamed from: e */
        C17787ax f52931e;

        /* JADX INFO: renamed from: f */
        C17788ay.a f52932f;

        /* JADX INFO: renamed from: g */
        AbstractC17801bk f52933g;

        /* JADX INFO: renamed from: h */
        C17800bj f52934h;

        /* JADX INFO: renamed from: i */
        C17800bj f52935i;

        /* JADX INFO: renamed from: j */
        C17800bj f52936j;

        /* JADX INFO: renamed from: k */
        long f52937k;

        /* JADX INFO: renamed from: l */
        long f52938l;

        public a() {
            this.f52929c = -1;
            this.f52932f = new C17788ay.a();
        }

        /* JADX INFO: renamed from: d */
        private void m76294d(C17800bj c17800bj) {
            if (c17800bj.f52920g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* JADX INFO: renamed from: a */
        public a m76300a(C17798bh c17798bh) {
            this.f52927a = c17798bh;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76308b(String str, String str2) {
            this.f52932f.m76080a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m76309c(C17800bj c17800bj) {
            if (c17800bj != null) {
                m76294d(c17800bj);
            }
            this.f52936j = c17800bj;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76299a(EnumC17796bf enumC17796bf) {
            this.f52928b = enumC17796bf;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76307b(C17800bj c17800bj) {
            if (c17800bj != null) {
                m76293a("cacheResponse", c17800bj);
            }
            this.f52935i = c17800bj;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76295a(int i) {
            this.f52929c = i;
            return this;
        }

        public a(C17800bj c17800bj) {
            this.f52929c = -1;
            this.f52927a = c17800bj.f52914a;
            this.f52928b = c17800bj.f52915b;
            this.f52929c = c17800bj.f52916c;
            this.f52930d = c17800bj.f52917d;
            this.f52931e = c17800bj.f52918e;
            this.f52932f = c17800bj.f52919f.m76075b();
            this.f52933g = c17800bj.f52920g;
            this.f52934h = c17800bj.f52921h;
            this.f52935i = c17800bj.f52922i;
            this.f52936j = c17800bj.f52923j;
            this.f52937k = c17800bj.f52924k;
            this.f52938l = c17800bj.f52925l;
        }

        /* JADX INFO: renamed from: a */
        public a m76303a(String str) {
            this.f52930d = str;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76306b(long j) {
            this.f52938l = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76297a(C17787ax c17787ax) {
            this.f52931e = c17787ax;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76304a(String str, String str2) {
            this.f52932f.m76084c(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76298a(C17788ay c17788ay) {
            this.f52932f = c17788ay.m76075b();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76302a(AbstractC17801bk abstractC17801bk) {
            this.f52933g = abstractC17801bk;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76301a(C17800bj c17800bj) {
            if (c17800bj != null) {
                m76293a("networkResponse", c17800bj);
            }
            this.f52934h = c17800bj;
            return this;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v2, types: [int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v3, types: [int, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v4, types: [int, java.lang.String] */
        /* JADX INFO: renamed from: a */
        private void m76293a(String str, C17800bj c17800bj) {
            if (c17800bj.f52920g == null) {
                if (c17800bj.f52921h == null) {
                    if (c17800bj.f52922i == null) {
                        if (c17800bj.f52923j != null) {
                            throw new IllegalArgumentException((String) Bundle.getInt(str));
                        }
                        return;
                    }
                    throw new IllegalArgumentException((String) Bundle.getInt(str));
                }
                throw new IllegalArgumentException((String) Bundle.getInt(str));
            }
            throw new IllegalArgumentException((String) Bundle.getInt(str));
        }

        /* JADX INFO: renamed from: a */
        public a m76296a(long j) {
            this.f52937k = j;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C17800bj m76305a() {
            if (this.f52927a != null) {
                if (this.f52928b != null) {
                    if (this.f52929c >= 0) {
                        if (this.f52930d != null) {
                            return new C17800bj(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f52929c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public C17800bj(a aVar) {
        this.f52914a = aVar.f52927a;
        this.f52915b = aVar.f52928b;
        this.f52916c = aVar.f52929c;
        this.f52917d = aVar.f52930d;
        this.f52918e = aVar.f52931e;
        this.f52919f = aVar.f52932f.m76081a();
        this.f52920g = aVar.f52933g;
        this.f52921h = aVar.f52934h;
        this.f52922i = aVar.f52935i;
        this.f52923j = aVar.f52936j;
        this.f52924k = aVar.f52937k;
        this.f52925l = aVar.f52938l;
    }

    /* JADX INFO: renamed from: a */
    public C17798bh m76280a() {
        return this.f52914a;
    }

    /* JADX INFO: renamed from: b */
    public int m76283b() {
        return this.f52916c;
    }

    /* JADX INFO: renamed from: c */
    public String m76284c() {
        return this.f52917d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC17801bk abstractC17801bk = this.f52920g;
        if (abstractC17801bk == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC17801bk.close();
    }

    /* JADX INFO: renamed from: d */
    public C17787ax m76285d() {
        return this.f52918e;
    }

    /* JADX INFO: renamed from: e */
    public C17788ay m76286e() {
        return this.f52919f;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC17801bk m76287f() {
        return this.f52920g;
    }

    /* JADX INFO: renamed from: g */
    public a m76288g() {
        return new a(this);
    }

    /* JADX INFO: renamed from: h */
    public C17800bj m76289h() {
        return this.f52923j;
    }

    /* JADX INFO: renamed from: i */
    public C17774ak m76290i() {
        C17774ak c17774ak = this.f52926m;
        if (c17774ak != null) {
            return c17774ak;
        }
        C17774ak c17774akM75964a = C17774ak.m75964a(this.f52919f);
        this.f52926m = c17774akM75964a;
        return c17774akM75964a;
    }

    /* JADX INFO: renamed from: j */
    public long m76291j() {
        return this.f52924k;
    }

    /* JADX INFO: renamed from: k */
    public long m76292k() {
        return this.f52925l;
    }

    public String toString() {
        return "Response{protocol=" + this.f52915b + ", code=" + this.f52916c + ", message=" + this.f52917d + ", url=" + this.f52914a.m76261a() + '}';
    }

    /* JADX INFO: renamed from: a */
    public String m76281a(String str) {
        return m76282a(str, null);
    }

    /* JADX INFO: renamed from: a */
    public String m76282a(String str, String str2) {
        String strM76074a = this.f52919f.m76074a(str);
        return strM76074a != null ? strM76074a : str2;
    }
}
