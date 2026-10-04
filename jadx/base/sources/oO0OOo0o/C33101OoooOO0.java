package oO0OOo0o;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.protobuf.MessageLite;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.network.embedded.C18437z2;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import oO000Ooo.C32079OooO00o;
import oO000Ooo.C32080OooO0O0;

/* JADX INFO: renamed from: oO0OOo0o.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33101OoooOO0<ReqT, RespT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f119666OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f119667OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f119668OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0<ReqT> f119669OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f119670OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0<RespT> f119671OooO0o0;

    /* JADX INFO: renamed from: oO0OOo0o.OoooOO0$OooO00o */
    public static final class OooO00o<ReqT, RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C32080OooO0O0.OooO00o f119672OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C32080OooO0O0.OooO00o f119673OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO0OO f119674OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f119675OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f119676OooO0o0;

        public final C33101OoooOO0<ReqT, RespT> OooO00o() {
            return new C33101OoooOO0<>(this.f119674OooO0OO, this.f119675OooO0Oo, this.f119672OooO00o, this.f119673OooO0O0, this.f119676OooO0o0);
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OoooOO0$OooO0O0 */
    public interface OooO0O0<T> {
        C32079OooO00o OooO00o(Object obj);

        MessageLite OooO0O0(InputStream inputStream);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: oO0OOo0o.OoooOO0$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f119677OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f119678OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f119679OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0OO f119680OooOoO0;

        static {
            OooO0OO oooO0OO = new OooO0OO("UNARY", 0);
            f119678OooOo0o = oooO0OO;
            OooO0OO oooO0OO2 = new OooO0OO("CLIENT_STREAMING", 1);
            OooO0OO oooO0OO3 = new OooO0OO("SERVER_STREAMING", 2);
            f119677OooOo = oooO0OO3;
            OooO0OO oooO0OO4 = new OooO0OO("BIDI_STREAMING", 3);
            f119680OooOoO0 = oooO0OO4;
            f119679OooOoO = new OooO0OO[]{oooO0OO, oooO0OO2, oooO0OO3, oooO0OO4, new OooO0OO(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4)};
        }

        public OooO0OO() {
            throw null;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f119679OooOoO.clone();
        }
    }

    public C33101OoooOO0() {
        throw null;
    }

    public C33101OoooOO0(OooO0OO oooO0OO, String str, C32080OooO0O0.OooO00o oooO00o, C32080OooO0O0.OooO00o oooO00o2, boolean z) {
        new AtomicReferenceArray(2);
        this.f119666OooO00o = (OooO0OO) Preconditions.checkNotNull(oooO0OO, C18437z2.f56754h);
        this.f119667OooO0O0 = (String) Preconditions.checkNotNull(str, "fullMethodName");
        int iLastIndexOf = ((String) Preconditions.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        this.f119668OooO0OO = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        this.f119669OooO0Oo = (OooO0O0) Preconditions.checkNotNull(oooO00o, "requestMarshaller");
        this.f119671OooO0o0 = (OooO0O0) Preconditions.checkNotNull(oooO00o2, "responseMarshaller");
        this.f119670OooO0o = z;
    }

    public static String OooO00o(String str, String str2) {
        return ((String) Preconditions.checkNotNull(str, "fullServiceName")) + "/" + ((String) Preconditions.checkNotNull(str2, "methodName"));
    }

    public static <ReqT, RespT> OooO00o<ReqT, RespT> OooO0O0() {
        OooO00o<ReqT, RespT> oooO00o = new OooO00o<>();
        oooO00o.f119672OooO00o = null;
        oooO00o.f119673OooO0O0 = null;
        return oooO00o;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("fullMethodName", this.f119667OooO0O0).add(C18437z2.f56754h, this.f119666OooO00o).add("idempotent", false).add("safe", false).add("sampledToLocalTracing", this.f119670OooO0o).add("requestMarshaller", this.f119669OooO0Oo).add("responseMarshaller", this.f119671OooO0o0).add("schemaDescriptor", (Object) null).omitNullValues().toString();
    }
}
