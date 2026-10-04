package okhttp3.internal.http2;

import com.huawei.hms.network.embedded.C18134ca;
import com.huawei.hms.network.embedded.C18241k5;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34527OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final /* data */ class Header {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final C34527OooO0oO f124492OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C34527OooO0oO f124493OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C34527OooO0oO f124494OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C34527OooO0oO f124495OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C34527OooO0oO f124496OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C34527OooO0oO f124497OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34527OooO0oO f124498OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34527OooO0oO f124499OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f124500OooO0OO;

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m80612d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "<init>", "()V", "LoOo00OoO/OooO0oO;", "PSEUDO_PREFIX", "LoOo00OoO/OooO0oO;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
        f124493OooO0Oo = C34527OooO0oO.OooO00o.OooO0O0(C18241k5.f55433h);
        f124495OooO0o0 = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54486e);
        f124494OooO0o = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54487f);
        f124496OooO0oO = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54488g);
        f124497OooO0oo = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54489h);
        f124492OooO = C34527OooO0oO.OooO00o.OooO0O0(C18134ca.f54490i);
    }

    public Header(C34527OooO0oO name, C34527OooO0oO value) {
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(value, "value");
        this.f124498OooO00o = name;
        this.f124499OooO0O0 = value;
        this.f124500OooO0OO = value.OooO0OO() + name.OooO0OO() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return OooOOO0.OooO0O0(this.f124498OooO00o, header.f124498OooO00o) && OooOOO0.OooO0O0(this.f124499OooO0O0, header.f124499OooO0O0);
    }

    public final int hashCode() {
        return this.f124499OooO0O0.hashCode() + (this.f124498OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return this.f124498OooO00o.OooOOO0() + ": " + this.f124499OooO0O0.OooOOO0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(C34527OooO0oO.OooO00o.OooO0O0(name), C34527OooO0oO.OooO00o.OooO0O0(value));
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(value, "value");
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C34527OooO0oO name, String value) {
        this(name, C34527OooO0oO.OooO00o.OooO0O0(value));
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(value, "value");
        C34527OooO0oO c34527OooO0oO = C34527OooO0oO.f123734OooOoO;
    }
}
