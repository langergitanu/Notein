package com.google.firebase.sessions;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import o0Ooo0oO.C29437OooOO0O;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O.C33549OooO00o;
import oO0o0O.EnumC33551OooO0OO;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;

/* JADX INFO: loaded from: classes8.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B3\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b+\u0010\u001c¨\u0006."}, m80612d2 = {"Lcom/google/firebase/sessions/Time;", "", "", TranslateLanguage.MALAY, "<init>", "(J)V", "", "seen0", "us", "seconds", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(IJJJLoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/Time;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "time", "LoO0o0O/OooO00o;", "minus-5sfh64U", "(Lcom/google/firebase/sessions/Time;)J", "minus", "component1", "()J", "copy", "(J)Lcom/google/firebase/sessions/Time;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMs", "getUs", "getSeconds", "Companion", "$serializer", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final /* data */ class Time {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long ms;
    private final long seconds;
    private final long us;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/sessions/Time$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/sessions/Time;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC33911OooO0OO<Time> serializer() {
            return Time$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }
    }

    public /* synthetic */ Time(int i, long j, long j2, long j3, o000000O o000000o2) {
        if (1 != (i & 1)) {
            C24242OooOOo.OooO0O0(i, 1, Time$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.ms = j;
        this.us = (i & 2) == 0 ? ((long) 1000) * j : j2;
        if ((i & 4) == 0) {
            this.seconds = j / ((long) 1000);
        } else {
            this.seconds = j3;
        }
    }

    public static /* synthetic */ Time copy$default(Time time, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = time.ms;
        }
        return time.copy(j);
    }

    public static final /* synthetic */ void write$Self$com_google_firebase_firebase_sessions(Time self, oO0oO000.OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        output.OooOo0O(serialDesc, 0, self.ms);
        if (output.OooOoO0(serialDesc) || self.us != self.ms * ((long) 1000)) {
            output.OooOo0O(serialDesc, 1, self.us);
        }
        if (!output.OooOoO0(serialDesc) && self.seconds == self.ms / ((long) 1000)) {
            return;
        }
        output.OooOo0O(serialDesc, 2, self.seconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMs() {
        return this.ms;
    }

    public final Time copy(long ms) {
        return new Time(ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Time) && this.ms == ((Time) other).ms;
    }

    public final long getMs() {
        return this.ms;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final long getUs() {
        return this.us;
    }

    public int hashCode() {
        return Long.hashCode(this.ms);
    }

    /* JADX INFO: renamed from: minus-5sfh64U, reason: not valid java name */
    public final long m80696minus5sfh64U(Time time) {
        OooOOO0.OooO0oO(time, "time");
        int i = C33549OooO00o.f121147OooOoO;
        return C29437OooOO0O.OooO0oO(this.ms - time.ms, EnumC33551OooO0OO.f121153OooOoO0);
    }

    public String toString() {
        return "Time(ms=" + this.ms + ')';
    }

    public Time(long j) {
        this.ms = j;
        long j2 = 1000;
        this.us = j * j2;
        this.seconds = j / j2;
    }
}
