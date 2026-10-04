package com.huawei.hms.drive;

import OooO0Oo.C20398OooO0O0;
import com.huawei.hms.network.embedded.C18250l0;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.drive.s */
/* JADX INFO: loaded from: classes6.dex */
public class C17884s {

    /* JADX INFO: renamed from: d */
    private int f53460d;

    /* JADX INFO: renamed from: a */
    private String f53457a = C18385v2.f56336h;

    /* JADX INFO: renamed from: b */
    private List<a> f53458b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private long f53459c = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    private int f53461e = -1;

    /* JADX INFO: renamed from: com.huawei.hms.drive.s$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f53462a;

        /* JADX INFO: renamed from: b */
        private String f53463b;

        /* JADX INFO: renamed from: c */
        private long f53464c;

        /* JADX INFO: renamed from: com.huawei.hms.drive.s$a$a, reason: collision with other inner class name */
        public static final class C19116a {

            /* JADX INFO: renamed from: a */
            private String f53465a;

            /* JADX INFO: renamed from: b */
            private String f53466b;

            /* JADX INFO: renamed from: c */
            private long f53467c = 2147483647L;

            /* JADX INFO: renamed from: a */
            public C19116a m76867a(long j) {
                this.f53467c = j;
                return this;
            }

            /* JADX INFO: renamed from: b */
            public C19116a m76870b(String str) {
                this.f53466b = str;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public C19116a m76868a(String str) {
                this.f53465a = str;
                return this;
            }

            /* JADX INFO: renamed from: a */
            public a m76869a() {
                return new a(this);
            }
        }

        private a(C19116a c19116a) {
            this.f53462a = c19116a.f53465a;
            this.f53463b = c19116a.f53466b;
            this.f53464c = c19116a.f53467c;
        }

        /* JADX INFO: renamed from: a */
        public String m76861a() {
            return this.f53462a;
        }

        /* JADX INFO: renamed from: b */
        public String m76862b() {
            return this.f53463b;
        }

        /* JADX INFO: renamed from: c */
        public long m76863c() {
            return this.f53464c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Address{type='");
            sb.append(this.f53462a);
            sb.append("', value is null='");
            sb.append(this.f53463b == null);
            sb.append("', ttl=");
            sb.append(this.f53464c);
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public List<a> m76852a() {
        return this.f53458b;
    }

    /* JADX INFO: renamed from: b */
    public long m76858b() {
        return this.f53459c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m76859c() {
        return this.f53458b.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public int m76860d() {
        long jAbs = Math.abs(System.currentTimeMillis() - this.f53459c);
        if (jAbs < C18250l0.g.f55491e) {
            return 0;
        }
        return jAbs < C18385v2.f56338j ? 1 : 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DnsResult{type='");
        sb.append(this.f53457a);
        sb.append('\'');
        sb.append(m76859c() ? ", addressList isEmpty" : ", addressList is not Empty");
        sb.append(", createTime=");
        sb.append(this.f53459c);
        sb.append(", source=");
        sb.append(this.f53460d);
        sb.append(", cache=");
        return C20398OooO0O0.OooO00o('}', sb, this.f53461e);
    }

    /* JADX INFO: renamed from: a */
    public void m76853a(int i) {
        this.f53461e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m76854a(long j) {
        this.f53459c = j;
    }

    /* JADX INFO: renamed from: a */
    public void m76855a(a aVar) {
        this.f53458b.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m76856a(String str) {
        this.f53457a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m76857a(List<a> list) {
        if (list == null) {
            this.f53458b = new ArrayList();
        } else {
            this.f53458b = list;
        }
    }
}
