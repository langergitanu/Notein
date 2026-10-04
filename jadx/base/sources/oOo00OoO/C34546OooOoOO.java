package oOo00OoO;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: oOo00OoO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34546OooOoOO extends C34523OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Socket f123789OooO00o;

    public C34546OooOoOO(Socket socket) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(socket, "socket");
        this.f123789OooO00o = socket;
    }

    @Override // oOo00OoO.C34523OooO0OO
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // oOo00OoO.C34523OooO0OO
    public final void timedOut() {
        Socket socket = this.f123789OooO00o;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!C34535OooOOOo.OooO0OO(e)) {
                throw e;
            }
            C34537OooOOo0.f123760OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            C34537OooOOo0.f123760OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
