package oO0Ooo0O;

import com.aspose.words.ControlChar;
import oO0Oo0Oo.AbstractC33200OooO0OO;

/* JADX INFO: renamed from: oO0Ooo0O.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33426OoooOoO extends C33423OoooOOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f120833OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33426OoooOoO(AbstractC33200OooO0OO response, String cachedResponseText) {
        super(response, cachedResponseText);
        kotlin.jvm.internal.OooOOO0.OooO0oO(response, "response");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cachedResponseText, "cachedResponseText");
        this.f120833OooOo0o = "Server error(" + response.OooO00o().OooO0Oo().getMethod().f115542OooO00o + ControlChar.SPACE_CHAR + response.OooO00o().OooO0Oo().getUrl() + ": " + response.OooO0o() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f120833OooOo0o;
    }
}
