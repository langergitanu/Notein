package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34381OooO0OO implements InterfaceC35214OooO0o<ResponseBody, Byte> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34381OooO0OO f123383OooO00o = new C34381OooO0OO();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Byte convert(ResponseBody responseBody) throws IOException {
        return Byte.valueOf(responseBody.string());
    }
}
