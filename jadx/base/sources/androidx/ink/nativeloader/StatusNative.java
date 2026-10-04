package androidx.ink.nativeloader;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import o000OOoO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\n\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u000b\u0010\u0006J\u0010\u0010\r\u001a\u00020\fH\u0087 ¢\u0006\u0004\b\r\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0013\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0014\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0015\u0010\u0011J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0087 ¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m80612d2 = {"Landroidx/ink/nativeloader/StatusNative;", "", "<init>", "()V", "", "statusCodeOk", "()I", "statusCodeFailedPrecondition", "statusCodeInvalidArgument", "statusCodeNotFound", "statusCodeOutOfRange", "statusCodeUnimplemented", "LoO00ooO/OooOooO;", "throwExceptionFromOkStatusForTesting", "", "message", "throwExceptionFromFailedPreconditionForTesting", "(Ljava/lang/String;)V", "throwExceptionFromInvalidArgumentForTesting", "throwExceptionFromNotFoundForTesting", "throwExceptionFromOutOfRangeForTesting", "throwExceptionFromUnimplementedForTesting", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "throwExceptionFromUnknownStatusCodeForTesting", "(ILjava/lang/String;)V", "ink-nativeloader"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class StatusNative {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StatusNative f65443OooO00o = new StatusNative();

    static {
        OooO00o.f82887OooO00o.OooO00o();
    }

    @UsedByNative
    public final native int statusCodeFailedPrecondition();

    @UsedByNative
    public final native int statusCodeInvalidArgument();

    @UsedByNative
    public final native int statusCodeNotFound();

    @UsedByNative
    public final native int statusCodeOk();

    @UsedByNative
    public final native int statusCodeOutOfRange();

    @UsedByNative
    public final native int statusCodeUnimplemented();

    @UsedByNative
    public final native void throwExceptionFromFailedPreconditionForTesting(String message);

    @UsedByNative
    public final native void throwExceptionFromInvalidArgumentForTesting(String message);

    @UsedByNative
    public final native void throwExceptionFromNotFoundForTesting(String message);

    @UsedByNative
    public final native void throwExceptionFromOkStatusForTesting();

    @UsedByNative
    public final native void throwExceptionFromOutOfRangeForTesting(String message);

    @UsedByNative
    public final native void throwExceptionFromUnimplementedForTesting(String message);

    @UsedByNative
    public final native void throwExceptionFromUnknownStatusCodeForTesting(int statusCode, String message);
}
