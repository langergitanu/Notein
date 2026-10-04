package ooooOOo0;

import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: renamed from: ooooOOo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC35211OooO0O0<T> extends Cloneable {
    void OooOOo0(InterfaceC35213OooO0Oo<T> interfaceC35213OooO0Oo);

    void cancel();

    /* JADX INFO: renamed from: clone */
    InterfaceC35211OooO0O0<T> mo80774clone();

    C35238OooOoO<T> execute() throws IOException;

    boolean isCanceled();

    Request request();
}
