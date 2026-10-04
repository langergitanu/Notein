package oOO00oOO;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34379OooO00o<T> implements InterfaceC35214OooO0o<T, RequestBody> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34379OooO00o<Object> f123380OooO00o = new C34379OooO00o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final MediaType f123381OooO0O0;

    static {
        MediaType.f124148OooO0o0.getClass();
        f123381OooO0O0 = MediaType.Companion.OooO00o("text/plain; charset=UTF-8");
    }

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final RequestBody convert(Object obj) throws IOException {
        return RequestBody.create(f123381OooO0O0, String.valueOf(obj));
    }
}
