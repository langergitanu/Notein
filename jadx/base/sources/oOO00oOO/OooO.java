package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC35214OooO0o<ResponseBody, Short> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f123379OooO00o = new OooO();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Short convert(ResponseBody responseBody) throws IOException {
        return Short.valueOf(responseBody.string());
    }
}
