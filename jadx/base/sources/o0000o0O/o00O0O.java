package o0000o0O;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public interface o00O0O<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, Continuation<? super T> continuation);

    Object writeTo(T t, OutputStream outputStream, Continuation<? super C32460OooOooO> continuation);
}
