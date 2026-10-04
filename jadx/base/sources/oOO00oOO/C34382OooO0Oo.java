package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34382OooO0Oo implements InterfaceC35214OooO0o<ResponseBody, Character> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34382OooO0Oo f123384OooO00o = new C34382OooO0Oo();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Character convert(ResponseBody responseBody) throws IOException {
        String strString = responseBody.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
