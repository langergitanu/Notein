package oO00Oo00;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public class OooO0O0 extends MalformedInputException {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f115973OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(String message) {
        super(0);
        OooOOO0.OooO0oO(message, "message");
        this.f115973OooOo0o = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f115973OooOo0o;
    }
}
