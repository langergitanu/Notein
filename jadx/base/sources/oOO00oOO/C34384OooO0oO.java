package oOO00oOO;

import java.io.IOException;
import okhttp3.ResponseBody;
import ooooOOo0.InterfaceC35214OooO0o;

/* JADX INFO: renamed from: oOO00oOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34384OooO0oO implements InterfaceC35214OooO0o<ResponseBody, Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C34384OooO0oO f123387OooO00o = new C34384OooO0oO();

    @Override // ooooOOo0.InterfaceC35214OooO0o
    public final Integer convert(ResponseBody responseBody) throws IOException {
        return Integer.valueOf(responseBody.string());
    }
}
