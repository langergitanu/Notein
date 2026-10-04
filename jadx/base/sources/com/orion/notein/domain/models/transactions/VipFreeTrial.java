package com.orion.notein.domain.models.transactions;

import OooOO0.OooO0OO;
import com.aspose.slides.C22227OoooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.UserAccountInfo;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0000Ooo.C24242OooOOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO000.OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%JB\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010 J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010%¨\u00067"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/VipFreeTrial;", "", "", "accountId", UserAccountInfo.TAG_ACCOUNT_TYPE, "startTime", "endTime", "", "lastFetchTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLoO0oO00/o000000O;)V", "dateTimeString", "convertToMillis", "(Ljava/lang/String;)J", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/transactions/VipFreeTrial;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "", "isOnFreeTrial", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/transactions/VipFreeTrial;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountId", "getAccountType", "getStartTime", "getEndTime", "J", "getLastFetchTime", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class VipFreeTrial {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final String accountType;
    private final String endTime;
    private final long lastFetchTime;
    private final String startTime;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/VipFreeTrial$Companion;", "", "<init>", "()V", "LoO0o0ooO/OooO0OO;", "Lcom/orion/notein/domain/models/transactions/VipFreeTrial;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC33911OooO0OO<VipFreeTrial> serializer() {
            return VipFreeTrial$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }
    }

    public /* synthetic */ VipFreeTrial(int i, String str, String str2, String str3, String str4, long j, o000000O o000000o2) {
        if (15 != (i & 15)) {
            C24242OooOOo.OooO0O0(i, 15, VipFreeTrial$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.accountId = str;
        this.accountType = str2;
        this.startTime = str3;
        this.endTime = str4;
        if ((i & 16) == 0) {
            this.lastFetchTime = 0L;
        } else {
            this.lastFetchTime = j;
        }
    }

    private final long convertToMillis(String dateTimeString) {
        try {
            return Instant.parse(dateTimeString + "Z").toEpochMilli();
        } catch (DateTimeParseException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "GoogleFreeTrialVO", "convertToMillis: failed to parse time string: ", dateTimeString, ". ");
            sbOooO00o.append(e);
            c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
            return 0L;
        }
    }

    public static /* synthetic */ VipFreeTrial copy$default(VipFreeTrial vipFreeTrial, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipFreeTrial.accountId;
        }
        if ((i & 2) != 0) {
            str2 = vipFreeTrial.accountType;
        }
        if ((i & 4) != 0) {
            str3 = vipFreeTrial.startTime;
        }
        if ((i & 8) != 0) {
            str4 = vipFreeTrial.endTime;
        }
        if ((i & 16) != 0) {
            j = vipFreeTrial.lastFetchTime;
        }
        long j2 = j;
        return vipFreeTrial.copy(str, str2, str3, str4, j2);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(VipFreeTrial self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        output.OooOO0o(serialDesc, 0, self.accountId);
        output.OooOO0o(serialDesc, 1, self.accountType);
        output.OooOO0o(serialDesc, 2, self.startTime);
        output.OooOO0o(serialDesc, 3, self.endTime);
        if (!output.OooOoO0(serialDesc) && self.lastFetchTime == 0) {
            return;
        }
        output.OooOo0O(serialDesc, 4, self.lastFetchTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastFetchTime() {
        return this.lastFetchTime;
    }

    public final VipFreeTrial copy(String accountId, String accountType, String startTime, String endTime, long lastFetchTime) {
        OooOOO0.OooO0oO(accountId, "accountId");
        OooOOO0.OooO0oO(accountType, "accountType");
        OooOOO0.OooO0oO(startTime, "startTime");
        OooOOO0.OooO0oO(endTime, "endTime");
        return new VipFreeTrial(accountId, accountType, startTime, endTime, lastFetchTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipFreeTrial)) {
            return false;
        }
        VipFreeTrial vipFreeTrial = (VipFreeTrial) other;
        return OooOOO0.OooO0O0(this.accountId, vipFreeTrial.accountId) && OooOOO0.OooO0O0(this.accountType, vipFreeTrial.accountType) && OooOOO0.OooO0O0(this.startTime, vipFreeTrial.startTime) && OooOOO0.OooO0O0(this.endTime, vipFreeTrial.endTime) && this.lastFetchTime == vipFreeTrial.lastFetchTime;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountType() {
        return this.accountType;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final long getLastFetchTime() {
        return this.lastFetchTime;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Long.hashCode(this.lastFetchTime) + OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(this.accountId.hashCode() * 31, 31, this.accountType), 31, this.startTime), 31, this.endTime);
    }

    public final boolean isOnFreeTrial() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.startTime;
        if (str != null) {
            long jConvertToMillis = convertToMillis(str);
            String str2 = this.endTime;
            if (str2 != null) {
                long jConvertToMillis2 = convertToMillis(str2);
                if (jConvertToMillis <= jCurrentTimeMillis && jCurrentTimeMillis < jConvertToMillis2) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String str = this.accountId;
        String str2 = this.accountType;
        String str3 = this.startTime;
        String str4 = this.endTime;
        long j = this.lastFetchTime;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("VipFreeTrial(accountId=", str, ", accountType=", str2, ", startTime=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", endTime=", str4, ", lastFetchTime=");
        return android.support.v4.media.session.OooO00o.OooO00o(j, ")", sbOooO0O0);
    }

    public VipFreeTrial(String accountId, String accountType, String startTime, String endTime, long j) {
        OooOOO0.OooO0oO(accountId, "accountId");
        OooOOO0.OooO0oO(accountType, "accountType");
        OooOOO0.OooO0oO(startTime, "startTime");
        OooOOO0.OooO0oO(endTime, "endTime");
        this.accountId = accountId;
        this.accountType = accountType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.lastFetchTime = j;
    }

    public /* synthetic */ VipFreeTrial(String str, String str2, String str3, String str4, long j, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, str4, (i & 16) != 0 ? 0L : j);
    }
}
