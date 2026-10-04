package com.microsoft.identity.common.internal.cache;

import com.microsoft.identity.common.internal.broker.BrokerData;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001d"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/BaseActiveBrokerCache;", "Lcom/microsoft/identity/common/internal/cache/IActiveBrokerCache;", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "", "storage", "LoO0o0oOo/OooO00o;", "lock", "<init>", "(Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;LoO0o0oOo/OooO00o;)V", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "getCachedActiveBroker", "()Lcom/microsoft/identity/common/internal/broker/BrokerData;", "", "shouldUseAccountManager", "()Z", "", "timeInMillis", "LoO00ooO/OooOooO;", "setShouldUseAccountManagerForTheNextMilliseconds", "(J)V", "brokerData", "setCachedActiveBroker", "(Lcom/microsoft/identity/common/internal/broker/BrokerData;)V", "clearCachedActiveBroker", "()V", "setCachedActiveBrokerWithoutLock", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "LoO0o0oOo/OooO00o;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public class BaseActiveBrokerCache implements IActiveBrokerCache {
    public static final String ACTIVE_BROKER_CACHE_PACKAGE_NAME_KEY = "ACTIVE_BROKER_CACHE_PACKAGE_NAME_KEY";
    public static final String ACTIVE_BROKER_CACHE_SIGHASH_KEY = "ACTIVE_BROKER_CACHE_SIGHASH_KEY";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY = "SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY";
    private final InterfaceC33895OooO00o lock;
    private final INameValueStorage<String> storage;

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/BaseActiveBrokerCache$Companion;", "", "()V", BaseActiveBrokerCache.ACTIVE_BROKER_CACHE_PACKAGE_NAME_KEY, "", BaseActiveBrokerCache.ACTIVE_BROKER_CACHE_SIGHASH_KEY, BaseActiveBrokerCache.SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY, "isNotExpired", "", "expiryDate", "", "(Ljava/lang/Long;)Z", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final boolean isNotExpired(Long expiryDate) {
            return expiryDate != null && System.currentTimeMillis() < expiryDate.longValue();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$clearCachedActiveBroker$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$clearCachedActiveBroker$1", m80623f = "BaseActiveBrokerCache.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class C185711 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C185711(Continuation<? super C185711> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseActiveBrokerCache.this.new C185711(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            BaseActiveBrokerCache baseActiveBrokerCache;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = BaseActiveBrokerCache.this.lock;
                BaseActiveBrokerCache baseActiveBrokerCache2 = BaseActiveBrokerCache.this;
                this.L$0 = interfaceC33895OooO00o;
                this.L$1 = baseActiveBrokerCache2;
                this.label = 1;
                if (interfaceC33895OooO00o.OooO00o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                baseActiveBrokerCache = baseActiveBrokerCache2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseActiveBrokerCache = (BaseActiveBrokerCache) this.L$1;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.L$0;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                baseActiveBrokerCache.storage.remove(BaseActiveBrokerCache.ACTIVE_BROKER_CACHE_PACKAGE_NAME_KEY);
                baseActiveBrokerCache.storage.remove(BaseActiveBrokerCache.ACTIVE_BROKER_CACHE_SIGHASH_KEY);
                baseActiveBrokerCache.storage.remove(BaseActiveBrokerCache.SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                interfaceC33895OooO00o.OooOOO0(null);
                throw th;
            }
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C185711) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$getCachedActiveBroker$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "Lcom/microsoft/identity/common/internal/broker/BrokerData;", "<anonymous>", "(LoO0o0OO/Oooo00o;)Lcom/microsoft/identity/common/internal/broker/BrokerData;"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$getCachedActiveBroker$1", m80623f = "BaseActiveBrokerCache.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class C185721 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super BrokerData>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C185721(Continuation<? super C185721> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseActiveBrokerCache.this.new C185721(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            BaseActiveBrokerCache baseActiveBrokerCache;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = BaseActiveBrokerCache.this.lock;
                BaseActiveBrokerCache baseActiveBrokerCache2 = BaseActiveBrokerCache.this;
                this.L$0 = interfaceC33895OooO00o;
                this.L$1 = baseActiveBrokerCache2;
                this.label = 1;
                if (interfaceC33895OooO00o.OooO00o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                baseActiveBrokerCache = baseActiveBrokerCache2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseActiveBrokerCache = (BaseActiveBrokerCache) this.L$1;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.L$0;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                String str = (String) baseActiveBrokerCache.storage.get(BaseActiveBrokerCache.ACTIVE_BROKER_CACHE_PACKAGE_NAME_KEY);
                String str2 = (String) baseActiveBrokerCache.storage.get(BaseActiveBrokerCache.ACTIVE_BROKER_CACHE_SIGHASH_KEY);
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    return new BrokerData(str, str2);
                }
                return null;
            } finally {
                interfaceC33895OooO00o.OooOOO0(null);
            }
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super BrokerData> continuation) {
            return ((C185721) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$setCachedActiveBroker$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$setCachedActiveBroker$1", m80623f = "BaseActiveBrokerCache.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class C185731 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ BrokerData $brokerData;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185731(BrokerData brokerData, Continuation<? super C185731> continuation) {
            super(2, continuation);
            this.$brokerData = brokerData;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseActiveBrokerCache.this.new C185731(this.$brokerData, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            BaseActiveBrokerCache baseActiveBrokerCache;
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            BrokerData brokerData;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33895OooO00o interfaceC33895OooO00o2 = BaseActiveBrokerCache.this.lock;
                baseActiveBrokerCache = BaseActiveBrokerCache.this;
                BrokerData brokerData2 = this.$brokerData;
                this.L$0 = interfaceC33895OooO00o2;
                this.L$1 = baseActiveBrokerCache;
                this.L$2 = brokerData2;
                this.label = 1;
                if (interfaceC33895OooO00o2.OooO00o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                interfaceC33895OooO00o = interfaceC33895OooO00o2;
                brokerData = brokerData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                brokerData = (BrokerData) this.L$2;
                baseActiveBrokerCache = (BaseActiveBrokerCache) this.L$1;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.L$0;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                baseActiveBrokerCache.setCachedActiveBrokerWithoutLock(brokerData);
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                interfaceC33895OooO00o.OooOOO0(null);
                throw th;
            }
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C185731) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$setShouldUseAccountManagerForTheNextMilliseconds$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "LoO00ooO/OooOooO;", "<anonymous>", "(LoO0o0OO/Oooo00o;)V"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$setShouldUseAccountManagerForTheNextMilliseconds$1", m80623f = "BaseActiveBrokerCache.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class C185741 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        final /* synthetic */ long $timeInMillis;
        long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C185741(long j, Continuation<? super C185741> continuation) {
            super(2, continuation);
            this.$timeInMillis = j;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseActiveBrokerCache.this.new C185741(this.$timeInMillis, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            BaseActiveBrokerCache baseActiveBrokerCache;
            long j;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = BaseActiveBrokerCache.this.lock;
                long j2 = this.$timeInMillis;
                BaseActiveBrokerCache baseActiveBrokerCache2 = BaseActiveBrokerCache.this;
                this.L$0 = interfaceC33895OooO00o;
                this.L$1 = baseActiveBrokerCache2;
                this.J$0 = j2;
                this.label = 1;
                if (interfaceC33895OooO00o.OooO00o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                baseActiveBrokerCache = baseActiveBrokerCache2;
                j = j2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                baseActiveBrokerCache = (BaseActiveBrokerCache) this.L$1;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.L$0;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                baseActiveBrokerCache.storage.put(BaseActiveBrokerCache.SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY, String.valueOf(System.currentTimeMillis() + j));
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                interfaceC33895OooO00o.OooOOO0(null);
                throw th;
            }
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C185741) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$shouldUseAccountManager$1 */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m80612d2 = {"LoO0o0OO/Oooo00o;", "", "<anonymous>", "(LoO0o0OO/Oooo00o;)Z"}, m80613k = 3, m80614mv = {1, 7, 1})
    @InterfaceC32482OooO0o0(m80622c = "com.microsoft.identity.common.internal.cache.BaseActiveBrokerCache$shouldUseAccountManager$1", m80623f = "BaseActiveBrokerCache.kt", m80624l = {134}, m80625m = "invokeSuspend")
    public static final class C185751 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C185751(Continuation<? super C185751> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return BaseActiveBrokerCache.this.new C185751(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            InterfaceC33895OooO00o interfaceC33895OooO00o;
            BaseActiveBrokerCache baseActiveBrokerCache;
            Long lOooOOO;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.label;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33895OooO00o = BaseActiveBrokerCache.this.lock;
                BaseActiveBrokerCache baseActiveBrokerCache2 = BaseActiveBrokerCache.this;
                this.L$0 = interfaceC33895OooO00o;
                this.L$1 = baseActiveBrokerCache2;
                this.label = 1;
                if (interfaceC33895OooO00o.OooO00o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                baseActiveBrokerCache = baseActiveBrokerCache2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseActiveBrokerCache = (BaseActiveBrokerCache) this.L$1;
                interfaceC33895OooO00o = (InterfaceC33895OooO00o) this.L$0;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                String str = (String) baseActiveBrokerCache.storage.get(BaseActiveBrokerCache.SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY);
                return (str == null || (lOooOOO = C33596OooOOo0.OooOOO(str)) == null) ? Boolean.FALSE : Boolean.valueOf(BaseActiveBrokerCache.INSTANCE.isNotExpired(new Long(lOooOOO.longValue())));
            } finally {
                interfaceC33895OooO00o.OooOOO0(null);
            }
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
            return ((C185751) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }
    }

    public BaseActiveBrokerCache(INameValueStorage<String> storage, InterfaceC33895OooO00o lock) {
        OooOOO0.OooO0oO(storage, "storage");
        OooOOO0.OooO0oO(lock, "lock");
        this.storage = storage;
        this.lock = lock;
    }

    @Override // com.microsoft.identity.common.internal.cache.IActiveBrokerCache
    public void clearCachedActiveBroker() throws Throwable {
        C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C185711(null));
    }

    @Override // com.microsoft.identity.common.internal.cache.IActiveBrokerCache
    public BrokerData getCachedActiveBroker() {
        return (BrokerData) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C185721(null));
    }

    @Override // com.microsoft.identity.common.internal.cache.IActiveBrokerCache
    public void setCachedActiveBroker(BrokerData brokerData) throws Throwable {
        OooOOO0.OooO0oO(brokerData, "brokerData");
        C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C185731(brokerData, null));
    }

    public void setCachedActiveBrokerWithoutLock(BrokerData brokerData) {
        OooOOO0.OooO0oO(brokerData, "brokerData");
        this.storage.put(ACTIVE_BROKER_CACHE_PACKAGE_NAME_KEY, brokerData.getPackageName());
        this.storage.put(ACTIVE_BROKER_CACHE_SIGHASH_KEY, brokerData.getSigningCertificateThumbprint());
        this.storage.remove(SHOULD_USE_ACCOUNT_MANAGER_UNTIL_EPOCH_MILLISECONDS_KEY);
    }

    @Override // com.microsoft.identity.common.internal.cache.IActiveBrokerCache
    public void setShouldUseAccountManagerForTheNextMilliseconds(long timeInMillis) throws Throwable {
        C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C185741(timeInMillis, null));
    }

    @Override // com.microsoft.identity.common.internal.cache.IActiveBrokerCache
    public boolean shouldUseAccountManager() {
        return ((Boolean) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C185751(null))).booleanValue();
    }
}
