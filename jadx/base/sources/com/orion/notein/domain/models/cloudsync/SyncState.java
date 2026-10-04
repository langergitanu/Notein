package com.orion.notein.domain.models.cloudsync;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o000oooo.C24761OooO;
import o00Oo0oO.C25050OooO0O0;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001c¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncState;", "", "Lcom/orion/notein/domain/models/cloudsync/SyncPhase;", "phase", "", "sessionId", "<init>", "(Lcom/orion/notein/domain/models/cloudsync/SyncPhase;Ljava/lang/String;)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILcom/orion/notein/domain/models/cloudsync/SyncPhase;Ljava/lang/String;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/cloudsync/SyncState;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "next", "withPhase", "(Lcom/orion/notein/domain/models/cloudsync/SyncPhase;)Lcom/orion/notein/domain/models/cloudsync/SyncState;", "component1", "()Lcom/orion/notein/domain/models/cloudsync/SyncPhase;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/orion/notein/domain/models/cloudsync/SyncPhase;Ljava/lang/String;)Lcom/orion/notein/domain/models/cloudsync/SyncState;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/orion/notein/domain/models/cloudsync/SyncPhase;", "getPhase", "Ljava/lang/String;", "getSessionId", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SyncState {
    private final SyncPhase phase;
    private final String sessionId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33911OooO0OO<Object>[] $childSerializers = {C25050OooO0O0.OooO0Oo("com.orion.notein.domain.models.cloudsync.SyncPhase", SyncPhase.values()), null};

    @Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncState$Companion;", "", "<init>", "()V", "Lcom/orion/notein/domain/models/cloudsync/SyncState;", "empty", "()Lcom/orion/notein/domain/models/cloudsync/SyncState;", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final SyncState empty() {
            return new SyncState(SyncPhase.CLEAN, "");
        }

        public final InterfaceC33911OooO0OO<SyncState> serializer() {
            return SyncState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SyncState(int i, SyncPhase syncPhase, String str, o000000O o000000o2) {
        if (1 != (i & 1)) {
            C24242OooOOo.OooO0O0(i, 1, SyncState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.phase = syncPhase;
        if ((i & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str;
        }
    }

    public static /* synthetic */ SyncState copy$default(SyncState syncState, SyncPhase syncPhase, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            syncPhase = syncState.phase;
        }
        if ((i & 2) != 0) {
            str = syncState.sessionId;
        }
        return syncState.copy(syncPhase, str);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(SyncState self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        output.OooOoo0(serialDesc, 0, $childSerializers[0], self.phase);
        if (!output.OooOoO0(serialDesc) && OooOOO0.OooO0O0(self.sessionId, "")) {
            return;
        }
        output.OooOO0o(serialDesc, 1, self.sessionId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SyncPhase getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final SyncState copy(SyncPhase phase, String sessionId) {
        OooOOO0.OooO0oO(phase, "phase");
        OooOOO0.OooO0oO(sessionId, "sessionId");
        return new SyncState(phase, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncState)) {
            return false;
        }
        SyncState syncState = (SyncState) other;
        return this.phase == syncState.phase && OooOOO0.OooO0O0(this.sessionId, syncState.sessionId);
    }

    public final SyncPhase getPhase() {
        return this.phase;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.phase.hashCode() * 31);
    }

    public String toString() {
        return "SyncState(phase=" + this.phase + ", sessionId=" + this.sessionId + ")";
    }

    public final SyncState withPhase(SyncPhase next) {
        OooOOO0.OooO0oO(next, "next");
        String strOooO00o = next == SyncPhase.CLEAN ? "" : !C33599OooOo0O.Oooo0o0(this.sessionId) ? this.sessionId : C24761OooO.OooO00o("toString(...)");
        return (OooOOO0.OooO0O0(strOooO00o, this.sessionId) && next == this.phase) ? this : copy(next, strOooO00o);
    }

    public SyncState(SyncPhase phase, String sessionId) {
        OooOOO0.OooO0oO(phase, "phase");
        OooOOO0.OooO0oO(sessionId, "sessionId");
        this.phase = phase;
        this.sessionId = sessionId;
    }

    public /* synthetic */ SyncState(SyncPhase syncPhase, String str, int i, C24018OooO0oo c24018OooO0oo) {
        this(syncPhase, (i & 2) != 0 ? "" : str);
    }
}
