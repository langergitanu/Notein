package com.google.firebase.sessions.settings;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000o0O.C24249OooO0OO;
import o0000o0O.o00O0O;
import o00o00oo.C25298OooO0o;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m80612d2 = {"Lcom/google/firebase/sessions/settings/SessionConfigsSerializer;", "Lo0000o0O/o00O0O;", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "LoO00ooO/OooOooO;", "writeTo", "(Lcom/google/firebase/sessions/settings/SessionConfigs;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultValue", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "getDefaultValue", "()Lcom/google/firebase/sessions/settings/SessionConfigs;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SessionConfigsSerializer implements o00O0O<SessionConfigs> {
    public static final SessionConfigsSerializer INSTANCE = new SessionConfigsSerializer();
    private static final SessionConfigs defaultValue = new SessionConfigs(null, null, null, null, null);

    private SessionConfigsSerializer() {
    }

    @Override // o0000o0O.o00O0O
    public Object readFrom(InputStream inputStream, Continuation<? super SessionConfigs> continuation) throws C24249OooO0OO {
        try {
            AbstractC34457OooO0OO.OooO00o oooO00o = AbstractC34457OooO0OO.f123490OooO0Oo;
            String str = new String(C25298OooO0o.OooO0O0(inputStream), C33580OooO00o.f121231OooO0O0);
            oooO00o.getClass();
            return (SessionConfigs) oooO00o.OooO0O0(str, SessionConfigs.INSTANCE.serializer());
        } catch (Exception e) {
            throw new C24249OooO0OO("Cannot parse session configs", e);
        }
    }

    @Override // o0000o0O.o00O0O
    public /* bridge */ /* synthetic */ Object writeTo(SessionConfigs sessionConfigs, OutputStream outputStream, Continuation continuation) {
        return writeTo2(sessionConfigs, outputStream, (Continuation<? super C32460OooOooO>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o0000o0O.o00O0O
    public SessionConfigs getDefaultValue() {
        return defaultValue;
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(SessionConfigs sessionConfigs, OutputStream outputStream, Continuation<? super C32460OooOooO> continuation) throws IOException {
        outputStream.write(C33595OooOOo.OooOOOo(AbstractC34457OooO0OO.f123490OooO0Oo.OooO00o(SessionConfigs.INSTANCE.serializer(), sessionConfigs)));
        return C32460OooOooO.f116667OooO00o;
    }
}
