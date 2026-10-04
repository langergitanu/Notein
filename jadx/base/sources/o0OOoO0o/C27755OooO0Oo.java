package o0OOoO0o;

import Oooo0.C20856OooooOo;
import Oooo0o0.C21009OooOooO;
import Oooo0oO.C21036OooOOo0;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.cloudsync.SyncStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0O0oooo.C26364OooO0oo;
import o0OOo0oo.C27639OooOoo0;
import o0OOo0oo.o000OOo;
import o0OOoO00.C27723OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.C33576OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.C33664o00000Oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33703OooOOO0;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oOO00oo.C34406OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34447Oooo0o0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOoO0o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27755OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C33695OooO0o0 f97986OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo f97987OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C27639OooOoo0 f97988OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooO00o> f97989OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33781o00o0O f97990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ConcurrentHashMap<String, OooO0O0> f97991OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33769Ooooo0o f97992OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinkedHashSet f97993OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33898OooO0Oo f97994OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C33695OooO0o0 f97995OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public volatile boolean f97996OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C33664o00000Oo f97997OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public C27723OooO0O0.OooO00o f97998OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public C33822OooO0OO f97999OooOOO0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f98000OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f98001OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f98002OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f98003OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o("CALLBACK", 0);
            f98001OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("STATE_CHANGE", 1);
            f98000OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("PHASE_TRIGGER", 2);
            f98003OooOoO0 = oooO00o3;
            OooO00o[] oooO00oArr = {oooO00o, oooO00o2, oooO00o3};
            f98002OooOoO = oooO00oArr;
            OooO.OooO00o.OooO0O0(oooO00oArr);
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f98002OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ConcurrentLinkedDeque<OooO0OO> f98004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile EnumC27756OooO0o0 f98005OooO0O0;

        public OooO0O0() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98004OooO00o, oooO0O0.f98004OooO00o) && this.f98005OooO0O0 == oooO0O0.f98005OooO0O0;
        }

        public final int hashCode() {
            return (this.f98004OooO00o.hashCode() * 31) + (this.f98005OooO0O0 == null ? 0 : this.f98005OooO0O0.hashCode());
        }

        public final String toString() {
            return "MetaQueue(queue=" + this.f98004OooO00o + ", routeTo=" + this.f98005OooO0O0 + ")";
        }

        public OooO0O0(Object obj) {
            this.f98004OooO00o = new ConcurrentLinkedDeque<>();
            this.f98005OooO0O0 = null;
        }
    }

    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SyncEvent f98006OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f98007OooO0O0;

        public OooO0OO(SyncEvent event) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
            this.f98006OooO00o = event;
            this.f98007OooO0O0 = jCurrentTimeMillis;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98006OooO00o, oooO0OO.f98006OooO00o) && this.f98007OooO0O0 == oooO0OO.f98007OooO0O0;
        }

        public final int hashCode() {
            return Long.hashCode(this.f98007OooO0O0) + (this.f98006OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "QueuedEvent(event=" + this.f98006OooO00o + ", timestamp=" + this.f98007OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public /* synthetic */ class C19870OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f98008OooO00o;

        static {
            int[] iArr = new int[EnumC27756OooO0o0.values().length];
            try {
                EnumC27756OooO0o0 enumC27756OooO0o0 = EnumC27756OooO0o0.f98021OooOo0o;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f98008OooO00o = iArr;
        }
    }

    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler$enqueue$2", m80623f = "SyncScheduler.kt", m80624l = {723}, m80625m = "invokeSuspend")
    public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public C27755OooO0Oo f98009OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public C33898OooO0Oo f98010OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public ConcurrentLinkedDeque f98011OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public String f98012OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public OooO0O0 f98013OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f98015OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public final /* synthetic */ String f98016OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ ConcurrentLinkedDeque<OooO0OO> f98017OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f98018Oooo000;

        /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0o$OooO00o */
        public /* synthetic */ class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final /* synthetic */ int[] f98019OooO00o;

            static {
                int[] iArr = new int[EnumC27756OooO0o0.values().length];
                try {
                    EnumC27756OooO0o0 enumC27756OooO0o0 = EnumC27756OooO0o0.f98021OooOo0o;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f98019OooO00o = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, ConcurrentLinkedDeque<OooO0OO> concurrentLinkedDeque, OooO0O0 oooO0O0, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f98016OooOooO = str;
            this.f98017OooOooo = concurrentLinkedDeque;
            this.f98018Oooo000 = oooO0O0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C27755OooO0Oo.this.new OooO0o(this.f98016OooOooO, this.f98017OooOooo, this.f98018Oooo000, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            C27755OooO0Oo c27755OooO0Oo;
            C33898OooO0Oo c33898OooO0Oo;
            String str;
            ConcurrentLinkedDeque<OooO0OO> concurrentLinkedDeque;
            OooO0O0 oooO0O0;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f98015OooOoo0;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c27755OooO0Oo = C27755OooO0Oo.this;
                c33898OooO0Oo = c27755OooO0Oo.f97994OooO0oo;
                str = this.f98016OooOooO;
                concurrentLinkedDeque = this.f98017OooOooo;
                OooO0O0 oooO0O02 = this.f98018Oooo000;
                this.f98010OooOo0o = c33898OooO0Oo;
                this.f98009OooOo = c27755OooO0Oo;
                this.f98012OooOoO0 = str;
                this.f98011OooOoO = concurrentLinkedDeque;
                this.f98013OooOoOO = oooO0O02;
                this.f98015OooOoo0 = 1;
                if (c33898OooO0Oo.OooO00o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                oooO0O0 = oooO0O02;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO0O0 = this.f98013OooOoOO;
                concurrentLinkedDeque = this.f98011OooOoO;
                str = this.f98012OooOoO0;
                c27755OooO0Oo = this.f98009OooOo;
                c33898OooO0Oo = this.f98010OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
            }
            try {
                if (!c27755OooO0Oo.f97993OooO0oO.contains(str) && !concurrentLinkedDeque.isEmpty()) {
                    EnumC27756OooO0o0 enumC27756OooO0o0 = oooO0O0.f98005OooO0O0;
                    Object objOooO0o0 = ((enumC27756OooO0o0 == null ? -1 : OooO00o.f98019OooO00o[enumC27756OooO0o0.ordinal()]) == 1 ? c27755OooO0Oo.f97995OooOO0 : c27755OooO0Oo.f97986OooO).OooO0o0(C32460OooOooO.f116667OooO00o);
                    if (objOooO0o0 instanceof C33702OooOOO.OooO0O0) {
                        C33702OooOOO.OooO00o(objOooO0o0);
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("SyncScheduler");
                        c20358OooO00o.OooOO0O("Failed to send signal for meta " + str, new Object[0]);
                    }
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                c33898OooO0Oo.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                c33898OooO0Oo.OooOOO0(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    public static final class EnumC27756OooO0o0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC27756OooO0o0 f98020OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC27756OooO0o0 f98021OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ EnumC27756OooO0o0[] f98022OooOoO0;

        static {
            EnumC27756OooO0o0 enumC27756OooO0o0 = new EnumC27756OooO0o0("STABLE_HANDLER", 0);
            f98021OooOo0o = enumC27756OooO0o0;
            EnumC27756OooO0o0 enumC27756OooO0o02 = new EnumC27756OooO0o0("PROCESSING_HANDLER", 1);
            f98020OooOo = enumC27756OooO0o02;
            EnumC27756OooO0o0[] enumC27756OooO0o0Arr = {enumC27756OooO0o0, enumC27756OooO0o02};
            f98022OooOoO0 = enumC27756OooO0o0Arr;
            OooO.OooO00o.OooO0O0(enumC27756OooO0o0Arr);
        }

        public EnumC27756OooO0o0() {
            throw null;
        }

        public static EnumC27756OooO0o0 valueOf(String str) {
            return (EnumC27756OooO0o0) Enum.valueOf(EnumC27756OooO0o0.class, str);
        }

        public static EnumC27756OooO0o0[] values() {
            return (EnumC27756OooO0o0[]) f98022OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: o0OOoO0o.OooO0Oo$OooO0oO, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.scheduler.SyncScheduler$start$1$1", m80623f = "SyncScheduler.kt", m80624l = {186, 188}, m80625m = "invokeSuspend")
    public static final class C27757OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f98023OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f98024OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C27755OooO0Oo f98025OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27757OooO0oO(int i, C27755OooO0Oo c27755OooO0Oo, Continuation<? super C27757OooO0oO> continuation) {
            super(2, continuation);
            this.f98023OooOo = i;
            this.f98025OooOoO0 = c27755OooO0Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C27757OooO0oO(this.f98023OooOo, this.f98025OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C27757OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f98024OooOo0o;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C27755OooO0Oo c27755OooO0Oo = this.f98025OooOoO0;
            int i2 = this.f98023OooOo;
            if (i2 == 0) {
                this.f98024OooOo0o = 1;
                C27755OooO0Oo.OooO0O0(c27755OooO0Oo, i2, this);
                return enumC32485OooO00o;
            }
            this.f98024OooOo0o = 2;
            C27755OooO0Oo.OooO00o(c27755OooO0Oo, i2, this);
            return enumC32485OooO00o;
        }
    }

    public C27755OooO0Oo(o000OOo recomputeSyncStateUseCase, C27639OooOoo0 cloudSyncRemoteConfigUseCase) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(recomputeSyncStateUseCase, "recomputeSyncStateUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudSyncRemoteConfigUseCase, "cloudSyncRemoteConfigUseCase");
        this.f97987OooO00o = recomputeSyncStateUseCase;
        this.f97988OooO0O0 = cloudSyncRemoteConfigUseCase;
        this.f97989OooO0OO = C34429OooOOo0.OooOO0o(OooO00o.f98001OooOo0o, OooO00o.f98000OooOo, OooO00o.f98003OooOoO0);
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(C34438OooOoo0.f123458OooOo0o);
        this.f97990OooO0Oo = c33781o00o0OOooO00o;
        this.f97992OooO0o0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
        this.f97991OooO0o = new ConcurrentHashMap<>();
        this.f97993OooO0oO = new LinkedHashSet();
        this.f97994OooO0oo = C33900OooO0o0.OooO00o();
        this.f97986OooO = C33703OooOOO0.OooO00o(Integer.MAX_VALUE, 6, null);
        this.f97995OooOO0 = C33703OooOOO0.OooO00o(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r12.OooO0oO(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        r12 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [int] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b7 -> B:37:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f0 -> B:37:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0121 -> B:48:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO00o(C27755OooO0Oo c27755OooO0Oo, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27763OooOO0O c27763OooOO0O;
        ?? r12;
        ?? r11;
        ?? r112;
        ?? r122;
        ?? r113;
        ?? r2;
        ?? r114;
        ?? r22;
        ?? r123;
        ?? r115;
        ?? r23;
        c27755OooO0Oo.getClass();
        if (abstractC32479OooO0OO instanceof C27763OooOO0O) {
            c27763OooOO0O = (C27763OooOO0O) abstractC32479OooO0OO;
            int i2 = c27763OooOO0O.f98062OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27763OooOO0O.f98062OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c27763OooOO0O = new C27763OooOO0O(c27755OooO0Oo, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO = c27763OooOO0O.f98059OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r24 = c27763OooOO0O.f98062OooOoo0;
        try {
        } catch (Throwable th) {
            c27763OooOO0O.f98058OooOo0o = th;
            c27763OooOO0O.f98057OooOo = null;
            c27763OooOO0O.f98062OooOoo0 = 7;
            if (r24.OooOO0O(i, c27763OooOO0O) != enumC32485OooO00o) {
                throw th;
            }
        }
        switch (r24) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooOOO);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SyncScheduler");
                c20358OooO00o.OooO00o("Processing Worker #" + ((int) i) + " started", new Object[0]);
                r11 = c27755OooO0Oo;
                r12 = i;
                c27763OooOO0O.f98058OooOo0o = r11;
                c27763OooOO0O.f98060OooOoO0 = r12;
                c27763OooOO0O.f98062OooOoo0 = 1;
                objOooOOO = r11.OooOOO(c27763OooOO0O);
                if (objOooOOO != enumC32485OooO00o) {
                    r24 = r11;
                    r112 = r12;
                    i = (String) objOooOOO;
                    if (i == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        ?? OooO00o2 = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o2, "SyncScheduler", "Processing Worker #", r112, " picked up meta: ");
                        OooO00o2.append(i);
                        c20358OooO00o2.OooO0o0(OooO00o2.toString(), new Object[0]);
                        c27763OooOO0O.f98058OooOo0o = r24;
                        c27763OooOO0O.f98057OooOo = i;
                        c27763OooOO0O.f98060OooOoO0 = r112;
                        c27763OooOO0O.f98062OooOoo0 = 3;
                        Object objOooO = r24.OooO(r112, i, c27763OooOO0O);
                        r2 = r24;
                        r113 = r112;
                        r122 = i;
                        if (objOooO != enumC32485OooO00o) {
                            c27763OooOO0O.f98058OooOo0o = r2;
                            c27763OooOO0O.f98057OooOo = null;
                            c27763OooOO0O.f98060OooOoO0 = r113;
                            c27763OooOO0O.f98062OooOoo0 = 4;
                            Object objOooOO0O = r2.OooOO0O(r122, c27763OooOO0O);
                            r22 = r2;
                            r114 = r113;
                        }
                    } else {
                        C33695OooO0o0 c33695OooO0o0 = r24.f97995OooOO0;
                        c27763OooOO0O.f98058OooOo0o = r24;
                        c27763OooOO0O.f98060OooOoO0 = r112;
                        c27763OooOO0O.f98062OooOoo0 = 2;
                        r22 = r24;
                        r114 = r112;
                    }
                    break;
                }
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            case 1:
                int i3 = c27763OooOO0O.f98060OooOoO0;
                C27755OooO0Oo c27755OooO0Oo2 = (C27755OooO0Oo) c27763OooOO0O.f98058OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO);
                r24 = c27755OooO0Oo2;
                r112 = i3;
                i = (String) objOooOOO;
                if (i == 0) {
                }
                EnumC32485OooO00o enumC32485OooO00o22 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            case 2:
            case 4:
            case 6:
                int i4 = c27763OooOO0O.f98060OooOoO0;
                C27755OooO0Oo c27755OooO0Oo3 = (C27755OooO0Oo) c27763OooOO0O.f98058OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO);
                r12 = i4;
                r11 = c27755OooO0Oo3;
                c27763OooOO0O.f98058OooOo0o = r11;
                c27763OooOO0O.f98060OooOoO0 = r12;
                c27763OooOO0O.f98062OooOoo0 = 1;
                objOooOOO = r11.OooOOO(c27763OooOO0O);
                if (objOooOOO != enumC32485OooO00o) {
                }
                EnumC32485OooO00o enumC32485OooO00o222 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            case 3:
                r112 = c27763OooOO0O.f98060OooOoO0;
                i = c27763OooOO0O.f98057OooOo;
                r24 = (C27755OooO0Oo) c27763OooOO0O.f98058OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOO);
                    r2 = r24;
                    r113 = r112;
                    r122 = i;
                } catch (CancellationException e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("SyncScheduler");
                    c20358OooO00o3.OooOO0O("Processing Worker #" + r112 + " cancelled", new Object[0]);
                    throw e;
                } catch (Throwable th2) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("SyncScheduler");
                    c20358OooO00o4.OooO0Oo(th2, "Processing Worker #" + r112 + " failed to process meta " + i, new Object[0]);
                    c27763OooOO0O.f98058OooOo0o = r24;
                    c27763OooOO0O.f98057OooOo = i;
                    c27763OooOO0O.f98060OooOoO0 = r112;
                    c27763OooOO0O.f98062OooOoo0 = 5;
                    Object objOooO0oo = r24.OooO0oo(i, c27763OooOO0O);
                    r23 = r24;
                    r115 = r112;
                    r123 = i;
                    if (objOooO0oo != enumC32485OooO00o) {
                        c27763OooOO0O.f98058OooOo0o = r23;
                        c27763OooOO0O.f98057OooOo = null;
                        c27763OooOO0O.f98060OooOoO0 = r115;
                        c27763OooOO0O.f98062OooOoo0 = 6;
                        Object objOooOO0O2 = r23.OooOO0O(r123, c27763OooOO0O);
                        r22 = r23;
                        r114 = r115;
                        break;
                    }
                    EnumC32485OooO00o enumC32485OooO00o2222 = EnumC32485OooO00o.f116726OooOo0o;
                    return;
                }
                c27763OooOO0O.f98058OooOo0o = r2;
                c27763OooOO0O.f98057OooOo = null;
                c27763OooOO0O.f98060OooOoO0 = r113;
                c27763OooOO0O.f98062OooOoo0 = 4;
                Object objOooOO0O3 = r2.OooOO0O(r122, c27763OooOO0O);
                r22 = r2;
                r114 = r113;
                break;
            case 5:
                int i5 = c27763OooOO0O.f98060OooOoO0;
                String str = c27763OooOO0O.f98057OooOo;
                C27755OooO0Oo c27755OooO0Oo4 = (C27755OooO0Oo) c27763OooOO0O.f98058OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO);
                r23 = c27755OooO0Oo4;
                r115 = i5;
                r123 = str;
                c27763OooOO0O.f98058OooOo0o = r23;
                c27763OooOO0O.f98057OooOo = null;
                c27763OooOO0O.f98060OooOoO0 = r115;
                c27763OooOO0O.f98062OooOoo0 = 6;
                Object objOooOO0O22 = r23.OooOO0O(r123, c27763OooOO0O);
                r22 = r23;
                r114 = r115;
                break;
            case 7:
                Throwable th3 = (Throwable) c27763OooOO0O.f98058OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (r12.OooO0oO(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        r12 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v12, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [int] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16, types: [int] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, o0OOoO0o.OooO0Oo] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b7 -> B:37:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f0 -> B:37:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0121 -> B:48:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OooO0O0(C27755OooO0Oo c27755OooO0Oo, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27768OooOOOo c27768OooOOOo;
        ?? r12;
        ?? r11;
        ?? r112;
        ?? r122;
        ?? r113;
        ?? r2;
        ?? r114;
        ?? r22;
        ?? r123;
        ?? r115;
        ?? r23;
        c27755OooO0Oo.getClass();
        if (abstractC32479OooO0OO instanceof C27768OooOOOo) {
            c27768OooOOOo = (C27768OooOOOo) abstractC32479OooO0OO;
            int i2 = c27768OooOOOo.f98088OooOoo0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27768OooOOOo.f98088OooOoo0 = i2 - Integer.MIN_VALUE;
            } else {
                c27768OooOOOo = new C27768OooOOOo(c27755OooO0Oo, abstractC32479OooO0OO);
            }
        }
        Object objOooOOOO = c27768OooOOOo.f98085OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r24 = c27768OooOOOo.f98088OooOoo0;
        try {
        } catch (Throwable th) {
            c27768OooOOOo.f98084OooOo0o = th;
            c27768OooOOOo.f98083OooOo = null;
            c27768OooOOOo.f98088OooOoo0 = 7;
            if (r24.OooOO0O(i, c27768OooOOOo) != enumC32485OooO00o) {
                throw th;
            }
        }
        switch (r24) {
            case 0:
                C32446OooOOOo.OooO0O0(objOooOOOO);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("SyncScheduler");
                c20358OooO00o.OooO00o("Stable Worker #" + ((int) i) + " started", new Object[0]);
                r11 = c27755OooO0Oo;
                r12 = i;
                c27768OooOOOo.f98084OooOo0o = r11;
                c27768OooOOOo.f98086OooOoO0 = r12;
                c27768OooOOOo.f98088OooOoo0 = 1;
                objOooOOOO = r11.OooOOOO(c27768OooOOOo);
                if (objOooOOOO != enumC32485OooO00o) {
                    r24 = r11;
                    r112 = r12;
                    i = (String) objOooOOOO;
                    if (i == 0) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        ?? OooO00o2 = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o2, "SyncScheduler", "Stable Worker #", r112, " picked up meta: ");
                        OooO00o2.append(i);
                        c20358OooO00o2.OooO0o0(OooO00o2.toString(), new Object[0]);
                        c27768OooOOOo.f98084OooOo0o = r24;
                        c27768OooOOOo.f98083OooOo = i;
                        c27768OooOOOo.f98086OooOoO0 = r112;
                        c27768OooOOOo.f98088OooOoo0 = 3;
                        Object objOooOO0 = r24.OooOO0(r112, i, c27768OooOOOo);
                        r2 = r24;
                        r113 = r112;
                        r122 = i;
                        if (objOooOO0 != enumC32485OooO00o) {
                            c27768OooOOOo.f98084OooOo0o = r2;
                            c27768OooOOOo.f98083OooOo = null;
                            c27768OooOOOo.f98086OooOoO0 = r113;
                            c27768OooOOOo.f98088OooOoo0 = 4;
                            Object objOooOO0O = r2.OooOO0O(r122, c27768OooOOOo);
                            r22 = r2;
                            r114 = r113;
                        }
                    } else {
                        C33695OooO0o0 c33695OooO0o0 = r24.f97986OooO;
                        c27768OooOOOo.f98084OooOo0o = r24;
                        c27768OooOOOo.f98086OooOoO0 = r112;
                        c27768OooOOOo.f98088OooOoo0 = 2;
                        r22 = r24;
                        r114 = r112;
                    }
                    break;
                }
                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            case 1:
                int i3 = c27768OooOOOo.f98086OooOoO0;
                C27755OooO0Oo c27755OooO0Oo2 = (C27755OooO0Oo) c27768OooOOOo.f98084OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOOO);
                r24 = c27755OooO0Oo2;
                r112 = i3;
                i = (String) objOooOOOO;
                if (i == 0) {
                }
                EnumC32485OooO00o enumC32485OooO00o22 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            case 2:
            case 4:
            case 6:
                int i4 = c27768OooOOOo.f98086OooOoO0;
                C27755OooO0Oo c27755OooO0Oo3 = (C27755OooO0Oo) c27768OooOOOo.f98084OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOOO);
                r12 = i4;
                r11 = c27755OooO0Oo3;
                c27768OooOOOo.f98084OooOo0o = r11;
                c27768OooOOOo.f98086OooOoO0 = r12;
                c27768OooOOOo.f98088OooOoo0 = 1;
                objOooOOOO = r11.OooOOOO(c27768OooOOOo);
                if (objOooOOOO != enumC32485OooO00o) {
                }
                EnumC32485OooO00o enumC32485OooO00o222 = EnumC32485OooO00o.f116726OooOo0o;
                return;
            case 3:
                r112 = c27768OooOOOo.f98086OooOoO0;
                i = c27768OooOOOo.f98083OooOo;
                r24 = (C27755OooO0Oo) c27768OooOOOo.f98084OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOOOO);
                    r2 = r24;
                    r113 = r112;
                    r122 = i;
                } catch (CancellationException e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("SyncScheduler");
                    c20358OooO00o3.OooOO0O("Stable Worker #" + r112 + " cancelled", new Object[0]);
                    throw e;
                } catch (Throwable th2) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o4.OooOOO0("SyncScheduler");
                    c20358OooO00o4.OooO0Oo(th2, "Stable Worker #" + r112 + " failed to process meta " + i, new Object[0]);
                    c27768OooOOOo.f98084OooOo0o = r24;
                    c27768OooOOOo.f98083OooOo = i;
                    c27768OooOOOo.f98086OooOoO0 = r112;
                    c27768OooOOOo.f98088OooOoo0 = 5;
                    Object objOooO0oo = r24.OooO0oo(i, c27768OooOOOo);
                    r23 = r24;
                    r115 = r112;
                    r123 = i;
                    if (objOooO0oo != enumC32485OooO00o) {
                        c27768OooOOOo.f98084OooOo0o = r23;
                        c27768OooOOOo.f98083OooOo = null;
                        c27768OooOOOo.f98086OooOoO0 = r115;
                        c27768OooOOOo.f98088OooOoo0 = 6;
                        Object objOooOO0O2 = r23.OooOO0O(r123, c27768OooOOOo);
                        r22 = r23;
                        r114 = r115;
                        break;
                    }
                    EnumC32485OooO00o enumC32485OooO00o2222 = EnumC32485OooO00o.f116726OooOo0o;
                    return;
                }
                c27768OooOOOo.f98084OooOo0o = r2;
                c27768OooOOOo.f98083OooOo = null;
                c27768OooOOOo.f98086OooOoO0 = r113;
                c27768OooOOOo.f98088OooOoo0 = 4;
                Object objOooOO0O3 = r2.OooOO0O(r122, c27768OooOOOo);
                r22 = r2;
                r114 = r113;
                break;
            case 5:
                int i5 = c27768OooOOOo.f98086OooOoO0;
                String str = c27768OooOOOo.f98083OooOo;
                C27755OooO0Oo c27755OooO0Oo4 = (C27755OooO0Oo) c27768OooOOOo.f98084OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOOO);
                r23 = c27755OooO0Oo4;
                r115 = i5;
                r123 = str;
                c27768OooOOOo.f98084OooOo0o = r23;
                c27768OooOOOo.f98083OooOo = null;
                c27768OooOOOo.f98086OooOoO0 = r115;
                c27768OooOOOo.f98088OooOoo0 = 6;
                Object objOooOO0O22 = r23.OooOO0O(r123, c27768OooOOOo);
                r22 = r23;
                r114 = r115;
                break;
            case 7:
                Throwable th3 = (Throwable) c27768OooOOOo.f98084OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOOO);
                throw th3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static OooO00o OooO0oO(SyncEvent syncEvent) {
        return ((syncEvent instanceof SyncEvent.LocalModified) || (syncEvent instanceof SyncEvent.CloudModified) || (syncEvent instanceof SyncEvent.LocalDeleted) || (syncEvent instanceof SyncEvent.CloudDeleted)) ? OooO00o.f98000OooOo : ((syncEvent instanceof SyncEvent.RequestPush) || (syncEvent instanceof SyncEvent.RequestPull) || (syncEvent instanceof SyncEvent.RequestResolve)) ? OooO00o.f98003OooOoO0 : OooO00o.f98001OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        r2.f97974OooOo0o = r12;
        r2.f97973OooOo = r4;
        r2.f97976OooOoO0 = r10;
        r2.f97975OooOoO = r9;
        r2.f97977OooOoOO = r11;
        r2.f97979OooOoo0 = r0;
        r2.f97978OooOoo = r7;
        r8 = true;
        r2.f97982Oooo000 = 1;
        r5 = r6.invoke(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e2, code lost:
    
        if (r5 != r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        r7 = r0;
        r0 = r5;
        r5 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e5 -> B:31:0x00eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27751OooO c27751OooO;
        String str2;
        OooO0O0 oooO0O0;
        C27755OooO0Oo c27755OooO0Oo;
        ConcurrentLinkedDeque<OooO0OO> concurrentLinkedDeque;
        int i2;
        int i3;
        OooO0OO oooO0OOPollFirst;
        C34406OooO00o.C20358OooO00o c20358OooO00o;
        Object value;
        if (abstractC32479OooO0OO instanceof C27751OooO) {
            c27751OooO = (C27751OooO) abstractC32479OooO0OO;
            int i4 = c27751OooO.f97982Oooo000;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c27751OooO.f97982Oooo000 = i4 - Integer.MIN_VALUE;
            } else {
                c27751OooO = new C27751OooO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27751OooO.f97980OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i5 = c27751OooO.f97982Oooo000;
        int i6 = 0;
        if (i5 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str2 = str;
            OooO0O0 oooO0O02 = this.f97991OooO0o.get(str2);
            if (oooO0O02 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0O0 = oooO0O02;
            c27755OooO0Oo = this;
            concurrentLinkedDeque = oooO0O02.f98004OooO00o;
            i2 = i;
            i3 = 0;
            while (true) {
                synchronized (concurrentLinkedDeque) {
                }
                c20358OooO00o.OooOOO0("SyncScheduler");
                c20358OooO00o.OooO0OO("eventProcessor not set", new Object[0]);
                i6 = 0;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = c27751OooO.f97978OooOoo;
            int i8 = c27751OooO.f97979OooOoo0;
            SyncEvent syncEvent = c27751OooO.f97977OooOoOO;
            concurrentLinkedDeque = c27751OooO.f97975OooOoO;
            oooO0O0 = c27751OooO.f97976OooOoO0;
            String str3 = c27751OooO.f97973OooOo;
            c27755OooO0Oo = c27751OooO.f97974OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            int i9 = i7;
            str2 = str3;
            SyncEvent syncEvent2 = syncEvent;
            boolean z = true;
            SyncPhase syncPhase = (SyncPhase) obj;
            if (syncPhase != null && SyncStateKt.isStable(syncPhase) == z) {
                oooO0O0.f98005OooO0O0 = null;
                C33781o00o0O c33781o00o0O = c27755OooO0Oo.f97990OooO0Oo;
                do {
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO0o((Set) value, str2)));
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o2, "SyncScheduler", "Processing Worker #", i8, ": meta ");
                sbOooO00o.append(str2);
                sbOooO00o.append(" returned to stable phase (");
                sbOooO00o.append(syncPhase);
                sbOooO00o.append(")");
                c20358OooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            if (syncPhase == null) {
                c27755OooO0Oo.OooOO0o(syncEvent2);
            }
            i2 = i8;
            i6 = 0;
            i3 = i9;
            while (true) {
                synchronized (concurrentLinkedDeque) {
                    oooO0OOPollFirst = concurrentLinkedDeque.pollFirst();
                }
                if (oooO0OOPollFirst == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o2 = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o3, "SyncScheduler", "Processing Worker #", i2, " finished meta ");
                    sbOooO00o2.append(str2);
                    sbOooO00o2.append(" (");
                    sbOooO00o2.append(i3);
                    sbOooO00o2.append(" events)");
                    c20358OooO00o3.OooO0o0(sbOooO00o2.toString(), new Object[i6]);
                    return C32460OooOooO.f116667OooO00o;
                }
                i3++;
                syncEvent2 = oooO0OOPollFirst.f98006OooO00o;
                long jCurrentTimeMillis = System.currentTimeMillis() - oooO0OOPollFirst.f98007OooO0O0;
                c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o3 = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "SyncScheduler", "Processing Worker #", i2, " processing event #");
                C21036OooOOo0.OooO0Oo(i3, " for meta ", str2, " (queued ", sbOooO00o3);
                sbOooO00o3.append(jCurrentTimeMillis);
                sbOooO00o3.append("ms): ");
                sbOooO00o3.append(syncEvent2);
                c20358OooO00o.OooO0o0(sbOooO00o3.toString(), new Object[0]);
                C27723OooO0O0.OooO00o oooO00o = c27755OooO0Oo.f97998OooOOO;
                if (oooO00o != null) {
                    break;
                }
                c20358OooO00o.OooOOO0("SyncScheduler");
                c20358OooO00o.OooO0OO("eventProcessor not set", new Object[0]);
                i6 = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27759OooO0o0 c27759OooO0o0;
        C27755OooO0Oo c27755OooO0Oo;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27759OooO0o0) {
            c27759OooO0o0 = (C27759OooO0o0) abstractC32479OooO0OO;
            int i = c27759OooO0o0.f98036OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27759OooO0o0.f98036OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27759OooO0o0 = new C27759OooO0o0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27759OooO0o0.f98035OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27759OooO0o0.f98036OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27759OooO0o0.f98033OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f97994OooO0oo;
            c27759OooO0o0.f98032OooOo = c33898OooO0Oo2;
            c27759OooO0o0.f98036OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c27759OooO0o0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c27759OooO0o0.f98032OooOo;
            c27755OooO0Oo = c27759OooO0o0.f98033OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            c27755OooO0Oo.f97991OooO0o.clear();
            c27755OooO0Oo.f97993OooO0oO.clear();
            C33781o00o0O c33781o00o0O = c27755OooO0Oo.f97990OooO0Oo;
            C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c34438OooOoo0);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SyncScheduler");
            c20358OooO00o.OooOO0O("All queues have been forcibly cleared", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27758OooO0o c27758OooO0o;
        C33898OooO0Oo c33898OooO0Oo;
        C27755OooO0Oo c27755OooO0Oo;
        Object value;
        if (abstractC32479OooO0OO instanceof C27758OooO0o) {
            c27758OooO0o = (C27758OooO0o) abstractC32479OooO0OO;
            int i = c27758OooO0o.f98031OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27758OooO0o.f98031OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27758OooO0o = new C27758OooO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27758OooO0o.f98028OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27758OooO0o.f98031OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27758OooO0o.f98027OooOo0o = this;
            c27758OooO0o.f98026OooOo = str;
            c33898OooO0Oo = this.f97994OooO0oo;
            c27758OooO0o.f98029OooOoO0 = c33898OooO0Oo;
            c27758OooO0o.f98031OooOoo0 = 1;
            if (c33898OooO0Oo.OooO00o(c27758OooO0o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = c27758OooO0o.f98029OooOoO0;
            String str2 = c27758OooO0o.f98026OooOo;
            c27755OooO0Oo = c27758OooO0o.f98027OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            str = str2;
        }
        try {
            c27755OooO0Oo.f97991OooO0o.remove(str);
            c27755OooO0Oo.f97993OooO0oO.remove(str);
            C33781o00o0O c33781o00o0O = c27755OooO0Oo.f97990OooO0Oo;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO0o((Set) value, str)));
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SyncScheduler");
            c20358OooO00o.OooOO0O("Queue for meta " + str + " has been forcibly cleared", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27760OooO0oO c27760OooO0oO;
        C27755OooO0Oo c27755OooO0Oo;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27760OooO0oO) {
            c27760OooO0oO = (C27760OooO0oO) abstractC32479OooO0OO;
            int i = c27760OooO0oO.f98041OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27760OooO0oO.f98041OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27760OooO0oO = new C27760OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27760OooO0oO.f98040OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27760OooO0oO.f98041OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27760OooO0oO.f98038OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f97994OooO0oo;
            c27760OooO0oO.f98037OooOo = c33898OooO0Oo2;
            c27760OooO0oO.f98041OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c27760OooO0oO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c27760OooO0oO.f98037OooOo;
            c27755OooO0Oo = c27760OooO0oO.f98038OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            return OooOo.o0OO00O(c27755OooO0Oo.f97993OooO0oO);
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    public final void OooO0o0(SyncEvent event) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object value;
        OooO0O0 oooO0O0PutIfAbsent;
        kotlin.jvm.internal.OooOOO0.OooO0oO(event, "event");
        String id = event.getId();
        ConcurrentHashMap<String, OooO0O0> concurrentHashMap = this.f97991OooO0o;
        OooO0O0 oooO0O0 = concurrentHashMap.get(id);
        if (oooO0O0 == null && (oooO0O0PutIfAbsent = concurrentHashMap.putIfAbsent(id, (oooO0O0 = new OooO0O0(null)))) != null) {
            oooO0O0 = oooO0O0PutIfAbsent;
        }
        OooO0O0 oooO0O02 = oooO0O0;
        ConcurrentLinkedDeque<OooO0OO> concurrentLinkedDeque = oooO0O02.f98004OooO00o;
        OooO0OO oooO0OO = new OooO0OO(event);
        synchronized (concurrentLinkedDeque) {
            try {
                ArrayList arrayListO0ooOoO = OooOo.o0ooOoO(concurrentLinkedDeque);
                OooO00o oooO00oOooO0oO = OooO0oO(event);
                int size = arrayListO0ooOoO.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        arrayList = arrayListO0ooOoO;
                        i = -1;
                        break;
                    }
                    SyncEvent syncEvent = ((OooO0OO) arrayListO0ooOoO.get(i)).f98006OooO00o;
                    if (OooO0oO(syncEvent) == oooO00oOooO0oO && event.getClass() == syncEvent.getClass()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("SyncScheduler");
                        arrayList = arrayListO0ooOoO;
                        c20358OooO00o.OooO00o("Deduplication: found old event " + syncEvent.getName() + " at index " + i + ", (queued " + (System.currentTimeMillis() - ((OooO0OO) arrayListO0ooOoO.get(i)).f98007OooO0O0) + "ms ago), replacing with new event for meta " + id, new Object[0]);
                        break;
                    }
                    i++;
                    arrayListO0ooOoO = arrayListO0ooOoO;
                }
                if (i >= 0) {
                    arrayList2 = arrayList;
                    arrayList2.set(i, oooO0OO);
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("SyncScheduler");
                    c20358OooO00o2.OooO00o("Event replaced at position " + i + " for meta " + id + ": " + event, new Object[0]);
                } else {
                    arrayList2 = arrayList;
                    int size2 = arrayList2.size();
                    int size3 = arrayList2.size();
                    int i2 = 0;
                    boolean z = false;
                    while (true) {
                        if (i2 >= size3) {
                            break;
                        }
                        if (OooO0oO(((OooO0OO) arrayList2.get(i2)).f98006OooO00o) == oooO00oOooO0oO) {
                            z = true;
                        } else if (z) {
                            size2 = i2;
                            break;
                        }
                        i2++;
                    }
                    if (!z) {
                        List<OooO00o> list = this.f97989OooO0OO;
                        int iIndexOf = list.indexOf(oooO00oOooO0oO);
                        int size4 = arrayList2.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size4) {
                                size2 = arrayList2.size();
                                break;
                            } else {
                                if (list.indexOf(OooO0oO(((OooO0OO) arrayList2.get(i3)).f98006OooO00o)) > iIndexOf) {
                                    size2 = i3;
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    arrayList2.add(size2, oooO0OO);
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("SyncScheduler");
                    c20358OooO00o3.OooO0o0("Event inserted at position " + size2 + " for meta " + id + ": " + event.getName(), new Object[0]);
                }
                concurrentLinkedDeque.clear();
                concurrentLinkedDeque.addAll(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (OooO0oO(event) == OooO00o.f98003OooOoO0) {
            C33781o00o0O c33781o00o0O = this.f97990OooO0Oo;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO((Set) value, id)));
        }
        C33822OooO0OO c33822OooO0OO = this.f97999OooOOO0;
        if (c33822OooO0OO != null) {
            C33609OooO0oo.OooO0OO(c33822OooO0OO, null, null, new OooO0o(id, concurrentLinkedDeque, oooO0O02, null), 3);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o4.OooOOO0("SyncScheduler");
        c20358OooO00o4.OooOO0O(androidx.core.database.OooO00o.OooO00o("WorkerScope is null, event ", event.getName(), " for meta ", id, " may be delayed"), new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x002e, LOOP:0: B:29:0x006b->B:31:0x0071, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:28:0x0063, B:29:0x006b, B:31:0x0071, B:24:0x0051), top: B:36:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27761OooO0oo c27761OooO0oo;
        C27755OooO0Oo c27755OooO0Oo;
        C27755OooO0Oo c27755OooO0Oo2;
        Iterator it;
        if (abstractC32479OooO0OO instanceof C27761OooO0oo) {
            c27761OooO0oo = (C27761OooO0oo) abstractC32479OooO0OO;
            int i = c27761OooO0oo.f98046OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27761OooO0oo.f98046OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27761OooO0oo = new C27761OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27761OooO0oo.f98045OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27761OooO0oo.f98046OooOoOO;
        try {
        } catch (Throwable th) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0Oo(th, androidx.core.app.OooO.OooO0O0(c20358OooO00o, "SyncScheduler", "Failed to reset stuck state for ", str), new Object[0]);
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            c27761OooO0oo.f98043OooOo0o = this;
            c27761OooO0oo.f98042OooOo = str;
            c27761OooO0oo.f98046OooOoOO = 1;
            if (OooO0Oo(str, c27761OooO0oo) != enumC32485OooO00o) {
                c27755OooO0Oo = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c27761OooO0oo.f98042OooOo;
            c27755OooO0Oo2 = c27761OooO0oo.f98043OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            it = ((List) objOooO0Oo).iterator();
            while (it.hasNext()) {
                c27755OooO0Oo2.OooO0o0((SyncEvent) it.next());
            }
            return C32460OooOooO.f116667OooO00o;
        }
        str = c27761OooO0oo.f98042OooOo;
        c27755OooO0Oo = c27761OooO0oo.f98043OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO0Oo);
        o000OOo o000ooo2 = c27755OooO0Oo.f97987OooO00o;
        o000OOo.OooO00o oooO00o = o000OOo.OooO00o.f97587OooOo0o;
        c27761OooO0oo.f98043OooOo0o = c27755OooO0Oo;
        c27761OooO0oo.f98042OooOo = str;
        c27761OooO0oo.f98046OooOoOO = 2;
        objOooO0Oo = o000ooo2.OooO0Oo(str, oooO00o, c27761OooO0oo);
        if (objOooO0Oo != enumC32485OooO00o) {
            c27755OooO0Oo2 = c27755OooO0Oo;
            it = ((List) objOooO0Oo).iterator();
            while (it.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f4 -> B:38:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0106 -> B:42:0x0103). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27762OooOO0 c27762OooOO0;
        String str2;
        OooO0O0 oooO0O0;
        C27755OooO0Oo c27755OooO0Oo;
        ConcurrentLinkedDeque<OooO0OO> concurrentLinkedDeque;
        int i2;
        int i3;
        OooO0OO oooO0OOPollFirst;
        int i4 = 1;
        if (abstractC32479OooO0OO instanceof C27762OooOO0) {
            c27762OooOO0 = (C27762OooOO0) abstractC32479OooO0OO;
            int i5 = c27762OooOO0.f98056Oooo000;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c27762OooOO0.f98056Oooo000 = i5 - Integer.MIN_VALUE;
            } else {
                c27762OooOO0 = new C27762OooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27762OooOO0.f98054OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i6 = c27762OooOO0.f98056Oooo000;
        if (i6 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            str2 = str;
            OooO0O0 oooO0O02 = this.f97991OooO0o.get(str2);
            if (oooO0O02 == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            oooO0O0 = oooO0O02;
            c27755OooO0Oo = this;
            concurrentLinkedDeque = oooO0O02.f98004OooO00o;
            i2 = i;
            i3 = 0;
            synchronized (concurrentLinkedDeque) {
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = c27762OooOO0.f98052OooOoo;
            int i8 = c27762OooOO0.f98053OooOoo0;
            SyncEvent syncEvent = c27762OooOO0.f98051OooOoOO;
            concurrentLinkedDeque = c27762OooOO0.f98049OooOoO;
            oooO0O0 = c27762OooOO0.f98050OooOoO0;
            String str3 = c27762OooOO0.f98047OooOo;
            c27755OooO0Oo = c27762OooOO0.f98048OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            int i9 = 1;
            int i10 = i7;
            str2 = str3;
            if (((SyncPhase) obj) == null) {
                c27755OooO0Oo.OooOO0o(syncEvent);
            }
            i2 = i8;
            i3 = i10;
            i4 = i9;
            synchronized (concurrentLinkedDeque) {
                oooO0OOPollFirst = concurrentLinkedDeque.pollFirst();
            }
            if (oooO0OOPollFirst == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "SyncScheduler", "Stable Worker #", i2, " finished meta ");
                sbOooO00o.append(str2);
                sbOooO00o.append(" (");
                sbOooO00o.append(i3);
                sbOooO00o.append(" events)");
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            i3 += i4;
            SyncEvent syncEvent2 = oooO0OOPollFirst.f98006OooO00o;
            C27762OooOO0 c27762OooOO02 = c27762OooOO0;
            long jCurrentTimeMillis = System.currentTimeMillis() - oooO0OOPollFirst.f98007OooO0O0;
            c27755OooO0Oo.getClass();
            if ((syncEvent2 instanceof SyncEvent.RequestPush) || (syncEvent2 instanceof SyncEvent.RequestPull) || (syncEvent2 instanceof SyncEvent.RequestResolve)) {
                synchronized (concurrentLinkedDeque) {
                    concurrentLinkedDeque.addFirst(oooO0OOPollFirst);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                }
                oooO0O0.f98005OooO0O0 = EnumC27756OooO0o0.f98020OooOo;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("SyncScheduler");
                c20358OooO00o2.OooO00o(androidx.concurrent.futures.OooO00o.OooO0OO(C21009OooOooO.OooO0OO(i2, "Stable Worker #", " handing off meta ", str2, " to processing workers (trigger event: "), syncEvent2.getName(), ")"), new Object[0]);
                C33695OooO0o0 c33695OooO0o0 = c27755OooO0Oo.f97995OooOO0;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                c33695OooO0o0.OooO0o0(c32460OooOooO2);
                return c32460OooOooO2;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o2 = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o3, "SyncScheduler", "Stable Worker #", i2, " processing event #");
            C21036OooOOo0.OooO0Oo(i3, " for meta ", str2, " (queued ", sbOooO00o2);
            sbOooO00o2.append(jCurrentTimeMillis);
            sbOooO00o2.append("ms): ");
            sbOooO00o2.append(syncEvent2);
            c20358OooO00o3.OooO0o0(sbOooO00o2.toString(), new Object[0]);
            C27723OooO0O0.OooO00o oooO00o = c27755OooO0Oo.f97998OooOOO;
            if (oooO00o != null) {
                c27762OooOO02.f98048OooOo0o = c27755OooO0Oo;
                c27762OooOO02.f98047OooOo = str2;
                c27762OooOO02.f98050OooOoO0 = oooO0O0;
                c27762OooOO02.f98049OooOoO = concurrentLinkedDeque;
                c27762OooOO02.f98051OooOoOO = syncEvent2;
                c27762OooOO02.f98053OooOoo0 = i2;
                c27762OooOO02.f98052OooOoo = i3;
                i9 = 1;
                c27762OooOO02.f98056Oooo000 = 1;
                Object objInvoke = oooO00o.invoke(syncEvent2, c27762OooOO02);
                if (objInvoke == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                i8 = i2;
                obj = objInvoke;
                i10 = i3;
                c27762OooOO0 = c27762OooOO02;
                syncEvent = syncEvent2;
                if (((SyncPhase) obj) == null) {
                }
                i2 = i8;
                i3 = i10;
                i4 = i9;
                synchronized (concurrentLinkedDeque) {
                }
            } else {
                i9 = 1;
                c20358OooO00o3.OooOOO0("SyncScheduler");
                c20358OooO00o3.OooO0OO("eventProcessor not set", new Object[0]);
                c27762OooOO0 = c27762OooOO02;
                i4 = i9;
                synchronized (concurrentLinkedDeque) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOO0O(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27764OooOO0o c27764OooOO0o;
        C33898OooO0Oo c33898OooO0Oo;
        C27755OooO0Oo c27755OooO0Oo;
        Object value;
        Object value2;
        if (abstractC32479OooO0OO instanceof C27764OooOO0o) {
            c27764OooOO0o = (C27764OooOO0o) abstractC32479OooO0OO;
            int i = c27764OooOO0o.f98068OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27764OooOO0o.f98068OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27764OooOO0o = new C27764OooOO0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27764OooOO0o.f98065OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27764OooOO0o.f98068OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = this.f97994OooO0oo;
            c27764OooOO0o.f98064OooOo0o = this;
            c27764OooOO0o.f98063OooOo = str;
            c27764OooOO0o.f98066OooOoO0 = c33898OooO0Oo;
            c27764OooOO0o.f98068OooOoo0 = 1;
            if (c33898OooO0Oo.OooO00o(c27764OooOO0o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = c27764OooOO0o.f98066OooOoO0;
            String str2 = c27764OooOO0o.f98063OooOo;
            c27755OooO0Oo = c27764OooOO0o.f98064OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            str = str2;
        }
        try {
            c27755OooO0Oo.f97993OooO0oO.remove(str);
            OooO0O0 oooO0O0 = c27755OooO0Oo.f97991OooO0o.get(str);
            if (oooO0O0 != null && !oooO0O0.f98004OooO00o.isEmpty()) {
                EnumC27756OooO0o0 enumC27756OooO0o0 = oooO0O0.f98005OooO0O0;
                Object objOooO0o0 = ((enumC27756OooO0o0 == null ? -1 : C19870OooO0Oo.f98008OooO00o[enumC27756OooO0o0.ordinal()]) == 1 ? c27755OooO0Oo.f97995OooOO0 : c27755OooO0Oo.f97986OooO).OooO0o0(C32460OooOooO.f116667OooO00o);
                if (objOooO0o0 instanceof C33702OooOOO.OooO0O0) {
                    C33702OooOOO.OooO00o(objOooO0o0);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("SyncScheduler");
                    c20358OooO00o.OooOO0O("Failed to re-signal meta " + str, new Object[0]);
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("SyncScheduler");
                Object obj2 = oooO0O0.f98005OooO0O0;
                if (obj2 == null) {
                    obj2 = "stable";
                }
                c20358OooO00o2.OooO00o("Meta " + str + " has pending events, re-signaled to " + obj2, new Object[0]);
            } else if (oooO0O0 == null || !oooO0O0.f98004OooO00o.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("SyncScheduler");
                c20358OooO00o3.OooO00o("Meta " + str + " queue already removed", new Object[0]);
                C33781o00o0O c33781o00o0O = c27755OooO0Oo.f97990OooO0Oo;
                do {
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO0o((Set) value, str)));
            } else {
                c27755OooO0Oo.f97991OooO0o.remove(str);
                C33781o00o0O c33781o00o0O2 = c27755OooO0Oo.f97990OooO0Oo;
                do {
                    value2 = c33781o00o0O2.getValue();
                } while (!c33781o00o0O2.OooO(value2, C34449Oooo0oo.OooO0o((Set) value2, str)));
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("SyncScheduler");
                c20358OooO00o4.OooO00o("Meta " + str + " queue cleaned up", new Object[0]);
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            c33898OooO0Oo.OooOOO0(null);
            return c32460OooOooO;
        } catch (Throwable th) {
            c33898OooO0Oo.OooOOO0(null);
            throw th;
        }
    }

    public final void OooOO0o(SyncEvent syncEvent) {
        C33781o00o0O c33781o00o0O;
        Object value;
        if (OooO0oO(syncEvent) == OooO00o.f98003OooOoO0) {
            do {
                c33781o00o0O = this.f97990OooO0Oo;
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO0o((Set) value, syncEvent.getId())));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27765OooOOO c27765OooOOO;
        C27755OooO0Oo c27755OooO0Oo;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27765OooOOO) {
            c27765OooOOO = (C27765OooOOO) abstractC32479OooO0OO;
            int i = c27765OooOOO.f98073OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27765OooOOO.f98073OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27765OooOOO = new C27765OooOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27765OooOOO.f98072OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27765OooOOO.f98073OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27765OooOOO.f98070OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f97994OooO0oo;
            c27765OooOOO.f98069OooOo = c33898OooO0Oo2;
            c27765OooOOO.f98073OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c27765OooOOO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c27765OooOOO.f98069OooOo;
            c27755OooO0Oo = c27765OooOOO.f98070OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            String str = (String) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOOoo(C33576OooOOOo.OooOOO0(C34447Oooo0o0.OooOOOo(c27755OooO0Oo.f97991OooO0o), new C26364OooO0oo(c27755OooO0Oo, 1)), new C27754OooO0OO(0)));
            if (str != null) {
                c27755OooO0Oo.f97993OooO0oO.add(str);
            } else {
                str = null;
            }
            return str;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27766OooOOO0 c27766OooOOO0;
        C27755OooO0Oo c27755OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27766OooOOO0) {
            c27766OooOOO0 = (C27766OooOOO0) abstractC32479OooO0OO;
            int i = c27766OooOOO0.f98076OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27766OooOOO0.f98076OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27766OooOOO0 = new C27766OooOOO0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27766OooOOO0.f98074OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27766OooOOO0.f98076OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27766OooOOO0.f98075OooOo0o = this;
            c27766OooOOO0.f98076OooOoO = 1;
            if (OooOOo0(z, c27766OooOOO0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c27755OooO0Oo = c27766OooOOO0.f98075OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c27755OooO0Oo.OooOOOo();
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOOO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27767OooOOOO c27767OooOOOO;
        C27755OooO0Oo c27755OooO0Oo;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27767OooOOOO) {
            c27767OooOOOO = (C27767OooOOOO) abstractC32479OooO0OO;
            int i = c27767OooOOOO.f98082OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27767OooOOOO.f98082OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27767OooOOOO = new C27767OooOOOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27767OooOOOO.f98081OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27767OooOOOO.f98082OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33898OooO0Oo c33898OooO0Oo2 = this.f97994OooO0oo;
            c27767OooOOOO.f98079OooOo0o = this;
            c27767OooOOOO.f98078OooOo = c33898OooO0Oo2;
            c27767OooOOOO.f98082OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(c27767OooOOOO) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27755OooO0Oo = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = c27767OooOOOO.f98078OooOo;
            c27755OooO0Oo = c27767OooOOOO.f98079OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            String str = (String) C33576OooOOOo.OooOOOO(C33576OooOOOo.OooOOoo(C33576OooOOOo.OooOOO0(C34447Oooo0o0.OooOOOo(c27755OooO0Oo.f97991OooO0o), new C27752OooO00o(c27755OooO0Oo, 0)), new C27753OooO0O0()));
            if (str != null) {
                c27755OooO0Oo.f97993OooO0oO.add(str);
                OooO0O0 oooO0O0 = c27755OooO0Oo.f97991OooO0o.get(str);
                if (oooO0O0 != null) {
                    oooO0O0.f98005OooO0O0 = EnumC27756OooO0o0.f98021OooOo0o;
                }
            } else {
                str = null;
            }
            return str;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    public final void OooOOOo() {
        if (this.f97996OooOO0O) {
            return;
        }
        C33664o00000Oo c33664o00000OoOooO00o = o00000.OooOO0.OooO00o();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33822OooO0OO c33822OooO0OOOooO00o = C33633Oooo0.OooO00o(InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(c33664o00000OoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0));
        this.f97997OooOO0o = c33664o00000OoOooO00o;
        this.f97999OooOOO0 = c33822OooO0OOOooO00o;
        this.f97996OooOO0O = true;
        int valueAsLong = (int) this.f97988OooO0O0.f97201OooO00o.getValueAsLong("rconfig_cloud_sync_worker_count");
        if (valueAsLong < 2) {
            valueAsLong = 2;
        }
        for (int i = 0; i < valueAsLong; i++) {
            C33609OooO0oo.OooO0OO(c33822OooO0OOOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C27757OooO0oO(i, this, null), 2);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("SyncScheduler");
        c20358OooO00o.OooO0o0(C20856OooooOo.OooO0O0("SyncScheduler started with ", valueAsLong, " workers (1 stable + ", " processing)", valueAsLong - 1), new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r2.OooO0OO(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOo0(boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27769OooOOo0 c27769OooOOo0;
        C27755OooO0Oo c27755OooO0Oo;
        if (abstractC32479OooO0OO instanceof C27769OooOOo0) {
            c27769OooOOo0 = (C27769OooOOo0) abstractC32479OooO0OO;
            int i = c27769OooOOo0.f98093OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27769OooOOo0.f98093OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27769OooOOo0 = new C27769OooOOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27769OooOOo0.f98092OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27769OooOOo0.f98093OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!this.f97996OooOO0O) {
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("SyncScheduler");
            c20358OooO00o.OooO0o0("Stopping SyncScheduler, clearQueues=" + z, new Object[0]);
            C33664o00000Oo c33664o00000Oo = this.f97997OooOO0o;
            this.f97997OooOO0o = null;
            this.f97999OooOOO0 = null;
            this.f97996OooOO0O = false;
            if (c33664o00000Oo != null) {
                c27769OooOOo0.f98090OooOo0o = this;
                c27769OooOOo0.f98089OooOo = z;
                c27769OooOOo0.f98093OooOoOO = 1;
                c33664o00000Oo.cancel((CancellationException) null);
                Object objJoin = c33664o00000Oo.join(c27769OooOOo0);
                if (objJoin != enumC32485OooO00o) {
                    objJoin = C32460OooOooO.f116667OooO00o;
                }
            }
            c27755OooO0Oo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            z = c27769OooOOo0.f98089OooOo;
            c27755OooO0Oo = c27769OooOOo0.f98090OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!z) {
            return C32460OooOooO.f116667OooO00o;
        }
        c27769OooOOo0.f98090OooOo0o = null;
        c27769OooOOo0.f98093OooOoOO = 2;
    }
}
