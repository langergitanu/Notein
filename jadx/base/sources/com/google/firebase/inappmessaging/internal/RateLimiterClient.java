package com.google.firebase.inappmessaging.internal;

import androidx.core.view.C21714Oooo00O;
import com.google.firebase.inappmessaging.internal.RateLimitProto;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.RateLimit;
import com.google.firebase.inappmessaging.internal.time.Clock;
import o0Oo0oOo.o00Oo0;
import oO00o0.OooO00o;
import oO00o00o.InterfaceC32329OooO00o;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o00o.InterfaceC32332OooO0Oo;
import oO00o0OO.C32349OooO0Oo;
import oO00o0OO.C32351OooO0o0;
import oO00o0OO.C32352OooO0oO;
import oO00o0OO.C32356OooOO0o;
import oO00o0OO.C32357OooOOO;
import oO00o0OO.C32358OooOOO0;
import oO00o0OO.C32362OooOOo0;
import oO00o0OO.C32363OooOOoo;
import oO0OOOoO.C33014OooO0o0;
import oO0OOOoO.C33016OooO0oo;
import oO0OOOoO.C33017OooOO0;
import oO0OOOoO.C33018OooOO0O;
import oO0OOOoO.C33020OooOOO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.AbstractC33487OooO0O0;
import oO0OooOO.AbstractC33502OooOOo0;
import oO0OooOO.InterfaceC33489OooO0Oo;

/* JADX INFO: loaded from: classes8.dex */
public class RateLimiterClient {
    private static final RateLimitProto.RateLimit EMPTY_RATE_LIMITS = RateLimitProto.RateLimit.getDefaultInstance();
    private AbstractC33485OooO<RateLimitProto.RateLimit> cachedRateLimts = C32349OooO0Oo.f116296OooOo0o;
    private final Clock clock;
    private final ProtoStorageClient storageClient;

    public RateLimiterClient(@RateLimit ProtoStorageClient protoStorageClient, Clock clock) {
        this.storageClient = protoStorageClient;
        this.clock = clock;
    }

    private void clearInMemCache() {
        this.cachedRateLimts = C32349OooO0Oo.f116296OooOo0o;
    }

    private AbstractC33485OooO<RateLimitProto.RateLimit> getRateLimits() {
        AbstractC33485OooO<RateLimitProto.RateLimit> abstractC33485OooO = this.cachedRateLimts;
        AbstractC33485OooO abstractC33485OooO2 = this.storageClient.read(RateLimitProto.RateLimit.parser());
        C22758OoooOO0 c22758OoooOO0 = new C22758OoooOO0(this);
        abstractC33485OooO2.getClass();
        OooO00o.OooO0OO oooO0OO = oO00o0.OooO00o.f116238OooO0Oo;
        C32362OooOOo0 c32362OooOOo0 = new C32362OooOOo0(abstractC33485OooO2, c22758OoooOO0, oooO0OO);
        abstractC33485OooO.getClass();
        return new C32362OooOOo0(new C32363OooOOoo(abstractC33485OooO, c32362OooOOo0), oooO0OO, new C21714Oooo00O(this, 1));
    }

    private static RateLimitProto.Counter increment(RateLimitProto.Counter counter) {
        return RateLimitProto.Counter.newBuilder(counter).clearValue().setValue(counter.getValue() + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initInMemCache, reason: merged with bridge method [inline-methods] */
    public void lambda$increment$2(RateLimitProto.RateLimit rateLimit) {
        this.cachedRateLimts = AbstractC33485OooO.OooO0O0(rateLimit);
    }

    private boolean isLimitExpired(RateLimitProto.Counter counter, com.google.firebase.inappmessaging.model.RateLimit rateLimit) {
        return this.clock.now() - counter.getStartTimeEpoch() > rateLimit.timeToLiveMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRateLimits$7(Throwable th) throws Exception {
        clearInMemCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$increment$0(com.google.firebase.inappmessaging.model.RateLimit rateLimit, RateLimitProto.Counter counter) throws Exception {
        return !isLimitExpired(counter, rateLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ RateLimitProto.RateLimit lambda$increment$1(RateLimitProto.RateLimit rateLimit, com.google.firebase.inappmessaging.model.RateLimit rateLimit2, RateLimitProto.Counter counter) throws Exception {
        return RateLimitProto.RateLimit.newBuilder(rateLimit).putLimits(rateLimit2.limiterKey(), increment(counter)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ InterfaceC33489OooO0Oo lambda$increment$3(final RateLimitProto.RateLimit rateLimit) throws Exception {
        return this.storageClient.write(rateLimit).OooO0Oo(new InterfaceC32329OooO00o() { // from class: com.google.firebase.inappmessaging.internal.o000oOoO
            @Override // oO00o00o.InterfaceC32329OooO00o
            public final void run() throws Exception {
                this.f68564OooOo0o.lambda$increment$2(rateLimit);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC33489OooO0Oo lambda$increment$4(final com.google.firebase.inappmessaging.model.RateLimit rateLimit, final RateLimitProto.RateLimit rateLimit2) throws Exception {
        RateLimitProto.Counter limitsOrDefault = rateLimit2.getLimitsOrDefault(rateLimit.limiterKey(), newCounter());
        o00Oo0.OooO00o(limitsOrDefault, "The item is null");
        C33014OooO0o0 c33014OooO0o0 = new C33014OooO0o0(new C33017OooOO0(limitsOrDefault), new C22760OoooOOo(this, rateLimit));
        RateLimitProto.Counter counterNewCounter = newCounter();
        o00Oo0.OooO00o(counterNewCounter, "The item is null");
        return new C33016OooO0oo(new C33018OooOO0O(new C33020OooOOO(c33014OooO0o0, new C33017OooOO0(counterNewCounter)), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OoooOo0
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return RateLimiterClient.lambda$increment$1(rateLimit2, rateLimit, (RateLimitProto.Counter) obj);
            }
        }), new C22762OoooOoO(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RateLimitProto.Counter lambda$isRateLimited$5(com.google.firebase.inappmessaging.model.RateLimit rateLimit, RateLimitProto.RateLimit rateLimit2) throws Exception {
        return rateLimit2.getLimitsOrDefault(rateLimit.limiterKey(), newCounter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$isRateLimited$6(com.google.firebase.inappmessaging.model.RateLimit rateLimit, RateLimitProto.Counter counter) throws Exception {
        return isLimitExpired(counter, rateLimit) || counter.getValue() < rateLimit.limit();
    }

    private RateLimitProto.Counter newCounter() {
        return RateLimitProto.Counter.newBuilder().setValue(0L).setStartTimeEpoch(this.clock.now()).build();
    }

    public AbstractC33502OooOOo0<Boolean> isRateLimited(final com.google.firebase.inappmessaging.model.RateLimit rateLimit) {
        AbstractC33485OooO<RateLimitProto.RateLimit> rateLimits = getRateLimits();
        C32358OooOOO0 c32358OooOOO0OooO0O0 = AbstractC33485OooO.OooO0O0(RateLimitProto.RateLimit.getDefaultInstance());
        rateLimits.getClass();
        return new C32356OooOO0o(new C32351OooO0o0(new C32357OooOOO(new C32363OooOOoo(rateLimits, c32358OooOOO0OooO0O0), new InterfaceC32331OooO0OO() { // from class: com.google.firebase.inappmessaging.internal.OoooOoo
            @Override // oO00o00o.InterfaceC32331OooO0OO
            public final Object apply(Object obj) {
                return this.f68560OooOo0o.lambda$isRateLimited$5(rateLimit, (RateLimitProto.RateLimit) obj);
            }
        }), new InterfaceC32332OooO0Oo() { // from class: com.google.firebase.inappmessaging.internal.Ooooo00
            @Override // oO00o00o.InterfaceC32332OooO0Oo
            public final boolean test(Object obj) {
                return this.f68562OooOo0o.lambda$isRateLimited$6(rateLimit, (RateLimitProto.Counter) obj);
            }
        }));
    }

    public AbstractC33487OooO0O0 increment(com.google.firebase.inappmessaging.model.RateLimit rateLimit) {
        AbstractC33485OooO<RateLimitProto.RateLimit> rateLimits = getRateLimits();
        RateLimitProto.RateLimit rateLimit2 = EMPTY_RATE_LIMITS;
        rateLimits.getClass();
        o00Oo0.OooO00o(rateLimit2, "item is null");
        return new C32352OooO0oO(new C32363OooOOoo(rateLimits, AbstractC33485OooO.OooO0O0(rateLimit2)), new C22759OoooOOO(this, rateLimit));
    }
}
