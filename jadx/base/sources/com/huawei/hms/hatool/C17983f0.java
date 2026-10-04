package com.huawei.hms.hatool;

import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: renamed from: com.huawei.hms.hatool.f0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17983f0 {

    /* JADX INFO: renamed from: a */
    public long f53781a = 1800000;

    /* JADX INFO: renamed from: b */
    public volatile boolean f53782b = false;

    /* JADX INFO: renamed from: c */
    public a f53783c = null;

    /* JADX INFO: renamed from: com.huawei.hms.hatool.f0$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public String f53784a = UUID.randomUUID().toString().replace(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "");

        /* JADX INFO: renamed from: b */
        public boolean f53785b;

        /* JADX INFO: renamed from: c */
        public long f53786c;

        public a(long j) {
            this.f53784a += C18115b5.CONNECTOR + j;
            this.f53786c = j;
            this.f53785b = true;
            C17983f0.this.f53782b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m77319a(long j) {
            if (C17983f0.this.f53782b) {
                C17983f0.this.f53782b = false;
                m77321b(j);
            } else if (m77322b(this.f53786c, j) || m77320a(this.f53786c, j)) {
                m77321b(j);
            } else {
                this.f53786c = j;
                this.f53785b = false;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m77321b(long j) {
            C18030y.m77586c("hmsSdk", "getNewSession() session is flush!");
            String string = UUID.randomUUID().toString();
            this.f53784a = string;
            this.f53784a = string.replace(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "");
            this.f53784a += C18115b5.CONNECTOR + j;
            this.f53786c = j;
            this.f53785b = true;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m77320a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m77322b(long j, long j2) {
            return j2 - j >= C17983f0.this.f53781a;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m77316a() {
        a aVar = this.f53783c;
        if (aVar != null) {
            return aVar.f53784a;
        }
        C18030y.m77591f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    /* JADX INFO: renamed from: a */
    public void m77317a(long j) {
        a aVar = this.f53783c;
        if (aVar != null) {
            aVar.m77319a(j);
        } else {
            C18030y.m77586c("hmsSdk", "Session is first flush");
            this.f53783c = new a(j);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m77318b() {
        a aVar = this.f53783c;
        if (aVar != null) {
            return aVar.f53785b;
        }
        C18030y.m77591f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
