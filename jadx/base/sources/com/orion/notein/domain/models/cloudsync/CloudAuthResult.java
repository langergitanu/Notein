package com.orion.notein.domain.models.cloudsync;

import android.content.Intent;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult;", "", "<init>", "()V", "Success", "RequiresUserAction", "Failure", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult$Failure;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult$RequiresUserAction;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult$Success;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class CloudAuthResult {

    @Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult$Failure;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult;", "errorCode", "", "message", "throwable", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getErrorCode", "()Ljava/lang/String;", "getMessage", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class Failure extends CloudAuthResult {
        private final String errorCode;
        private final String message;
        private final Throwable throwable;

        public Failure() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = failure.message;
            }
            if ((i & 4) != 0) {
                th = failure.throwable;
            }
            return failure.copy(str, str2, th);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(String errorCode, String message, Throwable throwable) {
            return new Failure(errorCode, message, throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return OooOOO0.OooO0O0(this.errorCode, failure.errorCode) && OooOOO0.OooO0O0(this.message, failure.message) && OooOOO0.OooO0O0(this.throwable, failure.throwable);
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            String str = this.errorCode;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Throwable th = this.throwable;
            return iHashCode2 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            String str = this.errorCode;
            String str2 = this.message;
            Throwable th = this.throwable;
            StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Failure(errorCode=", str, ", message=", str2, ", throwable=");
            sbOooO0O0.append(th);
            sbOooO0O0.append(")");
            return sbOooO0O0.toString();
        }

        public /* synthetic */ Failure(String str, String str2, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
        }

        public Failure(String str, String str2, Throwable th) {
            super(null);
            this.errorCode = str;
            this.message = str2;
            this.throwable = th;
        }
    }

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult$RequiresUserAction;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "<init>", "(Landroid/content/Intent;)V", "getIntent", "()Landroid/content/Intent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class RequiresUserAction extends CloudAuthResult {
        private final Intent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiresUserAction(Intent intent) {
            super(null);
            OooOOO0.OooO0oO(intent, "intent");
            this.intent = intent;
        }

        public static /* synthetic */ RequiresUserAction copy$default(RequiresUserAction requiresUserAction, Intent intent, int i, Object obj) {
            if ((i & 1) != 0) {
                intent = requiresUserAction.intent;
            }
            return requiresUserAction.copy(intent);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        public final RequiresUserAction copy(Intent intent) {
            OooOOO0.OooO0oO(intent, "intent");
            return new RequiresUserAction(intent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequiresUserAction) && OooOOO0.OooO0O0(this.intent, ((RequiresUserAction) other).intent);
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        public String toString() {
            return "RequiresUserAction(intent=" + this.intent + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult$Success;", "Lcom/orion/notein/domain/models/cloudsync/CloudAuthResult;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Success extends CloudAuthResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ CloudAuthResult(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    private CloudAuthResult() {
    }
}
