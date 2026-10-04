package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34380OooO0O0 implements InterfaceC35214OooO0o<ResponseBody, Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34380OooO0O0 f123382OooO00o = new C34380OooO0O0();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Boolean convert(ResponseBody responseBody) throws IOException {
        return Boolean.valueOf(responseBody.string());
    }
}
