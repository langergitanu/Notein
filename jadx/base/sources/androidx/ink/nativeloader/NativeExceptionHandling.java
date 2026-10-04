package androidx.ink.nativeloader;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000OOoO.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
@UsedByNative
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m80612d2 = {"Landroidx/ink/nativeloader/NativeExceptionHandling;", "", "<init>", "()V", "", HiAnalyticsConstant.HaKey.BI_KEY_RESULT, "", "statusMessage", "LoO00ooO/OooOooO;", "throwForNonOkStatus", "(ILjava/lang/String;)V", "ink-nativeloader"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NativeExceptionHandling {
    static {
        new NativeExceptionHandling();
    }

    @UsedByNative
    public static final void throwForNonOkStatus(int statusCode, String statusMessage) {
        OooOOO0.OooO0oO(statusMessage, "statusMessage");
        int i = OooO0OO.f82891OooO00o;
        if (statusCode == OooO0OO.f82891OooO00o) {
            throw new IllegalStateException("Attempting to throw an exception from status, but status is OK.");
        }
        if (statusCode == OooO0OO.f82892OooO0O0) {
            throw new IllegalStateException(statusMessage);
        }
        if (statusCode == OooO0OO.f82893OooO0OO) {
            throw new IllegalArgumentException(statusMessage);
        }
        if (statusCode == OooO0OO.f82894OooO0Oo) {
            throw new NoSuchElementException(statusMessage);
        }
        if (statusCode == OooO0OO.f82896OooO0o0) {
            throw new IndexOutOfBoundsException(statusMessage);
        }
        if (statusCode != OooO0OO.f82895OooO0o) {
            throw new RuntimeException(statusMessage);
        }
        throw new UnsupportedOperationException(statusMessage);
    }
}
