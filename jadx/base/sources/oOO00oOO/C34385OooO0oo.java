package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34385OooO0oo implements InterfaceC35214OooO0o<ResponseBody, Long> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34385OooO0oo f123388OooO00o = new C34385OooO0oo();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Long convert(ResponseBody responseBody) throws IOException {
        return Long.valueOf(responseBody.string());
    }
}
