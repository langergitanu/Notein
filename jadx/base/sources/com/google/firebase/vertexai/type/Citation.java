package com.google.firebase.vertexai.type;

import OooOooo.C20785Oooo00o;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33971OoooO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0015BI\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0016"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Citation;", "", NoteMeta.PROPERTY_TITLE, "", "startIndex", "", "endIndex", "uri", "license", "publicationDate", "Ljava/util/Calendar;", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/Calendar;)V", "getEndIndex", "()I", "getLicense", "()Ljava/lang/String;", "getPublicationDate", "()Ljava/util/Calendar;", "getStartIndex", "getTitle", "getUri", "Internal", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class Citation {
    private final int endIndex;
    private final String license;
    private final Calendar publicationDate;
    private final int startIndex;
    private final String title;
    private final String uri;

    @InterfaceC33908OooO
    @Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 72\u00020\u0001:\u0003879BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010 J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010%¨\u0006:"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Citation$Internal;", "", "", NoteMeta.PROPERTY_TITLE, "", "startIndex", "endIndex", "uri", "license", "Lcom/google/firebase/vertexai/type/Citation$Internal$Date;", "publicationDate", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Citation$Internal$Date;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Citation$Internal$Date;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Citation$Internal;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "Lcom/google/firebase/vertexai/type/Citation;", "toPublic$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/Citation;", "toPublic", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()Lcom/google/firebase/vertexai/type/Citation$Internal$Date;", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/google/firebase/vertexai/type/Citation$Internal$Date;)Lcom/google/firebase/vertexai/type/Citation$Internal;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getStartIndex", "getEndIndex", "getUri", "getLicense", "Lcom/google/firebase/vertexai/type/Citation$Internal$Date;", "getPublicationDate", "Companion", "$serializer", "Date", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final /* data */ class Internal {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int endIndex;
        private final String license;
        private final Date publicationDate;
        private final int startIndex;
        private final String title;
        private final String uri;

        @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Citation$Internal$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Citation$Internal;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                this();
            }

            public final InterfaceC33911OooO0OO<Internal> serializer() {
                return Citation$Internal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @InterfaceC33908OooO
        @Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J4\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0015¨\u0006)"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Citation$Internal$Date;", "", "", "year", "month", "day", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen1", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;LoO0oO00/o000000O;)V", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self", "(Lcom/google/firebase/vertexai/type/Citation$Internal$Date;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/google/firebase/vertexai/type/Citation$Internal$Date;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getYear", "getMonth", "getDay", "Companion", "$serializer", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
        public static final /* data */ class Date {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final Integer day;
            private final Integer month;
            private final Integer year;

            @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/Citation$Internal$Date$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/google/firebase/vertexai/type/Citation$Internal$Date;", "serializer", "()LoO0o0ooO/OooO0OO;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
                    this();
                }

                public final InterfaceC33911OooO0OO<Date> serializer() {
                    return Citation$Internal$Date$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Date() {
                this((Integer) null, (Integer) null, (Integer) null, 7, (C24018OooO0oo) null);
            }

            public static /* synthetic */ Date copy$default(Date date, Integer num, Integer num2, Integer num3, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = date.year;
                }
                if ((i & 2) != 0) {
                    num2 = date.month;
                }
                if ((i & 4) != 0) {
                    num3 = date.day;
                }
                return date.copy(num, num2, num3);
            }

            public static final /* synthetic */ void write$Self(Date self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
                if (output.OooOoO0(serialDesc) || self.year != null) {
                    output.OooOo(serialDesc, 0, C33971OoooO.f122193OooO00o, self.year);
                }
                if (output.OooOoO0(serialDesc) || self.month != null) {
                    output.OooOo(serialDesc, 1, C33971OoooO.f122193OooO00o, self.month);
                }
                if (!output.OooOoO0(serialDesc) && self.day == null) {
                    return;
                }
                output.OooOo(serialDesc, 2, C33971OoooO.f122193OooO00o, self.day);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Integer getYear() {
                return this.year;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Integer getMonth() {
                return this.month;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Integer getDay() {
                return this.day;
            }

            public final Date copy(Integer year, Integer month, Integer day) {
                return new Date(year, month, day);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Date)) {
                    return false;
                }
                Date date = (Date) other;
                return OooOOO0.OooO0O0(this.year, date.year) && OooOOO0.OooO0O0(this.month, date.month) && OooOOO0.OooO0O0(this.day, date.day);
            }

            public final Integer getDay() {
                return this.day;
            }

            public final Integer getMonth() {
                return this.month;
            }

            public final Integer getYear() {
                return this.year;
            }

            public int hashCode() {
                Integer num = this.year;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.month;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.day;
                return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
            }

            public String toString() {
                return "Date(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ')';
            }

            public /* synthetic */ Date(int i, Integer num, Integer num2, Integer num3, o000000O o000000o2) {
                if ((i & 1) == 0) {
                    this.year = null;
                } else {
                    this.year = num;
                }
                if ((i & 2) == 0) {
                    this.month = null;
                } else {
                    this.month = num2;
                }
                if ((i & 4) == 0) {
                    this.day = null;
                } else {
                    this.day = num3;
                }
            }

            public Date(Integer num, Integer num2, Integer num3) {
                this.year = num;
                this.month = num2;
                this.day = num3;
            }

            public /* synthetic */ Date(Integer num, Integer num2, Integer num3, int i, C24018OooO0oo c24018OooO0oo) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
            }
        }

        public /* synthetic */ Internal(int i, String str, int i2, int i3, String str2, String str3, Date date, o000000O o000000o2) {
            if (4 != (i & 4)) {
                C24242OooOOo.OooO0O0(i, 4, Citation$Internal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.startIndex = 0;
            } else {
                this.startIndex = i2;
            }
            this.endIndex = i3;
            if ((i & 8) == 0) {
                this.uri = null;
            } else {
                this.uri = str2;
            }
            if ((i & 16) == 0) {
                this.license = null;
            } else {
                this.license = str3;
            }
            if ((i & 32) == 0) {
                this.publicationDate = null;
            } else {
                this.publicationDate = date;
            }
        }

        public static /* synthetic */ Internal copy$default(Internal internal, String str, int i, int i2, String str2, String str3, Date date, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = internal.title;
            }
            if ((i3 & 2) != 0) {
                i = internal.startIndex;
            }
            if ((i3 & 4) != 0) {
                i2 = internal.endIndex;
            }
            if ((i3 & 8) != 0) {
                str2 = internal.uri;
            }
            if ((i3 & 16) != 0) {
                str3 = internal.license;
            }
            if ((i3 & 32) != 0) {
                date = internal.publicationDate;
            }
            String str4 = str3;
            Date date2 = date;
            return internal.copy(str, i, i2, str2, str4, date2);
        }

        public static final /* synthetic */ void write$Self(Internal self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
            if (output.OooOoO0(serialDesc) || self.title != null) {
                output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.title);
            }
            if (output.OooOoO0(serialDesc) || self.startIndex != 0) {
                output.OooOoOO(1, self.startIndex, serialDesc);
            }
            output.OooOoOO(2, self.endIndex, serialDesc);
            if (output.OooOoO0(serialDesc) || self.uri != null) {
                output.OooOo(serialDesc, 3, o00000OO.f122230OooO00o, self.uri);
            }
            if (output.OooOoO0(serialDesc) || self.license != null) {
                output.OooOo(serialDesc, 4, o00000OO.f122230OooO00o, self.license);
            }
            if (!output.OooOoO0(serialDesc) && self.publicationDate == null) {
                return;
            }
            output.OooOo(serialDesc, 5, Citation$Internal$Date$$serializer.INSTANCE, self.publicationDate);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStartIndex() {
            return this.startIndex;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEndIndex() {
            return this.endIndex;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLicense() {
            return this.license;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Date getPublicationDate() {
            return this.publicationDate;
        }

        public final Internal copy(String title, int startIndex, int endIndex, String uri, String license, Date publicationDate) {
            return new Internal(title, startIndex, endIndex, uri, license, publicationDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Internal)) {
                return false;
            }
            Internal internal = (Internal) other;
            return OooOOO0.OooO0O0(this.title, internal.title) && this.startIndex == internal.startIndex && this.endIndex == internal.endIndex && OooOOO0.OooO0O0(this.uri, internal.uri) && OooOOO0.OooO0O0(this.license, internal.license) && OooOOO0.OooO0O0(this.publicationDate, internal.publicationDate);
        }

        public final int getEndIndex() {
            return this.endIndex;
        }

        public final String getLicense() {
            return this.license;
        }

        public final Date getPublicationDate() {
            return this.publicationDate;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            String str = this.title;
            int iOooO00o = C20785Oooo00o.OooO00o(this.endIndex, C20785Oooo00o.OooO00o(this.startIndex, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
            String str2 = this.uri;
            int iHashCode = (iOooO00o + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.license;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            Date date = this.publicationDate;
            return iHashCode2 + (date != null ? date.hashCode() : 0);
        }

        public final Citation toPublic$com_google_firebase_firebase_vertexai() {
            Calendar calendar;
            Date date = this.publicationDate;
            if (date != null) {
                calendar = Calendar.getInstance();
                int iIntValue = 1;
                int iIntValue2 = (date.getYear() == null || date.getYear().intValue() < 1) ? 1 : date.getYear().intValue();
                int iIntValue3 = (date.getMonth() == null || date.getMonth().intValue() < 1) ? 0 : date.getMonth().intValue() - 1;
                if (date.getDay() != null && date.getDay().intValue() >= 1) {
                    iIntValue = date.getDay().intValue();
                }
                calendar.set(iIntValue2, iIntValue3, iIntValue);
            } else {
                calendar = null;
            }
            return new Citation(this.title, this.startIndex, this.endIndex, this.uri, this.license, calendar);
        }

        public String toString() {
            return "Internal(title=" + this.title + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", uri=" + this.uri + ", license=" + this.license + ", publicationDate=" + this.publicationDate + ')';
        }

        public Internal(String str, int i, int i2, String str2, String str3, Date date) {
            this.title = str;
            this.startIndex = i;
            this.endIndex = i2;
            this.uri = str2;
            this.license = str3;
            this.publicationDate = date;
        }

        public /* synthetic */ Internal(String str, int i, int i2, String str2, String str3, Date date, int i3, C24018OooO0oo c24018OooO0oo) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : date);
        }
    }

    public Citation(String str, int i, int i2, String str2, String str3, Calendar calendar) {
        this.title = str;
        this.startIndex = i;
        this.endIndex = i2;
        this.uri = str2;
        this.license = str3;
        this.publicationDate = calendar;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final String getLicense() {
        return this.license;
    }

    public final Calendar getPublicationDate() {
        return this.publicationDate;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public /* synthetic */ Citation(String str, int i, int i2, String str2, String str3, Calendar calendar, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : calendar);
    }
}
