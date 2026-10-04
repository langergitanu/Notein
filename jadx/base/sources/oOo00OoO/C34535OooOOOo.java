package oOo00OoO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oOo00OoO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34535OooOOOo {
    public static final C34540OooOo0 OooO00o(InterfaceC34544OooOoO interfaceC34544OooOoO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34544OooOoO, "<this>");
        return new C34540OooOo0(interfaceC34544OooOoO);
    }

    public static final C34542OooOo0O OooO0O0(InterfaceC34548OooOoo0 interfaceC34548OooOoo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34548OooOoo0, "<this>");
        return new C34542OooOo0O(interfaceC34548OooOoo0);
    }

    public static final boolean OooO0OO(AssertionError assertionError) {
        Logger logger = C34537OooOOo0.f123760OooO00o;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? C33599OooOo0O.OooOoOO(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    public static final InterfaceC34544OooOoO OooO0Oo(Socket socket) throws IOException {
        Logger logger = C34537OooOOo0.f123760OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(socket, "<this>");
        C34546OooOoOO c34546OooOoOO = new C34546OooOoOO(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.OooOOO0.OooO0o(outputStream, "getOutputStream()");
        return c34546OooOoOO.sink(new C34538OooOOoo(outputStream, c34546OooOoOO));
    }

    public static final C34534OooOOOO OooO0o(InputStream inputStream) {
        Logger logger = C34537OooOOo0.f123760OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(inputStream, "<this>");
        return new C34534OooOOOO(inputStream, new C34547OooOoo());
    }

    public static final C34534OooOOOO OooO0o0(File file) throws FileNotFoundException {
        Logger logger = C34537OooOOo0.f123760OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(file, "<this>");
        return new C34534OooOOOO(new FileInputStream(file), C34547OooOoo.NONE);
    }

    public static final InterfaceC34548OooOoo0 OooO0oO(Socket socket) throws IOException {
        Logger logger = C34537OooOOo0.f123760OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(socket, "<this>");
        C34546OooOoOO c34546OooOoOO = new C34546OooOoOO(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.OooOOO0.OooO0o(inputStream, "getInputStream()");
        return c34546OooOoOO.source(new C34534OooOOOO(inputStream, c34546OooOoOO));
    }
}
