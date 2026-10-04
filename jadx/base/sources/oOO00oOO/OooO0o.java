package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements InterfaceC35214OooO0o<ResponseBody, Float> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f123385OooO00o = new OooO0o();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Float convert(ResponseBody responseBody) throws IOException {
        return Float.valueOf(responseBody.string());
    }
}
