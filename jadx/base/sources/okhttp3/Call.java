package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/Call;", "", "Factory", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public interface Call extends Cloneable {

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/Call$Factory;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public interface Factory {
        RealCall OooO00o(Request request);
    }

    void cancel();

    Response execute() throws IOException;

    /* JADX INFO: renamed from: isCanceled */
    boolean getF124390Oooo0o0();

    void o0000O0O(Callback callback);

    /* JADX INFO: renamed from: request */
    Request getF124374OooOo();
}
