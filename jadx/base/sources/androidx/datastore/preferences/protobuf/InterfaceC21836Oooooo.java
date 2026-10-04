package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21836Oooooo<T> {
    int OooO00o(OooO00o oooO00o);

    void OooO0O0(Object obj, OooOO0O oooOO0O, C21796OooOOOo c21796OooOOOo) throws IOException;

    void OooO0OO(T t, InterfaceC21846o0ooOO0 interfaceC21846o0ooOO0) throws IOException;

    boolean OooO0Oo(OooOo oooOo, OooOo oooOo2);

    int OooO0o0(OooOo oooOo);

    boolean isInitialized(T t);

    void makeImmutable(T t);

    void mergeFrom(T t, T t2);

    T newInstance();
}
