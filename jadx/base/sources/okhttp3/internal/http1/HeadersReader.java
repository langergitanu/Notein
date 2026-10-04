package okhttp3.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00OoO.C34542OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class HeadersReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34542OooOo0O f124458OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f124459OooO0O0;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m80612d2 = {"Lokhttp3/internal/http1/HeadersReader$Companion;", "", "()V", "HEADER_LIMIT", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public HeadersReader(C34542OooOo0O source) {
        OooOOO0.OooO0oO(source, "source");
        this.f124458OooO00o = source;
        this.f124459OooO0O0 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }
}
