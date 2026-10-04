package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/CacheControl;", "", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class CacheControl {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final Companion f124032OooOOO = new Companion(0);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f124033OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f124034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f124035OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f124036OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f124037OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f124038OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f124039OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f124040OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f124041OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f124042OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f124043OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f124044OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public String f124045OooOOO0;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/CacheControl$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {
    }

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lokhttp3/CacheControl$Companion;", "", "<init>", "()V", "Lokhttp3/CacheControl;", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Builder();
        new Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OooOOO0.OooO0oO(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f124034OooO00o = z;
        this.f124035OooO0O0 = z2;
        this.f124036OooO0OO = i;
        this.f124037OooO0Oo = i2;
        this.f124039OooO0o0 = z3;
        this.f124038OooO0o = z4;
        this.f124040OooO0oO = z5;
        this.f124041OooO0oo = i3;
        this.f124033OooO = i4;
        this.f124042OooOO0 = z6;
        this.f124043OooOO0O = z7;
        this.f124044OooOO0o = z8;
        this.f124045OooOOO0 = str;
    }

    public final String toString() {
        String str = this.f124045OooOOO0;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f124034OooO00o) {
            sb.append("no-cache, ");
        }
        if (this.f124035OooO0O0) {
            sb.append("no-store, ");
        }
        int i = this.f124036OooO0OO;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f124037OooO0Oo;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f124039OooO0o0) {
            sb.append("private, ");
        }
        if (this.f124038OooO0o) {
            sb.append("public, ");
        }
        if (this.f124040OooO0oO) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f124041OooO0oo;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f124033OooO;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f124042OooOO0) {
            sb.append("only-if-cached, ");
        }
        if (this.f124043OooOO0O) {
            sb.append("no-transform, ");
        }
        if (this.f124044OooOO0o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        this.f124045OooOOO0 = string;
        return string;
    }
}
