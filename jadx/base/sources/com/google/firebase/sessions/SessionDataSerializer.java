package com.google.firebase.sessions;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.C24249OooO0OO;
import o0000o0O.o00O0O;
import o00o00oo.C25298OooO0o;
import oO00ooO.C32460OooOooO;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oOo00O0O.AbstractC34457OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m80612d2 = {"Lcom/google/firebase/sessions/SessionDataSerializer;", "Lo0000o0O/o00O0O;", "Lcom/google/firebase/sessions/SessionData;", "Lcom/google/firebase/sessions/SessionGenerator;", "sessionGenerator", "<init>", "(Lcom/google/firebase/sessions/SessionGenerator;)V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "LoO00ooO/OooOooO;", "writeTo", "(Lcom/google/firebase/sessions/SessionData;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/SessionGenerator;", "getDefaultValue", "()Lcom/google/firebase/sessions/SessionData;", "defaultValue", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SessionDataSerializer implements o00O0O<SessionData> {
    private final SessionGenerator sessionGenerator;

    public SessionDataSerializer(SessionGenerator sessionGenerator) {
        OooOOO0.OooO0oO(sessionGenerator, "sessionGenerator");
        this.sessionGenerator = sessionGenerator;
    }

    @Override // o0000o0O.o00O0O
    public Object readFrom(InputStream inputStream, Continuation<? super SessionData> continuation) throws C24249OooO0OO {
        try {
            AbstractC34457OooO0OO.OooO00o oooO00o = AbstractC34457OooO0OO.f123490OooO0Oo;
            String str = new String(C25298OooO0o.OooO0O0(inputStream), C33580OooO00o.f121231OooO0O0);
            oooO00o.getClass();
            return (SessionData) oooO00o.OooO0O0(str, SessionData.INSTANCE.serializer());
        } catch (Exception e) {
            throw new C24249OooO0OO("Cannot parse session data", e);
        }
    }

    @Override // o0000o0O.o00O0O
    public /* bridge */ /* synthetic */ Object writeTo(SessionData sessionData, OutputStream outputStream, Continuation continuation) {
        return writeTo2(sessionData, outputStream, (Continuation<? super C32460OooOooO>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o0000o0O.o00O0O
    public SessionData getDefaultValue() {
        return new SessionData(this.sessionGenerator.generateNewSession(null), (Time) null, (Map) null, 6, (C24018OooO0oo) null);
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public Object writeTo2(SessionData sessionData, OutputStream outputStream, Continuation<? super C32460OooOooO> continuation) throws IOException {
        outputStream.write(C33595OooOOo.OooOOOo(AbstractC34457OooO0OO.f123490OooO0Oo.OooO00o(SessionData.INSTANCE.serializer(), sessionData)));
        return C32460OooOooO.f116667OooO00o;
    }
}
