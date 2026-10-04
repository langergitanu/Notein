package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C16342a;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a */
    private final Throwable f51400a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i, Throwable th) {
        super(new Status(i, "Integrity API error (" + i + "): " + C16342a.m74980a(i) + "."));
        Locale locale = Locale.ROOT;
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f51400a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f51400a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
