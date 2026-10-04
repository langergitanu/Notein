package o0Oo0o00;

import Oooo.C20813OooO0o0;
import android.content.Context;
import androidx.lifecycle.AbstractC22019Ooooooo;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.domain.models.cloudsync.CloudMetaLocal;
import com.orion.notein.domain.models.cloudsync.CloudMetaType;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.cloudsync.SyncEvent;
import com.orion.notein.domain.models.cloudsync.SyncPhase;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.global.R;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o00Oo0o0.C25048OooO0O0;
import o00o00O0.C25252OooO0Oo;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0o.C27563o00oOo0O;
import o0OOo0o.C27570o00oOoo0;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0o.o00000O;
import o0OOo0o0.InterfaceC27605OooO00o;
import o0OOo0oo.C27616OooO0o;
import o0OOo0oo.C27621OooOO0O;
import o0OOo0oo.C27622OooOO0o;
import o0OOo0oo.C27635OooOoO;
import o0OOo0oo.C27658OoooOOO;
import o0OOo0oo.C27659OoooOOo;
import o0OOo0oo.C27684o0000o0;
import o0OOo0oo.o0000OOO;
import o0OOo0oo.o0OO00O;
import o0OOoO00.C27723OooO0O0;
import o0Oo0O0O.C28062OooOOOo;
import o0oOoOo.C31032OooO0OO;
import o0oOoOo.C31081Ooooo00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33763OoooOOO;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.C33779o00Oo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0OoO.C33799OooOO0O;
import oO0o0Ooo.C33822OooO0OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.C34449Oooo0oo;

/* JADX INFO: renamed from: o0Oo0o00.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0Oo0o00/OooooO0;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28201OooooO0 extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000OOO f99935OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25048OooO0O0 f99936OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000O f99937OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO00O f99938OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C27616OooO0o f99939OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27635OooOoO f99940OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final C27684o0000o0 f99941OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f99942OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final C27600o0ooOO0 f99943OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C27129OoooOOO f99944OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C27570o00oOoo0 f99945OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f99946OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Context f99947OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final C33781o00o0O f99948OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public o00000OO f99949OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C33781o00o0O f99950OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C33781o00o0O f99951OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final C33769Ooooo0o f99952OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final C33769Ooooo0o f99953OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final C33781o00o0O f99954OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C33781o00o0O f99955OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33781o00o0O f99956OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C33781o00o0O f99957OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final LinkedHashSet f99958OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C33772OooooOo f99959OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C33772OooooOo f99960OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Object f99961OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final String f99962OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C33769Ooooo0o f99963Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C33763OoooOOO f99964Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C33769Ooooo0o f99965Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C33769Ooooo0o f99966Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C33769Ooooo0o f99967Oooo0O0;

    /* JADX INFO: renamed from: o0Oo0o00.OooooO0$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f99968OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f99969OooO0O0;

        static {
            int[] iArr = new int[EnumC27285OooO.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC27285OooO enumC27285OooO = EnumC27285OooO.f95076OooOo0o;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC27285OooO enumC27285OooO2 = EnumC27285OooO.f95076OooOo0o;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC27285OooO enumC27285OooO3 = EnumC27285OooO.f95076OooOo0o;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC27285OooO enumC27285OooO4 = EnumC27285OooO.f95076OooOo0o;
                iArr[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[SyncPhase.values().length];
            try {
                iArr2[SyncPhase.PACKAGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SyncPhase.UPLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SyncPhase.DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SyncPhase.RESTORING.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SyncPhase.RESOLVING_CONFLICT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SyncPhase.DIRTY_CLOUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SyncPhase.DIRTY_LOCAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            f99968OooO00o = iArr2;
            int[] iArr3 = new int[CloudMetaType.values().length];
            try {
                iArr3[CloudMetaType.NOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CloudMetaType.FOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CloudMetaType.TEMPLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            f99969OooO0O0 = iArr3;
        }
    }

    /* JADX INFO: renamed from: o0Oo0o00.OooooO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$testNetworkConnection$1", m80623f = "CloudSyncViewModel.kt", m80624l = {578}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f99971OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return C28201OooooO0.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object objOooO00o;
            Object value;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f99971OooOo0o;
            C28201OooooO0 c28201OooooO0 = C28201OooooO0.this;
            boolean zOooO0O0 = true;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C27616OooO0o c27616OooO0o = c28201OooooO0.f99939OooO0oO;
                this.f99971OooOo0o = 1;
                objOooO00o = c27616OooO0o.OooO00o(this);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            if (!(objOooO00o instanceof C32445OooOOOO.OooO00o)) {
                return C32460OooOooO.f116667OooO00o;
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o instanceof CloudSyncError) {
                zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudSyncError) thOooO00o).getErrorCode(), CloudSyncError.CODE_NETWORK);
            } else if (!(thOooO00o instanceof IOException)) {
                zOooO0O0 = false;
            }
            if (zOooO0O0) {
                C33781o00o0O c33781o00o0O = c28201OooooO0.f99956OooOoO;
                do {
                    value = c33781o00o0O.getValue();
                } while (!c33781o00o0O.OooO(value, C34449Oooo0oo.OooO((Set) value, CloudSyncError.CODE_NETWORK)));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C28201OooooO0(C27659OoooOOo getSyncQueueStateUseCase, C25048OooO0O0 c25048OooO0O0, o0OO00O o0oo00o2, o0OOo0oo.o0ooOOo o0ooooo2, o00000O getRemoteConfigUseCase, C20813OooO0o0 c20813OooO0o0, C27658OoooOOO c27658OoooOOO, C27616OooO0o aboutCloudSyncUseCase, C27635OooOoO c27635OooOoO, o0000OOO syncAllUseCase, C27684o0000o0 syncNotificationBus, InterfaceC27313OooOoo0 noteMetaRepo, C27600o0ooOO0 c27600o0ooOO0, C27570o00oOoo0 c27570o00oOoo0, C27129OoooOOO c27129OoooOOO, o0000o0O.OooOO0 dataStore, Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getSyncQueueStateUseCase, "getSyncQueueStateUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(getRemoteConfigUseCase, "getRemoteConfigUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(aboutCloudSyncUseCase, "aboutCloudSyncUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(syncAllUseCase, "syncAllUseCase");
        kotlin.jvm.internal.OooOOO0.OooO0oO(syncNotificationBus, "syncNotificationBus");
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataStore, "dataStore");
        this.f99936OooO0Oo = c25048OooO0O0;
        this.f99938OooO0o0 = o0oo00o2;
        this.f99937OooO0o = getRemoteConfigUseCase;
        this.f99939OooO0oO = aboutCloudSyncUseCase;
        this.f99940OooO0oo = c27635OooOoO;
        this.f99935OooO = syncAllUseCase;
        this.f99941OooOO0 = syncNotificationBus;
        this.f99942OooOO0O = noteMetaRepo;
        this.f99943OooOO0o = c27600o0ooOO0;
        this.f99945OooOOO0 = c27570o00oOoo0;
        this.f99944OooOOO = c27129OoooOOO;
        this.f99946OooOOOO = dataStore;
        this.f99947OooOOOo = context;
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(c34436OooOoOO);
        this.f99948OooOOo = c33781o00o0OOooO00o;
        this.f99950OooOOoo = C33784o00ooo.OooO00o(c34436OooOoOO);
        InterfaceC27605OooO00o interfaceC27605OooO00o = (InterfaceC27605OooO00o) c20813OooO0o0.f59765OooO00o;
        C33799OooOO0O c33799OooOO0OOooOoO = C25252OooO0Oo.OooOoO(interfaceC27605OooO00o.OooO0o0(), new C27621OooOO0O(null, c20813OooO0o0));
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
        C33822OooO0OO c33822OooO0OOOooO0oO = C33633Oooo0.OooO0oO(interfaceC33636Oooo00oOooO00o, executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO0 = C25252OooO0Oo.OooOoO0(c33799OooOO0OOooOoO, c33822OooO0OOOooO0oO, c33779o00Oo0OooO00o, c34434OooOoO);
        this.f99953OooOo00 = c33769Ooooo0oOooOoO0;
        C33769Ooooo0o c33769Ooooo0oOooOoO02 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOoO(interfaceC27605OooO00o.OooO0o0(), new C27622OooOO0o(null, c20813OooO0o0)), C33633Oooo0.OooO0oO(androidx.lifecycle.o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO03 = C25252OooO0Oo.OooOoO0(new C28212o00o0O(dataStore.getData()), C33633Oooo0.OooO0oO(androidx.lifecycle.o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0L);
        InterfaceC27605OooO00o interfaceC27605OooO00o2 = (InterfaceC27605OooO00o) c27658OoooOOO.f97276OooO00o;
        C33769Ooooo0o c33769Ooooo0oOooOoO04 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0o(C25252OooO0Oo.OooOO0(interfaceC27605OooO00o2.OooOo00(), interfaceC27605OooO00o2.Oooo0OO(EnumC27285OooO.f95075OooOo), interfaceC27605OooO00o2.Oooo0OO(EnumC27285OooO.f95078OooOoO0), interfaceC27605OooO00o2.Oooo0OO(EnumC27285OooO.f95077OooOoO), interfaceC27605OooO00o2.Oooo0OO(EnumC27285OooO.f95079OooOoOO), new o0OOo0oo.o000oOoO(null))), C33633Oooo0.OooO0oO(androidx.lifecycle.o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f99952OooOo0 = c33769Ooooo0oOooOoO04;
        C33822OooO0OO c33822OooO0OOOooO0oO2 = C33633Oooo0.OooO0oO(androidx.lifecycle.o0OoOo0.OooO00o(this), executorC33873OooO0O0);
        C33779o00Oo0 c33779o00Oo0OooO00o2 = InterfaceC33788ooOO.OooO00o.OooO00o(2);
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        C33769Ooooo0o c33769Ooooo0oOooOoO05 = C25252OooO0Oo.OooOoO0(getSyncQueueStateUseCase.f97277OooO00o, c33822OooO0OOOooO0oO2, c33779o00Oo0OooO00o2, c34438OooOoo0);
        Boolean bool = Boolean.FALSE;
        C33781o00o0O c33781o00o0OOooO00o2 = C33784o00ooo.OooO00o(bool);
        this.f99954OooOo0O = c33781o00o0OOooO00o2;
        C33781o00o0O c33781o00o0OOooO00o3 = C33784o00ooo.OooO00o(bool);
        this.f99955OooOo0o = c33781o00o0OOooO00o3;
        this.f99951OooOo = c33781o00o0OOooO00o3;
        C33781o00o0O c33781o00o0OOooO00o4 = C33784o00ooo.OooO00o(0);
        this.f99957OooOoO0 = c33781o00o0OOooO00o4;
        C33781o00o0O c33781o00o0OOooO00o5 = C33784o00ooo.OooO00o(c34438OooOoo0);
        this.f99956OooOoO = c33781o00o0OOooO00o5;
        this.f99958OooOoOO = new LinkedHashSet();
        C33772OooooOo c33772OooooOoOooO0O0 = C33773Oooooo.OooO0O0(0, 0, 6);
        this.f99960OooOoo0 = c33772OooooOoOooO0O0;
        this.f99959OooOoo = c33772OooooOoOooO0O0;
        this.f99961OooOooO = C34444Oooo0O0.OooO0oo(new C32443OooOOO(CloudSyncError.CODE_DISALLOW_TO_USE_CELLULAR, Integer.valueOf(R.string.desc_cloud_sync_network_strategy_issue)), new C32443OooOOO(CloudSyncError.CODE_AUTH_EXPIRED, Integer.valueOf(R.string.desc_cloud_sync_auth_expired_issue)), new C32443OooOOO(CloudSyncError.CODE_STORAGE_FULL, Integer.valueOf(R.string.desc_cloud_sync_storage_full_issue)), new C32443OooOOO(CloudSyncError.CODE_NETWORK, Integer.valueOf(R.string.desc_cloud_sync_network_error_issue)), new C32443OooOOO(CloudSyncError.CODE_HW_COMPONENT_NOT_AVAILABLE, Integer.valueOf(R.string.desc_cloud_sync_hw_component_not_installed_issue)), new C32443OooOOO(CloudSyncError.CODE_REMOTE_DISABLED, Integer.valueOf(R.string.desc_cloud_sync_remote_disabled_issue)), new C32443OooOOO(CloudSyncError.CODE_LOCK_BUSY, Integer.valueOf(R.string.desc_cloud_sync_lock_busy_issue)), new C32443OooOOO(CloudSyncError.CODE_LOCK_EXPIRED, Integer.valueOf(R.string.desc_cloud_sync_lock_expired_issue)));
        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(this), null, null, new C28197OoooOoO(this, null), 3);
        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(this), null, null, new C28198OoooOoo(this, null), 3);
        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(this), executorC33873OooO0O0, null, new C28199Ooooo00(this, null), 2);
        String string = context.getString(R.string.cloud_sync_unknow_filename);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        this.f99962OooOooo = string;
        this.f99964Oooo000 = new C33763OoooOOO(c33769Ooooo0oOooOoO04, aboutCloudSyncUseCase.f97105OooO00o.OooO00o(), new C28206OoooooO(3, null));
        C33769Ooooo0o c33769Ooooo0oOooOoO06 = C25252OooO0Oo.OooOoO0(new C33763OoooOOO(c33769Ooooo0oOooOoO02, c33781o00o0OOooO00o, new C28202OooooOO(3, null)), C33633Oooo0.OooO0oO(androidx.lifecycle.o0OoOo0.OooO00o(this), executorC33873OooO0O0), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34436OooOoOO);
        this.f99965Oooo00O = c33769Ooooo0oOooOoO06;
        this.f99966Oooo00o = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO06, c33769Ooooo0oOooOoO05, new C28218o0ooOoO(this, null)), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        C33769Ooooo0o c33769Ooooo0oOooOoO07 = C25252OooO0Oo.OooOoO0(C25252OooO0Oo.OooOO0O(C25252OooO0Oo.OooO0oo(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO06, c33781o00o0OOooO00o5, new C28209o00O0O(this, null)), 500L), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), c34434OooOoO);
        this.f99963Oooo0 = c33769Ooooo0oOooOoO07;
        this.f99967Oooo0O0 = C25252OooO0Oo.OooOoO0(C28062OooOOOo.OooO00o(c33769Ooooo0oOooOoO0, c33769Ooooo0oOooOoO02, c33769Ooooo0oOooOoO04, c33769Ooooo0oOooOoO03, c33781o00o0OOooO00o2, c33781o00o0OOooO00o4, C25252OooO0Oo.OooOoO0(new C28215o00ooo(c33769Ooooo0oOooOoO07), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), 0), new C28207Ooooooo(null)), androidx.lifecycle.o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0155, code lost:
    
        if (r15 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019d, code lost:
    
        if (r15 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x011d -> B:45:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0155 -> B:50:0x0159). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x017e -> B:53:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01a2 -> B:57:0x017a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01a4 -> B:57:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C28201OooooO0 c28201OooooO0, List list, Continuation continuation) throws Throwable {
        C28210o00Oo0 c28210o00Oo0;
        String strOooO0Oo;
        C28201OooooO0 c28201OooooO02;
        Map map;
        Iterator it;
        Iterator it2;
        C28201OooooO0 c28201OooooO03;
        Map map2;
        String str;
        Iterator it3;
        Object value;
        Iterator it4;
        c28201OooooO0.getClass();
        if (continuation instanceof C28210o00Oo0) {
            c28210o00Oo0 = (C28210o00Oo0) continuation;
            int i = c28210o00Oo0.f100005OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28210o00Oo0.f100005OooOooo = i - Integer.MIN_VALUE;
            } else {
                c28210o00Oo0 = new C28210o00Oo0(c28201OooooO0, continuation);
            }
        }
        Object objOooO0Oo = c28210o00Oo0.f100002OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28210o00Oo0.f100005OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            if (list.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            strOooO0Oo = c28201OooooO0.f99944OooOOO.OooO0Oo();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj : list) {
                CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(((CloudMetaLocal) obj).getMimeType());
                Object arrayList = linkedHashMap2.get(cloudMetaTypeFromMime);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(cloudMetaTypeFromMime, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            c28201OooooO02 = c28201OooooO0;
            map = linkedHashMap;
            it = linkedHashMap2.entrySet().iterator();
        } else if (i2 == 1) {
            Map map3 = (Map) c28210o00Oo0.f100001OooOoOO;
            Iterator it5 = c28210o00Oo0.f99999OooOoO;
            strOooO0Oo = c28210o00Oo0.f100000OooOoO0;
            Map map4 = c28210o00Oo0.f99997OooOo;
            C28201OooooO0 c28201OooooO04 = c28210o00Oo0.f99998OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            map3.putAll((Map) objOooO0Oo);
            it = it5;
            map = map4;
            c28201OooooO02 = c28201OooooO04;
        } else if (i2 == 2) {
            String str2 = c28210o00Oo0.f100003OooOoo0;
            it2 = (Iterator) c28210o00Oo0.f100001OooOoOO;
            it3 = c28210o00Oo0.f99999OooOoO;
            str = c28210o00Oo0.f100000OooOoO0;
            map2 = c28210o00Oo0.f99997OooOo;
            c28201OooooO03 = c28210o00Oo0.f99998OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            Folder folder = (Folder) objOooO0Oo;
            if (folder != null) {
                map2.put(str2, folder.getTitle());
            }
            if (it2.hasNext()) {
                str2 = (String) it2.next();
                C27600o0ooOO0 c27600o0ooOO0 = c28201OooooO03.f99943OooOO0o;
                c28210o00Oo0.f99998OooOo0o = c28201OooooO03;
                c28210o00Oo0.f99997OooOo = map2;
                c28210o00Oo0.f100000OooOoO0 = str;
                c28210o00Oo0.f99999OooOoO = it3;
                c28210o00Oo0.f100001OooOoOO = it2;
                c28210o00Oo0.f100003OooOoo0 = str2;
                c28210o00Oo0.f100005OooOooo = 2;
                objOooO0Oo = c27600o0ooOO0.OooO0Oo(str2, c28210o00Oo0);
            }
            it = it3;
            strOooO0Oo = str;
            map = map2;
            c28201OooooO02 = c28201OooooO03;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = c28210o00Oo0.f100003OooOoo0;
            it4 = (Iterator) c28210o00Oo0.f100001OooOoOO;
            it3 = c28210o00Oo0.f99999OooOoO;
            str = c28210o00Oo0.f100000OooOoO0;
            map2 = c28210o00Oo0.f99997OooOo;
            c28201OooooO03 = c28210o00Oo0.f99998OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            MyTemplate myTemplate = (MyTemplate) objOooO0Oo;
            if (myTemplate != null) {
                map2.put(str3, myTemplate.getTitle());
            }
            if (it4.hasNext()) {
                str3 = (String) it4.next();
                C27570o00oOoo0 c27570o00oOoo0 = c28201OooooO03.f99945OooOOO0;
                c28210o00Oo0.f99998OooOo0o = c28201OooooO03;
                c28210o00Oo0.f99997OooOo = map2;
                c28210o00Oo0.f100000OooOoO0 = str;
                c28210o00Oo0.f99999OooOoO = it3;
                c28210o00Oo0.f100001OooOoOO = it4;
                c28210o00Oo0.f100003OooOoo0 = str3;
                c28210o00Oo0.f100005OooOooo = 3;
                c27570o00oOoo0.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                objOooO0Oo = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27563o00oOo0O(c27570o00oOoo0, str3, null), c28210o00Oo0);
            }
            it = it3;
            strOooO0Oo = str;
            map = map2;
            c28201OooooO02 = c28201OooooO03;
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            CloudMetaType cloudMetaType = (CloudMetaType) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((CloudMetaLocal) it6.next()).getId());
            }
            int i3 = cloudMetaType == null ? -1 : OooO00o.f99969OooO0O0[cloudMetaType.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c28201OooooO02.f99942OooOO0O;
                    c28210o00Oo0.f99998OooOo0o = c28201OooooO02;
                    c28210o00Oo0.f99997OooOo = map;
                    c28210o00Oo0.f100000OooOoO0 = strOooO0Oo;
                    c28210o00Oo0.f99999OooOoO = it;
                    c28210o00Oo0.f100001OooOoOO = map;
                    c28210o00Oo0.f100003OooOoo0 = null;
                    c28210o00Oo0.f100005OooOooo = 1;
                    Serializable serializableOooOOOo = interfaceC27313OooOoo0.OooOOOo(strOooO0Oo, arrayList2, c28210o00Oo0);
                    if (serializableOooOOOo == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    C28201OooooO0 c28201OooooO05 = c28201OooooO02;
                    Iterator it7 = it;
                    Map map5 = map;
                    map.putAll((Map) serializableOooOOOo);
                    it = it7;
                    map = map5;
                    c28201OooooO02 = c28201OooooO05;
                } else if (i3 == 2) {
                    Iterator it8 = arrayList2.iterator();
                    map2 = map;
                    c28201OooooO03 = c28201OooooO02;
                    it2 = it8;
                    str = strOooO0Oo;
                    it3 = it;
                    if (it2.hasNext()) {
                    }
                    it = it3;
                    strOooO0Oo = str;
                    map = map2;
                    c28201OooooO02 = c28201OooooO03;
                    while (it.hasNext()) {
                    }
                } else {
                    if (i3 != 3) {
                        throw new C32442OooOO0o();
                    }
                    Iterator it9 = arrayList2.iterator();
                    map2 = map;
                    c28201OooooO03 = c28201OooooO02;
                    it4 = it9;
                    str = strOooO0Oo;
                    it3 = it;
                    if (it4.hasNext()) {
                    }
                    it = it3;
                    strOooO0Oo = str;
                    map = map2;
                    c28201OooooO02 = c28201OooooO03;
                    while (it.hasNext()) {
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            C33781o00o0O c33781o00o0O = c28201OooooO02.f99948OooOOo;
            do {
                value = c33781o00o0O.getValue();
            } while (!c33781o00o0O.OooO(value, C34444Oooo0O0.OooOO0((Map) value, map)));
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object OooO(AbstractC32476OooO abstractC32476OooO) {
        int iOrdinal;
        EnumC27285OooO enumC27285OooO = (EnumC27285OooO) this.f99952OooOo0.f121747OooOo0o.getValue();
        if (enumC27285OooO != null && (iOrdinal = enumC27285OooO.ordinal()) != 0) {
            C27616OooO0o c27616OooO0o = this.f99939OooO0oO;
            if (iOrdinal == 1) {
                return c27616OooO0o.f97105OooO00o.OooOOoo(EnumC27285OooO.f95075OooOo, abstractC32476OooO);
            }
            if (iOrdinal == 2) {
                return c27616OooO0o.f97105OooO00o.OooOOoo(EnumC27285OooO.f95078OooOoO0, abstractC32476OooO);
            }
            if (iOrdinal == 3) {
                return c27616OooO0o.f97105OooO00o.OooOOoo(EnumC27285OooO.f95077OooOoO, abstractC32476OooO);
            }
            if (iOrdinal == 4) {
                return c27616OooO0o.f97105OooO00o.OooOOoo(EnumC27285OooO.f95079OooOoOO, abstractC32476OooO);
            }
            throw new C32442OooOO0o();
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28203OooooOo c28203OooooOo;
        if (abstractC32479OooO0OO instanceof C28203OooooOo) {
            c28203OooooOo = (C28203OooooOo) abstractC32479OooO0OO;
            int i = c28203OooooOo.f99976OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28203OooooOo.f99976OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28203OooooOo = new C28203OooooOo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28203OooooOo.f99975OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28203OooooOo.f99976OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C28205Oooooo0 c28205Oooooo0 = new C28205Oooooo0(this, null);
            c28203OooooOo.f99976OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28205Oooooo0, c28203OooooOo);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }

    public final String OooO0oO(CloudMetaLocal cloudMetaLocal, Map<String, String> map) {
        Object value;
        Map mapOooO0o0;
        String str = map.get(cloudMetaLocal.getId());
        if (str != null) {
            return str;
        }
        if (!((Map) this.f99948OooOOo.getValue()).containsKey(cloudMetaLocal.getId())) {
            C33781o00o0O c33781o00o0O = this.f99950OooOOoo;
            if (!((Map) c33781o00o0O.getValue()).containsKey(cloudMetaLocal.getId())) {
                do {
                    value = c33781o00o0O.getValue();
                    Map map2 = (Map) value;
                    String id = cloudMetaLocal.getId();
                    C32443OooOOO c32443OooOOO = new C32443OooOOO(id, cloudMetaLocal);
                    kotlin.jvm.internal.OooOOO0.OooO0oO(map2, "<this>");
                    if (map2.isEmpty()) {
                        mapOooO0o0 = oOo000Oo.Oooo0.OooO0o0(c32443OooOOO);
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(id, cloudMetaLocal);
                        mapOooO0o0 = linkedHashMap;
                    }
                } while (!c33781o00o0O.OooO(value, mapOooO0o0));
            }
        }
        return this.f99962OooOooo;
    }

    public final C31081Ooooo00 OooO0oo() {
        List issues = (List) this.f99963Oooo0.f121747OooOo0o.getValue();
        Map filenameMap = (Map) this.f99965Oooo00O.f121747OooOo0o.getValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(issues, "issues");
        kotlin.jvm.internal.OooOOO0.OooO0oO(filenameMap, "filenameMap");
        String defaultFilename = this.f99962OooOooo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultFilename, "defaultFilename");
        List list = issues;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C31032OooO0OO) it.next()).f110786OooO0o0;
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            C31032OooO0OO c31032OooO0OO = (C31032OooO0OO) obj;
            if (c31032OooO0OO.f110784OooO0OO && !c31032OooO0OO.f110785OooO0Oo) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            C31032OooO0OO c31032OooO0OO2 = (C31032OooO0OO) obj2;
            if (!c31032OooO0OO2.f110784OooO0OO && !c31032OooO0OO2.f110785OooO0Oo) {
                arrayList3.add(obj2);
            }
        }
        boolean zContains = setO0OO00O.contains(CloudSyncError.CODE_DISALLOW_TO_USE_CELLULAR);
        boolean z = setO0OO00O.contains(CloudSyncError.CODE_AUTH_EXPIRED) && !setO0OO00O.contains(CloudSyncError.CODE_HW_COMPONENT_NOT_AVAILABLE);
        boolean zContains2 = setO0OO00O.contains(CloudSyncError.CODE_STORAGE_FULL);
        boolean zContains3 = setO0OO00O.contains(CloudSyncError.CODE_APP_VERSION_INCOMPATIBLE);
        boolean zContains4 = setO0OO00O.contains(CloudSyncError.CODE_HW_COMPONENT_NOT_AVAILABLE);
        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(arrayList2, 10));
        if (iOooO0Oo < 16) {
            iOooO0Oo = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = ((C31032OooO0OO) it2.next()).f110782OooO00o;
            String str3 = (String) filenameMap.get(str2);
            if (str3 == null) {
                str3 = defaultFilename;
            }
            linkedHashMap.put(str2, str3);
        }
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C31032OooO0OO) it3.next()).f110782OooO00o);
        }
        return new C31081Ooooo00(zContains, z, zContains2, zContains3, zContains4, linkedHashMap, arrayList4);
    }

    public final void OooOO0() {
        this.f99958OooOoOO.clear();
        C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
        C33781o00o0O c33781o00o0O = this.f99956OooOoO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, c34438OooOoo0);
    }

    public final void OooOO0O(String fileId) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileId, "fileId");
        Iterator it = ((Iterable) this.f99953OooOo00.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaLocal) next).getId(), fileId)) {
                    break;
                }
            }
        }
        CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) next;
        if (cloudMetaLocal == null) {
            return;
        }
        if (cloudMetaLocal.getSyncState().getPhase() != SyncPhase.CONFLICT && cloudMetaLocal.getSyncState().getPhase() != SyncPhase.RESOLVING_CONFLICT) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOO0O(C22201OooO0oO.OooO0O0(c20358OooO00o, "CloudSyncDetailsVM", "Attempted to resolve conflict for file ", fileId, " which is not in conflict state"), new Object[0]);
            return;
        }
        C25048OooO0O0 c25048OooO0O0 = this.f99936OooO0Oo;
        c25048OooO0O0.getClass();
        C27723OooO0O0 c27723OooO0O0 = (C27723OooO0O0) c25048OooO0O0.f85047OooO00o;
        c27723OooO0O0.getClass();
        c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.RequestResolve(fileId));
    }

    public final void OooOO0o(String fileId) {
        Object next;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fileId, "fileId");
        Iterator it = ((Iterable) this.f99953OooOo00.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((CloudMetaLocal) next).getId(), fileId)) {
                    break;
                }
            }
        }
        CloudMetaLocal cloudMetaLocal = (CloudMetaLocal) next;
        if (cloudMetaLocal == null) {
            return;
        }
        int i = OooO00o.f99968OooO00o[cloudMetaLocal.getSyncState().getPhase().ordinal()];
        C25048OooO0O0 c25048OooO0O0 = this.f99936OooO0Oo;
        if (i == 6) {
            c25048OooO0O0.getClass();
            C27723OooO0O0 c27723OooO0O0 = (C27723OooO0O0) c25048OooO0O0.f85047OooO00o;
            c27723OooO0O0.getClass();
            c27723OooO0O0.f97800OooO00o.OooO0o0(new SyncEvent.RequestPull(fileId));
            return;
        }
        if (i == 7) {
            CloudMetaType cloudMetaTypeFromMime = CloudMetaType.INSTANCE.fromMime(cloudMetaLocal.getMimeType());
            kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaTypeFromMime);
            c25048OooO0O0.getClass();
            C27723OooO0O0.OooO0o0((C27723OooO0O0) c25048OooO0O0.f85047OooO00o, fileId, cloudMetaTypeFromMime);
            return;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("CloudSyncDetailsVM");
        c20358OooO00o.OooOO0O("Retrying sync for file " + fileId + " in phase " + cloudMetaLocal.getSyncState().getPhase(), new Object[0]);
    }

    public final void OooOOO() {
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(this);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new OooO0O0(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooOOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C28214o00oO0o c28214o00oO0o;
        if (abstractC32479OooO0OO instanceof C28214o00oO0o) {
            c28214o00oO0o = (C28214o00oO0o) abstractC32479OooO0OO;
            int i = c28214o00oO0o.f100017OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28214o00oO0o.f100017OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c28214o00oO0o = new C28214o00oO0o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c28214o00oO0o.f100016OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c28214o00oO0o.f100017OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C28217o0ooOO0 c28217o0ooOO0 = new C28217o0ooOO0(this, str, null);
            c28214o00oO0o.f100017OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28217o0ooOO0, c28214o00oO0o);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        return ((C32445OooOOOO) objOooO0o).f116639OooOo0o;
    }
}
