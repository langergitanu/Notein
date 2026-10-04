package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m80612d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RouteException extends RuntimeException {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public IOException f124421OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final IOException f124422OooOo0o;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f124422OooOo0o = iOException;
        this.f124421OooOo = iOException;
    }
}
