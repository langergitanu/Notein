package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.C21532OooOOo;
import com.alipay.share.sdk.openapi.APMediaMessage;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.OooOOO0;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001+B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006,"}, m80612d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "", "seconds", "", "nanoseconds", "<init>", "(JI)V", "Ljava/util/Date;", "date", "(Ljava/util/Date;)V", "Ljava/time/Instant;", "time", "(Ljava/time/Instant;)V", "toDate", "()Ljava/util/Date;", "toInstant", "()Ljava/time/Instant;", "other", "compareTo", "(Lcom/google/firebase/Timestamp;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getSeconds", "()J", "I", "getNanoseconds", "Companion", "com.google.firebase-firebase-common"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel source) {
            OooOOO0.OooO0oO(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int size) {
            return new Timestamp[size];
        }
    };

    @Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m80612d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "LoO00ooO/OooOOO;", "", "", "toPreciseTime", "(Ljava/util/Date;)LoO00ooO/OooOOO;", "seconds", "nanoseconds", "LoO00ooO/OooOooO;", "validateRange", "(JI)V", "Lcom/google/firebase/Timestamp;", "now", "()Lcom/google/firebase/Timestamp;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "com.google.firebase-firebase-common"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C32443OooOOO<Long, Integer> toPreciseTime(Date date) {
            long j = 1000;
            long time = date.getTime() / j;
            int time2 = (int) ((date.getTime() % j) * ((long) 1000000));
            return time2 < 0 ? new C32443OooOOO<>(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new C32443OooOOO<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(nanoseconds, "Timestamp nanoseconds out of range: ").toString());
            }
            if (-62135596800L > seconds || seconds >= 253402300800L) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(seconds, "Timestamp seconds out of range: ").toString());
            }
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j, int i) {
        INSTANCE.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Timestamp) && compareTo((Timestamp) other) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    public final Instant toInstant() {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        OooOOO0.OooO0o(instantOfEpochSecond, "ofEpochSecond(...)");
        return instantOfEpochSecond;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.String] */
    public String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.seconds);
        sb.append(", nanoseconds=");
        int i = this.nanoseconds;
        return APMediaMessage.IMediaObject.type();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp other) {
        OooOOO0.OooO0oO(other, "other");
        InterfaceC32507OooOO0o[] interfaceC32507OooOO0oArr = {new C24028OooOoO0() { // from class: com.google.firebase.Timestamp.compareTo.1
            @Override // kotlin.jvm.internal.C24028OooOoO0, oOoo0.InterfaceC34603OooOOO
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new C24028OooOoO0() { // from class: com.google.firebase.Timestamp.compareTo.2
            @Override // kotlin.jvm.internal.C24028OooOoO0, oOoo0.InterfaceC34603OooOOO
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        for (int i = 0; i < 2; i++) {
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = interfaceC32507OooOO0oArr[i];
            int iOooO0O0 = C24536OooO0Oo.OooO0O0((Comparable) interfaceC32507OooOO0o.invoke(this), (Comparable) interfaceC32507OooOO0o.invoke(other));
            if (iOooO0O0 != 0) {
                return iOooO0O0;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Timestamp(Date date) {
        OooOOO0.OooO0oO(date, "date");
        Companion companion = INSTANCE;
        C32443OooOOO preciseTime = companion.toPreciseTime(date);
        long jLongValue = ((Number) preciseTime.f116638OooOo0o).longValue();
        int iIntValue = ((Number) preciseTime.f116637OooOo).intValue();
        companion.validateRange(jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(Instant time) {
        this(time.getEpochSecond(), time.getNano());
        OooOOO0.OooO0oO(time, "time");
    }
}
