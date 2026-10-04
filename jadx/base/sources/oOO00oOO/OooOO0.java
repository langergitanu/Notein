package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 implements InterfaceC35214OooO0o<ResponseBody, String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f123389OooO00o = new OooOO0();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final String convert(ResponseBody responseBody) throws IOException {
        return responseBody.string();
    }
}
