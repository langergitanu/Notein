package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C16343b;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class StandardIntegrityException extends ApiException {

    /* JADX INFO: renamed from: a */
    private final Throwable f51401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardIntegrityException(int i, Throwable th) {
        super(new Status(i, "Standard Integrity API error (" + i + "): " + C16343b.m74981a(i) + "."));
        Locale locale = Locale.ROOT;
        if (i == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f51401a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f51401a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
