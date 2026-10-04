package okhttp3.internal.p621ws;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"okhttp3/internal/ws/RealWebSocket$connect$1", "Lokhttp3/Callback;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RealWebSocket$connect$1 implements Callback {
    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        OooOOO0.OooO0oO(call, "call");
        throw null;
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        OooOOO0.OooO0oO(call, "call");
        Exchange exchange = response.f124266Oooo0;
        throw null;
    }
}
