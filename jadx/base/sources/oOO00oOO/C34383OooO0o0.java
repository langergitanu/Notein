package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34383OooO0o0 implements InterfaceC35214OooO0o<ResponseBody, Double> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34383OooO0o0 f123386OooO00o = new C34383OooO0o0();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Double convert(ResponseBody responseBody) throws IOException {
        return Double.valueOf(responseBody.string());
    }
}
